
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
object mortgagePage6a extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[PersonalInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(personalInfo:PersonalInfo):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/("""
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
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.at("javascripts/mortgageJs/mortgagePage6a.js")),format.raw/*17.75*/(""""></script>
  
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
			
		<form name="myForm" action="mortgagePage6a" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value="uniid" name="uniid">
		<input type="hidden" value=""""),_display_(/*34.32*/personalInfo/*34.44*/.getDependents),format.raw/*34.58*/("""" name="dependantss">
		<input type="hidden" value=""""),_display_(/*35.32*/personalInfo/*35.44*/.getAreUCanadianRes),format.raw/*35.63*/("""" name="areYouCanadian">
		
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*44.11*/routes/*44.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*44.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<div ng-controller="DemoController" ng-init="isDisabled = false">

							<div class="row">
							<div class="col-sm-12" align="center"><label class="labelfont">"""),_display_(/*51.72*/personalInfo/*51.84*/.getApplicantName),format.raw/*51.101*/("""</label></div>
							</div>
							<br>
							
							  <div class="row">
							  <div class="col-sm-4"><label class="labelfont">Work Phone:</label></div>
							  <div class="col-sm-3"><input type="text" id="phonedatata2" name="applWorkPhone" placeholder="111-222-3333" class="form-control" value=""""),_display_(/*57.146*/personalInfo/*57.158*/.getWorkPhone),format.raw/*57.171*/("""">
      											<div id="input_4002" style="position: absolute;"></div>
							 </div>
							  </div>
							  <br>
							  <div class="row">
							  <div class="col-sm-4"><label class="labelfont">Birthday:</label></div>
							  <div class="col-sm-3"><input type="text" name="applBirthday" id="datepicker" placeholder="mm/dd/yyyy" class="form-control" value=""""),_display_(/*64.141*/personalInfo/*64.153*/.getBirthDay),format.raw/*64.165*/("""" readonly="readonly">
      											<div id="input_4004" style="position: absolute;"></div>
      						 </div>
							  </div>
							  <br>
							  <div class="row">
							  <div class="col-sm-4"><label class="labelfont">Social Insurance#:</label></div>
							  <div class="col-sm-3"><input tcoApplHomePhoneype="text" name="applInsurNum" id="phonedatata7" placeholder="777-888-999" class="form-control" value=""""),_display_(/*71.159*/personalInfo/*71.171*/.getSocialInsurance),format.raw/*71.190*/("""">
      											<div id="input_4005" style="position: absolute;"></div>
							  </div>
							  
							  </div>
							  <br>
							  <div class="row">
							  <div class="col-sm-4"><label class="labelfont">Dependants:</label></div>
							  <div class="col-sm-3"><select value="" id="applDependantsID" name="applDependants" class="form-control" onchange="changeBackgroundOfSelectedField()">
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
											<div id="input_4007" style="margin-left:-25px;"></div>
							 </div>
							  </div>
							   <br>
							  <!--<label class="labelfont">Are you a Canadian Resident?<span style="color: red; font-size: 3">*</span></label><br>
							  <div class="btn-group" style="width: 100%; padding-left: 0%;">
										<label style="width: 20%;" class="btn btn-primary labelfont"
												btn-radio="'yes'" ng-change="change()" ng-model="additionalApplicant">
												Yes </label> <label style="width: 20%; border-radius: 0px 5px 5px 0px; " class="btn btn-primary labelfont"
												btn-radio="'no'" ng-change="change()" ng-model="additionalApplicant">
												No </label> <br> <br>
												<div id="input_4008" style="position: absolute;"></div>
												<input type="hidden" name="areYouCanadianRess"
											value=""""),format.raw/*105.19*/("""{"""),format.raw/*105.20*/("""{"""),format.raw/*105.21*/("""additionalApplicant"""),format.raw/*105.40*/("""}"""),format.raw/*105.41*/("""}"""),format.raw/*105.42*/("""" ng-required>
							</div>
							  <br><br> -->
							 <!--  <div><label class="labelfont"> Have you moved to Canada within 7 Years?<span style="color: red; font-size: 3">*</span></label></div>
							  <div class="btn-group" style="width: 100%; padding-left: 0%;">
										<label style="width: 20%;" class="btn btn-primary labelfont"
												btn-radio="'yes'" ng-change="change()" ng-model="movedCanada">
												Yes </label> <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary labelfont"
												btn-radio="'no'" ng-change="change()" ng-model="movedCanada">
												No </label> <br> <br>
												<div id="input_4009" style="position: absolute;"></div>
										</div>
										<input type="hidden" name="movedCanadas"
											value=""""),format.raw/*118.19*/("""{"""),format.raw/*118.20*/("""{"""),format.raw/*118.21*/("""movedCanada"""),format.raw/*118.32*/("""}"""),format.raw/*118.33*/("""}"""),format.raw/*118.34*/("""" ng-required> -->
							  
					<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
						  <!-- <script src="//code.jquery.com/jquery-1.10.2.js"></script> -->
						  <script type="text/javascript" src="jquery-ui.js" ></script>
						  <script src=""""),_display_(/*123.23*/routes/*123.29*/.Assets.at("_resources/jquery-ui.js")),format.raw/*123.66*/("""" type="text/javascript"></script>
						  <link rel="stylesheet" href="/resources/demos/style.css">
					
					</div>
	        <br>
	        		<div class="row" style="width: 100%;">
					  <div class="col-sm-6" style="float: left; padding-left:2%; width: 50%;">
					  		<a href="mortgageBackPage5b" class="btn btn-primary"
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
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:50%; background-color: #6AA84F;">
						    <label>50% complete</label>
						    </div>
						  </div>
						</div>
					 </div>
				</div>
				
				<br>
				<br>
				
</form>
</div>
  
<script src=""""),_display_(/*157.15*/routes/*157.21*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*157.71*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(personalInfo:PersonalInfo): play.twirl.api.HtmlFormat.Appendable = apply(personalInfo)

  def f:((PersonalInfo) => play.twirl.api.HtmlFormat.Appendable) = (personalInfo) => apply(personalInfo)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:25 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage6a.scala.html
                  HASH: 42bfdbd7c20aea265727b834df52e29dfe0080b5
                  MATRIX: 738->1|853->28|880->29|1338->461|1352->467|1408->503|1943->1011|1958->1017|2023->1061|2076->1087|2091->1093|2166->1147|2298->1252|2313->1258|2376->1300|2419->1316|2434->1322|2496->1363|2583->1423|2598->1429|2658->1468|2734->1517|2749->1523|2804->1557|2880->1606|2895->1612|2953->1649|3029->1698|3044->1704|3121->1759|3382->1993|3403->2005|3438->2019|3518->2072|3539->2084|3579->2103|3914->2411|3929->2417|3990->2457|4291->2731|4312->2743|4351->2760|4682->3063|4704->3075|4739->3088|5135->3456|5157->3468|5191->3480|5639->3900|5661->3912|5702->3931|7491->5691|7521->5692|7551->5693|7599->5712|7629->5713|7659->5714|8484->6510|8514->6511|8544->6512|8584->6523|8614->6524|8644->6525|8964->6817|8980->6823|9039->6860|10191->7984|10207->7990|10279->8040
                  LINES: 26->1|29->1|30->2|37->9|37->9|37->9|44->16|44->16|44->16|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|62->34|62->34|62->34|63->35|63->35|63->35|72->44|72->44|72->44|79->51|79->51|79->51|85->57|85->57|85->57|92->64|92->64|92->64|99->71|99->71|99->71|133->105|133->105|133->105|133->105|133->105|133->105|146->118|146->118|146->118|146->118|146->118|146->118|151->123|151->123|151->123|185->157|185->157|185->157
                  -- GENERATED --
              */
          