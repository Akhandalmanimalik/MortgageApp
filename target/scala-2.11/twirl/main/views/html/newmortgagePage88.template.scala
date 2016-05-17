
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
object newmortgagePage88 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template12[String,EmployeIncomeTypeParam,SelfEmployeIncomeTypeParam,PensionIncomeTypeParam,InvestmentsIncomeTypeParam,MaternityIncomeTypeParam,VehicleAllowIncomeTypeParam,LivingAllowIncomeTypeParam,CommissionIncomeTypeParam,BonusIncomeTypeParam,OtherIncomeTypeParam,String,play.twirl.api.HtmlFormat.Appendable] {

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
		<div id="divID" ng-controller="DemoController" ng-init="isDisabled = false">
		
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
							
							"""),format.raw/*396.8*/("""{"""),format.raw/*396.9*/("""{"""),format.raw/*396.10*/(""" """),format.raw/*396.11*/("""employetotal1"""),format.raw/*396.24*/("""}"""),format.raw/*396.25*/("""}"""),format.raw/*396.26*/(""" """),format.raw/*396.27*/("""{"""),format.raw/*396.28*/("""{"""),format.raw/*396.29*/("""slfemployetotal1"""),format.raw/*396.45*/("""}"""),format.raw/*396.46*/("""}"""),format.raw/*396.47*/("""
							
					"""),format.raw/*398.6*/("""employeCount==="""),format.raw/*398.21*/("""{"""),format.raw/*398.22*/("""{"""),format.raw/*398.23*/("""employeCount"""),format.raw/*398.35*/("""}"""),format.raw/*398.36*/("""}"""),format.raw/*398.37*/("""
"""),format.raw/*399.1*/("""<br>
							<div ng-if="checkEmployee.areUemploye == 'yes'">
								<table id="addedRows">
								<tr>
								<th width="17%"><b>Type of Income:</b></th>
								<th width="43%"><b>Business:</b></th>
								<th width="15%"><b>Start Month:</b></th>
								<th width="25%"><b>Position:</b></th></tr>
									<tr>
										<td width="17%"><input type="text" name="empIncomeTypes"
											placeholder="E.g. Employer" class="form-control"
											value="Employed" style="width: 100%;" readonly="readonly">
										</td>
										<td width="43%"><input type="text" name="empBusinessName"
											placeholder="E.g. Business Name" style="width: 100%;"
											class="form-control" value=""></td>
										<td width="15%"><input type="text" id="datepicker0"
											name="empStartMonth" placeholder="mm/dd/yyyy"
											ng-model="empFirstMonYear" ng-selected = "employe1(this)"
											style="width: 100%; position: relative; z-index: 100000;"
											class="form-control"></td>
										<td width="25%"><input type="text" name="empPosition"
											placeholder="E.g. Manager" class="form-control"
											style="width: 100%;" value=""></td>
									</tr>
									
									<tr ng-if="employeCount>=1">
										<td width="17%"><input type="text" name="empIncomeTypes"
											placeholder="E.g. Employer" class="form-control"
											value="Employed" style="width: 100%;" readonly="readonly">
										</td>
										<td width="43%"><input type="text" name="empBusinessName"
											placeholder="E.g. Business Name" style="width: 100%;"
											class="form-control" value=""></td>
										<td width="15%"><input type="text" id="datepicker1"
											name="empStartMonth" placeholder="mm/dd/yyyy"
											ng-model="empFirstMonYear" ng-selected = "employe1(this)"
											style="width: 100%; position: relative; z-index: 100000;"
											class="form-control"></td>
										<td width="25%"><input type="text" name="empPosition"
											placeholder="E.g. Manager" class="form-control"
											style="width: 100%;" value=""></td>
									</tr>
									
								<tr ng-if="employeCount==2">
										<td width="17%"><input type="text" name="empIncomeTypes"
											placeholder="E.g. Employer" class="form-control"
											value="Employed" style="width: 100%;" readonly="readonly">
										</td>
										<td width="43%"><input type="text" name="empBusinessName"
											placeholder="E.g. Business Name" style="width: 100%;"
											class="form-control" value=""></td>
										<td width="15%"><input type="text" id="datepicker2"
											name="empStartMonth" placeholder="mm/dd/yyyy"
											ng-model="empFirstMonYear" ng-selected = "employe1(this)"
											style="width: 100%; position: relative; z-index: 100000;"
											class="form-control"></td>
										<td width="25%"><input type="text" name="empPosition"
											placeholder="E.g. Manager" class="form-control"
											style="width: 100%;" value=""></td>
									</tr>
							  						
								</table>
								<a style="padding-left: 4%; font-size: 20; color: black"
				href="#" ng-click="addemployee()"> Add  Additional  Job</a>
							
							</div>

<br>

  
      

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
									value=""""),format.raw/*485.17*/("""{"""),format.raw/*485.18*/("""{"""),format.raw/*485.19*/("""checkSelfEmployee.areUSelfEmploye"""),format.raw/*485.52*/("""}"""),format.raw/*485.53*/("""}"""),format.raw/*485.54*/("""" ng-required>
							<br>
							<!-- For Self-Employed -->
							<div ng-if="checkSelfEmployee.areUSelfEmploye == 'yes'">
							<br>
								<table id="addedRowsSelf">
											<tr>
								<th width="17%"><b>Type of Income:</b></th>
								<th width="43%"><b>Business:</b></th>
								<th width="15%"><b>Start Month:</b></th>
								<th width="25%"><b>Position:</b></th></tr>
									<tr>
										<td width="17%"><input type="text" name="selfIncomeTypes"
											placeholder="E.g. Self-Employed" style="width: 100%;"
											class="form-control" value="Self Employed"
											readonly="readonly"></td>
										<td width="43%"><input type="text"
											name="selfBusinessName" placeholder="E.g. Business Name"
											style="width: 100%;" class="form-control" value=""""),_display_(/*503.62*/selfEmployeeIncome/*503.80*/.getBusiness21),format.raw/*503.94*/(""""></td>
										<td width="15%"><input type="text" id="datepicker3"
											name="selfStartMon" placeholder="mm/dd/yyyy"
											ng-model="slfempFirstMonYear" ng-selected="employe1(this)"
											style="width: 100%; position: relative; z-index: 100000;"
											class="form-control"></td>
										<td width="25%"><input type="text" name="selfPosition"
											placeholder="E.g. Manager" class="form-control" value=""""),_display_(/*510.68*/selfEmployeeIncome/*510.86*/.getCurrentPosition21),format.raw/*510.107*/("""">
										</td>
									</tr>
												</table>
												<a style="padding-left: 4%; font-size: 20; color: black"
				href="javascript:void(0);" onclick="addMoreRowsForSelfEmp(this.form);">Add Additional Job</a> 
						
