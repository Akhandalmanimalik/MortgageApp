
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
object mortgagePage1 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Opportunity,Applicant,Applicant,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(opportunity:Opportunity,appBasicDetails:Applicant,appBasicDetails1:Applicant):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.80*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">  
<link rel="shortcut icon" href=""""),_display_(/*13.34*/routes/*13.40*/.Assets.at("_resources/favicon.ico")),format.raw/*13.76*/("""">
<script src=""""),_display_(/*14.15*/routes/*14.21*/.Assets.at("javascripts/mortgageJs/mortgagePage1.js")),format.raw/*14.74*/(""""></script>

<script	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*18.65*/(""""></script>

<link type="text/css" rel="stylesheet" href=""""),_display_(/*20.47*/routes/*20.53*/.Assets.at("_resources/template.css")),format.raw/*20.90*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*21.47*/routes/*21.53*/.Assets.at("stylesheets/mortgageCSS/mortgagePage1.css")),format.raw/*21.108*/(""""> 

</head>
<body>
<br>
<br>
<div style="width: 97%;">
		<form name="myForm" action="mortgagePage2"  method="POST"  onsubmit="return validateForm()">
		<input type="hidden" value=""""),_display_(/*29.32*/opportunity/*29.43*/.getId),format.raw/*29.49*/("""" name="crmLeadId">
		<input type="hidden" value=""""),_display_(/*30.32*/opportunity/*30.43*/.getReferralSourceEmail),format.raw/*30.66*/("""" name="referralEmail">
		<input type="hidden" value=""""),_display_(/*31.32*/opportunity/*31.43*/.getReferralSourceName),format.raw/*31.65*/("""" name="referralName">
		<input type="hidden" value=""""),_display_(/*32.32*/opportunity/*32.43*/.getIsAdditionalApplicantExist),format.raw/*32.73*/("""" name="additionalApplicants1">
		<input type="hidden" value=""""),_display_(/*33.32*/appBasicDetails1/*33.48*/.getApplicant_name),format.raw/*33.66*/("""" >
		<input type="hidden" value=""""),_display_(/*34.32*/appBasicDetails/*34.47*/.getRelationship_status),format.raw/*34.70*/("""" name="status">
		<input type="hidden" value=""""),_display_(/*35.32*/appBasicDetails1/*35.48*/.getRelationship_status),format.raw/*35.71*/("""" name="costatus">
						<input type="hidden" value=""""),_display_(/*36.36*/appBasicDetails/*36.51*/.getAdditionalReason),format.raw/*36.71*/("""" name="additionalReason">
		
		<input type="hidden" value=""""),_display_(/*38.32*/opportunity/*38.43*/.getLendingGoal),format.raw/*38.58*/("""" name="lendingGoal" >
		
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8 container-bg text-color-blue">
					
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 1%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*47.11*/routes/*47.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*47.57*/("""" />
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
		<div data-ng-app="demoApp"  style="margin-left: 4%">
		<div ng-controller="DemoController" ng-init="isDisabled = false" ng-cloak>
		<div class="row" class="col-sm-16" style="padding-left: 0%;">
			<div class="col-sm-6" style="padding-left: 0%;">
				<label class="labelfont" style="padding-left: 30%">Applicant</label><br><br>
				<div class="row">
					  	<div class="col-md-6"><label class="labelfont">First Name<span style="color: red; font-size: 3">*</span></label><br></div>
					  	<div class="col-md-6" style="padding-left: 0%;" ><label class="labelfont">Last Name<span style="color: red; font-size: 3">*</span></label></div>
				</div>
				
				<div class="col-sm-6" style="padding-left: 0%;">
				<div class="map_canvas"></div>
				<input type="text" name="firstName" id="fName" placeholder="First Name" class="form-control" value=""""),_display_(/*74.106*/appBasicDetails/*74.121*/.getApplicant_name),format.raw/*74.139*/("""">
									     		<div id="input_1101" style="position: absolute;"></div>
				</div>
				<div class="col-sm-6" style="padding-left: 0%;">
				<input type="text" name="lastName" id="lname" placeholder="Last Name" class="form-control" value=""""),_display_(/*78.104*/appBasicDetails/*78.119*/.getApplicant_last_name),format.raw/*78.142*/("""">
      											<div id="input_1102" style="position: absolute;"></div>
				</div><br><br><br>
				
					<div class="col-sm-6" style="padding-left: 0%; width: 100%">
					<div class="row">
					  	<div class="col-md-6"><label class="labelfont">Email<span style="color: red; font-size: 3">*</span></label></div>
					  	<div class="col-md-6" style="padding-left: 0%;" ><label class="labelfont">Confirm Email<span style="color: red; font-size: 3">*</span></label></div>
					</div>
					<div class="col-sm-6" style="padding-left: 0%;">
					<input type="text" placeholder="Email" class="form-control" name="email" id="email" style="width: 103%" value=""""),_display_(/*88.118*/appBasicDetails/*88.133*/.getEmail_personal),format.raw/*88.151*/("""">
					<div id="input_1103"  style="position: absolute;"></div>
					</div>
					<div class="col-sm-6" style="padding-left: 1%;">
					<input type="text"  name="confirmEmail" id="cEmail" placeholder="Confirm Email" class="form-control"  style="width: 110%" value=""""),_display_(/*92.136*/appBasicDetails/*92.151*/.getEmail_personal),format.raw/*92.169*/("""">
					<div id="input_1104"  style="position: absolute;"></div>
					</div>
					</div>
				<br><br><br><br>
				<div class="row">
					  	<div class="col-md-6"><label class="labelfont">Mobile Number:<span style="color: red; font-size: 3">*</span></label><br></div>
					  	<div class="col-md-6" style="padding-left: 0%;" >
					  	<input type="text"  name="applMobPhone" id="phonedatata" placeholder="eg.333-444-5555" class="form-control" style="width: 93%" value=""""),_display_(/*100.144*/appBasicDetails/*100.159*/.getCell),format.raw/*100.167*/(""""/>
					  	<div id="input_11044"  style="position: relative;"></div>
					  	</div>
					  	
				</div>
				<br>
				<div class="row">
					  	<div class="col-md-6"><label class="labelfont">Relationship Status:<span style="color: red; font-size: 3">*</span></label><br></div>
					  	<div class="col-md-6" style="padding-left: 0%;" >
					  	<select value="" style="width: 93%" name="appRelStatus" id="relStatus" class="form-control" ng-model="appRelStatuss" onchange="changeBackgroundOfSelectedField()">
							  						<option value=""> Select </option>
													<option value="Single"> Single </option>
							  						<option value="Married"> Married </option>
							  						<option value="Common-Law"> Common-Law </option>
							  						<option value="Divorced"> Divorced </option>
							  						<option value="Separated"> Separated </option>
													</select>
      											<div id="input_400665" style="position: absolute;"></div>
					  	</div>
				</div>
				<br>
				
			</div>
			<input type="hidden" ng-model="data" name="additionalAppl">
			<div ng-show="additionalApplicant == true">
			<div class="clearfix visible-xs"></div>
			<div class="col-sm-1 verticalLine" style="margin-left:-20px; width: 0%; padding-right: 0px;"></div>
			<div class="col-sm-6" style="padding-left: 0%;">
				<label class="labelfont" style="padding-left: 30%">Co Applicant</label><br><br>
				<div class="row">
					  		<div class="col-md-6"><label class="labelfont">First Name<span style="color: red; font-size: 3">*</span></label></div>
					  		<div class="col-md-6" style="padding-left: 0%;" ><label class="labelfont">Last Name<span style="color: red; font-size: 3">*</span></label></div>
				</div>
				<div class="col-sm-6" style="padding-left: 0%;">
				<input type="text" class="form-control" placeholder="First Name" name="adFirstName" id="cfName" style="width: 100%" value=""""),_display_(/*134.129*/appBasicDetails1/*134.145*/.getApplicant_name),format.raw/*134.163*/("""">
				<div id="input_1105"  style="position: absolute;"></div>
				</div>
				<div class="col-sm-6" style="padding-left: 0%;">
				<input type="text" name="adLastName" id="clName" placeholder="Last Name" class="form-control"  style="width: 100%" value=""""),_display_(/*138.128*/appBasicDetails1/*138.144*/.getApplicant_last_name),format.raw/*138.167*/("""">
				<div id="input_1106"  style="position: absolute;"></div>
				</div><br><br><br>
				
				<div class="col-sm-6" style="padding-left: 0%;  width: 100%">
				<div class="row">
					  		<div class="col-md-6"><label class="labelfont">Email<span style="color: red; font-size: 3">*</span></label></div>
					  		<div class="col-md-6" style="padding-left: 0%;"><label class="labelfont">Confirm Email<span style="color: red; font-size: 3">*</span></label></div>
				</div>
				<div class="col-sm-6" style="padding-left: 0%;">
				
				<input type="text" placeholder="Email" class="form-control" name="adEmail" id="coEmail" style="width: 107%" value=""""),_display_(/*149.121*/appBasicDetails1/*149.137*/.getEmail_personal),format.raw/*149.155*/("""">
				<div id=input_1107  style="position: absolute;"></div>
				
				</div>
				<div class="col-sm-6" style="padding-left: 2%;">
				<input type="text"  name="adConfirmEmail" id="cocEmail" placeholder="Confirm Email" class="form-control" ng-blur="calculateDate2(this)" style="width: 112%"  value=""""),_display_(/*154.170*/appBasicDetails1/*154.186*/.getEmail_personal),format.raw/*154.204*/("""">
				<div id="input_1108" style="position: absolute;"></div>
				</div>
				</div>
				<br><br><br><br>
				<div class="row">
					  	<div class="col-md-6"><label class="labelfont">Mobile Number:<span style="color: red; font-size: 3">*</span></label><br></div>
					  	<div class="col-md-6" style="padding-left: 0%;" >
					  	
					  	<input type="text" name="coApplMobPhone" id="phonedatata7" placeholder="eg.333-444-5555" class="form-control" style="width: 93%" value=""""),_display_(/*163.146*/appBasicDetails1/*163.162*/.getCell),format.raw/*163.170*/("""">
					  	<div id="input_11088" style="position: relative;"></div> 
					  	</div>
					  	
				</div>
				<br>
				<div class="row">
					  	<div class="col-md-6"><label class="labelfont">Relationship Status:<span style="color: red; font-size: 3">*</span></label><br></div>
					  	<div class="col-md-6" style="padding-left: 0%;" >
					  	<select value="" style="width: 93%" name="coAppRelStatus" id="coRelStatus"  ng-model="coappRelStatuss" class="form-control" onchange="changeBackgroundOfSelectedField()">
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
				
			</div>
			
			</div>
		</div>
		
		<label class="labelfont"> Is there an Additional Applicant?<span style="color: red; font-size: 3">*</span></label>&nbsp;&nbsp;<input type="checkbox" name="additionalApplicants" ng-model="additionalApplicant" /><br>

						<div id="input_1109" style="position: absolute;"></div>
						<br><br> 
										
							<div class="row" ng-if="additionalApplicant != true  && appRelStatuss == 'Married' || additionalApplicant != true  && appRelStatuss == 'Common-Law'">
								<div class="col-md-9">
									<label class="labelfont">Lenders require information related to the reason you do not want to include your partner as an applicant. Please explain.</label>	
								
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
							<br>
								
		   				<div class="btn-group" style="width: 100%;">
             				<label style="width: 20%" class="btn btn-primary" btn-radio="'PreApproval'"
                      			ng-change="change()"  ng-model="newItemType" value=""> Pre-Approval </label>
                            
             				<label style="width: 20%" class="btn btn-primary" btn-radio="'Purchase'" 
                                ng-change="change()"  ng-model="newItemType" value=""> Purchase </label>
				             <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'Refinance'"
                                ng-change="change()"  ng-model="newItemType" value=""> Refinance </label>
						</div>
						<div id="input_201"> </div>
						<input type="hidden" name="term" value=""""),format.raw/*228.47*/("""{"""),format.raw/*228.48*/("""{"""),format.raw/*228.49*/("""newItemType"""),format.raw/*228.60*/("""}"""),format.raw/*228.61*/("""}"""),format.raw/*228.62*/("""" ></input>
					
 							 <!-- Trigger the modal for Lightbox or Help Text Info -->

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


						</div>
						 <div>
						<div style="float: right;padding-right:30px;">
							<input type="submit" class="btn btn-primary btn-block"
								value="Next" style=" width: 110px">
								<div align="center" id="submiterror">
									<font color="red"></font>
								</div>
						</div>						
					</div>
					<br>
				</div>
						<br>
						<div class="container" style="width: 70%;">
						  <div class="progress">
						    <div class="progress-bar" role="progressbar" aria-valuenow="5%" aria-valuemin="0" aria-valuemax="100" style="width:10%; background-color: #6AA84F;">
						    <label>10% Complete</label>
						    </div>
						  </div>
						</div>
						<center> Your privacy and security is important to us. For more information about privacy and security,<a href="/privacyPolice" target="blank"><u>please click here</u></a>.</center>
						<br>
						<br>
					 </div>
				</div>
				
				<br>
				<br>
</form>
</div>


	<script src=""""),_display_(/*302.16*/routes/*302.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*302.72*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(opportunity:Opportunity,appBasicDetails:Applicant,appBasicDetails1:Applicant): play.twirl.api.HtmlFormat.Appendable = apply(opportunity,appBasicDetails,appBasicDetails1)

  def f:((Opportunity,Applicant,Applicant) => play.twirl.api.HtmlFormat.Appendable) = (opportunity,appBasicDetails,appBasicDetails1) => apply(opportunity,appBasicDetails,appBasicDetails1)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:16 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage1.scala.html
                  HASH: 8dc861aa78dd147cac08e6eeff3c10bc3a9ec621
                  MATRIX: 756->1|922->79|950->81|1595->699|1610->705|1667->741|1711->758|1726->764|1800->817|2062->1052|2077->1058|2142->1102|2228->1161|2243->1167|2301->1204|2377->1253|2392->1259|2469->1314|2678->1496|2698->1507|2725->1513|2803->1564|2823->1575|2867->1598|2949->1653|2969->1664|3012->1686|3093->1740|3113->1751|3164->1781|3254->1844|3279->1860|3318->1878|3380->1913|3404->1928|3448->1951|3523->1999|3548->2015|3592->2038|3673->2092|3697->2107|3738->2127|3826->2188|3846->2199|3882->2214|4217->2522|4232->2528|4293->2568|5903->4150|5928->4165|5968->4183|6238->4425|6263->4440|6308->4463|6991->5118|7016->5133|7056->5151|7350->5417|7375->5432|7415->5450|7912->5918|7938->5933|7969->5941|9888->7831|9915->7847|9956->7865|10240->8120|10267->8136|10313->8159|10991->8808|11018->8824|11059->8842|11388->9142|11415->9158|11456->9176|11960->9651|11987->9667|12018->9675|15669->13297|15699->13298|15729->13299|15769->13310|15799->13311|15829->13312|18378->15833|18394->15839|18466->15889
                  LINES: 26->1|29->1|31->3|41->13|41->13|41->13|42->14|42->14|42->14|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|66->38|66->38|66->38|75->47|75->47|75->47|102->74|102->74|102->74|106->78|106->78|106->78|116->88|116->88|116->88|120->92|120->92|120->92|128->100|128->100|128->100|162->134|162->134|162->134|166->138|166->138|166->138|177->149|177->149|177->149|182->154|182->154|182->154|191->163|191->163|191->163|256->228|256->228|256->228|256->228|256->228|256->228|330->302|330->302|330->302
                  -- GENERATED --
              */
          