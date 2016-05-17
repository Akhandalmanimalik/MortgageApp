
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
object clientV extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
			
				
				 <div id="text_49" class="form-html">
         <iframe src="//fast.wistia.net/embed/iframe/4kbavt9xtq?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="360"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script> 
          </div>
          <br>
						
						
					
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
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*299.61*/("""{"""),format.raw/*299.62*/("""{"""),format.raw/*299.63*/("""company"""),format.raw/*299.70*/("""}"""),format.raw/*299.71*/("""}"""),format.raw/*299.72*/(""""> <br>
								<br>


								<div class="map_canvas"></div>

								<div class="form-group" style="width: 60%">
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
										type="hidden" name="companyAddress" value=""""),format.raw/*319.54*/("""{"""),format.raw/*319.55*/("""{"""),format.raw/*319.56*/("""companyAddress"""),format.raw/*319.70*/("""}"""),format.raw/*319.71*/("""}"""),format.raw/*319.72*/("""">
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
										value=""""),format.raw/*343.18*/("""{"""),format.raw/*343.19*/("""{"""),format.raw/*343.20*/("""companyAddress1"""),format.raw/*343.35*/("""}"""),format.raw/*343.36*/("""}"""),format.raw/*343.37*/("""">

									<div id="address1"></div>

								</div>
								<div class="form-group" style="width: 60%">
									<label for="pwd"><Strong> What is the phone
											number of the Brokerage? </Strong> <span
										style="color: red; font-size: 3">*</span> </label> <input type="tel"
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
								<label for="pwd"><Strong>From whom or how did you find out about Visdom Mortgage Solutions? </Strong> <span style="color: red; font-size: 3">*</span>
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
    $(function() """),format.raw/*407.18*/("""{"""),format.raw/*407.19*/("""
        """),format.raw/*408.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*411.5*/("""}"""),format.raw/*411.6*/(""");
	
</script>
	<script type="text/javascript">
    $(function() """),format.raw/*415.18*/("""{"""),format.raw/*415.19*/("""
        """),format.raw/*416.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#brokerPhone").mask("999-999-9999");
    """),format.raw/*419.5*/("""}"""),format.raw/*419.6*/(""");
	
</script>



	<script>
$(document).ready(function()"""),format.raw/*426.29*/("""{"""),format.raw/*426.30*/("""
    """),format.raw/*427.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*428.1*/("""}"""),format.raw/*428.2*/(""");
</script>

	<script
		src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>

	<script src="jquery.geocomplete.js"></script>
	<script>
      $(function()"""),format.raw/*436.19*/("""{"""),format.raw/*436.20*/("""
        """),format.raw/*437.9*/("""$("#geocomplete").geocomplete("""),format.raw/*437.39*/("""{"""),format.raw/*437.40*/("""
          """),format.raw/*438.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*441.9*/("""}"""),format.raw/*441.10*/(""");

        $("#find").click(function()"""),format.raw/*443.36*/("""{"""),format.raw/*443.37*/("""
          """),format.raw/*444.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*445.9*/("""}"""),format.raw/*445.10*/(""");
      """),format.raw/*446.7*/("""}"""),format.raw/*446.8*/(""");
    </script>

	<script>
      $(function()"""),format.raw/*450.19*/("""{"""),format.raw/*450.20*/("""
        """),format.raw/*451.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*451.40*/("""{"""),format.raw/*451.41*/("""
          """),format.raw/*452.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*455.9*/("""}"""),format.raw/*455.10*/(""");

        $("#find").click(function()"""),format.raw/*457.36*/("""{"""),format.raw/*457.37*/("""
          """),format.raw/*458.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*459.9*/("""}"""),format.raw/*459.10*/(""");
      """),format.raw/*460.7*/("""}"""),format.raw/*460.8*/(""");
    </script>
	<script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*465.56*/("""{"""),format.raw/*465.57*/("""
        """),format.raw/*466.9*/("""init();
        function init() """),format.raw/*467.25*/("""{"""),format.raw/*467.26*/("""
            """),format.raw/*468.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*470.41*/("""{"""),format.raw/*470.42*/("""
                """),format.raw/*471.17*/("""console.log($scope.newItemType)
            """),format.raw/*472.13*/("""}"""),format.raw/*472.14*/(""";
        """),format.raw/*473.9*/("""}"""),format.raw/*473.10*/("""
    """),format.raw/*474.5*/("""}"""),format.raw/*474.6*/(""");
    </script>

	<script type="text/javascript">
 function validateForm() """),format.raw/*478.26*/("""{"""),format.raw/*478.27*/("""
	 
	 """),format.raw/*480.3*/("""try"""),format.raw/*480.6*/("""{"""),format.raw/*480.7*/("""
		"""),format.raw/*481.3*/("""var role=document.forms["myForm"]["role"].value;
		var value=true;
		if(!role)"""),format.raw/*483.12*/("""{"""),format.raw/*483.13*/("""
			"""),format.raw/*484.4*/("""document.getElementById("role1").innerHTML="<p style=\"color:red\">Please Select Role</p>";
			document.getElementById("role").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*490.3*/("""}"""),format.raw/*490.4*/("""else"""),format.raw/*490.8*/("""{"""),format.raw/*490.9*/("""
	    	"""),format.raw/*491.7*/("""document.getElementById("role1").innerHTML="";

		"""),format.raw/*493.3*/("""}"""),format.raw/*493.4*/(""" 

	 """),format.raw/*495.3*/("""var fname=document.forms["myForm"]["fname"].value;
	 

		if(!fname)"""),format.raw/*498.13*/("""{"""),format.raw/*498.14*/("""
			"""),format.raw/*499.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*505.3*/("""}"""),format.raw/*505.4*/("""else if(fname.trim().length<2)"""),format.raw/*505.34*/("""{"""),format.raw/*505.35*/("""
			"""),format.raw/*506.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">First Name Should be more than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*512.3*/("""}"""),format.raw/*512.4*/("""
		
		"""),format.raw/*514.3*/("""else"""),format.raw/*514.7*/("""{"""),format.raw/*514.8*/("""

			"""),format.raw/*516.4*/("""if(!fname.match(/^[a-zA-Z ]*$/))"""),format.raw/*516.36*/("""{"""),format.raw/*516.37*/("""
				"""),format.raw/*517.5*/("""document.getElementById("fname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
				document.getElementById("fname").focus();
				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


				value = false;

			"""),format.raw/*524.4*/("""}"""),format.raw/*524.5*/("""else"""),format.raw/*524.9*/("""{"""),format.raw/*524.10*/("""
				"""),format.raw/*525.5*/("""document.getElementById("fname1").innerHTML = "";

			"""),format.raw/*527.4*/("""}"""),format.raw/*527.5*/("""

		"""),format.raw/*529.3*/("""}"""),format.raw/*529.4*/(""" 
		
		"""),format.raw/*531.3*/("""var lname=document.forms["myForm"]["lname"].value;
		 
		if(!lname)"""),format.raw/*533.13*/("""{"""),format.raw/*533.14*/("""
			
			"""),format.raw/*535.4*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
			document.getElementById("lname").focus();
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*540.3*/("""}"""),format.raw/*540.4*/("""else if(lname.trim().length<2)"""),format.raw/*540.34*/("""{"""),format.raw/*540.35*/("""
			
			
			"""),format.raw/*543.4*/("""document.getElementById("lname").focus();

			document.getElementById("lname1").innerHTML="<p style=\"color:red\">Last  Name Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*551.3*/("""}"""),format.raw/*551.4*/("""	"""),format.raw/*551.5*/("""else"""),format.raw/*551.9*/("""{"""),format.raw/*551.10*/("""
				"""),format.raw/*552.5*/("""if(!lname.match(/^[a-zA-Z ]*$/))"""),format.raw/*552.37*/("""{"""),format.raw/*552.38*/("""
					"""),format.raw/*553.6*/("""document.getElementById("lname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
					document.getElementById("lname").focus();
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


					value = false;

				"""),format.raw/*560.5*/("""}"""),format.raw/*560.6*/("""else"""),format.raw/*560.10*/("""{"""),format.raw/*560.11*/("""
					"""),format.raw/*561.6*/("""document.getElementById("lname1").innerHTML = "";

				"""),format.raw/*563.5*/("""}"""),format.raw/*563.6*/("""
				

			"""),format.raw/*566.4*/("""}"""),format.raw/*566.5*/(""" 
	
	 
		"""),format.raw/*569.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*571.13*/("""{"""),format.raw/*571.14*/("""
			
			"""),format.raw/*573.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
		"""),format.raw/*579.3*/("""}"""),format.raw/*579.4*/("""else"""),format.raw/*579.8*/("""{"""),format.raw/*579.9*/("""
	    	"""),format.raw/*580.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*582.3*/("""}"""),format.raw/*582.4*/("""
	 
	 
    """),format.raw/*585.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*589.24*/("""{"""),format.raw/*589.25*/("""         
		  
    """),format.raw/*591.5*/("""}"""),format.raw/*591.6*/("""else"""),format.raw/*591.10*/("""{"""),format.raw/*591.11*/("""   
		"""),format.raw/*592.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*598.5*/("""}"""),format.raw/*598.6*/("""
    
    """),format.raw/*600.5*/("""if(pattern.test(x2))"""),format.raw/*600.25*/("""{"""),format.raw/*600.26*/("""         
		  
    """),format.raw/*602.5*/("""}"""),format.raw/*602.6*/("""else"""),format.raw/*602.10*/("""{"""),format.raw/*602.11*/("""   
		"""),format.raw/*603.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email2").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*609.5*/("""}"""),format.raw/*609.6*/("""
    """),format.raw/*610.5*/("""if (x  != x2) """),format.raw/*610.19*/("""{"""),format.raw/*610.20*/("""
"""),format.raw/*611.1*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
document.getElementById("email").focus();

document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

value= false;
    """),format.raw/*617.5*/("""}"""),format.raw/*617.6*/("""else"""),format.raw/*617.10*/("""{"""),format.raw/*617.11*/("""
    	"""),format.raw/*618.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*620.5*/("""}"""),format.raw/*620.6*/("""
    
	"""),format.raw/*622.2*/("""var phone=document.forms["myForm"]["phone"].value;
	 
	if(!phone)"""),format.raw/*624.12*/("""{"""),format.raw/*624.13*/("""
		"""),format.raw/*625.3*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
		document.getElementById("phonedatata").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=false;
	"""),format.raw/*631.2*/("""}"""),format.raw/*631.3*/("""	
	"""),format.raw/*632.2*/("""else"""),format.raw/*632.6*/("""{"""),format.raw/*632.7*/("""
    	"""),format.raw/*633.6*/("""document.getElementById("phone1").innerHTML="";

	"""),format.raw/*635.2*/("""}"""),format.raw/*635.3*/(""" 
    
	"""),format.raw/*637.2*/("""var feeTo=document.forms["myForm"]["feeTo"].value;

	if(!feeTo)"""),format.raw/*639.12*/("""{"""),format.raw/*639.13*/("""

		"""),format.raw/*641.3*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*641.58*/("""{"""),format.raw/*641.59*/("""
		"""),format.raw/*642.3*/("""document.getElementById("feeTo1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("feeTo").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=false;
	"""),format.raw/*648.2*/("""}"""),format.raw/*648.3*/("""
	"""),format.raw/*649.2*/("""}"""),format.raw/*649.3*/("""else"""),format.raw/*649.7*/("""{"""),format.raw/*649.8*/("""
    	"""),format.raw/*650.6*/("""document.getElementById("feeTo1").innerHTML="";

	"""),format.raw/*652.2*/("""}"""),format.raw/*652.3*/("""
	
	
	
	
	
	"""),format.raw/*658.2*/("""//var role=document.forms["myForm"]["role"].value;
	var company=document.forms["myForm"]["company"].value;

	
	
if(!company)"""),format.raw/*663.13*/("""{"""),format.raw/*663.14*/("""
	"""),format.raw/*664.2*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*664.57*/("""{"""),format.raw/*664.58*/("""
		"""),format.raw/*665.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=false;
	"""),format.raw/*671.2*/("""}"""),format.raw/*671.3*/("""
	"""),format.raw/*672.2*/("""}"""),format.raw/*672.3*/("""else"""),format.raw/*672.7*/("""{"""),format.raw/*672.8*/("""
    	"""),format.raw/*673.6*/("""document.getElementById("company1").innerHTML="";

	"""),format.raw/*675.2*/("""}"""),format.raw/*675.3*/("""


"""),format.raw/*678.1*/("""//var formattedaddress=document.forms["myForm"]["companyAddress"].value;
var companyAddress=document.forms["myForm"]["companyAddress"].value;


if(!companyAddress)"""),format.raw/*682.20*/("""{"""),format.raw/*682.21*/("""
	"""),format.raw/*683.2*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*683.57*/("""{"""),format.raw/*683.58*/("""

		"""),format.raw/*685.3*/("""document.getElementById("formattedaddress1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("geocomplete").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*691.2*/("""}"""),format.raw/*691.3*/("""
	"""),format.raw/*692.2*/("""}"""),format.raw/*692.3*/("""else"""),format.raw/*692.7*/("""{"""),format.raw/*692.8*/("""
    	"""),format.raw/*693.6*/("""document.getElementById("formattedaddress1").innerHTML="";

	"""),format.raw/*695.2*/("""}"""),format.raw/*695.3*/("""
	

	
	"""),format.raw/*699.2*/("""var broker=document.forms["myForm"]["broker"].value;

if(!broker&& role== 'Realtor')"""),format.raw/*701.31*/("""{"""),format.raw/*701.32*/("""
		
		"""),format.raw/*703.3*/("""document.getElementById("broker1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		
		document.getElementById("broker").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*710.2*/("""}"""),format.raw/*710.3*/("""else"""),format.raw/*710.7*/("""{"""),format.raw/*710.8*/("""
    	"""),format.raw/*711.6*/("""document.getElementById("broker1").innerHTML="";

	"""),format.raw/*713.2*/("""}"""),format.raw/*713.3*/("""									
"""),format.raw/*714.1*/("""var address1=document.forms["myForm"]["companyAddress1"].value;
if(!address1&& role== 'Realtor')"""),format.raw/*715.33*/("""{"""),format.raw/*715.34*/("""
	
	"""),format.raw/*717.2*/("""document.getElementById("address1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("geocomplete1").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*723.1*/("""}"""),format.raw/*723.2*/("""else"""),format.raw/*723.6*/("""{"""),format.raw/*723.7*/("""
	"""),format.raw/*724.2*/("""document.getElementById("address1").innerHTML="";

"""),format.raw/*726.1*/("""}"""),format.raw/*726.2*/("""

"""),format.raw/*728.1*/("""var brokerPhone=document.forms["myForm"]["brokerPhone"].value;



if(!brokerPhone&& role== 'Realtor')"""),format.raw/*732.36*/("""{"""),format.raw/*732.37*/("""
	
	"""),format.raw/*734.2*/("""document.getElementById("brokerPhone1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerPhone").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*740.1*/("""}"""),format.raw/*740.2*/("""else"""),format.raw/*740.6*/("""{"""),format.raw/*740.7*/("""
	"""),format.raw/*741.2*/("""document.getElementById("brokerPhone1").innerHTML="";

"""),format.raw/*743.1*/("""}"""),format.raw/*743.2*/("""

"""),format.raw/*745.1*/("""var brokerMange=document.forms["myForm"]["brokerMange"].value;


if(!brokerMange&& role== 'Realtor')"""),format.raw/*748.36*/("""{"""),format.raw/*748.37*/("""
	
	"""),format.raw/*750.2*/("""document.getElementById("brokerMange1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerMange").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*756.1*/("""}"""),format.raw/*756.2*/("""else"""),format.raw/*756.6*/("""{"""),format.raw/*756.7*/("""
	"""),format.raw/*757.2*/("""document.getElementById("brokerMange1").innerHTML="";

"""),format.raw/*759.1*/("""}"""),format.raw/*759.2*/("""


"""),format.raw/*762.1*/("""var refer=document.forms["myForm"]["refer"].value;

if(!refer&& role== 'Realtor')"""),format.raw/*764.30*/("""{"""),format.raw/*764.31*/("""
	
	"""),format.raw/*766.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*772.1*/("""}"""),format.raw/*772.2*/("""else if(refer.trim().length<2)"""),format.raw/*772.32*/("""{"""),format.raw/*772.33*/("""
	
	"""),format.raw/*774.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">Referrar Name Should be more than one letter </p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*780.1*/("""}"""),format.raw/*780.2*/("""


"""),format.raw/*783.1*/("""else"""),format.raw/*783.5*/("""{"""),format.raw/*783.6*/("""
	"""),format.raw/*784.2*/("""if(!refer.match(/^[a-zA-Z ]*$/))"""),format.raw/*784.34*/("""{"""),format.raw/*784.35*/("""
		"""),format.raw/*785.3*/("""document.getElementById("refer1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("refer").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*792.2*/("""}"""),format.raw/*792.3*/("""else"""),format.raw/*792.7*/("""{"""),format.raw/*792.8*/("""
		"""),format.raw/*793.3*/("""document.getElementById("refer1").innerHTML = "";

	"""),format.raw/*795.2*/("""}"""),format.raw/*795.3*/("""

"""),format.raw/*797.1*/("""}"""),format.raw/*797.2*/("""

"""),format.raw/*799.1*/("""if(value)"""),format.raw/*799.10*/("""{"""),format.raw/*799.11*/("""
	 """),format.raw/*800.3*/("""$('#loading').show();
"""),format.raw/*801.1*/("""}"""),format.raw/*801.2*/("""
"""),format.raw/*802.1*/("""return value;
	 """),format.raw/*803.3*/("""}"""),format.raw/*803.4*/("""catch(err)"""),format.raw/*803.14*/("""{"""),format.raw/*803.15*/("""
		
	 """),format.raw/*805.3*/("""}"""),format.raw/*805.4*/("""
    
 """),format.raw/*807.2*/("""}"""),format.raw/*807.3*/("""
    
    """),format.raw/*809.5*/("""</script>


	<script src=""""),_display_(/*812.16*/routes/*812.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*812.72*/("""" type="text/javascript"></script>
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
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/clientV.scala.html
                  HASH: 4b54340c53be1815fcc71e6944c7a4a5224dbd8a
                  MATRIX: 725->1|830->18|857->19|1206->342|1220->348|1276->384|1422->503|1437->509|1497->548|1553->578|1568->584|1638->633|1793->761|1808->767|1873->811|1930->841|1945->847|2012->893|2110->964|2138->965|2170->970|2322->1095|2350->1096|2382->1101|2410->1102|2442->1107|2513->1151|2541->1152|2569->1153|2638->1194|2667->1195|2700->1201|2790->1264|2818->1265|2855->1275|2923->1315|2952->1316|2988->1325|3046->1355|3075->1356|3114->1367|3243->1469|3272->1470|3339->1509|3368->1510|3407->1521|3480->1567|3509->1568|3545->1577|3573->1578|3656->1633|3685->1634|3721->1643|3780->1674|3809->1675|3848->1686|3977->1788|4006->1789|4073->1828|4102->1829|4141->1840|4215->1887|4244->1888|4280->1897|4308->1898|4444->2006|4473->2007|4506->2013|4852->2332|4880->2333|5000->2425|5029->2426|5065->2435|5208->2550|5237->2551|5275->2561|6059->3318|6087->3319|6121->3325|6150->3326|6179->3327|6411->3531|6427->3537|6491->3579|6535->3595|6551->3601|6614->3642|6702->3702|6718->3708|6779->3747|6856->3796|6872->3802|6928->3836|7005->3885|7021->3891|7080->3928|7152->3971|7182->3972|7212->3974|7344->4078|7360->4084|7418->4120|7485->4159|7514->4160|7543->4161|7585->4174|7615->4175|7646->4178|7824->4328|7853->4329|7884->4332|7920->4340|7950->4341|7981->4344|8214->4549|8243->4550|8273->4552|8420->4671|8436->4677|8499->4718|8649->4840|8665->4846|8728->4886|13097->9227|13127->9228|13157->9229|13193->9236|13223->9237|13253->9238|14074->10030|14104->10031|14134->10032|14177->10046|14207->10047|14237->10048|15268->11050|15298->11051|15328->11052|15372->11067|15402->11068|15432->11069|17190->12798|17220->12799|17257->12808|17372->12895|17401->12896|17495->12961|17525->12962|17562->12971|17677->13058|17706->13059|17791->13115|17821->13116|17854->13121|17925->13164|17954->13165|18173->13355|18203->13356|18240->13365|18299->13395|18329->13396|18369->13407|18499->13509|18529->13510|18597->13549|18627->13550|18667->13561|18741->13607|18771->13608|18808->13617|18837->13618|18912->13664|18942->13665|18979->13674|19039->13705|19069->13706|19109->13717|19239->13819|19269->13820|19337->13859|19367->13860|19407->13871|19482->13918|19512->13919|19549->13928|19578->13929|19772->14094|19802->14095|19839->14104|19900->14136|19930->14137|19972->14150|20097->14246|20127->14247|20173->14264|20246->14308|20276->14309|20314->14319|20344->14320|20377->14325|20406->14326|20511->14402|20541->14403|20575->14409|20606->14412|20635->14413|20666->14416|20773->14494|20803->14495|20835->14499|21167->14803|21196->14804|21228->14808|21257->14809|21292->14816|21370->14866|21399->14867|21432->14872|21528->14939|21558->14940|21590->14944|21924->15250|21953->15251|22012->15281|22042->15282|22074->15286|22431->15615|22460->15616|22494->15622|22526->15626|22555->15627|22588->15632|22649->15664|22679->15665|22712->15670|23065->15995|23094->15996|23126->16000|23156->16001|23189->16006|23271->16060|23300->16061|23332->16065|23361->16066|23396->16073|23492->16140|23522->16141|23558->16149|23890->16453|23919->16454|23978->16484|24008->16485|24048->16497|24409->16830|24438->16831|24467->16832|24499->16836|24529->16837|24562->16842|24623->16874|24653->16875|24687->16881|25044->17210|25073->17211|25106->17215|25136->17216|25170->17222|25253->17277|25282->17278|25320->17288|25349->17289|25386->17298|25482->17365|25512->17366|25548->17374|25877->17675|25906->17676|25938->17680|25967->17681|26002->17688|26081->17739|26110->17740|26149->17751|26386->17960|26416->17961|26463->17980|26492->17981|26525->17985|26555->17986|26589->17992|26929->18304|26958->18305|26996->18315|27045->18335|27075->18336|27122->18355|27151->18356|27184->18360|27214->18361|27248->18367|27588->18679|27617->18680|27650->18685|27693->18699|27723->18700|27752->18701|28079->19000|28108->19001|28141->19005|28171->19006|28205->19012|28285->19064|28314->19065|28349->19072|28443->19137|28473->19138|28504->19141|28841->19450|28870->19451|28901->19454|28933->19458|28962->19459|28996->19465|29074->19515|29103->19516|29139->19524|29231->19587|29261->19588|29293->19592|29377->19647|29407->19648|29438->19651|29771->19956|29800->19957|29830->19959|29859->19960|29891->19964|29920->19965|29954->19971|30032->20021|30061->20022|30101->20034|30254->20158|30284->20159|30314->20161|30398->20216|30428->20217|30459->20220|30796->20529|30825->20530|30855->20532|30884->20533|30916->20537|30945->20538|30979->20544|31059->20596|31088->20597|31119->20600|31311->20763|31341->20764|31371->20766|31455->20821|31485->20822|31517->20826|31868->21149|31897->21150|31927->21152|31956->21153|31988->21157|32017->21158|32051->21164|32140->21225|32169->21226|32204->21233|32317->21317|32347->21318|32381->21324|32720->21635|32749->21636|32781->21640|32810->21641|32844->21647|32923->21698|32952->21699|32990->21709|33115->21805|33145->21806|33177->21810|33516->22121|33545->22122|33577->22126|33606->22127|33636->22129|33715->22180|33744->22181|33774->22183|33904->22284|33934->22285|33966->22289|34308->22603|34337->22604|34369->22608|34398->22609|34428->22611|34511->22666|34540->22667|34570->22669|34699->22769|34729->22770|34761->22774|35103->23088|35132->23089|35164->23093|35193->23094|35223->23096|35306->23151|35335->23152|35366->23155|35476->23236|35506->23237|35538->23241|35867->23542|35896->23543|35955->23573|35985->23574|36017->23578|36369->23902|36398->23903|36429->23906|36461->23910|36490->23911|36520->23913|36581->23945|36611->23946|36642->23949|36987->24266|37016->24267|37048->24271|37077->24272|37108->24275|37188->24327|37217->24328|37247->24330|37276->24331|37306->24333|37344->24342|37374->24343|37405->24346|37455->24368|37484->24369|37513->24370|37557->24386|37586->24387|37625->24397|37655->24398|37689->24404|37718->24405|37753->24412|37782->24413|37820->24423|37875->24450|37891->24456|37963->24506
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|44->16|44->16|44->16|45->17|45->17|45->17|49->21|49->21|50->22|56->28|56->28|56->28|56->28|57->29|60->32|60->32|61->33|61->33|61->33|62->34|65->37|65->37|67->39|69->41|69->41|70->42|70->42|70->42|71->43|74->46|74->46|76->48|76->48|77->49|78->50|78->50|79->51|79->51|83->55|83->55|84->56|84->56|84->56|85->57|88->60|88->60|90->62|90->62|91->63|92->64|92->64|93->65|93->65|96->68|96->68|97->69|102->74|102->74|107->79|107->79|108->80|111->83|111->83|112->84|127->99|127->99|128->100|128->100|128->100|133->105|133->105|133->105|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|137->109|137->109|137->109|142->114|142->114|143->115|149->121|149->121|149->121|150->122|150->122|150->122|152->124|152->124|153->125|163->135|163->135|165->137|165->137|165->137|166->138|176->148|176->148|178->150|194->166|194->166|194->166|200->172|200->172|200->172|327->299|327->299|327->299|327->299|327->299|327->299|347->319|347->319|347->319|347->319|347->319|347->319|371->343|371->343|371->343|371->343|371->343|371->343|435->407|435->407|436->408|439->411|439->411|443->415|443->415|444->416|447->419|447->419|454->426|454->426|455->427|456->428|456->428|464->436|464->436|465->437|465->437|465->437|466->438|469->441|469->441|471->443|471->443|472->444|473->445|473->445|474->446|474->446|478->450|478->450|479->451|479->451|479->451|480->452|483->455|483->455|485->457|485->457|486->458|487->459|487->459|488->460|488->460|493->465|493->465|494->466|495->467|495->467|496->468|498->470|498->470|499->471|500->472|500->472|501->473|501->473|502->474|502->474|506->478|506->478|508->480|508->480|508->480|509->481|511->483|511->483|512->484|518->490|518->490|518->490|518->490|519->491|521->493|521->493|523->495|526->498|526->498|527->499|533->505|533->505|533->505|533->505|534->506|540->512|540->512|542->514|542->514|542->514|544->516|544->516|544->516|545->517|552->524|552->524|552->524|552->524|553->525|555->527|555->527|557->529|557->529|559->531|561->533|561->533|563->535|568->540|568->540|568->540|568->540|571->543|579->551|579->551|579->551|579->551|579->551|580->552|580->552|580->552|581->553|588->560|588->560|588->560|588->560|589->561|591->563|591->563|594->566|594->566|597->569|599->571|599->571|601->573|607->579|607->579|607->579|607->579|608->580|610->582|610->582|613->585|617->589|617->589|619->591|619->591|619->591|619->591|620->592|626->598|626->598|628->600|628->600|628->600|630->602|630->602|630->602|630->602|631->603|637->609|637->609|638->610|638->610|638->610|639->611|645->617|645->617|645->617|645->617|646->618|648->620|648->620|650->622|652->624|652->624|653->625|659->631|659->631|660->632|660->632|660->632|661->633|663->635|663->635|665->637|667->639|667->639|669->641|669->641|669->641|670->642|676->648|676->648|677->649|677->649|677->649|677->649|678->650|680->652|680->652|686->658|691->663|691->663|692->664|692->664|692->664|693->665|699->671|699->671|700->672|700->672|700->672|700->672|701->673|703->675|703->675|706->678|710->682|710->682|711->683|711->683|711->683|713->685|719->691|719->691|720->692|720->692|720->692|720->692|721->693|723->695|723->695|727->699|729->701|729->701|731->703|738->710|738->710|738->710|738->710|739->711|741->713|741->713|742->714|743->715|743->715|745->717|751->723|751->723|751->723|751->723|752->724|754->726|754->726|756->728|760->732|760->732|762->734|768->740|768->740|768->740|768->740|769->741|771->743|771->743|773->745|776->748|776->748|778->750|784->756|784->756|784->756|784->756|785->757|787->759|787->759|790->762|792->764|792->764|794->766|800->772|800->772|800->772|800->772|802->774|808->780|808->780|811->783|811->783|811->783|812->784|812->784|812->784|813->785|820->792|820->792|820->792|820->792|821->793|823->795|823->795|825->797|825->797|827->799|827->799|827->799|828->800|829->801|829->801|830->802|831->803|831->803|831->803|831->803|833->805|833->805|835->807|835->807|837->809|840->812|840->812|840->812
                  -- GENERATED --
              */
          