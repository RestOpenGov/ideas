
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
object commentCreatedMailTemplate extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template8[String,String,String,String,String,String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(username: String, ideaText: String, ideaTitle: String, commentUser: String, commentText: String, commentUserAvatar: String, authorIdeaAvatar: String, idea: String ):play.api.templates.Html = {
        _display_ {import org.joda.time.DateTime


Seq[Any](format.raw/*1.167*/("""

"""),format.raw/*4.1*/("""

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<style type="text/css">
@media only screen and (max-device-width: 480px) """),format.raw("""{"""),format.raw/*12.52*/("""
table[class=outer] .global-width-670-to-320 """),format.raw("""{"""),format.raw/*13.46*/("""
width: 320px !important;
"""),format.raw("""}"""),format.raw/*15.2*/("""
table[class=outer] .global-width-520-to-320 """),format.raw("""{"""),format.raw/*16.46*/("""
width: 320px !important;
"""),format.raw("""}"""),format.raw/*18.2*/("""
table[class=outer] .global-width-500-to-300 """),format.raw("""{"""),format.raw/*19.46*/("""
width: 300px !important;
"""),format.raw("""}"""),format.raw/*21.2*/("""
table[class=outer] .global-separator-padding """),format.raw("""{"""),format.raw/*22.47*/("""
height: 8px !important;
"""),format.raw("""}"""),format.raw/*24.2*/("""
table[class=outer] .global-shrinking-to-0 """),format.raw("""{"""),format.raw/*25.44*/("""
height: 0px !important;
"""),format.raw("""}"""),format.raw/*27.2*/("""
table[class=outer] .global-shrinking-to-10 """),format.raw("""{"""),format.raw/*28.45*/("""
height: 10px !important;
"""),format.raw("""}"""),format.raw/*30.2*/("""
table[class=outer] .global-h1 """),format.raw("""{"""),format.raw/*31.32*/("""
font-size: 14px !important;
"""),format.raw("""}"""),format.raw/*33.2*/("""

table[class=outer] .cut """),format.raw("""{"""),format.raw/*35.26*/("""
width: 0 !important;
padding: 0 !important;
"""),format.raw("""}"""),format.raw/*38.2*/("""
table[class=outer] .vcut """),format.raw("""{"""),format.raw/*39.27*/("""
height: 0 !important;
padding: 0 !important;
"""),format.raw("""}"""),format.raw/*42.2*/("""
table[class=outer] img.cut """),format.raw("""{"""),format.raw/*43.29*/("""
display: none !important;
width: 0 !important;
height: 0 !important;
"""),format.raw("""}"""),format.raw/*47.2*/("""
table[class=outer] .cut span, table[class=outer] .cut a """),format.raw("""{"""),format.raw/*48.58*/("""
display: none !important;
"""),format.raw("""}"""),format.raw/*50.2*/("""
table[class=outer] .frame """),format.raw("""{"""),format.raw/*51.28*/("""
width: 320px !important;
border-left: 0px !important;
border-right: 0px !important;
"""),format.raw("""}"""),format.raw/*55.2*/("""
table[class=outer] .main_header.media_header """),format.raw("""{"""),format.raw/*56.47*/("""
width: 300px !important;
height: 55px !important;
"""),format.raw("""}"""),format.raw/*59.2*/("""
table[class=outer] .header_left """),format.raw("""{"""),format.raw/*60.34*/("""
height: 55px !important;
"""),format.raw("""}"""),format.raw/*62.2*/("""
table[class=outer] .logo_header """),format.raw("""{"""),format.raw/*63.34*/("""
height: 62px !important;
"""),format.raw("""}"""),format.raw/*65.2*/("""
table[class=outer] .main_name """),format.raw("""{"""),format.raw/*66.32*/("""
font-size: 12px !important;
"""),format.raw("""}"""),format.raw/*68.2*/("""
table[class=outer] .subtitle """),format.raw("""{"""),format.raw/*69.31*/("""
font-size: 12px !important;
"""),format.raw("""}"""),format.raw/*71.2*/("""
table[class=outer] .media_main """),format.raw("""{"""),format.raw/*72.33*/("""
width: 300px !important;
"""),format.raw("""}"""),format.raw/*74.2*/("""
table[class=outer] .media_main .intro """),format.raw("""{"""),format.raw/*75.40*/("""
width: 260px !important;
font-size: 14px !important;
"""),format.raw("""}"""),format.raw/*78.2*/("""
table[class=outer] .media_main .intro2 """),format.raw("""{"""),format.raw/*79.41*/("""
font-size: 14px !important;
"""),format.raw("""}"""),format.raw/*81.2*/("""
table[class=outer] .media_main .suggestions """),format.raw("""{"""),format.raw/*82.46*/("""
font-size: 14px !important;
"""),format.raw("""}"""),format.raw/*84.2*/("""
table[class=outer] .media_more """),format.raw("""{"""),format.raw/*85.33*/("""
width: 300px !important;
border-radius: 0 !important;
background-color: #ffffff !important;
border-top: 1px solid #e8e8e8 !important;
"""),format.raw("""}"""),format.raw/*90.2*/("""
table[class=outer] .media_button """),format.raw("""{"""),format.raw/*91.35*/("""
width: 300px !important;
background-color: #209ae4 !important;
padding-top: 3px !important;
padding-bottom: 3px !important;
"""),format.raw("""}"""),format.raw/*96.2*/("""
table[class=outer] .media_footer """),format.raw("""{"""),format.raw/*97.35*/("""
font-size: 11px !important;
line-height: 14px !important;
padding: 0 10px !important;
"""),format.raw("""}"""),format.raw/*101.2*/("""
table[class=outer] .address """),format.raw("""{"""),format.raw/*102.30*/("""
font-size: 11px !important;
line-height: 14px !important;
display: block !important;
"""),format.raw("""}"""),format.raw/*106.2*/("""
table[class=outer] td[class=footer-padding-top] """),format.raw("""{"""),format.raw/*107.50*/("""
height: 20px !important;
"""),format.raw("""}"""),format.raw/*109.2*/("""
table[class=outer] td[class=footer-padding-bottom] """),format.raw("""{"""),format.raw/*110.53*/("""
height: 17px !important;
"""),format.raw("""}"""),format.raw/*112.2*/("""
table[class=outer] .media_footer br """),format.raw("""{"""),format.raw/*113.38*/("""
display: none !important;
"""),format.raw("""}"""),format.raw/*115.2*/("""
table[class=outer] .spacer.ios """),format.raw("""{"""),format.raw/*116.33*/("""
display: none !important;
"""),format.raw("""}"""),format.raw/*118.2*/("""
table[class=outer] .reset """),format.raw("""{"""),format.raw/*119.28*/("""
display: block !important;
padding-bottom: 4px !important;
"""),format.raw("""}"""),format.raw/*122.2*/("""
table[class=outer] .media_logo_div """),format.raw("""{"""),format.raw/*123.37*/("""
display: block !important;
position: absolute !important;
left: 274px !important;
top: 0 !important;
background-image: url('http://ideas-jugar.rhcloud.com/img/ideas-ba-logo.png') !important;
background-size: 100% 100% !important;
width: 36px !important;
height: 68px !important;
z-index: 1 !important;
"""),format.raw("""}"""),format.raw/*133.2*/("""
table[class=employee-only-padding-top-bottom] """),format.raw("""{"""),format.raw/*134.48*/("""
width: 310px !important;
"""),format.raw("""}"""),format.raw/*136.2*/("""
td[class=employee-only-padding-left-right] """),format.raw("""{"""),format.raw/*137.45*/("""
width: 4px !important;
"""),format.raw("""}"""),format.raw/*139.2*/("""
table[class=employee-only] """),format.raw("""{"""),format.raw/*140.29*/("""
width: 310px !important;
"""),format.raw("""}"""),format.raw/*142.2*/("""
td[class=header_padding] """),format.raw("""{"""),format.raw/*143.27*/("""
height: 55px !important;
"""),format.raw("""}"""),format.raw/*145.2*/("""
"""),format.raw("""}"""),format.raw/*146.2*/("""

@media only screen and (min-device-width: 768px) and (max-device-width: 1024px) """),format.raw("""{"""),format.raw/*148.83*/("""
table[class=outer] .media_button """),format.raw("""{"""),format.raw/*149.35*/("""
padding-top: 3px !important;
padding-bottom: 3px !important;
background-color: #209ae4 !important;
"""),format.raw("""}"""),format.raw/*153.2*/("""
table[class=outer] .media_button td.cut """),format.raw("""{"""),format.raw/*154.42*/("""
width: 0 !important;
padding: 0 !important;
"""),format.raw("""}"""),format.raw/*157.2*/("""
table[class=outer] .media_button """),format.raw("""{"""),format.raw/*158.35*/("""
padding-left: 10px !important;
padding-right: 10px !important;
"""),format.raw("""}"""),format.raw/*161.2*/("""
"""),format.raw("""}"""),format.raw/*162.2*/("""

</style>
</head>
<body style="margin: 0; padding: 0; background: #ffffff;-webkit-text-size-adjust: 100%;">
<span style="color: white; font-size: 1px; display: none;">@nfmelendez posta te saci a pasear? Muy bien dato. Ni lo intento entonces. - @DiegoRam</span>
<table cellpadding="0" cellspacing="0" border="0" width="100%" class="outer" style="position: relative; background-color: #dddddd;">
<tbody>
<tr>
<td>
<table class="outer frame" align="center" cellpadding="0" cellspacing="0" border="0" width="670" style="border: 0px; border-left: 1px solid #cccccc; border-right: 1px solid #cccccc; background-color: #ffffff;position: relative; background-color: #dddddd;">
<tbody>
<tr>
<td> <a href="https://twitter.com?uid=175816262&amp;iid=am-130280753913513437171791826&amp;nid=27+21" style="border: none; color: #0084b4; text-decoration: none;"><span class="media_logo_div"></span></a>
<table cellpadding="0" cellspacing="0" border="0" width="670" class="header frame" style="background-color: #f2f2f2; table-layout: fixed;">
<tbody>
<tr>
<td class="header_left cut" style="width: 0px; height: 77px;"> &nbsp; </td>
<td height="94" width="46" valign="top" rowspan="2" class="logo_header cut" style="background-color: #ffffff; line-height: 100%;"><a href="http://www.ideas-ba.com.ar" style="border: none; color: #0084b4; text-decoration: none;"><img class="logo cut" src="http://ideas-jugar.rhcloud.com/img/ideas-ba-logo.png" width="65" height="94" style="border: 0; background-color: #fff; line-height: 100%;border: 0;" /></a></td>
<td class="cut" width="9"> &nbsp; </td>
<td width="10" height="77" class="header_padding"> &nbsp; </td>
<td width="458" height="77" class="main_header media_header" style="font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; color: #333333;">
<table border="0" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<td class="main_name" style="font-size: 14px; font-weight: bold; color: #000000;"> """),_display_(Seq[Any](/*187.85*/username)),format.raw/*187.93*/(""", </td>
</tr>
<tr>
<td class="subtitle" style="font-size: 14px; color: #666666;"> Se realizo un nuevo comentario sobre una idea que te interesa! </td>
</tr>
</tbody>
</table> </td>
<td width="10" height="77" class="header_padding"> &nbsp; </td>
<td class="main_avatar cut" width="32" style="text-align: right;"> <a href="#" style="border: none; color: #0084b4; text-decoration: none;"><img class="cut" src=""""),_display_(Seq[Any](/*195.164*/authorIdeaAvatar)),format.raw/*195.180*/("""" width="32" height="32"  style="display:none; background-color: #ffffff; border-radius: 5px;border: 0;" /></a> </td>
<td class="col header cut" style="background-color: #f2f2f2; table-layout: fixed;width: 85px;"></td>
</tr>
<tr>
<td class="main header_drop cut" style="border-top: 1px solid #dddddd;font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; background-color: #ffffff;">&nbsp;</td>
<td class="main header_drop cut" style="border-top: 1px solid #dddddd;font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; background-color: #ffffff;">&nbsp;</td>
<td class="main header_drop media_header" height="17" style="border-top: 1px solid #dddddd;font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; background-color: #ffffff;"><img width="1" height="1" style="display: block;border: 0;" src="https://twitter.com/scribe/ibis?uid=175816262&amp;iid=am-130280753913513437171791826&amp;nid=27+20" /></td>
<td class="main header_drop cut" height="17" colspan="4" style="border-top: 1px solid #dddddd;font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; background-color: #ffffff;">&nbsp;</td>
</tr>
</tbody>
</table> </td>
<td rowspan="3"></td>
</tr>
<tr>
<td style="background: #ffffff;">
<style type="text/css">
@media only screen and (max-device-width: 480px) """),format.raw("""{"""),format.raw/*211.52*/("""
table[class="main"] """),format.raw("""{"""),format.raw/*212.22*/("""
width: 320px !important;
"""),format.raw("""}"""),format.raw/*214.2*/("""
table[class="general-text-rules"] """),format.raw("""{"""),format.raw/*215.36*/("""
width: 300px !important;
"""),format.raw("""}"""),format.raw/*217.2*/("""
table[class="separator-padding"] """),format.raw("""{"""),format.raw/*218.35*/("""
width: 320px !important;
"""),format.raw("""}"""),format.raw/*220.2*/("""
table[class="separator-padding"] td """),format.raw("""{"""),format.raw/*221.38*/("""
height: 8px !important;
"""),format.raw("""}"""),format.raw/*223.2*/("""
hr[class="separator"] """),format.raw("""{"""),format.raw/*224.24*/("""
width: 320px !important;
"""),format.raw("""}"""),format.raw/*226.2*/("""
table[class="action"] """),format.raw("""{"""),format.raw/*227.24*/("""
width: 300px !important;
border-radius: 0 !important;
background-color: #ffffff !important;
"""),format.raw("""}"""),format.raw/*231.2*/("""
td[class="engagement-message"] """),format.raw("""{"""),format.raw/*232.33*/("""
display: none;
"""),format.raw("""}"""),format.raw/*234.2*/("""
td[class="top-height"] """),format.raw("""{"""),format.raw/*235.25*/("""
height: 8px !important;
"""),format.raw("""}"""),format.raw/*237.2*/("""
"""),format.raw("""}"""),format.raw/*238.2*/("""

</style>
<table width="670" border="0" cellpadding="0" cellspacing="0" class="main frame" style="font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; background-color: #ffffff;">
<tbody>
<tr>
<td>
<table width="520" border="0" align="center" cellpadding="0" cellspacing="0" class="general-text-rules" style="font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;">
<tbody>
<tr>
<td height="20" class="top-height" style="height: 20px;"></td>
</tr>
<tr>
<td>
<style type="text/css">
@media only screen and (max-device-width: 480px) """),format.raw("""{"""),format.raw/*253.52*/("""
table[class="main"] """),format.raw("""{"""),format.raw/*254.22*/("""
width: 320px !important;
"""),format.raw("""}"""),format.raw/*256.2*/("""
table[class="small-tweet-template"] """),format.raw("""{"""),format.raw/*257.38*/("""
width: 300px !important;
"""),format.raw("""}"""),format.raw/*259.2*/("""
table[class="small-tweet-template-padding padding"] """),format.raw("""{"""),format.raw/*260.54*/("""
width: 320px !important;
"""),format.raw("""}"""),format.raw/*262.2*/("""
table[class="action"] """),format.raw("""{"""),format.raw/*263.24*/("""
width: 300px !important;
border-radius: 0 !important;
background-color: #ffffff !important;
"""),format.raw("""}"""),format.raw/*267.2*/("""
td[class="small-tweet-template-text"] a """),format.raw("""{"""),format.raw/*268.42*/("""
color: #777 !important;
"""),format.raw("""}"""),format.raw/*270.2*/("""
"""),format.raw("""}"""),format.raw/*271.2*/("""

</style>
<table width="500" border="0" align="center" cellpadding="0" cellspacing="0" class="small-tweet-template" style="font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; background-color: white; table-layout: fixed;">
<tbody>
<tr valign="top">
<td rowspan="3" width="48" class="small-tweet-template-avatar" style="width: 48px;"> <a href="#" style="border: none; color: #0084b4; text-decoration: none;"> <img width="48" height="48" src=""""),_display_(Seq[Any](/*277.194*/authorIdeaAvatar)),format.raw/*277.210*/(""""  style="border: 0;width: 48px; height: 48px; border-radius: 4px;" /> </a> </td>
<td rowspan="3" width="10" class="small-tweet-template-avatar-padding padding"></td>
<td> <a href="https://twitter.com/nfmelendez/status/262175545452810240?uid=175816262&amp;iid=am-130280753913513437171791826&amp;nid=27+225" style="border: none; color: #0084b4; text-decoration: none;"><span class="small-tweet-template-name" style="font-size: 14px; font-weight: bold; color: #333;">"""),_display_(Seq[Any](/*279.300*/ideaTitle)),format.raw/*279.309*/("""!</span></a> <a href="https://twitter.com/nfmelendez/status/262175545452810240?uid=175816262&amp;iid=am-130280753913513437171791826&amp;nid=27+224" style="border: none; color: #0084b4; text-decoration: none;"><span class="small-tweet-template-screen-name" style="font-size: 12px; color: #999;"></span></a> </td>
<td width="60" align="right"> <a href="https://twitter.com/nfmelendez/status/262175545452810240?uid=175816262&amp;iid=am-130280753913513437171791826&amp;nid=27+227" style="border: none; color: #0084b4; text-decoration: none;"><span class="small-tweet-template-date" style="font-size: 12px; color: #bbb;"></span></a> </td>
</tr>
<tr valign="top">
<td height="2" colspan="2" class="small-tweet-template-padding "></td>
</tr>
<tr valign="top">
<td colspan="2" class="small-tweet-template-text" style="word-wrap: break-word; font-size: 14px; line-height: 18px; color: #333;"> """),_display_(Seq[Any](/*286.133*/ideaText)),format.raw/*286.141*/("""! </td>
</tr>
</tbody>
</table>
<table width="500" border="0" align="center" cellpadding="0" cellspacing="0" class="separator-padding">
<tbody>
<tr>
<td width="500" height="12" class="first-tweet-bottom-padding" style="height: 12px;"></td>
</tr>
</tbody>
</table>
<hr class="separator" style="height: 1px; border: 0px; margin: 0px; background-color: #e8e8e8; width: 520px;" />
<!-- -------------------- -->
<table width="500" border="0" align="center" cellpadding="0" cellspacing="0" class="separator-padding">
<tbody>
<tr>
<td width="500" height="12"></td>
</tr>
</tbody>
</table>
<style type="text/css">
@media only screen and (max-device-width: 480px) """),format.raw("""{"""),format.raw/*307.52*/("""
table[class="big-tweet-template"] """),format.raw("""{"""),format.raw/*308.36*/("""
width: 300px !important;
"""),format.raw("""}"""),format.raw/*310.2*/("""
td[class="big-tweet-template-text"] """),format.raw("""{"""),format.raw/*311.38*/("""
font-size: 18px !important;
line-height: 22px !important;
"""),format.raw("""}"""),format.raw/*314.2*/("""
td[class="big-tweet-template-text"] a """),format.raw("""{"""),format.raw/*315.40*/("""
color: #777 !important;
"""),format.raw("""}"""),format.raw/*317.2*/("""
td[class="big-tweet-template-user-info"] """),format.raw("""{"""),format.raw/*318.43*/("""
width: 242px !important;
"""),format.raw("""}"""),format.raw/*320.2*/("""
"""),format.raw("""}"""),format.raw/*321.2*/("""

</style>
<table width="500" border="0" align="center" cellpadding="0" cellspacing="0" class="big-tweet-template" style="font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; background-color: white; table-layout: fixed;">
<tbody>
<tr valign="top">
<td rowspan="2" width="48" class="big-tweet-template-avatar" style="width: 48px;"> <a href="#" style="border: none; color: #0084b4; text-decoration: none;"> <img width="48" height="48" src=""""),_display_(Seq[Any](/*327.192*/commentUserAvatar)),format.raw/*327.209*/(""""  style="border: 0;width: 48px; height: 48px; border-radius: 4px;" /> </a> </td>
<td rowspan="2" width="10" class="big-tweet-template-avatar-padding"></td>
<td height="24" valign="bottom" class="big-tweet-template-user-info" style="width: 442px;"> <a href="https://twitter.com/DiegoRam/status/262180667922739200?uid=175816262&amp;iid=am-130280753913513437171791826&amp;nid=27+234" style="border: none; color: #0084b4; text-decoration: none;"><span class="big-tweet-template-name" style="font-size: 18px; font-weight: bold; color: #333;">"""),_display_(Seq[Any](/*329.383*/commentUser)),format.raw/*329.394*/("""!</span></a> </td>
</tr>
<tr valign="top">
<td height="24" class="big-template-tweet-user-info"> <a href="https://twitter.com/DiegoRam/status/262180667922739200?uid=175816262&amp;iid=am-130280753913513437171791826&amp;nid=27+233" style="border: none; color: #0084b4; text-decoration: none;"> <span class="big-tweet-template-screen-name" style="font-size: 14px; color: #999;"></span> </a> </td>
</tr>
<tr>
<td height="10" colspan="3" class="big-tweet-template-padding"></td>
</tr>
<tr>
<td colspan="3" class="big-tweet-template-text" style="word-wrap: break-word; color: #333; font-size: 22px; font-family: Georgia, 'Times New Roman', Times, serif; line-height: 26px;">"""),_display_(Seq[Any](/*338.185*/commentText)),format.raw/*338.196*/("""!</td>
</tr>
<tr>
<td height="4" colspan="3" class="big-tweet-template-padding"></td>
</tr>
<tr>
<td colspan="3" class="big-tweet-template-date" style="font-size: 12px; color: #bbb;"> <a href="https://twitter.com/DiegoRam/status/262180667922739200?uid=175816262&amp;iid=am-130280753913513437171791826&amp;nid=27+236" style="border: none; color: #0084b4; text-decoration: none;color: #bbb;">"""),_display_(Seq[Any](/*344.295*/{new DateTime().toString("dd/MM/yyyy - HH:mm")})),format.raw/*344.342*/("""</a> </td>
</tr>
</tbody>
</table>
<table width="500" border="0" align="center" cellpadding="0" cellspacing="0" class="separator-padding">
<tbody>
<tr>
<td width="500" height="12"></td>
</tr>
</tbody>
</table>
<hr class="separator" style="height: 1px; border: 0px; margin: 0px; background-color: #e8e8e8; width: 520px;" />
<!-- -------------------- -->
<table cellpadding="0" cellspacing="0" width="500" align="center" class="action">
<tbody>
<tr>
<td height="12" colspan="2"></td>
</tr>
<tr>
<td>
<table cellpadding="0" cellspacing="0" border="0" width="100%">
<tbody>
<tr>
<td class="engagement-message" style="color: #666; font-size: 14px;"> Qu&eacute; te parecio? Sigamos mejorando con tu voto!</td>
<td align="right">
<style type="text/css">
@media only screen and (max-device-width: 480px) """),format.raw("""{"""),format.raw/*370.52*/("""
table[class=button-template] """),format.raw("""{"""),format.raw/*371.31*/("""
width: 300px !important;
"""),format.raw("""}"""),format.raw/*373.2*/("""
tr[class=button-template-vertical-padding] """),format.raw("""{"""),format.raw/*374.45*/("""
height: 3px !important;
"""),format.raw("""}"""),format.raw/*376.2*/("""
"""),format.raw("""}"""),format.raw/*377.2*/("""
@media only screen and (min-device-width: 768px) and (max-device-width: 1024px) """),format.raw("""{"""),format.raw/*378.83*/("""
td[class=button-template] """),format.raw("""{"""),format.raw/*379.28*/("""
padding-left: 10px !important;
padding-right: 10px !important;
"""),format.raw("""}"""),format.raw/*382.2*/("""
"""),format.raw("""}"""),format.raw/*383.2*/("""

</style>
<table cellpadding="0" cellspacing="0" border="0" class="button-template" style="background-image: url('https://twitter.com/images/email/t1/button_bg_long.png'); background-repeat: repeat-x; background-color: #33a9e5; border-radius: 5px; height: 28px; border: 1px solid #28C; word-wrap: break-word; text-align: center;">
<tbody>
<tr>
<td align="center" style="padding-left: 15px; padding-right: 15px;">
<table cellpadding="0" cellspacing="0" border="0" class="button-template-inner">
<tbody>
<tr>
<td style="padding-left: 15px; padding-right: 15px;padding-left: 0px; padding-right: 0px;"> <a href="https://twitter.com/home?screen_name=DiegoRam&amp;context=email&amp;iid=am-130280753913513437171791826&amp;in_reply_to_status_id=262180667922739200&amp;status=&amp;uid=175816262&amp;nid=27+241" style="border: none; color: #0084b4; text-decoration: none;color: white;"> <img src="https://twitter.com/images/email/t1/reply_arrow.png" alt="" style="border: 0;" /> </a> </td>
<td width="6" class="button-template-inner-vertical-padding" style="padding-left: 15px; padding-right: 15px;padding-left: 0px; padding-right: 0px;height: 6px;"> <a href="https://twitter.com/home?screen_name=DiegoRam&amp;context=email&amp;iid=am-130280753913513437171791826&amp;in_reply_to_status_id=262180667922739200&amp;status=&amp;uid=175816262&amp;nid=27+241" style="border: none; color: #0084b4; text-decoration: none;color: white;"> </a> </td>
<td height="28" class="button-template-font" style="color: white; font-size: 13px; font-weight: bold; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;padding-left: 15px; padding-right: 15px;padding-left: 0px; padding-right: 0px;"> <a href="http://ideas-ba.com.ar/#/ideas/"""),_display_(Seq[Any](/*395.285*/idea)),format.raw/*395.289*/("""" style="border: none; color: #0084b4; text-decoration: none;color: white;"> Votar Comentario </a> </td>
</tr>
</tbody>
</table> </td>
</tr>
</tbody>
</table> </td>
<td> </td>
</tr>
</tbody>
</table> </td>
</tr>
<tr>
<td height="12" colspan="2"></td>
</tr>
</tbody>
</table> </td>
</tr>
</tbody>
</table> </td>
</tr>
</tbody>
</table> </td>
</tr>
<tr>
<td>
<table bgcolor="#eeeeee" border="0" cellpadding="0" cellspacing="0" width="670" class="frame footer" style="background-color: #eeeeee; background-image: url(https://twitter.com/images/email/t1/shadow_bottom.jpg); background-position: top; background-repeat: repeat-x; border-top-color: #dddddd; border-top-style: solid; border-top-width: 1px;">
<tbody>
<tr>
<td colspan="4" height="28" class="footer-padding-top"></td>
</tr>
<tr>
<td class="col cut" style="width: 85px;"></td>
<td class="footer_body media_footer" style="font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 12px; line-height: 17px; color: #777; text-shadow: 0 1px 0 #ffffff;">
<div>
<a href="http://www.ideas-ba.com.ar">Ideasba</a> te permite realizar/contestar preguntas o sugerir ideas para mejorar la ciudad en la que vivimos
</div>
<div>
<a href="#" class="address" style="border: none; color: #0084b4; text-decoration: none;font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; text-decoration: none; font-size: 11px; line-height: 17px; color: #999999; text-shadow: 0 1px 0 #ffffff;">Ideas-ba, Inc. </a>
</div> </td>
<td class="col cut" style="width: 85px;"></td>
</tr>
<tr>
<td colspan="3" class="footer-padding-bottom" height="25"></td>
</tr>
</tbody>
</table> </td>
</tr>
</tbody>
</table> </td>
</tr>
</tbody>
</table>
</body>
</html>
"""))}
    }
    
    def render(username:String,ideaText:String,ideaTitle:String,commentUser:String,commentText:String,commentUserAvatar:String,authorIdeaAvatar:String,idea:String) = apply(username,ideaText,ideaTitle,commentUser,commentText,commentUserAvatar,authorIdeaAvatar,idea)
    
    def f:((String,String,String,String,String,String,String,String) => play.api.templates.Html) = (username,ideaText,ideaTitle,commentUser,commentText,commentUserAvatar,authorIdeaAvatar,idea) => apply(username,ideaText,ideaTitle,commentUser,commentText,commentUserAvatar,authorIdeaAvatar,idea)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 16 17:21:57 ART 2013
                    SOURCE: /home/sas/Ubuntu One/apps/ideas/webservice-scala/app/views/commentCreatedMailTemplate.scala.html
                    HASH: 1eaa7284c3f7c62e016c3741a29014afccd027dd
                    MATRIX: 575->1|848->166|876->199|1251->528|1344->574|1417->601|1510->647|1583->674|1676->720|1749->747|1843->794|1915->820|2006->864|2078->890|2170->935|2243->962|2322->994|2398->1024|2472->1051|2564->1097|2638->1124|2731->1171|2807->1200|2924->1271|3029->1329|3103->1357|3178->1385|3310->1471|3404->1518|3502->1570|3583->1604|3656->1631|3737->1665|3810->1692|3889->1724|3965->1754|4043->1785|4119->1815|4199->1848|4272->1875|4359->1915|4460->1970|4548->2011|4624->2041|4717->2087|4793->2117|4873->2150|5055->2286|5137->2321|5309->2447|5391->2482|5526->2570|5604->2600|5738->2687|5836->2737|5910->2764|6011->2817|6085->2844|6171->2882|6246->2910|6327->2943|6402->2971|6478->2999|6586->3060|6671->3097|7022->3401|7118->3449|7192->3476|7285->3521|7357->3546|7434->3575|7508->3602|7583->3629|7657->3656|7706->3658|7837->3742|7920->3777|8068->3878|8158->3920|8251->3966|8334->4001|8446->4066|8495->4068|10463->6001|10494->6009|10940->6417|10980->6433|12319->7725|12389->7747|12463->7774|12547->7810|12621->7837|12704->7872|12778->7899|12864->7937|12937->7963|13009->7987|13083->8014|13155->8038|13296->8132|13377->8165|13441->8182|13514->8207|13587->8233|13636->8235|14231->8783|14301->8805|14375->8832|14461->8870|14535->8897|14637->8951|14711->8978|14783->9002|14924->9096|15014->9138|15087->9164|15136->9166|15626->9618|15666->9634|16170->10100|16203->10109|17126->10994|17158->11002|17862->11659|17946->11695|18020->11722|18106->11760|18213->11820|18301->11860|18374->11886|18465->11929|18539->11956|18588->11958|19074->12406|19115->12423|19692->12962|19727->12973|20434->13642|20469->13653|20898->14044|20969->14091|21814->14889|21893->14920|21967->14947|22060->14992|22133->15018|22182->15020|22312->15103|22388->15131|22500->15196|22549->15198|24302->16913|24330->16917
                    LINES: 19->1|23->1|25->4|33->12|34->13|36->15|37->16|39->18|40->19|42->21|43->22|45->24|46->25|48->27|49->28|51->30|52->31|54->33|56->35|59->38|60->39|63->42|64->43|68->47|69->48|71->50|72->51|76->55|77->56|80->59|81->60|83->62|84->63|86->65|87->66|89->68|90->69|92->71|93->72|95->74|96->75|99->78|100->79|102->81|103->82|105->84|106->85|111->90|112->91|117->96|118->97|122->101|123->102|127->106|128->107|130->109|131->110|133->112|134->113|136->115|137->116|139->118|140->119|143->122|144->123|154->133|155->134|157->136|158->137|160->139|161->140|163->142|164->143|166->145|167->146|169->148|170->149|174->153|175->154|178->157|179->158|182->161|183->162|208->187|208->187|216->195|216->195|232->211|233->212|235->214|236->215|238->217|239->218|241->220|242->221|244->223|245->224|247->226|248->227|252->231|253->232|255->234|256->235|258->237|259->238|274->253|275->254|277->256|278->257|280->259|281->260|283->262|284->263|288->267|289->268|291->270|292->271|298->277|298->277|300->279|300->279|307->286|307->286|328->307|329->308|331->310|332->311|335->314|336->315|338->317|339->318|341->320|342->321|348->327|348->327|350->329|350->329|359->338|359->338|365->344|365->344|391->370|392->371|394->373|395->374|397->376|398->377|399->378|400->379|403->382|404->383|416->395|416->395
                    -- GENERATED --
                */
            