
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
object planner extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
	"""),format.raw/*21.2*/("""padding: 9px 6px;
	margin: 2px 2px;
	font-weight: bold;
	border-radius: 0;
	background-color: #0086b3;
"""),format.raw/*26.1*/("""}"""),format.raw/*26.2*/("""

"""),format.raw/*28.1*/(""".btn """),format.raw/*28.6*/("""{"""),format.raw/*28.7*/("""
	"""),format.raw/*29.2*/("""border: 0 none;
	font-weight: bold;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""

"""),format.raw/*33.1*/(""".btn-primary:active,.btn-primary.active """),format.raw/*33.41*/("""{"""),format.raw/*33.42*/("""
	"""),format.raw/*34.2*/("""background: #003f80;
	color: #ffffff;
	box-shadow: none;
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""
"""),format.raw/*38.1*/("""</style>
<script>
      $(function()"""),format.raw/*40.19*/("""{"""),format.raw/*40.20*/("""
        """),format.raw/*41.9*/("""$("#geocomplete").geocomplete("""),format.raw/*41.39*/("""{"""),format.raw/*41.40*/("""
          """),format.raw/*42.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/(""");

        $("#find").click(function()"""),format.raw/*47.36*/("""{"""),format.raw/*47.37*/("""
          """),format.raw/*48.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/(""");
      """),format.raw/*50.7*/("""}"""),format.raw/*50.8*/(""");
    </script>

<script>
      $(function()"""),format.raw/*54.19*/("""{"""),format.raw/*54.20*/("""
        """),format.raw/*55.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*55.40*/("""{"""),format.raw/*55.41*/("""
          """),format.raw/*56.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/(""");

        $("#find").click(function()"""),format.raw/*61.36*/("""{"""),format.raw/*61.37*/("""
          """),format.raw/*62.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*63.9*/("""}"""),format.raw/*63.10*/(""");
      """),format.raw/*64.7*/("""}"""),format.raw/*64.8*/(""");
    </script>
<script type="text/javascript">
  /*   $.get("https://ipinfo.io", function (response) """),format.raw/*67.55*/("""{"""),format.raw/*67.56*/("""
    	"""),format.raw/*68.6*/("""document.getElementById("ip").value=JSON.stringify(response, null, 4);
    	alert(JSON.stringify(response, null, 4));
    		/* $("#ip").html("IP: " + response.ip);
        $("#address").html("Location: " + response.city + ", " + response.region); */
       // $("#details").html(JSON.stringify(response, null, 4));
    """),format.raw/*73.5*/("""}"""),format.raw/*73.6*/(""", "jsonp"); */
    </script>

<script type="text/javascript">
    
    jQuery.ajax( """),format.raw/*78.18*/("""{"""),format.raw/*78.19*/(""" 
    	  """),format.raw/*79.8*/("""url: 'http://ip-api.com/json', 
    	  type: 'POST', 
    	  dataType: 'jsonp',
    	  success: function(location) """),format.raw/*82.36*/("""{"""),format.raw/*82.37*/("""
    	    """),format.raw/*83.10*/("""// example where I update content on the page.
    	    
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
    	  """),format.raw/*98.8*/("""}"""),format.raw/*98.9*/("""
    	"""),format.raw/*99.6*/("""}"""),format.raw/*99.7*/(""" """),format.raw/*99.8*/(""");
    </script>

<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->
<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*105.31*/routes/*105.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*105.79*/("""">
<script src="""),_display_(/*106.14*/routes/*106.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*106.61*/(""""></script>
<link type="text/css" rel="stylesheet" href=""""),_display_(/*107.47*/routes/*107.53*/.Assets.at("_resources/background.css")),format.raw/*107.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*108.47*/routes/*108.53*/.Assets.at("_resources/forms.css")),format.raw/*108.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*109.47*/routes/*109.53*/.Assets.at("_resources/template.css")),format.raw/*109.90*/("""">
<style type="text/css">

/*  #loading """),format.raw/*112.14*/("""{"""),format.raw/*112.15*/("""
	"""),format.raw/*113.2*/("""position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background: url('"""),_display_(/*119.20*/routes/*119.26*/.Assets.at("images/page-loader.gif")),format.raw/*119.62*/("""') 50% 50% no-repeat rgb(249,249,249);
"""),format.raw/*120.1*/("""}"""),format.raw/*120.2*/(""" """),format.raw/*120.3*/("""*/
#overlay """),format.raw/*121.10*/("""{"""),format.raw/*121.11*/("""
	"""),format.raw/*122.2*/("""display: none;
	position: fixed;
	background: threedhighlight;
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
"""),format.raw/*131.1*/("""}"""),format.raw/*131.2*/("""

"""),format.raw/*133.1*/("""#loading """),format.raw/*133.10*/("""{"""),format.raw/*133.11*/("""
	"""),format.raw/*134.2*/("""padding: 10px 10px 10px 60px;
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background-color: threedhighlight;
	opacity: 0.6;
	filter: alpha(opacity = 60);
	*/
"""),format.raw/*145.1*/("""}"""),format.raw/*145.2*/("""
"""),format.raw/*146.1*/("""</style>








</head>
<body>


	<div id="loading" style="display: none" align="center">


		<img src=""""),_display_(/*162.14*/routes/*162.20*/.Assets.at(" /images/preloader-image.gif")),format.raw/*162.62*/("""" alt="" />

	</div>


	<div align="center">
		<img alt="Visdom Logo" height="90" width="260"
			src=""""),_display_(/*169.10*/routes/*169.16*/.Assets.at(" _resources/visdom-logo.png")),format.raw/*169.57*/("""" />


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

						<div ng-controller="DemoController"
							ng-init="newItemType='Financial Planner'">
							<input type="hidden" name="ip" value="" id="ip">


							<div id="role1"></div>



							<input type="hidden" id="role" name="role" ng-model="newItemType"
								value="Financial Planner" ng-required>





							<div class="form-group" style="width: 280px">
								<label for="usr"> <Strong>Your First Name </Strong><span
									style="color: red; font-size: 4">*</span></label> <input type="text"
									id="fname" name="fname" class="form-control" required>
								<div id="fname1"></div>

							</div>
							<br>
							<div class="form-group" style="width: 280px">
								<label for="pwd"><Strong>Your Last Name</Strong> <span
									style="color: red; font-size: 4">*</span> </label> <input type="text"
									id="lname" name="lname" class="form-control" required>

								<div id="lname1"></div>

							</div>
							<br>






							<div class="form-group" style="width: 280px">
								<label for="pwd"><Strong> E-mail Address</Strong><span
									style="color: red; font-size: 4">*</span> </label> <input type="email"
									id="email" name="email" class="form-control"
									placeholder="Ex: myemail@example.com" data-toggle="tooltip"
									data-placement="right"
									title="All communication occurs by email with your referral including the initial private mortgage application. Please double check email address for accuracy."
									required>
								<div id="email1"></div>


							</div>

							<div class="form-group" style="width: 280px">
								<input type="email" id="email2" name="email2"
									class="form-control" placeholder="Confirm Email" required>
								<div id="error"></div>
								<div id="email2"></div>

							</div>
							<br>

							<div class="form-group" style="width: 280px"
								title="This is the text of the tooltip">
								<label><Strong>Phone Number </Strong> <span
									style="color: red; font-size: 4">*</span> </label> <input type="text"
									class="form-control" name="phone" id="phonedatata"
									data-toggle="tooltip" data-placement="right"
									title="Please provide a mobile number so we can better assist your referral by phone if required."
									required />

								<div id="phone1"></div>

							</div>
							<br>


							<div
								ng-show="newItemType == 'Financial Planner' || newItemType =='Professional' ">


								<div class="form-group" style="width: 100%">
									<label for="pwd"><Strong> In some regulated
											industries, referral compensation must be paid directly to
											their company (eg. Real Estate, Mortgage Associate). Who
											should the referral compensation be paid too? </Strong><span
										style="color: red; font-size: 3">*</span> </label>
								</div>





								<div class="btn-group blocks" data-toggle="buttons">
									<label style="width: 180px" class="btn btn-primary"
										btn-radio="'Company'" ng-change="change()" ng-model="company">
										My Company </label> <label style="width: 180px"
										class="btn btn-primary" btn-radio="'Direct To MySelf'"
										ng-change="change()" ng-model="company"> MySelf </label>
								</div>
								<div id="feeTo1"></div>
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*294.61*/("""{"""),format.raw/*294.62*/("""{"""),format.raw/*294.63*/("""company"""),format.raw/*294.70*/("""}"""),format.raw/*294.71*/("""}"""),format.raw/*294.72*/("""">
								<br> <br>


								<div class="map_canvas"></div>

								<div class="form-group" ng-show="company == 'Company' "
									style="width: 280px">
									<label for="pwd"><Strong> Company Name </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
										id="company" name="company" class="form-control">
									<div id="company1"></div>

								</div>

								<div class="form-group" ng-show="company == 'Company' "
									style="width: 280px">
									<label for="pwd"><Strong> Company Address </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input
										id="geocomplete" type="text" name="formatted_address"
										class="form-control" ng-model="companyAddress"
										placeholder="Enter Location" ng-required> <input
										type="hidden" name="companyAddress" value=""""),format.raw/*316.54*/("""{"""),format.raw/*316.55*/("""{"""),format.raw/*316.56*/("""companyAddress"""),format.raw/*316.70*/("""}"""),format.raw/*316.71*/("""}"""),format.raw/*316.72*/("""">
									<div id="formattedaddress1"></div>


								</div>
							</div>

							<div class="form-group" style="width: 100%">
								<label for="pwd"><Strong>From whom or how did
										you find out about Visdom Mortgage Solutions? </Strong> <span
									style="color: red; font-size: 4">*</span> </label>
							</div>
							<div class="form-group" style="width: 280px">
								<input type="text" id="refer" name="refer" class="form-control"
									required>
								<div id="refer1"></div>

							</div>
							<br>



							<div align="center">

								<input type="submit" style="width: 280px"
									class="btn btn-primary" value="Next">

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
    $(function() """),format.raw/*364.18*/("""{"""),format.raw/*364.19*/("""
        """),format.raw/*365.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*368.5*/("""}"""),format.raw/*368.6*/(""");
	
</script>
	<script type="text/javascript">
    $(function() """),format.raw/*372.18*/("""{"""),format.raw/*372.19*/("""
        """),format.raw/*373.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#brokerPhone").mask("999-999-9999");
    """),format.raw/*376.5*/("""}"""),format.raw/*376.6*/(""");
	
</script>



	<script>
$(document).ready(function()"""),format.raw/*383.29*/("""{"""),format.raw/*383.30*/("""
    """),format.raw/*384.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*385.1*/("""}"""),format.raw/*385.2*/(""");
</script>

	<script
		src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>

	<script src="jquery.geocomplete.js"></script>
	<script>
      $(function()"""),format.raw/*393.19*/("""{"""),format.raw/*393.20*/("""
        """),format.raw/*394.9*/("""$("#geocomplete").geocomplete("""),format.raw/*394.39*/("""{"""),format.raw/*394.40*/("""
          """),format.raw/*395.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*398.9*/("""}"""),format.raw/*398.10*/(""");

        $("#find").click(function()"""),format.raw/*400.36*/("""{"""),format.raw/*400.37*/("""
          """),format.raw/*401.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*402.9*/("""}"""),format.raw/*402.10*/(""");
      """),format.raw/*403.7*/("""}"""),format.raw/*403.8*/(""");
    </script>

	<script>
      $(function()"""),format.raw/*407.19*/("""{"""),format.raw/*407.20*/("""
        """),format.raw/*408.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*408.40*/("""{"""),format.raw/*408.41*/("""
          """),format.raw/*409.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*412.9*/("""}"""),format.raw/*412.10*/(""");

        $("#find").click(function()"""),format.raw/*414.36*/("""{"""),format.raw/*414.37*/("""
          """),format.raw/*415.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*416.9*/("""}"""),format.raw/*416.10*/(""");
      """),format.raw/*417.7*/("""}"""),format.raw/*417.8*/(""");
    </script>
	<script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*422.56*/("""{"""),format.raw/*422.57*/("""
        """),format.raw/*423.9*/("""init();
        function init() """),format.raw/*424.25*/("""{"""),format.raw/*424.26*/("""
            """),format.raw/*425.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*427.41*/("""{"""),format.raw/*427.42*/("""
                """),format.raw/*428.17*/("""console.log($scope.newItemType)
            """),format.raw/*429.13*/("""}"""),format.raw/*429.14*/(""";
        """),format.raw/*430.9*/("""}"""),format.raw/*430.10*/("""
    """),format.raw/*431.5*/("""}"""),format.raw/*431.6*/(""");
    </script>

	<script type="text/javascript">
 function validateForm() """),format.raw/*435.26*/("""{"""),format.raw/*435.27*/("""
	 
	 """),format.raw/*437.3*/("""try"""),format.raw/*437.6*/("""{"""),format.raw/*437.7*/("""
		"""),format.raw/*438.3*/("""var role=document.forms["myForm"]["role"].value;
		var value=true;
		if(!role)"""),format.raw/*440.12*/("""{"""),format.raw/*440.13*/("""
			"""),format.raw/*441.4*/("""document.getElementById("role1").innerHTML="<p style=\"color:red\">Please Select Role</p>";
			document.getElementById("role").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*447.3*/("""}"""),format.raw/*447.4*/("""else"""),format.raw/*447.8*/("""{"""),format.raw/*447.9*/("""
	    	"""),format.raw/*448.7*/("""document.getElementById("role1").innerHTML="";

		"""),format.raw/*450.3*/("""}"""),format.raw/*450.4*/(""" 

	 """),format.raw/*452.3*/("""var fname=document.forms["myForm"]["fname"].value;
	 

		if(!fname)"""),format.raw/*455.13*/("""{"""),format.raw/*455.14*/("""
			"""),format.raw/*456.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*462.3*/("""}"""),format.raw/*462.4*/("""else if(fname.trim().length<2)"""),format.raw/*462.34*/("""{"""),format.raw/*462.35*/("""
			
			
			"""),format.raw/*465.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName  Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*473.3*/("""}"""),format.raw/*473.4*/(""" """),format.raw/*473.5*/("""else"""),format.raw/*473.9*/("""{"""),format.raw/*473.10*/("""
			"""),format.raw/*474.4*/("""if(!fname.match(/^[a-zA-Z ]*$/))"""),format.raw/*474.36*/("""{"""),format.raw/*474.37*/("""
				"""),format.raw/*475.5*/("""document.getElementById("fname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
				document.getElementById("fname").focus();
				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


				value = false;

			"""),format.raw/*482.4*/("""}"""),format.raw/*482.5*/("""else"""),format.raw/*482.9*/("""{"""),format.raw/*482.10*/("""
				"""),format.raw/*483.5*/("""document.getElementById("fname1").innerHTML = "";

			"""),format.raw/*485.4*/("""}"""),format.raw/*485.5*/("""

		"""),format.raw/*487.3*/("""}"""),format.raw/*487.4*/(""" 
		
		
		"""),format.raw/*490.3*/("""var lname=document.forms["myForm"]["lname"].value;
		 
		if(!lname)"""),format.raw/*492.13*/("""{"""),format.raw/*492.14*/("""
			
			"""),format.raw/*494.4*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
			document.getElementById("lname").focus();
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*499.3*/("""}"""),format.raw/*499.4*/("""else if(lname.trim().length<2)"""),format.raw/*499.34*/("""{"""),format.raw/*499.35*/("""
			
			
			"""),format.raw/*502.4*/("""document.getElementById("lname").focus();

			document.getElementById("lname1").innerHTML="<p style=\"color:red\">Last  Name Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*510.3*/("""}"""),format.raw/*510.4*/("""
			"""),format.raw/*511.4*/("""else"""),format.raw/*511.8*/("""{"""),format.raw/*511.9*/("""
				
				"""),format.raw/*513.5*/("""if(!lname.match(/^[a-zA-Z ]*$/))"""),format.raw/*513.37*/("""{"""),format.raw/*513.38*/("""
					"""),format.raw/*514.6*/("""document.getElementById("lname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
					document.getElementById("lname").focus();
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


					value = false;

				"""),format.raw/*521.5*/("""}"""),format.raw/*521.6*/("""else"""),format.raw/*521.10*/("""{"""),format.raw/*521.11*/("""
					"""),format.raw/*522.6*/("""document.getElementById("lname1").innerHTML = "";

				"""),format.raw/*524.5*/("""}"""),format.raw/*524.6*/("""

			"""),format.raw/*526.4*/("""}"""),format.raw/*526.5*/(""" 
		
		
		
	 
		"""),format.raw/*531.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*533.13*/("""{"""),format.raw/*533.14*/("""
			
			"""),format.raw/*535.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
		"""),format.raw/*541.3*/("""}"""),format.raw/*541.4*/("""else"""),format.raw/*541.8*/("""{"""),format.raw/*541.9*/("""
	    	"""),format.raw/*542.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*544.3*/("""}"""),format.raw/*544.4*/("""
	 
	 
    """),format.raw/*547.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*551.24*/("""{"""),format.raw/*551.25*/("""         
		  
    """),format.raw/*553.5*/("""}"""),format.raw/*553.6*/("""else"""),format.raw/*553.10*/("""{"""),format.raw/*553.11*/("""   
		"""),format.raw/*554.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=false;
    """),format.raw/*560.5*/("""}"""),format.raw/*560.6*/("""
    
    """),format.raw/*562.5*/("""if(pattern.test(x2))"""),format.raw/*562.25*/("""{"""),format.raw/*562.26*/("""         
		  
    """),format.raw/*564.5*/("""}"""),format.raw/*564.6*/("""else"""),format.raw/*564.10*/("""{"""),format.raw/*564.11*/("""   
		"""),format.raw/*565.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email2").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*571.5*/("""}"""),format.raw/*571.6*/("""
    """),format.raw/*572.5*/("""if (x  != x2) """),format.raw/*572.19*/("""{"""),format.raw/*572.20*/("""
	"""),format.raw/*573.2*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
	document.getElementById("email").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
    """),format.raw/*579.5*/("""}"""),format.raw/*579.6*/("""else"""),format.raw/*579.10*/("""{"""),format.raw/*579.11*/("""
    	"""),format.raw/*580.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*582.5*/("""}"""),format.raw/*582.6*/("""
    
	"""),format.raw/*584.2*/("""var phone=document.forms["myForm"]["phone"].value;
	 
	if(!phone)"""),format.raw/*586.12*/("""{"""),format.raw/*586.13*/("""
		"""),format.raw/*587.3*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
		document.getElementById("phonedatata").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=false;
	"""),format.raw/*593.2*/("""}"""),format.raw/*593.3*/("""	
	"""),format.raw/*594.2*/("""else"""),format.raw/*594.6*/("""{"""),format.raw/*594.7*/("""
    	"""),format.raw/*595.6*/("""document.getElementById("phone1").innerHTML="";

	"""),format.raw/*597.2*/("""}"""),format.raw/*597.3*/(""" 
    
	"""),format.raw/*599.2*/("""var feeTo=document.forms["myForm"]["feeTo"].value;
	if(!feeTo)"""),format.raw/*600.12*/("""{"""),format.raw/*600.13*/("""

		"""),format.raw/*602.3*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*602.58*/("""{"""),format.raw/*602.59*/("""
		"""),format.raw/*603.3*/("""document.getElementById("feeTo1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("feeTo").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*609.2*/("""}"""),format.raw/*609.3*/("""
	"""),format.raw/*610.2*/("""}"""),format.raw/*610.3*/("""else"""),format.raw/*610.7*/("""{"""),format.raw/*610.8*/("""
    	"""),format.raw/*611.6*/("""document.getElementById("feeTo1").innerHTML="";

	"""),format.raw/*613.2*/("""}"""),format.raw/*613.3*/("""
	
	
	
	
	
	"""),format.raw/*619.2*/("""//var role=document.forms["myForm"]["role"].value;
	var company=document.forms["myForm"]["company"].value;

	
if(!company)"""),format.raw/*623.13*/("""{"""),format.raw/*623.14*/("""
	

	"""),format.raw/*626.2*/("""if(role == 'Financial Planner'  && feeTo == 'Company')"""),format.raw/*626.56*/("""{"""),format.raw/*626.57*/("""
		"""),format.raw/*627.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*633.2*/("""}"""),format.raw/*633.3*/("""
	"""),format.raw/*634.2*/("""}"""),format.raw/*634.3*/("""else if(role == 'Financial Planner'  && feeTo == 'Company' && company.trim().length <2 )"""),format.raw/*634.91*/("""{"""),format.raw/*634.92*/("""
		"""),format.raw/*635.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">Company Name Should be more than one letter</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*641.2*/("""}"""),format.raw/*641.3*/("""else"""),format.raw/*641.7*/("""{"""),format.raw/*641.8*/("""
    	"""),format.raw/*642.6*/("""document.getElementById("company1").innerHTML="";

	"""),format.raw/*644.2*/("""}"""),format.raw/*644.3*/("""


"""),format.raw/*647.1*/("""//var formattedaddress=document.forms["myForm"]["companyAddress"].value;
var companyAddress=document.forms["myForm"]["companyAddress"].value;


if(!companyAddress)"""),format.raw/*651.20*/("""{"""),format.raw/*651.21*/("""
	"""),format.raw/*652.2*/("""if(role == 'Financial Planner' && feeTo == 'Company')"""),format.raw/*652.55*/("""{"""),format.raw/*652.56*/("""

		"""),format.raw/*654.3*/("""document.getElementById("formattedaddress1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("geocomplete").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=false;
	"""),format.raw/*660.2*/("""}"""),format.raw/*660.3*/("""
	"""),format.raw/*661.2*/("""}"""),format.raw/*661.3*/("""else"""),format.raw/*661.7*/("""{"""),format.raw/*661.8*/("""
    	"""),format.raw/*662.6*/("""document.getElementById("formattedaddress1").innerHTML="";

	"""),format.raw/*664.2*/("""}"""),format.raw/*664.3*/("""
	




"""),format.raw/*670.1*/("""var refer=document.forms["myForm"]["refer"].value;

if(!refer&& role== 'Realtor')"""),format.raw/*672.30*/("""{"""),format.raw/*672.31*/("""
	
	"""),format.raw/*674.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*680.1*/("""}"""),format.raw/*680.2*/("""else if(refer.trim().length<2)"""),format.raw/*680.32*/("""{"""),format.raw/*680.33*/("""
	
	"""),format.raw/*682.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">Referrar Name Should be more than one letter </p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*688.1*/("""}"""),format.raw/*688.2*/("""


"""),format.raw/*691.1*/("""else"""),format.raw/*691.5*/("""{"""),format.raw/*691.6*/("""
	"""),format.raw/*692.2*/("""if(!refer.match(/^[a-zA-Z ]*$/))"""),format.raw/*692.34*/("""{"""),format.raw/*692.35*/("""
		"""),format.raw/*693.3*/("""document.getElementById("refer1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("refer").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*700.2*/("""}"""),format.raw/*700.3*/("""else"""),format.raw/*700.7*/("""{"""),format.raw/*700.8*/("""
		"""),format.raw/*701.3*/("""document.getElementById("refer1").innerHTML = "";

	"""),format.raw/*703.2*/("""}"""),format.raw/*703.3*/("""

"""),format.raw/*705.1*/("""}"""),format.raw/*705.2*/("""

"""),format.raw/*707.1*/("""if(value)"""),format.raw/*707.10*/("""{"""),format.raw/*707.11*/("""
	 """),format.raw/*708.3*/("""$('#loading').show();
"""),format.raw/*709.1*/("""}"""),format.raw/*709.2*/("""
"""),format.raw/*710.1*/("""return value;

	 """),format.raw/*712.3*/("""}"""),format.raw/*712.4*/("""catch(err)"""),format.raw/*712.14*/("""{"""),format.raw/*712.15*/("""
		
	 """),format.raw/*714.3*/("""}"""),format.raw/*714.4*/("""
    
 """),format.raw/*716.2*/("""}"""),format.raw/*716.3*/("""
    
    """),format.raw/*718.5*/("""</script>


	<script src=""""),_display_(/*721.16*/routes/*721.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*721.72*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:18 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/planner.scala.html
                  HASH: 5c5f7794fdc217633abbe76cebb73df6b40004e9
                  MATRIX: 725->1|830->18|857->19|1206->342|1220->348|1276->384|1419->500|1434->506|1494->545|1548->572|1563->578|1633->627|1786->753|1801->759|1866->803|1919->829|1934->835|2001->881|2086->938|2115->939|2144->941|2274->1044|2302->1045|2331->1047|2363->1052|2391->1053|2420->1055|2483->1091|2511->1092|2540->1094|2608->1134|2637->1135|2666->1137|2750->1194|2778->1195|2806->1196|2870->1232|2899->1233|2935->1242|2993->1272|3022->1273|3061->1284|3190->1386|3219->1387|3286->1426|3315->1427|3354->1438|3427->1484|3456->1485|3492->1494|3520->1495|3593->1540|3622->1541|3658->1550|3717->1581|3746->1582|3785->1593|3914->1695|3943->1696|4010->1735|4039->1736|4078->1747|4152->1794|4181->1795|4217->1804|4245->1805|4376->1908|4405->1909|4438->1915|4784->2234|4812->2235|4924->2319|4953->2320|4989->2329|5132->2444|5161->2445|5199->2455|5983->3212|6011->3213|6044->3219|6072->3220|6100->3221|6330->3423|6346->3429|6410->3471|6454->3487|6470->3493|6533->3534|6619->3592|6635->3598|6696->3637|6773->3686|6789->3692|6845->3726|6922->3775|6938->3781|6997->3818|7067->3859|7097->3860|7127->3862|7259->3966|7275->3972|7333->4008|7400->4047|7429->4048|7458->4049|7499->4061|7529->4062|7559->4064|7736->4213|7765->4214|7795->4216|7833->4225|7863->4226|7893->4228|8122->4429|8151->4430|8180->4431|8314->4537|8330->4543|8394->4585|8525->4688|8541->4694|8604->4735|12494->8597|12524->8598|12554->8599|12590->8606|12620->8607|12650->8608|13554->9483|13584->9484|13614->9485|13657->9499|13687->9500|13717->9501|14726->10481|14756->10482|14793->10491|14908->10578|14937->10579|15031->10644|15061->10645|15098->10654|15213->10741|15242->10742|15327->10798|15357->10799|15390->10804|15461->10847|15490->10848|15709->11038|15739->11039|15776->11048|15835->11078|15865->11079|15905->11090|16035->11192|16065->11193|16133->11232|16163->11233|16203->11244|16277->11290|16307->11291|16344->11300|16373->11301|16448->11347|16478->11348|16515->11357|16575->11388|16605->11389|16645->11400|16775->11502|16805->11503|16873->11542|16903->11543|16943->11554|17018->11601|17048->11602|17085->11611|17114->11612|17308->11777|17338->11778|17375->11787|17436->11819|17466->11820|17508->11833|17633->11929|17663->11930|17709->11947|17782->11991|17812->11992|17850->12002|17880->12003|17913->12008|17942->12009|18047->12085|18077->12086|18111->12092|18142->12095|18171->12096|18202->12099|18309->12177|18339->12178|18371->12182|18703->12486|18732->12487|18764->12491|18793->12492|18828->12499|18906->12549|18935->12550|18968->12555|19064->12622|19094->12623|19126->12627|19460->12933|19489->12934|19548->12964|19578->12965|19618->12977|19979->13310|20008->13311|20037->13312|20069->13316|20099->13317|20131->13321|20192->13353|20222->13354|20255->13359|20608->13684|20637->13685|20669->13689|20699->13690|20732->13695|20814->13749|20843->13750|20875->13754|20904->13755|20942->13765|21038->13832|21068->13833|21104->13841|21436->14145|21465->14146|21524->14176|21554->14177|21594->14189|21955->14522|21984->14523|22016->14527|22048->14531|22077->14532|22115->14542|22176->14574|22206->14575|22240->14581|22597->14910|22626->14911|22659->14915|22689->14916|22723->14922|22806->14977|22835->14978|22868->14983|22897->14984|22941->15000|23037->15067|23067->15068|23103->15076|23432->15377|23461->15378|23493->15382|23522->15383|23557->15390|23636->15441|23665->15442|23704->15453|23941->15662|23971->15663|24018->15682|24047->15683|24080->15687|24110->15688|24144->15694|24483->16005|24512->16006|24550->16016|24599->16036|24629->16037|24676->16056|24705->16057|24738->16061|24768->16062|24802->16068|25142->16380|25171->16381|25204->16386|25247->16400|25277->16401|25307->16403|25636->16704|25665->16705|25698->16709|25728->16710|25762->16716|25842->16768|25871->16769|25906->16776|26000->16841|26030->16842|26061->16845|26398->17154|26427->17155|26458->17158|26490->17162|26519->17163|26553->17169|26631->17219|26660->17220|26696->17228|26787->17290|26817->17291|26849->17295|26933->17350|26963->17351|26994->17354|27328->17660|27357->17661|27387->17663|27416->17664|27448->17668|27477->17669|27511->17675|27589->17725|27618->17726|27658->17738|27809->17860|27839->17861|27872->17866|27955->17920|27985->17921|28016->17924|28354->18234|28383->18235|28413->18237|28442->18238|28559->18326|28589->18327|28620->18330|28979->18661|29008->18662|29040->18666|29069->18667|29103->18673|29183->18725|29212->18726|29243->18729|29435->18892|29465->18893|29495->18895|29577->18948|29607->18949|29639->18953|29989->19275|30018->19276|30048->19278|30077->19279|30109->19283|30138->19284|30172->19290|30261->19351|30290->19352|30325->19359|30435->19440|30465->19441|30497->19445|30827->19747|30856->19748|30915->19778|30945->19779|30977->19783|31329->20107|31358->20108|31389->20111|31421->20115|31450->20116|31480->20118|31541->20150|31571->20151|31602->20154|31947->20471|31976->20472|32008->20476|32037->20477|32068->20480|32148->20532|32177->20533|32207->20535|32236->20536|32266->20538|32304->20547|32334->20548|32365->20551|32415->20573|32444->20574|32473->20575|32518->20592|32547->20593|32586->20603|32616->20604|32650->20610|32679->20611|32714->20618|32743->20619|32781->20629|32836->20656|32852->20662|32924->20712
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|39->11|39->11|39->11|41->13|41->13|41->13|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|49->21|54->26|54->26|56->28|56->28|56->28|57->29|59->31|59->31|61->33|61->33|61->33|62->34|65->37|65->37|66->38|68->40|68->40|69->41|69->41|69->41|70->42|73->45|73->45|75->47|75->47|76->48|77->49|77->49|78->50|78->50|82->54|82->54|83->55|83->55|83->55|84->56|87->59|87->59|89->61|89->61|90->62|91->63|91->63|92->64|92->64|95->67|95->67|96->68|101->73|101->73|106->78|106->78|107->79|110->82|110->82|111->83|126->98|126->98|127->99|127->99|127->99|133->105|133->105|133->105|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|137->109|137->109|137->109|140->112|140->112|141->113|147->119|147->119|147->119|148->120|148->120|148->120|149->121|149->121|150->122|159->131|159->131|161->133|161->133|161->133|162->134|173->145|173->145|174->146|190->162|190->162|190->162|197->169|197->169|197->169|322->294|322->294|322->294|322->294|322->294|322->294|344->316|344->316|344->316|344->316|344->316|344->316|392->364|392->364|393->365|396->368|396->368|400->372|400->372|401->373|404->376|404->376|411->383|411->383|412->384|413->385|413->385|421->393|421->393|422->394|422->394|422->394|423->395|426->398|426->398|428->400|428->400|429->401|430->402|430->402|431->403|431->403|435->407|435->407|436->408|436->408|436->408|437->409|440->412|440->412|442->414|442->414|443->415|444->416|444->416|445->417|445->417|450->422|450->422|451->423|452->424|452->424|453->425|455->427|455->427|456->428|457->429|457->429|458->430|458->430|459->431|459->431|463->435|463->435|465->437|465->437|465->437|466->438|468->440|468->440|469->441|475->447|475->447|475->447|475->447|476->448|478->450|478->450|480->452|483->455|483->455|484->456|490->462|490->462|490->462|490->462|493->465|501->473|501->473|501->473|501->473|501->473|502->474|502->474|502->474|503->475|510->482|510->482|510->482|510->482|511->483|513->485|513->485|515->487|515->487|518->490|520->492|520->492|522->494|527->499|527->499|527->499|527->499|530->502|538->510|538->510|539->511|539->511|539->511|541->513|541->513|541->513|542->514|549->521|549->521|549->521|549->521|550->522|552->524|552->524|554->526|554->526|559->531|561->533|561->533|563->535|569->541|569->541|569->541|569->541|570->542|572->544|572->544|575->547|579->551|579->551|581->553|581->553|581->553|581->553|582->554|588->560|588->560|590->562|590->562|590->562|592->564|592->564|592->564|592->564|593->565|599->571|599->571|600->572|600->572|600->572|601->573|607->579|607->579|607->579|607->579|608->580|610->582|610->582|612->584|614->586|614->586|615->587|621->593|621->593|622->594|622->594|622->594|623->595|625->597|625->597|627->599|628->600|628->600|630->602|630->602|630->602|631->603|637->609|637->609|638->610|638->610|638->610|638->610|639->611|641->613|641->613|647->619|651->623|651->623|654->626|654->626|654->626|655->627|661->633|661->633|662->634|662->634|662->634|662->634|663->635|669->641|669->641|669->641|669->641|670->642|672->644|672->644|675->647|679->651|679->651|680->652|680->652|680->652|682->654|688->660|688->660|689->661|689->661|689->661|689->661|690->662|692->664|692->664|698->670|700->672|700->672|702->674|708->680|708->680|708->680|708->680|710->682|716->688|716->688|719->691|719->691|719->691|720->692|720->692|720->692|721->693|728->700|728->700|728->700|728->700|729->701|731->703|731->703|733->705|733->705|735->707|735->707|735->707|736->708|737->709|737->709|738->710|740->712|740->712|740->712|740->712|742->714|742->714|744->716|744->716|746->718|749->721|749->721|749->721
                  -- GENERATED --
              */
          