package categorizer.plugins.address

import scala.Option.option2Iterable
import play.api.libs.json.Json
import collection.mutable.HashMap
import play.api.libs.json.{JsArray, JsObject, JsValue}
import categorizer.SimpleTokenFormatter._
import categorizer.SimpleToken
import categorizer.SimpleToken

import play.api.Play
import scala.io.Source

object AddressParser {

  val CATEGORIZER_STREETS_FILE = "conf/categorizer/ba_streets.pretty.json"
  // val CATEGORIZER_STREETS_FILE = "app/categorizer/plugins/address/streetListSample.json"

  val numWordsAround = 4;
  val keywordsCorner = List("y", "esq", "esquina", "alt", "altura")
  val keywordsNumbered = List("al")
  
  // Creates the lookup street dictionary. 
  // The hashMap is of type [String, List[SimpleToken]]. Each key can have 1 or more streets
  val dictionary = {
    val sourceFile = Play.current.getFile(CATEGORIZER_STREETS_FILE).getAbsoluteFile
    val lines = Source.fromFile(sourceFile).mkString
    val json = Json.parse(lines)
    
    val res = new HashMap[String, List[SimpleToken]]()
    
    (json \ "tokens").as[List[SimpleToken]].foreach { item =>
      res += item.token.toLowerCase -> getValueList(res.get(item.token.toLowerCase), item)
      item.alias.foreach { alias =>
        res += alias.toLowerCase -> getValueList(res.get(alias.toLowerCase), item)
      }
    }
    res
  }
  
  /**
   * Returns the list with the value appended. If the existing list exists, use it, otherwise create a new one
 * @param currentValue
 * @param value
 * @return
 */
private def getValueList(currentValue: Option[List[SimpleToken]], value: SimpleToken): List[SimpleToken] = {
    currentValue.getOrElse(List[SimpleToken]()) :+ value
  }
  
  //val streetDictionary = (xxx -> yy)

  // recibe un texto libre y busca patterns del tipo:
  //   xxx esquina yyy, xxx y yyy, xxx esq yyy, xxx esq. yyyy, xxxx 11111, xxxx al 1111
  // y retorna una lista de posibles direcciones
  // tomando las 5 palaras anteriores y posteriores al token de reconocimiento
  // ej: guess("en la esquina de Honorio pueyrredon y San Martin hay un bache sin tapar")
  // retorna (la esquina de honorio pueyrredon) (san martin hay un bache)
  // ej2: en la plaza que esta en hipolito irigoyen al 400 hay un semaforo roto
  // retorna: (que esta en hipolito irigoyen)(400)
  private def guess(text: String): Seq[Address] = {
    val corner = """.*?((?:\w+\W+){1,5})(?:y|esquina)((?:\W+\w+){1,5}).*""".r
    Seq[Address]()
  }

  // recibe un string que sospechamos contiene una calle
  // y realiza las busquedas parciales
  // ej: la esquina de honorio pueyrredon
  // intentara matchear las siguientes calles:
  // la esquina de honorio pueyrredon
  // esquina de honorio pueyrredon
  // de honorio pueyrredon
  // honorio pueyrredon -> retorna esta calle
  // pueyrredon
  private def streetMatchFromHead(streets: Array[String]): Option[Seq[SimpleToken]] = {
    if(streets.isEmpty) return None
    
    dictionary.get(streets.mkString(" ")).orElse(streetMatchFromHead(streets.tail))
  }

  // recibe un string que sospechamos contiene una calle
  // y realiza las busquedas parciales
  // ej: san martin hay un bache
  // intentara matchear las siguientes calles:
  // san martin hay un bache
  // san martin hay un
  // san martin hay
  // san martin -> retorna esta calle
  private def streetMatchFromTail(streets: Array[String]): Option[Seq[SimpleToken]] = {
    if(streets.isEmpty) return None
    
    dictionary.get(streets.mkString(" ")).orElse(streetMatchFromTail(streets.init))
  }
  
	/**
	 * Given the 2 street lists, returns all posible combinations as CornerAddrresses
	 */
  private def buildAddresses(listA: Seq[SimpleToken], listB: Seq[SimpleToken], separator:String): Seq[CornerAddress] = {
    listA flatMap {
      case st1 => listB map {st2 => CornerAddress(st1.token, st1.id, st2.token, st2.id, separator) }
    }
  }
  
  	/**
	 * Given the street list, return NumberedAddrresses
	 */
  private def buildAddresses(list: Seq[SimpleToken], number: Long, separator:String): Seq[NumberAddress] = {
    list map {
      case st => NumberAddress(st.token, st.id, number, separator) 
    }
  }

