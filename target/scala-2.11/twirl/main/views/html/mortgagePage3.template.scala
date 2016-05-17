
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
object mortgagePage3 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template9[String,String,String,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(additionalApplicants: String,buildingType: String,propertystyle:String,sqaurefootage:String,propertyheated:String,getwater:String,propertydispose:String,garagetype:String,garageSize:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.192*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="shortcut icon" href=""""),_display_(/*10.34*/routes/*10.40*/.Assets.at("_resources/favicon.ico")),format.raw/*10.76*/("""">
<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
 
<script src=""""),_display_(/*20.15*/routes/*20.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*20.65*/(""""></script>
<script src=""""),_display_(/*21.15*/routes/*21.21*/.Assets.at("javascripts/mortgageJs/mortgagePage3.js")),format.raw/*21.74*/(""""></script>
     
<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*24.31*/routes/*24.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*24.79*/("""">
<script src="""),_display_(/*25.14*/routes/*25.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*25.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*26.47*/routes/*26.53*/.Assets.at("_resources/background.css")),format.raw/*26.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*27.47*/routes/*27.53*/.Assets.at("_resources/forms.css")),format.raw/*27.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*28.47*/routes/*28.53*/.Assets.at("_resources/template.css")),format.raw/*28.90*/("""">
<style type="text/css">
 tr.spaceUnder > td
"""),format.raw/*31.1*/("""{"""),format.raw/*31.2*/("""
  """),format.raw/*32.3*/("""padding-bottom: 1em;
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""
"""),format.raw/*34.1*/("""</style>
</head>
<body>
<br>
<br>
<div style="width:97%">
		<form name="myForm" action="mortgagePage3" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value=""""),_display_(/*41.32*/additionalApplicants),format.raw/*41.52*/("""" name="additionalApplicants">
		<input type="hidden" value=""""),_display_(/*42.32*/buildingType),format.raw/*42.44*/("""" name="buildingType1">
		<input type="hidden" value=""""),_display_(/*43.32*/propertystyle),format.raw/*43.45*/("""" name="propertystyle1">
		<input type="hidden" value=""""),_display_(/*44.32*/propertyheated),format.raw/*44.46*/("""" name="propertyheated1">
		<input type="hidden" value=""""),_display_(/*45.32*/getwater),format.raw/*45.40*/("""" name="getwater1">
		<input type="hidden" value=""""),_display_(/*46.32*/propertydispose),format.raw/*46.47*/("""" name="propertydispose1">
		<input type="hidden" value=""""),_display_(/*47.32*/garagetype),format.raw/*47.42*/("""" name="garagetype1">
		<input type="hidden" value=""""),_display_(/*48.32*/garageSize),format.raw/*48.42*/("""" name="garageSize1">
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*56.11*/routes/*56.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*56.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		
		<div data-ng-app="demoApp"  style="margin-left: 5%;">
		<div ng-controller="DemoController" ng-init="isDisabled = false">
		<table style="border-collapse: separate;">
			<tr>
				<td ><label class="labelfont" >What Type of Building is your Property?<span
									style="color: red; font-size: 3">*</span></label></td>
				<td><label class="labelfont">What is the Style of your Property?<span
									style="color: red; font-size: 3">*</span></label></td>
			</tr>
			<tr class="spaceUnder">
				<td><select class="selectOption form-control" style="width: 95%;" value="" name="buildingType" onchange="changeBackgroundOfSelectedField()" id="propType">
											<option value="">Please Select</option>
						  					<option value="House">House</option>
						  					<option value="Duplex">Duplex</option>
						  					<option value="Appartment Condo">Apartment Condo</option>
						  					<option value="Townhouse">Townhouse</option>
						  					<option value="Rowhouse">Rowhouse</option>
						  					<option value="Mobile Home">Mobile Home </option>
						  					<option value="Modular Home">Modular Home</option>
						  					<option value="Other">Others</option>
						  					<option value="notSure">Not Sure</option>
						  					 
											</select><div id="widget_settings_44" style="position: absolute;"></div></td>
				<td><select style="width: 95%;" class="form-control" value="" name="propertyStyle" onchange="changeBackgroundOfSelectedField()" id="propStyles">
											<option value="">Please Select</option>
						  					<option value="Bunglow">Bungalow</option>
						  					<option value="One Story">One Story</option>
						  					<option value="BiLevel">BiLevel</option>
						  					<option value="Two Story">Two Story</option>
						  					<option value="Split Level">Split Level</option>
						  					<option value="Story and A Half">Story and A Half</option>
						  					<option value="Three Story">Three Story</option>
						  					<option value="Other">Other</option>
						  					<option value="notSure2">Not Sure</option>
											</select><div id="widget_settings_65" style="position: absolute;"></div></td>
			</tr>
			<tr>
			</tr>
			<tr>
				<td><label class="labelfont"> What is the square footage of the property?<span
									style="color: red; font-size: 3">*</span></label></td>
				<td><label class="labelfont">What is the MAIN way your property is heated?<span
									style="color: red; font-size: 3">*</span></label></td>
			</tr>
			<tr class="spaceUnder">
				<td><input type="text" id="squareFtID" class="form-control" placeholder="e.g 2300" style="width: 95%;" name="squareFt" value=""""),_display_(/*105.132*/sqaurefootage),format.raw/*105.145*/(""""
								 data-type="input-number" onkeypress="return isNumber(event)"><div id="input_24" style="position: absolute;" ></div></td>
				<td><select class="form-control" style="width: 95%;" value="" name="propertyHeat" onchange="changeBackgroundOfSelectedField()" id="propHeated" >
											<option value="">Please Select</option>
						  					<option value="Furnace">Furnace</option>
						  					<option value="Electric">Electric</option>
						  					<option value="Hot Water"> Hot Water </option>
						  					<option value="In Floor">In floor</option>
						  					<option value="Other">Other</option>
											</select><div id="widget_settings_58" style="position: absolute;"></div></td>
			</tr>
			<tr>
				<td><label class="labelfont"> Where does your property get water?<span
									style="color: red; font-size: 3">*</span></label></td>
				<td><label class="labelfont">How is wastewater and sewage disposed?<span
									style="color: red; font-size: 3">*</span></label></td>
			</tr>
			<tr class="spaceUnder">
				<td><select class="form-control" style="width: 95%;" value="" name="propertyGetWater" onchange="changeBackgroundOfSelectedField()" id="propGetWater" >
											<option value="">Please Select</option>
						  					<option value="Municipal">Municipal</option>
						  					<option value="Private Well">Private Well</option>
						  					<option value="Shared Well">Shared Well</option>
						  					<option value="Cistern">Cistern</option>
						  					<option value="Other">Other</option>
						  					<option value="Not Sure">Not Sure</option>
											</select><div id="widget_settings_59" style="position: absolute;"></div></td>
				<td><select class="form-control" style="width: 95%;" value="" name="propertyDisposeWater" onchange="changeBackgroundOfSelectedField()" id="propDispWater">
											<option value="">Please Select</option>
						  					<option value="Municipality">Municipality</option>
						  					<option value="Septic System">Septic System</option>
						  					<option value="Holding Tank">Holding Tank</option>
						  					<option value="Other">Others</option>
						  					<option value="Not Sure">Not Sure</option>
											</select><div id="widget_settings_60" style="position: absolute;"></div></td>
			</tr>
			<tr ng-init="type=''">
				<td><label class="labelfont"> What type of garage is with the property?<span
									style="color: red; font-size: 3">*</span></label></td>
				<td><label ng-if="type == 'Attached' || type == 'Detached'" class="labelfont">What size is the garage?<span
									style="color: red; font-size: 3">*</span></label></td>
			</tr>
			<tr>
			<tbody>
				<td><select class="form-control select" style="width: 95%;" value="" name="typeGarage" onchange="changeBackgroundOfSelectedField()" id="typeOfGarage" ng-model="type">
											<option value="">Please Select</option>
						  					<option value="Attached">Attached</option>
						  					<option value="Detached">Detached</option>
						  					<option value="None">None</option>
										    </select><div id="widget_settings_61" style="position: absolute;"></div></td>
										  
				
						    
				<td>
				 <div ng-if="type == 'Attached' || type == 'Detached' ">
					<select class="form-control" style="width: 95%;" value="" name="garageSize" onchange="changeBackgroundOfSelectedField()" id="sizeOfGarage" >
											<option value="garageSizes">Please Select</option>
						  					<option value="Single">Single</option>
						  					<option value="Double">Double</option>
						  					<option value="Triple">Triple</option>
						  					<option value="Quadruple">Quadruple</option>
											</select><div id="widget_settings_64" style="position: absolute;"></div></div></td>
											
										
			</tr>
			</tbody>
		</table>
			</div>
	        		     
	        <br>
	        		<div class="row" style="width: 100%;">
					  <div class="col-sm-6" style="float: left; padding-left:5%; width: 50%;">
					  		<a href="mortgageBackPage2" class="btn btn-primary"
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
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:30%; background-color: #6AA84F;">
						    <label>30% complete</label>
						    </div>
						  </div>
						</div>
					 </div>
					<div class="col-sm-3"></div>
				</div>
			
				<br>
</form>
</div>

</body>
</html>"""))}
  }

  def render(additionalApplicants:String,buildingType:String,propertystyle:String,sqaurefootage:String,propertyheated:String,getwater:String,propertydispose:String,garagetype:String,garageSize:String): play.twirl.api.HtmlFormat.Appendable = apply(additionalApplicants,buildingType,propertystyle,sqaurefootage,propertyheated,getwater,propertydispose,garagetype,garageSize)

  def f:((String,String,String,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (additionalApplicants,buildingType,propertystyle,sqaurefootage,propertyheated,getwater,propertydispose,garagetype,garageSize) => apply(additionalApplicants,buildingType,propertystyle,sqaurefootage,propertyheated,getwater,propertydispose,garagetype,garageSize)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:25 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage3.scala.html
                  HASH: 14d20c195f2597f00f139b4c3ac8011fa8ec42cb
                  MATRIX: 787->1|1066->191|1094->193|1552->624|1567->630|1624->666|2299->1314|2314->1320|2379->1364|2432->1390|2447->1396|2521->1449|2656->1557|2671->1563|2734->1605|2777->1621|2792->1627|2854->1668|2941->1728|2956->1734|3016->1773|3092->1822|3107->1828|3162->1862|3238->1911|3253->1917|3311->1954|3385->2001|3413->2002|3443->2005|3491->2026|3519->2027|3547->2028|3756->2210|3797->2230|3886->2292|3919->2304|4001->2359|4035->2372|4118->2428|4153->2442|4237->2499|4266->2507|4344->2558|4380->2573|4465->2631|4496->2641|4576->2694|4607->2704|4936->3006|4951->3012|5012->3052|7739->5750|7775->5763
                  LINES: 26->1|29->1|31->3|38->10|38->10|38->10|48->20|48->20|48->20|49->21|49->21|49->21|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|59->31|59->31|60->32|61->33|61->33|62->34|69->41|69->41|70->42|70->42|71->43|71->43|72->44|72->44|73->45|73->45|74->46|74->46|75->47|75->47|76->48|76->48|84->56|84->56|84->56|133->105|133->105
                  -- GENERATED --
              */
          