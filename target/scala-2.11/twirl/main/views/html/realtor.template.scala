
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
object realtor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
    font-weight:bold;
    
     border-radius: 0;
     		background-color: #0086b3;
     
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/(""".btn """),format.raw/*29.7*/("""{"""),format.raw/*29.8*/("""
    """),format.raw/*30.5*/("""border: 0 none;
    font-weight: bold;
    
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""
"""),format.raw/*34.1*/(""".btn-primary:active, .btn-primary.active """),format.raw/*34.42*/("""{"""),format.raw/*34.43*/("""
     """),format.raw/*35.6*/("""background: #003f80;
    color: #ffffff;
    box-shadow: none;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""
    
    """),format.raw/*40.5*/("""</style>
    <script>
      $(function()"""),format.raw/*42.19*/("""{"""),format.raw/*42.20*/("""
        """),format.raw/*43.9*/("""$("#geocomplete").geocomplete("""),format.raw/*43.39*/("""{"""),format.raw/*43.40*/("""
          """),format.raw/*44.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/(""");

        $("#find").click(function()"""),format.raw/*49.36*/("""{"""),format.raw/*49.37*/("""
          """),format.raw/*50.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/(""");
      """),format.raw/*52.7*/("""}"""),format.raw/*52.8*/(""");
    </script>
    
      <script>
      $(function()"""),format.raw/*56.19*/("""{"""),format.raw/*56.20*/("""
        """),format.raw/*57.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*57.40*/("""{"""),format.raw/*57.41*/("""
          """),format.raw/*58.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/(""");

        $("#find").click(function()"""),format.raw/*63.36*/("""{"""),format.raw/*63.37*/("""
          """),format.raw/*64.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*65.9*/("""}"""),format.raw/*65.10*/(""");
      """),format.raw/*66.7*/("""}"""),format.raw/*66.8*/(""");
    </script> 
    <script type="text/javascript">
  /*   $.get("https://ipinfo.io", function (response) """),format.raw/*69.55*/("""{"""),format.raw/*69.56*/("""
    	"""),format.raw/*70.6*/("""document.getElementById("ip").value=JSON.stringify(response, null, 4);
    	alert(JSON.stringify(response, null, 4));
    		/* $("#ip").html("IP: " + response.ip);
        $("#address").html("Location: " + response.city + ", " + response.region); */
       // $("#details").html(JSON.stringify(response, null, 4));
    """),format.raw/*75.5*/("""}"""),format.raw/*75.6*/(""", "jsonp"); */
    </script>
    
    <script type="text/javascript">
    
    jQuery.ajax( """),format.raw/*80.18*/("""{"""),format.raw/*80.19*/(""" 
    	  """),format.raw/*81.8*/("""url: 'http://ip-api.com/json', 
    	  type: 'POST', 
    	  dataType: 'jsonp',
    	  success: function(location) """),format.raw/*84.36*/("""{"""),format.raw/*84.37*/("""
    	    """),format.raw/*85.10*/("""// example where I update content on the page.
    	    
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
    	  """),format.raw/*100.8*/("""}"""),format.raw/*100.9*/("""
    	"""),format.raw/*101.6*/("""}"""),format.raw/*101.7*/(""" """),format.raw/*101.8*/(""");
    </script>

<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->  <link rel="stylesheet" href="_resources/bootstrap.min.css">
 <link rel="stylesheet" href=""""),_display_(/*106.32*/routes/*106.38*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*106.80*/("""">
<script src="""),_display_(/*107.14*/routes/*107.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*107.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*108.47*/routes/*108.53*/.Assets.at("_resources/background.css")),format.raw/*108.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*109.47*/routes/*109.53*/.Assets.at("_resources/forms.css")),format.raw/*109.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*110.47*/routes/*110.53*/.Assets.at("_resources/template.css")),format.raw/*110.90*/("""">
<style type="text/css">



/*  #loading """),format.raw/*115.14*/("""{"""),format.raw/*115.15*/("""
	"""),format.raw/*116.2*/("""position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background: url('"""),_display_(/*122.20*/routes/*122.26*/.Assets.at("images/page-loader.gif")),format.raw/*122.62*/("""') 50% 50% no-repeat rgb(249,249,249);
"""),format.raw/*123.1*/("""}"""),format.raw/*123.2*/(""" """),format.raw/*123.3*/("""*/

 #overlay"""),format.raw/*125.10*/("""{"""),format.raw/*125.11*/(""" 
	"""),format.raw/*126.2*/("""display: none;
	position: fixed;
	background: threedhighlight;
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;

"""),format.raw/*136.1*/("""}"""),format.raw/*136.2*/(""" 

"""),format.raw/*138.1*/("""#loading"""),format.raw/*138.9*/("""{"""),format.raw/*138.10*/(""" 
	"""),format.raw/*139.2*/("""padding: 10px 10px 10px 60px; 
		position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background-color:threedhighlight;
    opacity: 0.6;
    filter: alpha(opacity=60); */
"""),format.raw/*149.1*/("""}"""),format.raw/*149.2*/("""

"""),format.raw/*151.1*/("""</style> 







  
  </head>
<body>


  <div id="loading" style="display: none" align="center" >
 
  
     <img src=""""),_display_(/*167.17*/routes/*167.23*/.Assets.at("/images/preloader-image.gif")),format.raw/*167.64*/("""" alt="" />
  
  </div>  


 <div align="center">
                		<img alt="Visdom Logo" height="90" width="260"  src=""""),_display_(/*173.73*/routes/*173.79*/.Assets.at("_resources/visdom-logo.png")),format.raw/*173.119*/("""" />
              
              
                	</div>

		<form name="myForm" action="referal1" method="POST" onsubmit="return validateForm()">
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

					<div ng-controller="DemoController" ng-init="newItemType='Realtor'">
					 <input type="hidden" name="ip" value="" id="ip">	
					
				
				
						
						
					
					<input type="hidden" id="role" name="role" ng-model="newItemType" value="Realtor" ng-required>
								<div id="role1"></div>
						
	
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


							<div
								ng-show="newItemType == 'Financial Planner' || newItemType =='Professional' ">


								<div class="form-group" style="width: 100%">
									<label for="pwd"><Strong> In some regulated industries, referral compensation must be paid directly to their company (eg. Real Estate, Mortgage Associate). 
									Who should the referral compensation be paid too? </Strong><span style="color: red; font-size: 3">*</span>
									</label>
								</div>





								<div class="btn-group blocks" data-toggle="buttons">
									<label style="width: 180px" class="btn btn-primary"
										btn-radio="'Company'" ng-change="change()" ng-model="company">
										My Company </label> <label style="width: 180px" class="btn btn-primary"
										btn-radio="'Direct To MySelf'" ng-change="change()"
										ng-model="company"> MySelf </label>
								</div>
								<div id="feeTo1"></div>
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*291.61*/("""{"""),format.raw/*291.62*/("""{"""),format.raw/*291.63*/("""company"""),format.raw/*291.70*/("""}"""),format.raw/*291.71*/("""}"""),format.raw/*291.72*/(""""> <br>
								<br>


								<div class="map_canvas"></div>

								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong> Company Name  </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
									id="company"	name="company" class="form-control" >
									<div id="company1"></div>

								</div>

								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong> Company Address </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input
										id="geocomplete" type="text" name="formatted_address"
										class="form-control" ng-model="companyAddress"
										placeholder="Enter Location" ng-required> <input
										type="hidden" name="companyAddress" value=""""),format.raw/*311.54*/("""{"""),format.raw/*311.55*/("""{"""),format.raw/*311.56*/("""companyAddress"""),format.raw/*311.70*/("""}"""),format.raw/*311.71*/("""}"""),format.raw/*311.72*/("""">
									<div id="formattedaddress1"></div>


								</div>
							</div>
							<div ng-show="newItemType == 'Realtor'">

								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong> Brokerage Name </Strong><span
										style="color: red; font-size: 3">*</span> </label> <input type="text"
									id="broker"	name="broker" class="form-control"required>
									<div id="broker1"></div>

								</div>
								<div class="map_canvas"></div>
								<div class="form-group" style="width: 280px; height: 30%">
									<label for="pwd"><Strong> Brokerage Address</Strong> <span style="color: red; font-size: 3">*</span>
									</label> <input id="geocomplete1" type="text"
										ng-model="companyAddress1" name="formatted_address"
										class="form-control" placeholder="Enter Location" required>
									<input type="hidden" name="companyAddress1"
										value=""""),format.raw/*333.18*/("""{"""),format.raw/*333.19*/("""{"""),format.raw/*333.20*/("""companyAddress1"""),format.raw/*333.35*/("""}"""),format.raw/*333.36*/("""}"""),format.raw/*333.37*/("""">

									<div id="address1"></div>

								</div>
								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong> Brokerage Phone number </Strong> <span
										style="color: red; font-size: 3">*</span> </label> <input type="text"
										id="brokerPhone" name="brokerPhone" class="form-control"
										required>

									<div id="brokerPhone1"></div>

								</div>

								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong>Who is your Broker? </Strong> <span
										style="color: red; font-size: 3">*</span> </label> <input type="text"
									id="brokerMange"	name="brokerMange" class="form-control" required>
									<div id="brokerMange1"></div>

								</div>
							</div>
							<div class="form-group" style="width: 100%">
								<label for="pwd"><Strong>From whom or how did you find out about Visdom Mortgage Solutions?  </Strong> <span style="color: red; font-size: 3">*</span>
								</label></div>
							<div class="form-group" style="width: 280px">
								 <input type="text" id="refer" name="refer" class="form-control" required>
								<div id="refer1"></div>

							</div>
							<br>



							<div align="center">

								<input type="submit" style="width:280px " class="btn btn-primary"
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
    $(function() """),format.raw/*394.18*/("""{"""),format.raw/*394.19*/("""
        """),format.raw/*395.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*398.5*/("""}"""),format.raw/*398.6*/(""");
	
</script>
	<script type="text/javascript">
    $(function() """),format.raw/*402.18*/("""{"""),format.raw/*402.19*/("""
        """),format.raw/*403.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#brokerPhone").mask("999-999-9999");
    """),format.raw/*406.5*/("""}"""),format.raw/*406.6*/(""");
	
</script>



	<script>
$(document).ready(function()"""),format.raw/*413.29*/("""{"""),format.raw/*413.30*/("""
    """),format.raw/*414.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*415.1*/("""}"""),format.raw/*415.2*/(""");
</script>

	<script
		src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>

	<script src="jquery.geocomplete.js"></script>
	<script>
      $(function()"""),format.raw/*423.19*/("""{"""),format.raw/*423.20*/("""
        """),format.raw/*424.9*/("""$("#geocomplete").geocomplete("""),format.raw/*424.39*/("""{"""),format.raw/*424.40*/("""
          """),format.raw/*425.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*428.9*/("""}"""),format.raw/*428.10*/(""");

        $("#find").click(function()"""),format.raw/*430.36*/("""{"""),format.raw/*430.37*/("""
          """),format.raw/*431.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*432.9*/("""}"""),format.raw/*432.10*/(""");
      """),format.raw/*433.7*/("""}"""),format.raw/*433.8*/(""");
    </script>

	<script>
      $(function()"""),format.raw/*437.19*/("""{"""),format.raw/*437.20*/("""
        """),format.raw/*438.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*438.40*/("""{"""),format.raw/*438.41*/("""
          """),format.raw/*439.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*442.9*/("""}"""),format.raw/*442.10*/(""");

        $("#find").click(function()"""),format.raw/*444.36*/("""{"""),format.raw/*444.37*/("""
          """),format.raw/*445.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*446.9*/("""}"""),format.raw/*446.10*/(""");
      """),format.raw/*447.7*/("""}"""),format.raw/*447.8*/(""");
    </script>
	<script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*452.56*/("""{"""),format.raw/*452.57*/("""
        """),format.raw/*453.9*/("""init();
        function init() """),format.raw/*454.25*/("""{"""),format.raw/*454.26*/("""
            """),format.raw/*455.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*457.41*/("""{"""),format.raw/*457.42*/("""
                """),format.raw/*458.17*/("""console.log($scope.newItemType)
            """),format.raw/*459.13*/("""}"""),format.raw/*459.14*/(""";
        """),format.raw/*460.9*/("""}"""),format.raw/*460.10*/("""
    """),format.raw/*461.5*/("""}"""),format.raw/*461.6*/(""");
    </script>

	<script type="text/javascript">
 function validateForm() """),format.raw/*465.26*/("""{"""),format.raw/*465.27*/("""
	 
	 """),format.raw/*467.3*/("""try"""),format.raw/*467.6*/("""{"""),format.raw/*467.7*/("""
		"""),format.raw/*468.3*/("""var role=document.forms["myForm"]["role"].value;
		var value=true;
		if(!role)"""),format.raw/*470.12*/("""{"""),format.raw/*470.13*/("""
			"""),format.raw/*471.4*/("""document.getElementById("role1").innerHTML="<p style=\"color:red\">Please Select Role</p>";
			document.getElementById("role").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*477.3*/("""}"""),format.raw/*477.4*/("""else"""),format.raw/*477.8*/("""{"""),format.raw/*477.9*/("""
	    	"""),format.raw/*478.7*/("""document.getElementById("role1").innerHTML="";

		"""),format.raw/*480.3*/("""}"""),format.raw/*480.4*/(""" 

	 """),format.raw/*482.3*/("""var fname=document.forms["myForm"]["fname"].value;
	 

		if(!fname)"""),format.raw/*485.13*/("""{"""),format.raw/*485.14*/("""
			"""),format.raw/*486.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*492.3*/("""}"""),format.raw/*492.4*/("""else if(fname.trim().length<2)"""),format.raw/*492.34*/("""{"""),format.raw/*492.35*/("""
			
			
			"""),format.raw/*495.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName  Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*503.3*/("""}"""),format.raw/*503.4*/(""" """),format.raw/*503.5*/("""else"""),format.raw/*503.9*/("""{"""),format.raw/*503.10*/("""
			"""),format.raw/*504.4*/("""if(!fname.match(/^[a-zA-Z ]*$/))"""),format.raw/*504.36*/("""{"""),format.raw/*504.37*/("""
				"""),format.raw/*505.5*/("""document.getElementById("fname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
				document.getElementById("fname").focus();
				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


				value = false;

			"""),format.raw/*512.4*/("""}"""),format.raw/*512.5*/("""else"""),format.raw/*512.9*/("""{"""),format.raw/*512.10*/("""
				"""),format.raw/*513.5*/("""document.getElementById("fname1").innerHTML = "";

			"""),format.raw/*515.4*/("""}"""),format.raw/*515.5*/("""

		"""),format.raw/*517.3*/("""}"""),format.raw/*517.4*/(""" 
		
		
		
		"""),format.raw/*521.3*/("""var lname=document.forms["myForm"]["lname"].value;
		 
		if(!lname)"""),format.raw/*523.13*/("""{"""),format.raw/*523.14*/("""
			
			"""),format.raw/*525.4*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
			document.getElementById("lname").focus();
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*530.3*/("""}"""),format.raw/*530.4*/("""else if(lname.trim().length<2)"""),format.raw/*530.34*/("""{"""),format.raw/*530.35*/("""
			
			
			"""),format.raw/*533.4*/("""document.getElementById("lname").focus();

			document.getElementById("lname1").innerHTML="<p style=\"color:red\">Last  Name Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*541.3*/("""}"""),format.raw/*541.4*/("""
			"""),format.raw/*542.4*/("""else"""),format.raw/*542.8*/("""{"""),format.raw/*542.9*/("""
				
				"""),format.raw/*544.5*/("""if(!lname.match(/^[a-zA-Z ]*$/))"""),format.raw/*544.37*/("""{"""),format.raw/*544.38*/("""
					"""),format.raw/*545.6*/("""document.getElementById("lname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
					document.getElementById("lname").focus();
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


					value = false;

				"""),format.raw/*552.5*/("""}"""),format.raw/*552.6*/("""else"""),format.raw/*552.10*/("""{"""),format.raw/*552.11*/("""
					"""),format.raw/*553.6*/("""document.getElementById("lname1").innerHTML = "";

				"""),format.raw/*555.5*/("""}"""),format.raw/*555.6*/("""

			"""),format.raw/*557.4*/("""}"""),format.raw/*557.5*/(""" 
		
		
		
	 
		"""),format.raw/*562.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*564.13*/("""{"""),format.raw/*564.14*/("""
			
			"""),format.raw/*566.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*572.3*/("""}"""),format.raw/*572.4*/("""else"""),format.raw/*572.8*/("""{"""),format.raw/*572.9*/("""
	    	"""),format.raw/*573.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*575.3*/("""}"""),format.raw/*575.4*/("""
	 
	 
    """),format.raw/*578.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*582.24*/("""{"""),format.raw/*582.25*/("""         
		  
    """),format.raw/*584.5*/("""}"""),format.raw/*584.6*/("""else"""),format.raw/*584.10*/("""{"""),format.raw/*584.11*/("""   
		"""),format.raw/*585.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*591.5*/("""}"""),format.raw/*591.6*/("""
    
    """),format.raw/*593.5*/("""if(pattern.test(x2))"""),format.raw/*593.25*/("""{"""),format.raw/*593.26*/("""         
		  
    """),format.raw/*595.5*/("""}"""),format.raw/*595.6*/("""else"""),format.raw/*595.10*/("""{"""),format.raw/*595.11*/("""   
		"""),format.raw/*596.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email2").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*602.5*/("""}"""),format.raw/*602.6*/("""
    """),format.raw/*603.5*/("""if (x  != x2) """),format.raw/*603.19*/("""{"""),format.raw/*603.20*/("""
"""),format.raw/*604.1*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
document.getElementById("email").focus();

document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

    	value= false;
    """),format.raw/*610.5*/("""}"""),format.raw/*610.6*/("""else"""),format.raw/*610.10*/("""{"""),format.raw/*610.11*/("""
    	"""),format.raw/*611.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*613.5*/("""}"""),format.raw/*613.6*/("""
    
	"""),format.raw/*615.2*/("""var phone=document.forms["myForm"]["phone"].value;
	 
	if(!phone)"""),format.raw/*617.12*/("""{"""),format.raw/*617.13*/("""
		"""),format.raw/*618.3*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
		document.getElementById("phonedatata").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*624.2*/("""}"""),format.raw/*624.3*/("""	
	"""),format.raw/*625.2*/("""else"""),format.raw/*625.6*/("""{"""),format.raw/*625.7*/("""
    	"""),format.raw/*626.6*/("""document.getElementById("phone1").innerHTML="";

	"""),format.raw/*628.2*/("""}"""),format.raw/*628.3*/(""" 
    
	"""),format.raw/*630.2*/("""var feeTo=document.forms["myForm"]["feeTo"].value;

	if(!feeTo)"""),format.raw/*632.12*/("""{"""),format.raw/*632.13*/("""

		"""),format.raw/*634.3*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*634.58*/("""{"""),format.raw/*634.59*/("""
		"""),format.raw/*635.3*/("""document.getElementById("feeTo1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("feeTo").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*641.2*/("""}"""),format.raw/*641.3*/("""
	"""),format.raw/*642.2*/("""}"""),format.raw/*642.3*/("""else"""),format.raw/*642.7*/("""{"""),format.raw/*642.8*/("""
    	"""),format.raw/*643.6*/("""document.getElementById("feeTo1").innerHTML="";

	"""),format.raw/*645.2*/("""}"""),format.raw/*645.3*/("""
	
	
	
	
	
	"""),format.raw/*651.2*/("""//var role=document.forms["myForm"]["role"].value;
	var company=document.forms["myForm"]["company"].value;

	
	
if(!company)"""),format.raw/*656.13*/("""{"""),format.raw/*656.14*/("""
	"""),format.raw/*657.2*/("""if(role == 'Financial Planner' || role=='Professional' && feeTo=='Company' )"""),format.raw/*657.78*/("""{"""),format.raw/*657.79*/("""
		"""),format.raw/*658.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*664.2*/("""}"""),format.raw/*664.3*/("""
	"""),format.raw/*665.2*/("""}"""),format.raw/*665.3*/("""else"""),format.raw/*665.7*/("""{"""),format.raw/*665.8*/("""
    	"""),format.raw/*666.6*/("""document.getElementById("company1").innerHTML="";

	"""),format.raw/*668.2*/("""}"""),format.raw/*668.3*/("""


"""),format.raw/*671.1*/("""//var formattedaddress=document.forms["myForm"]["companyAddress"].value;
var companyAddress=document.forms["myForm"]["companyAddress"].value;


if(!companyAddress)"""),format.raw/*675.20*/("""{"""),format.raw/*675.21*/("""
	"""),format.raw/*676.2*/("""if(role == 'Financial Planner' || role=='Professional'  && feeTo=='Company')"""),format.raw/*676.78*/("""{"""),format.raw/*676.79*/("""

		"""),format.raw/*678.3*/("""document.getElementById("formattedaddress1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("geocomplete").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*684.2*/("""}"""),format.raw/*684.3*/("""
	"""),format.raw/*685.2*/("""}"""),format.raw/*685.3*/("""else"""),format.raw/*685.7*/("""{"""),format.raw/*685.8*/("""
    	"""),format.raw/*686.6*/("""document.getElementById("formattedaddress1").innerHTML="";

	"""),format.raw/*688.2*/("""}"""),format.raw/*688.3*/("""
	

	
	"""),format.raw/*692.2*/("""var broker=document.forms["myForm"]["broker"].value;

if(!broker&& role== 'Realtor')"""),format.raw/*694.31*/("""{"""),format.raw/*694.32*/("""
		
		"""),format.raw/*696.3*/("""document.getElementById("broker1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		
		document.getElementById("broker").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*703.2*/("""}"""),format.raw/*703.3*/("""else if(broker.trim().length<2)"""),format.raw/*703.34*/("""{"""),format.raw/*703.35*/("""
		
		"""),format.raw/*705.3*/("""document.getElementById("broker1").innerHTML="<p style=\"color:red\">Brokerage Name should be more than one letter</p>";
		
		document.getElementById("broker").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*712.2*/("""}"""),format.raw/*712.3*/(""" 
	
	
	"""),format.raw/*715.2*/("""else"""),format.raw/*715.6*/("""{"""),format.raw/*715.7*/("""
"""),format.raw/*716.1*/("""if(!broker.match(/^[a-zA-Z ]*$/))"""),format.raw/*716.34*/("""{"""),format.raw/*716.35*/("""
	"""),format.raw/*717.2*/("""document.getElementById("broker1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
	document.getElementById("broker").focus();
	document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


	value = false;

"""),format.raw/*724.1*/("""}"""),format.raw/*724.2*/("""else"""),format.raw/*724.6*/("""{"""),format.raw/*724.7*/("""
	"""),format.raw/*725.2*/("""document.getElementById("broker1").innerHTML = "";

"""),format.raw/*727.1*/("""}"""),format.raw/*727.2*/("""
	"""),format.raw/*728.2*/("""}"""),format.raw/*728.3*/("""




"""),format.raw/*733.1*/("""var address1=document.forms["myForm"]["companyAddress1"].value;
if(!address1&& role== 'Realtor')"""),format.raw/*734.33*/("""{"""),format.raw/*734.34*/("""
	
	"""),format.raw/*736.2*/("""document.getElementById("address1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("geocomplete1").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*742.1*/("""}"""),format.raw/*742.2*/("""else"""),format.raw/*742.6*/("""{"""),format.raw/*742.7*/("""
	"""),format.raw/*743.2*/("""document.getElementById("address1").innerHTML="";

"""),format.raw/*745.1*/("""}"""),format.raw/*745.2*/("""

"""),format.raw/*747.1*/("""var brokerPhone=document.forms["myForm"]["brokerPhone"].value;



if(!brokerPhone&& role== 'Realtor')"""),format.raw/*751.36*/("""{"""),format.raw/*751.37*/("""
	
	"""),format.raw/*753.2*/("""document.getElementById("brokerPhone1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerPhone").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*759.1*/("""}"""),format.raw/*759.2*/("""else"""),format.raw/*759.6*/("""{"""),format.raw/*759.7*/("""
	"""),format.raw/*760.2*/("""document.getElementById("brokerPhone1").innerHTML="";

"""),format.raw/*762.1*/("""}"""),format.raw/*762.2*/("""

"""),format.raw/*764.1*/("""var brokerMange=document.forms["myForm"]["brokerMange"].value;


if(!brokerMange&& role== 'Realtor')"""),format.raw/*767.36*/("""{"""),format.raw/*767.37*/("""
	
	"""),format.raw/*769.2*/("""document.getElementById("brokerMange1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerMange").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*775.1*/("""}"""),format.raw/*775.2*/("""else if(brokerMange.trim().length<2)"""),format.raw/*775.38*/("""{"""),format.raw/*775.39*/("""
	"""),format.raw/*776.2*/("""document.getElementById("brokerMange1").innerHTML="<p style=\"color:red\">Broker Name Should be more than one letter </p>";
	document.getElementById("brokerMange").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

"""),format.raw/*781.1*/("""}"""),format.raw/*781.2*/("""

"""),format.raw/*783.1*/("""else"""),format.raw/*783.5*/("""{"""),format.raw/*783.6*/("""
	"""),format.raw/*784.2*/("""if(!brokerMange.match(/^[a-zA-Z ]*$/))"""),format.raw/*784.40*/("""{"""),format.raw/*784.41*/("""
		"""),format.raw/*785.3*/("""document.getElementById("brokerMange1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("brokerMange").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*792.2*/("""}"""),format.raw/*792.3*/("""else"""),format.raw/*792.7*/("""{"""),format.raw/*792.8*/("""
		"""),format.raw/*793.3*/("""document.getElementById("brokerMange1").innerHTML = "";

	"""),format.raw/*795.2*/("""}"""),format.raw/*795.3*/("""
"""),format.raw/*796.1*/("""}"""),format.raw/*796.2*/("""



"""),format.raw/*800.1*/("""var refer=document.forms["myForm"]["refer"].value;

if(!refer&& role== 'Realtor')"""),format.raw/*802.30*/("""{"""),format.raw/*802.31*/("""
	
	"""),format.raw/*804.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*810.1*/("""}"""),format.raw/*810.2*/("""else if(refer.trim().length<2)"""),format.raw/*810.32*/("""{"""),format.raw/*810.33*/("""
	
	"""),format.raw/*812.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">Referrar Name Should be more than one letter </p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*818.1*/("""}"""),format.raw/*818.2*/("""


"""),format.raw/*821.1*/("""else"""),format.raw/*821.5*/("""{"""),format.raw/*821.6*/("""
	"""),format.raw/*822.2*/("""if(!refer.match(/^[a-zA-Z ]*$/))"""),format.raw/*822.34*/("""{"""),format.raw/*822.35*/("""
		"""),format.raw/*823.3*/("""document.getElementById("refer1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("refer").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*830.2*/("""}"""),format.raw/*830.3*/("""else"""),format.raw/*830.7*/("""{"""),format.raw/*830.8*/("""
		"""),format.raw/*831.3*/("""document.getElementById("refer1").innerHTML = "";

	"""),format.raw/*833.2*/("""}"""),format.raw/*833.3*/("""

"""),format.raw/*835.1*/("""}"""),format.raw/*835.2*/("""


"""),format.raw/*838.1*/("""if(value)"""),format.raw/*838.10*/("""{"""),format.raw/*838.11*/("""
	 """),format.raw/*839.3*/("""$('#loading').show();
"""),format.raw/*840.1*/("""}"""),format.raw/*840.2*/("""
"""),format.raw/*841.1*/("""return value;
	 """),format.raw/*842.3*/("""}"""),format.raw/*842.4*/("""catch(err)"""),format.raw/*842.14*/("""{"""),format.raw/*842.15*/("""
		
	 """),format.raw/*844.3*/("""}"""),format.raw/*844.4*/("""
    
 """),format.raw/*846.2*/("""}"""),format.raw/*846.3*/("""
    
    """),format.raw/*848.5*/("""</script>


	<script src=""""),_display_(/*851.16*/routes/*851.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*851.72*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:16 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/realtor.scala.html
                  HASH: f30a9b929044eddf7857fb602e7ec5bbf611745f
                  MATRIX: 725->1|830->18|857->19|1206->342|1220->348|1276->384|1422->503|1437->509|1497->548|1553->578|1568->584|1638->633|1793->761|1808->767|1873->811|1930->841|1945->847|2012->893|2110->964|2138->965|2170->970|2325->1098|2353->1099|2385->1104|2413->1105|2445->1110|2516->1154|2544->1155|2572->1156|2641->1197|2670->1198|2703->1204|2793->1267|2821->1268|2858->1278|2926->1318|2955->1319|2991->1328|3049->1358|3078->1359|3117->1370|3246->1472|3275->1473|3342->1512|3371->1513|3410->1524|3483->1570|3512->1571|3548->1580|3576->1581|3659->1636|3688->1637|3724->1646|3783->1677|3812->1678|3851->1689|3980->1791|4009->1792|4076->1831|4105->1832|4144->1843|4218->1890|4247->1891|4283->1900|4311->1901|4447->2009|4476->2010|4509->2016|4855->2335|4883->2336|5003->2428|5032->2429|5068->2438|5211->2553|5240->2554|5278->2564|6063->3321|6092->3322|6126->3328|6155->3329|6184->3330|6416->3534|6432->3540|6496->3582|6540->3598|6556->3604|6619->3645|6707->3705|6723->3711|6784->3750|6861->3799|6877->3805|6933->3839|7010->3888|7026->3894|7085->3931|7157->3974|7187->3975|7217->3977|7349->4081|7365->4087|7423->4123|7490->4162|7519->4163|7548->4164|7590->4177|7620->4178|7651->4181|7829->4331|7858->4332|7889->4335|7925->4343|7955->4344|7986->4347|8219->4552|8248->4553|8278->4555|8425->4674|8441->4680|8504->4721|8654->4843|8670->4849|8733->4889|12639->8767|12669->8768|12699->8769|12735->8776|12765->8777|12795->8778|13618->9572|13648->9573|13678->9574|13721->9588|13751->9589|13781->9590|14724->10504|14754->10505|14784->10506|14828->10521|14858->10522|14888->10523|16548->12154|16578->12155|16615->12164|16730->12251|16759->12252|16853->12317|16883->12318|16920->12327|17035->12414|17064->12415|17149->12471|17179->12472|17212->12477|17283->12520|17312->12521|17531->12711|17561->12712|17598->12721|17657->12751|17687->12752|17727->12763|17857->12865|17887->12866|17955->12905|17985->12906|18025->12917|18099->12963|18129->12964|18166->12973|18195->12974|18270->13020|18300->13021|18337->13030|18397->13061|18427->13062|18467->13073|18597->13175|18627->13176|18695->13215|18725->13216|18765->13227|18840->13274|18870->13275|18907->13284|18936->13285|19130->13450|19160->13451|19197->13460|19258->13492|19288->13493|19330->13506|19455->13602|19485->13603|19531->13620|19604->13664|19634->13665|19672->13675|19702->13676|19735->13681|19764->13682|19869->13758|19899->13759|19933->13765|19964->13768|19993->13769|20024->13772|20131->13850|20161->13851|20193->13855|20525->14159|20554->14160|20586->14164|20615->14165|20650->14172|20728->14222|20757->14223|20790->14228|20886->14295|20916->14296|20948->14300|21282->14606|21311->14607|21370->14637|21400->14638|21440->14650|21801->14983|21830->14984|21859->14985|21891->14989|21921->14990|21953->14994|22014->15026|22044->15027|22077->15032|22430->15357|22459->15358|22491->15362|22521->15363|22554->15368|22636->15422|22665->15423|22697->15427|22726->15428|22767->15441|22863->15508|22893->15509|22929->15517|23261->15821|23290->15822|23349->15852|23379->15853|23419->15865|23780->16198|23809->16199|23841->16203|23873->16207|23902->16208|23940->16218|24001->16250|24031->16251|24065->16257|24422->16586|24451->16587|24484->16591|24514->16592|24548->16598|24631->16653|24660->16654|24693->16659|24722->16660|24766->16676|24862->16743|24892->16744|24928->16752|25258->17054|25287->17055|25319->17059|25348->17060|25383->17067|25462->17118|25491->17119|25530->17130|25767->17339|25797->17340|25844->17359|25873->17360|25906->17364|25936->17365|25970->17371|26310->17683|26339->17684|26377->17694|26426->17714|26456->17715|26503->17734|26532->17735|26565->17739|26595->17740|26629->17746|26969->18058|26998->18059|27031->18064|27074->18078|27104->18079|27133->18080|27465->18384|27494->18385|27527->18389|27557->18390|27591->18396|27671->18448|27700->18449|27735->18456|27829->18521|27859->18522|27890->18525|28228->18835|28257->18836|28288->18839|28320->18843|28349->18844|28383->18850|28461->18900|28490->18901|28526->18909|28618->18972|28648->18973|28680->18977|28764->19032|28794->19033|28825->19036|29159->19342|29188->19343|29218->19345|29247->19346|29279->19350|29308->19351|29342->19357|29420->19407|29449->19408|29489->19420|29642->19544|29672->19545|29702->19547|29807->19623|29837->19624|29868->19627|30206->19937|30235->19938|30265->19940|30294->19941|30326->19945|30355->19946|30389->19952|30469->20004|30498->20005|30529->20008|30721->20171|30751->20172|30781->20174|30886->20250|30916->20251|30948->20255|31299->20578|31328->20579|31358->20581|31387->20582|31419->20586|31448->20587|31482->20593|31571->20654|31600->20655|31635->20662|31748->20746|31778->20747|31812->20753|32151->21064|32180->21065|32240->21096|32270->21097|32304->21103|32666->21437|32695->21438|32730->21445|32762->21449|32791->21450|32820->21451|32882->21484|32912->21485|32942->21487|33285->21802|33314->21803|33346->21807|33375->21808|33405->21810|33485->21862|33514->21863|33544->21865|33573->21866|33606->21871|33731->21967|33761->21968|33793->21972|34132->22283|34161->22284|34193->22288|34222->22289|34252->22291|34331->22342|34360->22343|34390->22345|34520->22446|34550->22447|34582->22451|34924->22765|34953->22766|34985->22770|35014->22771|35044->22773|35127->22828|35156->22829|35186->22831|35315->22931|35345->22932|35377->22936|35719->23250|35748->23251|35813->23287|35843->23288|35873->23290|36221->23610|36250->23611|36280->23613|36312->23617|36341->23618|36371->23620|36438->23658|36468->23659|36499->23662|36856->23991|36885->23992|36917->23996|36946->23997|36977->24000|37063->24058|37092->24059|37121->24060|37150->24061|37182->24065|37292->24146|37322->24147|37354->24151|37684->24453|37713->24454|37772->24484|37802->24485|37834->24489|38186->24813|38215->24814|38246->24817|38278->24821|38307->24822|38337->24824|38398->24856|38428->24857|38459->24860|38804->25177|38833->25178|38865->25182|38894->25183|38925->25186|39005->25238|39034->25239|39064->25241|39093->25242|39124->25245|39162->25254|39192->25255|39223->25258|39273->25280|39302->25281|39331->25282|39375->25298|39404->25299|39443->25309|39473->25310|39507->25316|39536->25317|39571->25324|39600->25325|39638->25335|39693->25362|39709->25368|39781->25418
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|44->16|44->16|44->16|45->17|45->17|45->17|49->21|49->21|50->22|57->29|57->29|57->29|57->29|58->30|61->33|61->33|62->34|62->34|62->34|63->35|66->38|66->38|68->40|70->42|70->42|71->43|71->43|71->43|72->44|75->47|75->47|77->49|77->49|78->50|79->51|79->51|80->52|80->52|84->56|84->56|85->57|85->57|85->57|86->58|89->61|89->61|91->63|91->63|92->64|93->65|93->65|94->66|94->66|97->69|97->69|98->70|103->75|103->75|108->80|108->80|109->81|112->84|112->84|113->85|128->100|128->100|129->101|129->101|129->101|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|137->109|137->109|137->109|138->110|138->110|138->110|143->115|143->115|144->116|150->122|150->122|150->122|151->123|151->123|151->123|153->125|153->125|154->126|164->136|164->136|166->138|166->138|166->138|167->139|177->149|177->149|179->151|195->167|195->167|195->167|201->173|201->173|201->173|319->291|319->291|319->291|319->291|319->291|319->291|339->311|339->311|339->311|339->311|339->311|339->311|361->333|361->333|361->333|361->333|361->333|361->333|422->394|422->394|423->395|426->398|426->398|430->402|430->402|431->403|434->406|434->406|441->413|441->413|442->414|443->415|443->415|451->423|451->423|452->424|452->424|452->424|453->425|456->428|456->428|458->430|458->430|459->431|460->432|460->432|461->433|461->433|465->437|465->437|466->438|466->438|466->438|467->439|470->442|470->442|472->444|472->444|473->445|474->446|474->446|475->447|475->447|480->452|480->452|481->453|482->454|482->454|483->455|485->457|485->457|486->458|487->459|487->459|488->460|488->460|489->461|489->461|493->465|493->465|495->467|495->467|495->467|496->468|498->470|498->470|499->471|505->477|505->477|505->477|505->477|506->478|508->480|508->480|510->482|513->485|513->485|514->486|520->492|520->492|520->492|520->492|523->495|531->503|531->503|531->503|531->503|531->503|532->504|532->504|532->504|533->505|540->512|540->512|540->512|540->512|541->513|543->515|543->515|545->517|545->517|549->521|551->523|551->523|553->525|558->530|558->530|558->530|558->530|561->533|569->541|569->541|570->542|570->542|570->542|572->544|572->544|572->544|573->545|580->552|580->552|580->552|580->552|581->553|583->555|583->555|585->557|585->557|590->562|592->564|592->564|594->566|600->572|600->572|600->572|600->572|601->573|603->575|603->575|606->578|610->582|610->582|612->584|612->584|612->584|612->584|613->585|619->591|619->591|621->593|621->593|621->593|623->595|623->595|623->595|623->595|624->596|630->602|630->602|631->603|631->603|631->603|632->604|638->610|638->610|638->610|638->610|639->611|641->613|641->613|643->615|645->617|645->617|646->618|652->624|652->624|653->625|653->625|653->625|654->626|656->628|656->628|658->630|660->632|660->632|662->634|662->634|662->634|663->635|669->641|669->641|670->642|670->642|670->642|670->642|671->643|673->645|673->645|679->651|684->656|684->656|685->657|685->657|685->657|686->658|692->664|692->664|693->665|693->665|693->665|693->665|694->666|696->668|696->668|699->671|703->675|703->675|704->676|704->676|704->676|706->678|712->684|712->684|713->685|713->685|713->685|713->685|714->686|716->688|716->688|720->692|722->694|722->694|724->696|731->703|731->703|731->703|731->703|733->705|740->712|740->712|743->715|743->715|743->715|744->716|744->716|744->716|745->717|752->724|752->724|752->724|752->724|753->725|755->727|755->727|756->728|756->728|761->733|762->734|762->734|764->736|770->742|770->742|770->742|770->742|771->743|773->745|773->745|775->747|779->751|779->751|781->753|787->759|787->759|787->759|787->759|788->760|790->762|790->762|792->764|795->767|795->767|797->769|803->775|803->775|803->775|803->775|804->776|809->781|809->781|811->783|811->783|811->783|812->784|812->784|812->784|813->785|820->792|820->792|820->792|820->792|821->793|823->795|823->795|824->796|824->796|828->800|830->802|830->802|832->804|838->810|838->810|838->810|838->810|840->812|846->818|846->818|849->821|849->821|849->821|850->822|850->822|850->822|851->823|858->830|858->830|858->830|858->830|859->831|861->833|861->833|863->835|863->835|866->838|866->838|866->838|867->839|868->840|868->840|869->841|870->842|870->842|870->842|870->842|872->844|872->844|874->846|874->846|876->848|879->851|879->851|879->851
                  -- GENERATED --
              */
          