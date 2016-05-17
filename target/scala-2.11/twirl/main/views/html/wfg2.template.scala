
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
object wfg2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

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
	background: #ffffff;
	color: black;
"""),format.raw/*49.1*/("""}"""),format.raw/*49.2*/("""

"""),format.raw/*51.1*/("""#sig-dataUrl """),format.raw/*51.14*/("""{"""),format.raw/*51.15*/("""
	"""),format.raw/*52.2*/("""width: 100%;
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/("""

"""),format.raw/*55.1*/(""".regular-checkbox """),format.raw/*55.19*/("""{"""),format.raw/*55.20*/("""
	"""),format.raw/*56.2*/("""-webkit-appearance: none;
	background-color: #ffffff;
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

"""),format.raw/*87.1*/("""/*for bigger checkbox*/
*,*:after,*:before """),format.raw/*88.20*/("""{"""),format.raw/*88.21*/("""
  """),format.raw/*89.3*/("""-webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
  padding: 0;
  margin: 0;
"""),format.raw/*94.1*/("""}"""),format.raw/*94.2*/("""

"""),format.raw/*96.1*/(""".switch """),format.raw/*96.9*/("""{"""),format.raw/*96.10*/("""
  """),format.raw/*97.3*/("""position: relative;
"""),format.raw/*98.1*/("""}"""),format.raw/*98.2*/("""

"""),format.raw/*100.1*/(""".switch label """),format.raw/*100.15*/("""{"""),format.raw/*100.16*/("""
  """),format.raw/*101.3*/("""width: 100%;
  height: 100%;
  position: relative;
  display: block;
"""),format.raw/*105.1*/("""}"""),format.raw/*105.2*/("""

"""),format.raw/*107.1*/(""".switch input """),format.raw/*107.15*/("""{"""),format.raw/*107.16*/("""
  """),format.raw/*108.3*/("""top: 0; 
  right: 0; 
  bottom: 0; 
  left: 0;
  opacity: 0;
  z-index: 100;
  position: absolute;
  width: 100%;
  height: 100%;
  cursor: pointer;
"""),format.raw/*118.1*/("""}"""),format.raw/*118.2*/("""

"""),format.raw/*120.1*/("""/* DEMO 3 */


.switch.demo3 """),format.raw/*123.15*/("""{"""),format.raw/*123.16*/("""
  """),format.raw/*124.3*/("""width: 125px;
  height: 30px;
"""),format.raw/*126.1*/("""}"""),format.raw/*126.2*/("""

"""),format.raw/*128.1*/(""".switch.demo3 label """),format.raw/*128.21*/("""{"""),format.raw/*128.22*/("""
  """),format.raw/*129.3*/("""display: block;
  width: 25%;
  height: 70%;
  background: #ffffff;
"""),format.raw/*133.1*/("""}"""),format.raw/*133.2*/("""

"""),format.raw/*135.1*/(""".switch.demo3 label:after """),format.raw/*135.27*/("""{"""),format.raw/*135.28*/("""
  """),format.raw/*136.3*/("""content: "";
  position: absolute;
  top: -8px; right: -8px; bottom: -8px; left: -8px;
"""),format.raw/*139.1*/("""}"""),format.raw/*139.2*/("""

"""),format.raw/*141.1*/(""".switch.demo3 label:before """),format.raw/*141.28*/("""{"""),format.raw/*141.29*/("""
  """),format.raw/*142.3*/("""content: "";
  position: absolute;
  z-index: -1;
  top: -18px; right: -18px; bottom: -18px; left: -18px;
"""),format.raw/*146.1*/("""}"""),format.raw/*146.2*/("""


"""),format.raw/*149.1*/(""".switch.demo3 input:checked ~ label i:before """),format.raw/*149.46*/("""{"""),format.raw/*149.47*/("""
   """),format.raw/*150.4*/("""content: url(""""),_display_(/*150.19*/routes/*150.25*/.Assets.at("_resources/tick.gif")),format.raw/*150.58*/(""""); 
  color: #000000;
"""),format.raw/*152.1*/("""}"""),format.raw/*152.2*/("""
"""),format.raw/*153.1*/("""</style>
<style type="text/css">
.blocks .btn-primary """),format.raw/*155.22*/("""{"""),format.raw/*155.23*/("""
	"""),format.raw/*156.2*/("""padding: 9px 6px;
	margin: 2px 2px;
	border-radius: 0;
"""),format.raw/*159.1*/("""}"""),format.raw/*159.2*/("""

"""),format.raw/*161.1*/("""</style>

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
		<form name="myForm" action="wfg2" method="POST"
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
								ng-show="role == 'Realtor' || role == 'Financial Planner' || role == 'Professional' || role == 'Client' "
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
                    <p class="MTBasic1" align="center">Minimum Mortgage Value</p>
                  </td>
                  <td valign="top" width="28%">
                    <p class="MTBasic1" align="center">Maximum Mortgage Value</p>
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
                    <p class="mtbasic10" align="center">$42.00</p>
                  </td>
                  <td valign="top" width="28%">
                    <p class="mtbasic10" align="center">$21.00</p>
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
                    <p class="mtbasic10" align="center">$105.00</p>
                  </td>
                  <td valign="top" width="28%">
                    <p class="mtbasic10" align="center">$42.00</p>
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
                    <p class="mtbasic10" align="center">$210.00</p>
                  </td>
                  <td valign="top" width="28%">
                    <p class="mtbasic10" align="center">$95.00</p>
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
                    <p class="mtbasic10" align="center">$315.00</p>
                  </td>
                  <td valign="top" width="28%">
                    <p class="mtbasic10" align="center">$147.00</p>
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
                    <p class="mtbasic10" align="center">$420.00</p>
                  </td>
                  <td valign="top" width="28%">
                    <p class="mtbasic10" align="center">$210.00</p>
                  </td>
                </tr>
              </tbody>

									</table>
								</div>
							</div>

						<!-- 	<div ng-show="role == 'Client' " id="cid_44"
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
												<td valign="top" width="252">
													<p class="MTBasic1" align="center">Maximum Mortgage
														Value</p>
												</td>
												<td valign="top" width="153">
													<p class="MTBasic1" align="center">Referral Fee</p>
												</td>
												<td valign="top" width="162">
													<p class="MTBasic1" align="center">Renewal Fee</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="171">
													<p class="mtbasic10" align="center">$50,000.00</p>
												</td>
												<td valign="top" width="252">
													<p class="mtbasic10" align="center">$200,000.00</p>
												</td>
												<td valign="top" width="153">
													<p class="mtbasic10" align="center">$50.00</p>
												</td>
												<td valign="top" width="162">
													<p class="mtbasic10" align="center">$25.00</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="171">
													<p class="mtbasic10" align="center">$200,001.00</p>
												</td>
												<td valign="top" width="252">
													<p class="mtbasic10" align="center">$350,000.00</p>
												</td>
												<td valign="top" width="153">
													<p class="mtbasic10" align="center">$125.00</p>
												</td>
												<td valign="top" width="162">
													<p class="mtbasic10" align="center">$50.00</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="171">
													<p class="mtbasic10" align="center">$350,001.00</p>
												</td>
												<td valign="top" width="252">
													<p class="mtbasic10" align="center">$600,000.00</p>
												</td>
												<td valign="top" width="153">
													<p class="mtbasic10" align="center">$250.00</p>
												</td>
												<td valign="top" width="162">
													<p class="mtbasic10" align="center">$125.00</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="171">
													<p class="mtbasic10" align="center">$600,001.00</p>
												</td>
												<td valign="top" width="252">
													<p class="mtbasic10" align="center">$900,000.00</p>
												</td>
												<td valign="top" width="153">
													<p class="mtbasic10" align="center">$350.00</p>
												</td>
												<td valign="top" width="162">
													<p class="mtbasic10" align="center">$175.00</p>
												</td>
											</tr>
											<tr>
												<td valign="top" width="171">
													<p class="mtbasic10" align="center">$900,001.00</p>
												</td>
												<td valign="top" width="252">
													<p class="mtbasic10" align="center">$3,000,000.00</p>
												</td>
												<td valign="top" width="153">
													<p class="mtbasic10" align="center">$500.00</p>
												</td>
												<td valign="top" width="162">
													<p class="mtbasic10" align="center">$250.00</p>
												</td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>


 -->
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
											src=""""),_display_(/*479.18*/routes/*479.24*/.Assets.at("_resources/plus.png")),format.raw/*479.57*/(""""  size="10px">
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
							<label style="width: 150px;height: 35px" class="btn btn-primary"
								btn-radio="'yes'" ng-change="change()" ng-model="company">
								Yes </label> <label style="width: 150px;height: 35px" class="btn btn-primary"
								btn-radio="'no'" ng-change="change()" ng-model="company">
								No </label> <br> <br>


						</div>
						<div id="touchScreen1"></div>

						<input type="hidden" id="role" name="touchScreen"
							value=""""),format.raw/*960.15*/("""{"""),format.raw/*960.16*/("""{"""),format.raw/*960.17*/("""company"""),format.raw/*960.24*/("""}"""),format.raw/*960.25*/("""}"""),format.raw/*960.26*/(""""> <br> <br> 
							<br>
								<!-- <input type="checkbox"  id="checkbox-2-4" class="regular-checkbox big-checkbox"/> -->
					<div class="row">
						<div class="col-sm-5">
							<label>I agree to the terms and conditions<font color="red">*</font></label>
						</div>
						<div class="col-sm-4" style="padding-left: 0%;">
							<div class="switch demo3 col-sm-4">
	                    	 <input type="checkbox" name="agree">	<label style="border-style:inset;border-color: black;height: 85%;width: 30%"><i ></i></label>
	               	 		</div>	
						</div>
					</div>
					<div id="agree1"></div>
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

						<input type="submit" style="width: 280px" class="btn btn-primary "
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


	<script src=""""),_display_(/*1043.16*/routes/*1043.22*/.Assets.at("_resources/signature_pad.js")),format.raw/*1043.63*/(""""></script>
	<script src=""""),_display_(/*1044.16*/routes/*1044.22*/.Assets.at("_resources/app.js")),format.raw/*1044.53*/(""""></script>

	<script>
			$(document).ready(function() """),format.raw/*1047.33*/("""{"""),format.raw/*1047.34*/("""
				"""),format.raw/*1048.5*/("""$('[data-toggle="tooltip"]').tooltip();
			"""),format.raw/*1049.4*/("""}"""),format.raw/*1049.5*/(""");
		</script>


	<script type="text/javascript">
			var app = angular.module("demoApp", [ 'ui.bootstrap' ]);

			app.controller('DemoController', function($scope) """),format.raw/*1056.54*/("""{"""),format.raw/*1056.55*/("""
				"""),format.raw/*1057.5*/("""init();
				function init() """),format.raw/*1058.21*/("""{"""),format.raw/*1058.22*/("""
					"""),format.raw/*1059.6*/("""$scope.newItemType = '';
					$scope.company = "";
					$scope.change = function() """),format.raw/*1061.33*/("""{"""),format.raw/*1061.34*/("""
						"""),format.raw/*1062.7*/("""console.log($scope.newItemType)
					"""),format.raw/*1063.6*/("""}"""),format.raw/*1063.7*/(""";
				"""),format.raw/*1064.5*/("""}"""),format.raw/*1064.6*/("""
			"""),format.raw/*1065.4*/("""}"""),format.raw/*1065.5*/(""");
		</script>

	<script src="https://code.jquery.com/jquery-2.1.0.min.js"></script>
	<script
		src="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
	<!--<script src="https://code.angularjs.org/snapshot/angular.min.js"></script>-->
	<script>
			(function() """),format.raw/*1073.16*/("""{"""),format.raw/*1073.17*/("""

				"""),format.raw/*1075.5*/("""// Get a regular interval for drawing to the screen
				window.requestAnimFrame = (function(callback) """),format.raw/*1076.51*/("""{"""),format.raw/*1076.52*/("""
					"""),format.raw/*1077.6*/("""return window.requestAnimationFrame
							|| window.webkitRequestAnimationFrame
							|| window.mozRequestAnimationFrame
							|| window.oRequestAnimationFrame
							|| window.msRequestAnimaitonFrame
							|| function(callback) """),format.raw/*1082.30*/("""{"""),format.raw/*1082.31*/("""
								"""),format.raw/*1083.9*/("""window.setTimeout(callback, 1000 / 60);
							"""),format.raw/*1084.8*/("""}"""),format.raw/*1084.9*/(""";
				"""),format.raw/*1085.5*/("""}"""),format.raw/*1085.6*/(""")();

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
								function(e) """),format.raw/*1101.21*/("""{"""),format.raw/*1101.22*/("""
									"""),format.raw/*1102.10*/("""clearCanvas();
									sigText.innerHTML = "Data URL for your signature will go here!";
									sigImage.setAttribute("src", "");
								"""),format.raw/*1105.9*/("""}"""),format.raw/*1105.10*/(""", false);
				submitBtn.addEventListener("click", function(e) """),format.raw/*1106.53*/("""{"""),format.raw/*1106.54*/("""
					"""),format.raw/*1107.6*/("""var dataUrl = canvas.toDataURL();
					sigText.innerHTML = dataUrl;
					sigImage.setAttribute("src", dataUrl);
				"""),format.raw/*1110.5*/("""}"""),format.raw/*1110.6*/(""", false);

				// Set up mouse events for drawing
				var drawing = false;
				var mousePos = """),format.raw/*1114.20*/("""{"""),format.raw/*1114.21*/("""
					"""),format.raw/*1115.6*/("""x : 0,
					y : 0
				"""),format.raw/*1117.5*/("""}"""),format.raw/*1117.6*/(""";
				var lastPos = mousePos;
				canvas.addEventListener("mousedown", function(e) """),format.raw/*1119.54*/("""{"""),format.raw/*1119.55*/("""
					"""),format.raw/*1120.6*/("""drawing = true;
					lastPos = getMousePos(canvas, e);
				"""),format.raw/*1122.5*/("""}"""),format.raw/*1122.6*/(""", false);
				canvas.addEventListener("mouseup", function(e) """),format.raw/*1123.52*/("""{"""),format.raw/*1123.53*/("""
					"""),format.raw/*1124.6*/("""drawing = false;
				"""),format.raw/*1125.5*/("""}"""),format.raw/*1125.6*/(""", false);
				canvas.addEventListener("mousemove", function(e) """),format.raw/*1126.54*/("""{"""),format.raw/*1126.55*/("""
					"""),format.raw/*1127.6*/("""mousePos = getMousePos(canvas, e);
				"""),format.raw/*1128.5*/("""}"""),format.raw/*1128.6*/(""", false);

				// Set up touch events for mobile, etc
				canvas.addEventListener("touchstart", function(e) """),format.raw/*1131.55*/("""{"""),format.raw/*1131.56*/("""
					"""),format.raw/*1132.6*/("""mousePos = getTouchPos(canvas, e);
					var touch = e.touches[0];
					var mouseEvent = new MouseEvent("mousedown", """),format.raw/*1134.51*/("""{"""),format.raw/*1134.52*/("""
						"""),format.raw/*1135.7*/("""clientX : touch.clientX,
						clientY : touch.clientY
					"""),format.raw/*1137.6*/("""}"""),format.raw/*1137.7*/(""");
					canvas.dispatchEvent(mouseEvent);
				"""),format.raw/*1139.5*/("""}"""),format.raw/*1139.6*/(""", false);
				canvas.addEventListener("touchend", function(e) """),format.raw/*1140.53*/("""{"""),format.raw/*1140.54*/("""
					"""),format.raw/*1141.6*/("""var mouseEvent = new MouseEvent("mouseup", """),format.raw/*1141.49*/("""{"""),format.raw/*1141.50*/("""}"""),format.raw/*1141.51*/(""");
					canvas.dispatchEvent(mouseEvent);
				"""),format.raw/*1143.5*/("""}"""),format.raw/*1143.6*/(""", false);
				canvas.addEventListener("touchmove", function(e) """),format.raw/*1144.54*/("""{"""),format.raw/*1144.55*/("""
					"""),format.raw/*1145.6*/("""var touch = e.touches[0];
					var mouseEvent = new MouseEvent("mousemove", """),format.raw/*1146.51*/("""{"""),format.raw/*1146.52*/("""
						"""),format.raw/*1147.7*/("""clientX : touch.clientX,
						clientY : touch.clientY
					"""),format.raw/*1149.6*/("""}"""),format.raw/*1149.7*/(""");
					canvas.dispatchEvent(mouseEvent);
				"""),format.raw/*1151.5*/("""}"""),format.raw/*1151.6*/(""", false);

				// Prevent scrolling when touching the canvas
				document.body.addEventListener("touchstart", function(e) """),format.raw/*1154.62*/("""{"""),format.raw/*1154.63*/("""
					"""),format.raw/*1155.6*/("""if (e.target == canvas) """),format.raw/*1155.30*/("""{"""),format.raw/*1155.31*/("""
						"""),format.raw/*1156.7*/("""e.preventDefault();
					"""),format.raw/*1157.6*/("""}"""),format.raw/*1157.7*/("""
				"""),format.raw/*1158.5*/("""}"""),format.raw/*1158.6*/(""", false);
				document.body.addEventListener("touchend", function(e) """),format.raw/*1159.60*/("""{"""),format.raw/*1159.61*/("""
					"""),format.raw/*1160.6*/("""if (e.target == canvas) """),format.raw/*1160.30*/("""{"""),format.raw/*1160.31*/("""
						"""),format.raw/*1161.7*/("""e.preventDefault();
					"""),format.raw/*1162.6*/("""}"""),format.raw/*1162.7*/("""
				"""),format.raw/*1163.5*/("""}"""),format.raw/*1163.6*/(""", false);
				document.body.addEventListener("touchmove", function(e) """),format.raw/*1164.61*/("""{"""),format.raw/*1164.62*/("""
					"""),format.raw/*1165.6*/("""if (e.target == canvas) """),format.raw/*1165.30*/("""{"""),format.raw/*1165.31*/("""
						"""),format.raw/*1166.7*/("""e.preventDefault();
					"""),format.raw/*1167.6*/("""}"""),format.raw/*1167.7*/("""
				"""),format.raw/*1168.5*/("""}"""),format.raw/*1168.6*/(""", false);

				// Get the position of the mouse relative to the canvas
				function getMousePos(canvasDom, mouseEvent) """),format.raw/*1171.49*/("""{"""),format.raw/*1171.50*/("""
					"""),format.raw/*1172.6*/("""var rect = canvasDom.getBoundingClientRect();
					return """),format.raw/*1173.13*/("""{"""),format.raw/*1173.14*/("""
						"""),format.raw/*1174.7*/("""x : mouseEvent.clientX - rect.left,
						y : mouseEvent.clientY - rect.top
					"""),format.raw/*1176.6*/("""}"""),format.raw/*1176.7*/(""";
				"""),format.raw/*1177.5*/("""}"""),format.raw/*1177.6*/("""

				"""),format.raw/*1179.5*/("""// Get the position of a touch relative to the canvas
				function getTouchPos(canvasDom, touchEvent) """),format.raw/*1180.49*/("""{"""),format.raw/*1180.50*/("""
					"""),format.raw/*1181.6*/("""var rect = canvasDom.getBoundingClientRect();
					return """),format.raw/*1182.13*/("""{"""),format.raw/*1182.14*/("""
						"""),format.raw/*1183.7*/("""x : touchEvent.touches[0].clientX - rect.left,
						y : touchEvent.touches[0].clientY - rect.top
					"""),format.raw/*1185.6*/("""}"""),format.raw/*1185.7*/(""";
				"""),format.raw/*1186.5*/("""}"""),format.raw/*1186.6*/("""

				"""),format.raw/*1188.5*/("""// Draw to the canvas
				function renderCanvas() """),format.raw/*1189.29*/("""{"""),format.raw/*1189.30*/("""
					"""),format.raw/*1190.6*/("""if (drawing) """),format.raw/*1190.19*/("""{"""),format.raw/*1190.20*/("""
						"""),format.raw/*1191.7*/("""ctx.moveTo(lastPos.x, lastPos.y);
						ctx.lineTo(mousePos.x, mousePos.y);
						ctx.stroke();
						lastPos = mousePos;
					"""),format.raw/*1195.6*/("""}"""),format.raw/*1195.7*/("""
				"""),format.raw/*1196.5*/("""}"""),format.raw/*1196.6*/("""

				"""),format.raw/*1198.5*/("""// Clear the canvas
				function clearCanvas() """),format.raw/*1199.28*/("""{"""),format.raw/*1199.29*/("""
					"""),format.raw/*1200.6*/("""canvas.width = canvas.width;
				"""),format.raw/*1201.5*/("""}"""),format.raw/*1201.6*/("""

				"""),format.raw/*1203.5*/("""// Allow for animation
				(function drawLoop() """),format.raw/*1204.26*/("""{"""),format.raw/*1204.27*/("""
					"""),format.raw/*1205.6*/("""requestAnimFrame(drawLoop);
					renderCanvas();
				"""),format.raw/*1207.5*/("""}"""),format.raw/*1207.6*/(""")();

			"""),format.raw/*1209.4*/("""}"""),format.raw/*1209.5*/(""")();
		</script>

	<script type="text/javascript">
			function validateForm() """),format.raw/*1213.28*/("""{"""),format.raw/*1213.29*/("""
"""),format.raw/*1214.1*/("""try"""),format.raw/*1214.4*/("""{"""),format.raw/*1214.5*/("""
	 """),format.raw/*1215.3*/("""var value=true;
				var fname = document.forms["myForm"]["touchScreen"].value;

				if (!fname) """),format.raw/*1218.17*/("""{"""),format.raw/*1218.18*/("""
					"""),format.raw/*1219.6*/("""document.getElementById("touchScreen1").innerHTML = "<p style=\"color:red\">Please Select Device Type </p>";
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

					value= false;
				"""),format.raw/*1223.5*/("""}"""),format.raw/*1223.6*/(""" """),format.raw/*1223.7*/("""else """),format.raw/*1223.12*/("""{"""),format.raw/*1223.13*/("""
					"""),format.raw/*1224.6*/("""document.getElementById("touchScreen1").innerHTML = "";

				"""),format.raw/*1226.5*/("""}"""),format.raw/*1226.6*/("""
				"""),format.raw/*1227.5*/("""var lname = document.forms["myForm"]["agree"].checked;

				
				if (!lname) """),format.raw/*1230.17*/("""{"""),format.raw/*1230.18*/("""

					"""),format.raw/*1232.6*/("""document.getElementById("agree1").innerHTML = "<p style=\"color:red\">Please agree the condtion</p>";
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

					value= false;
				"""),format.raw/*1236.5*/("""}"""),format.raw/*1236.6*/(""" """),format.raw/*1236.7*/("""else """),format.raw/*1236.12*/("""{"""),format.raw/*1236.13*/("""
					"""),format.raw/*1237.6*/("""document.getElementById("agree1").innerHTML = "";

				"""),format.raw/*1239.5*/("""}"""),format.raw/*1239.6*/("""
				"""),format.raw/*1240.5*/("""var typedName = document.forms["myForm"]["typedName"].value;

				if (!typedName && fname == 'no') """),format.raw/*1242.38*/("""{"""),format.raw/*1242.39*/("""

					"""),format.raw/*1244.6*/("""document.getElementById("typedName1").innerHTML = "<p style=\"color:red\">Please enter the name</p>";
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

					value=false;
				"""),format.raw/*1248.5*/("""}"""),format.raw/*1248.6*/("""else if(typedName.trim().length<2 && fname == 'no')"""),format.raw/*1248.57*/("""{"""),format.raw/*1248.58*/("""
					
					
					"""),format.raw/*1251.6*/("""document.getElementById("typedName1").focus();

					document.getElementById("typedName1").innerHTML="<p style=\"color:red\"> Name Should More than one letter</p>";
					document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

					value=false;
					
					
				"""),format.raw/*1259.5*/("""}"""),format.raw/*1259.6*/(""" 	"""),format.raw/*1259.8*/("""else """),format.raw/*1259.13*/("""{"""),format.raw/*1259.14*/("""
					"""),format.raw/*1260.6*/("""document.getElementById("typedName1").innerHTML = "";
					if(!typedName.match(/^[a-zA-Z ]*$/))"""),format.raw/*1261.42*/("""{"""),format.raw/*1261.43*/("""
						"""),format.raw/*1262.7*/("""document.getElementById("typedName1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
						document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


						value = false;

					"""),format.raw/*1268.6*/("""}"""),format.raw/*1268.7*/("""else"""),format.raw/*1268.11*/("""{"""),format.raw/*1268.12*/("""
						"""),format.raw/*1269.7*/("""document.getElementById("typedName1").innerHTML = "";

					"""),format.raw/*1271.6*/("""}"""),format.raw/*1271.7*/("""
				"""),format.raw/*1272.5*/("""}"""),format.raw/*1272.6*/("""

				"""),format.raw/*1274.5*/("""var sign = document.forms["myForm"]["sign"].value;

				var conva=document.getElementById("blank").toDataURL();
			
				
				if ((sign == conva) && fname == 'yes') """),format.raw/*1279.44*/("""{"""),format.raw/*1279.45*/("""

				"""),format.raw/*1281.5*/("""document.getElementById("sign1").innerHTML = "<p style=\"color:red\"> Electonic Signature Required </p>";
				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value= false;
			"""),format.raw/*1285.4*/("""}"""),format.raw/*1285.5*/(""" """),format.raw/*1285.6*/("""else """),format.raw/*1285.11*/("""{"""),format.raw/*1285.12*/("""
				"""),format.raw/*1286.5*/("""document.getElementById("sign1").innerHTML = "";

			"""),format.raw/*1288.4*/("""}"""),format.raw/*1288.5*/("""
				"""),format.raw/*1289.5*/("""if(value)"""),format.raw/*1289.14*/("""{"""),format.raw/*1289.15*/("""
					 """),format.raw/*1290.7*/("""$('#loading').show();
				"""),format.raw/*1291.5*/("""}"""),format.raw/*1291.6*/("""
				"""),format.raw/*1292.5*/("""return value;
"""),format.raw/*1293.1*/("""}"""),format.raw/*1293.2*/("""catch(err)"""),format.raw/*1293.12*/("""{"""),format.raw/*1293.13*/("""}"""),format.raw/*1293.14*/("""


			"""),format.raw/*1296.4*/("""}"""),format.raw/*1296.5*/("""
		"""),format.raw/*1297.3*/("""</script>
	<script type="text/javascript">

jQuery(function ($) """),format.raw/*1300.21*/("""{"""),format.raw/*1300.22*/("""
    """),format.raw/*1301.5*/("""var $active = $('.panel-collapse.in').prev().addClass('active');
/*     $active.find('a').append('<span class="glyphicon glyphicon-minus pull-left glyphicon-blue"></span>');
 */    $('.panel-heading').not($active).find('a');
   

    

"""),format.raw/*1308.1*/("""}"""),format.raw/*1308.2*/(""");
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
                  DATE: Mon May 16 20:16:27 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/wfg2.scala.html
                  HASH: 0721a8be548da119596cd5fce3230c9a717ae64d
                  MATRIX: 738->1|874->49|901->50|1182->305|1196->311|1252->347|1395->463|1410->469|1470->508|1524->535|1539->541|1609->590|1762->716|1777->722|1842->766|1896->793|1911->799|1963->830|2017->857|2032->863|2094->904|2317->1100|2332->1106|2395->1148|2438->1164|2453->1170|2515->1211|2600->1269|2615->1275|2675->1314|2751->1363|2766->1369|2821->1403|2897->1452|2912->1458|2970->1495|3046->1544|3061->1550|3117->1585|3178->1619|3193->1625|3256->1667|3412->1796|3440->1797|3469->1799|3538->1841|3566->1842|3595->1844|3635->1856|3664->1857|3693->1859|3824->1963|3852->1964|3881->1966|3922->1979|3951->1980|3980->1982|4020->1995|4048->1996|4077->1998|4123->2016|4152->2017|4181->2019|4465->2276|4493->2277|4522->2279|4564->2293|4593->2294|4622->2296|4664->2311|4692->2312|4721->2314|4777->2342|4806->2343|4835->2345|4891->2374|4919->2375|4948->2377|4980->2382|5008->2383|5037->2385|5100->2421|5128->2422|5157->2424|5225->2464|5254->2465|5283->2467|5367->2524|5395->2525|5424->2527|5495->2570|5524->2571|5554->2574|5697->2690|5725->2691|5754->2693|5789->2701|5818->2702|5848->2705|5895->2725|5923->2726|5953->2728|5996->2742|6026->2743|6057->2746|6154->2815|6183->2816|6213->2818|6256->2832|6286->2833|6317->2836|6494->2985|6523->2986|6553->2988|6611->3017|6641->3018|6672->3021|6730->3051|6759->3052|6789->3054|6838->3074|6868->3075|6899->3078|6995->3146|7024->3147|7054->3149|7109->3175|7139->3176|7170->3179|7285->3266|7314->3267|7344->3269|7400->3296|7430->3297|7461->3300|7595->3406|7624->3407|7655->3410|7729->3455|7759->3456|7791->3460|7834->3475|7850->3481|7905->3514|7956->3537|7985->3538|8014->3539|8097->3593|8127->3594|8157->3596|8240->3651|8269->3652|8299->3654|8378->3704|8408->3705|8438->3707|8570->3811|8586->3817|8644->3853|8711->3892|8740->3893|8769->3894|8811->3907|8841->3908|8872->3911|9050->4061|9079->4062|9110->4065|9146->4073|9176->4074|9207->4077|9440->4282|9469->4283|9499->4285|9601->4358|9631->4359|9664->4364|9752->4423|9782->4424|9824->4437|10033->4617|10063->4618|10139->4665|10169->4666|10211->4679|10421->4860|10451->4861|10490->4872|10520->4873|10655->4980|10671->4986|10734->5027|10868->5133|10884->5139|10946->5179|11333->5538|11359->5542|11544->5699|11572->5705|11658->5763|11690->5773|11770->5825|11796->5829|20281->14286|20297->14292|20352->14325|47203->41127|47233->41128|47263->41129|47299->41136|47329->41137|47359->41138|49693->43443|49710->43449|49774->43490|49830->43517|49847->43523|49901->43554|49986->43609|50017->43610|50051->43615|50123->43658|50153->43659|50347->43823|50378->43824|50412->43829|50470->43857|50501->43858|50536->43864|50649->43947|50680->43948|50716->43955|50782->43992|50812->43993|50847->43999|50877->44000|50910->44004|50940->44005|51258->44293|51289->44294|51324->44300|51456->44402|51487->44403|51522->44409|51785->44642|51816->44643|51854->44652|51930->44699|51960->44700|51995->44706|52025->44707|52570->45222|52601->45223|52641->45233|52810->45373|52841->45374|52933->45436|52964->45437|52999->45443|53144->45559|53174->45560|53298->45654|53329->45655|53364->45661|53415->45683|53445->45684|53558->45767|53589->45768|53624->45774|53712->45833|53742->45834|53833->45895|53864->45896|53899->45902|53949->45923|53979->45924|54072->45987|54103->45988|54138->45994|54206->46033|54236->46034|54374->46142|54405->46143|54440->46149|54586->46265|54617->46266|54653->46273|54742->46333|54772->46334|54847->46380|54877->46381|54969->46443|55000->46444|55035->46450|55108->46493|55139->46494|55170->46495|55245->46541|55275->46542|55368->46605|55399->46606|55434->46612|55540->46688|55571->46689|55607->46696|55696->46756|55726->46757|55801->46803|55831->46804|55983->46926|56014->46927|56049->46933|56103->46957|56134->46958|56170->46965|56224->46990|56254->46991|56288->46996|56318->46997|56417->47066|56448->47067|56483->47073|56537->47097|56568->47098|56604->47105|56658->47130|56688->47131|56722->47136|56752->47137|56852->47207|56883->47208|56918->47214|56972->47238|57003->47239|57039->47246|57093->47271|57123->47272|57157->47277|57187->47278|57336->47397|57367->47398|57402->47404|57490->47462|57521->47463|57557->47470|57667->47551|57697->47552|57732->47558|57762->47559|57797->47565|57929->47667|57960->47668|57995->47674|58083->47732|58114->47733|58150->47740|58282->47843|58312->47844|58347->47850|58377->47851|58412->47857|58492->47907|58523->47908|58558->47914|58601->47927|58632->47928|58668->47935|58824->48062|58854->48063|58888->48068|58918->48069|58953->48075|59030->48122|59061->48123|59096->48129|59158->48162|59188->48163|59223->48169|59301->48217|59332->48218|59367->48224|59449->48277|59479->48278|59517->48287|59547->48288|59655->48366|59686->48367|59716->48368|59748->48371|59778->48372|59810->48375|59936->48471|59967->48472|60002->48478|60315->48762|60345->48763|60375->48764|60410->48769|60441->48770|60476->48776|60566->48837|60596->48838|60630->48843|60737->48920|60768->48921|60804->48928|61110->49205|61140->49206|61170->49207|61205->49212|61236->49213|61271->49219|61355->49274|61385->49275|61419->49280|61548->49379|61579->49380|61615->49387|61920->49663|61950->49664|62031->49715|62062->49716|62109->49734|62487->50083|62517->50084|62548->50086|62583->50091|62614->50092|62649->50098|62774->50193|62805->50194|62841->50201|63159->50490|63189->50491|63223->50495|63254->50496|63290->50503|63379->50563|63409->50564|63443->50569|63473->50570|63508->50576|63702->50740|63733->50741|63768->50747|64075->51025|64105->51026|64135->51027|64170->51032|64201->51033|64235->51038|64317->51091|64347->51092|64381->51097|64420->51106|64451->51107|64487->51114|64542->51140|64572->51141|64606->51146|64649->51160|64679->51161|64719->51171|64750->51172|64781->51173|64816->51179|64846->51180|64878->51183|64972->51247|65003->51248|65037->51253|65302->51489|65332->51490
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|39->11|39->11|39->11|41->13|41->13|41->13|45->17|45->17|45->17|47->19|47->19|47->19|49->21|49->21|49->21|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|60->32|60->32|60->32|66->38|66->38|67->39|69->41|69->41|71->43|71->43|71->43|72->44|77->49|77->49|79->51|79->51|79->51|80->52|81->53|81->53|83->55|83->55|83->55|84->56|93->65|93->65|95->67|95->67|95->67|96->68|97->69|97->69|99->71|99->71|99->71|100->72|102->74|102->74|104->76|104->76|104->76|105->77|107->79|107->79|109->81|109->81|109->81|110->82|113->85|113->85|115->87|116->88|116->88|117->89|122->94|122->94|124->96|124->96|124->96|125->97|126->98|126->98|128->100|128->100|128->100|129->101|133->105|133->105|135->107|135->107|135->107|136->108|146->118|146->118|148->120|151->123|151->123|152->124|154->126|154->126|156->128|156->128|156->128|157->129|161->133|161->133|163->135|163->135|163->135|164->136|167->139|167->139|169->141|169->141|169->141|170->142|174->146|174->146|177->149|177->149|177->149|178->150|178->150|178->150|178->150|180->152|180->152|181->153|183->155|183->155|184->156|187->159|187->159|189->161|195->167|195->167|196->168|202->174|202->174|202->174|203->175|203->175|203->175|205->177|205->177|206->178|216->188|216->188|218->190|218->190|218->190|219->191|229->201|229->201|231->203|233->205|233->205|234->206|235->207|235->207|236->208|241->213|241->213|242->214|242->214|243->215|248->220|248->220|249->221|249->221|256->228|256->228|256->228|262->234|262->234|262->234|277->249|277->249|282->254|282->254|283->255|283->255|284->256|284->256|507->479|507->479|507->479|989->960|989->960|989->960|989->960|989->960|989->960|1072->1043|1072->1043|1072->1043|1073->1044|1073->1044|1073->1044|1076->1047|1076->1047|1077->1048|1078->1049|1078->1049|1085->1056|1085->1056|1086->1057|1087->1058|1087->1058|1088->1059|1090->1061|1090->1061|1091->1062|1092->1063|1092->1063|1093->1064|1093->1064|1094->1065|1094->1065|1102->1073|1102->1073|1104->1075|1105->1076|1105->1076|1106->1077|1111->1082|1111->1082|1112->1083|1113->1084|1113->1084|1114->1085|1114->1085|1130->1101|1130->1101|1131->1102|1134->1105|1134->1105|1135->1106|1135->1106|1136->1107|1139->1110|1139->1110|1143->1114|1143->1114|1144->1115|1146->1117|1146->1117|1148->1119|1148->1119|1149->1120|1151->1122|1151->1122|1152->1123|1152->1123|1153->1124|1154->1125|1154->1125|1155->1126|1155->1126|1156->1127|1157->1128|1157->1128|1160->1131|1160->1131|1161->1132|1163->1134|1163->1134|1164->1135|1166->1137|1166->1137|1168->1139|1168->1139|1169->1140|1169->1140|1170->1141|1170->1141|1170->1141|1170->1141|1172->1143|1172->1143|1173->1144|1173->1144|1174->1145|1175->1146|1175->1146|1176->1147|1178->1149|1178->1149|1180->1151|1180->1151|1183->1154|1183->1154|1184->1155|1184->1155|1184->1155|1185->1156|1186->1157|1186->1157|1187->1158|1187->1158|1188->1159|1188->1159|1189->1160|1189->1160|1189->1160|1190->1161|1191->1162|1191->1162|1192->1163|1192->1163|1193->1164|1193->1164|1194->1165|1194->1165|1194->1165|1195->1166|1196->1167|1196->1167|1197->1168|1197->1168|1200->1171|1200->1171|1201->1172|1202->1173|1202->1173|1203->1174|1205->1176|1205->1176|1206->1177|1206->1177|1208->1179|1209->1180|1209->1180|1210->1181|1211->1182|1211->1182|1212->1183|1214->1185|1214->1185|1215->1186|1215->1186|1217->1188|1218->1189|1218->1189|1219->1190|1219->1190|1219->1190|1220->1191|1224->1195|1224->1195|1225->1196|1225->1196|1227->1198|1228->1199|1228->1199|1229->1200|1230->1201|1230->1201|1232->1203|1233->1204|1233->1204|1234->1205|1236->1207|1236->1207|1238->1209|1238->1209|1242->1213|1242->1213|1243->1214|1243->1214|1243->1214|1244->1215|1247->1218|1247->1218|1248->1219|1252->1223|1252->1223|1252->1223|1252->1223|1252->1223|1253->1224|1255->1226|1255->1226|1256->1227|1259->1230|1259->1230|1261->1232|1265->1236|1265->1236|1265->1236|1265->1236|1265->1236|1266->1237|1268->1239|1268->1239|1269->1240|1271->1242|1271->1242|1273->1244|1277->1248|1277->1248|1277->1248|1277->1248|1280->1251|1288->1259|1288->1259|1288->1259|1288->1259|1288->1259|1289->1260|1290->1261|1290->1261|1291->1262|1297->1268|1297->1268|1297->1268|1297->1268|1298->1269|1300->1271|1300->1271|1301->1272|1301->1272|1303->1274|1308->1279|1308->1279|1310->1281|1314->1285|1314->1285|1314->1285|1314->1285|1314->1285|1315->1286|1317->1288|1317->1288|1318->1289|1318->1289|1318->1289|1319->1290|1320->1291|1320->1291|1321->1292|1322->1293|1322->1293|1322->1293|1322->1293|1322->1293|1325->1296|1325->1296|1326->1297|1329->1300|1329->1300|1330->1301|1337->1308|1337->1308
                  -- GENERATED --
              */
          