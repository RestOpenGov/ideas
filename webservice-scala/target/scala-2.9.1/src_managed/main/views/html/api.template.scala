
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
object api extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Welcome to Ideas-ba backend test page")/*1.47*/ {_display_(Seq[Any](format.raw/*1.49*/("""

<h1>"""),_display_(Seq[Any](/*3.6*/Messages("welcome", Messages("home.title")(Lang("es"))))),format.raw/*3.61*/("""</h1>
  <h2>"""),_display_(Seq[Any](/*4.8*/User/*4.12*/.count())),format.raw/*4.20*/(""" Users</h2>
  <ul>
    <li><a href=""""),_display_(Seq[Any](/*6.19*/routes/*6.25*/.Users.list())),format.raw/*6.38*/("""">
      Users.list() ("""),_display_(Seq[Any](/*7.22*/routes/*7.28*/.Users.list())),format.raw/*7.41*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*9.19*/routes/*9.25*/.Users.show(1))),format.raw/*9.39*/("""">
      Users.show(1) ("""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Users.show(1))),format.raw/*10.43*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*12.19*/routes/*12.25*/.Users.show(999))),format.raw/*12.41*/("""">
      Users.show(999) ("""),_display_(Seq[Any](/*13.25*/routes/*13.31*/.Users.show(999))),format.raw/*13.47*/(""" - not found)
    </a></li>
  </ul>

  <h2>"""),_display_(Seq[Any](/*17.8*/Identity/*17.16*/.count())),format.raw/*17.24*/(""" Identities</h2>
  <ul>
    <li><a href=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.Identities.list())),format.raw/*19.43*/("""">
      Identities.list() ("""),_display_(Seq[Any](/*20.27*/routes/*20.33*/.Identities.list())),format.raw/*20.51*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*22.19*/routes/*22.25*/.Identities.show(1))),format.raw/*22.44*/("""">
      Identities.show(1) ("""),_display_(Seq[Any](/*23.28*/routes/*23.34*/.Identities.show(1))),format.raw/*23.53*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*25.19*/routes/*25.25*/.Identities.show(999))),format.raw/*25.46*/("""">
      Identities.show(999) ("""),_display_(Seq[Any](/*26.30*/routes/*26.36*/.Identities.show(999))),format.raw/*26.57*/(""" - not found)
    </a></li>
  </ul>

  <h2>"""),_display_(Seq[Any](/*30.8*/Idea/*30.12*/.count())),format.raw/*30.20*/(""" Ideas</h2>
  <ul>
    <li><a href=""""),_display_(Seq[Any](/*32.19*/routes/*32.25*/.Ideas.list())),format.raw/*32.38*/("""">
      Ideas.list() ("""),_display_(Seq[Any](/*33.22*/routes/*33.28*/.Ideas.list())),format.raw/*33.41*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*35.19*/routes/*35.25*/.Ideas.show(1))),format.raw/*35.39*/("""">
      Ideas.show(1) ("""),_display_(Seq[Any](/*36.23*/routes/*36.29*/.Ideas.show(1))),format.raw/*36.43*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*38.19*/routes/*38.25*/.Ideas.show(999))),format.raw/*38.41*/("""">
      Ideas.show(999) ("""),_display_(Seq[Any](/*39.25*/routes/*39.31*/.Ideas.show(999))),format.raw/*39.47*/(""" - not found)
    </a></li>

    <li><a href=""""),_display_(Seq[Any](/*42.19*/routes/*42.25*/.Ideas.listTags(1))),format.raw/*42.43*/("""">
      Ideas.listTags(1) ("""),_display_(Seq[Any](/*43.27*/routes/*43.33*/.Ideas.listTags(1))),format.raw/*43.51*/(""")
    </a></li>

    <li><a href=""""),_display_(Seq[Any](/*46.19*/routes/*46.25*/.Ideas.countTags(1))),format.raw/*46.44*/("""">
      Ideas.countTags(1) ("""),_display_(Seq[Any](/*47.28*/routes/*47.34*/.Ideas.countTags(1))),format.raw/*47.53*/(""")
    </a></li>

    <li><a href=""""),_display_(Seq[Any](/*50.19*/routes/*50.25*/.Ideas.listGeos(5))),format.raw/*50.43*/("""">
      Ideas.listGeos(5) ("""),_display_(Seq[Any](/*51.27*/routes/*51.33*/.Ideas.listGeos(5))),format.raw/*51.51*/(""")
    </a></li>

    <li><a href=""""),_display_(Seq[Any](/*54.19*/routes/*54.25*/.Ideas.countGeos(5))),format.raw/*54.44*/("""">
      Ideas.countGeos(5) ("""),_display_(Seq[Any](/*55.28*/routes/*55.34*/.Ideas.countGeos(5))),format.raw/*55.53*/(""")
    </a></li>

    <li><a href=""""),_display_(Seq[Any](/*58.19*/routes/*58.25*/.Ideas.list())),format.raw/*58.38*/("""?order=id">
      Ideas.list(order="id") ("""),_display_(Seq[Any](/*59.32*/routes/*59.38*/.Ideas.list())),format.raw/*59.51*/("""?order=id)
    </a></li>

    <li><a href=""""),_display_(Seq[Any](/*62.19*/routes/*62.25*/.Ideas.list())),format.raw/*62.38*/("""?q=type.name:idea">
      Nested objects queries: Ideas.list(q="type.name:idea") ("""),_display_(Seq[Any](/*63.64*/routes/*63.70*/.Ideas.list())),format.raw/*63.83*/("""?q=type.name:idea)
    </a></li>

<hr />

    <li>
      <a href="javascript:exec(jsRoutes.controllers.Ideas.up(1))">
        jsRoutes.controllers.Ideas.up(1)
      </a> Error: You can't vote your own idea
    </li>
    <li>
      <a href="javascript:exec(jsRoutes.controllers.Ideas.up(2))">
        jsRoutes.controllers.Ideas.up(2)
      </a> Error: You've already voted up for that idea!
    </li>
    <li>
      <a href="javascript:exec(jsRoutes.controllers.Ideas.up(3))">
        jsRoutes.controllers.Ideas.up(3)
      </a> Ok
    </li>
    <li>
      <a href="javascript:exec(jsRoutes.controllers.Ideas.down(3))">
        jsRoutes.controllers.Ideas.down(3)
      </a> Ok
    </li>

    <textarea id="result" cols="100" rows="5"></textarea>

  </ul>

  <h2>"""),_display_(Seq[Any](/*93.8*/Comment/*93.15*/.count())),format.raw/*93.23*/(""" Comments</h2>
  <ul>
    <li><a href=""""),_display_(Seq[Any](/*95.19*/routes/*95.25*/.Comments.listAll())),format.raw/*95.44*/("""">
      Comments.listAll() ("""),_display_(Seq[Any](/*96.28*/routes/*96.34*/.Comments.listAll())),format.raw/*96.53*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*98.19*/routes/*98.25*/.Comments.list(1))),format.raw/*98.42*/("""">
      Comments.list(1) ("""),_display_(Seq[Any](/*99.26*/routes/*99.32*/.Comments.list(1))),format.raw/*99.49*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*101.19*/routes/*101.25*/.Comments.show(1))),format.raw/*101.42*/("""">
      Comments.show(1) ("""),_display_(Seq[Any](/*102.26*/routes/*102.32*/.Comments.show(1))),format.raw/*102.49*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*104.19*/routes/*104.25*/.Comments.show(999))),format.raw/*104.44*/("""">
      Comments.show(999) ("""),_display_(Seq[Any](/*105.28*/routes/*105.34*/.Comments.show(999))),format.raw/*105.53*/(""" - not found)
    </a></li>
  </ul>

  <h2>"""),_display_(Seq[Any](/*109.8*/Vote/*109.12*/.count())),format.raw/*109.20*/(""" Votes</h2>
  <ul>
    <li><a href=""""),_display_(Seq[Any](/*111.19*/routes/*111.25*/.Votes.list())),format.raw/*111.38*/("""">
      Votes.list() ("""),_display_(Seq[Any](/*112.22*/routes/*112.28*/.Votes.list())),format.raw/*112.41*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*114.19*/routes/*114.25*/.Votes.show(1))),format.raw/*114.39*/("""">
      Votes.show(1) ("""),_display_(Seq[Any](/*115.23*/routes/*115.29*/.Votes.show(1))),format.raw/*115.43*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*117.19*/routes/*117.25*/.Votes.show(999))),format.raw/*117.41*/("""">
      Votes.show(999) ("""),_display_(Seq[Any](/*118.25*/routes/*118.31*/.Votes.show(999))),format.raw/*118.47*/(""" - not found)
    </a></li>
  </ul>
  
  <h2>"""),_display_(Seq[Any](/*122.8*/IdeaType/*122.16*/.count())),format.raw/*122.24*/(""" IdeaTypes</h2>
  <ul>
    <li><a href=""""),_display_(Seq[Any](/*124.19*/routes/*124.25*/.IdeaTypes.list())),format.raw/*124.42*/("""">
      IdeaTypes.list() ("""),_display_(Seq[Any](/*125.26*/routes/*125.32*/.IdeaTypes.list())),format.raw/*125.49*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*127.19*/routes/*127.25*/.IdeaTypes.show(1))),format.raw/*127.43*/("""">
      IdeaTypes.show(1) ("""),_display_(Seq[Any](/*128.27*/routes/*128.33*/.IdeaTypes.show(1))),format.raw/*128.51*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*130.19*/routes/*130.25*/.IdeaTypes.show(999))),format.raw/*130.45*/("""">
      IdeaTypes.show(999) ("""),_display_(Seq[Any](/*131.29*/routes/*131.35*/.IdeaTypes.show(999))),format.raw/*131.55*/(""" - not found)
    </a></li>
  </ul>

  <h2>"""),_display_(Seq[Any](/*135.8*/IdeaGeo/*135.15*/.count())),format.raw/*135.23*/(""" IdeaGeos</h2>
  <ul>
    <li><a href=""""),_display_(Seq[Any](/*137.19*/routes/*137.25*/.IdeaGeos.list())),format.raw/*137.41*/("""">
      IdeaGeos.list() ("""),_display_(Seq[Any](/*138.25*/routes/*138.31*/.IdeaGeos.list())),format.raw/*138.47*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*140.19*/routes/*140.25*/.IdeaGeos.show(1))),format.raw/*140.42*/("""">
      IdeaGeos.show(1) ("""),_display_(Seq[Any](/*141.26*/routes/*141.32*/.IdeaGeos.show(1))),format.raw/*141.49*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*143.19*/routes/*143.25*/.IdeaGeos.show(999))),format.raw/*143.44*/("""">
      IdeaGeos.show(999) ("""),_display_(Seq[Any](/*144.28*/routes/*144.34*/.IdeaGeos.show(999))),format.raw/*144.53*/(""" - not found)
    </a></li>
  </ul>

  <h2>"""),_display_(Seq[Any](/*148.8*/Tag/*148.11*/.count())),format.raw/*148.19*/(""" Tags</h2>
  <ul>
    <li><a href=""""),_display_(Seq[Any](/*150.19*/routes/*150.25*/.Tags.list())),format.raw/*150.37*/("""">
      Tags.list() ("""),_display_(Seq[Any](/*151.21*/routes/*151.27*/.Tags.list())),format.raw/*151.39*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*153.19*/routes/*153.25*/.Tags.show(1))),format.raw/*153.38*/("""">
      Tags.show(1) ("""),_display_(Seq[Any](/*154.22*/routes/*154.28*/.Tags.show(1))),format.raw/*154.41*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*156.19*/routes/*156.25*/.Tags.show(999))),format.raw/*156.40*/("""">
      Tags.show(999) ("""),_display_(Seq[Any](/*157.24*/routes/*157.30*/.Tags.show(999))),format.raw/*157.45*/(""" - not found)
    </a></li>
  </ul>

<hr />

<script>
    function exec(route) """),format.raw("""{"""),format.raw/*164.27*/("""
      route.ajax("""),format.raw("""{"""),format.raw/*165.19*/("""
        success: function(data) """),format.raw("""{"""),format.raw/*166.34*/("""
          $("#result").val(data);
        """),format.raw("""}"""),format.raw/*168.10*/(""",
        error: function(xhr) """),format.raw("""{"""),format.raw/*169.31*/("""
          $("#result").val(xhr.responseText);
        """),format.raw("""}"""),format.raw/*171.10*/("""
      """),format.raw("""}"""),format.raw/*172.8*/(""");
    """),format.raw("""}"""),format.raw/*173.6*/("""
  $(function() """),format.raw("""{"""),format.raw/*174.17*/("""

    $('#IdeasUp').click(function() """),format.raw("""{"""),format.raw/*176.37*/("""
      jsRoutes.controllers.Ideas.up(1).ajax("""),format.raw("""{"""),format.raw/*177.46*/("""
        success: function(data) """),format.raw("""{"""),format.raw/*178.34*/("""
          $("#result").val(data);
        """),format.raw("""}"""),format.raw/*180.10*/(""",
        error: function(xhr) """),format.raw("""{"""),format.raw/*181.31*/("""
          $("#result").val(xhr.responseText);
        """),format.raw("""}"""),format.raw/*183.10*/("""
      """),format.raw("""}"""),format.raw/*184.8*/(""");
    """),format.raw("""}"""),format.raw/*185.6*/(""");
  """),format.raw("""}"""),format.raw/*186.4*/(""");
</script>

""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 16 17:21:58 ART 2013
                    SOURCE: /home/sas/Ubuntu One/apps/ideas/webservice-scala/app/views/api.scala.html
                    HASH: 2b35479d6ab9084d397afdc074ceeb37e912d3dd
                    MATRIX: 576->1|629->46|668->48|709->55|785->110|832->123|844->127|873->135|945->172|959->178|993->191|1052->215|1066->221|1100->234|1169->268|1183->274|1218->288|1279->313|1294->319|1330->333|1400->367|1415->373|1453->389|1516->416|1531->422|1569->438|1648->482|1665->490|1695->498|1773->540|1788->546|1828->564|1893->593|1908->599|1948->617|2018->651|2033->657|2074->676|2140->706|2155->712|2196->731|2266->765|2281->771|2324->792|2392->824|2407->830|2450->851|2529->895|2542->899|2572->907|2645->944|2660->950|2695->963|2755->987|2770->993|2805->1006|2875->1040|2890->1046|2926->1060|2987->1085|3002->1091|3038->1105|3108->1139|3123->1145|3161->1161|3224->1188|3239->1194|3277->1210|3360->1257|3375->1263|3415->1281|3480->1310|3495->1316|3535->1334|3606->1369|3621->1375|3662->1394|3728->1424|3743->1430|3784->1449|3855->1484|3870->1490|3910->1508|3975->1537|3990->1543|4030->1561|4101->1596|4116->1602|4157->1621|4223->1651|4238->1657|4279->1676|4350->1711|4365->1717|4400->1730|4479->1773|4494->1779|4529->1792|4609->1836|4624->1842|4659->1855|4778->1938|4793->1944|4828->1957|5625->2719|5641->2726|5671->2734|5747->2774|5762->2780|5803->2799|5869->2829|5884->2835|5925->2854|5995->2888|6010->2894|6049->2911|6113->2939|6128->2945|6167->2962|6238->2996|6254->3002|6294->3019|6359->3047|6375->3053|6415->3070|6486->3104|6502->3110|6544->3129|6611->3159|6627->3165|6669->3184|6749->3228|6763->3232|6794->3240|6868->3277|6884->3283|6920->3296|6981->3320|6997->3326|7033->3339|7104->3373|7120->3379|7157->3393|7219->3418|7235->3424|7272->3438|7343->3472|7359->3478|7398->3494|7462->3521|7478->3527|7517->3543|7599->3589|7617->3597|7648->3605|7726->3646|7742->3652|7782->3669|7847->3697|7863->3703|7903->3720|7974->3754|7990->3760|8031->3778|8097->3807|8113->3813|8154->3831|8225->3865|8241->3871|8284->3891|8352->3922|8368->3928|8411->3948|8491->3992|8508->3999|8539->4007|8616->4047|8632->4053|8671->4069|8735->4096|8751->4102|8790->4118|8861->4152|8877->4158|8917->4175|8982->4203|8998->4209|9038->4226|9109->4260|9125->4266|9167->4285|9234->4315|9250->4321|9292->4340|9372->4384|9385->4387|9416->4395|9489->4431|9505->4437|9540->4449|9600->4472|9616->4478|9651->4490|9722->4524|9738->4530|9774->4543|9835->4567|9851->4573|9887->4586|9958->4620|9974->4626|10012->4641|10075->4667|10091->4673|10129->4688|10257->4768|10324->4787|10406->4821|10498->4865|10578->4897|10682->4953|10737->4961|10792->4969|10857->4986|10943->5024|11037->5070|11119->5104|11211->5148|11291->5180|11395->5236|11450->5244|11505->5252|11558->5258
                    LINES: 22->1|22->1|22->1|24->3|24->3|25->4|25->4|25->4|27->6|27->6|27->6|28->7|28->7|28->7|30->9|30->9|30->9|31->10|31->10|31->10|33->12|33->12|33->12|34->13|34->13|34->13|38->17|38->17|38->17|40->19|40->19|40->19|41->20|41->20|41->20|43->22|43->22|43->22|44->23|44->23|44->23|46->25|46->25|46->25|47->26|47->26|47->26|51->30|51->30|51->30|53->32|53->32|53->32|54->33|54->33|54->33|56->35|56->35|56->35|57->36|57->36|57->36|59->38|59->38|59->38|60->39|60->39|60->39|63->42|63->42|63->42|64->43|64->43|64->43|67->46|67->46|67->46|68->47|68->47|68->47|71->50|71->50|71->50|72->51|72->51|72->51|75->54|75->54|75->54|76->55|76->55|76->55|79->58|79->58|79->58|80->59|80->59|80->59|83->62|83->62|83->62|84->63|84->63|84->63|114->93|114->93|114->93|116->95|116->95|116->95|117->96|117->96|117->96|119->98|119->98|119->98|120->99|120->99|120->99|122->101|122->101|122->101|123->102|123->102|123->102|125->104|125->104|125->104|126->105|126->105|126->105|130->109|130->109|130->109|132->111|132->111|132->111|133->112|133->112|133->112|135->114|135->114|135->114|136->115|136->115|136->115|138->117|138->117|138->117|139->118|139->118|139->118|143->122|143->122|143->122|145->124|145->124|145->124|146->125|146->125|146->125|148->127|148->127|148->127|149->128|149->128|149->128|151->130|151->130|151->130|152->131|152->131|152->131|156->135|156->135|156->135|158->137|158->137|158->137|159->138|159->138|159->138|161->140|161->140|161->140|162->141|162->141|162->141|164->143|164->143|164->143|165->144|165->144|165->144|169->148|169->148|169->148|171->150|171->150|171->150|172->151|172->151|172->151|174->153|174->153|174->153|175->154|175->154|175->154|177->156|177->156|177->156|178->157|178->157|178->157|185->164|186->165|187->166|189->168|190->169|192->171|193->172|194->173|195->174|197->176|198->177|199->178|201->180|202->181|204->183|205->184|206->185|207->186
                    -- GENERATED --
                */
            