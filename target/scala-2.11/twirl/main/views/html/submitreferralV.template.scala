
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
object submitreferralV extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template11[String,String,String,String,String,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(referralId: String,leadfName:String,leadlname:String,leadphone:String,leadEmail:String,reffname:String,reflname:String,refEmail:String,prefname:String,prelname:String,preemail:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.186*/("""


"""),format.raw/*4.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "htts://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="shortcut icon" href=""""),_display_(/*7.34*/routes/*7.40*/.Assets.at("_resources/favicon.ico")),format.raw/*7.76*/("""">

<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Visdom Referral </title>


  <script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
<!--  <script src="htts://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
 -->   <script src=""""),_display_(/*15.22*/routes/*15.28*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*15.72*/(""""></script>
    <script src=""""),_display_(/*16.19*/routes/*16.25*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*16.71*/(""""></script>
    <script>
      $(function()"""),format.raw/*18.19*/("""{"""),format.raw/*18.20*/("""
        """),format.raw/*19.9*/("""$("#geocomplete").geocomplete("""),format.raw/*19.39*/("""{"""),format.raw/*19.40*/("""
          """),format.raw/*20.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/(""");

        $("#find").click(function()"""),format.raw/*25.36*/("""{"""),format.raw/*25.37*/("""
          """),format.raw/*26.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/(""");
      """),format.raw/*28.7*/("""}"""),format.raw/*28.8*/(""");
    </script>

<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->  <link rel="stylesheet" href=""""),_display_(/*32.37*/routes/*32.43*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*32.85*/("""">
  <script src="""),_display_(/*33.16*/routes/*33.22*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*33.63*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*34.47*/routes/*34.53*/.Assets.at("_resources/background.css")),format.raw/*34.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*35.47*/routes/*35.53*/.Assets.at("_resources/forms.css")),format.raw/*35.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*36.47*/routes/*36.53*/.Assets.at("_resources/template.css")),format.raw/*36.90*/("""">
 <style type="text/css">

 #overlay"""),format.raw/*39.10*/("""{"""),format.raw/*39.11*/(""" 
	"""),format.raw/*40.2*/("""display: none;
	position: fixed;
	background: threedhighlight;
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;

"""),format.raw/*50.1*/("""}"""),format.raw/*50.2*/(""" 

"""),format.raw/*52.1*/("""#loading"""),format.raw/*52.9*/("""{"""),format.raw/*52.10*/(""" 
	"""),format.raw/*53.2*/("""padding: 10px 10px 10px 60px; 
		position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background-color:threedhighlight;
    opacity: 0.6;
    filter: alpha(opacity=60); */
"""),format.raw/*63.1*/("""}"""),format.raw/*63.2*/("""

"""),format.raw/*65.1*/("""</style> 







  
  </head>
<body>


  <div id="loading" style="display: none" align="center" >
 
  
     <img src=""""),_display_(/*81.17*/routes/*81.23*/.Assets.at("/images/preloader-image.gif")),format.raw/*81.64*/("""" alt="" />
  
  </div>  

 <div style="padding-bottom:20px; margin-top:20px;padding-left: 45%">
                		<img alt="Visdom Logo" height="90" width="260"  src=""""),_display_(/*86.73*/routes/*86.79*/.Assets.at("_resources/visdom-logo.png")),format.raw/*86.119*/("""" />
              
              
                	</div>
                
  <div class="container-fluid" >
  
  
  
<form name="myForm"  
   action="/leadcreation" method="post"  onsubmit="return validateForm()" >
  <div class="row"></div>
            <div class="row">
            	<div class="col-sm-3"></div>
            	<div class="col-sm-7 container-bg text-color-blue" >
            	            	<div style="padding-top: 50px"></div><br>
             <div align="center" style="height: 100%;width: 100%">
<iframe src="//fast.wistia.net/embed/iframe/x74841vuxw?videoFoam=true" allowtransparency="true" frameborder="0" scrolling="no" class="wistia_embed" name="wistia_embed" allowfullscreen mozallowfullscreen webkitallowfullscreen oallowfullscreen msallowfullscreen width="640" height="360"></iframe><script src="//fast.wistia.net/assets/external/E-v1.js"></script>
<br>
<br>
</div>   
            		 <div><font size="3">
Please complete the information below to submit a referral to Visdom.  You will receive an email confirming when an application for financing has been sent to your referral.
  </font>
  </div>
  <br>
  <div align="center">
  <font style="font-family: sans-serif;font-weight: bold;"size="5">Referral Information</font>
  </div>
  <br>
     <br>   
    
 <input type="hidden" name="ip" value="" id="details">	
            
       <input type="hidden" value=""""),_display_(/*120.37*/referralId),format.raw/*120.47*/("""" name="referralId">
       <div class="form-group" style="width: 280px">
  <label for="usr"> <font size="4"> Client's First Name </font><span style="color: red;font-size: 3 ">*</span></label>
  <input type="text" id="fname" name="fname" class="form-control"  required>
  <div id="fname1"><font color="red">"""),_display_(/*124.39*/leadfName),format.raw/*124.48*/("""</font> </div>

</div>
<br>     	
            <div class="form-group" style="width: 280px">
  <label for="pwd"><font size="4">Client's Last Name</font> <span style="color: red;font-size: 3 ">*</span> </label>
  <input type="text"  id="lname"  name="lname" class="form-control" required>
    <div id="lname1"><font color="red">"""),_display_(/*131.41*/leadlname),format.raw/*131.50*/("""</font></div>
  
</div>
<br>

<div class="form-group" style="width: 280px"  title="This is the text of the tooltip">
  <label ><font size="4">Client's Phone Number </font> <span style="color: red;font-size: 3 ">*</span> </label>

       
            <input type="tel" class="form-control" name="phone" id="phonedatata"   data-toggle="tooltip" data-placement="right" title="Please provide a mobile number so we can better assist your referral by phone if required."  required/>
           <div id="phone1"><font color="red">"""),_display_(/*141.48*/leadphone),format.raw/*141.57*/("""</font></div>
       
</div>
<br>
            
       
       
       
<div class="form-group" style="width: 280px">
  <label for="pwd"><font size="4">Client's Email </font> <span style="color: red;font-size: 3 ">*</span> </label>
  <input type="email" id="email" name="email"  class="form-control" placeholder="Ex: myemail@example.com"   data-toggle="tooltip"  data-placement="right" title="All communication occurs by email with your referral including the initial private mortgage application. Please double check email address for accuracy." required>
           <div id="email1"><font color="red">"""),_display_(/*152.48*/leadEmail),format.raw/*152.57*/("""</font> </div>

</div>
      
      <div class="form-group" style="width: 280px">
  <input type="email" id="email2" name="email2"  class="form-control" placeholder="Confirm Email" required>
  <div id="error"> </div>
</div>
<br>
<div class="form-group" style="width: 60%;height: 50%">
 <label for="pwd"><font size="4">Property Address being financed (if known)</font> <span style="color: red;font-size: 3 "></span> </label>
  </div>
  <div class="map_canvas"></div>
<div class="form-group" style="width: 280px;">
 
<input id="geocomplete"   type="text" name="formatted_address" placeholder="Type in an address" style="width:100%;height: 70%"  />
    
 
      </div>


<br>

<div><font size="3">
In order to ensure we are able to correctly compensate you for the above referral please provide YOUR name and email below.
  </font>
  </div>
  <br>
  
<div align="center">
  <font style="font-family: sans-serif;font-weight: bold;"size="5">Your Information</font>
  </div>
  <br>
  
  <div class="form-group" style="width: 280px">
  <label for="pwd"><font size="4"> First Name</font> <span style="color: red;font-size: 3 ">*</span> </label>
  <input type="text" name="reffirstname" id="reffirstname" class="form-control" value=""""),_display_(/*188.89*/prefname),format.raw/*188.97*/(""""  required>
             <div id="reffname"><font color="red"> """),_display_(/*189.53*/reffname),format.raw/*189.61*/("""</font></div>
  
</div>
<br>

<div class="form-group" style="width: 280px">
  <label for="pwd"><font size="4"> Last Name</font> <span style="color: red;font-size: 3 ">*</span> </label>
  <input type="text" id="reflastname"  name="reflastname" class="form-control" value=""""),_display_(/*196.88*/prelname),format.raw/*196.96*/("""" required>
               <div id="reflname"><font color="red"> """),_display_(/*197.55*/reflname),format.raw/*197.63*/("""</font></div>
  
</div>
<br>

<div class="form-group" style="width: 280px">
  <label for="pwd"><font size="4"> Email</font> <span style="color: red;font-size: 3 ">*</span> </label>
  <input type="email" id="refemail" name="refemail" placeholder="Ex:myemail@example.com" value=""""),_display_(/*204.99*/preemail),format.raw/*204.107*/("""" data-toggle="tooltip" data-placement="right" title="For each referral provided, we will request you to confirm your name and email address to ensure we are accurate in providing any referral fees related to this referral." class="form-control"  required>
               <div  id="refemail1"><font color="red"> """),_display_(/*205.57*/refEmail),format.raw/*205.65*/("""</font></div>

</div>
<br>
<div align="center">

<input type="submit" style="width: 280px"  class="btn btn-primary"   value="Submit"   > 
               <div align="center" id="submiterror"><font color="red"></font></div>

</div>


            
            	
            	<div style="padding-bottom:50px;"></div>
            	</div>
            	<div class="col-sm-3"></div>
            </div>
  </form>  
  </div>

<br><br>
<div>



</div>











<script type="text/javascript">
    $(function() """),format.raw/*244.18*/("""{"""),format.raw/*244.19*/("""
        """),format.raw/*245.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
        
    """),format.raw/*249.5*/("""}"""),format.raw/*249.6*/(""");
	
</script>

 <script>
$(document).ready(function()"""),format.raw/*254.29*/("""{"""),format.raw/*254.30*/("""
    """),format.raw/*255.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*256.1*/("""}"""),format.raw/*256.2*/(""");
</script>

<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
 
    <script src=""""),_display_(/*262.19*/routes/*262.25*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*262.71*/(""""></script>
    <script>
      $(function()"""),format.raw/*264.19*/("""{"""),format.raw/*264.20*/("""
        """),format.raw/*265.9*/("""$("#geocomplete").geocomplete("""),format.raw/*265.39*/("""{"""),format.raw/*265.40*/("""
          """),format.raw/*266.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*269.9*/("""}"""),format.raw/*269.10*/(""");

        $("#find").click(function()"""),format.raw/*271.36*/("""{"""),format.raw/*271.37*/("""
          """),format.raw/*272.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*273.9*/("""}"""),format.raw/*273.10*/(""");
      """),format.raw/*274.7*/("""}"""),format.raw/*274.8*/(""");
    </script>

<script src=""""),_display_(/*277.15*/routes/*277.21*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*277.71*/("""" type="text/javascript"></script>
 <script type="text/javascript">
 function validateForm() """),format.raw/*279.26*/("""{"""),format.raw/*279.27*/("""
	 
	 """),format.raw/*281.3*/("""var fname=document.forms["myForm"]["fname"].value;
	 var value=true;


	 try"""),format.raw/*285.6*/("""{"""),format.raw/*285.7*/("""
		"""),format.raw/*286.3*/("""if(!fname)"""),format.raw/*286.13*/("""{"""),format.raw/*286.14*/("""
			"""),format.raw/*287.4*/("""document.getElementById("fname1").innerHTML="<p style=\"color:red\">FirstName Required</p>";
			document.getElementById("fname").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=  false;
		"""),format.raw/*293.3*/("""}"""),format.raw/*293.4*/("""else if(fname.trim().length<2)"""),format.raw/*293.34*/("""{"""),format.raw/*293.35*/("""
			
			
			"""),format.raw/*296.4*/("""document.getElementById("fname").focus();

			document.getElementById("fname1").innerHTML="<p style=\"color:red\">First Name Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*304.3*/("""}"""),format.raw/*304.4*/(""" """),format.raw/*304.5*/("""else"""),format.raw/*304.9*/("""{"""),format.raw/*304.10*/("""
			"""),format.raw/*305.4*/("""if(!fname.match(/^[a-zA-Z ]*$/))"""),format.raw/*305.36*/("""{"""),format.raw/*305.37*/("""
				"""),format.raw/*306.5*/("""document.getElementById("fname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
				document.getElementById("fname").focus();
				document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


				value = false;

			"""),format.raw/*313.4*/("""}"""),format.raw/*313.5*/("""else"""),format.raw/*313.9*/("""{"""),format.raw/*313.10*/("""
				"""),format.raw/*314.5*/("""document.getElementById("fname1").innerHTML = "";

			"""),format.raw/*316.4*/("""}"""),format.raw/*316.5*/("""

		"""),format.raw/*318.3*/("""}"""),format.raw/*318.4*/(""" 
		
		
		
		"""),format.raw/*322.3*/("""var lname=document.forms["myForm"]["lname"].value;
		 
		if(!lname)"""),format.raw/*324.13*/("""{"""),format.raw/*324.14*/("""
			
			"""),format.raw/*326.4*/("""document.getElementById("lname1").innerHTML="<p style=\"color:red\">LastName Required</p>";
			document.getElementById("lname").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=  false;
		"""),format.raw/*332.3*/("""}"""),format.raw/*332.4*/(""" """),format.raw/*332.5*/("""else if(lname.trim().length<2)"""),format.raw/*332.35*/("""{"""),format.raw/*332.36*/("""
			
			
			"""),format.raw/*335.4*/("""document.getElementById("lname").focus();

			document.getElementById("lname1").innerHTML="<p style=\"color:red\">Last  Name Should More than one letter</p>";
			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=false;
			
			
		"""),format.raw/*343.3*/("""}"""),format.raw/*343.4*/("""
			"""),format.raw/*344.4*/("""else"""),format.raw/*344.8*/("""{"""),format.raw/*344.9*/("""
				
				"""),format.raw/*346.5*/("""if(!lname.match(/^[a-zA-Z ]*$/))"""),format.raw/*346.37*/("""{"""),format.raw/*346.38*/("""
					"""),format.raw/*347.6*/("""document.getElementById("lname1").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
					document.getElementById("lname").focus();
					document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


					value = false;

				"""),format.raw/*354.5*/("""}"""),format.raw/*354.6*/("""else"""),format.raw/*354.10*/("""{"""),format.raw/*354.11*/("""
					"""),format.raw/*355.6*/("""document.getElementById("lname1").innerHTML = "";

				"""),format.raw/*357.5*/("""}"""),format.raw/*357.6*/("""

			"""),format.raw/*359.4*/("""}"""),format.raw/*359.5*/(""" 
			
			"""),format.raw/*361.4*/("""var phone=document.forms["myForm"]["phone"].value;
		 
		if(!phone)"""),format.raw/*363.13*/("""{"""),format.raw/*363.14*/("""
			"""),format.raw/*364.4*/("""document.getElementById("phone1").innerHTML="<p style=\"color:red\">PhoneNumber Required</p>";
			document.getElementById("phonedatata").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=  false;
		"""),format.raw/*370.3*/("""}"""),format.raw/*370.4*/("""	
		"""),format.raw/*371.3*/("""else"""),format.raw/*371.7*/("""{"""),format.raw/*371.8*/("""
	    	"""),format.raw/*372.7*/("""document.getElementById("phone1").innerHTML="";

		"""),format.raw/*374.3*/("""}"""),format.raw/*374.4*/(""" 
	 
		"""),format.raw/*376.3*/("""var email=document.forms["myForm"]["email"].value;
		 
		if(!email)"""),format.raw/*378.13*/("""{"""),format.raw/*378.14*/("""
			
			"""),format.raw/*380.4*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\">Email Required</p>";
			document.getElementById("email").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value=  false;
		"""),format.raw/*386.3*/("""}"""),format.raw/*386.4*/("""else"""),format.raw/*386.8*/("""{"""),format.raw/*386.9*/("""
	    	"""),format.raw/*387.7*/("""document.getElementById("email1").innerHTML="";

		"""),format.raw/*389.3*/("""}"""),format.raw/*389.4*/("""
	 
	 
    """),format.raw/*392.5*/("""var x = document.forms["myForm"]["email"].value;
    var x2 = document.forms["myForm"]["email2"].value;

    var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if(pattern.test(x))"""),format.raw/*396.24*/("""{"""),format.raw/*396.25*/("""         
		  
    """),format.raw/*398.5*/("""}"""),format.raw/*398.6*/("""else"""),format.raw/*398.10*/("""{"""),format.raw/*398.11*/("""   
		"""),format.raw/*399.3*/("""document.getElementById("email1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=  false;
    """),format.raw/*405.5*/("""}"""),format.raw/*405.6*/("""
    
    """),format.raw/*407.5*/("""if(pattern.test(x2))"""),format.raw/*407.25*/("""{"""),format.raw/*407.26*/("""         
		  
    """),format.raw/*409.5*/("""}"""),format.raw/*409.6*/("""else"""),format.raw/*409.10*/("""{"""),format.raw/*409.11*/("""   
		"""),format.raw/*410.3*/("""document.getElementById("error").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
		document.getElementById("email2").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=  false;
    """),format.raw/*416.5*/("""}"""),format.raw/*416.6*/("""
    """),format.raw/*417.5*/("""if (x  != x2) """),format.raw/*417.19*/("""{"""),format.raw/*417.20*/("""
"""),format.raw/*418.1*/("""document.getElementById("error").innerHTML="<p style=\"color:red\">Email have to match</p>";
document.getElementById("email2").focus();

document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

value=  false;
    """),format.raw/*424.5*/("""}"""),format.raw/*424.6*/("""else"""),format.raw/*424.10*/("""{"""),format.raw/*424.11*/("""
    	"""),format.raw/*425.6*/("""document.getElementById("error").innerHTML="";

    """),format.raw/*427.5*/("""}"""),format.raw/*427.6*/("""
    
    
    """),format.raw/*430.5*/("""var refname=document.forms["myForm"]["reffirstname"].value;
	 
	if(!refname)"""),format.raw/*432.14*/("""{"""),format.raw/*432.15*/("""
		
		"""),format.raw/*434.3*/("""document.getElementById("reffname").innerHTML="<p style=\"color:red\">Your First Name Required</p>";
		document.getElementById("reffirstname").focus();

		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=  false;
	"""),format.raw/*440.2*/("""}"""),format.raw/*440.3*/("""else if(refname.trim().length<2)"""),format.raw/*440.35*/("""{"""),format.raw/*440.36*/("""
		
		
		"""),format.raw/*443.3*/("""document.getElementById("reffirstname").focus();

		document.getElementById("reffname").innerHTML="<p style=\"color:red\">First Name Should More than one letter</p>";
		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=false;
		
		
	"""),format.raw/*451.2*/("""}"""),format.raw/*451.3*/("""else"""),format.raw/*451.7*/("""{"""),format.raw/*451.8*/("""
	"""),format.raw/*452.2*/("""if(!refname.match(/^[a-zA-Z ]*$/))"""),format.raw/*452.36*/("""{"""),format.raw/*452.37*/("""
		"""),format.raw/*453.3*/("""document.getElementById("reffname").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
		document.getElementById("reffirstname").focus();
		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


		value = false;

	"""),format.raw/*460.2*/("""}"""),format.raw/*460.3*/("""else"""),format.raw/*460.7*/("""{"""),format.raw/*460.8*/("""
		"""),format.raw/*461.3*/("""document.getElementById("reffname").innerHTML = "";

	"""),format.raw/*463.2*/("""}"""),format.raw/*463.3*/("""
	"""),format.raw/*464.2*/("""}"""),format.raw/*464.3*/("""
	
	"""),format.raw/*466.2*/("""var reflname = document.forms["myForm"]["reflastname"].value;

	if (!reflname) """),format.raw/*468.17*/("""{"""),format.raw/*468.18*/("""

		"""),format.raw/*470.3*/("""document.getElementById("reflname").innerHTML = "<p style=\"color:red\">Your Last Name Required</p>";
		document.getElementById("reflastname").focus();

		document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value = false;
	"""),format.raw/*476.2*/("""}"""),format.raw/*476.3*/("""  """),format.raw/*476.5*/("""else if(reflname.trim().length<2)"""),format.raw/*476.38*/("""{"""),format.raw/*476.39*/("""
		
		
		"""),format.raw/*479.3*/("""document.getElementById("reflastname").focus();

		document.getElementById("reflname").innerHTML="<p style=\"color:red\">Last Name Should More than one letter</p>";
		document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

		value=false;
		
		
	"""),format.raw/*487.2*/("""}"""),format.raw/*487.3*/("""else"""),format.raw/*487.7*/("""{"""),format.raw/*487.8*/("""
		"""),format.raw/*488.3*/("""if(!reflname.match(/^[a-zA-Z ]*$/))"""),format.raw/*488.38*/("""{"""),format.raw/*488.39*/("""
			"""),format.raw/*489.4*/("""document.getElementById("reflname").innerHTML ="<p style=\"color:red\">Please Enter Aplhabets only.</p>";
			document.getElementById("reflastname").focus();
			document.getElementById("submiterror").innerHTML = "<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";


			value = false;

		"""),format.raw/*496.3*/("""}"""),format.raw/*496.4*/("""else"""),format.raw/*496.8*/("""{"""),format.raw/*496.9*/("""
			"""),format.raw/*497.4*/("""document.getElementById("reflname").innerHTML = "";

		"""),format.raw/*499.3*/("""}"""),format.raw/*499.4*/("""
	"""),format.raw/*500.2*/("""}"""),format.raw/*500.3*/("""
	
	 """),format.raw/*502.3*/("""var email=document.forms["myForm"]["refemail"].value;
	 
	 
	 
	
	 
		if(!email)"""),format.raw/*508.13*/("""{"""),format.raw/*508.14*/("""
			
			"""),format.raw/*510.4*/("""document.getElementById("refemail1").innerHTML="<p style=\"color:red\">Your Email Required</p>";
			document.getElementById("refemail").focus();

			document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

			value= false;
		"""),format.raw/*516.3*/("""}"""),format.raw/*516.4*/("""else"""),format.raw/*516.8*/("""{"""),format.raw/*516.9*/("""
	    	"""),format.raw/*517.7*/("""document.getElementById("refemail1").innerHTML="";

		"""),format.raw/*519.3*/("""}"""),format.raw/*519.4*/("""
		
		 """),format.raw/*521.4*/("""if(pattern.test(email))"""),format.raw/*521.27*/("""{"""),format.raw/*521.28*/("""         
			  
		    """),format.raw/*523.7*/("""}"""),format.raw/*523.8*/("""else"""),format.raw/*523.12*/("""{"""),format.raw/*523.13*/("""   
				"""),format.raw/*524.5*/("""document.getElementById("refemail1").innerHTML="<p style=\"color:red\"> Proper Email Id Required</p>";
				document.getElementById("refemail1").focus();

				document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

				value= false;
		    """),format.raw/*530.7*/("""}"""),format.raw/*530.8*/("""
		
	  """),format.raw/*532.4*/("""if(value)"""),format.raw/*532.13*/("""{"""),format.raw/*532.14*/("""
			 """),format.raw/*533.5*/("""$('#loading').show();
		 """),format.raw/*534.4*/("""}"""),format.raw/*534.5*/(""" 
		 """),format.raw/*535.4*/("""return value;
	 """),format.raw/*536.3*/("""}"""),format.raw/*536.4*/("""catch(err)"""),format.raw/*536.14*/("""{"""),format.raw/*536.15*/(""" 
		 
		 """),format.raw/*538.4*/("""alert("Error "+err);
			return false;
 
	 """),format.raw/*541.3*/("""}"""),format.raw/*541.4*/("""
	 
		"""),format.raw/*543.3*/("""return false;
    
"""),format.raw/*545.1*/("""}"""),format.raw/*545.2*/("""
 
 """),format.raw/*547.2*/("""</script>
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
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/submitreferralV.scala.html
                  HASH: 1a7d57ddc8669e1c225400246ef615191474e055
                  MATRIX: 804->1|1077->185|1106->188|1282->338|1296->344|1352->380|1701->702|1716->708|1781->752|1838->782|1853->788|1920->834|1991->877|2020->878|2056->887|2114->917|2143->918|2182->929|2311->1031|2340->1032|2407->1071|2436->1072|2475->1083|2548->1129|2577->1130|2613->1139|2641->1140|2811->1283|2826->1289|2889->1331|2934->1349|2949->1355|3011->1396|3098->1456|3113->1462|3173->1501|3249->1550|3264->1556|3319->1590|3395->1639|3410->1645|3468->1682|3534->1720|3563->1721|3593->1724|3770->1874|3798->1875|3828->1878|3863->1886|3892->1887|3922->1890|4154->2095|4182->2096|4211->2098|4357->2217|4372->2223|4434->2264|4630->2433|4645->2439|4707->2479|6123->3867|6155->3877|6491->4185|6522->4194|6877->4521|6908->4530|7460->5054|7491->5063|8122->5667|8153->5676|9405->6900|9435->6908|9528->6973|9558->6981|9858->7253|9888->7261|9982->7327|10012->7335|10318->7614|10349->7622|10690->7935|10720->7943|11250->8444|11280->8445|11317->8454|11441->8550|11470->8551|11553->8605|11583->8606|11616->8611|11687->8654|11716->8655|11966->8877|11982->8883|12050->8929|12122->8972|12152->8973|12189->8982|12248->9012|12278->9013|12318->9024|12448->9126|12478->9127|12546->9166|12576->9167|12616->9178|12690->9224|12720->9225|12757->9234|12786->9235|12846->9267|12862->9273|12934->9323|13056->9416|13086->9417|13120->9423|13224->9499|13253->9500|13284->9503|13323->9513|13353->9514|13385->9518|13720->9825|13749->9826|13808->9856|13838->9857|13878->9869|14239->10202|14268->10203|14297->10204|14329->10208|14359->10209|14391->10213|14452->10245|14482->10246|14515->10251|14868->10576|14897->10577|14929->10581|14959->10582|14992->10587|15074->10641|15103->10642|15135->10646|15164->10647|15205->10660|15301->10727|15331->10728|15367->10736|15701->11042|15730->11043|15759->11044|15818->11074|15848->11075|15888->11087|16249->11420|16278->11421|16310->11425|16342->11429|16371->11430|16409->11440|16470->11472|16500->11473|16534->11479|16891->11808|16920->11809|16953->11813|16983->11814|17017->11820|17100->11875|17129->11876|17162->11881|17191->11882|17228->11891|17324->11958|17354->11959|17386->11963|17729->12278|17758->12279|17790->12283|17822->12287|17851->12288|17886->12295|17965->12346|17994->12347|18029->12354|18125->12421|18155->12422|18191->12430|18522->12733|18551->12734|18583->12738|18612->12739|18647->12746|18726->12797|18755->12798|18794->12809|19031->13018|19061->13019|19108->13038|19137->13039|19170->13043|19200->13044|19234->13050|19575->13363|19604->13364|19642->13374|19691->13394|19721->13395|19768->13414|19797->13415|19830->13419|19860->13420|19894->13426|20235->13739|20264->13740|20297->13745|20340->13759|20370->13760|20399->13761|20728->14062|20757->14063|20790->14067|20820->14068|20854->14074|20934->14126|20963->14127|21006->14142|21111->14218|21141->14219|21175->14225|21521->14543|21550->14544|21611->14576|21641->14577|21678->14586|22042->14922|22071->14923|22103->14927|22132->14928|22162->14930|22225->14964|22255->14965|22286->14968|22640->15294|22669->15295|22701->15299|22730->15300|22761->15303|22843->15357|22872->15358|22902->15360|22931->15361|22963->15365|23071->15444|23101->15445|23133->15449|23481->15769|23510->15770|23540->15772|23602->15805|23632->15806|23669->15815|24031->16149|24060->16150|24092->16154|24121->16155|24152->16158|24216->16193|24246->16194|24278->16198|24635->16527|24664->16528|24696->16532|24725->16533|24757->16537|24840->16592|24869->16593|24899->16595|24928->16596|24961->16601|25070->16681|25100->16682|25136->16690|25477->17003|25506->17004|25538->17008|25567->17009|25602->17016|25684->17070|25713->17071|25748->17078|25800->17101|25830->17102|25880->17124|25909->17125|25942->17129|25972->17130|26008->17138|26363->17465|26392->17466|26427->17473|26465->17482|26495->17483|26528->17488|26581->17513|26610->17514|26643->17519|26687->17535|26716->17536|26755->17546|26785->17547|26822->17556|26892->17598|26921->17599|26955->17605|27002->17624|27031->17625|27063->17629
                  LINES: 26->1|29->1|32->4|35->7|35->7|35->7|43->15|43->15|43->15|44->16|44->16|44->16|46->18|46->18|47->19|47->19|47->19|48->20|51->23|51->23|53->25|53->25|54->26|55->27|55->27|56->28|56->28|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|67->39|67->39|68->40|78->50|78->50|80->52|80->52|80->52|81->53|91->63|91->63|93->65|109->81|109->81|109->81|114->86|114->86|114->86|148->120|148->120|152->124|152->124|159->131|159->131|169->141|169->141|180->152|180->152|216->188|216->188|217->189|217->189|224->196|224->196|225->197|225->197|232->204|232->204|233->205|233->205|272->244|272->244|273->245|277->249|277->249|282->254|282->254|283->255|284->256|284->256|290->262|290->262|290->262|292->264|292->264|293->265|293->265|293->265|294->266|297->269|297->269|299->271|299->271|300->272|301->273|301->273|302->274|302->274|305->277|305->277|305->277|307->279|307->279|309->281|313->285|313->285|314->286|314->286|314->286|315->287|321->293|321->293|321->293|321->293|324->296|332->304|332->304|332->304|332->304|332->304|333->305|333->305|333->305|334->306|341->313|341->313|341->313|341->313|342->314|344->316|344->316|346->318|346->318|350->322|352->324|352->324|354->326|360->332|360->332|360->332|360->332|360->332|363->335|371->343|371->343|372->344|372->344|372->344|374->346|374->346|374->346|375->347|382->354|382->354|382->354|382->354|383->355|385->357|385->357|387->359|387->359|389->361|391->363|391->363|392->364|398->370|398->370|399->371|399->371|399->371|400->372|402->374|402->374|404->376|406->378|406->378|408->380|414->386|414->386|414->386|414->386|415->387|417->389|417->389|420->392|424->396|424->396|426->398|426->398|426->398|426->398|427->399|433->405|433->405|435->407|435->407|435->407|437->409|437->409|437->409|437->409|438->410|444->416|444->416|445->417|445->417|445->417|446->418|452->424|452->424|452->424|452->424|453->425|455->427|455->427|458->430|460->432|460->432|462->434|468->440|468->440|468->440|468->440|471->443|479->451|479->451|479->451|479->451|480->452|480->452|480->452|481->453|488->460|488->460|488->460|488->460|489->461|491->463|491->463|492->464|492->464|494->466|496->468|496->468|498->470|504->476|504->476|504->476|504->476|504->476|507->479|515->487|515->487|515->487|515->487|516->488|516->488|516->488|517->489|524->496|524->496|524->496|524->496|525->497|527->499|527->499|528->500|528->500|530->502|536->508|536->508|538->510|544->516|544->516|544->516|544->516|545->517|547->519|547->519|549->521|549->521|549->521|551->523|551->523|551->523|551->523|552->524|558->530|558->530|560->532|560->532|560->532|561->533|562->534|562->534|563->535|564->536|564->536|564->536|564->536|566->538|569->541|569->541|571->543|573->545|573->545|575->547
                  -- GENERATED --
              */
          