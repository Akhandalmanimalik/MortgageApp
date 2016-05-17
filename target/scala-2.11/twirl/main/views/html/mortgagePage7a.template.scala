
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
object mortgagePage7a extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ApplicantAddressParameter7,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addresses:ApplicantAddressParameter7):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="shortcut icon" href=""""),_display_(/*9.34*/routes/*9.40*/.Assets.at("_resources/favicon.ico")),format.raw/*9.76*/("""">
<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script src=""""),_display_(/*16.15*/routes/*16.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*16.65*/(""""></script>
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.at("javascripts/mortgageJs/mortgagePage7a.js")),format.raw/*17.75*/(""""></script>
<script src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*18.67*/(""""></script>
<style type="text/css">
	.verticalLine """),format.raw/*20.16*/("""{"""),format.raw/*20.17*/("""
	"""),format.raw/*21.2*/("""height: 320px;
    border-left: medium groove #336699;
	"""),format.raw/*23.2*/("""}"""),format.raw/*23.3*/("""
	"""),format.raw/*24.2*/(""".inline"""),format.raw/*24.9*/("""{"""),format.raw/*24.10*/("""
	"""),format.raw/*25.2*/("""display: inline;
	"""),format.raw/*26.2*/("""}"""),format.raw/*26.3*/("""
"""),format.raw/*27.1*/("""</style>

<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*30.31*/routes/*30.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*30.79*/("""">
<script src="""),_display_(/*31.14*/routes/*31.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*31.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*32.47*/routes/*32.53*/.Assets.at("_resources/background.css")),format.raw/*32.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*33.47*/routes/*33.53*/.Assets.at("_resources/forms.css")),format.raw/*33.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*34.47*/routes/*34.53*/.Assets.at("_resources/template.css")),format.raw/*34.90*/("""">
</head>
<body>
<br>
<br>
<div style="width: 97%;">
			
		<form name="myForm" action="mortgagePage7a" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value="uniid" name="uniid">
		<input type="hidden" value=""""),_display_(/*43.32*/addresses/*43.41*/.getApplicantMovedIn1),format.raw/*43.62*/("""" name="movedIn12">
		<input type="hidden" value=""""),_display_(/*44.32*/addresses/*44.41*/.getApplicantMovedIn2),format.raw/*44.62*/("""" name="movedIn13">
		
		<input type="hidden" value=""""),_display_(/*46.32*/addresses/*46.41*/.getApplicantTotalcurrentMonths),format.raw/*46.72*/("""" name="totalMonth131" >
		<input type="hidden" value=""""),_display_(/*47.32*/addresses/*47.41*/.getApplicantTotalpriorcurrentmonths1),format.raw/*47.78*/("""" name="totalMonth132" >
		<input type="hidden" value=""""),_display_(/*48.32*/addresses/*48.41*/.getApplicantTotalpriorcurrentmonths2),format.raw/*48.78*/("""" name="totalMonth133" ><input type="hidden" value=""""),_display_(/*48.131*/addresses/*48.140*/.getApplicantMovedIn3),format.raw/*48.161*/("""" name="movedIn14">
		
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 1%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*57.11*/routes/*57.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*57.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 4%">
		<div ng-controller="DemoController" ng-init="isDisabled = false" >
				
					<label class="labelfont" >"""),_display_(/*63.33*/addresses/*63.42*/.getApplicantName),format.raw/*63.59*/("""</label><br><br>
					<div class="row">
					<div class="col-sm-7"><label class="labelfont">What is your current address?<span style="color: red; font-size: 3">*</span></label></div>
					<div class="col-sm-3" style="padding-left: 0%;"><label class="labelfont">Moved In?<span style="color: red; font-size: 3">*</span></label></div>
					</div>
					
			<div class="row">
					  <div class="col-sm-7">
					  	<div class="map_canvas"></div>
							<input type="text" id="geocomplete" placeholder="Enter Location" class="form-control" name="currentAddress1" value=""""),_display_(/*72.125*/addresses/*72.134*/.getApplicantCurrentAddress),format.raw/*72.161*/("""">
								<div id="input_2001" style="position: absolute;"> </div>
					  </div>
					  <div class="col-sm-3" style="padding-left: 0%;"><input type="text" name="movedIn1" ng-model="movedIn1" id = "datepicker" placeholder="mm/dd/yyyy" class="form-control" ng-selected="calculateDate(this)" readonly="readonly" value="">
						<div id="input_2002" style="position: absolute;"> </div>
					</div>
			</div>
				<input type="hidden" name="currentaddressmonthsum" value=""""),format.raw/*79.63*/("""{"""),format.raw/*79.64*/("""{"""),format.raw/*79.65*/("""applicantTotal1"""),format.raw/*79.80*/("""}"""),format.raw/*79.81*/("""}"""),format.raw/*79.82*/("""">
				<input type="hidden" name="totalcurrentmonths" value=""""),format.raw/*80.59*/("""{"""),format.raw/*80.60*/("""{"""),format.raw/*80.61*/("""applicantTotal1"""),format.raw/*80.76*/("""}"""),format.raw/*80.77*/("""}"""),format.raw/*80.78*/("""">
			<div ng-show="applicantTotal1<36">
				<br>
				   <div class="row">
					<div class="col-sm-7"><label class="labelfont">Please provide your prior Address.Lenders Require A Minimum Of 3 Years Of Address History?<span style="color: red; font-size: 3">*</span></label></div>
					<div class="col-sm-3" style="padding-left: 0%;"><label class="labelfont">Moved In?<span style="color: red; font-size: 3">*</span></label></div>
					</div>
				
					<div class="row">
					  <div class="col-sm-7"><div class="map_canvas"></div>
							<input type="text" id="geocomplete1" placeholder="Enter Location" class="form-control" name="currentAddress2" value=""""),_display_(/*90.126*/addresses/*90.135*/.getApplicantPriorAddress2),format.raw/*90.161*/("""">
							<div id="input_2003" style="position: absolute;"> </div>
					  </div>
					  <div class="col-sm-3" style="padding-left: 0%;"><input type="text"  name="movedIn2" ng-model="movedIn2" id = "datepicker1" placeholder="mm/dd/yyyy" class="form-control" ng-selected="calculateDate(this)" readonly="readonly">
							<div id="input_2004" style="position: absolute;"> </div>
					  </div>
					  </div>
					 	 <input type="hidden" name="priormonthsum1" value=""""),format.raw/*97.59*/("""{"""),format.raw/*97.60*/("""{"""),format.raw/*97.61*/("""applicantTotal2-applicantTotal1"""),format.raw/*97.92*/("""}"""),format.raw/*97.93*/("""}"""),format.raw/*97.94*/("""">
						<input type="hidden" name="totalpriormonths1" value=""""),format.raw/*98.60*/("""{"""),format.raw/*98.61*/("""{"""),format.raw/*98.62*/("""applicantTotal2"""),format.raw/*98.77*/("""}"""),format.raw/*98.78*/("""}"""),format.raw/*98.79*/("""">
					  <div ng-show="applicantTotal2<36">
					  	<br>
					  	<div class="row">
							<div class="col-sm-7"><label class="labelfont">Previous Address?<span style="color: red; font-size: 3">*</span></label></div>
							<div class="col-sm-3" style="padding-left: 0%;"><label class="labelfont">Moved In?<span style="color: red; font-size: 3">*</span></label></div>
						</div>
					  		<div class="row">
							  <div class="col-sm-7"><div class="map_canvas"></div>
								<input type="text" id="geocomplete2" placeholder="Enter Location" class="form-control" name="currentAddress3" value=""""),_display_(/*107.127*/addresses/*107.136*/.getApplicantPriorAddress1),format.raw/*107.162*/("""">
									<div id="input_2005"> </div>
								</div>
							  <div class="col-sm-3" style="padding-left: 0%;"><input type="text"  name="movedIn3" ng-model="movedIn3" id = "datepicker2" placeholder="mm/dd/yyyy" class="form-control" ng-selected="calculateDate(this)" readonly="readonly">
								<div id="input_2006" style="position: absolute;"> </div>
							  </div>
							  </div>
							 
							  <input type="hidden" name="priormonthsum2" value=""""),format.raw/*115.60*/("""{"""),format.raw/*115.61*/("""{"""),format.raw/*115.62*/("""applicantTotal3-applicantTotal2"""),format.raw/*115.93*/("""}"""),format.raw/*115.94*/("""}"""),format.raw/*115.95*/("""">
							 <input type="hidden" name="totalpriormonths2" value=""""),format.raw/*116.62*/("""{"""),format.raw/*116.63*/("""{"""),format.raw/*116.64*/("""applicantTotal3"""),format.raw/*116.79*/("""}"""),format.raw/*116.80*/("""}"""),format.raw/*116.81*/("""">
					  </div>
			</div>		
			 <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
			  <!-- <script src="//code.jquery.com/jquery-1.10.2.js"></script> -->
			  <script type="text/javascript" src="jquery-ui.js" ></script>
			  <script src=""""),_display_(/*122.20*/routes/*122.26*/.Assets.at("_resources/jquery-ui.js")),format.raw/*122.63*/("""" type="text/javascript"></script>
			  <link rel="stylesheet" href="/resources/demos/style.css">
				</div>
	        <br>
	        		<div class="row" style="width: 100%;">
					  <div class="col-sm-6" style="float: left; padding-left:2%; width: 50%;">
					  		<a href="mortgageBackPage6b" class="btn btn-primary"
										role="button" style="width: 50%;">Back</a>
					  </div>
					  <div class="col-sm-6" align="right" style="float: right; padding-right:5%; width: 50%;"><input type="submit" class="btn btn-primary btn-block"
								value="Next" style="width: 50%;">
							<div align="right" id="submiterror">
								<font color="red"></font></div>
					  </div>	
					</div>
				</div>
						<br>
						<div class="container" style="width: 70%;">
						  <div class="progress">
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:60%; background-color: #6AA84F;">
						    <label>60% complete</label>
						    </div>
						  </div>
						</div>
					 </div>
				</div>
				
				<br>
				<br>
</form>
</div>

<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
<script src="jquery.geocomplete.js"></script>

</body>
</html>
 """))}
  }

  def render(addresses:ApplicantAddressParameter7): play.twirl.api.HtmlFormat.Appendable = apply(addresses)

  def f:((ApplicantAddressParameter7) => play.twirl.api.HtmlFormat.Appendable) = (addresses) => apply(addresses)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:27 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage7a.scala.html
                  HASH: 7a378e31cb92cb9700867ac2f90afbbd0e2b3319
                  MATRIX: 752->1|878->39|905->40|1362->471|1376->477|1432->513|1967->1021|1982->1027|2047->1071|2100->1097|2115->1103|2190->1157|2243->1183|2258->1189|2325->1235|2404->1286|2433->1287|2462->1289|2545->1345|2573->1346|2602->1348|2636->1355|2665->1356|2694->1358|2739->1376|2767->1377|2795->1378|2922->1478|2937->1484|3000->1526|3043->1542|3058->1548|3120->1589|3207->1649|3222->1655|3282->1694|3358->1743|3373->1749|3428->1783|3504->1832|3519->1838|3577->1875|3838->2109|3856->2118|3898->2139|3976->2190|3994->2199|4036->2220|4117->2274|4135->2283|4187->2314|4270->2370|4288->2379|4346->2416|4429->2472|4447->2481|4505->2518|4586->2571|4605->2580|4648->2601|4978->2904|4993->2910|5054->2950|5296->3165|5314->3174|5352->3191|5944->3755|5963->3764|6012->3791|6507->4258|6536->4259|6565->4260|6608->4275|6637->4276|6666->4277|6755->4338|6784->4339|6813->4340|6856->4355|6885->4356|6914->4357|7595->5010|7614->5019|7662->5045|8152->5507|8181->5508|8210->5509|8269->5540|8298->5541|8327->5542|8417->5604|8446->5605|8475->5606|8518->5621|8547->5622|8576->5623|9201->6219|9221->6228|9270->6254|9753->6708|9783->6709|9813->6710|9873->6741|9903->6742|9933->6743|10026->6807|10056->6808|10086->6809|10130->6824|10160->6825|10190->6826|10500->7108|10516->7114|10575->7151
                  LINES: 26->1|29->1|30->2|37->9|37->9|37->9|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|49->21|51->23|51->23|52->24|52->24|52->24|53->25|54->26|54->26|55->27|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|71->43|71->43|71->43|72->44|72->44|72->44|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|76->48|76->48|76->48|85->57|85->57|85->57|91->63|91->63|91->63|100->72|100->72|100->72|107->79|107->79|107->79|107->79|107->79|107->79|108->80|108->80|108->80|108->80|108->80|108->80|118->90|118->90|118->90|125->97|125->97|125->97|125->97|125->97|125->97|126->98|126->98|126->98|126->98|126->98|126->98|135->107|135->107|135->107|143->115|143->115|143->115|143->115|143->115|143->115|144->116|144->116|144->116|144->116|144->116|144->116|150->122|150->122|150->122
                  -- GENERATED --
              */
          