
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
object privacypolicy extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Privacy Policy Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href=""""),_display_(/*8.34*/routes/*8.40*/.Assets.at("_resources/favicon.ico")),format.raw/*8.76*/("""">
  <script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
  
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js
"></script>
<!--  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

 -->   <script src=""""),_display_(/*17.22*/routes/*17.28*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*17.72*/(""""></script>
    <script src=""""),_display_(/*18.19*/routes/*18.25*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*18.71*/(""""></script>
    <script>
      $(function()"""),format.raw/*20.19*/("""{"""),format.raw/*20.20*/("""
        """),format.raw/*21.9*/("""$("#geocomplete").geocomplete("""),format.raw/*21.39*/("""{"""),format.raw/*21.40*/("""
          """),format.raw/*22.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/(""");

        $("#find").click(function()"""),format.raw/*27.36*/("""{"""),format.raw/*27.37*/("""
          """),format.raw/*28.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/(""");
      """),format.raw/*30.7*/("""}"""),format.raw/*30.8*/(""");
    </script>
     <script>
      $(function()"""),format.raw/*33.19*/("""{"""),format.raw/*33.20*/("""
        """),format.raw/*34.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*34.40*/("""{"""),format.raw/*34.41*/("""
          """),format.raw/*35.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*38.9*/("""}"""),format.raw/*38.10*/(""");

        $("#find").click(function()"""),format.raw/*40.36*/("""{"""),format.raw/*40.37*/("""
          """),format.raw/*41.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/(""");
      """),format.raw/*43.7*/("""}"""),format.raw/*43.8*/(""");
    </script>

<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->  <link rel="stylesheet" href="_resources/bootstrap.min.css">
 <link rel="stylesheet" href=""""),_display_(/*48.32*/routes/*48.38*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*48.80*/("""">
<script src="""),_display_(/*49.14*/routes/*49.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*49.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*50.47*/routes/*50.53*/.Assets.at("_resources/background.css")),format.raw/*50.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*51.47*/routes/*51.53*/.Assets.at("_resources/forms.css")),format.raw/*51.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*52.47*/routes/*52.53*/.Assets.at("_resources/template.css")),format.raw/*52.90*/("""">
<style type="text/css">
h2.form-header """),format.raw/*54.16*/("""{"""),format.raw/*54.17*/("""
"""),format.raw/*55.1*/("""line-height: 1.618em;
font-size: 1.714em;
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/("""
"""),format.raw/*58.1*/("""</style>
</head>
<body>
<br>
<br>
<br>
<br>
<br>
		<form name="myForm" action="referal1" method="POST" onsubmit="return validateForm()">
		<div class="row"></div>
		<div class="row">
		
			<div class="col-sm-3"></div>
			<div class="col-sm-7 container-bg text-color-blue">
			<div>
				
				<div style="display:table; width:100%; text-align:right;"><a href="javascript:void(0);" onclick="javascript:window.close();"><u>Close [x]</u></a></div>
				
				<div align="left" style="padding-bottom: 20px; margin-top: 30px; padding-left:3%" >
				<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*78.11*/routes/*78.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*78.57*/(""""/>
				</div>
			</div>
				<div style="padding-top: 50px"></div>
				<div data-ng-app="demoApp" style="margin-left: 5%">
					
					<div class="form-header-group">
          <div class="header-text httal htvam">
            <h2 id="header_3" class="form-header">
              Privacy Policy
            </h2>
          </div>
          <div class="form-html">

<p class="welcome-page-text">
As a Mortgage Brokerage, Visdom Mortgage Solutions <b>(VMS)</b> is entrusted with the personal information of our customers, and we take that responsibility very serious. Federal law
requires us to tell you how we collect, use, share, and protect our customers&rsquo; information. Protecting the privacy and security of customers&rsquo; personal information is very important to
us, and this Privacy Policy Statement sets forth the manner in which we safeguard their information. Please read this notice carefully to understand our policy.
</p>
<br/>

<p class="welcome-page-text">
<span><b style="font-size:15px;height:60px;">Our Commitment to Our Customers</b></span><br/>
At VMS, we are committed to our customers, and part of that responsibility is protecting their information. As such, we are committed to the following:
<ul class="privacy-policy">
<li class="welcome-page-text-margin">We will not sell or share their information to any third-parties who wish to market services to them.</li>
<li class="welcome-page-text-margin">We have developed stringent policies and procedures to facilitate the protection of their information.</li>  
<li class="welcome-page-text-margin">Our brokers and management are committed to safeguarding your information as well as enforcing the policies and procedures to facilitate that goal.</li>
</ul>
</p>
<br/>

<p class="welcome-page-text">
<span><b style="font-size:15px;">Protection of Customers&rsquo; Information</b></span><br/>
VMS does a variety of things to protect your information, and the following are just a few of those methods:
<ul class="privacy-policy">
<li class="welcome-page-text-margin">We limit the access to customer information to those team members who have a reason to know. This limits the exposure of customer information.</li>
<li class="welcome-page-text-margin">We have implemented policies and procedures to safeguard customer information, and our team members are obligated to follow those policies and procedures.</li>
<li class="welcome-page-text-margin">Our team members follow company rules regarding the physical security of our workplace and records.</li>
<li class="welcome-page-text-margin">All of the implemented safeguards were designed to meet the requirements of provincial  and federal laws.</li>
<li class="welcome-page-text-margin">The third-party vendors we utilize are contractually required to safeguard information in accordance with provincial and federal laws.</li>
</ul>
</p> 
<br/>

<p class="welcome-page-text">
<span><b style="font-size:15px;">When We Collect Customer Information</b></span><br/>
In the course of meeting our customer&rsquo;s needs, we may collect information in the following manner:
<ul class="privacy-policy">
<li class="welcome-page-text-margin">Through information provided to us on a variety of forms and documents, including an application.</li>
<li class="welcome-page-text-margin">Information collected from third-parties.</li>
<li class="welcome-page-text-margin">Information about their computer hardware and software that may be automatically collected including, but not limited to: their IP address, browser type, domain names, and web referring website addresses.</li>
</ul>
</p>
</br>
 
<p class="welcome-page-text">
<span><b style="font-size:15px;">What We Collect</b></span><br/>
<ul class="privacy-policy">
<li class="welcome-page-text-margin">Identification information &#45;names, addresses, telephone numbers, and Social Insurance Numbers.</li>
<li class="welcome-page-text-margin">Application information &#45; information provided to us via their application, which could include amongst other things, information regarding assets, income, liabilities, and employment information.</li> 
<li class="welcome-page-text-margin">Transaction and Experience information &#45;transaction and account history information such as account balances, payment history, and account usage.</li>
<li class="welcome-page-text-margin">Consumer Report information &#45; such as credit history and credit reports.</li>
<li class="welcome-page-text-margin">Information from outside sources &#45; includes information like employment history, loan balances, credit card balances, insurance coverage, and other information.</li>
</ul>
</p>
<br/>

<p class="welcome-page-text">
<span><b style="font-size:15px;">Disclosing to Other Parties</b></span><br/>
VMS does not share customer information with other parties who wish to market or sell their services to consumers. In certain limited instances, VMS may disclose information to the following parties:
<ul class="privacy-policy">
<li class="welcome-page-text-margin">Government entities, courts or other entities, in response to subpoenas and other legal processes.</li>
<li class="welcome-page-text-margin">Parties or entities in which the customer requests us to disclose such information.</li>
<li class="welcome-page-text-margin">Companies that are affiliated with VMS or perform support services to VMS in connection with the fulfillment of our services to the customer.</li>
</ul>
</p>
<br/>

<p class="welcome-page-text">
<span><b style="font-size:15px;">Tips to Help Customers&rsquo; Protect Their Information</b></span><br/>
The following are tips that customers can use to help ensure the safeguarding of their information:
<ul class="privacy-policy">
<li class="welcome-page-text-margin">Make sure their information is stored in a secure location (e.g. safes or locked drawers).</li>
<li class="welcome-page-text-margin">Password protect their home computer, utilize different passwords for the various sites they access, and install a firewall and a virus protection program.</li>
<li class="welcome-page-text-margin">Use a shredder to destroy documents that have personal information.</li>
<li class="welcome-page-text-margin">Be sure customers know who they are communicating with if offering sensitive information.</li>
<li class="welcome-page-text-margin">Review all of their accounts frequently to ensure that the activity taking place is accurate.</li>
<li class="welcome-page-text-margin">Do not respond to emails requesting account numbers, passwords, or PINs without verifying the legitimacy of the email with the requesting entity.</li>
</ul>
</p>
<br/>

<p class="welcome-page-text">  
<span><b style="font-size:15px;">Additional Disclosure for Canadian Customers</b></span><br/>
In accordance with Canadian law, we will not share information we collect about Canadian residents with any other company, except as permitted by law. Residents of Canada have
the right to request from companies conducting business in Canada, a list of all third-parties to which the company has disclosed personal information during the preceding year for
direct marketing purposes. Alternatively, the law provides that if the company has a privacy policy that gives either an Opt-Out or Opt-In choice for use of customers&rsquo; personal
information by third-parties for marketing purposes, the company may instead provide the customer with information on how to exercise their disclosure choice options.
VMS currently does not share customers&rsquo; information with any non-affiliated third-parties for marketing purposes, thus we are not required to maintain or disclose a list of the 
third-parties that received their personal information during the preceding year for marketing purposes.
If a customer is a Canadian resident, and requests information about how to exercise their third-party disclosure choices, they must send a request to the following email address. 
They may contact us at: infoAtvisdom.ca
</p>
<br/>

<p class="welcome-page-text">
<span><b style="font-size:15px;">Assistance to Victims of Identity Theft</b></b></span><br/>  
If a customer believes they have been a victim of identity theft as a result of the information provided to us, please have them contact us immediately at <strong>1 - 855 - 699 - 2400.</strong>
In addition, they should also report this crime to their local law enforcement authority, and the Office of the Privacy Commissioner of Canada (OPC). Information on how to contact the OPC can be found at
<strong><a href="www.priv.gc.ca">www.priv.gc.ca</a></strong>.
</p>
</br/>

          </div>
        </div>
							<div class="col-sm-3"></div>
						</div>
					</div>
				</div>
	</form>
	


<script type="text/javascript">
	$(function() """),format.raw/*203.15*/("""{"""),format.raw/*203.16*/("""
		"""),format.raw/*204.3*/("""$.mask.definitions['~'] = "[+-]";

		$("#phonedatata").mask("999-999-9999");
	"""),format.raw/*207.2*/("""}"""),format.raw/*207.3*/(""");
</script>

 <script>
$(document).ready(function()"""),format.raw/*211.29*/("""{"""),format.raw/*211.30*/("""
    """),format.raw/*212.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*213.1*/("""}"""),format.raw/*213.2*/(""");
</script>

<script src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
 
    <script src="jquery.geocomplete.js"></script>
    <script>
      $(function()"""),format.raw/*220.19*/("""{"""),format.raw/*220.20*/("""
        """),format.raw/*221.9*/("""$("#geocomplete").geocomplete("""),format.raw/*221.39*/("""{"""),format.raw/*221.40*/("""
          """),format.raw/*222.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*225.9*/("""}"""),format.raw/*225.10*/(""");

        $("#find").click(function()"""),format.raw/*227.36*/("""{"""),format.raw/*227.37*/("""
          """),format.raw/*228.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*229.9*/("""}"""),format.raw/*229.10*/(""");
      """),format.raw/*230.7*/("""}"""),format.raw/*230.8*/(""");
    </script>
    
     <script>
      $(function()"""),format.raw/*234.19*/("""{"""),format.raw/*234.20*/("""
        """),format.raw/*235.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*235.40*/("""{"""),format.raw/*235.41*/("""
          """),format.raw/*236.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*239.9*/("""}"""),format.raw/*239.10*/(""");

        $("#find").click(function()"""),format.raw/*241.36*/("""{"""),format.raw/*241.37*/("""
          """),format.raw/*242.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*243.9*/("""}"""),format.raw/*243.10*/(""");
      """),format.raw/*244.7*/("""}"""),format.raw/*244.8*/(""");
    </script>
    <script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*249.56*/("""{"""),format.raw/*249.57*/("""
        """),format.raw/*250.9*/("""init();
        function init() """),format.raw/*251.25*/("""{"""),format.raw/*251.26*/("""
            """),format.raw/*252.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*254.41*/("""{"""),format.raw/*254.42*/("""
                """),format.raw/*255.17*/("""console.log($scope.newItemType)
            """),format.raw/*256.13*/("""}"""),format.raw/*256.14*/(""";
        """),format.raw/*257.9*/("""}"""),format.raw/*257.10*/("""
    """),format.raw/*258.5*/("""}"""),format.raw/*258.6*/(""");
    </script>
    
    <script type="text/javascript">
 function validateForm() """),format.raw/*262.26*/("""{"""),format.raw/*262.27*/("""
	 
	 """),format.raw/*264.3*/("""var fname=document.forms["myForm"]["fname"].value;
	 

		if(!fname)"""),format.raw/*267.13*/("""{"""),format.raw/*267.14*/("""
			"""),format.raw/*268.4*/("""document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			return false;
		"""),format.raw/*272.3*/("""}"""),format.raw/*272.4*/("""else"""),format.raw/*272.8*/("""{"""),format.raw/*272.9*/("""
	    	"""),format.raw/*273.7*/("""document.getElementById("fname1").innerHTML="";

		"""),format.raw/*275.3*/("""}"""),format.raw/*275.4*/(""" 
		"""),format.raw/*276.3*/("""var lname=document.forms["myForm"]["lname"].value;
		 
		if(!lname)"""),format.raw/*278.13*/("""{"""),format.raw/*278.14*/("""
			
			"""),format.raw/*280.4*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			return false;
		"""),format.raw/*284.3*/("""}"""),format.raw/*284.4*/("""
			"""),format.raw/*285.4*/("""else"""),format.raw/*285.8*/("""{"""),format.raw/*285.9*/("""
		    	"""),format.raw/*286.8*/("""document.getElementById("lname1").innerHTML="";

			"""),format.raw/*288.4*/("""}"""),format.raw/*288.5*/(""" 
		
			"""),format.raw/*290.4*/("""var phone=document.forms["myForm"]["phone"].value;
		 
		if(!phone)"""),format.raw/*292.13*/("""{"""),format.raw/*292.14*/("""
			"""),format.raw/*293.4*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			return false;
		"""),format.raw/*297.3*/("""}"""),format.raw/*297.4*/("""	
		"""),format.raw/*298.3*/("""else"""),format.raw/*298.7*/("""{"""),format.raw/*298.8*/("""
	    	"""),format.raw/*299.7*/("""document.getElementById("phone1").innerHTML="";

		"""),format.raw/*301.3*/("""}"""),format.raw/*301.4*/(""" 
	 
		"""),format.raw/*303.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*305.13*/("""{"""),format.raw/*305.14*/("""
			
			"""),format.raw/*307.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			return false;
		"""),format.raw/*311.3*/("""}"""),format.raw/*311.4*/("""else"""),format.raw/*311.8*/("""{"""),format.raw/*311.9*/("""
	    	"""),format.raw/*312.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*314.3*/("""}"""),format.raw/*314.4*/("""
	 
	 
    """),format.raw/*317.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*321.24*/("""{"""),format.raw/*321.25*/("""         
		  
    """),format.raw/*323.5*/("""}"""),format.raw/*323.6*/("""else"""),format.raw/*323.10*/("""{"""),format.raw/*323.11*/("""   
		"""),format.raw/*324.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
    """),format.raw/*328.5*/("""}"""),format.raw/*328.6*/("""
    
    """),format.raw/*330.5*/("""if(pattern.test(x2))"""),format.raw/*330.25*/("""{"""),format.raw/*330.26*/("""         
		  
    """),format.raw/*332.5*/("""}"""),format.raw/*332.6*/("""else"""),format.raw/*332.10*/("""{"""),format.raw/*332.11*/("""   
		"""),format.raw/*333.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		return false;
    """),format.raw/*337.5*/("""}"""),format.raw/*337.6*/("""
    """),format.raw/*338.5*/("""if (x  != x2) """),format.raw/*338.19*/("""{"""),format.raw/*338.20*/("""
"""),format.raw/*339.1*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

    	return false;
    """),format.raw/*343.5*/("""}"""),format.raw/*343.6*/("""else"""),format.raw/*343.10*/("""{"""),format.raw/*343.11*/("""
    	"""),format.raw/*344.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*346.5*/("""}"""),format.raw/*346.6*/("""
 """),format.raw/*347.2*/("""}"""),format.raw/*347.3*/("""
    
    """),format.raw/*349.5*/("""</script>
  

<script src=""""),_display_(/*352.15*/routes/*352.21*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*352.71*/("""" type="text/javascript"></script>
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
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/privacypolicy.scala.html
                  HASH: cdb952556213db95a881342bfd50dcf8717a7075
                  MATRIX: 731->1|836->18|863->19|1211->341|1225->347|1281->383|1744->819|1759->825|1824->869|1881->899|1896->905|1963->951|2034->994|2063->995|2099->1004|2157->1034|2186->1035|2225->1046|2354->1148|2383->1149|2450->1188|2479->1189|2518->1200|2591->1246|2620->1247|2656->1256|2684->1257|2761->1306|2790->1307|2826->1316|2885->1347|2914->1348|2953->1359|3082->1461|3111->1462|3178->1501|3207->1502|3246->1513|3320->1560|3349->1561|3385->1570|3413->1571|3644->1775|3659->1781|3722->1823|3765->1839|3780->1845|3842->1886|3929->1946|3944->1952|4004->1991|4080->2040|4095->2046|4150->2080|4226->2129|4241->2135|4299->2172|4369->2214|4398->2215|4426->2216|4495->2258|4523->2259|4551->2260|5175->2857|5190->2863|5251->2903|14036->11659|14066->11660|14097->11663|14203->11741|14232->11742|14313->11794|14343->11795|14376->11800|14447->11843|14476->11844|14699->12038|14729->12039|14766->12048|14825->12078|14855->12079|14895->12090|15025->12192|15055->12193|15123->12232|15153->12233|15193->12244|15267->12290|15297->12291|15334->12300|15363->12301|15446->12355|15476->12356|15513->12365|15573->12396|15603->12397|15643->12408|15773->12510|15803->12511|15871->12550|15901->12551|15941->12562|16016->12609|16046->12610|16083->12619|16112->12620|16309->12788|16339->12789|16376->12798|16437->12830|16467->12831|16509->12844|16634->12940|16664->12941|16710->12958|16783->13002|16813->13003|16851->13013|16881->13014|16914->13019|16943->13020|17055->13103|17085->13104|17119->13110|17215->13177|17245->13178|17277->13182|17565->13442|17594->13443|17626->13447|17655->13448|17690->13455|17769->13506|17798->13507|17830->13511|17926->13578|17956->13579|17992->13587|18279->13846|18308->13847|18340->13851|18372->13855|18401->13856|18437->13864|18517->13916|18546->13917|18582->13925|18678->13992|18708->13993|18740->13997|19030->14259|19059->14260|19091->14264|19123->14268|19152->14269|19187->14276|19266->14327|19295->14328|19330->14335|19426->14402|19456->14403|19492->14411|19776->14667|19805->14668|19837->14672|19866->14673|19901->14680|19980->14731|20009->14732|20048->14743|20285->14952|20315->14953|20362->14972|20391->14973|20424->14977|20454->14978|20488->14984|20783->15251|20812->15252|20850->15262|20899->15282|20929->15283|20976->15302|21005->15303|21038->15307|21068->15308|21102->15314|21396->15580|21425->15581|21458->15586|21501->15600|21531->15601|21560->15602|21849->15863|21878->15864|21911->15868|21941->15869|21975->15875|22055->15927|22084->15928|22114->15930|22143->15931|22181->15941|22237->15969|22253->15975|22325->16025
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|49->21|49->21|49->21|50->22|53->25|53->25|55->27|55->27|56->28|57->29|57->29|58->30|58->30|61->33|61->33|62->34|62->34|62->34|63->35|66->38|66->38|68->40|68->40|69->41|70->42|70->42|71->43|71->43|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|82->54|82->54|83->55|85->57|85->57|86->58|106->78|106->78|106->78|231->203|231->203|232->204|235->207|235->207|239->211|239->211|240->212|241->213|241->213|248->220|248->220|249->221|249->221|249->221|250->222|253->225|253->225|255->227|255->227|256->228|257->229|257->229|258->230|258->230|262->234|262->234|263->235|263->235|263->235|264->236|267->239|267->239|269->241|269->241|270->242|271->243|271->243|272->244|272->244|277->249|277->249|278->250|279->251|279->251|280->252|282->254|282->254|283->255|284->256|284->256|285->257|285->257|286->258|286->258|290->262|290->262|292->264|295->267|295->267|296->268|300->272|300->272|300->272|300->272|301->273|303->275|303->275|304->276|306->278|306->278|308->280|312->284|312->284|313->285|313->285|313->285|314->286|316->288|316->288|318->290|320->292|320->292|321->293|325->297|325->297|326->298|326->298|326->298|327->299|329->301|329->301|331->303|333->305|333->305|335->307|339->311|339->311|339->311|339->311|340->312|342->314|342->314|345->317|349->321|349->321|351->323|351->323|351->323|351->323|352->324|356->328|356->328|358->330|358->330|358->330|360->332|360->332|360->332|360->332|361->333|365->337|365->337|366->338|366->338|366->338|367->339|371->343|371->343|371->343|371->343|372->344|374->346|374->346|375->347|375->347|377->349|380->352|380->352|380->352
                  -- GENERATED --
              */
          