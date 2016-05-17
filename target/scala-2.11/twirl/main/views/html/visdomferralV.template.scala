
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
object visdomferralV extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
  
<script src=""""),_display_(/*12.15*/routes/*12.21*/.Assets.at("_resources/ui-bootstrap-tpls.min.js")),format.raw/*12.70*/(""""></script>
<!--  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

 -->   <script src=""""),_display_(/*15.22*/routes/*15.28*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*15.72*/(""""></script>
    <script src=""""),_display_(/*16.19*/routes/*16.25*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*16.71*/(""""></script>
    <style type="text/css">
  
    .blocks .btn-primary 
"""),format.raw/*20.1*/("""{"""),format.raw/*20.2*/("""
"""),format.raw/*21.1*/("""font-weight:bold;
    padding: 9px 6px;
    margin:2px 2px;
    		background-color: #0086b3;
    
     border-radius: 0;
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/(""" 
    """),format.raw/*28.5*/("""</style>
    <script>
      $(function()"""),format.raw/*30.19*/("""{"""),format.raw/*30.20*/("""
        """),format.raw/*31.9*/("""$("#geocomplete").geocomplete("""),format.raw/*31.39*/("""{"""),format.raw/*31.40*/("""
          """),format.raw/*32.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/(""");

        $("#find").click(function()"""),format.raw/*37.36*/("""{"""),format.raw/*37.37*/("""
          """),format.raw/*38.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/(""");
      """),format.raw/*40.7*/("""}"""),format.raw/*40.8*/(""");
    </script>
    
      <script>
      $(function()"""),format.raw/*44.19*/("""{"""),format.raw/*44.20*/("""
        """),format.raw/*45.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*45.40*/("""{"""),format.raw/*45.41*/("""
          """),format.raw/*46.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/(""");

        $("#find").click(function()"""),format.raw/*51.36*/("""{"""),format.raw/*51.37*/("""
          """),format.raw/*52.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*53.9*/("""}"""),format.raw/*53.10*/(""");
      """),format.raw/*54.7*/("""}"""),format.raw/*54.8*/(""");
    </script> 
    <script type="text/javascript">
  /*   $.get("https://ipinfo.io", function (response) """),format.raw/*57.55*/("""{"""),format.raw/*57.56*/("""
    	"""),format.raw/*58.6*/("""document.getElementById("ip").value=JSON.stringify(response, null, 4);
    	alert(JSON.stringify(response, null, 4));
    		/* $("#ip").html("IP: " + response.ip);
        $("#address").html("Location: " + response.city + ", " + response.region); */
       // $("#details").html(JSON.stringify(response, null, 4));
    """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/(""", "jsonp"); */
    </script>
    
    <script type="text/javascript">
    
    jQuery.ajax( """),format.raw/*68.18*/("""{"""),format.raw/*68.19*/(""" 
    	  """),format.raw/*69.8*/("""url: 'http://ip-api.com/json', 
    	  type: 'POST', 
    	  dataType: 'jsonp',
    	  success: function(location) """),format.raw/*72.36*/("""{"""),format.raw/*72.37*/("""
    	    """),format.raw/*73.10*/("""// example where I update content on the page.
    	    
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
    	  """),format.raw/*88.8*/("""}"""),format.raw/*88.9*/("""
    	"""),format.raw/*89.6*/("""}"""),format.raw/*89.7*/(""" """),format.raw/*89.8*/(""");
    </script>

<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->  <link rel="stylesheet" href="_resources/bootstrap.min.css">
 <link rel="stylesheet" href=""""),_display_(/*94.32*/routes/*94.38*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*94.80*/("""">
<script src="""),_display_(/*95.14*/routes/*95.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*95.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*96.47*/routes/*96.53*/.Assets.at("_resources/background.css")),format.raw/*96.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*97.47*/routes/*97.53*/.Assets.at("_resources/forms.css")),format.raw/*97.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*98.47*/routes/*98.53*/.Assets.at("_resources/template.css")),format.raw/*98.90*/("""">
<style type="text/css">



/*  #loading """),format.raw/*103.14*/("""{"""),format.raw/*103.15*/("""
	"""),format.raw/*104.2*/("""position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background: url('"""),_display_(/*110.20*/routes/*110.26*/.Assets.at("images/page-loader.gif")),format.raw/*110.62*/("""') 50% 50% no-repeat rgb(249,249,249);
"""),format.raw/*111.1*/("""}"""),format.raw/*111.2*/(""" """),format.raw/*111.3*/("""*/

 #overlay"""),format.raw/*113.10*/("""{"""),format.raw/*113.11*/(""" 
	"""),format.raw/*114.2*/("""display: none;
	position: fixed;
	background: threedhighlight;
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;

"""),format.raw/*124.1*/("""}"""),format.raw/*124.2*/(""" 

"""),format.raw/*126.1*/("""#loading"""),format.raw/*126.9*/("""{"""),format.raw/*126.10*/(""" 
	"""),format.raw/*127.2*/("""padding: 10px 10px 10px 60px; 
		position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background-color:threedhighlight;
    opacity: 0.6;
    filter: alpha(opacity=60); */
"""),format.raw/*137.1*/("""}"""),format.raw/*137.2*/("""

"""),format.raw/*139.1*/("""</style> 







  
  </head>
<body>


  <div id="loading" style="display: none" align="center" >
 
  
     <img src=""""),_display_(/*155.17*/routes/*155.23*/.Assets.at("/images/preloader-image.gif")),format.raw/*155.64*/("""" alt="" />
  
  </div>  


 <div style="padding-bottom:20px; margin-top:20px;padding-left: 45%">
                		<img alt="Visdom Logo" height="90" width="260"  src=""""),_display_(/*161.73*/routes/*161.79*/.Assets.at("_resources/visdom-logo.png")),format.raw/*161.119*/("""" />
              
              
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

					<div ng-controller="DemoController">
					 <input type="hidden" name="ip" value="" id="ip">	
					
				
				
					<div class="form-group" style="width: 60%">
							<label for="usr"> <Strong>What best describes
									your role? </Strong><span style="color: red; font-size: 4">*</span></label>

						</div>

						
						<div class="btn-group blocks">
							<label style="width: 180px; font-weight:bold;   border-style:groove;" class="btn btn-primary btn-space full" btn-radio="'Realtor'"
								ng-change="change()"  ng-model="newItemType"> Realtor
								
							</label> <label style="width: 180px;border-style:groove;" class="btn btn-primary full " btn-radio="'Financial Planner'"
								ng-change="change()"  ng-model="newItemType"> Financial Planner
							</label><br>
				
							
							
								<label style="width: 180px;border-style:groove;" class="btn btn-primary " btn-radio="'Professional'"
								ng-change="change()" ng-model="newItemType">Professional
								
							</label> <label style="width: 180px;border-style:groove;" class="btn btn-primary " btn-radio="'Client'"
								ng-change="change()" ng-model="newItemType"> Client
							</label>
							  <div id="role1"> </div>
							
						</div>
					
					<input type="hidden" id="role" name="role" value=""""),format.raw/*217.56*/("""{"""),format.raw/*217.57*/("""{"""),format.raw/*217.58*/("""newItemType"""),format.raw/*217.69*/("""}"""),format.raw/*217.70*/("""}"""),format.raw/*217.71*/("""" ng-required>

						<br><br><br> 
						 <div ng-show="newItemType == 'Financial Planner'" class="form-input-wide">
          <div id="text_45" class="form-html">
<iframe src="//fast.wistia.net/embed/iframe/olmeoln42z?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="388"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script>
          </div>
        </div>
       
 
    
				 <div ng-show="newItemType == 'Client'" class="form-input-wide">
          <div id="text_49" class="form-html">
         <iframe src="//fast.wistia.net/embed/iframe/4kbavt9xtq?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="360"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script> 
          </div>
        </div>
        
         <div ng-show="newItemType == 'Professional'" class="form-input-wide">
          <div id="text_48" class="form-html">
<iframe src="//fast.wistia.net/embed/iframe/4kbavt9xtq?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="360"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script>
          </div>
        </div>
        
        <div  ng-show="newItemType == 'Realtor'"class="form-input-wide">
          <div id="text_44" class="form-html">
<iframe src="//fast.wistia.net/embed/iframe/knrl2x62ub?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="360"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script>
          </div>
          
         <!--   <div id="text_45" class="form-html">
<iframe src="//fast.wistia.net/embed/iframe/hdwakgzahi?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="388"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script>
          </div> -->
        </div>
        <br>

					
	
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
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*335.61*/("""{"""),format.raw/*335.62*/("""{"""),format.raw/*335.63*/("""company"""),format.raw/*335.70*/("""}"""),format.raw/*335.71*/("""}"""),format.raw/*335.72*/(""""> <br>
								<br>


								<div class="map_canvas"></div>

								<div class="form-group" ng-show="company == 'Company' " style="width: 280px">
									<label for="pwd"><Strong> Company Name  </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
									id="company"	name="company" class="form-control" >
									<div id="company1"></div>

								</div>

								<div class="form-group" ng-show="company == 'Company' "  style="width: 280px">
									<label for="pwd"><Strong> Company Address </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input
										id="geocomplete" type="text" name="formatted_address"
										class="form-control" ng-model="companyAddress"
										placeholder="Enter Location" ng-required> <input
										type="hidden" name="companyAddress" value=""""),format.raw/*355.54*/("""{"""),format.raw/*355.55*/("""{"""),format.raw/*355.56*/("""companyAddress"""),format.raw/*355.70*/("""}"""),format.raw/*355.71*/("""}"""),format.raw/*355.72*/("""">
									<div id="formattedaddress1"></div>


								</div>
							</div>
							<div ng-show="newItemType == 'Realtor'">

								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong>Brokerage Name </Strong><span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
									id="broker"	name="broker" class="form-control" ng-required>
									<div id="broker1"></div>

								</div>
								<div class="map_canvas"></div>
								<div class="form-group" style="width: 280px; height: 30%">
									<label for="pwd"><Strong> Brokerage Address</Strong> <span style="color: red; font-size: 4">*</span>
									</label> <input id="geocomplete1" type="text"
										ng-model="companyAddress1" name="formatted_address"
										class="form-control" placeholder="Enter Location" ng-required>
									<input type="hidden" name="companyAddress1"
										value=""""),format.raw/*377.18*/("""{"""),format.raw/*377.19*/("""{"""),format.raw/*377.20*/("""companyAddress1"""),format.raw/*377.35*/("""}"""),format.raw/*377.36*/("""}"""),format.raw/*377.37*/("""">

									<div id="address1"></div>

								</div>
								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong> Brokerage Phone number</Strong> <span
										style="color: red; font-size: 4">*</span> </label> <input type="tel"
										id="brokerPhone" name="brokerPhone" class="form-control"
										ng-required>

									<div id="brokerPhone1"></div>

								</div>

								<div class="form-group" style="width: 280px">
									<label for="pwd"><Strong>Who is your Broker? </Strong> <span
										style="color: red; font-size: 4">*</span> </label> <input type="text"
									id="brokerMange"	name="brokerMange" class="form-control" ng-required>
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
    $(function() """),format.raw/*440.18*/("""{"""),format.raw/*440.19*/("""
        """),format.raw/*441.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*444.5*/("""}"""),format.raw/*444.6*/(""");
	
</script>
	<script type="text/javascript">
    $(function() """),format.raw/*448.18*/("""{"""),format.raw/*448.19*/("""
        """),format.raw/*449.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#brokerPhone").mask("999-999-9999");
    """),format.raw/*452.5*/("""}"""),format.raw/*452.6*/(""");
	
</script>



	<script>
$(document).ready(function()"""),format.raw/*459.29*/("""{"""),format.raw/*459.30*/("""
    """),format.raw/*460.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*461.1*/("""}"""),format.raw/*461.2*/(""");
</script>

	<script
		src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>

	<script src="jquery.geocomplete.js"></script>
	<script>
      $(function()"""),format.raw/*469.19*/("""{"""),format.raw/*469.20*/("""
        """),format.raw/*470.9*/("""$("#geocomplete").geocomplete("""),format.raw/*470.39*/("""{"""),format.raw/*470.40*/("""
          """),format.raw/*471.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*474.9*/("""}"""),format.raw/*474.10*/(""");

        $("#find").click(function()"""),format.raw/*476.36*/("""{"""),format.raw/*476.37*/("""
          """),format.raw/*477.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*478.9*/("""}"""),format.raw/*478.10*/(""");
      """),format.raw/*479.7*/("""}"""),format.raw/*479.8*/(""");
    </script>

	<script>
      $(function()"""),format.raw/*483.19*/("""{"""),format.raw/*483.20*/("""
        """),format.raw/*484.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*484.40*/("""{"""),format.raw/*484.41*/("""
          """),format.raw/*485.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*488.9*/("""}"""),format.raw/*488.10*/(""");

        $("#find").click(function()"""),format.raw/*490.36*/("""{"""),format.raw/*490.37*/("""
          """),format.raw/*491.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*492.9*/("""}"""),format.raw/*492.10*/(""");
      """),format.raw/*493.7*/("""}"""),format.raw/*493.8*/(""");
    </script>
	<script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*498.56*/("""{"""),format.raw/*498.57*/("""
        """),format.raw/*499.9*/("""init();
        function init() """),format.raw/*500.25*/("""{"""),format.raw/*500.26*/("""
            """),format.raw/*501.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*503.41*/("""{"""),format.raw/*503.42*/("""
                """),format.raw/*504.17*/("""console.log($scope.newItemType)
            """),format.raw/*505.13*/("""}"""),format.raw/*505.14*/(""";
        """),format.raw/*506.9*/("""}"""),format.raw/*506.10*/("""
    """),format.raw/*507.5*/("""}"""),format.raw/*507.6*/(""");
    </script>

	<script type="text/javascript">
 function validateForm() """),format.raw/*511.26*/("""{"""),format.raw/*511.27*/("""
	 
	 
	 """),format.raw/*514.3*/("""try"""),format.raw/*514.6*/("""{"""),format.raw/*514.7*/("""
		"""),format.raw/*515.3*/("""var role=document.forms["myForm"]["role"].value;
		var value=true;
		if(!role)"""),format.raw/*517.12*/("""{"""),format.raw/*517.13*/("""
			"""),format.raw/*518.4*/("""document.getElementById("role1").innerHTML="<p style=\"color:red\">Please Select Role</p>";
			document.getElementById("role").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*524.3*/("""}"""),format.raw/*524.4*/("""else"""),format.raw/*524.8*/("""{"""),format.raw/*524.9*/("""
	    	"""),format.raw/*525.7*/("""document.getElementById("role1").innerHTML="";

		"""),format.raw/*527.3*/("""}"""),format.raw/*527.4*/(""" 

	 """),format.raw/*529.3*/("""var fname=document.forms["myForm"]["fname"].value;
	 

		if(!fname)"""),format.raw/*532.13*/("""{"""),format.raw/*532.14*/("""
			"""),format.raw/*533.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*539.3*/("""}"""),format.raw/*539.4*/("""else if(fname.trim().length<2)"""),format.raw/*539.34*/("""{"""),format.raw/*539.35*/("""
			
			
			"""),format.raw/*542.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName  Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*550.3*/("""}"""),format.raw/*550.4*/(""" """),format.raw/*550.5*/("""else"""),format.raw/*550.9*/("""{"""),format.raw/*550.10*/("""
			"""),format.raw/*551.4*/("""if(!fname.match(/^[a-zA-Z ]*$/))"""),format.raw/*551.36*/("""{"""),format.raw/*551.37*/("""
				"""),format.raw/*552.5*/("""document.getElementById("fname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
				document.getElementById("fname").focus();
				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


				value = false;

			"""),format.raw/*559.4*/("""}"""),format.raw/*559.5*/("""else"""),format.raw/*559.9*/("""{"""),format.raw/*559.10*/("""
				"""),format.raw/*560.5*/("""document.getElementById("fname1").innerHTML = "";

			"""),format.raw/*562.4*/("""}"""),format.raw/*562.5*/("""

		"""),format.raw/*564.3*/("""}"""),format.raw/*564.4*/(""" 
		

		"""),format.raw/*567.3*/("""var lname=document.forms["myForm"]["lname"].value;
		 
		if(!lname)"""),format.raw/*569.13*/("""{"""),format.raw/*569.14*/("""
			
			"""),format.raw/*571.4*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
			document.getElementById("lname").focus();
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*576.3*/("""}"""),format.raw/*576.4*/("""else if(lname.trim().length<2)"""),format.raw/*576.34*/("""{"""),format.raw/*576.35*/("""
			
			
			"""),format.raw/*579.4*/("""document.getElementById("lname").focus();

			document.getElementById("lname1").innerHTML="<p style=\"color:red\">Last  Name Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*587.3*/("""}"""),format.raw/*587.4*/("""else"""),format.raw/*587.8*/("""{"""),format.raw/*587.9*/("""
				
				"""),format.raw/*589.5*/("""if(!lname.match(/^[a-zA-Z ]*$/))"""),format.raw/*589.37*/("""{"""),format.raw/*589.38*/("""
					"""),format.raw/*590.6*/("""document.getElementById("lname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
					document.getElementById("lname").focus();
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


					value = false;

				"""),format.raw/*597.5*/("""}"""),format.raw/*597.6*/("""else"""),format.raw/*597.10*/("""{"""),format.raw/*597.11*/("""
					"""),format.raw/*598.6*/("""document.getElementById("lname1").innerHTML = "";

				"""),format.raw/*600.5*/("""}"""),format.raw/*600.6*/("""

			"""),format.raw/*602.4*/("""}"""),format.raw/*602.5*/(""" 
	 
		
		
	 
		"""),format.raw/*607.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*609.13*/("""{"""),format.raw/*609.14*/("""
			
			"""),format.raw/*611.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*617.3*/("""}"""),format.raw/*617.4*/("""else"""),format.raw/*617.8*/("""{"""),format.raw/*617.9*/("""
	    	"""),format.raw/*618.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*620.3*/("""}"""),format.raw/*620.4*/("""
	 
	 
    """),format.raw/*623.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*627.24*/("""{"""),format.raw/*627.25*/("""         
		  
    """),format.raw/*629.5*/("""}"""),format.raw/*629.6*/("""else"""),format.raw/*629.10*/("""{"""),format.raw/*629.11*/("""   
		"""),format.raw/*630.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*636.5*/("""}"""),format.raw/*636.6*/("""
    
    """),format.raw/*638.5*/("""if(pattern.test(x2))"""),format.raw/*638.25*/("""{"""),format.raw/*638.26*/("""         
		  
    """),format.raw/*640.5*/("""}"""),format.raw/*640.6*/("""else"""),format.raw/*640.10*/("""{"""),format.raw/*640.11*/("""   
		"""),format.raw/*641.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email2").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
    """),format.raw/*647.5*/("""}"""),format.raw/*647.6*/("""
    """),format.raw/*648.5*/("""if (x  != x2) """),format.raw/*648.19*/("""{"""),format.raw/*648.20*/("""
"""),format.raw/*649.1*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
document.getElementById("email").focus();

document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

value= false;
    """),format.raw/*655.5*/("""}"""),format.raw/*655.6*/("""else"""),format.raw/*655.10*/("""{"""),format.raw/*655.11*/("""
    	"""),format.raw/*656.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*658.5*/("""}"""),format.raw/*658.6*/("""
    
	"""),format.raw/*660.2*/("""var phone=document.forms["myForm"]["phone"].value;
	 
	if(!phone)"""),format.raw/*662.12*/("""{"""),format.raw/*662.13*/("""
		"""),format.raw/*663.3*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
		document.getElementById("phonedatata").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*669.2*/("""}"""),format.raw/*669.3*/("""	
	"""),format.raw/*670.2*/("""else"""),format.raw/*670.6*/("""{"""),format.raw/*670.7*/("""
    	"""),format.raw/*671.6*/("""document.getElementById("phone1").innerHTML="";

	"""),format.raw/*673.2*/("""}"""),format.raw/*673.3*/(""" 
    
	"""),format.raw/*675.2*/("""var feeTo=document.forms["myForm"]["feeTo"].value;

	if(!feeTo)"""),format.raw/*677.12*/("""{"""),format.raw/*677.13*/("""

		"""),format.raw/*679.3*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*679.58*/("""{"""),format.raw/*679.59*/("""
		"""),format.raw/*680.3*/("""document.getElementById("feeTo1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("feeTo").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*686.2*/("""}"""),format.raw/*686.3*/("""
	"""),format.raw/*687.2*/("""}"""),format.raw/*687.3*/("""else"""),format.raw/*687.7*/("""{"""),format.raw/*687.8*/("""
    	"""),format.raw/*688.6*/("""document.getElementById("feeTo1").innerHTML="";

	"""),format.raw/*690.2*/("""}"""),format.raw/*690.3*/("""
	
	
	
	
	
	"""),format.raw/*696.2*/("""//var role=document.forms["myForm"]["role"].value;
	var company=document.forms["myForm"]["company"].value;

	
	
if(!company)"""),format.raw/*701.13*/("""{"""),format.raw/*701.14*/("""
	"""),format.raw/*702.2*/("""if( (role == 'Financial Planner' || role=='Professional')  && feeTo == 'Company')"""),format.raw/*702.83*/("""{"""),format.raw/*702.84*/("""
		"""),format.raw/*703.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*709.2*/("""}"""),format.raw/*709.3*/("""
	"""),format.raw/*710.2*/("""}"""),format.raw/*710.3*/("""else if((role == 'Financial Planner' || role=='Professional') && feeTo == 'Company' && company.trim().length <2 )"""),format.raw/*710.116*/("""{"""),format.raw/*710.117*/("""
		"""),format.raw/*711.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">Company Name Should be more than one letter</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*717.2*/("""}"""),format.raw/*717.3*/("""else"""),format.raw/*717.7*/("""{"""),format.raw/*717.8*/("""
		"""),format.raw/*718.3*/("""document.getElementById("company1").innerHTML="";

	"""),format.raw/*720.2*/("""}"""),format.raw/*720.3*/("""


"""),format.raw/*723.1*/("""//var formattedaddress=document.forms["myForm"]["companyAddress"].value;
var companyAddress=document.forms["myForm"]["companyAddress"].value;


if(!companyAddress)"""),format.raw/*727.20*/("""{"""),format.raw/*727.21*/("""
	"""),format.raw/*728.2*/("""if((role == 'Financial Planner' || role=='Professional')  && feeTo == 'Company')"""),format.raw/*728.82*/("""{"""),format.raw/*728.83*/("""

		"""),format.raw/*730.3*/("""document.getElementById("formattedaddress1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("geocomplete").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*736.2*/("""}"""),format.raw/*736.3*/("""
	"""),format.raw/*737.2*/("""}"""),format.raw/*737.3*/("""else"""),format.raw/*737.7*/("""{"""),format.raw/*737.8*/("""
    	"""),format.raw/*738.6*/("""document.getElementById("formattedaddress1").innerHTML="";

	"""),format.raw/*740.2*/("""}"""),format.raw/*740.3*/("""
	

	
	"""),format.raw/*744.2*/("""var broker=document.forms["myForm"]["broker"].value;
if(!broker  && role=='Realtor'  )"""),format.raw/*745.34*/("""{"""),format.raw/*745.35*/("""


		"""),format.raw/*748.3*/("""document.getElementById("broker").focus();
		document.getElementById("broker1").innerHTML ="<p style=\"color:red\">This Feild is Required.</p>";
		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*753.2*/("""}"""),format.raw/*753.3*/("""else if(broker.trim().length<2)"""),format.raw/*753.34*/("""{"""),format.raw/*753.35*/("""
		
		"""),format.raw/*755.3*/("""document.getElementById("broker1").innerHTML="<p style=\"color:red\">Brokerage Name should be more than one letter</p>";
		
		document.getElementById("broker").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value= false;
	"""),format.raw/*762.2*/("""}"""),format.raw/*762.3*/(""" 
	
	
	"""),format.raw/*765.2*/("""else"""),format.raw/*765.6*/("""{"""),format.raw/*765.7*/("""
"""),format.raw/*766.1*/("""if(!broker.match(/^[a-zA-Z ]*$/))"""),format.raw/*766.34*/("""{"""),format.raw/*766.35*/("""
	"""),format.raw/*767.2*/("""document.getElementById("broker1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
	document.getElementById("broker").focus();
	document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


	value = false;

"""),format.raw/*774.1*/("""}"""),format.raw/*774.2*/("""else"""),format.raw/*774.6*/("""{"""),format.raw/*774.7*/("""
	"""),format.raw/*775.2*/("""document.getElementById("broker1").innerHTML = "";

"""),format.raw/*777.1*/("""}"""),format.raw/*777.2*/("""
	"""),format.raw/*778.2*/("""}"""),format.raw/*778.3*/("""


"""),format.raw/*781.1*/("""var address1=document.forms["myForm"]["companyAddress1"].value;
if(!address1 && role== 'Realtor')"""),format.raw/*782.34*/("""{"""),format.raw/*782.35*/("""
	
	"""),format.raw/*784.2*/("""document.getElementById("address1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("geocomplete1").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*790.1*/("""}"""),format.raw/*790.2*/("""else"""),format.raw/*790.6*/("""{"""),format.raw/*790.7*/("""
	"""),format.raw/*791.2*/("""document.getElementById("address1").innerHTML="";

"""),format.raw/*793.1*/("""}"""),format.raw/*793.2*/("""

"""),format.raw/*795.1*/("""var brokerPhone=document.forms["myForm"]["brokerPhone"].value;



if((!brokerPhone || brokerPhone=="___-___-____")&& role== 'Realtor')"""),format.raw/*799.69*/("""{"""),format.raw/*799.70*/("""
	
	"""),format.raw/*801.2*/("""document.getElementById("brokerPhone1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerPhone").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*807.1*/("""}"""),format.raw/*807.2*/("""else"""),format.raw/*807.6*/("""{"""),format.raw/*807.7*/("""
	"""),format.raw/*808.2*/("""document.getElementById("brokerPhone1").innerHTML="";

"""),format.raw/*810.1*/("""}"""),format.raw/*810.2*/("""

"""),format.raw/*812.1*/("""var brokerMange=document.forms["myForm"]["brokerMange"].value;

if(!brokerMange&& role== 'Realtor')"""),format.raw/*814.36*/("""{"""),format.raw/*814.37*/("""
	
	"""),format.raw/*816.2*/("""document.getElementById("brokerMange1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerMange").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*822.1*/("""}"""),format.raw/*822.2*/("""else if(brokerMange.trim().length<2)"""),format.raw/*822.38*/("""{"""),format.raw/*822.39*/("""
	"""),format.raw/*823.2*/("""document.getElementById("brokerMange1").innerHTML="<p style=\"color:red\">Broker Name Should be more than one letter </p>";
	document.getElementById("brokerMange").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

"""),format.raw/*828.1*/("""}"""),format.raw/*828.2*/("""

"""),format.raw/*830.1*/("""else"""),format.raw/*830.5*/("""{"""),format.raw/*830.6*/("""
	"""),format.raw/*831.2*/("""if(!brokerMange.match(/^[a-zA-Z ]*$/))"""),format.raw/*831.40*/("""{"""),format.raw/*831.41*/("""
		"""),format.raw/*832.3*/("""document.getElementById("brokerMange1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("brokerMange").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*839.2*/("""}"""),format.raw/*839.3*/("""else"""),format.raw/*839.7*/("""{"""),format.raw/*839.8*/("""
		"""),format.raw/*840.3*/("""document.getElementById("brokerMange1").innerHTML = "";

	"""),format.raw/*842.2*/("""}"""),format.raw/*842.3*/("""
"""),format.raw/*843.1*/("""}"""),format.raw/*843.2*/("""

"""),format.raw/*845.1*/("""var refer=document.forms["myForm"]["refer"].value;

if(!refer)"""),format.raw/*847.11*/("""{"""),format.raw/*847.12*/("""
	
	"""),format.raw/*849.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value= false;
"""),format.raw/*855.1*/("""}"""),format.raw/*855.2*/("""else if(refer.trim().length<2)"""),format.raw/*855.32*/("""{"""),format.raw/*855.33*/("""
	
	"""),format.raw/*857.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">Referrar Name Should be more than one letter </p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	value=false;
"""),format.raw/*863.1*/("""}"""),format.raw/*863.2*/("""


"""),format.raw/*866.1*/("""else"""),format.raw/*866.5*/("""{"""),format.raw/*866.6*/("""
	"""),format.raw/*867.2*/("""if(!refer.match(/^[a-zA-Z ]*$/))"""),format.raw/*867.34*/("""{"""),format.raw/*867.35*/("""
		"""),format.raw/*868.3*/("""document.getElementById("refer1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("refer").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*875.2*/("""}"""),format.raw/*875.3*/("""else"""),format.raw/*875.7*/("""{"""),format.raw/*875.8*/("""
		"""),format.raw/*876.3*/("""document.getElementById("refer1").innerHTML = "";

	"""),format.raw/*878.2*/("""}"""),format.raw/*878.3*/("""

"""),format.raw/*880.1*/("""}"""),format.raw/*880.2*/("""
"""),format.raw/*881.1*/("""if(value)"""),format.raw/*881.10*/("""{"""),format.raw/*881.11*/("""
	 """),format.raw/*882.3*/("""$('#loading').show();
"""),format.raw/*883.1*/("""}"""),format.raw/*883.2*/("""
"""),format.raw/*884.1*/("""return value;
	 """),format.raw/*885.3*/("""}"""),format.raw/*885.4*/("""catch(err)"""),format.raw/*885.14*/("""{"""),format.raw/*885.15*/("""
	 """),format.raw/*886.3*/("""}"""),format.raw/*886.4*/("""
    
 """),format.raw/*888.2*/("""}"""),format.raw/*888.3*/("""
    
    """),format.raw/*890.5*/("""</script>


	<script src=""""),_display_(/*893.16*/routes/*893.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*893.72*/("""" type="text/javascript"></script>
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
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/visdomferralV.scala.html
                  HASH: 1ec19005eff3e26c5d90eca830e8a3785ed1b999
                  MATRIX: 731->1|836->18|863->19|1212->342|1226->348|1282->384|1428->503|1443->509|1503->548|1559->577|1574->583|1644->632|1799->760|1814->766|1879->810|1936->840|1951->846|2018->892|2114->961|2142->962|2170->963|2318->1084|2346->1085|2379->1091|2447->1131|2476->1132|2512->1141|2570->1171|2599->1172|2638->1183|2767->1285|2796->1286|2863->1325|2892->1326|2931->1337|3004->1383|3033->1384|3069->1393|3097->1394|3180->1449|3209->1450|3245->1459|3304->1490|3333->1491|3372->1502|3501->1604|3530->1605|3597->1644|3626->1645|3665->1656|3739->1703|3768->1704|3804->1713|3832->1714|3968->1822|3997->1823|4030->1829|4376->2148|4404->2149|4524->2241|4553->2242|4589->2251|4732->2366|4761->2367|4799->2377|5583->3134|5611->3135|5644->3141|5672->3142|5700->3143|5931->3347|5946->3353|6009->3395|6052->3411|6067->3417|6129->3458|6216->3518|6231->3524|6291->3563|6367->3612|6382->3618|6437->3652|6513->3701|6528->3707|6586->3744|6658->3787|6688->3788|6718->3790|6850->3894|6866->3900|6924->3936|6991->3975|7020->3976|7049->3977|7091->3990|7121->3991|7152->3994|7330->4144|7359->4145|7390->4148|7426->4156|7456->4157|7487->4160|7720->4365|7749->4366|7779->4368|7926->4487|7942->4493|8005->4534|8203->4704|8219->4710|8282->4750|10174->6613|10204->6614|10234->6615|10274->6626|10304->6627|10334->6628|15969->12235|15999->12236|16029->12237|16065->12244|16095->12245|16125->12246|17013->13105|17043->13106|17073->13107|17116->13121|17146->13122|17176->13123|18125->14043|18155->14044|18185->14045|18229->14060|18259->14061|18289->14062|19971->15715|20001->15716|20038->15725|20153->15812|20182->15813|20276->15878|20306->15879|20343->15888|20458->15975|20487->15976|20572->16032|20602->16033|20635->16038|20706->16081|20735->16082|20954->16272|20984->16273|21021->16282|21080->16312|21110->16313|21150->16324|21280->16426|21310->16427|21378->16466|21408->16467|21448->16478|21522->16524|21552->16525|21589->16534|21618->16535|21693->16581|21723->16582|21760->16591|21820->16622|21850->16623|21890->16634|22020->16736|22050->16737|22118->16776|22148->16777|22188->16788|22263->16835|22293->16836|22330->16845|22359->16846|22553->17011|22583->17012|22620->17021|22681->17053|22711->17054|22753->17067|22878->17163|22908->17164|22954->17181|23027->17225|23057->17226|23095->17236|23125->17237|23158->17242|23187->17243|23292->17319|23322->17320|23359->17329|23390->17332|23419->17333|23450->17336|23557->17414|23587->17415|23619->17419|23951->17723|23980->17724|24012->17728|24041->17729|24076->17736|24154->17786|24183->17787|24216->17792|24312->17859|24342->17860|24374->17864|24708->18170|24737->18171|24796->18201|24826->18202|24866->18214|25227->18547|25256->18548|25285->18549|25317->18553|25347->18554|25379->18558|25440->18590|25470->18591|25503->18596|25856->18921|25885->18922|25917->18926|25947->18927|25980->18932|26062->18986|26091->18987|26123->18991|26152->18992|26188->19000|26284->19067|26314->19068|26350->19076|26682->19380|26711->19381|26770->19411|26800->19412|26840->19424|27201->19757|27230->19758|27262->19762|27291->19763|27329->19773|27390->19805|27420->19806|27454->19812|27811->20141|27840->20142|27873->20146|27903->20147|27937->20153|28020->20208|28049->20209|28082->20214|28111->20215|28155->20231|28251->20298|28281->20299|28317->20307|28647->20609|28676->20610|28708->20614|28737->20615|28772->20622|28851->20673|28880->20674|28919->20685|29156->20894|29186->20895|29233->20914|29262->20915|29295->20919|29325->20920|29359->20926|29699->21238|29728->21239|29766->21249|29815->21269|29845->21270|29892->21289|29921->21290|29954->21294|29984->21295|30018->21301|30358->21613|30387->21614|30420->21619|30463->21633|30493->21634|30522->21635|30849->21934|30878->21935|30911->21939|30941->21940|30975->21946|31055->21998|31084->21999|31119->22006|31213->22071|31243->22072|31274->22075|31612->22385|31641->22386|31672->22389|31704->22393|31733->22394|31767->22400|31845->22450|31874->22451|31910->22459|32002->22522|32032->22523|32064->22527|32148->22582|32178->22583|32209->22586|32543->22892|32572->22893|32602->22895|32631->22896|32663->22900|32692->22901|32726->22907|32804->22957|32833->22958|32873->22970|33026->23094|33056->23095|33086->23097|33196->23178|33226->23179|33257->23182|33595->23492|33624->23493|33654->23495|33683->23496|33826->23609|33857->23610|33888->23613|34247->23944|34276->23945|34308->23949|34337->23950|34368->23953|34448->24005|34477->24006|34508->24009|34700->24172|34730->24173|34760->24175|34869->24255|34899->24256|34931->24260|35282->24583|35311->24584|35341->24586|35370->24587|35402->24591|35431->24592|35465->24598|35554->24659|35583->24660|35618->24667|35733->24753|35763->24754|35796->24759|36133->25068|36162->25069|36222->25100|36252->25101|36286->25107|36648->25441|36677->25442|36712->25449|36744->25453|36773->25454|36802->25455|36864->25488|36894->25489|36924->25491|37267->25806|37296->25807|37328->25811|37357->25812|37387->25814|37467->25866|37496->25867|37526->25869|37555->25870|37586->25873|37712->25970|37742->25971|37774->25975|38113->26286|38142->26287|38174->26291|38203->26292|38233->26294|38312->26345|38341->26346|38371->26348|38534->26482|38564->26483|38596->26487|38938->26801|38967->26802|38999->26806|39028->26807|39058->26809|39141->26864|39170->26865|39200->26867|39328->26966|39358->26967|39390->26971|39732->27285|39761->27286|39826->27322|39856->27323|39886->27325|40234->27645|40263->27646|40293->27648|40325->27652|40354->27653|40384->27655|40451->27693|40481->27694|40512->27697|40869->28026|40898->28027|40930->28031|40959->28032|40990->28035|41076->28093|41105->28094|41134->28095|41163->28096|41193->28098|41284->28160|41314->28161|41346->28165|41676->28467|41705->28468|41764->28498|41794->28499|41826->28503|42178->28827|42207->28828|42238->28831|42270->28835|42299->28836|42329->28838|42390->28870|42420->28871|42451->28874|42796->29191|42825->29192|42857->29196|42886->29197|42917->29200|42997->29252|43026->29253|43056->29255|43085->29256|43114->29257|43152->29266|43182->29267|43213->29270|43263->29292|43292->29293|43321->29294|43365->29310|43394->29311|43433->29321|43463->29322|43494->29325|43523->29326|43558->29333|43587->29334|43625->29344|43680->29371|43696->29377|43768->29427
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|38->10|38->10|38->10|40->12|40->12|40->12|43->15|43->15|43->15|44->16|44->16|44->16|48->20|48->20|49->21|55->27|55->27|56->28|58->30|58->30|59->31|59->31|59->31|60->32|63->35|63->35|65->37|65->37|66->38|67->39|67->39|68->40|68->40|72->44|72->44|73->45|73->45|73->45|74->46|77->49|77->49|79->51|79->51|80->52|81->53|81->53|82->54|82->54|85->57|85->57|86->58|91->63|91->63|96->68|96->68|97->69|100->72|100->72|101->73|116->88|116->88|117->89|117->89|117->89|122->94|122->94|122->94|123->95|123->95|123->95|124->96|124->96|124->96|125->97|125->97|125->97|126->98|126->98|126->98|131->103|131->103|132->104|138->110|138->110|138->110|139->111|139->111|139->111|141->113|141->113|142->114|152->124|152->124|154->126|154->126|154->126|155->127|165->137|165->137|167->139|183->155|183->155|183->155|189->161|189->161|189->161|245->217|245->217|245->217|245->217|245->217|245->217|363->335|363->335|363->335|363->335|363->335|363->335|383->355|383->355|383->355|383->355|383->355|383->355|405->377|405->377|405->377|405->377|405->377|405->377|468->440|468->440|469->441|472->444|472->444|476->448|476->448|477->449|480->452|480->452|487->459|487->459|488->460|489->461|489->461|497->469|497->469|498->470|498->470|498->470|499->471|502->474|502->474|504->476|504->476|505->477|506->478|506->478|507->479|507->479|511->483|511->483|512->484|512->484|512->484|513->485|516->488|516->488|518->490|518->490|519->491|520->492|520->492|521->493|521->493|526->498|526->498|527->499|528->500|528->500|529->501|531->503|531->503|532->504|533->505|533->505|534->506|534->506|535->507|535->507|539->511|539->511|542->514|542->514|542->514|543->515|545->517|545->517|546->518|552->524|552->524|552->524|552->524|553->525|555->527|555->527|557->529|560->532|560->532|561->533|567->539|567->539|567->539|567->539|570->542|578->550|578->550|578->550|578->550|578->550|579->551|579->551|579->551|580->552|587->559|587->559|587->559|587->559|588->560|590->562|590->562|592->564|592->564|595->567|597->569|597->569|599->571|604->576|604->576|604->576|604->576|607->579|615->587|615->587|615->587|615->587|617->589|617->589|617->589|618->590|625->597|625->597|625->597|625->597|626->598|628->600|628->600|630->602|630->602|635->607|637->609|637->609|639->611|645->617|645->617|645->617|645->617|646->618|648->620|648->620|651->623|655->627|655->627|657->629|657->629|657->629|657->629|658->630|664->636|664->636|666->638|666->638|666->638|668->640|668->640|668->640|668->640|669->641|675->647|675->647|676->648|676->648|676->648|677->649|683->655|683->655|683->655|683->655|684->656|686->658|686->658|688->660|690->662|690->662|691->663|697->669|697->669|698->670|698->670|698->670|699->671|701->673|701->673|703->675|705->677|705->677|707->679|707->679|707->679|708->680|714->686|714->686|715->687|715->687|715->687|715->687|716->688|718->690|718->690|724->696|729->701|729->701|730->702|730->702|730->702|731->703|737->709|737->709|738->710|738->710|738->710|738->710|739->711|745->717|745->717|745->717|745->717|746->718|748->720|748->720|751->723|755->727|755->727|756->728|756->728|756->728|758->730|764->736|764->736|765->737|765->737|765->737|765->737|766->738|768->740|768->740|772->744|773->745|773->745|776->748|781->753|781->753|781->753|781->753|783->755|790->762|790->762|793->765|793->765|793->765|794->766|794->766|794->766|795->767|802->774|802->774|802->774|802->774|803->775|805->777|805->777|806->778|806->778|809->781|810->782|810->782|812->784|818->790|818->790|818->790|818->790|819->791|821->793|821->793|823->795|827->799|827->799|829->801|835->807|835->807|835->807|835->807|836->808|838->810|838->810|840->812|842->814|842->814|844->816|850->822|850->822|850->822|850->822|851->823|856->828|856->828|858->830|858->830|858->830|859->831|859->831|859->831|860->832|867->839|867->839|867->839|867->839|868->840|870->842|870->842|871->843|871->843|873->845|875->847|875->847|877->849|883->855|883->855|883->855|883->855|885->857|891->863|891->863|894->866|894->866|894->866|895->867|895->867|895->867|896->868|903->875|903->875|903->875|903->875|904->876|906->878|906->878|908->880|908->880|909->881|909->881|909->881|910->882|911->883|911->883|912->884|913->885|913->885|913->885|913->885|914->886|914->886|916->888|916->888|918->890|921->893|921->893|921->893
                  -- GENERATED --
              */
          