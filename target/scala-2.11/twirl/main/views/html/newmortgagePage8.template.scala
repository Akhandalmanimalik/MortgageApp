
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
object newmortgagePage8 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template12[String,EmployeIncomeTypeParam,SelfEmployeIncomeTypeParam,PensionIncomeTypeParam,InvestmentsIncomeTypeParam,MaternityIncomeTypeParam,VehicleAllowIncomeTypeParam,LivingAllowIncomeTypeParam,CommissionIncomeTypeParam,BonusIncomeTypeParam,OtherIncomeTypeParam,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(additionalApplicant:String,employeeIncome:EmployeIncomeTypeParam, selfEmployeeIncome:SelfEmployeIncomeTypeParam, pensionIncType:PensionIncomeTypeParam, investmentIncType:InvestmentsIncomeTypeParam, maternityIncType:MaternityIncomeTypeParam,vehicleIncType:VehicleAllowIncomeTypeParam,livingIncType:LivingAllowIncomeTypeParam, commissionIncType:CommissionIncomeTypeParam, bonusIncType:BonusIncomeTypeParam, otherIncType:OtherIncomeTypeParam,applicantName:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.463*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

 <script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>

<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*13.31*/routes/*13.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*13.79*/("""">
<script src="""),_display_(/*14.14*/routes/*14.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*14.61*/(""""></script>
<link type="text/css" rel="stylesheet" href=""""),_display_(/*15.47*/routes/*15.53*/.Assets.at("_resources/background.css")),format.raw/*15.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*16.47*/routes/*16.53*/.Assets.at("_resources/forms.css")),format.raw/*16.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*17.47*/routes/*17.53*/.Assets.at("_resources/template.css")),format.raw/*17.90*/("""">  
<link rel="shortcut icon" href=""""),_display_(/*18.34*/routes/*18.40*/.Assets.at("_resources/favicon.ico")),format.raw/*18.76*/("""">
  
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script>

<script src=""""),_display_(/*23.15*/routes/*23.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*23.65*/(""""></script>
<script src=""""),_display_(/*24.15*/routes/*24.21*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*24.67*/(""""></script>

<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> -->
<!--  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>-->
<style type="text/css">

	
</style>
<script type="text/javascript">
	function tableCreate() """),format.raw/*33.25*/("""{"""),format.raw/*33.26*/("""
		"""),format.raw/*34.3*/("""var body = document.body, tbl = document.createElement('table');
		tbl.style.width = '100px';
		tbl.style.border = '1px solid black';

		for (var i = 0; i < 3; i++) """),format.raw/*38.31*/("""{"""),format.raw/*38.32*/("""
			"""),format.raw/*39.4*/("""var tr = tbl.insertRow();
			for (var j = 0; j < 2; j++) """),format.raw/*40.32*/("""{"""),format.raw/*40.33*/("""
				"""),format.raw/*41.5*/("""if (i == 2 && j == 2) """),format.raw/*41.27*/("""{"""),format.raw/*41.28*/("""
					"""),format.raw/*42.6*/("""break;
				"""),format.raw/*43.5*/("""}"""),format.raw/*43.6*/(""" """),format.raw/*43.7*/("""else """),format.raw/*43.12*/("""{"""),format.raw/*43.13*/("""
					"""),format.raw/*44.6*/("""var td = tr.insertCell();
					td.appendChild(document.createTextNode('Cell'));
					td.style.border = '1px solid black';
					if (i == 1 && j == 1) """),format.raw/*47.28*/("""{"""),format.raw/*47.29*/("""
						"""),format.raw/*48.7*/("""td.setAttribute('rowSpan', '2');
					"""),format.raw/*49.6*/("""}"""),format.raw/*49.7*/("""
				"""),format.raw/*50.5*/("""}"""),format.raw/*50.6*/("""
			"""),format.raw/*51.4*/("""}"""),format.raw/*51.5*/("""
		"""),format.raw/*52.3*/("""}"""),format.raw/*52.4*/("""
		"""),format.raw/*53.3*/("""body.appendChild(tbl);
	"""),format.raw/*54.2*/("""}"""),format.raw/*54.3*/("""
"""),format.raw/*55.1*/("""</script>
<script>
function createTable()"""),format.raw/*57.23*/("""{"""),format.raw/*57.24*/("""
	 """),format.raw/*58.3*/("""alert("comgin");
	mytable = $('<table></table>').attr("""),format.raw/*59.38*/("""{"""),format.raw/*59.39*/(""" """),format.raw/*59.40*/("""id: "basicTable" """),format.raw/*59.57*/("""}"""),format.raw/*59.58*/(""");
	var rows = 3;
	var cols = 4;
	var tr = [];
	for (var i = 0; i < rows; i++) """),format.raw/*63.33*/("""{"""),format.raw/*63.34*/("""
		"""),format.raw/*64.3*/("""var row = $('<tr></tr>').attr("""),format.raw/*64.33*/("""{"""),format.raw/*64.34*/(""" """),format.raw/*64.35*/("""class: ["class1", "class2", "class3"].join(' ') """),format.raw/*64.83*/("""}"""),format.raw/*64.84*/(""").appendTo(mytable);
		for (var j = 0; j < cols; j++) """),format.raw/*65.34*/("""{"""),format.raw/*65.35*/("""
			"""),format.raw/*66.4*/("""$('<td></td>').text("text1").appendTo(row); 
		"""),format.raw/*67.3*/("""}"""),format.raw/*67.4*/("""
		 		 
	"""),format.raw/*69.2*/("""}"""),format.raw/*69.3*/("""
	"""),format.raw/*70.2*/("""alert("lkjhgfdghjkl;");
	console.log("TTTTT:"+mytable.html());
	mytable.appendTo("#box");	       
  
"""),format.raw/*74.1*/("""}"""),format.raw/*74.2*/("""
"""),format.raw/*75.1*/("""</script>

<script language="JavaScript">
	window.onbeforeunload = function() """),format.raw/*78.37*/("""{"""),format.raw/*78.38*/("""
		"""),format.raw/*79.3*/("""return "Are you sure?";
	"""),format.raw/*80.2*/("""}"""),format.raw/*80.3*/(""";

	$(document).ready(function() """),format.raw/*82.31*/("""{"""),format.raw/*82.32*/("""
		"""),format.raw/*83.3*/("""$('form').submit(function() """),format.raw/*83.31*/("""{"""),format.raw/*83.32*/("""
			"""),format.raw/*84.4*/("""window.onbeforeunload = null;
		"""),format.raw/*85.3*/("""}"""),format.raw/*85.4*/(""");
	"""),format.raw/*86.2*/("""}"""),format.raw/*86.3*/(""");
</script>
<script type="text/javascript">
    window.onload = function() """),format.raw/*89.32*/("""{"""),format.raw/*89.33*/("""
    	"""),format.raw/*90.6*/("""SelectElement();
    """),format.raw/*91.5*/("""}"""),format.raw/*91.6*/(""";
    function SelectElement() """),format.raw/*92.30*/("""{"""),format.raw/*92.31*/("""
    	
    	"""),format.raw/*94.6*/("""var empStartMon11  = document.forms["myForm"]["empStartMon1"].value;  
        document.forms["myForm"]["empStartMonth"].value = empStartMon11;
        var empStartMon511  = document.forms["myForm"]["empStartMon51"].value;  
        document.forms["myForm"]["empStartMonth2"].value = empStartMon511;
        var empStartMon512  = document.forms["myForm"]["empStartMon52"].value;  
        document.forms["myForm"]["empStartMonth3"].value = empStartMon512;
		
        var selfStartMon11  = document.forms["myForm"]["selfStartMon1"].value;
        
        document.forms["myForm"]["selfStartMon"].value = selfStartMon11;
        var selfStartMon311  = document.forms["myForm"]["selfStartMon212"].value;
        
        document.forms["myForm"]["selfStartMon2"].value = selfStartMon311;
		var selfStartMon311  = document.forms["myForm"]["selfStartMon213"].value;
		
        document.forms["myForm"]["selfStartMon3"].value = selfStartMon311;
        
        var pensionStartMon1  = document.forms["myForm"]["pensionStartMon"].value;  
        document.forms["myForm"]["pensionMY1"].value = pensionStartMon1;
        
        var investStartMon1  = document.forms["myForm"]["investStartMon"].value;  
        document.forms["myForm"]["investmentsMY1"].value = investStartMon1;

        var maternityStartMon1  = document.forms["myForm"]["maternityStartMon"].value;  
        document.forms["myForm"]["maternityMY1"].value = maternityStartMon1;


        var vehicleStartMon1  = document.forms["myForm"]["vehicleStartMon"].value;  
        document.forms["myForm"]["vehicleAllowMY1"].value = vehicleStartMon1;


        var livingStartMon1  = document.forms["myForm"]["livingStartMon"].value;  
        document.forms["myForm"]["livingAllowMY1"].value = livingStartMon1;


        var commissionStartMon1  = document.forms["myForm"]["commissionStartMon"].value;  
        document.forms["myForm"]["commissionMY1"].value = commissionStartMon1;

        var bonusStartMon1  = document.forms["myForm"]["bonusStartMon"].value;  
        document.forms["myForm"]["bonusMY1"].value = bonusStartMon1;

        var otherStartMon1  = document.forms["myForm"]["otherStartMon"].value;  
        document.forms["myForm"]["otherMY1"].value = otherStartMon1;
    """),format.raw/*137.5*/("""}"""),format.raw/*137.6*/("""
    """),format.raw/*138.5*/("""</script>

<script type="text/javascript">
	function validateForm()"""),format.raw/*141.25*/("""{"""),format.raw/*141.26*/("""
		
		"""),format.raw/*143.3*/("""var employee = document.forms["myForm"]["employee"].value;
		var selfEmployed = document.forms["myForm"]["selfEmployed"].value;
		var pension = document.forms["myForm"]["pension"].value;
		var investments = document.forms["myForm"]["investments"].value;
		var maternity = document.forms["myForm"]["maternity"].value;
		var vehicleAllow = document.forms["myForm"]["vehicleAllow"].value;
		var livingAllow = document.forms["myForm"]["livingAllow"].value;
		var commission = document.forms["myForm"]["commission"].value;
		var bonus = document.forms["myForm"]["bonus"].value;
		var other = document.forms["myForm"]["other"].value;
		var retVal=true;
		
		if(employee == "false" && selfEmployed ==  "false" && pension == "false" && investments == "false" && maternity == "false" && vehicleAllow == "false" && livingAllow == "false" && commission == "false" && bonus == "false" && other == "false")"""),format.raw/*155.244*/("""{"""),format.raw/*155.245*/("""
    	    """),format.raw/*156.10*/("""document.getElementById('input_204').innerHTML="<span style='color:red'>*This field is Required.</span>";
        	return false;
			"""),format.raw/*158.4*/("""}"""),format.raw/*158.5*/("""else"""),format.raw/*158.9*/("""{"""),format.raw/*158.10*/("""
			"""),format.raw/*159.4*/("""document.getElementById("input_204").innerHTML="";
			"""),format.raw/*160.4*/("""}"""),format.raw/*160.5*/("""
		
		"""),format.raw/*162.3*/("""if(employee == "true")"""),format.raw/*162.25*/("""{"""),format.raw/*162.26*/("""
			"""),format.raw/*163.4*/("""var empBusinessName = document.forms["myForm"]["empBusinessName"].value;
			if(!empBusinessName)"""),format.raw/*164.24*/("""{"""),format.raw/*164.25*/("""
				 """),format.raw/*165.6*/("""document.getElementById('input_1102').innerHTML="<span style='color:red'>*This field is Required.</span>";
		        	return false;
			"""),format.raw/*167.4*/("""}"""),format.raw/*167.5*/("""else"""),format.raw/*167.9*/("""{"""),format.raw/*167.10*/("""
			"""),format.raw/*168.4*/("""document.getElementById("input_1102").innerHTML="";
			"""),format.raw/*169.4*/("""}"""),format.raw/*169.5*/("""
			
			"""),format.raw/*171.4*/("""var empStartMonth = document.forms["myForm"]["empStartMonth"].value;
			if(!empStartMonth)"""),format.raw/*172.22*/("""{"""),format.raw/*172.23*/("""
				 """),format.raw/*173.6*/("""document.getElementById('input_1103').innerHTML="<span style='color:red'>*This field is Required.</span>";
		        	return false;
			"""),format.raw/*175.4*/("""}"""),format.raw/*175.5*/("""else"""),format.raw/*175.9*/("""{"""),format.raw/*175.10*/("""
			"""),format.raw/*176.4*/("""document.getElementById("input_1103").innerHTML="";
			"""),format.raw/*177.4*/("""}"""),format.raw/*177.5*/("""
			
			"""),format.raw/*179.4*/("""var empPosition = document.forms["myForm"]["empPosition"].value;
			if(!empPosition)"""),format.raw/*180.20*/("""{"""),format.raw/*180.21*/("""
				 """),format.raw/*181.6*/("""document.getElementById('input_1104').innerHTML="<span style='color:red'>*This field is Required.</span>";
		        	return false;
			"""),format.raw/*183.4*/("""}"""),format.raw/*183.5*/("""else"""),format.raw/*183.9*/("""{"""),format.raw/*183.10*/("""
			"""),format.raw/*184.4*/("""document.getElementById("input_1104").innerHTML="";
			"""),format.raw/*185.4*/("""}"""),format.raw/*185.5*/("""
		"""),format.raw/*186.3*/("""}"""),format.raw/*186.4*/("""
		
		"""),format.raw/*188.3*/("""if (selfEmployed == "true") """),format.raw/*188.31*/("""{"""),format.raw/*188.32*/("""
			"""),format.raw/*189.4*/("""var selfBusinessName = document.forms["myForm"]["selfBusinessName"].value;
			if (!selfBusinessName) """),format.raw/*190.27*/("""{"""),format.raw/*190.28*/("""
				"""),format.raw/*191.5*/("""document.getElementById('input_1118').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*193.4*/("""}"""),format.raw/*193.5*/(""" """),format.raw/*193.6*/("""else """),format.raw/*193.11*/("""{"""),format.raw/*193.12*/("""
				"""),format.raw/*194.5*/("""document.getElementById("input_1118").innerHTML = "";
			"""),format.raw/*195.4*/("""}"""),format.raw/*195.5*/("""

			"""),format.raw/*197.4*/("""var selfStartMon = document.forms["myForm"]["selfStartMon"].value;
			if (!selfStartMon) """),format.raw/*198.23*/("""{"""),format.raw/*198.24*/("""
				"""),format.raw/*199.5*/("""document.getElementById('input_1119').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*201.4*/("""}"""),format.raw/*201.5*/(""" """),format.raw/*201.6*/("""else """),format.raw/*201.11*/("""{"""),format.raw/*201.12*/("""
				"""),format.raw/*202.5*/("""document.getElementById("input_1119").innerHTML = "";
			"""),format.raw/*203.4*/("""}"""),format.raw/*203.5*/("""
			
			"""),format.raw/*205.4*/("""var selfPosition = document.forms["myForm"]["selfPosition"].value;
			if (!selfPosition) """),format.raw/*206.23*/("""{"""),format.raw/*206.24*/("""
				"""),format.raw/*207.5*/("""document.getElementById('input_1120').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*209.4*/("""}"""),format.raw/*209.5*/(""" """),format.raw/*209.6*/("""else """),format.raw/*209.11*/("""{"""),format.raw/*209.12*/("""
				"""),format.raw/*210.5*/("""document.getElementById("input_1120").innerHTML = "";
			"""),format.raw/*211.4*/("""}"""),format.raw/*211.5*/("""
			
		"""),format.raw/*213.3*/("""}"""),format.raw/*213.4*/("""

		"""),format.raw/*215.3*/("""var totalMonths = document.forms["myForm"]["totalMonths"].value;
		if(totalMonths<36 && employee == "true")"""),format.raw/*216.43*/("""{"""),format.raw/*216.44*/("""
			"""),format.raw/*217.4*/("""var empBusinessName2 = document.forms["myForm"]["empBusinessName2"].value;
			if(!empBusinessName2)"""),format.raw/*218.25*/("""{"""),format.raw/*218.26*/("""
				 """),format.raw/*219.6*/("""document.getElementById('input_1106').innerHTML="<span style='color:red'>*This field is Required.</span>";
				     return false;
			"""),format.raw/*221.4*/("""}"""),format.raw/*221.5*/("""else"""),format.raw/*221.9*/("""{"""),format.raw/*221.10*/("""
			"""),format.raw/*222.4*/("""document.getElementById("input_1106").innerHTML="";
			"""),format.raw/*223.4*/("""}"""),format.raw/*223.5*/("""
			"""),format.raw/*224.4*/("""var empStartMonth2 = document.forms["myForm"]["empStartMonth2"].value;
			if(!empStartMonth2)"""),format.raw/*225.23*/("""{"""),format.raw/*225.24*/("""
			"""),format.raw/*226.4*/("""document.getElementById('input_1107').innerHTML="<span style='color:red'>*This field is Required.</span>";
			return false;
			"""),format.raw/*228.4*/("""}"""),format.raw/*228.5*/("""else"""),format.raw/*228.9*/("""{"""),format.raw/*228.10*/("""
			"""),format.raw/*229.4*/("""document.getElementById("input_1107").innerHTML="";
			"""),format.raw/*230.4*/("""}"""),format.raw/*230.5*/("""
			   
			"""),format.raw/*232.4*/("""var empPosition2 = document.forms["myForm"]["empPosition2"].value;
			if(!empPosition2)"""),format.raw/*233.21*/("""{"""),format.raw/*233.22*/("""
			"""),format.raw/*234.4*/("""document.getElementById('input_1108').innerHTML="<span style='color:red'>*This field is Required.</span>";
			return false;
			"""),format.raw/*236.4*/("""}"""),format.raw/*236.5*/("""else"""),format.raw/*236.9*/("""{"""),format.raw/*236.10*/("""
			"""),format.raw/*237.4*/("""document.getElementById("input_1108").innerHTML="";
			"""),format.raw/*238.4*/("""}"""),format.raw/*238.5*/("""
			
			"""),format.raw/*240.4*/("""var totalMonths2 = document.forms["myForm"]["totalMonths2"].value;
			if(totalMonths2<36)"""),format.raw/*241.23*/("""{"""),format.raw/*241.24*/("""
				"""),format.raw/*242.5*/("""var empBusinessName3 = document.forms["myForm"]["empBusinessName3"].value;
				if(!empBusinessName3)"""),format.raw/*243.26*/("""{"""),format.raw/*243.27*/("""
				"""),format.raw/*244.5*/("""document.getElementById('input_1110').innerHTML="<span style='color:red'>*This field is Required.</span>";
				return false;
				"""),format.raw/*246.5*/("""}"""),format.raw/*246.6*/("""else"""),format.raw/*246.10*/("""{"""),format.raw/*246.11*/("""
				"""),format.raw/*247.5*/("""document.getElementById("input_1110").innerHTML="";
				"""),format.raw/*248.5*/("""}"""),format.raw/*248.6*/("""
				    	
				"""),format.raw/*250.5*/("""var empStartMonth3 = document.forms["myForm"]["empStartMonth3"].value;
				if (!empStartMonth3) """),format.raw/*251.26*/("""{"""),format.raw/*251.27*/("""
				"""),format.raw/*252.5*/("""document.getElementById('input_1111').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
				"""),format.raw/*254.5*/("""}"""),format.raw/*254.6*/(""" """),format.raw/*254.7*/("""else """),format.raw/*254.12*/("""{"""),format.raw/*254.13*/("""
				"""),format.raw/*255.5*/("""document.getElementById("input_1111").innerHTML = "";
				"""),format.raw/*256.5*/("""}"""),format.raw/*256.6*/("""
				
				"""),format.raw/*258.5*/("""var empPosition3 = document.forms["myForm"]["empPosition3"].value;
				if (!empPosition3) """),format.raw/*259.24*/("""{"""),format.raw/*259.25*/("""
				"""),format.raw/*260.5*/("""document.getElementById('input_1112').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
				"""),format.raw/*262.5*/("""}"""),format.raw/*262.6*/(""" """),format.raw/*262.7*/("""else """),format.raw/*262.12*/("""{"""),format.raw/*262.13*/("""
				"""),format.raw/*263.5*/("""document.getElementById("input_1112").innerHTML = "";
				"""),format.raw/*264.5*/("""}"""),format.raw/*264.6*/("""						
			"""),format.raw/*265.4*/("""}"""),format.raw/*265.5*/("""
		"""),format.raw/*266.3*/("""}"""),format.raw/*266.4*/("""
		
		
		"""),format.raw/*269.3*/("""var monthsum1 = document.forms["myForm"]["monthsum1"].value;
		if(monthsum1<36 && selfEmployed == "true")"""),format.raw/*270.45*/("""{"""),format.raw/*270.46*/("""
			"""),format.raw/*271.4*/("""var selfBusinessName2 = document.forms["myForm"]["selfBusinessName2"].value;
			if (!selfBusinessName2) """),format.raw/*272.28*/("""{"""),format.raw/*272.29*/("""
				"""),format.raw/*273.5*/("""document.getElementById('input_1122').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*275.4*/("""}"""),format.raw/*275.5*/(""" """),format.raw/*275.6*/("""else """),format.raw/*275.11*/("""{"""),format.raw/*275.12*/("""
				"""),format.raw/*276.5*/("""document.getElementById("input_1122").innerHTML = "";
			"""),format.raw/*277.4*/("""}"""),format.raw/*277.5*/("""

			"""),format.raw/*279.4*/("""var selfStartMon2 = document.forms["myForm"]["selfStartMon2"].value;
			if (!selfStartMon2) """),format.raw/*280.24*/("""{"""),format.raw/*280.25*/("""
				"""),format.raw/*281.5*/("""document.getElementById('input_1123').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*283.4*/("""}"""),format.raw/*283.5*/(""" """),format.raw/*283.6*/("""else """),format.raw/*283.11*/("""{"""),format.raw/*283.12*/("""
				"""),format.raw/*284.5*/("""document.getElementById("input_1123").innerHTML = "";
			"""),format.raw/*285.4*/("""}"""),format.raw/*285.5*/("""

			"""),format.raw/*287.4*/("""var selfPosition2 = document.forms["myForm"]["selfPosition2"].value;
			if (!selfPosition2) """),format.raw/*288.24*/("""{"""),format.raw/*288.25*/("""
				"""),format.raw/*289.5*/("""document.getElementById('input_1124').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*291.4*/("""}"""),format.raw/*291.5*/(""" """),format.raw/*291.6*/("""else """),format.raw/*291.11*/("""{"""),format.raw/*291.12*/("""
				"""),format.raw/*292.5*/("""document.getElementById("input_1124").innerHTML = "";
			"""),format.raw/*293.4*/("""}"""),format.raw/*293.5*/("""
			"""),format.raw/*294.4*/("""var selfTotal2 = document.forms["myForm"]["selfemployemonthsumTotal2"].value;
			if(selfTotal2<36)"""),format.raw/*295.21*/("""{"""),format.raw/*295.22*/("""
				"""),format.raw/*296.5*/("""var selfBusinessName3 = document.forms["myForm"]["selfBusinessName3"].value;
				if (!selfBusinessName3) """),format.raw/*297.29*/("""{"""),format.raw/*297.30*/("""
					"""),format.raw/*298.6*/("""document.getElementById('input_1126').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					return false;
				"""),format.raw/*300.5*/("""}"""),format.raw/*300.6*/(""" """),format.raw/*300.7*/("""else """),format.raw/*300.12*/("""{"""),format.raw/*300.13*/("""
					"""),format.raw/*301.6*/("""document.getElementById("input_1126").innerHTML = "";
				"""),format.raw/*302.5*/("""}"""),format.raw/*302.6*/("""

				"""),format.raw/*304.5*/("""var selfStartMon3 = document.forms["myForm"]["selfStartMon3"].value;
				if (!selfStartMon3) """),format.raw/*305.25*/("""{"""),format.raw/*305.26*/("""
					"""),format.raw/*306.6*/("""document.getElementById('input_1127').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					return false;
				"""),format.raw/*308.5*/("""}"""),format.raw/*308.6*/(""" """),format.raw/*308.7*/("""else """),format.raw/*308.12*/("""{"""),format.raw/*308.13*/("""
					"""),format.raw/*309.6*/("""document.getElementById("input_1127").innerHTML = "";
				"""),format.raw/*310.5*/("""}"""),format.raw/*310.6*/("""

				"""),format.raw/*312.5*/("""var selfPosition3 = document.forms["myForm"]["selfPosition3"].value;
				if (!selfPosition3) """),format.raw/*313.25*/("""{"""),format.raw/*313.26*/("""
					"""),format.raw/*314.6*/("""document.getElementById('input_1128').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					return false;
				"""),format.raw/*316.5*/("""}"""),format.raw/*316.6*/(""" """),format.raw/*316.7*/("""else """),format.raw/*316.12*/("""{"""),format.raw/*316.13*/("""
					"""),format.raw/*317.6*/("""document.getElementById("input_1128").innerHTML = "";
				"""),format.raw/*318.5*/("""}"""),format.raw/*318.6*/("""				
				
			"""),format.raw/*320.4*/("""}"""),format.raw/*320.5*/("""
		"""),format.raw/*321.3*/("""}"""),format.raw/*321.4*/("""
		
		"""),format.raw/*323.3*/("""return true;
	"""),format.raw/*324.2*/("""}"""),format.raw/*324.3*/("""
"""),format.raw/*325.1*/("""</script>

    <script>
      $(function()"""),format.raw/*328.19*/("""{"""),format.raw/*328.20*/("""
        """),format.raw/*329.9*/("""$("#geocomplete").geocomplete("""),format.raw/*329.39*/("""{"""),format.raw/*329.40*/("""
          """),format.raw/*330.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*333.9*/("""}"""),format.raw/*333.10*/(""");

        $("#find").click(function()"""),format.raw/*335.36*/("""{"""),format.raw/*335.37*/("""
          """),format.raw/*336.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*337.9*/("""}"""),format.raw/*337.10*/(""");
      """),format.raw/*338.7*/("""}"""),format.raw/*338.8*/(""");
    </script>
     <script>
      $(function()"""),format.raw/*341.19*/("""{"""),format.raw/*341.20*/("""
        """),format.raw/*342.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*342.40*/("""{"""),format.raw/*342.41*/("""
          """),format.raw/*343.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*346.9*/("""}"""),format.raw/*346.10*/(""");

        $("#find").click(function()"""),format.raw/*348.36*/("""{"""),format.raw/*348.37*/("""
          """),format.raw/*349.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*350.9*/("""}"""),format.raw/*350.10*/(""");
      """),format.raw/*351.7*/("""}"""),format.raw/*351.8*/(""");
      
	</script>
	
	

</head>
<body>
<br>
<br>
<div style="width: 97%">
		<form name="myForm" action="mortgagePage8" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value="uniid" name="uniid">
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*371.11*/routes/*371.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*371.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<div ng-controller="DemoController" ng-init="isDisabled = false">
		
		<label class="labelfont">"""),_display_(/*377.29*/applicantName),format.raw/*377.42*/("""</label><br><br>
		<label class="labelfont"> Are you an employee with a company which deducts your income tax?<span style="color: red; font-size: 3">*</span></label><br>

							
								<div class="col-xs-6 col-sm-5 btn-group"
									style="width: 100%; padding-left: 0%;">
									<label style="width: 20%;" class="btn btn-primary labelfont"
										btn-radio="'yes'" ng-change="change()" ng-model="checkEmployee.areUemploye">
										Yes </label> <label
										style="width: 20%; border-radius: 0px 5px 5px 0px;"
										class="btn btn-primary labelfont" btn-radio="'no'"
										ng-change="change()" ng-model="checkEmployee.areUemploye"> No </label> <br>
									<br>
									<div id="input_4107" style="position: absolute;"></div>
								</div>
								<input type="hidden" name="areYouEmploye"
									value=""""),format.raw/*393.17*/("""{"""),format.raw/*393.18*/("""{"""),format.raw/*393.19*/("""checkEmployee.areUemploye"""),format.raw/*393.44*/("""}"""),format.raw/*393.45*/("""}"""),format.raw/*393.46*/("""" ng-required>
							<br>
							<div ng-if="checkEmployee.areUemploye == 'yes' || checkSelfEmployee.areUSelfEmploye == 'yes'">
								<table width="100%">
								<th width="17%"><b>Type of Income:</b></th>
								<th width="43%"><b>Business:</b></th>
								<th width="15%"><b>Start Month:</b></th>
								<th width="25%"><b>Position:</b></th>
								</table>
							</div>

							<div ng-if="checkEmployee.areUemploye == 'yes'">
								<table>
									<tr>
										<td width="17%"><input type="text" name="empIncomeTypes"
											placeholder="E.g. Employer" class="form-control"
											value="Employed" style="width: 100%;" readonly="readonly">
										</td>
										<td width="43%"><input type="text" name="empBusinessName"
											placeholder="E.g. Business Name" style="width: 100%;"
											class="form-control" value=""""),_display_(/*413.41*/employeeIncome/*413.55*/.getBusiness1),format.raw/*413.68*/("""" value=""""),_display_(/*413.78*/employeeIncome),format.raw/*413.92*/(""""></td>
										<td width="15%"><input type="text" id="datepicker0"
											name="empStartMonth" placeholder="mm/dd/yyyy"
											ng-model="empFirstMonYear" ng-selected = "employe1(this)"
											style="width: 100%; position: relative; z-index: 100000;"
											class="form-control"></td>
										<td width="25%"><input type="text" name="empPosition"
											placeholder="E.g. Manager" class="form-control"
											style="width: 100%;" value=""""),_display_(/*421.41*/employeeIncome/*421.55*/.getCurrentPosition1),format.raw/*421.75*/(""""></td>
									</tr>
									<tr>
							  		<td><div id="input_1101"></div></td>
							  		<td><div id="input_1102"></div></td>
							  		<td><div id="input_1103"></div></td>
							  		<td><div id="input_1104"></div></td>
							  	</tr>
								</table>
								<div id="box">
									<br>
								</div>
								<br>
								<input type="button" onclick="createTable();" value="additionalJob" />
							</div>

							<label class="labelfont"> Do you own a business where you pay your own taxes?<span style="color: red; font-size: 3">*</span></label><br>							
								<div class="col-xs-6 col-sm-5 btn-group"
									style="width: 100%; padding-left: 0%;">
									<label style="width: 20%;" class="btn btn-primary labelfont"
										btn-radio="'yes'" ng-change="change()" ng-model="checkSelfEmployee.areUSelfEmploye">
										Yes </label> <label
										style="width: 20%; border-radius: 0px 5px 5px 0px;"
										class="btn btn-primary labelfont" btn-radio="'no'"
										ng-change="change()" ng-model="checkSelfEmployee.areUSelfEmploye"> No </label> <br>
									<br>
									<div id="input_4107" style="position: absolute;"></div>
								</div>
								<input type="hidden" name="areYouEmploye"
									value=""""),format.raw/*450.17*/("""{"""),format.raw/*450.18*/("""{"""),format.raw/*450.19*/("""checkSelfEmployee.areUSelfEmploye"""),format.raw/*450.52*/("""}"""),format.raw/*450.53*/("""}"""),format.raw/*450.54*/("""" ng-required>
							<br>
							<!-- For Self-Employed -->
							<div ng-if="checkSelfEmployee.areUSelfEmploye == 'yes'">
								<table>
									<tr>
										<td width="17%"><input type="text" name="selfIncomeTypes"
											placeholder="E.g. Self-Employed" style="width: 100%;"
											class="form-control" value="Self Employed"
											readonly="readonly"></td>
										<td width="43%"><input type="text"
											name="selfBusinessName" placeholder="E.g. Business Name"
											style="width: 100%;" class="form-control" value=""""),_display_(/*462.62*/selfEmployeeIncome/*462.80*/.getBusiness21),format.raw/*462.94*/(""""></td>
										<td width="15%"><input type="text" id="datepicker3"
											name="selfStartMon" placeholder="mm/dd/yyyy"
											ng-model="slfempFirstMonYear" ng-selected="employe2(this)"
											style="width: 100%; position: relative; z-index: 100000;"
											class="form-control"></td>
										<td width="25%"><input type="text" name="selfPosition"
											placeholder="E.g. Manager" class="form-control" value=""""),_display_(/*469.68*/selfEmployeeIncome/*469.86*/.getCurrentPosition21),format.raw/*469.107*/("""">
										</td>
									</tr>
									<tr>
										<td><div id="input_1117""></div></td>
										<td><div id="input_1118"></div></td>
										<td><div id="input_1119"></div></td>
										<td><div id="input_1120"></div></td>
									</tr>
								</table>
							</div>
							
							<!-- History of Employed -->
							<div ng-show="employetotal1< 36 && checkEmployee.areUemploye == 'yes'">
							<h4 style="padding-left: 0%;"><Strong>Work History Employed</Strong></h4>
							<hr style="width: 96%; border-color: #006699; margin-top: 0%; margin-bottom: 0%;" />
							<label class="labelfont">Lenders require at least 3 years of work history. Where did you work previously?</label>
							
							<table>
							<tr>
							  		<td width="17%"><input type="text" name="empIncomeTypes2"
												placeholder="E.g. Employer" style="width: 100%;"
												class="form-control" value="Employed" readonly="readonly">
												</td>
							  		<td width="43%"><input type="text" name="empBusinessName2"
												placeholder="E.g. Business Name" style="width: 100%;"
												class="form-control" value=""""),_display_(/*495.42*/employeeIncome/*495.56*/.getBusiness11),format.raw/*495.70*/("""">
												</td>
							  		<td width="15%"><input type="text" name="empStartMonth2"
												placeholder="mm/dd/yyyy" id="datepicker1" ng-model="empSecMonYear"
												ng-selected = "employe1(this)" style="width: 100%; position: relative; z-index: 100000;"
												class="form-control">
												</td>
							  		<td width="25%"><input type="text" name="empPosition2"
												placeholder="E.g. Manager" style="width: 100%;"
												class="form-control" value=""""),_display_(/*504.42*/employeeIncome/*504.56*/.getPosition11),format.raw/*504.70*/("""">
											    </td>
							  	</tr>
							  	<tr>
							  		<td><div id="input_1105"></div></td>
							  		<td><div id="input_1106"></div></td>
							  		<td><div id="input_1107"></div></td>
							  		<td><div id="input_1108"></div></td>
							  	</tr>
							  </table>
							  <input type="hidden" name="monthsum11" ng-model="employetotal2" value=""""),format.raw/*514.81*/("""{"""),format.raw/*514.82*/("""{"""),format.raw/*514.83*/("""employetotal2-employetotal1"""),format.raw/*514.110*/("""}"""),format.raw/*514.111*/("""}"""),format.raw/*514.112*/("""">	
							  <input type="hidden" name="totalMonths2" ng-model="employetotal2" value=""""),format.raw/*515.83*/("""{"""),format.raw/*515.84*/("""{"""),format.raw/*515.85*/("""employetotal2"""),format.raw/*515.98*/("""}"""),format.raw/*515.99*/("""}"""),format.raw/*515.100*/("""">
									<div ng-show="employetotal2< 36">
										<br>
										<table>
											<tr>
												<td width="17%"><input type="text" name="empIncomeTypes3"
												placeholder="E.g. Employer" style="width: 100%;"
												class="form-control" value="Employed" readonly="readonly">
											</td>
												<td width="43%"><input type="text" name="empBusinessName3"
												placeholder="E.g. Business Name" style="width: 100%;"
												class="form-control" value=""""),_display_(/*526.42*/employeeIncome/*526.56*/.getBusiness21),format.raw/*526.70*/("""">
												</td>
												<td width="15%"><input type="text" name="empStartMonth3" id="datepicker2"
												placeholder="mm/dd/yyyy" ng-model="empThirdMonYear"
												ng-selected="employe1(this)" style="width: 100%; position: relative; z-index: 100000;"
												class="form-control">
											</td>
												<td width="25%"><input type="text" name="empPosition3"
												placeholder="E.g. Manager" style="width: 100%;"
												class="form-control" value=""""),_display_(/*535.42*/employeeIncome/*535.56*/.getPosition21),format.raw/*535.70*/("""">
												</td>
											</tr>
											<tr>
												<td><div id="input_1109""></div></td>
												<td><div id="input_1110"></div></td>
												<td><div id="input_1111"></div></td>
												<td><div id="input_1112"></div></td>
											</tr>
										</table>
										<input type="hidden" name="monthsum33" ng-model="employetotal2" value=""""),format.raw/*545.82*/("""{"""),format.raw/*545.83*/("""{"""),format.raw/*545.84*/("""employetotal3-employetotal2"""),format.raw/*545.111*/("""}"""),format.raw/*545.112*/("""}"""),format.raw/*545.113*/("""">
										<input type="hidden" name="totalMonths3" ng-model="employetotal3" value=""""),format.raw/*546.84*/("""{"""),format.raw/*546.85*/("""{"""),format.raw/*546.86*/("""employetotal3"""),format.raw/*546.99*/("""}"""),format.raw/*546.100*/("""}"""),format.raw/*546.101*/("""">
					</div>
					
					
					</div>
							
							
							<!-- History of Self-Employed -->
							<div ng-show="slfemployetotal1<36 && checkSelfEmployee.areUSelfEmploye == 'yes'">
					  		<h4 style="padding-left: 0%;"><Strong>Work History Self-Employed</Strong></h4>
							<hr style="width: 96%; border-color: #006699; margin-top: 0%; margin-bottom: 0%;" />
							<label class="labelfont">Lenders require at least 3 years of work history. Where did you work previously?</label>
					  		<table>
					  			<tr>
					  				<td width="17%"><input type="text" name="selfIncomeTypes2" placeholder="E.g. Self-Employed" style="width: 100%;" class="form-control" value="Self Employed" readonly="readonly">
									     			</td>
					  				<td width="43%"><input type="text" name="selfBusinessName2" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*562.155*/selfEmployeeIncome/*562.173*/.getBusiness22),format.raw/*562.187*/("""">
      												</td>
					  				<td width="15%"><input type="text" id="datepicker4" name="selfStartMon2" placeholder="mm/dd/yyyy" ng-model="slfsecMonYears" ng-selected="employe2(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     			</td>
					  				<td width="25%"><input type="text" name="selfPosition2"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*566.146*/selfEmployeeIncome/*566.164*/.getPosition22),format.raw/*566.178*/("""">
      										</td>
					  			</tr>
					  			<tr>
					  				<td><div id="input_1121"></div></td>
					  				<td><div id="input_1122"></div></td>
					  				<td><div id="input_1123"></div></td>
					  				<td><div id="input_1124"></div></td>
					  			</tr>
					  		</table>
					  		<input type="hidden" name="selfemployemonthssum2" value=""""),format.raw/*576.67*/("""{"""),format.raw/*576.68*/("""{"""),format.raw/*576.69*/("""slfemployetotal2-slfemployetotal1"""),format.raw/*576.102*/("""}"""),format.raw/*576.103*/("""}"""),format.raw/*576.104*/("""">
					  		<input type="hidden" name="selfemployemonthsumTotal2" value=""""),format.raw/*577.71*/("""{"""),format.raw/*577.72*/("""{"""),format.raw/*577.73*/("""slfemployetotal2"""),format.raw/*577.89*/("""}"""),format.raw/*577.90*/("""}"""),format.raw/*577.91*/("""">
							<div ng-show="slfemployetotal2 < 36">
								<br>
								<table>
									<tr>
										<td width="17%"><input type="text" name="selfIncomeTypes3" placeholder="E.g. Self-Employed" style="width: 100%;" class="form-control" value="Self Employed" readonly="readonly">
									     				</td>
										<td width="43%"><input type="text" name="selfBusinessName3" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*584.154*/selfEmployeeIncome/*584.172*/.getBusiness23),format.raw/*584.186*/("""">
      													</td>
										<td width="15%"><input type="text" id="datepicker5" name="selfStartMon3" placeholder="mm/dd/yyyy" ng-model="slfthirdMonYear" ng-selected="employe2(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     				</td>
										<td width="25%"><input type="text" name="selfPosition3"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*588.145*/selfEmployeeIncome/*588.163*/.getPosition23),format.raw/*588.177*/("""">
      													</td>
									</tr>
									<tr>
									<td><div id="input_1125"></div></td>
									<td><div id="input_1126"></div></td>
									<td><div id="input_1127"></div></td>
									<td><div id="input_1128"></div></td>
								</tr>
								</table>
								<input type="hidden" name="selfemployemonthssum3" value=""""),format.raw/*598.66*/("""{"""),format.raw/*598.67*/("""{"""),format.raw/*598.68*/("""slfemployetotal3-slfemployetotal2"""),format.raw/*598.101*/("""}"""),format.raw/*598.102*/("""}"""),format.raw/*598.103*/("""">
					  			<input type="hidden" name="selfemployemonthsumTotal3" value=""""),format.raw/*599.72*/("""{"""),format.raw/*599.73*/("""{"""),format.raw/*599.74*/("""slfemployetotal3"""),format.raw/*599.90*/("""}"""),format.raw/*599.91*/("""}"""),format.raw/*599.92*/("""">
							</div>
						</div>
			      <br>
			      <div class="row" style="width: 100%;">
								<div class="col-sm-6"
									style="float: left; padding-left: 2%; width: 50%;">
									<a href="mortgageBackPage7" class="btn btn-primary"
										role="button" style="width: 50%;">Back</a>
								</div>
							<div class="col-sm-6" align="right" style="float: right; padding-right:5%; width: 50%;"><input type="submit" class="btn btn-primary btn-block"
								value="Next" style="width: 50%;">
							<div align="right" id="submiterror">
								<font color="red"></font></div>
					  </div>	
					</div>
					<br>
						 	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
						  <!-- <script src="//code.jquery.com/jquery-1.10.2.js"></script> -->
						  <!-- <script type="text/javascript" src="jquery-ui.js" ></script> -->
						  <script src=""""),_display_(/*619.23*/routes/*619.29*/.Assets.at("_resources/jquery-ui.js")),format.raw/*619.66*/("""" type="text/javascript"></script>
						  <link rel="stylesheet" href="/resources/demos/style.css">
						  <!-- <p>Date: <input type="text" id="datepicker7"></p> -->
						  <!-- <p>Date: <input type="text" id="datepicker6"></p> --> 
						  
			</div>
						<br>
						<div class="container" style="width: 70%;">
						  <div class="progress">
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:70%; background-color: #6AA84F;">
						    <label>70%</label>
						    </div>
						  </div>
						</div>
					 </div>
				</div>
				</div>
				<br>
				
			</form>
			</div>
</form>
</div>
<script type="text/javascript">
    $(function() """),format.raw/*643.18*/("""{"""),format.raw/*643.19*/("""
        """),format.raw/*644.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*647.5*/("""}"""),format.raw/*647.6*/(""");
	
</script>

 <script>
$(document).ready(function()"""),format.raw/*652.29*/("""{"""),format.raw/*652.30*/("""
    """),format.raw/*653.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*654.1*/("""}"""),format.raw/*654.2*/(""");
</script>

<script src="https://maps.googleapis.com/maps/api/Are you Self-Employed?js?sensor=false&amp;libraries=places"></script>
 
    <script src="jquery.geocomplete.js"></script>
    
   <script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);
    app.controller('DemoController', function ($scope) """),format.raw/*663.56*/("""{"""),format.raw/*663.57*/("""
        """),format.raw/*664.9*/("""init();
        function init() """),format.raw/*665.25*/("""{"""),format.raw/*665.26*/("""
            """),format.raw/*666.13*/("""$scope.newItemType = '';
            $scope.company="";
            
            $scope.change = function () """),format.raw/*669.41*/("""{"""),format.raw/*669.42*/("""
                """),format.raw/*670.17*/("""console.log($scope.newItemType)
            """),format.raw/*671.13*/("""}"""),format.raw/*671.14*/(""";
        """),format.raw/*672.9*/("""}"""),format.raw/*672.10*/("""
        
        """),format.raw/*674.9*/("""$scope.employe1 = function ($scope) """),format.raw/*674.45*/("""{"""),format.raw/*674.46*/("""
        	
        	
        	"""),format.raw/*677.10*/("""$( "#datepicker0" ).datepicker("""),format.raw/*677.41*/("""{"""),format.raw/*677.42*/("""
                """),format.raw/*678.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*680.43*/("""{"""),format.raw/*680.44*/("""
                    """),format.raw/*681.21*/("""$scope.empFirstMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*683.52*/("""{"""),format.raw/*683.53*/("""
                         """),format.raw/*684.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*686.22*/("""}"""),format.raw/*686.23*/(""");
                     
                """),format.raw/*688.17*/("""}"""),format.raw/*688.18*/("""
               
              """),format.raw/*690.15*/("""}"""),format.raw/*690.16*/(""");
        
        	$( "#datepicker1" ).datepicker("""),format.raw/*692.41*/("""{"""),format.raw/*692.42*/("""
                """),format.raw/*693.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*695.43*/("""{"""),format.raw/*695.44*/("""
                    """),format.raw/*696.21*/("""$scope.empSecMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*698.52*/("""{"""),format.raw/*698.53*/("""
                         """),format.raw/*699.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*701.22*/("""}"""),format.raw/*701.23*/(""");
                     
                """),format.raw/*703.17*/("""}"""),format.raw/*703.18*/("""
               
              """),format.raw/*705.15*/("""}"""),format.raw/*705.16*/(""");	
        	   
        	$( "#datepicker2" ).datepicker("""),format.raw/*707.41*/("""{"""),format.raw/*707.42*/("""
                """),format.raw/*708.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*710.43*/("""{"""),format.raw/*710.44*/("""
                    """),format.raw/*711.21*/("""$scope.empThirdMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*713.52*/("""{"""),format.raw/*713.53*/("""
                         """),format.raw/*714.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*716.22*/("""}"""),format.raw/*716.23*/(""");
                     
                """),format.raw/*718.17*/("""}"""),format.raw/*718.18*/("""
               
              """),format.raw/*720.15*/("""}"""),format.raw/*720.16*/(""");
        	
        $scope.employetotal=0;
        var one= $scope.empFirstMonYear;
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
 		$scope.employetotal1 = total;
           if(total <36)"""),format.raw/*741.25*/("""{"""),format.raw/*741.26*/("""
                """),format.raw/*742.17*/("""one= $scope.empSecMonYear;
                date =one.split("/");
                oneDate=date[0]+"/1/"+date[2];
        	   datevDate=new Date(oneDate);
        	   
  			      	   
       		 one_day=1000*60*60*24;
       		 date1ms=date2ms;
       		 date2ms=datevDate.getTime();
       		
       		 totmili=date1ms-date2ms;
       		 
       			 if(isNaN(totmili) == false)"""),format.raw/*754.39*/("""{"""),format.raw/*754.40*/("""
       		 """),format.raw/*755.11*/("""totalDays=Math.round(totmili/one_day);

       		 totalMonths=Math.abs((totmili/one_day)/30);




     		total=total+Math.floor(totalMonths); 

     		$scope.employetotal2 = total;
     		
     		 if(total<36)"""),format.raw/*766.21*/("""{"""),format.raw/*766.22*/("""
				    			 
     			  """),format.raw/*768.11*/("""one= $scope.empThirdMonYear;
                  date =one.split("/");
                  oneDate=date[0]+"/1/"+date[2];
          	   datevDate=new Date(oneDate);
            		
           		 one_day=1000*60*60*24;
           		 date1ms=date2ms;
           		 date2ms=datevDate.getTime();
           		
           		 totmili=date1ms-date2ms;
           		if(isNaN(totmili) == false)"""),format.raw/*778.41*/("""{"""),format.raw/*778.42*/("""

           		 """),format.raw/*780.15*/("""totalDays=Math.round(totmili/one_day);
           		 totalMonths=Math.abs((totmili/one_day)/30);
          		total=Math.floor(total)+Math.floor(totalMonths); 
					
         		$scope.employetotal3 = total;
         		 
           		"""),format.raw/*786.14*/("""}"""),format.raw/*786.15*/("""
             """),format.raw/*787.14*/("""}"""),format.raw/*787.15*/("""
        	 """),format.raw/*788.11*/("""}"""),format.raw/*788.12*/("""
           """),format.raw/*789.12*/("""}"""),format.raw/*789.13*/("""
        """),format.raw/*790.9*/("""}"""),format.raw/*790.10*/(""";
        $scope.employe2 = function ($scope) """),format.raw/*791.45*/("""{"""),format.raw/*791.46*/("""
        	
        	        
        	"""),format.raw/*794.10*/("""$( "#datepicker3" ).datepicker("""),format.raw/*794.41*/("""{"""),format.raw/*794.42*/("""
                """),format.raw/*795.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*797.43*/("""{"""),format.raw/*797.44*/("""
                    """),format.raw/*798.21*/("""$scope.slfempFirstMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*800.52*/("""{"""),format.raw/*800.53*/("""
                         """),format.raw/*801.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*803.22*/("""}"""),format.raw/*803.23*/(""");
                     
                """),format.raw/*805.17*/("""}"""),format.raw/*805.18*/("""
               
              """),format.raw/*807.15*/("""}"""),format.raw/*807.16*/(""");
        	
        	$( "#datepicker4" ).datepicker("""),format.raw/*809.41*/("""{"""),format.raw/*809.42*/("""
                """),format.raw/*810.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*812.43*/("""{"""),format.raw/*812.44*/("""
                    """),format.raw/*813.21*/("""$scope.slfsecMonYears = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*815.52*/("""{"""),format.raw/*815.53*/("""
                         """),format.raw/*816.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*818.22*/("""}"""),format.raw/*818.23*/(""");
                     
                """),format.raw/*820.17*/("""}"""),format.raw/*820.18*/("""
               
              """),format.raw/*822.15*/("""}"""),format.raw/*822.16*/(""");
        	
        	$( "#datepicker5" ).datepicker("""),format.raw/*824.41*/("""{"""),format.raw/*824.42*/("""
                """),format.raw/*825.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*827.43*/("""{"""),format.raw/*827.44*/("""
                    """),format.raw/*828.21*/("""$scope.slfsecMonYears = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*830.52*/("""{"""),format.raw/*830.53*/("""
                         """),format.raw/*831.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*833.22*/("""}"""),format.raw/*833.23*/(""");
                     
                """),format.raw/*835.17*/("""}"""),format.raw/*835.18*/("""
               
              """),format.raw/*837.15*/("""}"""),format.raw/*837.16*/(""");
        	
            var one= $scope.slfempFirstMonYear;
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
        	
     		$scope.slfemployetotal1 = total;
               if(total <36)"""),format.raw/*858.29*/("""{"""),format.raw/*858.30*/("""
                    """),format.raw/*859.21*/("""one= $scope.slfsecMonYears;
                    date =one.split("/");
                    oneDate=date[0]+"/1/"+date[2];
            	   datevDate=new Date(oneDate);
      			      	   
           		 one_day=1000*60*60*24;
           		 date1ms=date2ms;
           		
           		 date2ms=datevDate.getTime();
           		 
           		 totmili=date1ms-date2ms;
           		 
           		if(isNaN(totmili) == false)"""),format.raw/*871.41*/("""{"""),format.raw/*871.42*/("""
           		 """),format.raw/*872.15*/("""totalDays=Math.round(totmili/one_day);

           		 totalMonths=Math.abs((totmili/one_day)/30);

         		total=total+Math.floor(totalMonths); 

         		$scope.slfemployetotal2 = total;
         		
         		
         		
         		 if(total<36)"""),format.raw/*882.25*/("""{"""),format.raw/*882.26*/("""
         		
         			  """),format.raw/*884.15*/("""one= $scope.slfthirdMonYear;
                      date =one.split("/");
                      oneDate=date[0]+"/1/"+date[2];
              	   	  datevDate=new Date(oneDate);
                		
               		 one_day=1000*60*60*24;
               		 date1ms=date2ms;
               		 date2ms=datevDate.getTime();
               		
               		 totmili=date1ms-date2ms;
               		if(isNaN(totmili) == false)"""),format.raw/*894.45*/("""{"""),format.raw/*894.46*/("""

               		 """),format.raw/*896.19*/("""totalDays=Math.round(totmili/one_day);pensiontotal1
               		 totalMonths=Math.abs((totmili/one_day)/30);
              		total=Math.floor(total)+Math.floor(totalMonths); 

             		$scope.slfemployetotal3 = total;
               	  """),format.raw/*901.19*/("""}"""),format.raw/*901.20*/("""
                 """),format.raw/*902.18*/("""}"""),format.raw/*902.19*/("""
               """),format.raw/*903.16*/("""}"""),format.raw/*903.17*/("""
              """),format.raw/*904.15*/("""}"""),format.raw/*904.16*/("""
            """),format.raw/*905.13*/("""}"""),format.raw/*905.14*/(""";
					 		
    """),format.raw/*907.5*/("""}"""),format.raw/*907.6*/(""");
   
    </script>
</body>
</html>
"""))}
  }

  def render(additionalApplicant:String,employeeIncome:EmployeIncomeTypeParam,selfEmployeeIncome:SelfEmployeIncomeTypeParam,pensionIncType:PensionIncomeTypeParam,investmentIncType:InvestmentsIncomeTypeParam,maternityIncType:MaternityIncomeTypeParam,vehicleIncType:VehicleAllowIncomeTypeParam,livingIncType:LivingAllowIncomeTypeParam,commissionIncType:CommissionIncomeTypeParam,bonusIncType:BonusIncomeTypeParam,otherIncType:OtherIncomeTypeParam,applicantName:String): play.twirl.api.HtmlFormat.Appendable = apply(additionalApplicant,employeeIncome,selfEmployeeIncome,pensionIncType,investmentIncType,maternityIncType,vehicleIncType,livingIncType,commissionIncType,bonusIncType,otherIncType,applicantName)

  def f:((String,EmployeIncomeTypeParam,SelfEmployeIncomeTypeParam,PensionIncomeTypeParam,InvestmentsIncomeTypeParam,MaternityIncomeTypeParam,VehicleAllowIncomeTypeParam,LivingAllowIncomeTypeParam,CommissionIncomeTypeParam,BonusIncomeTypeParam,OtherIncomeTypeParam,String) => play.twirl.api.HtmlFormat.Appendable) = (additionalApplicant,employeeIncome,selfEmployeeIncome,pensionIncType,investmentIncType,maternityIncType,vehicleIncType,livingIncType,commissionIncType,bonusIncType,otherIncType,applicantName) => apply(additionalApplicant,employeeIncome,selfEmployeeIncome,pensionIncType,investmentIncType,maternityIncType,vehicleIncType,livingIncType,commissionIncType,bonusIncType,otherIncType,applicantName)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:26 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/newmortgagePage8.scala.html
                  HASH: d9ec93672793adf75b09c836cae05202f7caa12f
                  MATRIX: 990->1|1540->462|1567->463|2177->1046|2192->1052|2255->1094|2298->1110|2313->1116|2375->1157|2460->1215|2475->1221|2535->1260|2611->1309|2626->1315|2681->1349|2757->1398|2772->1404|2830->1441|2895->1479|2910->1485|2967->1521|3223->1750|3238->1756|3303->1800|3356->1826|3371->1832|3438->1878|3768->2180|3797->2181|3827->2184|4020->2349|4049->2350|4080->2354|4165->2411|4194->2412|4226->2417|4276->2439|4305->2440|4338->2446|4376->2457|4404->2458|4432->2459|4465->2464|4494->2465|4527->2471|4704->2620|4733->2621|4767->2628|4832->2666|4860->2667|4892->2672|4920->2673|4951->2677|4979->2678|5009->2681|5037->2682|5067->2685|5118->2709|5146->2710|5174->2711|5243->2752|5272->2753|5302->2756|5384->2810|5413->2811|5442->2812|5487->2829|5516->2830|5623->2909|5652->2910|5682->2913|5740->2943|5769->2944|5798->2945|5874->2993|5903->2994|5985->3048|6014->3049|6045->3053|6119->3100|6147->3101|6183->3110|6211->3111|6240->3113|6368->3214|6396->3215|6424->3216|6530->3294|6559->3295|6589->3298|6641->3323|6669->3324|6730->3357|6759->3358|6789->3361|6845->3389|6874->3390|6905->3394|6964->3426|6992->3427|7023->3431|7051->3432|7155->3508|7184->3509|7217->3515|7265->3536|7293->3537|7352->3568|7381->3569|7420->3581|9694->5827|9723->5828|9756->5833|9852->5900|9882->5901|9916->5907|10839->6800|10870->6801|10909->6811|11069->6943|11098->6944|11130->6948|11160->6949|11192->6953|11274->7007|11303->7008|11337->7014|11388->7036|11418->7037|11450->7041|11575->7137|11605->7138|11639->7144|11802->7279|11831->7280|11863->7284|11893->7285|11925->7289|12008->7344|12037->7345|12073->7353|12192->7443|12222->7444|12256->7450|12419->7585|12448->7586|12480->7590|12510->7591|12542->7595|12625->7650|12654->7651|12690->7659|12803->7743|12833->7744|12867->7750|13030->7885|13059->7886|13091->7890|13121->7891|13153->7895|13236->7950|13265->7951|13296->7954|13325->7955|13359->7961|13416->7989|13446->7990|13478->7994|13608->8095|13638->8096|13671->8101|13829->8231|13858->8232|13887->8233|13921->8238|13951->8239|13984->8244|14069->8301|14098->8302|14131->8307|14249->8396|14279->8397|14312->8402|14470->8532|14499->8533|14528->8534|14562->8539|14592->8540|14625->8545|14710->8602|14739->8603|14775->8611|14893->8700|14923->8701|14956->8706|15114->8836|15143->8837|15172->8838|15206->8843|15236->8844|15269->8849|15354->8906|15383->8907|15418->8914|15447->8915|15479->8919|15615->9026|15645->9027|15677->9031|15805->9130|15835->9131|15869->9137|16030->9270|16059->9271|16091->9275|16121->9276|16153->9280|16236->9335|16265->9336|16297->9340|16419->9433|16449->9434|16481->9438|16636->9565|16665->9566|16697->9570|16727->9571|16759->9575|16842->9630|16871->9631|16910->9642|17026->9729|17056->9730|17088->9734|17243->9861|17272->9862|17304->9866|17334->9867|17366->9871|17449->9926|17478->9927|17514->9935|17632->10024|17662->10025|17695->10030|17824->10130|17854->10131|17887->10136|18044->10265|18073->10266|18106->10270|18136->10271|18169->10276|18253->10332|18282->10333|18325->10348|18450->10444|18480->10445|18513->10450|18672->10581|18701->10582|18730->10583|18764->10588|18794->10589|18827->10594|18913->10652|18942->10653|18980->10663|19099->10753|19129->10754|19162->10759|19321->10890|19350->10891|19379->10892|19413->10897|19443->10898|19476->10903|19562->10961|19591->10962|19629->10972|19658->10973|19689->10976|19718->10977|19755->10986|19889->11091|19919->11092|19951->11096|20084->11200|20114->11201|20147->11206|20305->11336|20334->11337|20363->11338|20397->11343|20427->11344|20460->11349|20545->11406|20574->11407|20607->11412|20728->11504|20758->11505|20791->11510|20949->11640|20978->11641|21007->11642|21041->11647|21071->11648|21104->11653|21189->11710|21218->11711|21251->11716|21372->11808|21402->11809|21435->11814|21593->11944|21622->11945|21651->11946|21685->11951|21715->11952|21748->11957|21833->12014|21862->12015|21894->12019|22021->12117|22051->12118|22084->12123|22218->12228|22248->12229|22282->12235|22442->12367|22471->12368|22500->12369|22534->12374|22564->12375|22598->12381|22684->12439|22713->12440|22747->12446|22869->12539|22899->12540|22933->12546|23093->12678|23122->12679|23151->12680|23185->12685|23215->12686|23249->12692|23335->12750|23364->12751|23398->12757|23520->12850|23550->12851|23584->12857|23744->12989|23773->12990|23802->12991|23836->12996|23866->12997|23900->13003|23986->13061|24015->13062|24056->13075|24085->13076|24116->13079|24145->13080|24179->13086|24221->13100|24250->13101|24279->13102|24350->13144|24380->13145|24417->13154|24476->13184|24506->13185|24546->13196|24676->13298|24706->13299|24774->13338|24804->13339|24844->13350|24918->13396|24948->13397|24985->13406|25014->13407|25092->13456|25122->13457|25159->13466|25219->13497|25249->13498|25289->13509|25419->13611|25449->13612|25517->13651|25547->13652|25587->13663|25662->13710|25692->13711|25729->13720|25758->13721|26286->14221|26302->14227|26364->14267|26600->14475|26635->14488|27497->15321|27527->15322|27557->15323|27611->15348|27641->15349|27671->15350|28554->16205|28578->16219|28613->16232|28651->16242|28687->16256|29181->16722|29205->16736|29247->16756|30518->17998|30548->17999|30578->18000|30640->18033|30670->18034|30700->18035|31281->18588|31309->18606|31345->18620|31808->19055|31836->19073|31880->19094|33039->20225|33063->20239|33099->20253|33615->20741|33639->20755|33675->20769|34065->21130|34095->21131|34125->21132|34182->21159|34213->21160|34244->21161|34359->21247|34389->21248|34419->21249|34461->21262|34491->21263|34522->21264|35042->21756|35066->21770|35102->21784|35619->22273|35643->22287|35679->22301|36076->22669|36106->22670|36136->22671|36193->22698|36224->22699|36255->22700|36370->22786|36400->22787|36430->22788|36472->22801|36503->22802|36534->22803|37446->23686|37475->23704|37512->23718|37980->24157|38009->24175|38046->24189|38423->24537|38453->24538|38483->24539|38546->24572|38577->24573|38608->24574|38710->24647|38740->24648|38770->24649|38815->24665|38845->24666|38875->24667|39359->25122|39388->25140|39425->25154|39894->25594|39923->25612|39960->25626|40326->25963|40356->25964|40386->25965|40449->25998|40480->25999|40511->26000|40614->26074|40644->26075|40674->26076|40719->26092|40749->26093|40779->26094|41707->26994|41723->27000|41782->27037|42525->27751|42555->27752|42592->27761|42707->27848|42736->27849|42819->27903|42849->27904|42882->27909|42953->27952|42982->27953|43351->28293|43381->28294|43418->28303|43479->28335|43509->28336|43551->28349|43689->28458|43719->28459|43765->28476|43838->28520|43868->28521|43906->28531|43936->28532|43982->28550|44047->28586|44077->28587|44136->28617|44196->28648|44226->28649|44272->28666|44396->28761|44426->28762|44476->28783|44603->28881|44633->28882|44688->28908|44818->29009|44848->29010|44918->29051|44948->29052|45008->29083|45038->29084|45119->29136|45149->29137|45195->29154|45319->29249|45349->29250|45399->29271|45524->29367|45554->29368|45609->29394|45739->29495|45769->29496|45839->29537|45869->29538|45929->29569|45959->29570|46045->29627|46075->29628|46121->29645|46245->29740|46275->29741|46325->29762|46452->29860|46482->29861|46537->29887|46667->29988|46697->29989|46767->30030|46797->30031|46857->30062|46887->30063|47502->30649|47532->30650|47578->30667|47982->31042|48012->31043|48052->31054|48290->31263|48320->31264|48373->31288|48782->31668|48812->31669|48857->31685|49118->31917|49148->31918|49191->31932|49221->31933|49261->31944|49291->31945|49332->31957|49362->31958|49399->31967|49429->31968|49504->32014|49534->32015|49601->32053|49661->32084|49691->32085|49737->32102|49861->32197|49891->32198|49941->32219|50071->32320|50101->32321|50156->32347|50286->32448|50316->32449|50386->32490|50416->32491|50476->32522|50506->32523|50588->32576|50618->32577|50664->32594|50788->32689|50818->32690|50868->32711|50994->32808|51024->32809|51079->32835|51209->32936|51239->32937|51309->32978|51339->32979|51399->33010|51429->33011|51511->33064|51541->33065|51587->33082|51711->33177|51741->33178|51791->33199|51917->33296|51947->33297|52002->33323|52132->33424|52162->33425|52232->33466|52262->33467|52322->33498|52352->33499|53027->34145|53057->34146|53107->34167|53556->34587|53586->34588|53630->34603|53912->34856|53942->34857|53998->34884|54450->35307|54480->35308|54529->35328|54805->35575|54835->35576|54882->35594|54912->35595|54957->35611|54987->35612|55031->35627|55061->35628|55103->35641|55133->35642|55176->35657|55205->35658
                  LINES: 26->1|29->1|30->2|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|51->23|51->23|51->23|52->24|52->24|52->24|61->33|61->33|62->34|66->38|66->38|67->39|68->40|68->40|69->41|69->41|69->41|70->42|71->43|71->43|71->43|71->43|71->43|72->44|75->47|75->47|76->48|77->49|77->49|78->50|78->50|79->51|79->51|80->52|80->52|81->53|82->54|82->54|83->55|85->57|85->57|86->58|87->59|87->59|87->59|87->59|87->59|91->63|91->63|92->64|92->64|92->64|92->64|92->64|92->64|93->65|93->65|94->66|95->67|95->67|97->69|97->69|98->70|102->74|102->74|103->75|106->78|106->78|107->79|108->80|108->80|110->82|110->82|111->83|111->83|111->83|112->84|113->85|113->85|114->86|114->86|117->89|117->89|118->90|119->91|119->91|120->92|120->92|122->94|165->137|165->137|166->138|169->141|169->141|171->143|183->155|183->155|184->156|186->158|186->158|186->158|186->158|187->159|188->160|188->160|190->162|190->162|190->162|191->163|192->164|192->164|193->165|195->167|195->167|195->167|195->167|196->168|197->169|197->169|199->171|200->172|200->172|201->173|203->175|203->175|203->175|203->175|204->176|205->177|205->177|207->179|208->180|208->180|209->181|211->183|211->183|211->183|211->183|212->184|213->185|213->185|214->186|214->186|216->188|216->188|216->188|217->189|218->190|218->190|219->191|221->193|221->193|221->193|221->193|221->193|222->194|223->195|223->195|225->197|226->198|226->198|227->199|229->201|229->201|229->201|229->201|229->201|230->202|231->203|231->203|233->205|234->206|234->206|235->207|237->209|237->209|237->209|237->209|237->209|238->210|239->211|239->211|241->213|241->213|243->215|244->216|244->216|245->217|246->218|246->218|247->219|249->221|249->221|249->221|249->221|250->222|251->223|251->223|252->224|253->225|253->225|254->226|256->228|256->228|256->228|256->228|257->229|258->230|258->230|260->232|261->233|261->233|262->234|264->236|264->236|264->236|264->236|265->237|266->238|266->238|268->240|269->241|269->241|270->242|271->243|271->243|272->244|274->246|274->246|274->246|274->246|275->247|276->248|276->248|278->250|279->251|279->251|280->252|282->254|282->254|282->254|282->254|282->254|283->255|284->256|284->256|286->258|287->259|287->259|288->260|290->262|290->262|290->262|290->262|290->262|291->263|292->264|292->264|293->265|293->265|294->266|294->266|297->269|298->270|298->270|299->271|300->272|300->272|301->273|303->275|303->275|303->275|303->275|303->275|304->276|305->277|305->277|307->279|308->280|308->280|309->281|311->283|311->283|311->283|311->283|311->283|312->284|313->285|313->285|315->287|316->288|316->288|317->289|319->291|319->291|319->291|319->291|319->291|320->292|321->293|321->293|322->294|323->295|323->295|324->296|325->297|325->297|326->298|328->300|328->300|328->300|328->300|328->300|329->301|330->302|330->302|332->304|333->305|333->305|334->306|336->308|336->308|336->308|336->308|336->308|337->309|338->310|338->310|340->312|341->313|341->313|342->314|344->316|344->316|344->316|344->316|344->316|345->317|346->318|346->318|348->320|348->320|349->321|349->321|351->323|352->324|352->324|353->325|356->328|356->328|357->329|357->329|357->329|358->330|361->333|361->333|363->335|363->335|364->336|365->337|365->337|366->338|366->338|369->341|369->341|370->342|370->342|370->342|371->343|374->346|374->346|376->348|376->348|377->349|378->350|378->350|379->351|379->351|399->371|399->371|399->371|405->377|405->377|421->393|421->393|421->393|421->393|421->393|421->393|441->413|441->413|441->413|441->413|441->413|449->421|449->421|449->421|478->450|478->450|478->450|478->450|478->450|478->450|490->462|490->462|490->462|497->469|497->469|497->469|523->495|523->495|523->495|532->504|532->504|532->504|542->514|542->514|542->514|542->514|542->514|542->514|543->515|543->515|543->515|543->515|543->515|543->515|554->526|554->526|554->526|563->535|563->535|563->535|573->545|573->545|573->545|573->545|573->545|573->545|574->546|574->546|574->546|574->546|574->546|574->546|590->562|590->562|590->562|594->566|594->566|594->566|604->576|604->576|604->576|604->576|604->576|604->576|605->577|605->577|605->577|605->577|605->577|605->577|612->584|612->584|612->584|616->588|616->588|616->588|626->598|626->598|626->598|626->598|626->598|626->598|627->599|627->599|627->599|627->599|627->599|627->599|647->619|647->619|647->619|671->643|671->643|672->644|675->647|675->647|680->652|680->652|681->653|682->654|682->654|691->663|691->663|692->664|693->665|693->665|694->666|697->669|697->669|698->670|699->671|699->671|700->672|700->672|702->674|702->674|702->674|705->677|705->677|705->677|706->678|708->680|708->680|709->681|711->683|711->683|712->684|714->686|714->686|716->688|716->688|718->690|718->690|720->692|720->692|721->693|723->695|723->695|724->696|726->698|726->698|727->699|729->701|729->701|731->703|731->703|733->705|733->705|735->707|735->707|736->708|738->710|738->710|739->711|741->713|741->713|742->714|744->716|744->716|746->718|746->718|748->720|748->720|769->741|769->741|770->742|782->754|782->754|783->755|794->766|794->766|796->768|806->778|806->778|808->780|814->786|814->786|815->787|815->787|816->788|816->788|817->789|817->789|818->790|818->790|819->791|819->791|822->794|822->794|822->794|823->795|825->797|825->797|826->798|828->800|828->800|829->801|831->803|831->803|833->805|833->805|835->807|835->807|837->809|837->809|838->810|840->812|840->812|841->813|843->815|843->815|844->816|846->818|846->818|848->820|848->820|850->822|850->822|852->824|852->824|853->825|855->827|855->827|856->828|858->830|858->830|859->831|861->833|861->833|863->835|863->835|865->837|865->837|886->858|886->858|887->859|899->871|899->871|900->872|910->882|910->882|912->884|922->894|922->894|924->896|929->901|929->901|930->902|930->902|931->903|931->903|932->904|932->904|933->905|933->905|935->907|935->907
                  -- GENERATED --
              */
          