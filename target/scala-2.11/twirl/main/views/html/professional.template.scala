
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
object professional extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*291.61*/("""{"""),format.raw/*291.62*/("""{"""),format.raw/*291.63*/("""company"""),format.raw/*291.70*/("""}"""),format.raw/*291.71*/("""}"""),format.raw/*291.72*/(""""> <br>
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
										type="hidden" name="companyAddress" value=""""),format.raw/*311.54*/("""{"""),format.raw/*311.55*/("""{"""),format.raw/*311.56*/("""companyAddress"""),format.raw/*311.70*/("""}"""),format.raw/*311.71*/("""}"""),format.raw/*311.72*/("""">
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
		
	 
		"""),format.raw/*521.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*523.13*/("""{"""),format.raw/*523.14*/("""
			
			"""),format.raw/*525.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*531.3*/("""}"""),format.raw/*531.4*/("""else"""),format.raw/*531.8*/("""{"""),format.raw/*531.9*/("""
	    	"""),format.raw/*532.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*534.3*/("""}"""),format.raw/*534.4*/("""
	 
	 
    """),format.raw/*537.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*541.24*/("""{"""),format.raw/*541.25*/("""         
		  
    """),format.raw/*543.5*/("""}"""),format.raw/*543.6*/("""else"""),format.raw/*543.10*/("""{"""),format.raw/*543.11*/("""   
		"""),format.raw/*544.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*550.5*/("""}"""),format.raw/*550.6*/("""
    
    """),format.raw/*552.5*/("""if(pattern.test(x2))"""),format.raw/*552.25*/("""{"""),format.raw/*552.26*/("""         
		  
    """),format.raw/*554.5*/("""}"""),format.raw/*554.6*/("""else"""),format.raw/*554.10*/("""{"""),format.raw/*554.11*/("""   
		"""),format.raw/*555.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email2").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*561.5*/("""}"""),format.raw/*561.6*/("""
    """),format.raw/*562.5*/("""if (x  != x2) """),format.raw/*562.19*/("""{"""),format.raw/*562.20*/("""
"""),format.raw/*563.1*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
document.getElementById("email").focus();

document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

value= false;
    """),format.raw/*569.5*/("""}"""),format.raw/*569.6*/("""else"""),format.raw/*569.10*/("""{"""),format.raw/*569.11*/("""
    	"""),format.raw/*570.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*572.5*/("""}"""),format.raw/*572.6*/("""
    
	"""),format.raw/*574.2*/("""var phone=document.forms["myForm"]["phone"].value;
	 
	if(!phone)"""),format.raw/*576.12*/("""{"""),format.raw/*576.13*/("""
		"""),format.raw/*577.3*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
		document.getElementById("phonedatata").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*583.2*/("""}"""),format.raw/*583.3*/("""	
	"""),format.raw/*584.2*/("""else"""),format.raw/*584.6*/("""{"""),format.raw/*584.7*/("""
    	"""),format.raw/*585.6*/("""document.getElementById("phone1").innerHTML="";

	"""),format.raw/*587.2*/("""}"""),format.raw/*587.3*/(""" 
    
	"""),format.raw/*589.2*/("""var feeTo=document.forms["myForm"]["feeTo"].value;

	if(!feeTo)"""),format.raw/*591.12*/("""{"""),format.raw/*591.13*/("""

		"""),format.raw/*593.3*/("""if(role=='Professional')"""),format.raw/*593.27*/("""{"""),format.raw/*593.28*/("""
		"""),format.raw/*594.3*/("""document.getElementById("feeTo1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("feeTo").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*600.2*/("""}"""),format.raw/*600.3*/("""
	"""),format.raw/*601.2*/("""}"""),format.raw/*601.3*/("""else"""),format.raw/*601.7*/("""{"""),format.raw/*601.8*/("""
    	"""),format.raw/*602.6*/("""document.getElementById("feeTo1").innerHTML="";

	"""),format.raw/*604.2*/("""}"""),format.raw/*604.3*/("""
	
	
	
	
	
	"""),format.raw/*610.2*/("""//var role=document.forms["myForm"]["role"].value;
	var company=document.forms["myForm"]["company"].value;

	
	
if(!company)"""),format.raw/*615.13*/("""{"""),format.raw/*615.14*/("""
	"""),format.raw/*616.2*/("""if( role=='Professional' && feeTo == 'Company')"""),format.raw/*616.49*/("""{"""),format.raw/*616.50*/("""
		"""),format.raw/*617.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*623.2*/("""}"""),format.raw/*623.3*/("""
"""),format.raw/*624.1*/("""}"""),format.raw/*624.2*/("""else if(role == 'Professional'  && feeTo == 'Company' && company.trim().length <2 )"""),format.raw/*624.85*/("""{"""),format.raw/*624.86*/("""
		"""),format.raw/*625.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">Company Name Should be more than one letter</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*631.2*/("""}"""),format.raw/*631.3*/("""else"""),format.raw/*631.7*/("""{"""),format.raw/*631.8*/("""
		"""),format.raw/*632.3*/("""document.getElementById("company1").innerHTML="";

	"""),format.raw/*634.2*/("""}"""),format.raw/*634.3*/("""


