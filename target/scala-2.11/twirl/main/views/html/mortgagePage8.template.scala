
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
object mortgagePage8 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template12[String,EmployeIncomeTypeParam,SelfEmployeIncomeTypeParam,PensionIncomeTypeParam,InvestmentsIncomeTypeParam,MaternityIncomeTypeParam,VehicleAllowIncomeTypeParam,LivingAllowIncomeTypeParam,CommissionIncomeTypeParam,BonusIncomeTypeParam,OtherIncomeTypeParam,String,play.twirl.api.HtmlFormat.Appendable] {

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
<script language="JavaScript">

        window.onbeforeunload = function () """),format.raw/*30.45*/("""{"""),format.raw/*30.46*/("""
            """),format.raw/*31.13*/("""return "Are you sure?";
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/(""";

        $(document).ready(function () """),format.raw/*34.39*/("""{"""),format.raw/*34.40*/("""
            """),format.raw/*35.13*/("""$('form').submit(function () """),format.raw/*35.42*/("""{"""),format.raw/*35.43*/("""
                """),format.raw/*36.17*/("""window.onbeforeunload = null;
            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/(""");
        """),format.raw/*38.9*/("""}"""),format.raw/*38.10*/(""");
    </script>
<script type="text/javascript">
    window.onload = function() """),format.raw/*41.32*/("""{"""),format.raw/*41.33*/("""
    	"""),format.raw/*42.6*/("""SelectElement();
    """),format.raw/*43.5*/("""}"""),format.raw/*43.6*/(""";
    function SelectElement() """),format.raw/*44.30*/("""{"""),format.raw/*44.31*/("""
    	
    	"""),format.raw/*46.6*/("""var empStartMon11  = document.forms["myForm"]["empStartMon1"].value;  
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
    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/("""
    """),format.raw/*90.5*/("""</script>

<script type="text/javascript">
	function validateForm()"""),format.raw/*93.25*/("""{"""),format.raw/*93.26*/("""
		
		"""),format.raw/*95.3*/("""var employee = document.forms["myForm"]["employee"].value;
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
		
		if(employee == "false" && selfEmployed ==  "false" && pension == "false" && investments == "false" && maternity == "false" && vehicleAllow == "false" && livingAllow == "false" && commission == "false" && bonus == "false" && other == "false")"""),format.raw/*107.244*/("""{"""),format.raw/*107.245*/("""
    	    """),format.raw/*108.10*/("""document.getElementById('input_204').innerHTML="<span style='color:red'>*This field is Required.</span>";
        	return false;
			"""),format.raw/*110.4*/("""}"""),format.raw/*110.5*/("""else"""),format.raw/*110.9*/("""{"""),format.raw/*110.10*/("""
			"""),format.raw/*111.4*/("""document.getElementById("input_204").innerHTML="";
			"""),format.raw/*112.4*/("""}"""),format.raw/*112.5*/("""
		
		"""),format.raw/*114.3*/("""if(employee == "true")"""),format.raw/*114.25*/("""{"""),format.raw/*114.26*/("""
			"""),format.raw/*115.4*/("""var empBusinessName = document.forms["myForm"]["empBusinessName"].value;
			if(!empBusinessName)"""),format.raw/*116.24*/("""{"""),format.raw/*116.25*/("""
				 """),format.raw/*117.6*/("""document.getElementById('input_1102').innerHTML="<span style='color:red'>*This field is Required.</span>";
		        	return false;
			"""),format.raw/*119.4*/("""}"""),format.raw/*119.5*/("""else"""),format.raw/*119.9*/("""{"""),format.raw/*119.10*/("""
			"""),format.raw/*120.4*/("""document.getElementById("input_1102").innerHTML="";
			"""),format.raw/*121.4*/("""}"""),format.raw/*121.5*/("""
			
			"""),format.raw/*123.4*/("""var empStartMonth = document.forms["myForm"]["empStartMonth"].value;
			if(!empStartMonth)"""),format.raw/*124.22*/("""{"""),format.raw/*124.23*/("""
				 """),format.raw/*125.6*/("""document.getElementById('input_1103').innerHTML="<span style='color:red'>*This field is Required.</span>";
		        	return false;
			"""),format.raw/*127.4*/("""}"""),format.raw/*127.5*/("""else"""),format.raw/*127.9*/("""{"""),format.raw/*127.10*/("""
			"""),format.raw/*128.4*/("""document.getElementById("input_1103").innerHTML="";
			"""),format.raw/*129.4*/("""}"""),format.raw/*129.5*/("""
			
			"""),format.raw/*131.4*/("""var empPosition = document.forms["myForm"]["empPosition"].value;
			if(!empPosition)"""),format.raw/*132.20*/("""{"""),format.raw/*132.21*/("""
				 """),format.raw/*133.6*/("""document.getElementById('input_1104').innerHTML="<span style='color:red'>*This field is Required.</span>";
		        	return false;
			"""),format.raw/*135.4*/("""}"""),format.raw/*135.5*/("""else"""),format.raw/*135.9*/("""{"""),format.raw/*135.10*/("""
			"""),format.raw/*136.4*/("""document.getElementById("input_1104").innerHTML="";
			"""),format.raw/*137.4*/("""}"""),format.raw/*137.5*/("""
		"""),format.raw/*138.3*/("""}"""),format.raw/*138.4*/("""
		
		"""),format.raw/*140.3*/("""if (selfEmployed == "true") """),format.raw/*140.31*/("""{"""),format.raw/*140.32*/("""
			"""),format.raw/*141.4*/("""var selfBusinessName = document.forms["myForm"]["selfBusinessName"].value;
			if (!selfBusinessName) """),format.raw/*142.27*/("""{"""),format.raw/*142.28*/("""
				"""),format.raw/*143.5*/("""document.getElementById('input_1118').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*145.4*/("""}"""),format.raw/*145.5*/(""" """),format.raw/*145.6*/("""else """),format.raw/*145.11*/("""{"""),format.raw/*145.12*/("""
				"""),format.raw/*146.5*/("""document.getElementById("input_1118").innerHTML = "";
			"""),format.raw/*147.4*/("""}"""),format.raw/*147.5*/("""

			"""),format.raw/*149.4*/("""var selfStartMon = document.forms["myForm"]["selfStartMon"].value;
			if (!selfStartMon) """),format.raw/*150.23*/("""{"""),format.raw/*150.24*/("""
				"""),format.raw/*151.5*/("""document.getElementById('input_1119').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*153.4*/("""}"""),format.raw/*153.5*/(""" """),format.raw/*153.6*/("""else """),format.raw/*153.11*/("""{"""),format.raw/*153.12*/("""
				"""),format.raw/*154.5*/("""document.getElementById("input_1119").innerHTML = "";
			"""),format.raw/*155.4*/("""}"""),format.raw/*155.5*/("""
			
			"""),format.raw/*157.4*/("""var selfPosition = document.forms["myForm"]["selfPosition"].value;
			if (!selfPosition) """),format.raw/*158.23*/("""{"""),format.raw/*158.24*/("""
				"""),format.raw/*159.5*/("""document.getElementById('input_1120').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*161.4*/("""}"""),format.raw/*161.5*/(""" """),format.raw/*161.6*/("""else """),format.raw/*161.11*/("""{"""),format.raw/*161.12*/("""
				"""),format.raw/*162.5*/("""document.getElementById("input_1120").innerHTML = "";
			"""),format.raw/*163.4*/("""}"""),format.raw/*163.5*/("""
			
		"""),format.raw/*165.3*/("""}"""),format.raw/*165.4*/("""
		"""),format.raw/*166.3*/("""if (pension == "true") """),format.raw/*166.26*/("""{"""),format.raw/*166.27*/("""
			"""),format.raw/*167.4*/("""var pensionBusiness1 = document.forms["myForm"]["pensionBusiness1"].value;
			if (!pensionBusiness1) """),format.raw/*168.27*/("""{"""),format.raw/*168.28*/("""
				"""),format.raw/*169.5*/("""document.getElementById('input_5002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*171.4*/("""}"""),format.raw/*171.5*/(""" """),format.raw/*171.6*/("""else """),format.raw/*171.11*/("""{"""),format.raw/*171.12*/("""
				"""),format.raw/*172.5*/("""document.getElementById("input_5002").innerHTML = "";
			"""),format.raw/*173.4*/("""}"""),format.raw/*173.5*/("""

			"""),format.raw/*175.4*/("""var pensionMY1 = document.forms["myForm"]["pensionMY1"].value;
			if (!pensionMY1) """),format.raw/*176.21*/("""{"""),format.raw/*176.22*/("""
				"""),format.raw/*177.5*/("""document.getElementById('input_5003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*179.4*/("""}"""),format.raw/*179.5*/(""" """),format.raw/*179.6*/("""else """),format.raw/*179.11*/("""{"""),format.raw/*179.12*/("""
				"""),format.raw/*180.5*/("""document.getElementById("input_5003").innerHTML = "";
			"""),format.raw/*181.4*/("""}"""),format.raw/*181.5*/("""

			"""),format.raw/*183.4*/("""var pensionPosition1 = document.forms["myForm"]["pensionPosition1"].value;
			if (!pensionPosition1) """),format.raw/*184.27*/("""{"""),format.raw/*184.28*/("""
				"""),format.raw/*185.5*/("""document.getElementById('input_5004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*187.4*/("""}"""),format.raw/*187.5*/(""" """),format.raw/*187.6*/("""else """),format.raw/*187.11*/("""{"""),format.raw/*187.12*/("""
				"""),format.raw/*188.5*/("""document.getElementById("input_5004").innerHTML = "";
			"""),format.raw/*189.4*/("""}"""),format.raw/*189.5*/("""
		"""),format.raw/*190.3*/("""}"""),format.raw/*190.4*/("""
		"""),format.raw/*191.3*/("""if (investments == "true") """),format.raw/*191.30*/("""{"""),format.raw/*191.31*/("""
			"""),format.raw/*192.4*/("""var investmentBusiness1 = document.forms["myForm"]["investmentBusiness1"].value;
			if (!investmentBusiness1) """),format.raw/*193.30*/("""{"""),format.raw/*193.31*/("""
				"""),format.raw/*194.5*/("""document.getElementById('input_5006').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*196.4*/("""}"""),format.raw/*196.5*/(""" """),format.raw/*196.6*/("""else """),format.raw/*196.11*/("""{"""),format.raw/*196.12*/("""
				"""),format.raw/*197.5*/("""document.getElementById("input_5006").innerHTML = "";
			"""),format.raw/*198.4*/("""}"""),format.raw/*198.5*/("""

			"""),format.raw/*200.4*/("""var investmentsMY1 = document.forms["myForm"]["investmentsMY1"].value;
			if (!investmentsMY1) """),format.raw/*201.25*/("""{"""),format.raw/*201.26*/("""
				"""),format.raw/*202.5*/("""document.getElementById('input_5007').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*204.4*/("""}"""),format.raw/*204.5*/(""" """),format.raw/*204.6*/("""else """),format.raw/*204.11*/("""{"""),format.raw/*204.12*/("""
				"""),format.raw/*205.5*/("""document.getElementById("input_5007").innerHTML = "";
			"""),format.raw/*206.4*/("""}"""),format.raw/*206.5*/("""

			"""),format.raw/*208.4*/("""var investmentPosition1 = document.forms["myForm"]["investmentPosition1"].value;
			if (!investmentPosition1) """),format.raw/*209.30*/("""{"""),format.raw/*209.31*/("""
				"""),format.raw/*210.5*/("""document.getElementById('input_5008').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*212.4*/("""}"""),format.raw/*212.5*/(""" """),format.raw/*212.6*/("""else """),format.raw/*212.11*/("""{"""),format.raw/*212.12*/("""
				"""),format.raw/*213.5*/("""document.getElementById("input_5008").innerHTML = "";
			"""),format.raw/*214.4*/("""}"""),format.raw/*214.5*/("""
		"""),format.raw/*215.3*/("""}"""),format.raw/*215.4*/("""

		"""),format.raw/*217.3*/("""if (maternity == "true") """),format.raw/*217.28*/("""{"""),format.raw/*217.29*/("""
			"""),format.raw/*218.4*/("""var maternityBusiness1 = document.forms["myForm"]["maternityBusiness1"].value;
			if (!maternityBusiness1) """),format.raw/*219.29*/("""{"""),format.raw/*219.30*/("""
				"""),format.raw/*220.5*/("""document.getElementById('input_6002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*222.4*/("""}"""),format.raw/*222.5*/(""" """),format.raw/*222.6*/("""else """),format.raw/*222.11*/("""{"""),format.raw/*222.12*/("""
				"""),format.raw/*223.5*/("""document.getElementById("input_6002").innerHTML = "";
			"""),format.raw/*224.4*/("""}"""),format.raw/*224.5*/("""

			"""),format.raw/*226.4*/("""var maternityMY1 = document.forms["myForm"]["maternityMY1"].value;
			if (!maternityMY1) """),format.raw/*227.23*/("""{"""),format.raw/*227.24*/("""
				"""),format.raw/*228.5*/("""document.getElementById('input_6003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*230.4*/("""}"""),format.raw/*230.5*/(""" """),format.raw/*230.6*/("""else """),format.raw/*230.11*/("""{"""),format.raw/*230.12*/("""
				"""),format.raw/*231.5*/("""document.getElementById("input_6003").innerHTML = "";
			"""),format.raw/*232.4*/("""}"""),format.raw/*232.5*/("""

			"""),format.raw/*234.4*/("""var maternityPosition1 = document.forms["myForm"]["maternityPosition1"].value;
			if (!maternityPosition1) """),format.raw/*235.29*/("""{"""),format.raw/*235.30*/("""
				"""),format.raw/*236.5*/("""document.getElementById('input_6004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*238.4*/("""}"""),format.raw/*238.5*/(""" """),format.raw/*238.6*/("""else """),format.raw/*238.11*/("""{"""),format.raw/*238.12*/("""
				"""),format.raw/*239.5*/("""document.getElementById("input_6004").innerHTML = "";
			"""),format.raw/*240.4*/("""}"""),format.raw/*240.5*/("""
		"""),format.raw/*241.3*/("""}"""),format.raw/*241.4*/("""

		"""),format.raw/*243.3*/("""if (vehicleAllow == "true") """),format.raw/*243.31*/("""{"""),format.raw/*243.32*/("""
			"""),format.raw/*244.4*/("""var vehicleAllowBusiness1 = document.forms["myForm"]["vehicleAllowBusiness1"].value;
			if (!vehicleAllowBusiness1) """),format.raw/*245.32*/("""{"""),format.raw/*245.33*/("""
				"""),format.raw/*246.5*/("""document.getElementById('input_7002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*248.4*/("""}"""),format.raw/*248.5*/(""" """),format.raw/*248.6*/("""else """),format.raw/*248.11*/("""{"""),format.raw/*248.12*/("""
				"""),format.raw/*249.5*/("""document.getElementById("input_7002").innerHTML = "";
			"""),format.raw/*250.4*/("""}"""),format.raw/*250.5*/("""

			"""),format.raw/*252.4*/("""var vehicleAllowMY1 = document.forms["myForm"]["vehicleAllowMY1"].value;
			if (!vehicleAllowMY1) """),format.raw/*253.26*/("""{"""),format.raw/*253.27*/("""
				"""),format.raw/*254.5*/("""document.getElementById('input_7003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*256.4*/("""}"""),format.raw/*256.5*/(""" """),format.raw/*256.6*/("""else """),format.raw/*256.11*/("""{"""),format.raw/*256.12*/("""
				"""),format.raw/*257.5*/("""document.getElementById("input_7003").innerHTML = "";
			"""),format.raw/*258.4*/("""}"""),format.raw/*258.5*/("""

			"""),format.raw/*260.4*/("""var vehicleAllowPosition1 = document.forms["myForm"]["vehicleAllowPosition1"].value;
			if (!vehicleAllowPosition1) """),format.raw/*261.32*/("""{"""),format.raw/*261.33*/("""
				"""),format.raw/*262.5*/("""document.getElementById('input_7004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*264.4*/("""}"""),format.raw/*264.5*/(""" """),format.raw/*264.6*/("""else """),format.raw/*264.11*/("""{"""),format.raw/*264.12*/("""
				"""),format.raw/*265.5*/("""document.getElementById("input_7004").innerHTML = "";
			"""),format.raw/*266.4*/("""}"""),format.raw/*266.5*/("""
		"""),format.raw/*267.3*/("""}"""),format.raw/*267.4*/("""

		"""),format.raw/*269.3*/("""if (livingAllow == "true") """),format.raw/*269.30*/("""{"""),format.raw/*269.31*/("""
			"""),format.raw/*270.4*/("""var livingAllowBusiness1 = document.forms["myForm"]["livingAllowBusiness1"].value;
			if (!livingAllowBusiness1) """),format.raw/*271.31*/("""{"""),format.raw/*271.32*/("""
				"""),format.raw/*272.5*/("""document.getElementById('input_8002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*274.4*/("""}"""),format.raw/*274.5*/(""" """),format.raw/*274.6*/("""else """),format.raw/*274.11*/("""{"""),format.raw/*274.12*/("""
				"""),format.raw/*275.5*/("""document.getElementById("input_8002").innerHTML = "";
			"""),format.raw/*276.4*/("""}"""),format.raw/*276.5*/("""

			"""),format.raw/*278.4*/("""var livingAllowMY1 = document.forms["myForm"]["livingAllowMY1"].value;
			if (!livingAllowMY1) """),format.raw/*279.25*/("""{"""),format.raw/*279.26*/("""
				"""),format.raw/*280.5*/("""document.getElementById('input_8003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*282.4*/("""}"""),format.raw/*282.5*/(""" """),format.raw/*282.6*/("""else """),format.raw/*282.11*/("""{"""),format.raw/*282.12*/("""
				"""),format.raw/*283.5*/("""document.getElementById("input_8003").innerHTML = "";
			"""),format.raw/*284.4*/("""}"""),format.raw/*284.5*/("""

			"""),format.raw/*286.4*/("""var livingAllowPosition1 = document.forms["myForm"]["livingAllowPosition1"].value;
			if (!livingAllowPosition1) """),format.raw/*287.31*/("""{"""),format.raw/*287.32*/("""
				"""),format.raw/*288.5*/("""document.getElementById('input_8004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*290.4*/("""}"""),format.raw/*290.5*/(""" """),format.raw/*290.6*/("""else """),format.raw/*290.11*/("""{"""),format.raw/*290.12*/("""
				"""),format.raw/*291.5*/("""document.getElementById("input_8004").innerHTML = "";
			"""),format.raw/*292.4*/("""}"""),format.raw/*292.5*/("""
		"""),format.raw/*293.3*/("""}"""),format.raw/*293.4*/("""

		"""),format.raw/*295.3*/("""if (commission == "true") """),format.raw/*295.29*/("""{"""),format.raw/*295.30*/("""
			"""),format.raw/*296.4*/("""var commissionBusiness1 = document.forms["myForm"]["commissionBusiness1"].value;
			if (!commissionBusiness1) """),format.raw/*297.30*/("""{"""),format.raw/*297.31*/("""
				"""),format.raw/*298.5*/("""document.getElementById('input_9002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*300.4*/("""}"""),format.raw/*300.5*/(""" """),format.raw/*300.6*/("""else """),format.raw/*300.11*/("""{"""),format.raw/*300.12*/("""
				"""),format.raw/*301.5*/("""document.getElementById("input_9002").innerHTML = "";
			"""),format.raw/*302.4*/("""}"""),format.raw/*302.5*/("""

			"""),format.raw/*304.4*/("""var commissionMY1 = document.forms["myForm"]["commissionMY1"].value;
			if (!commissionMY1) """),format.raw/*305.24*/("""{"""),format.raw/*305.25*/("""
				"""),format.raw/*306.5*/("""document.getElementById('input_9003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*308.4*/("""}"""),format.raw/*308.5*/(""" """),format.raw/*308.6*/("""else """),format.raw/*308.11*/("""{"""),format.raw/*308.12*/("""
				"""),format.raw/*309.5*/("""document.getElementById("input_9003").innerHTML = "";
			"""),format.raw/*310.4*/("""}"""),format.raw/*310.5*/("""

			"""),format.raw/*312.4*/("""var commissionPosition1 = document.forms["myForm"]["commissionPosition1"].value;
			if (!commissionPosition1) """),format.raw/*313.30*/("""{"""),format.raw/*313.31*/("""
				"""),format.raw/*314.5*/("""document.getElementById('input_9004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*316.4*/("""}"""),format.raw/*316.5*/(""" """),format.raw/*316.6*/("""else """),format.raw/*316.11*/("""{"""),format.raw/*316.12*/("""
				"""),format.raw/*317.5*/("""document.getElementById("input_9004").innerHTML = "";
			"""),format.raw/*318.4*/("""}"""),format.raw/*318.5*/("""
		"""),format.raw/*319.3*/("""}"""),format.raw/*319.4*/("""
		"""),format.raw/*320.3*/("""if (bonus == "true") """),format.raw/*320.24*/("""{"""),format.raw/*320.25*/("""
			"""),format.raw/*321.4*/("""var bonusBusiness1 = document.forms["myForm"]["bonusBusiness1"].value;
			if (!bonusBusiness1) """),format.raw/*322.25*/("""{"""),format.raw/*322.26*/("""
				"""),format.raw/*323.5*/("""document.getElementById('input_1002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*325.4*/("""}"""),format.raw/*325.5*/(""" """),format.raw/*325.6*/("""else """),format.raw/*325.11*/("""{"""),format.raw/*325.12*/("""
				"""),format.raw/*326.5*/("""document.getElementById("input_1002").innerHTML = "";
			"""),format.raw/*327.4*/("""}"""),format.raw/*327.5*/("""

			"""),format.raw/*329.4*/("""var bonusMY1 = document.forms["myForm"]["bonusMY1"].value;
			if (!bonusMY1) """),format.raw/*330.19*/("""{"""),format.raw/*330.20*/("""
				"""),format.raw/*331.5*/("""document.getElementById('input_1003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*333.4*/("""}"""),format.raw/*333.5*/(""" """),format.raw/*333.6*/("""else """),format.raw/*333.11*/("""{"""),format.raw/*333.12*/("""
				"""),format.raw/*334.5*/("""document.getElementById("input_1003").innerHTML = "";
			"""),format.raw/*335.4*/("""}"""),format.raw/*335.5*/("""

			"""),format.raw/*337.4*/("""var bonusPosition1 = document.forms["myForm"]["bonusPosition1"].value;
			if (!bonusPosition1) """),format.raw/*338.25*/("""{"""),format.raw/*338.26*/("""
				"""),format.raw/*339.5*/("""document.getElementById('input_1004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*341.4*/("""}"""),format.raw/*341.5*/(""" """),format.raw/*341.6*/("""else """),format.raw/*341.11*/("""{"""),format.raw/*341.12*/("""
				"""),format.raw/*342.5*/("""document.getElementById("input_1004").innerHTML = "";
			"""),format.raw/*343.4*/("""}"""),format.raw/*343.5*/("""
		"""),format.raw/*344.3*/("""}"""),format.raw/*344.4*/("""

		"""),format.raw/*346.3*/("""if (other == "true") """),format.raw/*346.24*/("""{"""),format.raw/*346.25*/("""
			"""),format.raw/*347.4*/("""var otherBusiness1 = document.forms["myForm"]["otherBusiness1"].value;
			if (!otherBusiness1) """),format.raw/*348.25*/("""{"""),format.raw/*348.26*/("""
				"""),format.raw/*349.5*/("""document.getElementById('input_11002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*351.4*/("""}"""),format.raw/*351.5*/(""" """),format.raw/*351.6*/("""else """),format.raw/*351.11*/("""{"""),format.raw/*351.12*/("""
				"""),format.raw/*352.5*/("""document.getElementById("input_11002").innerHTML = "";
			"""),format.raw/*353.4*/("""}"""),format.raw/*353.5*/("""

			"""),format.raw/*355.4*/("""var otherMY1 = document.forms["myForm"]["otherMY1"].value;
			if (!otherMY1) """),format.raw/*356.19*/("""{"""),format.raw/*356.20*/("""
				"""),format.raw/*357.5*/("""document.getElementById('input_11003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*359.4*/("""}"""),format.raw/*359.5*/(""" """),format.raw/*359.6*/("""else """),format.raw/*359.11*/("""{"""),format.raw/*359.12*/("""
				"""),format.raw/*360.5*/("""document.getElementById("input_11003").innerHTML = "";
			"""),format.raw/*361.4*/("""}"""),format.raw/*361.5*/("""

			"""),format.raw/*363.4*/("""var otherPosition1 = document.forms["myForm"]["otherPosition1"].value;
			if (!otherPosition1) """),format.raw/*364.25*/("""{"""),format.raw/*364.26*/("""
				"""),format.raw/*365.5*/("""document.getElementById('input_11004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*367.4*/("""}"""),format.raw/*367.5*/(""" """),format.raw/*367.6*/("""else """),format.raw/*367.11*/("""{"""),format.raw/*367.12*/("""
				"""),format.raw/*368.5*/("""document.getElementById("input_11004").innerHTML = "";
			"""),format.raw/*369.4*/("""}"""),format.raw/*369.5*/("""
		"""),format.raw/*370.3*/("""}"""),format.raw/*370.4*/("""
		
		"""),format.raw/*372.3*/("""var totalMonths = document.forms["myForm"]["totalMonths"].value;
		if(totalMonths<36 && employee == "true")"""),format.raw/*373.43*/("""{"""),format.raw/*373.44*/("""
			"""),format.raw/*374.4*/("""var empBusinessName2 = document.forms["myForm"]["empBusinessName2"].value;
			if(!empBusinessName2)"""),format.raw/*375.25*/("""{"""),format.raw/*375.26*/("""
				 """),format.raw/*376.6*/("""document.getElementById('input_1106').innerHTML="<span style='color:red'>*This field is Required.</span>";
				     return false;
			"""),format.raw/*378.4*/("""}"""),format.raw/*378.5*/("""else"""),format.raw/*378.9*/("""{"""),format.raw/*378.10*/("""
			"""),format.raw/*379.4*/("""document.getElementById("input_1106").innerHTML="";
			"""),format.raw/*380.4*/("""}"""),format.raw/*380.5*/("""
			"""),format.raw/*381.4*/("""var empStartMonth2 = document.forms["myForm"]["empStartMonth2"].value;
			if(!empStartMonth2)"""),format.raw/*382.23*/("""{"""),format.raw/*382.24*/("""
			"""),format.raw/*383.4*/("""document.getElementById('input_1107').innerHTML="<span style='color:red'>*This field is Required.</span>";
			return false;
			"""),format.raw/*385.4*/("""}"""),format.raw/*385.5*/("""else"""),format.raw/*385.9*/("""{"""),format.raw/*385.10*/("""
			"""),format.raw/*386.4*/("""document.getElementById("input_1107").innerHTML="";
			"""),format.raw/*387.4*/("""}"""),format.raw/*387.5*/("""
			   
			"""),format.raw/*389.4*/("""var empPosition2 = document.forms["myForm"]["empPosition2"].value;
			if(!empPosition2)"""),format.raw/*390.21*/("""{"""),format.raw/*390.22*/("""
			"""),format.raw/*391.4*/("""document.getElementById('input_1108').innerHTML="<span style='color:red'>*This field is Required.</span>";
			return false;
			"""),format.raw/*393.4*/("""}"""),format.raw/*393.5*/("""else"""),format.raw/*393.9*/("""{"""),format.raw/*393.10*/("""
			"""),format.raw/*394.4*/("""document.getElementById("input_1108").innerHTML="";
			"""),format.raw/*395.4*/("""}"""),format.raw/*395.5*/("""
			
			"""),format.raw/*397.4*/("""var totalMonths2 = document.forms["myForm"]["totalMonths2"].value;
			if(totalMonths2<36)"""),format.raw/*398.23*/("""{"""),format.raw/*398.24*/("""
				"""),format.raw/*399.5*/("""var empBusinessName3 = document.forms["myForm"]["empBusinessName3"].value;
				if(!empBusinessName3)"""),format.raw/*400.26*/("""{"""),format.raw/*400.27*/("""
				"""),format.raw/*401.5*/("""document.getElementById('input_1110').innerHTML="<span style='color:red'>*This field is Required.</span>";
				return false;
				"""),format.raw/*403.5*/("""}"""),format.raw/*403.6*/("""else"""),format.raw/*403.10*/("""{"""),format.raw/*403.11*/("""
				"""),format.raw/*404.5*/("""document.getElementById("input_1110").innerHTML="";
				"""),format.raw/*405.5*/("""}"""),format.raw/*405.6*/("""
				    	
				"""),format.raw/*407.5*/("""var empStartMonth3 = document.forms["myForm"]["empStartMonth3"].value;
				
				if (!empStartMonth3) """),format.raw/*409.26*/("""{"""),format.raw/*409.27*/("""
				"""),format.raw/*410.5*/("""document.getElementById('input_1111').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
				"""),format.raw/*412.5*/("""}"""),format.raw/*412.6*/(""" """),format.raw/*412.7*/("""else """),format.raw/*412.12*/("""{"""),format.raw/*412.13*/("""
				"""),format.raw/*413.5*/("""document.getElementById("input_1111").innerHTML = "";
				"""),format.raw/*414.5*/("""}"""),format.raw/*414.6*/("""
				"""),format.raw/*415.5*/("""var empPosition3 = document.forms["myForm"]["empPosition3"].value;
				if (!empPosition3) """),format.raw/*416.24*/("""{"""),format.raw/*416.25*/("""
				"""),format.raw/*417.5*/("""document.getElementById('input_1112').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
				"""),format.raw/*419.5*/("""}"""),format.raw/*419.6*/(""" """),format.raw/*419.7*/("""else """),format.raw/*419.12*/("""{"""),format.raw/*419.13*/("""
				"""),format.raw/*420.5*/("""document.getElementById("input_1112").innerHTML = "";
				"""),format.raw/*421.5*/("""}"""),format.raw/*421.6*/("""						
			"""),format.raw/*422.4*/("""}"""),format.raw/*422.5*/("""
		"""),format.raw/*423.3*/("""}"""),format.raw/*423.4*/("""
		
		
		"""),format.raw/*426.3*/("""var monthsum1 = document.forms["myForm"]["monthsum1"].value;
		if(monthsum1<36 && selfEmployed == "true")"""),format.raw/*427.45*/("""{"""),format.raw/*427.46*/("""
			"""),format.raw/*428.4*/("""var selfBusinessName2 = document.forms["myForm"]["selfBusinessName2"].value;
			if (!selfBusinessName2) """),format.raw/*429.28*/("""{"""),format.raw/*429.29*/("""
				"""),format.raw/*430.5*/("""document.getElementById('input_1122').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*432.4*/("""}"""),format.raw/*432.5*/(""" """),format.raw/*432.6*/("""else """),format.raw/*432.11*/("""{"""),format.raw/*432.12*/("""
				"""),format.raw/*433.5*/("""document.getElementById("input_1122").innerHTML = "";
			"""),format.raw/*434.4*/("""}"""),format.raw/*434.5*/("""

			"""),format.raw/*436.4*/("""var selfStartMon2 = document.forms["myForm"]["selfStartMon2"].value;
			if (!selfStartMon2) """),format.raw/*437.24*/("""{"""),format.raw/*437.25*/("""
				"""),format.raw/*438.5*/("""document.getElementById('input_1123').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*440.4*/("""}"""),format.raw/*440.5*/(""" """),format.raw/*440.6*/("""else """),format.raw/*440.11*/("""{"""),format.raw/*440.12*/("""
				"""),format.raw/*441.5*/("""document.getElementById("input_1123").innerHTML = "";
			"""),format.raw/*442.4*/("""}"""),format.raw/*442.5*/("""

			"""),format.raw/*444.4*/("""var selfPosition2 = document.forms["myForm"]["selfPosition2"].value;
			if (!selfPosition2) """),format.raw/*445.24*/("""{"""),format.raw/*445.25*/("""
				"""),format.raw/*446.5*/("""document.getElementById('input_1124').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*448.4*/("""}"""),format.raw/*448.5*/(""" """),format.raw/*448.6*/("""else """),format.raw/*448.11*/("""{"""),format.raw/*448.12*/("""
				"""),format.raw/*449.5*/("""document.getElementById("input_1124").innerHTML = "";
			"""),format.raw/*450.4*/("""}"""),format.raw/*450.5*/("""
			"""),format.raw/*451.4*/("""var selfTotal2 = document.forms["myForm"]["selfemployemonthsumTotal2"].value;
			if(selfTotal2<36)"""),format.raw/*452.21*/("""{"""),format.raw/*452.22*/("""
				"""),format.raw/*453.5*/("""var selfBusinessName3 = document.forms["myForm"]["selfBusinessName3"].value;
				if (!selfBusinessName3) """),format.raw/*454.29*/("""{"""),format.raw/*454.30*/("""
					"""),format.raw/*455.6*/("""document.getElementById('input_1126').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					return false;
				"""),format.raw/*457.5*/("""}"""),format.raw/*457.6*/(""" """),format.raw/*457.7*/("""else """),format.raw/*457.12*/("""{"""),format.raw/*457.13*/("""
					"""),format.raw/*458.6*/("""document.getElementById("input_1126").innerHTML = "";
				"""),format.raw/*459.5*/("""}"""),format.raw/*459.6*/("""

				"""),format.raw/*461.5*/("""var selfStartMon3 = document.forms["myForm"]["selfStartMon3"].value;
				if (!selfStartMon3) """),format.raw/*462.25*/("""{"""),format.raw/*462.26*/("""
					"""),format.raw/*463.6*/("""document.getElementById('input_1127').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					return false;
				"""),format.raw/*465.5*/("""}"""),format.raw/*465.6*/(""" """),format.raw/*465.7*/("""else """),format.raw/*465.12*/("""{"""),format.raw/*465.13*/("""
					"""),format.raw/*466.6*/("""document.getElementById("input_1127").innerHTML = "";
				"""),format.raw/*467.5*/("""}"""),format.raw/*467.6*/("""

				"""),format.raw/*469.5*/("""var selfPosition3 = document.forms["myForm"]["selfPosition3"].value;
				if (!selfPosition3) """),format.raw/*470.25*/("""{"""),format.raw/*470.26*/("""
					"""),format.raw/*471.6*/("""document.getElementById('input_1128').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					return false;
				"""),format.raw/*473.5*/("""}"""),format.raw/*473.6*/(""" """),format.raw/*473.7*/("""else """),format.raw/*473.12*/("""{"""),format.raw/*473.13*/("""
					"""),format.raw/*474.6*/("""document.getElementById("input_1128").innerHTML = "";
				"""),format.raw/*475.5*/("""}"""),format.raw/*475.6*/("""				
				
			"""),format.raw/*477.4*/("""}"""),format.raw/*477.5*/("""
		"""),format.raw/*478.3*/("""}"""),format.raw/*478.4*/("""
		
		"""),format.raw/*480.3*/("""return true;
	"""),format.raw/*481.2*/("""}"""),format.raw/*481.3*/("""
"""),format.raw/*482.1*/("""</script>

    <script>
      $(function()"""),format.raw/*485.19*/("""{"""),format.raw/*485.20*/("""
        """),format.raw/*486.9*/("""$("#geocomplete").geocomplete("""),format.raw/*486.39*/("""{"""),format.raw/*486.40*/("""
          """),format.raw/*487.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*490.9*/("""}"""),format.raw/*490.10*/(""");

        $("#find").click(function()"""),format.raw/*492.36*/("""{"""),format.raw/*492.37*/("""
          """),format.raw/*493.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*494.9*/("""}"""),format.raw/*494.10*/(""");
      """),format.raw/*495.7*/("""}"""),format.raw/*495.8*/(""");
    </script>
     <script>
      $(function()"""),format.raw/*498.19*/("""{"""),format.raw/*498.20*/("""
        """),format.raw/*499.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*499.40*/("""{"""),format.raw/*499.41*/("""
          """),format.raw/*500.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*503.9*/("""}"""),format.raw/*503.10*/(""");

        $("#find").click(function()"""),format.raw/*505.36*/("""{"""),format.raw/*505.37*/("""
          """),format.raw/*506.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*507.9*/("""}"""),format.raw/*507.10*/(""");
      """),format.raw/*508.7*/("""}"""),format.raw/*508.8*/(""");
      
	</script>
	
	
<!-- <script>
$(function() """),format.raw/*514.14*/("""{"""),format.raw/*514.15*/("""
	"""),format.raw/*515.2*/("""$('.date-picker').datepicker( """),format.raw/*515.32*/("""{"""),format.raw/*515.33*/("""
	    """),format.raw/*516.6*/("""changeMonth: true,
	    changeYear: true,
	    showButtonPanel: true,
	    dateFormat: 'MM yy',
	    onClose: function(dateText, inst) """),format.raw/*520.40*/("""{"""),format.raw/*520.41*/(""" 
	        """),format.raw/*521.10*/("""var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
	        var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
	        $(this).datepicker('setDate', new Date(year, month, 1));
	    """),format.raw/*524.6*/("""}"""),format.raw/*524.7*/("""
	"""),format.raw/*525.2*/("""}"""),format.raw/*525.3*/(""");
	"""),format.raw/*526.2*/("""}"""),format.raw/*526.3*/(""");
</script> -->


<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->  
</head>
<body>
<br>
<br>
<div style="width: 97%">
		<form name="myForm" action="mortgagePage8" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value="uniid" name="uniid">
		<input type="hidden" name="empStartMon1" value=""""),_display_(/*539.52*/employeeIncome/*539.66*/.getStartMonth1),format.raw/*539.81*/("""">
		<input type="hidden" name="empStartMon51" value=""""),_display_(/*540.53*/employeeIncome/*540.67*/.getStartMonth11),format.raw/*540.83*/("""">
		<input type="hidden" name="empStartMon52" value=""""),_display_(/*541.53*/employeeIncome/*541.67*/.getStartMonth21),format.raw/*541.83*/("""">
		
		<input type="hidden" name="monthWorked1" value=""""),_display_(/*543.52*/employeeIncome/*543.66*/.getMonthsWorked1),format.raw/*543.83*/("""">
		<input type="hidden" name="monthWorked2" value=""""),_display_(/*544.52*/employeeIncome/*544.66*/.getMonthTotal11),format.raw/*544.82*/("""">
		<input type="hidden" name="monthWorked3" value=""""),_display_(/*545.52*/employeeIncome/*545.66*/.getStartMonth21),format.raw/*545.82*/("""">
		
		<input type="hidden" name="selfStartMon1" value=""""),_display_(/*547.53*/selfEmployeeIncome/*547.71*/.getStartMonth21),format.raw/*547.87*/("""">
		<input type="hidden" name="selfStartMon212" value=""""),_display_(/*548.55*/selfEmployeeIncome/*548.73*/.getStartMonth22),format.raw/*548.89*/("""">
		<input type="hidden" name="selfStartMon213" value=""""),_display_(/*549.55*/selfEmployeeIncome/*549.73*/.getStartMonth23),format.raw/*549.89*/("""">
		
		<input type="hidden" name="selfMonthWorked1" value=""""),_display_(/*551.56*/selfEmployeeIncome/*551.74*/.getMonthsWorked21),format.raw/*551.92*/("""">
		<input type="hidden" name="selfMonthWorked2" value=""""),_display_(/*552.56*/selfEmployeeIncome/*552.74*/.getMonthTotal22),format.raw/*552.90*/("""">
		<input type="hidden" name="selfMonthWorked3" value=""""),_display_(/*553.56*/selfEmployeeIncome/*553.74*/.getMonthsWorked23),format.raw/*553.92*/("""">
		<input type="hidden" name="pensionStartMon" value=""""),_display_(/*554.55*/pensionIncType/*554.69*/.getStartMonth),format.raw/*554.83*/("""">
		<input type="hidden" name="investStartMon" value=""""),_display_(/*555.54*/investmentIncType/*555.71*/.getStartMonth),format.raw/*555.85*/("""">
		<input type="hidden" name="maternityStartMon" value=""""),_display_(/*556.57*/maternityIncType/*556.73*/.getStartMonth),format.raw/*556.87*/("""">
		<input type="hidden" name="vehicleStartMon" value=""""),_display_(/*557.55*/vehicleIncType/*557.69*/.getStartMonth),format.raw/*557.83*/("""">
		<input type="hidden" name="livingStartMon"  value=""""),_display_(/*558.55*/livingIncType/*558.68*/.getStartMonth),format.raw/*558.82*/("""">
		<input type="hidden" name="commissionStartMon"   value=""""),_display_(/*559.60*/commissionIncType/*559.77*/.getStartMonth),format.raw/*559.91*/("""">
		<input type="hidden" name="bonusStartMon"   value=""""),_display_(/*560.55*/bonusIncType/*560.67*/.getStartMonth),format.raw/*560.81*/("""">
		<input type="hidden" name="otherStartMon"   value=""""),_display_(/*561.55*/otherIncType/*561.67*/.getStartMonth),format.raw/*561.81*/("""">
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*569.11*/routes/*569.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*569.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<div ng-controller="DemoController" ng-init="isDisabled = false">
		
		<label class="labelfont">"""),_display_(/*575.29*/applicantName),format.raw/*575.42*/("""</label><br><br>
		<label class="labelfont">What types of income do you currently receive? Select all that apply.<span style="color: red; font-size: 3">*</span></label><br>
		 
		"""),_display_(/*578.4*/if(employeeIncome !=null && employeeIncome.isEmployed)/*578.58*/{_display_(Seq[Any](format.raw/*578.59*/("""
		"""),format.raw/*579.3*/("""<div ng-init="checkModel.Employee=true"></div>
		""")))}),format.raw/*580.4*/("""
		"""),_display_(/*581.4*/if(selfEmployeeIncome !=null && selfEmployeeIncome.isSelfEmployed)/*581.70*/{_display_(Seq[Any](format.raw/*581.71*/("""
		"""),format.raw/*582.3*/("""<div ng-init="checkModel.SelfEmployed=true"></div>
		""")))}),format.raw/*583.4*/("""
		
		"""),_display_(/*585.4*/if(pensionIncType !=null && pensionIncType.isPension)/*585.57*/{_display_(Seq[Any](format.raw/*585.58*/("""
		"""),format.raw/*586.3*/("""<div ng-init="checkModel.Pension=true"></div>
		""")))}),format.raw/*587.4*/("""
		"""),_display_(/*588.4*/if(investmentIncType !=null && investmentIncType.isInvestments)/*588.67*/{_display_(Seq[Any](format.raw/*588.68*/("""
		"""),format.raw/*589.3*/("""<div ng-init="checkModel.Investments=true"></div>
		""")))}),format.raw/*590.4*/("""
		
		"""),_display_(/*592.4*/if(maternityIncType !=null && maternityIncType.isMaternity)/*592.63*/{_display_(Seq[Any](format.raw/*592.64*/("""
		"""),format.raw/*593.3*/("""<div ng-init="checkModel.Maternity=true"></div>
		""")))}),format.raw/*594.4*/("""
		
		"""),_display_(/*596.4*/if(vehicleIncType !=null && vehicleIncType.isVehicleAllow)/*596.62*/{_display_(Seq[Any](format.raw/*596.63*/("""
		"""),format.raw/*597.3*/("""<div ng-init="checkModel.VehicleAllow=true"></div>
		""")))}),format.raw/*598.4*/("""
		
		"""),_display_(/*600.4*/if(livingIncType !=null && livingIncType.isLivingAllow)/*600.59*/{_display_(Seq[Any](format.raw/*600.60*/("""
		"""),format.raw/*601.3*/("""<div ng-init="checkModel.LivingAllow=true"></div>
		""")))}),format.raw/*602.4*/("""

		"""),_display_(/*604.4*/if(commissionIncType !=null && commissionIncType.isCommission)/*604.66*/{_display_(Seq[Any](format.raw/*604.67*/("""
		"""),format.raw/*605.3*/("""<div ng-init="checkModel.Commission=true"></div>
		""")))}),format.raw/*606.4*/("""
		
		"""),_display_(/*608.4*/if(bonusIncType !=null && bonusIncType.isBonus)/*608.51*/{_display_(Seq[Any](format.raw/*608.52*/("""
		"""),format.raw/*609.3*/("""<div ng-init="checkModel.Bonus=true"></div>
		""")))}),format.raw/*610.4*/("""
		
		"""),_display_(/*612.4*/if(otherIncType !=null && otherIncType.isOther)/*612.51*/{_display_(Seq[Any](format.raw/*612.52*/("""
		"""),format.raw/*613.3*/("""<div ng-init="checkModel.Other=true"></div>
		""")))}),format.raw/*614.4*/("""
		
				
			"""),format.raw/*617.4*/("""<div class="btn-group" style="padding-left: 0%; width: 100%;" >
          			
              <label style="width: 20%;" class="btn btn-primary"  ng-true-value="Employed"  btn-checkbox="'Employed'"   
                      ng-change="change()"  ng-model="checkModel.Employee"> Employed
                                
              </label>             
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="Self-Employ" btn-checkbox="'Self-Employ'"
                       ng-change="change()"  ng-model="checkModel.SelfEmployed"> Self-Employed
		      </label>
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="Pension" btn-checkbox="'Pension'"
                      ng-change="change()"  ng-model="checkModel.Pension"> Pension
              </label>
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="Investments" btn-checkbox="'Investments'"
                      ng-change="change()"  ng-model="checkModel.Investments"> Investments
                                
              </label>              
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="Maternity" btn-checkbox="'Maternity'"
                       ng-change="change()"  ng-model="checkModel.Maternity"> Maternity
		      </label>
		      <br>
              <br>
              <label style="width: 20%; border-radius: 5px 0px 0px 5px;" class="btn btn-primary" ng-true-value="Vehicle Allowance" btn-checkbox="'Vehicle Allowance'"
                      ng-change="change()"  ng-model="checkModel.VehicleAllow"> Vehicle Allow
              </label>
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="LivingAllow'" btn-checkbox="'LivingAllow'"
                      ng-change="change()"  ng-model="checkModel.LivingAllow"> Living Allow
              </label>
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="Commission" btn-checkbox="'Commission'"
                      ng-change="change()"  ng-model="checkModel.Commission"> Commission
              </label>
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="Bonus" btn-checkbox="'Bonus'"
                      ng-change="change()"  ng-model="checkModel.Bonus"> Bonus
              </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="Other"  btn-checkbox="'Other'"
                      ng-change="change()"  ng-model="checkModel.Other"> Other
              </label>
            </div>
           <div id="input_204" style="position: absolute;"> </div>
            <input type="hidden" name="incomeTypes[]" value=""""),format.raw/*655.62*/("""{"""),format.raw/*655.63*/("""{"""),format.raw/*655.64*/("""checkResults"""),format.raw/*655.76*/("""}"""),format.raw/*655.77*/("""}"""),format.raw/*655.78*/("""">
            
            <input type="hidden" name="employee" value=""""),format.raw/*657.57*/("""{"""),format.raw/*657.58*/("""{"""),format.raw/*657.59*/("""checkModel.Employee"""),format.raw/*657.78*/("""}"""),format.raw/*657.79*/("""}"""),format.raw/*657.80*/(""""/>
            <input type="hidden" name="selfEmployed" value=""""),format.raw/*658.61*/("""{"""),format.raw/*658.62*/("""{"""),format.raw/*658.63*/("""checkModel.SelfEmployed"""),format.raw/*658.86*/("""}"""),format.raw/*658.87*/("""}"""),format.raw/*658.88*/(""""/>
            <input type="hidden" name="pension" value=""""),format.raw/*659.56*/("""{"""),format.raw/*659.57*/("""{"""),format.raw/*659.58*/("""checkModel.Pension"""),format.raw/*659.76*/("""}"""),format.raw/*659.77*/("""}"""),format.raw/*659.78*/(""""/>
            <input type="hidden" name="investments" value=""""),format.raw/*660.60*/("""{"""),format.raw/*660.61*/("""{"""),format.raw/*660.62*/("""checkModel.Investments"""),format.raw/*660.84*/("""}"""),format.raw/*660.85*/("""}"""),format.raw/*660.86*/(""""/>
            <input type="hidden" name="maternity" value=""""),format.raw/*661.58*/("""{"""),format.raw/*661.59*/("""{"""),format.raw/*661.60*/("""checkModel.Maternity"""),format.raw/*661.80*/("""}"""),format.raw/*661.81*/("""}"""),format.raw/*661.82*/(""""/>
            <input type="hidden" name="vehicleAllow" value=""""),format.raw/*662.61*/("""{"""),format.raw/*662.62*/("""{"""),format.raw/*662.63*/("""checkModel.VehicleAllow"""),format.raw/*662.86*/("""}"""),format.raw/*662.87*/("""}"""),format.raw/*662.88*/(""""/>
            <input type="hidden" name="livingAllow" value=""""),format.raw/*663.60*/("""{"""),format.raw/*663.61*/("""{"""),format.raw/*663.62*/("""checkModel.LivingAllow"""),format.raw/*663.84*/("""}"""),format.raw/*663.85*/("""}"""),format.raw/*663.86*/(""""/>
            <input type="hidden" name="commission" value=""""),format.raw/*664.59*/("""{"""),format.raw/*664.60*/("""{"""),format.raw/*664.61*/("""checkModel.Commission"""),format.raw/*664.82*/("""}"""),format.raw/*664.83*/("""}"""),format.raw/*664.84*/(""""/>
            <input type="hidden" name="bonus" value=""""),format.raw/*665.54*/("""{"""),format.raw/*665.55*/("""{"""),format.raw/*665.56*/("""checkModel.Bonus"""),format.raw/*665.72*/("""}"""),format.raw/*665.73*/("""}"""),format.raw/*665.74*/(""""/>
            <input type="hidden" name="other" value=""""),format.raw/*666.54*/("""{"""),format.raw/*666.55*/("""{"""),format.raw/*666.56*/("""checkModel.Other"""),format.raw/*666.72*/("""}"""),format.raw/*666.73*/("""}"""),format.raw/*666.74*/(""""/>
		<br>
		
	<div>
    <div>
    </div>
	</div>
		<div ng-if="checkModel.Employee== true || checkModel.SelfEmployed == true || checkModel.Pension == true || checkModel.Investments == true || checkModel.Maternity == true || checkModel.VehicleAllow == true || checkModel.LivingAllow == true || checkModel.Commission == true || checkModel.Bonus == true || checkModel.Other == true">
				<br>
				<div class="row">
					<div class="col-sm-3"><b>Type of Income:</b></div>
					<div class="col-sm-3" style="padding-left: 0%;"><b>Business:</b></div>
					<div class="col-sm-3" style="padding-left: 8%;"><b>Start Month:</b></div>
					<div class="col-sm-3" style="padding-left: 5%;"><b>Position:</b></div>
				</div>
				<!-- <table><tr>
					  <th width="20%">Type of Income:</th>
					  <th width="36%">Business:</th>
					  <th width="22%">Start Month:</th>
					  <th width="18%" style="padding-left: 0%;">Position:</th>
					  </tr>
				</table> -->
			
		</div>
		<div ng-show="checkModel.Employee== true">
							  <table>
							  	<tr>
							  		<td width="20%"><input type="text" name="empIncomeTypes" placeholder="E.g. Employer" class="form-control" value="Employed" style="width: 100%;" readonly="readonly">
									     		</td>
							  		<td width="36%"><input type="text" name="empBusinessName" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*695.153*/employeeIncome/*695.167*/.getBusiness1),format.raw/*695.180*/("""" value=""""),_display_(/*695.190*/employeeIncome),format.raw/*695.204*/("""">
      											</td>
							  		<td width="22%"><input type="text" id="datepicker0"  name="empStartMonth" placeholder="mm/dd/yyyy" ng-model="empFirstMonYear"  ng-selected = "employe1(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control" >
									     	</td>
							  		<td width="18%"><input type="text" name="empPosition" placeholder="E.g. Manager" class="form-control" style="width: 100%;" value=""""),_display_(/*699.143*/employeeIncome/*699.157*/.getCurrentPosition1),format.raw/*699.177*/("""">
      										</td>
							  	</tr>
							  	<tr>
							  		<td><div id="input_1101"></div></td>
							  		<td><div id="input_1102"></div></td>
							  		<td><div id="input_1103"></div></td>
							  		<td><div id="input_1104"></div></td>
							  	</tr>
							  	</table>
							<input type="hidden" name="totalMonths" ng-model="employetotal1" value=""""),format.raw/*709.80*/("""{"""),format.raw/*709.81*/("""{"""),format.raw/*709.82*/("""employetotal1"""),format.raw/*709.95*/("""}"""),format.raw/*709.96*/("""}"""),format.raw/*709.97*/("""">
					</div>	
					<div ng-show="checkModel.SelfEmployed == true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="selfIncomeTypes" placeholder="E.g. Self-Employed" style="width: 100%;" class="form-control" value="Self Employed" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="selfBusinessName" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*717.151*/selfEmployeeIncome/*717.169*/.getBusiness21),format.raw/*717.183*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker3" name="selfStartMon" placeholder="mm/dd/yyyy" ng-model="slfempFirstMonYear"  ng-selected="employe2(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="selfPosition"  placeholder="E.g. Manager" class="form-control" value=""""),_display_(/*721.121*/selfEmployeeIncome/*721.139*/.getCurrentPosition21),format.raw/*721.160*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_1117""></div></td>
								<td><div id="input_1118"></div></td>
								<td><div id="input_1119"></div></td>
								<td><div id="input_1120"></div></td>
							</tr>
						</table>
						<input type="hidden" name="monthsum1" value=""""),format.raw/*731.52*/("""{"""),format.raw/*731.53*/("""{"""),format.raw/*731.54*/("""slfemployetotal1"""),format.raw/*731.70*/("""}"""),format.raw/*731.71*/("""}"""),format.raw/*731.72*/("""">
					  
						</div>
					<div ng-show="checkModel.Pension==true">
						<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="pensionIcome1" placeholder="E.g. Self-Employed" style="width: 100%;" class="form-control" value="Pension" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="pensionBusiness1" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*740.151*/pensionIncType/*740.165*/.getBusiness),format.raw/*740.177*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker6" name="pensionMY1" placeholder="mm/dd/yyyy" ng-model="pensionMY1"  ng-selected="employe3(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="pensionPosition1"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*744.146*/pensionIncType/*744.160*/.getCurrentPosition),format.raw/*744.179*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_5001""></div></td>
								<td><div id="input_5002"></div></td>
								<td><div id="input_5003"></div></td>
								<td><div id="input_5004"></div></td>
							</tr>
						</table>
						<input type="hidden" name="pensionTotal" value=""""),format.raw/*754.55*/("""{"""),format.raw/*754.56*/("""{"""),format.raw/*754.57*/("""pensionTotal"""),format.raw/*754.69*/("""}"""),format.raw/*754.70*/("""}"""),format.raw/*754.71*/("""">
						</div>
						
					<div ng-show="checkModel.Investments==true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="InvestmentsType1" placeholder="E.g. Investments" style="width: 100%;" class="form-control" value="Investments" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="investmentBusiness1" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*763.154*/investmentIncType/*763.171*/.getBusiness),format.raw/*763.183*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker7"  name="investmentsMY1" placeholder="mm/dd/yyyy" ng-model="investmentsMY1"  ng-selected="investment(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="investmentPosition1"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*767.149*/investmentIncType/*767.166*/.getCurrentPosition),format.raw/*767.185*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_5005"></div></td>
								<td><div id="input_5006"></div></td>
								<td><div id="input_5007"></div></td>
								<td><div id="input_5008"></div></td>
							</tr>
						</table>
						<input type="hidden" name="investmentTotal" value=""""),format.raw/*777.58*/("""{"""),format.raw/*777.59*/("""{"""),format.raw/*777.60*/("""investmentTotal"""),format.raw/*777.75*/("""}"""),format.raw/*777.76*/("""}"""),format.raw/*777.77*/("""">
					</div>		 								
					
					<div ng-show="checkModel.Maternity==true">
					<br>
					<table>
							<tr>
								<td width="20%"><input type="text" name="maternityType1" placeholder="E.g. Maternity" style="width: 100%;" class="form-control" value="Maternity" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="maternityBusiness1" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*786.153*/maternityIncType/*786.169*/.getBusiness),format.raw/*786.181*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker8" name="maternityMY1" placeholder="mm/dd/yyyy" ng-model="maternityMY1"  ng-selected="maternity(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="maternityPosition1"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*790.148*/maternityIncType/*790.164*/.getCurrentPosition),format.raw/*790.183*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_6001"></div></td>
								<td><div id="input_6002"></div></td>
								<td><div id="input_6003"></div></td>
								<td><div id="input_6004"></div></td>
							</tr>
						</table>
					  <input type="hidden" name="maternityTotal"  value=""""),format.raw/*800.59*/("""{"""),format.raw/*800.60*/("""{"""),format.raw/*800.61*/("""maternityTotal"""),format.raw/*800.75*/("""}"""),format.raw/*800.76*/("""}"""),format.raw/*800.77*/("""">
					
					</div>
					
					<div ng-show="checkModel.VehicleAllow==true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="vehicleAllowType1" placeholder="E.g. Maternity" style="width: 100%;" class="form-control" value="Vehicle Allow" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="vehicleAllowBusiness1" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*810.156*/vehicleIncType/*810.170*/.getBusiness),format.raw/*810.182*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker9" name="vehicleAllowMY1" placeholder="mm/dd/yyyy" ng-model="vehicleAllowMY1"  ng-selected="vehicleAllow(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="vehicleAllowPosition1"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*814.151*/vehicleIncType/*814.165*/.getCurrentPosition),format.raw/*814.184*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_7001"></div></td>
								<td><div id="input_7002"></div></td>
								<td><div id="input_7003"></div></td>
								<td><div id="input_7004"></div></td>
							</tr>
						</table>
						<input type="hidden" name="vehicleAllowTotal" ng-model="vehicleAllowTotal" value=""""),format.raw/*824.89*/("""{"""),format.raw/*824.90*/("""{"""),format.raw/*824.91*/("""vehicleAllowTotal"""),format.raw/*824.108*/("""}"""),format.raw/*824.109*/("""}"""),format.raw/*824.110*/("""">
					</div>
					
					<div ng-show="checkModel.LivingAllow==true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="livingAllowType1" placeholder="E.g. LivingAllow" style="width: 100%;" class="form-control" value="Living Allow" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="livingAllowBusiness1" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*833.155*/livingIncType/*833.168*/.getBusiness),format.raw/*833.180*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker10" name="livingAllowMY1" placeholder="mm/dd/yyyy" ng-model="livingAllowY1"  ng-selected="livingAllow(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="livingAllowPosition1"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*837.150*/livingIncType/*837.163*/.getCurrentPosition),format.raw/*837.182*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_8001"></div></td>
								<td><div id="input_8002"></div></td>
								<td><div id="input_8003"></div></td>
								<td><div id="input_8004"></div></td>
							</tr>
						</table>
					  <input type="hidden" name="livingAllowTotal" ng-model="livingAllowTotal" value=""""),format.raw/*847.88*/("""{"""),format.raw/*847.89*/("""{"""),format.raw/*847.90*/("""livingAllowTotal"""),format.raw/*847.106*/("""}"""),format.raw/*847.107*/("""}"""),format.raw/*847.108*/("""">
					</div>
					
					<div ng-show="checkModel.Commission==true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="commissionype1" placeholder="E.g. Commision" style="width: 100%;" class="form-control" value="Commission" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="commissionBusiness1" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*856.154*/commissionIncType/*856.171*/.getBusiness),format.raw/*856.183*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker11" name="commissionMY1" placeholder="mm/dd/yyyy" ng-model="commissionMY1"  ng-selected="commission(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="commissionPosition1"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*860.149*/commissionIncType/*860.166*/.getCurrentPosition),format.raw/*860.185*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_9001"></div></td>
								<td><div id="input_9002"></div></td>
								<td><div id="input_9003"></div></td>
								<td><div id="input_9004"></div></td>
							</tr>
						</table>
					 <input type="hidden" name="commissionTotal" ng-model="commissionTotal" value=""""),format.raw/*870.85*/("""{"""),format.raw/*870.86*/("""{"""),format.raw/*870.87*/("""commissionTotal"""),format.raw/*870.102*/("""}"""),format.raw/*870.103*/("""}"""),format.raw/*870.104*/("""">
					</div>
					
					<div ng-show="checkModel.Bonus==true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="bonus1" placeholder="E.g. Bonus" style="width: 100%;" class="form-control" value="Bonus" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="bonusBusiness1" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*879.149*/bonusIncType/*879.161*/.getBusiness),format.raw/*879.173*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker12" name="bonusMY1" placeholder="mm/dd/yyyy" ng-model="bonusMY1"  ng-selected="bonusFun(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="bonusPosition1"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*883.144*/bonusIncType/*883.156*/.getCurrentPosition),format.raw/*883.175*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_1000"></div></td>
								<td><div id="input_1002"></div></td>
								<td><div id="input_1003"></div></td>
								<td><div id="input_1004"></div></td>
							</tr>
						</table>
					  <input type="hidden" name="bonusTotal" ng-model="bonusTotal" value=""""),format.raw/*893.76*/("""{"""),format.raw/*893.77*/("""{"""),format.raw/*893.78*/("""bonusTotal"""),format.raw/*893.88*/("""}"""),format.raw/*893.89*/("""}"""),format.raw/*893.90*/("""">
					</div>
					
					<div ng-show="checkModel.Other==true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="other1" placeholder="E.g. Other" style="width: 100%;" class="form-control" value="Other" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="otherBusiness1" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*902.149*/otherIncType/*902.161*/.getBusiness),format.raw/*902.173*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker13" name="otherMY1" placeholder="mm/dd/yyyy" ng-model="otherMY1"  ng-selected="otherFun(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     	</td>
								<td width="18%"><input type="text" name="otherPosition1"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*906.144*/otherIncType/*906.156*/.getCurrentPosition),format.raw/*906.175*/("""">
      										</td>
							</tr>
							<tr>
								<td><div id="input_11001"></div></td>
								<td><div id="input_11002"></div></td>
								<td><div id="input_11003"></div></td>
								<td><div id="input_11004"></div></td>
							</tr>
						</table>
						 <input type="hidden" name="otherTotal" ng-model="otherTotal" value=""""),format.raw/*916.76*/("""{"""),format.raw/*916.77*/("""{"""),format.raw/*916.78*/("""otherTotal"""),format.raw/*916.88*/("""}"""),format.raw/*916.89*/("""}"""),format.raw/*916.90*/("""">
					</div>
					
					
					
					
					<div ng-show="employetotal1< 36 && checkModel.Employee== true">
							<h4 style="padding-left: 0%;"><Strong>Work History Employed</Strong></h4>
							<hr style="width: 96%; border-color: #006699; margin-top: 0%; margin-bottom: 0%;" />
							<label class="labelfont">Lenders require at least 3 years of work history. Where did you work previously?</label>
							
							<table>
							<tr>
							  		<td width="20%"><input type="text" name="empIncomeTypes2"
												placeholder="E.g. Employer" style="width: 100%;"
												class="form-control" value="Employed" readonly="readonly">
												</td>
							  		<td width="38%"><input type="text" name="empBusinessName2"
												placeholder="E.g. Business Name" style="width: 100%;"
												class="form-control" value=""""),_display_(/*935.42*/employeeIncome/*935.56*/.getBusiness11),format.raw/*935.70*/("""">
												</td>
							  		<td width="22%"><input type="text" name="empStartMonth2"
												placeholder="mm/dd/yyyy" id="datepicker1" ng-model="empSecMonYear"
												ng-selected = "employe1(this)" style="width: 100%; position: relative; z-index: 100000;"
												class="form-control">
												</td>
							  		<td width="18%"><input type="text" name="empPosition2"
												placeholder="E.g. Manager" style="width: 100%;"
												class="form-control" value=""""),_display_(/*944.42*/employeeIncome/*944.56*/.getPosition11),format.raw/*944.70*/("""">
											    </td>
							  	</tr>
							  	<tr>
							  		<td><div id="input_1105"></div></td>
							  		<td><div id="input_1106"></div></td>
							  		<td><div id="input_1107"></div></td>
							  		<td><div id="input_1108"></div></td>
							  	</tr>
							  </table>
							  <input type="hidden" name="monthsum11" ng-model="employetotal2" value=""""),format.raw/*954.81*/("""{"""),format.raw/*954.82*/("""{"""),format.raw/*954.83*/("""employetotal2-employetotal1"""),format.raw/*954.110*/("""}"""),format.raw/*954.111*/("""}"""),format.raw/*954.112*/("""">	
							  <input type="hidden" name="totalMonths2" ng-model="employetotal2" value=""""),format.raw/*955.83*/("""{"""),format.raw/*955.84*/("""{"""),format.raw/*955.85*/("""employetotal2"""),format.raw/*955.98*/("""}"""),format.raw/*955.99*/("""}"""),format.raw/*955.100*/("""">
									<div ng-show="employetotal2< 36">
										<br>
										<table>
											<tr>
												<td width="20%"><input type="text" name="empIncomeTypes3"
												placeholder="E.g. Employer" style="width: 100%;"
												class="form-control" value="Employed" readonly="readonly">
											</td>
												<td width="38%"><input type="text" name="empBusinessName3"
												placeholder="E.g. Business Name" style="width: 100%;"
												class="form-control" value=""""),_display_(/*966.42*/employeeIncome/*966.56*/.getBusiness21),format.raw/*966.70*/("""">
												</td>
												<td width="22%"><input type="text" name="empStartMonth3" id="datepicker2"
												placeholder="mm/dd/yyyy" ng-model="empThirdMonYear"
												ng-selected="employe1(this)" style="width: 100%; position: relative; z-index: 100000;"
												class="form-control">
											</td>
												<td width="18%"><input type="text" name="empPosition3"
												placeholder="E.g. Manager" style="width: 100%;"
												class="form-control" value=""""),_display_(/*975.42*/employeeIncome/*975.56*/.getPosition21),format.raw/*975.70*/("""">
												</td>
											</tr>
											<tr>
												<td><div id="input_1109""></div></td>
												<td><div id="input_1110"></div></td>
												<td><div id="input_1111"></div></td>
												<td><div id="input_1112"></div></td>
											</tr>
										</table>
										<input type="hidden" name="monthsum33" ng-model="employetotal2" value=""""),format.raw/*985.82*/("""{"""),format.raw/*985.83*/("""{"""),format.raw/*985.84*/("""employetotal3-employetotal2"""),format.raw/*985.111*/("""}"""),format.raw/*985.112*/("""}"""),format.raw/*985.113*/("""">
										<input type="hidden" name="totalMonths3" ng-model="employetotal3" value=""""),format.raw/*986.84*/("""{"""),format.raw/*986.85*/("""{"""),format.raw/*986.86*/("""employetotal3"""),format.raw/*986.99*/("""}"""),format.raw/*986.100*/("""}"""),format.raw/*986.101*/("""">
					</div>
					</div>
					
					
					<div ng-show="slfemployetotal1<36 && checkModel.SelfEmployed == true">
					  		<h4 style="padding-left: 0%;"><Strong>Work History Self-Employed</Strong></h4>
							<hr style="width: 96%; border-color: #006699; margin-top: 0%; margin-bottom: 0%;" />
							<label class="labelfont">Lenders require at least 3 years of work history. Where did you work previously?</label>
					  		<table>
					  			<tr>
					  				<td width="20%"><input type="text" name="selfIncomeTypes2" placeholder="E.g. Self-Employed" style="width: 100%;" class="form-control" value="Self Employed" readonly="readonly">
									     			</td>
					  				<td width="38%"><input type="text" name="selfBusinessName2" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*999.155*/selfEmployeeIncome/*999.173*/.getBusiness22),format.raw/*999.187*/("""">
      												</td>
					  				<td width="22%"><input type="text" id="datepicker4" name="selfStartMon2" placeholder="mm/dd/yyyy" ng-model="slfsecMonYears" ng-selected="employe2(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     			</td>
					  				<td width="18%"><input type="text" name="selfPosition2"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*1003.146*/selfEmployeeIncome/*1003.164*/.getPosition22),format.raw/*1003.178*/("""">
      										</td>
					  			</tr>
					  			<tr>
					  				<td><div id="input_1121"></div></td>
					  				<td><div id="input_1122"></div></td>
					  				<td><div id="input_1123"></div></td>
					  				<td><div id="input_1124"></div></td>
					  			</tr>
					  		</table>
					  		<input type="hidden" name="selfemployemonthssum2" value=""""),format.raw/*1013.67*/("""{"""),format.raw/*1013.68*/("""{"""),format.raw/*1013.69*/("""slfemployetotal2-slfemployetotal1"""),format.raw/*1013.102*/("""}"""),format.raw/*1013.103*/("""}"""),format.raw/*1013.104*/("""">
					  		<input type="hidden" name="selfemployemonthsumTotal2" value=""""),format.raw/*1014.71*/("""{"""),format.raw/*1014.72*/("""{"""),format.raw/*1014.73*/("""slfemployetotal2"""),format.raw/*1014.89*/("""}"""),format.raw/*1014.90*/("""}"""),format.raw/*1014.91*/("""">
							<div ng-show="slfemployetotal2 < 36">
								<br>
								<table>
									<tr>
										<td width="20%"><input type="text" name="selfIncomeTypes3" placeholder="E.g. Self-Employed" style="width: 100%;" class="form-control" value="Self Employed" readonly="readonly">
									     				</td>
										<td width="38%"><input type="text" name="selfBusinessName3" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*1021.154*/selfEmployeeIncome/*1021.172*/.getBusiness23),format.raw/*1021.186*/("""">
      													</td>
										<td width="22%"><input type="text" id="datepicker5" name="selfStartMon3" placeholder="mm/dd/yyyy" ng-model="slfthirdMonYear" ng-selected="employe2(this)" style="width: 100%; position: relative; z-index: 100000;" class="form-control">
									     				</td>
										<td width="18%"><input type="text" name="selfPosition3"  placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*1025.145*/selfEmployeeIncome/*1025.163*/.getPosition23),format.raw/*1025.177*/("""">
      													</td>
									</tr>
									<tr>
									<td><div id="input_1125"></div></td>
									<td><div id="input_1126"></div></td>
									<td><div id="input_1127"></div></td>
									<td><div id="input_1128"></div></td>
								</tr>
								</table>
								<input type="hidden" name="selfemployemonthssum3" value=""""),format.raw/*1035.66*/("""{"""),format.raw/*1035.67*/("""{"""),format.raw/*1035.68*/("""slfemployetotal3-slfemployetotal2"""),format.raw/*1035.101*/("""}"""),format.raw/*1035.102*/("""}"""),format.raw/*1035.103*/("""">
					  			<input type="hidden" name="selfemployemonthsumTotal3" value=""""),format.raw/*1036.72*/("""{"""),format.raw/*1036.73*/("""{"""),format.raw/*1036.74*/("""slfemployetotal3"""),format.raw/*1036.90*/("""}"""),format.raw/*1036.91*/("""}"""),format.raw/*1036.92*/("""">
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
						  <script src=""""),_display_(/*1061.23*/routes/*1061.29*/.Assets.at("_resources/jquery-ui.js")),format.raw/*1061.66*/("""" type="text/javascript"></script>
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
    $(function() """),format.raw/*1085.18*/("""{"""),format.raw/*1085.19*/("""
        """),format.raw/*1086.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*1089.5*/("""}"""),format.raw/*1089.6*/(""");
	
</script>

 <script>
$(document).ready(function()"""),format.raw/*1094.29*/("""{"""),format.raw/*1094.30*/("""
    """),format.raw/*1095.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*1096.1*/("""}"""),format.raw/*1096.2*/(""");
</script>

<script src="https://maps.googleapis.com/maps/api/Are you Self-Employed?js?sensor=false&amp;libraries=places"></script>
 
    <script src="jquery.geocomplete.js"></script>
    
   <script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);
    app.controller('DemoController', function ($scope) """),format.raw/*1105.56*/("""{"""),format.raw/*1105.57*/("""
        """),format.raw/*1106.9*/("""init();
        function init() """),format.raw/*1107.25*/("""{"""),format.raw/*1107.26*/("""
            """),format.raw/*1108.13*/("""$scope.newItemType = '';
            $scope.company="";
            
            var empStartMon111 = document.forms["myForm"]["monthWorked1"].value;
            if(empStartMon111 !="")
            $scope.employetotal1=empStartMon111;
            
            var empStartMon112 = document.forms["myForm"]["monthWorked2"].value;
            if(empStartMon112 !="")
            $scope.employetotal2=empStartMon112;

            var empStartMon113 = document.forms["myForm"]["monthWorked3"].value;
            if(empStartMon113 !="")
            $scope.employetotal3=empStartMon113;
            
            var empStartMon411 = document.forms["myForm"]["selfMonthWorked1"].value;
            if(empStartMon411 !="")
            $scope.slfemployetotal1 = empStartMon411;
            
    		var empStartMon412 = document.forms["myForm"]["selfMonthWorked2"].value;
            if(empStartMon412 !="")
            $scope.slfemployetotal2  = empStartMon412;
            
    		var empStartMon413 = document.forms["myForm"]["selfMonthWorked3"].value;
            if(empStartMon413 !="")
            $scope.slfemployetotal3 = empStartMon413;
            
            
            $scope.change = function () """),format.raw/*1136.41*/("""{"""),format.raw/*1136.42*/("""
                """),format.raw/*1137.17*/("""console.log($scope.newItemType)
            """),format.raw/*1138.13*/("""}"""),format.raw/*1138.14*/(""";
        """),format.raw/*1139.9*/("""}"""),format.raw/*1139.10*/("""
        
        """),format.raw/*1141.9*/("""$scope.employe1 = function ($scope) """),format.raw/*1141.45*/("""{"""),format.raw/*1141.46*/("""
        	
        	
        	"""),format.raw/*1144.10*/("""$( "#datepicker0" ).datepicker("""),format.raw/*1144.41*/("""{"""),format.raw/*1144.42*/("""
                """),format.raw/*1145.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*1147.43*/("""{"""),format.raw/*1147.44*/("""
                    """),format.raw/*1148.21*/("""$scope.empFirstMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*1150.52*/("""{"""),format.raw/*1150.53*/("""
                         """),format.raw/*1151.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*1153.22*/("""}"""),format.raw/*1153.23*/(""");
                     
                """),format.raw/*1155.17*/("""}"""),format.raw/*1155.18*/("""
               
              """),format.raw/*1157.15*/("""}"""),format.raw/*1157.16*/(""");
        
        	$( "#datepicker1" ).datepicker("""),format.raw/*1159.41*/("""{"""),format.raw/*1159.42*/("""
                """),format.raw/*1160.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*1162.43*/("""{"""),format.raw/*1162.44*/("""
                    """),format.raw/*1163.21*/("""$scope.empSecMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*1165.52*/("""{"""),format.raw/*1165.53*/("""
                         """),format.raw/*1166.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*1168.22*/("""}"""),format.raw/*1168.23*/(""");
                     
                """),format.raw/*1170.17*/("""}"""),format.raw/*1170.18*/("""
               
              """),format.raw/*1172.15*/("""}"""),format.raw/*1172.16*/(""");	
        	   
        	$( "#datepicker2" ).datepicker("""),format.raw/*1174.41*/("""{"""),format.raw/*1174.42*/("""
                """),format.raw/*1175.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*1177.43*/("""{"""),format.raw/*1177.44*/("""
                    """),format.raw/*1178.21*/("""$scope.empThirdMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*1180.52*/("""{"""),format.raw/*1180.53*/("""
                         """),format.raw/*1181.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*1183.22*/("""}"""),format.raw/*1183.23*/(""");
                     
                """),format.raw/*1185.17*/("""}"""),format.raw/*1185.18*/("""
               
              """),format.raw/*1187.15*/("""}"""),format.raw/*1187.16*/(""");
        	
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
           if(total <36)"""),format.raw/*1208.25*/("""{"""),format.raw/*1208.26*/("""
                """),format.raw/*1209.17*/("""one= $scope.empSecMonYear;
                date =one.split("/");
                oneDate=date[0]+"/1/"+date[2];
        	   datevDate=new Date(oneDate);
        	   
  			      	   
       		 one_day=1000*60*60*24;
       		 date1ms=date2ms;
       		 date2ms=datevDate.getTime();
       		
       		 totmili=date1ms-date2ms;
       		 
       			 if(isNaN(totmili) == false)"""),format.raw/*1221.39*/("""{"""),format.raw/*1221.40*/("""
       		 """),format.raw/*1222.11*/("""totalDays=Math.round(totmili/one_day);

       		 totalMonths=Math.abs((totmili/one_day)/30);




     		total=total+Math.floor(totalMonths); 

     		$scope.employetotal2 = total;
     		
     		 if(total<36)"""),format.raw/*1233.21*/("""{"""),format.raw/*1233.22*/("""
				    			 
     			  """),format.raw/*1235.11*/("""one= $scope.empThirdMonYear;
                  date =one.split("/");
                  oneDate=date[0]+"/1/"+date[2];
          	   datevDate=new Date(oneDate);
            		
           		 one_day=1000*60*60*24;
           		 date1ms=date2ms;
           		 date2ms=datevDate.getTime();
           		
           		 totmili=date1ms-date2ms;
           		if(isNaN(totmili) == false)"""),format.raw/*1245.41*/("""{"""),format.raw/*1245.42*/("""

           		 """),format.raw/*1247.15*/("""totalDays=Math.round(totmili/one_day);
           		 totalMonths=Math.abs((totmili/one_day)/30);
          		total=Math.floor(total)+Math.floor(totalMonths); 
					
         		$scope.employetotal3 = total;
         		 
           		"""),format.raw/*1253.14*/("""}"""),format.raw/*1253.15*/("""
             """),format.raw/*1254.14*/("""}"""),format.raw/*1254.15*/("""
        	 """),format.raw/*1255.11*/("""}"""),format.raw/*1255.12*/("""
           """),format.raw/*1256.12*/("""}"""),format.raw/*1256.13*/("""
        """),format.raw/*1257.9*/("""}"""),format.raw/*1257.10*/(""";
        $scope.employe2 = function ($scope) """),format.raw/*1258.45*/("""{"""),format.raw/*1258.46*/("""
        	
        	        
        	"""),format.raw/*1261.10*/("""$( "#datepicker3" ).datepicker("""),format.raw/*1261.41*/("""{"""),format.raw/*1261.42*/("""
                """),format.raw/*1262.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*1264.43*/("""{"""),format.raw/*1264.44*/("""
                    """),format.raw/*1265.21*/("""$scope.slfempFirstMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*1267.52*/("""{"""),format.raw/*1267.53*/("""
                         """),format.raw/*1268.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*1270.22*/("""}"""),format.raw/*1270.23*/(""");
                     
                """),format.raw/*1272.17*/("""}"""),format.raw/*1272.18*/("""
               
              """),format.raw/*1274.15*/("""}"""),format.raw/*1274.16*/(""");
        	
        	$( "#datepicker4" ).datepicker("""),format.raw/*1276.41*/("""{"""),format.raw/*1276.42*/("""
                """),format.raw/*1277.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*1279.43*/("""{"""),format.raw/*1279.44*/("""
                    """),format.raw/*1280.21*/("""$scope.slfsecMonYears = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*1282.52*/("""{"""),format.raw/*1282.53*/("""
                         """),format.raw/*1283.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*1285.22*/("""}"""),format.raw/*1285.23*/(""");
                     
                """),format.raw/*1287.17*/("""}"""),format.raw/*1287.18*/("""
               
              """),format.raw/*1289.15*/("""}"""),format.raw/*1289.16*/(""");
        	
        	$( "#datepicker5" ).datepicker("""),format.raw/*1291.41*/("""{"""),format.raw/*1291.42*/("""
                """),format.raw/*1292.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*1294.43*/("""{"""),format.raw/*1294.44*/("""
                    """),format.raw/*1295.21*/("""$scope.slfsecMonYears = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*1297.52*/("""{"""),format.raw/*1297.53*/("""
                         """),format.raw/*1298.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*1300.22*/("""}"""),format.raw/*1300.23*/(""");
                     
                """),format.raw/*1302.17*/("""}"""),format.raw/*1302.18*/("""
               
              """),format.raw/*1304.15*/("""}"""),format.raw/*1304.16*/(""");
        	
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
               if(total <36)"""),format.raw/*1325.29*/("""{"""),format.raw/*1325.30*/("""
                    """),format.raw/*1326.21*/("""one= $scope.slfsecMonYears;
                    date =one.split("/");
                    oneDate=date[0]+"/1/"+date[2];
            	   datevDate=new Date(oneDate);
      			      	   
           		 one_day=1000*60*60*24;
           		 date1ms=date2ms;
           		
           		 date2ms=datevDate.getTime();
           		 
           		 totmili=date1ms-date2ms;
           		 
           		if(isNaN(totmili) == false)"""),format.raw/*1338.41*/("""{"""),format.raw/*1338.42*/("""
           		 """),format.raw/*1339.15*/("""totalDays=Math.round(totmili/one_day);

           		 totalMonths=Math.abs((totmili/one_day)/30);

         		total=total+Math.floor(totalMonths); 

         		$scope.slfemployetotal2 = total;
         		
         		
         		
         		 if(total<36)"""),format.raw/*1349.25*/("""{"""),format.raw/*1349.26*/("""
         		
         			  """),format.raw/*1351.15*/("""one= $scope.slfthirdMonYear;
                      date =one.split("/");
                      oneDate=date[0]+"/1/"+date[2];
              	   	  datevDate=new Date(oneDate);
                		
               		 one_day=1000*60*60*24;
               		 date1ms=date2ms;
               		 date2ms=datevDate.getTime();
               		
               		 totmili=date1ms-date2ms;
               		if(isNaN(totmili) == false)"""),format.raw/*1361.45*/("""{"""),format.raw/*1361.46*/("""

               		 """),format.raw/*1363.19*/("""totalDays=Math.round(totmili/one_day);pensiontotal1
               		 totalMonths=Math.abs((totmili/one_day)/30);
              		total=Math.floor(total)+Math.floor(totalMonths); 

             		$scope.slfemployetotal3 = total;
               	  """),format.raw/*1368.19*/("""}"""),format.raw/*1368.20*/("""
                 """),format.raw/*1369.18*/("""}"""),format.raw/*1369.19*/("""
               """),format.raw/*1370.16*/("""}"""),format.raw/*1370.17*/("""
              """),format.raw/*1371.15*/("""}"""),format.raw/*1371.16*/("""
            """),format.raw/*1372.13*/("""}"""),format.raw/*1372.14*/(""";
            $scope.employe3 = function ($scope) """),format.raw/*1373.49*/("""{"""),format.raw/*1373.50*/("""
            	
            	"""),format.raw/*1375.14*/("""$( "#datepicker6" ).datepicker("""),format.raw/*1375.45*/("""{"""),format.raw/*1375.46*/("""
                    """),format.raw/*1376.21*/("""changeMonth: true,
                    changeYear: true,
                    onSelect: function (date) """),format.raw/*1378.47*/("""{"""),format.raw/*1378.48*/("""
                        """),format.raw/*1379.25*/("""$scope.pensionMY1 = date;
                   
                         $scope.$apply(function($scope)"""),format.raw/*1381.56*/("""{"""),format.raw/*1381.57*/("""
                             """),format.raw/*1382.30*/("""// Change binded variable
                             $scope.assign($scope, date);
                         """),format.raw/*1384.26*/("""}"""),format.raw/*1384.27*/(""");
                         
                    """),format.raw/*1386.21*/("""}"""),format.raw/*1386.22*/("""
                   
                  """),format.raw/*1388.19*/("""}"""),format.raw/*1388.20*/(""");
            	
            	var one= $scope.pensionMY1;
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
            	
         		$scope.pensionTotal = total;
            """),format.raw/*1409.13*/("""}"""),format.raw/*1409.14*/("""
            """),format.raw/*1410.13*/("""$scope.investment = function ($scope) """),format.raw/*1410.51*/("""{"""),format.raw/*1410.52*/("""

            	"""),format.raw/*1412.14*/("""$( "#datepicker7" ).datepicker("""),format.raw/*1412.45*/("""{"""),format.raw/*1412.46*/("""
                    """),format.raw/*1413.21*/("""changeMonth: true,
                    changeYear: true,
                    onSelect: function (date) """),format.raw/*1415.47*/("""{"""),format.raw/*1415.48*/("""
                        """),format.raw/*1416.25*/("""$scope.investmentsMY1 = date;
                   
                         $scope.$apply(function($scope)"""),format.raw/*1418.56*/("""{"""),format.raw/*1418.57*/("""
                             """),format.raw/*1419.30*/("""// Change binded variable
                             $scope.assign($scope, date);
                         """),format.raw/*1421.26*/("""}"""),format.raw/*1421.27*/(""");
                         
                    """),format.raw/*1423.21*/("""}"""),format.raw/*1423.22*/("""
                   
                  """),format.raw/*1425.19*/("""}"""),format.raw/*1425.20*/(""");
            	
            	var one= $scope.investmentsMY1;

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
         		$scope.investmentTotal = total;
            """),format.raw/*1442.13*/("""}"""),format.raw/*1442.14*/("""
            
            """),format.raw/*1444.13*/("""$scope.maternity = function ($scope) """),format.raw/*1444.50*/("""{"""),format.raw/*1444.51*/("""
            	
            	"""),format.raw/*1446.14*/("""$( "#datepicker8" ).datepicker("""),format.raw/*1446.45*/("""{"""),format.raw/*1446.46*/("""
                    """),format.raw/*1447.21*/("""changeMonth: true,
                    changeYear: true,
                    onSelect: function (date) """),format.raw/*1449.47*/("""{"""),format.raw/*1449.48*/("""
                        """),format.raw/*1450.25*/("""$scope.maternityMY1 = date;
                   
                         $scope.$apply(function($scope)"""),format.raw/*1452.56*/("""{"""),format.raw/*1452.57*/("""
                             """),format.raw/*1453.30*/("""// Change binded variable
                             $scope.assign($scope, date);
                         """),format.raw/*1455.26*/("""}"""),format.raw/*1455.27*/(""");
                         
                    """),format.raw/*1457.21*/("""}"""),format.raw/*1457.22*/("""
                   
                  """),format.raw/*1459.19*/("""}"""),format.raw/*1459.20*/(""");
            	
            	var one= $scope.maternityMY1;
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
            	       
         		$scope.maternityTotal = total;
            """),format.raw/*1480.13*/("""}"""),format.raw/*1480.14*/("""
            
		 		"""),format.raw/*1482.6*/("""$scope.vehicleAllow = function ($scope) """),format.raw/*1482.46*/("""{"""),format.raw/*1482.47*/("""

		 			"""),format.raw/*1484.7*/("""$( "#datepicker9" ).datepicker("""),format.raw/*1484.38*/("""{"""),format.raw/*1484.39*/("""
	                    """),format.raw/*1485.22*/("""changeMonth: true,
	                    changeYear: true,
	                    onSelect: function (date) """),format.raw/*1487.48*/("""{"""),format.raw/*1487.49*/("""
	                        """),format.raw/*1488.26*/("""$scope.vehicleAllowMY1 = date;
	                   
	                         $scope.$apply(function($scope)"""),format.raw/*1490.57*/("""{"""),format.raw/*1490.58*/("""
	                             """),format.raw/*1491.31*/("""// Change binded variable
	                             $scope.assign($scope, date);
	                         """),format.raw/*1493.27*/("""}"""),format.raw/*1493.28*/(""");
	                         
	                    """),format.raw/*1495.22*/("""}"""),format.raw/*1495.23*/("""
	                   
	                  """),format.raw/*1497.20*/("""}"""),format.raw/*1497.21*/(""");
		 			
            	var one= $scope.vehicleAllowMY1;

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
         		$scope.vehicleAllowTotal = total;

            """),format.raw/*1519.13*/("""}"""),format.raw/*1519.14*/("""
		 		
		 		
		 		"""),format.raw/*1522.6*/("""$scope.livingAllow = function ($scope) """),format.raw/*1522.45*/("""{"""),format.raw/*1522.46*/("""

		 			"""),format.raw/*1524.7*/("""$( "#datepicker10" ).datepicker("""),format.raw/*1524.39*/("""{"""),format.raw/*1524.40*/("""
	                    """),format.raw/*1525.22*/("""changeMonth: true,
	                    changeYear: true,
	                    onSelect: function (date) """),format.raw/*1527.48*/("""{"""),format.raw/*1527.49*/("""
	                        """),format.raw/*1528.26*/("""$scope.livingAllowY1 = date;
	                   
	                         $scope.$apply(function($scope)"""),format.raw/*1530.57*/("""{"""),format.raw/*1530.58*/("""
	                             """),format.raw/*1531.31*/("""// Change binded variable
	                             $scope.assign($scope, date);
	                         """),format.raw/*1533.27*/("""}"""),format.raw/*1533.28*/(""");
	                         
	                    """),format.raw/*1535.22*/("""}"""),format.raw/*1535.23*/("""
	                   
	                  """),format.raw/*1537.20*/("""}"""),format.raw/*1537.21*/(""");
		 			
	            	var one= $scope.livingAllowY1;

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
	         		$scope.livingAllowTotal = total;

	            """),format.raw/*1559.14*/("""}"""),format.raw/*1559.15*/("""
		 		
				"""),format.raw/*1561.5*/("""$scope.commission = function ($scope) """),format.raw/*1561.43*/("""{"""),format.raw/*1561.44*/("""

					"""),format.raw/*1563.6*/("""$( "#datepicker11" ).datepicker("""),format.raw/*1563.38*/("""{"""),format.raw/*1563.39*/("""
	                    """),format.raw/*1564.22*/("""changeMonth: true,
	                    changeYear: true,
	                    onSelect: function (date) """),format.raw/*1566.48*/("""{"""),format.raw/*1566.49*/("""
	                        """),format.raw/*1567.26*/("""$scope.commissionMY1 = date;
	                   
	                         $scope.$apply(function($scope)"""),format.raw/*1569.57*/("""{"""),format.raw/*1569.58*/("""
	                             """),format.raw/*1570.31*/("""// Change binded variable
	                             $scope.assign($scope, date);
	                         """),format.raw/*1572.27*/("""}"""),format.raw/*1572.28*/(""");
	                         
	                    """),format.raw/*1574.22*/("""}"""),format.raw/*1574.23*/("""
	                   
	                  """),format.raw/*1576.20*/("""}"""),format.raw/*1576.21*/(""");
					
	            	var one= $scope.commissionMY1;

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

	         		$scope.commissionTotal = total;

	            """),format.raw/*1599.14*/("""}"""),format.raw/*1599.15*/("""
					"""),format.raw/*1600.6*/("""$scope.bonusFun = function ($scope) """),format.raw/*1600.42*/("""{"""),format.raw/*1600.43*/("""

						"""),format.raw/*1602.7*/("""$( "#datepicker12" ).datepicker("""),format.raw/*1602.39*/("""{"""),format.raw/*1602.40*/("""
		                    """),format.raw/*1603.23*/("""changeMonth: true,
		                    changeYear: true,
		                    onSelect: function (date) """),format.raw/*1605.49*/("""{"""),format.raw/*1605.50*/("""
		                        """),format.raw/*1606.27*/("""$scope.bonusMY1 = date;
		                   
		                         $scope.$apply(function($scope)"""),format.raw/*1608.58*/("""{"""),format.raw/*1608.59*/("""
		                             """),format.raw/*1609.32*/("""// Change binded variable
		                             $scope.assign($scope, date);
		                         """),format.raw/*1611.28*/("""}"""),format.raw/*1611.29*/(""");
		                         
		                    """),format.raw/*1613.23*/("""}"""),format.raw/*1613.24*/("""
		                   
		                  """),format.raw/*1615.21*/("""}"""),format.raw/*1615.22*/(""");
						
	            	var one= $scope.bonusMY1;

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
	         		$scope.bonusTotal = total;

	            """),format.raw/*1637.14*/("""}"""),format.raw/*1637.15*/("""	
					"""),format.raw/*1638.6*/("""$scope.otherFun = function ($scope) """),format.raw/*1638.42*/("""{"""),format.raw/*1638.43*/("""

						"""),format.raw/*1640.7*/("""$( "#datepicker13" ).datepicker("""),format.raw/*1640.39*/("""{"""),format.raw/*1640.40*/("""
		                    """),format.raw/*1641.23*/("""changeMonth: true,
		                    changeYear: true,
		                    onSelect: function (date) """),format.raw/*1643.49*/("""{"""),format.raw/*1643.50*/("""
		                        """),format.raw/*1644.27*/("""$scope.otherMY1 = date;
		                   
		                         $scope.$apply(function($scope)"""),format.raw/*1646.58*/("""{"""),format.raw/*1646.59*/("""
		                             """),format.raw/*1647.32*/("""// Change binded variable
		                             $scope.assign($scope, date);
		                         """),format.raw/*1649.28*/("""}"""),format.raw/*1649.29*/(""");
		                         
		                    """),format.raw/*1651.23*/("""}"""),format.raw/*1651.24*/("""
		                   
		                  """),format.raw/*1653.21*/("""}"""),format.raw/*1653.22*/(""");
						
		            	var one= $scope.otherMY1;

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
		            	
		         		$scope.otherTotal = total;
		            """),format.raw/*1675.15*/("""}"""),format.raw/*1675.16*/("""
					
					"""),format.raw/*1677.6*/("""$scope.singleModel = 1;
					
					  $scope.checkModel = """),format.raw/*1679.28*/("""{"""),format.raw/*1679.29*/("""
						"""),format.raw/*1680.7*/("""Employee: false,
					    SelfEmployed: false,
					    Pension: false,
					    Investments:false,
					    Maternity:false,
					    VehicleAllow:false,
					    LivingAllow:false,
					    Commission:false,
					    Bonus:false,
					    Other:false
					  """),format.raw/*1690.8*/("""}"""),format.raw/*1690.9*/(""";
						
					  $scope.checkResults = [];

					  $scope.$watchCollection('checkModel', function () """),format.raw/*1694.58*/("""{"""),format.raw/*1694.59*/("""
					    """),format.raw/*1695.10*/("""$scope.checkResults = [];
					    angular.forEach($scope.checkModel, function (value, key) """),format.raw/*1696.67*/("""{"""),format.raw/*1696.68*/("""
					      """),format.raw/*1697.12*/("""if (value) """),format.raw/*1697.23*/("""{"""),format.raw/*1697.24*/("""
					        """),format.raw/*1698.14*/("""$scope.checkResults.push(key);
					      """),format.raw/*1699.12*/("""}"""),format.raw/*1699.13*/("""
					    """),format.raw/*1700.10*/("""}"""),format.raw/*1700.11*/(""");
					  """),format.raw/*1701.8*/("""}"""),format.raw/*1701.9*/(""");			
    """),format.raw/*1702.5*/("""}"""),format.raw/*1702.6*/(""");
   
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
                  DATE: Mon May 16 20:16:24 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage8.scala.html
                  HASH: 63d237d073d89980f6b8a1860c93334f8aa8c991
                  MATRIX: 987->1|1537->462|1564->463|2174->1046|2189->1052|2252->1094|2295->1110|2310->1116|2372->1157|2457->1215|2472->1221|2532->1260|2608->1309|2623->1315|2678->1349|2754->1398|2769->1404|2827->1441|2892->1479|2907->1485|2964->1521|3220->1750|3235->1756|3300->1800|3353->1826|3368->1832|3435->1878|3749->2164|3778->2165|3819->2178|3878->2210|3907->2211|3976->2252|4005->2253|4046->2266|4103->2295|4132->2296|4177->2313|4247->2355|4276->2356|4314->2367|4343->2368|4451->2448|4480->2449|4513->2455|4561->2476|4589->2477|4648->2508|4677->2509|4716->2521|6989->4767|7017->4768|7049->4773|7144->4840|7173->4841|7206->4847|8129->5740|8160->5741|8199->5751|8359->5883|8388->5884|8420->5888|8450->5889|8482->5893|8564->5947|8593->5948|8627->5954|8678->5976|8708->5977|8740->5981|8865->6077|8895->6078|8929->6084|9092->6219|9121->6220|9153->6224|9183->6225|9215->6229|9298->6284|9327->6285|9363->6293|9482->6383|9512->6384|9546->6390|9709->6525|9738->6526|9770->6530|9800->6531|9832->6535|9915->6590|9944->6591|9980->6599|10093->6683|10123->6684|10157->6690|10320->6825|10349->6826|10381->6830|10411->6831|10443->6835|10526->6890|10555->6891|10586->6894|10615->6895|10649->6901|10706->6929|10736->6930|10768->6934|10898->7035|10928->7036|10961->7041|11119->7171|11148->7172|11177->7173|11211->7178|11241->7179|11274->7184|11359->7241|11388->7242|11421->7247|11539->7336|11569->7337|11602->7342|11760->7472|11789->7473|11818->7474|11852->7479|11882->7480|11915->7485|12000->7542|12029->7543|12065->7551|12183->7640|12213->7641|12246->7646|12404->7776|12433->7777|12462->7778|12496->7783|12526->7784|12559->7789|12644->7846|12673->7847|12708->7854|12737->7855|12768->7858|12820->7881|12850->7882|12882->7886|13012->7987|13042->7988|13075->7993|13233->8123|13262->8124|13291->8125|13325->8130|13355->8131|13388->8136|13473->8193|13502->8194|13535->8199|13647->8282|13677->8283|13710->8288|13868->8418|13897->8419|13926->8420|13960->8425|13990->8426|14023->8431|14108->8488|14137->8489|14170->8494|14300->8595|14330->8596|14363->8601|14521->8731|14550->8732|14579->8733|14613->8738|14643->8739|14676->8744|14761->8801|14790->8802|14821->8805|14850->8806|14881->8809|14937->8836|14967->8837|14999->8841|15138->8951|15168->8952|15201->8957|15359->9087|15388->9088|15417->9089|15451->9094|15481->9095|15514->9100|15599->9157|15628->9158|15661->9163|15785->9258|15815->9259|15848->9264|16006->9394|16035->9395|16064->9396|16098->9401|16128->9402|16161->9407|16246->9464|16275->9465|16308->9470|16447->9580|16477->9581|16510->9586|16668->9716|16697->9717|16726->9718|16760->9723|16790->9724|16823->9729|16908->9786|16937->9787|16968->9790|16997->9791|17029->9795|17083->9820|17113->9821|17145->9825|17281->9932|17311->9933|17344->9938|17502->10068|17531->10069|17560->10070|17594->10075|17624->10076|17657->10081|17742->10138|17771->10139|17804->10144|17922->10233|17952->10234|17985->10239|18143->10369|18172->10370|18201->10371|18235->10376|18265->10377|18298->10382|18383->10439|18412->10440|18445->10445|18581->10552|18611->10553|18644->10558|18802->10688|18831->10689|18860->10690|18894->10695|18924->10696|18957->10701|19042->10758|19071->10759|19102->10762|19131->10763|19163->10767|19220->10795|19250->10796|19282->10800|19427->10916|19457->10917|19490->10922|19648->11052|19677->11053|19706->11054|19740->11059|19770->11060|19803->11065|19888->11122|19917->11123|19950->11128|20077->11226|20107->11227|20140->11232|20298->11362|20327->11363|20356->11364|20390->11369|20420->11370|20453->11375|20538->11432|20567->11433|20600->11438|20745->11554|20775->11555|20808->11560|20966->11690|20995->11691|21024->11692|21058->11697|21088->11698|21121->11703|21206->11760|21235->11761|21266->11764|21295->11765|21327->11769|21383->11796|21413->11797|21445->11801|21587->11914|21617->11915|21650->11920|21808->12050|21837->12051|21866->12052|21900->12057|21930->12058|21963->12063|22048->12120|22077->12121|22110->12126|22234->12221|22264->12222|22297->12227|22455->12357|22484->12358|22513->12359|22547->12364|22577->12365|22610->12370|22695->12427|22724->12428|22757->12433|22899->12546|22929->12547|22962->12552|23120->12682|23149->12683|23178->12684|23212->12689|23242->12690|23275->12695|23360->12752|23389->12753|23420->12756|23449->12757|23481->12761|23536->12787|23566->12788|23598->12792|23737->12902|23767->12903|23800->12908|23958->13038|23987->13039|24016->13040|24050->13045|24080->13046|24113->13051|24198->13108|24227->13109|24260->13114|24381->13206|24411->13207|24444->13212|24602->13342|24631->13343|24660->13344|24694->13349|24724->13350|24757->13355|24842->13412|24871->13413|24904->13418|25043->13528|25073->13529|25106->13534|25264->13664|25293->13665|25322->13666|25356->13671|25386->13672|25419->13677|25504->13734|25533->13735|25564->13738|25593->13739|25624->13742|25674->13763|25704->13764|25736->13768|25860->13863|25890->13864|25923->13869|26081->13999|26110->14000|26139->14001|26173->14006|26203->14007|26236->14012|26321->14069|26350->14070|26383->14075|26489->14152|26519->14153|26552->14158|26710->14288|26739->14289|26768->14290|26802->14295|26832->14296|26865->14301|26950->14358|26979->14359|27012->14364|27136->14459|27166->14460|27199->14465|27357->14595|27386->14596|27415->14597|27449->14602|27479->14603|27512->14608|27597->14665|27626->14666|27657->14669|27686->14670|27718->14674|27768->14695|27798->14696|27830->14700|27954->14795|27984->14796|28017->14801|28176->14932|28205->14933|28234->14934|28268->14939|28298->14940|28331->14945|28417->15003|28446->15004|28479->15009|28585->15086|28615->15087|28648->15092|28807->15223|28836->15224|28865->15225|28899->15230|28929->15231|28962->15236|29048->15294|29077->15295|29110->15300|29234->15395|29264->15396|29297->15401|29456->15532|29485->15533|29514->15534|29548->15539|29578->15540|29611->15545|29697->15603|29726->15604|29757->15607|29786->15608|29820->15614|29956->15721|29986->15722|30018->15726|30146->15825|30176->15826|30210->15832|30371->15965|30400->15966|30432->15970|30462->15971|30494->15975|30577->16030|30606->16031|30638->16035|30760->16128|30790->16129|30822->16133|30977->16260|31006->16261|31038->16265|31068->16266|31100->16270|31183->16325|31212->16326|31251->16337|31367->16424|31397->16425|31429->16429|31584->16556|31613->16557|31645->16561|31675->16562|31707->16566|31790->16621|31819->16622|31855->16630|31973->16719|32003->16720|32036->16725|32165->16825|32195->16826|32228->16831|32385->16960|32414->16961|32447->16965|32477->16966|32510->16971|32594->17027|32623->17028|32666->17043|32796->17144|32826->17145|32859->17150|33018->17281|33047->17282|33076->17283|33110->17288|33140->17289|33173->17294|33259->17352|33288->17353|33321->17358|33440->17448|33470->17449|33503->17454|33662->17585|33691->17586|33720->17587|33754->17592|33784->17593|33817->17598|33903->17656|33932->17657|33970->17667|33999->17668|34030->17671|34059->17672|34096->17681|34230->17786|34260->17787|34292->17791|34425->17895|34455->17896|34488->17901|34646->18031|34675->18032|34704->18033|34738->18038|34768->18039|34801->18044|34886->18101|34915->18102|34948->18107|35069->18199|35099->18200|35132->18205|35290->18335|35319->18336|35348->18337|35382->18342|35412->18343|35445->18348|35530->18405|35559->18406|35592->18411|35713->18503|35743->18504|35776->18509|35934->18639|35963->18640|35992->18641|36026->18646|36056->18647|36089->18652|36174->18709|36203->18710|36235->18714|36362->18812|36392->18813|36425->18818|36559->18923|36589->18924|36623->18930|36783->19062|36812->19063|36841->19064|36875->19069|36905->19070|36939->19076|37025->19134|37054->19135|37088->19141|37210->19234|37240->19235|37274->19241|37434->19373|37463->19374|37492->19375|37526->19380|37556->19381|37590->19387|37676->19445|37705->19446|37739->19452|37861->19545|37891->19546|37925->19552|38085->19684|38114->19685|38143->19686|38177->19691|38207->19692|38241->19698|38327->19756|38356->19757|38397->19770|38426->19771|38457->19774|38486->19775|38520->19781|38562->19795|38591->19796|38620->19797|38691->19839|38721->19840|38758->19849|38817->19879|38847->19880|38887->19891|39017->19993|39047->19994|39115->20033|39145->20034|39185->20045|39259->20091|39289->20092|39326->20101|39355->20102|39433->20151|39463->20152|39500->20161|39560->20192|39590->20193|39630->20204|39760->20306|39790->20307|39858->20346|39888->20347|39928->20358|40003->20405|40033->20406|40070->20415|40099->20416|40180->20468|40210->20469|40240->20471|40299->20501|40329->20502|40363->20508|40527->20643|40557->20644|40597->20655|40851->20881|40880->20882|40910->20884|40939->20885|40971->20889|41000->20890|41388->21250|41412->21264|41449->21279|41532->21334|41556->21348|41594->21364|41677->21419|41701->21433|41739->21449|41824->21506|41848->21520|41887->21537|41969->21591|41993->21605|42031->21621|42113->21675|42137->21689|42175->21705|42261->21763|42289->21781|42327->21797|42412->21854|42440->21872|42478->21888|42563->21945|42591->21963|42629->21979|42718->22040|42746->22058|42786->22076|42872->22134|42900->22152|42938->22168|43024->22226|43052->22244|43092->22262|43177->22319|43201->22333|43237->22347|43321->22403|43348->22420|43384->22434|43471->22493|43497->22509|43533->22523|43618->22580|43642->22594|43678->22608|43763->22665|43786->22678|43822->22692|43912->22754|43939->22771|43975->22785|44060->22842|44082->22854|44118->22868|44203->22925|44225->22937|44261->22951|44572->23234|44588->23240|44650->23280|44886->23488|44921->23501|45128->23681|45192->23735|45232->23736|45263->23739|45344->23789|45375->23793|45451->23859|45491->23860|45522->23863|45607->23917|45641->23924|45704->23977|45744->23978|45775->23981|45855->24030|45886->24034|45959->24097|45999->24098|46030->24101|46114->24154|46148->24161|46217->24220|46257->24221|46288->24224|46370->24275|46404->24282|46472->24340|46512->24341|46543->24344|46628->24398|46662->24405|46727->24460|46767->24461|46798->24464|46882->24517|46914->24522|46986->24584|47026->24585|47057->24588|47140->24640|47174->24647|47231->24694|47271->24695|47302->24698|47380->24745|47414->24752|47471->24799|47511->24800|47542->24803|47620->24850|47660->24862|50423->27596|50453->27597|50483->27598|50524->27610|50554->27611|50584->27612|50685->27684|50715->27685|50745->27686|50793->27705|50823->27706|50853->27707|50946->27771|50976->27772|51006->27773|51058->27796|51088->27797|51118->27798|51206->27857|51236->27858|51266->27859|51313->27877|51343->27878|51373->27879|51465->27942|51495->27943|51525->27944|51576->27966|51606->27967|51636->27968|51726->28029|51756->28030|51786->28031|51835->28051|51865->28052|51895->28053|51988->28117|52018->28118|52048->28119|52100->28142|52130->28143|52160->28144|52252->28207|52282->28208|52312->28209|52363->28231|52393->28232|52423->28233|52514->28295|52544->28296|52574->28297|52624->28318|52654->28319|52684->28320|52770->28377|52800->28378|52830->28379|52875->28395|52905->28396|52935->28397|53021->28454|53051->28455|53081->28456|53126->28472|53156->28473|53186->28474|54604->29863|54629->29877|54665->29890|54704->29900|54741->29914|55209->30353|55234->30367|55277->30387|55668->30749|55698->30750|55728->30751|55770->30764|55800->30765|55830->30766|56320->31227|56349->31245|56386->31259|56828->31672|56857->31690|56901->31711|57241->32022|57271->32023|57301->32024|57346->32040|57376->32041|57406->32042|57890->32497|57915->32511|57950->32523|58407->32951|58432->32965|58474->32984|58817->33298|58847->33299|58877->33300|58918->33312|58948->33313|58978->33314|59472->33779|59500->33796|59535->33808|60006->34250|60034->34267|60076->34286|60421->34602|60451->34603|60481->34604|60525->34619|60555->34620|60585->34621|61078->35085|61105->35101|61140->35113|61604->35548|61631->35564|61673->35583|62019->35900|62049->35901|62079->35902|62122->35916|62152->35917|62182->35918|62684->36391|62709->36405|62744->36417|63220->36864|63245->36878|63287->36897|63663->37244|63693->37245|63723->37246|63770->37263|63801->37264|63832->37265|64326->37730|64350->37743|64385->37755|64857->38198|64881->38211|64923->38230|65298->38576|65328->38577|65358->38578|65404->38594|65435->38595|65466->38596|65952->39053|65980->39070|66015->39082|66484->39522|66512->39539|66554->39558|66926->39901|66956->39902|66986->39903|67031->39918|67062->39919|67093->39920|67552->40350|67575->40362|67610->40374|68062->40797|68085->40809|68127->40828|68490->41162|68520->41163|68550->41164|68589->41174|68619->41175|68649->41176|69108->41606|69131->41618|69166->41630|69617->42052|69640->42064|69682->42083|70048->42420|70078->42421|70108->42422|70147->42432|70177->42433|70207->42434|71068->43267|71092->43281|71128->43295|71644->43783|71668->43797|71704->43811|72094->44172|72124->44173|72154->44174|72211->44201|72242->44202|72273->44203|72388->44289|72418->44290|72448->44291|72490->44304|72520->44305|72551->44306|73071->44798|73095->44812|73131->44826|73648->45315|73672->45329|73708->45343|74105->45711|74135->45712|74165->45713|74222->45740|74253->45741|74284->45742|74399->45828|74429->45829|74459->45830|74501->45843|74532->45844|74563->45845|75405->46658|75434->46676|75471->46690|75940->47129|75970->47147|76008->47161|76386->47509|76417->47510|76448->47511|76512->47544|76544->47545|76576->47546|76679->47619|76710->47620|76741->47621|76787->47637|76818->47638|76849->47639|77334->48094|77364->48112|77402->48126|77872->48566|77902->48584|77940->48598|78307->48935|78338->48936|78369->48937|78433->48970|78465->48971|78497->48972|78601->49046|78632->49047|78663->49048|78709->49064|78740->49065|78771->49066|79730->49996|79747->50002|79807->50039|80551->50753|80582->50754|80620->50763|80736->50850|80766->50851|80850->50905|80881->50906|80915->50911|80987->50954|81017->50955|81387->51295|81418->51296|81456->51305|81518->51337|81549->51338|81592->51351|82822->52551|82853->52552|82900->52569|82974->52613|83005->52614|83044->52624|83075->52625|83122->52643|83188->52679|83219->52680|83279->52710|83340->52741|83371->52742|83418->52759|83543->52854|83574->52855|83625->52876|83753->52974|83784->52975|83840->53001|83971->53102|84002->53103|84073->53144|84104->53145|84165->53176|84196->53177|84278->53229|84309->53230|84356->53247|84481->53342|84512->53343|84563->53364|84689->53460|84720->53461|84776->53487|84907->53588|84938->53589|85009->53630|85040->53631|85101->53662|85132->53663|85219->53720|85250->53721|85297->53738|85422->53833|85453->53834|85504->53855|85632->53953|85663->53954|85719->53980|85850->54081|85881->54082|85952->54123|85983->54124|86044->54155|86075->54156|86691->54742|86722->54743|86769->54760|87174->55135|87205->55136|87246->55147|87485->55356|87516->55357|87570->55381|87980->55761|88011->55762|88057->55778|88319->56010|88350->56011|88394->56025|88425->56026|88466->56037|88497->56038|88539->56050|88570->56051|88608->56060|88639->56061|88715->56107|88746->56108|88814->56146|88875->56177|88906->56178|88953->56195|89078->56290|89109->56291|89160->56312|89291->56413|89322->56414|89378->56440|89509->56541|89540->56542|89611->56583|89642->56584|89703->56615|89734->56616|89817->56669|89848->56670|89895->56687|90020->56782|90051->56783|90102->56804|90229->56901|90260->56902|90316->56928|90447->57029|90478->57030|90549->57071|90580->57072|90641->57103|90672->57104|90755->57157|90786->57158|90833->57175|90958->57270|90989->57271|91040->57292|91167->57389|91198->57390|91254->57416|91385->57517|91416->57518|91487->57559|91518->57560|91579->57591|91610->57592|92286->58238|92317->58239|92368->58260|92818->58680|92849->58681|92894->58696|93177->58949|93208->58950|93265->58977|93718->59400|93749->59401|93799->59421|94076->59668|94107->59669|94155->59687|94186->59688|94232->59704|94263->59705|94308->59720|94339->59721|94382->59734|94413->59735|94493->59785|94524->59786|94582->59814|94643->59845|94674->59846|94725->59867|94858->59970|94889->59971|94944->59996|95075->60097|95106->60098|95166->60128|95305->60237|95336->60238|95415->60287|95446->60288|95515->60327|95546->60328|96271->61023|96302->61024|96345->61037|96413->61075|96444->61076|96489->61091|96550->61122|96581->61123|96632->61144|96765->61247|96796->61248|96851->61273|96986->61378|97017->61379|97077->61409|97216->61518|97247->61519|97326->61568|97357->61569|97426->61608|97457->61609|98123->62245|98154->62246|98210->62272|98277->62309|98308->62310|98366->62338|98427->62369|98458->62370|98509->62391|98642->62494|98673->62495|98728->62520|98861->62623|98892->62624|98952->62654|99091->62763|99122->62764|99201->62813|99232->62814|99301->62853|99332->62854|100068->63560|100099->63561|100147->63580|100217->63620|100248->63621|100285->63629|100346->63660|100377->63661|100429->63683|100564->63788|100595->63789|100651->63815|100789->63923|100820->63924|100881->63955|101022->64066|101053->64067|101134->64118|101165->64119|101236->64160|101267->64161|101983->64847|102014->64848|102061->64866|102130->64905|102161->64906|102198->64914|102260->64946|102291->64947|102343->64969|102478->65074|102509->65075|102565->65101|102701->65207|102732->65208|102793->65239|102934->65350|102965->65351|103046->65402|103077->65403|103148->65444|103179->65445|103911->66147|103942->66148|103982->66159|104050->66197|104081->66198|104117->66205|104179->66237|104210->66238|104262->66260|104397->66365|104428->66366|104484->66392|104620->66498|104651->66499|104712->66530|104853->66641|104884->66642|104965->66693|104996->66694|105067->66735|105098->66736|105829->67437|105860->67438|105895->67444|105961->67480|105992->67481|106029->67489|106091->67521|106122->67522|106175->67545|106312->67652|106343->67653|106400->67680|106533->67783|106564->67784|106626->67816|106769->67929|106800->67930|106883->67983|106914->67984|106987->68027|107018->68028|107739->68719|107770->68720|107806->68727|107872->68763|107903->68764|107940->68772|108002->68804|108033->68805|108086->68828|108223->68935|108254->68936|108311->68963|108444->69066|108475->69067|108537->69099|108680->69212|108711->69213|108794->69266|108825->69267|108898->69310|108929->69311|109684->70036|109715->70037|109756->70049|109843->70106|109874->70107|109910->70114|110199->70374|110229->70375|110359->70475|110390->70476|110430->70486|110552->70578|110583->70579|110625->70591|110666->70602|110697->70603|110741->70617|110813->70659|110844->70660|110884->70670|110915->70671|110954->70681|110984->70682|111023->70692|111053->70693
                  LINES: 26->1|29->1|30->2|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|51->23|51->23|51->23|52->24|52->24|52->24|58->30|58->30|59->31|60->32|60->32|62->34|62->34|63->35|63->35|63->35|64->36|65->37|65->37|66->38|66->38|69->41|69->41|70->42|71->43|71->43|72->44|72->44|74->46|117->89|117->89|118->90|121->93|121->93|123->95|135->107|135->107|136->108|138->110|138->110|138->110|138->110|139->111|140->112|140->112|142->114|142->114|142->114|143->115|144->116|144->116|145->117|147->119|147->119|147->119|147->119|148->120|149->121|149->121|151->123|152->124|152->124|153->125|155->127|155->127|155->127|155->127|156->128|157->129|157->129|159->131|160->132|160->132|161->133|163->135|163->135|163->135|163->135|164->136|165->137|165->137|166->138|166->138|168->140|168->140|168->140|169->141|170->142|170->142|171->143|173->145|173->145|173->145|173->145|173->145|174->146|175->147|175->147|177->149|178->150|178->150|179->151|181->153|181->153|181->153|181->153|181->153|182->154|183->155|183->155|185->157|186->158|186->158|187->159|189->161|189->161|189->161|189->161|189->161|190->162|191->163|191->163|193->165|193->165|194->166|194->166|194->166|195->167|196->168|196->168|197->169|199->171|199->171|199->171|199->171|199->171|200->172|201->173|201->173|203->175|204->176|204->176|205->177|207->179|207->179|207->179|207->179|207->179|208->180|209->181|209->181|211->183|212->184|212->184|213->185|215->187|215->187|215->187|215->187|215->187|216->188|217->189|217->189|218->190|218->190|219->191|219->191|219->191|220->192|221->193|221->193|222->194|224->196|224->196|224->196|224->196|224->196|225->197|226->198|226->198|228->200|229->201|229->201|230->202|232->204|232->204|232->204|232->204|232->204|233->205|234->206|234->206|236->208|237->209|237->209|238->210|240->212|240->212|240->212|240->212|240->212|241->213|242->214|242->214|243->215|243->215|245->217|245->217|245->217|246->218|247->219|247->219|248->220|250->222|250->222|250->222|250->222|250->222|251->223|252->224|252->224|254->226|255->227|255->227|256->228|258->230|258->230|258->230|258->230|258->230|259->231|260->232|260->232|262->234|263->235|263->235|264->236|266->238|266->238|266->238|266->238|266->238|267->239|268->240|268->240|269->241|269->241|271->243|271->243|271->243|272->244|273->245|273->245|274->246|276->248|276->248|276->248|276->248|276->248|277->249|278->250|278->250|280->252|281->253|281->253|282->254|284->256|284->256|284->256|284->256|284->256|285->257|286->258|286->258|288->260|289->261|289->261|290->262|292->264|292->264|292->264|292->264|292->264|293->265|294->266|294->266|295->267|295->267|297->269|297->269|297->269|298->270|299->271|299->271|300->272|302->274|302->274|302->274|302->274|302->274|303->275|304->276|304->276|306->278|307->279|307->279|308->280|310->282|310->282|310->282|310->282|310->282|311->283|312->284|312->284|314->286|315->287|315->287|316->288|318->290|318->290|318->290|318->290|318->290|319->291|320->292|320->292|321->293|321->293|323->295|323->295|323->295|324->296|325->297|325->297|326->298|328->300|328->300|328->300|328->300|328->300|329->301|330->302|330->302|332->304|333->305|333->305|334->306|336->308|336->308|336->308|336->308|336->308|337->309|338->310|338->310|340->312|341->313|341->313|342->314|344->316|344->316|344->316|344->316|344->316|345->317|346->318|346->318|347->319|347->319|348->320|348->320|348->320|349->321|350->322|350->322|351->323|353->325|353->325|353->325|353->325|353->325|354->326|355->327|355->327|357->329|358->330|358->330|359->331|361->333|361->333|361->333|361->333|361->333|362->334|363->335|363->335|365->337|366->338|366->338|367->339|369->341|369->341|369->341|369->341|369->341|370->342|371->343|371->343|372->344|372->344|374->346|374->346|374->346|375->347|376->348|376->348|377->349|379->351|379->351|379->351|379->351|379->351|380->352|381->353|381->353|383->355|384->356|384->356|385->357|387->359|387->359|387->359|387->359|387->359|388->360|389->361|389->361|391->363|392->364|392->364|393->365|395->367|395->367|395->367|395->367|395->367|396->368|397->369|397->369|398->370|398->370|400->372|401->373|401->373|402->374|403->375|403->375|404->376|406->378|406->378|406->378|406->378|407->379|408->380|408->380|409->381|410->382|410->382|411->383|413->385|413->385|413->385|413->385|414->386|415->387|415->387|417->389|418->390|418->390|419->391|421->393|421->393|421->393|421->393|422->394|423->395|423->395|425->397|426->398|426->398|427->399|428->400|428->400|429->401|431->403|431->403|431->403|431->403|432->404|433->405|433->405|435->407|437->409|437->409|438->410|440->412|440->412|440->412|440->412|440->412|441->413|442->414|442->414|443->415|444->416|444->416|445->417|447->419|447->419|447->419|447->419|447->419|448->420|449->421|449->421|450->422|450->422|451->423|451->423|454->426|455->427|455->427|456->428|457->429|457->429|458->430|460->432|460->432|460->432|460->432|460->432|461->433|462->434|462->434|464->436|465->437|465->437|466->438|468->440|468->440|468->440|468->440|468->440|469->441|470->442|470->442|472->444|473->445|473->445|474->446|476->448|476->448|476->448|476->448|476->448|477->449|478->450|478->450|479->451|480->452|480->452|481->453|482->454|482->454|483->455|485->457|485->457|485->457|485->457|485->457|486->458|487->459|487->459|489->461|490->462|490->462|491->463|493->465|493->465|493->465|493->465|493->465|494->466|495->467|495->467|497->469|498->470|498->470|499->471|501->473|501->473|501->473|501->473|501->473|502->474|503->475|503->475|505->477|505->477|506->478|506->478|508->480|509->481|509->481|510->482|513->485|513->485|514->486|514->486|514->486|515->487|518->490|518->490|520->492|520->492|521->493|522->494|522->494|523->495|523->495|526->498|526->498|527->499|527->499|527->499|528->500|531->503|531->503|533->505|533->505|534->506|535->507|535->507|536->508|536->508|542->514|542->514|543->515|543->515|543->515|544->516|548->520|548->520|549->521|552->524|552->524|553->525|553->525|554->526|554->526|567->539|567->539|567->539|568->540|568->540|568->540|569->541|569->541|569->541|571->543|571->543|571->543|572->544|572->544|572->544|573->545|573->545|573->545|575->547|575->547|575->547|576->548|576->548|576->548|577->549|577->549|577->549|579->551|579->551|579->551|580->552|580->552|580->552|581->553|581->553|581->553|582->554|582->554|582->554|583->555|583->555|583->555|584->556|584->556|584->556|585->557|585->557|585->557|586->558|586->558|586->558|587->559|587->559|587->559|588->560|588->560|588->560|589->561|589->561|589->561|597->569|597->569|597->569|603->575|603->575|606->578|606->578|606->578|607->579|608->580|609->581|609->581|609->581|610->582|611->583|613->585|613->585|613->585|614->586|615->587|616->588|616->588|616->588|617->589|618->590|620->592|620->592|620->592|621->593|622->594|624->596|624->596|624->596|625->597|626->598|628->600|628->600|628->600|629->601|630->602|632->604|632->604|632->604|633->605|634->606|636->608|636->608|636->608|637->609|638->610|640->612|640->612|640->612|641->613|642->614|645->617|683->655|683->655|683->655|683->655|683->655|683->655|685->657|685->657|685->657|685->657|685->657|685->657|686->658|686->658|686->658|686->658|686->658|686->658|687->659|687->659|687->659|687->659|687->659|687->659|688->660|688->660|688->660|688->660|688->660|688->660|689->661|689->661|689->661|689->661|689->661|689->661|690->662|690->662|690->662|690->662|690->662|690->662|691->663|691->663|691->663|691->663|691->663|691->663|692->664|692->664|692->664|692->664|692->664|692->664|693->665|693->665|693->665|693->665|693->665|693->665|694->666|694->666|694->666|694->666|694->666|694->666|723->695|723->695|723->695|723->695|723->695|727->699|727->699|727->699|737->709|737->709|737->709|737->709|737->709|737->709|745->717|745->717|745->717|749->721|749->721|749->721|759->731|759->731|759->731|759->731|759->731|759->731|768->740|768->740|768->740|772->744|772->744|772->744|782->754|782->754|782->754|782->754|782->754|782->754|791->763|791->763|791->763|795->767|795->767|795->767|805->777|805->777|805->777|805->777|805->777|805->777|814->786|814->786|814->786|818->790|818->790|818->790|828->800|828->800|828->800|828->800|828->800|828->800|838->810|838->810|838->810|842->814|842->814|842->814|852->824|852->824|852->824|852->824|852->824|852->824|861->833|861->833|861->833|865->837|865->837|865->837|875->847|875->847|875->847|875->847|875->847|875->847|884->856|884->856|884->856|888->860|888->860|888->860|898->870|898->870|898->870|898->870|898->870|898->870|907->879|907->879|907->879|911->883|911->883|911->883|921->893|921->893|921->893|921->893|921->893|921->893|930->902|930->902|930->902|934->906|934->906|934->906|944->916|944->916|944->916|944->916|944->916|944->916|963->935|963->935|963->935|972->944|972->944|972->944|982->954|982->954|982->954|982->954|982->954|982->954|983->955|983->955|983->955|983->955|983->955|983->955|994->966|994->966|994->966|1003->975|1003->975|1003->975|1013->985|1013->985|1013->985|1013->985|1013->985|1013->985|1014->986|1014->986|1014->986|1014->986|1014->986|1014->986|1027->999|1027->999|1027->999|1031->1003|1031->1003|1031->1003|1041->1013|1041->1013|1041->1013|1041->1013|1041->1013|1041->1013|1042->1014|1042->1014|1042->1014|1042->1014|1042->1014|1042->1014|1049->1021|1049->1021|1049->1021|1053->1025|1053->1025|1053->1025|1063->1035|1063->1035|1063->1035|1063->1035|1063->1035|1063->1035|1064->1036|1064->1036|1064->1036|1064->1036|1064->1036|1064->1036|1089->1061|1089->1061|1089->1061|1113->1085|1113->1085|1114->1086|1117->1089|1117->1089|1122->1094|1122->1094|1123->1095|1124->1096|1124->1096|1133->1105|1133->1105|1134->1106|1135->1107|1135->1107|1136->1108|1164->1136|1164->1136|1165->1137|1166->1138|1166->1138|1167->1139|1167->1139|1169->1141|1169->1141|1169->1141|1172->1144|1172->1144|1172->1144|1173->1145|1175->1147|1175->1147|1176->1148|1178->1150|1178->1150|1179->1151|1181->1153|1181->1153|1183->1155|1183->1155|1185->1157|1185->1157|1187->1159|1187->1159|1188->1160|1190->1162|1190->1162|1191->1163|1193->1165|1193->1165|1194->1166|1196->1168|1196->1168|1198->1170|1198->1170|1200->1172|1200->1172|1202->1174|1202->1174|1203->1175|1205->1177|1205->1177|1206->1178|1208->1180|1208->1180|1209->1181|1211->1183|1211->1183|1213->1185|1213->1185|1215->1187|1215->1187|1236->1208|1236->1208|1237->1209|1249->1221|1249->1221|1250->1222|1261->1233|1261->1233|1263->1235|1273->1245|1273->1245|1275->1247|1281->1253|1281->1253|1282->1254|1282->1254|1283->1255|1283->1255|1284->1256|1284->1256|1285->1257|1285->1257|1286->1258|1286->1258|1289->1261|1289->1261|1289->1261|1290->1262|1292->1264|1292->1264|1293->1265|1295->1267|1295->1267|1296->1268|1298->1270|1298->1270|1300->1272|1300->1272|1302->1274|1302->1274|1304->1276|1304->1276|1305->1277|1307->1279|1307->1279|1308->1280|1310->1282|1310->1282|1311->1283|1313->1285|1313->1285|1315->1287|1315->1287|1317->1289|1317->1289|1319->1291|1319->1291|1320->1292|1322->1294|1322->1294|1323->1295|1325->1297|1325->1297|1326->1298|1328->1300|1328->1300|1330->1302|1330->1302|1332->1304|1332->1304|1353->1325|1353->1325|1354->1326|1366->1338|1366->1338|1367->1339|1377->1349|1377->1349|1379->1351|1389->1361|1389->1361|1391->1363|1396->1368|1396->1368|1397->1369|1397->1369|1398->1370|1398->1370|1399->1371|1399->1371|1400->1372|1400->1372|1401->1373|1401->1373|1403->1375|1403->1375|1403->1375|1404->1376|1406->1378|1406->1378|1407->1379|1409->1381|1409->1381|1410->1382|1412->1384|1412->1384|1414->1386|1414->1386|1416->1388|1416->1388|1437->1409|1437->1409|1438->1410|1438->1410|1438->1410|1440->1412|1440->1412|1440->1412|1441->1413|1443->1415|1443->1415|1444->1416|1446->1418|1446->1418|1447->1419|1449->1421|1449->1421|1451->1423|1451->1423|1453->1425|1453->1425|1470->1442|1470->1442|1472->1444|1472->1444|1472->1444|1474->1446|1474->1446|1474->1446|1475->1447|1477->1449|1477->1449|1478->1450|1480->1452|1480->1452|1481->1453|1483->1455|1483->1455|1485->1457|1485->1457|1487->1459|1487->1459|1508->1480|1508->1480|1510->1482|1510->1482|1510->1482|1512->1484|1512->1484|1512->1484|1513->1485|1515->1487|1515->1487|1516->1488|1518->1490|1518->1490|1519->1491|1521->1493|1521->1493|1523->1495|1523->1495|1525->1497|1525->1497|1547->1519|1547->1519|1550->1522|1550->1522|1550->1522|1552->1524|1552->1524|1552->1524|1553->1525|1555->1527|1555->1527|1556->1528|1558->1530|1558->1530|1559->1531|1561->1533|1561->1533|1563->1535|1563->1535|1565->1537|1565->1537|1587->1559|1587->1559|1589->1561|1589->1561|1589->1561|1591->1563|1591->1563|1591->1563|1592->1564|1594->1566|1594->1566|1595->1567|1597->1569|1597->1569|1598->1570|1600->1572|1600->1572|1602->1574|1602->1574|1604->1576|1604->1576|1627->1599|1627->1599|1628->1600|1628->1600|1628->1600|1630->1602|1630->1602|1630->1602|1631->1603|1633->1605|1633->1605|1634->1606|1636->1608|1636->1608|1637->1609|1639->1611|1639->1611|1641->1613|1641->1613|1643->1615|1643->1615|1665->1637|1665->1637|1666->1638|1666->1638|1666->1638|1668->1640|1668->1640|1668->1640|1669->1641|1671->1643|1671->1643|1672->1644|1674->1646|1674->1646|1675->1647|1677->1649|1677->1649|1679->1651|1679->1651|1681->1653|1681->1653|1703->1675|1703->1675|1705->1677|1707->1679|1707->1679|1708->1680|1718->1690|1718->1690|1722->1694|1722->1694|1723->1695|1724->1696|1724->1696|1725->1697|1725->1697|1725->1697|1726->1698|1727->1699|1727->1699|1728->1700|1728->1700|1729->1701|1729->1701|1730->1702|1730->1702
                  -- GENERATED --
              */
          