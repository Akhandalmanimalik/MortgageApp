
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
object wfgV extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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

 --> 
   <script src=""""),_display_(/*17.18*/routes/*17.24*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*17.68*/(""""></script>
    <script src=""""),_display_(/*18.19*/routes/*18.25*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*18.71*/(""""></script>
    <style type="text/css">
    
    .blocks .btn-primary 
"""),format.raw/*22.1*/("""{"""),format.raw/*22.2*/("""
    """),format.raw/*23.5*/("""padding: 9px 6px;
    margin:2px 2px;
     font-weight: bold;
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

 --> 
  <link rel="stylesheet" href="_resources/bootstrap.min.css">
 <link rel="stylesheet" href=""""),_display_(/*108.32*/routes/*108.38*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*108.80*/("""">
<script src="""),_display_(/*109.14*/routes/*109.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*109.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*110.47*/routes/*110.53*/.Assets.at("_resources/background.css")),format.raw/*110.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*111.47*/routes/*111.53*/.Assets.at("_resources/forms.css")),format.raw/*111.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*112.47*/routes/*112.53*/.Assets.at("_resources/template.css")),format.raw/*112.90*/("""">
<style type="text/css">



/*  #loading """),format.raw/*117.14*/("""{"""),format.raw/*117.15*/("""
	"""),format.raw/*118.2*/("""position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background: url('"""),_display_(/*124.20*/routes/*124.26*/.Assets.at("images/page-loader.gif")),format.raw/*124.62*/("""') 50% 50% no-repeat rgb(249,249,249);
"""),format.raw/*125.1*/("""}"""),format.raw/*125.2*/(""" """),format.raw/*125.3*/("""*/

 #overlay"""),format.raw/*127.10*/("""{"""),format.raw/*127.11*/(""" 
	"""),format.raw/*128.2*/("""display: none;
	position: fixed;
	background: threedhighlight;
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;

"""),format.raw/*138.1*/("""}"""),format.raw/*138.2*/(""" 

"""),format.raw/*140.1*/("""#loading"""),format.raw/*140.9*/("""{"""),format.raw/*140.10*/(""" 
	"""),format.raw/*141.2*/("""padding: 10px 10px 10px 60px; 
		position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background-color:threedhighlight;
    opacity: 0.6;
    filter: alpha(opacity=60); */
"""),format.raw/*151.1*/("""}"""),format.raw/*151.2*/("""

"""),format.raw/*153.1*/("""</style> 







  
  </head>
<body>

 <div id="loading" style="display: none" align="center" >
 
  
     <img src=""""),_display_(/*168.17*/routes/*168.23*/.Assets.at("/images/preloader-image.gif")),format.raw/*168.64*/("""" alt="" />
  
  </div> 



 <div align="center">
                		<img alt="Visdom Logo" height="90" width="260"  src=""""),_display_(/*175.73*/routes/*175.79*/.Assets.at("_resources/visdom-logo.png")),format.raw/*175.119*/("""" />
              
              
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
						
						  <div id="text_45" class="form-html">
<iframe src="//fast.wistia.net/embed/iframe/olmeoln42z?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="388"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script>
          </div><br>
					
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


<!-- 							<div
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
										ng-model="company">  MySelf </label>
								</div>
								<div id="feeTo1"></div>
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*295.61*/("""{"""),format.raw/*295.62*/("""{"""),format.raw/*295.63*/("""company"""),format.raw/*295.70*/("""}"""),format.raw/*295.71*/("""}"""),format.raw/*295.72*/(""""> <br>
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
										type="hidden" name="companyAddress" value=""""),format.raw/*315.54*/("""{"""),format.raw/*315.55*/("""{"""),format.raw/*315.56*/("""companyAddress"""),format.raw/*315.70*/("""}"""),format.raw/*315.71*/("""}"""),format.raw/*315.72*/("""">
									<div id="formattedaddress1"></div>


								</div>
							</div>
 -->							<div ng-show="newItemType == 'Realtor'">

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
										value=""""),format.raw/*339.18*/("""{"""),format.raw/*339.19*/("""{"""),format.raw/*339.20*/("""companyAddress1"""),format.raw/*339.35*/("""}"""),format.raw/*339.36*/("""}"""),format.raw/*339.37*/("""">

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
							
							<label for="pwd"><Strong>From whom or how did you find out about Visdom Mortgage Solutions?  </Strong> <span style="color: red; font-size: 4">*</span>
								</label></div>
							<div class="form-group" style="width:280px">
							 <input type="text" id="refer" name="refer" class="form-control" required>
								<div id="refer1"></div>

							</div>
							<br>



							<div align="center">

								<input type="submit" style="width: 280px" class="btn btn-primary"
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
    $(function() """),format.raw/*403.18*/("""{"""),format.raw/*403.19*/("""
        """),format.raw/*404.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*407.5*/("""}"""),format.raw/*407.6*/(""");
	
</script>
	<script type="text/javascript">
    $(function() """),format.raw/*411.18*/("""{"""),format.raw/*411.19*/("""
        """),format.raw/*412.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#brokerPhone").mask("999-999-9999");
    """),format.raw/*415.5*/("""}"""),format.raw/*415.6*/(""");
	
</script>



	<script>
$(document).ready(function()"""),format.raw/*422.29*/("""{"""),format.raw/*422.30*/("""
    """),format.raw/*423.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*424.1*/("""}"""),format.raw/*424.2*/(""");
</script>

	<script
		src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>

	<script src="jquery.geocomplete.js"></script>
	<script>
      $(function()"""),format.raw/*432.19*/("""{"""),format.raw/*432.20*/("""
        """),format.raw/*433.9*/("""$("#geocomplete").geocomplete("""),format.raw/*433.39*/("""{"""),format.raw/*433.40*/("""
          """),format.raw/*434.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*437.9*/("""}"""),format.raw/*437.10*/(""");

        $("#find").click(function()"""),format.raw/*439.36*/("""{"""),format.raw/*439.37*/("""
          """),format.raw/*440.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*441.9*/("""}"""),format.raw/*441.10*/(""");
      """),format.raw/*442.7*/("""}"""),format.raw/*442.8*/(""");
    </script>

	<script>
      $(function()"""),format.raw/*446.19*/("""{"""),format.raw/*446.20*/("""
        """),format.raw/*447.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*447.40*/("""{"""),format.raw/*447.41*/("""
          """),format.raw/*448.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*451.9*/("""}"""),format.raw/*451.10*/(""");

        $("#find").click(function()"""),format.raw/*453.36*/("""{"""),format.raw/*453.37*/("""
          """),format.raw/*454.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*455.9*/("""}"""),format.raw/*455.10*/(""");
      """),format.raw/*456.7*/("""}"""),format.raw/*456.8*/(""");
    </script>
	<script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*461.56*/("""{"""),format.raw/*461.57*/("""
        """),format.raw/*462.9*/("""init();
        function init() """),format.raw/*463.25*/("""{"""),format.raw/*463.26*/("""
            """),format.raw/*464.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*466.41*/("""{"""),format.raw/*466.42*/("""
                """),format.raw/*467.17*/("""console.log($scope.newItemType)
            """),format.raw/*468.13*/("""}"""),format.raw/*468.14*/(""";
        """),format.raw/*469.9*/("""}"""),format.raw/*469.10*/("""
    """),format.raw/*470.5*/("""}"""),format.raw/*470.6*/(""");
    </script>

	<script type="text/javascript">
 function validateForm() """),format.raw/*474.26*/("""{"""),format.raw/*474.27*/("""
	 
	 """),format.raw/*476.3*/("""try"""),format.raw/*476.6*/("""{"""),format.raw/*476.7*/("""
			"""),format.raw/*477.4*/("""var role=document.forms["myForm"]["role"].value;
			var value=true;
			if(!role)"""),format.raw/*479.13*/("""{"""),format.raw/*479.14*/("""
				"""),format.raw/*480.5*/("""document.getElementById("role1").innerHTML="<p style=\"color:red\">Please Select Role</p>";
				document.getElementById("role").focus();

				document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value= false;
			"""),format.raw/*486.4*/("""}"""),format.raw/*486.5*/("""else"""),format.raw/*486.9*/("""{"""),format.raw/*486.10*/("""
		    	"""),format.raw/*487.8*/("""document.getElementById("role1").innerHTML="";

			"""),format.raw/*489.4*/("""}"""),format.raw/*489.5*/(""" 

		 """),format.raw/*491.4*/("""var fname=document.forms["myForm"]["fname"].value;
		 

			if(!fname)"""),format.raw/*494.14*/("""{"""),format.raw/*494.15*/("""
				"""),format.raw/*495.5*/("""document.getElementById("fname").focus();

				document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
				document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value= false;
			"""),format.raw/*501.4*/("""}"""),format.raw/*501.5*/("""else if(fname.trim().length<2)"""),format.raw/*501.35*/("""{"""),format.raw/*501.36*/("""
				
				
				"""),format.raw/*504.5*/("""document.getElementById("fname").focus();

				document.getElementById("fname1").innerHTML="<p style=\"color:red\">First Name Should More than one letter</p>";
				document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value=false;
				
				
			"""),format.raw/*512.4*/("""}"""),format.raw/*512.5*/(""" """),format.raw/*512.6*/("""else"""),format.raw/*512.10*/("""{"""),format.raw/*512.11*/("""
				"""),format.raw/*513.5*/("""if(!fname.match(/^[a-zA-Z ]*$/))"""),format.raw/*513.37*/("""{"""),format.raw/*513.38*/("""
					"""),format.raw/*514.6*/("""document.getElementById("fname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
					document.getElementById("fname").focus();
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


					value = false;

				"""),format.raw/*521.5*/("""}"""),format.raw/*521.6*/("""else"""),format.raw/*521.10*/("""{"""),format.raw/*521.11*/("""
					"""),format.raw/*522.6*/("""document.getElementById("fname1").innerHTML = "";

				"""),format.raw/*524.5*/("""}"""),format.raw/*524.6*/("""

			"""),format.raw/*526.4*/("""}"""),format.raw/*526.5*/(""" 
			
			
			"""),format.raw/*529.4*/("""var lname=document.forms["myForm"]["lname"].value;
			 
			if(!lname)"""),format.raw/*531.14*/("""{"""),format.raw/*531.15*/("""
				
				"""),format.raw/*533.5*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
				document.getElementById("lname").focus();
				document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value= false;
			"""),format.raw/*538.4*/("""}"""),format.raw/*538.5*/("""else if(lname.trim().length<2)"""),format.raw/*538.35*/("""{"""),format.raw/*538.36*/("""
				
				
				"""),format.raw/*541.5*/("""document.getElementById("lname").focus();

				document.getElementById("lname1").innerHTML="<p style=\"color:red\">Last  Name Should More than one letter</p>";
				document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value=false;
				
				
			"""),format.raw/*549.4*/("""}"""),format.raw/*549.5*/("""
				"""),format.raw/*550.5*/("""else"""),format.raw/*550.9*/("""{"""),format.raw/*550.10*/("""
					
					"""),format.raw/*552.6*/("""if(!lname.match(/^[a-zA-Z ]*$/))"""),format.raw/*552.38*/("""{"""),format.raw/*552.39*/("""
						"""),format.raw/*553.7*/("""document.getElementById("lname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
						document.getElementById("lname").focus();
						document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


						value = false;

					"""),format.raw/*560.6*/("""}"""),format.raw/*560.7*/("""else"""),format.raw/*560.11*/("""{"""),format.raw/*560.12*/("""
						"""),format.raw/*561.7*/("""document.getElementById("lname1").innerHTML = "";

					"""),format.raw/*563.6*/("""}"""),format.raw/*563.7*/("""

				"""),format.raw/*565.5*/("""}"""),format.raw/*565.6*/(""" 
		 
			"""),format.raw/*567.4*/("""var email=document.forms["myForm"]["email"].value;
			 
			if(!email)"""),format.raw/*569.14*/("""{"""),format.raw/*569.15*/("""
				
				"""),format.raw/*571.5*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
				document.getElementById("email").focus();

				document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value= false;
			"""),format.raw/*577.4*/("""}"""),format.raw/*577.5*/("""else"""),format.raw/*577.9*/("""{"""),format.raw/*577.10*/("""
		    	"""),format.raw/*578.8*/("""document.getElementById("email1").innerHTML="";

			"""),format.raw/*580.4*/("""}"""),format.raw/*580.5*/("""
		 
		 
	    """),format.raw/*583.6*/("""var x = document.forms["myForm"]["email"].value;
	    var x2 = document.forms["myForm"]["email2"].value;

	    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
	    if(pattern.test(x))"""),format.raw/*587.25*/("""{"""),format.raw/*587.26*/("""         
			  
	    """),format.raw/*589.6*/("""}"""),format.raw/*589.7*/("""else"""),format.raw/*589.11*/("""{"""),format.raw/*589.12*/("""   
			"""),format.raw/*590.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
	    """),format.raw/*596.6*/("""}"""),format.raw/*596.7*/("""
	    
	    """),format.raw/*598.6*/("""if(pattern.test(x2))"""),format.raw/*598.26*/("""{"""),format.raw/*598.27*/("""         
			  
	    """),format.raw/*600.6*/("""}"""),format.raw/*600.7*/("""else"""),format.raw/*600.11*/("""{"""),format.raw/*600.12*/("""   
			"""),format.raw/*601.4*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
			document.getElementById("email2").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
	    """),format.raw/*607.6*/("""}"""),format.raw/*607.7*/("""
	    """),format.raw/*608.6*/("""if (x  != x2) """),format.raw/*608.20*/("""{"""),format.raw/*608.21*/("""
	"""),format.raw/*609.2*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
	document.getElementById("email").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
	    """),format.raw/*615.6*/("""}"""),format.raw/*615.7*/("""else"""),format.raw/*615.11*/("""{"""),format.raw/*615.12*/("""
	    	"""),format.raw/*616.7*/("""document.getElementById("error").innerHTML="";

	    """),format.raw/*618.6*/("""}"""),format.raw/*618.7*/("""
	    
		"""),format.raw/*620.3*/("""var phone=document.forms["myForm"]["phone"].value;
		 
		if(!phone)"""),format.raw/*622.13*/("""{"""),format.raw/*622.14*/("""
			"""),format.raw/*623.4*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
			document.getElementById("phonedatata").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*629.3*/("""}"""),format.raw/*629.4*/("""	
		"""),format.raw/*630.3*/("""else"""),format.raw/*630.7*/("""{"""),format.raw/*630.8*/("""
	    	"""),format.raw/*631.7*/("""document.getElementById("phone1").innerHTML="";

		"""),format.raw/*633.3*/("""}"""),format.raw/*633.4*/(""" 
	    


		
		"""),format.raw/*638.3*/("""var broker=document.forms["myForm"]["broker"].value;

	if(!broker&& role== 'Realtor')"""),format.raw/*640.32*/("""{"""),format.raw/*640.33*/("""
			
			"""),format.raw/*642.4*/("""document.getElementById("broker1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
			
			document.getElementById("broker").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*649.3*/("""}"""),format.raw/*649.4*/("""else"""),format.raw/*649.8*/("""{"""),format.raw/*649.9*/("""
	    	"""),format.raw/*650.7*/("""document.getElementById("broker1").innerHTML="";

		"""),format.raw/*652.3*/("""}"""),format.raw/*652.4*/("""									
	"""),format.raw/*653.2*/("""var address1=document.forms["myForm"]["companyAddress1"].value;
	if(!address1&& role== 'Realtor')"""),format.raw/*654.34*/("""{"""),format.raw/*654.35*/("""
		
		"""),format.raw/*656.3*/("""document.getElementById("address1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("geocomplete1").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*662.2*/("""}"""),format.raw/*662.3*/("""else"""),format.raw/*662.7*/("""{"""),format.raw/*662.8*/("""
		"""),format.raw/*663.3*/("""document.getElementById("address1").innerHTML="";

	"""),format.raw/*665.2*/("""}"""),format.raw/*665.3*/("""

	"""),format.raw/*667.2*/("""var brokerPhone=document.forms["myForm"]["brokerPhone"].value;



	if(!brokerPhone&& role== 'Realtor')"""),format.raw/*671.37*/("""{"""),format.raw/*671.38*/("""
		
		"""),format.raw/*673.3*/("""document.getElementById("brokerPhone1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("brokerPhone").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*679.2*/("""}"""),format.raw/*679.3*/("""else"""),format.raw/*679.7*/("""{"""),format.raw/*679.8*/("""
		"""),format.raw/*680.3*/("""document.getElementById("brokerPhone1").innerHTML="";

	"""),format.raw/*682.2*/("""}"""),format.raw/*682.3*/("""

	"""),format.raw/*684.2*/("""var brokerMange=document.forms["myForm"]["brokerMange"].value;


	if(!brokerMange&& role== 'Realtor')"""),format.raw/*687.37*/("""{"""),format.raw/*687.38*/("""
		
		"""),format.raw/*689.3*/("""document.getElementById("brokerMange1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("brokerMange").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*695.2*/("""}"""),format.raw/*695.3*/("""else"""),format.raw/*695.7*/("""{"""),format.raw/*695.8*/("""
		"""),format.raw/*696.3*/("""document.getElementById("brokerMange1").innerHTML="";

	"""),format.raw/*698.2*/("""}"""),format.raw/*698.3*/("""


	"""),format.raw/*701.2*/("""var refer=document.forms["myForm"]["refer"].value;

	if(!refer&& role== 'Realtor')"""),format.raw/*703.31*/("""{"""),format.raw/*703.32*/("""
		
		"""),format.raw/*705.3*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("refer").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*711.2*/("""}"""),format.raw/*711.3*/("""else if(refer.trim().length<2)"""),format.raw/*711.33*/("""{"""),format.raw/*711.34*/("""
		
		"""),format.raw/*713.3*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">Referrar Name Should be more than one letter </p>";
		document.getElementById("refer").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=false;
	"""),format.raw/*719.2*/("""}"""),format.raw/*719.3*/("""


	"""),format.raw/*722.2*/("""else"""),format.raw/*722.6*/("""{"""),format.raw/*722.7*/("""
		"""),format.raw/*723.3*/("""if(!refer.match(/^[a-zA-Z ]*$/))"""),format.raw/*723.35*/("""{"""),format.raw/*723.36*/("""
			"""),format.raw/*724.4*/("""document.getElementById("refer1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
			document.getElementById("refer").focus();
			document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


			value = false;

		"""),format.raw/*731.3*/("""}"""),format.raw/*731.4*/("""else"""),format.raw/*731.8*/("""{"""),format.raw/*731.9*/("""
			"""),format.raw/*732.4*/("""document.getElementById("refer1").innerHTML = "";

		"""),format.raw/*734.3*/("""}"""),format.raw/*734.4*/("""

	"""),format.raw/*736.2*/("""}"""),format.raw/*736.3*/("""
	"""),format.raw/*737.2*/("""if(value)"""),format.raw/*737.11*/("""{"""),format.raw/*737.12*/("""
		 """),format.raw/*738.4*/("""$('#loading').show();
	"""),format.raw/*739.2*/("""}"""),format.raw/*739.3*/("""
	"""),format.raw/*740.2*/("""return value;
		 """),format.raw/*741.4*/("""}"""),format.raw/*741.5*/("""catch(err)"""),format.raw/*741.15*/("""{"""),format.raw/*741.16*/("""
			
		 """),format.raw/*743.4*/("""}"""),format.raw/*743.5*/("""
	    
    
 """),format.raw/*746.2*/("""}"""),format.raw/*746.3*/("""
    
    """),format.raw/*748.5*/("""</script>


	<script src=""""),_display_(/*751.16*/routes/*751.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*751.72*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:24 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/wfgV.scala.html
                  HASH: 62b78f60ffe556e381c87acfb912801be5b1fde5
                  MATRIX: 722->1|827->18|854->19|1203->342|1217->348|1273->384|1419->503|1434->509|1494->548|1550->578|1565->584|1635->633|1792->763|1807->769|1872->813|1929->843|1944->849|2011->895|2109->966|2137->967|2169->972|2321->1097|2349->1098|2381->1103|2409->1104|2441->1109|2512->1153|2540->1154|2568->1155|2637->1196|2666->1197|2699->1203|2789->1266|2817->1267|2854->1277|2922->1317|2951->1318|2987->1327|3045->1357|3074->1358|3113->1369|3242->1471|3271->1472|3338->1511|3367->1512|3406->1523|3479->1569|3508->1570|3544->1579|3572->1580|3655->1635|3684->1636|3720->1645|3779->1676|3808->1677|3847->1688|3976->1790|4005->1791|4072->1830|4101->1831|4140->1842|4214->1889|4243->1890|4279->1899|4307->1900|4443->2008|4472->2009|4505->2015|4851->2334|4879->2335|4999->2427|5028->2428|5064->2437|5207->2552|5236->2553|5274->2563|6059->3320|6088->3321|6122->3327|6151->3328|6180->3329|6415->3536|6431->3542|6495->3584|6539->3600|6555->3606|6618->3647|6706->3707|6722->3713|6783->3752|6860->3801|6876->3807|6932->3841|7009->3890|7025->3896|7084->3933|7156->3976|7186->3977|7216->3979|7348->4083|7364->4089|7422->4125|7489->4164|7518->4165|7547->4166|7589->4179|7619->4180|7650->4183|7828->4333|7857->4334|7888->4337|7924->4345|7954->4346|7985->4349|8218->4554|8247->4555|8277->4557|8422->4674|8438->4680|8501->4721|8651->4843|8667->4849|8730->4889|13070->9201|13100->9202|13130->9203|13166->9210|13196->9211|13226->9212|14046->10003|14076->10004|14106->10005|14149->10019|14179->10020|14209->10021|15244->11027|15274->11028|15304->11029|15348->11044|15378->11045|15408->11046|17165->12774|17195->12775|17232->12784|17347->12871|17376->12872|17470->12937|17500->12938|17537->12947|17652->13034|17681->13035|17766->13091|17796->13092|17829->13097|17900->13140|17929->13141|18148->13331|18178->13332|18215->13341|18274->13371|18304->13372|18344->13383|18474->13485|18504->13486|18572->13525|18602->13526|18642->13537|18716->13583|18746->13584|18783->13593|18812->13594|18887->13640|18917->13641|18954->13650|19014->13681|19044->13682|19084->13693|19214->13795|19244->13796|19312->13835|19342->13836|19382->13847|19457->13894|19487->13895|19524->13904|19553->13905|19747->14070|19777->14071|19814->14080|19875->14112|19905->14113|19947->14126|20072->14222|20102->14223|20148->14240|20221->14284|20251->14285|20289->14295|20319->14296|20352->14301|20381->14302|20486->14378|20516->14379|20550->14385|20581->14388|20610->14389|20642->14393|20751->14473|20781->14474|20814->14479|21150->14787|21179->14788|21211->14792|21241->14793|21277->14801|21356->14852|21385->14853|21419->14859|21517->14928|21547->14929|21580->14934|21918->15244|21947->15245|22006->15275|22036->15276|22079->15291|22446->15630|22475->15631|22504->15632|22537->15636|22567->15637|22600->15642|22661->15674|22691->15675|22725->15681|23082->16010|23111->16011|23144->16015|23174->16016|23208->16022|23291->16077|23320->16078|23353->16083|23382->16084|23423->16097|23521->16166|23551->16167|23589->16177|23925->16485|23954->16486|24013->16516|24043->16517|24086->16532|24453->16871|24482->16872|24515->16877|24547->16881|24577->16882|24617->16894|24678->16926|24708->16927|24743->16934|25104->17267|25133->17268|25166->17272|25196->17273|25231->17280|25315->17336|25344->17337|25378->17343|25407->17344|25444->17353|25542->17422|25572->17423|25610->17433|25944->17739|25973->17740|26005->17744|26035->17745|26071->17753|26151->17805|26180->17806|26222->17820|26462->18032|26492->18033|26541->18054|26570->18055|26603->18059|26633->18060|26668->18067|27012->18383|27041->18384|27081->18396|27130->18416|27160->18417|27209->18438|27238->18439|27271->18443|27301->18444|27336->18451|27680->18767|27709->18768|27743->18774|27786->18788|27816->18789|27846->18791|28177->19094|28206->19095|28239->19099|28269->19100|28304->19107|28385->19160|28414->19161|28451->19170|28547->19237|28577->19238|28609->19242|28951->19556|28980->19557|29012->19561|29044->19565|29073->19566|29108->19573|29187->19624|29216->19625|29259->19640|29373->19725|29403->19726|29439->19734|29783->20050|29812->20051|29844->20055|29873->20056|29908->20063|29988->20115|30017->20116|30056->20127|30182->20224|30212->20225|30246->20231|30589->20546|30618->20547|30650->20551|30679->20552|30710->20555|30790->20607|30819->20608|30850->20611|30981->20713|31011->20714|31045->20720|31391->21038|31420->21039|31452->21043|31481->21044|31512->21047|31596->21103|31625->21104|31656->21107|31786->21208|31816->21209|31850->21215|32196->21533|32225->21534|32257->21538|32286->21539|32317->21542|32401->21598|32430->21599|32462->21603|32573->21685|32603->21686|32637->21692|32971->21998|33000->21999|33059->22029|33089->22030|33123->22036|33479->22364|33508->22365|33540->22369|33572->22373|33601->22374|33632->22377|33693->22409|33723->22410|33755->22414|34104->22735|34133->22736|34165->22740|34194->22741|34226->22745|34307->22798|34336->22799|34367->22802|34396->22803|34426->22805|34464->22814|34494->22815|34526->22819|34577->22842|34606->22843|34636->22845|34681->22862|34710->22863|34749->22873|34779->22874|34815->22882|34844->22883|34885->22896|34914->22897|34952->22907|35007->22934|35023->22940|35095->22990
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|45->17|45->17|45->17|46->18|46->18|46->18|50->22|50->22|51->23|57->29|57->29|57->29|57->29|58->30|61->33|61->33|62->34|62->34|62->34|63->35|66->38|66->38|68->40|70->42|70->42|71->43|71->43|71->43|72->44|75->47|75->47|77->49|77->49|78->50|79->51|79->51|80->52|80->52|84->56|84->56|85->57|85->57|85->57|86->58|89->61|89->61|91->63|91->63|92->64|93->65|93->65|94->66|94->66|97->69|97->69|98->70|103->75|103->75|108->80|108->80|109->81|112->84|112->84|113->85|128->100|128->100|129->101|129->101|129->101|136->108|136->108|136->108|137->109|137->109|137->109|138->110|138->110|138->110|139->111|139->111|139->111|140->112|140->112|140->112|145->117|145->117|146->118|152->124|152->124|152->124|153->125|153->125|153->125|155->127|155->127|156->128|166->138|166->138|168->140|168->140|168->140|169->141|179->151|179->151|181->153|196->168|196->168|196->168|203->175|203->175|203->175|323->295|323->295|323->295|323->295|323->295|323->295|343->315|343->315|343->315|343->315|343->315|343->315|367->339|367->339|367->339|367->339|367->339|367->339|431->403|431->403|432->404|435->407|435->407|439->411|439->411|440->412|443->415|443->415|450->422|450->422|451->423|452->424|452->424|460->432|460->432|461->433|461->433|461->433|462->434|465->437|465->437|467->439|467->439|468->440|469->441|469->441|470->442|470->442|474->446|474->446|475->447|475->447|475->447|476->448|479->451|479->451|481->453|481->453|482->454|483->455|483->455|484->456|484->456|489->461|489->461|490->462|491->463|491->463|492->464|494->466|494->466|495->467|496->468|496->468|497->469|497->469|498->470|498->470|502->474|502->474|504->476|504->476|504->476|505->477|507->479|507->479|508->480|514->486|514->486|514->486|514->486|515->487|517->489|517->489|519->491|522->494|522->494|523->495|529->501|529->501|529->501|529->501|532->504|540->512|540->512|540->512|540->512|540->512|541->513|541->513|541->513|542->514|549->521|549->521|549->521|549->521|550->522|552->524|552->524|554->526|554->526|557->529|559->531|559->531|561->533|566->538|566->538|566->538|566->538|569->541|577->549|577->549|578->550|578->550|578->550|580->552|580->552|580->552|581->553|588->560|588->560|588->560|588->560|589->561|591->563|591->563|593->565|593->565|595->567|597->569|597->569|599->571|605->577|605->577|605->577|605->577|606->578|608->580|608->580|611->583|615->587|615->587|617->589|617->589|617->589|617->589|618->590|624->596|624->596|626->598|626->598|626->598|628->600|628->600|628->600|628->600|629->601|635->607|635->607|636->608|636->608|636->608|637->609|643->615|643->615|643->615|643->615|644->616|646->618|646->618|648->620|650->622|650->622|651->623|657->629|657->629|658->630|658->630|658->630|659->631|661->633|661->633|666->638|668->640|668->640|670->642|677->649|677->649|677->649|677->649|678->650|680->652|680->652|681->653|682->654|682->654|684->656|690->662|690->662|690->662|690->662|691->663|693->665|693->665|695->667|699->671|699->671|701->673|707->679|707->679|707->679|707->679|708->680|710->682|710->682|712->684|715->687|715->687|717->689|723->695|723->695|723->695|723->695|724->696|726->698|726->698|729->701|731->703|731->703|733->705|739->711|739->711|739->711|739->711|741->713|747->719|747->719|750->722|750->722|750->722|751->723|751->723|751->723|752->724|759->731|759->731|759->731|759->731|760->732|762->734|762->734|764->736|764->736|765->737|765->737|765->737|766->738|767->739|767->739|768->740|769->741|769->741|769->741|769->741|771->743|771->743|774->746|774->746|776->748|779->751|779->751|779->751
                  -- GENERATED --
              */
          