  /**
   * Entry point to the parser. Parse a text and returns a list of addresses 
   * @param text
   * @return
   */
  def parse(text: String): Seq[Address] = {
    import utils.StringHelper._

    val normalizedText = replaceTildes(trim(text).toLowerCase)
    parseCorners(normalizedText) ++ parseNumbered(normalizedText)
  }
  
  /**
   * Searches and returns addresses that include two streets (corrientes y callao, medrano esq. cordoba) 
   * @param text
   * @return
   */
  private def parseCorners(text: String): Seq[Address] = {
    val results = tokenizeCorners(text) 
    results flatMap { case (listA, separator, listB) =>
      for {
        st1 <- streetMatchFromHead(listA)
        st2 <- streetMatchFromTail(listB)
      } yield buildAddresses(st1, st2, separator) 
    } flatten
  }
  
  /**
   *  Searches and returns addresses that include one street and a number (corrientes 2000, cordoba al 3200) 
   * @param text
   * @return
   */
  private def parseNumbered(text: String): Seq[Address] = {
    val results = tokenizeNumbered(text)
    
    results flatMap { case (wordList, separator, number) =>
      for {
        st <- streetMatchFromHead(wordList)
      } yield buildAddresses(st, number, separator) 
    } flatten
  }
  
  private def tokenizeNumbered(text: String):  Seq[(Array[String], String, Long)] = {
    val regex = """((?:\w+\W+){1,5})(\d+)""".r
    
    // find the matches. 
    regex.findAllIn(text).toSeq.map { res => 
    	var palabras = res split """\W+"""
    	
    	// Get the number and remove it from the word list
    	val number = palabras.last.toLong
    	palabras = palabras.init
    	
    	// We get 5 words, but 
    	if(keywordsNumbered contains palabras.last)  {
    		// if there's a control word in the end, we remove it and set it as "separator"
    		(palabras.init, palabras.last, number)
    	} else {
    	  // If there's no control word, we just want 4 words, so we remove the first one
    	  (palabras.tail, "", number)
    	}
    }
  }
  
  /**
   * "en la esquina de corrientes y callao hay una pizzeria y en cordoba esq medrano no"
   * Lista:
   *  - ( Array(la, esquina, de, corrientes), "y", Array(callao, hay, una, pizzeria) )
   *  - ( Array(callao, hay, una, pizzeria), "y", Array(en, cordoba, esq, medrano) )
   *  - ( Array(pizzeria, y, en, cordoba), "esq", Array(medrano, no) )
   * @param text
   * @return
   */
  private def tokenizeCorners(text: String):  Seq[(Array[String], String, Array[String])] = {
    val palabras = text split """\W+"""
    
    palabras.indices filter (keywordsCorner contains palabras(_) ) map {
      i => (palabras.slice(math.max(0, i-numWordsAround), i), palabras(i), palabras.slice(i+1, math.min(palabras.length-1, i+numWordsAround)+1))
    }
  }

}

// algunas expresiones regulares que pueden ser utiles
// """^\W*?(\w+(?:\W+|$)){1,4}""".r.findAllIn("a ver las primeras cuatro palabras").toList
// """((?:\w+(?:\W+|$)){1,4})$""".r.findAllIn("a ver las ultimas cuatro palabras").toList

// pre y pos
// scala> """((?:\w+(?:\W+|$)){1,3})y\W+((?:\w+(?:\W+|$)){1,3})""".r.findAllIn("pre1, pre2, pre3, pre4, pre5 y pos1 pos2 pos3 pos4 pos5, ah claro y tambien esto no se olviden de y tambien otro mas").toList
// res90: List[String] = List("pre3, pre4, pre5 y pos1 pos2 pos3 ", "pos5, ah claro y tambien esto no ", se olviden de y tambien otro mas)

// scala> val r = """((?:\w+(?:\W+|$)){1,3})y\W+((?:\w+(?:\W+|$)){1,3})""".r
// r: scala.util.matching.Regex = ((?:\w+(?:\W+|$)){1,3})y\W+((?:\w+(?:\W+|$)){1,3})

// scala> val r(x,y) = "pre3, pre4, pre5 y pos1 pos2 pos3 "
// x: String = "pre3, pre4, pre5 "
// y: String = "pos1 pos2 pos3 "

// more complete example:

// scala> val r = """((?:\w+(?:\W+|$)){1,3})(?:y|esq|esquina|esq\.)\W+((?:\w+(?:\W+|$)){1,3})""".r
// r: scala.util.matching.Regex = ((?:\w+(?:\W+|$)){1,3})(?:y|esq|esquina|esq\.)\W+((?:\w+(?:\W+|$)){1,3})