							</div>
							
						
							<!-- History of Employed -->
							<div ng-show=" employetotal1 + selfemployetotal1  < 36 && (checkEmployee.areUemploye == 'yes' || checkSelfEmployee.areUSelfEmploye == 'yes')">
							<h4 style="padding-left: 0%;"><Strong>Work History </Strong></h4>
							<hr style="width: 96%; border-color: #006699; margin-top: 0%; margin-bottom: 0%;" />
							<label class="labelfont">In most cases lenders require three years of employment history and more options will be available for those with longer employment histories. They do realize that there are exceptions however. Some of these might be if you are a home maker, have part time or seasonal work, student, on maternity leave, have a disability etc. </label>
							
							<table>
							<tr>
							  		<td width="17%"><input type="text" name="empIncomeTypes2"
												placeholder="E.g. Employer" style="width: 100%;"
												class="form-control" value="Employed" readonly="readonly">
												</td>
							  		<td width="43%"><input type="text" name="empBusinessName2"
												placeholder="E.g. Business Name" style="width: 100%;"
												class="form-control" value=""""),_display_(/*534.42*/employeeIncome/*534.56*/.getBusiness11),format.raw/*534.70*/("""">
												</td>
							  		<td width="15%"><input type="text" name="empStartMonth6"
												placeholder="mm/dd/yyyy" id="datepicker6" ng-model="empSecMonYear"
												ng-selected = "employe1(this)" style="width: 100%; position: relative; z-index: 100000;"
												class="form-control">
												</td>
							  		<td width="25%"><input type="text" name="empPosition2"
												placeholder="E.g. Manager" style="width: 100%;"
												class="form-control" value="">
											    </td>
							  	</tr>
							  
							  </table>
							  <input type="hidden" name="monthsum11" ng-model="employetotal2" value=""""),format.raw/*548.81*/("""{"""),format.raw/*548.82*/("""{"""),format.raw/*548.83*/("""employetotal2-employetotal1"""),format.raw/*548.110*/("""}"""),format.raw/*548.111*/("""}"""),format.raw/*548.112*/("""">	
							  <input type="hidden" name="totalMonths2" ng-model="employetotal2" value=""""),format.raw/*549.83*/("""{"""),format.raw/*549.84*/("""{"""),format.raw/*549.85*/("""employetotal2"""),format.raw/*549.98*/("""}"""),format.raw/*549.99*/("""}"""),format.raw/*549.100*/("""">
									<div ng-show="employetotal1 + selfemployetotal1 + historyTotal <36 &&  (checkEmployee.areUemploye == 'yes' || checkSelfEmployee.areUSelfEmploye == 'yes') ">
										<br>
										<table>
											<tr>
												<td width="17%"><input type="text" name="empIncomeTypes3"
												placeholder="E.g. Employer" style="width: 100%;"
												class="form-control" value="Employed" readonly="readonly">
											</td>
												<td width="43%"><input type="text" name="empBusinessName3"
												placeholder="E.g. Business Name" style="width: 100%;"
												class="form-control" value="">
												</td>
												<td width="15%"><input type="text" name="empStartMonth7" id="datepicker7"
												placeholder="mm/dd/yyyy" ng-model="empThirdMonYear"
												ng-selected="employe1(this)" style="width: 100%; position: relative; z-index: 100000;"
												class="form-control">
											</td>
												<td width="25%"><input type="text" name="empPosition3"
												placeholder="E.g. Manager" style="width: 100%;"
												class="form-control" value="">
												</td>
											</tr>
											
										</table>
										<input type="hidden" name="monthsum33" ng-model="employetotal2" value=""""),format.raw/*574.82*/("""{"""),format.raw/*574.83*/("""{"""),format.raw/*574.84*/("""employetotal3-employetotal2"""),format.raw/*574.111*/("""}"""),format.raw/*574.112*/("""}"""),format.raw/*574.113*/("""">
										<input type="hidden" name="totalMonths3" ng-model="employetotal3" value=""""),format.raw/*575.84*/("""{"""),format.raw/*575.85*/("""{"""),format.raw/*575.86*/("""employetotal3"""),format.raw/*575.99*/("""}"""),format.raw/*575.100*/("""}"""),format.raw/*575.101*/("""">
					</div>
					
					
					</div>
							
							
						
