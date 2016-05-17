
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
object mortgagePage11Properties extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,List[Property],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(howManyProperty: String,applicantName:String,coApplicantName:String,propertyList:List[Property] ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.100*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="shortcut icon" href=""""),_display_(/*9.34*/routes/*9.40*/.Assets.at("_resources/favicon.ico")),format.raw/*9.76*/("""">
  <script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js
"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<!--  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

 -->
   <script src=""""),_display_(/*20.18*/routes/*20.24*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*20.68*/(""""></script>
    <script src=""""),_display_(/*21.19*/routes/*21.25*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*21.71*/(""""></script>
    <style type="text/css">
	.verticalLine """),format.raw/*23.16*/("""{"""),format.raw/*23.17*/("""
	"""),format.raw/*24.2*/("""height: 300px;
    border-left: medium groove #336699;
	"""),format.raw/*26.2*/("""}"""),format.raw/*26.3*/("""
	"""),format.raw/*27.2*/(""".inline"""),format.raw/*27.9*/("""{"""),format.raw/*27.10*/("""
	"""),format.raw/*28.2*/("""display: inline;
	"""),format.raw/*29.2*/("""}"""),format.raw/*29.3*/("""
	
	"""),format.raw/*31.2*/("""/*for bigger checkbox*/
*,*:after,*:before """),format.raw/*32.20*/("""{"""),format.raw/*32.21*/("""
  """),format.raw/*33.3*/("""-webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
  padding: 0;
  margin: 0;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""

"""),format.raw/*40.1*/(""".switch """),format.raw/*40.9*/("""{"""),format.raw/*40.10*/("""
  """),format.raw/*41.3*/("""position: relative;
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""


"""),format.raw/*45.1*/(""".switch input """),format.raw/*45.15*/("""{"""),format.raw/*45.16*/("""
  """),format.raw/*46.3*/("""top: 0; 
  right: 0; 
  bottom: 0; 
  left: 0;
  opacity: 0;
  z-index: 100;
  position: absolute;
  width: 100%;
  height: 100%;
  cursor: pointer;
"""),format.raw/*56.1*/("""}"""),format.raw/*56.2*/("""

"""),format.raw/*58.1*/("""/* DEMO 3 */

.switch.demo3 """),format.raw/*60.15*/("""{"""),format.raw/*60.16*/("""
  """),format.raw/*61.3*/("""width: 50px;
  height: 30px;
"""),format.raw/*63.1*/("""}"""),format.raw/*63.2*/("""

 """),format.raw/*65.2*/(""".switch.demo3 label """),format.raw/*65.22*/("""{"""),format.raw/*65.23*/("""
  """),format.raw/*66.3*/("""display: block;
  width: 90%;
  height: 100%;
  background: #ffffff;
  /* for button like look of checkbox */
  /* background: black; */ /* For browsers that do not support gradients */    
  /* background: -webkit-radial-gradient(red, yellow, green); */ /* Safari 5.1 to 6.0 */
  /* background: -o-radial-gradient(red, yellow, green); */ /* For Opera 11.6 to 12.0 */
  /* background: -moz-radial-gradient(red, yellow, green); */ /* For Firefox 3.6 to 15 */
  /* background: radial-gradient(#666699, #f2f2f2, #669999); */ /* Standard syntax (must be last) */
 /*  box-shadow:
      inset 0 3px 8px 1px rgba(0,0,0,0.2),
      0 1px 0 rgba(255,255,255,0.5); */
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/(""" 

"""),format.raw/*81.1*/(""".switch.demo3 label:after """),format.raw/*81.27*/("""{"""),format.raw/*81.28*/("""
  """),format.raw/*82.3*/("""content: "";
  position: absolute;
  top: -8px; right: -8px; bottom: 0px; left: -8px;
"""),format.raw/*85.1*/("""}"""),format.raw/*85.2*/("""

"""),format.raw/*87.1*/(""".switch.demo3 label:before """),format.raw/*87.28*/("""{"""),format.raw/*87.29*/("""
  """),format.raw/*88.3*/("""content: "";
  position: absolute;
  z-index: -1;
  top: -18px; right: -18px; bottom: -18px; left: -18px;
  s
"""),format.raw/*93.1*/("""}"""),format.raw/*93.2*/("""


"""),format.raw/*96.1*/(""".switch.demo3 input:checked ~ label i:before """),format.raw/*96.46*/("""{"""),format.raw/*96.47*/("""
  """),format.raw/*97.3*/("""content: url(""""),_display_(/*97.18*/routes/*97.24*/.Assets.at("_resources/tick1.png")),format.raw/*97.58*/("""");   
   
  /* content: url(""""),_display_(/*99.21*/routes/*99.27*/.Assets.at("_resources/tick2.gif")),format.raw/*99.61*/(""""); */
  color:#ffffff;
"""),format.raw/*101.1*/("""}"""),format.raw/*101.2*/("""


"""),format.raw/*104.1*/("""</style>
<script language="JavaScript">

        window.onbeforeunload = function () """),format.raw/*107.45*/("""{"""),format.raw/*107.46*/("""
            """),format.raw/*108.13*/("""return "Are you sure?";
        """),format.raw/*109.9*/("""}"""),format.raw/*109.10*/(""";

        $(document).ready(function () """),format.raw/*111.39*/("""{"""),format.raw/*111.40*/("""
            """),format.raw/*112.13*/("""$('form').submit(function () """),format.raw/*112.42*/("""{"""),format.raw/*112.43*/("""
                """),format.raw/*113.17*/("""window.onbeforeunload = null;
            """),format.raw/*114.13*/("""}"""),format.raw/*114.14*/(""");
        """),format.raw/*115.9*/("""}"""),format.raw/*115.10*/(""");
    </script>
<script type="text/javascript">
    window.onload = function() """),format.raw/*118.32*/("""{"""),format.raw/*118.33*/("""
    	"""),format.raw/*119.6*/("""SelectElement();
    """),format.raw/*120.5*/("""}"""),format.raw/*120.6*/(""";
    function SelectElement() """),format.raw/*121.30*/("""{"""),format.raw/*121.31*/("""   
        """),format.raw/*122.9*/("""var ownership123 = document.forms["myForm"]["ownership12"].value;  
        document.forms["myForm"]["ownership1"].value=ownership123;
    """),format.raw/*124.5*/("""}"""),format.raw/*124.6*/("""
    """),format.raw/*125.5*/("""</script>

<script type="text/javascript">
	function validateForm()"""),format.raw/*128.25*/("""{"""),format.raw/*128.26*/("""
		"""),format.raw/*129.3*/("""var howManyProperties111 = document.forms["myForm"]["howManyProperties"].value;
		if(howManyProperties111 == "dummy" || !howManyProperties111)"""),format.raw/*130.63*/("""{"""),format.raw/*130.64*/("""
    	    """),format.raw/*131.10*/("""document.getElementById('role1').innerHTML="<span style='color:red'>*This field is Required.</span>";
        	return false;
		"""),format.raw/*133.3*/("""}"""),format.raw/*133.4*/("""else"""),format.raw/*133.8*/("""{"""),format.raw/*133.9*/("""
		"""),format.raw/*134.3*/("""document.getElementById("role1").innerHTML="";
		"""),format.raw/*135.3*/("""}"""),format.raw/*135.4*/("""
		
		"""),format.raw/*137.3*/("""if(howManyProperties111 == "one")"""),format.raw/*137.36*/("""{"""),format.raw/*137.37*/("""
					
			"""),format.raw/*139.4*/("""var address111 = document.forms["myForm"]["address0"].value;
			if(!address111)"""),format.raw/*140.19*/("""{"""),format.raw/*140.20*/("""
			        """),format.raw/*141.12*/("""document.getElementById('input_200211').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*143.4*/("""}"""),format.raw/*143.5*/("""else"""),format.raw/*143.9*/("""{"""),format.raw/*143.10*/("""
	    	"""),format.raw/*144.7*/("""document.getElementById("input_200211").innerHTML="";
	    	"""),format.raw/*145.7*/("""}"""),format.raw/*145.8*/("""

			"""),format.raw/*147.4*/("""var appxValue111 = document.forms["myForm"]["appxValue1"].value;
			if(!appxValue111)"""),format.raw/*148.21*/("""{"""),format.raw/*148.22*/("""
			        """),format.raw/*149.12*/("""document.getElementById('input_200212').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*151.4*/("""}"""),format.raw/*151.5*/("""else"""),format.raw/*151.9*/("""{"""),format.raw/*151.10*/("""
	    	"""),format.raw/*152.7*/("""document.getElementById("input_200212").innerHTML="";
	    	"""),format.raw/*153.7*/("""}"""),format.raw/*153.8*/("""
			"""),format.raw/*154.4*/("""var  mortgage1 =document.forms["myForm"]["mortgage1"].value;
			if(!mortgage1)"""),format.raw/*155.18*/("""{"""),format.raw/*155.19*/("""
		        """),format.raw/*156.11*/("""document.getElementById('input_200_212').innerHTML="<span style='color:red'>*This field is Required.</span>";
		        return false;
		"""),format.raw/*158.3*/("""}"""),format.raw/*158.4*/("""else"""),format.raw/*158.8*/("""{"""),format.raw/*158.9*/("""
    	"""),format.raw/*159.6*/("""document.getElementById("input_200_212").innerHTML="";
    	"""),format.raw/*160.6*/("""}"""),format.raw/*160.7*/("""
			"""),format.raw/*161.4*/("""var rentMo1 =document.forms["myForm"]["rentMo1"].value;
			if(!rentMo1)"""),format.raw/*162.16*/("""{"""),format.raw/*162.17*/("""
		        """),format.raw/*163.11*/("""document.getElementById('input_200_213').innerHTML="<span style='color:red'>*This field is Required.</span>";
		        return false;
		"""),format.raw/*165.3*/("""}"""),format.raw/*165.4*/("""else"""),format.raw/*165.8*/("""{"""),format.raw/*165.9*/("""
    	"""),format.raw/*166.6*/("""document.getElementById("input_200_213").innerHTML="";
    	"""),format.raw/*167.6*/("""}"""),format.raw/*167.7*/("""
	"""),format.raw/*168.2*/("""var condoFees1 =document.forms["myForm"]["condoFees1"].value;
	if(!condoFees1)"""),format.raw/*169.17*/("""{"""),format.raw/*169.18*/("""
        """),format.raw/*170.9*/("""document.getElementById('input_200_214').innerHTML="<span style='color:red'>*This field is Required.</span>";
        return false;
"""),format.raw/*172.1*/("""}"""),format.raw/*172.2*/("""else"""),format.raw/*172.6*/("""{"""),format.raw/*172.7*/("""
"""),format.raw/*173.1*/("""document.getElementById("input_200_214").innerHTML="";
"""),format.raw/*174.1*/("""}"""),format.raw/*174.2*/("""	
			"""),format.raw/*175.4*/("""var ownership111 = document.forms["myForm"]["ownership1"].value;
			if(!ownership111)"""),format.raw/*176.21*/("""{"""),format.raw/*176.22*/("""
			        """),format.raw/*177.12*/("""document.getElementById('input_200213').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*179.4*/("""}"""),format.raw/*179.5*/("""else"""),format.raw/*179.9*/("""{"""),format.raw/*179.10*/("""
	    	"""),format.raw/*180.7*/("""document.getElementById("input_200213").innerHTML="";
	    	"""),format.raw/*181.7*/("""}"""),format.raw/*181.8*/("""
		
		"""),format.raw/*183.3*/("""}"""),format.raw/*183.4*/("""
		
		"""),format.raw/*185.3*/("""if(howManyProperties111 == "two")"""),format.raw/*185.36*/("""{"""),format.raw/*185.37*/("""
			
			"""),format.raw/*187.4*/("""var currentAddress211 = document.forms["myForm"]["currentAddress21"].value;
			if(!currentAddress211)"""),format.raw/*188.26*/("""{"""),format.raw/*188.27*/("""
			        """),format.raw/*189.12*/("""document.getElementById('input_2001').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*191.4*/("""}"""),format.raw/*191.5*/("""else"""),format.raw/*191.9*/("""{"""),format.raw/*191.10*/("""
	    	"""),format.raw/*192.7*/("""document.getElementById("input_2001").innerHTML="";
	    	"""),format.raw/*193.7*/("""}"""),format.raw/*193.8*/("""

			"""),format.raw/*195.4*/("""var appxValue211 = document.forms["myForm"]["appxValue21"].value;
			if(!appxValue211)"""),format.raw/*196.21*/("""{"""),format.raw/*196.22*/("""
			        """),format.raw/*197.12*/("""document.getElementById('input_200111').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*199.4*/("""}"""),format.raw/*199.5*/("""else"""),format.raw/*199.9*/("""{"""),format.raw/*199.10*/("""
	    	"""),format.raw/*200.7*/("""document.getElementById("input_200111").innerHTML="";
	    	"""),format.raw/*201.7*/("""}"""),format.raw/*201.8*/("""
			"""),format.raw/*202.4*/("""//changes here 
			var mortgage21 = document.forms["myForm"]["mortgage21"].value;
			if(!mortgage21)"""),format.raw/*204.19*/("""{"""),format.raw/*204.20*/("""
			        """),format.raw/*205.12*/("""document.getElementById('input_101').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*207.4*/("""}"""),format.raw/*207.5*/("""else"""),format.raw/*207.9*/("""{"""),format.raw/*207.10*/("""
	    	"""),format.raw/*208.7*/("""document.getElementById("input_101").innerHTML="";
	    	"""),format.raw/*209.7*/("""}"""),format.raw/*209.8*/("""
			"""),format.raw/*210.4*/("""var rentMo21 = document.forms["myForm"]["rentMo21"].value;
			if(!rentMo21)"""),format.raw/*211.17*/("""{"""),format.raw/*211.18*/("""
			        """),format.raw/*212.12*/("""document.getElementById('input_102').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*214.4*/("""}"""),format.raw/*214.5*/("""else"""),format.raw/*214.9*/("""{"""),format.raw/*214.10*/("""
	    	"""),format.raw/*215.7*/("""document.getElementById("input_102").innerHTML="";
	    	"""),format.raw/*216.7*/("""}"""),format.raw/*216.8*/("""
			
			"""),format.raw/*218.4*/("""var condoFees21 = document.forms["myForm"]["condoFees21"].value;
			if(!condoFees21)"""),format.raw/*219.20*/("""{"""),format.raw/*219.21*/("""
		        """),format.raw/*220.11*/("""document.getElementById('input_103').innerHTML="<span style='color:red'>*This field is Required.</span>";
		        return false;
		"""),format.raw/*222.3*/("""}"""),format.raw/*222.4*/("""else"""),format.raw/*222.8*/("""{"""),format.raw/*222.9*/("""
    	"""),format.raw/*223.6*/("""document.getElementById("input_103").innerHTML="";
    	"""),format.raw/*224.6*/("""}"""),format.raw/*224.7*/("""
			
			
			"""),format.raw/*227.4*/("""//end here
			var ownership211 = document.forms["myForm"]["ownership21"].value;
			if(!ownership211)"""),format.raw/*229.21*/("""{"""),format.raw/*229.22*/("""
			        """),format.raw/*230.12*/("""document.getElementById('input_701').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*232.4*/("""}"""),format.raw/*232.5*/("""else"""),format.raw/*232.9*/("""{"""),format.raw/*232.10*/("""
	    	"""),format.raw/*233.7*/("""document.getElementById("input_701").innerHTML="";
	    	"""),format.raw/*234.7*/("""}"""),format.raw/*234.8*/("""
			
			"""),format.raw/*236.4*/("""var currentAddress221 = document.forms["myForm"]["currentAddress22"].value;
			if(!currentAddress221)"""),format.raw/*237.26*/("""{"""),format.raw/*237.27*/("""
			        """),format.raw/*238.12*/("""document.getElementById('input_2002').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*240.4*/("""}"""),format.raw/*240.5*/("""else"""),format.raw/*240.9*/("""{"""),format.raw/*240.10*/("""
	    	"""),format.raw/*241.7*/("""document.getElementById("input_2002").innerHTML="";
	    	"""),format.raw/*242.7*/("""}"""),format.raw/*242.8*/("""

			"""),format.raw/*244.4*/("""var appxValue221 = document.forms["myForm"]["appxValue22"].value;
			if(!appxValue221)"""),format.raw/*245.21*/("""{"""),format.raw/*245.22*/("""
			        """),format.raw/*246.12*/("""document.getElementById('input_20022').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*248.4*/("""}"""),format.raw/*248.5*/("""else"""),format.raw/*248.9*/("""{"""),format.raw/*248.10*/("""
	    	"""),format.raw/*249.7*/("""document.getElementById("input_20022").innerHTML="";
	    	"""),format.raw/*250.7*/("""}"""),format.raw/*250.8*/("""
			"""),format.raw/*251.4*/("""var mortgage22 = document.forms["myForm"]["mortgage22"].value;
			if(!mortgage22)"""),format.raw/*252.19*/("""{"""),format.raw/*252.20*/("""
			        """),format.raw/*253.12*/("""document.getElementById('input_104').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*255.4*/("""}"""),format.raw/*255.5*/("""else"""),format.raw/*255.9*/("""{"""),format.raw/*255.10*/("""
	    	"""),format.raw/*256.7*/("""document.getElementById("input_104").innerHTML="";
	    	"""),format.raw/*257.7*/("""}"""),format.raw/*257.8*/("""
			"""),format.raw/*258.4*/("""var rentMo22 = document.forms["myForm"]["rentMo22"].value;
			if(!rentMo22)"""),format.raw/*259.17*/("""{"""),format.raw/*259.18*/("""
			        """),format.raw/*260.12*/("""document.getElementById('input_105').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*262.4*/("""}"""),format.raw/*262.5*/("""else"""),format.raw/*262.9*/("""{"""),format.raw/*262.10*/("""
	    	"""),format.raw/*263.7*/("""document.getElementById("input_105").innerHTML="";
	    	"""),format.raw/*264.7*/("""}"""),format.raw/*264.8*/("""
			
			"""),format.raw/*266.4*/("""var condoFees22 = document.forms["myForm"]["condoFees22"].value;
			if(!condoFees22)"""),format.raw/*267.20*/("""{"""),format.raw/*267.21*/("""
			        """),format.raw/*268.12*/("""document.getElementById('input_106').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*270.4*/("""}"""),format.raw/*270.5*/("""else"""),format.raw/*270.9*/("""{"""),format.raw/*270.10*/("""
	    	"""),format.raw/*271.7*/("""document.getElementById("input_106").innerHTML="";
	    	"""),format.raw/*272.7*/("""}"""),format.raw/*272.8*/("""
			"""),format.raw/*273.4*/("""var ownership221 = document.forms["myForm"]["ownership22"].value;
			if(!ownership221)"""),format.raw/*274.21*/("""{"""),format.raw/*274.22*/("""
			        """),format.raw/*275.12*/("""document.getElementById('input_20012').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*277.4*/("""}"""),format.raw/*277.5*/("""else"""),format.raw/*277.9*/("""{"""),format.raw/*277.10*/("""
	    	"""),format.raw/*278.7*/("""document.getElementById("input_20012").innerHTML="";
	    	"""),format.raw/*279.7*/("""}"""),format.raw/*279.8*/("""
			
		"""),format.raw/*281.3*/("""}"""),format.raw/*281.4*/("""
		
		"""),format.raw/*283.3*/("""if(howManyProperties111 == "three")"""),format.raw/*283.38*/("""{"""),format.raw/*283.39*/("""
			"""),format.raw/*284.4*/("""var currentAddress311 = document.forms["myForm"]["currentAddress31"].value;
			if(!currentAddress311)"""),format.raw/*285.26*/("""{"""),format.raw/*285.27*/("""
			        """),format.raw/*286.12*/("""document.getElementById('input_20011').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*288.4*/("""}"""),format.raw/*288.5*/("""else"""),format.raw/*288.9*/("""{"""),format.raw/*288.10*/("""
	    	"""),format.raw/*289.7*/("""document.getElementById("input_20011").innerHTML="";
	    	"""),format.raw/*290.7*/("""}"""),format.raw/*290.8*/("""
			 
			"""),format.raw/*292.4*/("""var appxValue311 = document.forms["myForm"]["appxValue31"].value;
			if(!appxValue311)"""),format.raw/*293.21*/("""{"""),format.raw/*293.22*/("""
			        """),format.raw/*294.12*/("""document.getElementById('input_200131').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*296.4*/("""}"""),format.raw/*296.5*/("""else"""),format.raw/*296.9*/("""{"""),format.raw/*296.10*/("""
	    	"""),format.raw/*297.7*/("""document.getElementById("input_200131").innerHTML="";
	    	"""),format.raw/*298.7*/("""}"""),format.raw/*298.8*/("""
			 """),format.raw/*299.5*/("""//changes here 
			
			 var mortgage31 = document.forms["myForm"]["mortgage31"].value;
				if(!mortgage31)"""),format.raw/*302.20*/("""{"""),format.raw/*302.21*/("""
				        """),format.raw/*303.13*/("""document.getElementById('mort_31').innerHTML="<span style='color:red'>*This field is Required.</span>";
				        return false;
				"""),format.raw/*305.5*/("""}"""),format.raw/*305.6*/("""else"""),format.raw/*305.10*/("""{"""),format.raw/*305.11*/("""
		    	"""),format.raw/*306.8*/("""document.getElementById("mort_31").innerHTML="";
		    	"""),format.raw/*307.8*/("""}"""),format.raw/*307.9*/("""
				
				 """),format.raw/*309.6*/("""var rentMo31 = document.forms["myForm"]["rentMo31"].value;
					if(!rentMo31)"""),format.raw/*310.19*/("""{"""),format.raw/*310.20*/("""
					        """),format.raw/*311.14*/("""document.getElementById('rentMo_31').innerHTML="<span style='color:red'>*This field is Required.</span>";
					        return false;
					"""),format.raw/*313.6*/("""}"""),format.raw/*313.7*/("""else"""),format.raw/*313.11*/("""{"""),format.raw/*313.12*/("""
			    	"""),format.raw/*314.9*/("""document.getElementById("rentMo_31").innerHTML="";
			    	"""),format.raw/*315.9*/("""}"""),format.raw/*315.10*/("""
					
					 """),format.raw/*317.7*/("""var condoFees31 = document.forms["myForm"]["condoFees31"].value;
						if(!condoFees31)"""),format.raw/*318.23*/("""{"""),format.raw/*318.24*/("""
						        """),format.raw/*319.15*/("""document.getElementById('condoFees_31').innerHTML="<span style='color:red'>*This field is Required.</span>";
						        return false;
						"""),format.raw/*321.7*/("""}"""),format.raw/*321.8*/("""else"""),format.raw/*321.12*/("""{"""),format.raw/*321.13*/("""
				    	"""),format.raw/*322.10*/("""document.getElementById("condoFees_31").innerHTML="";
				    	"""),format.raw/*323.10*/("""}"""),format.raw/*323.11*/("""
				
						
								
			 """),format.raw/*327.5*/("""//end here
			var ownership311 = document.forms["myForm"]["ownership31"].value;
			if(!ownership311)"""),format.raw/*329.21*/("""{"""),format.raw/*329.22*/("""
			        """),format.raw/*330.12*/("""document.getElementById('input_200132').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*332.4*/("""}"""),format.raw/*332.5*/("""else"""),format.raw/*332.9*/("""{"""),format.raw/*332.10*/("""
	    	"""),format.raw/*333.7*/("""document.getElementById("input_200132").innerHTML="";
	    	"""),format.raw/*334.7*/("""}"""),format.raw/*334.8*/("""
			
			"""),format.raw/*336.4*/("""var currentAddress321 = document.forms["myForm"]["currentAddress32"].value;
			if(!currentAddress321)"""),format.raw/*337.26*/("""{"""),format.raw/*337.27*/("""
			        """),format.raw/*338.12*/("""document.getElementById('input_203211').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*340.4*/("""}"""),format.raw/*340.5*/("""else"""),format.raw/*340.9*/("""{"""),format.raw/*340.10*/("""
	    	"""),format.raw/*341.7*/("""document.getElementById("input_203211").innerHTML="";
	    	"""),format.raw/*342.7*/("""}"""),format.raw/*342.8*/("""
			 
			"""),format.raw/*344.4*/("""var appxValue321 = document.forms["myForm"]["appxValue32"].value;
			if(!appxValue321)"""),format.raw/*345.21*/("""{"""),format.raw/*345.22*/("""
			        """),format.raw/*346.12*/("""document.getElementById('input_203212').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*348.4*/("""}"""),format.raw/*348.5*/("""else"""),format.raw/*348.9*/("""{"""),format.raw/*348.10*/("""
	    	"""),format.raw/*349.7*/("""document.getElementById("input_203212").innerHTML="";
	    	"""),format.raw/*350.7*/("""}"""),format.raw/*350.8*/("""
			 	
			 """),format.raw/*352.5*/("""var mortgage32 = document.forms["myForm"]["mortgage32"].value;
				if(!mortgage32)"""),format.raw/*353.20*/("""{"""),format.raw/*353.21*/("""
				        """),format.raw/*354.13*/("""document.getElementById('mortgage_32').innerHTML="<span style='color:red'>*This field is Required.</span>";
				        return false;
				"""),format.raw/*356.5*/("""}"""),format.raw/*356.6*/("""else"""),format.raw/*356.10*/("""{"""),format.raw/*356.11*/("""
		    	"""),format.raw/*357.8*/("""document.getElementById("mortgage_32").innerHTML="";
		    	"""),format.raw/*358.8*/("""}"""),format.raw/*358.9*/("""
				
				 """),format.raw/*360.6*/("""var rentMo32 = document.forms["myForm"]["rentMo32"].value;
					if(!rentMo32)"""),format.raw/*361.19*/("""{"""),format.raw/*361.20*/("""
					        """),format.raw/*362.14*/("""document.getElementById('rentMo_32').innerHTML="<span style='color:red'>*This field is Required.</span>";
					        return false;
					"""),format.raw/*364.6*/("""}"""),format.raw/*364.7*/("""else"""),format.raw/*364.11*/("""{"""),format.raw/*364.12*/("""
			    	"""),format.raw/*365.9*/("""document.getElementById("rentMo_32").innerHTML="";
			    	"""),format.raw/*366.9*/("""}"""),format.raw/*366.10*/("""
				
					 """),format.raw/*368.7*/("""var condoFees32 = document.forms["myForm"]["condoFees32"].value;
						if(!condoFees32)"""),format.raw/*369.23*/("""{"""),format.raw/*369.24*/("""
						        """),format.raw/*370.15*/("""document.getElementById('condoFees_32').innerHTML="<span style='color:red'>*This field is Required.</span>";
						        return false;
						"""),format.raw/*372.7*/("""}"""),format.raw/*372.8*/("""else"""),format.raw/*372.12*/("""{"""),format.raw/*372.13*/("""
				    	"""),format.raw/*373.10*/("""document.getElementById("condoFees_32").innerHTML="";
				    	"""),format.raw/*374.10*/("""}"""),format.raw/*374.11*/("""	
			"""),format.raw/*375.4*/("""var ownership321 = document.forms["myForm"]["ownership32"].value;
			if(!ownership321)"""),format.raw/*376.21*/("""{"""),format.raw/*376.22*/("""
			        """),format.raw/*377.12*/("""document.getElementById('input_203214').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*379.4*/("""}"""),format.raw/*379.5*/("""else"""),format.raw/*379.9*/("""{"""),format.raw/*379.10*/("""
	    	"""),format.raw/*380.7*/("""document.getElementById("input_203214").innerHTML="";
	    	"""),format.raw/*381.7*/("""}"""),format.raw/*381.8*/("""
			
			"""),format.raw/*383.4*/("""var currentAddress331 = document.forms["myForm"]["currentAddress33"].value;
			if(!currentAddress331)"""),format.raw/*384.26*/("""{"""),format.raw/*384.27*/("""
			        """),format.raw/*385.12*/("""document.getElementById('input_2043').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*387.4*/("""}"""),format.raw/*387.5*/("""else"""),format.raw/*387.9*/("""{"""),format.raw/*387.10*/("""
	    	"""),format.raw/*388.7*/("""document.getElementById("input_2043").innerHTML="";
	    	"""),format.raw/*389.7*/("""}"""),format.raw/*389.8*/("""
			 
			"""),format.raw/*391.4*/("""var appxValue331 = document.forms["myForm"]["appxValue33"].value;
			if(!appxValue331)"""),format.raw/*392.21*/("""{"""),format.raw/*392.22*/("""
			        """),format.raw/*393.12*/("""document.getElementById('input_2044').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*395.4*/("""}"""),format.raw/*395.5*/("""else"""),format.raw/*395.9*/("""{"""),format.raw/*395.10*/("""
	    	"""),format.raw/*396.7*/("""document.getElementById("input_2044").innerHTML="";
	    	"""),format.raw/*397.7*/("""}"""),format.raw/*397.8*/("""
			"""),format.raw/*398.4*/("""var mortgage33 = document.forms["myForm"]["mortgage33"].value;
			if(!mortgage33)"""),format.raw/*399.19*/("""{"""),format.raw/*399.20*/("""
			        """),format.raw/*400.12*/("""document.getElementById('mortgage_33').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*402.4*/("""}"""),format.raw/*402.5*/("""else"""),format.raw/*402.9*/("""{"""),format.raw/*402.10*/("""
	    	"""),format.raw/*403.7*/("""document.getElementById("mortgage_33").innerHTML="";
	    	"""),format.raw/*404.7*/("""}"""),format.raw/*404.8*/("""
			"""),format.raw/*405.4*/("""var rentMo33 = document.forms["myForm"]["rentMo33"].value;
			if(!rentMo33)"""),format.raw/*406.17*/("""{"""),format.raw/*406.18*/("""
			        """),format.raw/*407.12*/("""document.getElementById('rentMo_33').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*409.4*/("""}"""),format.raw/*409.5*/("""else"""),format.raw/*409.9*/("""{"""),format.raw/*409.10*/("""
	    	"""),format.raw/*410.7*/("""document.getElementById("rentMo_33").innerHTML="";
	    	"""),format.raw/*411.7*/("""}"""),format.raw/*411.8*/("""
			"""),format.raw/*412.4*/("""var condoFees33 = document.forms["myForm"]["condoFees33"].value;
			if(!condoFees33)"""),format.raw/*413.20*/("""{"""),format.raw/*413.21*/("""
			        """),format.raw/*414.12*/("""document.getElementById('condoFees_33').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*416.4*/("""}"""),format.raw/*416.5*/("""else"""),format.raw/*416.9*/("""{"""),format.raw/*416.10*/("""
	    	"""),format.raw/*417.7*/("""document.getElementById("condoFees_33").innerHTML="";
	    	"""),format.raw/*418.7*/("""}"""),format.raw/*418.8*/("""
						
			"""),format.raw/*420.4*/("""var ownership331 = document.forms["myForm"]["ownership33"].value;
			if(!ownership331)"""),format.raw/*421.21*/("""{"""),format.raw/*421.22*/("""
			        """),format.raw/*422.12*/("""document.getElementById('input_2045').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*424.4*/("""}"""),format.raw/*424.5*/("""else"""),format.raw/*424.9*/("""{"""),format.raw/*424.10*/("""
	    	"""),format.raw/*425.7*/("""document.getElementById("input_2045").innerHTML="";
	    	"""),format.raw/*426.7*/("""}"""),format.raw/*426.8*/("""
			
		"""),format.raw/*428.3*/("""}"""),format.raw/*428.4*/("""
		
		"""),format.raw/*430.3*/("""if(howManyProperties111 == "four")"""),format.raw/*430.37*/("""{"""),format.raw/*430.38*/("""
			
			"""),format.raw/*432.4*/("""var currentAddress412 = document.forms["myForm"]["currentAddress41"].value;
			if(!currentAddress412)"""),format.raw/*433.26*/("""{"""),format.raw/*433.27*/("""
			        """),format.raw/*434.12*/("""document.getElementById('input_2032e11ww1s1').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*436.4*/("""}"""),format.raw/*436.5*/("""else"""),format.raw/*436.9*/("""{"""),format.raw/*436.10*/("""
	    	"""),format.raw/*437.7*/("""document.getElementById("input_2032e11ww1s1").innerHTML="";
	    	"""),format.raw/*438.7*/("""}"""),format.raw/*438.8*/("""

			"""),format.raw/*440.4*/("""var appxValue412 = document.forms["myForm"]["appxValue41"].value;
			if(!appxValue412)"""),format.raw/*441.21*/("""{"""),format.raw/*441.22*/("""
			        """),format.raw/*442.12*/("""document.getElementById('input_2032').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*444.4*/("""}"""),format.raw/*444.5*/("""else"""),format.raw/*444.9*/("""{"""),format.raw/*444.10*/("""
	    	"""),format.raw/*445.7*/("""document.getElementById("input_2032").innerHTML="";
	    	"""),format.raw/*446.7*/("""}"""),format.raw/*446.8*/("""
				"""),format.raw/*447.5*/("""//changes here 1
				var mortgage41 = document.forms["myForm"]["mortgage41"].value;
			if(!mortgage41)"""),format.raw/*449.19*/("""{"""),format.raw/*449.20*/("""
			        """),format.raw/*450.12*/("""document.getElementById('mortgage_41').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*452.4*/("""}"""),format.raw/*452.5*/("""else"""),format.raw/*452.9*/("""{"""),format.raw/*452.10*/("""
	    	"""),format.raw/*453.7*/("""document.getElementById("mortgage_41").innerHTML="";
	    	"""),format.raw/*454.7*/("""}"""),format.raw/*454.8*/("""
			"""),format.raw/*455.4*/("""var rentMo41 = document.forms["myForm"]["rentMo41"].value;
			if(!rentMo41)"""),format.raw/*456.17*/("""{"""),format.raw/*456.18*/("""
			        """),format.raw/*457.12*/("""document.getElementById('rentMo_41').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*459.4*/("""}"""),format.raw/*459.5*/("""else"""),format.raw/*459.9*/("""{"""),format.raw/*459.10*/("""
	    	"""),format.raw/*460.7*/("""document.getElementById("rentMo_41").innerHTML="";
	    	"""),format.raw/*461.7*/("""}"""),format.raw/*461.8*/("""
			"""),format.raw/*462.4*/("""var condoFees41 = document.forms["myForm"]["condoFees41"].value;
			if(!condoFees41)"""),format.raw/*463.20*/("""{"""),format.raw/*463.21*/("""
			        """),format.raw/*464.12*/("""document.getElementById('condoFees_41').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*466.4*/("""}"""),format.raw/*466.5*/("""else"""),format.raw/*466.9*/("""{"""),format.raw/*466.10*/("""
	    	"""),format.raw/*467.7*/("""document.getElementById("condoFees_41").innerHTML="";
	    	"""),format.raw/*468.7*/("""}"""),format.raw/*468.8*/("""
				
				
				
				"""),format.raw/*472.5*/("""//end here
			var ownership411 = document.forms["myForm"]["ownership41"].value;
			
			if(!ownership411)"""),format.raw/*475.21*/("""{"""),format.raw/*475.22*/("""
			        """),format.raw/*476.12*/("""document.getElementById('input_2033').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*478.4*/("""}"""),format.raw/*478.5*/("""else"""),format.raw/*478.9*/("""{"""),format.raw/*478.10*/("""
	    	"""),format.raw/*479.7*/("""document.getElementById("input_2033").innerHTML="";
	    	"""),format.raw/*480.7*/("""}"""),format.raw/*480.8*/("""
			
			"""),format.raw/*482.4*/("""var currentAddress422 = document.forms["myForm"]["currentAddress42"].value;
			if(!currentAddress422)"""),format.raw/*483.26*/("""{"""),format.raw/*483.27*/("""
			        """),format.raw/*484.12*/("""document.getElementById('input_2212').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*486.4*/("""}"""),format.raw/*486.5*/("""else"""),format.raw/*486.9*/("""{"""),format.raw/*486.10*/("""
	    	"""),format.raw/*487.7*/("""document.getElementById("input_2212").innerHTML="";
	    	"""),format.raw/*488.7*/("""}"""),format.raw/*488.8*/("""

			"""),format.raw/*490.4*/("""var appxValue422 = document.forms["myForm"]["appxValue42"].value;
			if(!appxValue422)"""),format.raw/*491.21*/("""{"""),format.raw/*491.22*/("""
			        """),format.raw/*492.12*/("""document.getElementById('input_20322').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*494.4*/("""}"""),format.raw/*494.5*/("""else"""),format.raw/*494.9*/("""{"""),format.raw/*494.10*/("""
	    	"""),format.raw/*495.7*/("""document.getElementById("input_20322").innerHTML="";
	    	"""),format.raw/*496.7*/("""}"""),format.raw/*496.8*/("""
				"""),format.raw/*497.5*/("""// changes here 2
					var mortgage42 = document.forms["myForm"]["mortgage42"].value;
			if(!mortgage42)"""),format.raw/*499.19*/("""{"""),format.raw/*499.20*/("""
			        """),format.raw/*500.12*/("""document.getElementById('mortgage_42').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*502.4*/("""}"""),format.raw/*502.5*/("""else"""),format.raw/*502.9*/("""{"""),format.raw/*502.10*/("""
	    	"""),format.raw/*503.7*/("""document.getElementById("mortgage_42").innerHTML="";
	    	"""),format.raw/*504.7*/("""}"""),format.raw/*504.8*/("""
			
			"""),format.raw/*506.4*/("""var rentMo42 = document.forms["myForm"]["mortgage42"].value;
			if(!rentMo42)"""),format.raw/*507.17*/("""{"""),format.raw/*507.18*/("""
			        """),format.raw/*508.12*/("""document.getElementById('rentMo_42').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*510.4*/("""}"""),format.raw/*510.5*/("""else"""),format.raw/*510.9*/("""{"""),format.raw/*510.10*/("""
	    	"""),format.raw/*511.7*/("""document.getElementById("rentMo_42").innerHTML="";
	    	"""),format.raw/*512.7*/("""}"""),format.raw/*512.8*/("""
			"""),format.raw/*513.4*/("""var condoFees42 = document.forms["myForm"]["condoFees42"].value;
			if(!condoFees42)"""),format.raw/*514.20*/("""{"""),format.raw/*514.21*/("""
			        """),format.raw/*515.12*/("""document.getElementById('condoFees_42').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*517.4*/("""}"""),format.raw/*517.5*/("""else"""),format.raw/*517.9*/("""{"""),format.raw/*517.10*/("""
	    	"""),format.raw/*518.7*/("""document.getElementById("condoFees_42").innerHTML="";
	    	"""),format.raw/*519.7*/("""}"""),format.raw/*519.8*/("""
				
				
				
				"""),format.raw/*523.5*/("""// end here
			var ownership4221 = document.forms["myForm"]["ownership42"].value;
			if(!ownership4221)"""),format.raw/*525.22*/("""{"""),format.raw/*525.23*/("""
			        """),format.raw/*526.12*/("""document.getElementById('input_20323').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*528.4*/("""}"""),format.raw/*528.5*/("""else"""),format.raw/*528.9*/("""{"""),format.raw/*528.10*/("""
	    	"""),format.raw/*529.7*/("""document.getElementById("input_20323").innerHTML="";
	    	"""),format.raw/*530.7*/("""}"""),format.raw/*530.8*/("""
			
			"""),format.raw/*532.4*/("""var currentAddress431 = document.forms["myForm"]["currentAddress43"].value;
			if(!currentAddress431)"""),format.raw/*533.26*/("""{"""),format.raw/*533.27*/("""
			        """),format.raw/*534.12*/("""document.getElementById('input_20121').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*536.4*/("""}"""),format.raw/*536.5*/("""else"""),format.raw/*536.9*/("""{"""),format.raw/*536.10*/("""
	    	"""),format.raw/*537.7*/("""document.getElementById("input_20121").innerHTML="";
	    	"""),format.raw/*538.7*/("""}"""),format.raw/*538.8*/("""

			"""),format.raw/*540.4*/("""var appxValue432 = document.forms["myForm"]["appxValue43"].value;
			if(!appxValue432)"""),format.raw/*541.21*/("""{"""),format.raw/*541.22*/("""
			        """),format.raw/*542.12*/("""document.getElementById('input_201212').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*544.4*/("""}"""),format.raw/*544.5*/("""else"""),format.raw/*544.9*/("""{"""),format.raw/*544.10*/("""
	    	"""),format.raw/*545.7*/("""document.getElementById("input_201212").innerHTML="";
	    	"""),format.raw/*546.7*/("""}"""),format.raw/*546.8*/("""
			"""),format.raw/*547.4*/("""//chagnes here 3 
			var mortgage43 = document.forms["myForm"]["mortgage43"].value;
			if(!mortgage43)"""),format.raw/*549.19*/("""{"""),format.raw/*549.20*/("""
			        """),format.raw/*550.12*/("""document.getElementById('mortgage_43').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*552.4*/("""}"""),format.raw/*552.5*/("""else"""),format.raw/*552.9*/("""{"""),format.raw/*552.10*/("""
	    	"""),format.raw/*553.7*/("""document.getElementById("mortgage_43").innerHTML="";
	    	"""),format.raw/*554.7*/("""}"""),format.raw/*554.8*/("""
			"""),format.raw/*555.4*/("""var rentMo43 = document.forms["myForm"]["rentMo43"].value;
			if(!rentMo43)"""),format.raw/*556.17*/("""{"""),format.raw/*556.18*/("""
			        """),format.raw/*557.12*/("""document.getElementById('rentMo_43').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*559.4*/("""}"""),format.raw/*559.5*/("""else"""),format.raw/*559.9*/("""{"""),format.raw/*559.10*/("""
	    	"""),format.raw/*560.7*/("""document.getElementById("rentMo_43").innerHTML="";
	    	"""),format.raw/*561.7*/("""}"""),format.raw/*561.8*/("""
			
			"""),format.raw/*563.4*/("""var condoFees43 = document.forms["myForm"]["condoFees43"].value;
			if(!condoFees43)"""),format.raw/*564.20*/("""{"""),format.raw/*564.21*/("""
			        """),format.raw/*565.12*/("""document.getElementById('condoFees_43').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*567.4*/("""}"""),format.raw/*567.5*/("""else"""),format.raw/*567.9*/("""{"""),format.raw/*567.10*/("""
	    	"""),format.raw/*568.7*/("""document.getElementById("condoFees_43").innerHTML="";
	    	"""),format.raw/*569.7*/("""}"""),format.raw/*569.8*/("""
				
				
				
				
				"""),format.raw/*574.5*/("""//end here
			var ownership431 = document.forms["myForm"]["ownership43"].value;
			if(!ownership431)"""),format.raw/*576.21*/("""{"""),format.raw/*576.22*/("""
			        """),format.raw/*577.12*/("""document.getElementById('input_201213').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*579.4*/("""}"""),format.raw/*579.5*/("""else"""),format.raw/*579.9*/("""{"""),format.raw/*579.10*/("""
	    	"""),format.raw/*580.7*/("""document.getElementById("input_201213").innerHTML="";
	    	"""),format.raw/*581.7*/("""}"""),format.raw/*581.8*/("""
			
			"""),format.raw/*583.4*/("""var currentAddress441 = document.forms["myForm"]["currentAddress44"].value;
			if(!currentAddress441)"""),format.raw/*584.26*/("""{"""),format.raw/*584.27*/("""
			        """),format.raw/*585.12*/("""document.getElementById('input_2032121').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*587.4*/("""}"""),format.raw/*587.5*/("""else"""),format.raw/*587.9*/("""{"""),format.raw/*587.10*/("""
	    	"""),format.raw/*588.7*/("""document.getElementById("input_2032121").innerHTML="";
	    	"""),format.raw/*589.7*/("""}"""),format.raw/*589.8*/("""

			"""),format.raw/*591.4*/("""var appxValue441 = document.forms["myForm"]["appxValue44"].value;
			if(!appxValue441)"""),format.raw/*592.21*/("""{"""),format.raw/*592.22*/("""
			        """),format.raw/*593.12*/("""document.getElementById('input_20212').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*595.4*/("""}"""),format.raw/*595.5*/("""else"""),format.raw/*595.9*/("""{"""),format.raw/*595.10*/("""
	    	"""),format.raw/*596.7*/("""document.getElementById("input_20212").innerHTML="";
	    	"""),format.raw/*597.7*/("""}"""),format.raw/*597.8*/("""
					"""),format.raw/*598.6*/("""//changes here 4 
					var mortgage44 = document.forms["myForm"]["mortgage44"].value;
			if(!mortgage44)"""),format.raw/*600.19*/("""{"""),format.raw/*600.20*/("""
			        """),format.raw/*601.12*/("""document.getElementById('mortgage_44').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*603.4*/("""}"""),format.raw/*603.5*/("""else"""),format.raw/*603.9*/("""{"""),format.raw/*603.10*/("""
	    	"""),format.raw/*604.7*/("""document.getElementById("mortgage_44").innerHTML="";
	    	"""),format.raw/*605.7*/("""}"""),format.raw/*605.8*/("""
			"""),format.raw/*606.4*/("""var rentMo44 = document.forms["myForm"]["rentMo44"].value;
			if(!rentMo44)"""),format.raw/*607.17*/("""{"""),format.raw/*607.18*/("""
			        """),format.raw/*608.12*/("""document.getElementById('rentMo_44').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*610.4*/("""}"""),format.raw/*610.5*/("""else"""),format.raw/*610.9*/("""{"""),format.raw/*610.10*/("""
	    	"""),format.raw/*611.7*/("""document.getElementById("rentMo_44").innerHTML="";
	    	"""),format.raw/*612.7*/("""}"""),format.raw/*612.8*/("""
			
			
			"""),format.raw/*615.4*/("""var condoFees44 = document.forms["myForm"]["condoFees44"].value;
			if(!condoFees44)"""),format.raw/*616.20*/("""{"""),format.raw/*616.21*/("""
			        """),format.raw/*617.12*/("""document.getElementById('condoFees_44').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*619.4*/("""}"""),format.raw/*619.5*/("""else"""),format.raw/*619.9*/("""{"""),format.raw/*619.10*/("""
	    	"""),format.raw/*620.7*/("""document.getElementById("condoFees_44").innerHTML="";
	    	"""),format.raw/*621.7*/("""}"""),format.raw/*621.8*/("""
				
					
					
					
					"""),format.raw/*626.6*/("""// end here
			var ownership441 = document.forms["myForm"]["ownership44"].value;
			if(!ownership441)"""),format.raw/*628.21*/("""{"""),format.raw/*628.22*/("""
			        """),format.raw/*629.12*/("""document.getElementById('input_20213').innerHTML="<span style='color:red'>*This field is Required.</span>";
			        return false;
			"""),format.raw/*631.4*/("""}"""),format.raw/*631.5*/("""else"""),format.raw/*631.9*/("""{"""),format.raw/*631.10*/("""
	    	"""),format.raw/*632.7*/("""document.getElementById("input_20213").innerHTML="";
	    	"""),format.raw/*633.7*/("""}"""),format.raw/*633.8*/("""
			
		"""),format.raw/*635.3*/("""}"""),format.raw/*635.4*/("""
		
		"""),format.raw/*637.3*/("""return true;	
	"""),format.raw/*638.2*/("""}"""),format.raw/*638.3*/("""
"""),format.raw/*639.1*/("""</script>
<script>
      $(function()"""),format.raw/*641.19*/("""{"""),format.raw/*641.20*/("""
    	  """),format.raw/*642.8*/("""$("#geocomplete0").geocomplete("""),format.raw/*642.39*/("""{"""),format.raw/*642.40*/("""
    	        """),format.raw/*643.14*/("""types:["geocode", "establishment"]
    	    """),format.raw/*644.10*/("""}"""),format.raw/*644.11*/(""")
    	    .bind("geocode:result", function (event, result) """),format.raw/*645.59*/("""{"""),format.raw/*645.60*/("""
    	        """),format.raw/*646.14*/("""//$.log("Result: " + result.formatted_address);
    	        //alert("Result: " + result.formatted_address);
    	    	document.getElementById("geocomplete0").value = result.formatted_address;
    	    """),format.raw/*649.10*/("""}"""),format.raw/*649.11*/(""")
    	    .bind("geocode:error", function (event, status) """),format.raw/*650.58*/("""{"""),format.raw/*650.59*/("""
    	        """),format.raw/*651.14*/("""alert("ERROR: " + status);
    	    """),format.raw/*652.10*/("""}"""),format.raw/*652.11*/(""")
    	    .bind("geocode:multiple", function (event, results) """),format.raw/*653.62*/("""{"""),format.raw/*653.63*/("""
    	       """),format.raw/*654.13*/("""alert("Multiple: " + results.length + " results found");
    	    """),format.raw/*655.10*/("""}"""),format.raw/*655.11*/(""");   
      """),format.raw/*656.7*/("""}"""),format.raw/*656.8*/(""");
    </script>
    <script>
      $(function()"""),format.raw/*659.19*/("""{"""),format.raw/*659.20*/("""
    	"""),format.raw/*660.6*/("""$("#geocomplete71").geocomplete("""),format.raw/*660.38*/("""{"""),format.raw/*660.39*/("""
  	        """),format.raw/*661.12*/("""types:["geocode", "establishment"]
  	    """),format.raw/*662.8*/("""}"""),format.raw/*662.9*/(""")
  	    .bind("geocode:result", function (event, result) """),format.raw/*663.57*/("""{"""),format.raw/*663.58*/("""
  	        """),format.raw/*664.12*/("""//$.log("Result: " + result.formatted_address);
  	        //alert("Result: " + result.formatted_address);
  	    	document.getElementById("geocomplete71").value = result.formatted_address;
  	    """),format.raw/*667.8*/("""}"""),format.raw/*667.9*/(""")
  	    .bind("geocode:error", function (event, status) """),format.raw/*668.56*/("""{"""),format.raw/*668.57*/("""
  	        """),format.raw/*669.12*/("""alert("ERROR: " + status);
  	    """),format.raw/*670.8*/("""}"""),format.raw/*670.9*/(""")
  	    .bind("geocode:multiple", function (event, results) """),format.raw/*671.60*/("""{"""),format.raw/*671.61*/("""
  	       """),format.raw/*672.11*/("""alert("Multiple: " + results.length + " results found");
  	    """),format.raw/*673.8*/("""}"""),format.raw/*673.9*/(""");   
      """),format.raw/*674.7*/("""}"""),format.raw/*674.8*/(""");
    </script>
    
     <script>
      $(function()"""),format.raw/*678.19*/("""{"""),format.raw/*678.20*/("""
    	  """),format.raw/*679.8*/("""$("#geocomplete72").geocomplete("""),format.raw/*679.40*/("""{"""),format.raw/*679.41*/("""
    	        """),format.raw/*680.14*/("""types:["geocode", "establishment"]
    	    """),format.raw/*681.10*/("""}"""),format.raw/*681.11*/(""")
    	    .bind("geocode:result", function (event, result) """),format.raw/*682.59*/("""{"""),format.raw/*682.60*/("""
    	        """),format.raw/*683.14*/("""//$.log("Result: " + result.formatted_address);
    	        //alert("Result: " + result.formatted_address);
    	    	document.getElementById("geocomplete72").value = result.formatted_address;
    	    """),format.raw/*686.10*/("""}"""),format.raw/*686.11*/(""")
    	    .bind("geocode:error", function (event, status) """),format.raw/*687.58*/("""{"""),format.raw/*687.59*/("""
    	        """),format.raw/*688.14*/("""alert("ERROR: " + status);
    	    """),format.raw/*689.10*/("""}"""),format.raw/*689.11*/(""")
    	    .bind("geocode:multiple", function (event, results) """),format.raw/*690.62*/("""{"""),format.raw/*690.63*/("""
    	       """),format.raw/*691.13*/("""alert("Multiple: " + results.length + " results found");
    	    """),format.raw/*692.10*/("""}"""),format.raw/*692.11*/(""");
      """),format.raw/*693.7*/("""}"""),format.raw/*693.8*/(""");
      
    </script>
    <script>
      $(function()"""),format.raw/*697.19*/("""{"""),format.raw/*697.20*/("""
    	"""),format.raw/*698.6*/("""$("#geocomplete2").geocomplete("""),format.raw/*698.37*/("""{"""),format.raw/*698.38*/("""
  	        """),format.raw/*699.12*/("""types:["geocode", "establishment"]
  	    """),format.raw/*700.8*/("""}"""),format.raw/*700.9*/(""")
  	    .bind("geocode:result", function (event, result) """),format.raw/*701.57*/("""{"""),format.raw/*701.58*/("""
  	        """),format.raw/*702.12*/("""//$.log("Result: " + result.formatted_address);
  	        //alert("Result: " + result.formatted_address);
  	    	document.getElementById("geocomplete2").value = result.formatted_address;
  	    """),format.raw/*705.8*/("""}"""),format.raw/*705.9*/(""")
  	    .bind("geocode:error", function (event, status) """),format.raw/*706.56*/("""{"""),format.raw/*706.57*/("""
  	        """),format.raw/*707.12*/("""alert("ERROR: " + status);
  	    """),format.raw/*708.8*/("""}"""),format.raw/*708.9*/(""")
  	    .bind("geocode:multiple", function (event, results) """),format.raw/*709.60*/("""{"""),format.raw/*709.61*/("""
  	       """),format.raw/*710.11*/("""alert("Multiple: " + results.length + " results found");
  	    """),format.raw/*711.8*/("""}"""),format.raw/*711.9*/(""");
      """),format.raw/*712.7*/("""}"""),format.raw/*712.8*/(""");
    </script>
    <script>
      $(function()"""),format.raw/*715.19*/("""{"""),format.raw/*715.20*/("""
    	  """),format.raw/*716.8*/("""$("#geocomplete3").geocomplete("""),format.raw/*716.39*/("""{"""),format.raw/*716.40*/("""
    	        """),format.raw/*717.14*/("""types:["geocode", "establishment"]
    	    """),format.raw/*718.10*/("""}"""),format.raw/*718.11*/(""")
    	    .bind("geocode:result", function (event, result) """),format.raw/*719.59*/("""{"""),format.raw/*719.60*/("""
    	        """),format.raw/*720.14*/("""//$.log("Result: " + result.formatted_address);
    	        //alert("Result: " + result.formatted_address);
    	    	document.getElementById("geocomplete3").value = result.formatted_address;
    	    """),format.raw/*723.10*/("""}"""),format.raw/*723.11*/(""")
    	    .bind("geocode:error", function (event, status) """),format.raw/*724.58*/("""{"""),format.raw/*724.59*/("""
    	        """),format.raw/*725.14*/("""alert("ERROR: " + status);
    	    """),format.raw/*726.10*/("""}"""),format.raw/*726.11*/(""")
    	    .bind("geocode:multiple", function (event, results) """),format.raw/*727.62*/("""{"""),format.raw/*727.63*/("""
    	       """),format.raw/*728.13*/("""alert("Multiple: " + results.length + " results found");
    	    """),format.raw/*729.10*/("""}"""),format.raw/*729.11*/("""); 
      """),format.raw/*730.7*/("""}"""),format.raw/*730.8*/(""");
    </script>
	 <script>
      $(function()"""),format.raw/*733.19*/("""{"""),format.raw/*733.20*/("""
    	"""),format.raw/*734.6*/("""$("#geocomplete4").geocomplete("""),format.raw/*734.37*/("""{"""),format.raw/*734.38*/("""
  	        """),format.raw/*735.12*/("""types:["geocode", "establishment"]
  	    """),format.raw/*736.8*/("""}"""),format.raw/*736.9*/(""")
  	    .bind("geocode:result", function (event, result) """),format.raw/*737.57*/("""{"""),format.raw/*737.58*/("""
  	        """),format.raw/*738.12*/("""//$.log("Result: " + result.formatted_address);
  	        //alert("Result: " + result.formatted_address);
  	    	document.getElementById("geocomplete4").value = result.formatted_address;
  	    """),format.raw/*741.8*/("""}"""),format.raw/*741.9*/(""")
  	    .bind("geocode:error", function (event, status) """),format.raw/*742.56*/("""{"""),format.raw/*742.57*/("""
  	        """),format.raw/*743.12*/("""alert("ERROR: " + status);
  	    """),format.raw/*744.8*/("""}"""),format.raw/*744.9*/(""")
  	    .bind("geocode:multiple", function (event, results) """),format.raw/*745.60*/("""{"""),format.raw/*745.61*/("""
  	       """),format.raw/*746.11*/("""alert("Multiple: " + results.length + " results found");
  	    """),format.raw/*747.8*/("""}"""),format.raw/*747.9*/(""");  
      """),format.raw/*748.7*/("""}"""),format.raw/*748.8*/(""");
    </script>
     <script>
      $(function()"""),format.raw/*751.19*/("""{"""),format.raw/*751.20*/("""
    	  """),format.raw/*752.8*/("""$("#geocomplete41").geocomplete("""),format.raw/*752.40*/("""{"""),format.raw/*752.41*/("""
    	        """),format.raw/*753.14*/("""types:["geocode", "establishment"]
    	    """),format.raw/*754.10*/("""}"""),format.raw/*754.11*/(""")
    	    .bind("geocode:result", function (event, result) """),format.raw/*755.59*/("""{"""),format.raw/*755.60*/("""
    	        """),format.raw/*756.14*/("""//$.log("Result: " + result.formatted_address);
    	        //alert("Result: " + result.formatted_address);
    	    	document.getElementById("geocomplete41").value = result.formatted_address;
    	    """),format.raw/*759.10*/("""}"""),format.raw/*759.11*/(""")
    	    .bind("geocode:error", function (event, status) """),format.raw/*760.58*/("""{"""),format.raw/*760.59*/("""
    	        """),format.raw/*761.14*/("""alert("ERROR: " + status);
    	    """),format.raw/*762.10*/("""}"""),format.raw/*762.11*/(""")
    	    .bind("geocode:multiple", function (event, results) """),format.raw/*763.62*/("""{"""),format.raw/*763.63*/("""
    	       """),format.raw/*764.13*/("""alert("Multiple: " + results.length + " results found");
    	    """),format.raw/*765.10*/("""}"""),format.raw/*765.11*/(""");  
      """),format.raw/*766.7*/("""}"""),format.raw/*766.8*/(""");
    </script>
    <script>
      $(function()"""),format.raw/*769.19*/("""{"""),format.raw/*769.20*/("""
    	"""),format.raw/*770.6*/("""$("#geocomplete42").geocomplete("""),format.raw/*770.38*/("""{"""),format.raw/*770.39*/("""
  	        """),format.raw/*771.12*/("""types:["geocode", "establishment"]
  	    """),format.raw/*772.8*/("""}"""),format.raw/*772.9*/(""")
  	    .bind("geocode:result", function (event, result) """),format.raw/*773.57*/("""{"""),format.raw/*773.58*/("""
  	        """),format.raw/*774.12*/("""//$.log("Result: " + result.formatted_address);
  	        //alert("Result: " + result.formatted_address);
  	    	document.getElementById("geocomplete42").value = result.formatted_address;
  	    """),format.raw/*777.8*/("""}"""),format.raw/*777.9*/(""")
  	    .bind("geocode:error", function (event, status) """),format.raw/*778.56*/("""{"""),format.raw/*778.57*/("""
  	        """),format.raw/*779.12*/("""alert("ERROR: " + status);
  	    """),format.raw/*780.8*/("""}"""),format.raw/*780.9*/(""")
  	    .bind("geocode:multiple", function (event, results) """),format.raw/*781.60*/("""{"""),format.raw/*781.61*/("""
  	       """),format.raw/*782.11*/("""alert("Multiple: " + results.length + " results found");
  	    """),format.raw/*783.8*/("""}"""),format.raw/*783.9*/(""");    
      """),format.raw/*784.7*/("""}"""),format.raw/*784.8*/(""");
    </script>
    <script>
      $(function()"""),format.raw/*787.19*/("""{"""),format.raw/*787.20*/("""
    	  """),format.raw/*788.8*/("""$("#geocomplete43").geocomplete("""),format.raw/*788.40*/("""{"""),format.raw/*788.41*/("""
    	        """),format.raw/*789.14*/("""types:["geocode", "establishment"]
    	    """),format.raw/*790.10*/("""}"""),format.raw/*790.11*/(""")
    	    .bind("geocode:result", function (event, result) """),format.raw/*791.59*/("""{"""),format.raw/*791.60*/("""
    	        """),format.raw/*792.14*/("""//$.log("Result: " + result.formatted_address);
    	        //alert("Result: " + result.formatted_address);
    	    	document.getElementById("geocomplete43").value = result.formatted_address;
    	    """),format.raw/*795.10*/("""}"""),format.raw/*795.11*/(""")
    	    .bind("geocode:error", function (event, status) """),format.raw/*796.58*/("""{"""),format.raw/*796.59*/("""
    	        """),format.raw/*797.14*/("""alert("ERROR: " + status);
    	    """),format.raw/*798.10*/("""}"""),format.raw/*798.11*/(""")
    	    .bind("geocode:multiple", function (event, results) """),format.raw/*799.62*/("""{"""),format.raw/*799.63*/("""
    	       """),format.raw/*800.13*/("""alert("Multiple: " + results.length + " results found");
    	    """),format.raw/*801.10*/("""}"""),format.raw/*801.11*/(""");
      """),format.raw/*802.7*/("""}"""),format.raw/*802.8*/(""");
    </script>
    <script>
      $(function()"""),format.raw/*805.19*/("""{"""),format.raw/*805.20*/("""
    	"""),format.raw/*806.6*/("""$("#geocomplete44").geocomplete("""),format.raw/*806.38*/("""{"""),format.raw/*806.39*/("""
  	        """),format.raw/*807.12*/("""types:["geocode", "establishment"]
  	    """),format.raw/*808.8*/("""}"""),format.raw/*808.9*/(""")
  	    .bind("geocode:result", function (event, result) """),format.raw/*809.57*/("""{"""),format.raw/*809.58*/("""
  	        """),format.raw/*810.12*/("""//$.log("Result: " + result.formatted_address);
  	        //alert("Result: " + result.formatted_address);
  	    	document.getElementById("geocomplete44").value = result.formatted_address;
  	    """),format.raw/*813.8*/("""}"""),format.raw/*813.9*/(""")
  	    .bind("geocode:error", function (event, status) """),format.raw/*814.56*/("""{"""),format.raw/*814.57*/("""
  	        """),format.raw/*815.12*/("""alert("ERROR: " + status);
  	    """),format.raw/*816.8*/("""}"""),format.raw/*816.9*/(""")
  	    .bind("geocode:multiple", function (event, results) """),format.raw/*817.60*/("""{"""),format.raw/*817.61*/("""
  	       """),format.raw/*818.11*/("""alert("Multiple: " + results.length + " results found");
  	    """),format.raw/*819.8*/("""}"""),format.raw/*819.9*/(""");  
      """),format.raw/*820.7*/("""}"""),format.raw/*820.8*/(""");
    </script>
    
       <script>
      $(function()"""),format.raw/*824.19*/("""{"""),format.raw/*824.20*/("""
    	  """),format.raw/*825.8*/("""$("#geocomplete51").geocomplete("""),format.raw/*825.40*/("""{"""),format.raw/*825.41*/("""
    	        """),format.raw/*826.14*/("""types:["geocode", "establishment"]
    	    """),format.raw/*827.10*/("""}"""),format.raw/*827.11*/(""")
    	    .bind("geocode:result", function (event, result) """),format.raw/*828.59*/("""{"""),format.raw/*828.60*/("""
    	        """),format.raw/*829.14*/("""//$.log("Result: " + result.formatted_address);
    	        //alert("Result: " + result.formatted_address);
    	    	document.getElementById("geocomplete51").value = result.formatted_address;
    	    """),format.raw/*832.10*/("""}"""),format.raw/*832.11*/(""")
    	    .bind("geocode:error", function (event, status) """),format.raw/*833.58*/("""{"""),format.raw/*833.59*/("""
    	        """),format.raw/*834.14*/("""alert("ERROR: " + status);
    	    """),format.raw/*835.10*/("""}"""),format.raw/*835.11*/(""")
    	    .bind("geocode:multiple", function (event, results) """),format.raw/*836.62*/("""{"""),format.raw/*836.63*/("""
    	       """),format.raw/*837.13*/("""alert("Multiple: " + results.length + " results found");
    	    """),format.raw/*838.10*/("""}"""),format.raw/*838.11*/("""); 
      """),format.raw/*839.7*/("""}"""),format.raw/*839.8*/(""");
    </script>
    <script>
      $(function()"""),format.raw/*842.19*/("""{"""),format.raw/*842.20*/("""
      """),format.raw/*843.7*/("""$("#geocomplete52").geocomplete("""),format.raw/*843.39*/("""{"""),format.raw/*843.40*/("""
  	        """),format.raw/*844.12*/("""types:["geocode", "establishment"]
  	    """),format.raw/*845.8*/("""}"""),format.raw/*845.9*/(""")
  	    .bind("geocode:result", function (event, result) """),format.raw/*846.57*/("""{"""),format.raw/*846.58*/("""
  	        """),format.raw/*847.12*/("""//$.log("Result: " + result.formatted_address);
  	        //alert("Result: " + result.formatted_address);
  	    	document.getElementById("geocomplete52").value = result.formatted_address;
  	    """),format.raw/*850.8*/("""}"""),format.raw/*850.9*/(""")
  	    .bind("geocode:error", function (event, status) """),format.raw/*851.56*/("""{"""),format.raw/*851.57*/("""
  	        """),format.raw/*852.12*/("""alert("ERROR: " + status);
  	    """),format.raw/*853.8*/("""}"""),format.raw/*853.9*/(""")
  	    .bind("geocode:multiple", function (event, results) """),format.raw/*854.60*/("""{"""),format.raw/*854.61*/("""
  	       """),format.raw/*855.11*/("""alert("Multiple: " + results.length + " results found");
  	    """),format.raw/*856.8*/("""}"""),format.raw/*856.9*/(""");  
      """),format.raw/*857.7*/("""}"""),format.raw/*857.8*/(""");
    </script>
    
     <script>
      $(function()"""),format.raw/*861.19*/("""{"""),format.raw/*861.20*/("""
    	  """),format.raw/*862.8*/("""$("#geocomplete53").geocomplete("""),format.raw/*862.40*/("""{"""),format.raw/*862.41*/("""
    	        """),format.raw/*863.14*/("""types:["geocode", "establishment"]
    	    """),format.raw/*864.10*/("""}"""),format.raw/*864.11*/(""")
    	    .bind("geocode:result", function (event, result) """),format.raw/*865.59*/("""{"""),format.raw/*865.60*/("""
    	        """),format.raw/*866.14*/("""//$.log("Result: " + result.formatted_address);
    	        //alert("Result: " + result.formatted_address);
    	    	document.getElementById("geocomplete53").value = result.formatted_address;
    	    """),format.raw/*869.10*/("""}"""),format.raw/*869.11*/(""")
    	    .bind("geocode:error", function (event, status) """),format.raw/*870.58*/("""{"""),format.raw/*870.59*/("""
    	        """),format.raw/*871.14*/("""alert("ERROR: " + status);
    	    """),format.raw/*872.10*/("""}"""),format.raw/*872.11*/(""")
    	    .bind("geocode:multiple", function (event, results) """),format.raw/*873.62*/("""{"""),format.raw/*873.63*/("""
    	       """),format.raw/*874.13*/("""alert("Multiple: " + results.length + " results found");
    	    """),format.raw/*875.10*/("""}"""),format.raw/*875.11*/(""");  
      """),format.raw/*876.7*/("""}"""),format.raw/*876.8*/(""");
    </script>
     <script>
      $(function()"""),format.raw/*879.19*/("""{"""),format.raw/*879.20*/("""
      """),format.raw/*880.7*/("""$("#geocomplete54").geocomplete("""),format.raw/*880.39*/("""{"""),format.raw/*880.40*/("""
  	        """),format.raw/*881.12*/("""types:["geocode", "establishment"]
  	    """),format.raw/*882.8*/("""}"""),format.raw/*882.9*/(""")
  	    .bind("geocode:result", function (event, result) """),format.raw/*883.57*/("""{"""),format.raw/*883.58*/("""
  	        """),format.raw/*884.12*/("""//$.log("Result: " + result.formatted_address);
  	        //alert("Result: " + result.formatted_address);
  	    	document.getElementById("geocomplete54").value = result.formatted_address;
  	    """),format.raw/*887.8*/("""}"""),format.raw/*887.9*/(""")
  	    .bind("geocode:error", function (event, status) """),format.raw/*888.56*/("""{"""),format.raw/*888.57*/("""
  	        """),format.raw/*889.12*/("""alert("ERROR: " + status);
  	    """),format.raw/*890.8*/("""}"""),format.raw/*890.9*/(""")
  	    .bind("geocode:multiple", function (event, results) """),format.raw/*891.60*/("""{"""),format.raw/*891.61*/("""
  	       """),format.raw/*892.11*/("""alert("Multiple: " + results.length + " results found");
  	    """),format.raw/*893.8*/("""}"""),format.raw/*893.9*/(""");  
      """),format.raw/*894.7*/("""}"""),format.raw/*894.8*/(""");
    </script>
     <script>
      $(function()"""),format.raw/*897.19*/("""{"""),format.raw/*897.20*/("""
    	  """),format.raw/*898.8*/("""$("#geocomplete55").geocomplete("""),format.raw/*898.40*/("""{"""),format.raw/*898.41*/("""
    	        """),format.raw/*899.14*/("""types:["geocode", "establishment"]
    	    """),format.raw/*900.10*/("""}"""),format.raw/*900.11*/(""")
    	    .bind("geocode:result", function (event, result) """),format.raw/*901.59*/("""{"""),format.raw/*901.60*/("""
    	        """),format.raw/*902.14*/("""//$.log("Result: " + result.formatted_address);
    	        //alert("Result: " + result.formatted_address);
    	    	document.getElementById("geocomplete55").value = result.formatted_address;
    	    """),format.raw/*905.10*/("""}"""),format.raw/*905.11*/(""")
    	    .bind("geocode:error", function (event, status) """),format.raw/*906.58*/("""{"""),format.raw/*906.59*/("""
    	        """),format.raw/*907.14*/("""alert("ERROR: " + status);
    	    """),format.raw/*908.10*/("""}"""),format.raw/*908.11*/(""")
    	    .bind("geocode:multiple", function (event, results) """),format.raw/*909.62*/("""{"""),format.raw/*909.63*/("""
    	       """),format.raw/*910.13*/("""alert("Multiple: " + results.length + " results found");
    	    """),format.raw/*911.10*/("""}"""),format.raw/*911.11*/(""");  
      """),format.raw/*912.7*/("""}"""),format.raw/*912.8*/(""");
    </script>
     <script>
      $(function()"""),format.raw/*915.19*/("""{"""),format.raw/*915.20*/("""
      """),format.raw/*916.7*/("""$("#geocomplete56").geocomplete("""),format.raw/*916.39*/("""{"""),format.raw/*916.40*/("""
  	        """),format.raw/*917.12*/("""types:["geocode", "establishment"]
  	    """),format.raw/*918.8*/("""}"""),format.raw/*918.9*/(""")
  	    .bind("geocode:result", function (event, result) """),format.raw/*919.57*/("""{"""),format.raw/*919.58*/("""
  	        """),format.raw/*920.12*/("""//$.log("Result: " + result.formatted_address);
  	        //alert("Result: " + result.formatted_address);
  	    	document.getElementById("geocomplete56").value = result.formatted_address;
  	    """),format.raw/*923.8*/("""}"""),format.raw/*923.9*/(""")
  	    .bind("geocode:error", function (event, status) """),format.raw/*924.56*/("""{"""),format.raw/*924.57*/("""
  	        """),format.raw/*925.12*/("""alert("ERROR: " + status);
  	    """),format.raw/*926.8*/("""}"""),format.raw/*926.9*/(""")
  	    .bind("geocode:multiple", function (event, results) """),format.raw/*927.60*/("""{"""),format.raw/*927.61*/("""
  	       """),format.raw/*928.11*/("""alert("Multiple: " + results.length + " results found");
  	    """),format.raw/*929.8*/("""}"""),format.raw/*929.9*/(""");  
      """),format.raw/*930.7*/("""}"""),format.raw/*930.8*/(""");
    </script>
     <script>
      $(function()"""),format.raw/*933.19*/("""{"""),format.raw/*933.20*/("""
    	  """),format.raw/*934.8*/("""$("#geocomplete57").geocomplete("""),format.raw/*934.40*/("""{"""),format.raw/*934.41*/("""
    	        """),format.raw/*935.14*/("""types:["geocode", "establishment"]
    	    """),format.raw/*936.10*/("""}"""),format.raw/*936.11*/(""")
    	    .bind("geocode:result", function (event, result) """),format.raw/*937.59*/("""{"""),format.raw/*937.60*/("""
    	        """),format.raw/*938.14*/("""//$.log("Result: " + result.formatted_address);
    	        //alert("Result: " + result.formatted_address);
    	    	document.getElementById("geocomplete57").value = result.formatted_address;
    	    """),format.raw/*941.10*/("""}"""),format.raw/*941.11*/(""")
    	    .bind("geocode:error", function (event, status) """),format.raw/*942.58*/("""{"""),format.raw/*942.59*/("""
    	        """),format.raw/*943.14*/("""alert("ERROR: " + status);
    	    """),format.raw/*944.10*/("""}"""),format.raw/*944.11*/(""")
    	    .bind("geocode:multiple", function (event, results) """),format.raw/*945.62*/("""{"""),format.raw/*945.63*/("""
    	       """),format.raw/*946.13*/("""alert("Multiple: " + results.length + " results found");
    	    """),format.raw/*947.10*/("""}"""),format.raw/*947.11*/(""");  
      """),format.raw/*948.7*/("""}"""),format.raw/*948.8*/(""");
    </script>
    <script>
    function isNumber(evt) """),format.raw/*951.28*/("""{"""),format.raw/*951.29*/("""
        """),format.raw/*952.9*/("""evt = (evt) ? evt : window.event;
        var charCode = (evt.which) ? evt.which : evt.keyCode;
        if (charCode > 31 && (charCode < 48 || charCode > 57)) """),format.raw/*954.64*/("""{"""),format.raw/*954.65*/("""
        	 """),format.raw/*955.11*/("""alert("Please enter a number (no comma or dash)");
            return false;
        """),format.raw/*957.9*/("""}"""),format.raw/*957.10*/("""
        """),format.raw/*958.9*/("""return true;
    """),format.raw/*959.5*/("""}"""),format.raw/*959.6*/("""
    """),format.raw/*960.5*/("""</script>
<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->  
 <link rel="stylesheet" href="_resources/bootstrap.min.css">
 <link rel="stylesheet" href=""""),_display_(/*964.32*/routes/*964.38*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*964.80*/("""">
<script src="""),_display_(/*965.14*/routes/*965.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*965.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*966.47*/routes/*966.53*/.Assets.at("_resources/background.css")),format.raw/*966.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*967.47*/routes/*967.53*/.Assets.at("_resources/forms.css")),format.raw/*967.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*968.47*/routes/*968.53*/.Assets.at("_resources/template.css")),format.raw/*968.90*/("""">
</head>
<body>
<br>
<br>
<div style="width: 97%">
			
		<form name="myForm" action="mortgagePage11" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value=""""),_display_(/*976.32*/howManyProperty),format.raw/*976.47*/("""" name="howManyProperties123">
		
		<input type="hidden" value=""""),_display_(/*978.32*/applicantName),format.raw/*978.45*/("""" name="applicantName33">
		<input type="hidden" value=""""),_display_(/*979.32*/coApplicantName),format.raw/*979.47*/("""" name="coApplicantName33">
		
		
		<input type="hidden" value="uniid" name="uniid">
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 1%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*990.11*/routes/*990.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*990.57*/("""" />
		</div>
		<div style="padding-top: 50px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 4%">
		<div ng-controller="DemoController" ng-init="isDisabled = false;listLength="""),_display_(/*994.79*/propertyList/*994.91*/.length),format.raw/*994.98*/(""""  >
		
							<div class="form-group">
								<label> <font size="6">Properties </font></label>

							</div>
							<div id="cid_174" class="form-input-wide">
								<div id="text_174" class="form-html">
									<p>Lenders require information about additional properties to verify (e.g. Rental Properties) your application. In the Event you own additional properties (beyond the one you are seeking to finance in this application) please list them below.</p>
										
								</div>
							</div>
							<br>
								<label class="labelfont">How many properties do you own?<span
									style="color: red; font-size: 3">*</span></label><br>
								<div class="btn-group" style="width: 100%;">
								<label style="width: 20%; border-style: groove;"
									class="btn btn-primary " btn-radio="'one'"
									ng-change="change()" ng-model="noOfProperty"> One </label> <label
									style="width: 20%; border-style: groove;"
									class="btn btn-primary full " btn-radio="'two'"
									ng-change="change()" ng-model="noOfProperty"> Two
									</label><label
									style="width: 20%; border-radius: 0px 5px 5px 0px; border-style: groove;"
									class="btn btn-primary " btn-radio="'three'"
									ng-change="change()" ng-model="noOfProperty"> Three

								</label><br><br><label style="width: 20%; border-style: groove; border-radius: 5px 0px 0px 5px;"
									class="btn btn-primary " btn-radio="'four'"
									ng-change="change()" ng-model="noOfProperty"> Four </label>
									<label style="width: 20%; border-style: groove;"
									class="btn btn-primary " btn-radio="'more'"
									ng-change="change()" ng-model="noOfProperty"> More </label>
									<label style="width: 20%; border-style: groove; border-radius: 0px 5px 5px 0px;"
									class="btn btn-primary " btn-radio="'none'"
									ng-change="change()" ng-model="noOfProperty"> None </label>
							</div>
							<div id="role1"></div>
							<input type="hidden" id="role" name="howManyProperties" value=""""),format.raw/*1032.71*/("""{"""),format.raw/*1032.72*/("""{"""),format.raw/*1032.73*/("""noOfProperty"""),format.raw/*1032.85*/("""}"""),format.raw/*1032.86*/("""}"""),format.raw/*1032.87*/(""""
								ng-required> <br>
								
							<div ng-show="noOfProperty == 'one'" class="form-input-wide" >
												
								<table class="s" id="tb" style="border-spacing: 0; border-collapse: collapse;">
									<tr class="tr-header">
										<th colspan="2" width="30%">Address</th>
										<th width="14%">Appx Value</th>
										<th width="14%">Mortgage</th>
										<th width="12%">Rent/Mo</th>
										<th width="12%">Condo Fees/Mo</th>
										<th width="14%">Ownership</th>
										<th width="4%">Selling</th>
										
									<tr ng-if="listLength!=1 ">
										<td colspan="2"><div style="padding-left: 0%;">
											<div class="map_canvas"></div>
											<input type="text" id="geocomplete0" placeholder="Enter Location" class="form-control" name="address0" style="width: 100%" value="">
											<div id="input_200211" style="position: absolute;"> </div>
											</div></td>
										<td><input type="text" name="appxValue1" placeholder="500,000"
											 class="form-control" value="" onkeypress="return isNumber(event)">
											 <div id="input_200212" style="position: absolute;"> </div>
											 </td>
										<td><input type="number" data-type="input-number"
											name="mortgage1" placeholder="500,000" class="form-control" value="" onkeypress="return isNumber(event)">
											 <div id="input_200_212" style="position: absolute;"> </div></td>
										<td><input type="number" data-type ="input-number"
											name="rentMo1" placeholder="2,300" class="form-control" value="" onkeypress="return isNumber(event)">
											<div id="input_200_213" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="condoFees1" placeholder="500" class="form-control" value="" onkeypress="return isNumber(event)">
											<div id="input_200_214" style="position: absolute;"> </div></td>
											</td>
										<td><select name="ownership1"  class="form-control">
											  	<option value="">Select</option>
											    <option value=""""),_display_(/*1069.32*/applicantName),format.raw/*1069.45*/("""">"""),_display_(/*1069.48*/applicantName),format.raw/*1069.61*/("""</option>
											    """),_display_(/*1070.17*/if(coApplicantName!="")/*1070.40*/{_display_(Seq[Any](format.raw/*1070.41*/("""
											    """),format.raw/*1071.16*/("""<option value=""""),_display_(/*1071.32*/coApplicantName),format.raw/*1071.47*/("""">"""),_display_(/*1071.50*/coApplicantName),format.raw/*1071.65*/("""</option>
											    """)))}),format.raw/*1072.17*/("""
											    """),format.raw/*1073.16*/("""<option value="Joint">Joint</option>
											</select>
											<div id="input_200213" style="position: absolute;"> </div>
											</td>
										<td><center>
					                    	 	<input type="checkbox" name="agree1" value = "on">
					                    	 	</center>
					               	 		 </td>	
									</tr>
									
										<tr ng-if="listLength==1 ">
										"""),_display_(/*1084.12*/for(list <-propertyList) yield /*1084.36*/{_display_(Seq[Any](format.raw/*1084.37*/("""
										"""),format.raw/*1085.11*/("""<td colspan="2"><div style="padding-left: 0%;">
											<div class="map_canvas"></div>
											<input type="text" id="geocomplete0" placeholder="Enter Location" class="form-control" name="address0" style="width: 100%" value=""""),_display_(/*1087.143*/list/*1087.147*/.getName),format.raw/*1087.155*/("""">
											<div id="input_200211" style="position: absolute;"> </div>
											</div></td>
										<td><input type="text" name="appxValue1" placeholder="500,000"
											 class="form-control" value=""""),_display_(/*1091.42*/list/*1091.46*/.getValue),format.raw/*1091.55*/("""" onkeypress="return isNumber(event)">
											  <div id="input_200212" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="mortgage1" placeholder="500,000" class="form-control" value=""""),_display_(/*1094.80*/list/*1094.84*/.getMortgageValue),format.raw/*1094.101*/("""" onkeypress="return isNumber(event)">
											 <div id="input_200_212" style="position: absolute;"> </div></td>
											</td>
										<td><input type="number" data-type ="input-number"
											name="rentMo1" placeholder="2,300" class="form-control" value=""""),_display_(/*1098.76*/list/*1098.80*/.getMonthlyRent),format.raw/*1098.95*/("""" onkeypress="return isNumber(event)">
											<div id="input_200_213" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="condoFees1" placeholder="500" class="form-control" value=""""),_display_(/*1101.77*/list/*1101.81*/.getMoCondoFees),format.raw/*1101.96*/("""" onkeypress="return isNumber(event)">
											<div id="input_200_214" style="position: absolute;"> </div></td>
										<td><select name="ownership1"  class="form-control">
											  	<option value=""""),_display_(/*1104.31*/list/*1104.35*/.getOwnwerShip),format.raw/*1104.49*/("""">"""),_display_(/*1104.52*/list/*1104.56*/.getOwnwerShip),format.raw/*1104.70*/("""</option>
											    <option value=""""),_display_(/*1105.32*/applicantName),format.raw/*1105.45*/("""">"""),_display_(/*1105.48*/applicantName),format.raw/*1105.61*/("""</option>
											      """),_display_(/*1106.19*/if(coApplicantName!="")/*1106.42*/{_display_(Seq[Any](format.raw/*1106.43*/("""
											    """),format.raw/*1107.16*/("""<option value=""""),_display_(/*1107.32*/coApplicantName),format.raw/*1107.47*/("""">"""),_display_(/*1107.50*/coApplicantName),format.raw/*1107.65*/("""</option>
											    """)))}),format.raw/*1108.17*/("""
											   
											    
											    """),format.raw/*1111.16*/("""<option value="Joint">Joint</option>
											</select></td>
										<td>
											<center>
												<input  type="checkbox" name="agree1" value = "on"  ng-checked=""""),_display_(/*1115.78*/list/*1115.82*/.getSelling),format.raw/*1115.93*/("""" >
					                   	 	</center>
					               	 		</td>	
					               	 		""")))}),format.raw/*1118.26*/("""
									"""),format.raw/*1119.10*/("""</tr>
									<input type="hidden" value="" name="ownership12">
								</table>
							</div>
							
								<div ng-show="noOfProperty == 'two'" class="form-input-wide">
								<table class="s" id="tb" style="border-collapse: separate;  border-spacing: 0 23px;">
									<tr class="tr-header">
										<th colspan="2" width="30%">Address</th>
										<th width="14%">Appx Value</th>
										<th width="14%">Mortgage</th>
										<th width="12%">Rent/Mo</th>
										<th width="12%">Condo Fees/Mo</th>
										<th width="14%">Ownership</th>
										<th width="4%">Selling</th>
									
									<tr ng-if="listLength!=2">
										<td colspan="2"><div style="padding-left: 0%;">
											<div class="map_canvas"></div>
											<input type="text" id="geocomplete71" placeholder="Enter Location" class="form-control" name="currentAddress21" style="width: 100%" value="">
											<div id="input_2001" style="position: absolute;"> </div>
											</div></td>
										<td><input type="text" name="appxValue21" placeholder="500,000"
											 class="form-control" value="" onkeypress="return isNumber(event)">
											 <div id="input_200111" style="position: absolute;"> </div>
											 </td>
										<td><input type="number" data-type="input-number"
											name="mortgage21" placeholder="500,000" class="form-control" value="" onkeypress="return isNumber(event)">
											 <div id="input_101" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="rentMo21" placeholder="2,300" class="form-control" value="" onkeypress="return isNumber(event)">
											 <div id="input_102" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="condoFees21" placeholder="500" class="form-control" value="" onkeypress="return isNumber(event)">
											 <div id="input_103" style="position: absolute;"> </div></td>
										<td><select name="ownership21"  class="form-control">
											  	<option value="" selected>Select</option>
											    <option value=""""),_display_(/*1156.32*/applicantName),format.raw/*1156.45*/("""">"""),_display_(/*1156.48*/applicantName),format.raw/*1156.61*/("""</option>
											      """),_display_(/*1157.19*/if(coApplicantName!="")/*1157.42*/{_display_(Seq[Any](format.raw/*1157.43*/("""
											    """),format.raw/*1158.16*/("""<option value=""""),_display_(/*1158.32*/coApplicantName),format.raw/*1158.47*/("""">"""),_display_(/*1158.50*/coApplicantName),format.raw/*1158.65*/("""</option>
											    """)))}),format.raw/*1159.17*/("""
											    
											    """),format.raw/*1161.16*/("""<option value="Joint">Joint</option>
											</select>
											<div id="input_701" style="position: absolute;"> </div>
											</td>
										<td>
					                    	 <center><input type="checkbox" name="agreeTwo1" value = "on"></center>
					                    	 	
										</td>		
									</tr>
										
									<tr  ng-if="listLength!=2">
										<td colspan="2"><div style="padding-left: 0%;">
											<div class="map_canvas"></div>
											<input type="text" id="geocomplete72" placeholder="Enter Location" class="form-control" name="currentAddress22" style="width: 100%">
											<div id="input_2002" style="position: absolute;"> </div>
											</div></td>
										<td><input type="text" name="appxValue22" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)">
											 <div id="input_20022" style="position: absolute;"> </div>
											 </td>
										<td><input type="number" data-type="input-number"
											name="mortgage22" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)">
											<div id="input_104" style="position: absolute;"> </div></td>
											</td>
										<td><input type="number" data-type="input-number"
											name="rentMo22" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)">
											 <div id="input_105" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="condoFees22" placeholder="500" class="form-control" onkeypress="return isNumber(event)">
											
											<div id="input_106" style="position: absolute;"> </div></td>
										<td><select name="ownership22"  class="form-control">
											  <option   value="" selected>Select</option>
											    <option value=""""),_display_(/*1194.32*/applicantName),format.raw/*1194.45*/("""">"""),_display_(/*1194.48*/applicantName),format.raw/*1194.61*/("""</option>
											    """),_display_(/*1195.17*/if(coApplicantName!="")/*1195.40*/{_display_(Seq[Any](format.raw/*1195.41*/("""
											    """),format.raw/*1196.16*/("""<option value=""""),_display_(/*1196.32*/coApplicantName),format.raw/*1196.47*/("""">"""),_display_(/*1196.50*/coApplicantName),format.raw/*1196.65*/("""</option>
											    """)))}),format.raw/*1197.17*/("""
											    
											    """),format.raw/*1199.16*/("""<option value="Joint">Joint</option>
											</select>
											<div id="input_20012" style="position: absolute;"> </div>
											</td>
										<td>
											<center>
					                    	 	<input type="checkbox" name="agreeTwo2" value = "on">
					                   	 		<label><i></i></label>
					                   	 	</center>	
										</td>	
									</tr>
									
									"""),_display_(/*1211.11*/if(propertyList.length==2)/*1211.37*/{_display_(Seq[Any](format.raw/*1211.38*/("""
										"""),_display_(/*1212.12*/for((list,index) <-propertyList.zipWithIndex) yield /*1212.57*/{_display_(Seq[Any](format.raw/*1212.58*/("""
									"""),format.raw/*1213.10*/("""<tr ng-init="sellingValue="""),_display_(/*1213.37*/list/*1213.41*/.getSelling),format.raw/*1213.52*/(""";">
									<td colspan="2"><div style="padding-left: 0%;">
											<div class="map_canvas"></div>
											<input type="text" id="geocomplete7"""),_display_(/*1216.48*/{index+1}),format.raw/*1216.57*/("""" placeholder="Enter Location" class="form-control" name="currentAddress2"""),_display_(/*1216.131*/{index+1}),format.raw/*1216.140*/("""" style="width: 100%" value=""""),_display_(/*1216.170*/list/*1216.174*/.getName),format.raw/*1216.182*/("""">
											<div id="input_2001" style="position: absolute;"> </div>
											</div></td>
										<td><input type="text" name="appxValue2"""),_display_(/*1219.51*/{index+1}),format.raw/*1219.60*/("""" placeholder="500,000"
											 class="form-control" value=""""),_display_(/*1220.42*/list/*1220.46*/.getValue),format.raw/*1220.55*/("""" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="mortgage2"""),_display_(/*1222.28*/{index+1}),format.raw/*1222.37*/("""" placeholder="500,000" class="form-control" value=""""),_display_(/*1222.90*/list/*1222.94*/.getMortgageValue),format.raw/*1222.111*/("""" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="rentMo2"""),_display_(/*1224.26*/{index+1}),format.raw/*1224.35*/("""" placeholder="2,300" class="form-control" value=""""),_display_(/*1224.86*/list/*1224.90*/.getMonthlyRent),format.raw/*1224.105*/("""" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="condoFees2"""),_display_(/*1226.29*/{index+1}),format.raw/*1226.38*/("""" placeholder="500" class="form-control" value=""""),_display_(/*1226.87*/list/*1226.91*/.getMoCondoFees),format.raw/*1226.106*/("""" onkeypress="return isNumber(event)"></td>
										<td><select name="ownership2"""),_display_(/*1227.40*/{index+1}),format.raw/*1227.49*/("""" class="form-control">
											  	<option value=""""),_display_(/*1228.31*/list/*1228.35*/.getOwnwerShip),format.raw/*1228.49*/("""">"""),_display_(/*1228.52*/list/*1228.56*/.getOwnwerShip),format.raw/*1228.70*/("""</option>
											    <option value=""""),_display_(/*1229.32*/applicantName),format.raw/*1229.45*/("""">"""),_display_(/*1229.48*/applicantName),format.raw/*1229.61*/("""</option>
											    """),_display_(/*1230.17*/if(coApplicantName!="")/*1230.40*/{_display_(Seq[Any](format.raw/*1230.41*/("""
											    """),format.raw/*1231.16*/("""<option value=""""),_display_(/*1231.32*/coApplicantName),format.raw/*1231.47*/("""">"""),_display_(/*1231.50*/coApplicantName),format.raw/*1231.65*/("""</option>
											    """)))}),format.raw/*1232.17*/("""
											    """),format.raw/*1233.16*/("""<option value="Joint">Joint</option>
											</select></td>
										<td>
										<div>
											<center>
					                    	 	<input  type="checkbox" name="agreeTwo"""),_display_(/*1238.68*/{index+1}),format.raw/*1238.77*/("""" value = "on"  ng-checked=""""),_display_(/*1238.106*/list/*1238.110*/.getSelling),format.raw/*1238.121*/("""" >
					                   	 	</center>	
					               	 		</div>
										</td>		
									</tr>
										""")))}),format.raw/*1243.12*/("""
									""")))}),format.raw/*1244.11*/("""
								"""),format.raw/*1245.9*/("""</table>
							</div>
							  
							<div ng-show="noOfProperty == 'three'" class="form-input-wide" ng-init="listSize3=1">
								<table class="s" id="tb" style="border-collapse: separate;  border-spacing: 0 5px;">
									<tr class="tr-header">
										<th colspan="2" width="30%">Address</th>
										<th width="14%">Appx Value</th>
										<th width="14%">Mortgage</th>
										<th width="12%">Rent/Mo</th>
										<th width="12%">Condo Fees/Mo</th>
										<th width="14%">Ownership</th>
										<th width="4%">Selling</th> 
										
										
									<tr ng-if="listLength!=3">
										<td colspan="2"><div style="padding-left: 0%;">
											<div class="map_canvas"></div>
											<input type="text" id="geocomplete2" placeholder="Enter Location" class="form-control" name="currentAddress31" style="width: 100%">
											<div id="input_20011" style="position: absolute;"> </div>
											</div></td>
										<td><input type="text" name="appxValue31" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)">
											 <div id="input_200131" style="position: absolute;" onkeypress="return isNumber(event)"> </div>
											 </td>
										<td><input type="number" data-type="input-number"
											name="mortgage31" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)">
											<div id="mort_31" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="rentMo31" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)">
											<div id="rentMo_31" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="condoFees31" placeholder="500" class="form-control" onkeypress="return isNumber(event)">
											<div id="condoFees_31" style="position: absolute;"> </div></td>
										<td><select name="ownership31"  class="form-control">
											 	<option value="" selected>Select</option>
											    <option value=""""),_display_(/*1281.32*/applicantName),format.raw/*1281.45*/("""">"""),_display_(/*1281.48*/applicantName),format.raw/*1281.61*/("""</option>
											    """),_display_(/*1282.17*/if(coApplicantName!="")/*1282.40*/{_display_(Seq[Any](format.raw/*1282.41*/("""
											    """),format.raw/*1283.16*/("""<option value=""""),_display_(/*1283.32*/coApplicantName),format.raw/*1283.47*/("""">"""),_display_(/*1283.50*/coApplicantName),format.raw/*1283.65*/("""</option>
											    """)))}),format.raw/*1284.17*/("""
											    
											    """),format.raw/*1286.16*/("""<option value="Joint">Joint</option>
											</select>
											<div id="input_200132" style="position: absolute;"> </div>
											</td>
										<td>
					                    	<center><input type="checkbox" name="agreeThree1" value = "on"></center>
										</td>		
									</tr>
									<tr  ng-if="listLength!=3">
										<td colspan="2"><div style="padding-left: 0%;">
											<div class="map_canvas"></div>
											<input type="text" id="geocomplete3" placeholder="Enter Location" class="form-control" name="currentAddress32" style="width: 100%">
											<div id="input_203211" style="position: absolute;"> </div>
											</div></td>
										<td><input type="text" name="appxValue32" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)">
											 <div id="input_203212" style="position: absolute;"> </div>
											 </td>
										<td><input type="number" data-type="input-number"
											name="mortgage32" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)">
											<div id="mortgage_32" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="rentMo32" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)">
											<div id="rentMo_32" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="condoFees32" placeholder="500" class="form-control" onkeypress="return isNumber(event)">
											<div id="condoFees_32" style="position: absolute;"> </div></td>
										<td><select name="ownership32"  class="form-control">
											  <option   value="" selected>Select</option>
											    <option value=""""),_display_(/*1315.32*/applicantName),format.raw/*1315.45*/("""">"""),_display_(/*1315.48*/applicantName),format.raw/*1315.61*/("""</option>
											    """),_display_(/*1316.17*/if(coApplicantName!="")/*1316.40*/{_display_(Seq[Any](format.raw/*1316.41*/("""
											    """),format.raw/*1317.16*/("""<option value=""""),_display_(/*1317.32*/coApplicantName),format.raw/*1317.47*/("""">"""),_display_(/*1317.50*/coApplicantName),format.raw/*1317.65*/("""</option>
											    """)))}),format.raw/*1318.17*/("""
											    
											    """),format.raw/*1320.16*/("""<option value="Joint">Joint</option>
											</select>
											<div id="input_203214" style="position: absolute;"> </div>
											</td>	
										<td>
					                    	<center><input type="checkbox" name="agreeThree2" value = "on"></center>
										</td>	
									</tr>
									<tr  ng-if="listLength!=3">
										<td colspan="2"><div style="padding-left: 0%;">
											<div class="map_canvas"></div>
											<input type="text" id="geocomplete4" placeholder="Enter Location" class="form-control" name="currentAddress33" style="width: 100%">
											<div id="input_2043" style="position: absolute;"> </div>
											</div></td>
										<td><input type="text" name="appxValue33" placeholder="500,000"
											 class="form-control">
											 <div id="input_2044" style="position: absolute;" onkeypress="return isNumber(event)"> </div>
											 </td>
										<td><input type="number" data-type="input-number"
											name="mortgage33" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)">
											<div id="mortgage_33" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="rentMo33" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)">
											<div id="rentMo_33" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="condoFees33" placeholder="500" class="form-control" onkeypress="return isNumber(event)">
											<div id="condoFees_33" style="position: absolute;"> </div></td>
										<td><select name="ownership33"  class="form-control">
											 	<option value="" selected>Select</option>
											    <option value=""""),_display_(/*1349.32*/applicantName),format.raw/*1349.45*/("""">"""),_display_(/*1349.48*/applicantName),format.raw/*1349.61*/("""</option>
											    """),_display_(/*1350.17*/if(coApplicantName!="")/*1350.40*/{_display_(Seq[Any](format.raw/*1350.41*/("""
											    """),format.raw/*1351.16*/("""<option value=""""),_display_(/*1351.32*/coApplicantName),format.raw/*1351.47*/("""">"""),_display_(/*1351.50*/coApplicantName),format.raw/*1351.65*/("""</option>
											    """)))}),format.raw/*1352.17*/("""
											    
											    """),format.raw/*1354.16*/("""<option value="Joint">Joint</option>
											</select>
											<div id="input_2045" style="position: absolute;"> </div>
											</td>
										<td>
					                    	<center><input type="checkbox" name="agreeThree3" value = "on"></center>
										</td>	
									</tr>
									"""),_display_(/*1362.11*/if(propertyList.length==3)/*1362.37*/{_display_(Seq[Any](format.raw/*1362.38*/("""
							
										"""),_display_(/*1364.12*/for((list,index) <-propertyList.zipWithIndex) yield /*1364.57*/{_display_(Seq[Any](format.raw/*1364.58*/("""
									
									"""),format.raw/*1366.10*/("""<tr ng-init="sellingValue="""),_display_(/*1366.37*/list/*1366.41*/.getSelling),format.raw/*1366.52*/(""";">
							
									<td colspan="2"><div style="padding-left: 0%;">
											<div class="map_canvas"></div>
											<input type="text" id="geocomplete"""),_display_(/*1370.47*/{index+2}),format.raw/*1370.56*/("""" placeholder="Enter Location" class="form-control" name="currentAddress3"""),_display_(/*1370.130*/{index+1}),format.raw/*1370.139*/("""" style="width: 100%" value=""""),_display_(/*1370.169*/list/*1370.173*/.getName),format.raw/*1370.181*/("""">
											<div id="input_200211" style="position: absolute;"> </div>
											</div></td>
										<td><input type="text" name="appxValue3"""),_display_(/*1373.51*/{index+1}),format.raw/*1373.60*/("""" placeholder="500,000"
											 class="form-control" value=""""),_display_(/*1374.42*/list/*1374.46*/.getValue),format.raw/*1374.55*/("""" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="mortgage3"""),_display_(/*1376.28*/{index+1}),format.raw/*1376.37*/("""" placeholder="500,000" class="form-control" value=""""),_display_(/*1376.90*/list/*1376.94*/.getMortgageValue),format.raw/*1376.111*/("""" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type ="input-number"
											name="rentMo3"""),_display_(/*1378.26*/{index+1}),format.raw/*1378.35*/("""" placeholder="2,300" class="form-control" value=""""),_display_(/*1378.86*/list/*1378.90*/.getMonthlyRent),format.raw/*1378.105*/("""" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="condoFees3"""),_display_(/*1380.29*/{index+1}),format.raw/*1380.38*/("""" placeholder="500" class="form-control" value=""""),_display_(/*1380.87*/list/*1380.91*/.getMoCondoFees),format.raw/*1380.106*/("""" onkeypress="return isNumber(event)"></td>
										<td><select name="ownership3"""),_display_(/*1381.40*/{index+1}),format.raw/*1381.49*/(""""  class="form-control">
											  	<option value=""""),_display_(/*1382.31*/list/*1382.35*/.getOwnwerShip),format.raw/*1382.49*/("""">"""),_display_(/*1382.52*/list/*1382.56*/.getOwnwerShip),format.raw/*1382.70*/("""</option>
											    <option value=""""),_display_(/*1383.32*/applicantName),format.raw/*1383.45*/("""">"""),_display_(/*1383.48*/applicantName),format.raw/*1383.61*/("""</option>
											    """),_display_(/*1384.17*/if(coApplicantName!="")/*1384.40*/{_display_(Seq[Any](format.raw/*1384.41*/("""
											    """),format.raw/*1385.16*/("""<option value=""""),_display_(/*1385.32*/coApplicantName),format.raw/*1385.47*/("""">"""),_display_(/*1385.50*/coApplicantName),format.raw/*1385.65*/("""</option>
											    """)))}),format.raw/*1386.17*/("""
											    
											    
											    """),format.raw/*1389.16*/("""<option value="Joint">Joint</option>
											</select></td>
										<td><center>
					                    	 	<input  type="checkbox" name="agreeThree"""),_display_(/*1392.70*/{index+1}),format.raw/*1392.79*/(""""  value = "on" ng-checked=""""),_display_(/*1392.108*/list/*1392.112*/.getSelling),format.raw/*1392.123*/("""" >
					                   	 	</center>
					                   	 	</td>	
									</tr>
										""")))}),format.raw/*1396.12*/("""
									""")))}),format.raw/*1397.11*/("""
								"""),format.raw/*1398.9*/("""</table>
							</div> 
							
							<div ng-show="noOfProperty == 'four'" class="form-input-wide">
 
								<table class="s"  style="border-collapse: separate;  border-spacing: 0 5px;" id="POITable">
									<tr class="tr-header">
										<th colspan="2" width="30%">Address</th>
										<th width="14%">Appx Value</th>
										<th width="14%">Mortgage</th>
										<th width="12%">Rent/Mo</th>
										<th width="12%">Condo Fees/Mo</th>
										<th width="14%">Ownership</th>
										<th width="4%">Selling</th>
										
									<tr ng-if="listLength!=4">
										<td colspan="2"><div style="padding-left: 0%;">
											<div class="map_canvas"></div>
											<input type="text" id="geocomplete41" placeholder="Enter Location" class="form-control" name="currentAddress41" style="width: 100%">
											<div id="input_2032e11ww1s1" style="position: absolute;"> </div>
											</div></td>
										<td><input type="text" name="appxValue41" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)">
											 <div id="input_2032" style="position: absolute;"> </div>
											 </td>
										<td><input type="number" data-type="input-number"
											name="mortgage41" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)">
											<div id="mortgage_41" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="rentMo41" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)">
											<div id="rentMo_41" style="position: absolute;"> </div></td>
										<td><input type="number" data-type="input-number"
											name="condoFees41" placeholder="500" class="form-control" onkeypress="return isNumber(event)">
											<div id="condoFees_41" style="position: absolute;"> </div></td>
										<td><select name="ownership41" class="form-control">
											  <option   value="" selected>Select</option>
											    <option value=""""),_display_(/*1434.32*/applicantName),format.raw/*1434.45*/("""">"""),_display_(/*1434.48*/applicantName),format.raw/*1434.61*/("""</option>
											    """),_display_(/*1435.17*/if(coApplicantName!="")/*1435.40*/{_display_(Seq[Any](format.raw/*1435.41*/("""
											    """),format.raw/*1436.16*/("""<option value=""""),_display_(/*1436.32*/coApplicantName),format.raw/*1436.47*/("""">"""),_display_(/*1436.50*/coApplicantName),format.raw/*1436.65*/("""</option>
											    """)))}),format.raw/*1437.17*/("""
											    
											    """),format.raw/*1439.16*/("""<option value="Joint">Joint</option>
											</select>
											<div id="input_2033" style="position: absolute;"> </div>
											</td>	
										<td>
					                    	 <center><input type="checkbox" name="agreeFour1" value = "on"></center>
										</td>	
									</tr>
									<tr ng-if="listLength!=4">
										<td colspan="2"><div class="map_canvas"></div>
											<input type="text" id="geocomplete42" placeholder="Enter Location" class="form-control" name="currentAddress42" style="width: 100%">
											<div id="input_2212" style="position: absolute;"></div></td>
										<td><input type="text" name="appxValue42" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)">
											 <div id="input_20322" style="position: absolute;"></div></td>
											 </td>
										<td><input type="number" data-type="input-number"
											name="mortgage42" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)">
											 <div id="mortgage_42" style="position: absolute;"></div></td>
										<td><input type="number" data-type="input-number"
											name="rentMo42" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)">
											 <div id="rentMo_42" style="position: absolute;"></div></td>
										<td><input type="number" data-type="input-number"
											name="condoFees42" placeholder="500" class="form-control" onkeypress="return isNumber(event)">
											 <div id="condoFees_42" style="position: absolute;"></div></td>
										<td><select name="ownership42"  class="form-control">
											  <option   value="" selected>Select</option>
											   <option value=""""),_display_(/*1466.31*/applicantName),format.raw/*1466.44*/("""">"""),_display_(/*1466.47*/applicantName),format.raw/*1466.60*/("""</option>
											   """),_display_(/*1467.16*/if(coApplicantName!="")/*1467.39*/{_display_(Seq[Any](format.raw/*1467.40*/("""
											    """),format.raw/*1468.16*/("""<option value=""""),_display_(/*1468.32*/coApplicantName),format.raw/*1468.47*/("""">"""),_display_(/*1468.50*/coApplicantName),format.raw/*1468.65*/("""</option>
											    """)))}),format.raw/*1469.17*/("""
											    
											    """),format.raw/*1471.16*/("""<option value="Joint">Joint</option>
											</select>
											<div id="input_20323" style="position: absolute;"></div></td>
											</td>	
										<td>
					                    	 	<center><input type="checkbox" name="agreeFour2" value = "on"></center>
										</td>	
									</tr>
									<tr ng-if="listLength!=4">
										<td colspan="2"><div class="map_canvas"></div>
											<input type="text" id="geocomplete43" placeholder="Enter Location" class="form-control" name="currentAddress43" style="width: 100%">
											<div id="input_20121" style="position: absolute;"></div></td>
										<td><input type="text" name="appxValue43" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)">
											 <div id="input_201212" style="position: absolute;"></div></td>
											 </td>
										<td><input type="number" data-type="input-number"
											name="mortgage43" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)">
											 <div id="mortgage_43" style="position: absolute;"></div></td>
										<td><input type="number" data-type="input-number"
											name="rentMo43" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)">
											 <div id="rentMo_43" style="position: absolute;"></div></td>
										<td><input type="number" data-type="input-number"
											name="condoFees43" placeholder="500" class="form-control" onkeypress="return isNumber(event)">
											 <div id="condoFees_43" style="position: absolute;"></div></td>
										<td><select name="ownership43"  class="form-control">
											  <option   value="" selected>Select</option>
											    <option value=""""),_display_(/*1498.32*/applicantName),format.raw/*1498.45*/("""">"""),_display_(/*1498.48*/applicantName),format.raw/*1498.61*/("""</option>
											    """),_display_(/*1499.17*/if(coApplicantName!="")/*1499.40*/{_display_(Seq[Any](format.raw/*1499.41*/("""
											    """),format.raw/*1500.16*/("""<option value=""""),_display_(/*1500.32*/coApplicantName),format.raw/*1500.47*/("""">"""),_display_(/*1500.50*/coApplicantName),format.raw/*1500.65*/("""</option>
											    """)))}),format.raw/*1501.17*/("""
											    
											    """),format.raw/*1503.16*/("""<option value="Joint">Joint</option>
											</select>
											<div id="input_201213" style="position: absolute;"></div></td>
											</td>
										<td>
					                    	<center><input type="checkbox" name="agreeFour3" value = "on"></center>
										</td>		
									</tr>
									<tr ng-if="listLength!=4">
										<td colspan="2"><div class="map_canvas"></div>
											<input type="text" id="geocomplete44" placeholder="Enter Location" class="form-control" name="currentAddress44" style="width: 100%">
											<div id="input_2032121" style="position: absolute;"></div></td>
										<td><input type="text" name="appxValue44" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)">
											 <div id="input_20212" style="position: absolute;"></div></td>
											 </td>
										<td><input type="number" data-type="input-number"
											name="mortgage44" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)">
											 <div id="mortgage_44" style="position: absolute;"></div></td>
										<td><input type="number" data-type="input-number"
											name="rentMo44" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)">
											 <div id="rentMo_44" style="position: absolute;"></div></td>
										<td><input type="number" data-type="input-number"
											name="condoFees44" placeholder="500" class="form-control" onkeypress="return isNumber(event)">
											 <div id="condoFees_44" style="position: absolute;"></div></td>
										<td><select name="ownership44"  class="form-control">
											  <option   value="" selected>Select</option>
											    <option value=""""),_display_(/*1530.32*/applicantName),format.raw/*1530.45*/("""">"""),_display_(/*1530.48*/applicantName),format.raw/*1530.61*/("""</option>
											    """),_display_(/*1531.17*/if(coApplicantName!="")/*1531.40*/{_display_(Seq[Any](format.raw/*1531.41*/("""
											    """),format.raw/*1532.16*/("""<option value=""""),_display_(/*1532.32*/coApplicantName),format.raw/*1532.47*/("""">"""),_display_(/*1532.50*/coApplicantName),format.raw/*1532.65*/("""</option>
											    """)))}),format.raw/*1533.17*/("""
											    
											    """),format.raw/*1535.16*/("""<option value="Joint">Joint</option>
											</select>
											<div id="input_20213" style="position: absolute;"></div></td>
											</td>
										<td><center><input type="checkbox" name="agreeFour4" value = "on"></center></td>		
									</tr>
									
									"""),_display_(/*1542.11*/if(propertyList.length==4)/*1542.37*/{_display_(Seq[Any](format.raw/*1542.38*/("""
							
										"""),_display_(/*1544.12*/for((list,index) <-propertyList.zipWithIndex) yield /*1544.57*/{_display_(Seq[Any](format.raw/*1544.58*/("""
									
									"""),format.raw/*1546.10*/("""<tr ng-init="sellingValue="""),_display_(/*1546.37*/list/*1546.41*/.getSelling),format.raw/*1546.52*/(""";">
									<td colspan="2"><div style="padding-left: 0%;">
											<div class="map_canvas"></div>
											<input type="text" id="geocomplete4"""),_display_(/*1549.48*/{index+1}),format.raw/*1549.57*/("""" placeholder="Enter Location" class="form-control" name="currentAddress4"""),_display_(/*1549.131*/{index+1}),format.raw/*1549.140*/("""" style="width: 100%" value=""""),_display_(/*1549.170*/list/*1549.174*/.getName),format.raw/*1549.182*/("""">
											<div id="input_2032e11ww1s1" style="position: absolute;"> </div>
											</div></td>
										<td><input type="text" name="appxValue4"""),_display_(/*1552.51*/{index+1}),format.raw/*1552.60*/("""" placeholder="500,000"
											 class="form-control" value=""""),_display_(/*1553.42*/list/*1553.46*/.getValue),format.raw/*1553.55*/("""" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="mortgage4"""),_display_(/*1555.28*/{index+1}),format.raw/*1555.37*/("""" placeholder="500,000" class="form-control" value=""""),_display_(/*1555.90*/list/*1555.94*/.getMortgageValue),format.raw/*1555.111*/("""" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="rentMo4"""),_display_(/*1557.26*/{index+1}),format.raw/*1557.35*/("""" placeholder="2,300" class="form-control" value=""""),_display_(/*1557.86*/list/*1557.90*/.getMonthlyRent),format.raw/*1557.105*/("""" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="condoFees4"""),_display_(/*1559.29*/{index+1}),format.raw/*1559.38*/("""" placeholder="500" class="form-control" value=""""),_display_(/*1559.87*/list/*1559.91*/.getMoCondoFees),format.raw/*1559.106*/("""" onkeypress="return isNumber(event)"></td>
										<td><select name="ownership4"""),_display_(/*1560.40*/{index+1}),format.raw/*1560.49*/("""" class="form-control">
											  	<option value=""""),_display_(/*1561.31*/list/*1561.35*/.getOwnwerShip),format.raw/*1561.49*/("""">"""),_display_(/*1561.52*/list/*1561.56*/.getOwnwerShip),format.raw/*1561.70*/("""</option>
											    <option value=""""),_display_(/*1562.32*/applicantName),format.raw/*1562.45*/("""">"""),_display_(/*1562.48*/applicantName),format.raw/*1562.61*/("""</option>
											    """),_display_(/*1563.17*/if(coApplicantName!="")/*1563.40*/{_display_(Seq[Any](format.raw/*1563.41*/("""
											    """),format.raw/*1564.16*/("""<option value=""""),_display_(/*1564.32*/coApplicantName),format.raw/*1564.47*/("""">"""),_display_(/*1564.50*/coApplicantName),format.raw/*1564.65*/("""</option>
											    """)))}),format.raw/*1565.17*/("""
											    
											    """),format.raw/*1567.16*/("""<option value="Joint">Joint</option>
											</select></td>	
										<td>
											<center>
												<input ng-checked=""""),_display_(/*1571.33*/list/*1571.37*/.getSelling),format.raw/*1571.48*/("""" type="checkbox" name="agreeFour"""),_display_(/*1571.82*/{index+1}),format.raw/*1571.91*/("""" value = "on" checked="checked">
											</center>
										</td>	
									</tr>
									""")))}),format.raw/*1575.11*/("""
								""")))}),format.raw/*1576.10*/("""	
								"""),format.raw/*1577.9*/("""</table>
							</div>
							<div ng-show="noOfProperty == 'more'"><br>
							<table class="s"  style="border-collapse: separate;  border-spacing: 0 5px;" id="POITable">
									<tr class="tr-header">
										<th colspan="2" width="30%">Address</th>
										<th width="14%">Appx Value</th>
										<th width="14%">Mortgage</th>
										<th width="12%">Rent/Mo</th>
										<th width="12%">Condo Fees/Mo</th>
										<th width="14%">Ownership</th>
										<th width="4%">Selling</th> 
									<tr ng-if="listLength <= 4">
										<td colspan="2"><div style="padding-left: 0%;">
											<div class="map_canvas"></div>
											<input type="text" id="geocomplete51" placeholder="Enter Location" class="form-control" name="currentAddress51" style="width: 100%">
											<div id="input_2032e11ww1s1" style="position: absolute;"> </div>
											</div></td>
										<td><input type="text" name="appxValue51" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="mortgage51" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="rentMo51" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="condoFees51" placeholder="500" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><select name="ownership51" class="form-control">
											  <option   value="" selected>Select</option>
											   <option value=""""),_display_(/*1605.31*/applicantName),format.raw/*1605.44*/("""">"""),_display_(/*1605.47*/applicantName),format.raw/*1605.60*/("""</option>
											   """),_display_(/*1606.16*/if(coApplicantName!="")/*1606.39*/{_display_(Seq[Any](format.raw/*1606.40*/("""
											    """),format.raw/*1607.16*/("""<option value=""""),_display_(/*1607.32*/coApplicantName),format.raw/*1607.47*/("""">"""),_display_(/*1607.50*/coApplicantName),format.raw/*1607.65*/("""</option>
											    """)))}),format.raw/*1608.17*/("""
											    
											    """),format.raw/*1610.16*/("""<option value="Joint">Joint</option>
											</select></td>	
										<td>
											<center>
					                    	 	<input type="checkbox" name="agreeFive1" value = "on">
					                   	 	</center>
										</td>
											
									</tr>
									
									<tr ng-if="listLength <= 4">
										<td colspan="2"><div class="map_canvas"></div>
											<input type="text" id="geocomplete52" placeholder="Enter Location" class="form-control" name="currentAddress52" style="width: 100%">
											<div id="input_2032e11ww1sas1" style="position: absolute;"></div></td>
										<td><input type="text" name="appxValue52" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="mortgage52" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="rentMo52" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="condoFees52" placeholder="500" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><select name="ownership52"  class="form-control">
											  <option   value="" selected>Select</option>
											    <option value=""""),_display_(/*1634.32*/applicantName),format.raw/*1634.45*/("""">"""),_display_(/*1634.48*/applicantName),format.raw/*1634.61*/("""</option>
											    """),_display_(/*1635.17*/if(coApplicantName!="")/*1635.40*/{_display_(Seq[Any](format.raw/*1635.41*/("""
											    """),format.raw/*1636.16*/("""<option value=""""),_display_(/*1636.32*/coApplicantName),format.raw/*1636.47*/("""">"""),_display_(/*1636.50*/coApplicantName),format.raw/*1636.65*/("""</option>
											    """)))}),format.raw/*1637.17*/("""
											    
											    """),format.raw/*1639.16*/("""<option value="Joint">Joint</option>
											</select></td>	
										<td>
											<center>
					                    	 	<input type="checkbox" name="agreeFive2" value = "on">
					                   	 	</center>
										</td>	
									</tr>
									<tr ng-if="listLength >= 4">
										<td colspan="2"><div class="map_canvas"></div>
											<input type="text" id="geocomplete53" placeholder="Enter Location" class="form-control" name="currentAddress53" style="width: 100%">
											<div id="input_2032e11ww1sas1" style="position: absolute;"></div></td>
										<td><input type="text" name="appxValue53" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="mortgage53" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="rentMo53" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="condoFees53" placeholder="500" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><select name="ownership53"  class="form-control">
											  <option   value="" selected>Select</option>
											    <option value=""""),_display_(/*1661.32*/applicantName),format.raw/*1661.45*/("""">"""),_display_(/*1661.48*/applicantName),format.raw/*1661.61*/("""</option>
											    """),_display_(/*1662.17*/if(coApplicantName!="")/*1662.40*/{_display_(Seq[Any](format.raw/*1662.41*/("""
											    """),format.raw/*1663.16*/("""<option value=""""),_display_(/*1663.32*/coApplicantName),format.raw/*1663.47*/("""">"""),_display_(/*1663.50*/coApplicantName),format.raw/*1663.65*/("""</option>
											    """)))}),format.raw/*1664.17*/("""
											    
											    """),format.raw/*1666.16*/("""<option value="Joint">Joint</option>
											</select></td>
										<td>
											<center>
					                    	 	<input type="checkbox" name="agreeFive3" value = "on">
					                   	 	</center>
										</td>		
									</tr>
									<tr ng-if="listLength <= 4">
										<td colspan="2"><div class="map_canvas"></div>
											<input type="text" id="geocomplete54" placeholder="Enter Location" class="form-control" name="currentAddress54" style="width: 100%">
											<div id="input_2032e11ww1sas1" style="position: absolute;"></div></td>
										<td><input type="text" name="appxValue54" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="mortgage54" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="rentMo54" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="condoFees54" placeholder="500" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><select name="ownership54"  class="form-control">
											  <option   value="" selected>Select</option>
											   <option value=""""),_display_(/*1688.31*/applicantName),format.raw/*1688.44*/("""">"""),_display_(/*1688.47*/applicantName),format.raw/*1688.60*/("""</option>
											   """),_display_(/*1689.16*/if(coApplicantName!="")/*1689.39*/{_display_(Seq[Any](format.raw/*1689.40*/("""
											    """),format.raw/*1690.16*/("""<option value=""""),_display_(/*1690.32*/coApplicantName),format.raw/*1690.47*/("""">"""),_display_(/*1690.50*/coApplicantName),format.raw/*1690.65*/("""</option>
											    """)))}),format.raw/*1691.17*/("""
											    
											    """),format.raw/*1693.16*/("""<option value="Joint">Joint</option>
											</select></td>
										<td>
											<center>
					                    	 	<input type="checkbox" name="agreeFive4" value = "on">
					                   	 	</center>
										</td>		
									</tr>
									<tr ng-if="listLength <= 4">
										<td colspan="2"><div class="map_canvas"></div>
											<input type="text" id="geocomplete55" placeholder="Enter Location" class="form-control" name="currentAddress55" style="width: 100%">
											<div id="input_2032e11ww1sas1" style="position: absolute;"></div></td>
										<td><input type="text" name="appxValue55" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="mortgage55" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="rentMo55" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="condoFees55" placeholder="500" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><select name="ownership55"  class="form-control">
											  <option   value="" selected>Select</option>
											   <option value=""""),_display_(/*1715.31*/applicantName),format.raw/*1715.44*/("""">"""),_display_(/*1715.47*/applicantName),format.raw/*1715.60*/("""</option>
											   """),_display_(/*1716.16*/if(coApplicantName!="")/*1716.39*/{_display_(Seq[Any](format.raw/*1716.40*/("""
											    """),format.raw/*1717.16*/("""<option value=""""),_display_(/*1717.32*/coApplicantName),format.raw/*1717.47*/("""">"""),_display_(/*1717.50*/coApplicantName),format.raw/*1717.65*/("""</option>
											    """)))}),format.raw/*1718.17*/("""
											    
											    """),format.raw/*1720.16*/("""<option value="Joint">Joint</option>
											</select></td>
										<td>
											<center>
					                    	 	<input type="checkbox" name="agreeFive5" value = "on">
					                   	 	</center>
										</td>		
									</tr>
									<tr ng-if="listLength <= 4">
										<td colspan="2"><div class="map_canvas"></div>
											<input type="text" id="geocomplete56" placeholder="Enter Location" class="form-control" name="currentAddress56" style="width: 100%">
											<div id="input_2032e11ww1sas1" style="position: absolute;"></div></td>
										<td><input type="text" name="appxValue56" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="mortgage56" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="rentMo56" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="condoFees56" placeholder="500" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><select name="ownership56"  class="form-control">
											  <option   value="" selected>Select</option>
											   <option value=""""),_display_(/*1742.31*/applicantName),format.raw/*1742.44*/("""">"""),_display_(/*1742.47*/applicantName),format.raw/*1742.60*/("""</option>
											   """),_display_(/*1743.16*/if(coApplicantName!="")/*1743.39*/{_display_(Seq[Any](format.raw/*1743.40*/("""
											    """),format.raw/*1744.16*/("""<option value=""""),_display_(/*1744.32*/coApplicantName),format.raw/*1744.47*/("""">"""),_display_(/*1744.50*/coApplicantName),format.raw/*1744.65*/("""</option>
											    """)))}),format.raw/*1745.17*/("""
											    
											    """),format.raw/*1747.16*/("""<option value="Joint">Joint</option>
											</select></td>
										<td>
											<center>
					                    	 	<input type="checkbox" name="agreeFive6" value = "on">
					                   	 	</center>
										</td>		
									</tr>
									<tr ng-if="listLength <= 4">
										<td colspan="2"><div class="map_canvas"></div>
											<input type="text" id="geocomplete57" placeholder="Enter Location" class="form-control" name="currentAddress57" style="width: 100%">
											<div id="input_2032e11ww1sas1" style="position: absolute;"></div></td>
										<td><input type="text" name="appxValue57" placeholder="500,000"
											 class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="mortgage57" placeholder="500,000" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="rentMo57" placeholder="2,300" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="condoFees57" placeholder="500" class="form-control" onkeypress="return isNumber(event)"></td>
										<td><select name="ownership57"  class="form-control">
											  <option   value="" selected>Select</option>
											    <option value=""""),_display_(/*1769.32*/applicantName),format.raw/*1769.45*/("""">"""),_display_(/*1769.48*/applicantName),format.raw/*1769.61*/("""</option>
											    """),_display_(/*1770.17*/if(coApplicantName!="")/*1770.40*/{_display_(Seq[Any](format.raw/*1770.41*/("""
											    """),format.raw/*1771.16*/("""<option value=""""),_display_(/*1771.32*/coApplicantName),format.raw/*1771.47*/("""">"""),_display_(/*1771.50*/coApplicantName),format.raw/*1771.65*/("""</option>
											    """)))}),format.raw/*1772.17*/("""
											    
											    """),format.raw/*1774.16*/("""<option value="Joint">Joint</option>
											</select></td>
										<td>
											<center>
					                    	 	<input type="checkbox" name="agreeFive7" value = "on">
					                   	 	</center>
										</td>		
									</tr>
									"""),_display_(/*1782.11*/if(propertyList.length >4)/*1782.37*/{_display_(Seq[Any](format.raw/*1782.38*/("""
							
									"""),_display_(/*1784.11*/for((list,index) <-propertyList.zipWithIndex) yield /*1784.56*/{_display_(Seq[Any](format.raw/*1784.57*/("""
									
									"""),format.raw/*1786.10*/("""<tr ng-init="sellingValue="""),_display_(/*1786.37*/list/*1786.41*/.getSelling),format.raw/*1786.52*/(""";">
									<td colspan="2"><div style="padding-left: 0%;">
											<div class="map_canvas"></div>
											<input type="text" id="geocomplete5"""),_display_(/*1789.48*/{index+1}),format.raw/*1789.57*/("""" placeholder="Enter Location" class="form-control" name="currentAddress5"""),_display_(/*1789.131*/{index+1}),format.raw/*1789.140*/("""" style="width: 100%" value=""""),_display_(/*1789.170*/list/*1789.174*/.getName),format.raw/*1789.182*/("""">
											<div id="input_2032e11ww1s1" style="position: absolute;"> </div>
											</div></td>
										<td><input type="text" name="appxValue5"""),_display_(/*1792.51*/{index+1}),format.raw/*1792.60*/("""" placeholder="500,000"
											 class="form-control" value=""""),_display_(/*1793.42*/list/*1793.46*/.getValue),format.raw/*1793.55*/("""" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="mortgage5"""),_display_(/*1795.28*/{index+1}),format.raw/*1795.37*/("""" placeholder="500,000" class="form-control" value=""""),_display_(/*1795.90*/list/*1795.94*/.getMortgageValue),format.raw/*1795.111*/("""" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="rentMo5"""),_display_(/*1797.26*/{index+1}),format.raw/*1797.35*/("""" placeholder="2,300" class="form-control" value=""""),_display_(/*1797.86*/list/*1797.90*/.getMonthlyRent),format.raw/*1797.105*/("""" onkeypress="return isNumber(event)"></td>
										<td><input type="number" data-type="input-number"
											name="condoFees5"""),_display_(/*1799.29*/{index+1}),format.raw/*1799.38*/("""" placeholder="500" class="form-control" value=""""),_display_(/*1799.87*/list/*1799.91*/.getMoCondoFees),format.raw/*1799.106*/("""" onkeypress="return isNumber(event)"></td>
										<td><select name="ownership5"""),_display_(/*1800.40*/{index+1}),format.raw/*1800.49*/("""" class="form-control">
											  	<option value=""""),_display_(/*1801.31*/list/*1801.35*/.getOwnwerShip),format.raw/*1801.49*/("""">"""),_display_(/*1801.52*/list/*1801.56*/.getOwnwerShip),format.raw/*1801.70*/("""</option>
											   <option value=""""),_display_(/*1802.31*/applicantName),format.raw/*1802.44*/("""">"""),_display_(/*1802.47*/applicantName),format.raw/*1802.60*/("""</option>
											   """),_display_(/*1803.16*/if(coApplicantName!="")/*1803.39*/{_display_(Seq[Any](format.raw/*1803.40*/("""
											    """),format.raw/*1804.16*/("""<option value=""""),_display_(/*1804.32*/coApplicantName),format.raw/*1804.47*/("""">"""),_display_(/*1804.50*/coApplicantName),format.raw/*1804.65*/("""</option>
											    """)))}),format.raw/*1805.17*/("""
											    
											    """),format.raw/*1807.16*/("""<option value="Joint">Joint</option>
											</select></td>	
										<td>
											<center>
												<input type="checkbox" name="agreeFive"""),_display_(/*1811.52*/{index+1}),format.raw/*1811.61*/("""" ng-checked=""""),_display_(/*1811.76*/list/*1811.80*/.getSelling),format.raw/*1811.91*/(""";"  value = "on">
					                   	 	</center>
										</td>
									</tr>
									""")))}),format.raw/*1815.11*/("""
									""")))}),format.raw/*1816.11*/("""
								"""),format.raw/*1817.9*/("""</table>
						<br>
						</div>
									
		</div>
		<br>
		 			<div class="row" style="width: 100%;">
								<div class="col-sm-6"
									style="float: left; padding-left: 2%; width: 50%;">
									<a href="mortgageBackPage10" class="btn btn-primary"
										role="button" style="width: 50%;">Back</a>
								</div>
							<div class="col-sm-6" align="right" style="float: right; padding-right:5%; width: 50%;"><input type="submit" class="btn btn-primary btn-block"
								value="Next" style="width: 50%;">
							<div align="right" id="submiterror">
								<font color="red"></font></div>
					  </div>
					<br><br>
				</div>
						<br>
						<div class="container" style="width: 70%;">
						  <div class="progress">
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:95%; background-color: #6AA84F;">
						    <label>95% complete</label>
						    </div>
						  </div>
						</div>
					 </div>
				</div>
				</div>
				<br>
				
</form>
</div>
<script type="text/javascript">
    $(function() """),format.raw/*1852.18*/("""{"""),format.raw/*1852.19*/("""
        """),format.raw/*1853.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*1856.5*/("""}"""),format.raw/*1856.6*/(""");
	
</script>

 <script>
$(document).ready(function()"""),format.raw/*1861.29*/("""{"""),format.raw/*1861.30*/("""
    """),format.raw/*1862.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*1863.1*/("""}"""),format.raw/*1863.2*/(""");
</script>

<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
 
    <script src="jquery.geocomplete.js"></script>
    
    <script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*1873.56*/("""{"""),format.raw/*1873.57*/("""
        """),format.raw/*1874.9*/("""init();
        function init() """),format.raw/*1875.25*/("""{"""),format.raw/*1875.26*/("""
            """),format.raw/*1876.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*1878.41*/("""{"""),format.raw/*1878.42*/("""
                """),format.raw/*1879.17*/("""console.log($scope.newItemType)
            """),format.raw/*1880.13*/("""}"""),format.raw/*1880.14*/(""";
        """),format.raw/*1881.9*/("""}"""),format.raw/*1881.10*/("""
        
        """),format.raw/*1883.9*/("""$scope.calculateDate = function ($scope) """),format.raw/*1883.50*/("""{"""),format.raw/*1883.51*/("""
        	"""),format.raw/*1884.10*/("""$scope.employetotal=0;
        	var one= $scope.movedIn1;
        	var date =one.split("/");
            var oneDate=date[0]+"/1/"+date[2];
            var total=0;
            
            var today = new Date();
    		var datevDate=new Date(oneDate);
    		
    		var one_day=1000*60*60*24;
    		var date1ms=today.getTime();
    		var date2ms=datevDate.getTime();
    		
    		var totmili=date1ms-date2ms;
    		var totalDays=Math.round(totmili/one_day);
    		var totalMonths=Math.abs((totmili/one_day)/30);
    		
    		total=Math.floor(totalMonths); 
    		
    		$scope.applicantTotal1 = total;
             		
    		
    		if(total <36)"""),format.raw/*1906.20*/("""{"""),format.raw/*1906.21*/("""
    			"""),format.raw/*1907.8*/("""one= $scope.movedIn2;
    			date =one.split("/");
                oneDate=date[0]+"/1/"+date[2];
        	   	datevDate=new Date(oneDate);
        	   	
       		 	one_day=1000*60*60*24;
       		 	date1ms=date2ms;
       		
       			date2ms=datevDate.getTime();
       			totmili=date1ms-date2ms;
       			if(isNaN(totmili) == false)"""),format.raw/*1917.38*/("""{"""),format.raw/*1917.39*/("""
       				 
              		"""),format.raw/*1919.17*/("""totalDays=Math.round(totmili/one_day);
              		totalMonths=Math.abs((totmili/one_day)/30);
            		total=total+Math.floor(totalMonths); 
            		$scope.applicantTotal2 = total;
    			
    		"""),format.raw/*1924.7*/("""}"""),format.raw/*1924.8*/("""
       			
    		"""),format.raw/*1926.7*/("""}"""),format.raw/*1926.8*/("""
    		"""),format.raw/*1927.7*/("""/* document.getElementById("applicantTotal2").value=total; */
        """),format.raw/*1928.9*/("""}"""),format.raw/*1928.10*/("""
        
        """),format.raw/*1930.9*/("""$scope.calculateDate2 = function ($scope) """),format.raw/*1930.51*/("""{"""),format.raw/*1930.52*/("""
        	"""),format.raw/*1931.10*/("""$scope.employetotal=0;
        	var one= $scope.CoMovedIn1;
    
        	var date =one.split("/");
            var oneDate=date[0]+"/1/"+date[2];
            var total=0;
            var today = new Date();
    		var datevDate=new Date(oneDate);
    		
    		var one_day=1000*60*60*24;
    		var date1ms=today.getTime();
    		var date2ms=datevDate.getTime();
    		
    		var totmili=date1ms-date2ms;
    		var totalDays=Math.round(totmili/one_day);
    		var totalMonths=Math.abs((totmili/one_day)/30);
    		
    		total=Math.floor(totalMonths); 
    		$scope.coApplicantTotal = total;
    		
    		if(total <36)"""),format.raw/*1951.20*/("""{"""),format.raw/*1951.21*/("""
    			"""),format.raw/*1952.8*/("""one= $scope.CoMovedIn2;
    			date =one.split("/");
                oneDate=date[0]+"/1/"+date[2];
        	   	datevDate=new Date(oneDate);
        	   	
       		 	one_day=1000*60*60*24;
       		 	date1ms=date2ms;
       		
       			date2ms=datevDate.getTime();
       			totmili=date1ms-date2ms;
       			if(isNaN(totmili) == false)"""),format.raw/*1962.38*/("""{"""),format.raw/*1962.39*/("""
       				 
              		"""),format.raw/*1964.17*/("""totalDays=Math.round(totmili/one_day);
              		totalMonths=Math.abs((totmili/one_day)/30);
            		total=total+Math.floor(totalMonths); 
            		$scope.coApplicantTotal2 = total;
    			
    		"""),format.raw/*1969.7*/("""}"""),format.raw/*1969.8*/("""
    		"""),format.raw/*1970.7*/("""}"""),format.raw/*1970.8*/("""
        """),format.raw/*1971.9*/("""}"""),format.raw/*1971.10*/("""
        
		  """),format.raw/*1973.5*/("""$scope.singleModel = 1;
		  var howManyProperties1 = document.forms["myForm"]["howManyProperties123"].value;
          if(howManyProperties1 !="" && howManyProperties1 != null)
		  $scope.noOfProperty = howManyProperties1;
    """),format.raw/*1977.5*/("""}"""),format.raw/*1977.6*/(""");
    </script>
<script src=""""),_display_(/*1979.15*/routes/*1979.21*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*1979.71*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(howManyProperty:String,applicantName:String,coApplicantName:String,propertyList:List[Property]): play.twirl.api.HtmlFormat.Appendable = apply(howManyProperty,applicantName,coApplicantName,propertyList)

  def f:((String,String,String,List[Property]) => play.twirl.api.HtmlFormat.Appendable) = (howManyProperty,applicantName,coApplicantName,propertyList) => apply(howManyProperty,applicantName,coApplicantName,propertyList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:21 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage11Properties.scala.html
                  HASH: aa4e5a580ce699a596c7590a9d7a812c31d5d29e
                  MATRIX: 771->1|958->99|985->100|1443->532|1457->538|1513->574|2159->1193|2174->1199|2239->1243|2296->1273|2311->1279|2378->1325|2461->1380|2490->1381|2519->1383|2602->1439|2630->1440|2659->1442|2693->1449|2722->1450|2751->1452|2796->1470|2824->1471|2855->1475|2926->1518|2955->1519|2985->1522|3128->1638|3156->1639|3185->1641|3220->1649|3249->1650|3279->1653|3326->1673|3354->1674|3384->1677|3426->1691|3455->1692|3485->1695|3661->1844|3689->1845|3718->1847|3774->1875|3803->1876|3833->1879|3889->1908|3917->1909|3947->1912|3995->1932|4024->1933|4054->1936|4740->2595|4768->2596|4798->2599|4852->2625|4881->2626|4911->2629|5024->2715|5052->2716|5081->2718|5136->2745|5165->2746|5195->2749|5332->2859|5360->2860|5390->2863|5463->2908|5492->2909|5522->2912|5564->2927|5579->2933|5634->2967|5692->2998|5707->3004|5762->3038|5814->3062|5843->3063|5874->3066|5988->3151|6018->3152|6060->3165|6120->3197|6150->3198|6220->3239|6250->3240|6292->3253|6350->3282|6380->3283|6426->3300|6497->3342|6527->3343|6566->3354|6596->3355|6705->3435|6735->3436|6769->3442|6818->3463|6847->3464|6907->3495|6937->3496|6977->3508|7144->3647|7173->3648|7206->3653|7302->3720|7332->3721|7363->3724|7534->3866|7564->3867|7603->3877|7758->4004|7787->4005|7819->4009|7848->4010|7879->4013|7956->4062|7985->4063|8019->4069|8081->4102|8111->4103|8149->4113|8257->4192|8287->4193|8328->4205|8493->4342|8522->4343|8554->4347|8584->4348|8619->4355|8707->4415|8736->4416|8769->4421|8883->4506|8913->4507|8954->4519|9119->4656|9148->4657|9180->4661|9210->4662|9245->4669|9333->4729|9362->4730|9394->4734|9501->4812|9531->4813|9571->4824|9735->4960|9764->4961|9796->4965|9825->4966|9859->4972|9947->5032|9976->5033|10008->5037|10108->5108|10138->5109|10178->5120|10342->5256|10371->5257|10403->5261|10432->5262|10466->5268|10554->5328|10583->5329|10613->5331|10720->5409|10750->5410|10787->5419|10947->5551|10976->5552|11008->5556|11037->5557|11066->5558|11149->5613|11178->5614|11211->5619|11325->5704|11355->5705|11396->5717|11561->5854|11590->5855|11622->5859|11652->5860|11687->5867|11775->5927|11804->5928|11838->5934|11867->5935|11901->5941|11963->5974|11993->5975|12029->5983|12159->6084|12189->6085|12230->6097|12393->6232|12422->6233|12454->6237|12484->6238|12519->6245|12605->6303|12634->6304|12667->6309|12782->6395|12812->6396|12853->6408|13018->6545|13047->6546|13079->6550|13109->6551|13144->6558|13232->6618|13261->6619|13293->6623|13422->6723|13452->6724|13493->6736|13655->6870|13684->6871|13716->6875|13746->6876|13781->6883|13866->6940|13895->6941|13927->6945|14031->7020|14061->7021|14102->7033|14264->7167|14293->7168|14325->7172|14355->7173|14390->7180|14475->7237|14504->7238|14540->7246|14653->7330|14683->7331|14723->7342|14883->7474|14912->7475|14944->7479|14973->7480|15007->7486|15091->7542|15120->7543|15160->7555|15289->7655|15319->7656|15360->7668|15522->7802|15551->7803|15583->7807|15613->7808|15648->7815|15733->7872|15762->7873|15798->7881|15928->7982|15958->7983|15999->7995|16162->8130|16191->8131|16223->8135|16253->8136|16288->8143|16374->8201|16403->8202|16436->8207|16551->8293|16581->8294|16622->8306|16786->8442|16815->8443|16847->8447|16877->8448|16912->8455|16999->8514|17028->8515|17060->8519|17170->8600|17200->8601|17241->8613|17403->8747|17432->8748|17464->8752|17494->8753|17529->8760|17614->8817|17643->8818|17675->8822|17779->8897|17809->8898|17850->8910|18012->9044|18041->9045|18073->9049|18103->9050|18138->9057|18223->9114|18252->9115|18288->9123|18401->9207|18431->9208|18472->9220|18634->9354|18663->9355|18695->9359|18725->9360|18760->9367|18845->9424|18874->9425|18906->9429|19021->9515|19051->9516|19092->9528|19256->9664|19285->9665|19317->9669|19347->9670|19382->9677|19469->9736|19498->9737|19533->9744|19562->9745|19596->9751|19660->9786|19690->9787|19722->9791|19852->9892|19882->9893|19923->9905|20087->10041|20116->10042|20148->10046|20178->10047|20213->10054|20300->10113|20329->10114|20366->10123|20481->10209|20511->10210|20552->10222|20717->10359|20746->10360|20778->10364|20808->10365|20843->10372|20931->10432|20960->10433|20993->10438|21128->10544|21158->10545|21200->10558|21362->10692|21391->10693|21424->10697|21454->10698|21490->10706|21574->10762|21603->10763|21642->10774|21748->10851|21778->10852|21821->10866|21987->11004|22016->11005|22049->11009|22079->11010|22116->11019|22203->11078|22233->11079|22274->11092|22390->11179|22420->11180|22464->11195|22635->11338|22664->11339|22697->11343|22727->11344|22766->11354|22858->11417|22888->11418|22942->11444|23071->11544|23101->11545|23142->11557|23307->11694|23336->11695|23368->11699|23398->11700|23433->11707|23521->11767|23550->11768|23586->11776|23716->11877|23746->11878|23787->11890|23952->12027|23981->12028|24013->12032|24043->12033|24078->12040|24166->12100|24195->12101|24232->12110|24347->12196|24377->12197|24418->12209|24583->12346|24612->12347|24644->12351|24674->12352|24709->12359|24797->12419|24826->12420|24865->12431|24976->12513|25006->12514|25048->12527|25214->12665|25243->12666|25276->12670|25306->12671|25342->12679|25430->12739|25459->12740|25498->12751|25604->12828|25634->12829|25677->12843|25843->12981|25872->12982|25905->12986|25935->12987|25972->12996|26059->13055|26089->13056|26129->13068|26245->13155|26275->13156|26319->13171|26490->13314|26519->13315|26552->13319|26582->13320|26621->13330|26713->13393|26743->13394|26776->13399|26891->13485|26921->13486|26962->13498|27127->13635|27156->13636|27188->13640|27218->13641|27253->13648|27341->13708|27370->13709|27406->13717|27536->13818|27566->13819|27607->13831|27770->13966|27799->13967|27831->13971|27861->13972|27896->13979|27982->14037|28011->14038|28048->14047|28163->14133|28193->14134|28234->14146|28397->14281|28426->14282|28458->14286|28488->14287|28523->14294|28609->14352|28638->14353|28670->14357|28780->14438|28810->14439|28851->14451|29015->14587|29044->14588|29076->14592|29106->14593|29141->14600|29228->14659|29257->14660|29289->14664|29393->14739|29423->14740|29464->14752|29626->14886|29655->14887|29687->14891|29717->14892|29752->14899|29837->14956|29866->14957|29898->14961|30011->15045|30041->15046|30082->15058|30247->15195|30276->15196|30308->15200|30338->15201|30373->15208|30461->15268|30490->15269|30529->15280|30644->15366|30674->15367|30715->15379|30878->15514|30907->15515|30939->15519|30969->15520|31004->15527|31090->15585|31119->15586|31154->15593|31183->15594|31217->15600|31280->15634|31310->15635|31346->15643|31476->15744|31506->15745|31547->15757|31718->15900|31747->15901|31779->15905|31809->15906|31844->15913|31938->15979|31967->15980|32000->15985|32115->16071|32145->16072|32186->16084|32349->16219|32378->16220|32410->16224|32440->16225|32475->16232|32561->16290|32590->16291|32623->16296|32754->16398|32784->16399|32825->16411|32989->16547|33018->16548|33050->16552|33080->16553|33115->16560|33202->16619|33231->16620|33263->16624|33367->16699|33397->16700|33438->16712|33600->16846|33629->16847|33661->16851|33691->16852|33726->16859|33811->16916|33840->16917|33872->16921|33985->17005|34015->17006|34056->17018|34221->17155|34250->17156|34282->17160|34312->17161|34347->17168|34435->17228|34464->17229|34512->17249|34645->17353|34675->17354|34716->17366|34879->17501|34908->17502|34940->17506|34970->17507|35005->17514|35091->17572|35120->17573|35156->17581|35286->17682|35316->17683|35357->17695|35520->17830|35549->17831|35581->17835|35611->17836|35646->17843|35732->17901|35761->17902|35794->17907|35909->17993|35939->17994|35980->18006|36144->18142|36173->18143|36205->18147|36235->18148|36270->18155|36357->18214|36386->18215|36419->18220|36552->18324|36582->18325|36623->18337|36787->18473|36816->18474|36848->18478|36878->18479|36913->18486|37000->18545|37029->18546|37065->18554|37171->18631|37201->18632|37242->18644|37404->18778|37433->18779|37465->18783|37495->18784|37530->18791|37615->18848|37644->18849|37676->18853|37789->18937|37819->18938|37860->18950|38025->19087|38054->19088|38086->19092|38116->19093|38151->19100|38239->19160|38268->19161|38316->19181|38448->19284|38478->19285|38519->19297|38683->19433|38712->19434|38744->19438|38774->19439|38809->19446|38896->19505|38925->19506|38961->19514|39091->19615|39121->19616|39162->19628|39326->19764|39355->19765|39387->19769|39417->19770|39452->19777|39539->19836|39568->19837|39601->19842|39716->19928|39746->19929|39787->19941|39952->20078|39981->20079|40013->20083|40043->20084|40078->20091|40166->20151|40195->20152|40227->20156|40358->20258|40388->20259|40429->20271|40593->20407|40622->20408|40654->20412|40684->20413|40719->20420|40806->20479|40835->20480|40867->20484|40971->20559|41001->20560|41042->20572|41204->20706|41233->20707|41265->20711|41295->20712|41330->20719|41415->20776|41444->20777|41480->20785|41593->20869|41623->20870|41664->20882|41829->21019|41858->21020|41890->21024|41920->21025|41955->21032|42043->21092|42072->21093|42125->21118|42254->21218|42284->21219|42325->21231|42490->21368|42519->21369|42551->21373|42581->21374|42616->21381|42704->21441|42733->21442|42769->21450|42899->21551|42929->21552|42970->21564|43136->21702|43165->21703|43197->21707|43227->21708|43262->21715|43351->21776|43380->21777|43413->21782|43528->21868|43558->21869|43599->21881|43763->22017|43792->22018|43824->22022|43854->22023|43889->22030|43976->22089|44005->22090|44039->22096|44172->22200|44202->22201|44243->22213|44407->22349|44436->22350|44468->22354|44498->22355|44533->22362|44620->22421|44649->22422|44681->22426|44785->22501|44815->22502|44856->22514|45018->22648|45047->22649|45079->22653|45109->22654|45144->22661|45229->22718|45258->22719|45298->22731|45411->22815|45441->22816|45482->22828|45647->22965|45676->22966|45708->22970|45738->22971|45773->22978|45861->23038|45890->23039|45947->23068|46077->23169|46107->23170|46148->23182|46312->23318|46341->23319|46373->23323|46403->23324|46438->23331|46525->23390|46554->23391|46589->23398|46618->23399|46652->23405|46695->23420|46724->23421|46753->23422|46819->23459|46849->23460|46885->23468|46945->23499|46975->23500|47018->23514|47091->23558|47121->23559|47210->23619|47240->23620|47283->23634|47514->23836|47544->23837|47632->23896|47662->23897|47705->23911|47770->23947|47800->23948|47892->24011|47922->24012|47964->24025|48059->24091|48089->24092|48129->24104|48158->24105|48235->24153|48265->24154|48299->24160|48360->24192|48390->24193|48431->24205|48501->24247|48530->24248|48617->24306|48647->24307|48688->24319|48913->24516|48942->24517|49028->24574|49058->24575|49099->24587|49161->24621|49190->24622|49280->24683|49310->24684|49350->24695|49442->24759|49471->24760|49511->24772|49540->24773|49623->24827|49653->24828|49689->24836|49750->24868|49780->24869|49823->24883|49896->24927|49926->24928|50015->24988|50045->24989|50088->25003|50320->25206|50350->25207|50438->25266|50468->25267|50511->25281|50576->25317|50606->25318|50698->25381|50728->25382|50770->25395|50865->25461|50895->25462|50932->25471|50961->25472|51045->25527|51075->25528|51109->25534|51169->25565|51199->25566|51240->25578|51310->25620|51339->25621|51426->25679|51456->25680|51497->25692|51721->25888|51750->25889|51836->25946|51866->25947|51907->25959|51969->25993|51998->25994|52088->26055|52118->26056|52158->26067|52250->26131|52279->26132|52316->26141|52345->26142|52422->26190|52452->26191|52488->26199|52548->26230|52578->26231|52621->26245|52694->26289|52724->26290|52813->26350|52843->26351|52886->26365|53117->26567|53147->26568|53235->26627|53265->26628|53308->26642|53373->26678|53403->26679|53495->26742|53525->26743|53567->26756|53662->26822|53692->26823|53730->26833|53759->26834|53834->26880|53864->26881|53898->26887|53958->26918|53988->26919|54029->26931|54099->26973|54128->26974|54215->27032|54245->27033|54286->27045|54510->27241|54539->27242|54625->27299|54655->27300|54696->27312|54758->27346|54787->27347|54877->27408|54907->27409|54947->27420|55039->27484|55068->27485|55107->27496|55136->27497|55214->27546|55244->27547|55280->27555|55341->27587|55371->27588|55414->27602|55487->27646|55517->27647|55606->27707|55636->27708|55679->27722|55911->27925|55941->27926|56029->27985|56059->27986|56102->28000|56167->28036|56197->28037|56289->28100|56319->28101|56361->28114|56456->28180|56486->28181|56525->28192|56554->28193|56631->28241|56661->28242|56695->28248|56756->28280|56786->28281|56827->28293|56897->28335|56926->28336|57013->28394|57043->28395|57084->28407|57309->28604|57338->28605|57424->28662|57454->28663|57495->28675|57557->28709|57586->28710|57676->28771|57706->28772|57746->28783|57838->28847|57867->28848|57908->28861|57937->28862|58014->28910|58044->28911|58080->28919|58141->28951|58171->28952|58214->28966|58287->29010|58317->29011|58406->29071|58436->29072|58479->29086|58711->29289|58741->29290|58829->29349|58859->29350|58902->29364|58967->29400|58997->29401|59089->29464|59119->29465|59161->29478|59256->29544|59286->29545|59323->29554|59352->29555|59429->29603|59459->29604|59493->29610|59554->29642|59584->29643|59625->29655|59695->29697|59724->29698|59811->29756|59841->29757|59882->29769|60107->29966|60136->29967|60222->30024|60252->30025|60293->30037|60355->30071|60384->30072|60474->30133|60504->30134|60544->30145|60636->30209|60665->30210|60704->30221|60733->30222|60818->30278|60848->30279|60884->30287|60945->30319|60975->30320|61018->30334|61091->30378|61121->30379|61210->30439|61240->30440|61283->30454|61515->30657|61545->30658|61633->30717|61663->30718|61706->30732|61771->30768|61801->30769|61893->30832|61923->30833|61965->30846|62060->30912|62090->30913|62128->30923|62157->30924|62234->30972|62264->30973|62299->30980|62360->31012|62390->31013|62431->31025|62501->31067|62530->31068|62617->31126|62647->31127|62688->31139|62913->31336|62942->31337|63028->31394|63058->31395|63099->31407|63161->31441|63190->31442|63280->31503|63310->31504|63350->31515|63442->31579|63471->31580|63510->31591|63539->31592|63622->31646|63652->31647|63688->31655|63749->31687|63779->31688|63822->31702|63895->31746|63925->31747|64014->31807|64044->31808|64087->31822|64319->32025|64349->32026|64437->32085|64467->32086|64510->32100|64575->32136|64605->32137|64697->32200|64727->32201|64769->32214|64864->32280|64894->32281|64933->32292|64962->32293|65040->32342|65070->32343|65105->32350|65166->32382|65196->32383|65237->32395|65307->32437|65336->32438|65423->32496|65453->32497|65494->32509|65719->32706|65748->32707|65834->32764|65864->32765|65905->32777|65967->32811|65996->32812|66086->32873|66116->32874|66156->32885|66248->32949|66277->32950|66316->32961|66345->32962|66423->33011|66453->33012|66489->33020|66550->33052|66580->33053|66623->33067|66696->33111|66726->33112|66815->33172|66845->33173|66888->33187|67120->33390|67150->33391|67238->33450|67268->33451|67311->33465|67376->33501|67406->33502|67498->33565|67528->33566|67570->33579|67665->33645|67695->33646|67734->33657|67763->33658|67841->33707|67871->33708|67906->33715|67967->33747|67997->33748|68038->33760|68108->33802|68137->33803|68224->33861|68254->33862|68295->33874|68520->34071|68549->34072|68635->34129|68665->34130|68706->34142|68768->34176|68797->34177|68887->34238|68917->34239|68957->34250|69049->34314|69078->34315|69117->34326|69146->34327|69224->34376|69254->34377|69290->34385|69351->34417|69381->34418|69424->34432|69497->34476|69527->34477|69616->34537|69646->34538|69689->34552|69921->34755|69951->34756|70039->34815|70069->34816|70112->34830|70177->34866|70207->34867|70299->34930|70329->34931|70371->34944|70466->35010|70496->35011|70535->35022|70564->35023|70650->35080|70680->35081|70717->35090|70905->35249|70935->35250|70975->35261|71088->35346|71118->35347|71155->35356|71200->35373|71229->35374|71262->35379|71488->35577|71504->35583|71568->35625|71612->35641|71628->35647|71691->35688|71779->35748|71795->35754|71856->35793|71933->35842|71949->35848|72005->35882|72082->35931|72098->35937|72157->35974|72367->36156|72404->36171|72497->36236|72532->36249|72617->36306|72654->36321|73047->36686|73063->36692|73125->36732|73340->36919|73362->36931|73391->36938|75431->38948|75462->38949|75493->38950|75535->38962|75566->38963|75597->38964|77700->41038|77736->41051|77768->41054|77804->41067|77859->41093|77893->41116|77934->41117|77980->41133|78025->41149|78063->41164|78095->41167|78133->41182|78192->41208|78238->41224|78658->41615|78700->41639|78741->41640|78782->41651|79044->41883|79060->41887|79092->41895|79331->42105|79346->42109|79378->42118|79662->42373|79677->42377|79718->42394|80016->42663|80031->42667|80069->42682|80349->42933|80364->42937|80402->42952|80639->43160|80654->43164|80691->43178|80723->43181|80738->43185|80775->43199|80845->43240|80881->43253|80913->43256|80949->43269|81006->43297|81040->43320|81081->43321|81127->43337|81172->43353|81210->43368|81242->43371|81280->43386|81339->43412|81416->43459|81620->43634|81635->43638|81669->43649|81799->43746|81839->43756|83993->45881|84029->45894|84061->45897|84097->45910|84154->45938|84188->45961|84229->45962|84275->45978|84320->45994|84358->46009|84390->46012|84428->46027|84487->46053|84549->46085|86408->47915|86444->47928|86476->47931|86512->47944|86567->47970|86601->47993|86642->47994|86688->48010|86733->48026|86771->48041|86803->48044|86841->48059|86900->48085|86962->48117|87393->48519|87430->48545|87471->48546|87512->48558|87575->48603|87616->48604|87656->48614|87712->48641|87727->48645|87761->48656|87940->48806|87972->48815|88076->48889|88109->48898|88169->48928|88185->48932|88217->48940|88390->49084|88422->49093|88516->49158|88531->49162|88563->49171|88723->49302|88755->49311|88837->49364|88852->49368|88893->49385|89051->49514|89083->49523|89163->49574|89178->49578|89217->49593|89378->49725|89410->49734|89488->49783|89503->49787|89542->49802|89654->49885|89686->49894|89769->49948|89784->49952|89821->49966|89853->49969|89868->49973|89905->49987|89975->50028|90011->50041|90043->50044|90079->50057|90134->50083|90168->50106|90209->50107|90255->50123|90300->50139|90338->50154|90370->50157|90408->50172|90467->50198|90513->50214|90723->50395|90755->50404|90814->50433|90830->50437|90865->50448|91015->50565|91059->50576|91097->50585|93203->52662|93239->52675|93271->52678|93307->52691|93362->52717|93396->52740|93437->52741|93483->52757|93528->52773|93566->52788|93598->52791|93636->52806|93695->52832|93757->52864|95557->54635|95593->54648|95625->54651|95661->54664|95716->54690|95750->54713|95791->54714|95837->54730|95882->54746|95920->54761|95952->54764|95990->54779|96049->54805|96111->54837|97905->56602|97941->56615|97973->56618|98009->56631|98064->56657|98098->56680|98139->56681|98185->56697|98230->56713|98268->56728|98300->56731|98338->56746|98397->56772|98459->56804|98787->57103|98824->57129|98865->57130|98914->57150|98977->57195|99018->57196|99068->57216|99124->57243|99139->57247|99173->57258|99359->57415|99391->57424|99495->57498|99528->57507|99588->57537|99604->57541|99636->57549|99811->57695|99843->57704|99937->57769|99952->57773|99984->57782|100144->57913|100176->57922|100258->57975|100273->57979|100314->57996|100473->58126|100505->58135|100585->58186|100600->58190|100639->58205|100800->58337|100832->58346|100910->58395|100925->58399|100964->58414|101076->58497|101108->58506|101192->58561|101207->58565|101244->58579|101276->58582|101291->58586|101328->58600|101398->58641|101434->58654|101466->58657|101502->58670|101557->58696|101591->58719|101632->58720|101678->58736|101723->58752|101761->58767|101793->58770|101831->58785|101890->58811|101968->58859|102152->59014|102184->59023|102243->59052|102259->59056|102294->59067|102428->59168|102472->59179|102510->59188|104564->61213|104600->61226|104632->61229|104668->61242|104723->61268|104757->61291|104798->61292|104844->61308|104889->61324|104927->61339|104959->61342|104997->61357|105056->61383|105118->61415|106854->63122|106890->63135|106922->63138|106958->63151|107012->63176|107046->63199|107087->63200|107133->63216|107178->63232|107216->63247|107248->63250|107286->63265|107345->63291|107407->63323|109152->65039|109188->65052|109220->65055|109256->65068|109311->65094|109345->65117|109386->65118|109432->65134|109477->65150|109515->65165|109547->65168|109585->65183|109644->65209|109706->65241|111451->66957|111487->66970|111519->66973|111555->66986|111610->67012|111644->67035|111685->67036|111731->67052|111776->67068|111814->67083|111846->67086|111884->67101|111943->67127|112005->67159|112310->67435|112347->67461|112388->67462|112437->67482|112500->67527|112541->67528|112591->67548|112647->67575|112662->67579|112696->67590|112875->67740|112907->67749|113011->67823|113044->67832|113104->67862|113120->67866|113152->67874|113333->68026|113365->68035|113459->68100|113474->68104|113506->68113|113666->68244|113698->68253|113780->68306|113795->68310|113836->68327|113994->68456|114026->68465|114106->68516|114121->68520|114160->68535|114321->68667|114353->68676|114431->68725|114446->68729|114485->68744|114597->68827|114629->68836|114712->68890|114727->68894|114764->68908|114796->68911|114811->68915|114848->68929|114918->68970|114954->68983|114986->68986|115022->68999|115077->69025|115111->69048|115152->69049|115198->69065|115243->69081|115281->69096|115313->69099|115351->69114|115410->69140|115472->69172|115632->69303|115647->69307|115681->69318|115744->69352|115776->69361|115906->69458|115949->69468|115988->69478|117713->71174|117749->71187|117781->71190|117817->71203|117871->71228|117905->71251|117946->71252|117992->71268|118037->71284|118075->71299|118107->71302|118145->71317|118204->71343|118266->71375|119704->72784|119740->72797|119772->72800|119808->72813|119863->72839|119897->72862|119938->72863|119984->72879|120029->72895|120067->72910|120099->72913|120137->72928|120196->72954|120258->72986|121675->74374|121711->74387|121743->74390|121779->74403|121834->74429|121868->74452|121909->74453|121955->74469|122000->74485|122038->74500|122070->74503|122108->74518|122167->74544|122229->74576|123645->75963|123681->75976|123713->75979|123749->75992|123803->76017|123837->76040|123878->76041|123924->76057|123969->76073|124007->76088|124039->76091|124077->76106|124136->76132|124198->76164|125614->77551|125650->77564|125682->77567|125718->77580|125772->77605|125806->77628|125847->77629|125893->77645|125938->77661|125976->77676|126008->77679|126046->77694|126105->77720|126167->77752|127583->79139|127619->79152|127651->79155|127687->79168|127741->79193|127775->79216|127816->79217|127862->79233|127907->79249|127945->79264|127977->79267|128015->79282|128074->79308|128136->79340|129553->80728|129589->80741|129621->80744|129657->80757|129712->80783|129746->80806|129787->80807|129833->80823|129878->80839|129916->80854|129948->80857|129986->80872|130045->80898|130107->80930|130397->81191|130434->81217|130475->81218|130523->81237|130586->81282|130627->81283|130677->81303|130733->81330|130748->81334|130782->81345|130961->81495|130993->81504|131097->81578|131130->81587|131190->81617|131206->81621|131238->81629|131419->81781|131451->81790|131545->81855|131560->81859|131592->81868|131752->81999|131784->82008|131866->82061|131881->82065|131922->82082|132080->82211|132112->82220|132192->82271|132207->82275|132246->82290|132407->82422|132439->82431|132517->82480|132532->82484|132571->82499|132683->82582|132715->82591|132798->82645|132813->82649|132850->82663|132882->82666|132897->82670|132934->82684|133003->82724|133039->82737|133071->82740|133107->82753|133161->82778|133195->82801|133236->82802|133282->82818|133327->82834|133365->82849|133397->82852|133435->82867|133494->82893|133556->82925|133735->83075|133767->83084|133811->83099|133826->83103|133860->83114|133989->83210|134033->83221|134071->83230|135188->84317|135219->84318|135257->84327|135373->84414|135403->84415|135487->84469|135518->84470|135552->84475|135624->84518|135654->84519|136004->84839|136035->84840|136073->84849|136135->84881|136166->84882|136209->84895|136335->84991|136366->84992|136413->85009|136487->85053|136518->85054|136557->85064|136588->85065|136635->85083|136706->85124|136737->85125|136777->85135|137451->85779|137482->85780|137519->85788|137886->86125|137917->86126|137977->86156|138217->86367|138247->86368|138294->86386|138324->86387|138360->86394|138459->86464|138490->86465|138537->86483|138609->86525|138640->86526|138680->86536|139326->87152|139357->87153|139394->87161|139763->87500|139794->87501|139854->87531|140096->87744|140126->87745|140162->87752|140192->87753|140230->87762|140261->87763|140304->87777|140560->88004|140590->88005|140650->88036|140667->88042|140740->88092
                  LINES: 26->1|29->1|30->2|37->9|37->9|37->9|48->20|48->20|48->20|49->21|49->21|49->21|51->23|51->23|52->24|54->26|54->26|55->27|55->27|55->27|56->28|57->29|57->29|59->31|60->32|60->32|61->33|66->38|66->38|68->40|68->40|68->40|69->41|70->42|70->42|73->45|73->45|73->45|74->46|84->56|84->56|86->58|88->60|88->60|89->61|91->63|91->63|93->65|93->65|93->65|94->66|107->79|107->79|109->81|109->81|109->81|110->82|113->85|113->85|115->87|115->87|115->87|116->88|121->93|121->93|124->96|124->96|124->96|125->97|125->97|125->97|125->97|127->99|127->99|127->99|129->101|129->101|132->104|135->107|135->107|136->108|137->109|137->109|139->111|139->111|140->112|140->112|140->112|141->113|142->114|142->114|143->115|143->115|146->118|146->118|147->119|148->120|148->120|149->121|149->121|150->122|152->124|152->124|153->125|156->128|156->128|157->129|158->130|158->130|159->131|161->133|161->133|161->133|161->133|162->134|163->135|163->135|165->137|165->137|165->137|167->139|168->140|168->140|169->141|171->143|171->143|171->143|171->143|172->144|173->145|173->145|175->147|176->148|176->148|177->149|179->151|179->151|179->151|179->151|180->152|181->153|181->153|182->154|183->155|183->155|184->156|186->158|186->158|186->158|186->158|187->159|188->160|188->160|189->161|190->162|190->162|191->163|193->165|193->165|193->165|193->165|194->166|195->167|195->167|196->168|197->169|197->169|198->170|200->172|200->172|200->172|200->172|201->173|202->174|202->174|203->175|204->176|204->176|205->177|207->179|207->179|207->179|207->179|208->180|209->181|209->181|211->183|211->183|213->185|213->185|213->185|215->187|216->188|216->188|217->189|219->191|219->191|219->191|219->191|220->192|221->193|221->193|223->195|224->196|224->196|225->197|227->199|227->199|227->199|227->199|228->200|229->201|229->201|230->202|232->204|232->204|233->205|235->207|235->207|235->207|235->207|236->208|237->209|237->209|238->210|239->211|239->211|240->212|242->214|242->214|242->214|242->214|243->215|244->216|244->216|246->218|247->219|247->219|248->220|250->222|250->222|250->222|250->222|251->223|252->224|252->224|255->227|257->229|257->229|258->230|260->232|260->232|260->232|260->232|261->233|262->234|262->234|264->236|265->237|265->237|266->238|268->240|268->240|268->240|268->240|269->241|270->242|270->242|272->244|273->245|273->245|274->246|276->248|276->248|276->248|276->248|277->249|278->250|278->250|279->251|280->252|280->252|281->253|283->255|283->255|283->255|283->255|284->256|285->257|285->257|286->258|287->259|287->259|288->260|290->262|290->262|290->262|290->262|291->263|292->264|292->264|294->266|295->267|295->267|296->268|298->270|298->270|298->270|298->270|299->271|300->272|300->272|301->273|302->274|302->274|303->275|305->277|305->277|305->277|305->277|306->278|307->279|307->279|309->281|309->281|311->283|311->283|311->283|312->284|313->285|313->285|314->286|316->288|316->288|316->288|316->288|317->289|318->290|318->290|320->292|321->293|321->293|322->294|324->296|324->296|324->296|324->296|325->297|326->298|326->298|327->299|330->302|330->302|331->303|333->305|333->305|333->305|333->305|334->306|335->307|335->307|337->309|338->310|338->310|339->311|341->313|341->313|341->313|341->313|342->314|343->315|343->315|345->317|346->318|346->318|347->319|349->321|349->321|349->321|349->321|350->322|351->323|351->323|355->327|357->329|357->329|358->330|360->332|360->332|360->332|360->332|361->333|362->334|362->334|364->336|365->337|365->337|366->338|368->340|368->340|368->340|368->340|369->341|370->342|370->342|372->344|373->345|373->345|374->346|376->348|376->348|376->348|376->348|377->349|378->350|378->350|380->352|381->353|381->353|382->354|384->356|384->356|384->356|384->356|385->357|386->358|386->358|388->360|389->361|389->361|390->362|392->364|392->364|392->364|392->364|393->365|394->366|394->366|396->368|397->369|397->369|398->370|400->372|400->372|400->372|400->372|401->373|402->374|402->374|403->375|404->376|404->376|405->377|407->379|407->379|407->379|407->379|408->380|409->381|409->381|411->383|412->384|412->384|413->385|415->387|415->387|415->387|415->387|416->388|417->389|417->389|419->391|420->392|420->392|421->393|423->395|423->395|423->395|423->395|424->396|425->397|425->397|426->398|427->399|427->399|428->400|430->402|430->402|430->402|430->402|431->403|432->404|432->404|433->405|434->406|434->406|435->407|437->409|437->409|437->409|437->409|438->410|439->411|439->411|440->412|441->413|441->413|442->414|444->416|444->416|444->416|444->416|445->417|446->418|446->418|448->420|449->421|449->421|450->422|452->424|452->424|452->424|452->424|453->425|454->426|454->426|456->428|456->428|458->430|458->430|458->430|460->432|461->433|461->433|462->434|464->436|464->436|464->436|464->436|465->437|466->438|466->438|468->440|469->441|469->441|470->442|472->444|472->444|472->444|472->444|473->445|474->446|474->446|475->447|477->449|477->449|478->450|480->452|480->452|480->452|480->452|481->453|482->454|482->454|483->455|484->456|484->456|485->457|487->459|487->459|487->459|487->459|488->460|489->461|489->461|490->462|491->463|491->463|492->464|494->466|494->466|494->466|494->466|495->467|496->468|496->468|500->472|503->475|503->475|504->476|506->478|506->478|506->478|506->478|507->479|508->480|508->480|510->482|511->483|511->483|512->484|514->486|514->486|514->486|514->486|515->487|516->488|516->488|518->490|519->491|519->491|520->492|522->494|522->494|522->494|522->494|523->495|524->496|524->496|525->497|527->499|527->499|528->500|530->502|530->502|530->502|530->502|531->503|532->504|532->504|534->506|535->507|535->507|536->508|538->510|538->510|538->510|538->510|539->511|540->512|540->512|541->513|542->514|542->514|543->515|545->517|545->517|545->517|545->517|546->518|547->519|547->519|551->523|553->525|553->525|554->526|556->528|556->528|556->528|556->528|557->529|558->530|558->530|560->532|561->533|561->533|562->534|564->536|564->536|564->536|564->536|565->537|566->538|566->538|568->540|569->541|569->541|570->542|572->544|572->544|572->544|572->544|573->545|574->546|574->546|575->547|577->549|577->549|578->550|580->552|580->552|580->552|580->552|581->553|582->554|582->554|583->555|584->556|584->556|585->557|587->559|587->559|587->559|587->559|588->560|589->561|589->561|591->563|592->564|592->564|593->565|595->567|595->567|595->567|595->567|596->568|597->569|597->569|602->574|604->576|604->576|605->577|607->579|607->579|607->579|607->579|608->580|609->581|609->581|611->583|612->584|612->584|613->585|615->587|615->587|615->587|615->587|616->588|617->589|617->589|619->591|620->592|620->592|621->593|623->595|623->595|623->595|623->595|624->596|625->597|625->597|626->598|628->600|628->600|629->601|631->603|631->603|631->603|631->603|632->604|633->605|633->605|634->606|635->607|635->607|636->608|638->610|638->610|638->610|638->610|639->611|640->612|640->612|643->615|644->616|644->616|645->617|647->619|647->619|647->619|647->619|648->620|649->621|649->621|654->626|656->628|656->628|657->629|659->631|659->631|659->631|659->631|660->632|661->633|661->633|663->635|663->635|665->637|666->638|666->638|667->639|669->641|669->641|670->642|670->642|670->642|671->643|672->644|672->644|673->645|673->645|674->646|677->649|677->649|678->650|678->650|679->651|680->652|680->652|681->653|681->653|682->654|683->655|683->655|684->656|684->656|687->659|687->659|688->660|688->660|688->660|689->661|690->662|690->662|691->663|691->663|692->664|695->667|695->667|696->668|696->668|697->669|698->670|698->670|699->671|699->671|700->672|701->673|701->673|702->674|702->674|706->678|706->678|707->679|707->679|707->679|708->680|709->681|709->681|710->682|710->682|711->683|714->686|714->686|715->687|715->687|716->688|717->689|717->689|718->690|718->690|719->691|720->692|720->692|721->693|721->693|725->697|725->697|726->698|726->698|726->698|727->699|728->700|728->700|729->701|729->701|730->702|733->705|733->705|734->706|734->706|735->707|736->708|736->708|737->709|737->709|738->710|739->711|739->711|740->712|740->712|743->715|743->715|744->716|744->716|744->716|745->717|746->718|746->718|747->719|747->719|748->720|751->723|751->723|752->724|752->724|753->725|754->726|754->726|755->727|755->727|756->728|757->729|757->729|758->730|758->730|761->733|761->733|762->734|762->734|762->734|763->735|764->736|764->736|765->737|765->737|766->738|769->741|769->741|770->742|770->742|771->743|772->744|772->744|773->745|773->745|774->746|775->747|775->747|776->748|776->748|779->751|779->751|780->752|780->752|780->752|781->753|782->754|782->754|783->755|783->755|784->756|787->759|787->759|788->760|788->760|789->761|790->762|790->762|791->763|791->763|792->764|793->765|793->765|794->766|794->766|797->769|797->769|798->770|798->770|798->770|799->771|800->772|800->772|801->773|801->773|802->774|805->777|805->777|806->778|806->778|807->779|808->780|808->780|809->781|809->781|810->782|811->783|811->783|812->784|812->784|815->787|815->787|816->788|816->788|816->788|817->789|818->790|818->790|819->791|819->791|820->792|823->795|823->795|824->796|824->796|825->797|826->798|826->798|827->799|827->799|828->800|829->801|829->801|830->802|830->802|833->805|833->805|834->806|834->806|834->806|835->807|836->808|836->808|837->809|837->809|838->810|841->813|841->813|842->814|842->814|843->815|844->816|844->816|845->817|845->817|846->818|847->819|847->819|848->820|848->820|852->824|852->824|853->825|853->825|853->825|854->826|855->827|855->827|856->828|856->828|857->829|860->832|860->832|861->833|861->833|862->834|863->835|863->835|864->836|864->836|865->837|866->838|866->838|867->839|867->839|870->842|870->842|871->843|871->843|871->843|872->844|873->845|873->845|874->846|874->846|875->847|878->850|878->850|879->851|879->851|880->852|881->853|881->853|882->854|882->854|883->855|884->856|884->856|885->857|885->857|889->861|889->861|890->862|890->862|890->862|891->863|892->864|892->864|893->865|893->865|894->866|897->869|897->869|898->870|898->870|899->871|900->872|900->872|901->873|901->873|902->874|903->875|903->875|904->876|904->876|907->879|907->879|908->880|908->880|908->880|909->881|910->882|910->882|911->883|911->883|912->884|915->887|915->887|916->888|916->888|917->889|918->890|918->890|919->891|919->891|920->892|921->893|921->893|922->894|922->894|925->897|925->897|926->898|926->898|926->898|927->899|928->900|928->900|929->901|929->901|930->902|933->905|933->905|934->906|934->906|935->907|936->908|936->908|937->909|937->909|938->910|939->911|939->911|940->912|940->912|943->915|943->915|944->916|944->916|944->916|945->917|946->918|946->918|947->919|947->919|948->920|951->923|951->923|952->924|952->924|953->925|954->926|954->926|955->927|955->927|956->928|957->929|957->929|958->930|958->930|961->933|961->933|962->934|962->934|962->934|963->935|964->936|964->936|965->937|965->937|966->938|969->941|969->941|970->942|970->942|971->943|972->944|972->944|973->945|973->945|974->946|975->947|975->947|976->948|976->948|979->951|979->951|980->952|982->954|982->954|983->955|985->957|985->957|986->958|987->959|987->959|988->960|992->964|992->964|992->964|993->965|993->965|993->965|994->966|994->966|994->966|995->967|995->967|995->967|996->968|996->968|996->968|1004->976|1004->976|1006->978|1006->978|1007->979|1007->979|1018->990|1018->990|1018->990|1022->994|1022->994|1022->994|1060->1032|1060->1032|1060->1032|1060->1032|1060->1032|1060->1032|1097->1069|1097->1069|1097->1069|1097->1069|1098->1070|1098->1070|1098->1070|1099->1071|1099->1071|1099->1071|1099->1071|1099->1071|1100->1072|1101->1073|1112->1084|1112->1084|1112->1084|1113->1085|1115->1087|1115->1087|1115->1087|1119->1091|1119->1091|1119->1091|1122->1094|1122->1094|1122->1094|1126->1098|1126->1098|1126->1098|1129->1101|1129->1101|1129->1101|1132->1104|1132->1104|1132->1104|1132->1104|1132->1104|1132->1104|1133->1105|1133->1105|1133->1105|1133->1105|1134->1106|1134->1106|1134->1106|1135->1107|1135->1107|1135->1107|1135->1107|1135->1107|1136->1108|1139->1111|1143->1115|1143->1115|1143->1115|1146->1118|1147->1119|1184->1156|1184->1156|1184->1156|1184->1156|1185->1157|1185->1157|1185->1157|1186->1158|1186->1158|1186->1158|1186->1158|1186->1158|1187->1159|1189->1161|1222->1194|1222->1194|1222->1194|1222->1194|1223->1195|1223->1195|1223->1195|1224->1196|1224->1196|1224->1196|1224->1196|1224->1196|1225->1197|1227->1199|1239->1211|1239->1211|1239->1211|1240->1212|1240->1212|1240->1212|1241->1213|1241->1213|1241->1213|1241->1213|1244->1216|1244->1216|1244->1216|1244->1216|1244->1216|1244->1216|1244->1216|1247->1219|1247->1219|1248->1220|1248->1220|1248->1220|1250->1222|1250->1222|1250->1222|1250->1222|1250->1222|1252->1224|1252->1224|1252->1224|1252->1224|1252->1224|1254->1226|1254->1226|1254->1226|1254->1226|1254->1226|1255->1227|1255->1227|1256->1228|1256->1228|1256->1228|1256->1228|1256->1228|1256->1228|1257->1229|1257->1229|1257->1229|1257->1229|1258->1230|1258->1230|1258->1230|1259->1231|1259->1231|1259->1231|1259->1231|1259->1231|1260->1232|1261->1233|1266->1238|1266->1238|1266->1238|1266->1238|1266->1238|1271->1243|1272->1244|1273->1245|1309->1281|1309->1281|1309->1281|1309->1281|1310->1282|1310->1282|1310->1282|1311->1283|1311->1283|1311->1283|1311->1283|1311->1283|1312->1284|1314->1286|1343->1315|1343->1315|1343->1315|1343->1315|1344->1316|1344->1316|1344->1316|1345->1317|1345->1317|1345->1317|1345->1317|1345->1317|1346->1318|1348->1320|1377->1349|1377->1349|1377->1349|1377->1349|1378->1350|1378->1350|1378->1350|1379->1351|1379->1351|1379->1351|1379->1351|1379->1351|1380->1352|1382->1354|1390->1362|1390->1362|1390->1362|1392->1364|1392->1364|1392->1364|1394->1366|1394->1366|1394->1366|1394->1366|1398->1370|1398->1370|1398->1370|1398->1370|1398->1370|1398->1370|1398->1370|1401->1373|1401->1373|1402->1374|1402->1374|1402->1374|1404->1376|1404->1376|1404->1376|1404->1376|1404->1376|1406->1378|1406->1378|1406->1378|1406->1378|1406->1378|1408->1380|1408->1380|1408->1380|1408->1380|1408->1380|1409->1381|1409->1381|1410->1382|1410->1382|1410->1382|1410->1382|1410->1382|1410->1382|1411->1383|1411->1383|1411->1383|1411->1383|1412->1384|1412->1384|1412->1384|1413->1385|1413->1385|1413->1385|1413->1385|1413->1385|1414->1386|1417->1389|1420->1392|1420->1392|1420->1392|1420->1392|1420->1392|1424->1396|1425->1397|1426->1398|1462->1434|1462->1434|1462->1434|1462->1434|1463->1435|1463->1435|1463->1435|1464->1436|1464->1436|1464->1436|1464->1436|1464->1436|1465->1437|1467->1439|1494->1466|1494->1466|1494->1466|1494->1466|1495->1467|1495->1467|1495->1467|1496->1468|1496->1468|1496->1468|1496->1468|1496->1468|1497->1469|1499->1471|1526->1498|1526->1498|1526->1498|1526->1498|1527->1499|1527->1499|1527->1499|1528->1500|1528->1500|1528->1500|1528->1500|1528->1500|1529->1501|1531->1503|1558->1530|1558->1530|1558->1530|1558->1530|1559->1531|1559->1531|1559->1531|1560->1532|1560->1532|1560->1532|1560->1532|1560->1532|1561->1533|1563->1535|1570->1542|1570->1542|1570->1542|1572->1544|1572->1544|1572->1544|1574->1546|1574->1546|1574->1546|1574->1546|1577->1549|1577->1549|1577->1549|1577->1549|1577->1549|1577->1549|1577->1549|1580->1552|1580->1552|1581->1553|1581->1553|1581->1553|1583->1555|1583->1555|1583->1555|1583->1555|1583->1555|1585->1557|1585->1557|1585->1557|1585->1557|1585->1557|1587->1559|1587->1559|1587->1559|1587->1559|1587->1559|1588->1560|1588->1560|1589->1561|1589->1561|1589->1561|1589->1561|1589->1561|1589->1561|1590->1562|1590->1562|1590->1562|1590->1562|1591->1563|1591->1563|1591->1563|1592->1564|1592->1564|1592->1564|1592->1564|1592->1564|1593->1565|1595->1567|1599->1571|1599->1571|1599->1571|1599->1571|1599->1571|1603->1575|1604->1576|1605->1577|1633->1605|1633->1605|1633->1605|1633->1605|1634->1606|1634->1606|1634->1606|1635->1607|1635->1607|1635->1607|1635->1607|1635->1607|1636->1608|1638->1610|1662->1634|1662->1634|1662->1634|1662->1634|1663->1635|1663->1635|1663->1635|1664->1636|1664->1636|1664->1636|1664->1636|1664->1636|1665->1637|1667->1639|1689->1661|1689->1661|1689->1661|1689->1661|1690->1662|1690->1662|1690->1662|1691->1663|1691->1663|1691->1663|1691->1663|1691->1663|1692->1664|1694->1666|1716->1688|1716->1688|1716->1688|1716->1688|1717->1689|1717->1689|1717->1689|1718->1690|1718->1690|1718->1690|1718->1690|1718->1690|1719->1691|1721->1693|1743->1715|1743->1715|1743->1715|1743->1715|1744->1716|1744->1716|1744->1716|1745->1717|1745->1717|1745->1717|1745->1717|1745->1717|1746->1718|1748->1720|1770->1742|1770->1742|1770->1742|1770->1742|1771->1743|1771->1743|1771->1743|1772->1744|1772->1744|1772->1744|1772->1744|1772->1744|1773->1745|1775->1747|1797->1769|1797->1769|1797->1769|1797->1769|1798->1770|1798->1770|1798->1770|1799->1771|1799->1771|1799->1771|1799->1771|1799->1771|1800->1772|1802->1774|1810->1782|1810->1782|1810->1782|1812->1784|1812->1784|1812->1784|1814->1786|1814->1786|1814->1786|1814->1786|1817->1789|1817->1789|1817->1789|1817->1789|1817->1789|1817->1789|1817->1789|1820->1792|1820->1792|1821->1793|1821->1793|1821->1793|1823->1795|1823->1795|1823->1795|1823->1795|1823->1795|1825->1797|1825->1797|1825->1797|1825->1797|1825->1797|1827->1799|1827->1799|1827->1799|1827->1799|1827->1799|1828->1800|1828->1800|1829->1801|1829->1801|1829->1801|1829->1801|1829->1801|1829->1801|1830->1802|1830->1802|1830->1802|1830->1802|1831->1803|1831->1803|1831->1803|1832->1804|1832->1804|1832->1804|1832->1804|1832->1804|1833->1805|1835->1807|1839->1811|1839->1811|1839->1811|1839->1811|1839->1811|1843->1815|1844->1816|1845->1817|1880->1852|1880->1852|1881->1853|1884->1856|1884->1856|1889->1861|1889->1861|1890->1862|1891->1863|1891->1863|1901->1873|1901->1873|1902->1874|1903->1875|1903->1875|1904->1876|1906->1878|1906->1878|1907->1879|1908->1880|1908->1880|1909->1881|1909->1881|1911->1883|1911->1883|1911->1883|1912->1884|1934->1906|1934->1906|1935->1907|1945->1917|1945->1917|1947->1919|1952->1924|1952->1924|1954->1926|1954->1926|1955->1927|1956->1928|1956->1928|1958->1930|1958->1930|1958->1930|1959->1931|1979->1951|1979->1951|1980->1952|1990->1962|1990->1962|1992->1964|1997->1969|1997->1969|1998->1970|1998->1970|1999->1971|1999->1971|2001->1973|2005->1977|2005->1977|2007->1979|2007->1979|2007->1979
                  -- GENERATED --
              */
          