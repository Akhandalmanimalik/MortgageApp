
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
object leadsucess extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""


"""),format.raw/*4.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Thank You</title>

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


			<div align="center">"""),_display_(/*41.25*/message),format.raw/*41.32*/("""</div>



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

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:24 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/leadsucess.scala.html
                  HASH: b5884f46e315d710432cf3bed2c7961d7994afae
                  MATRIX: 728->1|833->18|862->21|1134->266|1149->272|1206->308|1361->436|1376->442|1439->484|1482->500|1497->506|1559->547|1644->605|1659->611|1719->650|1795->699|1810->705|1865->739|1941->788|1956->794|2014->831|2194->984|2209->990|2270->1030|2581->1314|2609->1321
                  LINES: 26->1|29->1|32->4|38->10|38->10|38->10|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|55->27|55->27|55->27|69->41|69->41
                  -- GENERATED --
              */
          