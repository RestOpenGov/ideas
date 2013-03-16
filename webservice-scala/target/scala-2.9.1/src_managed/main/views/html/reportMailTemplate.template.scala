
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
object reportMailTemplate extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Long,Long,Long,Long,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(comments: Long, ideas: Long, votes: Long, users: Long):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.57*/("""

<html>
<body>
	 Hi there, i am <b>live!</b><br><br>
 Activities in the last 24 hours<br>
 ==============================
<br><br>

Number of Ideas:  """),_display_(Seq[Any](/*10.20*/ideas)),format.raw/*10.25*/(""" <br>
Number of Comments:  """),_display_(Seq[Any](/*11.23*/comments)),format.raw/*11.31*/(""" <br>
Number of votes:  """),_display_(Seq[Any](/*12.20*/votes)),format.raw/*12.25*/(""" <br>
Number of users:  """),_display_(Seq[Any](/*13.20*/users)),format.raw/*13.25*/(""" <br>


</body>
</html>
"""))}
    }
    
    def render(comments:Long,ideas:Long,votes:Long,users:Long) = apply(comments,ideas,votes,users)
    
    def f:((Long,Long,Long,Long) => play.api.templates.Html) = (comments,ideas,votes,users) => apply(comments,ideas,votes,users)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 16 17:21:57 ART 2013
                    SOURCE: /home/sas/Ubuntu One/apps/ideas/webservice-scala/app/views/reportMailTemplate.scala.html
                    HASH: 32d2c162add775f72aa68a7404318987dd32aa06
                    MATRIX: 531->1|663->56|851->208|878->213|942->241|972->249|1033->274|1060->279|1121->304|1148->309
                    LINES: 19->1|22->1|31->10|31->10|32->11|32->11|33->12|33->12|34->13|34->13
                    -- GENERATED --
                */
            