// scala> r.findAllIn("en corrientes y callao, cerca de rivadavia esq. aramburu, y no muy lehos de larrea esquina san martin") 
// res91: scala.util.matching.Regex.MatchIterator = non-empty iterator

// scala> r.findAllIn("en corrientes y callao, cerca de rivadavia esq. aramburu, y no muy lehos de larrea esquina san martin").toList
// res92: List[String] = List("en corrientes y callao, cerca de ", "rivadavia esq. aramburu, y no muy lehos ", de larrea esquina san martin)

// scala> val r (x,y) = "en corrientes y callao, cerca de "
// x: String = "en corrientes "
// y: String = "callao, cerca de "

// scala> val r (x,y) =  "rivadavia esq. aramburu, y no muy lehos "
// x: String = "rivadavia esq. aramburu, "
// y: String = "no muy lehos "

// scala> val r (x,y) =  "de larrea esquina san martin"
// x: String = "de larrea "
// y: String = san martin


// OK!

// separar y de esq|esquina|esq.
// 
// scala> val r = """((?:\w+(?:\W+|$)){1,3})(?:y)\W+((?:\w+(?:\W+|$)){1,3})""".r
// r: scala.util.matching.Regex = ((?:\w+(?:\W+|$)){1,3})(?:y)\W+((?:\w+(?:\W+|$)){1,3})

// scala> r.findAllIn("en corrientes y callao, cerca de rivadavia esq. aramburu, y no muy lehos de larrea esquina san martin").toList
// res93: List[String] = List("en corrientes y callao, cerca de ", "rivadavia esq. aramburu, y no muy lehos ")

// scala> val r (x,y) = "en corrientes y callao, cerca de "
// x: String = "en corrientes "
// y: String = "callao, cerca de "

// scala> val r (x,y) = "rivadavia esq. aramburu, y no muy lehos "
// x: String = "rivadavia esq. aramburu, "
// y: String = "no muy lehos "

// scala> val r = """((?:\w+(?:\W+|$)){1,3})(?:esq|esq\.|esquina)\W+((?:\w+(?:\W+|$)){1,3})""".r
// r: scala.util.matching.Regex = ((?:\w+(?:\W+|$)){1,3})(?:esq|esq\.|esquina)\W+((?:\w+(?:\W+|$)){1,3})

// scala> r.findAllIn("en corrientes y callao, cerca de rivadavia esq. aramburu, y no muy lehos de larrea esquina san martin").toList
// res94: List[String] = List("cerca de rivadavia esq. aramburu, y no ", lehos de larrea esquina san martin)

// scala> val r (x,y) = "cerca de rivadavia esq. aramburu, y no "
// x: String = "cerca de rivadavia "
// y: String = "aramburu, y no "

// scala> val r (x,y) = lehos de larrea esquina san martin
// <console>:10: error: not found: value lehos
//        val r (x,y) = lehos de larrea esquina san martin
//                      ^

// scala> val r (x,y) = "lehos de larrea esquina san martin"
// x: String = "lehos de larrea "
// y: String = san martin

// para sacar una altura

// scala> val a = """((?:\w+\W+){1,4})(\d+)""".r
// a: scala.util.matching.Regex = ((?:\w+\W+){1,4})(\d+)

// scala> a.findAllIn("Lic. maria jose ignacio zavaleta 23, esta idea esta en rivadavia al 5345, al lado de José María Moreno 4356, a la vuelta de conte y Juan B. Alberdi").toList
// res28: List[String] = List(maria jose ignacio zavaleta 23, esta en rivadavia al 5345, José María Moreno 4356)

// scala> val a(x,y) = "maria jose ignacio zavaleta 23"
// x: String = "maria jose ignacio zavaleta "
// y: String = 23

// scala> val a(x,y) = "esta en rivadavia al 5345"
// x: String = "esta en rivadavia al "
// y: String = 5345

// scala> val a(x,y) = "José María Moreno 4356"
// x: String = "José María Moreno "
// y: String = 4356


abstract class Address(
//  val original: String,
//  val pos: Int, 
  val street1: String,
  val street1Id: String,
  val separator: String
) {
}

case class CornerAddress(override val street1: String, override val street1Id: String, street2: String, street2Id: String, override val separator: String = "y") extends Address(street1, street1Id, separator) {
  override def toString() = {
    String.format("%s(%s) y %s(%s)", street1, street1Id, street2, street2Id)
  }
}

case class NumberAddress(override val street1: String, override val street1Id: String, number: Long, override val separator: String = "") extends Address(street1, street1Id, separator) {
  override def toString() = {
    String.format("%s(%s) %s", street1, street1Id, number.toString)
  }
}