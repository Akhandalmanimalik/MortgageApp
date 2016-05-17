
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
object visdomferral11 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Referral Source Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href=""""),_display_(/*8.34*/routes/*8.40*/.Assets.at("_resources/favicon.ico")),format.raw/*8.76*/("""">
<script
	src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
<script src=""""),_display_(/*11.15*/routes/*11.21*/.Assets.at("_resources/angular.min.js")),format.raw/*11.60*/(""""></script>

<script src=""""),_display_(/*13.15*/routes/*13.21*/.Assets.at("_resources/ui-bootstrap-tpls.min.js")),format.raw/*13.70*/(""""></script>
<!--  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

 -->
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*17.65*/(""""></script>
<script src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*18.67*/(""""></script>
<style type="text/css">
.blocks .btn-primary """),format.raw/*20.22*/("""{"""),format.raw/*20.23*/("""
	"""),format.raw/*21.2*/("""font-weight: bold;
	padding: 9px 6px;
	margin: 2px 2px;
	border-radius: 0;
		background-color: #0086b3;
	
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""

"""),format.raw/*29.1*/(""".btn """),format.raw/*29.6*/("""{"""),format.raw/*29.7*/("""
	"""),format.raw/*30.2*/("""border: 0 none;
	font-weight: bold;
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""
"""),format.raw/*33.1*/(""".btn:focus, .btn:active:focus, .btn.active:focus """),format.raw/*33.50*/("""{"""),format.raw/*33.51*/("""
    """),format.raw/*34.5*/("""outline: 0 none;
"""),format.raw/*35.1*/("""}"""),format.raw/*35.2*/("""
"""),format.raw/*36.1*/(""".btn-primary:active,.btn-primary.active """),format.raw/*36.41*/("""{"""),format.raw/*36.42*/("""
	"""),format.raw/*37.2*/("""background: #0099cc;
	color: #ffffff;
	box-shadow: none;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""
"""),format.raw/*41.1*/("""</style>
<script>
      $(function()"""),format.raw/*43.19*/("""{"""),format.raw/*43.20*/("""
        """),format.raw/*44.9*/("""$("#geocomplete").geocomplete("""),format.raw/*44.39*/("""{"""),format.raw/*44.40*/("""
          """),format.raw/*45.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*48.9*/("""}"""),format.raw/*48.10*/(""");

        $("#find").click(function()"""),format.raw/*50.36*/("""{"""),format.raw/*50.37*/("""
          """),format.raw/*51.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*52.9*/("""}"""),format.raw/*52.10*/(""");
      """),format.raw/*53.7*/("""}"""),format.raw/*53.8*/(""");
    </script>

<script>
      $(function()"""),format.raw/*57.19*/("""{"""),format.raw/*57.20*/("""
        """),format.raw/*58.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*58.40*/("""{"""),format.raw/*58.41*/("""
          """),format.raw/*59.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/(""");

        $("#find").click(function()"""),format.raw/*64.36*/("""{"""),format.raw/*64.37*/("""
          """),format.raw/*65.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/(""");
      """),format.raw/*67.7*/("""}"""),format.raw/*67.8*/(""");
    </script>
<script type="text/javascript">
  /*   $.get("https://ipinfo.io", function (response) """),format.raw/*70.55*/("""{"""),format.raw/*70.56*/("""
    	"""),format.raw/*71.6*/("""document.getElementById("ip").value=JSON.stringify(response, null, 4);
    	alert(JSON.stringify(response, null, 4));
    		/* $("#ip").html("IP: " + response.ip);
        $("#address").html("Location: " + response.city + ", " + response.region); */
       // $("#details").html(JSON.stringify(response, null, 4));
    """),format.raw/*76.5*/("""}"""),format.raw/*76.6*/(""", "jsonp"); */
    </script>

<script type="text/javascript">
    
    jQuery.ajax( """),format.raw/*81.18*/("""{"""),format.raw/*81.19*/(""" 
    	  """),format.raw/*82.8*/("""url: '//freegeoip.net/json/', 
    	  type: 'POST', 
    	  dataType: 'jsonp',
    	  success: function(location) """),format.raw/*85.36*/("""{"""),format.raw/*85.37*/("""
    	    """),format.raw/*86.10*/("""// example where I update content on the page.
    	    
    	        	document.getElementById("ip").value=JSON.stringify(location, null, 4);
    	    //alert(JSON.stringify(location, null, 4));
/* 
    	    jQuery('#city').html(location.city);
    	    jQuery('#region-code').html(location.region_code);
    	    jQuery('#region-name').html(location.region_name);
    	    jQuery('#areacode').html(location.areacode);
    	    jQuery('#ip').html(location.ip);
    	    jQuery('#zipcode').html(location.zipcode);
    	    jQuery('#longitude').html(location.longitude);
    	    jQuery('#latitude').html(location.latitude);
    	    jQuery('#country-name').html(location.country_name);
    	    jQuery('#country-code').html(location.country_code); */
    	  """),format.raw/*101.8*/("""}"""),format.raw/*101.9*/("""
    	"""),format.raw/*102.6*/("""}"""),format.raw/*102.7*/(""" """),format.raw/*102.8*/(""");
    </script>

<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->
<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*108.31*/routes/*108.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*108.79*/("""">
<script src="""),_display_(/*109.14*/routes/*109.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*109.61*/(""""></script>
<link type="text/css" rel="stylesheet" href=""""),_display_(/*110.47*/routes/*110.53*/.Assets.at("_resources/background.css")),format.raw/*110.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*111.47*/routes/*111.53*/.Assets.at("_resources/forms.css")),format.raw/*111.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*112.47*/routes/*112.53*/.Assets.at("_resources/template.css")),format.raw/*112.90*/("""">
</head>
<body>


	<div style="padding-bottom: 20px; margin-top: 20px; padding-left: 45%">
		<img alt="Visdom Logo" height="90" width="260"
			src=""""),_display_(/*119.10*/routes/*119.16*/.Assets.at("_resources/visdom-logo.png")),format.raw/*119.56*/("""" />


	</div>

	<form name="myForm" action="referal1" method="POST"
		onsubmit="return validateForm()">
		<div style="width: 90%">
			<div class="row"></div>
			<div class="row">
				<div class="col-sm-3"></div>


				<div class="col-sm-7 container-bg text-color-blue">
					<div style="padding-top: 50px"></div>
					<div data-ng-app="demoApp" style="margin-left: 5%">

						<div>
							<center>
								<h4>Welcome to the Visdom Mortgage Solutions referral
									program.</h4>
							</center>
						</div>
						<br>

						<div ng-controller="DemoController">
							<input type="hidden" name="ip" value="" id="ip">

<div>
								<input type="hidden" id="role" name="role"
									value=""""),format.raw/*149.17*/("""{"""),format.raw/*149.18*/("""{"""),format.raw/*149.19*/("""newItemType"""),format.raw/*149.30*/("""}"""),format.raw/*149.31*/("""}"""),format.raw/*149.32*/("""" ng-required>
							</div>
							<div class="form-group" style="width: 60%">
								<label for="usr"> <Strong>What best describes
										your role? </Strong><span style="color: red; font-size: 3">*</span></label>

							</div>
							

							<div class="btn-group blocks">
								<label style="width: 180px; border-style: groove;"
									class="btn btn-primary " btn-radio="'Realtor'"
									ng-change="change()" ng-model="newItemType" title="Choose “Realtor” if your primary business activity is selling real estate, you must hold a license in good standing as a associate, agent, sales representative, associate broker or broker through the appropriate provincial  licensing body."> Realtor </label> <label
									style="width: 180px; border-style: groove;"
									class="btn btn-primary full " btn-radio="'Financial Planner'"
									ng-change="change()" ng-model="newItemType" title="Choose “Financial Planner” if your primary business activities include the sale of insurance, sale and/or management of investments, estate or financial planning. You should hold the appropriate licenses for the province in which you reside."> Financial
									Planner </label><br> <label
									style="width: 180px; border-style: groove;"
									class="btn btn-primary " btn-radio="'Professional'"
									ng-change="change()" ng-model="newItemType" title="Choose “Professional” if within your daily business you would come across opportunities to refer mortgage customers, Professions such as Lawyers, Accountants, Tax Advisors, Builders, Appraisers, Auctioneers, HR Personnel, or Bank Representative."> Professional

								</label> <label style="width: 180px; border-style: groove;"
									class="btn btn-primary " btn-radio="'Client'"
									ng-change="change()" ng-model="newItemType" title="Choose “Client” if you don’t hold a real estate or insurance type licensure and are not in a professions whose regular daily responsibilities expose you to be involved with real estate, financing, or human resource activities. You are just a fan of Visdom and like to earn extra cash for referrals."> Client </label>

								<div id="role1"></div>

							</div>





							<br>
							<br> <br>


							<div class="form-group" style="width: 60%">
								<label for="usr"> <Strong>Your First Name </Strong><span
									style="color: red; font-size: 3">*</span></label> <input type="text"
									id="fname" name="fname" class="form-control" required>
								<div id="fname1"></div>

							</div>
							<br>
							<div class="form-group" style="width: 60%">
								<label for="pwd"><Strong>Your Last Name</Strong> <span
									style="color: red; font-size: 3">*</span> </label> <input type="text"
									id="lname" name="lname" class="form-control" required>

								<div id="lname1"></div>

							</div>
							<br>






							<div class="form-group" style="width: 60%">
								<label for="pwd"><Strong> E-mail Address</Strong><span
									style="color: red; font-size: 3">*</span> </label> <input type="email"
									id="email" name="email" class="form-control"
									placeholder="Ex: myemail@example.com" 				required>
								<div id="email1"></div>


							</div>

							<div class="form-group" style="width: 60%">
								<input type="email" id="email2" name="email2" class="form-control"
									placeholder="Confirm Email" required>
								<div id="error"></div>
								<div id="email2"></div>

							</div>
							<br>

							<div class="form-group" style="width: 40%"
								title="This is the text of the tooltip">
								<label><Strong>Phone Number </Strong> <span
									style="color: red; font-size: 3">*</span> </label> <input type="text"
									class="form-control" name="phone" id="phonedatata"
										 required/>

								<div id="phone1"></div>

								<span>Please specify numeric values only </span>
							</div>
							<br>


							<div
								ng-show="newItemType == 'Financial Planner' || newItemType =='Professional' ">


								<div class="form-group" style="width: 100%">
									<label for="pwd"><Strong>In some regulated
											occupations, referral compensation must be paid to the
											company a person is licensed with rather than directly to
											individuals (e.g. Real Estate Agent, Mortgage Broker). Should
											referral compensation be paid directly to you or to the
											company you work with? </Strong><span style="color: red; font-size: 3">*</span>
									</label>
								</div>





								<div class="btn-group blocks" data-toggle="buttons">
									<label style="width: 180px" class="btn btn-primary"
										btn-radio="'Company'" ng-change="change()" ng-model="company">
										Company </label> <label style="width: 180px" class="btn btn-primary"
										btn-radio="'Direct To MySelf'" ng-change="change()"
										ng-model="company"> Direct To MySelf </label>
								</div>
								<div id="feeTo1"></div>
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*268.61*/("""{"""),format.raw/*268.62*/("""{"""),format.raw/*268.63*/("""company"""),format.raw/*268.70*/("""}"""),format.raw/*268.71*/("""}"""),format.raw/*268.72*/(""""> <br>
								<br>


								<div class="map_canvas"></div>

								<div class="form-group" style="width: 60%">
									<label for="pwd"><Strong> Company Name ? </Strong><span
										style="color: red; font-size: 3">*</span> </label> <input type="text"
									id="company"	name="company" class="form-control" >
									<div id="company1"></div>

								</div>

								<div class="form-group" style="width: 60%">
									<label for="pwd"><Strong> Company Address </Strong><span
										style="color: red; font-size: 3">*</span> </label> <input
										id="geocomplete" type="text" name="formatted_address"
										class="form-control" ng-model="companyAddress"
										placeholder="Enter Location" ng-required> <input
										type="hidden" name="companyAddress" value=""""),format.raw/*288.54*/("""{"""),format.raw/*288.55*/("""{"""),format.raw/*288.56*/("""companyAddress"""),format.raw/*288.70*/("""}"""),format.raw/*288.71*/("""}"""),format.raw/*288.72*/("""">
									<div id="formattedaddress1"></div>


								</div>
							</div>
							<div ng-show="newItemType == 'Realtor'">

								<div class="form-group" style="width: 70%">
									<label for="pwd"><Strong> What is the name of
											the Brokerage you are licensed under? </Strong><span
										style="color: red; font-size: 3">*</span> </label> <input type="text"
									id="broker"	name="broker" class="form-control" ng-required>
									<div id="broker1"></div>

								</div>
								<div class="map_canvas"></div>
								<div class="form-group" style="width: 60%; height: 30%">
									<label for="pwd"><Strong> What is the address
											of the Brokerage?</Strong> <span style="color: red; font-size: 3">*</span>
									</label> <input id="geocomplete1" type="text"
										ng-model="companyAddress1" name="formatted_address"
										class="form-control" placeholder="Enter Location" ng-required>
									<input type="hidden" name="companyAddress1"
										value=""""),format.raw/*312.18*/("""{"""),format.raw/*312.19*/("""{"""),format.raw/*312.20*/("""companyAddress1"""),format.raw/*312.35*/("""}"""),format.raw/*312.36*/("""}"""),format.raw/*312.37*/("""">

									<div id="address1"></div>

								</div>
								<div class="form-group" style="width: 60%">
									<label for="pwd"><Strong> What is the phone
											number of the Brokerage? </Strong> <span
										style="color: red; font-size: 3">*</span> </label> <input type="text"
										id="brokerPhone" name="brokerPhone" class="form-control"
										ng-required>

									<div id="brokerPhone1"></div>

								</div>

								<div class="form-group" style="width: 60%">
									<label for="pwd"><Strong>Who is the Broker
											that manages the company where you are licenced? </Strong> <span
										style="color: red; font-size: 3">*</span> </label> <input type="text"
									id="brokerMange"	name="brokerMange" class="form-control" ng-required>
									<div id="brokerMange1"></div>

								</div>
							</div>
							<div class="form-group" style="width: 100%">
								<label for="pwd"><Strong>Who referred you to
										Visdom? (Or how did you find Visdom in the event you were not
										referred by a person) </Strong> <span style="color: red; font-size: 3">*</span>
								</label> <input type="text" id="refer" name="refer" class="form-control" 
								
								data-toggle="tooltip" data-placement="right"
									title="Please be as specific as possible, were you introduced by a person (including their name), a Visdom employee, our website, or the internet.  Thank you."
								
								
								required>
								<div id="refer1"></div>

							</div>
							<br>



							<div align="left">

								<input type="submit" class="btn btn-primary btn-block"
									value="Next">

								<div align="center" id="submiterror">
									<font color="red"></font>
								</div>

							</div>




							<div style="padding-bottom: 50px;"></div>
						</div>
						<div class="col-sm-3"></div>
					</div>
				</div>
			</div>
		</div>
	</form>



	<script type="text/javascript">
    $(function() """),format.raw/*381.18*/("""{"""),format.raw/*381.19*/("""
        """),format.raw/*382.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*385.5*/("""}"""),format.raw/*385.6*/(""");
	
</script>
	<script type="text/javascript">
    $(function() """),format.raw/*389.18*/("""{"""),format.raw/*389.19*/("""
        """),format.raw/*390.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#brokerPhone").mask("999-999-9999");
    """),format.raw/*393.5*/("""}"""),format.raw/*393.6*/(""");
	
</script>



	<script>
$(document).ready(function()"""),format.raw/*400.29*/("""{"""),format.raw/*400.30*/("""
    """),format.raw/*401.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*402.1*/("""}"""),format.raw/*402.2*/(""");
</script>

	<script
		src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>

	<script src="jquery.geocomplete.js"></script>
	<script>
      $(function()"""),format.raw/*410.19*/("""{"""),format.raw/*410.20*/("""
        """),format.raw/*411.9*/("""$("#geocomplete").geocomplete("""),format.raw/*411.39*/("""{"""),format.raw/*411.40*/("""
          """),format.raw/*412.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*415.9*/("""}"""),format.raw/*415.10*/(""");

        $("#find").click(function()"""),format.raw/*417.36*/("""{"""),format.raw/*417.37*/("""
          """),format.raw/*418.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*419.9*/("""}"""),format.raw/*419.10*/(""");
      """),format.raw/*420.7*/("""}"""),format.raw/*420.8*/(""");
    </script>

	<script>
      $(function()"""),format.raw/*424.19*/("""{"""),format.raw/*424.20*/("""
        """),format.raw/*425.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*425.40*/("""{"""),format.raw/*425.41*/("""
          """),format.raw/*426.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*429.9*/("""}"""),format.raw/*429.10*/(""");

        $("#find").click(function()"""),format.raw/*431.36*/("""{"""),format.raw/*431.37*/("""
          """),format.raw/*432.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*433.9*/("""}"""),format.raw/*433.10*/(""");
      """),format.raw/*434.7*/("""}"""),format.raw/*434.8*/(""");
    </script>
	<script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*439.56*/("""{"""),format.raw/*439.57*/("""
        """),format.raw/*440.9*/("""init();
        function init() """),format.raw/*441.25*/("""{"""),format.raw/*441.26*/("""
            """),format.raw/*442.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*444.41*/("""{"""),format.raw/*444.42*/("""
                """),format.raw/*445.17*/("""console.log($scope.newItemType)
            """),format.raw/*446.13*/("""}"""),format.raw/*446.14*/(""";
        """),format.raw/*447.9*/("""}"""),format.raw/*447.10*/("""
    """),format.raw/*448.5*/("""}"""),format.raw/*448.6*/(""");
    </script>

	<script type="text/javascript">
 function validateForm() """),format.raw/*452.26*/("""{"""),format.raw/*452.27*/("""
	 
	 """),format.raw/*454.3*/("""try"""),format.raw/*454.6*/("""{"""),format.raw/*454.7*/("""
		"""),format.raw/*455.3*/("""var role=document.forms["myForm"]["role"].value;
		
		if(!role)"""),format.raw/*457.12*/("""{"""),format.raw/*457.13*/("""
			"""),format.raw/*458.4*/("""document.getElementById("role1").innerHTML="<p style=\"color:red\">Please Select Role</p>";
			document.getElementById("role").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			return false;
		"""),format.raw/*464.3*/("""}"""),format.raw/*464.4*/("""else"""),format.raw/*464.8*/("""{"""),format.raw/*464.9*/("""
	    	"""),format.raw/*465.7*/("""document.getElementById("role1").innerHTML="";

		"""),format.raw/*467.3*/("""}"""),format.raw/*467.4*/(""" 

	 """),format.raw/*469.3*/("""var fname=document.forms["myForm"]["fname"].value;
	 

		if(!fname)"""),format.raw/*472.13*/("""{"""),format.raw/*472.14*/("""
			"""),format.raw/*473.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			return false;
		"""),format.raw/*479.3*/("""}"""),format.raw/*479.4*/("""else"""),format.raw/*479.8*/("""{"""),format.raw/*479.9*/("""
	    	"""),format.raw/*480.7*/("""document.getElementById("fname1").innerHTML="";

		"""),format.raw/*482.3*/("""}"""),format.raw/*482.4*/(""" 
		"""),format.raw/*483.3*/("""var lname=document.forms["myForm"]["lname"].value;
		 
		if(!lname)"""),format.raw/*485.13*/("""{"""),format.raw/*485.14*/("""
			
			"""),format.raw/*487.4*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
			document.getElementById("lname").focus();
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			return false;
		"""),format.raw/*492.3*/("""}"""),format.raw/*492.4*/("""
			"""),format.raw/*493.4*/("""else"""),format.raw/*493.8*/("""{"""),format.raw/*493.9*/("""
		    	"""),format.raw/*494.8*/("""document.getElementById("lname1").innerHTML="";

			"""),format.raw/*496.4*/("""}"""),format.raw/*496.5*/(""" 
		
		
	 
		"""),format.raw/*500.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*502.13*/("""{"""),format.raw/*502.14*/("""
			
			"""),format.raw/*504.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			return false;
		"""),format.raw/*510.3*/("""}"""),format.raw/*510.4*/("""else"""),format.raw/*510.8*/("""{"""),format.raw/*510.9*/("""
	    	"""),format.raw/*511.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*513.3*/("""}"""),format.raw/*513.4*/("""
	 
	 
    """),format.raw/*516.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*520.24*/("""{"""),format.raw/*520.25*/("""         
		  
    """),format.raw/*522.5*/("""}"""),format.raw/*522.6*/("""else"""),format.raw/*522.10*/("""{"""),format.raw/*522.11*/("""   
		"""),format.raw/*523.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
    """),format.raw/*529.5*/("""}"""),format.raw/*529.6*/("""
    
    """),format.raw/*531.5*/("""if(pattern.test(x2))"""),format.raw/*531.25*/("""{"""),format.raw/*531.26*/("""         
		  
    """),format.raw/*533.5*/("""}"""),format.raw/*533.6*/("""else"""),format.raw/*533.10*/("""{"""),format.raw/*533.11*/("""   
		"""),format.raw/*534.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email2").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
    """),format.raw/*540.5*/("""}"""),format.raw/*540.6*/("""
    """),format.raw/*541.5*/("""if (x  != x2) """),format.raw/*541.19*/("""{"""),format.raw/*541.20*/("""
"""),format.raw/*542.1*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
document.getElementById("email").focus();

document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

    	return false;
    """),format.raw/*548.5*/("""}"""),format.raw/*548.6*/("""else"""),format.raw/*548.10*/("""{"""),format.raw/*548.11*/("""
    	"""),format.raw/*549.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*551.5*/("""}"""),format.raw/*551.6*/("""
    
	"""),format.raw/*553.2*/("""var phone=document.forms["myForm"]["phone"].value;
	 
	if(!phone)"""),format.raw/*555.12*/("""{"""),format.raw/*555.13*/("""
		"""),format.raw/*556.3*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
		document.getElementById("phonedatata").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
	"""),format.raw/*562.2*/("""}"""),format.raw/*562.3*/("""	
	"""),format.raw/*563.2*/("""else"""),format.raw/*563.6*/("""{"""),format.raw/*563.7*/("""
    	"""),format.raw/*564.6*/("""document.getElementById("phone1").innerHTML="";

	"""),format.raw/*566.2*/("""}"""),format.raw/*566.3*/(""" 
    
	"""),format.raw/*568.2*/("""var feeTo=document.forms["myForm"]["feeTo"].value;

	if(!feeTo)"""),format.raw/*570.12*/("""{"""),format.raw/*570.13*/("""

		"""),format.raw/*572.3*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*572.58*/("""{"""),format.raw/*572.59*/("""
		"""),format.raw/*573.3*/("""document.getElementById("feeTo1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("feeTo").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
	"""),format.raw/*579.2*/("""}"""),format.raw/*579.3*/("""
	"""),format.raw/*580.2*/("""}"""),format.raw/*580.3*/("""else"""),format.raw/*580.7*/("""{"""),format.raw/*580.8*/("""
    	"""),format.raw/*581.6*/("""document.getElementById("feeTo1").innerHTML="";

	"""),format.raw/*583.2*/("""}"""),format.raw/*583.3*/("""
	
	
	
	
	
	"""),format.raw/*589.2*/("""//var role=document.forms["myForm"]["role"].value;
	var company=document.forms["myForm"]["company"].value;

	
	
if(!company)"""),format.raw/*594.13*/("""{"""),format.raw/*594.14*/("""
	"""),format.raw/*595.2*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*595.57*/("""{"""),format.raw/*595.58*/("""
		"""),format.raw/*596.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
	"""),format.raw/*602.2*/("""}"""),format.raw/*602.3*/("""
	"""),format.raw/*603.2*/("""}"""),format.raw/*603.3*/("""else"""),format.raw/*603.7*/("""{"""),format.raw/*603.8*/("""
    	"""),format.raw/*604.6*/("""document.getElementById("company1").innerHTML="";

	"""),format.raw/*606.2*/("""}"""),format.raw/*606.3*/("""


"""),format.raw/*609.1*/("""//var formattedaddress=document.forms["myForm"]["companyAddress"].value;
var companyAddress=document.forms["myForm"]["companyAddress"].value;


if(!companyAddress)"""),format.raw/*613.20*/("""{"""),format.raw/*613.21*/("""
	"""),format.raw/*614.2*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*614.57*/("""{"""),format.raw/*614.58*/("""

		"""),format.raw/*616.3*/("""document.getElementById("formattedaddress1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("geocomplete").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
	"""),format.raw/*622.2*/("""}"""),format.raw/*622.3*/("""
	"""),format.raw/*623.2*/("""}"""),format.raw/*623.3*/("""else"""),format.raw/*623.7*/("""{"""),format.raw/*623.8*/("""
    	"""),format.raw/*624.6*/("""document.getElementById("formattedaddress1").innerHTML="";

	"""),format.raw/*626.2*/("""}"""),format.raw/*626.3*/("""
	

	
	"""),format.raw/*630.2*/("""var broker=document.forms["myForm"]["broker"].value;

if(!broker&& role== 'Realtor')"""),format.raw/*632.31*/("""{"""),format.raw/*632.32*/("""
		
		"""),format.raw/*634.3*/("""document.getElementById("broker1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		
		document.getElementById("broker").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
	"""),format.raw/*641.2*/("""}"""),format.raw/*641.3*/("""else"""),format.raw/*641.7*/("""{"""),format.raw/*641.8*/("""
    	"""),format.raw/*642.6*/("""document.getElementById("broker1").innerHTML="";

	"""),format.raw/*644.2*/("""}"""),format.raw/*644.3*/("""									
"""),format.raw/*645.1*/("""var address1=document.forms["myForm"]["companyAddress1"].value;
if(!address1&& role== 'Realtor')"""),format.raw/*646.33*/("""{"""),format.raw/*646.34*/("""
	
	"""),format.raw/*648.2*/("""document.getElementById("address1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("geocomplete1").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	return false;
"""),format.raw/*654.1*/("""}"""),format.raw/*654.2*/("""else"""),format.raw/*654.6*/("""{"""),format.raw/*654.7*/("""
	"""),format.raw/*655.2*/("""document.getElementById("address1").innerHTML="";

"""),format.raw/*657.1*/("""}"""),format.raw/*657.2*/("""

"""),format.raw/*659.1*/("""var brokerPhone=document.forms["myForm"]["brokerPhone"].value;



if(!brokerPhone&& role== 'Realtor')"""),format.raw/*663.36*/("""{"""),format.raw/*663.37*/("""
	
	"""),format.raw/*665.2*/("""document.getElementById("brokerPhone1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerPhone").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	return false;
"""),format.raw/*671.1*/("""}"""),format.raw/*671.2*/("""else"""),format.raw/*671.6*/("""{"""),format.raw/*671.7*/("""
	"""),format.raw/*672.2*/("""document.getElementById("brokerPhone1").innerHTML="";

"""),format.raw/*674.1*/("""}"""),format.raw/*674.2*/("""

"""),format.raw/*676.1*/("""var brokerMange=document.forms["myForm"]["brokerMange"].value;


if(!brokerMange&& role== 'Realtor')"""),format.raw/*679.36*/("""{"""),format.raw/*679.37*/("""
	
	"""),format.raw/*681.2*/("""document.getElementById("brokerMange1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerMange").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	return false;
"""),format.raw/*687.1*/("""}"""),format.raw/*687.2*/("""else"""),format.raw/*687.6*/("""{"""),format.raw/*687.7*/("""
	"""),format.raw/*688.2*/("""document.getElementById("brokerMange1").innerHTML="";

"""),format.raw/*690.1*/("""}"""),format.raw/*690.2*/("""


"""),format.raw/*693.1*/("""var refer=document.forms["myForm"]["refer"].value;

if(!refer&& role== 'Realtor')"""),format.raw/*695.30*/("""{"""),format.raw/*695.31*/("""
	
	"""),format.raw/*697.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	return false;
"""),format.raw/*703.1*/("""}"""),format.raw/*703.2*/("""else"""),format.raw/*703.6*/("""{"""),format.raw/*703.7*/("""
	"""),format.raw/*704.2*/("""document.getElementById("refer1").innerHTML="";

"""),format.raw/*706.1*/("""}"""),format.raw/*706.2*/("""
	 """),format.raw/*707.3*/("""}"""),format.raw/*707.4*/("""catch(err)"""),format.raw/*707.14*/("""{"""),format.raw/*707.15*/("""
		
	 """),format.raw/*709.3*/("""}"""),format.raw/*709.4*/("""
    
 """),format.raw/*711.2*/("""}"""),format.raw/*711.3*/("""
    
    """),format.raw/*713.5*/("""</script>


	<script src=""""),_display_(/*716.16*/routes/*716.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*716.72*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:21 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/visdomferral11.scala.html
                  HASH: 738aaf70918d14e1b22966eeb25dace872bd0d88
                  MATRIX: 732->1|837->18|864->19|1213->342|1227->348|1283->384|1426->500|1441->506|1501->545|1555->572|1570->578|1640->627|1793->753|1808->759|1873->803|1926->829|1941->835|2008->881|2093->938|2122->939|2151->941|2284->1047|2312->1048|2341->1050|2373->1055|2401->1056|2430->1058|2493->1094|2521->1095|2549->1096|2626->1145|2655->1146|2687->1151|2731->1168|2759->1169|2787->1170|2855->1210|2884->1211|2913->1213|2997->1270|3025->1271|3053->1272|3117->1308|3146->1309|3182->1318|3240->1348|3269->1349|3308->1360|3437->1462|3466->1463|3533->1502|3562->1503|3601->1514|3674->1560|3703->1561|3739->1570|3767->1571|3840->1616|3869->1617|3905->1626|3964->1657|3993->1658|4032->1669|4161->1771|4190->1772|4257->1811|4286->1812|4325->1823|4399->1870|4428->1871|4464->1880|4492->1881|4623->1984|4652->1985|4685->1991|5031->2310|5059->2311|5171->2395|5200->2396|5236->2405|5378->2519|5407->2520|5445->2530|6230->3287|6259->3288|6293->3294|6322->3295|6351->3296|6581->3498|6597->3504|6661->3546|6705->3562|6721->3568|6784->3609|6870->3667|6886->3673|6947->3712|7024->3761|7040->3767|7096->3801|7173->3850|7189->3856|7248->3893|7427->4044|7443->4050|7505->4090|8234->4790|8264->4791|8294->4792|8334->4803|8364->4804|8394->4805|13442->9825|13472->9826|13502->9827|13538->9834|13568->9835|13598->9836|14418->10627|14448->10628|14478->10629|14521->10643|14551->10644|14581->10645|15612->11647|15642->11648|15672->11649|15716->11664|15746->11665|15776->11666|17760->13621|17790->13622|17827->13631|17942->13718|17971->13719|18065->13784|18095->13785|18132->13794|18247->13881|18276->13882|18361->13938|18391->13939|18424->13944|18495->13987|18524->13988|18743->14178|18773->14179|18810->14188|18869->14218|18899->14219|18939->14230|19069->14332|19099->14333|19167->14372|19197->14373|19237->14384|19311->14430|19341->14431|19378->14440|19407->14441|19482->14487|19512->14488|19549->14497|19609->14528|19639->14529|19679->14540|19809->14642|19839->14643|19907->14682|19937->14683|19977->14694|20052->14741|20082->14742|20119->14751|20148->14752|20342->14917|20372->14918|20409->14927|20470->14959|20500->14960|20542->14973|20667->15069|20697->15070|20743->15087|20816->15131|20846->15132|20884->15142|20914->15143|20947->15148|20976->15149|21081->15225|21111->15226|21145->15232|21176->15235|21205->15236|21236->15239|21328->15302|21358->15303|21390->15307|21722->15611|21751->15612|21783->15616|21812->15617|21847->15624|21925->15674|21954->15675|21987->15680|22083->15747|22113->15748|22145->15752|22479->16058|22508->16059|22540->16063|22569->16064|22604->16071|22683->16122|22712->16123|22744->16127|22840->16194|22870->16195|22906->16203|23238->16507|23267->16508|23299->16512|23331->16516|23360->16517|23396->16525|23476->16577|23505->16578|23546->16591|23642->16658|23672->16659|23708->16667|24038->16969|24067->16970|24099->16974|24128->16975|24163->16982|24242->17033|24271->17034|24310->17045|24547->17254|24577->17255|24624->17274|24653->17275|24686->17279|24716->17280|24750->17286|25090->17598|25119->17599|25157->17609|25206->17629|25236->17630|25283->17649|25312->17650|25345->17654|25375->17655|25409->17661|25749->17973|25778->17974|25811->17979|25854->17993|25884->17994|25913->17995|26245->18299|26274->18300|26307->18304|26337->18305|26371->18311|26451->18363|26480->18364|26515->18371|26609->18436|26639->18437|26670->18440|27008->18750|27037->18751|27068->18754|27100->18758|27129->18759|27163->18765|27241->18815|27270->18816|27306->18824|27398->18887|27428->18888|27460->18892|27544->18947|27574->18948|27605->18951|27939->19257|27968->19258|27998->19260|28027->19261|28059->19265|28088->19266|28122->19272|28200->19322|28229->19323|28269->19335|28422->19459|28452->19460|28482->19462|28566->19517|28596->19518|28627->19521|28965->19831|28994->19832|29024->19834|29053->19835|29085->19839|29114->19840|29148->19846|29228->19898|29257->19899|29288->19902|29480->20065|29510->20066|29540->20068|29624->20123|29654->20124|29686->20128|30037->20451|30066->20452|30096->20454|30125->20455|30157->20459|30186->20460|30220->20466|30309->20527|30338->20528|30373->20535|30486->20619|30516->20620|30550->20626|30889->20937|30918->20938|30950->20942|30979->20943|31013->20949|31092->21000|31121->21001|31159->21011|31284->21107|31314->21108|31346->21112|31685->21423|31714->21424|31746->21428|31775->21429|31805->21431|31884->21482|31913->21483|31943->21485|32073->21586|32103->21587|32135->21591|32477->21905|32506->21906|32538->21910|32567->21911|32597->21913|32680->21968|32709->21969|32739->21971|32868->22071|32898->22072|32930->22076|33272->22390|33301->22391|33333->22395|33362->22396|33392->22398|33475->22453|33504->22454|33535->22457|33645->22538|33675->22539|33707->22543|34037->22845|34066->22846|34098->22850|34127->22851|34157->22853|34234->22902|34263->22903|34294->22906|34323->22907|34362->22917|34392->22918|34426->22924|34455->22925|34490->22932|34519->22933|34557->22943|34612->22970|34628->22976|34700->23026
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|39->11|39->11|39->11|41->13|41->13|41->13|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|49->21|55->27|55->27|57->29|57->29|57->29|58->30|60->32|60->32|61->33|61->33|61->33|62->34|63->35|63->35|64->36|64->36|64->36|65->37|68->40|68->40|69->41|71->43|71->43|72->44|72->44|72->44|73->45|76->48|76->48|78->50|78->50|79->51|80->52|80->52|81->53|81->53|85->57|85->57|86->58|86->58|86->58|87->59|90->62|90->62|92->64|92->64|93->65|94->66|94->66|95->67|95->67|98->70|98->70|99->71|104->76|104->76|109->81|109->81|110->82|113->85|113->85|114->86|129->101|129->101|130->102|130->102|130->102|136->108|136->108|136->108|137->109|137->109|137->109|138->110|138->110|138->110|139->111|139->111|139->111|140->112|140->112|140->112|147->119|147->119|147->119|177->149|177->149|177->149|177->149|177->149|177->149|296->268|296->268|296->268|296->268|296->268|296->268|316->288|316->288|316->288|316->288|316->288|316->288|340->312|340->312|340->312|340->312|340->312|340->312|409->381|409->381|410->382|413->385|413->385|417->389|417->389|418->390|421->393|421->393|428->400|428->400|429->401|430->402|430->402|438->410|438->410|439->411|439->411|439->411|440->412|443->415|443->415|445->417|445->417|446->418|447->419|447->419|448->420|448->420|452->424|452->424|453->425|453->425|453->425|454->426|457->429|457->429|459->431|459->431|460->432|461->433|461->433|462->434|462->434|467->439|467->439|468->440|469->441|469->441|470->442|472->444|472->444|473->445|474->446|474->446|475->447|475->447|476->448|476->448|480->452|480->452|482->454|482->454|482->454|483->455|485->457|485->457|486->458|492->464|492->464|492->464|492->464|493->465|495->467|495->467|497->469|500->472|500->472|501->473|507->479|507->479|507->479|507->479|508->480|510->482|510->482|511->483|513->485|513->485|515->487|520->492|520->492|521->493|521->493|521->493|522->494|524->496|524->496|528->500|530->502|530->502|532->504|538->510|538->510|538->510|538->510|539->511|541->513|541->513|544->516|548->520|548->520|550->522|550->522|550->522|550->522|551->523|557->529|557->529|559->531|559->531|559->531|561->533|561->533|561->533|561->533|562->534|568->540|568->540|569->541|569->541|569->541|570->542|576->548|576->548|576->548|576->548|577->549|579->551|579->551|581->553|583->555|583->555|584->556|590->562|590->562|591->563|591->563|591->563|592->564|594->566|594->566|596->568|598->570|598->570|600->572|600->572|600->572|601->573|607->579|607->579|608->580|608->580|608->580|608->580|609->581|611->583|611->583|617->589|622->594|622->594|623->595|623->595|623->595|624->596|630->602|630->602|631->603|631->603|631->603|631->603|632->604|634->606|634->606|637->609|641->613|641->613|642->614|642->614|642->614|644->616|650->622|650->622|651->623|651->623|651->623|651->623|652->624|654->626|654->626|658->630|660->632|660->632|662->634|669->641|669->641|669->641|669->641|670->642|672->644|672->644|673->645|674->646|674->646|676->648|682->654|682->654|682->654|682->654|683->655|685->657|685->657|687->659|691->663|691->663|693->665|699->671|699->671|699->671|699->671|700->672|702->674|702->674|704->676|707->679|707->679|709->681|715->687|715->687|715->687|715->687|716->688|718->690|718->690|721->693|723->695|723->695|725->697|731->703|731->703|731->703|731->703|732->704|734->706|734->706|735->707|735->707|735->707|735->707|737->709|737->709|739->711|739->711|741->713|744->716|744->716|744->716
                  -- GENERATED --
              */
          