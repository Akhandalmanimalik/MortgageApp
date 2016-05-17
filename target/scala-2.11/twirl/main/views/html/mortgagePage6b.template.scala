
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
object mortgagePage6b extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[PersonalInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(personalInfo: PersonalInfo):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.30*/("""
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
<script	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script src=""""),_display_(/*16.15*/routes/*16.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*16.65*/(""""></script>
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.at("javascripts/mortgageJs/mortgagePage6b.js")),format.raw/*17.75*/(""""></script>

<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*20.31*/routes/*20.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*20.79*/("""">
<script src="""),_display_(/*21.14*/routes/*21.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*21.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*22.47*/routes/*22.53*/.Assets.at("_resources/background.css")),format.raw/*22.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*23.47*/routes/*23.53*/.Assets.at("_resources/forms.css")),format.raw/*23.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*24.47*/routes/*24.53*/.Assets.at("_resources/template.css")),format.raw/*24.90*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*25.47*/routes/*25.53*/.Assets.at("stylesheets/mortgageCSS/mortgagePage6.css")),format.raw/*25.108*/("""">
</head>
<body>
<br>
<br>
<div style="width: 97%;">
			
		<form name="myForm" action="mortgagePage6b" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value="uniid" name="uniid">		
		<input type="hidden" value=""""),_display_(/*34.32*/personalInfo/*34.44*/.getCoDependents),format.raw/*34.60*/("""" name="coDependents">
		<input type="hidden" value=""""),_display_(/*35.32*/personalInfo/*35.44*/.getCoAreUCanadianRes),format.raw/*35.65*/("""" name="coAreUCanadianRes">
		
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width  position: inherit; overflow:auto ;="210"
				src=""""),_display_(/*44.11*/routes/*44.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*44.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<div ng-controller="DemoController" ng-init="isDisabled = false">
		<div class="container-fluid" style="padding-left: 0%;">
							<div class="row">
							<div class="col-sm-6" align="center"><label class="labelfont">"""),_display_(/*51.71*/personalInfo/*51.83*/.getCoApplicantName),format.raw/*51.102*/("""</label></div>
							</div>
							<br>
							
							  <br>
							  <div class="row">
							  
							  <div class="col-sm-4"><label class="labelfont">Work Phone:</div>
							  <div class="col-sm-3"><input type="text" name="coApplWorkPhone" id="phonedatata5" placeholder="111-222-3333" class="form-control" value=""""),_display_(/*59.148*/personalInfo/*59.160*/.getCoWorkPhone),format.raw/*59.175*/("""">
      											<div id="input_4101" style="position: absolute;"></div>
      						 </div>
							  </div>
							  <br>
							  
							  <br>
							  <div class="row">
							  
							  <div class="col-sm-4"><label class="labelfont">Birthday:</div>
							  <div class="col-sm-3"><input type="text" name="coApplBirthday" id="datepicker" placeholder="mm/dd/yyyy" class="form-control" value=""""),_display_(/*69.143*/personalInfo/*69.155*/.getCoBirthDay),format.raw/*69.169*/("""" readonly="readonly">
      											<div id="input_4103" style="position: absolute;"></div>
							 </div>
							  </div>
							  <br>
							  <div class="row">
							  <div class="col-sm-4"><label class="labelfont">Social Insurance#:</div>
							  <div class="col-sm-3"><input type="text" name="coApplInsurNum" id="phonedatata8" placeholder="777-888-999" class="form-control" value=""""),_display_(/*76.146*/personalInfo/*76.158*/.getCoSocialInsurance),format.raw/*76.179*/("""">
      											<div id="input_4104" style="position: absolute;"></div>
							  </div>
							  </div>
							  <br>
							  
							  <br>
							  <div class="row">
							  <div class="col-sm-4"><label class="labelfont">Dependants:</div>
							  <div class="col-sm-3"><select value="" name="coAppDependants" class="form-control" id="coAppDependantsID" onchange="changeBackgroundOfSelectedField()">
												<option value="0"> 0 </option>
							  					<option value="1"> 1 </option>
							  					<option value="2"> 2 </option>
							  					<option value="3"> 3 </option>
							  					<option value="4"> 4 </option>
							  					<option value="5"> 5 </option>
							  					<option value="6"> 6 </option>
							  					<option value="7"> 7 </option>
							  					<option value="8"> 8 </option>
							  					<option value="9"> 9 </option>
							  					<option value="10"> 10 </option>
											</select>
											<div id="input_4106" style="position: absolute;"></div>
							  </div>
							  </div>  
							  <br>
							  
							  <!-- <label class="labelfont">Are you a Canadian Resident?<span style="color: red; font-size: 3">*</span></label>
							  
							  <div class="btn-group" style="width: 100%; padding-left: 0%;">
										<label style="width: 20%;" class="btn btn-primary labelfont"
												btn-radio="'yes'" ng-change="change()" ng-model="coApplicants">
												Yes </label> <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary labelfont"
												btn-radio="'no'" ng-change="change()" ng-model="coApplicants">
												No </label> <br> <br>
												<div id="input_4107" style="position: absolute;"></div>
							 </div>
										<input type="hidden" name="coApplicantss"
											value=""""),format.raw/*114.19*/("""{"""),format.raw/*114.20*/("""{"""),format.raw/*114.21*/("""coApplicants"""),format.raw/*114.33*/("""}"""),format.raw/*114.34*/("""}"""),format.raw/*114.35*/("""" ng-required>
							  	<br><br> -->
											
					</div>
					
					 <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
						  <!-- <script src="//code.jquery.com/jquery-1.10.2.js"></script> -->
						  <script type="text/javascript" src="jquery-ui.js" ></script>
						  <script src=""""),_display_(/*122.23*/routes/*122.29*/.Assets.at("_resources/jquery-ui.js")),format.raw/*122.66*/("""" type="text/javascript"></script>
						  <link rel="stylesheet" href="/resources/demos/style.css">
						<!-- <input type="text" id="datepicker"> -->
					</div>
	        <br><br>
	        		<div class="row" style="width: 100%;">
					  <div class="col-sm-6" style="float: left; padding-left:2%; width: 50%;">
					  		<a href="mortgageBackPage6a" class="btn btn-primary" role="button" style=" width: 50%;">Back</a>
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
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:55%; background-color: #6AA84F;">
						    <label>55% complete</label>
						    </div>
						  </div>
						</div>
					 </div>
				</div>
				
				<br>
				<br>
				
</form>
</div>

<script src=""""),_display_(/*155.15*/routes/*155.21*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*155.71*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(personalInfo:PersonalInfo): play.twirl.api.HtmlFormat.Appendable = apply(personalInfo)

  def f:((PersonalInfo) => play.twirl.api.HtmlFormat.Appendable) = (personalInfo) => apply(personalInfo)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:28 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage6b.scala.html
                  HASH: 2364fcd791d72bc2386246656a3b0f45642f3beb
                  MATRIX: 738->1|854->29|881->30|1339->462|1353->468|1409->504|1944->1012|1959->1018|2024->1062|2077->1088|2092->1094|2167->1148|2297->1251|2312->1257|2375->1299|2418->1315|2433->1321|2495->1362|2582->1422|2597->1428|2657->1467|2733->1516|2748->1522|2803->1556|2879->1605|2894->1611|2952->1648|3028->1697|3043->1703|3120->1758|3383->1994|3404->2006|3441->2022|3522->2076|3543->2088|3585->2109|3959->2456|3974->2462|4035->2502|4392->2832|4413->2844|4454->2863|4803->3184|4825->3196|4862->3211|5291->3612|5313->3624|5349->3638|5771->4032|5793->4044|5836->4065|7646->5846|7676->5847|7706->5848|7747->5860|7777->5861|7807->5862|8167->6194|8183->6200|8242->6237|9432->7399|9448->7405|9520->7455
                  LINES: 26->1|29->1|30->2|37->9|37->9|37->9|44->16|44->16|44->16|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|62->34|62->34|62->34|63->35|63->35|63->35|72->44|72->44|72->44|79->51|79->51|79->51|87->59|87->59|87->59|97->69|97->69|97->69|104->76|104->76|104->76|142->114|142->114|142->114|142->114|142->114|142->114|150->122|150->122|150->122|183->155|183->155|183->155
                  -- GENERATED --
              */
          