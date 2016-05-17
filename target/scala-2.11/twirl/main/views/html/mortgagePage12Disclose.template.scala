
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
object mortgagePage12Disclose extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,Integer,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(role: String,additionalApplicant:String,referralId:Integer,applicantName:String,coApplicantName:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.106*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>

<link rel="shortcut icon" href=""""),_display_(/*8.34*/routes/*8.40*/.Assets.at("_resources/favicon.ico")),format.raw/*8.76*/("""">
<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
 <script src=""""),_display_(/*10.16*/routes/*10.22*/.Assets.at("_resources/angular.min.js")),format.raw/*10.61*/(""""></script>
<script	src=""""),_display_(/*11.15*/routes/*11.21*/.Assets.at("_resources/ui-bootstrap-tpls.min.js")),format.raw/*11.70*/(""""></script>
<!--  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

 -->
<script src=""""),_display_(/*15.15*/routes/*15.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*15.65*/(""""></script>
<script src=""""),_display_(/*16.15*/routes/*16.21*/.Assets.at("_resources/app.js")),format.raw/*16.52*/(""""></script>
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.at("_resources/signature_pad.js")),format.raw/*17.62*/(""""></script>
<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->
<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*21.31*/routes/*21.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*21.79*/("""">
<script src="""),_display_(/*22.14*/routes/*22.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*22.61*/(""""></script>
<link type="text/css" rel="stylesheet" href=""""),_display_(/*23.47*/routes/*23.53*/.Assets.at("_resources/background.css")),format.raw/*23.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*24.47*/routes/*24.53*/.Assets.at("_resources/forms.css")),format.raw/*24.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*25.47*/routes/*25.53*/.Assets.at("_resources/template.css")),format.raw/*25.90*/("""">
<link rel="stylesheet" href=""""),_display_(/*26.31*/routes/*26.37*/.Assets.at("_resources/signature-pad.css")),format.raw/*26.79*/("""">
<!-- <link rel="stylesheet"
	href="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css"> -->
<style>
body """),format.raw/*30.6*/("""{"""),format.raw/*30.7*/("""
	"""),format.raw/*31.2*/("""padding-top: 20px;
	padding-bottom: 20px;
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""


"""),format.raw/*36.1*/("""#sig-dataUrl """),format.raw/*36.14*/("""{"""),format.raw/*36.15*/("""
	"""),format.raw/*37.2*/("""width: 100%;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""

"""),format.raw/*40.1*/("""#sig-canvas """),format.raw/*40.13*/("""{"""),format.raw/*40.14*/("""
	"""),format.raw/*41.2*/("""border: 2px dotted Black;
	border-radius: 5px;
	cursor: crosshair;
	background: white;
	color: black;
"""),format.raw/*46.1*/("""}"""),format.raw/*46.2*/("""

"""),format.raw/*48.1*/("""#sig-canvas1 """),format.raw/*48.14*/("""{"""),format.raw/*48.15*/("""
	"""),format.raw/*49.2*/("""border: 2px dotted Black;
	border-radius: 5px;
	cursor: crosshair;
	background: white;
	color: black;
"""),format.raw/*54.1*/("""}"""),format.raw/*54.2*/("""

"""),format.raw/*56.1*/("""#sig-canvas2 """),format.raw/*56.14*/("""{"""),format.raw/*56.15*/("""
	"""),format.raw/*57.2*/("""border: 2px dotted Black;
	border-radius: 5px;
	cursor: crosshair;
	background: white;
	color: black;
"""),format.raw/*62.1*/("""}"""),format.raw/*62.2*/("""

"""),format.raw/*64.1*/("""/*for bigger checkbox*/
*,*:after,*:before """),format.raw/*65.20*/("""{"""),format.raw/*65.21*/("""
  """),format.raw/*66.3*/("""-webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
  padding: 0;
  margin: 0;
"""),format.raw/*71.1*/("""}"""),format.raw/*71.2*/("""

"""),format.raw/*73.1*/(""".switch """),format.raw/*73.9*/("""{"""),format.raw/*73.10*/("""
  """),format.raw/*74.3*/("""position: relative;
"""),format.raw/*75.1*/("""}"""),format.raw/*75.2*/("""

"""),format.raw/*77.1*/(""".switch label """),format.raw/*77.15*/("""{"""),format.raw/*77.16*/("""
  """),format.raw/*78.3*/("""width: 100%;
  height: 100%;
  position: relative;
  display: block;
"""),format.raw/*82.1*/("""}"""),format.raw/*82.2*/("""

"""),format.raw/*84.1*/(""".switch input """),format.raw/*84.15*/("""{"""),format.raw/*84.16*/("""
  """),format.raw/*85.3*/("""top: 0; 
  right: 0; 
  bottom: 0; 
  left: 0;
  opacity: 0;
  z-index: 100;
  position: absolute;
  width: 100%;
  height: 100%;
  cursor: pointer;
"""),format.raw/*95.1*/("""}"""),format.raw/*95.2*/("""

"""),format.raw/*97.1*/("""/* DEMO 3 */

.switch.demo3 """),format.raw/*99.15*/("""{"""),format.raw/*99.16*/("""
  """),format.raw/*100.3*/("""width: 180px;
  height: 50px;
"""),format.raw/*102.1*/("""}"""),format.raw/*102.2*/("""

"""),format.raw/*104.1*/(""".switch.demo3 label """),format.raw/*104.21*/("""{"""),format.raw/*104.22*/("""
  """),format.raw/*105.3*/("""display: block;
  width: 25%;
  height: 70%;
  background: #ffffff;
"""),format.raw/*109.1*/("""}"""),format.raw/*109.2*/("""

"""),format.raw/*111.1*/(""".switch.demo3 label:after """),format.raw/*111.27*/("""{"""),format.raw/*111.28*/("""
  """),format.raw/*112.3*/("""content: "";
  position: absolute;
  top: -8px; right: -8px; bottom: -8px; left: -8px;
"""),format.raw/*115.1*/("""}"""),format.raw/*115.2*/("""

"""),format.raw/*117.1*/(""".switch.demo3 label:before """),format.raw/*117.28*/("""{"""),format.raw/*117.29*/("""
  """),format.raw/*118.3*/("""content: "";
  position: absolute;
  z-index: -1;
  top: -18px; right: -18px; bottom: -18px; left: -18px;
"""),format.raw/*122.1*/("""}"""),format.raw/*122.2*/("""


