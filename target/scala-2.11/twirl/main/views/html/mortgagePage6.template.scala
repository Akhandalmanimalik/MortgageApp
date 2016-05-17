
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
object mortgagePage6 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template21[String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(additionalApplicants: String,applicantName:String,coApplicantName:String,applicantMobile:String,applicantWorkPhone:String,ApplicantHomePhone:String,applicantBirthday:String,applicantInsurance:String,applicantRelationshipStatus:String,applicantDependant:String,applicantNonResident:String,applicantMovedCanada:String,coApplicantMobile:String,coApplicantWorkPhone:String,coApplicantHomePhone:String,coApplicantBirthday:String,coApplicantInsurance:String,coApplicantRelationshipStatus:String,coApplicantDependant:String,coApplicantNonResident:String,coApplicantMovedCanada:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.580*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
 
<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
  
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="shortcut icon" href=""""),_display_(/*14.34*/routes/*14.40*/.Assets.at("_resources/favicon.ico")),format.raw/*14.76*/("""">
 
<script	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*18.65*/(""""></script>
<script src=""""),_display_(/*19.15*/routes/*19.21*/.Assets.at("javascripts/mortgageJs/mortgagePage6.js")),format.raw/*19.74*/(""""></script>

<link type="text/css" rel="stylesheet" href=""""),_display_(/*21.47*/routes/*21.53*/.Assets.at("_resources/background.css")),format.raw/*21.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*22.47*/routes/*22.53*/.Assets.at("_resources/forms.css")),format.raw/*22.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*23.47*/routes/*23.53*/.Assets.at("_resources/template.css")),format.raw/*23.90*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*24.47*/routes/*24.53*/.Assets.at("stylesheets/mortgageCSS/mortgagePage6.css")),format.raw/*24.108*/("""">
</head>
<body>
<br>
<br>
<div style="width: 97%;">
			
		<form name="myForm" action="mortgagePage6" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value=""""),_display_(/*32.32*/additionalApplicants),format.raw/*32.52*/("""" name="additionalApplicants" >
		<input type="hidden" value=""""),_display_(/*33.32*/applicantDependant),format.raw/*33.50*/("""" name="applicantDependant11" >
		
			<!-- <input type="text" value=""""),_display_(/*35.36*/applicantInsurance),format.raw/*35.54*/("""" name="dddd" >
			<input type="text" value=""""),_display_(/*36.31*/coApplicantInsurance),format.raw/*36.51*/("""" name="dddds" > -->
		
		<input type="hidden" value=""""),_display_(/*38.32*/coApplicantDependant),format.raw/*38.52*/("""" name="coApplicantDependant11" >
		
		<input type="hidden" value=""""),_display_(/*40.32*/applicantNonResident),format.raw/*40.52*/("""" name="applicantNonResident33" >
		<input type="hidden" value=""""),_display_(/*41.32*/applicantMovedCanada),format.raw/*41.52*/("""" name="applicantMovedCanada33" >
		
		<input type="hidden" value=""""),_display_(/*43.32*/coApplicantNonResident),format.raw/*43.54*/("""" name="coApplicantNonResident33" >
		<input type="hidden" value=""""),_display_(/*44.32*/coApplicantMovedCanada),format.raw/*44.54*/("""" name="coApplicantMovedCanada33" >
		
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*53.11*/routes/*53.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*53.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<div ng-controller="DemoController" ng-init="isDisabled = false">
		<input type="hidden" ng-model="data" name="additionalAppl">
							<div class="container-fluid" style="padding-left: 0%;">
							<div class="row">
							<div class="col-sm-6" align="center"><label class="labelfont">"""),_display_(/*61.71*/applicantName),format.raw/*61.84*/("""</label></div>
							<div ng-if="data == 'yes'">
							<div class="col-sm-6" align="center"><label class="labelfont">"""),_display_(/*63.71*/coApplicantName),format.raw/*63.86*/("""</label></div>
							</div>
							</div>
							<br>
							  <div class="row">
							  <div class="col-sm-3"><label class="labelfont">Work Phone:</label></div>
							  <div class="col-sm-3"><input type="text" id="phonedatata2" name="applWorkPhone" placeholder="111-222-3333" class="form-control" value=""""),_display_(/*69.146*/applicantWorkPhone),format.raw/*69.164*/("""">
      											<div id="input_4002" style="position: absolute;"></div>
							 </div>
							 <div ng-if="data == 'yes'">
							  <div class="col-sm-3"><label class="labelfont">Work Phone:</label></div>
							  <div class="col-sm-3"><input type="text" name="coApplWorkPhone" id="phonedatata5" placeholder="111-222-3333" class="form-control" value=""""),_display_(/*74.148*/coApplicantWorkPhone),format.raw/*74.168*/("""">
      											<div id="input_4101" style="position: absolute;"></div>
      						 </div>
							  </div>
							  </div>
							  	<br>
							 
							  <div class="row">
							  <div class="col-sm-3"><label class="labelfont">Birthday:</label></div>
							  <div class="col-sm-3"><input type="text" id="datepicker" name="applBirthday" placeholder="mm/dd/yyyy" class="form-control" value=""""),_display_(/*83.141*/applicantBirthday),format.raw/*83.158*/("""" readonly="readonly">
      											<div id="input_4004" style="position: absolute;"></div>
      						 </div>
      						 <div ng-if="data == 'yes'">
							  <div class="col-sm-3"><label class="labelfont">Birthday:</div>
							  <div class="col-sm-3"><input type="text" name="coApplBirthday" id="datepicker1" placeholder="mm/dd/yyyy" class="form-control" value=""""),_display_(/*88.144*/coApplicantBirthday),format.raw/*88.163*/("""" readonly="readonly">
      											<div id="input_4103" style="position: absolute;"></div>
							 </div>
							  </div>
							  </div>
							  	<br>
																								  
							  <div class="row">
							  <div class="col-sm-3"><label class="labelfont">Social Insurance#:</label></div>
							  <div class="col-sm-3"><input type="text" name="applInsurNum" id="phonedatata7" placeholder="777-888-999" class="form-control" value=""""),_display_(/*97.144*/applicantInsurance),format.raw/*97.162*/("""">
      											
							  </div>
							  <div ng-if="data == 'yes'">
							  <div class="col-sm-3"><label class="labelfont">Social Insurance#:</div>
							  <div class="col-sm-3"><input type="text" name="coApplInsurNum" id="phonedatata8" placeholder="777-888-999" class="form-control" value=""""),_display_(/*102.146*/coApplicantInsurance),format.raw/*102.166*/("""">
      											<!-- <div id="input_4104" style="position: absolute;"></div> -->
							  </div>
							  </div>
							  </div>
							  <div id="input_4005" style="position:relative;"></div>
							  	<br>
							  
							  <div class="row">
							  <div class="col-sm-3"><label class="labelfont">Dependants:</label></div>
							  <div class="col-sm-3"><select value="" name="applDependants" id="dependentId" class="form-control" onchange="changeBackgroundOfSelectedField()">
							  					<option value=""> Please Select </option>
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
							 <div ng-if="data == 'yes'">
							  <div class="col-sm-3"><label class="labelfont">Dependants:</div>
							  <div class="col-sm-3"><select value="" name="coAppDependants" id="coDependentId"class="form-control" onchange="changeBackgroundOfSelectedField()">
							  					<option value=""> Please Select </option>
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
							  </div>
							  	<br>
							 <!-- <div class="row">
							  <div class="col-sm-6"><label class="labelfont">Are you a Canadian Resident?<span style="color: red; font-size: 3">*</span></label></div>
							  <div ng-if="data == 'yes'">
							  <div class="col-sm-6"><label class="labelfont">Are you a Canadian Resident?<span style="color: red; font-size: 3">*</span></label></div>
							  </div>
							  </div>
							   <div class="row">
							  <div class="col-sm-6"><div class="col-xs-6 col-sm-5 btn-group" style="width: 100%; padding-left: 0%;">
										<label style="width: 50%;" class="btn btn-primary labelfont"
												btn-radio="'yes'" ng-change="change()" ng-model="areYouCanadianRes">
												Yes </label> <label style="width: 50%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary labelfont"
												btn-radio="'no'" ng-change="change()" ng-model="areYouCanadianRes">
												No </label> <br> <br>
												<div id="input_4008" style="position: absolute;"></div>
												<input type="hidden" name="areYouCanadianRess"
											value=""""),format.raw/*164.19*/("""{"""),format.raw/*164.20*/("""{"""),format.raw/*164.21*/("""areYouCanadianRes"""),format.raw/*164.38*/("""}"""),format.raw/*164.39*/("""}"""),format.raw/*164.40*/("""" ng-required>
										</div>
							  </div>
							  <div ng-if="data == 'yes'">
							  <div class="col-sm-6"><div class="col-xs-6 col-sm-5 btn-group" style="width: 100%; padding-left: 0%;">
										<label style="width: 50%;" class="btn btn-primary labelfont"
												btn-radio="'yes'" ng-change="change()" ng-model="coApplicants">
												Yes </label> <label style="width: 50%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary labelfont"
												btn-radio="'no'" ng-change="change()" ng-model="coApplicants">
												No </label> <br> <br>
												<div id="input_4107" style="position: absolute;"></div>
										</div>
										<input type="hidden" name="coApplicantss"
											value=""""),format.raw/*177.19*/("""{"""),format.raw/*177.20*/("""{"""),format.raw/*177.21*/("""coApplicants"""),format.raw/*177.33*/("""}"""),format.raw/*177.34*/("""}"""),format.raw/*177.35*/("""" ng-required> 
							  </div>
							  </div>
							  </div> 
							  	<br>
							  <div class="row">
							  <div class="col-sm-6"><label class="labelfont"> Have you moved to Canada within 7 Years?<span style="color: red; font-size: 3">*</span></label></div>
							  <div ng-if="data == 'yes'">
							  <div class="col-sm-6"><label class="labelfont"> Have you moved to Canada within 7 Years?<span style="color: red; font-size: 3">*</span></label></div>
							  </div>
							  </div>
							  <div class="row">
							  <div class="col-sm-6"><div class="col-xs-6 col-sm-5 btn-group" style="width: 100%; padding-left: 0%;">
										<label style="width: 50%;" class="btn btn-primary labelfont"
												btn-radio="'yes'" ng-change="change()" ng-model="movedCanada">
												Yes </label> <label style="width: 50%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary labelfont"
												btn-radio="'no'" ng-change="change()" ng-model="movedCanada">
												No </label> <br> <br>
												<div id="input_4009" style="position: absolute;"></div>
										</div>
										<input type="hidden" name="movedCanadas"
											value=""""),format.raw/*198.19*/("""{"""),format.raw/*198.20*/("""{"""),format.raw/*198.21*/("""movedCanada"""),format.raw/*198.32*/("""}"""),format.raw/*198.33*/("""}"""),format.raw/*198.34*/("""" ng-required>
							  </div>
							  <div ng-if="data == 'yes'">
							  <div class="col-sm-6"><div class="col-xs-6 col-sm-5 btn-group" style="width: 100%; padding-left: 0%;">
										<label style="width: 50%;" class="btn btn-primary labelfont"
												btn-radio="'yes'" ng-change="change()" ng-model="coAppMovedCanada">
												Yes </label> <label style="width: 50%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary labelfont"
												btn-radio="'no'" ng-change="change()" ng-model="coAppMovedCanada">
												No </label> <br> <br>
												<div id="input_4108" style="position: absolute;"></div>
										</div>
										<input type="hidden" name="coAppMovedCanadae"
											value=""""),format.raw/*210.19*/("""{"""),format.raw/*210.20*/("""{"""),format.raw/*210.21*/("""coAppMovedCanada"""),format.raw/*210.37*/("""}"""),format.raw/*210.38*/("""}"""),format.raw/*210.39*/("""" ng-required>
							  </div>
							  </div>
							  </div>-->
						</div>
						  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
						  <!-- <script src="//code.jquery.com/jquery-1.10.2.js"></script> -->
						  <script type="text/javascript" src="jquery-ui.js" ></script>
						  <script src=""""),_display_(/*218.23*/routes/*218.29*/.Assets.at("_resources/jquery-ui.js")),format.raw/*218.66*/("""" type="text/javascript"></script>
						  <link rel="stylesheet" href="/resources/demos/style.css">
						<!-- <input type="text" id="datepicker"> -->
					</div>
	        <br>
	        		<div class="row" style="width: 100%;">
					  <div class="col-sm-6" style="float: left; padding-left:2%; width: 50%;">
					  		<a href="mortgageBackPage5b" class="btn btn-primary" role="button" style=" width: 50%;">Back</a>
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

<script src=""""),_display_(/*251.15*/routes/*251.21*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*251.71*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(additionalApplicants:String,applicantName:String,coApplicantName:String,applicantMobile:String,applicantWorkPhone:String,ApplicantHomePhone:String,applicantBirthday:String,applicantInsurance:String,applicantRelationshipStatus:String,applicantDependant:String,applicantNonResident:String,applicantMovedCanada:String,coApplicantMobile:String,coApplicantWorkPhone:String,coApplicantHomePhone:String,coApplicantBirthday:String,coApplicantInsurance:String,coApplicantRelationshipStatus:String,coApplicantDependant:String,coApplicantNonResident:String,coApplicantMovedCanada:String): play.twirl.api.HtmlFormat.Appendable = apply(additionalApplicants,applicantName,coApplicantName,applicantMobile,applicantWorkPhone,ApplicantHomePhone,applicantBirthday,applicantInsurance,applicantRelationshipStatus,applicantDependant,applicantNonResident,applicantMovedCanada,coApplicantMobile,coApplicantWorkPhone,coApplicantHomePhone,coApplicantBirthday,coApplicantInsurance,coApplicantRelationshipStatus,coApplicantDependant,coApplicantNonResident,coApplicantMovedCanada)

  def f:((String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (additionalApplicants,applicantName,coApplicantName,applicantMobile,applicantWorkPhone,ApplicantHomePhone,applicantBirthday,applicantInsurance,applicantRelationshipStatus,applicantDependant,applicantNonResident,applicantMovedCanada,coApplicantMobile,coApplicantWorkPhone,coApplicantHomePhone,coApplicantBirthday,coApplicantInsurance,coApplicantRelationshipStatus,coApplicantDependant,coApplicantNonResident,coApplicantMovedCanada) => apply(additionalApplicants,applicantName,coApplicantName,applicantMobile,applicantWorkPhone,ApplicantHomePhone,applicantBirthday,applicantInsurance,applicantRelationshipStatus,applicantDependant,applicantNonResident,applicantMovedCanada,coApplicantMobile,coApplicantWorkPhone,coApplicantHomePhone,coApplicantBirthday,coApplicantInsurance,coApplicantRelationshipStatus,coApplicantDependant,coApplicantNonResident,coApplicantMovedCanada)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:16 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage6.scala.html
                  HASH: 3faf42ac2678274a79090c07fdb8c9113cd77f0c
                  MATRIX: 872->1|1539->579|1566->580|2312->1299|2327->1305|2384->1341|2638->1568|2653->1574|2718->1618|2771->1644|2786->1650|2860->1703|2946->1762|2961->1768|3021->1807|3097->1856|3112->1862|3167->1896|3243->1945|3258->1951|3316->1988|3392->2037|3407->2043|3484->2098|3693->2280|3734->2300|3824->2363|3863->2381|3960->2451|3999->2469|4072->2515|4113->2535|4195->2590|4236->2610|4331->2678|4372->2698|4464->2763|4505->2783|4600->2851|4643->2873|4737->2940|4780->2962|5126->3281|5141->3287|5202->3327|5626->3724|5660->3737|5807->3857|5843->3872|6180->4181|6220->4199|6604->4555|6646->4575|7073->4974|7112->4991|7512->5363|7553->5382|8025->5826|8065->5844|8394->6144|8437->6164|11633->9331|11663->9332|11693->9333|11739->9350|11769->9351|11799->9352|12554->10078|12584->10079|12614->10080|12655->10092|12685->10093|12715->10094|13903->11253|13933->11254|13963->11255|14003->11266|14033->11267|14063->11268|14813->11989|14843->11990|14873->11991|14918->12007|14948->12008|14978->12009|15351->12354|15367->12360|15426->12397|16612->13555|16628->13561|16700->13611
                  LINES: 26->1|29->1|30->2|42->14|42->14|42->14|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|60->32|60->32|61->33|61->33|63->35|63->35|64->36|64->36|66->38|66->38|68->40|68->40|69->41|69->41|71->43|71->43|72->44|72->44|81->53|81->53|81->53|89->61|89->61|91->63|91->63|97->69|97->69|102->74|102->74|111->83|111->83|116->88|116->88|125->97|125->97|130->102|130->102|192->164|192->164|192->164|192->164|192->164|192->164|205->177|205->177|205->177|205->177|205->177|205->177|226->198|226->198|226->198|226->198|226->198|226->198|238->210|238->210|238->210|238->210|238->210|238->210|246->218|246->218|246->218|279->251|279->251|279->251
                  -- GENERATED --
              */
          