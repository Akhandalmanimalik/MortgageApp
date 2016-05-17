
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object error extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String,errorCode:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.36*/("""


"""),format.raw/*4.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Error</title>

<link rel="shortcut icon" href=""""),_display_(/*10.34*/routes/*10.40*/.Assets.at("_resources/favicon.ico")),format.raw/*10.76*/("""">

<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->
<link rel="stylesheet" href=""""),_display_(/*14.31*/routes/*14.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*14.79*/("""">
<script src="""),_display_(/*15.14*/routes/*15.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*15.61*/(""""></script>
<link type="text/css" rel="stylesheet" href=""""),_display_(/*16.47*/routes/*16.53*/.Assets.at("_resources/background.css")),format.raw/*16.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*17.47*/routes/*17.53*/.Assets.at("_resources/forms.css")),format.raw/*17.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*18.47*/routes/*18.53*/.Assets.at("_resources/template.css")),format.raw/*18.90*/("""">


</head>
<body>


	<div style="padding-bottom: 20px; margin-top: 20px; padding-left: 40%">
		<img alt="Visdom Logo" height="90" width="260"
			src=""""),_display_(/*27.10*/routes/*27.16*/.Assets.at("_resources/visdom-logo.png")),format.raw/*27.56*/("""" />


	</div>
	<div class="container-fluid">

	<div class="row"></div>
	<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			<div style="padding-top: 50px"></div>
			<div style="padding-top: 50px"></div>


			<div align="center">"""),_display_(/*41.25*/message),format.raw/*41.32*/("""
			"""),format.raw/*42.4*/("""<br><br>
			
			</div>
					Name                 :<br>
					Contact phone number :<br>
					Best time to phone   :<br>
					Error code 			 : """),_display_(/*48.24*/errorCode),format.raw/*48.33*/("""<br><br>
					
					 Thank you for your patience.



			<div style="padding-bottom: 50px;"></div>
		</div>
		<div class="col-sm-3"></div>
	</div>
	</div>
	<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
	<br>
<br>
<br>
<br>
<br>



	















</body>
</html>


"""))}
  }

  def render(message:String,errorCode:String): play.twirl.api.HtmlFormat.Appendable = apply(message,errorCode)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,errorCode) => apply(message,errorCode)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:23 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/error.scala.html
                  HASH: 49d7f0e62b78a1abf80a7eba5f39ac4da1020524
                  MATRIX: 730->1|852->35|881->38|1149->279|1164->285|1221->321|1376->449|1391->455|1454->497|1497->513|1512->519|1574->560|1659->618|1674->624|1734->663|1810->712|1825->718|1880->752|1956->801|1971->807|2029->844|2209->997|2224->1003|2285->1043|2596->1327|2624->1334|2655->1338|2824->1480|2854->1489
                  LINES: 26->1|29->1|32->4|38->10|38->10|38->10|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|55->27|55->27|55->27|69->41|69->41|70->42|76->48|76->48
                  -- GENERATED --
              */
          