"""),format.raw/*637.1*/("""//var formattedaddress=document.forms["myForm"]["companyAddress"].value;
var companyAddress=document.forms["myForm"]["companyAddress"].value;


if(!companyAddress)"""),format.raw/*641.20*/("""{"""),format.raw/*641.21*/("""
	"""),format.raw/*642.2*/("""if( role=='Professional' && feeTo == 'Company' )"""),format.raw/*642.50*/("""{"""),format.raw/*642.51*/("""

		"""),format.raw/*644.3*/("""document.getElementById("formattedaddress1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("geocomplete").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*650.2*/("""}"""),format.raw/*650.3*/("""
	"""),format.raw/*651.2*/("""}"""),format.raw/*651.3*/("""else"""),format.raw/*651.7*/("""{"""),format.raw/*651.8*/("""
    	"""),format.raw/*652.6*/("""document.getElementById("formattedaddress1").innerHTML="";

	"""),format.raw/*654.2*/("""}"""),format.raw/*654.3*/("""
	


	


"""),format.raw/*661.1*/("""var refer=document.forms["myForm"]["refer"].value;

if(!refer)"""),format.raw/*663.11*/("""{"""),format.raw/*663.12*/("""
	
	"""),format.raw/*665.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*671.1*/("""}"""),format.raw/*671.2*/("""else if(refer.trim().length<2)"""),format.raw/*671.32*/("""{"""),format.raw/*671.33*/("""
	
	"""),format.raw/*673.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">Referrar Name Should be more than one letter </p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*679.1*/("""}"""),format.raw/*679.2*/("""


"""),format.raw/*682.1*/("""else"""),format.raw/*682.5*/("""{"""),format.raw/*682.6*/("""
	"""),format.raw/*683.2*/("""if(!refer.match(/^[a-zA-Z ]*$/))"""),format.raw/*683.34*/("""{"""),format.raw/*683.35*/("""
		"""),format.raw/*684.3*/("""document.getElementById("refer1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("refer").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*691.2*/("""}"""),format.raw/*691.3*/("""else"""),format.raw/*691.7*/("""{"""),format.raw/*691.8*/("""
		"""),format.raw/*692.3*/("""document.getElementById("refer1").innerHTML = "";

	"""),format.raw/*694.2*/("""}"""),format.raw/*694.3*/("""

"""),format.raw/*696.1*/("""}"""),format.raw/*696.2*/("""


"""),format.raw/*699.1*/("""if(value)"""),format.raw/*699.10*/("""{"""),format.raw/*699.11*/("""
	 """),format.raw/*700.3*/("""$('#loading').show();
"""),format.raw/*701.1*/("""}"""),format.raw/*701.2*/("""
"""),format.raw/*702.1*/("""return value;
	 """),format.raw/*703.3*/("""}"""),format.raw/*703.4*/("""catch(err)"""),format.raw/*703.14*/("""{"""),format.raw/*703.15*/("""
		
	 """),format.raw/*705.3*/("""}"""),format.raw/*705.4*/("""
    
 """),format.raw/*707.2*/("""}"""),format.raw/*707.3*/("""
    
    """),format.raw/*709.5*/("""</script>


	<script src=""""),_display_(/*712.16*/routes/*712.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*712.72*/("""" type="text/javascript"></script>
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
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/professional.scala.html
                  HASH: d4c827095a52c8da0717b535c99dede82edcd446
                  MATRIX: 730->1|835->18|862->19|1211->342|1225->348|1281->384|1427->503|1442->509|1502->548|1558->578|1573->584|1643->633|1798->761|1813->767|1878->811|1935->841|1950->847|2017->893|2115->964|2143->965|2175->970|2327->1095|2355->1096|2387->1101|2415->1102|2447->1107|2518->1151|2546->1152|2574->1153|2643->1194|2672->1195|2705->1201|2795->1264|2823->1265|2860->1275|2928->1315|2957->1316|2993->1325|3051->1355|3080->1356|3119->1367|3248->1469|3277->1470|3344->1509|3373->1510|3412->1521|3485->1567|3514->1568|3550->1577|3578->1578|3661->1633|3690->1634|3726->1643|3785->1674|3814->1675|3853->1686|3982->1788|4011->1789|4078->1828|4107->1829|4146->1840|4220->1887|4249->1888|4285->1897|4313->1898|4449->2006|4478->2007|4511->2013|4857->2332|4885->2333|5005->2425|5034->2426|5070->2435|5213->2550|5242->2551|5280->2561|6064->3318|6092->3319|6126->3325|6155->3326|6184->3327|6416->3531|6432->3537|6496->3579|6540->3595|6556->3601|6619->3642|6707->3702|6723->3708|6784->3747|6861->3796|6877->3802|6933->3836|7010->3885|7026->3891|7085->3928|7157->3971|7187->3972|7217->3974|7349->4078|7365->4084|7423->4120|7490->4159|7519->4160|7548->4161|7590->4174|7620->4175|7651->4178|7829->4328|7858->4329|7889->4332|7925->4340|7955->4341|7986->4344|8219->4549|8248->4550|8278->4552|8425->4671|8441->4677|8504->4718|8654->4840|8670->4846|8733->4886|12653->8778|12683->8779|12713->8780|12749->8787|12779->8788|12809->8789|13696->9647|13726->9648|13756->9649|13799->9663|13829->9664|13859->9665|14849->10626|14879->10627|14916->10636|15031->10723|15060->10724|15154->10789|15184->10790|15221->10799|15336->10886|15365->10887|15450->10943|15480->10944|15513->10949|15584->10992|15613->10993|15832->11183|15862->11184|15899->11193|15958->11223|15988->11224|16028->11235|16158->11337|16188->11338|16256->11377|16286->11378|16326->11389|16400->11435|16430->11436|16467->11445|16496->11446|16571->11492|16601->11493|16638->11502|16698->11533|16728->11534|16768->11545|16898->11647|16928->11648|16996->11687|17026->11688|17066->11699|17141->11746|17171->11747|17208->11756|17237->11757|17431->11922|17461->11923|17498->11932|17559->11964|17589->11965|17631->11978|17756->12074|17786->12075|17832->12092|17905->12136|17935->12137|17973->12147|18003->12148|18036->12153|18065->12154|18170->12230|18200->12231|18234->12237|18265->12240|18294->12241|18325->12244|18432->12322|18462->12323|18494->12327|18826->12631|18855->12632|18887->12636|18916->12637|18951->12644|19029->12694|19058->12695|19091->12700|19187->12767|19217->12768|19249->12772|19583->13078|19612->13079|19671->13109|19701->13110|19741->13122|20102->13455|20131->13456|20160->13457|20192->13461|20222->13462|20254->13466|20315->13498|20345->13499|20378->13504|20731->13829|20760->13830|20792->13834|20822->13835|20855->13840|20937->13894|20966->13895|20998->13899|21027->13900|21065->13910|21161->13977|21191->13978|21227->13986|21559->14290|21588->14291|21647->14321|21677->14322|21717->14334|22078->14667|22107->14668|22139->14672|22171->14676|22200->14677|22238->14687|22299->14719|22329->14720|22363->14726|22720->15055|22749->15056|22782->15060|22812->15061|22846->15067|22929->15122|22958->15123|22991->15128|23020->15129|23058->15139|23154->15206|23184->15207|23220->15215|23550->15517|23579->15518|23611->15522|23640->15523|23675->15530|23754->15581|23783->15582|23822->15593|24059->15802|24089->15803|24136->15822|24165->15823|24198->15827|24228->15828|24262->15834|24602->16146|24631->16147|24669->16157|24718->16177|24748->16178|24795->16197|24824->16198|24857->16202|24887->16203|24921->16209|25261->16521|25290->16522|25323->16527|25366->16541|25396->16542|25425->16543|25752->16842|25781->16843|25814->16847|25844->16848|25878->16854|25958->16906|25987->16907|26022->16914|26116->16979|26146->16980|26177->16983|26515->17293|26544->17294|26575->17297|26607->17301|26636->17302|26670->17308|26748->17358|26777->17359|26813->17367|26905->17430|26935->17431|26967->17435|27020->17459|27050->17460|27081->17463|27415->17769|27444->17770|27474->17772|27503->17773|27535->17777|27564->17778|27598->17784|27676->17834|27705->17835|27745->17847|27898->17971|27928->17972|27958->17974|28034->18021|28064->18022|28095->18025|28433->18335|28462->18336|28491->18337|28520->18338|28632->18421|28662->18422|28693->18425|29052->18756|29081->18757|29113->18761|29142->18762|29173->18765|29253->18817|29282->18818|29313->18821|29505->18984|29535->18985|29565->18987|29642->19035|29672->19036|29704->19040|30055->19363|30084->19364|30114->19366|30143->19367|30175->19371|30204->19372|30238->19378|30327->19439|30356->19440|30393->19449|30484->19511|30514->19512|30546->19516|30876->19818|30905->19819|30964->19849|30994->19850|31026->19854|31378->20178|31407->20179|31438->20182|31470->20186|31499->20187|31529->20189|31590->20221|31620->20222|31651->20225|31996->20542|32025->20543|32057->20547|32086->20548|32117->20551|32197->20603|32226->20604|32256->20606|32285->20607|32316->20610|32354->20619|32384->20620|32415->20623|32465->20645|32494->20646|32523->20647|32567->20663|32596->20664|32635->20674|32665->20675|32699->20681|32728->20682|32763->20689|32792->20690|32830->20700|32885->20727|32901->20733|32973->20783
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|44->16|44->16|44->16|45->17|45->17|45->17|49->21|49->21|50->22|56->28|56->28|56->28|56->28|57->29|60->32|60->32|61->33|61->33|61->33|62->34|65->37|65->37|67->39|69->41|69->41|70->42|70->42|70->42|71->43|74->46|74->46|76->48|76->48|77->49|78->50|78->50|79->51|79->51|83->55|83->55|84->56|84->56|84->56|85->57|88->60|88->60|90->62|90->62|91->63|92->64|92->64|93->65|93->65|96->68|96->68|97->69|102->74|102->74|107->79|107->79|108->80|111->83|111->83|112->84|127->99|127->99|128->100|128->100|128->100|133->105|133->105|133->105|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|137->109|137->109|137->109|142->114|142->114|143->115|149->121|149->121|149->121|150->122|150->122|150->122|152->124|152->124|153->125|163->135|163->135|165->137|165->137|165->137|166->138|176->148|176->148|178->150|194->166|194->166|194->166|200->172|200->172|200->172|319->291|319->291|319->291|319->291|319->291|319->291|339->311|339->311|339->311|339->311|339->311|339->311|384->356|384->356|385->357|388->360|388->360|392->364|392->364|393->365|396->368|396->368|403->375|403->375|404->376|405->377|405->377|413->385|413->385|414->386|414->386|414->386|415->387|418->390|418->390|420->392|420->392|421->393|422->394|422->394|423->395|423->395|427->399|427->399|428->400|428->400|428->400|429->401|432->404|432->404|434->406|434->406|435->407|436->408|436->408|437->409|437->409|442->414|442->414|443->415|444->416|444->416|445->417|447->419|447->419|448->420|449->421|449->421|450->422|450->422|451->423|451->423|455->427|455->427|457->429|457->429|457->429|458->430|460->432|460->432|461->433|467->439|467->439|467->439|467->439|468->440|470->442|470->442|472->444|475->447|475->447|476->448|482->454|482->454|482->454|482->454|485->457|493->465|493->465|493->465|493->465|493->465|494->466|494->466|494->466|495->467|502->474|502->474|502->474|502->474|503->475|505->477|505->477|507->479|507->479|510->482|512->484|512->484|514->486|519->491|519->491|519->491|519->491|522->494|530->502|530->502|531->503|531->503|531->503|533->505|533->505|533->505|534->506|541->513|541->513|541->513|541->513|542->514|544->516|544->516|546->518|546->518|549->521|551->523|551->523|553->525|559->531|559->531|559->531|559->531|560->532|562->534|562->534|565->537|569->541|569->541|571->543|571->543|571->543|571->543|572->544|578->550|578->550|580->552|580->552|580->552|582->554|582->554|582->554|582->554|583->555|589->561|589->561|590->562|590->562|590->562|591->563|597->569|597->569|597->569|597->569|598->570|600->572|600->572|602->574|604->576|604->576|605->577|611->583|611->583|612->584|612->584|612->584|613->585|615->587|615->587|617->589|619->591|619->591|621->593|621->593|621->593|622->594|628->600|628->600|629->601|629->601|629->601|629->601|630->602|632->604|632->604|638->610|643->615|643->615|644->616|644->616|644->616|645->617|651->623|651->623|652->624|652->624|652->624|652->624|653->625|659->631|659->631|659->631|659->631|660->632|662->634|662->634|665->637|669->641|669->641|670->642|670->642|670->642|672->644|678->650|678->650|679->651|679->651|679->651|679->651|680->652|682->654|682->654|689->661|691->663|691->663|693->665|699->671|699->671|699->671|699->671|701->673|707->679|707->679|710->682|710->682|710->682|711->683|711->683|711->683|712->684|719->691|719->691|719->691|719->691|720->692|722->694|722->694|724->696|724->696|727->699|727->699|727->699|728->700|729->701|729->701|730->702|731->703|731->703|731->703|731->703|733->705|733->705|735->707|735->707|737->709|740->712|740->712|740->712
                  -- GENERATED --
              */
          