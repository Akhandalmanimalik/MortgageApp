
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
object mortgagePage9 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template12[String,EmployeIncomeTypeParam,SelfEmployeIncomeTypeParam,PensionIncomeTypeParam,InvestmentsIncomeTypeParam,MaternityIncomeTypeParam,VehicleAllowIncomeTypeParam,LivingAllowIncomeTypeParam,CommissionIncomeTypeParam,BonusIncomeTypeParam,OtherIncomeTypeParam,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(additionalApplicant:String,employeeIncome:EmployeIncomeTypeParam, selfEmployeeIncome:SelfEmployeIncomeTypeParam, pensionIncType:PensionIncomeTypeParam, investmentIncType:InvestmentsIncomeTypeParam, maternityIncType:MaternityIncomeTypeParam,vehicleIncType:VehicleAllowIncomeTypeParam,livingIncType:LivingAllowIncomeTypeParam, commissionIncType:CommissionIncomeTypeParam, bonusIncType:BonusIncomeTypeParam, otherIncType:OtherIncomeTypeParam,coApplicantName:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.465*/("""
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
    """),format.raw/*91.5*/("""}"""),format.raw/*91.6*/("""
    """),format.raw/*92.5*/("""</script>

<script type="text/javascript">
	function validateForm()"""),format.raw/*95.25*/("""{"""),format.raw/*95.26*/("""
			"""),format.raw/*96.4*/("""var employee = document.forms["myForm"]["employee"].value;
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
			
			if(employee == "false" && selfEmployed ==  "false" && pension == "false" && investments == "false" && maternity == "false" && vehicleAllow == "false" && livingAllow == "false" && commission == "false" && bonus == "false" && other == "false")"""),format.raw/*108.245*/("""{"""),format.raw/*108.246*/("""
		    	    """),format.raw/*109.12*/("""document.getElementById('input_204').innerHTML="<span style='color:red'>*This field is Required.</span>";
		        	return false;
			"""),format.raw/*111.4*/("""}"""),format.raw/*111.5*/("""else"""),format.raw/*111.9*/("""{"""),format.raw/*111.10*/("""
			"""),format.raw/*112.4*/("""document.getElementById("input_204").innerHTML="";
			"""),format.raw/*113.4*/("""}"""),format.raw/*113.5*/("""
			
			"""),format.raw/*115.4*/("""if(employee == "true")"""),format.raw/*115.26*/("""{"""),format.raw/*115.27*/("""
				"""),format.raw/*116.5*/("""var empBusinessName = document.forms["myForm"]["empBusinessName"].value;
				if(!empBusinessName)"""),format.raw/*117.25*/("""{"""),format.raw/*117.26*/("""
					 """),format.raw/*118.7*/("""document.getElementById('input_1102').innerHTML="<span style='color:red'>*This field is Required.</span>";
					 document.getElementById('input_11022').focus();
			        	return false;
				"""),format.raw/*121.5*/("""}"""),format.raw/*121.6*/("""else"""),format.raw/*121.10*/("""{"""),format.raw/*121.11*/("""
				"""),format.raw/*122.5*/("""document.getElementById("input_1102").innerHTML="";
				"""),format.raw/*123.5*/("""}"""),format.raw/*123.6*/("""
				
				"""),format.raw/*125.5*/("""var empStartMonth = document.forms["myForm"]["empStartMonth"].value;
				if(!empStartMonth)"""),format.raw/*126.23*/("""{"""),format.raw/*126.24*/("""
					 """),format.raw/*127.7*/("""document.getElementById('input_1103').innerHTML="<span style='color:red'>*This field is Required.</span>";
					 document.getElementById('datepicker0').focus();
			        	return false;
				"""),format.raw/*130.5*/("""}"""),format.raw/*130.6*/("""else"""),format.raw/*130.10*/("""{"""),format.raw/*130.11*/("""
				"""),format.raw/*131.5*/("""document.getElementById("input_1103").innerHTML="";
				"""),format.raw/*132.5*/("""}"""),format.raw/*132.6*/("""
				
				"""),format.raw/*134.5*/("""var empPosition = document.forms["myForm"]["empPosition"].value;
				if(!empPosition)"""),format.raw/*135.21*/("""{"""),format.raw/*135.22*/("""
					 """),format.raw/*136.7*/("""document.getElementById('input_1104').innerHTML="<span style='color:red'>*This field is Required.</span>";
					 document.getElementById('input_11044').focus();
			        	return false;
				"""),format.raw/*139.5*/("""}"""),format.raw/*139.6*/("""else"""),format.raw/*139.10*/("""{"""),format.raw/*139.11*/("""
				"""),format.raw/*140.5*/("""document.getElementById("input_1104").innerHTML="";
				"""),format.raw/*141.5*/("""}"""),format.raw/*141.6*/("""
									
		"""),format.raw/*143.3*/("""}"""),format.raw/*143.4*/("""

			"""),format.raw/*145.4*/("""if (selfEmployed == "true") """),format.raw/*145.32*/("""{"""),format.raw/*145.33*/("""
				"""),format.raw/*146.5*/("""var selfBusinessName = document.forms["myForm"]["selfBusinessName"].value;
				if (!selfBusinessName) """),format.raw/*147.28*/("""{"""),format.raw/*147.29*/("""
					"""),format.raw/*148.6*/("""document.getElementById('input_1118').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					document.getElementById('input_11188').focus();
					return false;
				"""),format.raw/*151.5*/("""}"""),format.raw/*151.6*/(""" """),format.raw/*151.7*/("""else """),format.raw/*151.12*/("""{"""),format.raw/*151.13*/("""
					"""),format.raw/*152.6*/("""document.getElementById("input_1118").innerHTML = "";
				"""),format.raw/*153.5*/("""}"""),format.raw/*153.6*/("""
				"""),format.raw/*154.5*/("""var selfStartMon = document.forms["myForm"]["selfStartMon"].value;
				if (!selfStartMon) """),format.raw/*155.24*/("""{"""),format.raw/*155.25*/("""
					"""),format.raw/*156.6*/("""document.getElementById('input_1119').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					document.getElementById('datepicker3').focus();
					return false;
				"""),format.raw/*159.5*/("""}"""),format.raw/*159.6*/(""" """),format.raw/*159.7*/("""else """),format.raw/*159.12*/("""{"""),format.raw/*159.13*/("""
					"""),format.raw/*160.6*/("""document.getElementById("input_1119").innerHTML = "";
				"""),format.raw/*161.5*/("""}"""),format.raw/*161.6*/("""
				"""),format.raw/*162.5*/("""var selfPosition = document.forms["myForm"]["selfPosition"].value;
				if (!selfPosition) """),format.raw/*163.24*/("""{"""),format.raw/*163.25*/("""
					"""),format.raw/*164.6*/("""document.getElementById('input_1120').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					document.getElementById('input_11200').focus();
					return false;
				"""),format.raw/*167.5*/("""}"""),format.raw/*167.6*/(""" """),format.raw/*167.7*/("""else """),format.raw/*167.12*/("""{"""),format.raw/*167.13*/("""
					"""),format.raw/*168.6*/("""document.getElementById("input_1120").innerHTML = "";
				"""),format.raw/*169.5*/("""}"""),format.raw/*169.6*/("""
			"""),format.raw/*170.4*/("""}"""),format.raw/*170.5*/("""
		
		"""),format.raw/*172.3*/("""if (pension == "true") """),format.raw/*172.26*/("""{"""),format.raw/*172.27*/("""
			"""),format.raw/*173.4*/("""var pensionBusiness1 = document.forms["myForm"]["pensionBusiness1"].value;
			if (!pensionBusiness1) """),format.raw/*174.27*/("""{"""),format.raw/*174.28*/("""
				"""),format.raw/*175.5*/("""document.getElementById('input_5002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_50022').focus();
				return false;
			"""),format.raw/*178.4*/("""}"""),format.raw/*178.5*/(""" """),format.raw/*178.6*/("""else """),format.raw/*178.11*/("""{"""),format.raw/*178.12*/("""
				"""),format.raw/*179.5*/("""document.getElementById("input_5002").innerHTML = "";
			"""),format.raw/*180.4*/("""}"""),format.raw/*180.5*/("""

			"""),format.raw/*182.4*/("""var pensionMY1 = document.forms["myForm"]["pensionMY1"].value;
			if (!pensionMY1) """),format.raw/*183.21*/("""{"""),format.raw/*183.22*/("""
				"""),format.raw/*184.5*/("""document.getElementById('input_5003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('datepicker6').focus();
				return false;
			"""),format.raw/*187.4*/("""}"""),format.raw/*187.5*/(""" """),format.raw/*187.6*/("""else """),format.raw/*187.11*/("""{"""),format.raw/*187.12*/("""
				"""),format.raw/*188.5*/("""document.getElementById("input_5003").innerHTML = "";
			"""),format.raw/*189.4*/("""}"""),format.raw/*189.5*/("""

			"""),format.raw/*191.4*/("""var pensionPosition1 = document.forms["myForm"]["pensionPosition1"].value;
			if (!pensionPosition1) """),format.raw/*192.27*/("""{"""),format.raw/*192.28*/("""
				"""),format.raw/*193.5*/("""document.getElementById('input_5004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_50044').focus();
				return false;
			"""),format.raw/*196.4*/("""}"""),format.raw/*196.5*/(""" """),format.raw/*196.6*/("""else """),format.raw/*196.11*/("""{"""),format.raw/*196.12*/("""
				"""),format.raw/*197.5*/("""document.getElementById("input_5004").innerHTML = "";
			"""),format.raw/*198.4*/("""}"""),format.raw/*198.5*/("""
		"""),format.raw/*199.3*/("""}"""),format.raw/*199.4*/("""

		"""),format.raw/*201.3*/("""if (investments == "true") """),format.raw/*201.30*/("""{"""),format.raw/*201.31*/("""
			"""),format.raw/*202.4*/("""var investmentBusiness1 = document.forms["myForm"]["investmentBusiness1"].value;
			if (!investmentBusiness1) """),format.raw/*203.30*/("""{"""),format.raw/*203.31*/("""
				"""),format.raw/*204.5*/("""document.getElementById('input_5006').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_50066').focus();
				return false;
			"""),format.raw/*207.4*/("""}"""),format.raw/*207.5*/(""" """),format.raw/*207.6*/("""else """),format.raw/*207.11*/("""{"""),format.raw/*207.12*/("""
				"""),format.raw/*208.5*/("""document.getElementById("input_5006").innerHTML = "";
			"""),format.raw/*209.4*/("""}"""),format.raw/*209.5*/("""

			"""),format.raw/*211.4*/("""var investmentsMY1 = document.forms["myForm"]["investmentsMY1"].value;
			if (!investmentsMY1) """),format.raw/*212.25*/("""{"""),format.raw/*212.26*/("""
				"""),format.raw/*213.5*/("""document.getElementById('input_5007').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('datepicker7').focus();
				return false;
			"""),format.raw/*216.4*/("""}"""),format.raw/*216.5*/(""" """),format.raw/*216.6*/("""else """),format.raw/*216.11*/("""{"""),format.raw/*216.12*/("""
				"""),format.raw/*217.5*/("""document.getElementById("input_5007").innerHTML = "";
			"""),format.raw/*218.4*/("""}"""),format.raw/*218.5*/("""

			"""),format.raw/*220.4*/("""var investmentPosition1 = document.forms["myForm"]["investmentPosition1"].value;
			if (!investmentPosition1) """),format.raw/*221.30*/("""{"""),format.raw/*221.31*/("""
				"""),format.raw/*222.5*/("""document.getElementById('input_5008').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_50088').focus();
				return false;
			"""),format.raw/*225.4*/("""}"""),format.raw/*225.5*/(""" """),format.raw/*225.6*/("""else """),format.raw/*225.11*/("""{"""),format.raw/*225.12*/("""
				"""),format.raw/*226.5*/("""document.getElementById("input_5008").innerHTML = "";
			"""),format.raw/*227.4*/("""}"""),format.raw/*227.5*/("""
		"""),format.raw/*228.3*/("""}"""),format.raw/*228.4*/("""

		"""),format.raw/*230.3*/("""if (maternity == "true") """),format.raw/*230.28*/("""{"""),format.raw/*230.29*/("""
			"""),format.raw/*231.4*/("""var maternityBusiness1 = document.forms["myForm"]["maternityBusiness1"].value;
			if (!maternityBusiness1) """),format.raw/*232.29*/("""{"""),format.raw/*232.30*/("""
				"""),format.raw/*233.5*/("""document.getElementById('input_6002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_60022').focus();
				return false;
			"""),format.raw/*236.4*/("""}"""),format.raw/*236.5*/(""" """),format.raw/*236.6*/("""else """),format.raw/*236.11*/("""{"""),format.raw/*236.12*/("""
				"""),format.raw/*237.5*/("""document.getElementById("input_6002").innerHTML = "";
			"""),format.raw/*238.4*/("""}"""),format.raw/*238.5*/("""

			"""),format.raw/*240.4*/("""var maternityMY1 = document.forms["myForm"]["maternityMY1"].value;
			if (!maternityMY1) """),format.raw/*241.23*/("""{"""),format.raw/*241.24*/("""
				"""),format.raw/*242.5*/("""document.getElementById('input_6003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('datepicker8').focus();
				return false;
			"""),format.raw/*245.4*/("""}"""),format.raw/*245.5*/(""" """),format.raw/*245.6*/("""else """),format.raw/*245.11*/("""{"""),format.raw/*245.12*/("""
				"""),format.raw/*246.5*/("""document.getElementById("input_6003").innerHTML = "";
			"""),format.raw/*247.4*/("""}"""),format.raw/*247.5*/("""

			"""),format.raw/*249.4*/("""var maternityPosition1 = document.forms["myForm"]["maternityPosition1"].value;
			if (!maternityPosition1) """),format.raw/*250.29*/("""{"""),format.raw/*250.30*/("""
				"""),format.raw/*251.5*/("""document.getElementById('input_6004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_60044').focus();
				return false;
			"""),format.raw/*254.4*/("""}"""),format.raw/*254.5*/(""" """),format.raw/*254.6*/("""else """),format.raw/*254.11*/("""{"""),format.raw/*254.12*/("""
				"""),format.raw/*255.5*/("""document.getElementById("input_6004").innerHTML = "";
			"""),format.raw/*256.4*/("""}"""),format.raw/*256.5*/("""
		"""),format.raw/*257.3*/("""}"""),format.raw/*257.4*/("""

		"""),format.raw/*259.3*/("""if (vehicleAllow == "true") """),format.raw/*259.31*/("""{"""),format.raw/*259.32*/("""
			"""),format.raw/*260.4*/("""var vehicleAllowBusiness1 = document.forms["myForm"]["vehicleAllowBusiness1"].value;
			if (!vehicleAllowBusiness1) """),format.raw/*261.32*/("""{"""),format.raw/*261.33*/("""
				"""),format.raw/*262.5*/("""document.getElementById('input_7002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_70022').focus();
				return false;
			"""),format.raw/*265.4*/("""}"""),format.raw/*265.5*/(""" """),format.raw/*265.6*/("""else """),format.raw/*265.11*/("""{"""),format.raw/*265.12*/("""
				"""),format.raw/*266.5*/("""document.getElementById("input_7002").innerHTML = "";
			"""),format.raw/*267.4*/("""}"""),format.raw/*267.5*/("""

			"""),format.raw/*269.4*/("""var vehicleAllowMY1 = document.forms["myForm"]["vehicleAllowMY1"].value;
			if (!vehicleAllowMY1) """),format.raw/*270.26*/("""{"""),format.raw/*270.27*/("""
				"""),format.raw/*271.5*/("""document.getElementById('input_7003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('datepicker9').focus();
				return false;
			"""),format.raw/*274.4*/("""}"""),format.raw/*274.5*/(""" """),format.raw/*274.6*/("""else """),format.raw/*274.11*/("""{"""),format.raw/*274.12*/("""
				"""),format.raw/*275.5*/("""document.getElementById("input_7003").innerHTML = "";
			"""),format.raw/*276.4*/("""}"""),format.raw/*276.5*/("""

			"""),format.raw/*278.4*/("""var vehicleAllowPosition1 = document.forms["myForm"]["vehicleAllowPosition1"].value;
			if (!vehicleAllowPosition1) """),format.raw/*279.32*/("""{"""),format.raw/*279.33*/("""
				"""),format.raw/*280.5*/("""document.getElementById('input_7004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_70044').focus();
				return false;
			"""),format.raw/*283.4*/("""}"""),format.raw/*283.5*/(""" """),format.raw/*283.6*/("""else """),format.raw/*283.11*/("""{"""),format.raw/*283.12*/("""
				"""),format.raw/*284.5*/("""document.getElementById("input_7004").innerHTML = "";
			"""),format.raw/*285.4*/("""}"""),format.raw/*285.5*/("""
		"""),format.raw/*286.3*/("""}"""),format.raw/*286.4*/("""

		"""),format.raw/*288.3*/("""if (livingAllow == "true") """),format.raw/*288.30*/("""{"""),format.raw/*288.31*/("""
			"""),format.raw/*289.4*/("""var livingAllowBusiness1 = document.forms["myForm"]["livingAllowBusiness1"].value;
			if (!livingAllowBusiness1) """),format.raw/*290.31*/("""{"""),format.raw/*290.32*/("""
				"""),format.raw/*291.5*/("""document.getElementById('input_8002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_80022').focus();
				return false;
			"""),format.raw/*294.4*/("""}"""),format.raw/*294.5*/(""" """),format.raw/*294.6*/("""else """),format.raw/*294.11*/("""{"""),format.raw/*294.12*/("""
				"""),format.raw/*295.5*/("""document.getElementById("input_8002").innerHTML = "";
			"""),format.raw/*296.4*/("""}"""),format.raw/*296.5*/("""

			"""),format.raw/*298.4*/("""var livingAllowMY1 = document.forms["myForm"]["livingAllowMY1"].value;
			if (!livingAllowMY1) """),format.raw/*299.25*/("""{"""),format.raw/*299.26*/("""
				"""),format.raw/*300.5*/("""document.getElementById('input_8003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('datepicker10').focus();
				return false;
			"""),format.raw/*303.4*/("""}"""),format.raw/*303.5*/(""" """),format.raw/*303.6*/("""else """),format.raw/*303.11*/("""{"""),format.raw/*303.12*/("""
				"""),format.raw/*304.5*/("""document.getElementById("input_8003").innerHTML = "";
			"""),format.raw/*305.4*/("""}"""),format.raw/*305.5*/("""

			"""),format.raw/*307.4*/("""var livingAllowPosition1 = document.forms["myForm"]["livingAllowPosition1"].value;
			if (!livingAllowPosition1) """),format.raw/*308.31*/("""{"""),format.raw/*308.32*/("""
				"""),format.raw/*309.5*/("""document.getElementById('input_8004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_80044').focus();
				return false;
			"""),format.raw/*312.4*/("""}"""),format.raw/*312.5*/(""" """),format.raw/*312.6*/("""else """),format.raw/*312.11*/("""{"""),format.raw/*312.12*/("""
				"""),format.raw/*313.5*/("""document.getElementById("input_8004").innerHTML = "";
			"""),format.raw/*314.4*/("""}"""),format.raw/*314.5*/("""
		"""),format.raw/*315.3*/("""}"""),format.raw/*315.4*/("""

		"""),format.raw/*317.3*/("""if (commission == "true") """),format.raw/*317.29*/("""{"""),format.raw/*317.30*/("""
			"""),format.raw/*318.4*/("""var commissionBusiness1 = document.forms["myForm"]["commissionBusiness1"].value;
			if (!commissionBusiness1) """),format.raw/*319.30*/("""{"""),format.raw/*319.31*/("""
				"""),format.raw/*320.5*/("""document.getElementById('input_9002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_90022').focus();
				return false;
			"""),format.raw/*323.4*/("""}"""),format.raw/*323.5*/(""" """),format.raw/*323.6*/("""else """),format.raw/*323.11*/("""{"""),format.raw/*323.12*/("""
				"""),format.raw/*324.5*/("""document.getElementById("input_9002").innerHTML = "";
			"""),format.raw/*325.4*/("""}"""),format.raw/*325.5*/("""

			"""),format.raw/*327.4*/("""var commissionMY1 = document.forms["myForm"]["commissionMY1"].value;
			if (!commissionMY1) """),format.raw/*328.24*/("""{"""),format.raw/*328.25*/("""
				"""),format.raw/*329.5*/("""document.getElementById('input_9003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('datepicker11').focus();
				return false;
			"""),format.raw/*332.4*/("""}"""),format.raw/*332.5*/(""" """),format.raw/*332.6*/("""else """),format.raw/*332.11*/("""{"""),format.raw/*332.12*/("""
				"""),format.raw/*333.5*/("""document.getElementById("input_9003").innerHTML = "";
			"""),format.raw/*334.4*/("""}"""),format.raw/*334.5*/("""

			"""),format.raw/*336.4*/("""var commissionPosition1 = document.forms["myForm"]["commissionPosition1"].value;
			if (!commissionPosition1) """),format.raw/*337.30*/("""{"""),format.raw/*337.31*/("""
				"""),format.raw/*338.5*/("""document.getElementById('input_9004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_90044').focus();
				return false;
			"""),format.raw/*341.4*/("""}"""),format.raw/*341.5*/(""" """),format.raw/*341.6*/("""else """),format.raw/*341.11*/("""{"""),format.raw/*341.12*/("""
				"""),format.raw/*342.5*/("""document.getElementById("input_9004").innerHTML = "";
			"""),format.raw/*343.4*/("""}"""),format.raw/*343.5*/("""
		"""),format.raw/*344.3*/("""}"""),format.raw/*344.4*/("""
		"""),format.raw/*345.3*/("""if (bonus == "true") """),format.raw/*345.24*/("""{"""),format.raw/*345.25*/("""
			"""),format.raw/*346.4*/("""var bonusBusiness1 = document.forms["myForm"]["bonusBusiness1"].value;
			if (!bonusBusiness1) """),format.raw/*347.25*/("""{"""),format.raw/*347.26*/("""
				"""),format.raw/*348.5*/("""document.getElementById('input_1002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_10022').focus();
				return false;
			"""),format.raw/*351.4*/("""}"""),format.raw/*351.5*/(""" """),format.raw/*351.6*/("""else """),format.raw/*351.11*/("""{"""),format.raw/*351.12*/("""
				"""),format.raw/*352.5*/("""document.getElementById("input_1002").innerHTML = "";
			"""),format.raw/*353.4*/("""}"""),format.raw/*353.5*/("""

			"""),format.raw/*355.4*/("""var bonusMY1 = document.forms["myForm"]["bonusMY1"].value;
			if (!bonusMY1) """),format.raw/*356.19*/("""{"""),format.raw/*356.20*/("""
				"""),format.raw/*357.5*/("""document.getElementById('input_1003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('datepicker12').focus();
				return false;
			"""),format.raw/*360.4*/("""}"""),format.raw/*360.5*/(""" """),format.raw/*360.6*/("""else """),format.raw/*360.11*/("""{"""),format.raw/*360.12*/("""
				"""),format.raw/*361.5*/("""document.getElementById("input_1003").innerHTML = "";
			"""),format.raw/*362.4*/("""}"""),format.raw/*362.5*/("""

			"""),format.raw/*364.4*/("""var bonusPosition1 = document.forms["myForm"]["bonusPosition1"].value;
			if (!bonusPosition1) """),format.raw/*365.25*/("""{"""),format.raw/*365.26*/("""
				"""),format.raw/*366.5*/("""document.getElementById('input_1004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_10044').focus();
				return false;
			"""),format.raw/*369.4*/("""}"""),format.raw/*369.5*/(""" """),format.raw/*369.6*/("""else """),format.raw/*369.11*/("""{"""),format.raw/*369.12*/("""
				"""),format.raw/*370.5*/("""document.getElementById("input_1004").innerHTML = "";
			"""),format.raw/*371.4*/("""}"""),format.raw/*371.5*/("""
		"""),format.raw/*372.3*/("""}"""),format.raw/*372.4*/("""

		"""),format.raw/*374.3*/("""if (other == "true") """),format.raw/*374.24*/("""{"""),format.raw/*374.25*/("""
			"""),format.raw/*375.4*/("""var otherBusiness1 = document.forms["myForm"]["otherBusiness1"].value;
			if (!otherBusiness1) """),format.raw/*376.25*/("""{"""),format.raw/*376.26*/("""
				"""),format.raw/*377.5*/("""document.getElementById('input_11002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_110022').focus();
				return false;
			"""),format.raw/*380.4*/("""}"""),format.raw/*380.5*/(""" """),format.raw/*380.6*/("""else """),format.raw/*380.11*/("""{"""),format.raw/*380.12*/("""
				"""),format.raw/*381.5*/("""document.getElementById("input_11002").innerHTML = "";
			"""),format.raw/*382.4*/("""}"""),format.raw/*382.5*/("""

			"""),format.raw/*384.4*/("""var otherMY1 = document.forms["myForm"]["otherMY1"].value;
			if (!otherMY1) """),format.raw/*385.19*/("""{"""),format.raw/*385.20*/("""
				"""),format.raw/*386.5*/("""document.getElementById('input_11003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('datepicker13').focus();
				return false;
			"""),format.raw/*389.4*/("""}"""),format.raw/*389.5*/(""" """),format.raw/*389.6*/("""else """),format.raw/*389.11*/("""{"""),format.raw/*389.12*/("""
				"""),format.raw/*390.5*/("""document.getElementById("input_11003").innerHTML = "";
			"""),format.raw/*391.4*/("""}"""),format.raw/*391.5*/("""

			"""),format.raw/*393.4*/("""var otherPosition1 = document.forms["myForm"]["otherPosition1"].value;
			if (!otherPosition1) """),format.raw/*394.25*/("""{"""),format.raw/*394.26*/("""
				"""),format.raw/*395.5*/("""document.getElementById('input_11004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_110044').focus();
				return false;
			"""),format.raw/*398.4*/("""}"""),format.raw/*398.5*/(""" """),format.raw/*398.6*/("""else """),format.raw/*398.11*/("""{"""),format.raw/*398.12*/("""
				"""),format.raw/*399.5*/("""document.getElementById("input_11004").innerHTML = "";
			"""),format.raw/*400.4*/("""}"""),format.raw/*400.5*/("""
		"""),format.raw/*401.3*/("""}"""),format.raw/*401.4*/("""
		
		"""),format.raw/*403.3*/("""var totalMonths = document.forms["myForm"]["totalMonths"].value;
		if(totalMonths<36 && employee == "true")"""),format.raw/*404.43*/("""{"""),format.raw/*404.44*/("""
			"""),format.raw/*405.4*/("""var empBusinessName2 = document.forms["myForm"]["empBusinessName2"].value;
			if(!empBusinessName2)"""),format.raw/*406.25*/("""{"""),format.raw/*406.26*/("""
				 """),format.raw/*407.6*/("""document.getElementById('input_1106').innerHTML="<span style='color:red'>*This field is Required.</span>";
				 document.getElementById('input_11066').focus();
				 return false;
			"""),format.raw/*410.4*/("""}"""),format.raw/*410.5*/("""else"""),format.raw/*410.9*/("""{"""),format.raw/*410.10*/("""
			"""),format.raw/*411.4*/("""document.getElementById("input_1106").innerHTML="";
			"""),format.raw/*412.4*/("""}"""),format.raw/*412.5*/("""
			"""),format.raw/*413.4*/("""var empStartMonth2 = document.forms["myForm"]["empStartMonth2"].value;
			if(!empStartMonth2)"""),format.raw/*414.23*/("""{"""),format.raw/*414.24*/("""
			"""),format.raw/*415.4*/("""document.getElementById('input_1107').innerHTML="<span style='color:red'>*This field is Required.</span>";
			document.getElementById('datepicker1').focus();
			return false;
			"""),format.raw/*418.4*/("""}"""),format.raw/*418.5*/("""else"""),format.raw/*418.9*/("""{"""),format.raw/*418.10*/("""
			"""),format.raw/*419.4*/("""document.getElementById("input_1107").innerHTML="";
			"""),format.raw/*420.4*/("""}"""),format.raw/*420.5*/("""
			   
			"""),format.raw/*422.4*/("""var empPosition2 = document.forms["myForm"]["empPosition2"].value;
			if(!empPosition2)"""),format.raw/*423.21*/("""{"""),format.raw/*423.22*/("""
			"""),format.raw/*424.4*/("""document.getElementById('input_1108').innerHTML="<span style='color:red'>*This field is Required.</span>";
			document.getElementById('input_11088').focus();
			return false;
			"""),format.raw/*427.4*/("""}"""),format.raw/*427.5*/("""else"""),format.raw/*427.9*/("""{"""),format.raw/*427.10*/("""
			"""),format.raw/*428.4*/("""document.getElementById("input_1108").innerHTML="";
			"""),format.raw/*429.4*/("""}"""),format.raw/*429.5*/("""
			
			"""),format.raw/*431.4*/("""var totalMonths2 = document.forms["myForm"]["totalMonths2"].value;
			if(totalMonths2<36)"""),format.raw/*432.23*/("""{"""),format.raw/*432.24*/("""
				"""),format.raw/*433.5*/("""var empBusinessName3 = document.forms["myForm"]["empBusinessName3"].value;
				if(!empBusinessName3)"""),format.raw/*434.26*/("""{"""),format.raw/*434.27*/("""
				"""),format.raw/*435.5*/("""document.getElementById('input_1110').innerHTML="<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_11100').focus();
				return false;
				"""),format.raw/*438.5*/("""}"""),format.raw/*438.6*/("""else"""),format.raw/*438.10*/("""{"""),format.raw/*438.11*/("""
				"""),format.raw/*439.5*/("""document.getElementById("input_1110").innerHTML="";
				"""),format.raw/*440.5*/("""}"""),format.raw/*440.6*/("""
				    	
				"""),format.raw/*442.5*/("""var empStartMonth3 = document.forms["myForm"]["empStartMonth3"].value;
				
				if (!empStartMonth3) """),format.raw/*444.26*/("""{"""),format.raw/*444.27*/("""
				"""),format.raw/*445.5*/("""document.getElementById('input_1111').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('datepicker2').focus();
				return false;
				"""),format.raw/*448.5*/("""}"""),format.raw/*448.6*/(""" """),format.raw/*448.7*/("""else """),format.raw/*448.12*/("""{"""),format.raw/*448.13*/("""
				"""),format.raw/*449.5*/("""document.getElementById("input_1111").innerHTML = "";
				"""),format.raw/*450.5*/("""}"""),format.raw/*450.6*/("""
				"""),format.raw/*451.5*/("""var empPosition3 = document.forms["myForm"]["empPosition3"].value;
				if (!empPosition3) """),format.raw/*452.24*/("""{"""),format.raw/*452.25*/("""
				"""),format.raw/*453.5*/("""document.getElementById('input_1112').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_11122').focus();
				return false;
				"""),format.raw/*456.5*/("""}"""),format.raw/*456.6*/(""" """),format.raw/*456.7*/("""else """),format.raw/*456.12*/("""{"""),format.raw/*456.13*/("""
				"""),format.raw/*457.5*/("""document.getElementById("input_1112").innerHTML = "";
				"""),format.raw/*458.5*/("""}"""),format.raw/*458.6*/("""						
			"""),format.raw/*459.4*/("""}"""),format.raw/*459.5*/("""
		"""),format.raw/*460.3*/("""}"""),format.raw/*460.4*/("""
		
		"""),format.raw/*462.3*/("""var monthsum1 = document.forms["myForm"]["monthsum1"].value;
		if(monthsum1<36 && selfEmployed == "true")"""),format.raw/*463.45*/("""{"""),format.raw/*463.46*/("""
			"""),format.raw/*464.4*/("""var selfBusinessName2 = document.forms["myForm"]["selfBusinessName2"].value;
			if (!selfBusinessName2) """),format.raw/*465.28*/("""{"""),format.raw/*465.29*/("""
				"""),format.raw/*466.5*/("""document.getElementById('input_1122').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_11222').focus();
				return false;
			"""),format.raw/*469.4*/("""}"""),format.raw/*469.5*/(""" """),format.raw/*469.6*/("""else """),format.raw/*469.11*/("""{"""),format.raw/*469.12*/("""
				"""),format.raw/*470.5*/("""document.getElementById("input_1122").innerHTML = "";
			"""),format.raw/*471.4*/("""}"""),format.raw/*471.5*/("""

			"""),format.raw/*473.4*/("""var selfStartMon2 = document.forms["myForm"]["selfStartMon2"].value;
			if (!selfStartMon2) """),format.raw/*474.24*/("""{"""),format.raw/*474.25*/("""
				"""),format.raw/*475.5*/("""document.getElementById('input_1123').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('datepicker4').focus();
				return false;
			"""),format.raw/*478.4*/("""}"""),format.raw/*478.5*/(""" """),format.raw/*478.6*/("""else """),format.raw/*478.11*/("""{"""),format.raw/*478.12*/("""
				"""),format.raw/*479.5*/("""document.getElementById("input_1123").innerHTML = "";
			"""),format.raw/*480.4*/("""}"""),format.raw/*480.5*/("""

			"""),format.raw/*482.4*/("""var selfPosition2 = document.forms["myForm"]["selfPosition2"].value;
			if (!selfPosition2) """),format.raw/*483.24*/("""{"""),format.raw/*483.25*/("""
				"""),format.raw/*484.5*/("""document.getElementById('input_1124').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				document.getElementById('input_11244').focus();
				return false;
			"""),format.raw/*487.4*/("""}"""),format.raw/*487.5*/(""" """),format.raw/*487.6*/("""else """),format.raw/*487.11*/("""{"""),format.raw/*487.12*/("""
				"""),format.raw/*488.5*/("""document.getElementById("input_1124").innerHTML = "";
			"""),format.raw/*489.4*/("""}"""),format.raw/*489.5*/("""
			"""),format.raw/*490.4*/("""var selfTotal2 = document.forms["myForm"]["selfemployemonthsumTotal2"].value;
			if(selfTotal2<36)"""),format.raw/*491.21*/("""{"""),format.raw/*491.22*/("""
				"""),format.raw/*492.5*/("""var selfBusinessName3 = document.forms["myForm"]["selfBusinessName3"].value;
				if (!selfBusinessName3) """),format.raw/*493.29*/("""{"""),format.raw/*493.30*/("""
					"""),format.raw/*494.6*/("""document.getElementById('input_1126').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					document.getElementById('input_11266').focus();
					return false;
				"""),format.raw/*497.5*/("""}"""),format.raw/*497.6*/(""" """),format.raw/*497.7*/("""else """),format.raw/*497.12*/("""{"""),format.raw/*497.13*/("""
					"""),format.raw/*498.6*/("""document.getElementById("input_1126").innerHTML = "";
				"""),format.raw/*499.5*/("""}"""),format.raw/*499.6*/("""

				"""),format.raw/*501.5*/("""var selfStartMon3 = document.forms["myForm"]["selfStartMon3"].value;
				if (!selfStartMon3) """),format.raw/*502.25*/("""{"""),format.raw/*502.26*/("""
					"""),format.raw/*503.6*/("""document.getElementById('input_1127').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					document.getElementById('datepicker5').focus();
					return false;
				"""),format.raw/*506.5*/("""}"""),format.raw/*506.6*/(""" """),format.raw/*506.7*/("""else """),format.raw/*506.12*/("""{"""),format.raw/*506.13*/("""
					"""),format.raw/*507.6*/("""document.getElementById("input_1127").innerHTML = "";
				"""),format.raw/*508.5*/("""}"""),format.raw/*508.6*/("""

				"""),format.raw/*510.5*/("""var selfPosition3 = document.forms["myForm"]["selfPosition3"].value;
				if (!selfPosition3) """),format.raw/*511.25*/("""{"""),format.raw/*511.26*/("""
					"""),format.raw/*512.6*/("""document.getElementById('input_1128').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					document.getElementById('input_11288').focus();
					return false;
				"""),format.raw/*515.5*/("""}"""),format.raw/*515.6*/(""" """),format.raw/*515.7*/("""else """),format.raw/*515.12*/("""{"""),format.raw/*515.13*/("""
					"""),format.raw/*516.6*/("""document.getElementById("input_1128").innerHTML = "";
				"""),format.raw/*517.5*/("""}"""),format.raw/*517.6*/("""				
				
			"""),format.raw/*519.4*/("""}"""),format.raw/*519.5*/("""
		"""),format.raw/*520.3*/("""}"""),format.raw/*520.4*/("""
		
		"""),format.raw/*522.3*/("""return true;
	"""),format.raw/*523.2*/("""}"""),format.raw/*523.3*/("""
"""),format.raw/*524.1*/("""</script>

    <script>
      $(function()"""),format.raw/*527.19*/("""{"""),format.raw/*527.20*/("""
        """),format.raw/*528.9*/("""$("#geocomplete").geocomplete("""),format.raw/*528.39*/("""{"""),format.raw/*528.40*/("""
          """),format.raw/*529.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*532.9*/("""}"""),format.raw/*532.10*/(""");

        $("#find").click(function()"""),format.raw/*534.36*/("""{"""),format.raw/*534.37*/("""
          """),format.raw/*535.11*/("""$("#geocomplete").trigger("geocode");
        """),format.raw/*536.9*/("""}"""),format.raw/*536.10*/(""");
      """),format.raw/*537.7*/("""}"""),format.raw/*537.8*/(""");
    </script>
     <script>
      $(function()"""),format.raw/*540.19*/("""{"""),format.raw/*540.20*/("""
        """),format.raw/*541.9*/("""$("#geocomplete1").geocomplete("""),format.raw/*541.40*/("""{"""),format.raw/*541.41*/("""
          """),format.raw/*542.11*/("""map: ".map_canvas",
          details: "form",
          types: ["geocode", "establishment"],
        """),format.raw/*545.9*/("""}"""),format.raw/*545.10*/(""");

        $("#find").click(function()"""),format.raw/*547.36*/("""{"""),format.raw/*547.37*/("""
          """),format.raw/*548.11*/("""$("#geocomplete1").trigger("geocode");
        """),format.raw/*549.9*/("""}"""),format.raw/*549.10*/(""");
      """),format.raw/*550.7*/("""}"""),format.raw/*550.8*/(""");
      
	</script>
	
	
<!-- <script>
$(function() """),format.raw/*556.14*/("""{"""),format.raw/*556.15*/("""
	"""),format.raw/*557.2*/("""$('.date-picker').datepicker( """),format.raw/*557.32*/("""{"""),format.raw/*557.33*/("""
	    """),format.raw/*558.6*/("""changeMonth: true,
	    changeYear: true,
	    showButtonPanel: true,
	    dateFormat: 'MM yy',
	    onClose: function(dateText, inst) """),format.raw/*562.40*/("""{"""),format.raw/*562.41*/(""" 
	        """),format.raw/*563.10*/("""var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
	        var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
	        $(this).datepicker('setDate', new Date(year, month, 1));
	    """),format.raw/*566.6*/("""}"""),format.raw/*566.7*/("""
	"""),format.raw/*567.2*/("""}"""),format.raw/*567.3*/(""");
	"""),format.raw/*568.2*/("""}"""),format.raw/*568.3*/(""");
</script> -->

<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->  
</head>
<body>
<br>
<br>
<div style="width: 97%">
		<form name="myForm" action="mortgagePage9" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value="uniid" name="uniid">
		<input type="hidden" name="empStartMon1" value=""""),_display_(/*580.52*/employeeIncome/*580.66*/.getStartMonth1),format.raw/*580.81*/("""">
		<input type="hidden" name="empStartMon51" value=""""),_display_(/*581.53*/employeeIncome/*581.67*/.getStartMonth11),format.raw/*581.83*/("""">
		<input type="hidden" name="empStartMon52" value=""""),_display_(/*582.53*/employeeIncome/*582.67*/.getStartMonth21),format.raw/*582.83*/("""">
		
		<input type="hidden" name="monthWorked1" value=""""),_display_(/*584.52*/employeeIncome/*584.66*/.getMonthsWorked1),format.raw/*584.83*/("""">
		<input type="hidden" name="monthWorked2" value=""""),_display_(/*585.52*/employeeIncome/*585.66*/.getMonthTotal11),format.raw/*585.82*/("""">
		<input type="hidden" name="monthWorked3" value=""""),_display_(/*586.52*/employeeIncome/*586.66*/.getStartMonth21),format.raw/*586.82*/("""">
		
		<input type="hidden" name="selfStartMon1" value=""""),_display_(/*588.53*/selfEmployeeIncome/*588.71*/.getStartMonth21),format.raw/*588.87*/("""">
		<input type="hidden" name="selfStartMon212" value=""""),_display_(/*589.55*/selfEmployeeIncome/*589.73*/.getStartMonth22),format.raw/*589.89*/("""">
		<input type="hidden" name="selfStartMon213" value=""""),_display_(/*590.55*/selfEmployeeIncome/*590.73*/.getStartMonth23),format.raw/*590.89*/("""">
		
		<input type="hidden" name="selfMonthWorked1" value=""""),_display_(/*592.56*/selfEmployeeIncome/*592.74*/.getMonthsWorked21),format.raw/*592.92*/("""">
		<input type="hidden" name="selfMonthWorked2" value=""""),_display_(/*593.56*/selfEmployeeIncome/*593.74*/.getMonthTotal22),format.raw/*593.90*/("""">
		<input type="hidden" name="selfMonthWorked3" value=""""),_display_(/*594.56*/selfEmployeeIncome/*594.74*/.getMonthsWorked23),format.raw/*594.92*/("""">
		<input type="hidden" name="pensionStartMon" value=""""),_display_(/*595.55*/pensionIncType/*595.69*/.getStartMonth),format.raw/*595.83*/("""">
		<input type="hidden" name="investStartMon" value=""""),_display_(/*596.54*/investmentIncType/*596.71*/.getStartMonth),format.raw/*596.85*/("""">
		<input type="hidden" name="maternityStartMon" value=""""),_display_(/*597.57*/maternityIncType/*597.73*/.getStartMonth),format.raw/*597.87*/("""">
		<input type="hidden" name="vehicleStartMon" value=""""),_display_(/*598.55*/vehicleIncType/*598.69*/.getStartMonth),format.raw/*598.83*/("""">
		<input type="hidden" name="livingStartMon"  value=""""),_display_(/*599.55*/livingIncType/*599.68*/.getStartMonth),format.raw/*599.82*/("""">
		<input type="hidden" name="commissionStartMon"   value=""""),_display_(/*600.60*/commissionIncType/*600.77*/.getStartMonth),format.raw/*600.91*/("""">
		<input type="hidden" name="bonusStartMon"   value=""""),_display_(/*601.55*/bonusIncType/*601.67*/.getStartMonth),format.raw/*601.81*/("""">
		<input type="hidden" name="otherStartMon"   value=""""),_display_(/*602.55*/otherIncType/*602.67*/.getStartMonth),format.raw/*602.81*/("""">
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*610.11*/routes/*610.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*610.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<div ng-controller="DemoController" ng-init="isDisabled = false">
		
		<label class="labelfont">"""),_display_(/*616.29*/coApplicantName),format.raw/*616.44*/("""</label><br><br>
		<label class="labelfont">What types of income do you currently receive? Select all that apply.<span style="color: red; font-size: 3">*</span></label><br>
		 
		"""),_display_(/*619.4*/if(employeeIncome !=null && employeeIncome.isEmployed)/*619.58*/{_display_(Seq[Any](format.raw/*619.59*/("""
		"""),format.raw/*620.3*/("""<div ng-init="checkModel.Employee=true"></div>
		""")))}),format.raw/*621.4*/("""
		"""),_display_(/*622.4*/if(selfEmployeeIncome !=null && selfEmployeeIncome.isSelfEmployed)/*622.70*/{_display_(Seq[Any](format.raw/*622.71*/("""
		"""),format.raw/*623.3*/("""<div ng-init="checkModel.SelfEmployed=true"></div>
		""")))}),format.raw/*624.4*/("""
		
		"""),_display_(/*626.4*/if(pensionIncType !=null && pensionIncType.isPension)/*626.57*/{_display_(Seq[Any](format.raw/*626.58*/("""
		"""),format.raw/*627.3*/("""<div ng-init="checkModel.Pension=true"></div>
		""")))}),format.raw/*628.4*/("""
		"""),_display_(/*629.4*/if(investmentIncType !=null && investmentIncType.isInvestments)/*629.67*/{_display_(Seq[Any](format.raw/*629.68*/("""
		"""),format.raw/*630.3*/("""<div ng-init="checkModel.Investments=true"></div>
		""")))}),format.raw/*631.4*/("""
		
		"""),_display_(/*633.4*/if(maternityIncType !=null && maternityIncType.isMaternity)/*633.63*/{_display_(Seq[Any](format.raw/*633.64*/("""
		"""),format.raw/*634.3*/("""<div ng-init="checkModel.Maternity=true"></div>
		""")))}),format.raw/*635.4*/("""
		
		"""),_display_(/*637.4*/if(vehicleIncType !=null && vehicleIncType.isVehicleAllow)/*637.62*/{_display_(Seq[Any](format.raw/*637.63*/("""
		"""),format.raw/*638.3*/("""<div ng-init="checkModel.VehicleAllow=true"></div>
		""")))}),format.raw/*639.4*/("""
		
		"""),_display_(/*641.4*/if(livingIncType !=null && livingIncType.isLivingAllow)/*641.59*/{_display_(Seq[Any](format.raw/*641.60*/("""
		"""),format.raw/*642.3*/("""<div ng-init="checkModel.LivingAllow=true"></div>
		""")))}),format.raw/*643.4*/("""

		"""),_display_(/*645.4*/if(commissionIncType !=null && commissionIncType.isCommission)/*645.66*/{_display_(Seq[Any](format.raw/*645.67*/("""
		"""),format.raw/*646.3*/("""<div ng-init="checkModel.Commission=true"></div>
		""")))}),format.raw/*647.4*/("""
		
		"""),_display_(/*649.4*/if(bonusIncType !=null && bonusIncType.isBonus)/*649.51*/{_display_(Seq[Any](format.raw/*649.52*/("""
		"""),format.raw/*650.3*/("""<div ng-init="checkModel.Bonus=true"></div>
		""")))}),format.raw/*651.4*/("""
		
		"""),_display_(/*653.4*/if(otherIncType !=null && otherIncType.isOther)/*653.51*/{_display_(Seq[Any](format.raw/*653.52*/("""
		"""),format.raw/*654.3*/("""<div ng-init="checkModel.Other=true"></div>
		""")))}),format.raw/*655.4*/("""
		
				
			"""),format.raw/*658.4*/("""<div class="btn-group" style="padding-left: 0%; width: 100%;" >
          			
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
           
            <input type="hidden" name="incomeTypes[]" value=""""),format.raw/*696.62*/("""{"""),format.raw/*696.63*/("""{"""),format.raw/*696.64*/("""checkResults"""),format.raw/*696.76*/("""}"""),format.raw/*696.77*/("""}"""),format.raw/*696.78*/("""">
            <div id="input_204" style="position: absolute;"> </div>
            <input type="hidden" name="employee" value=""""),format.raw/*698.57*/("""{"""),format.raw/*698.58*/("""{"""),format.raw/*698.59*/("""checkModel.Employee"""),format.raw/*698.78*/("""}"""),format.raw/*698.79*/("""}"""),format.raw/*698.80*/(""""/>
            <input type="hidden" name="selfEmployed" value=""""),format.raw/*699.61*/("""{"""),format.raw/*699.62*/("""{"""),format.raw/*699.63*/("""checkModel.SelfEmployed"""),format.raw/*699.86*/("""}"""),format.raw/*699.87*/("""}"""),format.raw/*699.88*/(""""/>
            <input type="hidden" name="pension" value=""""),format.raw/*700.56*/("""{"""),format.raw/*700.57*/("""{"""),format.raw/*700.58*/("""checkModel.Pension"""),format.raw/*700.76*/("""}"""),format.raw/*700.77*/("""}"""),format.raw/*700.78*/(""""/>
            <input type="hidden" name="investments" value=""""),format.raw/*701.60*/("""{"""),format.raw/*701.61*/("""{"""),format.raw/*701.62*/("""checkModel.Investments"""),format.raw/*701.84*/("""}"""),format.raw/*701.85*/("""}"""),format.raw/*701.86*/(""""/>
            <input type="hidden" name="maternity" value=""""),format.raw/*702.58*/("""{"""),format.raw/*702.59*/("""{"""),format.raw/*702.60*/("""checkModel.Maternity"""),format.raw/*702.80*/("""}"""),format.raw/*702.81*/("""}"""),format.raw/*702.82*/(""""/>
            <input type="hidden" name="vehicleAllow" value=""""),format.raw/*703.61*/("""{"""),format.raw/*703.62*/("""{"""),format.raw/*703.63*/("""checkModel.VehicleAllow"""),format.raw/*703.86*/("""}"""),format.raw/*703.87*/("""}"""),format.raw/*703.88*/(""""/>
            <input type="hidden" name="livingAllow" value=""""),format.raw/*704.60*/("""{"""),format.raw/*704.61*/("""{"""),format.raw/*704.62*/("""checkModel.LivingAllow"""),format.raw/*704.84*/("""}"""),format.raw/*704.85*/("""}"""),format.raw/*704.86*/(""""/>
            <input type="hidden" name="commission" value=""""),format.raw/*705.59*/("""{"""),format.raw/*705.60*/("""{"""),format.raw/*705.61*/("""checkModel.Commission"""),format.raw/*705.82*/("""}"""),format.raw/*705.83*/("""}"""),format.raw/*705.84*/(""""/>
            <input type="hidden" name="bonus" value=""""),format.raw/*706.54*/("""{"""),format.raw/*706.55*/("""{"""),format.raw/*706.56*/("""checkModel.Bonus"""),format.raw/*706.72*/("""}"""),format.raw/*706.73*/("""}"""),format.raw/*706.74*/(""""/>
            <input type="hidden" name="other" value=""""),format.raw/*707.54*/("""{"""),format.raw/*707.55*/("""{"""),format.raw/*707.56*/("""checkModel.Other"""),format.raw/*707.72*/("""}"""),format.raw/*707.73*/("""}"""),format.raw/*707.74*/(""""/>
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
							  		<td width="36%"><input type="text" name="empBusinessName" id = "input_11022" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*736.172*/employeeIncome/*736.186*/.getBusiness1),format.raw/*736.199*/("""" value=""""),_display_(/*736.209*/employeeIncome),format.raw/*736.223*/("""">
      											</td>
							  		<td width="22%"><input type="text" id="datepicker0"  name="empStartMonth" placeholder="mm/dd/yyyy" ng-model="empFirstMonYear"  ng-selected="employe1(this)" style="width: 100%;" class="form-control" >
									     	</td>
							  		<td width="18%"><input type="text" name="empPosition" id="input_11044" placeholder="E.g. Manager" class="form-control" style="width: 100%;" value=""""),_display_(/*740.160*/employeeIncome/*740.174*/.getCurrentPosition1),format.raw/*740.194*/("""">
      										</td>
							  	</tr>
							  	<tr>
							  		<td><div id="input_1101"></div></td>
							  		<td><div id="input_1102"></div></td>
							  		<td><div id="input_1103"></div></td>
							  		<td><div id="input_1104"></div></td>
							  	</tr>
							  	</table>
							<input type="hidden" name="totalMonths" ng-model="employetotal1" value=""""),format.raw/*750.80*/("""{"""),format.raw/*750.81*/("""{"""),format.raw/*750.82*/("""employetotal1"""),format.raw/*750.95*/("""}"""),format.raw/*750.96*/("""}"""),format.raw/*750.97*/("""">
							
					</div>	
					<div ng-show="checkModel.SelfEmployed == true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="selfIncomeTypes" placeholder="E.g. Self-Employed" style="width: 100%;" class="form-control" value="Self Employed" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="selfBusinessName" id="input_11188" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*759.168*/selfEmployeeIncome/*759.186*/.getBusiness21),format.raw/*759.200*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker3" name="selfStartMon" placeholder="mm/dd/yyyy" ng-model="slfempFirstMonYear"  ng-selected="employe2(this)" style="width: 100%;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="selfPosition" id="input_11200" placeholder="E.g. Manager" class="form-control" value=""""),_display_(/*763.137*/selfEmployeeIncome/*763.155*/.getCurrentPosition21),format.raw/*763.176*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_1117""></div></td>
								<td><div id="input_1118"></div></td>
								<td><div id="input_1119"></div></td>
								<td><div id="input_1120"></div></td>
							</tr>
						</table>
						<input type="hidden" name="monthsum1" value=""""),format.raw/*773.52*/("""{"""),format.raw/*773.53*/("""{"""),format.raw/*773.54*/("""slfemployetotal1"""),format.raw/*773.70*/("""}"""),format.raw/*773.71*/("""}"""),format.raw/*773.72*/("""">
					  
						</div>
					<div ng-show="checkModel.Pension==true">
						<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="pensionIcome1" placeholder="E.g. Self-Employed" style="width: 100%;" class="form-control" value="Pension" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="pensionBusiness1" id="input_50022" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*782.168*/pensionIncType/*782.182*/.getBusiness),format.raw/*782.194*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker6" name="pensionMY1" placeholder="mm/dd/yyyy" ng-model="pensionMY1"  ng-selected="employe3(this)" style="width: 100%;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="pensionPosition1" id="input_50044" placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*786.162*/pensionIncType/*786.176*/.getCurrentPosition),format.raw/*786.195*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_5001""></div></td>
								<td><div id="input_5002"></div></td>
								<td><div id="input_5003"></div></td>
								<td><div id="input_5004"></div></td>
							</tr>
						</table>
						<input type="hidden" name="pensionTotal" value=""""),format.raw/*796.55*/("""{"""),format.raw/*796.56*/("""{"""),format.raw/*796.57*/("""pensionTotal"""),format.raw/*796.69*/("""}"""),format.raw/*796.70*/("""}"""),format.raw/*796.71*/("""">
						</div>
						
					<div ng-show="checkModel.Investments==true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="InvestmentsType1" placeholder="E.g. Investments" style="width: 100%;" class="form-control" value="Investments" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="investmentBusiness1" id="input_50066" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*805.171*/investmentIncType/*805.188*/.getBusiness),format.raw/*805.200*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker7"  name="investmentsMY1" placeholder="mm/dd/yyyy" ng-model="investmentsMY1"  ng-selected="investment(this)" style="width: 100%;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="investmentPosition1" id="input_50088" placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*809.165*/investmentIncType/*809.182*/.getCurrentPosition),format.raw/*809.201*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_5005"></div></td>
								<td><div id="input_5006"></div></td>
								<td><div id="input_5007"></div></td>
								<td><div id="input_5008"></div></td>
							</tr>
						</table>
						<input type="hidden" name="investmentTotal" value=""""),format.raw/*819.58*/("""{"""),format.raw/*819.59*/("""{"""),format.raw/*819.60*/("""investmentTotal"""),format.raw/*819.75*/("""}"""),format.raw/*819.76*/("""}"""),format.raw/*819.77*/("""">
					</div>		 								
					
					<div ng-show="checkModel.Maternity==true">
					<br>
					<table>
							<tr>
								<td width="20%"><input type="text" name="maternityType1" placeholder="E.g. Maternity" style="width: 100%;" class="form-control" value="Maternity" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="maternityBusiness1" id="input_60022" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*828.170*/maternityIncType/*828.186*/.getBusiness),format.raw/*828.198*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker8" name="maternityMY1" placeholder="mm/dd/yyyy" ng-model="maternityMY1"  ng-selected="maternity(this)" style="width: 100%;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="maternityPosition1" id="input_60044" placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*832.164*/maternityIncType/*832.180*/.getCurrentPosition),format.raw/*832.199*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_6001"></div></td>
								<td><div id="input_6002"></div></td>
								<td><div id="input_6003"></div></td>
								<td><div id="input_6004"></div></td>
							</tr>
						</table>
					  <input type="hidden" name="maternityTotal"  value=""""),format.raw/*842.59*/("""{"""),format.raw/*842.60*/("""{"""),format.raw/*842.61*/("""maternityTotal"""),format.raw/*842.75*/("""}"""),format.raw/*842.76*/("""}"""),format.raw/*842.77*/("""">
					
					</div>
					
					<div ng-show="checkModel.VehicleAllow==true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="vehicleAllowType1" placeholder="E.g. Maternity" style="width: 100%;" class="form-control" value="Vehicle Allow" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="vehicleAllowBusiness1" id="input_70022" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*852.173*/vehicleIncType/*852.187*/.getBusiness),format.raw/*852.199*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker9" name="vehicleAllowMY1" placeholder="mm/dd/yyyy" ng-model="vehicleAllowMY1"  ng-selected = "vehicleAllow(this)" style="width: 100%;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="vehicleAllowPosition1" id="input_70044" placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*856.167*/vehicleIncType/*856.181*/.getCurrentPosition),format.raw/*856.200*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_7001"></div></td>
								<td><div id="input_7002"></div></td>
								<td><div id="input_7003"></div></td>
								<td><div id="input_7004"></div></td>
							</tr>
						</table>
						<input type="hidden" name="vehicleAllowTotal" ng-model="vehicleAllowTotal" value=""""),format.raw/*866.89*/("""{"""),format.raw/*866.90*/("""{"""),format.raw/*866.91*/("""vehicleAllowTotal"""),format.raw/*866.108*/("""}"""),format.raw/*866.109*/("""}"""),format.raw/*866.110*/("""">
					</div>
					
					<div ng-show="checkModel.LivingAllow==true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="livingAllowType1" placeholder="E.g. LivingAllow" style="width: 100%;" class="form-control" value="Living Allow" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="livingAllowBusiness1" id="input_80022" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*875.172*/livingIncType/*875.185*/.getBusiness),format.raw/*875.197*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker10" name="livingAllowMY1" placeholder="mm/dd/yyyy" ng-model="livingAllowY1"  ng-selected="livingAllow(this)" style="width: 100%;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="livingAllowPosition1" id="input_80044" placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*879.166*/livingIncType/*879.179*/.getCurrentPosition),format.raw/*879.198*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_8001"></div></td>
								<td><div id="input_8002"></div></td>
								<td><div id="input_8003"></div></td>
								<td><div id="input_8004"></div></td>
							</tr>
						</table>
					  <input type="hidden" name="livingAllowTotal" ng-model="livingAllowTotal" value=""""),format.raw/*889.88*/("""{"""),format.raw/*889.89*/("""{"""),format.raw/*889.90*/("""livingAllowTotal"""),format.raw/*889.106*/("""}"""),format.raw/*889.107*/("""}"""),format.raw/*889.108*/("""">
					</div>
					
					<div ng-show="checkModel.Commission==true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="commissionype1" placeholder="E.g. Commision" style="width: 100%;" class="form-control" value="Commission" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="commissionBusiness1" id="input_90022" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*898.171*/commissionIncType/*898.188*/.getBusiness),format.raw/*898.200*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker11" name="commissionMY1" placeholder="mm/dd/yyyy" ng-model="commissionMY1"  ng-selected = "commission(this)" style="width: 100%;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="commissionPosition1" id="input_90044" placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*902.165*/commissionIncType/*902.182*/.getCurrentPosition),format.raw/*902.201*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_9001"></div></td>
								<td><div id="input_9002"></div></td>
								<td><div id="input_9003"></div></td>
								<td><div id="input_9004"></div></td>
							</tr>
						</table>
					 <input type="hidden" name="commissionTotal" ng-model="commissionTotal" value=""""),format.raw/*912.85*/("""{"""),format.raw/*912.86*/("""{"""),format.raw/*912.87*/("""commissionTotal"""),format.raw/*912.102*/("""}"""),format.raw/*912.103*/("""}"""),format.raw/*912.104*/("""">
					</div>
					
					<div ng-show="checkModel.Bonus==true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="bonus1" placeholder="E.g. Bonus" style="width: 100%;" class="form-control" value="Bonus" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="bonusBusiness1" id="input_10022" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*921.166*/bonusIncType/*921.178*/.getBusiness),format.raw/*921.190*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker12" name="bonusMY1" placeholder="mm/dd/yyyy" ng-model="bonusMY1"  ng-selected = "bonusFun(this)" style="width: 100%;" class="form-control">
									     		</td>
								<td width="18%"><input type="text" name="bonusPosition1" id="input_10044" placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*925.160*/bonusIncType/*925.172*/.getCurrentPosition),format.raw/*925.191*/("""">
      											</td>
							</tr>
							<tr>
								<td><div id="input_1000"></div></td>
								<td><div id="input_1002"></div></td>
								<td><div id="input_1003"></div></td>
								<td><div id="input_1004"></div></td>
							</tr>
						</table>
					  <input type="hidden" name="bonusTotal" ng-model="bonusTotal" value=""""),format.raw/*935.76*/("""{"""),format.raw/*935.77*/("""{"""),format.raw/*935.78*/("""bonusTotal"""),format.raw/*935.88*/("""}"""),format.raw/*935.89*/("""}"""),format.raw/*935.90*/("""">
					</div>
					
					<div ng-show="checkModel.Other==true">
					<br>
						<table>
							<tr>
								<td width="20%"><input type="text" name="other1" placeholder="E.g. Other" style="width: 100%;" class="form-control" value="Other" readonly="readonly">
									     		</td>
								<td width="38%"><input type="text" name="otherBusiness1" id="input_110022" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*944.167*/otherIncType/*944.179*/.getBusiness),format.raw/*944.191*/("""">
      											</td>
								<td width="22%"><input type="text" id="datepicker13" name="otherMY1" placeholder="mm/dd/yyyy" ng-model="otherMY1"  ng-selected = "otherFun(this)" style="width: 100%;" class="form-control">
									     	</td>
								<td width="18%"><input type="text" name="otherPosition1" id="input_110044" placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*948.161*/otherIncType/*948.173*/.getCurrentPosition),format.raw/*948.192*/("""">
      										</td>
							</tr>
							<tr>
								<td><div id="input_11001"></div></td>
								<td><div id="input_11002"></div></td>
								<td><div id="input_11003"></div></td>
								<td><div id="input_11004"></div></td>
							</tr>
						</table>
						 <input type="hidden" name="otherTotal" ng-model="otherTotal" value=""""),format.raw/*958.76*/("""{"""),format.raw/*958.77*/("""{"""),format.raw/*958.78*/("""otherTotal"""),format.raw/*958.88*/("""}"""),format.raw/*958.89*/("""}"""),format.raw/*958.90*/("""">
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
							  		<td width="38%"><input type="text" name="empBusinessName2" id="input_11066" 
												placeholder="E.g. Business Name" style="width: 100%;"
												class="form-control" value=""""),_display_(/*974.42*/employeeIncome/*974.56*/.getBusiness11),format.raw/*974.70*/("""">
												</td>
							  		<td width="22%"><input type="text" name="empStartMonth2"
												placeholder="mm/dd/yyyy" id="datepicker1" ng-model="empSecMonYear"
												ng-selected="employe1(this)" style="width: 100%;"
												class="form-control">
												</td>
							  		<td width="18%"><input type="text" name="empPosition2" id="input_11088"
												placeholder="E.g. Manager" style="width: 100%;"
												class="form-control" value=""""),_display_(/*983.42*/employeeIncome/*983.56*/.getPosition11),format.raw/*983.70*/("""">
											    </td>
							  	</tr>
							  	<tr>
							  		<td><div id="input_1105"></div></td>
							  		<td><div id="input_1106"></div></td>
							  		<td><div id="input_1107"></div></td>
							  		<td><div id="input_1108"></div></td>
							  	</tr>
							  </table>
							  <input type="hidden" name="monthsum11" ng-model="employetotal2" value=""""),format.raw/*993.81*/("""{"""),format.raw/*993.82*/("""{"""),format.raw/*993.83*/("""employetotal2-employetotal1"""),format.raw/*993.110*/("""}"""),format.raw/*993.111*/("""}"""),format.raw/*993.112*/("""">	
							  <input type="hidden" name="totalMonths2" ng-model="employetotal2" value=""""),format.raw/*994.83*/("""{"""),format.raw/*994.84*/("""{"""),format.raw/*994.85*/("""employetotal2"""),format.raw/*994.98*/("""}"""),format.raw/*994.99*/("""}"""),format.raw/*994.100*/("""">
									<div ng-show="employetotal2< 36">
										<br>
										<table>
											<tr>
												<td width="20%"><input type="text" name="empIncomeTypes3"
												placeholder="E.g. Employer" style="width: 100%;"
												class="form-control" value="Employed" readonly="readonly">
											</td>
												<td width="38%"><input type="text" name="empBusinessName3" id="input_11100"
												placeholder="E.g. Business Name" style="width: 100%;"
												class="form-control" value=""""),_display_(/*1005.42*/employeeIncome/*1005.56*/.getBusiness21),format.raw/*1005.70*/("""">
												</td>
												<td width="22%"><input type="text" name="empStartMonth3" id="datepicker2"
												placeholder="mm/dd/yyyy" ng-model="empThirdMonYear"
												ng-selected="employe1(this)" style="width: 100%;"
												class="form-control">
											</td>
												<td width="18%"><input type="text" name="empPosition3" id="input_11122"
												placeholder="E.g. Manager" style="width: 100%;"
												class="form-control" value=""""),_display_(/*1014.42*/employeeIncome/*1014.56*/.getPosition21),format.raw/*1014.70*/("""">
												</td>
											</tr>
											<tr>
												<td><div id="input_1109""></div></td>
												<td><div id="input_1110"></div></td>
												<td><div id="input_1111"></div></td>
												<td><div id="input_1112"></div></td>
											</tr>
										</table>
										<input type="hidden" name="monthsum33" ng-model="employetotal2" value=""""),format.raw/*1024.82*/("""{"""),format.raw/*1024.83*/("""{"""),format.raw/*1024.84*/("""employetotal3-employetotal2"""),format.raw/*1024.111*/("""}"""),format.raw/*1024.112*/("""}"""),format.raw/*1024.113*/("""">
										<input type="hidden" name="totalMonths3" ng-model="employetotal3" value=""""),format.raw/*1025.84*/("""{"""),format.raw/*1025.85*/("""{"""),format.raw/*1025.86*/("""employetotal3"""),format.raw/*1025.99*/("""}"""),format.raw/*1025.100*/("""}"""),format.raw/*1025.101*/("""">
					</div>
					</div>
					
					<div ng-show="slfemployetotal1<36 && checkModel.SelfEmployed == true">
					  		<h4 style="padding-left: 0%;"><Strong>Work History</Strong></h4>
							<hr style="width: 96%; border-color: #006699; margin-top: 0%; margin-bottom: 0%;" />
							<label class="labelfont">Lenders require at least 3 years of work history. Where did you work previously?</label>
					  		<table>
					  			<tr>
					  				<td width="20%"><input type="text" name="selfIncomeTypes2" placeholder="E.g. Self-Employed" style="width: 100%;" class="form-control" value="Self Employed" readonly="readonly">
									     			</td>
					  				<td width="38%"><input type="text" name="selfBusinessName2" id="input_11222" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*1037.172*/selfEmployeeIncome/*1037.190*/.getBusiness22),format.raw/*1037.204*/("""">
      												</td>
					  				<td width="22%"><input type="text" id="datepicker4" name="selfStartMon2" placeholder="mm/dd/yyyy" ng-model="slfsecMonYears" ng-selected="employe2(this)" style="width: 100%;" class="form-control">
									     			</td>
					  				<td width="18%"><input type="text" name="selfPosition2" id="input_11244" placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*1041.162*/selfEmployeeIncome/*1041.180*/.getPosition22),format.raw/*1041.194*/("""">
      										</td>
					  			</tr>
					  			<tr>
					  				<td><div id="input_1121"></div></td>
					  				<td><div id="input_1122"></div></td>
					  				<td><div id="input_1123"></div></td>
					  				<td><div id="input_1124"></div></td>
					  			</tr>
					  		</table>
					  		<input type="hidden" name="selfemployemonthssum2" value=""""),format.raw/*1051.67*/("""{"""),format.raw/*1051.68*/("""{"""),format.raw/*1051.69*/("""slfemployetotal2-slfemployetotal1"""),format.raw/*1051.102*/("""}"""),format.raw/*1051.103*/("""}"""),format.raw/*1051.104*/("""">
					  		<input type="hidden" name="selfemployemonthsumTotal2" value=""""),format.raw/*1052.71*/("""{"""),format.raw/*1052.72*/("""{"""),format.raw/*1052.73*/("""slfemployetotal2"""),format.raw/*1052.89*/("""}"""),format.raw/*1052.90*/("""}"""),format.raw/*1052.91*/("""">
							<div ng-show="slfemployetotal2 < 36">
								<br>
								<table>
									<tr>
										<td width="20%"><input type="text" name="selfIncomeTypes3" placeholder="E.g. Self-Employed" style="width: 100%;" class="form-control" value="Self Employed" readonly="readonly">
									     				</td>
										<td width="38%"><input type="text" name="selfBusinessName3" id="input_11266" placeholder="E.g. Business Name" style="width: 100%;" class="form-control" value=""""),_display_(/*1059.171*/selfEmployeeIncome/*1059.189*/.getBusiness23),format.raw/*1059.203*/("""">
      													</td>
										<td width="22%"><input type="text" id="datepicker5" name="selfStartMon3" placeholder="mm/dd/yyyy" ng-model="slfthirdMonYear" ng-selected="employe2(this)" style="width: 100%;" class="form-control">
									     				</td>
										<td width="18%"><input type="text" name="selfPosition3" id="input_11288" placeholder="E.g. Manager" style="width: 100%;" class="form-control" value=""""),_display_(/*1063.161*/selfEmployeeIncome/*1063.179*/.getPosition23),format.raw/*1063.193*/("""">
      													</td>
									</tr>
									<tr>
									<td><div id="input_1125"></div></td>
									<td><div id="input_1126"></div></td>
									<td><div id="input_1127"></div></td>
									<td><div id="input_1128"></div></td>
								</tr>
								</table>
								<input type="hidden" name="selfemployemonthssum3" value=""""),format.raw/*1073.66*/("""{"""),format.raw/*1073.67*/("""{"""),format.raw/*1073.68*/("""slfemployetotal3-slfemployetotal2"""),format.raw/*1073.101*/("""}"""),format.raw/*1073.102*/("""}"""),format.raw/*1073.103*/("""">
					  			<input type="hidden" name="selfemployemonthsumTotal3" value=""""),format.raw/*1074.72*/("""{"""),format.raw/*1074.73*/("""{"""),format.raw/*1074.74*/("""slfemployetotal3"""),format.raw/*1074.90*/("""}"""),format.raw/*1074.91*/("""}"""),format.raw/*1074.92*/("""">
							</div>
						</div>
					
			      <br>
			      <div class="row" style="width: 100%;">
								<div class="col-sm-6"
									style="float: left; padding-left: 2%; width: 50%;">
									<a href="mortgageBackPage8" class="btn btn-primary"
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
						  <script src=""""),_display_(/*1095.23*/routes/*1095.29*/.Assets.at("_resources/jquery-ui.js")),format.raw/*1095.66*/("""" type="text/javascript"></script>
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
    $(function() """),format.raw/*1119.18*/("""{"""),format.raw/*1119.19*/("""
        """),format.raw/*1120.9*/("""$.mask.definitions['~'] = "[+-]";

        $("#phonedatata").mask("999-999-9999");
    """),format.raw/*1123.5*/("""}"""),format.raw/*1123.6*/(""");
	
</script>

 <script>
$(document).ready(function()"""),format.raw/*1128.29*/("""{"""),format.raw/*1128.30*/("""
    """),format.raw/*1129.5*/("""$('[data-toggle="tooltip"]').tooltip();   
"""),format.raw/*1130.1*/("""}"""),format.raw/*1130.2*/(""");
</script>

<script src="https://maps.googleapis.com/maps/api/Are you Self-Employed?js?sensor=false&amp;libraries=places"></script>
 
    <script src="jquery.geocomplete.js"></script>
    
   <script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);
    app.controller('DemoController', function ($scope) """),format.raw/*1139.56*/("""{"""),format.raw/*1139.57*/("""
        """),format.raw/*1140.9*/("""init();
        function init() """),format.raw/*1141.25*/("""{"""),format.raw/*1141.26*/("""
            """),format.raw/*1142.13*/("""$scope.newItemType = '';
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
            
            
            $scope.change = function () """),format.raw/*1170.41*/("""{"""),format.raw/*1170.42*/("""
                """),format.raw/*1171.17*/("""console.log($scope.newItemType)
            """),format.raw/*1172.13*/("""}"""),format.raw/*1172.14*/(""";
        """),format.raw/*1173.9*/("""}"""),format.raw/*1173.10*/("""
        
        """),format.raw/*1175.9*/("""$scope.employe1 = function ($scope) """),format.raw/*1175.45*/("""{"""),format.raw/*1175.46*/("""
        	
        	"""),format.raw/*1177.10*/("""$( "#datepicker0" ).datepicker("""),format.raw/*1177.41*/("""{"""),format.raw/*1177.42*/("""
                """),format.raw/*1178.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*1180.43*/("""{"""),format.raw/*1180.44*/("""
                    """),format.raw/*1181.21*/("""$scope.empFirstMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*1183.52*/("""{"""),format.raw/*1183.53*/("""
                         """),format.raw/*1184.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*1186.22*/("""}"""),format.raw/*1186.23*/(""");
                     
                """),format.raw/*1188.17*/("""}"""),format.raw/*1188.18*/("""
               
              """),format.raw/*1190.15*/("""}"""),format.raw/*1190.16*/(""");
        
        	$( "#datepicker1" ).datepicker("""),format.raw/*1192.41*/("""{"""),format.raw/*1192.42*/("""
                """),format.raw/*1193.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*1195.43*/("""{"""),format.raw/*1195.44*/("""
                    """),format.raw/*1196.21*/("""$scope.empSecMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*1198.52*/("""{"""),format.raw/*1198.53*/("""
                         """),format.raw/*1199.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*1201.22*/("""}"""),format.raw/*1201.23*/(""");
                     
                """),format.raw/*1203.17*/("""}"""),format.raw/*1203.18*/("""
               
              """),format.raw/*1205.15*/("""}"""),format.raw/*1205.16*/(""");	
        	   
        	$( "#datepicker2" ).datepicker("""),format.raw/*1207.41*/("""{"""),format.raw/*1207.42*/("""
                """),format.raw/*1208.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*1210.43*/("""{"""),format.raw/*1210.44*/("""
                    """),format.raw/*1211.21*/("""$scope.empThirdMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*1213.52*/("""{"""),format.raw/*1213.53*/("""
                         """),format.raw/*1214.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*1216.22*/("""}"""),format.raw/*1216.23*/(""");
                     
                """),format.raw/*1218.17*/("""}"""),format.raw/*1218.18*/("""
               
              """),format.raw/*1220.15*/("""}"""),format.raw/*1220.16*/(""");
        	
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
           if(total <36)"""),format.raw/*1241.25*/("""{"""),format.raw/*1241.26*/("""
                """),format.raw/*1242.17*/("""one= $scope.empSecMonYear;
                date =one.split("/");
                oneDate=date[0]+"/1/"+date[2];
        	   datevDate=new Date(oneDate);
        	   
  			      	   
       		 one_day=1000*60*60*24;
       		 date1ms=date2ms;
       		 date2ms=datevDate.getTime();
       		
       		 totmili=date1ms-date2ms;
       		 
       			 if(isNaN(totmili) == false)"""),format.raw/*1254.39*/("""{"""),format.raw/*1254.40*/("""
       		 """),format.raw/*1255.11*/("""totalDays=Math.round(totmili/one_day);

       		 totalMonths=Math.abs((totmili/one_day)/30);




     		total=total+Math.floor(totalMonths); 

     		$scope.employetotal2 = total;
     		
     		 if(total<36)"""),format.raw/*1266.21*/("""{"""),format.raw/*1266.22*/("""
				    			 
     			  """),format.raw/*1268.11*/("""one= $scope.empThirdMonYear;
                  date =one.split("/");
                  oneDate=date[0]+"/1/"+date[2];
          	   datevDate=new Date(oneDate);
            		
           		 one_day=1000*60*60*24;
           		 date1ms=date2ms;
           		 date2ms=datevDate.getTime();
           		
           		 totmili=date1ms-date2ms;
           		if(isNaN(totmili) == false)"""),format.raw/*1278.41*/("""{"""),format.raw/*1278.42*/("""

           		 """),format.raw/*1280.15*/("""totalDays=Math.round(totmili/one_day);
           		 totalMonths=Math.abs((totmili/one_day)/30);
          		total=Math.floor(total)+Math.floor(totalMonths); 
					
         		$scope.employetotal3 = total;
         		 
           		"""),format.raw/*1286.14*/("""}"""),format.raw/*1286.15*/("""
             """),format.raw/*1287.14*/("""}"""),format.raw/*1287.15*/("""
        	 """),format.raw/*1288.11*/("""}"""),format.raw/*1288.12*/("""
           """),format.raw/*1289.12*/("""}"""),format.raw/*1289.13*/("""
        """),format.raw/*1290.9*/("""}"""),format.raw/*1290.10*/(""";
        $scope.employe2 = function ($scope) """),format.raw/*1291.45*/("""{"""),format.raw/*1291.46*/("""
        	
        	
        	"""),format.raw/*1294.10*/("""$( "#datepicker3" ).datepicker("""),format.raw/*1294.41*/("""{"""),format.raw/*1294.42*/("""
                """),format.raw/*1295.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*1297.43*/("""{"""),format.raw/*1297.44*/("""
                    """),format.raw/*1298.21*/("""$scope.slfempFirstMonYear = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*1300.52*/("""{"""),format.raw/*1300.53*/("""
                         """),format.raw/*1301.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*1303.22*/("""}"""),format.raw/*1303.23*/(""");
                     
                """),format.raw/*1305.17*/("""}"""),format.raw/*1305.18*/("""
               
              """),format.raw/*1307.15*/("""}"""),format.raw/*1307.16*/(""");
        	
        	$( "#datepicker4" ).datepicker("""),format.raw/*1309.41*/("""{"""),format.raw/*1309.42*/("""
                """),format.raw/*1310.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*1312.43*/("""{"""),format.raw/*1312.44*/("""
                    """),format.raw/*1313.21*/("""$scope.slfsecMonYears = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*1315.52*/("""{"""),format.raw/*1315.53*/("""
                         """),format.raw/*1316.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*1318.22*/("""}"""),format.raw/*1318.23*/(""");
                     
                """),format.raw/*1320.17*/("""}"""),format.raw/*1320.18*/("""
               
              """),format.raw/*1322.15*/("""}"""),format.raw/*1322.16*/(""");
        	
        	$( "#datepicker5" ).datepicker("""),format.raw/*1324.41*/("""{"""),format.raw/*1324.42*/("""
                """),format.raw/*1325.17*/("""changeMonth: true,
                changeYear: true,
                onSelect: function (date) """),format.raw/*1327.43*/("""{"""),format.raw/*1327.44*/("""
                    """),format.raw/*1328.21*/("""$scope.slfsecMonYears = date;
               
                     $scope.$apply(function($scope)"""),format.raw/*1330.52*/("""{"""),format.raw/*1330.53*/("""
                         """),format.raw/*1331.26*/("""// Change binded variable
                         $scope.assign($scope, date);
                     """),format.raw/*1333.22*/("""}"""),format.raw/*1333.23*/(""");
                     
                """),format.raw/*1335.17*/("""}"""),format.raw/*1335.18*/("""
               
              """),format.raw/*1337.15*/("""}"""),format.raw/*1337.16*/(""");
        	
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
               if(total <36)"""),format.raw/*1358.29*/("""{"""),format.raw/*1358.30*/("""
                    """),format.raw/*1359.21*/("""one= $scope.slfsecMonYears;
                    date =one.split("/");
                    oneDate=date[0]+"/1/"+date[2];
            	   datevDate=new Date(oneDate);
            	   
      			      	   
           		 one_day=1000*60*60*24;
           		 date1ms=date2ms;
           		
           		 date2ms=datevDate.getTime();
         		

           		
           		 totmili=date1ms-date2ms;
           		 
           			 if(isNaN(totmili) == false)"""),format.raw/*1374.43*/("""{"""),format.raw/*1374.44*/("""
           		 """),format.raw/*1375.15*/("""totalDays=Math.round(totmili/one_day);

           		 totalMonths=Math.abs((totmili/one_day)/30);

         		total=total+Math.floor(totalMonths); 

         		$scope.slfemployetotal2 = total;
         		
         		
         		
         		 if(total<36)"""),format.raw/*1385.25*/("""{"""),format.raw/*1385.26*/("""
         		
         			  """),format.raw/*1387.15*/("""one= $scope.slfthirdMonYear;
                      date =one.split("/");
                      oneDate=date[0]+"/1/"+date[2];
              	   	  datevDate=new Date(oneDate);
                		
               		 one_day=1000*60*60*24;
               		 date1ms=date2ms;
               		 date2ms=datevDate.getTime();
               		
               		 totmili=date1ms-date2ms;
               		if(isNaN(totmili) == false)"""),format.raw/*1397.45*/("""{"""),format.raw/*1397.46*/("""

               		 """),format.raw/*1399.19*/("""totalDays=Math.round(totmili/one_day);
               		 totalMonths=Math.abs((totmili/one_day)/30);
              		total=Math.floor(total)+Math.floor(totalMonths); 

             		$scope.slfemployetotal3 = total;
               	  """),format.raw/*1404.19*/("""}"""),format.raw/*1404.20*/("""
                 """),format.raw/*1405.18*/("""}"""),format.raw/*1405.19*/("""
               """),format.raw/*1406.16*/("""}"""),format.raw/*1406.17*/("""
              """),format.raw/*1407.15*/("""}"""),format.raw/*1407.16*/("""
            """),format.raw/*1408.13*/("""}"""),format.raw/*1408.14*/(""";
            $scope.employe3 = function ($scope) """),format.raw/*1409.49*/("""{"""),format.raw/*1409.50*/("""
            	
            	"""),format.raw/*1411.14*/("""$( "#datepicker6" ).datepicker("""),format.raw/*1411.45*/("""{"""),format.raw/*1411.46*/("""
                    """),format.raw/*1412.21*/("""changeMonth: true,
                    changeYear: true,
                    onSelect: function (date) """),format.raw/*1414.47*/("""{"""),format.raw/*1414.48*/("""
                        """),format.raw/*1415.25*/("""$scope.pensionMY1 = date;
                   
                         $scope.$apply(function($scope)"""),format.raw/*1417.56*/("""{"""),format.raw/*1417.57*/("""
                             """),format.raw/*1418.30*/("""// Change binded variable
                             $scope.assign($scope, date);
                         """),format.raw/*1420.26*/("""}"""),format.raw/*1420.27*/(""");
                         
                    """),format.raw/*1422.21*/("""}"""),format.raw/*1422.22*/("""
                   
                  """),format.raw/*1424.19*/("""}"""),format.raw/*1424.20*/(""");
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
            """),format.raw/*1445.13*/("""}"""),format.raw/*1445.14*/("""
            """),format.raw/*1446.13*/("""$scope.investment = function ($scope) """),format.raw/*1446.51*/("""{"""),format.raw/*1446.52*/("""
				
            	"""),format.raw/*1448.14*/("""$( "#datepicker7" ).datepicker("""),format.raw/*1448.45*/("""{"""),format.raw/*1448.46*/("""
                    """),format.raw/*1449.21*/("""changeMonth: true,
                    changeYear: true,
                    onSelect: function (date) """),format.raw/*1451.47*/("""{"""),format.raw/*1451.48*/("""
                        """),format.raw/*1452.25*/("""$scope.investmentsMY1 = date;
                   
                         $scope.$apply(function($scope)"""),format.raw/*1454.56*/("""{"""),format.raw/*1454.57*/("""
                             """),format.raw/*1455.30*/("""// Change binded variable
                             $scope.assign($scope, date);
                         """),format.raw/*1457.26*/("""}"""),format.raw/*1457.27*/(""");
                         
                    """),format.raw/*1459.21*/("""}"""),format.raw/*1459.22*/("""
                   
                  """),format.raw/*1461.19*/("""}"""),format.raw/*1461.20*/(""");
            	
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
            """),format.raw/*1478.13*/("""}"""),format.raw/*1478.14*/("""
            
            """),format.raw/*1480.13*/("""$scope.maternity = function ($scope) """),format.raw/*1480.50*/("""{"""),format.raw/*1480.51*/("""
            	
            	"""),format.raw/*1482.14*/("""$( "#datepicker8" ).datepicker("""),format.raw/*1482.45*/("""{"""),format.raw/*1482.46*/("""
                    """),format.raw/*1483.21*/("""changeMonth: true,
                    changeYear: true,
                    onSelect: function (date) """),format.raw/*1485.47*/("""{"""),format.raw/*1485.48*/("""
                        """),format.raw/*1486.25*/("""$scope.investmentsMY1 = date;
                   
                         $scope.$apply(function($scope)"""),format.raw/*1488.56*/("""{"""),format.raw/*1488.57*/("""
                             """),format.raw/*1489.30*/("""// Change binded variable
                             $scope.assign($scope, date);
                         """),format.raw/*1491.26*/("""}"""),format.raw/*1491.27*/(""");
                         
                    """),format.raw/*1493.21*/("""}"""),format.raw/*1493.22*/("""
                   
                  """),format.raw/*1495.19*/("""}"""),format.raw/*1495.20*/(""");
            	
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
            """),format.raw/*1516.13*/("""}"""),format.raw/*1516.14*/("""
            
		 		"""),format.raw/*1518.6*/("""$scope.vehicleAllow = function ($scope) """),format.raw/*1518.46*/("""{"""),format.raw/*1518.47*/("""
				
		 			"""),format.raw/*1520.7*/("""$( "#datepicker9" ).datepicker("""),format.raw/*1520.38*/("""{"""),format.raw/*1520.39*/("""
	                    """),format.raw/*1521.22*/("""changeMonth: true,
	                    changeYear: true,
	                    onSelect: function (date) """),format.raw/*1523.48*/("""{"""),format.raw/*1523.49*/("""
	                        """),format.raw/*1524.26*/("""$scope.investmentsMY1 = date;
	                   
	                         $scope.$apply(function($scope)"""),format.raw/*1526.57*/("""{"""),format.raw/*1526.58*/("""
	                             """),format.raw/*1527.31*/("""// Change binded variable
	                             $scope.assign($scope, date);
	                         """),format.raw/*1529.27*/("""}"""),format.raw/*1529.28*/(""");
	                         
	                    """),format.raw/*1531.22*/("""}"""),format.raw/*1531.23*/("""
	                   
	                  """),format.raw/*1533.20*/("""}"""),format.raw/*1533.21*/(""");
		 			
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

            """),format.raw/*1555.13*/("""}"""),format.raw/*1555.14*/("""
		 		
		 		
		 		"""),format.raw/*1558.6*/("""$scope.livingAllow = function ($scope) """),format.raw/*1558.45*/("""{"""),format.raw/*1558.46*/("""

		 			"""),format.raw/*1560.7*/("""$( "#datepicker10" ).datepicker("""),format.raw/*1560.39*/("""{"""),format.raw/*1560.40*/("""
	                    """),format.raw/*1561.22*/("""changeMonth: true,
	                    changeYear: true,
	                    onSelect: function (date) """),format.raw/*1563.48*/("""{"""),format.raw/*1563.49*/("""
	                        """),format.raw/*1564.26*/("""$scope.investmentsMY1 = date;
	                   
	                         $scope.$apply(function($scope)"""),format.raw/*1566.57*/("""{"""),format.raw/*1566.58*/("""
	                             """),format.raw/*1567.31*/("""// Change binded variable
	                             $scope.assign($scope, date);
	                         """),format.raw/*1569.27*/("""}"""),format.raw/*1569.28*/(""");
	                         
	                    """),format.raw/*1571.22*/("""}"""),format.raw/*1571.23*/("""
	                   
	                  """),format.raw/*1573.20*/("""}"""),format.raw/*1573.21*/(""");
		 			
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

	            """),format.raw/*1595.14*/("""}"""),format.raw/*1595.15*/("""
		 		
				"""),format.raw/*1597.5*/("""$scope.commission = function ($scope) """),format.raw/*1597.43*/("""{"""),format.raw/*1597.44*/("""

					"""),format.raw/*1599.6*/("""$( "#datepicker11" ).datepicker("""),format.raw/*1599.38*/("""{"""),format.raw/*1599.39*/("""
	                    """),format.raw/*1600.22*/("""changeMonth: true,
	                    changeYear: true,
	                    onSelect: function (date) """),format.raw/*1602.48*/("""{"""),format.raw/*1602.49*/("""
	                        """),format.raw/*1603.26*/("""$scope.investmentsMY1 = date;
	                   
	                         $scope.$apply(function($scope)"""),format.raw/*1605.57*/("""{"""),format.raw/*1605.58*/("""
	                             """),format.raw/*1606.31*/("""// Change binded variable
	                             $scope.assign($scope, date);
	                         """),format.raw/*1608.27*/("""}"""),format.raw/*1608.28*/(""");
	                         
	                    """),format.raw/*1610.22*/("""}"""),format.raw/*1610.23*/("""
	                   
	                  """),format.raw/*1612.20*/("""}"""),format.raw/*1612.21*/(""");
					
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

	            """),format.raw/*1635.14*/("""}"""),format.raw/*1635.15*/("""
					"""),format.raw/*1636.6*/("""$scope.bonusFun = function ($scope) """),format.raw/*1636.42*/("""{"""),format.raw/*1636.43*/("""
						
						"""),format.raw/*1638.7*/("""$( "#datepicker12" ).datepicker("""),format.raw/*1638.39*/("""{"""),format.raw/*1638.40*/("""
							
		                    """),format.raw/*1640.23*/("""changeMonth: true,
		                    changeYear: true,
		                    onSelect: function (date) """),format.raw/*1642.49*/("""{"""),format.raw/*1642.50*/("""
		                        """),format.raw/*1643.27*/("""$scope.investmentsMY1 = date;
		                   
		                         $scope.$apply(function($scope)"""),format.raw/*1645.58*/("""{"""),format.raw/*1645.59*/("""
		                             """),format.raw/*1646.32*/("""// Change binded variable
		                             $scope.assign($scope, date);
		                         """),format.raw/*1648.28*/("""}"""),format.raw/*1648.29*/(""");
		                         
		                    """),format.raw/*1650.23*/("""}"""),format.raw/*1650.24*/("""
		                   
		                  """),format.raw/*1652.21*/("""}"""),format.raw/*1652.22*/(""");
						
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

	            """),format.raw/*1674.14*/("""}"""),format.raw/*1674.15*/("""	
					"""),format.raw/*1675.6*/("""$scope.otherFun = function ($scope) """),format.raw/*1675.42*/("""{"""),format.raw/*1675.43*/("""

						"""),format.raw/*1677.7*/("""$( "#datepicker13" ).datepicker("""),format.raw/*1677.39*/("""{"""),format.raw/*1677.40*/("""
		                    """),format.raw/*1678.23*/("""changeMonth: true,
		                    changeYear: true,
		                    onSelect: function (date) """),format.raw/*1680.49*/("""{"""),format.raw/*1680.50*/("""
		                        """),format.raw/*1681.27*/("""$scope.investmentsMY1 = date;
		                   
		                         $scope.$apply(function($scope)"""),format.raw/*1683.58*/("""{"""),format.raw/*1683.59*/("""
		                             """),format.raw/*1684.32*/("""// Change binded variable
		                             $scope.assign($scope, date);
		                         """),format.raw/*1686.28*/("""}"""),format.raw/*1686.29*/(""");
		                         
		                    """),format.raw/*1688.23*/("""}"""),format.raw/*1688.24*/("""
		                   
		                  """),format.raw/*1690.21*/("""}"""),format.raw/*1690.22*/(""");
						
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
		            """),format.raw/*1712.15*/("""}"""),format.raw/*1712.16*/("""
					
					"""),format.raw/*1714.6*/("""$scope.singleModel = 1;
					
					  $scope.checkModel = """),format.raw/*1716.28*/("""{"""),format.raw/*1716.29*/("""
						"""),format.raw/*1717.7*/("""Employee: false,
					    SelfEmployed: false,
					    Pension: false,
					    Investments:false,
					    Maternity:false,
					    VehicleAllow:false,
					    LivingAllow:false,
					    Commission:false,
					    Bonus:false,
					    Other:false
					  """),format.raw/*1727.8*/("""}"""),format.raw/*1727.9*/(""";
						
					  $scope.checkResults = [];

					  $scope.$watchCollection('checkModel', function () """),format.raw/*1731.58*/("""{"""),format.raw/*1731.59*/("""
					    """),format.raw/*1732.10*/("""$scope.checkResults = [];
					    angular.forEach($scope.checkModel, function (value, key) """),format.raw/*1733.67*/("""{"""),format.raw/*1733.68*/("""
					      """),format.raw/*1734.12*/("""if (value) """),format.raw/*1734.23*/("""{"""),format.raw/*1734.24*/("""
					        """),format.raw/*1735.14*/("""$scope.checkResults.push(key);
					      """),format.raw/*1736.12*/("""}"""),format.raw/*1736.13*/("""
					    """),format.raw/*1737.10*/("""}"""),format.raw/*1737.11*/(""");
					  """),format.raw/*1738.8*/("""}"""),format.raw/*1738.9*/(""");			
    """),format.raw/*1739.5*/("""}"""),format.raw/*1739.6*/(""");
   
    </script>
</body>
</html>
"""))}
  }

  def render(additionalApplicant:String,employeeIncome:EmployeIncomeTypeParam,selfEmployeeIncome:SelfEmployeIncomeTypeParam,pensionIncType:PensionIncomeTypeParam,investmentIncType:InvestmentsIncomeTypeParam,maternityIncType:MaternityIncomeTypeParam,vehicleIncType:VehicleAllowIncomeTypeParam,livingIncType:LivingAllowIncomeTypeParam,commissionIncType:CommissionIncomeTypeParam,bonusIncType:BonusIncomeTypeParam,otherIncType:OtherIncomeTypeParam,coApplicantName:String): play.twirl.api.HtmlFormat.Appendable = apply(additionalApplicant,employeeIncome,selfEmployeeIncome,pensionIncType,investmentIncType,maternityIncType,vehicleIncType,livingIncType,commissionIncType,bonusIncType,otherIncType,coApplicantName)

  def f:((String,EmployeIncomeTypeParam,SelfEmployeIncomeTypeParam,PensionIncomeTypeParam,InvestmentsIncomeTypeParam,MaternityIncomeTypeParam,VehicleAllowIncomeTypeParam,LivingAllowIncomeTypeParam,CommissionIncomeTypeParam,BonusIncomeTypeParam,OtherIncomeTypeParam,String) => play.twirl.api.HtmlFormat.Appendable) = (additionalApplicant,employeeIncome,selfEmployeeIncome,pensionIncType,investmentIncType,maternityIncType,vehicleIncType,livingIncType,commissionIncType,bonusIncType,otherIncType,coApplicantName) => apply(additionalApplicant,employeeIncome,selfEmployeeIncome,pensionIncType,investmentIncType,maternityIncType,vehicleIncType,livingIncType,commissionIncType,bonusIncType,otherIncType,coApplicantName)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:18 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage9.scala.html
                  HASH: 13b3da2b43aa3edeaee194292259dd202e634977
                  MATRIX: 987->1|1539->464|1566->465|2176->1048|2191->1054|2254->1096|2297->1112|2312->1118|2374->1159|2459->1217|2474->1223|2534->1262|2610->1311|2625->1317|2680->1351|2756->1400|2771->1406|2829->1443|2894->1481|2909->1487|2966->1523|3222->1752|3237->1758|3302->1802|3355->1828|3370->1834|3437->1880|3751->2166|3780->2167|3821->2180|3880->2212|3909->2213|3978->2254|4007->2255|4048->2268|4105->2297|4134->2298|4179->2315|4249->2357|4278->2358|4316->2369|4345->2370|4453->2450|4482->2451|4515->2457|4563->2478|4591->2479|4650->2510|4679->2511|4718->2523|6993->4771|7021->4772|7053->4777|7148->4844|7177->4845|7208->4849|8143->5754|8174->5755|8215->5767|8377->5901|8406->5902|8438->5906|8468->5907|8500->5911|8582->5965|8611->5966|8647->5974|8698->5996|8728->5997|8761->6002|8887->6099|8917->6100|8952->6107|9171->6298|9200->6299|9233->6303|9263->6304|9296->6309|9380->6365|9409->6366|9447->6376|9567->6467|9597->6468|9632->6475|9851->6666|9880->6667|9913->6671|9943->6672|9976->6677|10060->6733|10089->6734|10127->6744|10241->6829|10271->6830|10306->6837|10525->7028|10554->7029|10587->7033|10617->7034|10650->7039|10734->7095|10763->7096|10804->7109|10833->7110|10866->7115|10923->7143|10953->7144|10986->7149|11117->7251|11147->7252|11181->7258|11394->7443|11423->7444|11452->7445|11486->7450|11516->7451|11550->7457|11636->7515|11665->7516|11698->7521|11817->7611|11847->7612|11881->7618|12094->7803|12123->7804|12152->7805|12186->7810|12216->7811|12250->7817|12336->7875|12365->7876|12398->7881|12517->7971|12547->7972|12581->7978|12794->8163|12823->8164|12852->8165|12886->8170|12916->8171|12950->8177|13036->8235|13065->8236|13097->8240|13126->8241|13160->8247|13212->8270|13242->8271|13274->8275|13404->8376|13434->8377|13467->8382|13677->8564|13706->8565|13735->8566|13769->8571|13799->8572|13832->8577|13917->8634|13946->8635|13979->8640|14091->8723|14121->8724|14154->8729|14364->8911|14393->8912|14422->8913|14456->8918|14486->8919|14519->8924|14604->8981|14633->8982|14666->8987|14796->9088|14826->9089|14859->9094|15069->9276|15098->9277|15127->9278|15161->9283|15191->9284|15224->9289|15309->9346|15338->9347|15369->9350|15398->9351|15430->9355|15486->9382|15516->9383|15548->9387|15687->9497|15717->9498|15750->9503|15960->9685|15989->9686|16018->9687|16052->9692|16082->9693|16115->9698|16200->9755|16229->9756|16262->9761|16386->9856|16416->9857|16449->9862|16659->10044|16688->10045|16717->10046|16751->10051|16781->10052|16814->10057|16899->10114|16928->10115|16961->10120|17100->10230|17130->10231|17163->10236|17373->10418|17402->10419|17431->10420|17465->10425|17495->10426|17528->10431|17613->10488|17642->10489|17673->10492|17702->10493|17734->10497|17788->10522|17818->10523|17850->10527|17986->10634|18016->10635|18049->10640|18259->10822|18288->10823|18317->10824|18351->10829|18381->10830|18414->10835|18499->10892|18528->10893|18561->10898|18679->10987|18709->10988|18742->10993|18952->11175|18981->11176|19010->11177|19044->11182|19074->11183|19107->11188|19192->11245|19221->11246|19254->11251|19390->11358|19420->11359|19453->11364|19663->11546|19692->11547|19721->11548|19755->11553|19785->11554|19818->11559|19903->11616|19932->11617|19963->11620|19992->11621|20024->11625|20081->11653|20111->11654|20143->11658|20288->11774|20318->11775|20351->11780|20561->11962|20590->11963|20619->11964|20653->11969|20683->11970|20716->11975|20801->12032|20830->12033|20863->12038|20990->12136|21020->12137|21053->12142|21263->12324|21292->12325|21321->12326|21355->12331|21385->12332|21418->12337|21503->12394|21532->12395|21565->12400|21710->12516|21740->12517|21773->12522|21983->12704|22012->12705|22041->12706|22075->12711|22105->12712|22138->12717|22223->12774|22252->12775|22283->12778|22312->12779|22344->12783|22400->12810|22430->12811|22462->12815|22604->12928|22634->12929|22667->12934|22877->13116|22906->13117|22935->13118|22969->13123|22999->13124|23032->13129|23117->13186|23146->13187|23179->13192|23303->13287|23333->13288|23366->13293|23577->13476|23606->13477|23635->13478|23669->13483|23699->13484|23732->13489|23817->13546|23846->13547|23879->13552|24021->13665|24051->13666|24084->13671|24294->13853|24323->13854|24352->13855|24386->13860|24416->13861|24449->13866|24534->13923|24563->13924|24594->13927|24623->13928|24655->13932|24710->13958|24740->13959|24772->13963|24911->14073|24941->14074|24974->14079|25184->14261|25213->14262|25242->14263|25276->14268|25306->14269|25339->14274|25424->14331|25453->14332|25486->14337|25607->14429|25637->14430|25670->14435|25881->14618|25910->14619|25939->14620|25973->14625|26003->14626|26036->14631|26121->14688|26150->14689|26183->14694|26322->14804|26352->14805|26385->14810|26595->14992|26624->14993|26653->14994|26687->14999|26717->15000|26750->15005|26835->15062|26864->15063|26895->15066|26924->15067|26955->15070|27005->15091|27035->15092|27067->15096|27191->15191|27221->15192|27254->15197|27464->15379|27493->15380|27522->15381|27556->15386|27586->15387|27619->15392|27704->15449|27733->15450|27766->15455|27872->15532|27902->15533|27935->15538|28146->15721|28175->15722|28204->15723|28238->15728|28268->15729|28301->15734|28386->15791|28415->15792|28448->15797|28572->15892|28602->15893|28635->15898|28845->16080|28874->16081|28903->16082|28937->16087|28967->16088|29000->16093|29085->16150|29114->16151|29145->16154|29174->16155|29206->16159|29256->16180|29286->16181|29318->16185|29442->16280|29472->16281|29505->16286|29717->16470|29746->16471|29775->16472|29809->16477|29839->16478|29872->16483|29958->16541|29987->16542|30020->16547|30126->16624|30156->16625|30189->16630|30401->16814|30430->16815|30459->16816|30493->16821|30523->16822|30556->16827|30642->16885|30671->16886|30704->16891|30828->16986|30858->16987|30891->16992|31103->17176|31132->17177|31161->17178|31195->17183|31225->17184|31258->17189|31344->17247|31373->17248|31404->17251|31433->17252|31467->17258|31603->17365|31633->17366|31665->17370|31793->17469|31823->17470|31857->17476|32067->17658|32096->17659|32128->17663|32158->17664|32190->17668|32273->17723|32302->17724|32334->17728|32456->17821|32486->17822|32518->17826|32724->18004|32753->18005|32785->18009|32815->18010|32847->18014|32930->18069|32959->18070|32998->18081|33114->18168|33144->18169|33176->18173|33382->18351|33411->18352|33443->18356|33473->18357|33505->18361|33588->18416|33617->18417|33653->18425|33771->18514|33801->18515|33834->18520|33963->18620|33993->18621|34026->18626|34235->18807|34264->18808|34297->18812|34327->18813|34360->18818|34444->18874|34473->18875|34516->18890|34646->18991|34676->18992|34709->18997|34920->19180|34949->19181|34978->19182|35012->19187|35042->19188|35075->19193|35161->19251|35190->19252|35223->19257|35342->19347|35372->19348|35405->19353|35616->19536|35645->19537|35674->19538|35708->19543|35738->19544|35771->19549|35857->19607|35886->19608|35924->19618|35953->19619|35984->19622|36013->19623|36047->19629|36181->19734|36211->19735|36243->19739|36376->19843|36406->19844|36439->19849|36649->20031|36678->20032|36707->20033|36741->20038|36771->20039|36804->20044|36889->20101|36918->20102|36951->20107|37072->20199|37102->20200|37135->20205|37345->20387|37374->20388|37403->20389|37437->20394|37467->20395|37500->20400|37585->20457|37614->20458|37647->20463|37768->20555|37798->20556|37831->20561|38041->20743|38070->20744|38099->20745|38133->20750|38163->20751|38196->20756|38281->20813|38310->20814|38342->20818|38469->20916|38499->20917|38532->20922|38666->21027|38696->21028|38730->21034|38943->21219|38972->21220|39001->21221|39035->21226|39065->21227|39099->21233|39185->21291|39214->21292|39248->21298|39370->21391|39400->21392|39434->21398|39647->21583|39676->21584|39705->21585|39739->21590|39769->21591|39803->21597|39889->21655|39918->21656|39952->21662|40074->21755|40104->21756|40138->21762|40351->21947|40380->21948|40409->21949|40443->21954|40473->21955|40507->21961|40593->22019|40622->22020|40663->22033|40692->22034|40723->22037|40752->22038|40786->22044|40828->22058|40857->22059|40886->22060|40957->22102|40987->22103|41024->22112|41083->22142|41113->22143|41153->22154|41283->22256|41313->22257|41381->22296|41411->22297|41451->22308|41525->22354|41555->22355|41592->22364|41621->22365|41699->22414|41729->22415|41766->22424|41826->22455|41856->22456|41896->22467|42026->22569|42056->22570|42124->22609|42154->22610|42194->22621|42269->22668|42299->22669|42336->22678|42365->22679|42446->22731|42476->22732|42506->22734|42565->22764|42595->22765|42629->22771|42793->22906|42823->22907|42863->22918|43117->23144|43146->23145|43176->23147|43205->23148|43237->23152|43266->23153|43653->23512|43677->23526|43714->23541|43797->23596|43821->23610|43859->23626|43942->23681|43966->23695|44004->23711|44089->23768|44113->23782|44152->23799|44234->23853|44258->23867|44296->23883|44378->23937|44402->23951|44440->23967|44526->24025|44554->24043|44592->24059|44677->24116|44705->24134|44743->24150|44828->24207|44856->24225|44894->24241|44983->24302|45011->24320|45051->24338|45137->24396|45165->24414|45203->24430|45289->24488|45317->24506|45357->24524|45442->24581|45466->24595|45502->24609|45586->24665|45613->24682|45649->24696|45736->24755|45762->24771|45798->24785|45883->24842|45907->24856|45943->24870|46028->24927|46051->24940|46087->24954|46177->25016|46204->25033|46240->25047|46325->25104|46347->25116|46383->25130|46468->25187|46490->25199|46526->25213|46837->25496|46853->25502|46915->25542|47151->25750|47188->25765|47395->25945|47459->25999|47499->26000|47530->26003|47611->26053|47642->26057|47718->26123|47758->26124|47789->26127|47874->26181|47908->26188|47971->26241|48011->26242|48042->26245|48122->26294|48153->26298|48226->26361|48266->26362|48297->26365|48381->26418|48415->26425|48484->26484|48524->26485|48555->26488|48637->26539|48671->26546|48739->26604|48779->26605|48810->26608|48895->26662|48929->26669|48994->26724|49034->26725|49065->26728|49149->26781|49181->26786|49253->26848|49293->26849|49324->26852|49407->26904|49441->26911|49498->26958|49538->26959|49569->26962|49647->27009|49681->27016|49738->27063|49778->27064|49809->27067|49887->27114|49927->27126|52635->29805|52665->29806|52695->29807|52736->29819|52766->29820|52796->29821|52952->29948|52982->29949|53012->29950|53060->29969|53090->29970|53120->29971|53213->30035|53243->30036|53273->30037|53325->30060|53355->30061|53385->30062|53473->30121|53503->30122|53533->30123|53580->30141|53610->30142|53640->30143|53732->30206|53762->30207|53792->30208|53843->30230|53873->30231|53903->30232|53993->30293|54023->30294|54053->30295|54102->30315|54132->30316|54162->30317|54255->30381|54285->30382|54315->30383|54367->30406|54397->30407|54427->30408|54519->30471|54549->30472|54579->30473|54630->30495|54660->30496|54690->30497|54781->30559|54811->30560|54841->30561|54891->30582|54921->30583|54951->30584|55037->30641|55067->30642|55097->30643|55142->30659|55172->30660|55202->30661|55288->30718|55318->30719|55348->30720|55393->30736|55423->30737|55453->30738|56890->32146|56915->32160|56951->32173|56990->32183|57027->32197|57473->32614|57498->32628|57541->32648|57932->33010|57962->33011|57992->33012|58034->33025|58064->33026|58094->33027|58609->33513|58638->33531|58675->33545|59096->33937|59125->33955|59169->33976|59509->34287|59539->34288|59569->34289|59614->34305|59644->34306|59674->34307|60175->34779|60200->34793|60235->34805|60671->35212|60696->35226|60738->35245|61081->35559|61111->35560|61141->35561|61182->35573|61212->35574|61242->35575|61753->36057|61781->36074|61816->36086|62266->36507|62294->36524|62336->36543|62681->36859|62711->36860|62741->36861|62785->36876|62815->36877|62845->36878|63355->37359|63382->37375|63417->37387|63860->37801|63887->37817|63929->37836|64275->38153|64305->38154|64335->38155|64378->38169|64408->38170|64438->38171|64957->38661|64982->38675|65017->38687|65474->39115|65499->39129|65541->39148|65917->39495|65947->39496|65977->39497|66024->39514|66055->39515|66086->39516|66597->39998|66621->40011|66656->40023|67107->40445|67131->40458|67173->40477|67548->40823|67578->40824|67608->40825|67654->40841|67685->40842|67716->40843|68219->41317|68247->41334|68282->41346|68732->41767|68760->41784|68802->41803|69174->42146|69204->42147|69234->42148|69279->42163|69310->42164|69341->42165|69817->42612|69840->42624|69875->42636|70308->43040|70331->43052|70373->43071|70736->43405|70766->43406|70796->43407|70835->43417|70865->43418|70895->43419|71372->43867|71395->43879|71430->43891|71863->44295|71886->44307|71928->44326|72294->44663|72324->44664|72354->44665|72393->44675|72423->44676|72453->44677|73314->45510|73338->45524|73374->45538|73868->46004|73892->46018|73928->46032|74318->46393|74348->46394|74378->46395|74435->46422|74466->46423|74497->46424|74612->46510|74642->46511|74672->46512|74714->46525|74744->46526|74775->46527|75313->47036|75338->47050|75375->47064|75873->47533|75898->47547|75935->47561|76333->47929|76364->47930|76395->47931|76453->47958|76485->47959|76517->47960|76633->48046|76664->48047|76695->48048|76738->48061|76770->48062|76802->48063|77642->48873|77672->48891|77710->48905|78158->49323|78188->49341|78226->49355|78604->49703|78635->49704|78666->49705|78730->49738|78762->49739|78794->49740|78897->49813|78928->49814|78959->49815|79005->49831|79036->49832|79067->49833|79569->50305|79599->50323|79637->50337|80086->50756|80116->50774|80154->50788|80521->51125|80552->51126|80583->51127|80647->51160|80679->51161|80711->51162|80815->51236|80846->51237|80877->51238|80923->51254|80954->51255|80985->51256|81920->52162|81937->52168|81997->52205|82741->52919|82772->52920|82810->52929|82926->53016|82956->53017|83040->53071|83071->53072|83105->53077|83177->53120|83207->53121|83577->53461|83608->53462|83646->53471|83708->53503|83739->53504|83782->53517|85012->54717|85043->54718|85090->54735|85164->54779|85195->54780|85234->54790|85265->54791|85312->54809|85378->54845|85409->54846|85459->54866|85520->54897|85551->54898|85598->54915|85723->55010|85754->55011|85805->55032|85933->55130|85964->55131|86020->55157|86151->55258|86182->55259|86253->55300|86284->55301|86345->55332|86376->55333|86458->55385|86489->55386|86536->55403|86661->55498|86692->55499|86743->55520|86869->55616|86900->55617|86956->55643|87087->55744|87118->55745|87189->55786|87220->55787|87281->55818|87312->55819|87399->55876|87430->55877|87477->55894|87602->55989|87633->55990|87684->56011|87812->56109|87843->56110|87899->56136|88030->56237|88061->56238|88132->56279|88163->56280|88224->56311|88255->56312|88871->56898|88902->56899|88949->56916|89354->57291|89385->57292|89426->57303|89665->57512|89696->57513|89750->57537|90160->57917|90191->57918|90237->57934|90499->58166|90530->58167|90574->58181|90605->58182|90646->58193|90677->58194|90719->58206|90750->58207|90788->58216|90819->58217|90895->58263|90926->58264|90986->58294|91047->58325|91078->58326|91125->58343|91250->58438|91281->58439|91332->58460|91463->58561|91494->58562|91550->58588|91681->58689|91712->58690|91783->58731|91814->58732|91875->58763|91906->58764|91989->58817|92020->58818|92067->58835|92192->58930|92223->58931|92274->58952|92401->59049|92432->59050|92488->59076|92619->59177|92650->59178|92721->59219|92752->59220|92813->59251|92844->59252|92927->59305|92958->59306|93005->59323|93130->59418|93161->59419|93212->59440|93339->59537|93370->59538|93426->59564|93557->59665|93588->59666|93659->59707|93690->59708|93751->59739|93782->59740|94458->60386|94489->60387|94540->60408|95021->60859|95052->60860|95097->60875|95380->61128|95411->61129|95468->61156|95921->61579|95952->61580|96002->61600|96266->61834|96297->61835|96345->61853|96376->61854|96422->61870|96453->61871|96498->61886|96529->61887|96572->61900|96603->61901|96683->61951|96714->61952|96772->61980|96833->62011|96864->62012|96915->62033|97048->62136|97079->62137|97134->62162|97265->62263|97296->62264|97356->62294|97495->62403|97526->62404|97605->62453|97636->62454|97705->62493|97736->62494|98460->63188|98491->63189|98534->63202|98602->63240|98633->63241|98682->63260|98743->63291|98774->63292|98825->63313|98958->63416|98989->63417|99044->63442|99179->63547|99210->63548|99270->63578|99409->63687|99440->63688|99519->63737|99550->63738|99619->63777|99650->63778|100316->64414|100347->64415|100403->64441|100470->64478|100501->64479|100559->64507|100620->64538|100651->64539|100702->64560|100835->64663|100866->64664|100921->64689|101056->64794|101087->64795|101147->64825|101286->64934|101317->64935|101396->64984|101427->64985|101496->65024|101527->65025|102263->65731|102294->65732|102342->65751|102412->65791|102443->65792|102484->65804|102545->65835|102576->65836|102628->65858|102763->65963|102794->65964|102850->65990|102987->66097|103018->66098|103079->66129|103220->66240|103251->66241|103332->66292|103363->66293|103434->66334|103465->66335|104181->67021|104212->67022|104259->67040|104328->67079|104359->67080|104396->67088|104458->67120|104489->67121|104541->67143|104676->67248|104707->67249|104763->67275|104900->67382|104931->67383|104992->67414|105133->67525|105164->67526|105245->67577|105276->67578|105347->67619|105378->67620|106110->68322|106141->68323|106181->68334|106249->68372|106280->68373|106316->68380|106378->68412|106409->68413|106461->68435|106596->68540|106627->68541|106683->68567|106820->68674|106851->68675|106912->68706|107053->68817|107084->68818|107165->68869|107196->68870|107267->68911|107298->68912|108029->69613|108060->69614|108095->69620|108161->69656|108192->69657|108235->69671|108297->69703|108328->69704|108389->69735|108526->69842|108557->69843|108614->69870|108753->69979|108784->69980|108846->70012|108989->70125|109020->70126|109103->70179|109134->70180|109207->70223|109238->70224|109959->70915|109990->70916|110026->70923|110092->70959|110123->70960|110160->70968|110222->71000|110253->71001|110306->71024|110443->71131|110474->71132|110531->71159|110670->71268|110701->71269|110763->71301|110906->71414|110937->71415|111020->71468|111051->71469|111124->71512|111155->71513|111910->72238|111941->72239|111982->72251|112069->72308|112100->72309|112136->72316|112425->72576|112455->72577|112585->72677|112616->72678|112656->72688|112778->72780|112809->72781|112851->72793|112892->72804|112923->72805|112967->72819|113039->72861|113070->72862|113110->72872|113141->72873|113180->72883|113210->72884|113249->72894|113279->72895
                  LINES: 26->1|29->1|30->2|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|51->23|51->23|51->23|52->24|52->24|52->24|58->30|58->30|59->31|60->32|60->32|62->34|62->34|63->35|63->35|63->35|64->36|65->37|65->37|66->38|66->38|69->41|69->41|70->42|71->43|71->43|72->44|72->44|74->46|119->91|119->91|120->92|123->95|123->95|124->96|136->108|136->108|137->109|139->111|139->111|139->111|139->111|140->112|141->113|141->113|143->115|143->115|143->115|144->116|145->117|145->117|146->118|149->121|149->121|149->121|149->121|150->122|151->123|151->123|153->125|154->126|154->126|155->127|158->130|158->130|158->130|158->130|159->131|160->132|160->132|162->134|163->135|163->135|164->136|167->139|167->139|167->139|167->139|168->140|169->141|169->141|171->143|171->143|173->145|173->145|173->145|174->146|175->147|175->147|176->148|179->151|179->151|179->151|179->151|179->151|180->152|181->153|181->153|182->154|183->155|183->155|184->156|187->159|187->159|187->159|187->159|187->159|188->160|189->161|189->161|190->162|191->163|191->163|192->164|195->167|195->167|195->167|195->167|195->167|196->168|197->169|197->169|198->170|198->170|200->172|200->172|200->172|201->173|202->174|202->174|203->175|206->178|206->178|206->178|206->178|206->178|207->179|208->180|208->180|210->182|211->183|211->183|212->184|215->187|215->187|215->187|215->187|215->187|216->188|217->189|217->189|219->191|220->192|220->192|221->193|224->196|224->196|224->196|224->196|224->196|225->197|226->198|226->198|227->199|227->199|229->201|229->201|229->201|230->202|231->203|231->203|232->204|235->207|235->207|235->207|235->207|235->207|236->208|237->209|237->209|239->211|240->212|240->212|241->213|244->216|244->216|244->216|244->216|244->216|245->217|246->218|246->218|248->220|249->221|249->221|250->222|253->225|253->225|253->225|253->225|253->225|254->226|255->227|255->227|256->228|256->228|258->230|258->230|258->230|259->231|260->232|260->232|261->233|264->236|264->236|264->236|264->236|264->236|265->237|266->238|266->238|268->240|269->241|269->241|270->242|273->245|273->245|273->245|273->245|273->245|274->246|275->247|275->247|277->249|278->250|278->250|279->251|282->254|282->254|282->254|282->254|282->254|283->255|284->256|284->256|285->257|285->257|287->259|287->259|287->259|288->260|289->261|289->261|290->262|293->265|293->265|293->265|293->265|293->265|294->266|295->267|295->267|297->269|298->270|298->270|299->271|302->274|302->274|302->274|302->274|302->274|303->275|304->276|304->276|306->278|307->279|307->279|308->280|311->283|311->283|311->283|311->283|311->283|312->284|313->285|313->285|314->286|314->286|316->288|316->288|316->288|317->289|318->290|318->290|319->291|322->294|322->294|322->294|322->294|322->294|323->295|324->296|324->296|326->298|327->299|327->299|328->300|331->303|331->303|331->303|331->303|331->303|332->304|333->305|333->305|335->307|336->308|336->308|337->309|340->312|340->312|340->312|340->312|340->312|341->313|342->314|342->314|343->315|343->315|345->317|345->317|345->317|346->318|347->319|347->319|348->320|351->323|351->323|351->323|351->323|351->323|352->324|353->325|353->325|355->327|356->328|356->328|357->329|360->332|360->332|360->332|360->332|360->332|361->333|362->334|362->334|364->336|365->337|365->337|366->338|369->341|369->341|369->341|369->341|369->341|370->342|371->343|371->343|372->344|372->344|373->345|373->345|373->345|374->346|375->347|375->347|376->348|379->351|379->351|379->351|379->351|379->351|380->352|381->353|381->353|383->355|384->356|384->356|385->357|388->360|388->360|388->360|388->360|388->360|389->361|390->362|390->362|392->364|393->365|393->365|394->366|397->369|397->369|397->369|397->369|397->369|398->370|399->371|399->371|400->372|400->372|402->374|402->374|402->374|403->375|404->376|404->376|405->377|408->380|408->380|408->380|408->380|408->380|409->381|410->382|410->382|412->384|413->385|413->385|414->386|417->389|417->389|417->389|417->389|417->389|418->390|419->391|419->391|421->393|422->394|422->394|423->395|426->398|426->398|426->398|426->398|426->398|427->399|428->400|428->400|429->401|429->401|431->403|432->404|432->404|433->405|434->406|434->406|435->407|438->410|438->410|438->410|438->410|439->411|440->412|440->412|441->413|442->414|442->414|443->415|446->418|446->418|446->418|446->418|447->419|448->420|448->420|450->422|451->423|451->423|452->424|455->427|455->427|455->427|455->427|456->428|457->429|457->429|459->431|460->432|460->432|461->433|462->434|462->434|463->435|466->438|466->438|466->438|466->438|467->439|468->440|468->440|470->442|472->444|472->444|473->445|476->448|476->448|476->448|476->448|476->448|477->449|478->450|478->450|479->451|480->452|480->452|481->453|484->456|484->456|484->456|484->456|484->456|485->457|486->458|486->458|487->459|487->459|488->460|488->460|490->462|491->463|491->463|492->464|493->465|493->465|494->466|497->469|497->469|497->469|497->469|497->469|498->470|499->471|499->471|501->473|502->474|502->474|503->475|506->478|506->478|506->478|506->478|506->478|507->479|508->480|508->480|510->482|511->483|511->483|512->484|515->487|515->487|515->487|515->487|515->487|516->488|517->489|517->489|518->490|519->491|519->491|520->492|521->493|521->493|522->494|525->497|525->497|525->497|525->497|525->497|526->498|527->499|527->499|529->501|530->502|530->502|531->503|534->506|534->506|534->506|534->506|534->506|535->507|536->508|536->508|538->510|539->511|539->511|540->512|543->515|543->515|543->515|543->515|543->515|544->516|545->517|545->517|547->519|547->519|548->520|548->520|550->522|551->523|551->523|552->524|555->527|555->527|556->528|556->528|556->528|557->529|560->532|560->532|562->534|562->534|563->535|564->536|564->536|565->537|565->537|568->540|568->540|569->541|569->541|569->541|570->542|573->545|573->545|575->547|575->547|576->548|577->549|577->549|578->550|578->550|584->556|584->556|585->557|585->557|585->557|586->558|590->562|590->562|591->563|594->566|594->566|595->567|595->567|596->568|596->568|608->580|608->580|608->580|609->581|609->581|609->581|610->582|610->582|610->582|612->584|612->584|612->584|613->585|613->585|613->585|614->586|614->586|614->586|616->588|616->588|616->588|617->589|617->589|617->589|618->590|618->590|618->590|620->592|620->592|620->592|621->593|621->593|621->593|622->594|622->594|622->594|623->595|623->595|623->595|624->596|624->596|624->596|625->597|625->597|625->597|626->598|626->598|626->598|627->599|627->599|627->599|628->600|628->600|628->600|629->601|629->601|629->601|630->602|630->602|630->602|638->610|638->610|638->610|644->616|644->616|647->619|647->619|647->619|648->620|649->621|650->622|650->622|650->622|651->623|652->624|654->626|654->626|654->626|655->627|656->628|657->629|657->629|657->629|658->630|659->631|661->633|661->633|661->633|662->634|663->635|665->637|665->637|665->637|666->638|667->639|669->641|669->641|669->641|670->642|671->643|673->645|673->645|673->645|674->646|675->647|677->649|677->649|677->649|678->650|679->651|681->653|681->653|681->653|682->654|683->655|686->658|724->696|724->696|724->696|724->696|724->696|724->696|726->698|726->698|726->698|726->698|726->698|726->698|727->699|727->699|727->699|727->699|727->699|727->699|728->700|728->700|728->700|728->700|728->700|728->700|729->701|729->701|729->701|729->701|729->701|729->701|730->702|730->702|730->702|730->702|730->702|730->702|731->703|731->703|731->703|731->703|731->703|731->703|732->704|732->704|732->704|732->704|732->704|732->704|733->705|733->705|733->705|733->705|733->705|733->705|734->706|734->706|734->706|734->706|734->706|734->706|735->707|735->707|735->707|735->707|735->707|735->707|764->736|764->736|764->736|764->736|764->736|768->740|768->740|768->740|778->750|778->750|778->750|778->750|778->750|778->750|787->759|787->759|787->759|791->763|791->763|791->763|801->773|801->773|801->773|801->773|801->773|801->773|810->782|810->782|810->782|814->786|814->786|814->786|824->796|824->796|824->796|824->796|824->796|824->796|833->805|833->805|833->805|837->809|837->809|837->809|847->819|847->819|847->819|847->819|847->819|847->819|856->828|856->828|856->828|860->832|860->832|860->832|870->842|870->842|870->842|870->842|870->842|870->842|880->852|880->852|880->852|884->856|884->856|884->856|894->866|894->866|894->866|894->866|894->866|894->866|903->875|903->875|903->875|907->879|907->879|907->879|917->889|917->889|917->889|917->889|917->889|917->889|926->898|926->898|926->898|930->902|930->902|930->902|940->912|940->912|940->912|940->912|940->912|940->912|949->921|949->921|949->921|953->925|953->925|953->925|963->935|963->935|963->935|963->935|963->935|963->935|972->944|972->944|972->944|976->948|976->948|976->948|986->958|986->958|986->958|986->958|986->958|986->958|1002->974|1002->974|1002->974|1011->983|1011->983|1011->983|1021->993|1021->993|1021->993|1021->993|1021->993|1021->993|1022->994|1022->994|1022->994|1022->994|1022->994|1022->994|1033->1005|1033->1005|1033->1005|1042->1014|1042->1014|1042->1014|1052->1024|1052->1024|1052->1024|1052->1024|1052->1024|1052->1024|1053->1025|1053->1025|1053->1025|1053->1025|1053->1025|1053->1025|1065->1037|1065->1037|1065->1037|1069->1041|1069->1041|1069->1041|1079->1051|1079->1051|1079->1051|1079->1051|1079->1051|1079->1051|1080->1052|1080->1052|1080->1052|1080->1052|1080->1052|1080->1052|1087->1059|1087->1059|1087->1059|1091->1063|1091->1063|1091->1063|1101->1073|1101->1073|1101->1073|1101->1073|1101->1073|1101->1073|1102->1074|1102->1074|1102->1074|1102->1074|1102->1074|1102->1074|1123->1095|1123->1095|1123->1095|1147->1119|1147->1119|1148->1120|1151->1123|1151->1123|1156->1128|1156->1128|1157->1129|1158->1130|1158->1130|1167->1139|1167->1139|1168->1140|1169->1141|1169->1141|1170->1142|1198->1170|1198->1170|1199->1171|1200->1172|1200->1172|1201->1173|1201->1173|1203->1175|1203->1175|1203->1175|1205->1177|1205->1177|1205->1177|1206->1178|1208->1180|1208->1180|1209->1181|1211->1183|1211->1183|1212->1184|1214->1186|1214->1186|1216->1188|1216->1188|1218->1190|1218->1190|1220->1192|1220->1192|1221->1193|1223->1195|1223->1195|1224->1196|1226->1198|1226->1198|1227->1199|1229->1201|1229->1201|1231->1203|1231->1203|1233->1205|1233->1205|1235->1207|1235->1207|1236->1208|1238->1210|1238->1210|1239->1211|1241->1213|1241->1213|1242->1214|1244->1216|1244->1216|1246->1218|1246->1218|1248->1220|1248->1220|1269->1241|1269->1241|1270->1242|1282->1254|1282->1254|1283->1255|1294->1266|1294->1266|1296->1268|1306->1278|1306->1278|1308->1280|1314->1286|1314->1286|1315->1287|1315->1287|1316->1288|1316->1288|1317->1289|1317->1289|1318->1290|1318->1290|1319->1291|1319->1291|1322->1294|1322->1294|1322->1294|1323->1295|1325->1297|1325->1297|1326->1298|1328->1300|1328->1300|1329->1301|1331->1303|1331->1303|1333->1305|1333->1305|1335->1307|1335->1307|1337->1309|1337->1309|1338->1310|1340->1312|1340->1312|1341->1313|1343->1315|1343->1315|1344->1316|1346->1318|1346->1318|1348->1320|1348->1320|1350->1322|1350->1322|1352->1324|1352->1324|1353->1325|1355->1327|1355->1327|1356->1328|1358->1330|1358->1330|1359->1331|1361->1333|1361->1333|1363->1335|1363->1335|1365->1337|1365->1337|1386->1358|1386->1358|1387->1359|1402->1374|1402->1374|1403->1375|1413->1385|1413->1385|1415->1387|1425->1397|1425->1397|1427->1399|1432->1404|1432->1404|1433->1405|1433->1405|1434->1406|1434->1406|1435->1407|1435->1407|1436->1408|1436->1408|1437->1409|1437->1409|1439->1411|1439->1411|1439->1411|1440->1412|1442->1414|1442->1414|1443->1415|1445->1417|1445->1417|1446->1418|1448->1420|1448->1420|1450->1422|1450->1422|1452->1424|1452->1424|1473->1445|1473->1445|1474->1446|1474->1446|1474->1446|1476->1448|1476->1448|1476->1448|1477->1449|1479->1451|1479->1451|1480->1452|1482->1454|1482->1454|1483->1455|1485->1457|1485->1457|1487->1459|1487->1459|1489->1461|1489->1461|1506->1478|1506->1478|1508->1480|1508->1480|1508->1480|1510->1482|1510->1482|1510->1482|1511->1483|1513->1485|1513->1485|1514->1486|1516->1488|1516->1488|1517->1489|1519->1491|1519->1491|1521->1493|1521->1493|1523->1495|1523->1495|1544->1516|1544->1516|1546->1518|1546->1518|1546->1518|1548->1520|1548->1520|1548->1520|1549->1521|1551->1523|1551->1523|1552->1524|1554->1526|1554->1526|1555->1527|1557->1529|1557->1529|1559->1531|1559->1531|1561->1533|1561->1533|1583->1555|1583->1555|1586->1558|1586->1558|1586->1558|1588->1560|1588->1560|1588->1560|1589->1561|1591->1563|1591->1563|1592->1564|1594->1566|1594->1566|1595->1567|1597->1569|1597->1569|1599->1571|1599->1571|1601->1573|1601->1573|1623->1595|1623->1595|1625->1597|1625->1597|1625->1597|1627->1599|1627->1599|1627->1599|1628->1600|1630->1602|1630->1602|1631->1603|1633->1605|1633->1605|1634->1606|1636->1608|1636->1608|1638->1610|1638->1610|1640->1612|1640->1612|1663->1635|1663->1635|1664->1636|1664->1636|1664->1636|1666->1638|1666->1638|1666->1638|1668->1640|1670->1642|1670->1642|1671->1643|1673->1645|1673->1645|1674->1646|1676->1648|1676->1648|1678->1650|1678->1650|1680->1652|1680->1652|1702->1674|1702->1674|1703->1675|1703->1675|1703->1675|1705->1677|1705->1677|1705->1677|1706->1678|1708->1680|1708->1680|1709->1681|1711->1683|1711->1683|1712->1684|1714->1686|1714->1686|1716->1688|1716->1688|1718->1690|1718->1690|1740->1712|1740->1712|1742->1714|1744->1716|1744->1716|1745->1717|1755->1727|1755->1727|1759->1731|1759->1731|1760->1732|1761->1733|1761->1733|1762->1734|1762->1734|1762->1734|1763->1735|1764->1736|1764->1736|1765->1737|1765->1737|1766->1738|1766->1738|1767->1739|1767->1739
                  -- GENERATED --
              */
          