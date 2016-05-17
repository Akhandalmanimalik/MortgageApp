
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
object professionalV extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
<div ng-controller="DemoController" ng-init="newItemType='Professional'">
					 <input type="hidden" name="ip" value="" id="ip">	
					
				
												<div id="role1"></div>
				
						
					
				
				  <div id="text_48" class="form-html">
<iframe src="//fast.wistia.net/embed/iframe/4kbavt9xtq?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="360"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script>
          </div>
          <br>
						
						
					
					<input type="hidden" id="role" name="role" ng-model="newItemType" value="Professional" ng-required>

						
						

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
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*298.61*/("""{"""),format.raw/*298.62*/("""{"""),format.raw/*298.63*/("""company"""),format.raw/*298.70*/("""}"""),format.raw/*298.71*/("""}"""),format.raw/*298.72*/(""""> <br>
								<br>


								<div class="map_canvas"></div>

								<div class="form-group" ng-show="company == 'Company' " style="width: 280px">
									<label for="pwd"><Strong> Company Name </Strong><span
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
										type="hidden" name="companyAddress" value=""""),format.raw/*318.54*/("""{"""),format.raw/*318.55*/("""{"""),format.raw/*318.56*/("""companyAddress"""),format.raw/*318.70*/("""}"""),format.raw/*318.71*/("""}"""),format.raw/*318.72*/("""">
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

								<input type="submit" style="width:280px" class="btn btn-primary "
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

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">First Name Should More than one letter</p>";
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
		
		"""),format.raw/*489.3*/("""var lname=document.forms["myForm"]["lname"].value;
		 
		if(!lname)"""),format.raw/*491.13*/("""{"""),format.raw/*491.14*/("""
			
			"""),format.raw/*493.4*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
			document.getElementById("lname").focus();
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*498.3*/("""}"""),format.raw/*498.4*/("""else if(lname.trim().length<2)"""),format.raw/*498.34*/("""{"""),format.raw/*498.35*/("""
			
			
			"""),format.raw/*501.4*/("""document.getElementById("lname").focus();

			document.getElementById("lname1").innerHTML="<p style=\"color:red\">Last  Name Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*509.3*/("""}"""),format.raw/*509.4*/("""
			"""),format.raw/*510.4*/("""else"""),format.raw/*510.8*/("""{"""),format.raw/*510.9*/("""
				
				"""),format.raw/*512.5*/("""if(!lname.match(/^[a-zA-Z ]*$/))"""),format.raw/*512.37*/("""{"""),format.raw/*512.38*/("""
					"""),format.raw/*513.6*/("""document.getElementById("lname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
					document.getElementById("lname").focus();
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


					value = false;

				"""),format.raw/*520.5*/("""}"""),format.raw/*520.6*/("""else"""),format.raw/*520.10*/("""{"""),format.raw/*520.11*/("""
					"""),format.raw/*521.6*/("""document.getElementById("lname1").innerHTML = "";

				"""),format.raw/*523.5*/("""}"""),format.raw/*523.6*/("""

			"""),format.raw/*525.4*/("""}"""),format.raw/*525.5*/(""" 
		
		"""),format.raw/*527.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*529.13*/("""{"""),format.raw/*529.14*/("""
			
			"""),format.raw/*531.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*537.3*/("""}"""),format.raw/*537.4*/("""else"""),format.raw/*537.8*/("""{"""),format.raw/*537.9*/("""
	    	"""),format.raw/*538.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*540.3*/("""}"""),format.raw/*540.4*/("""
	 
	 
    """),format.raw/*543.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*547.24*/("""{"""),format.raw/*547.25*/("""         
		  
    """),format.raw/*549.5*/("""}"""),format.raw/*549.6*/("""else"""),format.raw/*549.10*/("""{"""),format.raw/*549.11*/("""   
		"""),format.raw/*550.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*556.5*/("""}"""),format.raw/*556.6*/("""
    
    """),format.raw/*558.5*/("""if(pattern.test(x2))"""),format.raw/*558.25*/("""{"""),format.raw/*558.26*/("""         
		  
    """),format.raw/*560.5*/("""}"""),format.raw/*560.6*/("""else"""),format.raw/*560.10*/("""{"""),format.raw/*560.11*/("""   
		"""),format.raw/*561.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email2").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*567.5*/("""}"""),format.raw/*567.6*/("""
    """),format.raw/*568.5*/("""if (x  != x2) """),format.raw/*568.19*/("""{"""),format.raw/*568.20*/("""
"""),format.raw/*569.1*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
document.getElementById("email").focus();

document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

    	value= false;
    """),format.raw/*575.5*/("""}"""),format.raw/*575.6*/("""else"""),format.raw/*575.10*/("""{"""),format.raw/*575.11*/("""
    	"""),format.raw/*576.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*578.5*/("""}"""),format.raw/*578.6*/("""
    
	"""),format.raw/*580.2*/("""var phone=document.forms["myForm"]["phone"].value;
	 
	if(!phone)"""),format.raw/*582.12*/("""{"""),format.raw/*582.13*/("""
		"""),format.raw/*583.3*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
		document.getElementById("phonedatata").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*589.2*/("""}"""),format.raw/*589.3*/("""	
	"""),format.raw/*590.2*/("""else"""),format.raw/*590.6*/("""{"""),format.raw/*590.7*/("""
    	"""),format.raw/*591.6*/("""document.getElementById("phone1").innerHTML="";

	"""),format.raw/*593.2*/("""}"""),format.raw/*593.3*/(""" 
    
	"""),format.raw/*595.2*/("""var feeTo=document.forms["myForm"]["feeTo"].value;

	if(!feeTo)"""),format.raw/*597.12*/("""{"""),format.raw/*597.13*/("""

		"""),format.raw/*599.3*/("""if(  role=='Professional')"""),format.raw/*599.29*/("""{"""),format.raw/*599.30*/("""
		"""),format.raw/*600.3*/("""document.getElementById("feeTo1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("feeTo").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*606.2*/("""}"""),format.raw/*606.3*/("""
	"""),format.raw/*607.2*/("""}"""),format.raw/*607.3*/("""else"""),format.raw/*607.7*/("""{"""),format.raw/*607.8*/("""
    	"""),format.raw/*608.6*/("""document.getElementById("feeTo1").innerHTML="";

	"""),format.raw/*610.2*/("""}"""),format.raw/*610.3*/("""
	
	
	
	
	
	"""),format.raw/*616.2*/("""//var role=document.forms["myForm"]["role"].value;
	var company=document.forms["myForm"]["company"].value;

	
	
if(!company)"""),format.raw/*621.13*/("""{"""),format.raw/*621.14*/("""
	"""),format.raw/*622.2*/("""if(  role=='Professional' && feeTo == 'Company')"""),format.raw/*622.50*/("""{"""),format.raw/*622.51*/("""
		"""),format.raw/*623.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*629.2*/("""}"""),format.raw/*629.3*/("""
"""),format.raw/*630.1*/("""}"""),format.raw/*630.2*/("""else if(role == 'Professional'  && feeTo == 'Company' && company.trim().length <2 )"""),format.raw/*630.85*/("""{"""),format.raw/*630.86*/("""
	"""),format.raw/*631.2*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">Company Name Should be more than one letter</p>";
	document.getElementById("company").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*637.1*/("""}"""),format.raw/*637.2*/("""else"""),format.raw/*637.6*/("""{"""),format.raw/*637.7*/("""
	"""),format.raw/*638.2*/("""document.getElementById("company1").innerHTML="";

"""),format.raw/*640.1*/("""}"""),format.raw/*640.2*/("""



"""),format.raw/*644.1*/("""//var formattedaddress=document.forms["myForm"]["companyAddress"].value;
var companyAddress=document.forms["myForm"]["companyAddress"].value;


if(!companyAddress)"""),format.raw/*648.20*/("""{"""),format.raw/*648.21*/("""
	"""),format.raw/*649.2*/("""if(  role=='Professional' && feeTo == 'Company')"""),format.raw/*649.50*/("""{"""),format.raw/*649.51*/("""

		"""),format.raw/*651.3*/("""document.getElementById("formattedaddress1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("geocomplete").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*657.2*/("""}"""),format.raw/*657.3*/("""
	"""),format.raw/*658.2*/("""}"""),format.raw/*658.3*/("""else"""),format.raw/*658.7*/("""{"""),format.raw/*658.8*/("""
    	"""),format.raw/*659.6*/("""document.getElementById("formattedaddress1").innerHTML="";

	"""),format.raw/*661.2*/("""}"""),format.raw/*661.3*/("""
	

	
	

"""),format.raw/*667.1*/("""var refer=document.forms["myForm"]["refer"].value;

if(!refer)"""),format.raw/*669.11*/("""{"""),format.raw/*669.12*/("""
	
	"""),format.raw/*671.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*677.1*/("""}"""),format.raw/*677.2*/("""else if(refer.trim().length<2)"""),format.raw/*677.32*/("""{"""),format.raw/*677.33*/("""
	
	"""),format.raw/*679.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">Referrar Name Should be more than one letter </p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*685.1*/("""}"""),format.raw/*685.2*/("""


"""),format.raw/*688.1*/("""else"""),format.raw/*688.5*/("""{"""),format.raw/*688.6*/("""
	"""),format.raw/*689.2*/("""if(!refer.match(/^[a-zA-Z ]*$/))"""),format.raw/*689.34*/("""{"""),format.raw/*689.35*/("""
		"""),format.raw/*690.3*/("""document.getElementById("refer1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("refer").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*697.2*/("""}"""),format.raw/*697.3*/("""else"""),format.raw/*697.7*/("""{"""),format.raw/*697.8*/("""
		"""),format.raw/*698.3*/("""document.getElementById("refer1").innerHTML = "";

	"""),format.raw/*700.2*/("""}"""),format.raw/*700.3*/("""

"""),format.raw/*702.1*/("""}"""),format.raw/*702.2*/("""
"""),format.raw/*703.1*/("""if(value)"""),format.raw/*703.10*/("""{"""),format.raw/*703.11*/("""
	 """),format.raw/*704.3*/("""$('#loading').show();
"""),format.raw/*705.1*/("""}"""),format.raw/*705.2*/("""
"""),format.raw/*706.1*/("""return value;
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
                  DATE: Mon May 16 20:16:28 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/professionalV.scala.html
                  HASH: 47f2ef7cbcdec0de59325c3a7a4a9b80e6f6d1f6
                  MATRIX: 731->1|836->18|863->19|1212->342|1226->348|1282->384|1428->503|1443->509|1503->548|1559->578|1574->584|1644->633|1799->761|1814->767|1879->811|1936->841|1951->847|2018->893|2116->964|2144->965|2176->970|2328->1095|2356->1096|2388->1101|2416->1102|2448->1107|2519->1151|2547->1152|2575->1153|2644->1194|2673->1195|2706->1201|2796->1264|2824->1265|2861->1275|2929->1315|2958->1316|2994->1325|3052->1355|3081->1356|3120->1367|3249->1469|3278->1470|3345->1509|3374->1510|3413->1521|3486->1567|3515->1568|3551->1577|3579->1578|3662->1633|3691->1634|3727->1643|3786->1674|3815->1675|3854->1686|3983->1788|4012->1789|4079->1828|4108->1829|4147->1840|4221->1887|4250->1888|4286->1897|4314->1898|4450->2006|4479->2007|4512->2013|4858->2332|4886->2333|5006->2425|5035->2426|5071->2435|5214->2550|5243->2551|5281->2561|6065->3318|6093->3319|6127->3325|6156->3326|6185->3327|6417->3531|6433->3537|6497->3579|6541->3595|6557->3601|6620->3642|6708->3702|6724->3708|6785->3747|6862->3796|6878->3802|6934->3836|7011->3885|7027->3891|7086->3928|7158->3971|7188->3972|7218->3974|7350->4078|7366->4084|7424->4120|7491->4159|7520->4160|7549->4161|7591->4174|7621->4175|7652->4178|7830->4328|7859->4329|7890->4332|7926->4340|7956->4341|7987->4344|8220->4549|8249->4550|8279->4552|8426->4671|8442->4677|8505->4718|8655->4840|8671->4846|8734->4886|13108->9232|13138->9233|13168->9234|13204->9241|13234->9242|13264->9243|14150->10100|14180->10101|14210->10102|14253->10116|14283->10117|14313->10118|15311->11087|15341->11088|15378->11097|15493->11184|15522->11185|15616->11250|15646->11251|15683->11260|15798->11347|15827->11348|15912->11404|15942->11405|15975->11410|16046->11453|16075->11454|16294->11644|16324->11645|16361->11654|16420->11684|16450->11685|16490->11696|16620->11798|16650->11799|16718->11838|16748->11839|16788->11850|16862->11896|16892->11897|16929->11906|16958->11907|17033->11953|17063->11954|17100->11963|17160->11994|17190->11995|17230->12006|17360->12108|17390->12109|17458->12148|17488->12149|17528->12160|17603->12207|17633->12208|17670->12217|17699->12218|17893->12383|17923->12384|17960->12393|18021->12425|18051->12426|18093->12439|18218->12535|18248->12536|18294->12553|18367->12597|18397->12598|18435->12608|18465->12609|18498->12614|18527->12615|18632->12691|18662->12692|18696->12698|18727->12701|18756->12702|18787->12705|18894->12783|18924->12784|18956->12788|19288->13092|19317->13093|19349->13097|19378->13098|19413->13105|19491->13155|19520->13156|19553->13161|19649->13228|19679->13229|19711->13233|20045->13539|20074->13540|20133->13570|20163->13571|20203->13583|20564->13916|20593->13917|20622->13918|20654->13922|20684->13923|20716->13927|20777->13959|20807->13960|20840->13965|21193->14290|21222->14291|21254->14295|21284->14296|21317->14301|21399->14355|21428->14356|21460->14360|21489->14361|21524->14368|21620->14435|21650->14436|21686->14444|22018->14748|22047->14749|22106->14779|22136->14780|22176->14792|22537->15125|22566->15126|22598->15130|22630->15134|22659->15135|22697->15145|22758->15177|22788->15178|22822->15184|23179->15513|23208->15514|23241->15518|23271->15519|23305->15525|23388->15580|23417->15581|23450->15586|23479->15587|23514->15594|23610->15661|23640->15662|23676->15670|24006->15972|24035->15973|24067->15977|24096->15978|24131->15985|24210->16036|24239->16037|24278->16048|24515->16257|24545->16258|24592->16277|24621->16278|24654->16282|24684->16283|24718->16289|25058->16601|25087->16602|25125->16612|25174->16632|25204->16633|25251->16652|25280->16653|25313->16657|25343->16658|25377->16664|25717->16976|25746->16977|25779->16982|25822->16996|25852->16997|25881->16998|26213->17302|26242->17303|26275->17307|26305->17308|26339->17314|26419->17366|26448->17367|26483->17374|26577->17439|26607->17440|26638->17443|26976->17753|27005->17754|27036->17757|27068->17761|27097->17762|27131->17768|27209->17818|27238->17819|27274->17827|27366->17890|27396->17891|27428->17895|27483->17921|27513->17922|27544->17925|27878->18231|27907->18232|27937->18234|27966->18235|27998->18239|28027->18240|28061->18246|28139->18296|28168->18297|28208->18309|28361->18433|28391->18434|28421->18436|28498->18484|28528->18485|28559->18488|28897->18798|28926->18799|28955->18800|28984->18801|29096->18884|29126->18885|29156->18887|29511->19214|29540->19215|29572->19219|29601->19220|29631->19222|29710->19273|29739->19274|29771->19278|29963->19441|29993->19442|30023->19444|30100->19492|30130->19493|30162->19497|30513->19820|30542->19821|30572->19823|30601->19824|30633->19828|30662->19829|30696->19835|30785->19896|30814->19897|30851->19906|30942->19968|30972->19969|31004->19973|31334->20275|31363->20276|31422->20306|31452->20307|31484->20311|31836->20635|31865->20636|31896->20639|31928->20643|31957->20644|31987->20646|32048->20678|32078->20679|32109->20682|32454->20999|32483->21000|32515->21004|32544->21005|32575->21008|32655->21060|32684->21061|32714->21063|32743->21064|32772->21065|32810->21074|32840->21075|32871->21078|32921->21100|32950->21101|32979->21102|33023->21118|33052->21119|33091->21129|33121->21130|33155->21136|33184->21137|33219->21144|33248->21145|33286->21155|33341->21182|33357->21188|33429->21238
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|44->16|44->16|44->16|45->17|45->17|45->17|49->21|49->21|50->22|56->28|56->28|56->28|56->28|57->29|60->32|60->32|61->33|61->33|61->33|62->34|65->37|65->37|67->39|69->41|69->41|70->42|70->42|70->42|71->43|74->46|74->46|76->48|76->48|77->49|78->50|78->50|79->51|79->51|83->55|83->55|84->56|84->56|84->56|85->57|88->60|88->60|90->62|90->62|91->63|92->64|92->64|93->65|93->65|96->68|96->68|97->69|102->74|102->74|107->79|107->79|108->80|111->83|111->83|112->84|127->99|127->99|128->100|128->100|128->100|133->105|133->105|133->105|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|137->109|137->109|137->109|142->114|142->114|143->115|149->121|149->121|149->121|150->122|150->122|150->122|152->124|152->124|153->125|163->135|163->135|165->137|165->137|165->137|166->138|176->148|176->148|178->150|194->166|194->166|194->166|200->172|200->172|200->172|326->298|326->298|326->298|326->298|326->298|326->298|346->318|346->318|346->318|346->318|346->318|346->318|392->364|392->364|393->365|396->368|396->368|400->372|400->372|401->373|404->376|404->376|411->383|411->383|412->384|413->385|413->385|421->393|421->393|422->394|422->394|422->394|423->395|426->398|426->398|428->400|428->400|429->401|430->402|430->402|431->403|431->403|435->407|435->407|436->408|436->408|436->408|437->409|440->412|440->412|442->414|442->414|443->415|444->416|444->416|445->417|445->417|450->422|450->422|451->423|452->424|452->424|453->425|455->427|455->427|456->428|457->429|457->429|458->430|458->430|459->431|459->431|463->435|463->435|465->437|465->437|465->437|466->438|468->440|468->440|469->441|475->447|475->447|475->447|475->447|476->448|478->450|478->450|480->452|483->455|483->455|484->456|490->462|490->462|490->462|490->462|493->465|501->473|501->473|501->473|501->473|501->473|502->474|502->474|502->474|503->475|510->482|510->482|510->482|510->482|511->483|513->485|513->485|515->487|515->487|517->489|519->491|519->491|521->493|526->498|526->498|526->498|526->498|529->501|537->509|537->509|538->510|538->510|538->510|540->512|540->512|540->512|541->513|548->520|548->520|548->520|548->520|549->521|551->523|551->523|553->525|553->525|555->527|557->529|557->529|559->531|565->537|565->537|565->537|565->537|566->538|568->540|568->540|571->543|575->547|575->547|577->549|577->549|577->549|577->549|578->550|584->556|584->556|586->558|586->558|586->558|588->560|588->560|588->560|588->560|589->561|595->567|595->567|596->568|596->568|596->568|597->569|603->575|603->575|603->575|603->575|604->576|606->578|606->578|608->580|610->582|610->582|611->583|617->589|617->589|618->590|618->590|618->590|619->591|621->593|621->593|623->595|625->597|625->597|627->599|627->599|627->599|628->600|634->606|634->606|635->607|635->607|635->607|635->607|636->608|638->610|638->610|644->616|649->621|649->621|650->622|650->622|650->622|651->623|657->629|657->629|658->630|658->630|658->630|658->630|659->631|665->637|665->637|665->637|665->637|666->638|668->640|668->640|672->644|676->648|676->648|677->649|677->649|677->649|679->651|685->657|685->657|686->658|686->658|686->658|686->658|687->659|689->661|689->661|695->667|697->669|697->669|699->671|705->677|705->677|705->677|705->677|707->679|713->685|713->685|716->688|716->688|716->688|717->689|717->689|717->689|718->690|725->697|725->697|725->697|725->697|726->698|728->700|728->700|730->702|730->702|731->703|731->703|731->703|732->704|733->705|733->705|734->706|735->707|735->707|735->707|735->707|737->709|737->709|739->711|739->711|741->713|744->716|744->716|744->716
                  -- GENERATED --
              */
          