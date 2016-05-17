
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
object visdomferralV11 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
    
    """),format.raw/*29.5*/("""</style>
    <script>
      $(function()"""),format.raw/*31.19*/("""{"""),format.raw/*31.20*/("""
        """),format.raw/*32.9*/("""$("#geocomplete").geocomplete("""),format.raw/*32.39*/("""{"""),format.raw/*32.40*/("""
          """),format.raw/*33.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/(""");

        $("#find").click(function()"""),format.raw/*38.36*/("""{"""),format.raw/*38.37*/("""
          """),format.raw/*39.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/(""");
      """),format.raw/*41.7*/("""}"""),format.raw/*41.8*/(""");
    </script>
    
      <script>
      $(function()"""),format.raw/*45.19*/("""{"""),format.raw/*45.20*/("""
        """),format.raw/*46.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*46.40*/("""{"""),format.raw/*46.41*/("""
          """),format.raw/*47.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/(""");

        $("#find").click(function()"""),format.raw/*52.36*/("""{"""),format.raw/*52.37*/("""
          """),format.raw/*53.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*54.9*/("""}"""),format.raw/*54.10*/(""");
      """),format.raw/*55.7*/("""}"""),format.raw/*55.8*/(""");
    </script> 
    <script type="text/javascript">
  /*   $.get("https://ipinfo.io", function (response) """),format.raw/*58.55*/("""{"""),format.raw/*58.56*/("""
    	"""),format.raw/*59.6*/("""document.getElementById("ip").value=JSON.stringify(response, null, 4);
    	alert(JSON.stringify(response, null, 4));
    		/* $("#ip").html("IP: " + response.ip);
        $("#address").html("Location: " + response.city + ", " + response.region); */
       // $("#details").html(JSON.stringify(response, null, 4));
    """),format.raw/*64.5*/("""}"""),format.raw/*64.6*/(""", "jsonp"); */
    </script>
    
    <script type="text/javascript">
    
    jQuery.ajax( """),format.raw/*69.18*/("""{"""),format.raw/*69.19*/(""" 
    	  """),format.raw/*70.8*/("""url: '//freegeoip.net/json/', 
    	  type: 'POST', 
    	  dataType: 'jsonp',
    	  success: function(location) """),format.raw/*73.36*/("""{"""),format.raw/*73.37*/("""
    	    """),format.raw/*74.10*/("""// example where I update content on the page.
    	    
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
    	  """),format.raw/*89.8*/("""}"""),format.raw/*89.9*/("""
    	"""),format.raw/*90.6*/("""}"""),format.raw/*90.7*/(""" """),format.raw/*90.8*/(""");
    </script>

<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->  <link rel="stylesheet" href="_resources/bootstrap.min.css">
 <link rel="stylesheet" href=""""),_display_(/*95.32*/routes/*95.38*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*95.80*/("""">
<script src="""),_display_(/*96.14*/routes/*96.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*96.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*97.47*/routes/*97.53*/.Assets.at("_resources/background.css")),format.raw/*97.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*98.47*/routes/*98.53*/.Assets.at("_resources/forms.css")),format.raw/*98.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*99.47*/routes/*99.53*/.Assets.at("_resources/template.css")),format.raw/*99.90*/("""">
</head>
<body>


 <div style="padding-bottom:20px; margin-top:20px;padding-left: 45%">
                		<img alt="Visdom Logo" height="90" width="260"  src=""""),_display_(/*105.73*/routes/*105.79*/.Assets.at("_resources/visdom-logo.png")),format.raw/*105.119*/("""" />
              
              
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
									your role? </Strong><span style="color: red; font-size: 3">*</span></label>

						</div>

						
						<div class="btn-group blocks">
							<label style="width: 180px; font-weight:bold;   border-style:groove;" class="btn btn-primary btn-space full" btn-radio="'Realtor'"
								ng-change="change()"  ng-model="newItemType" title="Choose “Realtor” if your primary business activity is selling real estate, you must hold a license in good standing as a associate, agent, sales representative, associate broker or broker through the appropriate provincial  licensing body."> Realtor
								
							</label> <label style="width: 180px;border-style:groove;" class="btn btn-primary full " btn-radio="'Financial Planner'"
								ng-change="change()"  ng-model="newItemType" title="Choose “Financial Planner” if your primary business activities include the sale of insurance, sale and/or management of investments, estate or financial planning. You should hold the appropriate licenses for the province in which you reside."> Financial Planner
							</label><br>
				
							
							
								<label style="width: 180px;border-style:groove;" class="btn btn-primary " btn-radio="'Professional'"
								ng-change="change()" ng-model="newItemType" title="Choose “Professional” if within your daily business you would come across opportunities to refer mortgage customers, Professions such as Lawyers, Accountants, Tax Advisors, Builders, Appraisers, Auctioneers, HR Personnel, or Bank Representative.">Professional
								
							</label> <label style="width: 180px;border-style:groove;" class="btn btn-primary " btn-radio="'Client'"
								ng-change="change()" ng-model="newItemType" title="Choose “Client” if you don’t hold a real estate or insurance type licensure and are not in a professions whose regular daily responsibilities expose you to be involved with real estate, financing, or human resource activities. You are just a fan of Visdom and like to earn extra cash for referrals."> Client
							</label>
							  <div id="role1"> </div>
							
						</div>
					
					<input type="hidden" id="role" name="role" value=""""),format.raw/*161.56*/("""{"""),format.raw/*161.57*/("""{"""),format.raw/*161.58*/("""newItemType"""),format.raw/*161.69*/("""}"""),format.raw/*161.70*/("""}"""),format.raw/*161.71*/("""" ng-required>

						<br><br><br> 
						 <div ng-show="newItemType == 'Financial Planner'" class="form-input-wide">
          <div id="text_45" class="form-html">
<iframe src="//fast.wistia.net/embed/iframe/hdwakgzahi?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="388"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script>
          </div>
        </div>
       
 
    
				 <div ng-show="newItemType == 'Client'" class="form-input-wide">
          <div id="text_49" class="form-html">
         <iframe src="//fast.wistia.net/embed/iframe/v6e3vd54bk?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="360"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script> 
          </div>
        </div>
        
         <div ng-show="newItemType == 'Professional'" class="form-input-wide">
          <div id="text_48" class="form-html">
<iframe src="//fast.wistia.net/embed/iframe/5x5hnmijeu?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="360"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script>
          </div>
        </div>
        
        <div  ng-show="newItemType == 'Realtor'"class="form-input-wide">
          <div id="text_44" class="form-html">
<iframe src="//fast.wistia.net/embed/iframe/t3n725thcd?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="360"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script>
          </div>
          
         <!--   <div id="text_45" class="form-html">
<iframe src="//fast.wistia.net/embed/iframe/hdwakgzahi?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="388"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script>
          </div> -->
        </div>
        <br>

					
	
							<div class="form-group" style="width: 60%">
								<label for="usr"> <Strong>Your First Name </Strong><span
									style="color: red; font-size: 3">*</span></label> <input type="text"
									id="fname" name="fname" class="form-control" required>
								<div id="fname1"></div>

							</div>
							<br>
							<div class="form-group" style="width: 60%">
								<label for="pwd"><Strong>Your Last Name</Strong> <span
									style="color: red; font-size: 3">*</span> </label> <input type="text"
									id="lname" name="lname" class="form-control" required>

								<div id="lname1"></div>

							</div>
							<br>






							<div class="form-group" style="width: 60%">
								<label for="pwd"><Strong> E-mail Address</Strong><span
									style="color: red; font-size: 3">*</span> </label> <input type="email"
									id="email" name="email" class="form-control"
									placeholder="Ex: myemail@example.com" data-toggle="tooltip"
									data-placement="right"
									title="All communication occurs by email with your referral including the initial private mortgage application. Please double check email address for accuracy."
									required>
								<div id="email1"></div>


							</div>

							<div class="form-group" style="width: 60%">
								<input type="email" id="email2" name="email2" class="form-control"
									placeholder="Confirm Email" required>
								<div id="error"></div>
								<div id="email2"></div>

							</div>
							<br>

							<div class="form-group" style="width: 40%"
								title="This is the text of the tooltip">
								<label><Strong>Phone Number </Strong> <span
									style="color: red; font-size: 3">*</span> </label> <input type="text"
									class="form-control" name="phone" id="phonedatata"
									data-toggle="tooltip" data-placement="right"
									title="Please provide a mobile number so we can better assist your referral by phone if required."
									 required/>

								<div id="phone1"></div>

								<span>Please specify numeric values only </span>
							</div>
							<br>


							<div
								ng-show="newItemType == 'Financial Planner' || newItemType =='Professional' ">


								<div class="form-group" style="width: 100%">
									<label for="pwd"><Strong>In some regulated
											occupations, referral compensation must be paid to the
											company a person is licensed with rather than directly to
											individuals (e.g. Real Estate Agent, Mortgage Broker). Should
											referral compensation be paid directly to you or to the
											company you work with? </Strong><span style="color: red; font-size: 3">*</span>
									</label>
								</div>





								<div class="btn-group blocks" data-toggle="buttons">
									<label style="width: 180px" class="btn btn-primary"
										btn-radio="'Company'" ng-change="change()" ng-model="company">
										Company </label> <label style="width: 180px" class="btn btn-primary"
										btn-radio="'Direct To MySelf'" ng-change="change()"
										ng-model="company"> Direct To MySelf </label>
								</div>
								<div id="feeTo1"></div>
								<input type="hidden" id="feeTo" name="feeTo" value=""""),format.raw/*284.61*/("""{"""),format.raw/*284.62*/("""{"""),format.raw/*284.63*/("""company"""),format.raw/*284.70*/("""}"""),format.raw/*284.71*/("""}"""),format.raw/*284.72*/(""""> <br>
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
										type="hidden" name="companyAddress" value=""""),format.raw/*304.54*/("""{"""),format.raw/*304.55*/("""{"""),format.raw/*304.56*/("""companyAddress"""),format.raw/*304.70*/("""}"""),format.raw/*304.71*/("""}"""),format.raw/*304.72*/("""">
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
										value=""""),format.raw/*328.18*/("""{"""),format.raw/*328.19*/("""{"""),format.raw/*328.20*/("""companyAddress1"""),format.raw/*328.35*/("""}"""),format.raw/*328.36*/("""}"""),format.raw/*328.37*/("""">

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
								<label for="pwd"><Strong>Who referred you to
										Visdom? (Or how did you find Visdom in the event you were not
										referred by a person) </Strong> <span style="color: red; font-size: 3">*</span>
								</label> <input type="text" id="refer" name="refer" class="form-control" required>
								<div id="refer1"></div>

							</div>
							<br>



							<div align="left">

								<input type="submit" class="btn btn-primary btn-block"
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
    $(function() """),format.raw/*391.18*/("""{"""),format.raw/*391.19*/("""
        """),format.raw/*392.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*395.5*/("""}"""),format.raw/*395.6*/(""");
	
</script>
	<script type="text/javascript">
    $(function() """),format.raw/*399.18*/("""{"""),format.raw/*399.19*/("""
        """),format.raw/*400.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#brokerPhone").mask("999-999-9999");
    """),format.raw/*403.5*/("""}"""),format.raw/*403.6*/(""");
	
</script>



	<script>
$(document).ready(function()"""),format.raw/*410.29*/("""{"""),format.raw/*410.30*/("""
    """),format.raw/*411.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*412.1*/("""}"""),format.raw/*412.2*/(""");
</script>

	<script
		src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>

	<script src="jquery.geocomplete.js"></script>
	<script>
      $(function()"""),format.raw/*420.19*/("""{"""),format.raw/*420.20*/("""
        """),format.raw/*421.9*/("""$("#geocomplete").geocomplete("""),format.raw/*421.39*/("""{"""),format.raw/*421.40*/("""
          """),format.raw/*422.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*425.9*/("""}"""),format.raw/*425.10*/(""");

        $("#find").click(function()"""),format.raw/*427.36*/("""{"""),format.raw/*427.37*/("""
          """),format.raw/*428.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*429.9*/("""}"""),format.raw/*429.10*/(""");
      """),format.raw/*430.7*/("""}"""),format.raw/*430.8*/(""");
    </script>

	<script>
      $(function()"""),format.raw/*434.19*/("""{"""),format.raw/*434.20*/("""
        """),format.raw/*435.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*435.40*/("""{"""),format.raw/*435.41*/("""
          """),format.raw/*436.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*439.9*/("""}"""),format.raw/*439.10*/(""");

        $("#find").click(function()"""),format.raw/*441.36*/("""{"""),format.raw/*441.37*/("""
          """),format.raw/*442.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*443.9*/("""}"""),format.raw/*443.10*/(""");
      """),format.raw/*444.7*/("""}"""),format.raw/*444.8*/(""");
    </script>
	<script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*449.56*/("""{"""),format.raw/*449.57*/("""
        """),format.raw/*450.9*/("""init();
        function init() """),format.raw/*451.25*/("""{"""),format.raw/*451.26*/("""
            """),format.raw/*452.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*454.41*/("""{"""),format.raw/*454.42*/("""
                """),format.raw/*455.17*/("""console.log($scope.newItemType)
            """),format.raw/*456.13*/("""}"""),format.raw/*456.14*/(""";
        """),format.raw/*457.9*/("""}"""),format.raw/*457.10*/("""
    """),format.raw/*458.5*/("""}"""),format.raw/*458.6*/(""");
    </script>

	<script type="text/javascript">
 function validateForm() """),format.raw/*462.26*/("""{"""),format.raw/*462.27*/("""
	 
	 """),format.raw/*464.3*/("""try"""),format.raw/*464.6*/("""{"""),format.raw/*464.7*/("""
		"""),format.raw/*465.3*/("""var role=document.forms["myForm"]["role"].value;
		
		if(!role)"""),format.raw/*467.12*/("""{"""),format.raw/*467.13*/("""
			"""),format.raw/*468.4*/("""document.getElementById("role1").innerHTML="<p style=\"color:red\">Please Select Role</p>";
			document.getElementById("role").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			return false;
		"""),format.raw/*474.3*/("""}"""),format.raw/*474.4*/("""else"""),format.raw/*474.8*/("""{"""),format.raw/*474.9*/("""
	    	"""),format.raw/*475.7*/("""document.getElementById("role1").innerHTML="";

		"""),format.raw/*477.3*/("""}"""),format.raw/*477.4*/(""" 

	 """),format.raw/*479.3*/("""var fname=document.forms["myForm"]["fname"].value;
	 

		if(!fname)"""),format.raw/*482.13*/("""{"""),format.raw/*482.14*/("""
			"""),format.raw/*483.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			return false;
		"""),format.raw/*489.3*/("""}"""),format.raw/*489.4*/("""else"""),format.raw/*489.8*/("""{"""),format.raw/*489.9*/("""
	    	"""),format.raw/*490.7*/("""document.getElementById("fname1").innerHTML="";

		"""),format.raw/*492.3*/("""}"""),format.raw/*492.4*/(""" 
		"""),format.raw/*493.3*/("""var lname=document.forms["myForm"]["lname"].value;
		 
		if(!lname)"""),format.raw/*495.13*/("""{"""),format.raw/*495.14*/("""
			
			"""),format.raw/*497.4*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
			document.getElementById("lname").focus();
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			return false;
		"""),format.raw/*502.3*/("""}"""),format.raw/*502.4*/("""
			"""),format.raw/*503.4*/("""else"""),format.raw/*503.8*/("""{"""),format.raw/*503.9*/("""
		    	"""),format.raw/*504.8*/("""document.getElementById("lname1").innerHTML="";

			"""),format.raw/*506.4*/("""}"""),format.raw/*506.5*/(""" 
		
		
	 
		"""),format.raw/*510.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*512.13*/("""{"""),format.raw/*512.14*/("""
			
			"""),format.raw/*514.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			return false;
		"""),format.raw/*520.3*/("""}"""),format.raw/*520.4*/("""else"""),format.raw/*520.8*/("""{"""),format.raw/*520.9*/("""
	    	"""),format.raw/*521.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*523.3*/("""}"""),format.raw/*523.4*/("""
	 
	 
    """),format.raw/*526.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*530.24*/("""{"""),format.raw/*530.25*/("""         
		  
    """),format.raw/*532.5*/("""}"""),format.raw/*532.6*/("""else"""),format.raw/*532.10*/("""{"""),format.raw/*532.11*/("""   
		"""),format.raw/*533.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
    """),format.raw/*539.5*/("""}"""),format.raw/*539.6*/("""
    
    """),format.raw/*541.5*/("""if(pattern.test(x2))"""),format.raw/*541.25*/("""{"""),format.raw/*541.26*/("""         
		  
    """),format.raw/*543.5*/("""}"""),format.raw/*543.6*/("""else"""),format.raw/*543.10*/("""{"""),format.raw/*543.11*/("""   
		"""),format.raw/*544.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email2").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
    """),format.raw/*550.5*/("""}"""),format.raw/*550.6*/("""
    """),format.raw/*551.5*/("""if (x  != x2) """),format.raw/*551.19*/("""{"""),format.raw/*551.20*/("""
"""),format.raw/*552.1*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
document.getElementById("email").focus();

document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

    	return false;
    """),format.raw/*558.5*/("""}"""),format.raw/*558.6*/("""else"""),format.raw/*558.10*/("""{"""),format.raw/*558.11*/("""
    	"""),format.raw/*559.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*561.5*/("""}"""),format.raw/*561.6*/("""
    
	"""),format.raw/*563.2*/("""var phone=document.forms["myForm"]["phone"].value;
	 
	if(!phone)"""),format.raw/*565.12*/("""{"""),format.raw/*565.13*/("""
		"""),format.raw/*566.3*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
		document.getElementById("phonedatata").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
	"""),format.raw/*572.2*/("""}"""),format.raw/*572.3*/("""	
	"""),format.raw/*573.2*/("""else"""),format.raw/*573.6*/("""{"""),format.raw/*573.7*/("""
    	"""),format.raw/*574.6*/("""document.getElementById("phone1").innerHTML="";

	"""),format.raw/*576.2*/("""}"""),format.raw/*576.3*/(""" 
    
	"""),format.raw/*578.2*/("""var feeTo=document.forms["myForm"]["feeTo"].value;

	if(!feeTo)"""),format.raw/*580.12*/("""{"""),format.raw/*580.13*/("""

		"""),format.raw/*582.3*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*582.58*/("""{"""),format.raw/*582.59*/("""
		"""),format.raw/*583.3*/("""document.getElementById("feeTo1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("feeTo").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
	"""),format.raw/*589.2*/("""}"""),format.raw/*589.3*/("""
	"""),format.raw/*590.2*/("""}"""),format.raw/*590.3*/("""else"""),format.raw/*590.7*/("""{"""),format.raw/*590.8*/("""
    	"""),format.raw/*591.6*/("""document.getElementById("feeTo1").innerHTML="";

	"""),format.raw/*593.2*/("""}"""),format.raw/*593.3*/("""
	
	
	
	
	
	"""),format.raw/*599.2*/("""//var role=document.forms["myForm"]["role"].value;
	var company=document.forms["myForm"]["company"].value;

	
	
if(!company)"""),format.raw/*604.13*/("""{"""),format.raw/*604.14*/("""
	"""),format.raw/*605.2*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*605.57*/("""{"""),format.raw/*605.58*/("""
		"""),format.raw/*606.3*/("""document.getElementById("company1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("company").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
	"""),format.raw/*612.2*/("""}"""),format.raw/*612.3*/("""
	"""),format.raw/*613.2*/("""}"""),format.raw/*613.3*/("""else"""),format.raw/*613.7*/("""{"""),format.raw/*613.8*/("""
    	"""),format.raw/*614.6*/("""document.getElementById("company1").innerHTML="";

	"""),format.raw/*616.2*/("""}"""),format.raw/*616.3*/("""


"""),format.raw/*619.1*/("""//var formattedaddress=document.forms["myForm"]["companyAddress"].value;
var companyAddress=document.forms["myForm"]["companyAddress"].value;


if(!companyAddress)"""),format.raw/*623.20*/("""{"""),format.raw/*623.21*/("""
	"""),format.raw/*624.2*/("""if(role == 'Financial Planner' || role=='Professional')"""),format.raw/*624.57*/("""{"""),format.raw/*624.58*/("""

		"""),format.raw/*626.3*/("""document.getElementById("formattedaddress1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		document.getElementById("geocomplete").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
	"""),format.raw/*632.2*/("""}"""),format.raw/*632.3*/("""
	"""),format.raw/*633.2*/("""}"""),format.raw/*633.3*/("""else"""),format.raw/*633.7*/("""{"""),format.raw/*633.8*/("""
    	"""),format.raw/*634.6*/("""document.getElementById("formattedaddress1").innerHTML="";

	"""),format.raw/*636.2*/("""}"""),format.raw/*636.3*/("""
	

	
	"""),format.raw/*640.2*/("""var broker=document.forms["myForm"]["broker"].value;

if(!broker&& role== 'Realtor')"""),format.raw/*642.31*/("""{"""),format.raw/*642.32*/("""
		
		"""),format.raw/*644.3*/("""document.getElementById("broker1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
		
		document.getElementById("broker").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
	"""),format.raw/*651.2*/("""}"""),format.raw/*651.3*/("""else"""),format.raw/*651.7*/("""{"""),format.raw/*651.8*/("""
    	"""),format.raw/*652.6*/("""document.getElementById("broker1").innerHTML="";

	"""),format.raw/*654.2*/("""}"""),format.raw/*654.3*/("""									
"""),format.raw/*655.1*/("""var address1=document.forms["myForm"]["companyAddress1"].value;
if(!address1&& role== 'Realtor')"""),format.raw/*656.33*/("""{"""),format.raw/*656.34*/("""
	
	"""),format.raw/*658.2*/("""document.getElementById("address1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("geocomplete1").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	return false;
"""),format.raw/*664.1*/("""}"""),format.raw/*664.2*/("""else"""),format.raw/*664.6*/("""{"""),format.raw/*664.7*/("""
	"""),format.raw/*665.2*/("""document.getElementById("address1").innerHTML="";

"""),format.raw/*667.1*/("""}"""),format.raw/*667.2*/("""

"""),format.raw/*669.1*/("""var brokerPhone=document.forms["myForm"]["brokerPhone"].value;



if(!brokerPhone&& role== 'Realtor')"""),format.raw/*673.36*/("""{"""),format.raw/*673.37*/("""
	
	"""),format.raw/*675.2*/("""document.getElementById("brokerPhone1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerPhone").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	return false;
"""),format.raw/*681.1*/("""}"""),format.raw/*681.2*/("""else"""),format.raw/*681.6*/("""{"""),format.raw/*681.7*/("""
	"""),format.raw/*682.2*/("""document.getElementById("brokerPhone1").innerHTML="";

"""),format.raw/*684.1*/("""}"""),format.raw/*684.2*/("""

"""),format.raw/*686.1*/("""var brokerMange=document.forms["myForm"]["brokerMange"].value;


if(!brokerMange&& role== 'Realtor')"""),format.raw/*689.36*/("""{"""),format.raw/*689.37*/("""
	
	"""),format.raw/*691.2*/("""document.getElementById("brokerMange1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("brokerMange").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	return false;
"""),format.raw/*697.1*/("""}"""),format.raw/*697.2*/("""else"""),format.raw/*697.6*/("""{"""),format.raw/*697.7*/("""
	"""),format.raw/*698.2*/("""document.getElementById("brokerMange1").innerHTML="";

"""),format.raw/*700.1*/("""}"""),format.raw/*700.2*/("""


"""),format.raw/*703.1*/("""var refer=document.forms["myForm"]["refer"].value;

if(!refer&& role== 'Realtor')"""),format.raw/*705.30*/("""{"""),format.raw/*705.31*/("""
	
	"""),format.raw/*707.2*/("""document.getElementById("refer1").innerHTML="<p style=\"color:red\">This Feild is Required</p>";
	document.getElementById("refer").focus();

	document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

	return false;
"""),format.raw/*713.1*/("""}"""),format.raw/*713.2*/("""else"""),format.raw/*713.6*/("""{"""),format.raw/*713.7*/("""
	"""),format.raw/*714.2*/("""document.getElementById("refer1").innerHTML="";

"""),format.raw/*716.1*/("""}"""),format.raw/*716.2*/("""
	 """),format.raw/*717.3*/("""}"""),format.raw/*717.4*/("""catch(err)"""),format.raw/*717.14*/("""{"""),format.raw/*717.15*/("""
		
	 """),format.raw/*719.3*/("""}"""),format.raw/*719.4*/("""
    
 """),format.raw/*721.2*/("""}"""),format.raw/*721.3*/("""
    
    """),format.raw/*723.5*/("""</script>


	<script src=""""),_display_(/*726.16*/routes/*726.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*726.72*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:15 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/visdomferralV11.scala.html
                  HASH: 67132d69d40eba091bb3b441a671e8b02cd86f58
                  MATRIX: 733->1|838->18|865->19|1214->342|1228->348|1284->384|1430->503|1445->509|1505->548|1561->577|1576->583|1646->632|1801->760|1816->766|1881->810|1938->840|1953->846|2020->892|2116->961|2144->962|2172->963|2320->1084|2348->1085|2386->1096|2454->1136|2483->1137|2519->1146|2577->1176|2606->1177|2645->1188|2774->1290|2803->1291|2870->1330|2899->1331|2938->1342|3011->1388|3040->1389|3076->1398|3104->1399|3187->1454|3216->1455|3252->1464|3311->1495|3340->1496|3379->1507|3508->1609|3537->1610|3604->1649|3633->1650|3672->1661|3746->1708|3775->1709|3811->1718|3839->1719|3975->1827|4004->1828|4037->1834|4383->2153|4411->2154|4531->2246|4560->2247|4596->2256|4738->2370|4767->2371|4805->2381|5589->3138|5617->3139|5650->3145|5678->3146|5706->3147|5937->3351|5952->3357|6015->3399|6058->3415|6073->3421|6135->3462|6222->3522|6237->3528|6297->3567|6373->3616|6388->3622|6443->3656|6519->3705|6534->3711|6592->3748|6782->3910|6798->3916|6861->3956|9812->6878|9842->6879|9872->6880|9912->6891|9942->6892|9972->6893|15798->12691|15828->12692|15858->12693|15894->12700|15924->12701|15954->12702|16774->13493|16804->13494|16834->13495|16877->13509|16907->13510|16937->13511|17968->14513|17998->14514|18028->14515|18072->14530|18102->14531|18132->14532|19858->16229|19888->16230|19925->16239|20040->16326|20069->16327|20163->16392|20193->16393|20230->16402|20345->16489|20374->16490|20459->16546|20489->16547|20522->16552|20593->16595|20622->16596|20841->16786|20871->16787|20908->16796|20967->16826|20997->16827|21037->16838|21167->16940|21197->16941|21265->16980|21295->16981|21335->16992|21409->17038|21439->17039|21476->17048|21505->17049|21580->17095|21610->17096|21647->17105|21707->17136|21737->17137|21777->17148|21907->17250|21937->17251|22005->17290|22035->17291|22075->17302|22150->17349|22180->17350|22217->17359|22246->17360|22440->17525|22470->17526|22507->17535|22568->17567|22598->17568|22640->17581|22765->17677|22795->17678|22841->17695|22914->17739|22944->17740|22982->17750|23012->17751|23045->17756|23074->17757|23179->17833|23209->17834|23243->17840|23274->17843|23303->17844|23334->17847|23426->17910|23456->17911|23488->17915|23820->18219|23849->18220|23881->18224|23910->18225|23945->18232|24023->18282|24052->18283|24085->18288|24181->18355|24211->18356|24243->18360|24577->18666|24606->18667|24638->18671|24667->18672|24702->18679|24781->18730|24810->18731|24842->18735|24938->18802|24968->18803|25004->18811|25336->19115|25365->19116|25397->19120|25429->19124|25458->19125|25494->19133|25574->19185|25603->19186|25644->19199|25740->19266|25770->19267|25806->19275|26136->19577|26165->19578|26197->19582|26226->19583|26261->19590|26340->19641|26369->19642|26408->19653|26645->19862|26675->19863|26722->19882|26751->19883|26784->19887|26814->19888|26848->19894|27188->20206|27217->20207|27255->20217|27304->20237|27334->20238|27381->20257|27410->20258|27443->20262|27473->20263|27507->20269|27847->20581|27876->20582|27909->20587|27952->20601|27982->20602|28011->20603|28343->20907|28372->20908|28405->20912|28435->20913|28469->20919|28549->20971|28578->20972|28613->20979|28707->21044|28737->21045|28768->21048|29106->21358|29135->21359|29166->21362|29198->21366|29227->21367|29261->21373|29339->21423|29368->21424|29404->21432|29496->21495|29526->21496|29558->21500|29642->21555|29672->21556|29703->21559|30037->21865|30066->21866|30096->21868|30125->21869|30157->21873|30186->21874|30220->21880|30298->21930|30327->21931|30367->21943|30520->22067|30550->22068|30580->22070|30664->22125|30694->22126|30725->22129|31063->22439|31092->22440|31122->22442|31151->22443|31183->22447|31212->22448|31246->22454|31326->22506|31355->22507|31386->22510|31578->22673|31608->22674|31638->22676|31722->22731|31752->22732|31784->22736|32135->23059|32164->23060|32194->23062|32223->23063|32255->23067|32284->23068|32318->23074|32407->23135|32436->23136|32471->23143|32584->23227|32614->23228|32648->23234|32987->23545|33016->23546|33048->23550|33077->23551|33111->23557|33190->23608|33219->23609|33257->23619|33382->23715|33412->23716|33444->23720|33783->24031|33812->24032|33844->24036|33873->24037|33903->24039|33982->24090|34011->24091|34041->24093|34171->24194|34201->24195|34233->24199|34575->24513|34604->24514|34636->24518|34665->24519|34695->24521|34778->24576|34807->24577|34837->24579|34966->24679|34996->24680|35028->24684|35370->24998|35399->24999|35431->25003|35460->25004|35490->25006|35573->25061|35602->25062|35633->25065|35743->25146|35773->25147|35805->25151|36135->25453|36164->25454|36196->25458|36225->25459|36255->25461|36332->25510|36361->25511|36392->25514|36421->25515|36460->25525|36490->25526|36524->25532|36553->25533|36588->25540|36617->25541|36655->25551|36710->25578|36726->25584|36798->25634
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|38->10|38->10|38->10|40->12|40->12|40->12|43->15|43->15|43->15|44->16|44->16|44->16|48->20|48->20|49->21|55->27|55->27|57->29|59->31|59->31|60->32|60->32|60->32|61->33|64->36|64->36|66->38|66->38|67->39|68->40|68->40|69->41|69->41|73->45|73->45|74->46|74->46|74->46|75->47|78->50|78->50|80->52|80->52|81->53|82->54|82->54|83->55|83->55|86->58|86->58|87->59|92->64|92->64|97->69|97->69|98->70|101->73|101->73|102->74|117->89|117->89|118->90|118->90|118->90|123->95|123->95|123->95|124->96|124->96|124->96|125->97|125->97|125->97|126->98|126->98|126->98|127->99|127->99|127->99|133->105|133->105|133->105|189->161|189->161|189->161|189->161|189->161|189->161|312->284|312->284|312->284|312->284|312->284|312->284|332->304|332->304|332->304|332->304|332->304|332->304|356->328|356->328|356->328|356->328|356->328|356->328|419->391|419->391|420->392|423->395|423->395|427->399|427->399|428->400|431->403|431->403|438->410|438->410|439->411|440->412|440->412|448->420|448->420|449->421|449->421|449->421|450->422|453->425|453->425|455->427|455->427|456->428|457->429|457->429|458->430|458->430|462->434|462->434|463->435|463->435|463->435|464->436|467->439|467->439|469->441|469->441|470->442|471->443|471->443|472->444|472->444|477->449|477->449|478->450|479->451|479->451|480->452|482->454|482->454|483->455|484->456|484->456|485->457|485->457|486->458|486->458|490->462|490->462|492->464|492->464|492->464|493->465|495->467|495->467|496->468|502->474|502->474|502->474|502->474|503->475|505->477|505->477|507->479|510->482|510->482|511->483|517->489|517->489|517->489|517->489|518->490|520->492|520->492|521->493|523->495|523->495|525->497|530->502|530->502|531->503|531->503|531->503|532->504|534->506|534->506|538->510|540->512|540->512|542->514|548->520|548->520|548->520|548->520|549->521|551->523|551->523|554->526|558->530|558->530|560->532|560->532|560->532|560->532|561->533|567->539|567->539|569->541|569->541|569->541|571->543|571->543|571->543|571->543|572->544|578->550|578->550|579->551|579->551|579->551|580->552|586->558|586->558|586->558|586->558|587->559|589->561|589->561|591->563|593->565|593->565|594->566|600->572|600->572|601->573|601->573|601->573|602->574|604->576|604->576|606->578|608->580|608->580|610->582|610->582|610->582|611->583|617->589|617->589|618->590|618->590|618->590|618->590|619->591|621->593|621->593|627->599|632->604|632->604|633->605|633->605|633->605|634->606|640->612|640->612|641->613|641->613|641->613|641->613|642->614|644->616|644->616|647->619|651->623|651->623|652->624|652->624|652->624|654->626|660->632|660->632|661->633|661->633|661->633|661->633|662->634|664->636|664->636|668->640|670->642|670->642|672->644|679->651|679->651|679->651|679->651|680->652|682->654|682->654|683->655|684->656|684->656|686->658|692->664|692->664|692->664|692->664|693->665|695->667|695->667|697->669|701->673|701->673|703->675|709->681|709->681|709->681|709->681|710->682|712->684|712->684|714->686|717->689|717->689|719->691|725->697|725->697|725->697|725->697|726->698|728->700|728->700|731->703|733->705|733->705|735->707|741->713|741->713|741->713|741->713|742->714|744->716|744->716|745->717|745->717|745->717|745->717|747->719|747->719|749->721|749->721|751->723|754->726|754->726|754->726
                  -- GENERATED --
              */
          