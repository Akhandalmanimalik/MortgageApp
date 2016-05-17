
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
object visdomreferral2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(role: String,referralId:Integer,exsist:Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.50*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Referral Source Form</title>

<link rel="shortcut icon" href=""""),_display_(/*8.34*/routes/*8.40*/.Assets.at("_resources/favicon.ico")),format.raw/*8.76*/("""">
<script
	src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
<script src=""""),_display_(/*11.15*/routes/*11.21*/.Assets.at("_resources/angular.min.js")),format.raw/*11.60*/(""""></script>

<script src=""""),_display_(/*13.15*/routes/*13.21*/.Assets.at("_resources/ui-bootstrap-tpls.min.js")),format.raw/*13.70*/(""""></script>
<!--  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

 -->
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*17.65*/(""""></script>

<script src=""""),_display_(/*19.15*/routes/*19.21*/.Assets.at("_resources/app.js")),format.raw/*19.52*/(""""></script>

<script src=""""),_display_(/*21.15*/routes/*21.21*/.Assets.at("_resources/signature_pad.js")),format.raw/*21.62*/(""""></script>
<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->
<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*25.31*/routes/*25.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*25.79*/("""">
<script src="""),_display_(/*26.14*/routes/*26.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*26.61*/(""""></script>
<link type="text/css" rel="stylesheet" href=""""),_display_(/*27.47*/routes/*27.53*/.Assets.at("_resources/background.css")),format.raw/*27.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*28.47*/routes/*28.53*/.Assets.at("_resources/forms.css")),format.raw/*28.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*29.47*/routes/*29.53*/.Assets.at("_resources/template.css")),format.raw/*29.90*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*30.47*/routes/*30.53*/.Assets.at("_resources/style2.css")),format.raw/*30.88*/("""">

<link rel="stylesheet" href=""""),_display_(/*32.31*/routes/*32.37*/.Assets.at("_resources/signature-pad.css")),format.raw/*32.79*/("""">


<!-- <link rel="stylesheet"
	href="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css"> -->
<style>
body """),format.raw/*38.6*/("""{"""),format.raw/*38.7*/("""
	"""),format.raw/*39.2*/("""padding-top: 20px;
	padding-bottom: 20px;
"""),format.raw/*41.1*/("""}"""),format.raw/*41.2*/("""

"""),format.raw/*43.1*/("""#sig-canvas """),format.raw/*43.13*/("""{"""),format.raw/*43.14*/("""
	"""),format.raw/*44.2*/("""border: 2px dotted Black;
	border-radius: 5px;
	cursor: crosshair;
	background: white;
	color: black;
"""),format.raw/*49.1*/("""}"""),format.raw/*49.2*/("""

"""),format.raw/*51.1*/("""#sig-dataUrl """),format.raw/*51.14*/("""{"""),format.raw/*51.15*/("""
	"""),format.raw/*52.2*/("""width: 100%;
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/("""

"""),format.raw/*55.1*/(""".regular-checkbox """),format.raw/*55.19*/("""{"""),format.raw/*55.20*/("""
	"""),format.raw/*56.2*/("""-webkit-appearance: none;
	background-color: #fafafa;
	border: 1px solid #cacece;
	box-shadow: 0 1px 2px rgba(0, 0, 0, 0.05), inset 0px -15px 10px -12px
		rgba(0, 0, 0, 0.05);
	padding: 9px;
	border-radius: 3px;
	display: inline-block;
	position: relative;
"""),format.raw/*65.1*/("""}"""),format.raw/*65.2*/("""

"""),format.raw/*67.1*/(""".big-checkbox """),format.raw/*67.15*/("""{"""),format.raw/*67.16*/("""
	"""),format.raw/*68.2*/("""padding: 18px;
"""),format.raw/*69.1*/("""}"""),format.raw/*69.2*/("""

"""),format.raw/*71.1*/(""".big-checkbox:checked:after """),format.raw/*71.29*/("""{"""),format.raw/*71.30*/("""
	"""),format.raw/*72.2*/("""font-size: 28px;
	left: 6px;
"""),format.raw/*74.1*/("""}"""),format.raw/*74.2*/("""

"""),format.raw/*76.1*/(""".btn """),format.raw/*76.6*/("""{"""),format.raw/*76.7*/("""
	"""),format.raw/*77.2*/("""border: 0 none;
	font-weight: bold;
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""

"""),format.raw/*81.1*/(""".btn-primary:active,.btn-primary.active """),format.raw/*81.41*/("""{"""),format.raw/*81.42*/("""
	"""),format.raw/*82.2*/("""background: #003f80;
	color: #ffffff;
	box-shadow: none;
"""),format.raw/*85.1*/("""}"""),format.raw/*85.2*/("""
"""),format.raw/*86.1*/("""</style>
<style type="text/css">
.blocks .btn-primary """),format.raw/*88.22*/("""{"""),format.raw/*88.23*/("""
	"""),format.raw/*89.2*/("""padding: 9px 6px;
	margin: 2px 2px;
	border-radius: 0;
"""),format.raw/*92.1*/("""}"""),format.raw/*92.2*/("""

"""),format.raw/*94.1*/("""/*for bigger checkbox*/
*,*:after,*:before """),format.raw/*95.20*/("""{"""),format.raw/*95.21*/("""
  """),format.raw/*96.3*/("""-webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
  padding: 0;
  margin: 0;
"""),format.raw/*101.1*/("""}"""),format.raw/*101.2*/("""

"""),format.raw/*103.1*/(""".switch """),format.raw/*103.9*/("""{"""),format.raw/*103.10*/("""
  """),format.raw/*104.3*/("""position: relative;
"""),format.raw/*105.1*/("""}"""),format.raw/*105.2*/("""

"""),format.raw/*107.1*/(""".switch label """),format.raw/*107.15*/("""{"""),format.raw/*107.16*/("""
  """),format.raw/*108.3*/("""width: 100%;
  height: 100%;
  position: relative;
  display: block;
"""),format.raw/*112.1*/("""}"""),format.raw/*112.2*/("""

"""),format.raw/*114.1*/(""".switch input """),format.raw/*114.15*/("""{"""),format.raw/*114.16*/("""
  """),format.raw/*115.3*/("""top: 0; 
  right: 0; 
  bottom: 0; 
  left: 0;
  opacity: 0;
  z-index: 100;
  position: absolute;
  width: 100%;
  height: 100%;
  cursor: pointer;
"""),format.raw/*125.1*/("""}"""),format.raw/*125.2*/("""

"""),format.raw/*127.1*/("""/* DEMO 3 */

.switch.demo3 """),format.raw/*129.15*/("""{"""),format.raw/*129.16*/("""
  """),format.raw/*130.3*/("""width: 125px;
  height: 30px;
"""),format.raw/*132.1*/("""}"""),format.raw/*132.2*/("""

"""),format.raw/*134.1*/(""".switch.demo3 label """),format.raw/*134.21*/("""{"""),format.raw/*134.22*/("""
  """),format.raw/*135.3*/("""display: block;
  width: 40%;
  height: 70%;
  background: #ffffff;
"""),format.raw/*139.1*/("""}"""),format.raw/*139.2*/("""

"""),format.raw/*141.1*/(""".switch.demo3 label:after """),format.raw/*141.27*/("""{"""),format.raw/*141.28*/("""
  """),format.raw/*142.3*/("""content: "";
  position: absolute;
  top: -8px; right: -8px; bottom: -8px; left: -8px;
"""),format.raw/*145.1*/("""}"""),format.raw/*145.2*/("""

"""),format.raw/*147.1*/(""".switch.demo3 label:before """),format.raw/*147.28*/("""{"""),format.raw/*147.29*/("""
  """),format.raw/*148.3*/("""content: "";
  position: absolute;
  z-index: -1;
  top: -18px; right: -18px; bottom: -18px; left: -18px;
"""),format.raw/*152.1*/("""}"""),format.raw/*152.2*/("""


"""),format.raw/*155.1*/(""".switch.demo3 input:checked ~ label i:before """),format.raw/*155.46*/("""{"""),format.raw/*155.47*/("""
   """),format.raw/*156.4*/("""content: url(""""),_display_(/*156.19*/routes/*156.25*/.Assets.at("_resources/tick.gif")),format.raw/*156.58*/(""""); 
  color: #000000;
  
  height: 10%;
  width: 10%;
"""),format.raw/*161.1*/("""}"""),format.raw/*161.2*/("""
"""),format.raw/*162.1*/("""</style>
<style type="text/css">



/*  #loading """),format.raw/*167.14*/("""{"""),format.raw/*167.15*/("""
	"""),format.raw/*168.2*/("""position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background: url('"""),_display_(/*174.20*/routes/*174.26*/.Assets.at("images/page-loader.gif")),format.raw/*174.62*/("""') 50% 50% no-repeat rgb(249,249,249);
"""),format.raw/*175.1*/("""}"""),format.raw/*175.2*/(""" """),format.raw/*175.3*/("""*/

 #overlay"""),format.raw/*177.10*/("""{"""),format.raw/*177.11*/(""" 
	"""),format.raw/*178.2*/("""display: none;
	position: fixed;
	background: threedhighlight;
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;

"""),format.raw/*188.1*/("""}"""),format.raw/*188.2*/(""" 

"""),format.raw/*190.1*/("""#loading"""),format.raw/*190.9*/("""{"""),format.raw/*190.10*/(""" 
	"""),format.raw/*191.2*/("""padding: 10px 10px 10px 60px; 
		position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background-color:threedhighlight;
    opacity: 0.6;
    filter: alpha(opacity=60); */
"""),format.raw/*201.1*/("""}"""),format.raw/*201.2*/("""

"""),format.raw/*203.1*/("""</style> 
 <script type="text/javascript">
$(document).ready(function () """),format.raw/*205.31*/("""{"""),format.raw/*205.32*/("""
    """),format.raw/*206.5*/("""$('.collapse')
        .on('shown.bs.collapse', function() """),format.raw/*207.45*/("""{"""),format.raw/*207.46*/("""
            """),format.raw/*208.13*/("""$(this)
                .parent()
                .find(".glyphicon-plus")
                .removeClass("glyphicon-plus")
                .addClass("glyphicon-minus");
            """),format.raw/*213.13*/("""}"""),format.raw/*213.14*/(""")
        .on('hidden.bs.collapse', function() """),format.raw/*214.46*/("""{"""),format.raw/*214.47*/("""
            """),format.raw/*215.13*/("""$(this)
                .parent()
                .find(".glyphicon-minus")
                .removeClass("glyphicon-minus")
                .addClass("glyphicon-plus");
            """),format.raw/*220.13*/("""}"""),format.raw/*220.14*/(""");
        """),format.raw/*221.9*/("""}"""),format.raw/*221.10*/(""");
</script>
</head>
<body>
 <div id="loading" style="display: none" align="center" >
 
  
     <img src=""""),_display_(/*228.17*/routes/*228.23*/.Assets.at("/images/preloader-image.gif")),format.raw/*228.64*/("""" alt="" />
  
  </div> 

	<div align="center">
		<img alt="Visdom Logo" height="90" width="260"
			src=""""),_display_(/*234.10*/routes/*234.16*/.Assets.at("_resources/visdom-logo.png")),format.raw/*234.56*/("""" />

	</div>
	<div style="width: 95%">
		<form name="myForm" action="referral2" method="POST"
			onsubmit="return validateForm()">
			<div class="row"></div>
			<div class="row">
				<div class="col-sm-3"></div>


				<div class="col-sm-7 container-bg text-color-blue">
					<div style="padding-top: 50px"></div>


					<div data-ng-app="demoApp" ng-init="role='"""),_display_(/*249.49*/role),format.raw/*249.53*/("""'"
						style="margin-left: 5%">


						<div ng-controller="DemoController" ng-init="newItemType=false">
							<input type="hidden" name="exsist" value=""""),_display_(/*254.51*/exsist),format.raw/*254.57*/(""""> <input
								type="hidden" name="referrelID" value=""""),_display_(/*255.49*/referralId),format.raw/*255.59*/(""""> <input
								type="hidden" name="role" value=""""),_display_(/*256.43*/role),format.raw/*256.47*/("""">

							<div
								ng-show="role == 'Realtor' || role == 'Financial Planner' || role == 'Professional' "
								id="cid_45" class="form-input-wide">

								<div id="text_44" class="form-html">
									<p class="Addenda">
										<span style="font-size: medium;"><strong>Schedule
												B</strong></span>
									</p>
									<p align="center">
										<b>REFERRAL FEE SCHEDULE</b>
									</p>
									<table border="1" cellpadding="0" cellspacing="0">
										<tbody>
											<tr>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">Minimum Mortgage
														Value</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">Maximum Mortgage
														Value</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">Referral Fee</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">Renewal Fee</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$50,000.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$200,000.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$100.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$50.00</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$200,001.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$350,000.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$250.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$100.00</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$350,001.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$600,000.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$500.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$225.00</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$600,001.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$900,000.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$750.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$350.00</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$900,001.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$3,000,000.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$1,000.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">$500.00</p>
												</td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>

							<div ng-show="role == 'Client' " id="cid_44"
								class="form-input-wide">
								<div id="text_45" class="form-html">
									<p class="Addenda">
										<span style="font-size: medium;"><strong>Schedule
												B</strong></span>
									</p>
									<p align="center">
										<b>REFERRAL FEE SCHEDULE</b>
									</p>
									<table border="1" cellpadding="0" cellspacing="0">
										<tbody>
											<tr>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">Minimum Mortgage
														Value</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">Maximum Mortgage
														Value</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">Referral Fee</p>
												</td>
												<td valign="top" width="28%">
													<p class="MTBasic1" align="center">Renewal Fee</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$50,000.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$200,000.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$50.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$25.00</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$200,001.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$350,000.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$125.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$50.00</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$350,001.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$600,000.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$250.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$125.00</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$600,001.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$900,000.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$350.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$175.00</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$900,001.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$3,000,000.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$500.00</p>
												</td>
												<td valign="top" width="28%">
													<p class="mtbasic10" align="center">$250.00</p>
												</td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>



							<br>
							<!-- 	<h4>
								<input  class="glyphicon glyphicon-star-empty" type="checkbox" ng-model="newItemType" style="height: 10px;width: 20px" /> 
							</h4> -->


							<div>
								<!-- <div class="panel-heading">
									<h3 class="panel-title">
										<a data-toggle="collapse" style="text-decoration: none;"
											data-parent="#accordion" ng-model="val" href="#livingroom-10"
											class="collapsed"><img height="20" width="20"
											src=""""),_display_(/*480.18*/routes/*480.24*/.Assets.at("_resources/plus.png")),format.raw/*480.57*/(""""  size="10px">
											Click to expand Terms and Conditions </a>
									</h3>
								</div> -->
								
								<a data-toggle="collapse" href="#other" style="text-decoration: none">
    <h3><!-- <span class="pull-left glyphicon glyphicon-plus gi-5x"></span> -->  &nbsp;<font size="4px"> Click to expand / close Terms and Conditions</font></h3>
  </a>
								
							<!-- 	<div id="livingroom-10" class="panel-collapse collapse"
									style="height: 0px;"> -->
<div id="other" class="collapse">


									<!-- <div ng-show="newItemType"> -->

									<div class="WordSection1">
										<p>
											<b>WHEREAS</b> the Referrer has a potential contact base
											which Visdom Mortgage Solutions Inc. ("<b>Visdom</b>") can
											benefit from for the purpose of assisting Visdom in selling
											and distributing the products and services now and hereafter
											offered by Visdom;
										</p>
										<p>
											<b>AND WHEREAS</b> Visdom desires to compensate the Referrer
											for providing Referrals to Visdom;
										</p>
										<p>
											<b>NOW THEREFORE THIS AGREEMENT WITNESSES THAT</b> in
											consideration for the respective covenants and agreements of
											the parties contained herein and other good and valuable
											consideration (the receipt and sufficiency of which is hereby
											acknowledged by each of the parties) it is agreed as follows:
										</p>
										<ol>
											<li>DEFINITIONS</li>
										</ol>
										<p class="MTGen2L2">
											1.1 "<b>Borrower</b>"<b> </b>means a person who is referred
											to Visdom by a Referrer for the purpose of receiving funding
											for a Trade in Real Estate.
										</p>
										<p class="MTGen2L2">
											1.2 "<b>Construction Draw Mortgage</b>" is a Mortgage where
											the Borrower receives Funding on a property under
											construction and Funding is provided at various stages of
											completion of the construction.
										</p>
										<p class="MTGen2L2">
											1.3 "<b>Funding</b>" means the day on which the lender or
											financial institution advances funds to the Borrower on a
											Mortgage Trade.
										</p>
										<p class="MTGen2L2">
											1.4 "<b>Mortgage</b>"<b> </b>means a mortgage of real
											property, of a lease of real property, or of a mortgage of
											real property or a lease of real property OR any charge on
											real property, on a lease of real property, or on a mortgage
											of real property or a lease of real property FOR THE PURPOSES
											OF securing the repayment of money or another consideration.
										</p>
										<p class="MTGen2L2">
											1.5 "<b>Real Estate</b>" means real property, leasehold
											property or a portable dwelling other than a holiday trailer
											or recreational vehicle wholly or mainly used for
											recreational purposes that is defined for use as and is used
											as a residence, is mounted on or otherwise attached to its
											own chassis and running gear, is capable of being transported
											on its own chassis and running gear by towing or other means,
											and is situated on a site that is used or intended to be
											used, or that has been represented by the owner of the site
											as being intended to be used, for residential purposes.
										</p>
										<p class="MTGen2L2">
											1.6 "<b>Referral</b>"<b> </b>shall mean the act of
											recommending or directing a person for service, assistance or
											business for a Trade of Real Estate regarding a new Mortgage
											or Mortgage renewal to Visdom.
										</p>
										<p class="MTGen2L2">
											1.7 "<b>Referrer</b>" means a party who recommends or directs
											a person, including themselves, for service, assistance or
											business for a new mortgage or mortgage renewal in the trade
											of real estate to Visdom. The Referrer may be an individual
											licensed by a governing provincial realty body, an unlicensed
											individual or a Canadian corporate entity incorporated in at
											least one province in Canada (hereinafter referred to as the
											"Referrer Corporation").
										</p>
										<p class="MTGen2L2">
											1.8 "<b>Referral Fee</b>" means the fee earned by a Referrer
											for providing a Referral to Visdom for a Mortgage on Real
											Estate that results in a Funding.
										</p>
										<p class="MTGen2L2">
											1.9 "<b>Referral List</b>" means a list of all of the
											Referrals made by the Referrer to Visdom.
										</p>
										<p class="MTGen2L2">
											1.10 "<b>Renewal</b>" means a renewal on a Mortgage that
											results in a brokerage fee to Visdom.
										</p>
										<p class="MTGen2L2">
											1.11 "<b>Renewal Fee</b>" means the fee that is earned upon
											the Trade in Real Estate for a Mortgage Renewal by the same
											Borrower on a transaction that previously resulted in the
											receipt of a Referral Fee by the Referrer from Visdom.
										</p>
										<p class="MTGen2L2">
											1.12 "<b>Trade</b>" includes a disposition or acquisition of,
											or transaction in, real estate by purchase or sale; an offer
											to purchase or sell real estate; an offering, advertisement,
											listing or showing of real estate for purchase or sale;
											property management; holding oneself out as trading in real
											estate; the solicitation, negotiation or obtaining of a
											contract, agreement or any arrangement for an activity
											referred to above; collecting, or offering or attempting to
											collect, on behalf of the owner or other person in charge or
											real estate, money payable as rent for the use of real estate
											or contributions for the control, management or
											administration of the real estate; or any conduct or act in
											furtherance or attempted furtherance of any activity referred
											to above.
										</p>
										<ol>
											<li>REFERRAL ARRANGEMENT</li>
										</ol>
										<p class="MTGen2L2">2.1 Referrer has the right but not the
											obligation to refer and forward potential customers to Visdom
											or its related entity, successor or assign in consideration
											for the Referral Fees or Renewal Fees.</p>
										<p class="MTGen2L2">2.2 Any Referrals made shall be made
											on an as is, where is basis and Visdom shall have the
											responsibility of determining the suitability of any such
											Referrals as well as the discretion (but not the obligation)
											as to whether accept each such Referral.</p>
										<ol>
											<li>REMUNERATION</li>
										</ol>
										<p class="MTGen2L2">3.1 Visdom shall pay a Referral Fee or
											Renewal Fee to the Referrer, the amount of the Referral Fee
											or Renewal Fee shall be determined based on Schedule "B"
											("Fee Schedule").</p>
										<p class="MTGen2L2">3.2 Visdom has the right to alter,
											amend and modify Schedule B, without notice or consent of the
											Referrer.</p>
										<p class="MTGen2L2">3.3 If a Referrer is a licensed
											individual as described above they hereby assign and direct
											their Referral Fee or Renewal Fee to their brokerage. If the
											Referrer is a licensed individual Visdom will pay the
											Referral Fee or Renewal Fee to the brokerage, not the
											Referrer directly.</p>
										<p class="MTGen2L2">3.4 If the Referrer is an unlicensed
											individual, Visdom will pay the Referral Fee or Renewal Fee
											directly to the individual.</p>
										<p class="MTGen2L2">3.5 If, and only if, the Referrer is a
											Referrer Corporation incorporated in at least one Province of
											Canada and in accordance with the laws of any Province in
											Canada, Schedule "A" ("Additional Referrer Corporation
											Terms") shall apply to this Agreement.</p>
										<p class="MTGen2L2">
											3.6 The Referral Fee or Renewal Fee arising out of or related
											to such Referrals from the Referrer, shall be inclusive of
											all sales taxes. The Referrer is solely responsible to file
											all appropriate reports, elections and returns pertaining to
											this Agreement. The Referrer is responsible for any sums that
											may be payable by the Referrer under the <i>Excise Tax
												Act </i>(Canada) including but not limited to Goods and Services
											Tax, interest and/or penalties.
										</p>
										<p class="MTGen2L2">3.7 Visdom and the Referrer shall both
											keep a Referral List. The first party preceding all others in
											time to make a Referral of a Borrower to Visdom shall be
											entitled to the Referral Fee or Renewal Fee if and only if
											the Borrower's Mortgage or Renewal is Funded within six (6)
											months of the Referral. In the case of a Borrower seeking a
											Construction Draw Mortgage a Referrer is entitled to a
											Referral Fee or Renewal Fee if and only if there is a Funding
											of a first draw within six (6) months of the Referral and
											final Funding is completed within eighteen (18) months of the
											Referral. Where there is a disagreement as to whether a
											Referral was made by the Referrer, the Referral Fees or
											Renewal Fees payable in respect of such Referral shall be
											paid into Visdom's counsel's trust account (or as the parties
											may otherwise agree) pending the resolution of the dispute.</p>
										<p class="MTGen2L2">
											3.8 Visdom shall pay to the Referrer such Referral Fees or
											Renewal Fees no later than the sixtieth (60<sup>th</sup>) day
											immediately following the Funding. Should the Borrower's new
											mortgage or renewal fail to obtain Funding, Visdom is not
											responsible to pay any Referral Fees or Renewal Fees to the
											Referrer.
										</p>
										<ol>
											<li>TERM & TERMINATION</li>
										</ol>
										<p class="MTGen2L2">4.1 The term of this Agreement shall
											commence as of the date first above written and shall
											continue indefinitely until terminated in accordance with the
											provisions hereof.</p>
										<p class="MTGen2L2">4.2 Either party may terminate this
											Agreement at any time upon delivery to the other party of not
											less than ninety (90) calendar day&#39;s prior written notice
											of the effective date of termination (the "Effective Date").</p>
										<p class="MTGen2L2">4.3 In the case of any fraudulent
											activities including, without limitation, mortgage fraud for
											housing, mortgage fraud for profit, mortgage fraud for title
											and mortgage foreclosure fraud, this Agreement shall be
											immediately terminable by Visdom without Visdom providing any
											notice to the Referrer.</p>
										<p class="MTGen2L2">4.4 In the case that Visdom determines
											a Referrer falsely represented that it has a bona-fide
											relationship and substantial connection with the Borrower or
											the Borrower is not a bona-fide party seeking legal and
											legitimate Funding, this Agreement shall be immediately
											terminable by Visdom without Visdom providing any notice to
											the Referrer.</p>
										<ol>
											<li>STATUS OF PARTIES</li>
										</ol>
										<p class="MTGen2L2">5.1 The Referrer and Visdom
											acknowledge that they are independent contracting parties,
											and this Agreement shall not constitute any such party as an
											agent, representative, partner, co-venturer, employee,
											employer or franchisee of any other party, except as
											expressly provided for herein. None of the Referrer nor
											Visdom shall assume or create any obligation or
											responsibility whatsoever on behalf of, or in the name of,
											any other party except as otherwise provided for herein.</p>
										<ol>
											<li>Referrer REPRESENTATIONS AND WARRANTIES</li>
										</ol>
										<p class="MTGen2L2">6.1 The Referrer represents that
											he/she is in compliance with all laws and regulations
											applicable to making a Referral of the Borrower to Visdom.</p>
										<p class="MTGen2L2">6.2 The Referrer represents that the
											execution, delivery and performance of this Agreement by the
											Referrer will not result in any breaches, violations or
											defaults of any obligations, duties or requirements
											whatsoever of the Referrer.</p>
										<p class="MTGen2L2">6.3 The Referrer represents that they
											are not a mortgage broker and does not deal in mortgages as
											defined in the Real Estate Act. A mortgage broker means a
											person who on or behalf of another person for consideration
											or other compensation solicits a person to borrow or lend
											money to be secured by a mortgage; negotiates a mortgage
											transaction; collects mortgage payments and otherwise
											administers mortgages; buys, sells or exchanges mortgages or
											offers to do so or a person who holds out or represents
											themself as a person who can do any of the above.</p>
										<p class="MTGen2L2">6.4 The Referrer represents that it
											has a bona-fide relationship and substantial connection with
											the Borrower and the Borrower is a bona-fide party seeking
											legal and legitimate Funding. Determination of bona-fide
											relationship, substantial connection and a bona-fide party
											seeking Funding shall be at the sole discretion of Visdom.</p>
										<p class="MTGen2L2">6.5 The Referrer represents that their
											declared status as a licensed individual, unlicensed
											individual or Referrer Corporation as the case may be is
											true.</p>
										<p class="MTGen2L2">6.6 Both parties agree that if any one
											of the above representations and warranties are not true,
											then this Agreement shall immediately be null and void and
											shall not be binding on either party.</p>
										<ol>
											<li>Visdom representations and warranties</li>
										</ol>
										<p class="MTGen2L2">7.1 Visdom represents that it does not
											exclusively deal with one lender or financial institution for
											the purpose of securing Funding for a Borrower. Visdom deals
											with, conducts business with and sources Funding for
											Borrowers from multiple lenders and financial institutions.</p>
										<p class="MTGen2L2">7.2 Visdom is a corporation
											incorporated and organized under the laws of the Province of
											Alberta and is a valid and subsisting corporation under such
											laws.</p>
										<p class="MTGen2L2">7.3 Visdom and its agents have the
											corporate power and authority to enter into this Agreement
											and to perform their respective obligations hereunder and
											thereunder; the execution and delivery of this Agreement and
											the consummation of the transactions contemplated by this
											Agreement have been duly authorized by all necessary
											corporate action on the part of the Visdom, its shareholders
											and directors.</p>
										<p class="MTGen2L2">7.4 Visdom is a mortgage brokerage
											duly licensed to Trade in Real Estate in the jurisdiction of
											the Borrower.</p>
										<p class="MTGen2L2">7.5 Both parties agree that if any one
											of the above representations and warranties are not true,
											then this Agreement shall immediately be null and void and
											shall not be binding on either party.</p>
										<ol>
											<li>INTERPRETATION AND GENERAL</li>
										</ol>
										<p class="MTGen2L2">8.1 The headings in this Agreement are
											included for convenience of reference only and shall not
											affect the interpretation hereof.</p>
										<p class="MTGen2L2">8.2 Visdom shall have the right to
											assign this Agreement to assigns or transferees without
											providing notification to the Referrer. The Referrer does not
											have any rights to assign this Agreement to any other party.</p>
										<p class="MTGen2L2">8.3 Pursuant to Canada's Anti-Spam
											Legislation, the Referrer consents to receive commercial
											electronic messages such as e-mails from Visdom. If the
											Referrer wishes to withdraw consent to receive communications
											by electronic means, they must notify Visdom in writing at
											the address for service noted above.</p>
										<p class="MTGen2L2">8.4 The Referrer shall provide Visdom
											written notice of any changes in address, including both
											e-mail and physical mailing address, promptly. Should the
											Referrer fail to provide such notice, Visdom is not obligated
											to pay Referral Fees or Renewal Fees to the Referrer.</p>
										<p class="MTGen2L2">8.5 This Agreement and any schedules
											attached hereto sets forth the entire agreement between the
											parties hereto pertaining to the subject matter hereof and
											supersedes all prior agreements. There are not and shall not
											be any oral statements, representations, warranties,
											undertakings or agreements between the parties.</p>
										<p class="MTGen2L2">8.6 Time shall in all respects be of
											the essence hereof and no waiver of any time period
											prescribed hereunder shall be effective unless in writing
											signed by the parties hereto.</p>
										<p class="MTGen2L2">8.7 Words in the singular include the
											plural and vice versa and words importing gender include all
											genders.</p>
										<p class="MTGen2L2">8.8 If any provision of this Agreement
											or its application to any party or circumstance is
											restricted, prohibited or unenforceable, such provision shall
											be ineffective only to the extent of such restriction,
											prohibition or unenforceability without invalidating the
											remaining provisions hereof and without affecting the
											application of such provision to other parties or
											circumstances.</p>
										<p class="MTGen2L2">8.9 The Parties agree that good faith
											is of the essence of this Agreement and further agree that
											each shall act in good faith to the other in all matters
											arising in connection with any provisions of this Agreement.</p>
										<p class="MTGen2L2">8.10 This Agreement shall be governed
											by and interpreted in accordance with the laws of the
											Province where the Mortgage is registered and the laws of
											Canada applicable therein.</p>
										<p class="MTGen2L2">8.11 Where any provincial sales tax,
											goods and services tax or any other applicable tax is
											required to be levied on any of the payments contemplated
											under this Agreement, all such applicable taxes shall be
											claimed by Vidsom and any such taxes shall be deducted from
											the Referral Fees and Renewal Fees prescribed in Schedule B.
											In the case of an individual Referrer who is not registered
											with a G.S.T. number, the Referral Fee or Renewal Fee shall
											not be subject to G.S.T. deduction and Vidsom shall provide a
											T4A to an individual Referrer who receives more than $500.00
											i"""),
format.raw("""n Referral Fees and/or Renewal Fees in any given taxation
											year. In the case assignment of an individual Referral Fee or
											Renewal Fee to a brokerage, the Referral Fee or Renewal Fee
											shall be subject to G.S.T. deduction. In the case of a
											Referrer Corporation the Referral Fee or Renewal Fee shall be
											subject to G.S.T. deduction. The Referrer represents that if
											it is a brokerage or corporation registered with G.S.T.
											number it will promptly provide this information to Visdom.</p>
										<p class="MTGen2L2">8.12 Any notice or other communication
											required or permitted to be given hereunder shall be in
											writing and, if mailed by prepaid first-class mail at any
											time other than during a general discontinuance of postal
											service due to strike, lockout or otherwise, shall be sent to
											the other party at the last known address of the other party
											and be deemed to have been received five (5) business days
											after the post-marked date thereof, or if telecopied, emailed
											or delivered by another form of recorded communication, shall
											be deemed to have been received on the next business day
											following dispatch and acknowledgement of receipt by the
											recipient's telecopier machine or other form of recorded
											communication, or if delivered by hand shall be deemed to
											have been received at the time it is delivered. If either
											party changes its address during the term of this Agreement,
											it shall immediately notify the other party of such change of
											address in the foregoing manner.</p>
										<p class="MTGen2L2">8.13 All payments required or
											permitted under this Agreement shall be denominated in the
											lawful money of Canada unless otherwise expressly indicated
											herein.</p>
										<p class="MTGen2L2">8.14 This Agreement may be executed by
											the Parties in one or more counterparts, each one of which
											shall be deemed an original. Facsimile and electronic mail or
											digital copies and photocopies of this document that contain
											signatures shall be deemed to have the full force and effect
											of the original.</p>
									</div>
									<p>
										<br clear="all" />
									</p>
									<p class="Addenda">
										<span style="font-size: medium;"><strong>Schedule
												A</strong></span>
									</p>
									<p align="center">
										<b>ADDITIONAL REFERRER CORPORATION TERMS</b>
									</p>
									<ol>
										<li>EXPENSES</li>
									</ol>
									<p class="MTGen2L2">1.1 Except as hereinafter provided, all
										expenses in connection with the Referrer Corporation's
										performance of this Agreement, including but not limited to
										travel, automobile, salaries and supplies, shall be borne by
										the Referrer Corporation and it shall be solely responsible
										for the payment thereof. Visdom shall not be responsible for
										any expenses of the Referrer Corporation.</p>
									<ol>
										<li>no power to bind</li>
									</ol>
									<p class="MTGen2L2">2.1 The Referrer Corporation does not
										have the right or authority to create a contract or obligation
										either express or implied, on behalf of, Visdom unless
										otherwise agreed in writing.</p>
									<ol>
										<li>warranties and representations</li>
									</ol>
									<p class="MTGen2L2">3.1 The Referrer Corporation and Visdom
										represent that their services are provided on a best effort
										basis. There are no guarantees, warranties and representations
										of any kind that services will produce any specific results
										for the benefit of the other. Each of the Referrer Corporation
										and Visdom represents and warrants to the other that:</p>
									<p class="MTGen2L3">(a) it is under no contractual
										restriction or other restrictions or obligations that are
										inconsistent with this Agreement, the performance of its
										duties and the covenants hereunder;</p>
									<p class="MTGen2L3">(b) its management is under no physical
										or mental disability that would interfere with its keeping and
										performing all of the agreements, covenants and conditions to
										be kept or performed hereunder;</p>
									<p class="MTGen2L3">(c) it is familiar with all Federal and
										Provincial laws and regulations and regulations of any
										governing bodies applicable to the performance of its services
										as contemplated in this Agreement;</p>
									<p class="MTGen2L3">(d) it will comply with all applicable
										Federal and Provincial laws and regulations of any governing
										bodies in the performance of the services under this
										Agreement; and,</p>
									<p class="MTGen2L3">(e) nothing herein contained shall be
										construed to limit or restrict the other party in providing
										services to others.</p>
									<ol>
										<li>indemnity</li>
									</ol>
									<p class="MTGen2L2">4.1 Visdom and the Referrer Corporation
										hold each other harmless and indemnify each other from and
										against any liability, loss, cost, expenses or damages,
										including attorney's fees, howsoever caused by reason of any
										injury or loss sustained by or to any person or property by
										reason of any actual or alleged wrongful act,
										misrepresentation or omission except for gross negligence,
										willful misconduct or malfeasance of, or breach of any
										representation, warranty or covenant.</p>
									<ol>
										<li>no solicitation</li>
									</ol>
									<p>A Referrer Corporation may not solicit any officer,
										director, employee or associate of Visdom for employment or
										any type of business relationship without prior written
										consent from Visdom.</p>
								</div>

							</div>
					
						<br> <label class="form-label form-label-top" id="label_35"
							for="input_35"> Are you using a device with a touch
							screen currently? </label><font color="red">*</font> <br> <br>
						<div class="btn-group blocks">
							<label style="width: 150px;height: 35px"   class="btn btn-primary"
								btn-radio="'yes'" ng-change="change()" ng-model="company">
								Yes </label> <label style="width: 150px;height: 35px" class="btn btn-primary"
								btn-radio="'no'" ng-change="change()" ng-model="company">
								No </label> <br> <br>


						</div>
						<div id="touchScreen1"></div>

						<input type="hidden" id="role" name="touchScreen"
							value=""""),format.raw/*961.15*/("""{"""),format.raw/*961.16*/("""{"""),format.raw/*961.17*/("""company"""),format.raw/*961.24*/("""}"""),format.raw/*961.25*/("""}"""),format.raw/*961.26*/(""""> <br> <br> 
							
							<br>
					<div class="row">
						<div class="col-sm-5">
							<label>I agree to the terms and conditions <font color="red">*</font></label>
						</div>
						<div class="col-sm-4" style="padding-left: 0%;">
							<div class="switch demo3 col-sm-4">
	                    	 <input type="checkbox" name="agree" >
	                   	 	<label style="border-style:inset;border-color: black;height: 85%;width: 30%"><i ></i></label>
 	               	 		</div>	
						</div>
					</div>
					<div id="agree1" style="border-color: black;"></div>
					<br>
					
					
					<div ng-show="company == 'yes' ">
						<label class="form-label form-label-left form-label-auto"
							id="label_46" for="input_46"> Signature </label>
						<div class="row">
							<div class="col-md-12">
								<canvas id="sig-canvas" width="350" height="160">  </canvas>
								<canvas id="blank"  width="350" height="160" style='display:none'></canvas>
								
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">

								<label class="btn btn-default" id="sig-clearBtn"> Clear
									Signature</label>
							</div>
						</div>
						<div id="sign1"></div>
						<br />
						<div class="row">
							<div class="col-md-12">
								<textarea style="display: none;" id="sig-dataUrl"
									class="form-control" rows="5" name="sign">
				  
											</textarea>
							</div>
						</div>

					</div>

	<div ng-show="company == 'no' ">
	<label for="pwd"><Strong> My typed name below
								serves as my electronic signature for the above agreement. </Strong> <span
							style="color: red; font-size: 3">*</span> </label></div>
					<div ng-show="company == 'no' " style="width: 40%">
					 <input type="text"
							name="typedName" class="form-control">
					</div>
					<div id="typedName1"></div>
					<br> <br>
					</div>

					<div align="center">

						<input type="submit" style="width: 280px" class="btn btn-primary"
							value="Submit" id="sig-submitBtn">

						<div align="center" id="submiterror">
							<font color="red"></font>
						</div>

					</div>

	</div>


					<div style="padding-bottom: 50px;"></div>
				</div>
				<div class="col-sm-3"></div>
			</div>
	

	</form>
	</div>


	<script src=""""),_display_(/*1045.16*/routes/*1045.22*/.Assets.at("_resources/signature_pad.js")),format.raw/*1045.63*/(""""></script>
	<script src=""""),_display_(/*1046.16*/routes/*1046.22*/.Assets.at("_resources/app.js")),format.raw/*1046.53*/(""""></script>

	<script>
			$(document).ready(function() """),format.raw/*1049.33*/("""{"""),format.raw/*1049.34*/("""
				"""),format.raw/*1050.5*/("""$('[data-toggle="tooltip"]').tooltip();
			"""),format.raw/*1051.4*/("""}"""),format.raw/*1051.5*/(""");
		</script>


	<script type="text/javascript">
			var app = angular.module("demoApp", [ 'ui.bootstrap' ]);

			app.controller('DemoController', function($scope) """),format.raw/*1058.54*/("""{"""),format.raw/*1058.55*/("""
				"""),format.raw/*1059.5*/("""init();
				function init() """),format.raw/*1060.21*/("""{"""),format.raw/*1060.22*/("""
					"""),format.raw/*1061.6*/("""$scope.newItemType = '';
					$scope.company = "";
					$scope.change = function() """),format.raw/*1063.33*/("""{"""),format.raw/*1063.34*/("""
						"""),format.raw/*1064.7*/("""console.log($scope.newItemType)
					"""),format.raw/*1065.6*/("""}"""),format.raw/*1065.7*/(""";
				"""),format.raw/*1066.5*/("""}"""),format.raw/*1066.6*/("""
			"""),format.raw/*1067.4*/("""}"""),format.raw/*1067.5*/(""");
		</script>

	<script src="https://code.jquery.com/jquery-2.1.0.min.js"></script>
	<script
		src="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
	<!--<script src="https://code.angularjs.org/snapshot/angular.min.js"></script>-->
	<script>
			(function() """),format.raw/*1075.16*/("""{"""),format.raw/*1075.17*/("""

				"""),format.raw/*1077.5*/("""// Get a regular interval for drawing to the screen
				window.requestAnimFrame = (function(callback) """),format.raw/*1078.51*/("""{"""),format.raw/*1078.52*/("""
					"""),format.raw/*1079.6*/("""return window.requestAnimationFrame
							|| window.webkitRequestAnimationFrame
							|| window.mozRequestAnimationFrame
							|| window.oRequestAnimationFrame
							|| window.msRequestAnimaitonFrame
							|| function(callback) """),format.raw/*1084.30*/("""{"""),format.raw/*1084.31*/("""
								"""),format.raw/*1085.9*/("""window.setTimeout(callback, 1000 / 60);
							"""),format.raw/*1086.8*/("""}"""),format.raw/*1086.9*/(""";
				"""),format.raw/*1087.5*/("""}"""),format.raw/*1087.6*/(""")();

				// Set up the canvas
				var canvas = document.getElementById("sig-canvas");
				var ctx = canvas.getContext("2d");
				ctx.strokeStyle = "#222222";
				ctx.lineWith = 2;

				// Set up the UI
				var sigText = document.getElementById("sig-dataUrl");
				var sigImage = document.getElementById("sig-image");
				var clearBtn = document.getElementById("sig-clearBtn");
				var submitBtn = document.getElementById("sig-submitBtn");
				clearBtn
						.addEventListener(
								"click",
								function(e) """),format.raw/*1103.21*/("""{"""),format.raw/*1103.22*/("""
									"""),format.raw/*1104.10*/("""clearCanvas();
									sigText.innerHTML = "Data URL for your signature will go here!";
									sigImage.setAttribute("src", "");
								"""),format.raw/*1107.9*/("""}"""),format.raw/*1107.10*/(""", false);
				submitBtn.addEventListener("click", function(e) """),format.raw/*1108.53*/("""{"""),format.raw/*1108.54*/("""

				
					"""),format.raw/*1111.6*/("""var dataUrl = canvas.toDataURL();
					sigText.innerHTML = dataUrl;
					sigImage.setAttribute("src", dataUrl);
				"""),format.raw/*1114.5*/("""}"""),format.raw/*1114.6*/(""", false);

				// Set up mouse events for drawing
				var drawing = false;
				var mousePos = """),format.raw/*1118.20*/("""{"""),format.raw/*1118.21*/("""
					"""),format.raw/*1119.6*/("""x : 0,
					y : 0
				"""),format.raw/*1121.5*/("""}"""),format.raw/*1121.6*/(""";
				var lastPos = mousePos;
				canvas.addEventListener("mousedown", function(e) """),format.raw/*1123.54*/("""{"""),format.raw/*1123.55*/("""
					"""),format.raw/*1124.6*/("""drawing = true;
					lastPos = getMousePos(canvas, e);
				"""),format.raw/*1126.5*/("""}"""),format.raw/*1126.6*/(""", false);
				canvas.addEventListener("mouseup", function(e) """),format.raw/*1127.52*/("""{"""),format.raw/*1127.53*/("""
					"""),format.raw/*1128.6*/("""drawing = false;
				"""),format.raw/*1129.5*/("""}"""),format.raw/*1129.6*/(""", false);
				canvas.addEventListener("mousemove", function(e) """),format.raw/*1130.54*/("""{"""),format.raw/*1130.55*/("""
					"""),format.raw/*1131.6*/("""mousePos = getMousePos(canvas, e);
				"""),format.raw/*1132.5*/("""}"""),format.raw/*1132.6*/(""", false);

				// Set up touch events for mobile, etc
				canvas.addEventListener("touchstart", function(e) """),format.raw/*1135.55*/("""{"""),format.raw/*1135.56*/("""
					"""),format.raw/*1136.6*/("""mousePos = getTouchPos(canvas, e);
					var touch = e.touches[0];
					var mouseEvent = new MouseEvent("mousedown", """),format.raw/*1138.51*/("""{"""),format.raw/*1138.52*/("""
						"""),format.raw/*1139.7*/("""clientX : touch.clientX,
						clientY : touch.clientY
					"""),format.raw/*1141.6*/("""}"""),format.raw/*1141.7*/(""");
					canvas.dispatchEvent(mouseEvent);
				"""),format.raw/*1143.5*/("""}"""),format.raw/*1143.6*/(""", false);
				canvas.addEventListener("touchend", function(e) """),format.raw/*1144.53*/("""{"""),format.raw/*1144.54*/("""
					"""),format.raw/*1145.6*/("""var mouseEvent = new MouseEvent("mouseup", """),format.raw/*1145.49*/("""{"""),format.raw/*1145.50*/("""}"""),format.raw/*1145.51*/(""");
					canvas.dispatchEvent(mouseEvent);
				"""),format.raw/*1147.5*/("""}"""),format.raw/*1147.6*/(""", false);
				canvas.addEventListener("touchmove", function(e) """),format.raw/*1148.54*/("""{"""),format.raw/*1148.55*/("""
					"""),format.raw/*1149.6*/("""var touch = e.touches[0];
					var mouseEvent = new MouseEvent("mousemove", """),format.raw/*1150.51*/("""{"""),format.raw/*1150.52*/("""
						"""),format.raw/*1151.7*/("""clientX : touch.clientX,
						clientY : touch.clientY
					"""),format.raw/*1153.6*/("""}"""),format.raw/*1153.7*/(""");
					canvas.dispatchEvent(mouseEvent);
				"""),format.raw/*1155.5*/("""}"""),format.raw/*1155.6*/(""", false);

				// Prevent scrolling when touching the canvas
				document.body.addEventListener("touchstart", function(e) """),format.raw/*1158.62*/("""{"""),format.raw/*1158.63*/("""
					"""),format.raw/*1159.6*/("""if (e.target == canvas) """),format.raw/*1159.30*/("""{"""),format.raw/*1159.31*/("""
						"""),format.raw/*1160.7*/("""e.preventDefault();
					"""),format.raw/*1161.6*/("""}"""),format.raw/*1161.7*/("""
				"""),format.raw/*1162.5*/("""}"""),format.raw/*1162.6*/(""", false);
				document.body.addEventListener("touchend", function(e) """),format.raw/*1163.60*/("""{"""),format.raw/*1163.61*/("""
					"""),format.raw/*1164.6*/("""if (e.target == canvas) """),format.raw/*1164.30*/("""{"""),format.raw/*1164.31*/("""
						"""),format.raw/*1165.7*/("""e.preventDefault();
					"""),format.raw/*1166.6*/("""}"""),format.raw/*1166.7*/("""
				"""),format.raw/*1167.5*/("""}"""),format.raw/*1167.6*/(""", false);
				document.body.addEventListener("touchmove", function(e) """),format.raw/*1168.61*/("""{"""),format.raw/*1168.62*/("""
					"""),format.raw/*1169.6*/("""if (e.target == canvas) """),format.raw/*1169.30*/("""{"""),format.raw/*1169.31*/("""
						"""),format.raw/*1170.7*/("""e.preventDefault();
					"""),format.raw/*1171.6*/("""}"""),format.raw/*1171.7*/("""
				"""),format.raw/*1172.5*/("""}"""),format.raw/*1172.6*/(""", false);

				// Get the position of the mouse relative to the canvas
				function getMousePos(canvasDom, mouseEvent) """),format.raw/*1175.49*/("""{"""),format.raw/*1175.50*/("""
					"""),format.raw/*1176.6*/("""var rect = canvasDom.getBoundingClientRect();
					return """),format.raw/*1177.13*/("""{"""),format.raw/*1177.14*/("""
						"""),format.raw/*1178.7*/("""x : mouseEvent.clientX - rect.left,
						y : mouseEvent.clientY - rect.top
					"""),format.raw/*1180.6*/("""}"""),format.raw/*1180.7*/(""";
				"""),format.raw/*1181.5*/("""}"""),format.raw/*1181.6*/("""

				"""),format.raw/*1183.5*/("""// Get the position of a touch relative to the canvas
				function getTouchPos(canvasDom, touchEvent) """),format.raw/*1184.49*/("""{"""),format.raw/*1184.50*/("""
					"""),format.raw/*1185.6*/("""var rect = canvasDom.getBoundingClientRect();
					return """),format.raw/*1186.13*/("""{"""),format.raw/*1186.14*/("""
						"""),format.raw/*1187.7*/("""x : touchEvent.touches[0].clientX - rect.left,
						y : touchEvent.touches[0].clientY - rect.top
					"""),format.raw/*1189.6*/("""}"""),format.raw/*1189.7*/(""";
				"""),format.raw/*1190.5*/("""}"""),format.raw/*1190.6*/("""

				"""),format.raw/*1192.5*/("""// Draw to the canvas
				function renderCanvas() """),format.raw/*1193.29*/("""{"""),format.raw/*1193.30*/("""
					"""),format.raw/*1194.6*/("""if (drawing) """),format.raw/*1194.19*/("""{"""),format.raw/*1194.20*/("""
						"""),format.raw/*1195.7*/("""ctx.moveTo(lastPos.x, lastPos.y);
						ctx.lineTo(mousePos.x, mousePos.y);
						ctx.stroke();
						lastPos = mousePos;
					"""),format.raw/*1199.6*/("""}"""),format.raw/*1199.7*/("""
				"""),format.raw/*1200.5*/("""}"""),format.raw/*1200.6*/("""

				"""),format.raw/*1202.5*/("""// Clear the canvas
				function clearCanvas() """),format.raw/*1203.28*/("""{"""),format.raw/*1203.29*/("""
					"""),format.raw/*1204.6*/("""canvas.width = canvas.width;
				"""),format.raw/*1205.5*/("""}"""),format.raw/*1205.6*/("""

				"""),format.raw/*1207.5*/("""// Allow for animation
				(function drawLoop() """),format.raw/*1208.26*/("""{"""),format.raw/*1208.27*/("""
					"""),format.raw/*1209.6*/("""requestAnimFrame(drawLoop);
					renderCanvas();
				"""),format.raw/*1211.5*/("""}"""),format.raw/*1211.6*/(""")();

			"""),format.raw/*1213.4*/("""}"""),format.raw/*1213.5*/(""")();
		</script>

	<script type="text/javascript">
			function validateForm() """),format.raw/*1217.28*/("""{"""),format.raw/*1217.29*/("""
"""),format.raw/*1218.1*/("""try"""),format.raw/*1218.4*/("""{"""),format.raw/*1218.5*/("""
	"""),format.raw/*1219.2*/("""var value= true;

				var fname = document.forms["myForm"]["touchScreen"].value;

				if (!fname) """),format.raw/*1223.17*/("""{"""),format.raw/*1223.18*/("""
					"""),format.raw/*1224.6*/("""document.getElementById("touchScreen1").innerHTML = "<p style=\"color:red\">Please Select Device Type </p>";
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

					value=false;
				"""),format.raw/*1228.5*/("""}"""),format.raw/*1228.6*/(""" """),format.raw/*1228.7*/("""else """),format.raw/*1228.12*/("""{"""),format.raw/*1228.13*/("""
					"""),format.raw/*1229.6*/("""document.getElementById("touchScreen1").innerHTML = "";

				"""),format.raw/*1231.5*/("""}"""),format.raw/*1231.6*/("""
				"""),format.raw/*1232.5*/("""var lname = document.forms["myForm"]["agree"].checked;

				
				if (!lname) """),format.raw/*1235.17*/("""{"""),format.raw/*1235.18*/("""

					"""),format.raw/*1237.6*/("""document.getElementById("agree1").innerHTML = "<p style=\"color:red\">Please agree the condtion</p>";
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

					value=false;
				"""),format.raw/*1241.5*/("""}"""),format.raw/*1241.6*/(""" """),format.raw/*1241.7*/("""else """),format.raw/*1241.12*/("""{"""),format.raw/*1241.13*/("""
					"""),format.raw/*1242.6*/("""document.getElementById("agree1").innerHTML = "";

				"""),format.raw/*1244.5*/("""}"""),format.raw/*1244.6*/("""
				"""),format.raw/*1245.5*/("""var typedName = document.forms["myForm"]["typedName"].value;

				if (!typedName && fname == 'no') """),format.raw/*1247.38*/("""{"""),format.raw/*1247.39*/("""

					"""),format.raw/*1249.6*/("""document.getElementById("typedName1").innerHTML = "<p style=\"color:red\">Please enter the name</p>";
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

					value= false;
				"""),format.raw/*1253.5*/("""}"""),format.raw/*1253.6*/("""else if(typedName.trim().length<2 && fname == 'no')"""),format.raw/*1253.57*/("""{"""),format.raw/*1253.58*/("""
					
					
					"""),format.raw/*1256.6*/("""document.getElementById("typedName1").focus();

					document.getElementById("typedName1").innerHTML="<p style=\"color:red\"> Name Should More than one letter</p>";
					document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

					value=false;
					
					
				"""),format.raw/*1264.5*/("""}"""),format.raw/*1264.6*/(""" """),format.raw/*1264.7*/("""else """),format.raw/*1264.12*/("""{"""),format.raw/*1264.13*/("""
					"""),format.raw/*1265.6*/("""document.getElementById("typedName1").innerHTML = "";
					if(!typedName.match(/^[a-zA-Z ]*$/))"""),format.raw/*1266.42*/("""{"""),format.raw/*1266.43*/("""
						"""),format.raw/*1267.7*/("""document.getElementById("typedName1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
						document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


						value = false;

					"""),format.raw/*1273.6*/("""}"""),format.raw/*1273.7*/("""else"""),format.raw/*1273.11*/("""{"""),format.raw/*1273.12*/("""
						"""),format.raw/*1274.7*/("""document.getElementById("typedName1").innerHTML = "";

					"""),format.raw/*1276.6*/("""}"""),format.raw/*1276.7*/("""
				"""),format.raw/*1277.5*/("""}"""),format.raw/*1277.6*/("""

				"""),format.raw/*1279.5*/("""var sign = document.forms["myForm"]["sign"].value;
	
			
					var conva=document.getElementById("blank").toDataURL();
				
					
					if ((sign == conva) && fname == 'yes') """),format.raw/*1285.45*/("""{"""),format.raw/*1285.46*/("""

					"""),format.raw/*1287.6*/("""document.getElementById("sign1").innerHTML = "<p style=\"color:red\"> Electonic Signature Required </p>";
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

					value= false;
				"""),format.raw/*1291.5*/("""}"""),format.raw/*1291.6*/(""" """),format.raw/*1291.7*/("""else """),format.raw/*1291.12*/("""{"""),format.raw/*1291.13*/("""
					"""),format.raw/*1292.6*/("""document.getElementById("sign1").innerHTML = "";

				"""),format.raw/*1294.5*/("""}"""),format.raw/*1294.6*/("""
				

				"""),format.raw/*1297.5*/("""if(value)"""),format.raw/*1297.14*/("""{"""),format.raw/*1297.15*/("""
					 """),format.raw/*1298.7*/("""$('#loading').show();
				"""),format.raw/*1299.5*/("""}"""),format.raw/*1299.6*/("""
				"""),format.raw/*1300.5*/("""return value;
"""),format.raw/*1301.1*/("""}"""),format.raw/*1301.2*/("""catch(err)"""),format.raw/*1301.12*/("""{"""),format.raw/*1301.13*/("""}"""),format.raw/*1301.14*/("""


			"""),format.raw/*1304.4*/("""}"""),format.raw/*1304.5*/("""
		"""),format.raw/*1305.3*/("""</script>
	<script type="text/javascript">

jQuery(function ($) """),format.raw/*1308.21*/("""{"""),format.raw/*1308.22*/("""
    """),format.raw/*1309.5*/("""var $active = $('.panel-collapse.in').prev().addClass('active');
/*     $active.find('a').append('<span class="glyphicon glyphicon-minus pull-left glyphicon-blue"></span>');
 */    $('.panel-heading').not($active).find('a');
   

    

"""),format.raw/*1316.1*/("""}"""),format.raw/*1316.2*/(""");
</script>
</body>
</html>"""))}
  }

  def render(role:String,referralId:Integer,exsist:Integer): play.twirl.api.HtmlFormat.Appendable = apply(role,referralId,exsist)

  def f:((String,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (role,referralId,exsist) => apply(role,referralId,exsist)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:21 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/visdomreferral2.scala.html
                  HASH: ebb78f76aba75a1dced1988bc25e52b7e47ded57
                  MATRIX: 749->1|885->49|912->50|1193->305|1207->311|1263->347|1406->463|1421->469|1481->508|1535->535|1550->541|1620->590|1773->716|1788->722|1853->766|1907->793|1922->799|1974->830|2028->857|2043->863|2105->904|2328->1100|2343->1106|2406->1148|2449->1164|2464->1170|2526->1211|2611->1269|2626->1275|2686->1314|2762->1363|2777->1369|2832->1403|2908->1452|2923->1458|2981->1495|3057->1544|3072->1550|3128->1585|3189->1619|3204->1625|3267->1667|3423->1796|3451->1797|3480->1799|3549->1841|3577->1842|3606->1844|3646->1856|3675->1857|3704->1859|3833->1961|3861->1962|3890->1964|3931->1977|3960->1978|3989->1980|4029->1993|4057->1994|4086->1996|4132->2014|4161->2015|4190->2017|4474->2274|4502->2275|4531->2277|4573->2291|4602->2292|4631->2294|4673->2309|4701->2310|4730->2312|4786->2340|4815->2341|4844->2343|4900->2372|4928->2373|4957->2375|4989->2380|5017->2381|5046->2383|5109->2419|5137->2420|5166->2422|5234->2462|5263->2463|5292->2465|5376->2522|5404->2523|5432->2524|5514->2578|5543->2579|5572->2581|5654->2636|5682->2637|5711->2639|5782->2682|5811->2683|5841->2686|5985->2802|6014->2803|6044->2805|6080->2813|6110->2814|6141->2817|6189->2837|6218->2838|6248->2840|6291->2854|6321->2855|6352->2858|6449->2927|6478->2928|6508->2930|6551->2944|6581->2945|6612->2948|6789->3097|6818->3098|6848->3100|6905->3128|6935->3129|6966->3132|7024->3162|7053->3163|7083->3165|7132->3185|7162->3186|7193->3189|7289->3257|7318->3258|7348->3260|7403->3286|7433->3287|7464->3290|7579->3377|7608->3378|7638->3380|7694->3407|7724->3408|7755->3411|7889->3517|7918->3518|7949->3521|8023->3566|8053->3567|8085->3571|8128->3586|8144->3592|8199->3625|8282->3680|8311->3681|8340->3682|8418->3731|8448->3732|8478->3734|8610->3838|8626->3844|8684->3880|8751->3919|8780->3920|8809->3921|8851->3934|8881->3935|8912->3938|9090->4088|9119->4089|9150->4092|9186->4100|9216->4101|9247->4104|9480->4309|9509->4310|9539->4312|9641->4385|9671->4386|9704->4391|9792->4450|9822->4451|9864->4464|10073->4644|10103->4645|10179->4692|10209->4693|10251->4706|10461->4887|10491->4888|10530->4899|10560->4900|10695->5007|10711->5013|10774->5054|10908->5160|10924->5166|10986->5206|11378->5570|11404->5574|11589->5731|11617->5737|11703->5795|11735->5805|11815->5857|11841->5861|19792->13784|19808->13790|19863->13823|46716->40627|46746->40628|46776->40629|46812->40636|46842->40637|46872->40638|49173->42910|49190->42916|49254->42957|49310->42984|49327->42990|49381->43021|49466->43076|49497->43077|49531->43082|49603->43125|49633->43126|49827->43290|49858->43291|49892->43296|49950->43324|49981->43325|50016->43331|50129->43414|50160->43415|50196->43422|50262->43459|50292->43460|50327->43466|50357->43467|50390->43471|50420->43472|50738->43760|50769->43761|50804->43767|50936->43869|50967->43870|51002->43876|51265->44109|51296->44110|51334->44119|51410->44166|51440->44167|51475->44173|51505->44174|52050->44689|52081->44690|52121->44700|52290->44840|52321->44841|52413->44903|52444->44904|52485->44916|52630->45032|52660->45033|52784->45127|52815->45128|52850->45134|52901->45156|52931->45157|53044->45240|53075->45241|53110->45247|53198->45306|53228->45307|53319->45368|53350->45369|53385->45375|53435->45396|53465->45397|53558->45460|53589->45461|53624->45467|53692->45506|53722->45507|53860->45615|53891->45616|53926->45622|54072->45738|54103->45739|54139->45746|54228->45806|54258->45807|54333->45853|54363->45854|54455->45916|54486->45917|54521->45923|54594->45966|54625->45967|54656->45968|54731->46014|54761->46015|54854->46078|54885->46079|54920->46085|55026->46161|55057->46162|55093->46169|55182->46229|55212->46230|55287->46276|55317->46277|55469->46399|55500->46400|55535->46406|55589->46430|55620->46431|55656->46438|55710->46463|55740->46464|55774->46469|55804->46470|55903->46539|55934->46540|55969->46546|56023->46570|56054->46571|56090->46578|56144->46603|56174->46604|56208->46609|56238->46610|56338->46680|56369->46681|56404->46687|56458->46711|56489->46712|56525->46719|56579->46744|56609->46745|56643->46750|56673->46751|56822->46870|56853->46871|56888->46877|56976->46935|57007->46936|57043->46943|57153->47024|57183->47025|57218->47031|57248->47032|57283->47038|57415->47140|57446->47141|57481->47147|57569->47205|57600->47206|57636->47213|57768->47316|57798->47317|57833->47323|57863->47324|57898->47330|57978->47380|58009->47381|58044->47387|58087->47400|58118->47401|58154->47408|58310->47535|58340->47536|58374->47541|58404->47542|58439->47548|58516->47595|58547->47596|58582->47602|58644->47635|58674->47636|58709->47642|58787->47690|58818->47691|58853->47697|58935->47750|58965->47751|59003->47760|59033->47761|59141->47839|59172->47840|59202->47841|59234->47844|59264->47845|59295->47847|59423->47945|59454->47946|59489->47952|59801->48235|59831->48236|59861->48237|59896->48242|59927->48243|59962->48249|60052->48310|60082->48311|60116->48316|60223->48393|60254->48394|60290->48401|60595->48677|60625->48678|60655->48679|60690->48684|60721->48685|60756->48691|60840->48746|60870->48747|60904->48752|61033->48851|61064->48852|61100->48859|61406->49136|61436->49137|61517->49188|61548->49189|61595->49207|61973->49556|62003->49557|62033->49558|62068->49563|62099->49564|62134->49570|62259->49665|62290->49666|62326->49673|62644->49962|62674->49963|62708->49967|62739->49968|62775->49975|62864->50035|62894->50036|62928->50041|62958->50042|62993->50048|63196->50221|63227->50222|63263->50229|63573->50510|63603->50511|63633->50512|63668->50517|63699->50518|63734->50524|63817->50578|63847->50579|63887->50590|63926->50599|63957->50600|63993->50607|64048->50633|64078->50634|64112->50639|64155->50653|64185->50654|64225->50664|64256->50665|64287->50666|64322->50672|64352->50673|64384->50676|64478->50740|64509->50741|64543->50746|64808->50982|64838->50983
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|39->11|39->11|39->11|41->13|41->13|41->13|45->17|45->17|45->17|47->19|47->19|47->19|49->21|49->21|49->21|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|60->32|60->32|60->32|66->38|66->38|67->39|69->41|69->41|71->43|71->43|71->43|72->44|77->49|77->49|79->51|79->51|79->51|80->52|81->53|81->53|83->55|83->55|83->55|84->56|93->65|93->65|95->67|95->67|95->67|96->68|97->69|97->69|99->71|99->71|99->71|100->72|102->74|102->74|104->76|104->76|104->76|105->77|107->79|107->79|109->81|109->81|109->81|110->82|113->85|113->85|114->86|116->88|116->88|117->89|120->92|120->92|122->94|123->95|123->95|124->96|129->101|129->101|131->103|131->103|131->103|132->104|133->105|133->105|135->107|135->107|135->107|136->108|140->112|140->112|142->114|142->114|142->114|143->115|153->125|153->125|155->127|157->129|157->129|158->130|160->132|160->132|162->134|162->134|162->134|163->135|167->139|167->139|169->141|169->141|169->141|170->142|173->145|173->145|175->147|175->147|175->147|176->148|180->152|180->152|183->155|183->155|183->155|184->156|184->156|184->156|184->156|189->161|189->161|190->162|195->167|195->167|196->168|202->174|202->174|202->174|203->175|203->175|203->175|205->177|205->177|206->178|216->188|216->188|218->190|218->190|218->190|219->191|229->201|229->201|231->203|233->205|233->205|234->206|235->207|235->207|236->208|241->213|241->213|242->214|242->214|243->215|248->220|248->220|249->221|249->221|256->228|256->228|256->228|262->234|262->234|262->234|277->249|277->249|282->254|282->254|283->255|283->255|284->256|284->256|508->480|508->480|508->480|990->961|990->961|990->961|990->961|990->961|990->961|1074->1045|1074->1045|1074->1045|1075->1046|1075->1046|1075->1046|1078->1049|1078->1049|1079->1050|1080->1051|1080->1051|1087->1058|1087->1058|1088->1059|1089->1060|1089->1060|1090->1061|1092->1063|1092->1063|1093->1064|1094->1065|1094->1065|1095->1066|1095->1066|1096->1067|1096->1067|1104->1075|1104->1075|1106->1077|1107->1078|1107->1078|1108->1079|1113->1084|1113->1084|1114->1085|1115->1086|1115->1086|1116->1087|1116->1087|1132->1103|1132->1103|1133->1104|1136->1107|1136->1107|1137->1108|1137->1108|1140->1111|1143->1114|1143->1114|1147->1118|1147->1118|1148->1119|1150->1121|1150->1121|1152->1123|1152->1123|1153->1124|1155->1126|1155->1126|1156->1127|1156->1127|1157->1128|1158->1129|1158->1129|1159->1130|1159->1130|1160->1131|1161->1132|1161->1132|1164->1135|1164->1135|1165->1136|1167->1138|1167->1138|1168->1139|1170->1141|1170->1141|1172->1143|1172->1143|1173->1144|1173->1144|1174->1145|1174->1145|1174->1145|1174->1145|1176->1147|1176->1147|1177->1148|1177->1148|1178->1149|1179->1150|1179->1150|1180->1151|1182->1153|1182->1153|1184->1155|1184->1155|1187->1158|1187->1158|1188->1159|1188->1159|1188->1159|1189->1160|1190->1161|1190->1161|1191->1162|1191->1162|1192->1163|1192->1163|1193->1164|1193->1164|1193->1164|1194->1165|1195->1166|1195->1166|1196->1167|1196->1167|1197->1168|1197->1168|1198->1169|1198->1169|1198->1169|1199->1170|1200->1171|1200->1171|1201->1172|1201->1172|1204->1175|1204->1175|1205->1176|1206->1177|1206->1177|1207->1178|1209->1180|1209->1180|1210->1181|1210->1181|1212->1183|1213->1184|1213->1184|1214->1185|1215->1186|1215->1186|1216->1187|1218->1189|1218->1189|1219->1190|1219->1190|1221->1192|1222->1193|1222->1193|1223->1194|1223->1194|1223->1194|1224->1195|1228->1199|1228->1199|1229->1200|1229->1200|1231->1202|1232->1203|1232->1203|1233->1204|1234->1205|1234->1205|1236->1207|1237->1208|1237->1208|1238->1209|1240->1211|1240->1211|1242->1213|1242->1213|1246->1217|1246->1217|1247->1218|1247->1218|1247->1218|1248->1219|1252->1223|1252->1223|1253->1224|1257->1228|1257->1228|1257->1228|1257->1228|1257->1228|1258->1229|1260->1231|1260->1231|1261->1232|1264->1235|1264->1235|1266->1237|1270->1241|1270->1241|1270->1241|1270->1241|1270->1241|1271->1242|1273->1244|1273->1244|1274->1245|1276->1247|1276->1247|1278->1249|1282->1253|1282->1253|1282->1253|1282->1253|1285->1256|1293->1264|1293->1264|1293->1264|1293->1264|1293->1264|1294->1265|1295->1266|1295->1266|1296->1267|1302->1273|1302->1273|1302->1273|1302->1273|1303->1274|1305->1276|1305->1276|1306->1277|1306->1277|1308->1279|1314->1285|1314->1285|1316->1287|1320->1291|1320->1291|1320->1291|1320->1291|1320->1291|1321->1292|1323->1294|1323->1294|1326->1297|1326->1297|1326->1297|1327->1298|1328->1299|1328->1299|1329->1300|1330->1301|1330->1301|1330->1301|1330->1301|1330->1301|1333->1304|1333->1304|1334->1305|1337->1308|1337->1308|1338->1309|1345->1316|1345->1316
                  -- GENERATED --
              */
          