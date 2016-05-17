
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
object client extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
     
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/(""".btn """),format.raw/*28.7*/("""{"""),format.raw/*28.8*/("""
    """),format.raw/*29.5*/("""border: 0 none;
    font-weight: bold;
    
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""
"""),format.raw/*33.1*/(""".btn-primary:active, .btn-primary.active """),format.raw/*33.42*/("""{"""),format.raw/*33.43*/("""
     """),format.raw/*34.6*/("""background: #003f80;
    color: #ffffff;
    box-shadow: none;
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""
    
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
 <link type="text/css" rel="stylesheet" href=""""),_display_(/*107.48*/routes/*107.54*/.Assets.at("_resources/background.css")),format.raw/*107.93*/("""">
 <link type="text/css" rel="stylesheet" href=""""),_display_(/*108.48*/routes/*108.54*/.Assets.at("_resources/forms.css")),format.raw/*108.88*/("""">
 <link type="text/css" rel="stylesheet" href=""""),_display_(/*109.48*/routes/*109.54*/.Assets.at("_resources/template.css")),format.raw/*109.91*/("""">
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
<body background=""""),_display_(/*160.20*/routes/*160.26*/.Assets.at("/_resources/bgnew.jpg")),format.raw/*160.61*/("""">


  <div id="loading" style="display: none" align="center" >
 
  
     <img src=""""),_display_(/*166.17*/routes/*166.23*/.Assets.at("/images/preloader-image.gif")),format.raw/*166.64*/("""" alt="" />
  
  </div>  


 <div align="center">
                		<img alt="Visdom Logo" height="90" width="260"  src=""""),_display_(/*172.73*/routes/*172.79*/.Assets.at("_resources/visdom-logo.png")),format.raw/*172.119*/("""" />
              
              
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

			
			<div ng-controller="DemoController" ng-init="newItemType='Client'">
					 <input type="hidden" name="ip" value="" id="ip">	
					
				
												<div id="role1"></div>
			
						
					
					<input type="hidden" id="role" name="role" ng-model="newItemType" value="Client" ng-required>

						

					
						

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
									style="color: red; font-size: 4">*</span> </label> <input type="tel"
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
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*294.61*/("""{"""),format.raw/*294.62*/("""{"""),format.raw/*294.63*/("""company"""),format.raw/*294.70*/("""}"""),format.raw/*294.71*/("""}"""),format.raw/*294.72*/(""""> <br>
								<br>


								<div class="map_canvas"></div>

								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong> Company Name  </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
									id="company"	name="company" class="form-control" >
									<div id="company1"></div>

								</div>

								<div class="form-group" style="width: 330px">
									<label for="pwd"><Strong> Company Address </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input
										id="geocomplete" type="text" name="formatted_address"
										class="form-control" ng-model="companyAddress"
										placeholder="Enter Location" ng-required> <input
										type="hidden" name="companyAddress" value=""""),format.raw/*314.54*/("""{"""),format.raw/*314.55*/("""{"""),format.raw/*314.56*/("""companyAddress"""),format.raw/*314.70*/("""}"""),format.raw/*314.71*/("""}"""),format.raw/*314.72*/("""">
									<div id="formattedaddress1"></div>


								</div>
							</div>
							<div ng-show="newItemType == 'Realtor'">

								<div class="form-group" style="width: 70%">
									<label for="pwd"><Strong> What is the name of
											the Brokerage you are licensed under  </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
									id="broker"	name="broker" class="form-control" ng-required>
									<div id="broker1"></div>

								</div>
								<div class="map_canvas"></div>
								<div class="form-group" style="width: 330px; height: 30%">
									<label for="pwd"><Strong> What is the address
											of the Brokerage </Strong> <span style="color: red; font-size: 4">*</span>
									</label> <input id="geocomplete1" type="text"
										ng-model="companyAddress1" name="formatted_address"
										class="form-control" placeholder="Enter Location" ng-required>
									<input type="hidden" name="companyAddress1"
										value=""""),format.raw/*338.18*/("""{"""),format.raw/*338.19*/("""{"""),format.raw/*338.20*/("""companyAddress1"""),format.raw/*338.35*/("""}"""),format.raw/*338.36*/("""}"""),format.raw/*338.37*/("""">

									<div id="address1"></div>

								</div>
								<div class="form-group" style="width: 60%">
									<label for="pwd"><Strong> What is the phone
											number of the Brokerage  </Strong> <span
										style="color: red; font-size: 4">*</span> </label> <input type="tel"
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
								<label for="pwd"><Strong>From whom or how did you find out about Visdom Mortgage Solutions?  </Strong> <span style="color: red; font-size: 4">*</span>
								</label></div>
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

		if(!fname)"""),format.raw/*492.13*/("""{"""),format.raw/*492.14*/("""
			"""),format.raw/*493.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
		"""),format.raw/*499.3*/("""}"""),format.raw/*499.4*/("""else if(fname.trim().length<2)"""),format.raw/*499.34*/("""{"""),format.raw/*499.35*/("""
			
			
			"""),format.raw/*502.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*510.3*/("""}"""),format.raw/*510.4*/(""" """),format.raw/*510.5*/("""else"""),format.raw/*510.9*/("""{"""),format.raw/*510.10*/("""
			"""),format.raw/*511.4*/("""if(!fname.match(/^[a-zA-Z ]*$/))"""),format.raw/*511.36*/("""{"""),format.raw/*511.37*/("""
				"""),format.raw/*512.5*/("""document.getElementById("fname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
				document.getElementById("fname").focus();
				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


				value = false;

			"""),format.raw/*519.4*/("""}"""),format.raw/*519.5*/("""else"""),format.raw/*519.9*/("""{"""),format.raw/*519.10*/("""
				"""),format.raw/*520.5*/("""document.getElementById("fname1").innerHTML = "";

			"""),format.raw/*522.4*/("""}"""),format.raw/*522.5*/("""

		"""),format.raw/*524.3*/("""}"""),format.raw/*524.4*/(""" 
		
		
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
		
		
	 
		"""),format.raw/*567.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*569.13*/("""{"""),format.raw/*569.14*/("""
			
			"""),format.raw/*571.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
		"""),format.raw/*577.3*/("""}"""),format.raw/*577.4*/("""else"""),format.raw/*577.8*/("""{"""),format.raw/*577.9*/("""
	    	"""),format.raw/*578.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*580.3*/("""}"""),format.raw/*580.4*/("""
	 
	 
    """),format.raw/*583.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*587.24*/("""{"""),format.raw/*587.25*/("""         
		  
    """),format.raw/*589.5*/("""}"""),format.raw/*589.6*/("""else"""),format.raw/*589.10*/("""{"""),format.raw/*589.11*/("""   
		"""),format.raw/*590.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*596.5*/("""}"""),format.raw/*596.6*/("""
    
    """),format.raw/*598.5*/("""if(pattern.test(x2))"""),format.raw/*598.25*/("""{"""),format.raw/*598.26*/("""         
		  
    """),format.raw/*600.5*/("""}"""),format.raw/*600.6*/("""else"""),format.raw/*600.10*/("""{"""),format.raw/*600.11*/("""   
		"""),format.raw/*601.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email2").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=false;
    """),format.raw/*607.5*/("""}"""),format.raw/*607.6*/("""
    """),format.raw/*608.5*/("""if (x  != x2) """),format.raw/*608.19*/("""{"""),format.raw/*608.20*/("""
"""),format.raw/*609.1*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
document.getElementById("email").focus();

document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

value= false;
    """),format.raw/*615.5*/("""}"""),format.raw/*615.6*/("""else"""),format.raw/*615.10*/("""{"""),format.raw/*615.11*/("""
    	"""),format.raw/*616.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*618.5*/("""}"""),format.raw/*618.6*/("""
    
	"""),format.raw/*620.2*/("""var phone=document.forms["myForm"]["phone"].value;
	 
	if(!phone)"""),format.raw/*622.12*/("""{"""),format.raw/*622.13*/("""
		"""),format.raw/*623.3*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
		document.getElementById("phonedatata").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=false;
	"""),format.raw/*629.2*/("""}"""),format.raw/*629.3*/("""	
	"""),format.raw/*630.2*/("""else"""),format.raw/*630.6*/("""{"""),format.raw/*630.7*/("""
    	"""),format.raw/*631.6*/("""document.getElementById("phone1").innerHTML="";

	"""),format.raw/*633.2*/("""}"""),format.raw/*633.3*/(""" 
    
	"""),format.raw/*635.2*/("""var feeTo=document.forms["myForm"]["feeTo"].value;

	if(!feeTo)"""),format.raw/*637.12*/("""{"""),format.raw/*637.13*/("""

		"""),format.raw/*639.3*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*639.58*/("""{"""),format.raw/*639.59*/("""
		"""),format.raw/*640.3*/("""document.getElementById("feeTo1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("feeTo").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=false;
	"""),format.raw/*646.2*/("""}"""),format.raw/*646.3*/("""
	"""),format.raw/*647.2*/("""}"""),format.raw/*647.3*/("""else"""),format.raw/*647.7*/("""{"""),format.raw/*647.8*/("""
    	"""),format.raw/*648.6*/("""document.getElementById("feeTo1").innerHTML="";

	"""),format.raw/*650.2*/("""}"""),format.raw/*650.3*/("""
	
	
	
	
	
	"""),format.raw/*656.2*/("""//var role=document.forms["myForm"]["role"].value;
	var company=document.forms["myForm"]["company"].value;

	
	
if(!company)"""),format.raw/*661.13*/("""{"""),format.raw/*661.14*/("""
	"""),format.raw/*662.2*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*662.57*/("""{"""),format.raw/*662.58*/("""
		"""),format.raw/*663.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*669.2*/("""}"""),format.raw/*669.3*/("""
	"""),format.raw/*670.2*/("""}"""),format.raw/*670.3*/("""else"""),format.raw/*670.7*/("""{"""),format.raw/*670.8*/("""
    	"""),format.raw/*671.6*/("""document.getElementById("company1").innerHTML="";

	"""),format.raw/*673.2*/("""}"""),format.raw/*673.3*/("""


"""),format.raw/*676.1*/("""//var formattedaddress=document.forms["myForm"]["companyAddress"].value;
var companyAddress=document.forms["myForm"]["companyAddress"].value;


if(!companyAddress)"""),format.raw/*680.20*/("""{"""),format.raw/*680.21*/("""
	"""),format.raw/*681.2*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*681.57*/("""{"""),format.raw/*681.58*/("""

		"""),format.raw/*683.3*/("""document.getElementById("formattedaddress1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("geocomplete").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*689.2*/("""}"""),format.raw/*689.3*/("""
	"""),format.raw/*690.2*/("""}"""),format.raw/*690.3*/("""else"""),format.raw/*690.7*/("""{"""),format.raw/*690.8*/("""
    	"""),format.raw/*691.6*/("""document.getElementById("formattedaddress1").innerHTML="";

	"""),format.raw/*693.2*/("""}"""),format.raw/*693.3*/("""
	

	
	"""),format.raw/*697.2*/("""var broker=document.forms["myForm"]["broker"].value;

