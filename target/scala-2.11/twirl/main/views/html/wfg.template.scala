
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
object wfg extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
  <script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
  <script src=""""),_display_(/*10.17*/routes/*10.23*/.Assets.at("_resources/angular.min.js")),format.raw/*10.62*/(""""></script>
  
<script
	src=""""),_display_(/*13.8*/routes/*13.14*/.Assets.at("_resources/ui-bootstrap-tpls.min.js")),format.raw/*13.63*/(""""></script>
<!--  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

 -->   <script src=""""),_display_(/*16.22*/routes/*16.28*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*16.72*/(""""></script>
    <script src=""""),_display_(/*17.19*/routes/*17.25*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*17.71*/(""""></script>
    <style type="text/css">
    
    .blocks .btn-primary 
"""),format.raw/*21.1*/("""{"""),format.raw/*21.2*/("""
    """),format.raw/*22.5*/("""padding: 9px 6px;
    margin:2px 2px;
     font-weight: bold;
     border-radius: 0;
     		background-color: #0086b3;
     
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""
    """),format.raw/*29.5*/(""".btn """),format.raw/*29.10*/("""{"""),format.raw/*29.11*/("""
    """),format.raw/*30.5*/("""border: 0 none;
    font-weight: bold;
    
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""
"""),format.raw/*34.1*/(""".btn-primary:active, .btn-primary.active """),format.raw/*34.42*/("""{"""),format.raw/*34.43*/("""
     """),format.raw/*35.6*/("""background: #003f80;
    color: #ffffff;
    box-shadow: none;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""
    """),format.raw/*39.5*/("""</style>
    <script>
      $(function()"""),format.raw/*41.19*/("""{"""),format.raw/*41.20*/("""
        """),format.raw/*42.9*/("""$("#geocomplete").geocomplete("""),format.raw/*42.39*/("""{"""),format.raw/*42.40*/("""
          """),format.raw/*43.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/(""");

        $("#find").click(function()"""),format.raw/*48.36*/("""{"""),format.raw/*48.37*/("""
          """),format.raw/*49.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/(""");
      """),format.raw/*51.7*/("""}"""),format.raw/*51.8*/(""");
    </script>
    
      <script>
      $(function()"""),format.raw/*55.19*/("""{"""),format.raw/*55.20*/("""
        """),format.raw/*56.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*56.40*/("""{"""),format.raw/*56.41*/("""
          """),format.raw/*57.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/(""");

        $("#find").click(function()"""),format.raw/*62.36*/("""{"""),format.raw/*62.37*/("""
          """),format.raw/*63.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*64.9*/("""}"""),format.raw/*64.10*/(""");
      """),format.raw/*65.7*/("""}"""),format.raw/*65.8*/(""");
    </script> 
    <script type="text/javascript">
  /*   $.get("https://ipinfo.io", function (response) """),format.raw/*68.55*/("""{"""),format.raw/*68.56*/("""
    	"""),format.raw/*69.6*/("""document.getElementById("ip").value=JSON.stringify(response, null, 4);
    	alert(JSON.stringify(response, null, 4));
    		/* $("#ip").html("IP: " + response.ip);
        $("#address").html("Location: " + response.city + ", " + response.region); */
       // $("#details").html(JSON.stringify(response, null, 4));
    """),format.raw/*74.5*/("""}"""),format.raw/*74.6*/(""", "jsonp"); */
    </script>
    
    <script type="text/javascript">
    
    jQuery.ajax( """),format.raw/*79.18*/("""{"""),format.raw/*79.19*/(""" 
    	  """),format.raw/*80.8*/("""url: 'http://ip-api.com/json', 
    	  type: 'POST', 
    	  dataType: 'jsonp',
    	  success: function(location) """),format.raw/*83.36*/("""{"""),format.raw/*83.37*/("""
    	    """),format.raw/*84.10*/("""// example where I update content on the page.
    	    
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
    	  """),format.raw/*99.8*/("""}"""),format.raw/*99.9*/("""
    	"""),format.raw/*100.6*/("""}"""),format.raw/*100.7*/(""" """),format.raw/*100.8*/(""");
    </script>

<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->  <link rel="stylesheet" href="_resources/bootstrap.min.css">
 <link rel="stylesheet" href=""""),_display_(/*105.32*/routes/*105.38*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*105.80*/("""">
<script src="""),_display_(/*106.14*/routes/*106.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*106.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*107.47*/routes/*107.53*/.Assets.at("_resources/background.css")),format.raw/*107.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*108.47*/routes/*108.53*/.Assets.at("_resources/forms.css")),format.raw/*108.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*109.47*/routes/*109.53*/.Assets.at("_resources/template.css")),format.raw/*109.90*/("""">
<style type="text/css">



/*  #loading """),format.raw/*114.14*/("""{"""),format.raw/*114.15*/("""
	"""),format.raw/*115.2*/("""position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background: url('"""),_display_(/*121.20*/routes/*121.26*/.Assets.at("images/page-loader.gif")),format.raw/*121.62*/("""') 50% 50% no-repeat rgb(249,249,249);
"""),format.raw/*122.1*/("""}"""),format.raw/*122.2*/(""" """),format.raw/*122.3*/("""*/

 #overlay"""),format.raw/*124.10*/("""{"""),format.raw/*124.11*/(""" 
	"""),format.raw/*125.2*/("""display: none;
	position: fixed;
	background: threedhighlight;
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;

"""),format.raw/*135.1*/("""}"""),format.raw/*135.2*/(""" 

"""),format.raw/*137.1*/("""#loading"""),format.raw/*137.9*/("""{"""),format.raw/*137.10*/(""" 
	"""),format.raw/*138.2*/("""padding: 10px 10px 10px 60px; 
		position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background-color:threedhighlight;
    opacity: 0.6;
    filter: alpha(opacity=60); */
"""),format.raw/*148.1*/("""}"""),format.raw/*148.2*/("""

"""),format.raw/*150.1*/("""</style> 







  
  </head>
<body>


  <div id="loading" style="display: none" align="center" >
 
  
     <img src=""""),_display_(/*166.17*/routes/*166.23*/.Assets.at("/images/preloader-image.gif")),format.raw/*166.64*/("""" alt="" />
  
  </div>  



 <div align="center">
                		<img alt="Visdom Logo" height="90" width="260"  src=""""),_display_(/*173.73*/routes/*173.79*/.Assets.at("_resources/visdom-logo.png")),format.raw/*173.119*/("""" />
              
              
                	</div>

		<form name="myForm" action="wfg1" method="POST" onsubmit="return validateForm()">
		<div style="width: 90%">
		<div class="row"></div>
		<div class="row">
			<div class="col-sm-3"></div>
			
			
			<div class="col-sm-7 container-bg text-color-blue">
				<div style="padding-top: 50px"></div>
				<div data-ng-app="demoApp"  style="margin-left: 5%">

				<div>
							<center>
								<h4>Welcome to the Visdom Mortgage Solutions referral
									program.</h4>
							</center>
						</div>
						<br>

				<div ng-controller="DemoController" ng-init="newItemType='Financial Planner'">
					 <input type="hidden" name="ip" value="" id="ip">	
					
				
												<div id="role1"></div>
						
						
					
					<input type="hidden" id="role" name="role" ng-model="newItemType" value="Financial Planner" ng-required>

						

					

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
								<input type="email" id="email2" name="email2" class="form-control"
									placeholder="Confirm Email" required>
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
									 required/>

								<div id="phone1"></div>

							</div>
							<br>

	<!-- 
							<div
								ng-show="newItemType == 'Financial Planner' || newItemType =='Professional' ">


								<div class="form-group" style="width: 100%">
									<label for="pwd"><Strong> In some regulated industries, referral compensation must be paid directly to their company (eg. Real Estate, Mortgage Associate). Who should the referral compensation be paid too? </Strong><span style="color: red; font-size: 3">*</span>
									</label>
								</div>





							<div class="btn-group blocks" data-toggle="buttons">
									<label style="width: 180px" class="btn btn-primary"
										btn-radio="'Company'" ng-change="change()" ng-model="company">
										My Company </label> <label style="width: 180px" class="btn btn-primary"
										btn-radio="'Direct To MySelf'" ng-change="change()"
										ng-model="company">  MySelf </label>
								</div>
								<div id="feeTo1"></div>
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*292.61*/("""{"""),format.raw/*292.62*/("""{"""),format.raw/*292.63*/("""company"""),format.raw/*292.70*/("""}"""),format.raw/*292.71*/("""}"""),format.raw/*292.72*/(""""> <br>
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
										type="hidden" name="companyAddress" value=""""),format.raw/*312.54*/("""{"""),format.raw/*312.55*/("""{"""),format.raw/*312.56*/("""companyAddress"""),format.raw/*312.70*/("""}"""),format.raw/*312.71*/("""}"""),format.raw/*312.72*/("""">
									<div id="formattedaddress1"></div>


								</div>
							</div> -->
							
							
							<div ng-show="newItemType == 'Realtor'">

								<div class="form-group" style="width: 70%">
									<label for="pwd"><Strong> What is the name of
											the Brokerage you are licensed under? </Strong><span
										style="color: red; font-size: 3">*</span> </label> <input type="text"
									id="broker"	name="broker" class="form-control" ng-required>
									<div id="broker1"></div>

								</div>
								<div class="map_canvas"></div>
								<div class="form-group" style="width: 330px; height: 30%">
									<label for="pwd"><Strong> What is the address
											of the Brokerage?</Strong> <span style="color: red; font-size: 3">*</span>
									</label> <input id="geocomplete1" type="text"
										ng-model="companyAddress1" name="formatted_address"
										class="form-control" placeholder="Enter Location" ng-required>
									<input type="hidden" name="companyAddress1"
										value=""""),format.raw/*338.18*/("""{"""),format.raw/*338.19*/("""{"""),format.raw/*338.20*/("""companyAddress1"""),format.raw/*338.35*/("""}"""),format.raw/*338.36*/("""}"""),format.raw/*338.37*/("""">

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
								<label for="pwd"><Strong>From whom or how did you find out about Visdom Mortgage Solutions?  </Strong> <span style="color: red; font-size: 3">*</span>
								</label> </div>
							<div class="form-group" style="width: 280px">
								 <input type="text" id="refer" name="refer" class="form-control" required>
								<div id="refer1"></div>

							</div>
							<br>



							<div align="center">

								<input type="submit" style="width: 280px" class="btn btn-primary "
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
    $(function() """),format.raw/*402.18*/("""{"""),format.raw/*402.19*/("""
        """),format.raw/*403.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*406.5*/("""}"""),format.raw/*406.6*/(""");
	
</script>
	<script type="text/javascript">
    $(function() """),format.raw/*410.18*/("""{"""),format.raw/*410.19*/("""
        """),format.raw/*411.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#brokerPhone").mask("999-999-9999");
    """),format.raw/*414.5*/("""}"""),format.raw/*414.6*/(""");
	
</script>



	<script>
$(document).ready(function()"""),format.raw/*421.29*/("""{"""),format.raw/*421.30*/("""
    """),format.raw/*422.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*423.1*/("""}"""),format.raw/*423.2*/(""");
</script>

	<script
		src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>

	<script src="jquery.geocomplete.js"></script>
	<script>
      $(function()"""),format.raw/*431.19*/("""{"""),format.raw/*431.20*/("""
        """),format.raw/*432.9*/("""$("#geocomplete").geocomplete("""),format.raw/*432.39*/("""{"""),format.raw/*432.40*/("""
          """),format.raw/*433.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*436.9*/("""}"""),format.raw/*436.10*/(""");

        $("#find").click(function()"""),format.raw/*438.36*/("""{"""),format.raw/*438.37*/("""
          """),format.raw/*439.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*440.9*/("""}"""),format.raw/*440.10*/(""");
      """),format.raw/*441.7*/("""}"""),format.raw/*441.8*/(""");
    </script>

	<script>
      $(function()"""),format.raw/*445.19*/("""{"""),format.raw/*445.20*/("""
        """),format.raw/*446.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*446.40*/("""{"""),format.raw/*446.41*/("""
          """),format.raw/*447.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*450.9*/("""}"""),format.raw/*450.10*/(""");

        $("#find").click(function()"""),format.raw/*452.36*/("""{"""),format.raw/*452.37*/("""
          """),format.raw/*453.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*454.9*/("""}"""),format.raw/*454.10*/(""");
      """),format.raw/*455.7*/("""}"""),format.raw/*455.8*/(""");
    </script>
	<script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*460.56*/("""{"""),format.raw/*460.57*/("""
        """),format.raw/*461.9*/("""init();
        function init() """),format.raw/*462.25*/("""{"""),format.raw/*462.26*/("""
            """),format.raw/*463.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*465.41*/("""{"""),format.raw/*465.42*/("""
                """),format.raw/*466.17*/("""console.log($scope.newItemType)
            """),format.raw/*467.13*/("""}"""),format.raw/*467.14*/(""";
        """),format.raw/*468.9*/("""}"""),format.raw/*468.10*/("""
    """),format.raw/*469.5*/("""}"""),format.raw/*469.6*/(""");
    </script>

	<script type="text/javascript">
 function validateForm() """),format.raw/*473.26*/("""{"""),format.raw/*473.27*/("""
	 
	 """),format.raw/*475.3*/("""try"""),format.raw/*475.6*/("""{"""),format.raw/*475.7*/("""
		"""),format.raw/*476.3*/("""var role=document.forms["myForm"]["role"].value;
		var value=true;
		if(!role)"""),format.raw/*478.12*/("""{"""),format.raw/*478.13*/("""
			"""),format.raw/*479.4*/("""document.getElementById("role1").innerHTML="<p style=\"color:red\">Please Select Role</p>";
			document.getElementById("role").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*485.3*/("""}"""),format.raw/*485.4*/("""else"""),format.raw/*485.8*/("""{"""),format.raw/*485.9*/("""
	    	"""),format.raw/*486.7*/("""document.getElementById("role1").innerHTML="";

		"""),format.raw/*488.3*/("""}"""),format.raw/*488.4*/(""" 

	 """),format.raw/*490.3*/("""var fname=document.forms["myForm"]["fname"].value;
	 

		if(!fname)"""),format.raw/*493.13*/("""{"""),format.raw/*493.14*/("""
			"""),format.raw/*494.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*500.3*/("""}"""),format.raw/*500.4*/("""else if(fname.trim().length<2)"""),format.raw/*500.34*/("""{"""),format.raw/*500.35*/("""
			
			
			"""),format.raw/*503.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">First Name Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*511.3*/("""}"""),format.raw/*511.4*/(""" """),format.raw/*511.5*/("""else"""),format.raw/*511.9*/("""{"""),format.raw/*511.10*/("""
			"""),format.raw/*512.4*/("""if(!fname.match(/^[a-zA-Z ]*$/))"""),format.raw/*512.36*/("""{"""),format.raw/*512.37*/("""
				"""),format.raw/*513.5*/("""document.getElementById("fname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
				document.getElementById("fname").focus();
				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


				value = false;

			"""),format.raw/*520.4*/("""}"""),format.raw/*520.5*/("""else"""),format.raw/*520.9*/("""{"""),format.raw/*520.10*/("""
				"""),format.raw/*521.5*/("""document.getElementById("fname1").innerHTML = "";

			"""),format.raw/*523.4*/("""}"""),format.raw/*523.5*/("""

		"""),format.raw/*525.3*/("""}"""),format.raw/*525.4*/(""" 
		
		"""),format.raw/*527.3*/("""var lname=document.forms["myForm"]["lname"].value;
		 
		if(!lname)"""),format.raw/*529.13*/("""{"""),format.raw/*529.14*/("""
			
			"""),format.raw/*531.4*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
			document.getElementById("lname").focus();
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*536.3*/("""}"""),format.raw/*536.4*/("""else if(lname.trim().length<2)"""),format.raw/*536.34*/("""{"""),format.raw/*536.35*/("""
			
			
			"""),format.raw/*539.4*/("""document.getElementById("lname").focus();

			document.getElementById("lname1").innerHTML="<p style=\"color:red\">Last  Name Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*547.3*/("""}"""),format.raw/*547.4*/("""
			"""),format.raw/*548.4*/("""else"""),format.raw/*548.8*/("""{"""),format.raw/*548.9*/("""
				
				"""),format.raw/*550.5*/("""if(!lname.match(/^[a-zA-Z ]*$/))"""),format.raw/*550.37*/("""{"""),format.raw/*550.38*/("""
					"""),format.raw/*551.6*/("""document.getElementById("lname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
					document.getElementById("lname").focus();
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


					value = false;

				"""),format.raw/*558.5*/("""}"""),format.raw/*558.6*/("""else"""),format.raw/*558.10*/("""{"""),format.raw/*558.11*/("""
					"""),format.raw/*559.6*/("""document.getElementById("lname1").innerHTML = "";

				"""),format.raw/*561.5*/("""}"""),format.raw/*561.6*/("""

			"""),format.raw/*563.4*/("""}"""),format.raw/*563.5*/(""" 
	 
		"""),format.raw/*565.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*567.13*/("""{"""),format.raw/*567.14*/("""
			
			"""),format.raw/*569.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*575.3*/("""}"""),format.raw/*575.4*/("""else"""),format.raw/*575.8*/("""{"""),format.raw/*575.9*/("""
	    	"""),format.raw/*576.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*578.3*/("""}"""),format.raw/*578.4*/("""
	 
	 
    """),format.raw/*581.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*585.24*/("""{"""),format.raw/*585.25*/("""         
		  
    """),format.raw/*587.5*/("""}"""),format.raw/*587.6*/("""else"""),format.raw/*587.10*/("""{"""),format.raw/*587.11*/("""   
		"""),format.raw/*588.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*594.5*/("""}"""),format.raw/*594.6*/("""
    
    """),format.raw/*596.5*/("""if(pattern.test(x2))"""),format.raw/*596.25*/("""{"""),format.raw/*596.26*/("""         
		  
    """),format.raw/*598.5*/("""}"""),format.raw/*598.6*/("""else"""),format.raw/*598.10*/("""{"""),format.raw/*598.11*/("""   
		"""),format.raw/*599.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email2").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*605.5*/("""}"""),format.raw/*605.6*/("""
    """),format.raw/*606.5*/("""if (x  != x2) """),format.raw/*606.19*/("""{"""),format.raw/*606.20*/("""
"""),format.raw/*607.1*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
document.getElementById("email").focus();

document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

value= false;
    """),format.raw/*613.5*/("""}"""),format.raw/*613.6*/("""else"""),format.raw/*613.10*/("""{"""),format.raw/*613.11*/("""
    	"""),format.raw/*614.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*616.5*/("""}"""),format.raw/*616.6*/("""
    
	"""),format.raw/*618.2*/("""var phone=document.forms["myForm"]["phone"].value;
	 
	if(!phone)"""),format.raw/*620.12*/("""{"""),format.raw/*620.13*/("""
		"""),format.raw/*621.3*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
		document.getElementById("phonedatata").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*627.2*/("""}"""),format.raw/*627.3*/("""	
	"""),format.raw/*628.2*/("""else"""),format.raw/*628.6*/("""{"""),format.raw/*628.7*/("""
    	"""),format.raw/*629.6*/("""document.getElementById("phone1").innerHTML="";

	"""),format.raw/*631.2*/("""}"""),format.raw/*631.3*/(""" 

	
	"""),format.raw/*634.2*/("""var broker=document.forms["myForm"]["broker"].value;

if(!broker&& role== 'Realtor')"""),format.raw/*636.31*/("""{"""),format.raw/*636.32*/("""
		
		"""),format.raw/*638.3*/("""document.getElementById("broker1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		
		document.getElementById("broker").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*645.2*/("""}"""),format.raw/*645.3*/("""else"""),format.raw/*645.7*/("""{"""),format.raw/*645.8*/("""
    	"""),format.raw/*646.6*/("""document.getElementById("broker1").innerHTML="";

	"""),format.raw/*648.2*/("""}"""),format.raw/*648.3*/("""									
"""),format.raw/*649.1*/("""var address1=document.forms["myForm"]["companyAddress1"].value;
if(!address1&& role== 'Realtor')"""),format.raw/*650.33*/("""{"""),format.raw/*650.34*/("""
	
	"""),format.raw/*652.2*/("""document.getElementById("address1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("geocomplete1").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*658.1*/("""}"""),format.raw/*658.2*/("""else"""),format.raw/*658.6*/("""{"""),format.raw/*658.7*/("""
	"""),format.raw/*659.2*/("""document.getElementById("address1").innerHTML="";

"""),format.raw/*661.1*/("""}"""),format.raw/*661.2*/("""

"""),format.raw/*663.1*/("""var brokerPhone=document.forms["myForm"]["brokerPhone"].value;



if(!brokerPhone&& role== 'Realtor')"""),format.raw/*667.36*/("""{"""),format.raw/*667.37*/("""
	
	"""),format.raw/*669.2*/("""document.getElementById("brokerPhone1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerPhone").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*675.1*/("""}"""),format.raw/*675.2*/("""else"""),format.raw/*675.6*/("""{"""),format.raw/*675.7*/("""
	"""),format.raw/*676.2*/("""document.getElementById("brokerPhone1").innerHTML="";

"""),format.raw/*678.1*/("""}"""),format.raw/*678.2*/("""

"""),format.raw/*680.1*/("""var brokerMange=document.forms["myForm"]["brokerMange"].value;


if(!brokerMange&& role== 'Realtor')"""),format.raw/*683.36*/("""{"""),format.raw/*683.37*/("""
	
	"""),format.raw/*685.2*/("""document.getElementById("brokerMange1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerMange").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*691.1*/("""}"""),format.raw/*691.2*/("""else"""),format.raw/*691.6*/("""{"""),format.raw/*691.7*/("""
	"""),format.raw/*692.2*/("""document.getElementById("brokerMange1").innerHTML="";

"""),format.raw/*694.1*/("""}"""),format.raw/*694.2*/("""


"""),format.raw/*697.1*/("""var refer=document.forms["myForm"]["refer"].value;

if(!refer&& role== 'Realtor')"""),format.raw/*699.30*/("""{"""),format.raw/*699.31*/("""
	
	"""),format.raw/*701.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*707.1*/("""}"""),format.raw/*707.2*/("""else if(refer.trim().length<2)"""),format.raw/*707.32*/("""{"""),format.raw/*707.33*/("""
	
	"""),format.raw/*709.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">Referrar Name Should be more than one letter </p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*715.1*/("""}"""),format.raw/*715.2*/("""


"""),format.raw/*718.1*/("""else"""),format.raw/*718.5*/("""{"""),format.raw/*718.6*/("""
	"""),format.raw/*719.2*/("""if(!refer.match(/^[a-zA-Z ]*$/))"""),format.raw/*719.34*/("""{"""),format.raw/*719.35*/("""
		"""),format.raw/*720.3*/("""document.getElementById("refer1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("refer").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*727.2*/("""}"""),format.raw/*727.3*/("""else"""),format.raw/*727.7*/("""{"""),format.raw/*727.8*/("""
		"""),format.raw/*728.3*/("""document.getElementById("refer1").innerHTML = "";

	"""),format.raw/*730.2*/("""}"""),format.raw/*730.3*/("""

"""),format.raw/*732.1*/("""}"""),format.raw/*732.2*/("""
"""),format.raw/*733.1*/("""if(value)"""),format.raw/*733.10*/("""{"""),format.raw/*733.11*/("""
	 """),format.raw/*734.3*/("""$('#loading').show();
"""),format.raw/*735.1*/("""}"""),format.raw/*735.2*/("""
"""),format.raw/*736.1*/("""return value;
	 """),format.raw/*737.3*/("""}"""),format.raw/*737.4*/("""catch(err)"""),format.raw/*737.14*/("""{"""),format.raw/*737.15*/("""
		
	 """),format.raw/*739.3*/("""}"""),format.raw/*739.4*/("""
    
 """),format.raw/*741.2*/("""}"""),format.raw/*741.3*/("""
    
    """),format.raw/*743.5*/("""</script>


	<script src=""""),_display_(/*746.16*/routes/*746.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*746.72*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:25 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/wfg.scala.html
                  HASH: 4c67cd448ba5f29f56ee93f2300b18b715770092
                  MATRIX: 721->1|826->18|853->19|1202->342|1216->348|1272->384|1418->503|1433->509|1493->548|1549->578|1564->584|1634->633|1789->761|1804->767|1869->811|1926->841|1941->847|2008->893|2106->964|2134->965|2166->970|2318->1095|2346->1096|2378->1101|2411->1106|2440->1107|2472->1112|2543->1156|2571->1157|2599->1158|2668->1199|2697->1200|2730->1206|2820->1269|2848->1270|2880->1275|2948->1315|2977->1316|3013->1325|3071->1355|3100->1356|3139->1367|3268->1469|3297->1470|3364->1509|3393->1510|3432->1521|3505->1567|3534->1568|3570->1577|3598->1578|3681->1633|3710->1634|3746->1643|3805->1674|3834->1675|3873->1686|4002->1788|4031->1789|4098->1828|4127->1829|4166->1840|4240->1887|4269->1888|4305->1897|4333->1898|4469->2006|4498->2007|4531->2013|4877->2332|4905->2333|5025->2425|5054->2426|5090->2435|5233->2550|5262->2551|5300->2561|6084->3318|6112->3319|6146->3325|6175->3326|6204->3327|6436->3531|6452->3537|6516->3579|6560->3595|6576->3601|6639->3642|6727->3702|6743->3708|6804->3747|6881->3796|6897->3802|6953->3836|7030->3885|7046->3891|7105->3928|7177->3971|7207->3972|7237->3974|7369->4078|7385->4084|7443->4120|7510->4159|7539->4160|7568->4161|7610->4174|7640->4175|7671->4178|7849->4328|7878->4329|7909->4332|7945->4340|7975->4341|8006->4344|8239->4549|8268->4550|8298->4552|8445->4671|8461->4677|8524->4718|8675->4841|8691->4847|8754->4887|12677->8782|12707->8783|12737->8784|12773->8791|12803->8792|12833->8793|13653->9584|13683->9585|13713->9586|13756->9600|13786->9601|13816->9602|14869->10626|14899->10627|14929->10628|14973->10643|15003->10644|15033->10645|16794->12377|16824->12378|16861->12387|16976->12474|17005->12475|17099->12540|17129->12541|17166->12550|17281->12637|17310->12638|17395->12694|17425->12695|17458->12700|17529->12743|17558->12744|17777->12934|17807->12935|17844->12944|17903->12974|17933->12975|17973->12986|18103->13088|18133->13089|18201->13128|18231->13129|18271->13140|18345->13186|18375->13187|18412->13196|18441->13197|18516->13243|18546->13244|18583->13253|18643->13284|18673->13285|18713->13296|18843->13398|18873->13399|18941->13438|18971->13439|19011->13450|19086->13497|19116->13498|19153->13507|19182->13508|19376->13673|19406->13674|19443->13683|19504->13715|19534->13716|19576->13729|19701->13825|19731->13826|19777->13843|19850->13887|19880->13888|19918->13898|19948->13899|19981->13904|20010->13905|20115->13981|20145->13982|20179->13988|20210->13991|20239->13992|20270->13995|20377->14073|20407->14074|20439->14078|20771->14382|20800->14383|20832->14387|20861->14388|20896->14395|20974->14445|21003->14446|21036->14451|21132->14518|21162->14519|21194->14523|21528->14829|21557->14830|21616->14860|21646->14861|21686->14873|22047->15206|22076->15207|22105->15208|22137->15212|22167->15213|22199->15217|22260->15249|22290->15250|22323->15255|22676->15580|22705->15581|22737->15585|22767->15586|22800->15591|22882->15645|22911->15646|22943->15650|22972->15651|23007->15658|23103->15725|23133->15726|23169->15734|23501->16038|23530->16039|23589->16069|23619->16070|23659->16082|24020->16415|24049->16416|24081->16420|24113->16424|24142->16425|24180->16435|24241->16467|24271->16468|24305->16474|24662->16803|24691->16804|24724->16808|24754->16809|24788->16815|24871->16870|24900->16871|24933->16876|24962->16877|24997->16884|25093->16951|25123->16952|25159->16960|25489->17262|25518->17263|25550->17267|25579->17268|25614->17275|25693->17326|25722->17327|25761->17338|25998->17547|26028->17548|26075->17567|26104->17568|26137->17572|26167->17573|26201->17579|26541->17891|26570->17892|26608->17902|26657->17922|26687->17923|26734->17942|26763->17943|26796->17947|26826->17948|26860->17954|27200->18266|27229->18267|27262->18272|27305->18286|27335->18287|27364->18288|27691->18587|27720->18588|27753->18592|27783->18593|27817->18599|27897->18651|27926->18652|27961->18659|28055->18724|28085->18725|28116->18728|28454->19038|28483->19039|28514->19042|28546->19046|28575->19047|28609->19053|28687->19103|28716->19104|28750->19110|28863->19194|28893->19195|28927->19201|29266->19512|29295->19513|29327->19517|29356->19518|29390->19524|29469->19575|29498->19576|29536->19586|29661->19682|29691->19683|29723->19687|30062->19998|30091->19999|30123->20003|30152->20004|30182->20006|30261->20057|30290->20058|30320->20060|30450->20161|30480->20162|30512->20166|30854->20480|30883->20481|30915->20485|30944->20486|30974->20488|31057->20543|31086->20544|31116->20546|31245->20646|31275->20647|31307->20651|31649->20965|31678->20966|31710->20970|31739->20971|31769->20973|31852->21028|31881->21029|31912->21032|32022->21113|32052->21114|32084->21118|32414->21420|32443->21421|32502->21451|32532->21452|32564->21456|32916->21780|32945->21781|32976->21784|33008->21788|33037->21789|33067->21791|33128->21823|33158->21824|33189->21827|33534->22144|33563->22145|33595->22149|33624->22150|33655->22153|33735->22205|33764->22206|33794->22208|33823->22209|33852->22210|33890->22219|33920->22220|33951->22223|34001->22245|34030->22246|34059->22247|34103->22263|34132->22264|34171->22274|34201->22275|34235->22281|34264->22282|34299->22289|34328->22290|34366->22300|34421->22327|34437->22333|34509->22383
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|44->16|44->16|44->16|45->17|45->17|45->17|49->21|49->21|50->22|56->28|56->28|57->29|57->29|57->29|58->30|61->33|61->33|62->34|62->34|62->34|63->35|66->38|66->38|67->39|69->41|69->41|70->42|70->42|70->42|71->43|74->46|74->46|76->48|76->48|77->49|78->50|78->50|79->51|79->51|83->55|83->55|84->56|84->56|84->56|85->57|88->60|88->60|90->62|90->62|91->63|92->64|92->64|93->65|93->65|96->68|96->68|97->69|102->74|102->74|107->79|107->79|108->80|111->83|111->83|112->84|127->99|127->99|128->100|128->100|128->100|133->105|133->105|133->105|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|137->109|137->109|137->109|142->114|142->114|143->115|149->121|149->121|149->121|150->122|150->122|150->122|152->124|152->124|153->125|163->135|163->135|165->137|165->137|165->137|166->138|176->148|176->148|178->150|194->166|194->166|194->166|201->173|201->173|201->173|320->292|320->292|320->292|320->292|320->292|320->292|340->312|340->312|340->312|340->312|340->312|340->312|366->338|366->338|366->338|366->338|366->338|366->338|430->402|430->402|431->403|434->406|434->406|438->410|438->410|439->411|442->414|442->414|449->421|449->421|450->422|451->423|451->423|459->431|459->431|460->432|460->432|460->432|461->433|464->436|464->436|466->438|466->438|467->439|468->440|468->440|469->441|469->441|473->445|473->445|474->446|474->446|474->446|475->447|478->450|478->450|480->452|480->452|481->453|482->454|482->454|483->455|483->455|488->460|488->460|489->461|490->462|490->462|491->463|493->465|493->465|494->466|495->467|495->467|496->468|496->468|497->469|497->469|501->473|501->473|503->475|503->475|503->475|504->476|506->478|506->478|507->479|513->485|513->485|513->485|513->485|514->486|516->488|516->488|518->490|521->493|521->493|522->494|528->500|528->500|528->500|528->500|531->503|539->511|539->511|539->511|539->511|539->511|540->512|540->512|540->512|541->513|548->520|548->520|548->520|548->520|549->521|551->523|551->523|553->525|553->525|555->527|557->529|557->529|559->531|564->536|564->536|564->536|564->536|567->539|575->547|575->547|576->548|576->548|576->548|578->550|578->550|578->550|579->551|586->558|586->558|586->558|586->558|587->559|589->561|589->561|591->563|591->563|593->565|595->567|595->567|597->569|603->575|603->575|603->575|603->575|604->576|606->578|606->578|609->581|613->585|613->585|615->587|615->587|615->587|615->587|616->588|622->594|622->594|624->596|624->596|624->596|626->598|626->598|626->598|626->598|627->599|633->605|633->605|634->606|634->606|634->606|635->607|641->613|641->613|641->613|641->613|642->614|644->616|644->616|646->618|648->620|648->620|649->621|655->627|655->627|656->628|656->628|656->628|657->629|659->631|659->631|662->634|664->636|664->636|666->638|673->645|673->645|673->645|673->645|674->646|676->648|676->648|677->649|678->650|678->650|680->652|686->658|686->658|686->658|686->658|687->659|689->661|689->661|691->663|695->667|695->667|697->669|703->675|703->675|703->675|703->675|704->676|706->678|706->678|708->680|711->683|711->683|713->685|719->691|719->691|719->691|719->691|720->692|722->694|722->694|725->697|727->699|727->699|729->701|735->707|735->707|735->707|735->707|737->709|743->715|743->715|746->718|746->718|746->718|747->719|747->719|747->719|748->720|755->727|755->727|755->727|755->727|756->728|758->730|758->730|760->732|760->732|761->733|761->733|761->733|762->734|763->735|763->735|764->736|765->737|765->737|765->737|765->737|767->739|767->739|769->741|769->741|771->743|774->746|774->746|774->746
                  -- GENERATED --
              */
          