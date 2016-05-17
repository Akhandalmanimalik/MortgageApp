
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
object mortgagePage1a extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Opportunity,Applicant,play.twirl.api.HtmlFormat.Appendable] {

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
<link rel="shortcut icon" href=""""),_display_(/*12.34*/routes/*12.40*/.Assets.at("_resources/favicon.ico")),format.raw/*12.76*/("""">
<script src=""""),_display_(/*13.15*/routes/*13.21*/.Assets.at("javascripts/mortgageJs/mortgagePage1a.js")),format.raw/*13.75*/(""""></script>

<script	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*17.65*/(""""></script>
   
<link type="text/css" rel="stylesheet" href=""""),_display_(/*19.47*/routes/*19.53*/.Assets.at("_resources/template.css")),format.raw/*19.90*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*20.47*/routes/*20.53*/.Assets.at("stylesheets/mortgageCSS/mortgagePage1a.css")),format.raw/*20.109*/("""">
</head>
<body>
<br>
<br>
<div style="width: 95%" ng-controller="DemoController"  data-ng-app="demoApp">

		<form name="myForm" action="mortgagePage1a" method="POST" onsubmit="return validateForm()">
			<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*35.11*/routes/*35.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*35.57*/("""" />
		</div>
		<br>
		<div class="WordSection1">
		<ol>Welcome to Visdom! <br></ol>
		<ol>Important information:</ol> 
		<ul class="ul-dash">
        <li>You have 7 days to complete this application before it expires.</li>
        <li>If you cannot complete it in one session, you may close it and to come back by clicking the link in the original email we sent.</li>
        <li>Clicking next saves the page you are on and you will return to the next page.</li>
        <li>If you need to go back, please use the arrows proved on the bottom of each page and not the arrows from in your browser.</li>
        <li>For assistance call <Strong>1-855-699-2400</Strong></li>
      	</ul>						
		</div>
		<div style="padding-top: 30px"></div>
		<div  style="margin-left: 5%">
		<div  ng-init="isDisabled = false"><br>
		<input type="hidden" value=""""),_display_(/*52.32*/opportunity/*52.43*/.getIsAdditionalApplicantExist),format.raw/*52.73*/("""" name="additional" >
		<input type="hidden" value=""""),_display_(/*53.32*/opportunity/*53.43*/.getLendingGoal),format.raw/*53.58*/("""" name="lendingGoal" >

						<div class="row">
							<div class="col-sm-6" align="center"><label><b>Applicant Infromation</b></label></div>
						</div><br>
						<div class="row">
					  		<div class="col-sm-6"><label class="labelfont" style="font-stretch: expanded;">First Name<span style="color: red; font-size: 3">*</span></label><br>
					  			<input type="text" id="first_name" name="firstName" placeholder="First Name" class="form-control" value=""""),_display_(/*60.117*/appBasicDetails/*60.132*/.getApplicant_name),format.raw/*60.150*/("""">
									     		<div id="input_1101" style="position: absolute;"></div>
					  		</div>
					  		<div class="col-sm-6" style="padding-left: 0%;"><label class="labelfont" style="font-stretch: expanded;">Last Name<span style="color: red; font-size: 3">*</span></label>
					  			<input type="text" id="last_name" name="lastName" placeholder="Last Name" class="form-control" value=""""),_display_(/*64.114*/appBasicDetails/*64.129*/.getApplicant_last_name),format.raw/*64.152*/("""">
      											<div id="input_1102" style="position: absolute;"></div>
					  		</div>
					  	</div>
					  	<br>	
					 	 <div class="row">
					  		<div class="col-sm-6"><label class="labelfont" style="font-stretch: expanded;">Email Address<span style="color: red; font-size: 3">*</span></label><br>
					  			<input type="text" id="email_id" name="email" placeholder="Email" class="form-control" value=""""),_display_(/*71.106*/appBasicDetails/*71.121*/.getEmail_personal),format.raw/*71.139*/("""">
      												<div id="input_1103"  style="position: absolute;"></div>
					  		</div>
					  		<div class="col-sm-6" style="padding-left: 0%;"><label class="labelfont" style="font-stretch: expanded;">Confirm-email<span style="color: red; font-size: 3">*</span></label><br>
					  			<input type="text" id="co_email_id" name="confirmEmail" placeholder="Email" class="form-control" value=""""),_display_(/*75.116*/appBasicDetails/*75.131*/.getEmail_personal),format.raw/*75.149*/("""">
      											<div id="input_1104"  style="position: absolute;"></div>
					  		</div>
					  		
					 	 </div>
					 	 <br>
							<div class="row">
								<div class="col-md-6">
									<label class="labelfont">Mobile Number:<span
										style="color: red; font-size: 3">*</span></label><br>
								</div>
								<div class="col-md-6" style="padding-left: 0%;">
									<input type="text" name="applMobPhone" id="phonedatata"
										placeholder="eg.333-444-5555" class="form-control"
										  value=""""),_display_(/*89.21*/appBasicDetails/*89.36*/.getCell),format.raw/*89.44*/("""" />
									<div id="input_11044" style="position: absolute;"></div>
								</div>

							</div>
							<br>
							<div class="row">
								<div class="col-md-6">
									<label class="labelfont">Relationship Status:<span
										style="color: red; font-size: 3">*</span></label><br>
								</div>
								<div class="col-md-6" style="padding-left: 0%;">
									<select value=""  name="appRelStatus"
										id="relStatus" class="form-control" ng-model="appRelStatuss" onchange="changeBackgroundOfSelectedField()">
										<option value="">Select</option>
										<option value="Single">Single</option>
										<option value="Married">Married</option>
										<option value="Common-Law">Common-Law</option>
										<option value="Divorced">Divorced</option>
										<option value="Separated">Separated</option>
									</select>
									<div id="input_400665" style="position: absolute;"></div>
								</div>
							</div>
							<br> <label class="labelfont"> Is there an Additional Applicant?<span style="color: red; font-size: 3">*</span></label>&nbsp;&nbsp;<input type="checkbox" name="additionalApplicants" ng-model="additionalApplicant" /><br>
							
						<div class="btn-group" style="width: 100%;">
								<div id="input_1109" style="position: absolute;"></div>
						</div>
						<br><br> 
						<!-- <input type="hidden" name="additionalApplicants" value=""""),format.raw/*119.68*/("""{"""),format.raw/*119.69*/("""{"""),format.raw/*119.70*/("""additionalApplicant"""),format.raw/*119.89*/("""}"""),format.raw/*119.90*/("""}"""),format.raw/*119.91*/("""" ng-required> -->
						<div class="row" ng-if="additionalApplicant != true  && appRelStatuss == 'Married' || additionalApplicant != true  && appRelStatuss == 'Common-Law'">				
								<div class="col-md-9">
									<label class="labelfont">Lenders require information related to the reason you do not want to include your partner as an applicant. Please explain.<span
										style="color: red; font-size: 3">*</span></label><br>
							 
								</div>
								<div class="col-md-3" style="padding-left: 0%;">
									<select value="" style="width: 93%" name="reasonNotInclude" id="reason" ng-model="additionalReason" class="form-control" onchange="changeBackgroundOfSelectedField()">
							  						<option value="">Please Select </option>
													<option value="CompanyApplication"> Company Application </option>
							  						<option value="PartnersPoorCredit"> Partner’s poor credit </option>
							  						<option value="PartnerOutofCountry"> Partner Out of Country </option>
							  						<option value="PartnerHasNoIncome"> Partner has no income </option>
							  						<option value="NotNeeded"> Not needed </option>
							  						<option value="Other"> Other </option>
													</select>
      											<div id="input_4006312" style="position: absolute;"></div>
								</div>
							</div>
						<br>
						<label class="labelfont"> What is your current Lending Goal? <span style="color: red; font-size: 3">*</span></label>
						<a href="#"  data-toggle="modal" data-target="#myModal">(<b><u>Info</u></b>)</a>
		   				<div class="btn-group" style="width: 100%;">
             				<label style="width: 20%" class="btn btn-primary" btn-radio="'PreApproval'"
                      			ng-change="change()"  ng-model="newItemType" value=""  > Pre-Approval </label>
                            
             				<label style="width: 20%" class="btn btn-primary" btn-radio="'Purchase'" 
                                ng-change="change()"  ng-model="newItemType" value=""> Purchase </label>
				             <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'Refinance'"
                                ng-change="change()"  ng-model="newItemType" value=""> Refinance </label>
						</div>
						<div id="input_201" style="position: absolute;"> </div>
						<input type="hidden" name="term" value=""""),format.raw/*152.47*/("""{"""),format.raw/*152.48*/("""{"""),format.raw/*152.49*/("""newItemType"""),format.raw/*152.60*/("""}"""),format.raw/*152.61*/("""}"""),format.raw/*152.62*/("""" ></input>
        <div class="container">
								<!-- Modal -->
								<div class="modal fade" id="myModal" role="dialog">
									<div class="modal-dialog">

										<!-- Modal content-->
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">&times;</button>
												<h4 class="modal-title">About Lending Goal</h4>
											</div>
											<div class="modal-body">
												<ul class="ul-dash">
													<li>Pre-Approval: Hold your rate and find out how much
														you can afford to purchase.</li>
													<li>Purchase: Get financing to complete the purchase
														of a property you have an offer on (or are putting an
														offer on).</li>
													<li>Refinance: Take money out of a property you
														already own to pay debts, use extra money for investments,
														purchase another property and/or to break your current
														mortgage to get a new one at a better rate.</li>
													<li>Renewal: Your mortgage term is up and you want to
														negotiate the best rate without taking additional money
														out of your property.</li>
												</ul>
											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-default"
													data-dismiss="modal">Close</button>
											</div>
										</div>

									</div>
								</div>
							</div>
        <br>
        <br>
        			<div class="row" style="width: 100%;">
					  <div class="col-sm-6" style="float: left; padding-left:2%; width: 50%;">
					  		<input type="button" class="btn btn-primary btn-block"
								value="Back" style=" width: 50%;">
					  </div>
					  <div class="col-sm-6" align="right" style="float: right; padding-right:5%; width: 50%;"><input type="submit" class="btn btn-primary btn-block"
								value="Next" style="width: 50%;">
							<div align="right" id="submiterror">
								<font color="red"></font></div>
					  </div>	
					  
					</div>
				
					<br>
					<center><strong>Progess</strong></center>
					<div ng-if="additionalApplicant == 'yes' || additionalApplicant == null ">
						<div class="container" style="width: 70%;">
						  <div class="progress">
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:5%; background-color: #6AA84F;">
						    <label>5%</label>
						    </div>
						  </div>
						</div>
						</div>
						<div ng-if="additionalApplicant == 'no'">
						<div class="container" style="width: 70%;">
						  <div class="progress">
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:10%;background-color: #6AA84F;">
						    <label>10%</label>
						    </div>
						  </div>
						</div>
						</div>
						<center> Your privacy and security is important to us. For more information about privacy and security,<a href="/privacyPolice" target="blank"><u>please click here</u></a>.</center>
						</div>
						</div>	
					 </div>
					<div class="col-sm-3"></div>
				</div>
				
				<br>
				<br>
</form>
</div>
      
<script src=""""),_display_(/*236.15*/routes/*236.21*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*236.71*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(opportunity:Opportunity,appBasicDetails:Applicant): play.twirl.api.HtmlFormat.Appendable = apply(opportunity,appBasicDetails)

  def f:((Opportunity,Applicant) => play.twirl.api.HtmlFormat.Appendable) = (opportunity,appBasicDetails) => apply(opportunity,appBasicDetails)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:16 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage1a.scala.html
                  HASH: 97c6392aab944eb7743c93a9838a4d403db5f6a1
                  MATRIX: 747->1|886->52|913->53|1556->669|1571->675|1628->711|1672->728|1687->734|1762->788|2024->1023|2039->1029|2104->1073|2193->1135|2208->1141|2266->1178|2342->1227|2357->1233|2435->1289|2945->1772|2960->1778|3021->1818|3893->2663|3913->2674|3964->2704|4044->2757|4064->2768|4100->2783|4585->3240|4610->3255|4650->3273|5061->3656|5086->3671|5131->3694|5572->4107|5597->4122|5637->4140|6061->4536|6086->4551|6126->4569|6676->5092|6700->5107|6729->5115|8156->6513|8186->6514|8216->6515|8264->6534|8294->6535|8324->6536|10725->8908|10755->8909|10785->8910|10825->8921|10855->8922|10885->8923|14164->12174|14180->12180|14252->12230
                  LINES: 26->1|29->1|30->2|40->12|40->12|40->12|41->13|41->13|41->13|45->17|45->17|45->17|47->19|47->19|47->19|48->20|48->20|48->20|63->35|63->35|63->35|80->52|80->52|80->52|81->53|81->53|81->53|88->60|88->60|88->60|92->64|92->64|92->64|99->71|99->71|99->71|103->75|103->75|103->75|117->89|117->89|117->89|147->119|147->119|147->119|147->119|147->119|147->119|180->152|180->152|180->152|180->152|180->152|180->152|264->236|264->236|264->236
                  -- GENERATED --
              */
          