if(!broker&& role== 'Realtor')"""),format.raw/*699.31*/("""{"""),format.raw/*699.32*/("""
		
		"""),format.raw/*701.3*/("""document.getElementById("broker1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		
		document.getElementById("broker").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=false;
	"""),format.raw/*708.2*/("""}"""),format.raw/*708.3*/("""else"""),format.raw/*708.7*/("""{"""),format.raw/*708.8*/("""
    	"""),format.raw/*709.6*/("""document.getElementById("broker1").innerHTML="";

	"""),format.raw/*711.2*/("""}"""),format.raw/*711.3*/("""									
"""),format.raw/*712.1*/("""var address1=document.forms["myForm"]["companyAddress1"].value;
if(!address1&& role== 'Realtor')"""),format.raw/*713.33*/("""{"""),format.raw/*713.34*/("""
	
	"""),format.raw/*715.2*/("""document.getElementById("address1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("geocomplete1").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*721.1*/("""}"""),format.raw/*721.2*/("""else"""),format.raw/*721.6*/("""{"""),format.raw/*721.7*/("""
	"""),format.raw/*722.2*/("""document.getElementById("address1").innerHTML="";

"""),format.raw/*724.1*/("""}"""),format.raw/*724.2*/("""

"""),format.raw/*726.1*/("""var brokerPhone=document.forms["myForm"]["brokerPhone"].value;



if(!brokerPhone&& role== 'Realtor')"""),format.raw/*730.36*/("""{"""),format.raw/*730.37*/("""
	
	"""),format.raw/*732.2*/("""document.getElementById("brokerPhone1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerPhone").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*738.1*/("""}"""),format.raw/*738.2*/("""else"""),format.raw/*738.6*/("""{"""),format.raw/*738.7*/("""
	"""),format.raw/*739.2*/("""document.getElementById("brokerPhone1").innerHTML="";

"""),format.raw/*741.1*/("""}"""),format.raw/*741.2*/("""

"""),format.raw/*743.1*/("""var brokerMange=document.forms["myForm"]["brokerMange"].value;


if(!brokerMange && role== 'Realtor')"""),format.raw/*746.37*/("""{"""),format.raw/*746.38*/("""
	
	"""),format.raw/*748.2*/("""document.getElementById("brokerMange1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerMange").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*754.1*/("""}"""),format.raw/*754.2*/("""else"""),format.raw/*754.6*/("""{"""),format.raw/*754.7*/("""
	"""),format.raw/*755.2*/("""document.getElementById("brokerMange1").innerHTML="";

"""),format.raw/*757.1*/("""}"""),format.raw/*757.2*/("""


"""),format.raw/*760.1*/("""var refer=document.forms["myForm"]["refer"].value;

if(!refer&& role== 'Realtor' )"""),format.raw/*762.31*/("""{"""),format.raw/*762.32*/("""
	
	"""),format.raw/*764.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*770.1*/("""}"""),format.raw/*770.2*/("""else if(refer.trim().length<2)"""),format.raw/*770.32*/("""{"""),format.raw/*770.33*/("""
	
	"""),format.raw/*772.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">Referrar Name Should be more than one letter </p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*778.1*/("""}"""),format.raw/*778.2*/("""


"""),format.raw/*781.1*/("""else"""),format.raw/*781.5*/("""{"""),format.raw/*781.6*/("""
	"""),format.raw/*782.2*/("""if(!refer.match(/^[a-zA-Z ]*$/))"""),format.raw/*782.34*/("""{"""),format.raw/*782.35*/("""
		"""),format.raw/*783.3*/("""document.getElementById("refer1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("refer").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*790.2*/("""}"""),format.raw/*790.3*/("""else"""),format.raw/*790.7*/("""{"""),format.raw/*790.8*/("""
		"""),format.raw/*791.3*/("""document.getElementById("refer1").innerHTML = "";

	"""),format.raw/*793.2*/("""}"""),format.raw/*793.3*/("""

"""),format.raw/*795.1*/("""}"""),format.raw/*795.2*/("""

"""),format.raw/*797.1*/("""if(value)"""),format.raw/*797.10*/("""{"""),format.raw/*797.11*/("""
	 """),format.raw/*798.3*/("""$('#loading').show();
"""),format.raw/*799.1*/("""}"""),format.raw/*799.2*/("""
"""),format.raw/*800.1*/("""return value;
	 """),format.raw/*801.3*/("""}"""),format.raw/*801.4*/("""catch(err)"""),format.raw/*801.14*/("""{"""),format.raw/*801.15*/("""
		
	 """),format.raw/*803.3*/("""}"""),format.raw/*803.4*/("""
    
 """),format.raw/*805.2*/("""}"""),format.raw/*805.3*/("""
    
    """),format.raw/*807.5*/("""</script>


	<script src=""""),_display_(/*810.16*/routes/*810.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*810.72*/("""" type="text/javascript"></script>
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
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/client.scala.html
                  HASH: 86eed25b7286dcf99257f6f415531efae0980e6c
                  MATRIX: 724->1|829->18|856->19|1205->342|1219->348|1275->384|1421->503|1436->509|1496->548|1552->578|1567->584|1637->633|1792->761|1807->767|1872->811|1929->841|1944->847|2011->893|2109->964|2137->965|2169->970|2321->1095|2349->1096|2381->1101|2409->1102|2441->1107|2512->1151|2540->1152|2568->1153|2637->1194|2666->1195|2699->1201|2789->1264|2817->1265|2854->1275|2922->1315|2951->1316|2987->1325|3045->1355|3074->1356|3113->1367|3242->1469|3271->1470|3338->1509|3367->1510|3406->1521|3479->1567|3508->1568|3544->1577|3572->1578|3655->1633|3684->1634|3720->1643|3779->1674|3808->1675|3847->1686|3976->1788|4005->1789|4072->1828|4101->1829|4140->1840|4214->1887|4243->1888|4279->1897|4307->1898|4443->2006|4472->2007|4505->2013|4851->2332|4879->2333|4999->2425|5028->2426|5064->2435|5207->2550|5236->2551|5274->2561|6058->3318|6086->3319|6120->3325|6149->3326|6178->3327|6410->3531|6426->3537|6490->3579|6534->3595|6550->3601|6613->3642|6702->3703|6718->3709|6779->3748|6857->3798|6873->3804|6929->3838|7007->3888|7023->3894|7082->3931|7155->3975|7185->3976|7215->3978|7347->4082|7363->4088|7421->4124|7488->4163|7517->4164|7546->4165|7588->4178|7618->4179|7649->4182|7827->4332|7856->4333|7887->4336|7923->4344|7953->4345|7984->4348|8217->4553|8246->4554|8276->4556|8353->4605|8369->4611|8426->4646|8539->4731|8555->4737|8618->4778|8768->4900|8784->4906|8847->4946|12762->8833|12792->8834|12822->8835|12858->8842|12888->8843|12918->8844|13741->9638|13771->9639|13801->9640|13844->9654|13874->9655|13904->9656|14937->10660|14967->10661|14997->10662|15041->10677|15071->10678|15101->10679|16861->12410|16891->12411|16928->12420|17043->12507|17072->12508|17166->12573|17196->12574|17233->12583|17348->12670|17377->12671|17462->12727|17492->12728|17525->12733|17596->12776|17625->12777|17844->12967|17874->12968|17911->12977|17970->13007|18000->13008|18040->13019|18170->13121|18200->13122|18268->13161|18298->13162|18338->13173|18412->13219|18442->13220|18479->13229|18508->13230|18583->13276|18613->13277|18650->13286|18710->13317|18740->13318|18780->13329|18910->13431|18940->13432|19008->13471|19038->13472|19078->13483|19153->13530|19183->13531|19220->13540|19249->13541|19443->13706|19473->13707|19510->13716|19571->13748|19601->13749|19643->13762|19768->13858|19798->13859|19844->13876|19917->13920|19947->13921|19985->13931|20015->13932|20048->13937|20077->13938|20182->14014|20212->14015|20246->14021|20277->14024|20306->14025|20337->14028|20444->14106|20474->14107|20506->14111|20838->14415|20867->14416|20899->14420|20928->14421|20963->14428|21041->14478|21070->14479|21103->14484|21196->14548|21226->14549|21258->14553|21591->14858|21620->14859|21679->14889|21709->14890|21749->14902|22109->15234|22138->15235|22167->15236|22199->15240|22229->15241|22261->15245|22322->15277|22352->15278|22385->15283|22738->15608|22767->15609|22799->15613|22829->15614|22862->15619|22944->15673|22973->15674|23005->15678|23034->15679|23072->15689|23168->15756|23198->15757|23234->15765|23566->16069|23595->16070|23654->16100|23684->16101|23724->16113|24085->16446|24114->16447|24146->16451|24178->16455|24207->16456|24245->16466|24306->16498|24336->16499|24370->16505|24727->16834|24756->16835|24789->16839|24819->16840|24853->16846|24936->16901|24965->16902|24998->16907|25027->16908|25068->16921|25164->16988|25194->16989|25230->16997|25559->17298|25588->17299|25620->17303|25649->17304|25684->17311|25763->17362|25792->17363|25831->17374|26068->17583|26098->17584|26145->17603|26174->17604|26207->17608|26237->17609|26271->17615|26611->17927|26640->17928|26678->17938|26727->17958|26757->17959|26804->17978|26833->17979|26866->17983|26896->17984|26930->17990|27269->18301|27298->18302|27331->18307|27374->18321|27404->18322|27433->18323|27760->18622|27789->18623|27822->18627|27852->18628|27886->18634|27966->18686|27995->18687|28030->18694|28124->18759|28154->18760|28185->18763|28522->19072|28551->19073|28582->19076|28614->19080|28643->19081|28677->19087|28755->19137|28784->19138|28820->19146|28912->19209|28942->19210|28974->19214|29058->19269|29088->19270|29119->19273|29452->19578|29481->19579|29511->19581|29540->19582|29572->19586|29601->19587|29635->19593|29713->19643|29742->19644|29782->19656|29935->19780|29965->19781|29995->19783|30079->19838|30109->19839|30140->19842|30478->20152|30507->20153|30537->20155|30566->20156|30598->20160|30627->20161|30661->20167|30741->20219|30770->20220|30801->20223|30993->20386|31023->20387|31053->20389|31137->20444|31167->20445|31199->20449|31550->20772|31579->20773|31609->20775|31638->20776|31670->20780|31699->20781|31733->20787|31822->20848|31851->20849|31886->20856|31999->20940|32029->20941|32063->20947|32401->21257|32430->21258|32462->21262|32491->21263|32525->21269|32604->21320|32633->21321|32671->21331|32796->21427|32826->21428|32858->21432|33196->21742|33225->21743|33257->21747|33286->21748|33316->21750|33395->21801|33424->21802|33454->21804|33584->21905|33614->21906|33646->21910|33987->22223|34016->22224|34048->22228|34077->22229|34107->22231|34190->22286|34219->22287|34249->22289|34379->22390|34409->22391|34441->22395|34782->22708|34811->22709|34843->22713|34872->22714|34902->22716|34985->22771|35014->22772|35045->22775|35156->22857|35186->22858|35218->22862|35547->23163|35576->23164|35635->23194|35665->23195|35697->23199|36049->23523|36078->23524|36109->23527|36141->23531|36170->23532|36200->23534|36261->23566|36291->23567|36322->23570|36667->23887|36696->23888|36728->23892|36757->23893|36788->23896|36868->23948|36897->23949|36927->23951|36956->23952|36986->23954|37024->23963|37054->23964|37085->23967|37135->23989|37164->23990|37193->23991|37237->24007|37266->24008|37305->24018|37335->24019|37369->24025|37398->24026|37433->24033|37462->24034|37500->24044|37555->24071|37571->24077|37643->24127
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|44->16|44->16|44->16|45->17|45->17|45->17|49->21|49->21|50->22|56->28|56->28|56->28|56->28|57->29|60->32|60->32|61->33|61->33|61->33|62->34|65->37|65->37|67->39|69->41|69->41|70->42|70->42|70->42|71->43|74->46|74->46|76->48|76->48|77->49|78->50|78->50|79->51|79->51|83->55|83->55|84->56|84->56|84->56|85->57|88->60|88->60|90->62|90->62|91->63|92->64|92->64|93->65|93->65|96->68|96->68|97->69|102->74|102->74|107->79|107->79|108->80|111->83|111->83|112->84|127->99|127->99|128->100|128->100|128->100|133->105|133->105|133->105|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|137->109|137->109|137->109|142->114|142->114|143->115|149->121|149->121|149->121|150->122|150->122|150->122|152->124|152->124|153->125|163->135|163->135|165->137|165->137|165->137|166->138|176->148|176->148|178->150|188->160|188->160|188->160|194->166|194->166|194->166|200->172|200->172|200->172|322->294|322->294|322->294|322->294|322->294|322->294|342->314|342->314|342->314|342->314|342->314|342->314|366->338|366->338|366->338|366->338|366->338|366->338|430->402|430->402|431->403|434->406|434->406|438->410|438->410|439->411|442->414|442->414|449->421|449->421|450->422|451->423|451->423|459->431|459->431|460->432|460->432|460->432|461->433|464->436|464->436|466->438|466->438|467->439|468->440|468->440|469->441|469->441|473->445|473->445|474->446|474->446|474->446|475->447|478->450|478->450|480->452|480->452|481->453|482->454|482->454|483->455|483->455|488->460|488->460|489->461|490->462|490->462|491->463|493->465|493->465|494->466|495->467|495->467|496->468|496->468|497->469|497->469|501->473|501->473|503->475|503->475|503->475|504->476|506->478|506->478|507->479|513->485|513->485|513->485|513->485|514->486|516->488|516->488|518->490|520->492|520->492|521->493|527->499|527->499|527->499|527->499|530->502|538->510|538->510|538->510|538->510|538->510|539->511|539->511|539->511|540->512|547->519|547->519|547->519|547->519|548->520|550->522|550->522|552->524|552->524|555->527|557->529|557->529|559->531|564->536|564->536|564->536|564->536|567->539|575->547|575->547|576->548|576->548|576->548|578->550|578->550|578->550|579->551|586->558|586->558|586->558|586->558|587->559|589->561|589->561|591->563|591->563|595->567|597->569|597->569|599->571|605->577|605->577|605->577|605->577|606->578|608->580|608->580|611->583|615->587|615->587|617->589|617->589|617->589|617->589|618->590|624->596|624->596|626->598|626->598|626->598|628->600|628->600|628->600|628->600|629->601|635->607|635->607|636->608|636->608|636->608|637->609|643->615|643->615|643->615|643->615|644->616|646->618|646->618|648->620|650->622|650->622|651->623|657->629|657->629|658->630|658->630|658->630|659->631|661->633|661->633|663->635|665->637|665->637|667->639|667->639|667->639|668->640|674->646|674->646|675->647|675->647|675->647|675->647|676->648|678->650|678->650|684->656|689->661|689->661|690->662|690->662|690->662|691->663|697->669|697->669|698->670|698->670|698->670|698->670|699->671|701->673|701->673|704->676|708->680|708->680|709->681|709->681|709->681|711->683|717->689|717->689|718->690|718->690|718->690|718->690|719->691|721->693|721->693|725->697|727->699|727->699|729->701|736->708|736->708|736->708|736->708|737->709|739->711|739->711|740->712|741->713|741->713|743->715|749->721|749->721|749->721|749->721|750->722|752->724|752->724|754->726|758->730|758->730|760->732|766->738|766->738|766->738|766->738|767->739|769->741|769->741|771->743|774->746|774->746|776->748|782->754|782->754|782->754|782->754|783->755|785->757|785->757|788->760|790->762|790->762|792->764|798->770|798->770|798->770|798->770|800->772|806->778|806->778|809->781|809->781|809->781|810->782|810->782|810->782|811->783|818->790|818->790|818->790|818->790|819->791|821->793|821->793|823->795|823->795|825->797|825->797|825->797|826->798|827->799|827->799|828->800|829->801|829->801|829->801|829->801|831->803|831->803|833->805|833->805|835->807|838->810|838->810|838->810
                  -- GENERATED --
              */
          