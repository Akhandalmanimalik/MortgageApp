
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
object plannerV extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*292.61*/("""{"""),format.raw/*292.62*/("""{"""),format.raw/*292.63*/("""company"""),format.raw/*292.70*/("""}"""),format.raw/*292.71*/("""}"""),format.raw/*292.72*/(""""> <br>
								<br>


								<div class="map_canvas"></div>

								<div class="form-group" ng-show="company == 'Company' " style="width: 280px">
									<label for="pwd"><Strong> Company Name  </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
									id="company"	name="company" class="form-control" >
									<div id="company1"></div>

								</div>

								<div class="form-group" ng-show="company == 'Company' " style="width: 280px">
									<label for="pwd"><Strong> Company Address </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input
										id="geocomplete" type="text" name="formatted_address"
										class="form-control" ng-model="companyAddress"
										placeholder="Enter Location" ng-required> <input
										type="hidden" name="companyAddress" value=""""),format.raw/*312.54*/("""{"""),format.raw/*312.55*/("""{"""),format.raw/*312.56*/("""companyAddress"""),format.raw/*312.70*/("""}"""),format.raw/*312.71*/("""}"""),format.raw/*312.72*/("""">
									<div id="formattedaddress1"></div>


								</div>
							</div>
						<div class="form-group" style="width: 100%">
								<label for="pwd"><Strong>From whom or how did you find out about Visdom Mortgage Solutions?  </Strong> <span style="color: red; font-size: 4">*</span>
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
    $(function() """),format.raw/*356.18*/("""{"""),format.raw/*356.19*/("""
        """),format.raw/*357.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*360.5*/("""}"""),format.raw/*360.6*/(""");
	
</script>
	<script type="text/javascript">
    $(function() """),format.raw/*364.18*/("""{"""),format.raw/*364.19*/("""
        """),format.raw/*365.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#brokerPhone").mask("999-999-9999");
    """),format.raw/*368.5*/("""}"""),format.raw/*368.6*/(""");
	
</script>



	<script>
$(document).ready(function()"""),format.raw/*375.29*/("""{"""),format.raw/*375.30*/("""
    """),format.raw/*376.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*377.1*/("""}"""),format.raw/*377.2*/(""");
</script>

	<script
		src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>

	<script src="jquery.geocomplete.js"></script>
	<script>
      $(function()"""),format.raw/*385.19*/("""{"""),format.raw/*385.20*/("""
        """),format.raw/*386.9*/("""$("#geocomplete").geocomplete("""),format.raw/*386.39*/("""{"""),format.raw/*386.40*/("""
          """),format.raw/*387.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*390.9*/("""}"""),format.raw/*390.10*/(""");

        $("#find").click(function()"""),format.raw/*392.36*/("""{"""),format.raw/*392.37*/("""
          """),format.raw/*393.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*394.9*/("""}"""),format.raw/*394.10*/(""");
      """),format.raw/*395.7*/("""}"""),format.raw/*395.8*/(""");
    </script>

	<script>
      $(function()"""),format.raw/*399.19*/("""{"""),format.raw/*399.20*/("""
        """),format.raw/*400.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*400.40*/("""{"""),format.raw/*400.41*/("""
          """),format.raw/*401.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*404.9*/("""}"""),format.raw/*404.10*/(""");

        $("#find").click(function()"""),format.raw/*406.36*/("""{"""),format.raw/*406.37*/("""
          """),format.raw/*407.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*408.9*/("""}"""),format.raw/*408.10*/(""");
      """),format.raw/*409.7*/("""}"""),format.raw/*409.8*/(""");
    </script>
	<script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*414.56*/("""{"""),format.raw/*414.57*/("""
        """),format.raw/*415.9*/("""init();
        function init() """),format.raw/*416.25*/("""{"""),format.raw/*416.26*/("""
            """),format.raw/*417.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*419.41*/("""{"""),format.raw/*419.42*/("""
                """),format.raw/*420.17*/("""console.log($scope.newItemType)
            """),format.raw/*421.13*/("""}"""),format.raw/*421.14*/(""";
        """),format.raw/*422.9*/("""}"""),format.raw/*422.10*/("""
    """),format.raw/*423.5*/("""}"""),format.raw/*423.6*/(""");
    </script>

	<script type="text/javascript">
 function validateForm() """),format.raw/*427.26*/("""{"""),format.raw/*427.27*/("""
	 
	 """),format.raw/*429.3*/("""try"""),format.raw/*429.6*/("""{"""),format.raw/*429.7*/("""
		"""),format.raw/*430.3*/("""var role=document.forms["myForm"]["role"].value;
		var value=true;
		if(!role)"""),format.raw/*432.12*/("""{"""),format.raw/*432.13*/("""
			"""),format.raw/*433.4*/("""document.getElementById("role1").innerHTML="<p style=\"color:red\">Please Select Role</p>";
			document.getElementById("role").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*439.3*/("""}"""),format.raw/*439.4*/("""else"""),format.raw/*439.8*/("""{"""),format.raw/*439.9*/("""
	    	"""),format.raw/*440.7*/("""document.getElementById("role1").innerHTML="";

		"""),format.raw/*442.3*/("""}"""),format.raw/*442.4*/(""" 

	 """),format.raw/*444.3*/("""var fname=document.forms["myForm"]["fname"].value;
	 

		if(!fname)"""),format.raw/*447.13*/("""{"""),format.raw/*447.14*/("""
			"""),format.raw/*448.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*454.3*/("""}"""),format.raw/*454.4*/("""else if(fname.trim().length<2)"""),format.raw/*454.34*/("""{"""),format.raw/*454.35*/("""
			
			
			"""),format.raw/*457.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName  Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*465.3*/("""}"""),format.raw/*465.4*/(""" """),format.raw/*465.5*/("""else"""),format.raw/*465.9*/("""{"""),format.raw/*465.10*/("""
			"""),format.raw/*466.4*/("""if(!fname.match(/^[a-zA-Z ]*$/))"""),format.raw/*466.36*/("""{"""),format.raw/*466.37*/("""
				"""),format.raw/*467.5*/("""document.getElementById("fname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
				document.getElementById("fname").focus();
				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


				value = false;

			"""),format.raw/*474.4*/("""}"""),format.raw/*474.5*/("""else"""),format.raw/*474.9*/("""{"""),format.raw/*474.10*/("""
				"""),format.raw/*475.5*/("""document.getElementById("fname1").innerHTML = "";

			"""),format.raw/*477.4*/("""}"""),format.raw/*477.5*/("""

		"""),format.raw/*479.3*/("""}"""),format.raw/*479.4*/(""" 
		
		
		"""),format.raw/*482.3*/("""var lname=document.forms["myForm"]["lname"].value;
		 
		if(!lname)"""),format.raw/*484.13*/("""{"""),format.raw/*484.14*/("""
			
			"""),format.raw/*486.4*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
			document.getElementById("lname").focus();
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*491.3*/("""}"""),format.raw/*491.4*/("""else if(lname.trim().length<2)"""),format.raw/*491.34*/("""{"""),format.raw/*491.35*/("""
			
			
			"""),format.raw/*494.4*/("""document.getElementById("lname").focus();

			document.getElementById("lname1").innerHTML="<p style=\"color:red\">Last  Name Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*502.3*/("""}"""),format.raw/*502.4*/("""
			"""),format.raw/*503.4*/("""else"""),format.raw/*503.8*/("""{"""),format.raw/*503.9*/("""
				
				"""),format.raw/*505.5*/("""if(!lname.match(/^[a-zA-Z ]*$/))"""),format.raw/*505.37*/("""{"""),format.raw/*505.38*/("""
					"""),format.raw/*506.6*/("""document.getElementById("lname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
					document.getElementById("lname").focus();
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


					value = false;

				"""),format.raw/*513.5*/("""}"""),format.raw/*513.6*/("""else"""),format.raw/*513.10*/("""{"""),format.raw/*513.11*/("""
					"""),format.raw/*514.6*/("""document.getElementById("lname1").innerHTML = "";

				"""),format.raw/*516.5*/("""}"""),format.raw/*516.6*/("""

			"""),format.raw/*518.4*/("""}"""),format.raw/*518.5*/(""" 
		
		
		
		
	 
		"""),format.raw/*524.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*526.13*/("""{"""),format.raw/*526.14*/("""
			
			"""),format.raw/*528.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*534.3*/("""}"""),format.raw/*534.4*/("""else"""),format.raw/*534.8*/("""{"""),format.raw/*534.9*/("""
	    	"""),format.raw/*535.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*537.3*/("""}"""),format.raw/*537.4*/("""
	 
	 
    """),format.raw/*540.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*544.24*/("""{"""),format.raw/*544.25*/("""         
		  
    """),format.raw/*546.5*/("""}"""),format.raw/*546.6*/("""else"""),format.raw/*546.10*/("""{"""),format.raw/*546.11*/("""   
		"""),format.raw/*547.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*553.5*/("""}"""),format.raw/*553.6*/("""
    
    """),format.raw/*555.5*/("""if(pattern.test(x2))"""),format.raw/*555.25*/("""{"""),format.raw/*555.26*/("""         
		  
    """),format.raw/*557.5*/("""}"""),format.raw/*557.6*/("""else"""),format.raw/*557.10*/("""{"""),format.raw/*557.11*/("""   
		"""),format.raw/*558.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email2").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*564.5*/("""}"""),format.raw/*564.6*/("""
    """),format.raw/*565.5*/("""if (x  != x2) """),format.raw/*565.19*/("""{"""),format.raw/*565.20*/("""
"""),format.raw/*566.1*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
document.getElementById("email").focus();

document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

value= false;
    """),format.raw/*572.5*/("""}"""),format.raw/*572.6*/("""else"""),format.raw/*572.10*/("""{"""),format.raw/*572.11*/("""
    	"""),format.raw/*573.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*575.5*/("""}"""),format.raw/*575.6*/("""
    
	"""),format.raw/*577.2*/("""var phone=document.forms["myForm"]["phone"].value;
	 
	if(!phone)"""),format.raw/*579.12*/("""{"""),format.raw/*579.13*/("""
		"""),format.raw/*580.3*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
		document.getElementById("phonedatata").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*586.2*/("""}"""),format.raw/*586.3*/("""	
	"""),format.raw/*587.2*/("""else"""),format.raw/*587.6*/("""{"""),format.raw/*587.7*/("""
    	"""),format.raw/*588.6*/("""document.getElementById("phone1").innerHTML="";

	"""),format.raw/*590.2*/("""}"""),format.raw/*590.3*/(""" 
    
	"""),format.raw/*592.2*/("""var feeTo=document.forms["myForm"]["feeTo"].value;

	if(!feeTo)"""),format.raw/*594.12*/("""{"""),format.raw/*594.13*/("""

		"""),format.raw/*596.3*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*596.58*/("""{"""),format.raw/*596.59*/("""
		"""),format.raw/*597.3*/("""document.getElementById("feeTo1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("feeTo").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*603.2*/("""}"""),format.raw/*603.3*/("""
	"""),format.raw/*604.2*/("""}"""),format.raw/*604.3*/("""else"""),format.raw/*604.7*/("""{"""),format.raw/*604.8*/("""
    	"""),format.raw/*605.6*/("""document.getElementById("feeTo1").innerHTML="";

	"""),format.raw/*607.2*/("""}"""),format.raw/*607.3*/("""
	
	
	
	
	
	"""),format.raw/*613.2*/("""//var role=document.forms["myForm"]["role"].value;
	var company=document.forms["myForm"]["company"].value;

	
	
if(!company)"""),format.raw/*618.13*/("""{"""),format.raw/*618.14*/("""
	"""),format.raw/*619.2*/("""if(role == 'Financial Planner' && feeTo == 'Company' )"""),format.raw/*619.56*/("""{"""),format.raw/*619.57*/("""
		"""),format.raw/*620.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*626.2*/("""}"""),format.raw/*626.3*/("""
	"""),format.raw/*627.2*/("""}"""),format.raw/*627.3*/("""else if(role == 'Financial Planner'  && feeTo == 'Company' && company.trim().length <2 )"""),format.raw/*627.91*/("""{"""),format.raw/*627.92*/("""
		"""),format.raw/*628.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">Company Name Should be more than one letter</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*634.2*/("""}"""),format.raw/*634.3*/("""else"""),format.raw/*634.7*/("""{"""),format.raw/*634.8*/("""
    	"""),format.raw/*635.6*/("""document.getElementById("company1").innerHTML="";

	"""),format.raw/*637.2*/("""}"""),format.raw/*637.3*/("""

"""),format.raw/*639.1*/("""//var formattedaddress=document.forms["myForm"]["companyAddress"].value;
var companyAddress=document.forms["myForm"]["companyAddress"].value;


if(!companyAddress)"""),format.raw/*643.20*/("""{"""),format.raw/*643.21*/("""
	"""),format.raw/*644.2*/("""if(role == 'Financial Planner' && feeTo == 'Company')"""),format.raw/*644.55*/("""{"""),format.raw/*644.56*/("""

		"""),format.raw/*646.3*/("""document.getElementById("formattedaddress1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("geocomplete").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*652.2*/("""}"""),format.raw/*652.3*/("""
	"""),format.raw/*653.2*/("""}"""),format.raw/*653.3*/("""else"""),format.raw/*653.7*/("""{"""),format.raw/*653.8*/("""
    	"""),format.raw/*654.6*/("""document.getElementById("formattedaddress1").innerHTML="";

	"""),format.raw/*656.2*/("""}"""),format.raw/*656.3*/("""
	

	
	


"""),format.raw/*663.1*/("""var refer=document.forms["myForm"]["refer"].value;

if(!refer&& role== 'Realtor')"""),format.raw/*665.30*/("""{"""),format.raw/*665.31*/("""
	
	"""),format.raw/*667.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*673.1*/("""}"""),format.raw/*673.2*/("""else if(refer.trim().length<2)"""),format.raw/*673.32*/("""{"""),format.raw/*673.33*/("""
	
	"""),format.raw/*675.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">Referrar Name Should be more than one letter </p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*681.1*/("""}"""),format.raw/*681.2*/("""


"""),format.raw/*684.1*/("""else"""),format.raw/*684.5*/("""{"""),format.raw/*684.6*/("""
	"""),format.raw/*685.2*/("""if(!refer.match(/^[a-zA-Z ]*$/))"""),format.raw/*685.34*/("""{"""),format.raw/*685.35*/("""
		"""),format.raw/*686.3*/("""document.getElementById("refer1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("refer").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*693.2*/("""}"""),format.raw/*693.3*/("""else"""),format.raw/*693.7*/("""{"""),format.raw/*693.8*/("""
		"""),format.raw/*694.3*/("""document.getElementById("refer1").innerHTML = "";

	"""),format.raw/*696.2*/("""}"""),format.raw/*696.3*/("""

"""),format.raw/*698.1*/("""}"""),format.raw/*698.2*/("""


"""),format.raw/*701.1*/("""if(value)"""),format.raw/*701.10*/("""{"""),format.raw/*701.11*/("""
	 """),format.raw/*702.3*/("""$('#loading').show();
"""),format.raw/*703.1*/("""}"""),format.raw/*703.2*/("""
"""),format.raw/*704.1*/("""return value;
	 """),format.raw/*705.3*/("""}"""),format.raw/*705.4*/("""catch(err)"""),format.raw/*705.14*/("""{"""),format.raw/*705.15*/("""
		
	 """),format.raw/*707.3*/("""}"""),format.raw/*707.4*/("""
    
 """),format.raw/*709.2*/("""}"""),format.raw/*709.3*/("""
    
    """),format.raw/*711.5*/("""</script>


	<script src=""""),_display_(/*714.16*/routes/*714.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*714.72*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:23 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/plannerV.scala.html
                  HASH: a4ab346cb536ed6ca4600df5060dbed05bd15a63
                  MATRIX: 726->1|831->18|858->19|1207->342|1221->348|1277->384|1423->503|1438->509|1498->548|1554->578|1569->584|1639->633|1794->761|1809->767|1874->811|1931->841|1946->847|2013->893|2111->964|2139->965|2171->970|2323->1095|2351->1096|2383->1101|2411->1102|2443->1107|2514->1151|2542->1152|2570->1153|2639->1194|2668->1195|2701->1201|2791->1264|2819->1265|2856->1275|2924->1315|2953->1316|2989->1325|3047->1355|3076->1356|3115->1367|3244->1469|3273->1470|3340->1509|3369->1510|3408->1521|3481->1567|3510->1568|3546->1577|3574->1578|3657->1633|3686->1634|3722->1643|3781->1674|3810->1675|3849->1686|3978->1788|4007->1789|4074->1828|4103->1829|4142->1840|4216->1887|4245->1888|4281->1897|4309->1898|4445->2006|4474->2007|4507->2013|4853->2332|4881->2333|5001->2425|5030->2426|5066->2435|5209->2550|5238->2551|5276->2561|6060->3318|6088->3319|6122->3325|6151->3326|6180->3327|6412->3531|6428->3537|6492->3579|6536->3595|6552->3601|6615->3642|6703->3702|6719->3708|6780->3747|6857->3796|6873->3802|6929->3836|7006->3885|7022->3891|7081->3928|7153->3971|7183->3972|7213->3974|7345->4078|7361->4084|7419->4120|7486->4159|7515->4160|7544->4161|7586->4174|7616->4175|7647->4178|7825->4328|7854->4329|7885->4332|7921->4340|7951->4341|7982->4344|8215->4549|8244->4550|8274->4552|8421->4671|8437->4677|8500->4718|8650->4840|8666->4846|8729->4886|13068->9197|13098->9198|13128->9199|13164->9206|13194->9207|13224->9208|14111->10066|14141->10067|14171->10068|14214->10082|14244->10083|14274->10084|15256->11037|15286->11038|15323->11047|15438->11134|15467->11135|15561->11200|15591->11201|15628->11210|15743->11297|15772->11298|15857->11354|15887->11355|15920->11360|15991->11403|16020->11404|16239->11594|16269->11595|16306->11604|16365->11634|16395->11635|16435->11646|16565->11748|16595->11749|16663->11788|16693->11789|16733->11800|16807->11846|16837->11847|16874->11856|16903->11857|16978->11903|17008->11904|17045->11913|17105->11944|17135->11945|17175->11956|17305->12058|17335->12059|17403->12098|17433->12099|17473->12110|17548->12157|17578->12158|17615->12167|17644->12168|17838->12333|17868->12334|17905->12343|17966->12375|17996->12376|18038->12389|18163->12485|18193->12486|18239->12503|18312->12547|18342->12548|18380->12558|18410->12559|18443->12564|18472->12565|18577->12641|18607->12642|18641->12648|18672->12651|18701->12652|18732->12655|18839->12733|18869->12734|18901->12738|19233->13042|19262->13043|19294->13047|19323->13048|19358->13055|19436->13105|19465->13106|19498->13111|19594->13178|19624->13179|19656->13183|19990->13489|20019->13490|20078->13520|20108->13521|20148->13533|20509->13866|20538->13867|20567->13868|20599->13872|20629->13873|20661->13877|20722->13909|20752->13910|20785->13915|21138->14240|21167->14241|21199->14245|21229->14246|21262->14251|21344->14305|21373->14306|21405->14310|21434->14311|21472->14321|21568->14388|21598->14389|21634->14397|21966->14701|21995->14702|22054->14732|22084->14733|22124->14745|22485->15078|22514->15079|22546->15083|22578->15087|22607->15088|22645->15098|22706->15130|22736->15131|22770->15137|23127->15466|23156->15467|23189->15471|23219->15472|23253->15478|23336->15533|23365->15534|23398->15539|23427->15540|23474->15559|23570->15626|23600->15627|23636->15635|23966->15937|23995->15938|24027->15942|24056->15943|24091->15950|24170->16001|24199->16002|24238->16013|24475->16222|24505->16223|24552->16242|24581->16243|24614->16247|24644->16248|24678->16254|25018->16566|25047->16567|25085->16577|25134->16597|25164->16598|25211->16617|25240->16618|25273->16622|25303->16623|25337->16629|25677->16941|25706->16942|25739->16947|25782->16961|25812->16962|25841->16963|26168->17262|26197->17263|26230->17267|26260->17268|26294->17274|26374->17326|26403->17327|26438->17334|26532->17399|26562->17400|26593->17403|26931->17713|26960->17714|26991->17717|27023->17721|27052->17722|27086->17728|27164->17778|27193->17779|27229->17787|27321->17850|27351->17851|27383->17855|27467->17910|27497->17911|27528->17914|27862->18220|27891->18221|27921->18223|27950->18224|27982->18228|28011->18229|28045->18235|28123->18285|28152->18286|28192->18298|28345->18422|28375->18423|28405->18425|28488->18479|28518->18480|28549->18483|28887->18793|28916->18794|28946->18796|28975->18797|29092->18885|29122->18886|29153->18889|29512->19220|29541->19221|29573->19225|29602->19226|29636->19232|29716->19284|29745->19285|29775->19287|29967->19450|29997->19451|30027->19453|30109->19506|30139->19507|30171->19511|30522->19834|30551->19835|30581->19837|30610->19838|30642->19842|30671->19843|30705->19849|30794->19910|30823->19911|30861->19921|30971->20002|31001->20003|31033->20007|31363->20309|31392->20310|31451->20340|31481->20341|31513->20345|31865->20669|31894->20670|31925->20673|31957->20677|31986->20678|32016->20680|32077->20712|32107->20713|32138->20716|32483->21033|32512->21034|32544->21038|32573->21039|32604->21042|32684->21094|32713->21095|32743->21097|32772->21098|32803->21101|32841->21110|32871->21111|32902->21114|32952->21136|32981->21137|33010->21138|33054->21154|33083->21155|33122->21165|33152->21166|33186->21172|33215->21173|33250->21180|33279->21181|33317->21191|33372->21218|33388->21224|33460->21274
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|44->16|44->16|44->16|45->17|45->17|45->17|49->21|49->21|50->22|56->28|56->28|56->28|56->28|57->29|60->32|60->32|61->33|61->33|61->33|62->34|65->37|65->37|67->39|69->41|69->41|70->42|70->42|70->42|71->43|74->46|74->46|76->48|76->48|77->49|78->50|78->50|79->51|79->51|83->55|83->55|84->56|84->56|84->56|85->57|88->60|88->60|90->62|90->62|91->63|92->64|92->64|93->65|93->65|96->68|96->68|97->69|102->74|102->74|107->79|107->79|108->80|111->83|111->83|112->84|127->99|127->99|128->100|128->100|128->100|133->105|133->105|133->105|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|137->109|137->109|137->109|142->114|142->114|143->115|149->121|149->121|149->121|150->122|150->122|150->122|152->124|152->124|153->125|163->135|163->135|165->137|165->137|165->137|166->138|176->148|176->148|178->150|194->166|194->166|194->166|200->172|200->172|200->172|320->292|320->292|320->292|320->292|320->292|320->292|340->312|340->312|340->312|340->312|340->312|340->312|384->356|384->356|385->357|388->360|388->360|392->364|392->364|393->365|396->368|396->368|403->375|403->375|404->376|405->377|405->377|413->385|413->385|414->386|414->386|414->386|415->387|418->390|418->390|420->392|420->392|421->393|422->394|422->394|423->395|423->395|427->399|427->399|428->400|428->400|428->400|429->401|432->404|432->404|434->406|434->406|435->407|436->408|436->408|437->409|437->409|442->414|442->414|443->415|444->416|444->416|445->417|447->419|447->419|448->420|449->421|449->421|450->422|450->422|451->423|451->423|455->427|455->427|457->429|457->429|457->429|458->430|460->432|460->432|461->433|467->439|467->439|467->439|467->439|468->440|470->442|470->442|472->444|475->447|475->447|476->448|482->454|482->454|482->454|482->454|485->457|493->465|493->465|493->465|493->465|493->465|494->466|494->466|494->466|495->467|502->474|502->474|502->474|502->474|503->475|505->477|505->477|507->479|507->479|510->482|512->484|512->484|514->486|519->491|519->491|519->491|519->491|522->494|530->502|530->502|531->503|531->503|531->503|533->505|533->505|533->505|534->506|541->513|541->513|541->513|541->513|542->514|544->516|544->516|546->518|546->518|552->524|554->526|554->526|556->528|562->534|562->534|562->534|562->534|563->535|565->537|565->537|568->540|572->544|572->544|574->546|574->546|574->546|574->546|575->547|581->553|581->553|583->555|583->555|583->555|585->557|585->557|585->557|585->557|586->558|592->564|592->564|593->565|593->565|593->565|594->566|600->572|600->572|600->572|600->572|601->573|603->575|603->575|605->577|607->579|607->579|608->580|614->586|614->586|615->587|615->587|615->587|616->588|618->590|618->590|620->592|622->594|622->594|624->596|624->596|624->596|625->597|631->603|631->603|632->604|632->604|632->604|632->604|633->605|635->607|635->607|641->613|646->618|646->618|647->619|647->619|647->619|648->620|654->626|654->626|655->627|655->627|655->627|655->627|656->628|662->634|662->634|662->634|662->634|663->635|665->637|665->637|667->639|671->643|671->643|672->644|672->644|672->644|674->646|680->652|680->652|681->653|681->653|681->653|681->653|682->654|684->656|684->656|691->663|693->665|693->665|695->667|701->673|701->673|701->673|701->673|703->675|709->681|709->681|712->684|712->684|712->684|713->685|713->685|713->685|714->686|721->693|721->693|721->693|721->693|722->694|724->696|724->696|726->698|726->698|729->701|729->701|729->701|730->702|731->703|731->703|732->704|733->705|733->705|733->705|733->705|735->707|735->707|737->709|737->709|739->711|742->714|742->714|742->714
                  -- GENERATED --
              */
          