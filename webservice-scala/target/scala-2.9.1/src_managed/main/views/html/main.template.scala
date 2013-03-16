
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png"))),format.raw/*8.97*/("""">
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Application.javascriptRoutes)),format.raw/*10.81*/(""""></script>
    </head>
    <body>
        """),_display_(Seq[Any](/*13.10*/content)),format.raw/*13.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 16 17:21:57 ART 2013
                    SOURCE: /home/sas/Ubuntu One/apps/ideas/webservice-scala/app/views/main.scala.html
                    HASH: 66270e65054571d68c0fffaf50d8467f88767924
                    MATRIX: 509->1|616->31|704->84|730->89|832->156|846->162|899->194|1103->362|1118->368|1169->397|1249->441|1278->448
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|31->10|31->10|31->10|34->13|34->13
                    -- GENERATED --
                */
            