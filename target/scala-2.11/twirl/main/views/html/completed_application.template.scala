
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
object completed_application extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="_resources/bootstrap.min.css">
 <link rel="stylesheet" href=""""),_display_(/*11.32*/routes/*11.38*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*11.80*/("""">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="shortcut icon" href=""""),_display_(/*13.34*/routes/*13.40*/.Assets.at("_resources/favicon.ico")),format.raw/*13.76*/("""">
  <script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script>
<script src="""),_display_(/*19.14*/routes/*19.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*19.61*/(""""></script>  

 <script src="//ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js"></script>
   <script src=""""),_display_(/*22.18*/routes/*22.24*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*22.68*/(""""></script>
    <script src=""""),_display_(/*23.19*/routes/*23.25*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*23.71*/(""""></script>
   

<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->  
 <link rel="stylesheet" href="_resources/bootstrap.min.css">
 <link rel="stylesheet" href=""""),_display_(/*29.32*/routes/*29.38*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*29.80*/("""">
<script src="""),_display_(/*30.14*/routes/*30.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*30.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*31.47*/routes/*31.53*/.Assets.at("_resources/background.css")),format.raw/*31.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*32.47*/routes/*32.53*/.Assets.at("_resources/forms.css")),format.raw/*32.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*33.47*/routes/*33.53*/.Assets.at("_resources/template.css")),format.raw/*33.90*/("""">
</head>
<body>
<br>
<br>
<div style="width: 97%;">
			
		<form name="myForm" action="mortgagePage2"  method="POST"  onsubmit="return validateForm()">
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 1%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*48.11*/routes/*48.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*48.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 4%">
		<div ng-controller="DemoController" ng-init="isDisabled = false" >
				<center><b>"""),_display_(/*53.17*/message),format.raw/*53.24*/("""</b></center>			
		</div>
		<br>
		</div>
		<br>
			<br>
						<div class="container" style="width: 70%;">
						  <div class="progress">
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:100%; background-color: #6AA84F;">
						    <label>100% complete</label>
						    </div>
						  </div>
						</div>
		</div>
		</div>
		</div>
		<br>
		<br>
</form>
</div>
 <script>
$(document).ready(function()"""),format.raw/*74.29*/("""{"""),format.raw/*74.30*/("""
    """),format.raw/*75.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*76.1*/("""}"""),format.raw/*76.2*/(""");
</script>

<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
 
    <script src="jquery.geocomplete.js"></script>
   

	<script type="text/javascript">
		var app = angular.module("demoApp", [ 'ui.bootstrap' ]);

		app.controller('DemoController', function($scope) """),format.raw/*87.53*/("""{"""),format.raw/*87.54*/("""
			"""),format.raw/*88.4*/("""init();
			function init() """),format.raw/*89.20*/("""{"""),format.raw/*89.21*/("""
				"""),format.raw/*90.5*/("""$scope.newItemType = '';
				$scope.company = "";
				$scope.change = function() """),format.raw/*92.32*/("""{"""),format.raw/*92.33*/("""
					"""),format.raw/*93.6*/("""console.log($scope.newItemType)
				"""),format.raw/*94.5*/("""}"""),format.raw/*94.6*/(""";
			"""),format.raw/*95.4*/("""}"""),format.raw/*95.5*/("""
			
		"""),format.raw/*97.3*/("""}"""),format.raw/*97.4*/(""");
		
	</script>
	<script src=""""),_display_(/*100.16*/routes/*100.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*100.72*/("""" type="text/javascript"></script>
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
                  DATE: Mon May 16 20:16:26 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/completed_application.scala.html
                  HASH: 609f9bb663a284f106eae89f9937171a1b212a3b
                  MATRIX: 739->1|843->17|871->19|1287->408|1302->414|1365->456|1530->594|1545->600|1602->636|2050->1057|2065->1063|2127->1104|2280->1230|2295->1236|2360->1280|2417->1310|2432->1316|2499->1362|2731->1567|2746->1573|2809->1615|2852->1631|2867->1637|2929->1678|3016->1738|3031->1744|3091->1783|3167->1832|3182->1838|3237->1872|3313->1921|3328->1927|3386->1964|3846->2397|3861->2403|3922->2443|4143->2637|4171->2644|4675->3120|4704->3121|4736->3126|4806->3169|4834->3170|5176->3484|5205->3485|5236->3489|5291->3516|5320->3517|5352->3522|5461->3603|5490->3604|5523->3610|5586->3646|5614->3647|5646->3652|5674->3653|5708->3660|5736->3661|5796->3693|5812->3699|5884->3749
                  LINES: 26->1|29->1|31->3|39->11|39->11|39->11|41->13|41->13|41->13|47->19|47->19|47->19|50->22|50->22|50->22|51->23|51->23|51->23|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|76->48|76->48|76->48|81->53|81->53|102->74|102->74|103->75|104->76|104->76|115->87|115->87|116->88|117->89|117->89|118->90|120->92|120->92|121->93|122->94|122->94|123->95|123->95|125->97|125->97|128->100|128->100|128->100
                  -- GENERATED --
              */
          