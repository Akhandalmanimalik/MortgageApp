
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
object submitreferral extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template11[String,String,String,String,String,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(referralId:
String,leadfName:String,leadlname:String,leadphone:String,leadEmail:String,reffname:String,reflname:String,refEmail:String,
prefname:String, prelname:String, preemail:String ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.52*/("""


"""),format.raw/*6.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "htts://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="shortcut icon" href=""""),_display_(/*9.34*/routes/*9.40*/.Assets.at("_resources/favicon.ico")),format.raw/*9.76*/("""">

<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Visdom Referral</title>


<script
	src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
<!--  <script src="htts://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
 -->
<script src=""""),_display_(/*19.15*/routes/*19.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*19.65*/(""""></script>
<script src=""""),_display_(/*20.15*/routes/*20.21*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*20.67*/(""""></script>
<script>
	$(function() """),format.raw/*22.15*/("""{"""),format.raw/*22.16*/("""
		"""),format.raw/*23.3*/("""$("#geocomplete").geocomplete("""),format.raw/*23.33*/("""{"""),format.raw/*23.34*/("""
			"""),format.raw/*24.4*/("""map : ".map_canvas",
			details : "form",
			types : [ "geocode", "establishment" ],
		"""),format.raw/*27.3*/("""}"""),format.raw/*27.4*/(""");

		$("#find").click(function() """),format.raw/*29.31*/("""{"""),format.raw/*29.32*/("""
			"""),format.raw/*30.4*/("""$("#geocomplete").trigger("geocode");
		"""),format.raw/*31.3*/("""}"""),format.raw/*31.4*/(""");
	"""),format.raw/*32.2*/("""}"""),format.raw/*32.3*/(""");
</script>
<script type="text/javascript">
	$.get("http://ipinfo.io", function(response) """),format.raw/*35.47*/("""{"""),format.raw/*35.48*/("""
		"""),format.raw/*36.3*/("""document.getElementById("details").value = JSON.stringify(response,
				null, 4);
		/* $("#ip").html("IP: " + response.ip);
		$("#address").html("Location: " + response.city + ", " + response.region); */
		// $("#details").html(JSON.stringify(response, null, 4));
	"""),format.raw/*41.2*/("""}"""),format.raw/*41.3*/(""", "jsonp");
</script>
<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->
<link rel="stylesheet" href=""""),_display_(/*45.31*/routes/*45.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*45.79*/("""">
<script src="""),_display_(/*46.14*/routes/*46.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*46.61*/(""""></script>
<link type="text/css" rel="stylesheet" href=""""),_display_(/*47.47*/routes/*47.53*/.Assets.at("_resources/background.css")),format.raw/*47.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*48.47*/routes/*48.53*/.Assets.at("_resources/forms.css")),format.raw/*48.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*49.47*/routes/*49.53*/.Assets.at("_resources/template.css")),format.raw/*49.90*/("""">
<style type="text/css">

/*  #loading """),format.raw/*52.14*/("""{"""),format.raw/*52.15*/("""
	"""),format.raw/*53.2*/("""position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background: url('"""),_display_(/*59.20*/routes/*59.26*/.Assets.at("images/page-loader.gif")),format.raw/*59.62*/("""') 50% 50% no-repeat rgb(249,249,249);
"""),format.raw/*60.1*/("""}"""),format.raw/*60.2*/(""" """),format.raw/*60.3*/("""*/
#overlay """),format.raw/*61.10*/("""{"""),format.raw/*61.11*/("""
	"""),format.raw/*62.2*/("""display: none;
	position: fixed;
	background: threedhighlight;
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
"""),format.raw/*71.1*/("""}"""),format.raw/*71.2*/("""

"""),format.raw/*73.1*/("""#loading """),format.raw/*73.10*/("""{"""),format.raw/*73.11*/("""
	"""),format.raw/*74.2*/("""padding: 10px 10px 10px 60px;
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background-color: threedhighlight;
	opacity: 0.6;
	filter: alpha(opacity = 60);
	*/
"""),format.raw/*85.1*/("""}"""),format.raw/*85.2*/("""
"""),format.raw/*86.1*/("""</style>








</head>
<body>


	<div id="loading" style="display: none" align="center">


		<img src=""""),_display_(/*102.14*/routes/*102.20*/.Assets.at("/images/preloader-image.gif")),format.raw/*102.61*/("""" alt="" />

	</div>
	<div align="center">
		<img alt="Visdom Logo" height="90" width="260"
			src=""""),_display_(/*107.10*/routes/*107.16*/.Assets.at("_resources/visdom-logo.png")),format.raw/*107.56*/("""" />


	</div>

	<div class="container-fluid">


		<form name="myForm" action="/leadcreation" method="post"
			onsubmit="return validateForm()">
			<div class="row"></div>
			<div class="row">
				<div class="col-sm-3"></div>
				<div class="col-sm-7 container-bg text-color-blue">
					<div style="padding-top: 50px"></div>

					<div>
						<font size="3">Please complete the information below to submit a referral to Visdom.  You will receive an email confirming when an application for financing has been sent to your referral. </font>
					</div>
					<br>
					<div align="center">
						<font style="font-family: sans-serif; font-weight: bold;" size="5">Referral
							Information</font>
					</div>
					<br> <br> <input type="hidden" name="ip" value=""
						id="details"> <input type="hidden" value=""""),_display_(/*132.50*/referralId),format.raw/*132.60*/(""""
						name="referralId">
					<div class="form-group" style="width: 280px">
						<label for="usr"> <font size="4"> Client's First
								Name </font><span style="color: red; font-size: 3">*</span></label> <input
							type="text" id="fname" name="fname" class="form-control" required>
						<div id="fname1">
							<font color="red">"""),_display_(/*139.27*/leadfName),format.raw/*139.36*/("""</font>
						</div>

					</div>
					<br>
					<div class="form-group" style="width:280px">
						<label for="pwd"><font size="4">Client's Last Name</font>
							<span style="color: red; font-size: 3">*</span> </label> <input
							type="text" id="lname" name="lname" class="form-control" required>
						<div id="lname1">
							<font color="red">"""),_display_(/*149.27*/leadlname),format.raw/*149.36*/("""</font>
						</div>

					</div>
					<br>

					<div class="form-group" style="width:280px"
						title="This is the text of the tooltip">
						<label><font size="4">Client's Phone Number </font> <span
							style="color: red; font-size: 4">*</span> </label> <input type="tel"
							class="form-control" name="phone" id="phonedatata"
							data-toggle="tooltip" data-placement="right"
							title="Please provide a mobile number so we can better assist your referral by phone if required."
							required />
						<div id="phone1">
							<font color="red">"""),_display_(/*164.27*/leadphone),format.raw/*164.36*/("""</font>
						</div>


					</div>
					<br>




					<div class="form-group" style="width:280px">
						<label for="pwd"><font size="4">Client's Email </font> <span
							style="color: red; font-size: 3">*</span> </label> <input type="email"
							id="email" name="email" class="form-control"
							placeholder="Ex: myemail@example.com" data-toggle="tooltip"
							data-placement="right"
							title="All communication occurs by email with your referral including the initial private mortgage application. Please double check email address for accuracy."
							required>
						<div id="email1">
							<font color="red">"""),_display_(/*183.27*/leadEmail),format.raw/*183.36*/("""</font>
						</div>

					</div>

					<div class="form-group" style="width:280px">
						<input type="email" id="email2" name="email2" class="form-control"
							placeholder="Confirm Email" required>
						<div id="error"></div>
					</div>
					<br>
			<div class="form-group" style="width: 60%; height: 30%">
	<label for="pwd"><font size="4">Property Address
								being financed (if known)</font> <span style="color: red; font-size: 3"></span>
						</label>
</div>
					<div class="map_canvas"></div>
					<div class="form-group" style="width: 280px; height: 30%">
						 <input id="geocomplete" type="text" name="formatted_address"
							placeholder="Type in an address" style="width: 100%; height: 70%" />


					</div>


					<br>

					<div>
						<font size="3"> In order to ensure we are able to correctly
							compensate you for the above referral please provide YOUR name
							and email below. </font>
					</div>
					<br>

					<div align="center">
						<font style="font-family: sans-serif; font-weight: bold;" size="5">Your
							Information</font>
					</div>
					<br>

					<div class="form-group" style="width:280px">
						<label for="pwd"><font size="4"> First Name</font> <span
							style="color: red; font-size: 3">*</span> </label> <input type="text"
							name="reffirstname" id="reffirstname" class="form-control"
							value=""""),_display_(/*227.16*/prefname),format.raw/*227.24*/("""" required>
						<div id="reffname">
							<font color="red"> """),_display_(/*229.28*/reffname),format.raw/*229.36*/("""</font>
						</div>

					</div>
					<br>

					<div class="form-group" style="width:280px">
						<label for="pwd"><font size="4"> Last Name</font> <span
							style="color: red; font-size: 3">*</span> </label> <input type="text"
							id="reflastname" name="reflastname" class="form-control"
							value=""""),_display_(/*239.16*/prelname),format.raw/*239.24*/("""" required>
						<div id="reflname">
							<font color="red"> """),_display_(/*241.28*/reflname),format.raw/*241.36*/("""</font>
						</div>

					</div>
					<br>

					<div class="form-group" style="width:280px">
						<label for="pwd"><font size="4"> Email</font> <span
							style="color: red; font-size: 3">*</span> </label> <input type="email"
							id="refemail" name="refemail"
							placeholder="Ex:myemail@example.com" value=""""),_display_(/*251.54*/preemail),format.raw/*251.62*/(""""
							data-toggle="tooltip" data-placement="right"
							title="For each referral provided, we will request you to confirm your name and email address to ensure we are accurate in providing any referral fees related to this referral."
							class="form-control" required>
						<div id="refemail1">
							<font color="red"> """),_display_(/*256.28*/refEmail),format.raw/*256.36*/("""</font>
						</div>

					</div>
					<br>
					<div align="center">

						<input type="submit" style="width: 280px" class="btn btn-primary "
							value="Submit" id="Submit">
						<div align="center" id="submiterror">
							<font color="red"></font>
						</div>

					</div>




					<div style="padding-bottom: 50px;"></div>
				</div>
				<div class="col-sm-3"></div>
			</div>
		</form>
	</div>

	<br>
	<br>
	<div></div>











	<script type="text/javascript">
		$(function() """),format.raw/*296.16*/("""{"""),format.raw/*296.17*/("""
			"""),format.raw/*297.4*/("""$.mask.definitions['~'] = "[+-]";

			$("#phonedatata").mask("999-999-9999");

		"""),format.raw/*301.3*/("""}"""),format.raw/*301.4*/(""");
	</script>

	<script>
		$(document).ready(function() """),format.raw/*305.32*/("""{"""),format.raw/*305.33*/("""
			"""),format.raw/*306.4*/("""$('[data-toggle="tooltip"]').tooltip();
		"""),format.raw/*307.3*/("""}"""),format.raw/*307.4*/(""");
	</script>

	<script
		src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

	<script src=""""),_display_(/*315.16*/routes/*315.22*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*315.68*/(""""></script>
	<script>
		$(function() """),format.raw/*317.16*/("""{"""),format.raw/*317.17*/("""
			"""),format.raw/*318.4*/("""$("#geocomplete").geocomplete("""),format.raw/*318.34*/("""{"""),format.raw/*318.35*/("""
				"""),format.raw/*319.5*/("""map : ".map_canvas",
				details : "form",
				types : [ "geocode", "establishment" ],
			"""),format.raw/*322.4*/("""}"""),format.raw/*322.5*/(""");

			$("#find").click(function() """),format.raw/*324.32*/("""{"""),format.raw/*324.33*/("""
				"""),format.raw/*325.5*/("""$("#geocomplete").trigger("geocode");
			"""),format.raw/*326.4*/("""}"""),format.raw/*326.5*/(""");
		"""),format.raw/*327.3*/("""}"""),format.raw/*327.4*/(""");
	</script>

	<script src=""""),_display_(/*330.16*/routes/*330.22*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*330.72*/("""" type="text/javascript"></script>
	<script type="text/javascript">
		function validateForm() """),format.raw/*332.27*/("""{"""),format.raw/*332.28*/("""

			"""),format.raw/*334.4*/("""var fname = document.forms["myForm"]["fname"].value;
			var value = true;

			if (!fname) """),format.raw/*337.16*/("""{"""),format.raw/*337.17*/("""
				"""),format.raw/*338.5*/("""document.getElementById("fname1").innerHTML = "<p style=\"color:red\">FirstName Required</p>";
				document.getElementById("fname").focus();

				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value = false;
			"""),format.raw/*344.4*/("""}"""),format.raw/*344.5*/("""else if(fname.trim().length<2)"""),format.raw/*344.35*/("""{"""),format.raw/*344.36*/("""
				
				
				"""),format.raw/*347.5*/("""document.getElementById("fname").focus();

				document.getElementById("fname1").innerHTML="<p style=\"color:red\">First Name Should More than one letter</p>";
				document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value=false;
				
				
			"""),format.raw/*355.4*/("""}"""),format.raw/*355.5*/(""" """),format.raw/*355.6*/("""else"""),format.raw/*355.10*/("""{"""),format.raw/*355.11*/("""
				"""),format.raw/*356.5*/("""if(!fname.match(/^[a-zA-Z ]*$/))"""),format.raw/*356.37*/("""{"""),format.raw/*356.38*/("""
					"""),format.raw/*357.6*/("""document.getElementById("fname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
					document.getElementById("fname").focus();
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


					value = false;

				"""),format.raw/*364.5*/("""}"""),format.raw/*364.6*/("""else"""),format.raw/*364.10*/("""{"""),format.raw/*364.11*/("""
					"""),format.raw/*365.6*/("""document.getElementById("fname1").innerHTML = "";

				"""),format.raw/*367.5*/("""}"""),format.raw/*367.6*/("""

			"""),format.raw/*369.4*/("""}"""),format.raw/*369.5*/(""" 
			
			
			
			"""),format.raw/*373.4*/("""var lname = document.forms["myForm"]["lname"].value;
		

			if (!lname) """),format.raw/*376.16*/("""{"""),format.raw/*376.17*/("""

				"""),format.raw/*378.5*/("""document.getElementById("lname1").innerHTML = "<p style=\"color:red\">LastName Required</p>";
				document.getElementById("lname").focus();

				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value = false;
			"""),format.raw/*384.4*/("""}"""),format.raw/*384.5*/("""  """),format.raw/*384.7*/("""else if(lname.trim().length<2)"""),format.raw/*384.37*/("""{"""),format.raw/*384.38*/("""
				
				
				"""),format.raw/*387.5*/("""document.getElementById("lname").focus();

				document.getElementById("lname1").innerHTML="<p style=\"color:red\">Last  Name Should More than one letter</p>";
				document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value=false;
				
				
			"""),format.raw/*395.4*/("""}"""),format.raw/*395.5*/("""
				"""),format.raw/*396.5*/("""else"""),format.raw/*396.9*/("""{"""),format.raw/*396.10*/("""
					
					"""),format.raw/*398.6*/("""if(!lname.match(/^[a-zA-Z ]*$/))"""),format.raw/*398.38*/("""{"""),format.raw/*398.39*/("""
						"""),format.raw/*399.7*/("""document.getElementById("lname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
						document.getElementById("lname").focus();
						document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


						value = false;

					"""),format.raw/*406.6*/("""}"""),format.raw/*406.7*/("""else"""),format.raw/*406.11*/("""{"""),format.raw/*406.12*/("""
						"""),format.raw/*407.7*/("""document.getElementById("lname1").innerHTML = "";

					"""),format.raw/*409.6*/("""}"""),format.raw/*409.7*/("""

				"""),format.raw/*411.5*/("""}"""),format.raw/*411.6*/(""" 

			"""),format.raw/*413.4*/("""var phone = document.forms["myForm"]["phone"].value;

			if (!phone) """),format.raw/*415.16*/("""{"""),format.raw/*415.17*/("""
				"""),format.raw/*416.5*/("""document.getElementById("phone1").innerHTML = "<p style=\"color:red\">PhoneNumber Required</p>";
				document.getElementById("phonedatata").focus();

				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value = false;
			"""),format.raw/*422.4*/("""}"""),format.raw/*422.5*/(""" """),format.raw/*422.6*/("""else """),format.raw/*422.11*/("""{"""),format.raw/*422.12*/("""
				"""),format.raw/*423.5*/("""document.getElementById("phone1").innerHTML = "";

			"""),format.raw/*425.4*/("""}"""),format.raw/*425.5*/("""

			"""),format.raw/*427.4*/("""var email = document.forms["myForm"]["email"].value;

			if (!email) """),format.raw/*429.16*/("""{"""),format.raw/*429.17*/("""

				"""),format.raw/*431.5*/("""document.getElementById("email1").innerHTML = "<p style=\"color:red\">Email Required</p>";
				document.getElementById("email").focus();

				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value = false;
			"""),format.raw/*437.4*/("""}"""),format.raw/*437.5*/(""" """),format.raw/*437.6*/("""else """),format.raw/*437.11*/("""{"""),format.raw/*437.12*/("""
				"""),format.raw/*438.5*/("""document.getElementById("email1").innerHTML = "";

			"""),format.raw/*440.4*/("""}"""),format.raw/*440.5*/("""

			"""),format.raw/*442.4*/("""var x = document.forms["myForm"]["email"].value;
			var x2 = document.forms["myForm"]["email2"].value;

			var pattern = /^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
			if (pattern.test(x)) """),format.raw/*446.25*/("""{"""),format.raw/*446.26*/("""

			"""),format.raw/*448.4*/("""}"""),format.raw/*448.5*/(""" """),format.raw/*448.6*/("""else """),format.raw/*448.11*/("""{"""),format.raw/*448.12*/("""
				"""),format.raw/*449.5*/("""document.getElementById("email1").innerHTML = "<p style=\"color:red\"> Proper Email Id Required</p>";
				document.getElementById("email").focus();

				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value = false;
			"""),format.raw/*455.4*/("""}"""),format.raw/*455.5*/("""

			"""),format.raw/*457.4*/("""if (pattern.test(x2)) """),format.raw/*457.26*/("""{"""),format.raw/*457.27*/("""

			"""),format.raw/*459.4*/("""}"""),format.raw/*459.5*/(""" """),format.raw/*459.6*/("""else """),format.raw/*459.11*/("""{"""),format.raw/*459.12*/("""
				"""),format.raw/*460.5*/("""document.getElementById("error").innerHTML = "<p style=\"color:red\"> Proper Email Id Required</p>";
				document.getElementById("email2").focus();

				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value = false;
			"""),format.raw/*466.4*/("""}"""),format.raw/*466.5*/("""
			"""),format.raw/*467.4*/("""if (x != x2) """),format.raw/*467.17*/("""{"""),format.raw/*467.18*/("""
				"""),format.raw/*468.5*/("""document.getElementById("error").innerHTML = "<p style=\"color:red\">Email have to match</p>";
				document.getElementById("email2").focus();

				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value = false;
			"""),format.raw/*474.4*/("""}"""),format.raw/*474.5*/(""" """),format.raw/*474.6*/("""else """),format.raw/*474.11*/("""{"""),format.raw/*474.12*/("""
				"""),format.raw/*475.5*/("""document.getElementById("error").innerHTML = "";

			"""),format.raw/*477.4*/("""}"""),format.raw/*477.5*/("""

			"""),format.raw/*479.4*/("""var refname = document.forms["myForm"]["reffirstname"].value;

			if (!refname) """),format.raw/*481.18*/("""{"""),format.raw/*481.19*/("""

				"""),format.raw/*483.5*/("""document.getElementById("reffname").innerHTML = "<p style=\"color:red\">Your First Name Required</p>";
				document.getElementById("reffirstname").focus();

				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value = false;
			"""),format.raw/*489.4*/("""}"""),format.raw/*489.5*/(""" """),format.raw/*489.6*/("""else if(refname.trim().length<2)"""),format.raw/*489.38*/("""{"""),format.raw/*489.39*/("""
				
				
				"""),format.raw/*492.5*/("""document.getElementById("reffirstname").focus();

				document.getElementById("reffname").innerHTML="<p style=\"color:red\">First Name Should More than one letter</p>";
				document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value=false;
				
				
			"""),format.raw/*500.4*/("""}"""),format.raw/*500.5*/("""else"""),format.raw/*500.9*/("""{"""),format.raw/*500.10*/("""
			"""),format.raw/*501.4*/("""if(!refname.match(/^[a-zA-Z ]*$/))"""),format.raw/*501.38*/("""{"""),format.raw/*501.39*/("""
				"""),format.raw/*502.5*/("""document.getElementById("reffname").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
				document.getElementById("reffirstname").focus();
				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


				value = false;

			"""),format.raw/*509.4*/("""}"""),format.raw/*509.5*/("""else"""),format.raw/*509.9*/("""{"""),format.raw/*509.10*/("""
				"""),format.raw/*510.5*/("""document.getElementById("reffname").innerHTML = "";

			"""),format.raw/*512.4*/("""}"""),format.raw/*512.5*/("""
			"""),format.raw/*513.4*/("""}"""),format.raw/*513.5*/("""

			"""),format.raw/*515.4*/("""var reflname = document.forms["myForm"]["reflastname"].value;

			if (!reflname) """),format.raw/*517.19*/("""{"""),format.raw/*517.20*/("""

				"""),format.raw/*519.5*/("""document.getElementById("reflname").innerHTML = "<p style=\"color:red\">Your Last Name Required</p>";
				document.getElementById("reflastname").focus();

				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value = false;
			"""),format.raw/*525.4*/("""}"""),format.raw/*525.5*/("""  """),format.raw/*525.7*/("""else if(reflname.trim().length<2)"""),format.raw/*525.40*/("""{"""),format.raw/*525.41*/("""
				
				
				"""),format.raw/*528.5*/("""document.getElementById("reflastname").focus();

				document.getElementById("reflname").innerHTML="<p style=\"color:red\">Last Name Should More than one letter</p>";
				document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value=false;
				
				
			"""),format.raw/*536.4*/("""}"""),format.raw/*536.5*/("""else"""),format.raw/*536.9*/("""{"""),format.raw/*536.10*/("""
				"""),format.raw/*537.5*/("""if(!reflname.match(/^[a-zA-Z ]*$/))"""),format.raw/*537.40*/("""{"""),format.raw/*537.41*/("""
					"""),format.raw/*538.6*/("""document.getElementById("reflname").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
					document.getElementById("reflastname").focus();
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


					value = false;

				"""),format.raw/*545.5*/("""}"""),format.raw/*545.6*/("""else"""),format.raw/*545.10*/("""{"""),format.raw/*545.11*/("""
					"""),format.raw/*546.6*/("""document.getElementById("reflname").innerHTML = "";

				"""),format.raw/*548.5*/("""}"""),format.raw/*548.6*/("""
			"""),format.raw/*549.4*/("""}"""),format.raw/*549.5*/("""
			
			

			"""),format.raw/*553.4*/("""var email = document.forms["myForm"]["refemail"].value;

			if (!email) """),format.raw/*555.16*/("""{"""),format.raw/*555.17*/("""

				"""),format.raw/*557.5*/("""document.getElementById("refemail1").innerHTML = "<p style=\"color:red\">Your Email Required</p>";
				document.getElementById("refemail").focus();

				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value = false;
			"""),format.raw/*563.4*/("""}"""),format.raw/*563.5*/(""" """),format.raw/*563.6*/("""else """),format.raw/*563.11*/("""{"""),format.raw/*563.12*/("""
				"""),format.raw/*564.5*/("""document.getElementById("refemail1").innerHTML = "";

			"""),format.raw/*566.4*/("""}"""),format.raw/*566.5*/("""

			"""),format.raw/*568.4*/("""if (pattern.test(email)) """),format.raw/*568.29*/("""{"""),format.raw/*568.30*/("""

			"""),format.raw/*570.4*/("""}"""),format.raw/*570.5*/(""" """),format.raw/*570.6*/("""else """),format.raw/*570.11*/("""{"""),format.raw/*570.12*/("""
				"""),format.raw/*571.5*/("""document.getElementById("refemail1").innerHTML = "<p style=\"color:red\"> Proper Email Id Required</p>";
				document.getElementById("refemail1").focus();

				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value = false;
			"""),format.raw/*577.4*/("""}"""),format.raw/*577.5*/("""

			"""),format.raw/*579.4*/("""if (value) """),format.raw/*579.15*/("""{"""),format.raw/*579.16*/("""
				"""),format.raw/*580.5*/("""$('#loading').show();
			"""),format.raw/*581.4*/("""}"""),format.raw/*581.5*/("""
			"""),format.raw/*582.4*/("""return value;

		"""),format.raw/*584.3*/("""}"""),format.raw/*584.4*/("""
	"""),format.raw/*585.2*/("""</script>



</body>
</html>

"""))}
  }

  def render(referralId:String,leadfName:String,leadlname:String,leadphone:String,leadEmail:String,reffname:String,reflname:String,refEmail:String,prefname:String,prelname:String,preemail:String): play.twirl.api.HtmlFormat.Appendable = apply(referralId,leadfName,leadlname,leadphone,leadEmail,reffname,reflname,refEmail,prefname,prelname,preemail)

  def f:((String,String,String,String,String,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (referralId,leadfName,leadlname,leadphone,leadEmail,reffname,reflname,refEmail,prefname,prelname,preemail) => apply(referralId,leadfName,leadlname,leadphone,leadEmail,reffname,reflname,refEmail,prefname,prelname,preemail)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:27 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/submitreferral.scala.html
                  HASH: 4c8b502f07400985c45c237938f4a8030021b333
                  MATRIX: 803->1|1079->189|1108->192|1284->342|1298->348|1354->384|1699->702|1714->708|1779->752|1832->778|1847->784|1914->830|1977->865|2006->866|2036->869|2094->899|2123->900|2154->904|2268->991|2296->992|2358->1026|2387->1027|2418->1031|2485->1071|2513->1072|2544->1076|2572->1077|2691->1168|2720->1169|2750->1172|3042->1437|3070->1438|3243->1584|3258->1590|3321->1632|3364->1648|3379->1654|3441->1695|3526->1753|3541->1759|3601->1798|3677->1847|3692->1853|3747->1887|3823->1936|3838->1942|3896->1979|3965->2020|3994->2021|4023->2023|4154->2127|4169->2133|4226->2169|4292->2208|4320->2209|4348->2210|4388->2222|4417->2223|4446->2225|4622->2374|4650->2375|4679->2377|4716->2386|4745->2387|4774->2389|5002->2590|5030->2591|5058->2592|5192->2698|5208->2704|5271->2745|5400->2846|5416->2852|5478->2892|6318->3704|6350->3714|6718->4054|6749->4063|7130->4416|7161->4425|7755->4991|7786->5000|8442->5629|8473->5638|9872->7009|9902->7017|9995->7082|10025->7090|10366->7403|10396->7411|10489->7476|10519->7484|10867->7805|10897->7813|11256->8144|11286->8152|11805->8642|11835->8643|11867->8647|11976->8728|12005->8729|12090->8785|12120->8786|12152->8790|12222->8832|12251->8833|12503->9057|12519->9063|12587->9109|12653->9146|12683->9147|12715->9151|12774->9181|12804->9182|12837->9187|12955->9277|12984->9278|13048->9313|13078->9314|13111->9319|13180->9360|13209->9361|13242->9366|13271->9367|13329->9397|13345->9403|13417->9453|13540->9547|13570->9548|13603->9553|13722->9643|13752->9644|13785->9649|14128->9964|14157->9965|14216->9995|14246->9996|14289->10011|14656->10350|14685->10351|14714->10352|14747->10356|14777->10357|14810->10362|14871->10394|14901->10395|14935->10401|15292->10730|15321->10731|15354->10735|15384->10736|15418->10742|15501->10797|15530->10798|15563->10803|15592->10804|15637->10821|15738->10893|15768->10894|15802->10900|16144->11214|16173->11215|16203->11217|16262->11247|16292->11248|16335->11263|16702->11602|16731->11603|16764->11608|16796->11612|16826->11613|16866->11625|16927->11657|16957->11658|16992->11665|17353->11998|17382->11999|17415->12003|17445->12004|17480->12011|17564->12067|17593->12068|17627->12074|17656->12075|17690->12081|17788->12150|17818->12151|17851->12156|18202->12479|18231->12480|18260->12481|18294->12486|18324->12487|18357->12492|18439->12546|18468->12547|18501->12552|18599->12621|18629->12622|18663->12628|19002->12939|19031->12940|19060->12941|19094->12946|19124->12947|19157->12952|19239->13006|19268->13007|19301->13012|19539->13222|19569->13223|19602->13228|19631->13229|19660->13230|19694->13235|19724->13236|19757->13241|20107->13563|20136->13564|20169->13569|20220->13591|20250->13592|20283->13597|20312->13598|20341->13599|20375->13604|20405->13605|20438->13610|20788->13932|20817->13933|20849->13937|20891->13950|20921->13951|20954->13956|21298->14272|21327->14273|21356->14274|21390->14279|21420->14280|21453->14285|21534->14338|21563->14339|21596->14344|21705->14424|21735->14425|21769->14431|22127->14761|22156->14762|22185->14763|22246->14795|22276->14796|22319->14811|22695->15159|22724->15160|22756->15164|22786->15165|22818->15169|22881->15203|22911->15204|22944->15209|23306->15543|23335->15544|23367->15548|23397->15549|23430->15554|23514->15610|23543->15611|23575->15615|23604->15616|23637->15621|23747->15702|23777->15703|23811->15709|24167->16037|24196->16038|24226->16040|24288->16073|24318->16074|24361->16089|24735->16435|24764->16436|24796->16440|24826->16441|24859->16446|24923->16481|24953->16482|24987->16488|25352->16825|25381->16826|25414->16830|25444->16831|25478->16837|25563->16894|25592->16895|25624->16899|25653->16900|25694->16913|25795->16985|25825->16986|25859->16992|26209->17314|26238->17315|26267->17316|26301->17321|26331->17322|26364->17327|26449->17384|26478->17385|26511->17390|26565->17415|26595->17416|26628->17421|26657->17422|26686->17423|26720->17428|26750->17429|26783->17434|27140->17763|27169->17764|27202->17769|27242->17780|27272->17781|27305->17786|27358->17811|27387->17812|27419->17816|27464->17833|27493->17834|27523->17836
                  LINES: 26->1|31->3|34->6|37->9|37->9|37->9|47->19|47->19|47->19|48->20|48->20|48->20|50->22|50->22|51->23|51->23|51->23|52->24|55->27|55->27|57->29|57->29|58->30|59->31|59->31|60->32|60->32|63->35|63->35|64->36|69->41|69->41|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|80->52|80->52|81->53|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|90->62|99->71|99->71|101->73|101->73|101->73|102->74|113->85|113->85|114->86|130->102|130->102|130->102|135->107|135->107|135->107|160->132|160->132|167->139|167->139|177->149|177->149|192->164|192->164|211->183|211->183|255->227|255->227|257->229|257->229|267->239|267->239|269->241|269->241|279->251|279->251|284->256|284->256|324->296|324->296|325->297|329->301|329->301|333->305|333->305|334->306|335->307|335->307|343->315|343->315|343->315|345->317|345->317|346->318|346->318|346->318|347->319|350->322|350->322|352->324|352->324|353->325|354->326|354->326|355->327|355->327|358->330|358->330|358->330|360->332|360->332|362->334|365->337|365->337|366->338|372->344|372->344|372->344|372->344|375->347|383->355|383->355|383->355|383->355|383->355|384->356|384->356|384->356|385->357|392->364|392->364|392->364|392->364|393->365|395->367|395->367|397->369|397->369|401->373|404->376|404->376|406->378|412->384|412->384|412->384|412->384|412->384|415->387|423->395|423->395|424->396|424->396|424->396|426->398|426->398|426->398|427->399|434->406|434->406|434->406|434->406|435->407|437->409|437->409|439->411|439->411|441->413|443->415|443->415|444->416|450->422|450->422|450->422|450->422|450->422|451->423|453->425|453->425|455->427|457->429|457->429|459->431|465->437|465->437|465->437|465->437|465->437|466->438|468->440|468->440|470->442|474->446|474->446|476->448|476->448|476->448|476->448|476->448|477->449|483->455|483->455|485->457|485->457|485->457|487->459|487->459|487->459|487->459|487->459|488->460|494->466|494->466|495->467|495->467|495->467|496->468|502->474|502->474|502->474|502->474|502->474|503->475|505->477|505->477|507->479|509->481|509->481|511->483|517->489|517->489|517->489|517->489|517->489|520->492|528->500|528->500|528->500|528->500|529->501|529->501|529->501|530->502|537->509|537->509|537->509|537->509|538->510|540->512|540->512|541->513|541->513|543->515|545->517|545->517|547->519|553->525|553->525|553->525|553->525|553->525|556->528|564->536|564->536|564->536|564->536|565->537|565->537|565->537|566->538|573->545|573->545|573->545|573->545|574->546|576->548|576->548|577->549|577->549|581->553|583->555|583->555|585->557|591->563|591->563|591->563|591->563|591->563|592->564|594->566|594->566|596->568|596->568|596->568|598->570|598->570|598->570|598->570|598->570|599->571|605->577|605->577|607->579|607->579|607->579|608->580|609->581|609->581|610->582|612->584|612->584|613->585
                  -- GENERATED --
              */
          