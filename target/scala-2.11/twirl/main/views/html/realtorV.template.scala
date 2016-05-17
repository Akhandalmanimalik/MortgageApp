
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
object realtorV extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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

				<div ng-controller="DemoController" ng-init="newItemType='Realtor'">
					 <input type="hidden" name="ip" value="" id="ip">	
					
				
												<div id="role1"></div>
				
						
				
						
						 <div id="text_44" class="form-html">
<iframe src="//fast.wistia.net/embed/iframe/knrl2x62ub?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="360"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script>
          </div><br>
					
					<input type="hidden" id="role" name="role" ng-model="newItemType" value="Realtor" ng-required>


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
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*294.61*/("""{"""),format.raw/*294.62*/("""{"""),format.raw/*294.63*/("""company"""),format.raw/*294.70*/("""}"""),format.raw/*294.71*/("""}"""),format.raw/*294.72*/(""""> <br>
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
										type="hidden" name="companyAddress" value=""""),format.raw/*314.54*/("""{"""),format.raw/*314.55*/("""{"""),format.raw/*314.56*/("""companyAddress"""),format.raw/*314.70*/("""}"""),format.raw/*314.71*/("""}"""),format.raw/*314.72*/("""">
									<div id="formattedaddress1"></div>


								</div>
							</div>
							<div ng-show="newItemType == 'Realtor'">

								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong> Brokerage Name  </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
									id="broker"	name="broker" class="form-control" required>
									<div id="broker1"></div>

								</div>
								<div class="map_canvas"></div>
								<div class="form-group" style="width: 280px; height: 30%">
									<label for="pwd"><Strong> Brokerage Address </Strong> <span style="color: red; font-size: 4">*</span>
									</label> <input id="geocomplete1" type="text"
										ng-model="companyAddress1" name="formatted_address"
										class="form-control" placeholder="Enter Location" required>
									<input type="hidden" name="companyAddress1"
										value=""""),format.raw/*336.18*/("""{"""),format.raw/*336.19*/("""{"""),format.raw/*336.20*/("""companyAddress1"""),format.raw/*336.35*/("""}"""),format.raw/*336.36*/("""}"""),format.raw/*336.37*/("""">

									<div id="address1"></div>

								</div>
								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong> Brokerage Phone number </Strong> <span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
										id="brokerPhone" name="brokerPhone" class="form-control"
										required>

									<div id="brokerPhone1"></div>

								</div>

								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong>Who is your Broker? </Strong> <span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
									id="brokerMange"	name="brokerMange" class="form-control" required>
									<div id="brokerMange1"></div>

								</div>
							</div>
							<div class="form-group" style="width: 100%">
							<label for="pwd"><Strong>From whom or how did you find out about Visdom Mortgage Solutions?  </Strong> <span style="color: red; font-size: 4">*</span>
								</label>
								</div>
							<div class="form-group" style="width: 280px">
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
    $(function() """),format.raw/*398.18*/("""{"""),format.raw/*398.19*/("""
        """),format.raw/*399.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*402.5*/("""}"""),format.raw/*402.6*/(""");
	
</script>
	<script type="text/javascript">
    $(function() """),format.raw/*406.18*/("""{"""),format.raw/*406.19*/("""
        """),format.raw/*407.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#brokerPhone").mask("999-999-9999");
    """),format.raw/*410.5*/("""}"""),format.raw/*410.6*/(""");
	
</script>



	<script>
$(document).ready(function()"""),format.raw/*417.29*/("""{"""),format.raw/*417.30*/("""
    """),format.raw/*418.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*419.1*/("""}"""),format.raw/*419.2*/(""");
</script>

	<script
		src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>

	<script src="jquery.geocomplete.js"></script>
	<script>
      $(function()"""),format.raw/*427.19*/("""{"""),format.raw/*427.20*/("""
        """),format.raw/*428.9*/("""$("#geocomplete").geocomplete("""),format.raw/*428.39*/("""{"""),format.raw/*428.40*/("""
          """),format.raw/*429.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*432.9*/("""}"""),format.raw/*432.10*/(""");

        $("#find").click(function()"""),format.raw/*434.36*/("""{"""),format.raw/*434.37*/("""
          """),format.raw/*435.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*436.9*/("""}"""),format.raw/*436.10*/(""");
      """),format.raw/*437.7*/("""}"""),format.raw/*437.8*/(""");
    </script>

	<script>
      $(function()"""),format.raw/*441.19*/("""{"""),format.raw/*441.20*/("""
        """),format.raw/*442.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*442.40*/("""{"""),format.raw/*442.41*/("""
          """),format.raw/*443.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*446.9*/("""}"""),format.raw/*446.10*/(""");

        $("#find").click(function()"""),format.raw/*448.36*/("""{"""),format.raw/*448.37*/("""
          """),format.raw/*449.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*450.9*/("""}"""),format.raw/*450.10*/(""");
      """),format.raw/*451.7*/("""}"""),format.raw/*451.8*/(""");
    </script>
	<script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*456.56*/("""{"""),format.raw/*456.57*/("""
        """),format.raw/*457.9*/("""init();
        function init() """),format.raw/*458.25*/("""{"""),format.raw/*458.26*/("""
            """),format.raw/*459.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*461.41*/("""{"""),format.raw/*461.42*/("""
                """),format.raw/*462.17*/("""console.log($scope.newItemType)
            """),format.raw/*463.13*/("""}"""),format.raw/*463.14*/(""";
        """),format.raw/*464.9*/("""}"""),format.raw/*464.10*/("""
    """),format.raw/*465.5*/("""}"""),format.raw/*465.6*/(""");
    </script>

	<script type="text/javascript">
 function validateForm() """),format.raw/*469.26*/("""{"""),format.raw/*469.27*/("""
	 
	 """),format.raw/*471.3*/("""try"""),format.raw/*471.6*/("""{"""),format.raw/*471.7*/("""
		"""),format.raw/*472.3*/("""var role=document.forms["myForm"]["role"].value;
		var value=true;
		if(!role)"""),format.raw/*474.12*/("""{"""),format.raw/*474.13*/("""
			"""),format.raw/*475.4*/("""document.getElementById("role1").innerHTML="<p style=\"color:red\">Please Select Role</p>";
			document.getElementById("role").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*481.3*/("""}"""),format.raw/*481.4*/("""else"""),format.raw/*481.8*/("""{"""),format.raw/*481.9*/("""
	    	"""),format.raw/*482.7*/("""document.getElementById("role1").innerHTML="";

		"""),format.raw/*484.3*/("""}"""),format.raw/*484.4*/(""" 

	 """),format.raw/*486.3*/("""var fname=document.forms["myForm"]["fname"].value;
	 

		if(!fname)"""),format.raw/*489.13*/("""{"""),format.raw/*489.14*/("""
			"""),format.raw/*490.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*496.3*/("""}"""),format.raw/*496.4*/("""else if(fname.trim().length<2)"""),format.raw/*496.34*/("""{"""),format.raw/*496.35*/("""
			
			
			"""),format.raw/*499.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName  Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*507.3*/("""}"""),format.raw/*507.4*/(""" """),format.raw/*507.5*/("""else"""),format.raw/*507.9*/("""{"""),format.raw/*507.10*/("""
			"""),format.raw/*508.4*/("""if(!fname.match(/^[a-zA-Z ]*$/))"""),format.raw/*508.36*/("""{"""),format.raw/*508.37*/("""
				"""),format.raw/*509.5*/("""document.getElementById("fname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
				document.getElementById("fname").focus();
				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


				value = false;

			"""),format.raw/*516.4*/("""}"""),format.raw/*516.5*/("""else"""),format.raw/*516.9*/("""{"""),format.raw/*516.10*/("""
				"""),format.raw/*517.5*/("""document.getElementById("fname1").innerHTML = "";

			"""),format.raw/*519.4*/("""}"""),format.raw/*519.5*/("""

		"""),format.raw/*521.3*/("""}"""),format.raw/*521.4*/(""" 
		
		
		"""),format.raw/*524.3*/("""var lname=document.forms["myForm"]["lname"].value;
		 
		if(!lname)"""),format.raw/*526.13*/("""{"""),format.raw/*526.14*/("""
			
			"""),format.raw/*528.4*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
			document.getElementById("lname").focus();
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*533.3*/("""}"""),format.raw/*533.4*/("""
"""),format.raw/*534.1*/("""else if(lname.trim().length<2)"""),format.raw/*534.31*/("""{"""),format.raw/*534.32*/("""
			
			
			"""),format.raw/*537.4*/("""document.getElementById("lname").focus();

			document.getElementById("lname1").innerHTML="<p style=\"color:red\">Last  Name Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*545.3*/("""}"""),format.raw/*545.4*/("""
			"""),format.raw/*546.4*/("""else"""),format.raw/*546.8*/("""{"""),format.raw/*546.9*/("""
				
				"""),format.raw/*548.5*/("""if(!lname.match(/^[a-zA-Z ]*$/))"""),format.raw/*548.37*/("""{"""),format.raw/*548.38*/("""
					"""),format.raw/*549.6*/("""document.getElementById("lname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
					document.getElementById("lname").focus();
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


					value = false;

				"""),format.raw/*556.5*/("""}"""),format.raw/*556.6*/("""else"""),format.raw/*556.10*/("""{"""),format.raw/*556.11*/("""
					"""),format.raw/*557.6*/("""document.getElementById("lname1").innerHTML = "";

				"""),format.raw/*559.5*/("""}"""),format.raw/*559.6*/("""

			"""),format.raw/*561.4*/("""}"""),format.raw/*561.5*/(""" 
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
		
		
		"""),format.raw/*697.3*/("""document.getElementById("broker").focus();
		document.getElementById("broker1").innerHTML ="<p style=\"color:red\">This Feild is Required.</p>";

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



"""),format.raw/*732.1*/("""var address1=document.forms["myForm"]["companyAddress1"].value;
if(!address1&& role== 'Realtor')"""),format.raw/*733.33*/("""{"""),format.raw/*733.34*/("""
	
	"""),format.raw/*735.2*/("""document.getElementById("address1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("geocomplete1").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*741.1*/("""}"""),format.raw/*741.2*/("""else"""),format.raw/*741.6*/("""{"""),format.raw/*741.7*/("""
	"""),format.raw/*742.2*/("""document.getElementById("address1").innerHTML="";

"""),format.raw/*744.1*/("""}"""),format.raw/*744.2*/("""

"""),format.raw/*746.1*/("""var brokerPhone=document.forms["myForm"]["brokerPhone"].value;



if(!brokerPhone&& role== 'Realtor')"""),format.raw/*750.36*/("""{"""),format.raw/*750.37*/("""
	
	"""),format.raw/*752.2*/("""document.getElementById("brokerPhone1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerPhone").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*758.1*/("""}"""),format.raw/*758.2*/("""else"""),format.raw/*758.6*/("""{"""),format.raw/*758.7*/("""
	"""),format.raw/*759.2*/("""document.getElementById("brokerPhone1").innerHTML="";

"""),format.raw/*761.1*/("""}"""),format.raw/*761.2*/("""

"""),format.raw/*763.1*/("""var brokerMange=document.forms["myForm"]["brokerMange"].value;


if(!brokerMange&& role== 'Realtor')"""),format.raw/*766.36*/("""{"""),format.raw/*766.37*/("""
	
	"""),format.raw/*768.2*/("""document.getElementById("brokerMange1").innerHTML =="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerMange").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*774.1*/("""}"""),format.raw/*774.2*/("""else if(brokerMange.trim().length<2)"""),format.raw/*774.38*/("""{"""),format.raw/*774.39*/("""
	"""),format.raw/*775.2*/("""document.getElementById("brokerMange1").innerHTML="<p style=\"color:red\">Broker Name Should be more than one letter </p>";
	document.getElementById("brokerMange").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

"""),format.raw/*780.1*/("""}"""),format.raw/*780.2*/("""

"""),format.raw/*782.1*/("""else"""),format.raw/*782.5*/("""{"""),format.raw/*782.6*/("""
	"""),format.raw/*783.2*/("""if(!brokerMange.match(/^[a-zA-Z ]*$/))"""),format.raw/*783.40*/("""{"""),format.raw/*783.41*/("""
		"""),format.raw/*784.3*/("""document.getElementById("brokerMange1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("brokerMange").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*791.2*/("""}"""),format.raw/*791.3*/("""else"""),format.raw/*791.7*/("""{"""),format.raw/*791.8*/("""
		"""),format.raw/*792.3*/("""document.getElementById("brokerMange1").innerHTML = "";

	"""),format.raw/*794.2*/("""}"""),format.raw/*794.3*/("""
"""),format.raw/*795.1*/("""}"""),format.raw/*795.2*/("""


"""),format.raw/*798.1*/("""var refer=document.forms["myForm"]["refer"].value;

if(!refer&& role== 'Realtor')"""),format.raw/*800.30*/("""{"""),format.raw/*800.31*/("""
	
	"""),format.raw/*802.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*808.1*/("""}"""),format.raw/*808.2*/("""else if(refer.trim().length<2)"""),format.raw/*808.32*/("""{"""),format.raw/*808.33*/("""
	
	"""),format.raw/*810.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">Referrar Name Should be more than one letter </p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*816.1*/("""}"""),format.raw/*816.2*/("""


"""),format.raw/*819.1*/("""else"""),format.raw/*819.5*/("""{"""),format.raw/*819.6*/("""
	"""),format.raw/*820.2*/("""if(!refer.match(/^[a-zA-Z ]*$/))"""),format.raw/*820.34*/("""{"""),format.raw/*820.35*/("""
		"""),format.raw/*821.3*/("""document.getElementById("refer1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("refer").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*828.2*/("""}"""),format.raw/*828.3*/("""else"""),format.raw/*828.7*/("""{"""),format.raw/*828.8*/("""
		"""),format.raw/*829.3*/("""document.getElementById("refer1").innerHTML = "";

	"""),format.raw/*831.2*/("""}"""),format.raw/*831.3*/("""

"""),format.raw/*833.1*/("""}"""),format.raw/*833.2*/("""



"""),format.raw/*837.1*/("""if(value)"""),format.raw/*837.10*/("""{"""),format.raw/*837.11*/("""
	 """),format.raw/*838.3*/("""$('#loading').show();
"""),format.raw/*839.1*/("""}"""),format.raw/*839.2*/("""
"""),format.raw/*840.1*/("""return value;
	 """),format.raw/*841.3*/("""}"""),format.raw/*841.4*/("""catch(err)"""),format.raw/*841.14*/("""{"""),format.raw/*841.15*/("""
		
	 """),format.raw/*843.3*/("""}"""),format.raw/*843.4*/("""
    
 """),format.raw/*845.2*/("""}"""),format.raw/*845.3*/("""
    
    """),format.raw/*847.5*/("""</script>


	<script src=""""),_display_(/*850.16*/routes/*850.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*850.72*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:17 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/realtorV.scala.html
                  HASH: ffe9c98531c4b1ee1123c107dc1652d9c584212c
                  MATRIX: 726->1|831->18|858->19|1207->342|1221->348|1277->384|1423->503|1438->509|1498->548|1554->578|1569->584|1639->633|1794->761|1809->767|1874->811|1931->841|1946->847|2013->893|2111->964|2139->965|2171->970|2323->1095|2351->1096|2383->1101|2416->1106|2445->1107|2477->1112|2548->1156|2576->1157|2604->1158|2673->1199|2702->1200|2735->1206|2825->1269|2853->1270|2885->1275|2953->1315|2982->1316|3018->1325|3076->1355|3105->1356|3144->1367|3273->1469|3302->1470|3369->1509|3398->1510|3437->1521|3510->1567|3539->1568|3575->1577|3603->1578|3686->1633|3715->1634|3751->1643|3810->1674|3839->1675|3878->1686|4007->1788|4036->1789|4103->1828|4132->1829|4171->1840|4245->1887|4274->1888|4310->1897|4338->1898|4474->2006|4503->2007|4536->2013|4882->2332|4910->2333|5030->2425|5059->2426|5095->2435|5238->2550|5267->2551|5305->2561|6089->3318|6117->3319|6151->3325|6180->3326|6209->3327|6441->3531|6457->3537|6521->3579|6565->3595|6581->3601|6644->3642|6732->3702|6748->3708|6809->3747|6886->3796|6902->3802|6958->3836|7035->3885|7051->3891|7110->3928|7182->3971|7212->3972|7242->3974|7374->4078|7390->4084|7448->4120|7515->4159|7544->4160|7573->4161|7615->4174|7645->4175|7676->4178|7854->4328|7883->4329|7914->4332|7950->4340|7980->4341|8011->4344|8244->4549|8273->4550|8303->4552|8450->4671|8466->4677|8529->4718|8679->4840|8695->4846|8758->4886|13090->9190|13120->9191|13150->9192|13186->9199|13216->9200|13246->9201|14069->9995|14099->9996|14129->9997|14172->10011|14202->10012|14232->10013|15178->10930|15208->10931|15238->10932|15282->10947|15312->10948|15342->10949|17010->12588|17040->12589|17077->12598|17192->12685|17221->12686|17315->12751|17345->12752|17382->12761|17497->12848|17526->12849|17611->12905|17641->12906|17674->12911|17745->12954|17774->12955|17993->13145|18023->13146|18060->13155|18119->13185|18149->13186|18189->13197|18319->13299|18349->13300|18417->13339|18447->13340|18487->13351|18561->13397|18591->13398|18628->13407|18657->13408|18732->13454|18762->13455|18799->13464|18859->13495|18889->13496|18929->13507|19059->13609|19089->13610|19157->13649|19187->13650|19227->13661|19302->13708|19332->13709|19369->13718|19398->13719|19592->13884|19622->13885|19659->13894|19720->13926|19750->13927|19792->13940|19917->14036|19947->14037|19993->14054|20066->14098|20096->14099|20134->14109|20164->14110|20197->14115|20226->14116|20331->14192|20361->14193|20395->14199|20426->14202|20455->14203|20486->14206|20593->14284|20623->14285|20655->14289|20987->14593|21016->14594|21048->14598|21077->14599|21112->14606|21190->14656|21219->14657|21252->14662|21348->14729|21378->14730|21410->14734|21744->15040|21773->15041|21832->15071|21862->15072|21902->15084|22263->15417|22292->15418|22321->15419|22353->15423|22383->15424|22415->15428|22476->15460|22506->15461|22539->15466|22892->15791|22921->15792|22953->15796|22983->15797|23016->15802|23098->15856|23127->15857|23159->15861|23188->15862|23226->15872|23322->15939|23352->15940|23388->15948|23720->16252|23749->16253|23778->16254|23837->16284|23867->16285|23907->16297|24268->16630|24297->16631|24329->16635|24361->16639|24390->16640|24428->16650|24489->16682|24519->16683|24553->16689|24910->17018|24939->17019|24972->17023|25002->17024|25036->17030|25119->17085|25148->17086|25181->17091|25210->17092|25242->17096|25338->17163|25368->17164|25404->17172|25734->17474|25763->17475|25795->17479|25824->17480|25859->17487|25938->17538|25967->17539|26006->17550|26243->17759|26273->17760|26320->17779|26349->17780|26382->17784|26412->17785|26446->17791|26786->18103|26815->18104|26853->18114|26902->18134|26932->18135|26979->18154|27008->18155|27041->18159|27071->18160|27105->18166|27445->18478|27474->18479|27507->18484|27550->18498|27580->18499|27609->18500|27941->18804|27970->18805|28003->18809|28033->18810|28067->18816|28147->18868|28176->18869|28211->18876|28305->18941|28335->18942|28366->18945|28704->19255|28733->19256|28764->19259|28796->19263|28825->19264|28859->19270|28937->19320|28966->19321|29002->19329|29094->19392|29124->19393|29156->19397|29240->19452|29270->19453|29301->19456|29635->19762|29664->19763|29694->19765|29723->19766|29755->19770|29784->19771|29818->19777|29896->19827|29925->19828|29965->19840|30118->19964|30148->19965|30178->19967|30283->20043|30313->20044|30344->20047|30682->20357|30711->20358|30741->20360|30770->20361|30802->20365|30831->20366|30865->20372|30945->20424|30974->20425|31005->20428|31197->20591|31227->20592|31257->20594|31362->20670|31392->20671|31424->20675|31775->20998|31804->20999|31834->21001|31863->21002|31895->21006|31924->21007|31958->21013|32047->21074|32076->21075|32111->21082|32224->21166|32254->21167|32291->21176|32629->21486|32658->21487|32718->21518|32748->21519|32782->21525|33144->21859|33173->21860|33208->21867|33240->21871|33269->21872|33298->21873|33360->21906|33390->21907|33420->21909|33763->22224|33792->22225|33824->22229|33853->22230|33883->22232|33963->22284|33992->22285|34022->22287|34051->22288|34083->22292|34208->22388|34238->22389|34270->22393|34609->22704|34638->22705|34670->22709|34699->22710|34729->22712|34808->22763|34837->22764|34867->22766|34997->22867|35027->22868|35059->22872|35401->23186|35430->23187|35462->23191|35491->23192|35521->23194|35604->23249|35633->23250|35663->23252|35792->23352|35822->23353|35854->23357|36198->23673|36227->23674|36292->23710|36322->23711|36352->23713|36700->24033|36729->24034|36759->24036|36791->24040|36820->24041|36850->24043|36917->24081|36947->24082|36978->24085|37335->24414|37364->24415|37396->24419|37425->24420|37456->24423|37542->24481|37571->24482|37600->24483|37629->24484|37660->24487|37770->24568|37800->24569|37832->24573|38162->24875|38191->24876|38250->24906|38280->24907|38312->24911|38664->25235|38693->25236|38724->25239|38756->25243|38785->25244|38815->25246|38876->25278|38906->25279|38937->25282|39282->25599|39311->25600|39343->25604|39372->25605|39403->25608|39483->25660|39512->25661|39542->25663|39571->25664|39603->25668|39641->25677|39671->25678|39702->25681|39752->25703|39781->25704|39810->25705|39854->25721|39883->25722|39922->25732|39952->25733|39986->25739|40015->25740|40050->25747|40079->25748|40117->25758|40172->25785|40188->25791|40260->25841
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|44->16|44->16|44->16|45->17|45->17|45->17|49->21|49->21|50->22|56->28|56->28|57->29|57->29|57->29|58->30|61->33|61->33|62->34|62->34|62->34|63->35|66->38|66->38|67->39|69->41|69->41|70->42|70->42|70->42|71->43|74->46|74->46|76->48|76->48|77->49|78->50|78->50|79->51|79->51|83->55|83->55|84->56|84->56|84->56|85->57|88->60|88->60|90->62|90->62|91->63|92->64|92->64|93->65|93->65|96->68|96->68|97->69|102->74|102->74|107->79|107->79|108->80|111->83|111->83|112->84|127->99|127->99|128->100|128->100|128->100|133->105|133->105|133->105|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|137->109|137->109|137->109|142->114|142->114|143->115|149->121|149->121|149->121|150->122|150->122|150->122|152->124|152->124|153->125|163->135|163->135|165->137|165->137|165->137|166->138|176->148|176->148|178->150|194->166|194->166|194->166|200->172|200->172|200->172|322->294|322->294|322->294|322->294|322->294|322->294|342->314|342->314|342->314|342->314|342->314|342->314|364->336|364->336|364->336|364->336|364->336|364->336|426->398|426->398|427->399|430->402|430->402|434->406|434->406|435->407|438->410|438->410|445->417|445->417|446->418|447->419|447->419|455->427|455->427|456->428|456->428|456->428|457->429|460->432|460->432|462->434|462->434|463->435|464->436|464->436|465->437|465->437|469->441|469->441|470->442|470->442|470->442|471->443|474->446|474->446|476->448|476->448|477->449|478->450|478->450|479->451|479->451|484->456|484->456|485->457|486->458|486->458|487->459|489->461|489->461|490->462|491->463|491->463|492->464|492->464|493->465|493->465|497->469|497->469|499->471|499->471|499->471|500->472|502->474|502->474|503->475|509->481|509->481|509->481|509->481|510->482|512->484|512->484|514->486|517->489|517->489|518->490|524->496|524->496|524->496|524->496|527->499|535->507|535->507|535->507|535->507|535->507|536->508|536->508|536->508|537->509|544->516|544->516|544->516|544->516|545->517|547->519|547->519|549->521|549->521|552->524|554->526|554->526|556->528|561->533|561->533|562->534|562->534|562->534|565->537|573->545|573->545|574->546|574->546|574->546|576->548|576->548|576->548|577->549|584->556|584->556|584->556|584->556|585->557|587->559|587->559|589->561|589->561|590->562|592->564|592->564|594->566|600->572|600->572|600->572|600->572|601->573|603->575|603->575|606->578|610->582|610->582|612->584|612->584|612->584|612->584|613->585|619->591|619->591|621->593|621->593|621->593|623->595|623->595|623->595|623->595|624->596|630->602|630->602|631->603|631->603|631->603|632->604|638->610|638->610|638->610|638->610|639->611|641->613|641->613|643->615|645->617|645->617|646->618|652->624|652->624|653->625|653->625|653->625|654->626|656->628|656->628|658->630|660->632|660->632|662->634|662->634|662->634|663->635|669->641|669->641|670->642|670->642|670->642|670->642|671->643|673->645|673->645|679->651|684->656|684->656|685->657|685->657|685->657|686->658|692->664|692->664|693->665|693->665|693->665|693->665|694->666|696->668|696->668|699->671|703->675|703->675|704->676|704->676|704->676|706->678|712->684|712->684|713->685|713->685|713->685|713->685|714->686|716->688|716->688|720->692|722->694|722->694|725->697|731->703|731->703|731->703|731->703|733->705|740->712|740->712|743->715|743->715|743->715|744->716|744->716|744->716|745->717|752->724|752->724|752->724|752->724|753->725|755->727|755->727|756->728|756->728|760->732|761->733|761->733|763->735|769->741|769->741|769->741|769->741|770->742|772->744|772->744|774->746|778->750|778->750|780->752|786->758|786->758|786->758|786->758|787->759|789->761|789->761|791->763|794->766|794->766|796->768|802->774|802->774|802->774|802->774|803->775|808->780|808->780|810->782|810->782|810->782|811->783|811->783|811->783|812->784|819->791|819->791|819->791|819->791|820->792|822->794|822->794|823->795|823->795|826->798|828->800|828->800|830->802|836->808|836->808|836->808|836->808|838->810|844->816|844->816|847->819|847->819|847->819|848->820|848->820|848->820|849->821|856->828|856->828|856->828|856->828|857->829|859->831|859->831|861->833|861->833|865->837|865->837|865->837|866->838|867->839|867->839|868->840|869->841|869->841|869->841|869->841|871->843|871->843|873->845|873->845|875->847|878->850|878->850|878->850
                  -- GENERATED --
              */
          