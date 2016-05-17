
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
object mortgagePage8Duplicate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template12[String,EmployeIncomeTypeParam,SelfEmployeIncomeTypeParam,PensionIncomeTypeParam,InvestmentsIncomeTypeParam,MaternityIncomeTypeParam,VehicleAllowIncomeTypeParam,LivingAllowIncomeTypeParam,CommissionIncomeTypeParam,BonusIncomeTypeParam,OtherIncomeTypeParam,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(additionalApplicant:String,employeeIncome:EmployeIncomeTypeParam,
selfEmployeeIncome:SelfEmployeIncomeTypeParam,
pensionIncType:PensionIncomeTypeParam,
investmentIncType:InvestmentsIncomeTypeParam,
maternityIncType:MaternityIncomeTypeParam,vehicleIncType:VehicleAllowIncomeTypeParam,livingIncType:LivingAllowIncomeTypeParam,
commissionIncType:CommissionIncomeTypeParam,
bonusIncType:BonusIncomeTypeParam,
otherIncType:OtherIncomeTypeParam,applicantName:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*8.56*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<script
	src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>

<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*22.31*/routes/*22.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*22.79*/("""">
<script src="""),_display_(/*23.14*/routes/*23.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*23.61*/(""""></script>
<link type="text/css" rel="stylesheet" href=""""),_display_(/*24.47*/routes/*24.53*/.Assets.at("_resources/background.css")),format.raw/*24.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*25.47*/routes/*25.53*/.Assets.at("_resources/forms.css")),format.raw/*25.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*26.47*/routes/*26.53*/.Assets.at("_resources/template.css")),format.raw/*26.90*/("""">
<link rel="shortcut icon" href=""""),_display_(/*27.34*/routes/*27.40*/.Assets.at("_resources/favicon.ico")),format.raw/*27.76*/("""">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script>

<script src=""""),_display_(/*34.15*/routes/*34.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*34.65*/(""""></script>
<script src=""""),_display_(/*35.15*/routes/*35.21*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*35.67*/(""""></script>

<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> -->
<!--  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>-->
<script language="JavaScript">
	window.onbeforeunload = function() """),format.raw/*40.37*/("""{"""),format.raw/*40.38*/("""
		"""),format.raw/*41.3*/("""return "Are you sure?";
	"""),format.raw/*42.2*/("""}"""),format.raw/*42.3*/(""";

	$(document).ready(function() """),format.raw/*44.31*/("""{"""),format.raw/*44.32*/("""
		"""),format.raw/*45.3*/("""$('form').submit(function() """),format.raw/*45.31*/("""{"""),format.raw/*45.32*/("""
			"""),format.raw/*46.4*/("""window.onbeforeunload = null;
		"""),format.raw/*47.3*/("""}"""),format.raw/*47.4*/(""");
	"""),format.raw/*48.2*/("""}"""),format.raw/*48.3*/(""");
</script>
<script type="text/javascript">
	window.onload = function() """),format.raw/*51.29*/("""{"""),format.raw/*51.30*/("""
		"""),format.raw/*52.3*/("""SelectElement();
	"""),format.raw/*53.2*/("""}"""),format.raw/*53.3*/(""";
	function SelectElement() """),format.raw/*54.27*/("""{"""),format.raw/*54.28*/("""

		"""),format.raw/*56.3*/("""var empStartMon11 = document.forms["myForm"]["empStartMon1"].value;
		document.forms["myForm"]["empStartMonth"].value = empStartMon11;
		var empStartMon511 = document.forms["myForm"]["empStartMon51"].value;
		document.forms["myForm"]["empStartMonth2"].value = empStartMon511;
		var empStartMon512 = document.forms["myForm"]["empStartMon52"].value;
		document.forms["myForm"]["empStartMonth3"].value = empStartMon512;

		var selfStartMon11 = document.forms["myForm"]["selfStartMon1"].value;

		document.forms["myForm"]["selfStartMon"].value = selfStartMon11;
		var selfStartMon311 = document.forms["myForm"]["selfStartMon212"].value;

		document.forms["myForm"]["selfStartMon2"].value = selfStartMon311;
		var selfStartMon311 = document.forms["myForm"]["selfStartMon213"].value;

		document.forms["myForm"]["selfStartMon3"].value = selfStartMon311;

		var pensionStartMon1 = document.forms["myForm"]["pensionStartMon"].value;
		document.forms["myForm"]["pensionMY1"].value = pensionStartMon1;

		var investStartMon1 = document.forms["myForm"]["investStartMon"].value;
		document.forms["myForm"]["investmentsMY1"].value = investStartMon1;

		var maternityStartMon1 = document.forms["myForm"]["maternityStartMon"].value;
		document.forms["myForm"]["maternityMY1"].value = maternityStartMon1;

		var vehicleStartMon1 = document.forms["myForm"]["vehicleStartMon"].value;
		document.forms["myForm"]["vehicleAllowMY1"].value = vehicleStartMon1;

		var livingStartMon1 = document.forms["myForm"]["livingStartMon"].value;
		document.forms["myForm"]["livingAllowMY1"].value = livingStartMon1;

		var commissionStartMon1 = document.forms["myForm"]["commissionStartMon"].value;
		document.forms["myForm"]["commissionMY1"].value = commissionStartMon1;

		var bonusStartMon1 = document.forms["myForm"]["bonusStartMon"].value;
		document.forms["myForm"]["bonusMY1"].value = bonusStartMon1;

		var otherStartMon1 = document.forms["myForm"]["otherStartMon"].value;
		document.forms["myForm"]["otherMY1"].value = otherStartMon1;
	"""),format.raw/*96.2*/("""}"""),format.raw/*96.3*/("""
"""),format.raw/*97.1*/("""</script>

<script type="text/javascript">
	function validateForm() """),format.raw/*100.26*/("""{"""),format.raw/*100.27*/("""

		"""),format.raw/*102.3*/("""var employee = document.forms["myForm"]["employee"].value;
		var selfEmployed = document.forms["myForm"]["selfEmployed"].value;
		var pension = document.forms["myForm"]["pension"].value;
		var investments = document.forms["myForm"]["investments"].value;
		var maternity = document.forms["myForm"]["maternity"].value;
		var vehicleAllow = document.forms["myForm"]["vehicleAllow"].value;
		var livingAllow = document.forms["myForm"]["livingAllow"].value;
		var commission = document.forms["myForm"]["commission"].value;
		var bonus = document.forms["myForm"]["bonus"].value;
		var other = document.forms["myForm"]["other"].value;
		var retVal = true;

		if (employee == "false" && selfEmployed == "false"
				&& pension == "false" && investments == "false"
				&& maternity == "false" && vehicleAllow == "false"
				&& livingAllow == "false" && commission == "false"
				&& bonus == "false" && other == "false") """),format.raw/*118.46*/("""{"""),format.raw/*118.47*/("""
			"""),format.raw/*119.4*/("""document.getElementById('input_204').innerHTML = "<span style='color:red'>*This field is Required.</span>";
			return false;
		"""),format.raw/*121.3*/("""}"""),format.raw/*121.4*/(""" """),format.raw/*121.5*/("""else """),format.raw/*121.10*/("""{"""),format.raw/*121.11*/("""
			"""),format.raw/*122.4*/("""document.getElementById("input_204").innerHTML = "";
		"""),format.raw/*123.3*/("""}"""),format.raw/*123.4*/("""

		"""),format.raw/*125.3*/("""if (employee == "true") """),format.raw/*125.27*/("""{"""),format.raw/*125.28*/("""
			"""),format.raw/*126.4*/("""var empBusinessName = document.forms["myForm"]["empBusinessName"].value;
			if (!empBusinessName) """),format.raw/*127.26*/("""{"""),format.raw/*127.27*/("""
				"""),format.raw/*128.5*/("""document.getElementById('input_1102').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*130.4*/("""}"""),format.raw/*130.5*/(""" """),format.raw/*130.6*/("""else """),format.raw/*130.11*/("""{"""),format.raw/*130.12*/("""
				"""),format.raw/*131.5*/("""document.getElementById("input_1102").innerHTML = "";
			"""),format.raw/*132.4*/("""}"""),format.raw/*132.5*/("""

			"""),format.raw/*134.4*/("""var empStartMonth = document.forms["myForm"]["empStartMonth"].value;
			if (!empStartMonth) """),format.raw/*135.24*/("""{"""),format.raw/*135.25*/("""
				"""),format.raw/*136.5*/("""document.getElementById('input_1103').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*138.4*/("""}"""),format.raw/*138.5*/(""" """),format.raw/*138.6*/("""else """),format.raw/*138.11*/("""{"""),format.raw/*138.12*/("""
				"""),format.raw/*139.5*/("""document.getElementById("input_1103").innerHTML = "";
			"""),format.raw/*140.4*/("""}"""),format.raw/*140.5*/("""

			"""),format.raw/*142.4*/("""var empPosition = document.forms["myForm"]["empPosition"].value;
			if (!empPosition) """),format.raw/*143.22*/("""{"""),format.raw/*143.23*/("""
				"""),format.raw/*144.5*/("""document.getElementById('input_1104').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*146.4*/("""}"""),format.raw/*146.5*/(""" """),format.raw/*146.6*/("""else """),format.raw/*146.11*/("""{"""),format.raw/*146.12*/("""
				"""),format.raw/*147.5*/("""document.getElementById("input_1104").innerHTML = "";
			"""),format.raw/*148.4*/("""}"""),format.raw/*148.5*/("""
		"""),format.raw/*149.3*/("""}"""),format.raw/*149.4*/("""

		"""),format.raw/*151.3*/("""if (selfEmployed == "true") """),format.raw/*151.31*/("""{"""),format.raw/*151.32*/("""
			"""),format.raw/*152.4*/("""var selfBusinessName = document.forms["myForm"]["selfBusinessName"].value;
			if (!selfBusinessName) """),format.raw/*153.27*/("""{"""),format.raw/*153.28*/("""
				"""),format.raw/*154.5*/("""document.getElementById('input_1118').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*156.4*/("""}"""),format.raw/*156.5*/(""" """),format.raw/*156.6*/("""else """),format.raw/*156.11*/("""{"""),format.raw/*156.12*/("""
				"""),format.raw/*157.5*/("""document.getElementById("input_1118").innerHTML = "";
			"""),format.raw/*158.4*/("""}"""),format.raw/*158.5*/("""

			"""),format.raw/*160.4*/("""var selfStartMon = document.forms["myForm"]["selfStartMon"].value;
			if (!selfStartMon) """),format.raw/*161.23*/("""{"""),format.raw/*161.24*/("""
				"""),format.raw/*162.5*/("""document.getElementById('input_1119').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*164.4*/("""}"""),format.raw/*164.5*/(""" """),format.raw/*164.6*/("""else """),format.raw/*164.11*/("""{"""),format.raw/*164.12*/("""
				"""),format.raw/*165.5*/("""document.getElementById("input_1119").innerHTML = "";
			"""),format.raw/*166.4*/("""}"""),format.raw/*166.5*/("""

			"""),format.raw/*168.4*/("""var selfPosition = document.forms["myForm"]["selfPosition"].value;
			if (!selfPosition) """),format.raw/*169.23*/("""{"""),format.raw/*169.24*/("""
				"""),format.raw/*170.5*/("""document.getElementById('input_1120').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*172.4*/("""}"""),format.raw/*172.5*/(""" """),format.raw/*172.6*/("""else """),format.raw/*172.11*/("""{"""),format.raw/*172.12*/("""
				"""),format.raw/*173.5*/("""document.getElementById("input_1120").innerHTML = "";
			"""),format.raw/*174.4*/("""}"""),format.raw/*174.5*/("""

		"""),format.raw/*176.3*/("""}"""),format.raw/*176.4*/("""
		"""),format.raw/*177.3*/("""if (pension == "true") """),format.raw/*177.26*/("""{"""),format.raw/*177.27*/("""
			"""),format.raw/*178.4*/("""var pensionBusiness1 = document.forms["myForm"]["pensionBusiness1"].value;
			if (!pensionBusiness1) """),format.raw/*179.27*/("""{"""),format.raw/*179.28*/("""
				"""),format.raw/*180.5*/("""document.getElementById('input_5002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*182.4*/("""}"""),format.raw/*182.5*/(""" """),format.raw/*182.6*/("""else """),format.raw/*182.11*/("""{"""),format.raw/*182.12*/("""
				"""),format.raw/*183.5*/("""document.getElementById("input_5002").innerHTML = "";
			"""),format.raw/*184.4*/("""}"""),format.raw/*184.5*/("""

			"""),format.raw/*186.4*/("""var pensionMY1 = document.forms["myForm"]["pensionMY1"].value;
			if (!pensionMY1) """),format.raw/*187.21*/("""{"""),format.raw/*187.22*/("""
				"""),format.raw/*188.5*/("""document.getElementById('input_5003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*190.4*/("""}"""),format.raw/*190.5*/(""" """),format.raw/*190.6*/("""else """),format.raw/*190.11*/("""{"""),format.raw/*190.12*/("""
				"""),format.raw/*191.5*/("""document.getElementById("input_5003").innerHTML = "";
			"""),format.raw/*192.4*/("""}"""),format.raw/*192.5*/("""

			"""),format.raw/*194.4*/("""var pensionPosition1 = document.forms["myForm"]["pensionPosition1"].value;
			if (!pensionPosition1) """),format.raw/*195.27*/("""{"""),format.raw/*195.28*/("""
				"""),format.raw/*196.5*/("""document.getElementById('input_5004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*198.4*/("""}"""),format.raw/*198.5*/(""" """),format.raw/*198.6*/("""else """),format.raw/*198.11*/("""{"""),format.raw/*198.12*/("""
				"""),format.raw/*199.5*/("""document.getElementById("input_5004").innerHTML = "";
			"""),format.raw/*200.4*/("""}"""),format.raw/*200.5*/("""
		"""),format.raw/*201.3*/("""}"""),format.raw/*201.4*/("""
		"""),format.raw/*202.3*/("""if (investments == "true") """),format.raw/*202.30*/("""{"""),format.raw/*202.31*/("""
			"""),format.raw/*203.4*/("""var investmentBusiness1 = document.forms["myForm"]["investmentBusiness1"].value;
			if (!investmentBusiness1) """),format.raw/*204.30*/("""{"""),format.raw/*204.31*/("""
				"""),format.raw/*205.5*/("""document.getElementById('input_5006').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*207.4*/("""}"""),format.raw/*207.5*/(""" """),format.raw/*207.6*/("""else """),format.raw/*207.11*/("""{"""),format.raw/*207.12*/("""
				"""),format.raw/*208.5*/("""document.getElementById("input_5006").innerHTML = "";
			"""),format.raw/*209.4*/("""}"""),format.raw/*209.5*/("""

			"""),format.raw/*211.4*/("""var investmentsMY1 = document.forms["myForm"]["investmentsMY1"].value;
			if (!investmentsMY1) """),format.raw/*212.25*/("""{"""),format.raw/*212.26*/("""
				"""),format.raw/*213.5*/("""document.getElementById('input_5007').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*215.4*/("""}"""),format.raw/*215.5*/(""" """),format.raw/*215.6*/("""else """),format.raw/*215.11*/("""{"""),format.raw/*215.12*/("""
				"""),format.raw/*216.5*/("""document.getElementById("input_5007").innerHTML = "";
			"""),format.raw/*217.4*/("""}"""),format.raw/*217.5*/("""

			"""),format.raw/*219.4*/("""var investmentPosition1 = document.forms["myForm"]["investmentPosition1"].value;
			if (!investmentPosition1) """),format.raw/*220.30*/("""{"""),format.raw/*220.31*/("""
				"""),format.raw/*221.5*/("""document.getElementById('input_5008').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*223.4*/("""}"""),format.raw/*223.5*/(""" """),format.raw/*223.6*/("""else """),format.raw/*223.11*/("""{"""),format.raw/*223.12*/("""
				"""),format.raw/*224.5*/("""document.getElementById("input_5008").innerHTML = "";
			"""),format.raw/*225.4*/("""}"""),format.raw/*225.5*/("""
		"""),format.raw/*226.3*/("""}"""),format.raw/*226.4*/("""

		"""),format.raw/*228.3*/("""if (maternity == "true") """),format.raw/*228.28*/("""{"""),format.raw/*228.29*/("""
			"""),format.raw/*229.4*/("""var maternityBusiness1 = document.forms["myForm"]["maternityBusiness1"].value;
			if (!maternityBusiness1) """),format.raw/*230.29*/("""{"""),format.raw/*230.30*/("""
				"""),format.raw/*231.5*/("""document.getElementById('input_6002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*233.4*/("""}"""),format.raw/*233.5*/(""" """),format.raw/*233.6*/("""else """),format.raw/*233.11*/("""{"""),format.raw/*233.12*/("""
				"""),format.raw/*234.5*/("""document.getElementById("input_6002").innerHTML = "";
			"""),format.raw/*235.4*/("""}"""),format.raw/*235.5*/("""

			"""),format.raw/*237.4*/("""var maternityMY1 = document.forms["myForm"]["maternityMY1"].value;
			if (!maternityMY1) """),format.raw/*238.23*/("""{"""),format.raw/*238.24*/("""
				"""),format.raw/*239.5*/("""document.getElementById('input_6003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*241.4*/("""}"""),format.raw/*241.5*/(""" """),format.raw/*241.6*/("""else """),format.raw/*241.11*/("""{"""),format.raw/*241.12*/("""
				"""),format.raw/*242.5*/("""document.getElementById("input_6003").innerHTML = "";
			"""),format.raw/*243.4*/("""}"""),format.raw/*243.5*/("""

			"""),format.raw/*245.4*/("""var maternityPosition1 = document.forms["myForm"]["maternityPosition1"].value;
			if (!maternityPosition1) """),format.raw/*246.29*/("""{"""),format.raw/*246.30*/("""
				"""),format.raw/*247.5*/("""document.getElementById('input_6004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*249.4*/("""}"""),format.raw/*249.5*/(""" """),format.raw/*249.6*/("""else """),format.raw/*249.11*/("""{"""),format.raw/*249.12*/("""
				"""),format.raw/*250.5*/("""document.getElementById("input_6004").innerHTML = "";
			"""),format.raw/*251.4*/("""}"""),format.raw/*251.5*/("""
		"""),format.raw/*252.3*/("""}"""),format.raw/*252.4*/("""

		"""),format.raw/*254.3*/("""if (vehicleAllow == "true") """),format.raw/*254.31*/("""{"""),format.raw/*254.32*/("""
			"""),format.raw/*255.4*/("""var vehicleAllowBusiness1 = document.forms["myForm"]["vehicleAllowBusiness1"].value;
			if (!vehicleAllowBusiness1) """),format.raw/*256.32*/("""{"""),format.raw/*256.33*/("""
				"""),format.raw/*257.5*/("""document.getElementById('input_7002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*259.4*/("""}"""),format.raw/*259.5*/(""" """),format.raw/*259.6*/("""else """),format.raw/*259.11*/("""{"""),format.raw/*259.12*/("""
				"""),format.raw/*260.5*/("""document.getElementById("input_7002").innerHTML = "";
			"""),format.raw/*261.4*/("""}"""),format.raw/*261.5*/("""

			"""),format.raw/*263.4*/("""var vehicleAllowMY1 = document.forms["myForm"]["vehicleAllowMY1"].value;
			if (!vehicleAllowMY1) """),format.raw/*264.26*/("""{"""),format.raw/*264.27*/("""
				"""),format.raw/*265.5*/("""document.getElementById('input_7003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*267.4*/("""}"""),format.raw/*267.5*/(""" """),format.raw/*267.6*/("""else """),format.raw/*267.11*/("""{"""),format.raw/*267.12*/("""
				"""),format.raw/*268.5*/("""document.getElementById("input_7003").innerHTML = "";
			"""),format.raw/*269.4*/("""}"""),format.raw/*269.5*/("""

			"""),format.raw/*271.4*/("""var vehicleAllowPosition1 = document.forms["myForm"]["vehicleAllowPosition1"].value;
			if (!vehicleAllowPosition1) """),format.raw/*272.32*/("""{"""),format.raw/*272.33*/("""
				"""),format.raw/*273.5*/("""document.getElementById('input_7004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*275.4*/("""}"""),format.raw/*275.5*/(""" """),format.raw/*275.6*/("""else """),format.raw/*275.11*/("""{"""),format.raw/*275.12*/("""
				"""),format.raw/*276.5*/("""document.getElementById("input_7004").innerHTML = "";
			"""),format.raw/*277.4*/("""}"""),format.raw/*277.5*/("""
		"""),format.raw/*278.3*/("""}"""),format.raw/*278.4*/("""

		"""),format.raw/*280.3*/("""if (livingAllow == "true") """),format.raw/*280.30*/("""{"""),format.raw/*280.31*/("""
			"""),format.raw/*281.4*/("""var livingAllowBusiness1 = document.forms["myForm"]["livingAllowBusiness1"].value;
			if (!livingAllowBusiness1) """),format.raw/*282.31*/("""{"""),format.raw/*282.32*/("""
				"""),format.raw/*283.5*/("""document.getElementById('input_8002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*285.4*/("""}"""),format.raw/*285.5*/(""" """),format.raw/*285.6*/("""else """),format.raw/*285.11*/("""{"""),format.raw/*285.12*/("""
				"""),format.raw/*286.5*/("""document.getElementById("input_8002").innerHTML = "";
			"""),format.raw/*287.4*/("""}"""),format.raw/*287.5*/("""

			"""),format.raw/*289.4*/("""var livingAllowMY1 = document.forms["myForm"]["livingAllowMY1"].value;
			if (!livingAllowMY1) """),format.raw/*290.25*/("""{"""),format.raw/*290.26*/("""
				"""),format.raw/*291.5*/("""document.getElementById('input_8003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*293.4*/("""}"""),format.raw/*293.5*/(""" """),format.raw/*293.6*/("""else """),format.raw/*293.11*/("""{"""),format.raw/*293.12*/("""
				"""),format.raw/*294.5*/("""document.getElementById("input_8003").innerHTML = "";
			"""),format.raw/*295.4*/("""}"""),format.raw/*295.5*/("""

			"""),format.raw/*297.4*/("""var livingAllowPosition1 = document.forms["myForm"]["livingAllowPosition1"].value;
			if (!livingAllowPosition1) """),format.raw/*298.31*/("""{"""),format.raw/*298.32*/("""
				"""),format.raw/*299.5*/("""document.getElementById('input_8004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*301.4*/("""}"""),format.raw/*301.5*/(""" """),format.raw/*301.6*/("""else """),format.raw/*301.11*/("""{"""),format.raw/*301.12*/("""
				"""),format.raw/*302.5*/("""document.getElementById("input_8004").innerHTML = "";
			"""),format.raw/*303.4*/("""}"""),format.raw/*303.5*/("""
		"""),format.raw/*304.3*/("""}"""),format.raw/*304.4*/("""

		"""),format.raw/*306.3*/("""if (commission == "true") """),format.raw/*306.29*/("""{"""),format.raw/*306.30*/("""
			"""),format.raw/*307.4*/("""var commissionBusiness1 = document.forms["myForm"]["commissionBusiness1"].value;
			if (!commissionBusiness1) """),format.raw/*308.30*/("""{"""),format.raw/*308.31*/("""
				"""),format.raw/*309.5*/("""document.getElementById('input_9002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*311.4*/("""}"""),format.raw/*311.5*/(""" """),format.raw/*311.6*/("""else """),format.raw/*311.11*/("""{"""),format.raw/*311.12*/("""
				"""),format.raw/*312.5*/("""document.getElementById("input_9002").innerHTML = "";
			"""),format.raw/*313.4*/("""}"""),format.raw/*313.5*/("""

			"""),format.raw/*315.4*/("""var commissionMY1 = document.forms["myForm"]["commissionMY1"].value;
			if (!commissionMY1) """),format.raw/*316.24*/("""{"""),format.raw/*316.25*/("""
				"""),format.raw/*317.5*/("""document.getElementById('input_9003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*319.4*/("""}"""),format.raw/*319.5*/(""" """),format.raw/*319.6*/("""else """),format.raw/*319.11*/("""{"""),format.raw/*319.12*/("""
				"""),format.raw/*320.5*/("""document.getElementById("input_9003").innerHTML = "";
			"""),format.raw/*321.4*/("""}"""),format.raw/*321.5*/("""

			"""),format.raw/*323.4*/("""var commissionPosition1 = document.forms["myForm"]["commissionPosition1"].value;
			if (!commissionPosition1) """),format.raw/*324.30*/("""{"""),format.raw/*324.31*/("""
				"""),format.raw/*325.5*/("""document.getElementById('input_9004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*327.4*/("""}"""),format.raw/*327.5*/(""" """),format.raw/*327.6*/("""else """),format.raw/*327.11*/("""{"""),format.raw/*327.12*/("""
				"""),format.raw/*328.5*/("""document.getElementById("input_9004").innerHTML = "";
			"""),format.raw/*329.4*/("""}"""),format.raw/*329.5*/("""
		"""),format.raw/*330.3*/("""}"""),format.raw/*330.4*/("""
		"""),format.raw/*331.3*/("""if (bonus == "true") """),format.raw/*331.24*/("""{"""),format.raw/*331.25*/("""
			"""),format.raw/*332.4*/("""var bonusBusiness1 = document.forms["myForm"]["bonusBusiness1"].value;
			if (!bonusBusiness1) """),format.raw/*333.25*/("""{"""),format.raw/*333.26*/("""
				"""),format.raw/*334.5*/("""document.getElementById('input_1002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*336.4*/("""}"""),format.raw/*336.5*/(""" """),format.raw/*336.6*/("""else """),format.raw/*336.11*/("""{"""),format.raw/*336.12*/("""
				"""),format.raw/*337.5*/("""document.getElementById("input_1002").innerHTML = "";
			"""),format.raw/*338.4*/("""}"""),format.raw/*338.5*/("""

			"""),format.raw/*340.4*/("""var bonusMY1 = document.forms["myForm"]["bonusMY1"].value;
			if (!bonusMY1) """),format.raw/*341.19*/("""{"""),format.raw/*341.20*/("""
				"""),format.raw/*342.5*/("""document.getElementById('input_1003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*344.4*/("""}"""),format.raw/*344.5*/(""" """),format.raw/*344.6*/("""else """),format.raw/*344.11*/("""{"""),format.raw/*344.12*/("""
				"""),format.raw/*345.5*/("""document.getElementById("input_1003").innerHTML = "";
			"""),format.raw/*346.4*/("""}"""),format.raw/*346.5*/("""

			"""),format.raw/*348.4*/("""var bonusPosition1 = document.forms["myForm"]["bonusPosition1"].value;
			if (!bonusPosition1) """),format.raw/*349.25*/("""{"""),format.raw/*349.26*/("""
				"""),format.raw/*350.5*/("""document.getElementById('input_1004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*352.4*/("""}"""),format.raw/*352.5*/(""" """),format.raw/*352.6*/("""else """),format.raw/*352.11*/("""{"""),format.raw/*352.12*/("""
				"""),format.raw/*353.5*/("""document.getElementById("input_1004").innerHTML = "";
			"""),format.raw/*354.4*/("""}"""),format.raw/*354.5*/("""
		"""),format.raw/*355.3*/("""}"""),format.raw/*355.4*/("""

		"""),format.raw/*357.3*/("""if (other == "true") """),format.raw/*357.24*/("""{"""),format.raw/*357.25*/("""
			"""),format.raw/*358.4*/("""var otherBusiness1 = document.forms["myForm"]["otherBusiness1"].value;
			if (!otherBusiness1) """),format.raw/*359.25*/("""{"""),format.raw/*359.26*/("""
				"""),format.raw/*360.5*/("""document.getElementById('input_11002').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*362.4*/("""}"""),format.raw/*362.5*/(""" """),format.raw/*362.6*/("""else """),format.raw/*362.11*/("""{"""),format.raw/*362.12*/("""
				"""),format.raw/*363.5*/("""document.getElementById("input_11002").innerHTML = "";
			"""),format.raw/*364.4*/("""}"""),format.raw/*364.5*/("""

			"""),format.raw/*366.4*/("""var otherMY1 = document.forms["myForm"]["otherMY1"].value;
			if (!otherMY1) """),format.raw/*367.19*/("""{"""),format.raw/*367.20*/("""
				"""),format.raw/*368.5*/("""document.getElementById('input_11003').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*370.4*/("""}"""),format.raw/*370.5*/(""" """),format.raw/*370.6*/("""else """),format.raw/*370.11*/("""{"""),format.raw/*370.12*/("""
				"""),format.raw/*371.5*/("""document.getElementById("input_11003").innerHTML = "";
			"""),format.raw/*372.4*/("""}"""),format.raw/*372.5*/("""

			"""),format.raw/*374.4*/("""var otherPosition1 = document.forms["myForm"]["otherPosition1"].value;
			if (!otherPosition1) """),format.raw/*375.25*/("""{"""),format.raw/*375.26*/("""
				"""),format.raw/*376.5*/("""document.getElementById('input_11004').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*378.4*/("""}"""),format.raw/*378.5*/(""" """),format.raw/*378.6*/("""else """),format.raw/*378.11*/("""{"""),format.raw/*378.12*/("""
				"""),format.raw/*379.5*/("""document.getElementById("input_11004").innerHTML = "";
			"""),format.raw/*380.4*/("""}"""),format.raw/*380.5*/("""
		"""),format.raw/*381.3*/("""}"""),format.raw/*381.4*/("""

		"""),format.raw/*383.3*/("""var totalMonths = document.forms["myForm"]["totalMonths"].value;
		if (totalMonths < 36 && employee == "true") """),format.raw/*384.47*/("""{"""),format.raw/*384.48*/("""
			"""),format.raw/*385.4*/("""var empBusinessName2 = document.forms["myForm"]["empBusinessName2"].value;
			if (!empBusinessName2) """),format.raw/*386.27*/("""{"""),format.raw/*386.28*/("""
				"""),format.raw/*387.5*/("""document.getElementById('input_1106').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*389.4*/("""}"""),format.raw/*389.5*/(""" """),format.raw/*389.6*/("""else """),format.raw/*389.11*/("""{"""),format.raw/*389.12*/("""
				"""),format.raw/*390.5*/("""document.getElementById("input_1106").innerHTML = "";
			"""),format.raw/*391.4*/("""}"""),format.raw/*391.5*/("""
			"""),format.raw/*392.4*/("""var empStartMonth2 = document.forms["myForm"]["empStartMonth2"].value;
			if (!empStartMonth2) """),format.raw/*393.25*/("""{"""),format.raw/*393.26*/("""
				"""),format.raw/*394.5*/("""document.getElementById('input_1107').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*396.4*/("""}"""),format.raw/*396.5*/(""" """),format.raw/*396.6*/("""else """),format.raw/*396.11*/("""{"""),format.raw/*396.12*/("""
				"""),format.raw/*397.5*/("""document.getElementById("input_1107").innerHTML = "";
			"""),format.raw/*398.4*/("""}"""),format.raw/*398.5*/("""

			"""),format.raw/*400.4*/("""var empPosition2 = document.forms["myForm"]["empPosition2"].value;
			if (!empPosition2) """),format.raw/*401.23*/("""{"""),format.raw/*401.24*/("""
				"""),format.raw/*402.5*/("""document.getElementById('input_1108').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*404.4*/("""}"""),format.raw/*404.5*/(""" """),format.raw/*404.6*/("""else """),format.raw/*404.11*/("""{"""),format.raw/*404.12*/("""
				"""),format.raw/*405.5*/("""document.getElementById("input_1108").innerHTML = "";
			"""),format.raw/*406.4*/("""}"""),format.raw/*406.5*/("""

			"""),format.raw/*408.4*/("""var totalMonths2 = document.forms["myForm"]["totalMonths2"].value;
			if (totalMonths2 < 36) """),format.raw/*409.27*/("""{"""),format.raw/*409.28*/("""
				"""),format.raw/*410.5*/("""var empBusinessName3 = document.forms["myForm"]["empBusinessName3"].value;
				if (!empBusinessName3) """),format.raw/*411.28*/("""{"""),format.raw/*411.29*/("""
					"""),format.raw/*412.6*/("""document.getElementById('input_1110').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					return false;
				"""),format.raw/*414.5*/("""}"""),format.raw/*414.6*/(""" """),format.raw/*414.7*/("""else """),format.raw/*414.12*/("""{"""),format.raw/*414.13*/("""
					"""),format.raw/*415.6*/("""document.getElementById("input_1110").innerHTML = "";
				"""),format.raw/*416.5*/("""}"""),format.raw/*416.6*/("""

				"""),format.raw/*418.5*/("""var empStartMonth3 = document.forms["myForm"]["empStartMonth3"].value;

				if (!empStartMonth3) """),format.raw/*420.26*/("""{"""),format.raw/*420.27*/("""
					"""),format.raw/*421.6*/("""document.getElementById('input_1111').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					return false;
				"""),format.raw/*423.5*/("""}"""),format.raw/*423.6*/(""" """),format.raw/*423.7*/("""else """),format.raw/*423.12*/("""{"""),format.raw/*423.13*/("""
					"""),format.raw/*424.6*/("""document.getElementById("input_1111").innerHTML = "";
				"""),format.raw/*425.5*/("""}"""),format.raw/*425.6*/("""
				"""),format.raw/*426.5*/("""var empPosition3 = document.forms["myForm"]["empPosition3"].value;
				if (!empPosition3) """),format.raw/*427.24*/("""{"""),format.raw/*427.25*/("""
					"""),format.raw/*428.6*/("""document.getElementById('input_1112').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					return false;
				"""),format.raw/*430.5*/("""}"""),format.raw/*430.6*/(""" """),format.raw/*430.7*/("""else """),format.raw/*430.12*/("""{"""),format.raw/*430.13*/("""
					"""),format.raw/*431.6*/("""document.getElementById("input_1112").innerHTML = "";
				"""),format.raw/*432.5*/("""}"""),format.raw/*432.6*/("""
			"""),format.raw/*433.4*/("""}"""),format.raw/*433.5*/("""
		"""),format.raw/*434.3*/("""}"""),format.raw/*434.4*/("""

		"""),format.raw/*436.3*/("""var monthsum1 = document.forms["myForm"]["monthsum1"].value;
		if (monthsum1 < 36 && selfEmployed == "true") """),format.raw/*437.49*/("""{"""),format.raw/*437.50*/("""
			"""),format.raw/*438.4*/("""var selfBusinessName2 = document.forms["myForm"]["selfBusinessName2"].value;
			if (!selfBusinessName2) """),format.raw/*439.28*/("""{"""),format.raw/*439.29*/("""
				"""),format.raw/*440.5*/("""document.getElementById('input_1122').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*442.4*/("""}"""),format.raw/*442.5*/(""" """),format.raw/*442.6*/("""else """),format.raw/*442.11*/("""{"""),format.raw/*442.12*/("""
				"""),format.raw/*443.5*/("""document.getElementById("input_1122").innerHTML = "";
			"""),format.raw/*444.4*/("""}"""),format.raw/*444.5*/("""

			"""),format.raw/*446.4*/("""var selfStartMon2 = document.forms["myForm"]["selfStartMon2"].value;
			if (!selfStartMon2) """),format.raw/*447.24*/("""{"""),format.raw/*447.25*/("""
				"""),format.raw/*448.5*/("""document.getElementById('input_1123').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*450.4*/("""}"""),format.raw/*450.5*/(""" """),format.raw/*450.6*/("""else """),format.raw/*450.11*/("""{"""),format.raw/*450.12*/("""
				"""),format.raw/*451.5*/("""document.getElementById("input_1123").innerHTML = "";
			"""),format.raw/*452.4*/("""}"""),format.raw/*452.5*/("""

			"""),format.raw/*454.4*/("""var selfPosition2 = document.forms["myForm"]["selfPosition2"].value;
			if (!selfPosition2) """),format.raw/*455.24*/("""{"""),format.raw/*455.25*/("""
				"""),format.raw/*456.5*/("""document.getElementById('input_1124').innerHTML = "<span style='color:red'>*This field is Required.</span>";
				return false;
			"""),format.raw/*458.4*/("""}"""),format.raw/*458.5*/(""" """),format.raw/*458.6*/("""else """),format.raw/*458.11*/("""{"""),format.raw/*458.12*/("""
				"""),format.raw/*459.5*/("""document.getElementById("input_1124").innerHTML = "";
			"""),format.raw/*460.4*/("""}"""),format.raw/*460.5*/("""
			"""),format.raw/*461.4*/("""var selfTotal2 = document.forms["myForm"]["selfemployemonthsumTotal2"].value;
			if (selfTotal2 < 36) """),format.raw/*462.25*/("""{"""),format.raw/*462.26*/("""
				"""),format.raw/*463.5*/("""var selfBusinessName3 = document.forms["myForm"]["selfBusinessName3"].value;
				if (!selfBusinessName3) """),format.raw/*464.29*/("""{"""),format.raw/*464.30*/("""
					"""),format.raw/*465.6*/("""document.getElementById('input_1126').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					return false;
				"""),format.raw/*467.5*/("""}"""),format.raw/*467.6*/(""" """),format.raw/*467.7*/("""else """),format.raw/*467.12*/("""{"""),format.raw/*467.13*/("""
					"""),format.raw/*468.6*/("""document.getElementById("input_1126").innerHTML = "";
				"""),format.raw/*469.5*/("""}"""),format.raw/*469.6*/("""

				"""),format.raw/*471.5*/("""var selfStartMon3 = document.forms["myForm"]["selfStartMon3"].value;
				if (!selfStartMon3) """),format.raw/*472.25*/("""{"""),format.raw/*472.26*/("""
					"""),format.raw/*473.6*/("""document.getElementById('input_1127').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					return false;
				"""),format.raw/*475.5*/("""}"""),format.raw/*475.6*/(""" """),format.raw/*475.7*/("""else """),format.raw/*475.12*/("""{"""),format.raw/*475.13*/("""
					"""),format.raw/*476.6*/("""document.getElementById("input_1127").innerHTML = "";
				"""),format.raw/*477.5*/("""}"""),format.raw/*477.6*/("""

				"""),format.raw/*479.5*/("""var selfPosition3 = document.forms["myForm"]["selfPosition3"].value;
				if (!selfPosition3) """),format.raw/*480.25*/("""{"""),format.raw/*480.26*/("""
					"""),format.raw/*481.6*/("""document.getElementById('input_1128').innerHTML = "<span style='color:red'>*This field is Required.</span>";
					return false;
				"""),format.raw/*483.5*/("""}"""),format.raw/*483.6*/(""" """),format.raw/*483.7*/("""else """),format.raw/*483.12*/("""{"""),format.raw/*483.13*/("""
					"""),format.raw/*484.6*/("""document.getElementById("input_1128").innerHTML = "";
				"""),format.raw/*485.5*/("""}"""),format.raw/*485.6*/("""

			"""),format.raw/*487.4*/("""}"""),format.raw/*487.5*/("""
		"""),format.raw/*488.3*/("""}"""),format.raw/*488.4*/("""

		"""),format.raw/*490.3*/("""return true;
	"""),format.raw/*491.2*/("""}"""),format.raw/*491.3*/("""
"""),format.raw/*492.1*/("""</script>

<script>
	$(function() """),format.raw/*495.15*/("""{"""),format.raw/*495.16*/("""
		"""),format.raw/*496.3*/("""$("#geocomplete").geocomplete("""),format.raw/*496.33*/("""{"""),format.raw/*496.34*/("""
			"""),format.raw/*497.4*/("""map : ".map_canvas",
			details : "form",
			types : [ "geocode", "establishment" ],
		"""),format.raw/*500.3*/("""}"""),format.raw/*500.4*/(""");

		$("#find").click(function() """),format.raw/*502.31*/("""{"""),format.raw/*502.32*/("""
			"""),format.raw/*503.4*/("""$("#geocomplete").trigger("geocode");
		"""),format.raw/*504.3*/("""}"""),format.raw/*504.4*/(""");
	"""),format.raw/*505.2*/("""}"""),format.raw/*505.3*/(""");
</script>
<script>
	$(function() """),format.raw/*508.15*/("""{"""),format.raw/*508.16*/("""
		"""),format.raw/*509.3*/("""$("#geocomplete1").geocomplete("""),format.raw/*509.34*/("""{"""),format.raw/*509.35*/("""
			"""),format.raw/*510.4*/("""map : ".map_canvas",
			details : "form",
			types : [ "geocode", "establishment" ],
		"""),format.raw/*513.3*/("""}"""),format.raw/*513.4*/(""");

		$("#find").click(function() """),format.raw/*515.31*/("""{"""),format.raw/*515.32*/("""
			"""),format.raw/*516.4*/("""$("#geocomplete1").trigger("geocode");
		"""),format.raw/*517.3*/("""}"""),format.raw/*517.4*/(""");
	"""),format.raw/*518.2*/("""}"""),format.raw/*518.3*/(""");
</script>

<style type="text/css">
.regular-checkbox """),format.raw/*522.19*/("""{"""),format.raw/*522.20*/("""
	"""),format.raw/*523.2*/("""-webkit-appearance: none;
	background-color: #fafafa;
	border: 1px solid #cacece;
	box-shadow: 0 1px 2px rgba(0, 0, 0, 0.05), inset 0px -15px 10px -12px
		rgba(0, 0, 0, 0.05);
	padding: 9px;
	border-radius: 3px;
	display: inline-block;
	position: relative;
"""),format.raw/*532.1*/("""}"""),format.raw/*532.2*/("""

"""),format.raw/*534.1*/(""".big-checkbox """),format.raw/*534.15*/("""{"""),format.raw/*534.16*/("""
	"""),format.raw/*535.2*/("""padding: 18px;
"""),format.raw/*536.1*/("""}"""),format.raw/*536.2*/("""

"""),format.raw/*538.1*/(""".big-checkbox:checked:after """),format.raw/*538.29*/("""{"""),format.raw/*538.30*/("""
	"""),format.raw/*539.2*/("""font-size: 28px;
	left: 6px;
"""),format.raw/*541.1*/("""}"""),format.raw/*541.2*/("""

"""),format.raw/*543.1*/(""".btn """),format.raw/*543.6*/("""{"""),format.raw/*543.7*/("""
	"""),format.raw/*544.2*/("""border: 0 none;
	font-weight: bold;
"""),format.raw/*546.1*/("""}"""),format.raw/*546.2*/("""

"""),format.raw/*548.1*/(""".btn-primary:active,.btn-primary.active """),format.raw/*548.41*/("""{"""),format.raw/*548.42*/("""
	"""),format.raw/*549.2*/("""background: #003f80;
	color: #ffffff;
	box-shadow: none;
"""),format.raw/*552.1*/("""}"""),format.raw/*552.2*/("""
"""),format.raw/*553.1*/("""</style>
<!-- <script>
$(function() """),format.raw/*555.14*/("""{"""),format.raw/*555.15*/("""
	"""),format.raw/*556.2*/("""$('.date-picker').datepicker( """),format.raw/*556.32*/("""{"""),format.raw/*556.33*/("""
	    """),format.raw/*557.6*/("""changeMonth: true,
	    changeYear: true,
	    showButtonPanel: true,
	    dateFormat: 'MM yy',
	    onClose: function(dateText, inst) """),format.raw/*561.40*/("""{"""),format.raw/*561.41*/(""" 
	        """),format.raw/*562.10*/("""var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
	        var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
	        $(this).datepicker('setDate', new Date(year, month, 1));
	    """),format.raw/*565.6*/("""}"""),format.raw/*565.7*/("""
	"""),format.raw/*566.2*/("""}"""),format.raw/*566.3*/(""");
	"""),format.raw/*567.2*/("""}"""),format.raw/*567.3*/(""");
</script> -->


<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->
</head>
<body>
	<br>
	<br>
	<div style="width: 97%">
		<form name="myForm" action="mortgagePage8" method="POST"
			onsubmit="return validateForm()">
			<input type="hidden" value="uniid" name="uniid"> <input
				type="hidden" name="empStartMon1"
				value=""""),_display_(/*582.13*/employeeIncome/*582.27*/.getStartMonth1),format.raw/*582.42*/(""""> <input type="hidden"
				name="empStartMon51" value=""""),_display_(/*583.34*/employeeIncome/*583.48*/.getStartMonth11),format.raw/*583.64*/("""">
			<input type="hidden" name="empStartMon52"
				value=""""),_display_(/*585.13*/employeeIncome/*585.27*/.getStartMonth21),format.raw/*585.43*/(""""> <input
				type="hidden" name="monthWorked1"
				value=""""),_display_(/*587.13*/employeeIncome/*587.27*/.getMonthsWorked1),format.raw/*587.44*/(""""> <input
				type="hidden" name="monthWorked2"
				value=""""),_display_(/*589.13*/employeeIncome/*589.27*/.getMonthTotal11),format.raw/*589.43*/(""""> <input
				type="hidden" name="monthWorked3"
				value=""""),_display_(/*591.13*/employeeIncome/*591.27*/.getStartMonth21),format.raw/*591.43*/(""""> <input
				type="hidden" name="selfStartMon1"
				value=""""),_display_(/*593.13*/selfEmployeeIncome/*593.31*/.getStartMonth21),format.raw/*593.47*/(""""> <input
				type="hidden" name="selfStartMon212"
				value=""""),_display_(/*595.13*/selfEmployeeIncome/*595.31*/.getStartMonth22),format.raw/*595.47*/(""""> <input
				type="hidden" name="selfStartMon213"
				value=""""),_display_(/*597.13*/selfEmployeeIncome/*597.31*/.getStartMonth23),format.raw/*597.47*/(""""> <input
				type="hidden" name="selfMonthWorked1"
				value=""""),_display_(/*599.13*/selfEmployeeIncome/*599.31*/.getMonthsWorked21),format.raw/*599.49*/(""""> <input
				type="hidden" name="selfMonthWorked2"
				value=""""),_display_(/*601.13*/selfEmployeeIncome/*601.31*/.getMonthTotal22),format.raw/*601.47*/(""""> <input
				type="hidden" name="selfMonthWorked3"
				value=""""),_display_(/*603.13*/selfEmployeeIncome/*603.31*/.getMonthsWorked23),format.raw/*603.49*/("""">
			<div class="row"></div>
			<div class="row">
				<div class="col-sm-3"></div>
				<div class="col-sm-7 container-bg text-color-blue">

					<div align="left"
						style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
						<img alt="Visdom Logo" height="65" width="210"
							src=""""),_display_(/*612.14*/routes/*612.20*/.Assets.at(" _resources/visdom-logo.png")),format.raw/*612.61*/("""" />
					</div>
					<div style="padding-top: 30px"></div>
					<div data-ng-app="demoApp" style="margin-left: 5%">
						<div ng-controller="DemoController" ng-init="isDisabled = false">
							<div></div>

							"""),_display_(/*619.9*/if(employeeIncome !=null && employeeIncome.isEmployed)/*619.63*/{_display_(Seq[Any](format.raw/*619.64*/("""
							"""),format.raw/*620.8*/("""<div ng-init="checkModel.Employee=true"></div>
							""")))}),format.raw/*621.9*/(""" """),_display_(/*621.11*/if(selfEmployeeIncome !=null &&
							selfEmployeeIncome.isSelfEmployed)/*622.42*/{_display_(Seq[Any](format.raw/*622.43*/("""
							"""),format.raw/*623.8*/("""<div ng-init="checkModel.SelfEmployed=true"></div>
							""")))}),format.raw/*624.9*/("""





							"""),format.raw/*630.8*/("""<div id="input_204" style="position: absolute;"></div>
							<input type="hidden" name="incomeTypes[]"
								value=""""),format.raw/*632.16*/("""{"""),format.raw/*632.17*/("""{"""),format.raw/*632.18*/("""checkResults"""),format.raw/*632.30*/("""}"""),format.raw/*632.31*/("""}"""),format.raw/*632.32*/(""""> <input type="hidden"
								name="employee" value=""""),format.raw/*633.32*/("""{"""),format.raw/*633.33*/("""{"""),format.raw/*633.34*/("""checkModel.Employee"""),format.raw/*633.53*/("""}"""),format.raw/*633.54*/("""}"""),format.raw/*633.55*/("""" /> <input
								type="hidden" name="selfEmployed"
								value=""""),format.raw/*635.16*/("""{"""),format.raw/*635.17*/("""{"""),format.raw/*635.18*/("""checkModel.SelfEmployed"""),format.raw/*635.41*/("""}"""),format.raw/*635.42*/("""}"""),format.raw/*635.43*/("""" /> <input type="hidden"
								name="pension" value=""""),format.raw/*636.31*/("""{"""),format.raw/*636.32*/("""{"""),format.raw/*636.33*/("""checkModel.Pension"""),format.raw/*636.51*/("""}"""),format.raw/*636.52*/("""}"""),format.raw/*636.53*/("""" /> <input
								type="hidden" name="investments"
								value=""""),format.raw/*638.16*/("""{"""),format.raw/*638.17*/("""{"""),format.raw/*638.18*/("""checkModel.Investments"""),format.raw/*638.40*/("""}"""),format.raw/*638.41*/("""}"""),format.raw/*638.42*/("""" /> <input type="hidden"
								name="maternity" value=""""),format.raw/*639.33*/("""{"""),format.raw/*639.34*/("""{"""),format.raw/*639.35*/("""checkModel.Maternity"""),format.raw/*639.55*/("""}"""),format.raw/*639.56*/("""}"""),format.raw/*639.57*/("""" /> <input
								type="hidden" name="vehicleAllow"
								value=""""),format.raw/*641.16*/("""{"""),format.raw/*641.17*/("""{"""),format.raw/*641.18*/("""checkModel.VehicleAllow"""),format.raw/*641.41*/("""}"""),format.raw/*641.42*/("""}"""),format.raw/*641.43*/("""" /> <input type="hidden"
								name="livingAllow" value=""""),format.raw/*642.35*/("""{"""),format.raw/*642.36*/("""{"""),format.raw/*642.37*/("""checkModel.LivingAllow"""),format.raw/*642.59*/("""}"""),format.raw/*642.60*/("""}"""),format.raw/*642.61*/("""" /> <input
								type="hidden" name="commission"
								value=""""),format.raw/*644.16*/("""{"""),format.raw/*644.17*/("""{"""),format.raw/*644.18*/("""checkModel.Commission"""),format.raw/*644.39*/("""}"""),format.raw/*644.40*/("""}"""),format.raw/*644.41*/("""" /> <input type="hidden"
								name="bonus" value=""""),format.raw/*645.29*/("""{"""),format.raw/*645.30*/("""{"""),format.raw/*645.31*/("""checkModel.Bonus"""),format.raw/*645.47*/("""}"""),format.raw/*645.48*/("""}"""),format.raw/*645.49*/("""" /> <input
								type="hidden" name="other" value=""""),format.raw/*646.43*/("""{"""),format.raw/*646.44*/("""{"""),format.raw/*646.45*/("""checkModel.Other"""),format.raw/*646.61*/("""}"""),format.raw/*646.62*/("""}"""),format.raw/*646.63*/("""" /> <br>


							<label class="labelfont">"""),_display_(/*649.34*/applicantName),format.raw/*649.47*/("""</label><br>
							<br> <label class="labelfont"> Are you an employee
								with a company which deducts your income tax?<span
								style="color: red; font-size: 3">*</span>
							</label><br>


							<div class="col-xs-6 col-sm-5 btn-group"
								style="width: 100%; padding-left: 0%;">
								<label style="width: 20%;" class="btn btn-primary labelfont"
									btn-radio="'yes'" ng-change="change()"
									ng-model="checkEmployee.areUemploye"> Yes </label> <label
									style="width: 20%; border-radius: 0px 5px 5px 0px;"
									class="btn btn-primary labelfont" btn-radio="'no'"
									ng-change="change()" ng-model="checkEmployee.areUemploye">
									No </label> <br> <br>
								<div id="input_4107" style="position: absolute;"></div>
							</div>
							<input type="hidden" name="areYouEmploye"
								value=""""),format.raw/*668.16*/("""{"""),format.raw/*668.17*/("""{"""),format.raw/*668.18*/("""checkEmployee.areUemploye"""),format.raw/*668.43*/("""}"""),format.raw/*668.44*/("""}"""),format.raw/*668.45*/("""" ng-required> <br>
							<br>

							<div ng-if="checkEmployee.areUemploye == 'yes'">
								<table cellspacing="200px">
									<tr>
										<th width="17%"><b>Type of Income:</b></th>
										<th width="43%"><b>Business:</b></th>
										<th width="15%"><b>Start Month:</b></th>
										<th width="25%"><b>Position:</b></th>
									</tr>
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
											ng-model="empFirstMonYear" ng-selected="employe1(this)"
											style="width: 100%; position: relative; z-index: 100000;"
											class="form-control"></td>
										<td width="25%"><input type="text" name="empPosition"
											placeholder="E.g. Manager" class="form-control"
											style="width: 100%;" value=""></td>
									</tr>

									<tr ng-if="employeecount>=1">
										<td width="17%"><input type="text" name="empIncomeTypes"
											placeholder="E.g. Employer" class="form-control"
											value="Employed" style="width: 100%;" readonly="readonly">
										</td>
										<td width="43%"><input type="text" name="empBusinessName"
											placeholder="E.g. Business Name" style="width: 100%;"
											class="form-control" value=""></td>
										<td width="15%"><input type="text" id="datepicker1"
											name="empStartMonth" id="empSecMonYear" placeholder="mm/dd/yyyy"
											ng-model="empSecMonYear" ng-selected="employe1(this)"
											style="width: 100%; position: relative; z-index: 100000;"
											class="form-control"></td>
										<td width="25%"><input type="text" name="empPosition"
											placeholder="E.g. Manager" class="form-control"
											style="width: 100%;" value=""></td>
									</tr>

									<tr ng-if="employeecount>1">
										<td width="17%"><input type="text" name="empIncomeTypes"
											placeholder="E.g. Employer" class="form-control"
											value="Employed" style="width: 100%;" readonly="readonly">
										</td>
										<td width="43%"><input type="text" name="empBusinessName"
											placeholder="E.g. Business Name" style="width: 100%;"
											class="form-control" value=""></td>
										<td width="15%"><input type="text" id="datepicker2"
											name="empStartMonth" placeholder="mm/dd/yyyy"
											ng-model="empThirdMonYear" ng-selected="employe1(this)"
											style="width: 100%; position: relative; z-index: 100000;"
											class="form-control"></td>
										<td width="25%"><input type="text" name="empPosition"
											placeholder="E.g. Manager" class="form-control"
											style="width: 100%;" value=""></td>
									</tr>

								</table>
								<a style="padding-left: 4%; font-size: 20; color: black"
									href="#" target="blank" ng-click="addemploye()"> Add
									Additional Job</a>

							</div>

							<label class="labelfont"> Do you own a business where you
								pay your own taxes?<span style="color: red; font-size: 3">*</span>
							</label><br>
							<div class="col-xs-6 col-sm-5 btn-group"
								style="width: 100%; padding-left: 0%;">
								<label style="width: 20%;" class="btn btn-primary labelfont"
									btn-radio="'yes'" ng-change="change()"
									ng-model="checkSelfEmployee.areUSelfEmploye"> Yes </label> <label
									style="width: 20%; border-radius: 0px 5px 5px 0px;"
									class="btn btn-primary labelfont" btn-radio="'no'"
									ng-change="change()"
									ng-model="checkSelfEmployee.areUSelfEmploye"> No </label> <br>
								<br>
								<div id="input_4107" style="position: absolute;"></div>
							</div>
							<input type="hidden" name="areYouEmploye"
								value=""""),format.raw/*756.16*/("""{"""),format.raw/*756.17*/("""{"""),format.raw/*756.18*/("""checkSelfEmployee.areUSelfEmploye"""),format.raw/*756.51*/("""}"""),format.raw/*756.52*/("""}"""),format.raw/*756.53*/("""" ng-required>
							<br> self Employe : """),format.raw/*757.28*/("""{"""),format.raw/*757.29*/("""{"""),format.raw/*757.30*/("""checkSelfEmployee.areUSelfEmploye"""),format.raw/*757.63*/("""}"""),format.raw/*757.64*/("""}"""),format.raw/*757.65*/("""
							"""),format.raw/*758.8*/("""<div ng-if="checkSelfEmployee.areUSelfEmploye == 'yes' ">
								<br>
								<table>

									<tr>
										<th width="17%"><b>Type of Income:</b></th>
										<th width="43%"><b>Business:</b></th>
										<th width="15%"><b>Start Month:</b></th>
										<th width="25%"><b>Position:</b></th>
									</tr>
									<tr>
										<td width="20%"><input type="text"
											name="selfIncomeTypes2" placeholder="E.g. Self-Employed"
											style="width: 100%;" class="form-control"
											value="Self Employed" readonly="readonly"></td>
										<td width="38%"><input type="text"
											name="selfBusinessName2" placeholder="E.g. Business Name"
											style="width: 100%;" class="form-control"
											value=""""),_display_(/*776.20*/selfEmployeeIncome/*776.38*/.getBusiness22),format.raw/*776.52*/(""""></td>
										<td width="22%"><input type="text" id="datepicker3"
											name="selfStartMon2" placeholder="mm/dd/yyyy"
											ng-model="slfempFirstMonYear" ng-selected="employe2(this)"
											style="width: 100%; position: relative; z-index: 100000;"
											class="form-control"></td>
										<td width="18%"><input type="text" name="selfPosition2"
											placeholder="E.g. Manager" style="width: 100%;"
											class="form-control"
											value=""""),_display_(/*785.20*/selfEmployeeIncome/*785.38*/.getPosition22),format.raw/*785.52*/(""""></td>
									</tr>

									<tr ng-if="slefemployeecount>=1">
										<td width="20%"><input type="text"
											name="selfIncomeTypes2" placeholder="E.g. Self-Employed"
											style="width: 100%;" class="form-control"
											value="Self Employed" readonly="readonly"></td>
										<td width="38%"><input type="text"
											name="selfBusinessName2" placeholder="E.g. Business Name"
											style="width: 100%;" class="form-control"
											value=""""),_display_(/*796.20*/selfEmployeeIncome/*796.38*/.getBusiness22),format.raw/*796.52*/(""""></td>
										<td width="22%"><input type="text" id="datepicker4"
											name="selfStartMon2" placeholder="mm/dd/yyyy"
											ng-model="slfsecMonYears" ng-selected="employe2(this)"
											style="width: 100%; position: relative; z-index: 100000;"
											class="form-control"></td>
										<td width="18%"><input type="text" name="selfPosition2"
											placeholder="E.g. Manager" style="width: 100%;"
											class="form-control"
											value=""""),_display_(/*805.20*/selfEmployeeIncome/*805.38*/.getPosition22),format.raw/*805.52*/(""""></td>
									</tr>

									<tr ng-if="slefemployeecount>1">
										<td width="20%"><input type="text"
											name="selfIncomeTypes2" placeholder="E.g. Self-Employed"
											style="width: 100%;" class="form-control"
											value="Self Employed" readonly="readonly"></td>
										<td width="38%"><input type="text"
											name="selfBusinessName2" placeholder="E.g. Business Name"
											style="width: 100%;" class="form-control"
											value=""""),_display_(/*816.20*/selfEmployeeIncome/*816.38*/.getBusiness22),format.raw/*816.52*/(""""></td>
										<td width="22%"><input type="text" id="datepicker5"
											name="selfStartMon2" placeholder="mm/dd/yyyy"
											ng-model="slfThirdMonYears" ng-selected="employe2(this)"
											style="width: 100%; position: relative; z-index: 100000;"
											class="form-control"></td>
										<td width="18%"><input type="text" name="selfPosition2"
											placeholder="E.g. Manager" style="width: 100%;"
											class="form-control"
											value=""""),_display_(/*825.20*/selfEmployeeIncome/*825.38*/.getPosition22),format.raw/*825.52*/(""""></td>
									</tr>
								</table>

								<a style="padding-left: 4%; font-size: 20; color: black"
									href="#" target="blank" ng-click="addslefemploye()"> Add
									Additional Job</a>
							</div>

employe one :"""),format.raw/*834.14*/("""{"""),format.raw/*834.15*/("""{"""),format.raw/*834.16*/("""employetotal1 """),format.raw/*834.30*/("""}"""),format.raw/*834.31*/("""}"""),format.raw/*834.32*/("""<br>
employe two :"""),format.raw/*835.14*/("""{"""),format.raw/*835.15*/("""{"""),format.raw/*835.16*/("""employetotal2 """),format.raw/*835.30*/("""}"""),format.raw/*835.31*/("""}"""),format.raw/*835.32*/("""<br>
employe three :"""),format.raw/*836.16*/("""{"""),format.raw/*836.17*/("""{"""),format.raw/*836.18*/("""employetotal3"""),format.raw/*836.31*/("""}"""),format.raw/*836.32*/("""}"""),format.raw/*836.33*/("""<br>
 Employe Total Exp :"""),format.raw/*837.21*/("""{"""),format.raw/*837.22*/("""{"""),format.raw/*837.23*/("""employetotal"""),format.raw/*837.35*/("""}"""),format.raw/*837.36*/("""}"""),format.raw/*837.37*/("""

"""),format.raw/*839.1*/("""employe one :"""),format.raw/*839.14*/("""{"""),format.raw/*839.15*/("""{"""),format.raw/*839.16*/("""slfemployetotal1 """),format.raw/*839.33*/("""}"""),format.raw/*839.34*/("""}"""),format.raw/*839.35*/("""<br>
employe two :"""),format.raw/*840.14*/("""{"""),format.raw/*840.15*/("""{"""),format.raw/*840.16*/("""slfemployetotal2 """),format.raw/*840.33*/("""}"""),format.raw/*840.34*/("""}"""),format.raw/*840.35*/("""<br>
employe three :"""),format.raw/*841.16*/("""{"""),format.raw/*841.17*/("""{"""),format.raw/*841.18*/("""slfemployetotal3"""),format.raw/*841.34*/("""}"""),format.raw/*841.35*/("""}"""),format.raw/*841.36*/("""<br>
 Employe Total Exp :"""),format.raw/*842.21*/("""{"""),format.raw/*842.22*/("""{"""),format.raw/*842.23*/("""selfemployetotal"""),format.raw/*842.39*/("""}"""),format.raw/*842.40*/("""}"""),format.raw/*842.41*/("""


"""),format.raw/*845.1*/("""Total Wxp """),format.raw/*845.11*/("""{"""),format.raw/*845.12*/("""{"""),format.raw/*845.13*/("""employetotal+selfemployetotal"""),format.raw/*845.42*/("""}"""),format.raw/*845.43*/("""}"""),format.raw/*845.44*/("""
							"""),format.raw/*846.8*/("""<div
								ng-show="(employetotal+selfemployetotal)< 36 && (checkEmployee.areUemploye == 'yes' ||  checkSelfEmployee.areUSelfEmploye == 'yes') ">
								<h4 style="padding-left: 0%;">
									<Strong>Work History </Strong>
								</h4>
								<hr
									style="width: 96%; border-color: #006699; margin-top: 0%; margin-bottom: 0%;" />
								<label class="labelfont">In most cases lenders require
									three years of employment history and more options will be
									available for those with longer employment histories. They do
									realize that there are exceptions however. Some of these might
									be if you are a home maker, have part time or seasonal work,
									student, on maternity leave, have a disability etc</label>

								<table>
									<tr>
										<td width="20%"><input type="text" name="empIncomeTypes2"
											placeholder="E.g. Employer" style="width: 100%;"
											class="form-control" value="Employed" readonly="readonly">
										</td>
										<td width="38%"><input type="text"
											name="empBusinessName2" placeholder="E.g. Business Name"
											style="width: 100%;" class="form-control"
											value=""""),_display_(/*869.20*/employeeIncome/*869.34*/.getBusiness11),format.raw/*869.48*/(""""></td>
										<td width="22%"><input type="text" name="empStartMonth2"
											placeholder="mm/dd/yyyy" id="datepicker"
											ng-model="empSecMonYear" ng-selected="employe1(this)"
											style="width: 100%; position: relative; z-index: 100000;"
											class="form-control"></td>
										<td width="18%"><input type="text" name="empPosition2"
											placeholder="E.g. Manager" style="width: 100%;"
											class="form-control" value=""""),_display_(/*877.41*/employeeIncome/*877.55*/.getPosition11),format.raw/*877.69*/("""">
										</td>
									</tr>

								</table>
								<input type="hidden" name="monthsum11" ng-model="employetotal2"
									value=""""),format.raw/*883.17*/("""{"""),format.raw/*883.18*/("""{"""),format.raw/*883.19*/("""employetotal2-employetotal1"""),format.raw/*883.46*/("""}"""),format.raw/*883.47*/("""}"""),format.raw/*883.48*/(""""> <input
									type="hidden" name="totalMonths2" ng-model="employetotal2"
									value=""""),format.raw/*885.17*/("""{"""),format.raw/*885.18*/("""{"""),format.raw/*885.19*/("""employetotal2"""),format.raw/*885.32*/("""}"""),format.raw/*885.33*/("""}"""),format.raw/*885.34*/("""">
								<div ng-show="employetotal2< 36">
									<br>
									<table>
										<tr>
											<td width="20%"><input type="text"
												name="empIncomeTypes3" placeholder="E.g. Employer"
												style="width: 100%;" class="form-control" value="Employed"
												readonly="readonly"></td>
											<td width="38%"><input type="text"
												name="empBusinessName3" placeholder="E.g. Business Name"
												style="width: 100%;" class="form-control"
												value=""""),_display_(/*897.21*/employeeIncome/*897.35*/.getBusiness21),format.raw/*897.49*/(""""></td>
											<td width="22%"><input type="text" name="empStartMonth3"
												id="datepicker" placeholder="mm/dd/yyyy"
												ng-model="empThirdMonYear" ng-selected="employe1()"
												style="width: 100%; position: relative; z-index: 100000;"
												class="form-control"></td>
											<td width="18%"><input type="text" name="empPosition3"
												placeholder="E.g. Manager" style="width: 100%;"
												class="form-control" value=""""),_display_(/*905.42*/employeeIncome/*905.56*/.getPosition21),format.raw/*905.70*/("""">
											</td>
										</tr>
										<tr>
											<td><div id="input_1109"></div></td>
											<td><div id="input_1110"></div></td>
											<td><div id="input_1111"></div></td>
											<td><div id="input_1112"></div></td>
										</tr>
									</table>
									<input type="hidden" name="monthsum33" ng-model="employetotal2"
										value=""""),format.raw/*916.18*/("""{"""),format.raw/*916.19*/("""{"""),format.raw/*916.20*/("""employetotal3-employetotal2"""),format.raw/*916.47*/("""}"""),format.raw/*916.48*/("""}"""),format.raw/*916.49*/(""""> <input
										type="hidden" name="totalMonths3" ng-model="employetotal3"
										value=""""),format.raw/*918.18*/("""{"""),format.raw/*918.19*/("""{"""),format.raw/*918.20*/("""employetotal3"""),format.raw/*918.33*/("""}"""),format.raw/*918.34*/("""}"""),format.raw/*918.35*/("""">
								</div>
							</div>

<br>
<br>

							<div>

								<label class="labelfont"> If you don't have three years
									experience and think you might be in one of these exception
									groups, please check the box to continue. <span
									style="color: red; font-size: 3">*</span>
								</label><br>
								<div class="col-sm-4" style="padding-left: 0%;">
									<div class="switch demo3 col-sm-4">
										<input type="checkbox" name="agree"> <label
											style="border-style: inset; border-color: black; height: 85%; width: 30%"><i></i></label>
									</div>
								</div>
							</div>



							<br>
							<div class="row" style="width: 100%;">
								<div class="col-sm-6"
									style="float: left; padding-left: 2%; width: 50%;">
									<a href="mortgageBackPage7" class="btn btn-primary"
										role="button" style="width: 50%;">Back</a>
								</div>
								<div class="col-sm-6" align="right"
									style="float: right; padding-right: 5%; width: 50%;">
									<input type="submit" class="btn btn-primary btn-block"
										value="Next" style="width: 50%;">
									<div align="right" id="submiterror">
										<font color="red"></font>
									</div>
								</div>
							</div>
							<br>
							<link rel="stylesheet"
								href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
							<!-- <script src="//code.jquery.com/jquery-1.10.2.js"></script> -->
							<!-- <script type="text/javascript" src="jquery-ui.js" ></script> -->
							<script src=""""),_display_(/*963.22*/routes/*963.28*/.Assets.at("_resources/jquery-ui.js")),format.raw/*963.65*/("""" type="text/javascript"></script>
							<link rel="stylesheet" href="/resources/demos/style.css">
							<!-- <p>Date: <input type="text" id="datepicker7"></p> -->
							<!-- <p>Date: <input type="text" id="datepicker6"></p> -->

						</div>
						<br>
						<div class="container" style="width: 70%;">
							<div class="progress">
								<div class="progress-bar" role="progressbar" aria-valuenow="70"
									aria-valuemin="0" aria-valuemax="100"
									style="width: 70%; background-color: #6AA84F;">
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
		$(function() """),format.raw/*989.16*/("""{"""),format.raw/*989.17*/("""
			"""),format.raw/*990.4*/("""$.mask.definitions['~'] = "[+-]";

			$("#phonedatata").mask("999-999-9999");
		"""),format.raw/*993.3*/("""}"""),format.raw/*993.4*/(""");
	</script>

	<script>
		$(document).ready(function() """),format.raw/*997.32*/("""{"""),format.raw/*997.33*/("""
			"""),format.raw/*998.4*/("""$('[data-toggle="tooltip"]').tooltip();
		"""),format.raw/*999.3*/("""}"""),format.raw/*999.4*/(""");
	</script>

	<script
		src="https://maps.googleapis.com/maps/api/Are you Self-Employed?js?sensor=false&amp;libraries=places"></script>

	<script src="jquery.geocomplete.js"></script>

	<script type="text/javascript">
		var app = angular.module("demoApp", [ 'ui.bootstrap' ]);
		app
				.controller(
						'DemoController',
						function($scope) """),format.raw/*1012.24*/("""{"""),format.raw/*1012.25*/("""
							"""),format.raw/*1013.8*/("""$scope.employeecount = 0;
							$scope.slefemployeecount = 0;
							$scope.empSecMonYear = null;
							$scope.employetotal = 0;
							$scope.selfemployetotal = 0;
							$scope.sumemployetotal = 0;
								init();
							function init() """),format.raw/*1020.24*/("""{"""),format.raw/*1020.25*/("""
								"""),format.raw/*1021.9*/("""$scope.newItemType = '';
								$scope.company = "";

								var empStartMon111 = document.forms["myForm"]["monthWorked1"].value;
								if (empStartMon111 != "")
									$scope.employetotal1 = empStartMon111;

								var empStartMon112 = document.forms["myForm"]["monthWorked2"].value;
								if (empStartMon112 != "")
									$scope.employetotal2 = empStartMon112;

								var empStartMon113 = document.forms["myForm"]["monthWorked3"].value;
								if (empStartMon113 != "")
									$scope.employetotal3 = empStartMon113;

								var empStartMon411 = document.forms["myForm"]["selfMonthWorked1"].value;
								if (empStartMon411 != "")
									$scope.slfemployetotal1 = empStartMon411;

								var empStartMon412 = document.forms["myForm"]["selfMonthWorked2"].value;
								if (empStartMon412 != "")
									$scope.slfemployetotal2 = empStartMon412;

								var empStartMon413 = document.forms["myForm"]["selfMonthWorked3"].value;
								if (empStartMon413 != "")
									$scope.slfemployetotal3 = empStartMon413;

								$scope.change = function() """),format.raw/*1048.36*/("""{"""),format.raw/*1048.37*/("""
									"""),format.raw/*1049.10*/("""console.log($scope.newItemType)
								"""),format.raw/*1050.9*/("""}"""),format.raw/*1050.10*/(""";
							"""),format.raw/*1051.8*/("""}"""),format.raw/*1051.9*/("""

							"""),format.raw/*1053.8*/("""$scope.addemploye = function($scope) """),format.raw/*1053.45*/("""{"""),format.raw/*1053.46*/("""
								"""),format.raw/*1054.9*/("""var count = 0;

								if (count < 3) """),format.raw/*1056.24*/("""{"""),format.raw/*1056.25*/("""
									"""),format.raw/*1057.10*/("""var count = this.employeecount + 1;
									this.employeecount = count;
								"""),format.raw/*1059.9*/("""}"""),format.raw/*1059.10*/("""

							"""),format.raw/*1061.8*/("""}"""),format.raw/*1061.9*/("""
							"""),format.raw/*1062.8*/("""$scope.addslefemploye = function() """),format.raw/*1062.43*/("""{"""),format.raw/*1062.44*/("""
								"""),format.raw/*1063.9*/("""var count = 0;

								if (count < 3) """),format.raw/*1065.24*/("""{"""),format.raw/*1065.25*/("""
									"""),format.raw/*1066.10*/("""var count = this.slefemployeecount + 1;
									this.slefemployeecount = count;
								"""),format.raw/*1068.9*/("""}"""),format.raw/*1068.10*/("""

							"""),format.raw/*1070.8*/("""}"""),format.raw/*1070.9*/("""
							"""),format.raw/*1071.8*/("""var total = 0;

							var date2ms = null;
							$scope.employe1 = function($scope) """),format.raw/*1074.43*/("""{"""),format.raw/*1074.44*/("""

								"""),format.raw/*1076.9*/("""$("#datepicker0").datepicker("""),format.raw/*1076.38*/("""{"""),format.raw/*1076.39*/("""
									"""),format.raw/*1077.10*/("""changeMonth : true,
									changeYear : true,
									onSelect : function(date) """),format.raw/*1079.36*/("""{"""),format.raw/*1079.37*/("""
										"""),format.raw/*1080.11*/("""$scope.empFirstMonYear = date;

										$scope.$apply(function($scope) """),format.raw/*1082.42*/("""{"""),format.raw/*1082.43*/("""
											"""),format.raw/*1083.12*/("""// Change binded variable
											$scope.assign($scope, date);
										"""),format.raw/*1085.11*/("""}"""),format.raw/*1085.12*/(""");

									"""),format.raw/*1087.10*/("""}"""),format.raw/*1087.11*/("""

								"""),format.raw/*1089.9*/("""}"""),format.raw/*1089.10*/(""");
								
								$("#datepicker1").datepicker("""),format.raw/*1091.38*/("""{"""),format.raw/*1091.39*/("""
									"""),format.raw/*1092.10*/("""changeMonth : true,
									changeYear : true,
									onSelect : function(date) """),format.raw/*1094.36*/("""{"""),format.raw/*1094.37*/("""
										"""),format.raw/*1095.11*/("""$scope.empSecMonYear = date;
										$scope.$apply(function($scope) """),format.raw/*1096.42*/("""{"""),format.raw/*1096.43*/("""
											"""),format.raw/*1097.12*/("""// Change binded variable
											$scope.assign($scope, date);
										"""),format.raw/*1099.11*/("""}"""),format.raw/*1099.12*/(""");
									"""),format.raw/*1100.10*/("""}"""),format.raw/*1100.11*/("""

								"""),format.raw/*1102.9*/("""}"""),format.raw/*1102.10*/(""");
								
								$("#datepicker2").datepicker("""),format.raw/*1104.38*/("""{"""),format.raw/*1104.39*/("""

									"""),format.raw/*1106.10*/("""changeMonth : true,
									changeYear : true,
									onSelect : function(date) """),format.raw/*1108.36*/("""{"""),format.raw/*1108.37*/("""
										"""),format.raw/*1109.11*/("""$scope.empThirdMonYear = date;
										$scope.$apply(function($scope) """),format.raw/*1110.42*/("""{"""),format.raw/*1110.43*/("""
											"""),format.raw/*1111.12*/("""// Change binded variable
											$scope.assign($scope, date);
										"""),format.raw/*1113.11*/("""}"""),format.raw/*1113.12*/(""");
										
									"""),format.raw/*1115.10*/("""}"""),format.raw/*1115.11*/("""

								"""),format.raw/*1117.9*/("""}"""),format.raw/*1117.10*/(""");
								
								$("#datepicker3").datepicker("""),format.raw/*1119.38*/("""{"""),format.raw/*1119.39*/("""
									"""),format.raw/*1120.10*/("""changeMonth : true,
									changeYear : true,
									onSelect : function(date) """),format.raw/*1122.36*/("""{"""),format.raw/*1122.37*/("""
										"""),format.raw/*1123.11*/("""$scope.slfempFirstMonYear = date;

										$scope.$apply(function($scope) """),format.raw/*1125.42*/("""{"""),format.raw/*1125.43*/("""
											"""),format.raw/*1126.12*/("""// Change binded variable
											$scope.assign($scope, date);
										"""),format.raw/*1128.11*/("""}"""),format.raw/*1128.12*/(""");

									"""),format.raw/*1130.10*/("""}"""),format.raw/*1130.11*/("""

								"""),format.raw/*1132.9*/("""}"""),format.raw/*1132.10*/(""");

								$("#datepicker4").datepicker("""),format.raw/*1134.38*/("""{"""),format.raw/*1134.39*/("""
									"""),format.raw/*1135.10*/("""changeMonth : true,
									changeYear : true,
									onSelect : function(date) """),format.raw/*1137.36*/("""{"""),format.raw/*1137.37*/("""
										"""),format.raw/*1138.11*/("""$scope.slfsecMonYears = date;

										$scope.$apply(function($scope) """),format.raw/*1140.42*/("""{"""),format.raw/*1140.43*/("""
											"""),format.raw/*1141.12*/("""// Change binded variable
											$scope.assign($scope, date);
										"""),format.raw/*1143.11*/("""}"""),format.raw/*1143.12*/(""");

									"""),format.raw/*1145.10*/("""}"""),format.raw/*1145.11*/("""

								"""),format.raw/*1147.9*/("""}"""),format.raw/*1147.10*/(""");

								$("#datepicker5").datepicker("""),format.raw/*1149.38*/("""{"""),format.raw/*1149.39*/("""
									"""),format.raw/*1150.10*/("""changeMonth : true,
									changeYear : true,
									onSelect : function(date) """),format.raw/*1152.36*/("""{"""),format.raw/*1152.37*/("""
										"""),format.raw/*1153.11*/("""$scope.slfThirdMonYears = date;

										$scope.$apply(function($scope) """),format.raw/*1155.42*/("""{"""),format.raw/*1155.43*/("""
											"""),format.raw/*1156.12*/("""// Change binded variable
											$scope.assign($scope, date);
										"""),format.raw/*1158.11*/("""}"""),format.raw/*1158.12*/(""");

									"""),format.raw/*1160.10*/("""}"""),format.raw/*1160.11*/("""

								"""),format.raw/*1162.9*/("""}"""),format.raw/*1162.10*/(""");
								
								$("#datepicker6").datepicker("""),format.raw/*1164.38*/("""{"""),format.raw/*1164.39*/("""
									"""),format.raw/*1165.10*/("""changeMonth : true,
									changeYear : true,
									onSelect : function(date) """),format.raw/*1167.36*/("""{"""),format.raw/*1167.37*/("""
										"""),format.raw/*1168.11*/("""$scope.sixdateExp = date;

										$scope.$apply(function($scope) """),format.raw/*1170.42*/("""{"""),format.raw/*1170.43*/("""
											"""),format.raw/*1171.12*/("""// Change binded variable
											$scope.assign($scope, date);
										"""),format.raw/*1173.11*/("""}"""),format.raw/*1173.12*/(""");

									"""),format.raw/*1175.10*/("""}"""),format.raw/*1175.11*/("""

								"""),format.raw/*1177.9*/("""}"""),format.raw/*1177.10*/(""");
								
								$("#datepicker7").datepicker("""),format.raw/*1179.38*/("""{"""),format.raw/*1179.39*/("""
									"""),format.raw/*1180.10*/("""changeMonth : true,
									changeYear : true,
									onSelect : function(date) """),format.raw/*1182.36*/("""{"""),format.raw/*1182.37*/("""
										"""),format.raw/*1183.11*/("""$scope.sevendateExp = date;

										$scope.$apply(function($scope) """),format.raw/*1185.42*/("""{"""),format.raw/*1185.43*/("""
											"""),format.raw/*1186.12*/("""// Change binded variable
											$scope.assign($scope, date);
										"""),format.raw/*1188.11*/("""}"""),format.raw/*1188.12*/(""");

									"""),format.raw/*1190.10*/("""}"""),format.raw/*1190.11*/("""

								"""),format.raw/*1192.9*/("""}"""),format.raw/*1192.10*/(""");

								var employee="";
								try"""),format.raw/*1195.12*/("""{"""),format.raw/*1195.13*/("""
									"""),format.raw/*1196.10*/("""employee=$scope.checkEmployee.areUemploye;
								"""),format.raw/*1197.9*/("""}"""),format.raw/*1197.10*/("""catch(err)"""),format.raw/*1197.20*/("""{"""),format.raw/*1197.21*/("""
									"""),format.raw/*1198.10*/("""console.log("error to get employe value "+err);
								"""),format.raw/*1199.9*/("""}"""),format.raw/*1199.10*/("""
								
								"""),format.raw/*1201.9*/("""if( employee== 'yes')"""),format.raw/*1201.30*/("""{"""),format.raw/*1201.31*/("""
									"""),format.raw/*1202.10*/("""console.log("inside  employee ")

								console.log("EmployeFirst  Month date  "
										+$scope.empFirstMonYear);

								var one = $scope.empFirstMonYear;
								var date = one.split("/");
								var oneDate = date[0] + "/1/" + date[2];

								var today = new Date();
								var datevDate = new Date(oneDate);

								var one_day = 1000 * 60 * 60 * 24;
								var date1ms = today.getTime();
							 	date2ms = datevDate.getTime();

								var totmili = date1ms - date2ms;
								var totalDays = Math.round(totmili / one_day);
								var totalMonths = Math
										.abs((totmili / one_day) / 30);

								 total = Math.floor(totalMonths);
								$scope.employetotal1 = total;
								$scope.employetotal=total;
								console.log("EmployeFirst  Month total "
										+ total);
								console.log("EmployeSecond Date  "
										+ $scope.empSecMonYear);
								if( $scope.empSecMonYear!=null)"""),format.raw/*1230.40*/("""{"""),format.raw/*1230.41*/("""
				
								"""),format.raw/*1232.9*/("""console.log("Date of First Employee :  "+date2ms);
								 one = $scope.empSecMonYear;
								 date = one.split("/");
								oneDate = date[0] + "/1/" + date[2];
								 datevDate = new Date(oneDate);

								 one_day = 1000 * 60 * 60 * 24;
								 date1ms =date2ms;
								date2ms = datevDate.getTime();
								console.log("Date of second  Employee :  "+date2ms);
								console.log("Date deference of First and Second Employee  :  "+(date1ms - date2ms));

								 totmili = date1ms - date2ms;

								if (isNaN(totmili) == false) """),format.raw/*1246.38*/("""{"""),format.raw/*1246.39*/("""
									"""),format.raw/*1247.10*/("""totalDays = Math.round(totmili
											/ one_day);

								 totalMonths = Math
											.abs((totmili / one_day) / 30);
								 
							
									$scope.employetotal2 = Math.floor(totalMonths);

									console.log("Employesecond Month total "
											+ $scope.employetotal2);
								total = total + Math.floor(totalMonths);

									console.log("Employesecond+first Month total "
											+ total);
									$scope.employetotal=total;
									console.log("Employe Month total "
											+ $scope.employetotal);
									
									
									if($scope.empThirdMonYear!=null)"""),format.raw/*1267.42*/("""{"""),format.raw/*1267.43*/("""
										"""),format.raw/*1268.11*/("""console.log("inside Employe Three ");

										
									var one = $scope.empThirdMonYear;
									console.log("EmployeThird Month Date  "
											+ one)
									var date = one.split("/");
									var oneDate = date[0] + "/1/" + date[2];
									var datevDate = new Date(oneDate);

									var one_day = 1000 * 60 * 60 * 24;
									var date1ms = date2ms;
									date2ms = datevDate.getTime();

									var totmili = date1ms - date2ms;
									if (isNaN(totmili) == false) """),format.raw/*1283.39*/("""{"""),format.raw/*1283.40*/("""

										"""),format.raw/*1285.11*/("""var totalDays = Math.round(totmili
												/ one_day);
										var totalMonths = Math
												.abs((totmili / one_day) / 30);
									 total = Math.floor(total)
												+ Math.floor(totalMonths);

										$scope.employetotal3 = Math.floor(totalMonths);
										
												$scope.employetotal=total;
										console.log("Employe last Month total "
												+ $scope.employetotal);
									"""),format.raw/*1297.10*/("""}"""),format.raw/*1297.11*/("""
								"""),format.raw/*1298.9*/("""}"""),format.raw/*1298.10*/("""

								"""),format.raw/*1300.9*/("""}"""),format.raw/*1300.10*/("""

							"""),format.raw/*1302.8*/("""}"""),format.raw/*1302.9*/("""
								"""),format.raw/*1303.9*/("""}"""),format.raw/*1303.10*/("""
								"""),format.raw/*1304.9*/("""var selfemployee="";
								try"""),format.raw/*1305.12*/("""{"""),format.raw/*1305.13*/("""
									"""),format.raw/*1306.10*/("""selfemployee=$scope.checkSelfEmployee.areUSelfEmploye;
								"""),format.raw/*1307.9*/("""}"""),format.raw/*1307.10*/("""catch(err)"""),format.raw/*1307.20*/("""{"""),format.raw/*1307.21*/("""
									"""),format.raw/*1308.10*/("""console.log("error to get employe value "+err);
								"""),format.raw/*1309.9*/("""}"""),format.raw/*1309.10*/("""
								
								
								"""),format.raw/*1312.9*/("""if(selfemployee == 'yes')"""),format.raw/*1312.34*/("""{"""),format.raw/*1312.35*/("""
									"""),format.raw/*1313.10*/("""console.log("inside self employee ");
									
									var one = $scope.slfempFirstMonYear;
									var date = one.split("/");
									var oneDate = date[0] + "/1/" + date[2];

									var today = new Date();
									var datevDate = new Date(oneDate);

									var one_day = 1000 * 60 * 60 * 24;
									var date1ms = today.getTime();
									var date2ms = datevDate.getTime();

									var totmili = date1ms - date2ms;
									var totalDays = Math.round(totmili / one_day);
									var totalMonths = Math
											.abs((totmili / one_day) / 30);

									total = Math.floor(totalMonths);

									$scope.slfemployetotal1 = total;
									console.log("$scope.employetotal : "+$scope.selfemployetotal);

									$scope.selfemployetotal=total;
									console.log("First self Employe : "+$scope.slfemployetotal1);
								console.log("Total EXp  : "+$scope.selfemployetotal);

									if ($scope.slfsecMonYears!=null) """),format.raw/*1340.43*/("""{"""),format.raw/*1340.44*/("""
										"""),format.raw/*1341.11*/("""one = $scope.slfsecMonYears;
										date = one.split("/");
										oneDate = date[0] + "/1/" + date[2];
										datevDate = new Date(oneDate);

										one_day = 1000 * 60 * 60 * 24;
										date1ms = date2ms;

										date2ms = datevDate.getTime();

										totmili = date1ms - date2ms;

										if (isNaN(totmili) == false) """),format.raw/*1353.40*/("""{"""),format.raw/*1353.41*/("""
											"""),format.raw/*1354.12*/("""totalDays = Math.round(totmili
													/ one_day);

											totalMonths = Math
													.abs((totmili / one_day) / 30);
																					total = total + Math.floor(totalMonths);

											$scope.slfemployetotal2 = totalMonths;
											$scope.selfemployetotal=total;
											console.log("Second self Employe : "+totalMonths);
											console.log("Total EXp  : "+$scope.selfemployetotal);
											console.log("$scope.slfthirdMonYear  : "+$scope.slfThirdMonYears);

											if ($scope.slfThirdMonYears!=null) """),format.raw/*1367.47*/("""{"""),format.raw/*1367.48*/("""

												"""),format.raw/*1369.13*/("""one = $scope.slfThirdMonYears;
												date = one.split("/");
												oneDate = date[0] + "/1/" + date[2];
												datevDate = new Date(oneDate);

												one_day = 1000 * 60 * 60 * 24;
												date1ms = date2ms;
												date2ms = datevDate.getTime();

												totmili = date1ms - date2ms;
												if (isNaN(totmili) == false) """),format.raw/*1379.42*/("""{"""),format.raw/*1379.43*/("""

													"""),format.raw/*1381.14*/("""totalDays = Math.round(totmili
															/ one_day);
													totalMonths = Math
															.abs((totmili / one_day) / 30);

													total =total
															+ Math
																	.floor(totalMonths);

													$scope.slfemployetotal3 = 	totalMonths;
													$scope.selfemployetotal=total;

													console.log("Third self Employe : "+$scope.slfemployetotal3);
													console.log("Total EXp  : "+total);

												"""),format.raw/*1396.13*/("""}"""),format.raw/*1396.14*/("""
											"""),format.raw/*1397.12*/("""}"""),format.raw/*1397.13*/("""
										"""),format.raw/*1398.11*/("""}"""),format.raw/*1398.12*/("""
									"""),format.raw/*1399.10*/("""}"""),format.raw/*1399.11*/("""
									
								"""),format.raw/*1401.9*/("""}"""),format.raw/*1401.10*/("""
								
								"""),format.raw/*1403.9*/("""if(($scope.selfemployetotal+$scope.employetotal)<36)"""),format.raw/*1403.61*/("""{"""),format.raw/*1403.62*/("""
									
									"""),format.raw/*1405.10*/("""var one = $scope.sixdateExp;
									var date = one.split("/");
									var oneDate = date[0] + "/1/" + date[2];

									var today = new Date();
									var datevDate = new Date(oneDate);

									var one_day = 1000 * 60 * 60 * 24;
									var date1ms = today.getTime();
									var date2ms = datevDate.getTime();

									var totmili = date1ms - date2ms;
									var totalDays = Math.round(totmili / one_day);
									var totalMonths = Math
											.abs((totmili / one_day) / 30);

									total = Math.floor(totalMonths);

									$scope.sixemployetotal = total;
									console.log("$scope.sixemployetotal : "+$scope.sixemployetotal);

									$scope.sumemployetotal=total;
								console.log("Total EXp  : "+$scope.sumemployetotal);
								if ($scope.sevendateExp!=null) """),format.raw/*1428.40*/("""{"""),format.raw/*1428.41*/("""

									"""),format.raw/*1430.10*/("""one = $scope.sevendateExp;
									date = one.split("/");
									oneDate = date[0] + "/1/" + date[2];
									datevDate = new Date(oneDate);

									one_day = 1000 * 60 * 60 * 24;
									date1ms = date2ms;
									date2ms = datevDate.getTime();

									totmili = date1ms - date2ms;
									if (isNaN(totmili) == false) """),format.raw/*1440.39*/("""{"""),format.raw/*1440.40*/("""

										"""),format.raw/*1442.11*/("""totalDays = Math.round(totmili
												/ one_day);
										totalMonths = Math
												.abs((totmili / one_day) / 30);

										total =total
												+ Math
														.floor(totalMonths);

										$scope.sevenemployetotal = 	totalMonths;
										$scope.sumemployetotal=total;

										console.log("sevenemployetotal : "+$scope.sevenemployetotal);
										console.log("Total EXp  : "+$scope.sumemployetotal);

									"""),format.raw/*1457.10*/("""}"""),format.raw/*1457.11*/("""
								"""),format.raw/*1458.9*/("""}"""),format.raw/*1458.10*/("""
								"""),format.raw/*1459.9*/("""}"""),format.raw/*1459.10*/("""
								
								
							"""),format.raw/*1462.8*/("""}"""),format.raw/*1462.9*/(""";
							

							$scope.singleModel = 1;

							$scope.checkModel = """),format.raw/*1467.28*/("""{"""),format.raw/*1467.29*/("""
								"""),format.raw/*1468.9*/("""Employee : false,
								SelfEmployed : false,
								Pension : false,
								Investments : false,
								Maternity : false,
								VehicleAllow : false,
								LivingAllow : false,
								Commission : false,
								Bonus : false,
								Other : false
							"""),format.raw/*1478.8*/("""}"""),format.raw/*1478.9*/(""";

							$scope.checkResults = [];

							$scope.$watchCollection('checkModel', function() """),format.raw/*1482.57*/("""{"""),format.raw/*1482.58*/("""
								"""),format.raw/*1483.9*/("""$scope.checkResults = [];
								angular.forEach($scope.checkModel, function(
										value, key) """),format.raw/*1485.23*/("""{"""),format.raw/*1485.24*/("""
									"""),format.raw/*1486.10*/("""if (value) """),format.raw/*1486.21*/("""{"""),format.raw/*1486.22*/("""
										"""),format.raw/*1487.11*/("""$scope.checkResults.push(key);
									"""),format.raw/*1488.10*/("""}"""),format.raw/*1488.11*/("""
								"""),format.raw/*1489.9*/("""}"""),format.raw/*1489.10*/(""");
							"""),format.raw/*1490.8*/("""}"""),format.raw/*1490.9*/(""");
						"""),format.raw/*1491.7*/("""}"""),format.raw/*1491.8*/(""");
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
                  DATE: Mon May 16 20:16:23 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage8Duplicate.scala.html
                  HASH: 4e8d180fd4680a9d3d76af52ded41ac9110f56fd
                  MATRIX: 996->1|1545->462|1572->463|2182->1046|2197->1052|2260->1094|2303->1110|2318->1116|2380->1157|2465->1215|2480->1221|2540->1260|2616->1309|2631->1315|2686->1349|2762->1398|2777->1404|2835->1441|2898->1477|2913->1483|2970->1519|3226->1748|3241->1754|3306->1798|3359->1824|3374->1830|3441->1876|3746->2153|3775->2154|3805->2157|3857->2182|3885->2183|3946->2216|3975->2217|4005->2220|4061->2248|4090->2249|4121->2253|4180->2285|4208->2286|4239->2290|4267->2291|4368->2364|4397->2365|4427->2368|4472->2386|4500->2387|4556->2415|4585->2416|4616->2420|6655->4432|6683->4433|6711->4434|6808->4502|6838->4503|6870->4507|7809->5417|7839->5418|7871->5422|8026->5549|8055->5550|8084->5551|8118->5556|8148->5557|8180->5561|8263->5616|8292->5617|8324->5621|8377->5645|8407->5646|8439->5650|8566->5748|8596->5749|8629->5754|8787->5884|8816->5885|8845->5886|8879->5891|8909->5892|8942->5897|9027->5954|9056->5955|9089->5960|9210->6052|9240->6053|9273->6058|9431->6188|9460->6189|9489->6190|9523->6195|9553->6196|9586->6201|9671->6258|9700->6259|9733->6264|9848->6350|9878->6351|9911->6356|10069->6486|10098->6487|10127->6488|10161->6493|10191->6494|10224->6499|10309->6556|10338->6557|10369->6560|10398->6561|10430->6565|10487->6593|10517->6594|10549->6598|10679->6699|10709->6700|10742->6705|10900->6835|10929->6836|10958->6837|10992->6842|11022->6843|11055->6848|11140->6905|11169->6906|11202->6911|11320->7000|11350->7001|11383->7006|11541->7136|11570->7137|11599->7138|11633->7143|11663->7144|11696->7149|11781->7206|11810->7207|11843->7212|11961->7301|11991->7302|12024->7307|12182->7437|12211->7438|12240->7439|12274->7444|12304->7445|12337->7450|12422->7507|12451->7508|12483->7512|12512->7513|12543->7516|12595->7539|12625->7540|12657->7544|12787->7645|12817->7646|12850->7651|13008->7781|13037->7782|13066->7783|13100->7788|13130->7789|13163->7794|13248->7851|13277->7852|13310->7857|13422->7940|13452->7941|13485->7946|13643->8076|13672->8077|13701->8078|13735->8083|13765->8084|13798->8089|13883->8146|13912->8147|13945->8152|14075->8253|14105->8254|14138->8259|14296->8389|14325->8390|14354->8391|14388->8396|14418->8397|14451->8402|14536->8459|14565->8460|14596->8463|14625->8464|14656->8467|14712->8494|14742->8495|14774->8499|14913->8609|14943->8610|14976->8615|15134->8745|15163->8746|15192->8747|15226->8752|15256->8753|15289->8758|15374->8815|15403->8816|15436->8821|15560->8916|15590->8917|15623->8922|15781->9052|15810->9053|15839->9054|15873->9059|15903->9060|15936->9065|16021->9122|16050->9123|16083->9128|16222->9238|16252->9239|16285->9244|16443->9374|16472->9375|16501->9376|16535->9381|16565->9382|16598->9387|16683->9444|16712->9445|16743->9448|16772->9449|16804->9453|16858->9478|16888->9479|16920->9483|17056->9590|17086->9591|17119->9596|17277->9726|17306->9727|17335->9728|17369->9733|17399->9734|17432->9739|17517->9796|17546->9797|17579->9802|17697->9891|17727->9892|17760->9897|17918->10027|17947->10028|17976->10029|18010->10034|18040->10035|18073->10040|18158->10097|18187->10098|18220->10103|18356->10210|18386->10211|18419->10216|18577->10346|18606->10347|18635->10348|18669->10353|18699->10354|18732->10359|18817->10416|18846->10417|18877->10420|18906->10421|18938->10425|18995->10453|19025->10454|19057->10458|19202->10574|19232->10575|19265->10580|19423->10710|19452->10711|19481->10712|19515->10717|19545->10718|19578->10723|19663->10780|19692->10781|19725->10786|19852->10884|19882->10885|19915->10890|20073->11020|20102->11021|20131->11022|20165->11027|20195->11028|20228->11033|20313->11090|20342->11091|20375->11096|20520->11212|20550->11213|20583->11218|20741->11348|20770->11349|20799->11350|20833->11355|20863->11356|20896->11361|20981->11418|21010->11419|21041->11422|21070->11423|21102->11427|21158->11454|21188->11455|21220->11459|21362->11572|21392->11573|21425->11578|21583->11708|21612->11709|21641->11710|21675->11715|21705->11716|21738->11721|21823->11778|21852->11779|21885->11784|22009->11879|22039->11880|22072->11885|22230->12015|22259->12016|22288->12017|22322->12022|22352->12023|22385->12028|22470->12085|22499->12086|22532->12091|22674->12204|22704->12205|22737->12210|22895->12340|22924->12341|22953->12342|22987->12347|23017->12348|23050->12353|23135->12410|23164->12411|23195->12414|23224->12415|23256->12419|23311->12445|23341->12446|23373->12450|23512->12560|23542->12561|23575->12566|23733->12696|23762->12697|23791->12698|23825->12703|23855->12704|23888->12709|23973->12766|24002->12767|24035->12772|24156->12864|24186->12865|24219->12870|24377->13000|24406->13001|24435->13002|24469->13007|24499->13008|24532->13013|24617->13070|24646->13071|24679->13076|24818->13186|24848->13187|24881->13192|25039->13322|25068->13323|25097->13324|25131->13329|25161->13330|25194->13335|25279->13392|25308->13393|25339->13396|25368->13397|25399->13400|25449->13421|25479->13422|25511->13426|25635->13521|25665->13522|25698->13527|25856->13657|25885->13658|25914->13659|25948->13664|25978->13665|26011->13670|26096->13727|26125->13728|26158->13733|26264->13810|26294->13811|26327->13816|26485->13946|26514->13947|26543->13948|26577->13953|26607->13954|26640->13959|26725->14016|26754->14017|26787->14022|26911->14117|26941->14118|26974->14123|27132->14253|27161->14254|27190->14255|27224->14260|27254->14261|27287->14266|27372->14323|27401->14324|27432->14327|27461->14328|27493->14332|27543->14353|27573->14354|27605->14358|27729->14453|27759->14454|27792->14459|27951->14590|27980->14591|28009->14592|28043->14597|28073->14598|28106->14603|28192->14661|28221->14662|28254->14667|28360->14744|28390->14745|28423->14750|28582->14881|28611->14882|28640->14883|28674->14888|28704->14889|28737->14894|28823->14952|28852->14953|28885->14958|29009->15053|29039->15054|29072->15059|29231->15190|29260->15191|29289->15192|29323->15197|29353->15198|29386->15203|29472->15261|29501->15262|29532->15265|29561->15266|29593->15270|29733->15381|29763->15382|29795->15386|29925->15487|29955->15488|29988->15493|30146->15623|30175->15624|30204->15625|30238->15630|30268->15631|30301->15636|30386->15693|30415->15694|30447->15698|30571->15793|30601->15794|30634->15799|30792->15929|30821->15930|30850->15931|30884->15936|30914->15937|30947->15942|31032->15999|31061->16000|31094->16005|31212->16094|31242->16095|31275->16100|31433->16230|31462->16231|31491->16232|31525->16237|31555->16238|31588->16243|31673->16300|31702->16301|31735->16306|31857->16399|31887->16400|31920->16405|32051->16507|32081->16508|32115->16514|32275->16646|32304->16647|32333->16648|32367->16653|32397->16654|32431->16660|32517->16718|32546->16719|32580->16725|32706->16822|32736->16823|32770->16829|32930->16961|32959->16962|32988->16963|33022->16968|33052->16969|33086->16975|33172->17033|33201->17034|33234->17039|33353->17129|33383->17130|33417->17136|33577->17268|33606->17269|33635->17270|33669->17275|33699->17276|33733->17282|33819->17340|33848->17341|33880->17345|33909->17346|33940->17349|33969->17350|34001->17354|34139->17463|34169->17464|34201->17468|34334->17572|34364->17573|34397->17578|34555->17708|34584->17709|34613->17710|34647->17715|34677->17716|34710->17721|34795->17778|34824->17779|34857->17784|34978->17876|35008->17877|35041->17882|35199->18012|35228->18013|35257->18014|35291->18019|35321->18020|35354->18025|35439->18082|35468->18083|35501->18088|35622->18180|35652->18181|35685->18186|35843->18316|35872->18317|35901->18318|35935->18323|35965->18324|35998->18329|36083->18386|36112->18387|36144->18391|36275->18493|36305->18494|36338->18499|36472->18604|36502->18605|36536->18611|36696->18743|36725->18744|36754->18745|36788->18750|36818->18751|36852->18757|36938->18815|36967->18816|37001->18822|37123->18915|37153->18916|37187->18922|37347->19054|37376->19055|37405->19056|37439->19061|37469->19062|37503->19068|37589->19126|37618->19127|37652->19133|37774->19226|37804->19227|37838->19233|37998->19365|38027->19366|38056->19367|38090->19372|38120->19373|38154->19379|38240->19437|38269->19438|38302->19443|38331->19444|38362->19447|38391->19448|38423->19452|38465->19466|38494->19467|38523->19468|38586->19502|38616->19503|38647->19506|38706->19536|38736->19537|38768->19541|38883->19628|38912->19629|38975->19663|39005->19664|39037->19668|39105->19708|39134->19709|39166->19713|39195->19714|39260->19750|39290->19751|39321->19754|39381->19785|39411->19786|39443->19790|39558->19877|39587->19878|39650->19912|39680->19913|39712->19917|39781->19958|39810->19959|39842->19963|39871->19964|39956->20020|39986->20021|40016->20023|40301->20280|40330->20281|40360->20283|40403->20297|40433->20298|40463->20300|40506->20315|40535->20316|40565->20318|40622->20346|40652->20347|40682->20349|40739->20378|40768->20379|40798->20381|40831->20386|40860->20387|40890->20389|40954->20425|40983->20426|41013->20428|41082->20468|41112->20469|41142->20471|41227->20528|41256->20529|41285->20530|41350->20566|41380->20567|41410->20569|41469->20599|41499->20600|41533->20606|41697->20741|41727->20742|41767->20753|42021->20979|42050->20980|42080->20982|42109->20983|42141->20987|42170->20988|42569->21359|42593->21373|42630->21388|42715->21445|42739->21459|42777->21475|42865->21535|42889->21549|42927->21565|43015->21625|43039->21639|43078->21656|43166->21716|43190->21730|43228->21746|43316->21806|43340->21820|43378->21836|43467->21897|43495->21915|43533->21931|43624->21994|43652->22012|43690->22028|43781->22091|43809->22109|43847->22125|43939->22189|43967->22207|44007->22225|44099->22289|44127->22307|44165->22323|44257->22387|44285->22405|44325->22423|44654->22724|44670->22730|44733->22771|44977->22988|45041->23042|45081->23043|45117->23051|45203->23106|45233->23108|45316->23181|45356->23182|45392->23190|45482->23249|45523->23262|45671->23381|45701->23382|45731->23383|45772->23395|45802->23396|45832->23397|45916->23452|45946->23453|45976->23454|46024->23473|46054->23474|46084->23475|46182->23544|46212->23545|46242->23546|46294->23569|46324->23570|46354->23571|46439->23627|46469->23628|46499->23629|46546->23647|46576->23648|46606->23649|46703->23717|46733->23718|46763->23719|46814->23741|46844->23742|46874->23743|46961->23801|46991->23802|47021->23803|47070->23823|47100->23824|47130->23825|47228->23894|47258->23895|47288->23896|47340->23919|47370->23920|47400->23921|47489->23981|47519->23982|47549->23983|47600->24005|47630->24006|47660->24007|47756->24074|47786->24075|47816->24076|47866->24097|47896->24098|47926->24099|48009->24153|48039->24154|48069->24155|48114->24171|48144->24172|48174->24173|48257->24227|48287->24228|48317->24229|48362->24245|48392->24246|48422->24247|48495->24292|48530->24305|49403->25149|49433->25150|49463->25151|49517->25176|49547->25177|49577->25178|53699->29271|53729->29272|53759->29273|53821->29306|53851->29307|53881->29308|53952->29350|53982->29351|54012->29352|54074->29385|54104->29386|54134->29387|54170->29395|54941->30138|54969->30156|55005->30170|55513->30650|55541->30668|55577->30682|56083->31160|56111->31178|56147->31192|56651->31668|56679->31686|56715->31700|57220->32177|57248->32195|57284->32209|57790->32687|57818->32705|57854->32719|58111->32947|58141->32948|58171->32949|58214->32963|58244->32964|58274->32965|58321->32983|58351->32984|58381->32985|58424->32999|58454->33000|58484->33001|58533->33021|58563->33022|58593->33023|58635->33036|58665->33037|58695->33038|58749->33063|58779->33064|58809->33065|58850->33077|58880->33078|58910->33079|58940->33081|58982->33094|59012->33095|59042->33096|59088->33113|59118->33114|59148->33115|59195->33133|59225->33134|59255->33135|59301->33152|59331->33153|59361->33154|59410->33174|59440->33175|59470->33176|59515->33192|59545->33193|59575->33194|59629->33219|59659->33220|59689->33221|59734->33237|59764->33238|59794->33239|59825->33242|59864->33252|59894->33253|59924->33254|59982->33283|60012->33284|60042->33285|60078->33293|61291->34478|61315->34492|61351->34506|61842->34969|61866->34983|61902->34997|62071->35137|62101->35138|62131->35139|62187->35166|62217->35167|62247->35168|62370->35262|62400->35263|62430->35264|62472->35277|62502->35278|62532->35279|63058->35777|63082->35791|63118->35805|63615->36274|63639->36288|63675->36302|64071->36669|64101->36670|64131->36671|64187->36698|64217->36699|64247->36700|64372->36796|64402->36797|64432->36798|64474->36811|64504->36812|64534->36813|66098->38349|66114->38355|66173->38392|66910->39100|66940->39101|66972->39105|67080->39185|67109->39186|67194->39242|67224->39243|67256->39247|67326->39289|67355->39290|67734->39639|67765->39640|67802->39648|68073->39889|68104->39890|68142->39899|69243->40970|69274->40971|69314->40981|69383->41021|69414->41022|69452->41031|69482->41032|69520->41041|69587->41078|69618->41079|69656->41088|69725->41127|69756->41128|69796->41138|69906->41219|69937->41220|69975->41229|70005->41230|70042->41238|70107->41273|70138->41274|70176->41283|70245->41322|70276->41323|70316->41333|70434->41422|70465->41423|70503->41432|70533->41433|70570->41441|70685->41526|70716->41527|70755->41537|70814->41566|70845->41567|70885->41577|70998->41660|71029->41661|71070->41672|71173->41745|71204->41746|71246->41758|71352->41834|71383->41835|71426->41848|71457->41849|71496->41859|71527->41860|71606->41909|71637->41910|71677->41920|71790->42003|71821->42004|71862->42015|71962->42085|71993->42086|72035->42098|72141->42174|72172->42175|72214->42187|72245->42188|72284->42198|72315->42199|72394->42248|72425->42249|72466->42260|72579->42343|72610->42344|72651->42355|72753->42427|72784->42428|72826->42440|72932->42516|72963->42517|73016->42540|73047->42541|73086->42551|73117->42552|73196->42601|73227->42602|73267->42612|73380->42695|73411->42696|73452->42707|73558->42783|73589->42784|73631->42796|73737->42872|73768->42873|73811->42886|73842->42887|73881->42897|73912->42898|73983->42939|74014->42940|74054->42950|74167->43033|74198->43034|74239->43045|74341->43117|74372->43118|74414->43130|74520->43206|74551->43207|74594->43220|74625->43221|74664->43231|74695->43232|74766->43273|74797->43274|74837->43284|74950->43367|74981->43368|75022->43379|75126->43453|75157->43454|75199->43466|75305->43542|75336->43543|75379->43556|75410->43557|75449->43567|75480->43568|75559->43617|75590->43618|75630->43628|75743->43711|75774->43712|75815->43723|75913->43791|75944->43792|75986->43804|76092->43880|76123->43881|76166->43894|76197->43895|76236->43905|76267->43906|76346->43955|76377->43956|76417->43966|76530->44049|76561->44050|76602->44061|76702->44131|76733->44132|76775->44144|76881->44220|76912->44221|76955->44234|76986->44235|77025->44245|77056->44246|77126->44286|77157->44287|77197->44297|77277->44348|77308->44349|77348->44359|77379->44360|77419->44370|77504->44426|77535->44427|77582->44445|77633->44466|77664->44467|77704->44477|78651->45394|78682->45395|78725->45409|79298->45952|79329->45953|79369->45963|79990->46554|80021->46555|80062->46566|80580->47054|80611->47055|80653->47067|81098->47482|81129->47483|81167->47492|81198->47493|81237->47503|81268->47504|81306->47513|81336->47514|81374->47523|81405->47524|81443->47533|81505->47565|81536->47566|81576->47576|81668->47639|81699->47640|81739->47650|81770->47651|81810->47661|81895->47717|81926->47718|81982->47745|82037->47770|82068->47771|82108->47781|83074->48717|83105->48718|83146->48729|83519->49072|83550->49073|83592->49085|84161->49624|84192->49625|84236->49639|84625->49998|84656->49999|84701->50014|85191->50474|85222->50475|85264->50487|85295->50488|85336->50499|85367->50500|85407->50510|85438->50511|85486->50530|85517->50531|85564->50549|85646->50601|85677->50602|85727->50622|86552->51417|86583->51418|86624->51429|86985->51760|87016->51761|87058->51773|87532->52217|87563->52218|87601->52227|87632->52228|87670->52237|87701->52238|87756->52264|87786->52265|87886->52335|87917->52336|87955->52345|88252->52613|88282->52614|88405->52707|88436->52708|88474->52717|88605->52818|88636->52819|88676->52829|88717->52840|88748->52841|88789->52852|88859->52892|88890->52893|88928->52902|88959->52903|88998->52913|89028->52914|89066->52923|89096->52924
                  LINES: 26->1|36->8|37->9|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|62->34|62->34|62->34|63->35|63->35|63->35|68->40|68->40|69->41|70->42|70->42|72->44|72->44|73->45|73->45|73->45|74->46|75->47|75->47|76->48|76->48|79->51|79->51|80->52|81->53|81->53|82->54|82->54|84->56|124->96|124->96|125->97|128->100|128->100|130->102|146->118|146->118|147->119|149->121|149->121|149->121|149->121|149->121|150->122|151->123|151->123|153->125|153->125|153->125|154->126|155->127|155->127|156->128|158->130|158->130|158->130|158->130|158->130|159->131|160->132|160->132|162->134|163->135|163->135|164->136|166->138|166->138|166->138|166->138|166->138|167->139|168->140|168->140|170->142|171->143|171->143|172->144|174->146|174->146|174->146|174->146|174->146|175->147|176->148|176->148|177->149|177->149|179->151|179->151|179->151|180->152|181->153|181->153|182->154|184->156|184->156|184->156|184->156|184->156|185->157|186->158|186->158|188->160|189->161|189->161|190->162|192->164|192->164|192->164|192->164|192->164|193->165|194->166|194->166|196->168|197->169|197->169|198->170|200->172|200->172|200->172|200->172|200->172|201->173|202->174|202->174|204->176|204->176|205->177|205->177|205->177|206->178|207->179|207->179|208->180|210->182|210->182|210->182|210->182|210->182|211->183|212->184|212->184|214->186|215->187|215->187|216->188|218->190|218->190|218->190|218->190|218->190|219->191|220->192|220->192|222->194|223->195|223->195|224->196|226->198|226->198|226->198|226->198|226->198|227->199|228->200|228->200|229->201|229->201|230->202|230->202|230->202|231->203|232->204|232->204|233->205|235->207|235->207|235->207|235->207|235->207|236->208|237->209|237->209|239->211|240->212|240->212|241->213|243->215|243->215|243->215|243->215|243->215|244->216|245->217|245->217|247->219|248->220|248->220|249->221|251->223|251->223|251->223|251->223|251->223|252->224|253->225|253->225|254->226|254->226|256->228|256->228|256->228|257->229|258->230|258->230|259->231|261->233|261->233|261->233|261->233|261->233|262->234|263->235|263->235|265->237|266->238|266->238|267->239|269->241|269->241|269->241|269->241|269->241|270->242|271->243|271->243|273->245|274->246|274->246|275->247|277->249|277->249|277->249|277->249|277->249|278->250|279->251|279->251|280->252|280->252|282->254|282->254|282->254|283->255|284->256|284->256|285->257|287->259|287->259|287->259|287->259|287->259|288->260|289->261|289->261|291->263|292->264|292->264|293->265|295->267|295->267|295->267|295->267|295->267|296->268|297->269|297->269|299->271|300->272|300->272|301->273|303->275|303->275|303->275|303->275|303->275|304->276|305->277|305->277|306->278|306->278|308->280|308->280|308->280|309->281|310->282|310->282|311->283|313->285|313->285|313->285|313->285|313->285|314->286|315->287|315->287|317->289|318->290|318->290|319->291|321->293|321->293|321->293|321->293|321->293|322->294|323->295|323->295|325->297|326->298|326->298|327->299|329->301|329->301|329->301|329->301|329->301|330->302|331->303|331->303|332->304|332->304|334->306|334->306|334->306|335->307|336->308|336->308|337->309|339->311|339->311|339->311|339->311|339->311|340->312|341->313|341->313|343->315|344->316|344->316|345->317|347->319|347->319|347->319|347->319|347->319|348->320|349->321|349->321|351->323|352->324|352->324|353->325|355->327|355->327|355->327|355->327|355->327|356->328|357->329|357->329|358->330|358->330|359->331|359->331|359->331|360->332|361->333|361->333|362->334|364->336|364->336|364->336|364->336|364->336|365->337|366->338|366->338|368->340|369->341|369->341|370->342|372->344|372->344|372->344|372->344|372->344|373->345|374->346|374->346|376->348|377->349|377->349|378->350|380->352|380->352|380->352|380->352|380->352|381->353|382->354|382->354|383->355|383->355|385->357|385->357|385->357|386->358|387->359|387->359|388->360|390->362|390->362|390->362|390->362|390->362|391->363|392->364|392->364|394->366|395->367|395->367|396->368|398->370|398->370|398->370|398->370|398->370|399->371|400->372|400->372|402->374|403->375|403->375|404->376|406->378|406->378|406->378|406->378|406->378|407->379|408->380|408->380|409->381|409->381|411->383|412->384|412->384|413->385|414->386|414->386|415->387|417->389|417->389|417->389|417->389|417->389|418->390|419->391|419->391|420->392|421->393|421->393|422->394|424->396|424->396|424->396|424->396|424->396|425->397|426->398|426->398|428->400|429->401|429->401|430->402|432->404|432->404|432->404|432->404|432->404|433->405|434->406|434->406|436->408|437->409|437->409|438->410|439->411|439->411|440->412|442->414|442->414|442->414|442->414|442->414|443->415|444->416|444->416|446->418|448->420|448->420|449->421|451->423|451->423|451->423|451->423|451->423|452->424|453->425|453->425|454->426|455->427|455->427|456->428|458->430|458->430|458->430|458->430|458->430|459->431|460->432|460->432|461->433|461->433|462->434|462->434|464->436|465->437|465->437|466->438|467->439|467->439|468->440|470->442|470->442|470->442|470->442|470->442|471->443|472->444|472->444|474->446|475->447|475->447|476->448|478->450|478->450|478->450|478->450|478->450|479->451|480->452|480->452|482->454|483->455|483->455|484->456|486->458|486->458|486->458|486->458|486->458|487->459|488->460|488->460|489->461|490->462|490->462|491->463|492->464|492->464|493->465|495->467|495->467|495->467|495->467|495->467|496->468|497->469|497->469|499->471|500->472|500->472|501->473|503->475|503->475|503->475|503->475|503->475|504->476|505->477|505->477|507->479|508->480|508->480|509->481|511->483|511->483|511->483|511->483|511->483|512->484|513->485|513->485|515->487|515->487|516->488|516->488|518->490|519->491|519->491|520->492|523->495|523->495|524->496|524->496|524->496|525->497|528->500|528->500|530->502|530->502|531->503|532->504|532->504|533->505|533->505|536->508|536->508|537->509|537->509|537->509|538->510|541->513|541->513|543->515|543->515|544->516|545->517|545->517|546->518|546->518|550->522|550->522|551->523|560->532|560->532|562->534|562->534|562->534|563->535|564->536|564->536|566->538|566->538|566->538|567->539|569->541|569->541|571->543|571->543|571->543|572->544|574->546|574->546|576->548|576->548|576->548|577->549|580->552|580->552|581->553|583->555|583->555|584->556|584->556|584->556|585->557|589->561|589->561|590->562|593->565|593->565|594->566|594->566|595->567|595->567|610->582|610->582|610->582|611->583|611->583|611->583|613->585|613->585|613->585|615->587|615->587|615->587|617->589|617->589|617->589|619->591|619->591|619->591|621->593|621->593|621->593|623->595|623->595|623->595|625->597|625->597|625->597|627->599|627->599|627->599|629->601|629->601|629->601|631->603|631->603|631->603|640->612|640->612|640->612|647->619|647->619|647->619|648->620|649->621|649->621|650->622|650->622|651->623|652->624|658->630|660->632|660->632|660->632|660->632|660->632|660->632|661->633|661->633|661->633|661->633|661->633|661->633|663->635|663->635|663->635|663->635|663->635|663->635|664->636|664->636|664->636|664->636|664->636|664->636|666->638|666->638|666->638|666->638|666->638|666->638|667->639|667->639|667->639|667->639|667->639|667->639|669->641|669->641|669->641|669->641|669->641|669->641|670->642|670->642|670->642|670->642|670->642|670->642|672->644|672->644|672->644|672->644|672->644|672->644|673->645|673->645|673->645|673->645|673->645|673->645|674->646|674->646|674->646|674->646|674->646|674->646|677->649|677->649|696->668|696->668|696->668|696->668|696->668|696->668|784->756|784->756|784->756|784->756|784->756|784->756|785->757|785->757|785->757|785->757|785->757|785->757|786->758|804->776|804->776|804->776|813->785|813->785|813->785|824->796|824->796|824->796|833->805|833->805|833->805|844->816|844->816|844->816|853->825|853->825|853->825|862->834|862->834|862->834|862->834|862->834|862->834|863->835|863->835|863->835|863->835|863->835|863->835|864->836|864->836|864->836|864->836|864->836|864->836|865->837|865->837|865->837|865->837|865->837|865->837|867->839|867->839|867->839|867->839|867->839|867->839|867->839|868->840|868->840|868->840|868->840|868->840|868->840|869->841|869->841|869->841|869->841|869->841|869->841|870->842|870->842|870->842|870->842|870->842|870->842|873->845|873->845|873->845|873->845|873->845|873->845|873->845|874->846|897->869|897->869|897->869|905->877|905->877|905->877|911->883|911->883|911->883|911->883|911->883|911->883|913->885|913->885|913->885|913->885|913->885|913->885|925->897|925->897|925->897|933->905|933->905|933->905|944->916|944->916|944->916|944->916|944->916|944->916|946->918|946->918|946->918|946->918|946->918|946->918|991->963|991->963|991->963|1017->989|1017->989|1018->990|1021->993|1021->993|1025->997|1025->997|1026->998|1027->999|1027->999|1040->1012|1040->1012|1041->1013|1048->1020|1048->1020|1049->1021|1076->1048|1076->1048|1077->1049|1078->1050|1078->1050|1079->1051|1079->1051|1081->1053|1081->1053|1081->1053|1082->1054|1084->1056|1084->1056|1085->1057|1087->1059|1087->1059|1089->1061|1089->1061|1090->1062|1090->1062|1090->1062|1091->1063|1093->1065|1093->1065|1094->1066|1096->1068|1096->1068|1098->1070|1098->1070|1099->1071|1102->1074|1102->1074|1104->1076|1104->1076|1104->1076|1105->1077|1107->1079|1107->1079|1108->1080|1110->1082|1110->1082|1111->1083|1113->1085|1113->1085|1115->1087|1115->1087|1117->1089|1117->1089|1119->1091|1119->1091|1120->1092|1122->1094|1122->1094|1123->1095|1124->1096|1124->1096|1125->1097|1127->1099|1127->1099|1128->1100|1128->1100|1130->1102|1130->1102|1132->1104|1132->1104|1134->1106|1136->1108|1136->1108|1137->1109|1138->1110|1138->1110|1139->1111|1141->1113|1141->1113|1143->1115|1143->1115|1145->1117|1145->1117|1147->1119|1147->1119|1148->1120|1150->1122|1150->1122|1151->1123|1153->1125|1153->1125|1154->1126|1156->1128|1156->1128|1158->1130|1158->1130|1160->1132|1160->1132|1162->1134|1162->1134|1163->1135|1165->1137|1165->1137|1166->1138|1168->1140|1168->1140|1169->1141|1171->1143|1171->1143|1173->1145|1173->1145|1175->1147|1175->1147|1177->1149|1177->1149|1178->1150|1180->1152|1180->1152|1181->1153|1183->1155|1183->1155|1184->1156|1186->1158|1186->1158|1188->1160|1188->1160|1190->1162|1190->1162|1192->1164|1192->1164|1193->1165|1195->1167|1195->1167|1196->1168|1198->1170|1198->1170|1199->1171|1201->1173|1201->1173|1203->1175|1203->1175|1205->1177|1205->1177|1207->1179|1207->1179|1208->1180|1210->1182|1210->1182|1211->1183|1213->1185|1213->1185|1214->1186|1216->1188|1216->1188|1218->1190|1218->1190|1220->1192|1220->1192|1223->1195|1223->1195|1224->1196|1225->1197|1225->1197|1225->1197|1225->1197|1226->1198|1227->1199|1227->1199|1229->1201|1229->1201|1229->1201|1230->1202|1258->1230|1258->1230|1260->1232|1274->1246|1274->1246|1275->1247|1295->1267|1295->1267|1296->1268|1311->1283|1311->1283|1313->1285|1325->1297|1325->1297|1326->1298|1326->1298|1328->1300|1328->1300|1330->1302|1330->1302|1331->1303|1331->1303|1332->1304|1333->1305|1333->1305|1334->1306|1335->1307|1335->1307|1335->1307|1335->1307|1336->1308|1337->1309|1337->1309|1340->1312|1340->1312|1340->1312|1341->1313|1368->1340|1368->1340|1369->1341|1381->1353|1381->1353|1382->1354|1395->1367|1395->1367|1397->1369|1407->1379|1407->1379|1409->1381|1424->1396|1424->1396|1425->1397|1425->1397|1426->1398|1426->1398|1427->1399|1427->1399|1429->1401|1429->1401|1431->1403|1431->1403|1431->1403|1433->1405|1456->1428|1456->1428|1458->1430|1468->1440|1468->1440|1470->1442|1485->1457|1485->1457|1486->1458|1486->1458|1487->1459|1487->1459|1490->1462|1490->1462|1495->1467|1495->1467|1496->1468|1506->1478|1506->1478|1510->1482|1510->1482|1511->1483|1513->1485|1513->1485|1514->1486|1514->1486|1514->1486|1515->1487|1516->1488|1516->1488|1517->1489|1517->1489|1518->1490|1518->1490|1519->1491|1519->1491
                  -- GENERATED --
              */
          