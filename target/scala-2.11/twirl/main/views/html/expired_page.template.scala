
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
object expired_page extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
				src=""""),_display_(/*47.11*/routes/*47.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*47.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 4%">
		<div ng-controller="DemoController" ng-init="isDisabled = false" >
				<center><b>"""),_display_(/*52.17*/message),format.raw/*52.24*/("""</b></center>			
		</div>
		<br>
		</div>
		<br>
		<br>						
		</div>
		</div>
		</div>
		<br>
		<br>
</form>
</div>
 <script>
$(document).ready(function()"""),format.raw/*66.29*/("""{"""),format.raw/*66.30*/("""
    """),format.raw/*67.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*68.1*/("""}"""),format.raw/*68.2*/(""");
</script>

<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
 
    <script src="jquery.geocomplete.js"></script>
   

	<script type="text/javascript">
		var app = angular.module("demoApp", [ 'ui.bootstrap' ]);

		app.controller('DemoController', function($scope) """),format.raw/*79.53*/("""{"""),format.raw/*79.54*/("""
			"""),format.raw/*80.4*/("""init();
			function init() """),format.raw/*81.20*/("""{"""),format.raw/*81.21*/("""
				"""),format.raw/*82.5*/("""$scope.newItemType = '';
				$scope.company = "";
				$scope.change = function() """),format.raw/*84.32*/("""{"""),format.raw/*84.33*/("""
					"""),format.raw/*85.6*/("""console.log($scope.newItemType)
				"""),format.raw/*86.5*/("""}"""),format.raw/*86.6*/(""";
			"""),format.raw/*87.4*/("""}"""),format.raw/*87.5*/("""
			
		"""),format.raw/*89.3*/("""}"""),format.raw/*89.4*/(""");
		
	</script>
	<script src=""""),_display_(/*92.16*/routes/*92.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*92.72*/("""" type="text/javascript"></script>
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
                  DATE: Mon May 16 20:16:19 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/expired_page.scala.html
                  HASH: 6454325fa487cb50275274a604391deeebe8fd4f
                  MATRIX: 730->1|834->17|862->19|1278->408|1293->414|1356->456|1521->594|1536->600|1593->636|2041->1057|2056->1063|2118->1104|2271->1230|2286->1236|2351->1280|2408->1310|2423->1316|2490->1362|2722->1567|2737->1573|2800->1615|2843->1631|2858->1637|2920->1678|3007->1738|3022->1744|3082->1783|3158->1832|3173->1838|3228->1872|3304->1921|3319->1927|3377->1964|3833->2393|3848->2399|3909->2439|4130->2633|4158->2640|4342->2796|4371->2797|4403->2802|4473->2845|4501->2846|4843->3160|4872->3161|4903->3165|4958->3192|4987->3193|5019->3198|5128->3279|5157->3280|5190->3286|5253->3322|5281->3323|5313->3328|5341->3329|5375->3336|5403->3337|5462->3369|5477->3375|5548->3425
                  LINES: 26->1|29->1|31->3|39->11|39->11|39->11|41->13|41->13|41->13|47->19|47->19|47->19|50->22|50->22|50->22|51->23|51->23|51->23|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|75->47|75->47|75->47|80->52|80->52|94->66|94->66|95->67|96->68|96->68|107->79|107->79|108->80|109->81|109->81|110->82|112->84|112->84|113->85|114->86|114->86|115->87|115->87|117->89|117->89|120->92|120->92|120->92
                  -- GENERATED --
              */
          