							<!-- History of Self-Employed -->
							<div ng-show="43<36 && checkSelfEmployee.areUSelfEmploye != 'yes'">
					  		<h4 style="padding-left: 0%;"><Strong>Work History Self-Employed</Strong></h4>
							<hr style="width: 96%; border-color: #006699; margin-top: 0%; margin-bottom: 0%;" />
							<label class="labelfont">In most cases lenders require three years of employment history and more options will be available for those with longer employment histories. They do realize that there are exceptions however. Some of these might be if you are a home maker, have part time or seasonal work, student, on maternity leave, have a disability etc. </label>
					  		<table>
					  			<tr>
					  				<td width="17%"><input type="text" name="selfIncomeTypes2" placeholder="E.g. Self-Employed" style="width: 100%;" class="form-control" value="Self Employed" readonly="readonly">
									     			</td>
					  				<td width="43%"><input type="text" name="selfBusinessName2" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*592.155*/selfEmployeeIncome/*592.173*/.getBusiness22),format.raw/*592.187*/("""">
      												</td>
					  				<td width="15%"><input type="text" id="datepicker4" name="selfStartMon2" placeholder="mm/dd/yyyy" ng-model="slfsecMonYears" ng-selected="employe2(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     			</td>
					  				<td width="25%"><input type="text" name="selfPosition2"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*596.146*/selfEmployeeIncome/*596.164*/.getPosition22),format.raw/*596.178*/("""">
      										</td>
					  			</tr>
					  			<tr>
					  				<td><div id="input_1121"></div></td>
					  				<td><div id="input_1122"></div></td>
					  				<td><div id="input_1123"></div></td>
					  				<td><div id="input_1124"></div></td>
					  			</tr>
					  		</table>
					  		<input type="hidden" name="selfemployemonthssum2" value=""""),format.raw/*606.67*/("""{"""),format.raw/*606.68*/("""{"""),format.raw/*606.69*/("""slfemployetotal2-slfemployetotal1"""),format.raw/*606.102*/("""}"""),format.raw/*606.103*/("""}"""),format.raw/*606.104*/("""">
					  		<input type="hidden" name="selfemployemonthsumTotal2" value=""""),format.raw/*607.71*/("""{"""),format.raw/*607.72*/("""{"""),format.raw/*607.73*/("""slfemployetotal2"""),format.raw/*607.89*/("""}"""),format.raw/*607.90*/("""}"""),format.raw/*607.91*/("""">
							<div ng-show="slfemployetotal2 < 36">
								<br>
								<table>
									<tr>
										<td width="17%"><input type="text" name="selfIncomeTypes3" placeholder="E.g. Self-Employed" style="width: 100%;" class="form-control" value="Self Employed" readonly="readonly">
									     				</td>
										<td width="43%"><input type="text" name="selfBusinessName3" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*614.154*/selfEmployeeIncome/*614.172*/.getBusiness23),format.raw/*614.186*/("""">
      													</td>
										<td width="15%"><input type="text" id="datepicker5" name="selfStartMon3" placeholder="mm/dd/yyyy" ng-model="slfthirdMonYear" ng-selected="employe2(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     				</td>
										<td width="25%"><input type="text" name="selfPosition3"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*618.145*/selfEmployeeIncome/*618.163*/.getPosition23),format.raw/*618.177*/("""">
      													</td>
									</tr>
									<tr>
									<td><div id="input_1125"></div></td>
									<td><div id="input_1126"></div></td>
									<td><div id="input_1127"></div></td>
									<td><div id="input_1128"></div></td>
								</tr>
								</table>
								<input type="hidden" name="selfemployemonthssum3" value=""""),format.raw/*628.66*/("""{"""),format.raw/*628.67*/("""{"""),format.raw/*628.68*/("""slfemployetotal3-slfemployetotal2"""),format.raw/*628.101*/("""}"""),format.raw/*628.102*/("""}"""),format.raw/*628.103*/("""">
					  			<input type="hidden" name="selfemployemonthsumTotal3" value=""""),format.raw/*629.72*/("""{"""),format.raw/*629.73*/("""{"""),format.raw/*629.74*/("""slfemployetotal3"""),format.raw/*629.90*/("""}"""),format.raw/*629.91*/("""}"""),format.raw/*629.92*/("""">
							</div>
						</div>
			      <br>
			       <br> <br>
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
						  <script src=""""),_display_(/*650.23*/routes/*650.29*/.Assets.at("_resources/jquery-ui.js")),format.raw/*650.66*/("""" type="text/javascript"></script>
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

<script type="text/javascript">
    $(function() """),format.raw/*673.18*/("""{"""),format.raw/*673.19*/("""
        """),format.raw/*674.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*677.5*/("""}"""),format.raw/*677.6*/(""");
	
</script>

 <script>
$(document).ready(function()"""),format.raw/*682.29*/("""{"""),format.raw/*682.30*/("""
    """),format.raw/*683.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*684.1*/("""}"""),format.raw/*684.2*/(""");
</script>

<script src="https://maps.googleapis.com/maps/api/Are you Self-Employed?js?sensor=false&amp;libraries=places"></script>
 
    <script src="jquery.geocomplete.js"></script>
    
   <script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);
    app.controller('DemoController', function ($scope) """),format.raw/*693.56*/("""{"""),format.raw/*693.57*/("""
        """),format.raw/*694.9*/("""init();
        $scope.monthsTotal=0;
        $scope.employetotal1=0;
      	$scope.selfemployetotal1=0;
    	$scope.historyTotal=0;
        var totalMonths=0;
        function init() """),format.raw/*700.25*/("""{"""),format.raw/*700.26*/("""
        	"""),format.raw/*701.10*/("""$scope.employeCount=0;
            $scope.newItemType = '';
            $scope.company="";
            
            $scope.change = function () """),format.raw/*705.41*/("""{"""),format.raw/*705.42*/("""
                """),format.raw/*706.17*/("""console.log($scope.newItemType)
            """),format.raw/*707.13*/("""}"""),format.raw/*707.14*/(""";
        """),format.raw/*708.9*/("""}"""),format.raw/*708.10*/("""

        """),format.raw/*710.9*/("""$scope.addemployee=function ($scope) """),format.raw/*710.46*/("""{"""),format.raw/*710.47*/("""
        	"""),format.raw/*711.10*/("""alert("Employe Count "+	$scope.employeCount);
         	$scope.employeCount=$scope.employeCount+1;
         	
         	alert($scope.employeCount);
         	
           """),format.raw/*716.12*/("""}"""),format.raw/*716.13*/("""
        
        
        """),format.raw/*719.9*/("""$scope.employe1 = function ($scope) """),format.raw/*719.45*/("""{"""),format.raw/*719.46*/("""
        	
        	
        	"""),format.raw/*722.10*/("""$( "#datepicker0" ).datepicker("""),format.raw/*722.41*/("""{"""),format.raw/*722.42*/("""
                """),format.raw/*723.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*725.43*/("""{"""),format.raw/*725.44*/("""
                    """),format.raw/*726.21*/("""$scope.empFirstMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*728.52*/("""{"""),format.raw/*728.53*/("""
                         """),format.raw/*729.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*731.22*/("""}"""),format.raw/*731.23*/(""");
                     
                """),format.raw/*733.17*/("""}"""),format.raw/*733.18*/("""
               
              """),format.raw/*735.15*/("""}"""),format.raw/*735.16*/(""");
        
        	$( "#datepicker1" ).datepicker("""),format.raw/*737.41*/("""{"""),format.raw/*737.42*/("""
                """),format.raw/*738.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*740.43*/("""{"""),format.raw/*740.44*/("""
                    """),format.raw/*741.21*/("""$scope.emp1monYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*743.52*/("""{"""),format.raw/*743.53*/("""
                         """),format.raw/*744.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*746.22*/("""}"""),format.raw/*746.23*/(""");
                     
                """),format.raw/*748.17*/("""}"""),format.raw/*748.18*/("""
               
              """),format.raw/*750.15*/("""}"""),format.raw/*750.16*/(""");	
        	   
        	$( "#datepicker2" ).datepicker("""),format.raw/*752.41*/("""{"""),format.raw/*752.42*/("""
                """),format.raw/*753.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*755.43*/("""{"""),format.raw/*755.44*/("""
                    """),format.raw/*756.21*/("""$scope.emp2monYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*758.52*/("""{"""),format.raw/*758.53*/("""
                         """),format.raw/*759.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*761.22*/("""}"""),format.raw/*761.23*/(""");
                     
                """),format.raw/*763.17*/("""}"""),format.raw/*763.18*/("""
               
              """),format.raw/*765.15*/("""}"""),format.raw/*765.16*/(""");
        	
       

    if($scope.checkEmployee.areUemploye == 'yes')"""),format.raw/*769.50*/("""{"""),format.raw/*769.51*/("""
     
        """),format.raw/*771.9*/("""var one= $scope.empFirstMonYear;
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
 		totalMonths=total;
           if(total <36)"""),format.raw/*790.25*/("""{"""),format.raw/*790.26*/("""
                """),format.raw/*791.17*/("""one= $scope.emp1monYear;
                date =one.split("/");
                oneDate=date[0]+"/1/"+date[2];
        	   datevDate=new Date(oneDate);
        	   
  			      	   
       		 one_day=1000*60*60*24;
       		 date1ms=date2ms;
       		 date2ms=datevDate.getTime();
       		
       		 totmili=date1ms-date2ms;
       		 
       			 if(isNaN(totmili) == false)"""),format.raw/*803.39*/("""{"""),format.raw/*803.40*/("""
       		 """),format.raw/*804.11*/("""totalDays=Math.round(totmili/one_day);

       		 totalMonths=Math.abs((totmili/one_day)/30);



     		total=total+Math.floor(totalMonths); 

     		$scope.employetotal2=total;
     		totalMonths=total;

     		 if(total<36)"""),format.raw/*815.21*/("""{"""),format.raw/*815.22*/("""
				    			 
     			  """),format.raw/*817.11*/("""one= $scope.emp2monYear;
                  date =one.split("/");
                  oneDate=date[0]+"/1/"+date[2];
          	   datevDate=new Date(oneDate);
            		
           		 one_day=1000*60*60*24;
           		 date1ms=date2ms;
           		 date2ms=datevDate.getTime();
           		
           		 totmili=date1ms-date2ms;
           		if(isNaN(totmili) == false)"""),format.raw/*827.41*/("""{"""),format.raw/*827.42*/("""

           		 """),format.raw/*829.15*/("""totalDays=Math.round(totmili/one_day);
           		 totalMonths=Math.abs((totmili/one_day)/30);
          		total=Math.floor(total)+Math.floor(totalMonths); 
					
         		$scope.employetotal3 = total;
         		$scope.employetotal1=total;
         		totalMonths=total;

           		"""),format.raw/*837.14*/("""}"""),format.raw/*837.15*/("""
             """),format.raw/*838.14*/("""}"""),format.raw/*838.15*/("""
        	 """),format.raw/*839.11*/("""}"""),format.raw/*839.12*/("""
           """),format.raw/*840.12*/("""}"""),format.raw/*840.13*/("""
    """),format.raw/*841.5*/("""}"""),format.raw/*841.6*/("""else"""),format.raw/*841.10*/("""{"""),format.raw/*841.11*/("""
    	
    	"""),format.raw/*843.6*/("""$scope.employetotal1=0;
 		totalMonths=0;

    """),format.raw/*846.5*/("""}"""),format.raw/*846.6*/("""
       
        
        """),format.raw/*849.9*/("""}"""),format.raw/*849.10*/(""";
 	   

    $scope.employe2 = function ($scope) """),format.raw/*852.41*/("""{"""),format.raw/*852.42*/("""
        	
        	        
        	"""),format.raw/*855.10*/("""$( "#datepicker3" ).datepicker("""),format.raw/*855.41*/("""{"""),format.raw/*855.42*/("""
                """),format.raw/*856.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*858.43*/("""{"""),format.raw/*858.44*/("""
                    """),format.raw/*859.21*/("""$scope.slfempFirstMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*861.52*/("""{"""),format.raw/*861.53*/("""
                         """),format.raw/*862.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*864.22*/("""}"""),format.raw/*864.23*/(""");
                     
                """),format.raw/*866.17*/("""}"""),format.raw/*866.18*/("""
               
              """),format.raw/*868.15*/("""}"""),format.raw/*868.16*/(""");
        	
        	$( "#datepicker4" ).datepicker("""),format.raw/*870.41*/("""{"""),format.raw/*870.42*/("""
                """),format.raw/*871.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*873.43*/("""{"""),format.raw/*873.44*/("""
                    """),format.raw/*874.21*/("""$scope.slf4MonYears = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*876.52*/("""{"""),format.raw/*876.53*/("""
                         """),format.raw/*877.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*879.22*/("""}"""),format.raw/*879.23*/(""");
                     
                """),format.raw/*881.17*/("""}"""),format.raw/*881.18*/("""
               
              """),format.raw/*883.15*/("""}"""),format.raw/*883.16*/(""");
        	
        	$( "#datepicker5" ).datepicker("""),format.raw/*885.41*/("""{"""),format.raw/*885.42*/("""
                """),format.raw/*886.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*888.43*/("""{"""),format.raw/*888.44*/("""
                    """),format.raw/*889.21*/("""$scope.slf5MonYears = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*891.52*/("""{"""),format.raw/*891.53*/("""
                         """),format.raw/*892.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*894.22*/("""}"""),format.raw/*894.23*/(""");
                     
                """),format.raw/*896.17*/("""}"""),format.raw/*896.18*/("""
               
              """),format.raw/*898.15*/("""}"""),format.raw/*898.16*/(""");
        	
        	
        	
        	
        	$( "#datepicker6" ).datepicker("""),format.raw/*903.41*/("""{"""),format.raw/*903.42*/("""
                """),format.raw/*904.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*906.43*/("""{"""),format.raw/*906.44*/("""
                    """),format.raw/*907.21*/("""$scope.historyEmployeOne = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*909.52*/("""{"""),format.raw/*909.53*/("""
                         """),format.raw/*910.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*912.22*/("""}"""),format.raw/*912.23*/(""");
                     
                """),format.raw/*914.17*/("""}"""),format.raw/*914.18*/("""
               
              """),format.raw/*916.15*/("""}"""),format.raw/*916.16*/(""");
        	
        	$( "#datepicker7" ).datepicker("""),format.raw/*918.41*/("""{"""),format.raw/*918.42*/("""
                """),format.raw/*919.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*921.43*/("""{"""),format.raw/*921.44*/("""
                    """),format.raw/*922.21*/("""$scope.historyEmployeeTwo = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*924.52*/("""{"""),format.raw/*924.53*/("""
                         """),format.raw/*925.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*927.22*/("""}"""),format.raw/*927.23*/(""");
                     
                """),format.raw/*929.17*/("""}"""),format.raw/*929.18*/("""
               
              """),format.raw/*931.15*/("""}"""),format.raw/*931.16*/(""");
        	
        
        	$scope.selfemployetotal1=0;
        	if($scope.checkSelfEmployee.areUSelfEmploye== 'yes')"""),format.raw/*935.62*/("""{"""),format.raw/*935.63*/("""
        	
            """),format.raw/*937.13*/("""var one= $scope.slfempFirstMonYear;
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
     		$scope.selfemployetotal1=total;

               if(total <36)"""),format.raw/*958.29*/("""{"""),format.raw/*958.30*/("""
                    """),format.raw/*959.21*/("""one= $scope.slfsecMonYears;
                    date =one.split("/");
                    oneDate=date[0]+"/1/"+date[2];
            	   datevDate=new Date(oneDate);
      			      	   
           		 one_day=1000*60*60*24;
           		 date1ms=date2ms;
           		
           		 date2ms=datevDate.getTime();
           		 
           		 totmili=date1ms-date2ms;
           		 
           		if(isNaN(totmili) == false)"""),format.raw/*971.41*/("""{"""),format.raw/*971.42*/("""
           		 """),format.raw/*972.15*/("""totalDays=Math.round(totmili/one_day);

           		 totalMonths=Math.abs((totmili/one_day)/30);

         		total=total+Math.floor(totalMonths); 

         		$scope.slfemployetotal2 = total;
         		$scope.selfemployetotal1=total;

         		
         		 if(total<36)"""),format.raw/*982.25*/("""{"""),format.raw/*982.26*/("""
         		
         			  """),format.raw/*984.15*/("""one= $scope.slfthirdMonYear;
                      date =one.split("/");
                      oneDate=date[0]+"/1/"+date[2];
              	   	  datevDate=new Date(oneDate);
                		
               		 one_day=1000*60*60*24;
               		 date1ms=date2ms;
               		 date2ms=datevDate.getTime();
               		
               		 totmili=date1ms-date2ms;
               		if(isNaN(totmili) == false)"""),format.raw/*994.45*/("""{"""),format.raw/*994.46*/("""

               		 """),format.raw/*996.19*/("""totalDays=Math.round(totmili/one_day);pensiontotal1
               		 totalMonths=Math.abs((totmili/one_day)/30);
              		total=Math.floor(total)+Math.floor(totalMonths); 

             		$scope.slfemployetotal3 = total;
             		$scope.selfemployetotal1=total;


               	  """),format.raw/*1004.19*/("""}"""),format.raw/*1004.20*/("""
                 """),format.raw/*1005.18*/("""}"""),format.raw/*1005.19*/("""
               """),format.raw/*1006.16*/("""}"""),format.raw/*1006.17*/("""
              """),format.raw/*1007.15*/("""}"""),format.raw/*1007.16*/("""

        	"""),format.raw/*1009.10*/("""}"""),format.raw/*1009.11*/("""else"""),format.raw/*1009.15*/("""{"""),format.raw/*1009.16*/("""
        		"""),format.raw/*1010.11*/("""$scope.slfemployetotal1=0;
        		$scope.slfemployetotal3 =0;
        		$scope.slfemployetotal2=0;

        	"""),format.raw/*1014.10*/("""}"""),format.raw/*1014.11*/("""
        	
          """),format.raw/*1016.11*/("""if($scope.employetotal1 + $scope.selfemployetotal1 <36 && ($scope.checkSelfEmployee.areUSelfEmploye== 'yes' || $scope.checkEmployee.areUemploye == 'yes'))"""),format.raw/*1016.165*/("""{"""),format.raw/*1016.166*/("""
        	"""),format.raw/*1017.10*/("""var one= $scope.historyEmployeOne;
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
        	
        	$scope.historyTotal = total;
     		
     	      if(total <36)"""),format.raw/*1037.26*/("""{"""),format.raw/*1037.27*/("""
                  """),format.raw/*1038.19*/("""one= $scope.historyEmployeTwo;
                  date =one.split("/");
                  oneDate=date[0]+"/1/"+date[2];
          	   datevDate=new Date(oneDate);
    			      	   
         		 one_day=1000*60*60*24;
         		 date1ms=date2ms;
         		
         		 date2ms=datevDate.getTime();
         		 
         		 totmili=date1ms-date2ms;
         		 
         		if(isNaN(totmili) == false)"""),format.raw/*1050.39*/("""{"""),format.raw/*1050.40*/("""
         		 """),format.raw/*1051.13*/("""totalDays=Math.round(totmili/one_day);

         		 totalMonths=Math.abs((totmili/one_day)/30);

       		total=total+Math.floor(totalMonths); 

       		$scope.historyTotal= total;
         		"""),format.raw/*1058.12*/("""}"""),format.raw/*1058.13*/("""
        	
          """),format.raw/*1060.11*/("""}"""),format.raw/*1060.12*/("""else"""),format.raw/*1060.16*/("""{"""),format.raw/*1060.17*/("""
        	  """),format.raw/*1061.12*/("""historyTotal=0;
        	  """),format.raw/*1062.12*/("""}"""),format.raw/*1062.13*/("""
          """),format.raw/*1063.11*/("""}"""),format.raw/*1063.12*/("""
            """),format.raw/*1064.13*/("""}"""),format.raw/*1064.14*/(""";
        
         
           
 		
    """),format.raw/*1069.5*/("""}"""),format.raw/*1069.6*/(""");
   
    </script>
    
    <script type="text/javascript">
   
	
			function addMoreRows(frm) """),format.raw/*1076.30*/("""{"""),format.raw/*1076.31*/("""
				"""),format.raw/*1077.5*/("""var rowCount=document.getElementById("addedRows").rows.length;
				rowCount=rowCount-2;
				if(rowCount<3)"""),format.raw/*1079.19*/("""{"""),format.raw/*1079.20*/("""
				
				
				"""),format.raw/*1082.5*/("""var recRow = '<tr id="rowCount'+rowCount+'"  >	<td><input type="text" name="empIncomeTypes"	placeholder="E.g. Employer" class="form-control"value="Employed" style="float:left;width: 100%;" readonly="readonly"></td>'
				+'<td width="17%"><input type="text"  name="empBusinessName"placeholder="E.g. Business Name" style="float:left;width: 100%;"class="form-control" value="" ></td>'
				+'<td width="15%"><input type="text" id="datepicker'+rowCount+'" name="empStartMonth" placeholder="mm/dd/yyyy"ng-model="emp'+rowCount+'monYear" ng-selected = "employe1(this)"style="width: 100%; position: relative; z-index: 100000;"class="form-control"></td>'
				+'<td width="25%"><input type="text" name="empPosition"placeholder="E.g. Manager" class="form-control" style="width: 100%;" value=""></td>'
				+'<td><a href="javascript:void(0);" onclick="removeRow('
						+ rowCount + ');">Delete</a></td></tr>';
				jQuery('#addedRows').append(recRow);
			"""),format.raw/*1089.4*/("""}"""),format.raw/*1089.5*/("""
			"""),format.raw/*1090.4*/("""}"""),format.raw/*1090.5*/("""

			"""),format.raw/*1092.4*/("""function removeRow(removeNum) """),format.raw/*1092.34*/("""{"""),format.raw/*1092.35*/("""
				"""),format.raw/*1093.5*/("""jQuery('#rowCount' + removeNum).remove();
				angular.element(document.getElementById('divID')).scope().employe1();

			"""),format.raw/*1096.4*/("""}"""),format.raw/*1096.5*/("""
		"""),format.raw/*1097.3*/("""</script>
		
		<script type="text/javascript">
			function addMoreRowsForSelfEmp(frm) """),format.raw/*1100.40*/("""{"""),format.raw/*1100.41*/("""
				"""),format.raw/*1101.5*/("""var rowCount1=document.getElementById("addedRowsSelf").rows.length;
		
			rowCount1=rowCount1+2;

				if(rowCount1<6)"""),format.raw/*1105.20*/("""{"""),format.raw/*1105.21*/("""

				"""),format.raw/*1107.5*/("""var recRow = '<tr id="rowCountSelf'+rowCount1+'"  >	<td width="17%"><input type="text" name="selfIncomeTypes"placeholder="E.g. Self-Employed" style="width: 100%;"class="form-control" value="Self Employed"readonly="readonly"></td>'
				+'<td width="43%"><input type="text" name="selfBusinessName" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""></td>'
				+'<td width="15%"><input type="text"  id="datepicker'+rowCount1+'"	name="selfStartMon" placeholder="mm/dd/yyyy" ng-model="slf'+rowCount1+'MonYears" ng-selected="employe1(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control"></td>'
				+'	<td width="25%"><input type="text" name="selfPosition" placeholder="E.g. Manager" class="form-control" value=""""),_display_(/*1110.119*/selfEmployeeIncome/*1110.137*/.getCurrentPosition21),format.raw/*1110.158*/(""""></td>'
				+'<td><a href="javascript:void(0);" ng-click="employe2();" onclick="removeRowForSelfEmp('
						+ rowCount1 + ');">Delete</a></td></tr>';
				jQuery('#addedRowsSelf').append(recRow);
				"""),format.raw/*1114.5*/("""}"""),format.raw/*1114.6*/("""
			"""),format.raw/*1115.4*/("""}"""),format.raw/*1115.5*/("""

			"""),format.raw/*1117.4*/("""function removeRowForSelfEmp(removeNum) """),format.raw/*1117.44*/("""{"""),format.raw/*1117.45*/("""
				"""),format.raw/*1118.5*/("""jQuery('#rowCountSelf' + removeNum).remove();
			"""),format.raw/*1119.4*/("""}"""),format.raw/*1119.5*/("""
		"""),format.raw/*1120.3*/("""</script>
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
                  DATE: Mon May 16 20:16:28 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/newmortgagePage88.scala.html
                  HASH: cd65ef234923cf2e8c883f44b1a4c5dc4a0f9900
                  MATRIX: 991->1|1541->462|1568->463|2178->1046|2193->1052|2256->1094|2299->1110|2314->1116|2376->1157|2461->1215|2476->1221|2536->1260|2612->1309|2627->1315|2682->1349|2758->1398|2773->1404|2831->1441|2896->1479|2911->1485|2968->1521|3224->1750|3239->1756|3304->1800|3357->1826|3372->1832|3439->1878|3769->2180|3798->2181|3828->2184|4021->2349|4050->2350|4081->2354|4166->2411|4195->2412|4227->2417|4277->2439|4306->2440|4339->2446|4377->2457|4405->2458|4433->2459|4466->2464|4495->2465|4528->2471|4705->2620|4734->2621|4768->2628|4833->2666|4861->2667|4893->2672|4921->2673|4952->2677|4980->2678|5010->2681|5038->2682|5068->2685|5119->2709|5147->2710|5175->2711|5244->2752|5273->2753|5303->2756|5385->2810|5414->2811|5443->2812|5488->2829|5517->2830|5624->2909|5653->2910|5683->2913|5741->2943|5770->2944|5799->2945|5875->2993|5904->2994|5986->3048|6015->3049|6046->3053|6120->3100|6148->3101|6184->3110|6212->3111|6241->3113|6369->3214|6397->3215|6425->3216|6531->3294|6560->3295|6590->3298|6642->3323|6670->3324|6731->3357|6760->3358|6790->3361|6846->3389|6875->3390|6906->3394|6965->3426|6993->3427|7024->3431|7052->3432|7156->3508|7185->3509|7218->3515|7266->3536|7294->3537|7353->3568|7382->3569|7421->3581|9695->5827|9724->5828|9757->5833|9853->5900|9883->5901|9917->5907|10840->6800|10871->6801|10910->6811|11070->6943|11099->6944|11131->6948|11161->6949|11193->6953|11275->7007|11304->7008|11338->7014|11389->7036|11419->7037|11451->7041|11576->7137|11606->7138|11640->7144|11803->7279|11832->7280|11864->7284|11894->7285|11926->7289|12009->7344|12038->7345|12074->7353|12193->7443|12223->7444|12257->7450|12420->7585|12449->7586|12481->7590|12511->7591|12543->7595|12626->7650|12655->7651|12691->7659|12804->7743|12834->7744|12868->7750|13031->7885|13060->7886|13092->7890|13122->7891|13154->7895|13237->7950|13266->7951|13297->7954|13326->7955|13360->7961|13417->7989|13447->7990|13479->7994|13609->8095|13639->8096|13672->8101|13830->8231|13859->8232|13888->8233|13922->8238|13952->8239|13985->8244|14070->8301|14099->8302|14132->8307|14250->8396|14280->8397|14313->8402|14471->8532|14500->8533|14529->8534|14563->8539|14593->8540|14626->8545|14711->8602|14740->8603|14776->8611|14894->8700|14924->8701|14957->8706|15115->8836|15144->8837|15173->8838|15207->8843|15237->8844|15270->8849|15355->8906|15384->8907|15419->8914|15448->8915|15480->8919|15616->9026|15646->9027|15678->9031|15806->9130|15836->9131|15870->9137|16031->9270|16060->9271|16092->9275|16122->9276|16154->9280|16237->9335|16266->9336|16298->9340|16420->9433|16450->9434|16482->9438|16637->9565|16666->9566|16698->9570|16728->9571|16760->9575|16843->9630|16872->9631|16911->9642|17027->9729|17057->9730|17089->9734|17244->9861|17273->9862|17305->9866|17335->9867|17367->9871|17450->9926|17479->9927|17515->9935|17633->10024|17663->10025|17696->10030|17825->10130|17855->10131|17888->10136|18045->10265|18074->10266|18107->10270|18137->10271|18170->10276|18254->10332|18283->10333|18326->10348|18451->10444|18481->10445|18514->10450|18673->10581|18702->10582|18731->10583|18765->10588|18795->10589|18828->10594|18914->10652|18943->10653|18981->10663|19100->10753|19130->10754|19163->10759|19322->10890|19351->10891|19380->10892|19414->10897|19444->10898|19477->10903|19563->10961|19592->10962|19630->10972|19659->10973|19690->10976|19719->10977|19756->10986|19890->11091|19920->11092|19952->11096|20085->11200|20115->11201|20148->11206|20306->11336|20335->11337|20364->11338|20398->11343|20428->11344|20461->11349|20546->11406|20575->11407|20608->11412|20729->11504|20759->11505|20792->11510|20950->11640|20979->11641|21008->11642|21042->11647|21072->11648|21105->11653|21190->11710|21219->11711|21252->11716|21373->11808|21403->11809|21436->11814|21594->11944|21623->11945|21652->11946|21686->11951|21716->11952|21749->11957|21834->12014|21863->12015|21895->12019|22022->12117|22052->12118|22085->12123|22219->12228|22249->12229|22283->12235|22443->12367|22472->12368|22501->12369|22535->12374|22565->12375|22599->12381|22685->12439|22714->12440|22748->12446|22870->12539|22900->12540|22934->12546|23094->12678|23123->12679|23152->12680|23186->12685|23216->12686|23250->12692|23336->12750|23365->12751|23399->12757|23521->12850|23551->12851|23585->12857|23745->12989|23774->12990|23803->12991|23837->12996|23867->12997|23901->13003|23987->13061|24016->13062|24057->13075|24086->13076|24117->13079|24146->13080|24180->13086|24222->13100|24251->13101|24280->13102|24351->13144|24381->13145|24418->13154|24477->13184|24507->13185|24547->13196|24677->13298|24707->13299|24775->13338|24805->13339|24845->13350|24919->13396|24949->13397|24986->13406|25015->13407|25093->13456|25123->13457|25160->13466|25220->13497|25250->13498|25290->13509|25420->13611|25450->13612|25518->13651|25548->13652|25588->13663|25663->13710|25693->13711|25730->13720|25759->13721|26287->14221|26303->14227|26365->14267|26612->14486|26647->14499|27509->15332|27539->15333|27569->15334|27623->15359|27653->15360|27683->15361|27753->15403|27782->15404|27812->15405|27842->15406|27884->15419|27914->15420|27944->15421|27974->15422|28004->15423|28034->15424|28079->15440|28109->15441|28139->15442|28181->15456|28225->15471|28255->15472|28285->15473|28326->15485|28356->15486|28386->15487|28415->15488|32498->19542|32528->19543|32558->19544|32620->19577|32650->19578|32680->19579|33506->20377|33534->20395|33570->20409|34033->20844|34061->20862|34105->20883|35542->22292|35566->22306|35602->22320|36266->22955|36296->22956|36326->22957|36383->22984|36414->22985|36445->22986|36560->23072|36590->23073|36620->23074|36662->23087|36692->23088|36723->23089|38004->24341|38034->24342|38064->24343|38121->24370|38152->24371|38183->24372|38298->24458|38328->24459|38358->24460|38400->24473|38431->24474|38462->24475|39614->25598|39643->25616|39680->25630|40148->26069|40177->26087|40214->26101|40591->26449|40621->26450|40651->26451|40714->26484|40745->26485|40776->26486|40878->26559|40908->26560|40938->26561|40983->26577|41013->26578|41043->26579|41527->27034|41556->27052|41593->27066|42062->27506|42091->27524|42128->27538|42494->27875|42524->27876|42554->27877|42617->27910|42648->27911|42679->27912|42782->27986|42812->27987|42842->27988|42887->28004|42917->28005|42947->28006|43895->28926|43911->28932|43970->28969|44699->29669|44729->29670|44766->29679|44881->29766|44910->29767|44993->29821|45023->29822|45056->29827|45127->29870|45156->29871|45525->30211|45555->30212|45592->30221|45805->30405|45835->30406|45874->30416|46047->30560|46077->30561|46123->30578|46196->30622|46226->30623|46264->30633|46294->30634|46332->30644|46398->30681|46428->30682|46467->30692|46666->30862|46696->30863|46751->30890|46816->30926|46846->30927|46905->30957|46965->30988|46995->30989|47041->31006|47165->31101|47195->31102|47245->31123|47372->31221|47402->31222|47457->31248|47587->31349|47617->31350|47687->31391|47717->31392|47777->31423|47807->31424|47888->31476|47918->31477|47964->31494|48088->31589|48118->31590|48168->31611|48291->31705|48321->31706|48376->31732|48506->31833|48536->31834|48606->31875|48636->31876|48696->31907|48726->31908|48812->31965|48842->31966|48888->31983|49012->32078|49042->32079|49092->32100|49215->32194|49245->32195|49300->32221|49430->32322|49460->32323|49530->32364|49560->32365|49620->32396|49650->32397|49750->32468|49780->32469|49823->32484|50408->33040|50438->33041|50484->33058|50886->33431|50916->33432|50956->33443|51210->33668|51240->33669|51293->33693|51698->34069|51728->34070|51773->34086|52091->34375|52121->34376|52164->34390|52194->34391|52234->34402|52264->34403|52305->34415|52335->34416|52368->34421|52397->34422|52430->34426|52460->34427|52500->34439|52575->34486|52604->34487|52658->34513|52688->34514|52766->34563|52796->34564|52863->34602|52923->34633|52953->34634|52999->34651|53123->34746|53153->34747|53203->34768|53333->34869|53363->34870|53418->34896|53548->34997|53578->34998|53648->35039|53678->35040|53738->35071|53768->35072|53850->35125|53880->35126|53926->35143|54050->35238|54080->35239|54130->35260|54254->35355|54284->35356|54339->35382|54469->35483|54499->35484|54569->35525|54599->35526|54659->35557|54689->35558|54771->35611|54801->35612|54847->35629|54971->35724|55001->35725|55051->35746|55175->35841|55205->35842|55260->35868|55390->35969|55420->35970|55490->36011|55520->36012|55580->36043|55610->36044|55722->36127|55752->36128|55798->36145|55922->36240|55952->36241|56002->36262|56131->36362|56161->36363|56216->36389|56346->36490|56376->36491|56446->36532|56476->36533|56536->36564|56566->36565|56648->36618|56678->36619|56724->36636|56848->36731|56878->36732|56928->36753|57058->36854|57088->36855|57143->36881|57273->36982|57303->36983|57373->37024|57403->37025|57463->37056|57493->37057|57642->37177|57672->37178|57724->37201|58414->37862|58444->37863|58494->37884|58943->38304|58973->38305|59017->38320|59319->38593|59349->38594|59405->38621|59857->39044|59887->39045|59936->39065|60262->39361|60293->39362|60341->39380|60372->39381|60418->39397|60449->39398|60494->39413|60525->39414|60566->39425|60597->39426|60631->39430|60662->39431|60703->39442|60845->39554|60876->39555|60927->39576|61112->39730|61144->39731|61184->39741|61837->40364|61868->40365|61917->40384|62346->40783|62377->40784|62420->40797|62643->40990|62674->40991|62725->41012|62756->41013|62790->41017|62821->41018|62863->41030|62920->41057|62951->41058|62992->41069|63023->41070|63066->41083|63097->41084|63167->41125|63197->41126|63324->41223|63355->41224|63389->41229|63525->41335|63556->41336|63600->41351|64570->42292|64600->42293|64633->42297|64663->42298|64697->42303|64757->42333|64788->42334|64822->42339|64971->42459|65001->42460|65033->42463|65149->42549|65180->42550|65214->42555|65361->42672|65392->42673|65427->42679|66229->43451|66259->43469|66304->43490|66533->43690|66563->43691|66596->43695|66626->43696|66660->43701|66730->43741|66761->43742|66795->43747|66873->43796|66903->43797|66935->43800
                  LINES: 26->1|29->1|30->2|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|51->23|51->23|51->23|52->24|52->24|52->24|61->33|61->33|62->34|66->38|66->38|67->39|68->40|68->40|69->41|69->41|69->41|70->42|71->43|71->43|71->43|71->43|71->43|72->44|75->47|75->47|76->48|77->49|77->49|78->50|78->50|79->51|79->51|80->52|80->52|81->53|82->54|82->54|83->55|85->57|85->57|86->58|87->59|87->59|87->59|87->59|87->59|91->63|91->63|92->64|92->64|92->64|92->64|92->64|92->64|93->65|93->65|94->66|95->67|95->67|97->69|97->69|98->70|102->74|102->74|103->75|106->78|106->78|107->79|108->80|108->80|110->82|110->82|111->83|111->83|111->83|112->84|113->85|113->85|114->86|114->86|117->89|117->89|118->90|119->91|119->91|120->92|120->92|122->94|165->137|165->137|166->138|169->141|169->141|171->143|183->155|183->155|184->156|186->158|186->158|186->158|186->158|187->159|188->160|188->160|190->162|190->162|190->162|191->163|192->164|192->164|193->165|195->167|195->167|195->167|195->167|196->168|197->169|197->169|199->171|200->172|200->172|201->173|203->175|203->175|203->175|203->175|204->176|205->177|205->177|207->179|208->180|208->180|209->181|211->183|211->183|211->183|211->183|212->184|213->185|213->185|214->186|214->186|216->188|216->188|216->188|217->189|218->190|218->190|219->191|221->193|221->193|221->193|221->193|221->193|222->194|223->195|223->195|225->197|226->198|226->198|227->199|229->201|229->201|229->201|229->201|229->201|230->202|231->203|231->203|233->205|234->206|234->206|235->207|237->209|237->209|237->209|237->209|237->209|238->210|239->211|239->211|241->213|241->213|243->215|244->216|244->216|245->217|246->218|246->218|247->219|249->221|249->221|249->221|249->221|250->222|251->223|251->223|252->224|253->225|253->225|254->226|256->228|256->228|256->228|256->228|257->229|258->230|258->230|260->232|261->233|261->233|262->234|264->236|264->236|264->236|264->236|265->237|266->238|266->238|268->240|269->241|269->241|270->242|271->243|271->243|272->244|274->246|274->246|274->246|274->246|275->247|276->248|276->248|278->250|279->251|279->251|280->252|282->254|282->254|282->254|282->254|282->254|283->255|284->256|284->256|286->258|287->259|287->259|288->260|290->262|290->262|290->262|290->262|290->262|291->263|292->264|292->264|293->265|293->265|294->266|294->266|297->269|298->270|298->270|299->271|300->272|300->272|301->273|303->275|303->275|303->275|303->275|303->275|304->276|305->277|305->277|307->279|308->280|308->280|309->281|311->283|311->283|311->283|311->283|311->283|312->284|313->285|313->285|315->287|316->288|316->288|317->289|319->291|319->291|319->291|319->291|319->291|320->292|321->293|321->293|322->294|323->295|323->295|324->296|325->297|325->297|326->298|328->300|328->300|328->300|328->300|328->300|329->301|330->302|330->302|332->304|333->305|333->305|334->306|336->308|336->308|336->308|336->308|336->308|337->309|338->310|338->310|340->312|341->313|341->313|342->314|344->316|344->316|344->316|344->316|344->316|345->317|346->318|346->318|348->320|348->320|349->321|349->321|351->323|352->324|352->324|353->325|356->328|356->328|357->329|357->329|357->329|358->330|361->333|361->333|363->335|363->335|364->336|365->337|365->337|366->338|366->338|369->341|369->341|370->342|370->342|370->342|371->343|374->346|374->346|376->348|376->348|377->349|378->350|378->350|379->351|379->351|399->371|399->371|399->371|405->377|405->377|421->393|421->393|421->393|421->393|421->393|421->393|424->396|424->396|424->396|424->396|424->396|424->396|424->396|424->396|424->396|424->396|424->396|424->396|424->396|426->398|426->398|426->398|426->398|426->398|426->398|426->398|427->399|513->485|513->485|513->485|513->485|513->485|513->485|531->503|531->503|531->503|538->510|538->510|538->510|562->534|562->534|562->534|576->548|576->548|576->548|576->548|576->548|576->548|577->549|577->549|577->549|577->549|577->549|577->549|602->574|602->574|602->574|602->574|602->574|602->574|603->575|603->575|603->575|603->575|603->575|603->575|620->592|620->592|620->592|624->596|624->596|624->596|634->606|634->606|634->606|634->606|634->606|634->606|635->607|635->607|635->607|635->607|635->607|635->607|642->614|642->614|642->614|646->618|646->618|646->618|656->628|656->628|656->628|656->628|656->628|656->628|657->629|657->629|657->629|657->629|657->629|657->629|678->650|678->650|678->650|701->673|701->673|702->674|705->677|705->677|710->682|710->682|711->683|712->684|712->684|721->693|721->693|722->694|728->700|728->700|729->701|733->705|733->705|734->706|735->707|735->707|736->708|736->708|738->710|738->710|738->710|739->711|744->716|744->716|747->719|747->719|747->719|750->722|750->722|750->722|751->723|753->725|753->725|754->726|756->728|756->728|757->729|759->731|759->731|761->733|761->733|763->735|763->735|765->737|765->737|766->738|768->740|768->740|769->741|771->743|771->743|772->744|774->746|774->746|776->748|776->748|778->750|778->750|780->752|780->752|781->753|783->755|783->755|784->756|786->758|786->758|787->759|789->761|789->761|791->763|791->763|793->765|793->765|797->769|797->769|799->771|818->790|818->790|819->791|831->803|831->803|832->804|843->815|843->815|845->817|855->827|855->827|857->829|865->837|865->837|866->838|866->838|867->839|867->839|868->840|868->840|869->841|869->841|869->841|869->841|871->843|874->846|874->846|877->849|877->849|880->852|880->852|883->855|883->855|883->855|884->856|886->858|886->858|887->859|889->861|889->861|890->862|892->864|892->864|894->866|894->866|896->868|896->868|898->870|898->870|899->871|901->873|901->873|902->874|904->876|904->876|905->877|907->879|907->879|909->881|909->881|911->883|911->883|913->885|913->885|914->886|916->888|916->888|917->889|919->891|919->891|920->892|922->894|922->894|924->896|924->896|926->898|926->898|931->903|931->903|932->904|934->906|934->906|935->907|937->909|937->909|938->910|940->912|940->912|942->914|942->914|944->916|944->916|946->918|946->918|947->919|949->921|949->921|950->922|952->924|952->924|953->925|955->927|955->927|957->929|957->929|959->931|959->931|963->935|963->935|965->937|986->958|986->958|987->959|999->971|999->971|1000->972|1010->982|1010->982|1012->984|1022->994|1022->994|1024->996|1032->1004|1032->1004|1033->1005|1033->1005|1034->1006|1034->1006|1035->1007|1035->1007|1037->1009|1037->1009|1037->1009|1037->1009|1038->1010|1042->1014|1042->1014|1044->1016|1044->1016|1044->1016|1045->1017|1065->1037|1065->1037|1066->1038|1078->1050|1078->1050|1079->1051|1086->1058|1086->1058|1088->1060|1088->1060|1088->1060|1088->1060|1089->1061|1090->1062|1090->1062|1091->1063|1091->1063|1092->1064|1092->1064|1097->1069|1097->1069|1104->1076|1104->1076|1105->1077|1107->1079|1107->1079|1110->1082|1117->1089|1117->1089|1118->1090|1118->1090|1120->1092|1120->1092|1120->1092|1121->1093|1124->1096|1124->1096|1125->1097|1128->1100|1128->1100|1129->1101|1133->1105|1133->1105|1135->1107|1138->1110|1138->1110|1138->1110|1142->1114|1142->1114|1143->1115|1143->1115|1145->1117|1145->1117|1145->1117|1146->1118|1147->1119|1147->1119|1148->1120
                  -- GENERATED --
              */
          