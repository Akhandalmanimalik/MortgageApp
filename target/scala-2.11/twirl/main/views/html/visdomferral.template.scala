
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
object visdomferral extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
	"""),format.raw/*21.2*/("""font-weight: bold;
	padding: 9px 6px;
	margin: 2px 2px;
	border-radius: 0;
	background-color: #0086b3;
	
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""

"""),format.raw/*29.1*/(""".btn """),format.raw/*29.6*/("""{"""),format.raw/*29.7*/("""
	"""),format.raw/*30.2*/("""border: 0 none;
	font-weight: bold;
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""
"""),format.raw/*33.1*/(""".btn:focus, .btn:active:focus, .btn.active:focus """),format.raw/*33.50*/("""{"""),format.raw/*33.51*/("""
    """),format.raw/*34.5*/("""outline: 0 none;
"""),format.raw/*35.1*/("""}"""),format.raw/*35.2*/("""
"""),format.raw/*36.1*/(""".btn-primary:active,.btn-primary.active """),format.raw/*36.41*/("""{"""),format.raw/*36.42*/("""
	"""),format.raw/*37.2*/("""background: #0099cc;
	color: #ffffff;
	box-shadow: none;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""
"""),format.raw/*41.1*/("""</style>
<script>
      $(function()"""),format.raw/*43.19*/("""{"""),format.raw/*43.20*/("""
        """),format.raw/*44.9*/("""$("#geocomplete").geocomplete("""),format.raw/*44.39*/("""{"""),format.raw/*44.40*/("""
          """),format.raw/*45.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*48.9*/("""}"""),format.raw/*48.10*/(""");

        $("#find").click(function()"""),format.raw/*50.36*/("""{"""),format.raw/*50.37*/("""
          """),format.raw/*51.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*52.9*/("""}"""),format.raw/*52.10*/(""");
      """),format.raw/*53.7*/("""}"""),format.raw/*53.8*/(""");
    </script>

<script>
      $(function()"""),format.raw/*57.19*/("""{"""),format.raw/*57.20*/("""
        """),format.raw/*58.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*58.40*/("""{"""),format.raw/*58.41*/("""
          """),format.raw/*59.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/(""");

        $("#find").click(function()"""),format.raw/*64.36*/("""{"""),format.raw/*64.37*/("""
          """),format.raw/*65.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/(""");
      """),format.raw/*67.7*/("""}"""),format.raw/*67.8*/(""");
    </script>
<script type="text/javascript">
  /*   $.get("https://ipinfo.io", function (response) """),format.raw/*70.55*/("""{"""),format.raw/*70.56*/("""
    	"""),format.raw/*71.6*/("""document.getElementById("ip").value=JSON.stringify(response, null, 4);
    	alert(JSON.stringify(response, null, 4));
    		/* $("#ip").html("IP: " + response.ip);
        $("#address").html("Location: " + response.city + ", " + response.region); */
       // $("#details").html(JSON.stringify(response, null, 4));
    """),format.raw/*76.5*/("""}"""),format.raw/*76.6*/(""", "jsonp"); */
    </script>

<script type="text/javascript">
    
    jQuery.ajax( """),format.raw/*81.18*/("""{"""),format.raw/*81.19*/(""" 
    	  """),format.raw/*82.8*/("""url: 'http://ip-api.com/json', 
    	  type: 'POST', 
    	  dataType: 'jsonp',
    	  success: function(location) """),format.raw/*85.36*/("""{"""),format.raw/*85.37*/("""
    	    """),format.raw/*86.10*/("""// example where I update content on the page.
    	
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
    	  """),format.raw/*101.8*/("""}"""),format.raw/*101.9*/("""
    	"""),format.raw/*102.6*/("""}"""),format.raw/*102.7*/(""" """),format.raw/*102.8*/(""");
    </script>

<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->
<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*108.31*/routes/*108.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*108.79*/("""">
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
 
  
     <img src=""""),_display_(/*169.17*/routes/*169.23*/.Assets.at("/images/preloader-image.gif")),format.raw/*169.64*/("""" alt="" />
  
  </div>  


	<div align="center">
		<img alt="Visdom Logo" height="90" width="260"
			src=""""),_display_(/*176.10*/routes/*176.16*/.Assets.at("_resources/visdom-logo.png")),format.raw/*176.56*/("""" />


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

						<div ng-controller="DemoController">
							<input type="hidden" name="ip" value="" id="ip">

<div>
								<input type="hidden" id="role" name="role"
									value=""""),format.raw/*206.17*/("""{"""),format.raw/*206.18*/("""{"""),format.raw/*206.19*/("""newItemType"""),format.raw/*206.30*/("""}"""),format.raw/*206.31*/("""}"""),format.raw/*206.32*/("""" ng-required>
							</div>
							<div class="form-group" style="width: 60%">
								<label for="usr"> <Strong>What best describes
										your role? </Strong><span style="color: red; font-size: 4">*</span></label>

							</div>
							

							<div class="btn-group blocks">
								<label style="width: 180px; border-style: groove;"
									class="btn btn-primary " btn-radio="'Realtor'"
									ng-change="change()" ng-model="newItemType" > Realtor </label> <label
									style="width: 180px; border-style: groove;"
									class="btn btn-primary full " btn-radio="'Financial Planner'"
									ng-change="change()" ng-model="newItemType"> Financial
									Planner </label><br> <label
									style="width: 180px; border-style: groove;"
									class="btn btn-primary " btn-radio="'Professional'"
									ng-change="change()" ng-model="newItemType"> Professional

								</label> <label style="width: 180px; border-style: groove;"
									class="btn btn-primary " btn-radio="'Client'"
									ng-change="change()" ng-model="newItemType"> Client </label>

								<div id="role1"></div>

							</div>





							<br>
							<br> <br>


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
									placeholder="Ex: myemail@example.com" 				required>
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
										ng-model="company">  MySelf </label>
								</div>
								<div id="feeTo1"></div>
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*320.61*/("""{"""),format.raw/*320.62*/("""{"""),format.raw/*320.63*/("""company"""),format.raw/*320.70*/("""}"""),format.raw/*320.71*/("""}"""),format.raw/*320.72*/(""""> <br>
								<br>


								<div class="map_canvas"></div>

								<div class="form-group" ng-show="company == 'Company'" style="width: 280px">
									<label for="pwd"><Strong> Company Name  </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
									id="company"	name="company" class="form-control" >
									<div id="company1"></div>

								</div>

								<div class="form-group"  ng-show="company == 'Company'" style="width: 280px">
									<label for="pwd"><Strong> Company Address </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input
										id="geocomplete" type="text" name="formatted_address"
										class="form-control" ng-model="companyAddress"
										placeholder="Enter Location" ng-required> <input
										type="hidden" name="companyAddress" value=""""),format.raw/*340.54*/("""{"""),format.raw/*340.55*/("""{"""),format.raw/*340.56*/("""companyAddress"""),format.raw/*340.70*/("""}"""),format.raw/*340.71*/("""}"""),format.raw/*340.72*/("""">
									<div id="formattedaddress1"></div>


								</div>
							</div>
							<div ng-show="newItemType == 'Realtor'">

								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong> Brokerage Name </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
									id="broker"	name="broker" class="form-control" ng-required>
									<div id="broker1"></div>

								</div>
								<div class="map_canvas"></div>
								<div class="form-group" style="width: 280px; height: 30%">
									<label for="pwd"><Strong> Brokerage Address</Strong> <span style="color: red; font-size: 3">*</span>
									</label> <input id="geocomplete1" type="text"
										ng-model="companyAddress1" name="formatted_address"
										class="form-control" placeholder="Enter Location" ng-required>
									<input type="hidden" name="companyAddress1"
										value=""""),format.raw/*362.18*/("""{"""),format.raw/*362.19*/("""{"""),format.raw/*362.20*/("""companyAddress1"""),format.raw/*362.35*/("""}"""),format.raw/*362.36*/("""}"""),format.raw/*362.37*/("""">

									<div id="address1"></div>

								</div>
								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong> Brokerage Phone number </Strong> <span
										style="color: red; font-size: 4">*</span> </label> <input type="tel"
										id="brokerPhone" name="brokerPhone" class="form-control"
										ng-required>

									<div id="brokerPhone1"></div>

								</div>

								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong>Who is your Broker ? </Strong> <span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
									id="brokerMange"	name="brokerMange" class="form-control" ng-required>
									<div id="brokerMange1"></div>

								</div>
							</div>
							<div class="form-group" style="width: 80%">
							<label for="pwd"><Strong>From whom or how did you find out about Visdom Mortgage Solutions?  </Strong> <span style="color: red; font-size: 4">*</span>
								</label>
								</div>
							<div class="form-group" style="width: 280px">
								 <input type="text" id="refer" name="refer" class="form-control" 
								
								data-toggle="tooltip" data-placement="right"
									title="Please be as specific as possible, were you introduced by a person (including their name), a Visdom employee, our website, or the internet.  Thank you."
								
								
								required>
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
    $(function() """),format.raw/*430.18*/("""{"""),format.raw/*430.19*/("""
        """),format.raw/*431.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*434.5*/("""}"""),format.raw/*434.6*/(""");
	
</script>
	<script type="text/javascript">
    $(function() """),format.raw/*438.18*/("""{"""),format.raw/*438.19*/("""
        """),format.raw/*439.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#brokerPhone").mask("999-999-9999");
    """),format.raw/*442.5*/("""}"""),format.raw/*442.6*/(""");
	
</script>



	<script>
$(document).ready(function()"""),format.raw/*449.29*/("""{"""),format.raw/*449.30*/("""
    """),format.raw/*450.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*451.1*/("""}"""),format.raw/*451.2*/(""");
</script>

	<script
		src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>

	<script src="jquery.geocomplete.js"></script>
	<script>
      $(function()"""),format.raw/*459.19*/("""{"""),format.raw/*459.20*/("""
        """),format.raw/*460.9*/("""$("#geocomplete").geocomplete("""),format.raw/*460.39*/("""{"""),format.raw/*460.40*/("""
          """),format.raw/*461.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*464.9*/("""}"""),format.raw/*464.10*/(""");

        $("#find").click(function()"""),format.raw/*466.36*/("""{"""),format.raw/*466.37*/("""
          """),format.raw/*467.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*468.9*/("""}"""),format.raw/*468.10*/(""");
      """),format.raw/*469.7*/("""}"""),format.raw/*469.8*/(""");
    </script>

	<script>
      $(function()"""),format.raw/*473.19*/("""{"""),format.raw/*473.20*/("""
        """),format.raw/*474.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*474.40*/("""{"""),format.raw/*474.41*/("""
          """),format.raw/*475.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*478.9*/("""}"""),format.raw/*478.10*/(""");

        $("#find").click(function()"""),format.raw/*480.36*/("""{"""),format.raw/*480.37*/("""
          """),format.raw/*481.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*482.9*/("""}"""),format.raw/*482.10*/(""");
      """),format.raw/*483.7*/("""}"""),format.raw/*483.8*/(""");
    </script>
	<script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*488.56*/("""{"""),format.raw/*488.57*/("""
        """),format.raw/*489.9*/("""init();
        function init() """),format.raw/*490.25*/("""{"""),format.raw/*490.26*/("""
            """),format.raw/*491.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*493.41*/("""{"""),format.raw/*493.42*/("""
                """),format.raw/*494.17*/("""console.log($scope.newItemType)
            """),format.raw/*495.13*/("""}"""),format.raw/*495.14*/(""";
        """),format.raw/*496.9*/("""}"""),format.raw/*496.10*/("""
    """),format.raw/*497.5*/("""}"""),format.raw/*497.6*/(""");
    </script>

	<script type="text/javascript">
 function validateForm() """),format.raw/*501.26*/("""{"""),format.raw/*501.27*/("""
	 
	 """),format.raw/*503.3*/("""try"""),format.raw/*503.6*/("""{"""),format.raw/*503.7*/("""
		"""),format.raw/*504.3*/("""var role=document.forms["myForm"]["role"].value;
		var value=true;
		if(!role)"""),format.raw/*506.12*/("""{"""),format.raw/*506.13*/("""
			"""),format.raw/*507.4*/("""document.getElementById("role1").innerHTML="<p style=\"color:red\">Please Select Role</p>";
			document.getElementById("role").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*513.3*/("""}"""),format.raw/*513.4*/("""else"""),format.raw/*513.8*/("""{"""),format.raw/*513.9*/("""
	    	"""),format.raw/*514.7*/("""document.getElementById("role1").innerHTML="";

		"""),format.raw/*516.3*/("""}"""),format.raw/*516.4*/(""" 

	 """),format.raw/*518.3*/("""var fname=document.forms["myForm"]["fname"].value;
	 

		if(!fname)"""),format.raw/*521.13*/("""{"""),format.raw/*521.14*/("""
			"""),format.raw/*522.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*528.3*/("""}"""),format.raw/*528.4*/("""else if(fname.trim().length<2)"""),format.raw/*528.34*/("""{"""),format.raw/*528.35*/("""
			
			
			"""),format.raw/*531.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName  Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*539.3*/("""}"""),format.raw/*539.4*/(""" """),format.raw/*539.5*/("""else"""),format.raw/*539.9*/("""{"""),format.raw/*539.10*/("""
			"""),format.raw/*540.4*/("""if(!fname.match(/^[a-zA-Z ]*$/))"""),format.raw/*540.36*/("""{"""),format.raw/*540.37*/("""
				"""),format.raw/*541.5*/("""document.getElementById("fname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
				document.getElementById("fname").focus();
				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


				value = false;

			"""),format.raw/*548.4*/("""}"""),format.raw/*548.5*/("""else"""),format.raw/*548.9*/("""{"""),format.raw/*548.10*/("""
				"""),format.raw/*549.5*/("""document.getElementById("fname1").innerHTML = "";

			"""),format.raw/*551.4*/("""}"""),format.raw/*551.5*/("""

		"""),format.raw/*553.3*/("""}"""),format.raw/*553.4*/(""" 
		

		"""),format.raw/*556.3*/("""var lname=document.forms["myForm"]["lname"].value;
		 
		if(!lname)"""),format.raw/*558.13*/("""{"""),format.raw/*558.14*/("""
			
			"""),format.raw/*560.4*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
			document.getElementById("lname").focus();
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*565.3*/("""}"""),format.raw/*565.4*/("""else if(lname.trim().length<2)"""),format.raw/*565.34*/("""{"""),format.raw/*565.35*/("""
			
			
			"""),format.raw/*568.4*/("""document.getElementById("lname").focus();

			document.getElementById("lname1").innerHTML="<p style=\"color:red\">Last  Name Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*576.3*/("""}"""),format.raw/*576.4*/("""else"""),format.raw/*576.8*/("""{"""),format.raw/*576.9*/("""
				
				"""),format.raw/*578.5*/("""if(!lname.match(/^[a-zA-Z ]*$/))"""),format.raw/*578.37*/("""{"""),format.raw/*578.38*/("""
					"""),format.raw/*579.6*/("""document.getElementById("lname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
					document.getElementById("lname").focus();
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


					value = false;

				"""),format.raw/*586.5*/("""}"""),format.raw/*586.6*/("""else"""),format.raw/*586.10*/("""{"""),format.raw/*586.11*/("""
					"""),format.raw/*587.6*/("""document.getElementById("lname1").innerHTML = "";

				"""),format.raw/*589.5*/("""}"""),format.raw/*589.6*/("""

			"""),format.raw/*591.4*/("""}"""),format.raw/*591.5*/(""" 
	 
		"""),format.raw/*593.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*595.13*/("""{"""),format.raw/*595.14*/("""
			
			"""),format.raw/*597.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*603.3*/("""}"""),format.raw/*603.4*/("""else"""),format.raw/*603.8*/("""{"""),format.raw/*603.9*/("""
	    	"""),format.raw/*604.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*606.3*/("""}"""),format.raw/*606.4*/("""
	 
	 
    """),format.raw/*609.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*613.24*/("""{"""),format.raw/*613.25*/("""         
		  
    """),format.raw/*615.5*/("""}"""),format.raw/*615.6*/("""else"""),format.raw/*615.10*/("""{"""),format.raw/*615.11*/("""   
		"""),format.raw/*616.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*622.5*/("""}"""),format.raw/*622.6*/("""
    
    """),format.raw/*624.5*/("""if(pattern.test(x2))"""),format.raw/*624.25*/("""{"""),format.raw/*624.26*/("""         
		  
    """),format.raw/*626.5*/("""}"""),format.raw/*626.6*/("""else"""),format.raw/*626.10*/("""{"""),format.raw/*626.11*/("""   
		"""),format.raw/*627.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email2").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*633.5*/("""}"""),format.raw/*633.6*/("""
    """),format.raw/*634.5*/("""if (x  != x2) """),format.raw/*634.19*/("""{"""),format.raw/*634.20*/("""
"""),format.raw/*635.1*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
document.getElementById("email").focus();

document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

value= false;
    """),format.raw/*641.5*/("""}"""),format.raw/*641.6*/("""else"""),format.raw/*641.10*/("""{"""),format.raw/*641.11*/("""
    	"""),format.raw/*642.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*644.5*/("""}"""),format.raw/*644.6*/("""
    
	"""),format.raw/*646.2*/("""var phone=document.forms["myForm"]["phone"].value;
	 
	if(!phone)"""),format.raw/*648.12*/("""{"""),format.raw/*648.13*/("""
		"""),format.raw/*649.3*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
		document.getElementById("phonedatata").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*655.2*/("""}"""),format.raw/*655.3*/("""	
	"""),format.raw/*656.2*/("""else"""),format.raw/*656.6*/("""{"""),format.raw/*656.7*/("""
    	"""),format.raw/*657.6*/("""document.getElementById("phone1").innerHTML="";

	"""),format.raw/*659.2*/("""}"""),format.raw/*659.3*/(""" 
    
	"""),format.raw/*661.2*/("""var feeTo=document.forms["myForm"]["feeTo"].value;

	if(!feeTo)"""),format.raw/*663.12*/("""{"""),format.raw/*663.13*/("""

		"""),format.raw/*665.3*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*665.58*/("""{"""),format.raw/*665.59*/("""
		"""),format.raw/*666.3*/("""document.getElementById("feeTo1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("feeTo").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*672.2*/("""}"""),format.raw/*672.3*/("""
	"""),format.raw/*673.2*/("""}"""),format.raw/*673.3*/("""else"""),format.raw/*673.7*/("""{"""),format.raw/*673.8*/("""
    	"""),format.raw/*674.6*/("""document.getElementById("feeTo1").innerHTML="";

	"""),format.raw/*676.2*/("""}"""),format.raw/*676.3*/("""
	
	
	
	
	"""),format.raw/*681.2*/("""//var role=document.forms["myForm"]["role"].value;
	var company=document.forms["myForm"]["company"].value;

	
	
if(!company)"""),format.raw/*686.13*/("""{"""),format.raw/*686.14*/("""
	"""),format.raw/*687.2*/("""if((role == 'Financial Planner' || role=='Professional')  && feeTo == 'Company')"""),format.raw/*687.82*/("""{"""),format.raw/*687.83*/("""
		"""),format.raw/*688.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*694.2*/("""}"""),format.raw/*694.3*/("""
"""),format.raw/*695.1*/("""}"""),format.raw/*695.2*/("""else if((role == 'Financial Planner' || role=='Professional') && feeTo == 'Company' && company.trim().length <2 )"""),format.raw/*695.115*/("""{"""),format.raw/*695.116*/("""
		"""),format.raw/*696.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">Company Name Should be more than one letter</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*702.2*/("""}"""),format.raw/*702.3*/("""else"""),format.raw/*702.7*/("""{"""),format.raw/*702.8*/("""
		"""),format.raw/*703.3*/("""document.getElementById("company1").innerHTML="";

	"""),format.raw/*705.2*/("""}"""),format.raw/*705.3*/("""


"""),format.raw/*708.1*/("""//var formattedaddress=document.forms["myForm"]["companyAddress"].value;
var companyAddress=document.forms["myForm"]["companyAddress"].value;



if(!companyAddress)"""),format.raw/*713.20*/("""{"""),format.raw/*713.21*/("""
	"""),format.raw/*714.2*/("""if((role == 'Financial Planner' || role=='Professional')  && feeTo == 'Company')"""),format.raw/*714.82*/("""{"""),format.raw/*714.83*/("""

		"""),format.raw/*716.3*/("""document.getElementById("formattedaddress1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("geocomplete").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*722.2*/("""}"""),format.raw/*722.3*/("""
	"""),format.raw/*723.2*/("""}"""),format.raw/*723.3*/("""else"""),format.raw/*723.7*/("""{"""),format.raw/*723.8*/("""
    	"""),format.raw/*724.6*/("""document.getElementById("formattedaddress1").innerHTML="";

	"""),format.raw/*726.2*/("""}"""),format.raw/*726.3*/("""
	


	"""),format.raw/*730.2*/("""var broker=document.forms["myForm"]["broker"].value;
if(!broker  && role=='Realtor'  )"""),format.raw/*731.34*/("""{"""),format.raw/*731.35*/("""


		"""),format.raw/*734.3*/("""document.getElementById("broker").focus();
		document.getElementById("broker1").innerHTML ="<p style=\"color:red\">This Feild is Required.</p>";
		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*739.2*/("""}"""),format.raw/*739.3*/("""else if(broker.trim().length<2)"""),format.raw/*739.34*/("""{"""),format.raw/*739.35*/("""
		
		"""),format.raw/*741.3*/("""document.getElementById("broker1").innerHTML="<p style=\"color:red\">Brokerage Name should be more than one letter</p>";
		
		document.getElementById("broker").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*748.2*/("""}"""),format.raw/*748.3*/(""" 
	
	
	"""),format.raw/*751.2*/("""else"""),format.raw/*751.6*/("""{"""),format.raw/*751.7*/("""
"""),format.raw/*752.1*/("""if(!broker.match(/^[a-zA-Z ]*$/))"""),format.raw/*752.34*/("""{"""),format.raw/*752.35*/("""
	"""),format.raw/*753.2*/("""document.getElementById("broker1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
	document.getElementById("broker").focus();
	document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


	value = false;

"""),format.raw/*760.1*/("""}"""),format.raw/*760.2*/("""else"""),format.raw/*760.6*/("""{"""),format.raw/*760.7*/("""
	"""),format.raw/*761.2*/("""document.getElementById("broker1").innerHTML = "";

"""),format.raw/*763.1*/("""}"""),format.raw/*763.2*/("""
	"""),format.raw/*764.2*/("""}"""),format.raw/*764.3*/("""





"""),format.raw/*770.1*/("""var address1=document.forms["myForm"]["companyAddress1"].value;
if(!address1 && role== 'Realtor')"""),format.raw/*771.34*/("""{"""),format.raw/*771.35*/("""
	
	"""),format.raw/*773.2*/("""document.getElementById("address1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("geocomplete1").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*779.1*/("""}"""),format.raw/*779.2*/("""else"""),format.raw/*779.6*/("""{"""),format.raw/*779.7*/("""
	"""),format.raw/*780.2*/("""document.getElementById("address1").innerHTML="";

"""),format.raw/*782.1*/("""}"""),format.raw/*782.2*/("""

"""),format.raw/*784.1*/("""var brokerPhone=document.forms["myForm"]["brokerPhone"].value;



if((!brokerPhone || brokerPhone=="___-___-____")  && role== 'Realtor'  )"""),format.raw/*788.73*/("""{"""),format.raw/*788.74*/("""
	
	"""),format.raw/*790.2*/("""document.getElementById("brokerPhone1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerPhone").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*796.1*/("""}"""),format.raw/*796.2*/("""else"""),format.raw/*796.6*/("""{"""),format.raw/*796.7*/("""
	"""),format.raw/*797.2*/("""document.getElementById("brokerPhone1").innerHTML="";

"""),format.raw/*799.1*/("""}"""),format.raw/*799.2*/("""


"""),format.raw/*802.1*/("""var brokerMange=document.forms["myForm"]["brokerMange"].value;

if(!brokerMange&& role== 'Realtor')"""),format.raw/*804.36*/("""{"""),format.raw/*804.37*/("""
	
	"""),format.raw/*806.2*/("""document.getElementById("brokerMange1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerMange").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*812.1*/("""}"""),format.raw/*812.2*/("""else if(brokerMange.trim().length<2)"""),format.raw/*812.38*/("""{"""),format.raw/*812.39*/("""
	"""),format.raw/*813.2*/("""document.getElementById("brokerMange1").innerHTML="<p style=\"color:red\">Broker Name Should be more than one letter </p>";
	document.getElementById("brokerMange").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

"""),format.raw/*818.1*/("""}"""),format.raw/*818.2*/("""

"""),format.raw/*820.1*/("""else"""),format.raw/*820.5*/("""{"""),format.raw/*820.6*/("""
	"""),format.raw/*821.2*/("""if(!brokerMange.match(/^[a-zA-Z ]*$/))"""),format.raw/*821.40*/("""{"""),format.raw/*821.41*/("""
		"""),format.raw/*822.3*/("""document.getElementById("brokerMange1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("brokerMange").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*829.2*/("""}"""),format.raw/*829.3*/("""else"""),format.raw/*829.7*/("""{"""),format.raw/*829.8*/("""
		"""),format.raw/*830.3*/("""document.getElementById("brokerMange1").innerHTML = "";

	"""),format.raw/*832.2*/("""}"""),format.raw/*832.3*/("""
"""),format.raw/*833.1*/("""}"""),format.raw/*833.2*/("""



"""),format.raw/*837.1*/("""var refer=document.forms["myForm"]["refer"].value;

if(!refer)"""),format.raw/*839.11*/("""{"""),format.raw/*839.12*/("""
	
	"""),format.raw/*841.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*847.1*/("""}"""),format.raw/*847.2*/("""else if(refer.trim().length<2)"""),format.raw/*847.32*/("""{"""),format.raw/*847.33*/("""
	
	"""),format.raw/*849.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">Referrar Name Should be more than one letter </p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*855.1*/("""}"""),format.raw/*855.2*/("""


"""),format.raw/*858.1*/("""else"""),format.raw/*858.5*/("""{"""),format.raw/*858.6*/("""
	"""),format.raw/*859.2*/("""if(!refer.match(/^[a-zA-Z ]*$/))"""),format.raw/*859.34*/("""{"""),format.raw/*859.35*/("""
		"""),format.raw/*860.3*/("""document.getElementById("refer1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("refer").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*867.2*/("""}"""),format.raw/*867.3*/("""else"""),format.raw/*867.7*/("""{"""),format.raw/*867.8*/("""
		"""),format.raw/*868.3*/("""document.getElementById("refer1").innerHTML = "";

	"""),format.raw/*870.2*/("""}"""),format.raw/*870.3*/("""

"""),format.raw/*872.1*/("""}"""),format.raw/*872.2*/("""


"""),format.raw/*875.1*/("""if(value)"""),format.raw/*875.10*/("""{"""),format.raw/*875.11*/("""
	 """),format.raw/*876.3*/("""$('#loading').show();
"""),format.raw/*877.1*/("""}"""),format.raw/*877.2*/("""
"""),format.raw/*878.1*/("""return value;
	 """),format.raw/*879.3*/("""}"""),format.raw/*879.4*/("""catch(err)"""),format.raw/*879.14*/("""{"""),format.raw/*879.15*/("""
	 """),format.raw/*880.3*/("""}"""),format.raw/*880.4*/("""
    
 """),format.raw/*882.2*/("""}"""),format.raw/*882.3*/("""
    
    """),format.raw/*884.5*/("""</script>


	<script src=""""),_display_(/*887.16*/routes/*887.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*887.72*/("""" type="text/javascript"></script>
</body>
</html>
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:26 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/visdomferral.scala.html
                  HASH: 9642ea0b3fa3a58172e6fe9436dfde38e6967370
                  MATRIX: 730->1|835->18|862->19|1211->342|1225->348|1281->384|1424->500|1439->506|1499->545|1553->572|1568->578|1638->627|1791->753|1806->759|1871->803|1924->829|1939->835|2006->881|2091->938|2120->939|2149->941|2281->1046|2309->1047|2338->1049|2370->1054|2398->1055|2427->1057|2490->1093|2518->1094|2546->1095|2623->1144|2652->1145|2684->1150|2728->1167|2756->1168|2784->1169|2852->1209|2881->1210|2910->1212|2994->1269|3022->1270|3050->1271|3114->1307|3143->1308|3179->1317|3237->1347|3266->1348|3305->1359|3434->1461|3463->1462|3530->1501|3559->1502|3598->1513|3671->1559|3700->1560|3736->1569|3764->1570|3837->1615|3866->1616|3902->1625|3961->1656|3990->1657|4029->1668|4158->1770|4187->1771|4254->1810|4283->1811|4322->1822|4396->1869|4425->1870|4461->1879|4489->1880|4620->1983|4649->1984|4682->1990|5028->2309|5056->2310|5168->2394|5197->2395|5233->2404|5376->2519|5405->2520|5443->2530|6224->3283|6253->3284|6287->3290|6316->3291|6345->3292|6575->3494|6591->3500|6655->3542|6699->3558|6715->3564|6778->3605|6864->3663|6880->3669|6941->3708|7018->3757|7034->3763|7090->3797|7167->3846|7183->3852|7242->3889|7314->3932|7344->3933|7374->3935|7506->4039|7522->4045|7580->4081|7647->4120|7676->4121|7705->4122|7747->4135|7777->4136|7808->4139|7986->4289|8015->4290|8046->4293|8082->4301|8112->4302|8143->4305|8376->4510|8405->4511|8435->4513|8582->4632|8598->4638|8661->4679|8797->4787|8813->4793|8875->4833|9604->5533|9634->5534|9664->5535|9704->5546|9734->5547|9764->5548|13564->9320|13594->9321|13624->9322|13660->9329|13690->9330|13720->9331|14606->10188|14636->10189|14666->10190|14709->10204|14739->10205|14769->10206|15719->11127|15749->11128|15779->11129|15823->11144|15853->11145|15883->11146|17815->13049|17845->13050|17882->13059|17997->13146|18026->13147|18120->13212|18150->13213|18187->13222|18302->13309|18331->13310|18416->13366|18446->13367|18479->13372|18550->13415|18579->13416|18798->13606|18828->13607|18865->13616|18924->13646|18954->13647|18994->13658|19124->13760|19154->13761|19222->13800|19252->13801|19292->13812|19366->13858|19396->13859|19433->13868|19462->13869|19537->13915|19567->13916|19604->13925|19664->13956|19694->13957|19734->13968|19864->14070|19894->14071|19962->14110|19992->14111|20032->14122|20107->14169|20137->14170|20174->14179|20203->14180|20397->14345|20427->14346|20464->14355|20525->14387|20555->14388|20597->14401|20722->14497|20752->14498|20798->14515|20871->14559|20901->14560|20939->14570|20969->14571|21002->14576|21031->14577|21136->14653|21166->14654|21200->14660|21231->14663|21260->14664|21291->14667|21398->14745|21428->14746|21460->14750|21792->15054|21821->15055|21853->15059|21882->15060|21917->15067|21995->15117|22024->15118|22057->15123|22153->15190|22183->15191|22215->15195|22549->15501|22578->15502|22637->15532|22667->15533|22707->15545|23068->15878|23097->15879|23126->15880|23158->15884|23188->15885|23220->15889|23281->15921|23311->15922|23344->15927|23697->16252|23726->16253|23758->16257|23788->16258|23821->16263|23903->16317|23932->16318|23964->16322|23993->16323|24029->16331|24125->16398|24155->16399|24191->16407|24523->16711|24552->16712|24611->16742|24641->16743|24681->16755|25042->17088|25071->17089|25103->17093|25132->17094|25170->17104|25231->17136|25261->17137|25295->17143|25652->17472|25681->17473|25714->17477|25744->17478|25778->17484|25861->17539|25890->17540|25923->17545|25952->17546|25987->17553|26083->17620|26113->17621|26149->17629|26479->17931|26508->17932|26540->17936|26569->17937|26604->17944|26683->17995|26712->17996|26751->18007|26988->18216|27018->18217|27065->18236|27094->18237|27127->18241|27157->18242|27191->18248|27531->18560|27560->18561|27598->18571|27647->18591|27677->18592|27724->18611|27753->18612|27786->18616|27816->18617|27850->18623|28190->18935|28219->18936|28252->18941|28295->18955|28325->18956|28354->18957|28681->19256|28710->19257|28743->19261|28773->19262|28807->19268|28887->19320|28916->19321|28951->19328|29045->19393|29075->19394|29106->19397|29444->19707|29473->19708|29504->19711|29536->19715|29565->19716|29599->19722|29677->19772|29706->19773|29742->19781|29834->19844|29864->19845|29896->19849|29980->19904|30010->19905|30041->19908|30375->20214|30404->20215|30434->20217|30463->20218|30495->20222|30524->20223|30558->20229|30636->20279|30665->20280|30703->20290|30856->20414|30886->20415|30916->20417|31025->20497|31055->20498|31086->20501|31424->20811|31453->20812|31482->20813|31511->20814|31654->20927|31685->20928|31716->20931|32075->21262|32104->21263|32136->21267|32165->21268|32196->21271|32276->21323|32305->21324|32336->21327|32529->21491|32559->21492|32589->21494|32698->21574|32728->21575|32760->21579|33111->21902|33140->21903|33170->21905|33199->21906|33231->21910|33260->21911|33294->21917|33383->21978|33412->21979|33446->21985|33561->22071|33591->22072|33624->22077|33961->22386|33990->22387|34050->22418|34080->22419|34114->22425|34476->22759|34505->22760|34540->22767|34572->22771|34601->22772|34630->22773|34692->22806|34722->22807|34752->22809|35095->23124|35124->23125|35156->23129|35185->23130|35215->23132|35295->23184|35324->23185|35354->23187|35383->23188|35417->23194|35543->23291|35573->23292|35605->23296|35944->23607|35973->23608|36005->23612|36034->23613|36064->23615|36143->23666|36172->23667|36202->23669|36369->23807|36399->23808|36431->23812|36773->24126|36802->24127|36834->24131|36863->24132|36893->24134|36976->24189|37005->24190|37036->24193|37164->24292|37194->24293|37226->24297|37568->24611|37597->24612|37662->24648|37692->24649|37722->24651|38070->24971|38099->24972|38129->24974|38161->24978|38190->24979|38220->24981|38287->25019|38317->25020|38348->25023|38705->25352|38734->25353|38766->25357|38795->25358|38826->25361|38912->25419|38941->25420|38970->25421|38999->25422|39031->25426|39122->25488|39152->25489|39184->25493|39514->25795|39543->25796|39602->25826|39632->25827|39664->25831|40016->26155|40045->26156|40076->26159|40108->26163|40137->26164|40167->26166|40228->26198|40258->26199|40289->26202|40634->26519|40663->26520|40695->26524|40724->26525|40755->26528|40835->26580|40864->26581|40894->26583|40923->26584|40954->26587|40992->26596|41022->26597|41053->26600|41103->26622|41132->26623|41161->26624|41205->26640|41234->26641|41273->26651|41303->26652|41334->26655|41363->26656|41398->26663|41427->26664|41465->26674|41520->26701|41536->26707|41608->26757
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|39->11|39->11|39->11|41->13|41->13|41->13|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|49->21|55->27|55->27|57->29|57->29|57->29|58->30|60->32|60->32|61->33|61->33|61->33|62->34|63->35|63->35|64->36|64->36|64->36|65->37|68->40|68->40|69->41|71->43|71->43|72->44|72->44|72->44|73->45|76->48|76->48|78->50|78->50|79->51|80->52|80->52|81->53|81->53|85->57|85->57|86->58|86->58|86->58|87->59|90->62|90->62|92->64|92->64|93->65|94->66|94->66|95->67|95->67|98->70|98->70|99->71|104->76|104->76|109->81|109->81|110->82|113->85|113->85|114->86|129->101|129->101|130->102|130->102|130->102|136->108|136->108|136->108|137->109|137->109|137->109|138->110|138->110|138->110|139->111|139->111|139->111|140->112|140->112|140->112|145->117|145->117|146->118|152->124|152->124|152->124|153->125|153->125|153->125|155->127|155->127|156->128|166->138|166->138|168->140|168->140|168->140|169->141|179->151|179->151|181->153|197->169|197->169|197->169|204->176|204->176|204->176|234->206|234->206|234->206|234->206|234->206|234->206|348->320|348->320|348->320|348->320|348->320|348->320|368->340|368->340|368->340|368->340|368->340|368->340|390->362|390->362|390->362|390->362|390->362|390->362|458->430|458->430|459->431|462->434|462->434|466->438|466->438|467->439|470->442|470->442|477->449|477->449|478->450|479->451|479->451|487->459|487->459|488->460|488->460|488->460|489->461|492->464|492->464|494->466|494->466|495->467|496->468|496->468|497->469|497->469|501->473|501->473|502->474|502->474|502->474|503->475|506->478|506->478|508->480|508->480|509->481|510->482|510->482|511->483|511->483|516->488|516->488|517->489|518->490|518->490|519->491|521->493|521->493|522->494|523->495|523->495|524->496|524->496|525->497|525->497|529->501|529->501|531->503|531->503|531->503|532->504|534->506|534->506|535->507|541->513|541->513|541->513|541->513|542->514|544->516|544->516|546->518|549->521|549->521|550->522|556->528|556->528|556->528|556->528|559->531|567->539|567->539|567->539|567->539|567->539|568->540|568->540|568->540|569->541|576->548|576->548|576->548|576->548|577->549|579->551|579->551|581->553|581->553|584->556|586->558|586->558|588->560|593->565|593->565|593->565|593->565|596->568|604->576|604->576|604->576|604->576|606->578|606->578|606->578|607->579|614->586|614->586|614->586|614->586|615->587|617->589|617->589|619->591|619->591|621->593|623->595|623->595|625->597|631->603|631->603|631->603|631->603|632->604|634->606|634->606|637->609|641->613|641->613|643->615|643->615|643->615|643->615|644->616|650->622|650->622|652->624|652->624|652->624|654->626|654->626|654->626|654->626|655->627|661->633|661->633|662->634|662->634|662->634|663->635|669->641|669->641|669->641|669->641|670->642|672->644|672->644|674->646|676->648|676->648|677->649|683->655|683->655|684->656|684->656|684->656|685->657|687->659|687->659|689->661|691->663|691->663|693->665|693->665|693->665|694->666|700->672|700->672|701->673|701->673|701->673|701->673|702->674|704->676|704->676|709->681|714->686|714->686|715->687|715->687|715->687|716->688|722->694|722->694|723->695|723->695|723->695|723->695|724->696|730->702|730->702|730->702|730->702|731->703|733->705|733->705|736->708|741->713|741->713|742->714|742->714|742->714|744->716|750->722|750->722|751->723|751->723|751->723|751->723|752->724|754->726|754->726|758->730|759->731|759->731|762->734|767->739|767->739|767->739|767->739|769->741|776->748|776->748|779->751|779->751|779->751|780->752|780->752|780->752|781->753|788->760|788->760|788->760|788->760|789->761|791->763|791->763|792->764|792->764|798->770|799->771|799->771|801->773|807->779|807->779|807->779|807->779|808->780|810->782|810->782|812->784|816->788|816->788|818->790|824->796|824->796|824->796|824->796|825->797|827->799|827->799|830->802|832->804|832->804|834->806|840->812|840->812|840->812|840->812|841->813|846->818|846->818|848->820|848->820|848->820|849->821|849->821|849->821|850->822|857->829|857->829|857->829|857->829|858->830|860->832|860->832|861->833|861->833|865->837|867->839|867->839|869->841|875->847|875->847|875->847|875->847|877->849|883->855|883->855|886->858|886->858|886->858|887->859|887->859|887->859|888->860|895->867|895->867|895->867|895->867|896->868|898->870|898->870|900->872|900->872|903->875|903->875|903->875|904->876|905->877|905->877|906->878|907->879|907->879|907->879|907->879|908->880|908->880|910->882|910->882|912->884|915->887|915->887|915->887
                  -- GENERATED --
              */
          