"""),format.raw/*125.1*/(""".switch.demo3 input:checked ~ label i:before """),format.raw/*125.46*/("""{"""),format.raw/*125.47*/("""
   """),format.raw/*126.4*/("""content: url(""""),_display_(/*126.19*/routes/*126.25*/.Assets.at("_resources/tick1.png")),format.raw/*126.59*/(""""); 
  color: #000000;
"""),format.raw/*128.1*/("""}"""),format.raw/*128.2*/("""
"""),format.raw/*129.1*/("""</style>

<script language="JavaScript">

        window.onbeforeunload = function () """),format.raw/*133.45*/("""{"""),format.raw/*133.46*/("""
            """),format.raw/*134.13*/("""return "Are you sure?";
        """),format.raw/*135.9*/("""}"""),format.raw/*135.10*/(""";

        $(document).ready(function () """),format.raw/*137.39*/("""{"""),format.raw/*137.40*/("""
            """),format.raw/*138.13*/("""$('form').submit(function () """),format.raw/*138.42*/("""{"""),format.raw/*138.43*/("""
                """),format.raw/*139.17*/("""window.onbeforeunload = null;
            """),format.raw/*140.13*/("""}"""),format.raw/*140.14*/(""");
        """),format.raw/*141.9*/("""}"""),format.raw/*141.10*/(""");
    </script>
    
<!-- <script language="JavaScript">
	window.onbeforeunload = function(e) """),format.raw/*145.38*/("""{"""),format.raw/*145.39*/("""
    	"""),format.raw/*146.6*/("""return 'Dialog text here.';
	"""),format.raw/*147.2*/("""}"""),format.raw/*147.3*/(""";
    </script> -->
</head>
<body>


	<div style="padding-bottom: 20px; margin-top: 20px; padding-left: 45%">
		<img alt="Visdom Logo" height="90" width="260"
			src=""""),_display_(/*155.10*/routes/*155.16*/.Assets.at("_resources/visdom-logo.png")),format.raw/*155.56*/("""" />

	</div>
	<div style="width: 95%">
		<form name="myForm" action="mortgagePage12" method="POST" onsubmit="return validateForm()">
		
		<input type="hidden" name="coapplicant">
			<div class="row"></div>
			<div class="row">
				<div class="col-sm-3"></div>
				<div class="col-sm-7 container-bg text-color-blue">
					<div style="padding-top: 50px"></div>
					
					<div data-ng-app="demoApp" ng-init="role='"""),_display_(/*168.49*/role),format.raw/*168.53*/("""';role12='"""),_display_(/*168.64*/additionalApplicant),format.raw/*168.83*/("""'"
						style="margin-left: 5%">
					
						<div ng-controller="DemoController" ng-init="newItemType=false">
						<input type="hidden" name="referrelID" value=""""),_display_(/*172.54*/referralId),format.raw/*172.64*/("""">
						<input type="hidden" name="role" value=""""),_display_(/*173.48*/role),format.raw/*173.52*/("""">
						<input type="hidden" name="rule12" value="0">

							<br>
							<a data-toggle="collapse" href="#other" style="text-decoration: none">
							    <h3><span class="pull-left glyphicon glyphicon-plus gi-5x"></span>  &nbsp;<font size="4px"> Click to expand Terms and Conditions</font></h3>
							  </a>
							<!-- 	<div id="livingroom-10" class="panel-collapse collapse"
																style="height: 0px;"> -->
							<div id="other" class="collapse">


									<!-- <div ng-show="newItemType"> -->

									<div class="WordSection1">
									<p><b><span style="text-decoration:underline;">Consent:</span></b><br /> The undersigned applicant(s) agree and covenant with Visdom Mortgages          Solutions (Visdom) in the following manner:</p>
									<ol>
						              <li>
						                You acknowledge and affirm that the information you have given in the mortgage application or any other service offered is true and complete and that you have not withheld or misrepresented any information. The information provided by you will be relied upon to be accurate in order for the lenders or any other persons we may submit to on your behalf to determine credit worthiness.
						              </li>
						              <li>
						                You give consent and authorization to collect and use personal information for the following purposes:
						                <ul type="disc">
						                  <li>
						                    to determine the suitability of the products and services for you
						                  </li>
						                  <li>
						                    to determine your eligibility of the various products and services
						                  </li>
						                  <li>
						                    to establish, manage and offer products and services that need your needs
						                  </li>
						                  <li>
						                    to provide on-going service(s)
						                  </li>
						                  <li>
						                    to meet our legal and regulatory requirements
						                  </li>
						                </ul>
						              </li>
						              <li>
						                You will be responsible for any and all fees related to property appraisal, legal, registration fee and other costs or expenses incurred by you in connection with this transaction
						              </li>
						              <li>
						                You authorize Visdom to disclose to any lender, credit bureau, insurer, insurance agent, financial advisor, or any other personal involved in a transaction such as personal and financial information concerning you as we consider appropriate. You also authorize any person whom we contact in this regard to provide such information to us.
						              </li>
						              <li>
						                We will ask you for your Social Insurance Number to use in verifying and reporting credit information to credit bureaus and credit reporting agencies. You may refuse to consent to its use or disclosure for these purposes.
						              </li>
						              <li>
						              I/we acknowledge that Visdom will continue to use the personal information provided to keep me/we abreast of timely information regarding new products and changes in mortgage offerings that could benefit me/us, family or friends. And from time to time will share this information when relevant with my original referrer or nominee.
						              </li>
						            </ol>
						            <p><b><span style="text-decoration:underline;">Relationship and Compensation Disclosure:</span></b><br /> To better assist our borrowers in understanding the relationship and         compensation with Mortgage Brokerages, we have outlined the following         information for your review.</p>
						            <p>For a variety of reasons, a mortgage professional may not always be         able to obtain the lowest rate or best terms in the marketplace for a         particular borrower. It can be dependent upon the terms of the purchase         contract, type of property, property value, borrowers employment status,         borrowers financial position, and credit history are examples of some         factors that may affect rates or terms.</p>
						            <p>The mortgage brokerage and its representative's role and obligations         to the borrower and the lender will vary depending on the nature of the         service relationship between the mortgage brokerage as well as the lender         or borrower. This is not intended to be an all inclusive list however in         general terms it best describes the mortgage brokerage's role and         resulting obligations to you. You are strongly encouraged to discuss         this document with your mortgage brokerage representative and ask any         questions you may have.</p>
						            <p>A mortgage broker can be described as the mastermind between a borrower         and a lender with the goal of originating a mortgage loan. Typically,         a mortgage broker draws from a pool of various lenders to find the right         match; however, it is important to know that some mortgage brokers only         do business with one lender.</p>
						            <p>We, as a Mortgage Brokerage, will act as an INTERMEDIARY between the         borrower and the lender(s) who have authorized us to offer their mortgage         products to borrowers who are seeking a mortgage. Some of our duties to         the borrower are to be honest, exercise reasonable care and skill, gather         your intended property and financial information to determine the lending         options available to you, disclose and explain appropriate options for         your consideration, completed and submit documentation to the lender,         and keep you informed of the progress of your application.  Some of our         duties to the lender are to be honest, exercise reasonable care and skill,         complete and submit documentation to the lender, disclose what steps were         taken to verify information and documentation as part of the application         process, and keep the lender informed of the progress of the application.         The products this brokerage will offer will be from Multiple Lenders.</p>
						            <p>The brokerage and its brokers will be compensated for this mortgage         transaction by way of commission/income or fee paid directly by the lender         and, as well,  may also receive monies or non-monetary benefits from the         lender which can include additional commission of income based on volume         of business with a particular lender.</p>
						            <p>As outlined above, there is a variety of options in obtaining a         mortgage, however if,  for some reason the brokerage must charge you         a fee to arrange your mortgage there may be no refund. When obtaining         a mortgage there can be additional fees that you might be required to         pay such as: property appraisal, default mortgage insurance, title         insurance, legal fees, etc.</p>
						            <p>The brokerage will be paying a referral fee when this mortgage is placed.</p>
															
								</div>
								</div>
							
						</div>

						<br> <label class="form-label form-label-top" id="label_35"
							for="input_35"> Are you using a device with a touch
							screen currently? </label><font color="red">*</font> <br>
							<br>
							<div class="btn-group">
								<label style="width: 180px" class="btn btn-primary"
									btn-radio="'yes'" ng-change="change()" ng-model="company">
									Yes </label> <label style="width: 180px" class="btn btn-primary"
									btn-radio="'no'" ng-change="change()" ng-model="company">
									No </label> <br> <br>


							</div> 
							<div id="touchScreen1">
							</div>
							<input type="hidden" id="role" name="touchScreen"
							value=""""),format.raw/*256.15*/("""{"""),format.raw/*256.16*/("""{"""),format.raw/*256.17*/("""company"""),format.raw/*256.24*/("""}"""),format.raw/*256.25*/("""}"""),format.raw/*256.26*/("""">
							<input type="hidden" id="role12" name="touch_Screen"
                            value=""""),format.raw/*258.36*/("""{"""),format.raw/*258.37*/("""{"""),format.raw/*258.38*/("""role12"""),format.raw/*258.44*/("""}"""),format.raw/*258.45*/("""}"""),format.raw/*258.46*/("""">
							 <br><br>
							 <!-- <label	class="form-label form-label-right" id="label_41" for="input_41">
							I agree to the terms and conditions<font color="red">*</font>
							</label> <input type="checkbox" name="agreeCUT" style="height: 30%;" size="20" required> <br>
							<div id="agree1"></div> -->
						<div class="row">
							<div class="col-sm-5">
								<label>I agree to the terms and conditions<font
									color="red">*</font></label>
							</div>
							<div class="col-sm-4" style="padding-left: 0%;">
								<div class="switch demo3 col-sm-4">
									<input type="checkbox" name="agree"> <label><i></i></label>
								</div>
							</div>
						</div>
						<div id="agree1"></div>
					<br>
							<br>
						
								
								<div ng-show="company == 'yes'">
								
								<label class="form-label form-label-left form-label-auto"
									id="label_444" for="input_445">"""),_display_(/*283.42*/applicantName),format.raw/*283.55*/(""" """),format.raw/*283.56*/("""'s Signature </label>
								<div class="row">
									<div class="col-md-12">
										<canvas id="sig-canvas1" width="620" height="160"> Get
										a better browser, bro. </canvas>
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">

										<label class="btn btn-default" id="sig-clearBtn1">
											Clear Signature</label>
									</div>
								</div>
								<div id="sign1"></div>
								<br />
								</div>
								<div    ng-show="company == 'yes' && role12=='yes' ">
								<div class="row">
									<div class="col-md-12">
										<textarea style="display: none;" id="sig-dataUrl1"
											class="form-control" rows="5" name="sign1">
											</textarea>
									</div>
								</div>
								
								<label class="form-label form-label-left form-label-auto"
									id="label_446" for="input_446"> """),_display_(/*310.43*/coApplicantName),format.raw/*310.58*/(""" """),format.raw/*310.59*/("""'s Signature </label>
								<div class="row">
									<div class="col-md-12">
										<canvas id="sig-canvas2" width="620" height="160"> Get
										a better browser, bro. </canvas>
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										<label class="btn btn-default" id="sig-clearBtn2">
											Clear Signature</label>
									</div>
								</div>
								<div id="sign2"></div>
								<br />
								<div class="row">
									<div class="col-md-12">
										<textarea style="display: none;" id="sig-dataUrl2"
											class="form-control" rows="5" name="sign2">
											</textarea>
									</div>
								</div>
                            
							</div>
							
								<div ng-if="company == 'no' && role12=='no'">
									<label>
									<Strong>"""),_display_(/*337.19*/applicantName),format.raw/*337.32*/("""</Strong><br>
									<Strong> My typed name below
											serves as my electronic signature for the above agreement. </Strong> <span
										style="color: red; font-size: 3">*</span> </label> <input type="text"
										name="typedName1" class="form-control" >
										
								</div>
								<div id="typedName1"></div>

						<div ng-if="company == 'no' && role12=='yes'">

							<label> <strong>"""),_display_(/*348.25*/applicantName),format.raw/*348.38*/("""</strong><br> <Strong>
									My typed name below serves as my electronic signature for the
									above agreement. </Strong> <span style="color: red; font-size: 3">*</span>
							</label> <input type="text" name="typedName1" class="form-control">
							<div id="div_typedName1"></div>

							<label> <Strong>"""),_display_(/*354.25*/coApplicantName),format.raw/*354.40*/("""</Strong><br> <Strong>
									My typed name below serves as my electronic signature for the
									above agreement. </Strong> <span style="color: red; font-size: 3">*</span>
							</label> <input type="text" name="typedName2" class="form-control">
							<div id="div_typedName2"></div>
						</div>

						<br> <br>

						
						<div class="row" style="width: 100%;">
							<div class="col-sm-6"
								style="float: left; padding-left: 2%; width: 45%;">
								<a href="mortgageBackPage11" class="btn btn-primary"
									role="button" style="width: 50%;">Back</a>
							</div>
							<div class="col-sm-6" align="right"
								style="float: right; padding-right: 5%; width: 45%;">
								<input type="submit" class="btn btn-primary btn-block"
									value="Next" style="width: 50%;" id="sig-submitBtn">
								<div align="right" id="submiterror">
									<font color="red"></font>
								</div>
							</div>
						</div> 


						<br>
						<div class="container" style="width: 70%;">
						  <div class="progress">
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:99%; background-color: #6AA84F;">
						    <label>99% complete</label>
						    </div>
						  </div>
						</div>

								<div style="padding-bottom: 50px;"></div>
							</div>
							<div class="col-sm-3"></div>
					</div>
				</div>
</form>


				<script src=""""),_display_(/*398.19*/routes/*398.25*/.Assets.at("_resources/signature_pad.js")),format.raw/*398.66*/(""""></script>
				<script src=""""),_display_(/*399.19*/routes/*399.25*/.Assets.at("_resources/app.js")),format.raw/*399.56*/(""""></script>

				<script>
					$(document).ready(function() """),format.raw/*402.35*/("""{"""),format.raw/*402.36*/("""
						"""),format.raw/*403.7*/("""$('[data-toggle="tooltip"]').tooltip();
					"""),format.raw/*404.6*/("""}"""),format.raw/*404.7*/(""");
				</script>


				<script type="text/javascript">
					var app = angular.module("demoApp", [ 'ui.bootstrap' ]);

					app.controller('DemoController', function($scope) """),format.raw/*411.56*/("""{"""),format.raw/*411.57*/("""
						"""),format.raw/*412.7*/("""init();
						function init() """),format.raw/*413.23*/("""{"""),format.raw/*413.24*/("""
							"""),format.raw/*414.8*/("""$scope.newItemType = '';
							$scope.company = "";
							$scope.change = function() """),format.raw/*416.35*/("""{"""),format.raw/*416.36*/("""
								"""),format.raw/*417.9*/("""console.log($scope.newItemType)
							"""),format.raw/*418.8*/("""}"""),format.raw/*418.9*/(""";
						"""),format.raw/*419.7*/("""}"""),format.raw/*419.8*/("""
					"""),format.raw/*420.6*/("""}"""),format.raw/*420.7*/(""");
				</script>

				<script src="https://code.jquery.com/jquery-2.1.0.min.js"></script>
				<script
					src="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
				<!--<script src="https://code.angularjs.org/snapshot/angular.min.js"></script>-->
				<script>
					(function() """),format.raw/*428.18*/("""{"""),format.raw/*428.19*/("""

						"""),format.raw/*430.7*/("""// Get a regular interval for drawing to the screen
						window.requestAnimFrame = (function(callback) """),format.raw/*431.53*/("""{"""),format.raw/*431.54*/("""
							"""),format.raw/*432.8*/("""return window.requestAnimationFrame
									|| window.webkitRequestAnimationFrame
									|| window.mozRequestAnimationFrame
									|| window.oRequestAnimationFrame
									|| window.msRequestAnimaitonFrame
									|| function(callback) """),format.raw/*437.32*/("""{"""),format.raw/*437.33*/("""
										"""),format.raw/*438.11*/("""window.setTimeout(callback, 1000 / 60);
									"""),format.raw/*439.10*/("""}"""),format.raw/*439.11*/(""";
						"""),format.raw/*440.7*/("""}"""),format.raw/*440.8*/(""")();

						// Set up the canvas
						var canvas = document.getElementById("sig-canvas");
						var ctx = canvas.getContext("2d");
						ctx.strokeStyle = "#222222";
						ctx.lineWith = 2;

						// Set up the UI
						var sigText = document.getElementById("sig-dataUrl");
						var sigImage = document.getElementById("sig-image");
						var clearBtn = document.getElementById("sig-clearBtn");
						var submitBtn = document
								.getElementById("sig-submitBtn");
						clearBtn
								.addEventListener(
										"click",
										function(e) """),format.raw/*457.23*/("""{"""),format.raw/*457.24*/("""
											"""),format.raw/*458.12*/("""clearCanvas();
											sigText.innerHTML = "Data URL for your signature will go here!";
											sigImage.setAttribute("src", "");
										"""),format.raw/*461.11*/("""}"""),format.raw/*461.12*/(""", false);
						submitBtn.addEventListener("click", function(e) """),format.raw/*462.55*/("""{"""),format.raw/*462.56*/("""
							"""),format.raw/*463.8*/("""var dataUrl = canvas.toDataURL();
							sigText.innerHTML = dataUrl;
							sigImage.setAttribute("src", dataUrl);
						"""),format.raw/*466.7*/("""}"""),format.raw/*466.8*/(""", false);

						// Set up mouse events for drawing
						var drawing = false;
						var mousePos = """),format.raw/*470.22*/("""{"""),format.raw/*470.23*/("""
							"""),format.raw/*471.8*/("""x : 0,
							y : 0
						"""),format.raw/*473.7*/("""}"""),format.raw/*473.8*/(""";
						var lastPos = mousePos;
						canvas.addEventListener("mousedown", function(e) """),format.raw/*475.56*/("""{"""),format.raw/*475.57*/("""
							"""),format.raw/*476.8*/("""drawing = true;
							lastPos = getMousePos(canvas, e);
						"""),format.raw/*478.7*/("""}"""),format.raw/*478.8*/(""", false);
						canvas.addEventListener("mouseup", function(e) """),format.raw/*479.54*/("""{"""),format.raw/*479.55*/("""
							"""),format.raw/*480.8*/("""drawing = false;
						"""),format.raw/*481.7*/("""}"""),format.raw/*481.8*/(""", false);
						canvas.addEventListener("mousemove", function(e) """),format.raw/*482.56*/("""{"""),format.raw/*482.57*/("""
							"""),format.raw/*483.8*/("""mousePos = getMousePos(canvas, e);
						"""),format.raw/*484.7*/("""}"""),format.raw/*484.8*/(""", false);

						// Set up touch events for mobile, etc
						canvas.addEventListener("touchstart", function(e) """),format.raw/*487.57*/("""{"""),format.raw/*487.58*/("""
							"""),format.raw/*488.8*/("""mousePos = getTouchPos(canvas, e);
							var touch = e.touches[0];
							var mouseEvent = new MouseEvent("mousedown", """),format.raw/*490.53*/("""{"""),format.raw/*490.54*/("""
								"""),format.raw/*491.9*/("""clientX : touch.clientX,
								clientY : touch.clientY
							"""),format.raw/*493.8*/("""}"""),format.raw/*493.9*/(""");
							canvas.dispatchEvent(mouseEvent);
						"""),format.raw/*495.7*/("""}"""),format.raw/*495.8*/(""", false);
						canvas.addEventListener("touchend", function(e) """),format.raw/*496.55*/("""{"""),format.raw/*496.56*/("""
							"""),format.raw/*497.8*/("""var mouseEvent = new MouseEvent("mouseup", """),format.raw/*497.51*/("""{"""),format.raw/*497.52*/("""}"""),format.raw/*497.53*/(""");
							canvas.dispatchEvent(mouseEvent);
						"""),format.raw/*499.7*/("""}"""),format.raw/*499.8*/(""", false);
						canvas.addEventListener("touchmove", function(e) """),format.raw/*500.56*/("""{"""),format.raw/*500.57*/("""
							"""),format.raw/*501.8*/("""var touch = e.touches[0];
							var mouseEvent = new MouseEvent("mousemove", """),format.raw/*502.53*/("""{"""),format.raw/*502.54*/("""
								"""),format.raw/*503.9*/("""clientX : touch.clientX,
								clientY : touch.clientY
							"""),format.raw/*505.8*/("""}"""),format.raw/*505.9*/(""");
							canvas.dispatchEvent(mouseEvent);
						"""),format.raw/*507.7*/("""}"""),format.raw/*507.8*/(""", false);

						// Prevent scrolling when touching the canvas
						document.body.addEventListener("touchstart",
								function(e) """),format.raw/*511.21*/("""{"""),format.raw/*511.22*/("""
									"""),format.raw/*512.10*/("""if (e.target == canvas) """),format.raw/*512.34*/("""{"""),format.raw/*512.35*/("""
										"""),format.raw/*513.11*/("""e.preventDefault();
									"""),format.raw/*514.10*/("""}"""),format.raw/*514.11*/("""
								"""),format.raw/*515.9*/("""}"""),format.raw/*515.10*/(""", false);
						document.body.addEventListener("touchend", function(e) """),format.raw/*516.62*/("""{"""),format.raw/*516.63*/("""
							"""),format.raw/*517.8*/("""if (e.target == canvas) """),format.raw/*517.32*/("""{"""),format.raw/*517.33*/("""
								"""),format.raw/*518.9*/("""e.preventDefault();
							"""),format.raw/*519.8*/("""}"""),format.raw/*519.9*/("""
						"""),format.raw/*520.7*/("""}"""),format.raw/*520.8*/(""", false);
						document.body.addEventListener("touchmove",
								function(e) """),format.raw/*522.21*/("""{"""),format.raw/*522.22*/("""
									"""),format.raw/*523.10*/("""if (e.target == canvas) """),format.raw/*523.34*/("""{"""),format.raw/*523.35*/("""
										"""),format.raw/*524.11*/("""e.preventDefault();
									"""),format.raw/*525.10*/("""}"""),format.raw/*525.11*/("""
								"""),format.raw/*526.9*/("""}"""),format.raw/*526.10*/(""", false);

						// Get the position of the mouse relative to the canvas
						function getMousePos(canvasDom, mouseEvent) """),format.raw/*529.51*/("""{"""),format.raw/*529.52*/("""
							"""),format.raw/*530.8*/("""var rect = canvasDom.getBoundingClientRect();
							return """),format.raw/*531.15*/("""{"""),format.raw/*531.16*/("""
								"""),format.raw/*532.9*/("""x : mouseEvent.clientX - rect.left,
								y : mouseEvent.clientY - rect.top
							"""),format.raw/*534.8*/("""}"""),format.raw/*534.9*/(""";
						"""),format.raw/*535.7*/("""}"""),format.raw/*535.8*/("""

						"""),format.raw/*537.7*/("""// Get the position of a touch relative to the canvas
						function getTouchPos(canvasDom, touchEvent) """),format.raw/*538.51*/("""{"""),format.raw/*538.52*/("""
							"""),format.raw/*539.8*/("""var rect = canvasDom.getBoundingClientRect();
							return """),format.raw/*540.15*/("""{"""),format.raw/*540.16*/("""
								"""),format.raw/*541.9*/("""x : touchEvent.touches[0].clientX - rect.left,
								y : touchEvent.touches[0].clientY - rect.top
							"""),format.raw/*543.8*/("""}"""),format.raw/*543.9*/(""";
						"""),format.raw/*544.7*/("""}"""),format.raw/*544.8*/("""

						"""),format.raw/*546.7*/("""// Draw to the canvas
						function renderCanvas() """),format.raw/*547.31*/("""{"""),format.raw/*547.32*/("""
							"""),format.raw/*548.8*/("""if (drawing) """),format.raw/*548.21*/("""{"""),format.raw/*548.22*/("""
								"""),format.raw/*549.9*/("""ctx.moveTo(lastPos.x, lastPos.y);
								ctx.lineTo(mousePos.x, mousePos.y);
								ctx.stroke();
								lastPos = mousePos;
							"""),format.raw/*553.8*/("""}"""),format.raw/*553.9*/("""
						"""),format.raw/*554.7*/("""}"""),format.raw/*554.8*/("""

						"""),format.raw/*556.7*/("""// Clear the canvas
						function clearCanvas() """),format.raw/*557.30*/("""{"""),format.raw/*557.31*/("""
							"""),format.raw/*558.8*/("""canvas.width = canvas.width;
						"""),format.raw/*559.7*/("""}"""),format.raw/*559.8*/("""

						"""),format.raw/*561.7*/("""// Allow for animation
						(function drawLoop() """),format.raw/*562.28*/("""{"""),format.raw/*562.29*/("""
							"""),format.raw/*563.8*/("""requestAnimFrame(drawLoop);
							renderCanvas();
						"""),format.raw/*565.7*/("""}"""),format.raw/*565.8*/(""")();

					"""),format.raw/*567.6*/("""}"""),format.raw/*567.7*/(""")();
				</script>
				
				<script>
					(function() """),format.raw/*571.18*/("""{"""),format.raw/*571.19*/("""

						"""),format.raw/*573.7*/("""// Get a regular interval for drawing to the screen
						window.requestAnimFrame = (function(callback) """),format.raw/*574.53*/("""{"""),format.raw/*574.54*/("""
							"""),format.raw/*575.8*/("""return window.requestAnimationFrame
									|| window.webkitRequestAnimationFrame
									|| window.mozRequestAnimationFrame
									|| window.oRequestAnimationFrame
									|| window.msRequestAnimaitonFrame
									|| function(callback) """),format.raw/*580.32*/("""{"""),format.raw/*580.33*/("""
										"""),format.raw/*581.11*/("""window.setTimeout(callback, 1000 / 60);
									"""),format.raw/*582.10*/("""}"""),format.raw/*582.11*/(""";
						"""),format.raw/*583.7*/("""}"""),format.raw/*583.8*/(""")();

						// Set up the canvas
						var canvas = document.getElementById("sig-canvas1");
						var ctx = canvas.getContext("2d");
						ctx.strokeStyle = "#222222";
						ctx.lineWith = 2;

						// Set up the UI
						var sigText = document.getElementById("sig-dataUrl1");
						var sigImage = document.getElementById("sig-image1");
						var clearBtn = document.getElementById("sig-clearBtn1");
						var submitBtn = document
								.getElementById("sig-submitBtn");
						clearBtn
								.addEventListener(
										"click",
										function(e) """),format.raw/*600.23*/("""{"""),format.raw/*600.24*/("""
											"""),format.raw/*601.12*/("""clearCanvas();
											sigText.innerHTML = "Data URL for your signature will go here!";
											sigImage.setAttribute("src", "");
										"""),format.raw/*604.11*/("""}"""),format.raw/*604.12*/(""", false);
						submitBtn.addEventListener("click", function(e) """),format.raw/*605.55*/("""{"""),format.raw/*605.56*/("""
							"""),format.raw/*606.8*/("""var dataUrl = canvas.toDataURL();
							sigText.innerHTML = dataUrl;
							sigImage.setAttribute("src", dataUrl);
						"""),format.raw/*609.7*/("""}"""),format.raw/*609.8*/(""", false);

						// Set up mouse events for drawing
						var drawing = false;
						var mousePos = """),format.raw/*613.22*/("""{"""),format.raw/*613.23*/("""
							"""),format.raw/*614.8*/("""x : 0,
							y : 0
						"""),format.raw/*616.7*/("""}"""),format.raw/*616.8*/(""";
						var lastPos = mousePos;
						canvas.addEventListener("mousedown", function(e) """),format.raw/*618.56*/("""{"""),format.raw/*618.57*/("""
							"""),format.raw/*619.8*/("""drawing = true;
							lastPos = getMousePos(canvas, e);
						"""),format.raw/*621.7*/("""}"""),format.raw/*621.8*/(""", false);
						canvas.addEventListener("mouseup", function(e) """),format.raw/*622.54*/("""{"""),format.raw/*622.55*/("""
							"""),format.raw/*623.8*/("""drawing = false;
						"""),format.raw/*624.7*/("""}"""),format.raw/*624.8*/(""", false);
						canvas.addEventListener("mousemove", function(e) """),format.raw/*625.56*/("""{"""),format.raw/*625.57*/("""
							"""),format.raw/*626.8*/("""mousePos = getMousePos(canvas, e);
						"""),format.raw/*627.7*/("""}"""),format.raw/*627.8*/(""", false);

						// Set up touch events for mobile, etc
						canvas.addEventListener("touchstart", function(e) """),format.raw/*630.57*/("""{"""),format.raw/*630.58*/("""
							"""),format.raw/*631.8*/("""mousePos = getTouchPos(canvas, e);
							var touch = e.touches[0];
							var mouseEvent = new MouseEvent("mousedown", """),format.raw/*633.53*/("""{"""),format.raw/*633.54*/("""
								"""),format.raw/*634.9*/("""clientX : touch.clientX,
								clientY : touch.clientY
							"""),format.raw/*636.8*/("""}"""),format.raw/*636.9*/(""");
							canvas.dispatchEvent(mouseEvent);
						"""),format.raw/*638.7*/("""}"""),format.raw/*638.8*/(""", false);
						canvas.addEventListener("touchend", function(e) """),format.raw/*639.55*/("""{"""),format.raw/*639.56*/("""
							"""),format.raw/*640.8*/("""var mouseEvent = new MouseEvent("mouseup", """),format.raw/*640.51*/("""{"""),format.raw/*640.52*/("""}"""),format.raw/*640.53*/(""");
							canvas.dispatchEvent(mouseEvent);
						"""),format.raw/*642.7*/("""}"""),format.raw/*642.8*/(""", false);
						canvas.addEventListener("touchmove", function(e) """),format.raw/*643.56*/("""{"""),format.raw/*643.57*/("""
							"""),format.raw/*644.8*/("""var touch = e.touches[0];
							var mouseEvent = new MouseEvent("mousemove", """),format.raw/*645.53*/("""{"""),format.raw/*645.54*/("""
								"""),format.raw/*646.9*/("""clientX : touch.clientX,
								clientY : touch.clientY
							"""),format.raw/*648.8*/("""}"""),format.raw/*648.9*/(""");
							canvas.dispatchEvent(mouseEvent);
						"""),format.raw/*650.7*/("""}"""),format.raw/*650.8*/(""", false);

						// Prevent scrolling when touching the canvas
						document.body.addEventListener("touchstart",
								function(e) """),format.raw/*654.21*/("""{"""),format.raw/*654.22*/("""
									"""),format.raw/*655.10*/("""if (e.target == canvas) """),format.raw/*655.34*/("""{"""),format.raw/*655.35*/("""
										"""),format.raw/*656.11*/("""e.preventDefault();
									"""),format.raw/*657.10*/("""}"""),format.raw/*657.11*/("""
								"""),format.raw/*658.9*/("""}"""),format.raw/*658.10*/(""", false);
						document.body.addEventListener("touchend", function(e) """),format.raw/*659.62*/("""{"""),format.raw/*659.63*/("""
							"""),format.raw/*660.8*/("""if (e.target == canvas) """),format.raw/*660.32*/("""{"""),format.raw/*660.33*/("""
								"""),format.raw/*661.9*/("""e.preventDefault();
							"""),format.raw/*662.8*/("""}"""),format.raw/*662.9*/("""
						"""),format.raw/*663.7*/("""}"""),format.raw/*663.8*/(""", false);
						document.body.addEventListener("touchmove",
								function(e) """),format.raw/*665.21*/("""{"""),format.raw/*665.22*/("""
									"""),format.raw/*666.10*/("""if (e.target == canvas) """),format.raw/*666.34*/("""{"""),format.raw/*666.35*/("""
										"""),format.raw/*667.11*/("""e.preventDefault();
									"""),format.raw/*668.10*/("""}"""),format.raw/*668.11*/("""
								"""),format.raw/*669.9*/("""}"""),format.raw/*669.10*/(""", false);

						// Get the position of the mouse relative to the canvas
						function getMousePos(canvasDom, mouseEvent) """),format.raw/*672.51*/("""{"""),format.raw/*672.52*/("""
							"""),format.raw/*673.8*/("""var rect = canvasDom.getBoundingClientRect();
							return """),format.raw/*674.15*/("""{"""),format.raw/*674.16*/("""
								"""),format.raw/*675.9*/("""x : mouseEvent.clientX - rect.left,
								y : mouseEvent.clientY - rect.top
							"""),format.raw/*677.8*/("""}"""),format.raw/*677.9*/(""";
						"""),format.raw/*678.7*/("""}"""),format.raw/*678.8*/("""

						"""),format.raw/*680.7*/("""// Get the position of a touch relative to the canvas
						function getTouchPos(canvasDom, touchEvent) """),format.raw/*681.51*/("""{"""),format.raw/*681.52*/("""
							"""),format.raw/*682.8*/("""var rect = canvasDom.getBoundingClientRect();
							return """),format.raw/*683.15*/("""{"""),format.raw/*683.16*/("""
								"""),format.raw/*684.9*/("""x : touchEvent.touches[0].clientX - rect.left,
								y : touchEvent.touches[0].clientY - rect.top
							"""),format.raw/*686.8*/("""}"""),format.raw/*686.9*/(""";
						"""),format.raw/*687.7*/("""}"""),format.raw/*687.8*/("""

						"""),format.raw/*689.7*/("""// Draw to the canvas
						function renderCanvas() """),format.raw/*690.31*/("""{"""),format.raw/*690.32*/("""
							"""),format.raw/*691.8*/("""if (drawing) """),format.raw/*691.21*/("""{"""),format.raw/*691.22*/("""
								"""),format.raw/*692.9*/("""ctx.moveTo(lastPos.x, lastPos.y);
								ctx.lineTo(mousePos.x, mousePos.y);
								ctx.stroke();
								lastPos = mousePos;
							"""),format.raw/*696.8*/("""}"""),format.raw/*696.9*/("""
						"""),format.raw/*697.7*/("""}"""),format.raw/*697.8*/("""

						"""),format.raw/*699.7*/("""// Clear the canvas
						function clearCanvas() """),format.raw/*700.30*/("""{"""),format.raw/*700.31*/("""
							"""),format.raw/*701.8*/("""canvas.width = canvas.width;
						"""),format.raw/*702.7*/("""}"""),format.raw/*702.8*/("""

						"""),format.raw/*704.7*/("""// Allow for animation
						(function drawLoop() """),format.raw/*705.28*/("""{"""),format.raw/*705.29*/("""
							"""),format.raw/*706.8*/("""requestAnimFrame(drawLoop);
							renderCanvas();
						"""),format.raw/*708.7*/("""}"""),format.raw/*708.8*/(""")();

					"""),format.raw/*710.6*/("""}"""),format.raw/*710.7*/(""")();
				</script>
				
				
				<script>
					(function() """),format.raw/*715.18*/("""{"""),format.raw/*715.19*/("""

						"""),format.raw/*717.7*/("""// Get a regular interval for drawing to the screen
						window.requestAnimFrame = (function(callback) """),format.raw/*718.53*/("""{"""),format.raw/*718.54*/("""
							"""),format.raw/*719.8*/("""return window.requestAnimationFrame
									|| window.webkitRequestAnimationFrame
									|| window.mozRequestAnimationFrame
									|| window.oRequestAnimationFrame
									|| window.msRequestAnimaitonFrame
									|| function(callback) """),format.raw/*724.32*/("""{"""),format.raw/*724.33*/("""
										"""),format.raw/*725.11*/("""window.setTimeout(callback, 1000 / 60);
									"""),format.raw/*726.10*/("""}"""),format.raw/*726.11*/(""";
						"""),format.raw/*727.7*/("""}"""),format.raw/*727.8*/(""")();

						// Set up the canvas
						var canvas = document.getElementById("sig-canvas2");
						var ctx = canvas.getContext("2d");
						ctx.strokeStyle = "#222222";
						ctx.lineWith = 2;

						// Set up the UI
						var sigText = document.getElementById("sig-dataUrl2");
						var sigImage = document.getElementById("sig-image");
						var clearBtn = document.getElementById("sig-clearBtn2");
						var submitBtn = document
								.getElementById("sig-submitBtn");
						clearBtn
								.addEventListener(
										"click",
										function(e) """),format.raw/*744.23*/("""{"""),format.raw/*744.24*/("""
											"""),format.raw/*745.12*/("""clearCanvas();
											sigText.innerHTML = "Data URL for your signature will go here!";
											sigImage.setAttribute("src", "");
										"""),format.raw/*748.11*/("""}"""),format.raw/*748.12*/(""", false);
						submitBtn.addEventListener("click", function(e) """),format.raw/*749.55*/("""{"""),format.raw/*749.56*/("""
							"""),format.raw/*750.8*/("""var dataUrl = canvas.toDataURL();
							sigText.innerHTML = dataUrl;
							sigImage.setAttribute("src", dataUrl);
						"""),format.raw/*753.7*/("""}"""),format.raw/*753.8*/(""", false);

						// Set up mouse events for drawing
						var drawing = false;
						var mousePos = """),format.raw/*757.22*/("""{"""),format.raw/*757.23*/("""
							"""),format.raw/*758.8*/("""x : 0,
							y : 0
						"""),format.raw/*760.7*/("""}"""),format.raw/*760.8*/(""";
						var lastPos = mousePos;
						canvas.addEventListener("mousedown", function(e) """),format.raw/*762.56*/("""{"""),format.raw/*762.57*/("""
							"""),format.raw/*763.8*/("""drawing = true;
							lastPos = getMousePos(canvas, e);
						"""),format.raw/*765.7*/("""}"""),format.raw/*765.8*/(""", false);
						canvas.addEventListener("mouseup", function(e) """),format.raw/*766.54*/("""{"""),format.raw/*766.55*/("""
							"""),format.raw/*767.8*/("""drawing = false;
						"""),format.raw/*768.7*/("""}"""),format.raw/*768.8*/(""", false);
						canvas.addEventListener("mousemove", function(e) """),format.raw/*769.56*/("""{"""),format.raw/*769.57*/("""
							"""),format.raw/*770.8*/("""mousePos = getMousePos(canvas, e);
						"""),format.raw/*771.7*/("""}"""),format.raw/*771.8*/(""", false);

						// Set up touch events for mobile, etc
						canvas.addEventListener("touchstart", function(e) """),format.raw/*774.57*/("""{"""),format.raw/*774.58*/("""
							"""),format.raw/*775.8*/("""mousePos = getTouchPos(canvas, e);
							var touch = e.touches[0];
							var mouseEvent = new MouseEvent("mousedown", """),format.raw/*777.53*/("""{"""),format.raw/*777.54*/("""
								"""),format.raw/*778.9*/("""clientX : touch.clientX,
								clientY : touch.clientY
							"""),format.raw/*780.8*/("""}"""),format.raw/*780.9*/(""");
							canvas.dispatchEvent(mouseEvent);
						"""),format.raw/*782.7*/("""}"""),format.raw/*782.8*/(""", false);
						canvas.addEventListener("touchend", function(e) """),format.raw/*783.55*/("""{"""),format.raw/*783.56*/("""
							"""),format.raw/*784.8*/("""var mouseEvent = new MouseEvent("mouseup", """),format.raw/*784.51*/("""{"""),format.raw/*784.52*/("""}"""),format.raw/*784.53*/(""");
							canvas.dispatchEvent(mouseEvent);
						"""),format.raw/*786.7*/("""}"""),format.raw/*786.8*/(""", false);
						canvas.addEventListener("touchmove", function(e) """),format.raw/*787.56*/("""{"""),format.raw/*787.57*/("""
							"""),format.raw/*788.8*/("""var touch = e.touches[0];
							var mouseEvent = new MouseEvent("mousemove", """),format.raw/*789.53*/("""{"""),format.raw/*789.54*/("""
								"""),format.raw/*790.9*/("""clientX : touch.clientX,
								clientY : touch.clientY
							"""),format.raw/*792.8*/("""}"""),format.raw/*792.9*/(""");
							canvas.dispatchEvent(mouseEvent);
						"""),format.raw/*794.7*/("""}"""),format.raw/*794.8*/(""", false);

						// Prevent scrolling when touching the canvas
						document.body.addEventListener("touchstart",
								function(e) """),format.raw/*798.21*/("""{"""),format.raw/*798.22*/("""
									"""),format.raw/*799.10*/("""if (e.target == canvas) """),format.raw/*799.34*/("""{"""),format.raw/*799.35*/("""
										"""),format.raw/*800.11*/("""e.preventDefault();
									"""),format.raw/*801.10*/("""}"""),format.raw/*801.11*/("""
								"""),format.raw/*802.9*/("""}"""),format.raw/*802.10*/(""", false);
						document.body.addEventListener("touchend", function(e) """),format.raw/*803.62*/("""{"""),format.raw/*803.63*/("""
							"""),format.raw/*804.8*/("""if (e.target == canvas) """),format.raw/*804.32*/("""{"""),format.raw/*804.33*/("""
								"""),format.raw/*805.9*/("""e.preventDefault();
							"""),format.raw/*806.8*/("""}"""),format.raw/*806.9*/("""
						"""),format.raw/*807.7*/("""}"""),format.raw/*807.8*/(""", false);
						document.body.addEventListener("touchmove",
								function(e) """),format.raw/*809.21*/("""{"""),format.raw/*809.22*/("""
									"""),format.raw/*810.10*/("""if (e.target == canvas) """),format.raw/*810.34*/("""{"""),format.raw/*810.35*/("""
										"""),format.raw/*811.11*/("""e.preventDefault();
									"""),format.raw/*812.10*/("""}"""),format.raw/*812.11*/("""
								"""),format.raw/*813.9*/("""}"""),format.raw/*813.10*/(""", false);

						// Get the position of the mouse relative to the canvas
						function getMousePos(canvasDom, mouseEvent) """),format.raw/*816.51*/("""{"""),format.raw/*816.52*/("""
							"""),format.raw/*817.8*/("""var rect = canvasDom.getBoundingClientRect();
							return """),format.raw/*818.15*/("""{"""),format.raw/*818.16*/("""
								"""),format.raw/*819.9*/("""x : mouseEvent.clientX - rect.left,
								y : mouseEvent.clientY - rect.top
							"""),format.raw/*821.8*/("""}"""),format.raw/*821.9*/(""";
						"""),format.raw/*822.7*/("""}"""),format.raw/*822.8*/("""

						"""),format.raw/*824.7*/("""// Get the position of a touch relative to the canvas
						function getTouchPos(canvasDom, touchEvent) """),format.raw/*825.51*/("""{"""),format.raw/*825.52*/("""
							"""),format.raw/*826.8*/("""var rect = canvasDom.getBoundingClientRect();
							return """),format.raw/*827.15*/("""{"""),format.raw/*827.16*/("""
								"""),format.raw/*828.9*/("""x : touchEvent.touches[0].clientX - rect.left,
								y : touchEvent.touches[0].clientY - rect.top
							"""),format.raw/*830.8*/("""}"""),format.raw/*830.9*/(""";
						"""),format.raw/*831.7*/("""}"""),format.raw/*831.8*/("""

						"""),format.raw/*833.7*/("""// Draw to the canvas
						function renderCanvas() """),format.raw/*834.31*/("""{"""),format.raw/*834.32*/("""
							"""),format.raw/*835.8*/("""if (drawing) """),format.raw/*835.21*/("""{"""),format.raw/*835.22*/("""
								"""),format.raw/*836.9*/("""ctx.moveTo(lastPos.x, lastPos.y);
								ctx.lineTo(mousePos.x, mousePos.y);
								ctx.stroke();
								lastPos = mousePos;
							"""),format.raw/*840.8*/("""}"""),format.raw/*840.9*/("""
						"""),format.raw/*841.7*/("""}"""),format.raw/*841.8*/("""

						"""),format.raw/*843.7*/("""// Clear the canvas
						function clearCanvas() """),format.raw/*844.30*/("""{"""),format.raw/*844.31*/("""
							"""),format.raw/*845.8*/("""canvas.width = canvas.width;
						"""),format.raw/*846.7*/("""}"""),format.raw/*846.8*/("""

						"""),format.raw/*848.7*/("""// Allow for animation
						(function drawLoop() """),format.raw/*849.28*/("""{"""),format.raw/*849.29*/("""
							"""),format.raw/*850.8*/("""requestAnimFrame(drawLoop);
							renderCanvas();
						"""),format.raw/*852.7*/("""}"""),format.raw/*852.8*/(""")();

					"""),format.raw/*854.6*/("""}"""),format.raw/*854.7*/(""")();
				</script>
				
				
				
                
				
				<script type="text/javascript">
				
				function validateForm() """),format.raw/*863.29*/("""{"""),format.raw/*863.30*/("""
					 
					 """),format.raw/*865.7*/("""var fname=document.forms["myForm"]["touchScreen"].value;
					 var f_name=document.forms["myForm"]["touch_Screen"].value;
					 

						if(!fname)"""),format.raw/*869.17*/("""{"""),format.raw/*869.18*/("""
							"""),format.raw/*870.8*/("""document.getElementById("touchScreen1").innerHTML="<p style=\"color:red\">Please Select which Device Using </p>";
							document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

							return false;
						"""),format.raw/*874.7*/("""}"""),format.raw/*874.8*/("""else"""),format.raw/*874.12*/("""{"""),format.raw/*874.13*/("""
					    	"""),format.raw/*875.11*/("""document.getElementById("touchScreen1").innerHTML="";

						"""),format.raw/*877.7*/("""}"""),format.raw/*877.8*/(""" 
						
						"""),format.raw/*879.7*/("""var lname = document.forms["myForm"]["agree"].checked;
						if (!lname) """),format.raw/*880.19*/("""{"""),format.raw/*880.20*/("""
							
							"""),format.raw/*882.8*/("""document.getElementById("agree1").innerHTML = "<p style=\"color:red\">Please agree the condtion</p>";
							document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";
							return false;
						"""),format.raw/*885.7*/("""}"""),format.raw/*885.8*/(""" """),format.raw/*885.9*/("""else """),format.raw/*885.14*/("""{"""),format.raw/*885.15*/("""

							"""),format.raw/*887.8*/("""document.getElementById("agree1").innerHTML = "";

						"""),format.raw/*889.7*/("""}"""),format.raw/*889.8*/("""

						"""),format.raw/*891.7*/("""var typedName = document.forms["myForm"]["typedName"].value;
						var typedName1 = document.forms["myForm"]["typed_Name1"].value;
						var typedName2 = document.forms["myForm"]["typed_Name2"].value;

						if (!typedName && fname == 'no' && f_name == '0') """),format.raw/*895.57*/("""{"""),format.raw/*895.58*/("""

							"""),format.raw/*897.8*/("""document.getElementById("typedName1").innerHTML = "<p style=\"color:red\">Please enter the name</p>";
							document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

							return false;
						"""),format.raw/*901.7*/("""}"""),format.raw/*901.8*/(""" """),format.raw/*901.9*/("""else """),format.raw/*901.14*/("""{"""),format.raw/*901.15*/("""
							"""),format.raw/*902.8*/("""document.getElementById("typedName1").innerHTML = "";

						"""),format.raw/*904.7*/("""}"""),format.raw/*904.8*/("""

						"""),format.raw/*906.7*/("""if (!typedName1 && !typedName2 && fname == 'no'
								&& f_name == '1') """),format.raw/*907.27*/("""{"""),format.raw/*907.28*/("""

							"""),format.raw/*909.8*/("""document.getElementById("div_typedName1").innerHTML = "<p style=\"color:red\">Please enter the name</p>";
							document.getElementById("div_typedName2").innerHTML = "<p style=\"color:red\">Please enter the name</p>";
							document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

							return false;
						"""),format.raw/*914.7*/("""}"""),format.raw/*914.8*/(""" """),format.raw/*914.9*/("""else """),format.raw/*914.14*/("""{"""),format.raw/*914.15*/("""
							"""),format.raw/*915.8*/("""document.getElementById("div_typedName1").innerHTML = "";
							document.getElementById("div_typedName1").innerHTML = "";

						"""),format.raw/*918.7*/("""}"""),format.raw/*918.8*/("""

						"""),format.raw/*920.7*/("""var sign = document.forms["myForm"]["sign"].value;
						var sign11 = document.forms["myForm"]["sign11"].value;
						var sign3 = document.forms["myForm"]["sign3"].value;
						var sign22 = document.forms["myForm"]["sign22"].value;

						if (!sign && fname == 'yes' && f_name == '0') """),format.raw/*925.53*/("""{"""),format.raw/*925.54*/("""

							"""),format.raw/*927.8*/("""document.getElementById("sign1").innerHTML = "<p style=\"color:red\">Please write elctonic sign</p>";
							document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

							return false;
						"""),format.raw/*931.7*/("""}"""),format.raw/*931.8*/(""" """),format.raw/*931.9*/("""else """),format.raw/*931.14*/("""{"""),format.raw/*931.15*/("""
							"""),format.raw/*932.8*/("""document.getElementById("sign1").innerHTML = "";

						"""),format.raw/*934.7*/("""}"""),format.raw/*934.8*/("""
						"""),format.raw/*935.7*/("""if (!sign11 && !sign22 && fname == 'yes'
								&& f_name == '1') """),format.raw/*936.27*/("""{"""),format.raw/*936.28*/("""

							"""),format.raw/*938.8*/("""document.getElementById("div_sign1").innerHTML = "<p style=\"color:red\">Please write elctonic sign</p>";
							document.getElementById("div_sign2").innerHTML = "<p style=\"color:red\">Please write elctonic sign</p>";
							document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

							return false;
						"""),format.raw/*943.7*/("""}"""),format.raw/*943.8*/(""" """),format.raw/*943.9*/("""else """),format.raw/*943.14*/("""{"""),format.raw/*943.15*/("""
							"""),format.raw/*944.8*/("""document.getElementById("div_sign1").innerHTML = "";
							document.getElementById("div_sign1").innerHTML = "";

						"""),format.raw/*947.7*/("""}"""),format.raw/*947.8*/("""

					"""),format.raw/*949.6*/("""}"""),format.raw/*949.7*/("""
				"""),format.raw/*950.5*/("""</script>
</body>
</html>

"""))}
  }

  def render(role:String,additionalApplicant:String,referralId:Integer,applicantName:String,coApplicantName:String): play.twirl.api.HtmlFormat.Appendable = apply(role,additionalApplicant,referralId,applicantName,coApplicantName)

  def f:((String,String,Integer,String,String) => play.twirl.api.HtmlFormat.Appendable) = (role,additionalApplicant,referralId,applicantName,coApplicantName) => apply(role,additionalApplicant,referralId,applicantName,coApplicantName)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:19 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage12Disclose.scala.html
                  HASH: 2e1832acf0a99e9bc400733f37dd617163bf642f
                  MATRIX: 769->1|962->105|989->106|1275->366|1289->372|1345->408|1488->524|1503->530|1563->569|1616->595|1631->601|1701->650|1854->776|1869->782|1934->826|1987->852|2002->858|2054->889|2107->915|2122->921|2184->962|2407->1158|2422->1164|2485->1206|2528->1222|2543->1228|2605->1269|2690->1327|2705->1333|2765->1372|2841->1421|2856->1427|2911->1461|2987->1510|3002->1516|3060->1553|3120->1586|3135->1592|3198->1634|3352->1761|3380->1762|3409->1764|3478->1806|3506->1807|3536->1810|3577->1823|3606->1824|3635->1826|3675->1839|3703->1840|3732->1842|3772->1854|3801->1855|3830->1857|3959->1959|3987->1960|4016->1962|4057->1975|4086->1976|4115->1978|4244->2080|4272->2081|4301->2083|4342->2096|4371->2097|4400->2099|4529->2201|4557->2202|4586->2204|4657->2247|4686->2248|4716->2251|4859->2367|4887->2368|4916->2370|4951->2378|4980->2379|5010->2382|5057->2402|5085->2403|5114->2405|5156->2419|5185->2420|5215->2423|5311->2492|5339->2493|5368->2495|5410->2509|5439->2510|5469->2513|5645->2662|5673->2663|5702->2665|5758->2693|5787->2694|5818->2697|5876->2727|5905->2728|5935->2730|5984->2750|6014->2751|6045->2754|6141->2822|6170->2823|6200->2825|6255->2851|6285->2852|6316->2855|6431->2942|6460->2943|6490->2945|6546->2972|6576->2973|6607->2976|6741->3082|6770->3083|6801->3086|6875->3131|6905->3132|6937->3136|6980->3151|6996->3157|7052->3191|7103->3214|7132->3215|7161->3216|7276->3302|7306->3303|7348->3316|7408->3348|7438->3349|7508->3390|7538->3391|7580->3404|7638->3433|7668->3434|7714->3451|7785->3493|7815->3494|7854->3505|7884->3506|8008->3601|8038->3602|8072->3608|8129->3637|8158->3638|8354->3806|8370->3812|8432->3852|8874->4266|8900->4270|8939->4281|8980->4300|9172->4464|9204->4474|9282->4524|9308->4528|17358->12549|17388->12550|17418->12551|17454->12558|17484->12559|17514->12560|17641->12658|17671->12659|17701->12660|17736->12666|17766->12667|17796->12668|18733->13577|18768->13590|18798->13591|19702->14467|19739->14482|19769->14483|20618->15304|20653->15317|21091->15727|21126->15740|21471->16057|21508->16072|22968->17504|22984->17510|23047->17551|23105->17581|23121->17587|23174->17618|23263->17678|23293->17679|23328->17686|23401->17731|23430->17732|23632->17905|23662->17906|23697->17913|23756->17943|23786->17944|23822->17952|23938->18039|23968->18040|24005->18049|24072->18088|24101->18089|24137->18097|24166->18098|24200->18104|24229->18105|24565->18412|24595->18413|24631->18421|24764->18525|24794->18526|24830->18534|25102->18777|25132->18778|25172->18789|25250->18838|25280->18839|25316->18847|25345->18848|25926->19400|25956->19401|25997->19413|26172->19559|26202->19560|26295->19624|26325->19625|26361->19633|26511->19755|26540->19756|26669->19856|26699->19857|26735->19865|26789->19891|26818->19892|26934->19979|26964->19980|27000->19988|27091->20051|27120->20052|27212->20115|27242->20116|27278->20124|27329->20147|27358->20148|27452->20213|27482->20214|27518->20222|27587->20263|27616->20264|27757->20376|27787->20377|27823->20385|27972->20505|28002->20506|28039->20515|28131->20579|28160->20580|28238->20630|28267->20631|28360->20695|28390->20696|28426->20704|28498->20747|28528->20748|28558->20749|28636->20799|28665->20800|28759->20865|28789->20866|28825->20874|28932->20952|28962->20953|28999->20962|29091->21026|29120->21027|29198->21077|29227->21078|29390->21212|29420->21213|29459->21223|29512->21247|29542->21248|29582->21259|29640->21288|29670->21289|29707->21298|29737->21299|29837->21370|29867->21371|29903->21379|29956->21403|29986->21404|30023->21413|30078->21440|30107->21441|30142->21448|30171->21449|30280->21529|30310->21530|30349->21540|30402->21564|30432->21565|30472->21576|30530->21605|30560->21606|30597->21615|30627->21616|30779->21739|30809->21740|30845->21748|30934->21808|30964->21809|31001->21818|31114->21903|31143->21904|31179->21912|31208->21913|31244->21921|31377->22025|31407->22026|31443->22034|31532->22094|31562->22095|31599->22104|31734->22211|31763->22212|31799->22220|31828->22221|31864->22229|31945->22281|31975->22282|32011->22290|32053->22303|32083->22304|32120->22313|32283->22448|32312->22449|32347->22456|32376->22457|32412->22465|32490->22514|32520->22515|32556->22523|32619->22558|32648->22559|32684->22567|32763->22617|32793->22618|32829->22626|32914->22683|32943->22684|32982->22695|33011->22696|33094->22750|33124->22751|33160->22759|33293->22863|33323->22864|33359->22872|33631->23115|33661->23116|33701->23127|33779->23176|33809->23177|33845->23185|33874->23186|34459->23742|34489->23743|34530->23755|34705->23901|34735->23902|34828->23966|34858->23967|34894->23975|35044->24097|35073->24098|35202->24198|35232->24199|35268->24207|35322->24233|35351->24234|35467->24321|35497->24322|35533->24330|35624->24393|35653->24394|35745->24457|35775->24458|35811->24466|35862->24489|35891->24490|35985->24555|36015->24556|36051->24564|36120->24605|36149->24606|36290->24718|36320->24719|36356->24727|36505->24847|36535->24848|36572->24857|36664->24921|36693->24922|36771->24972|36800->24973|36893->25037|36923->25038|36959->25046|37031->25089|37061->25090|37091->25091|37169->25141|37198->25142|37292->25207|37322->25208|37358->25216|37465->25294|37495->25295|37532->25304|37624->25368|37653->25369|37731->25419|37760->25420|37923->25554|37953->25555|37992->25565|38045->25589|38075->25590|38115->25601|38173->25630|38203->25631|38240->25640|38270->25641|38370->25712|38400->25713|38436->25721|38489->25745|38519->25746|38556->25755|38611->25782|38640->25783|38675->25790|38704->25791|38813->25871|38843->25872|38882->25882|38935->25906|38965->25907|39005->25918|39063->25947|39093->25948|39130->25957|39160->25958|39312->26081|39342->26082|39378->26090|39467->26150|39497->26151|39534->26160|39647->26245|39676->26246|39712->26254|39741->26255|39777->26263|39910->26367|39940->26368|39976->26376|40065->26436|40095->26437|40132->26446|40267->26553|40296->26554|40332->26562|40361->26563|40397->26571|40478->26623|40508->26624|40544->26632|40586->26645|40616->26646|40653->26655|40816->26790|40845->26791|40880->26798|40909->26799|40945->26807|41023->26856|41053->26857|41089->26865|41152->26900|41181->26901|41217->26909|41296->26959|41326->26960|41362->26968|41447->27025|41476->27026|41515->27037|41544->27038|41632->27097|41662->27098|41698->27106|41831->27210|41861->27211|41897->27219|42169->27462|42199->27463|42239->27474|42317->27523|42347->27524|42383->27532|42412->27533|42996->28088|43026->28089|43067->28101|43242->28247|43272->28248|43365->28312|43395->28313|43431->28321|43581->28443|43610->28444|43739->28544|43769->28545|43805->28553|43859->28579|43888->28580|44004->28667|44034->28668|44070->28676|44161->28739|44190->28740|44282->28803|44312->28804|44348->28812|44399->28835|44428->28836|44522->28901|44552->28902|44588->28910|44657->28951|44686->28952|44827->29064|44857->29065|44893->29073|45042->29193|45072->29194|45109->29203|45201->29267|45230->29268|45308->29318|45337->29319|45430->29383|45460->29384|45496->29392|45568->29435|45598->29436|45628->29437|45706->29487|45735->29488|45829->29553|45859->29554|45895->29562|46002->29640|46032->29641|46069->29650|46161->29714|46190->29715|46268->29765|46297->29766|46460->29900|46490->29901|46529->29911|46582->29935|46612->29936|46652->29947|46710->29976|46740->29977|46777->29986|46807->29987|46907->30058|46937->30059|46973->30067|47026->30091|47056->30092|47093->30101|47148->30128|47177->30129|47212->30136|47241->30137|47350->30217|47380->30218|47419->30228|47472->30252|47502->30253|47542->30264|47600->30293|47630->30294|47667->30303|47697->30304|47849->30427|47879->30428|47915->30436|48004->30496|48034->30497|48071->30506|48184->30591|48213->30592|48249->30600|48278->30601|48314->30609|48447->30713|48477->30714|48513->30722|48602->30782|48632->30783|48669->30792|48804->30899|48833->30900|48869->30908|48898->30909|48934->30917|49015->30969|49045->30970|49081->30978|49123->30991|49153->30992|49190->31001|49353->31136|49382->31137|49417->31144|49446->31145|49482->31153|49560->31202|49590->31203|49626->31211|49689->31246|49718->31247|49754->31255|49833->31305|49863->31306|49899->31314|49984->31371|50013->31372|50052->31383|50081->31384|50235->31509|50265->31510|50307->31524|50482->31670|50512->31671|50548->31679|50869->31972|50898->31973|50931->31977|50961->31978|51001->31989|51090->32050|51119->32051|51162->32066|51264->32139|51294->32140|51338->32156|51648->32438|51677->32439|51706->32440|51740->32445|51770->32446|51807->32455|51892->32512|51921->32513|51957->32521|52244->32779|52274->32780|52311->32789|52622->33072|52651->33073|52680->33074|52714->33079|52744->33080|52780->33088|52869->33149|52898->33150|52934->33158|53037->33232|53067->33233|53104->33242|53532->33642|53561->33643|53590->33644|53624->33649|53654->33650|53690->33658|53848->33788|53877->33789|53913->33797|54227->34082|54257->34083|54294->34092|54605->34375|54634->34376|54663->34377|54697->34382|54727->34383|54763->34391|54847->34447|54876->34448|54911->34455|55007->34522|55037->34523|55074->34532|55502->34932|55531->34933|55560->34934|55594->34939|55624->34940|55660->34948|55808->35068|55837->35069|55872->35076|55901->35077|55934->35082
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|58->30|58->30|59->31|61->33|61->33|64->36|64->36|64->36|65->37|66->38|66->38|68->40|68->40|68->40|69->41|74->46|74->46|76->48|76->48|76->48|77->49|82->54|82->54|84->56|84->56|84->56|85->57|90->62|90->62|92->64|93->65|93->65|94->66|99->71|99->71|101->73|101->73|101->73|102->74|103->75|103->75|105->77|105->77|105->77|106->78|110->82|110->82|112->84|112->84|112->84|113->85|123->95|123->95|125->97|127->99|127->99|128->100|130->102|130->102|132->104|132->104|132->104|133->105|137->109|137->109|139->111|139->111|139->111|140->112|143->115|143->115|145->117|145->117|145->117|146->118|150->122|150->122|153->125|153->125|153->125|154->126|154->126|154->126|154->126|156->128|156->128|157->129|161->133|161->133|162->134|163->135|163->135|165->137|165->137|166->138|166->138|166->138|167->139|168->140|168->140|169->141|169->141|173->145|173->145|174->146|175->147|175->147|183->155|183->155|183->155|196->168|196->168|196->168|196->168|200->172|200->172|201->173|201->173|284->256|284->256|284->256|284->256|284->256|284->256|286->258|286->258|286->258|286->258|286->258|286->258|311->283|311->283|311->283|338->310|338->310|338->310|365->337|365->337|376->348|376->348|382->354|382->354|426->398|426->398|426->398|427->399|427->399|427->399|430->402|430->402|431->403|432->404|432->404|439->411|439->411|440->412|441->413|441->413|442->414|444->416|444->416|445->417|446->418|446->418|447->419|447->419|448->420|448->420|456->428|456->428|458->430|459->431|459->431|460->432|465->437|465->437|466->438|467->439|467->439|468->440|468->440|485->457|485->457|486->458|489->461|489->461|490->462|490->462|491->463|494->466|494->466|498->470|498->470|499->471|501->473|501->473|503->475|503->475|504->476|506->478|506->478|507->479|507->479|508->480|509->481|509->481|510->482|510->482|511->483|512->484|512->484|515->487|515->487|516->488|518->490|518->490|519->491|521->493|521->493|523->495|523->495|524->496|524->496|525->497|525->497|525->497|525->497|527->499|527->499|528->500|528->500|529->501|530->502|530->502|531->503|533->505|533->505|535->507|535->507|539->511|539->511|540->512|540->512|540->512|541->513|542->514|542->514|543->515|543->515|544->516|544->516|545->517|545->517|545->517|546->518|547->519|547->519|548->520|548->520|550->522|550->522|551->523|551->523|551->523|552->524|553->525|553->525|554->526|554->526|557->529|557->529|558->530|559->531|559->531|560->532|562->534|562->534|563->535|563->535|565->537|566->538|566->538|567->539|568->540|568->540|569->541|571->543|571->543|572->544|572->544|574->546|575->547|575->547|576->548|576->548|576->548|577->549|581->553|581->553|582->554|582->554|584->556|585->557|585->557|586->558|587->559|587->559|589->561|590->562|590->562|591->563|593->565|593->565|595->567|595->567|599->571|599->571|601->573|602->574|602->574|603->575|608->580|608->580|609->581|610->582|610->582|611->583|611->583|628->600|628->600|629->601|632->604|632->604|633->605|633->605|634->606|637->609|637->609|641->613|641->613|642->614|644->616|644->616|646->618|646->618|647->619|649->621|649->621|650->622|650->622|651->623|652->624|652->624|653->625|653->625|654->626|655->627|655->627|658->630|658->630|659->631|661->633|661->633|662->634|664->636|664->636|666->638|666->638|667->639|667->639|668->640|668->640|668->640|668->640|670->642|670->642|671->643|671->643|672->644|673->645|673->645|674->646|676->648|676->648|678->650|678->650|682->654|682->654|683->655|683->655|683->655|684->656|685->657|685->657|686->658|686->658|687->659|687->659|688->660|688->660|688->660|689->661|690->662|690->662|691->663|691->663|693->665|693->665|694->666|694->666|694->666|695->667|696->668|696->668|697->669|697->669|700->672|700->672|701->673|702->674|702->674|703->675|705->677|705->677|706->678|706->678|708->680|709->681|709->681|710->682|711->683|711->683|712->684|714->686|714->686|715->687|715->687|717->689|718->690|718->690|719->691|719->691|719->691|720->692|724->696|724->696|725->697|725->697|727->699|728->700|728->700|729->701|730->702|730->702|732->704|733->705|733->705|734->706|736->708|736->708|738->710|738->710|743->715|743->715|745->717|746->718|746->718|747->719|752->724|752->724|753->725|754->726|754->726|755->727|755->727|772->744|772->744|773->745|776->748|776->748|777->749|777->749|778->750|781->753|781->753|785->757|785->757|786->758|788->760|788->760|790->762|790->762|791->763|793->765|793->765|794->766|794->766|795->767|796->768|796->768|797->769|797->769|798->770|799->771|799->771|802->774|802->774|803->775|805->777|805->777|806->778|808->780|808->780|810->782|810->782|811->783|811->783|812->784|812->784|812->784|812->784|814->786|814->786|815->787|815->787|816->788|817->789|817->789|818->790|820->792|820->792|822->794|822->794|826->798|826->798|827->799|827->799|827->799|828->800|829->801|829->801|830->802|830->802|831->803|831->803|832->804|832->804|832->804|833->805|834->806|834->806|835->807|835->807|837->809|837->809|838->810|838->810|838->810|839->811|840->812|840->812|841->813|841->813|844->816|844->816|845->817|846->818|846->818|847->819|849->821|849->821|850->822|850->822|852->824|853->825|853->825|854->826|855->827|855->827|856->828|858->830|858->830|859->831|859->831|861->833|862->834|862->834|863->835|863->835|863->835|864->836|868->840|868->840|869->841|869->841|871->843|872->844|872->844|873->845|874->846|874->846|876->848|877->849|877->849|878->850|880->852|880->852|882->854|882->854|891->863|891->863|893->865|897->869|897->869|898->870|902->874|902->874|902->874|902->874|903->875|905->877|905->877|907->879|908->880|908->880|910->882|913->885|913->885|913->885|913->885|913->885|915->887|917->889|917->889|919->891|923->895|923->895|925->897|929->901|929->901|929->901|929->901|929->901|930->902|932->904|932->904|934->906|935->907|935->907|937->909|942->914|942->914|942->914|942->914|942->914|943->915|946->918|946->918|948->920|953->925|953->925|955->927|959->931|959->931|959->931|959->931|959->931|960->932|962->934|962->934|963->935|964->936|964->936|966->938|971->943|971->943|971->943|971->943|971->943|972->944|975->947|975->947|977->949|977->949|978->950
                  -- GENERATED --
              */
          