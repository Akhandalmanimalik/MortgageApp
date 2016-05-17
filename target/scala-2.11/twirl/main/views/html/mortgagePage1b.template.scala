
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
object mortgagePage1b extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Opportunity,Applicant,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(opportunity:Opportunity,appBasicDetails:Applicant):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.53*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="shortcut icon" href=""""),_display_(/*11.34*/routes/*11.40*/.Assets.at("_resources/favicon.ico")),format.raw/*11.76*/("""">

  
<script	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src=""""),_display_(/*16.15*/routes/*16.21*/.Assets.at("javascripts/mortgageJs/mortgagePage1b.js")),format.raw/*16.75*/(""""></script>
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*17.65*/(""""></script>


<link type="text/css" rel="stylesheet" href=""""),_display_(/*20.47*/routes/*20.53*/.Assets.at("_resources/template.css")),format.raw/*20.90*/(""""> 
<link type="text/css" rel="stylesheet" href=""""),_display_(/*21.47*/routes/*21.53*/.Assets.at("stylesheets/mortgageCSS/mortgagePage1b.css")),format.raw/*21.109*/("""">   
</head>
<body>
<br>
<br>
<div style="width: 95%">

		<form name="myForm" action="mortgagePage1b" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value=""""),_display_(/*29.32*/opportunity/*29.43*/.getWhat_is_your_lending_goal),format.raw/*29.72*/("""" name="term">
		<input type="hidden" value=""""),_display_(/*30.32*/opportunity/*30.43*/.getIsAdditionalApplicantExist),format.raw/*30.73*/("""" name="additionalApplicant">
		<input type="hidden" value=""""),_display_(/*31.32*/appBasicDetails/*31.47*/.getId),format.raw/*31.53*/("""" name="applicantId">
		
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*40.11*/routes/*40.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*40.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<div ng-controller="DemoController" ng-init="isDisabled = false">
						
						<div class="row">
						<div class="col-sm-6" align="center"><label>Co-Applicant Infromation</label></div>
						
						</div><br>
						
							<div class="row">
					  		<div class="col-sm-6"><label class="labelfont" style="font-stretch: expanded;">First Name<span style="color: red; font-size: 3">*</span></label><br>
					  			<input type="text" id="ad_FirstName" name="adFirstName" placeholder="First Name" class="form-control" value=""""),_display_(/*53.121*/appBasicDetails/*53.136*/.getApplicant_name),format.raw/*53.154*/("""">
									     	<div id="input_1105"  style="position: absolute;"></div>
					  		</div>
					  		<div class="col-sm-6" style="padding-left: 0%;"><label class="labelfont" style="font-stretch: expanded;">Last Name<span style="color: red; font-size: 3">*</span></label>
					  			<input type="text" id="ad_LastName" name="adLastName" placeholder="Last Name" class="form-control" value=""""),_display_(/*57.118*/appBasicDetails/*57.133*/.getApplicant_last_name),format.raw/*57.156*/("""">
      										<div id="input_1106"  style="position: absolute;"></div>
					  		</div>
					  	</div>
					  	<br>	
					 	 <div class="row">
					  		<div class="col-sm-6"><label class="labelfont" style="font-stretch: expanded;">Email Address<span style="color: red; font-size: 3">*</span></label><br>
					  			<input type="text" id="ad_Email" name="adEmail" placeholder="Email" class="form-control" value=""""),_display_(/*64.108*/appBasicDetails/*64.123*/.getEmail_personal),format.raw/*64.141*/("""">
      												<div id="input_1107"></div>
					  		</div>
					  		<div class="col-sm-6" style="padding-left: 0%;"><label class="labelfont" style="font-stretch: expanded;">Confirm-email<span style="color: red; font-size: 3">*</span></label><br>
					  			<input type="text" id="ad_ConfirmEmail" name="adConfirmEmail" placeholder="Email" class="form-control" value=""""),_display_(/*68.122*/appBasicDetails/*68.137*/.getEmail_personal),format.raw/*68.155*/("""">
      											<div id="input_1108"  style="position: absolute;"></div>
					  		</div>
					 	 </div>
						<br> 
						<div class="row">
					  	<div class="col-md-6"><label class="labelfont">Mobile Number:<span style="color: red; font-size: 3">*</span></label><br></div>
					  	<div class="col-md-6" style="padding-left: 0%;" >
					  	<input type="text" name="coApplMobPhone" id="phonedatata7" value=""""),_display_(/*76.76*/appBasicDetails/*76.91*/.getCell),format.raw/*76.99*/("""" placeholder="eg.333-444-5555" class="form-control">
					  	<div id="input_11088" style="position: absolute;"></div> 
					  	</div>
					  	</div>
					  	<br>
						<div class="row">
					  	<div class="col-md-6"><label class="labelfont">Relationship Status:<span style="color: red; font-size: 3">*</span></label><br></div>
					  	<div class="col-md-6" style="padding-left: 0%;">
					  	<select value=""  name="coAppRelStatus" id="coRelStatus"  ng-model="coappRelStatuss" class="form-control" onchange="changeBackgroundOfSelectedField()">
							  						<option value=""> Select </option>
													<option value="Single"> Single </option>
							  						<option value="Married"> Married </option>
							  						<option value="Common-Law"> Common-Law </option>
							  						<option value="Divorced"> Divorced </option>
							  						<option value="Separated"> Separated </option>
													</select>
      											<div id="input_41055" style="position: absolute;"></div>
					  	</div>
				</div>
					  	
				
					
 			       <br>
        			<div class="row" style="width: 100%;">
					  <div class="col-sm-6" style="float: left; padding-left:2%; width: 50%;">
					  		<a href="/mortgageBackPage1a" class="btn btn-primary" role="button" style=" width: 50%;">Back</a>
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
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:10%; background-color: #6AA84F;">
						    <label>10%</label>
						    </div>
						  </div>
						</div>
					 </div>
					<div class="col-sm-3"></div>
				</div>
				</div>
				<br>
				<br>
				
</form>
</div>
<script src=""""),_display_(/*127.15*/routes/*127.21*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*127.71*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(opportunity:Opportunity,appBasicDetails:Applicant): play.twirl.api.HtmlFormat.Appendable = apply(opportunity,appBasicDetails)

  def f:((Opportunity,Applicant) => play.twirl.api.HtmlFormat.Appendable) = (opportunity,appBasicDetails) => apply(opportunity,appBasicDetails)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:25 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage1b.scala.html
                  HASH: 150116640ca26f4f3b48515b6a40b87a870b0cd0
                  MATRIX: 747->1|886->52|913->53|1555->668|1570->674|1627->710|1883->939|1898->945|1973->999|2026->1025|2041->1031|2106->1075|2193->1135|2208->1141|2266->1178|2343->1228|2358->1234|2436->1290|2645->1472|2665->1483|2715->1512|2788->1558|2808->1569|2859->1599|2947->1660|2971->1675|2998->1681|3330->1986|3345->1992|3406->2032|4065->2663|4090->2678|4130->2696|4545->3083|4570->3098|4615->3121|5058->3536|5083->3551|5123->3569|5524->3942|5549->3957|5589->3975|6028->4387|6052->4402|6081->4410|8170->6471|8186->6477|8258->6527
                  LINES: 26->1|29->1|30->2|39->11|39->11|39->11|44->16|44->16|44->16|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|68->40|68->40|68->40|81->53|81->53|81->53|85->57|85->57|85->57|92->64|92->64|92->64|96->68|96->68|96->68|104->76|104->76|104->76|155->127|155->127|155->127
                  -- GENERATED --
              */
          