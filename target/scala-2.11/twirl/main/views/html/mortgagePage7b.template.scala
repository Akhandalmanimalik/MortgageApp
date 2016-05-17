
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
object mortgagePage7b extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[CoApplicantAddressParameter7,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(coApplAddressParam:CoApplicantAddressParameter7):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.51*/("""
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
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.at("javascripts/mortgageJs/mortgagePage7b.js")),format.raw/*17.75*/(""""></script>
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
			
		<form name="myForm" action="mortgagePage7b" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value="uniid" name="uniid">
		<input type="hidden" value=""""),_display_(/*43.32*/coApplAddressParam/*43.50*/.getCoAppmovedIn1),format.raw/*43.67*/("""" name="coAppmovedIn12">
		<input type="hidden" value=""""),_display_(/*44.32*/coApplAddressParam/*44.50*/.getCoMovedIn2),format.raw/*44.64*/("""" name="coAppmovedIn13">
		<input type="hidden" value=""""),_display_(/*45.32*/coApplAddressParam/*45.50*/.getCoMovedIn3),format.raw/*45.64*/("""" name="coAppmovedIn14">
		
		<input type="hidden" value=""""),_display_(/*47.32*/coApplAddressParam/*47.50*/.getCoAppTotalcurrentMonths),format.raw/*47.77*/("""" name="coTotalMonth231">
		<input type="hidden" value=""""),_display_(/*48.32*/coApplAddressParam/*48.50*/.getCoTotalpriorcurrentmonths1),format.raw/*48.80*/("""" name="coTotalMonth232">
		<input type="hidden" value=""""),_display_(/*49.32*/coApplAddressParam/*49.50*/.getCoApptotalpriorcurrentmonths2),format.raw/*49.83*/("""" name="coTotalMonth233">
		
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 1%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*58.11*/routes/*58.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*58.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 4%">
		<div ng-controller="DemoController" ng-init="isDisabled = false" >
					<label class="labelfont">"""),_display_(/*63.32*/coApplAddressParam/*63.50*/.getCoApplicantName),format.raw/*63.69*/("""</label><br><br>
					<div class="row">
					<div class="col-sm-7"><label class="labelfont">What is your current address?<span style="color: red; font-size: 3">*</span></label></div>
					<div class="col-sm-3" style="padding-left: 0%;"><label class="labelfont">Moved In?<span style="color: red; font-size: 3">*</span></label></div>
					</div>
					<div class="row">
					  <div class="col-sm-7"><div class="map_canvas"></div>
							<input type="text" id="geocomplete" placeholder="Enter Location" class="form-control" name="CoCurrentAddress1" style="width: 100%" value=""""),_display_(/*70.147*/coApplAddressParam/*70.165*/.getCoAppcurrentAddress),format.raw/*70.188*/("""">
								<div id="input_2021" style="position: absolute;"> </div>
					  </div>
					  <div class="col-sm-3" style="padding-left: 0%;"><input type="text" id = "datepicker3" name="CoMovedIn1" ng-model="CoMovedIn1" placeholder="mm/dd/yyyy" class="form-control" ng-selected="calculateDate2(this)" style="width: 100%" readonly="readonly" >
											<div id="input_2022" style="position: absolute;"> </div>
					  </div>
					  </div>
					  <input type="hidden" name="coAppcurrentaddressmonthsum" value=""""),format.raw/*77.71*/("""{"""),format.raw/*77.72*/("""{"""),format.raw/*77.73*/("""coApplicantTotal"""),format.raw/*77.89*/("""}"""),format.raw/*77.90*/("""}"""),format.raw/*77.91*/("""">
					  <input type="hidden" name="coAppTotalcurrentMonths" value=""""),format.raw/*78.67*/("""{"""),format.raw/*78.68*/("""{"""),format.raw/*78.69*/("""coApplicantTotal"""),format.raw/*78.85*/("""}"""),format.raw/*78.86*/("""}"""),format.raw/*78.87*/("""">
					<div ng-show="coApplicantTotal<36">
					<br>
						<div class="row">
							<div class="col-sm-7"><label class="labelfont">Please provide your prior Address.Lenders Require A Minimum Of 3 Years Of Address History?<span style="color: red; font-size: 3">*</span></label></div>
							<div class="col-sm-3" style="padding-left: 0%;"><label class="labelfont">Moved In?<span style="color: red; font-size: 3">*</span></label></div>
						</div>
						<div class="row">
					  <div class="col-sm-7"><div class="map_canvas"></div>
						<input type="text" id="geocomplete1" placeholder="Enter Location" class="form-control" name="CoCurrentAddress2" value=""""),_display_(/*87.127*/coApplAddressParam/*87.145*/.getCoAppPriorAddress1),format.raw/*87.167*/("""">
						<div id="input_2023" style="position: absolute;"> </div>
					  </div>
					  <div class="col-sm-3" style="padding-left: 0%;"><input type="text" id = "datepicker4" name="CoMovedIn2" ng-model="CoMovedIn2" placeholder="mm/dd/yyyy" class="form-control" ng-blur="calculateDate2(this)" readonly="readonly" >
						<div id="input_2024" style="position: absolute;"> </div>
					  </div>
					  </div>
					</div>
					<input type="hidden" name="coAppPriorSumMonth1" value=""""),format.raw/*95.61*/("""{"""),format.raw/*95.62*/("""{"""),format.raw/*95.63*/("""coApplicantTotal2-coApplicantTotal"""),format.raw/*95.97*/("""}"""),format.raw/*95.98*/("""}"""),format.raw/*95.99*/("""">
					<input type="hidden" name="coAppTotalpriorcurrentmonths1" value=""""),format.raw/*96.71*/("""{"""),format.raw/*96.72*/("""{"""),format.raw/*96.73*/("""coApplicantTotal2"""),format.raw/*96.90*/("""}"""),format.raw/*96.91*/("""}"""),format.raw/*96.92*/("""">
					<div ng-show="coApplicantTotal2<36">
						<br>
						<div class="row">
							<div class="col-sm-7"><label class="labelfont">Previous Address?<span style="color: red; font-size: 3">*</span></label></div>
							<div class="col-sm-3" style="padding-left: 0%;"><label class="labelfont">Moved In?<span style="color: red; font-size: 3">*</span></label></div>
						</div>
					<div class="row">
					  <div class="col-sm-7"><div class="map_canvas"></div>
						<input type="text" id="geocomplete2" class="form-control" name="CoCurrentAddress4" value=""""),_display_(/*105.98*/coApplAddressParam/*105.116*/.getCoApppriorAddress2),format.raw/*105.138*/("""">
						<div id="input_2025" style="position: absolute;"> </div>
					  </div>
					  <div class="col-sm-3" style="padding-left: 0%;"><input type="text" id="datepicker5" name="CoMovedIn3" ng-model="CoMovedIn3" ng-blur="calculateDate2(this)" placeholder="mm/dd/yyyy" class="form-control" readonly="readonly" >
						<div id="input_2026" style="position: absolute;"> </div>
					  </div>
					  </div>
					  <input type="hidden" name="coApppriorSumMonth2" value=""""),format.raw/*112.63*/("""{"""),format.raw/*112.64*/("""{"""),format.raw/*112.65*/("""coApplicantTotal3-coApplicantTotal2"""),format.raw/*112.100*/("""}"""),format.raw/*112.101*/("""}"""),format.raw/*112.102*/("""">
						<input type="hidden" name="coApptotalpriorcurrentmonths2" value=""""),format.raw/*113.72*/("""{"""),format.raw/*113.73*/("""{"""),format.raw/*113.74*/("""coApplicantTotal3"""),format.raw/*113.91*/("""}"""),format.raw/*113.92*/("""}"""),format.raw/*113.93*/("""">
					</div>
					
					<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <!-- <script src="//code.jquery.com/jquery-1.10.2.js"></script> -->
  <script type="text/javascript" src="jquery-ui.js" ></script>
  <script src=""""),_display_(/*119.17*/routes/*119.23*/.Assets.at("_resources/jquery-ui.js")),format.raw/*119.60*/("""" type="text/javascript"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
		
	</div>
	        <br>

	        		<div class="row" style="width: 100%;">
					  <div class="col-sm-6" style="float: left; padding-left:2%; width: 50%;">
					  		<a href="mortgageBackPage7a" class="btn btn-primary"
										role="button" style="width: 50%;">Back</a>
					  </div>
					  <div class="col-sm-6" align="right" style="float: right; padding-right:5%; width: 50%;"><input type="submit" class="btn btn-primary btn-block"
								value="Next" style="width: 50%;">
							<div align="right" id="submiterror">
								<font color="red"></font></div>
					  </div>	
					</div>
			</div>
						<br><br>
						<div class="container" style="width: 70%;">
						  <div class="progress">
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:65%; background-color: #6AA84F;">
						    <label>65%</label>
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

  def render(coApplAddressParam:CoApplicantAddressParameter7): play.twirl.api.HtmlFormat.Appendable = apply(coApplAddressParam)

  def f:((CoApplicantAddressParameter7) => play.twirl.api.HtmlFormat.Appendable) = (coApplAddressParam) => apply(coApplAddressParam)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:27 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage7b.scala.html
                  HASH: e513ff34ffc70ccac225bf283b4d0eb175805b33
                  MATRIX: 754->1|891->50|918->51|1375->482|1389->488|1445->524|1980->1032|1995->1038|2060->1082|2113->1108|2128->1114|2203->1168|2256->1194|2271->1200|2338->1246|2417->1297|2446->1298|2475->1300|2558->1356|2586->1357|2615->1359|2649->1366|2678->1367|2707->1369|2752->1387|2780->1388|2808->1389|2935->1489|2950->1495|3013->1537|3056->1553|3071->1559|3133->1600|3220->1660|3235->1666|3295->1705|3371->1754|3386->1760|3441->1794|3517->1843|3532->1849|3590->1886|3851->2120|3878->2138|3916->2155|3999->2211|4026->2229|4061->2243|4144->2299|4171->2317|4206->2331|4292->2390|4319->2408|4367->2435|4451->2492|4478->2510|4529->2540|4613->2597|4640->2615|4694->2648|5030->2957|5045->2963|5106->3003|5342->3212|5369->3230|5409->3249|6010->3822|6038->3840|6083->3863|6615->4367|6644->4368|6673->4369|6717->4385|6746->4386|6775->4387|6872->4456|6901->4457|6930->4458|6974->4474|7003->4475|7032->4476|7718->5134|7746->5152|7790->5174|8293->5649|8322->5650|8351->5651|8413->5685|8442->5686|8471->5687|8572->5760|8601->5761|8630->5762|8675->5779|8704->5780|8733->5781|9318->6338|9347->6356|9392->6378|9884->6841|9914->6842|9944->6843|10009->6878|10040->6879|10071->6880|10174->6954|10204->6955|10234->6956|10280->6973|10310->6974|10340->6975|10634->7241|10650->7247|10709->7284
                  LINES: 26->1|29->1|30->2|37->9|37->9|37->9|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|49->21|51->23|51->23|52->24|52->24|52->24|53->25|54->26|54->26|55->27|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|86->58|86->58|86->58|91->63|91->63|91->63|98->70|98->70|98->70|105->77|105->77|105->77|105->77|105->77|105->77|106->78|106->78|106->78|106->78|106->78|106->78|115->87|115->87|115->87|123->95|123->95|123->95|123->95|123->95|123->95|124->96|124->96|124->96|124->96|124->96|124->96|133->105|133->105|133->105|140->112|140->112|140->112|140->112|140->112|140->112|141->113|141->113|141->113|141->113|141->113|141->113|147->119|147->119|147->119
                  -- GENERATED --
              */
          