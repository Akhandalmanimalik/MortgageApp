
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
object supplementary_income extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Applicant,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(applicant:Applicant):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.23*/("""
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
<script src=""""),_display_(/*25.15*/routes/*25.21*/.Assets.at("javascripts/supplementary_income.js")),format.raw/*25.70*/(""""></script>

 
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
    	"""),format.raw/*45.6*/("""var textArea = document.getElementById("helperOtherIncDesc").value;
        document.getElementById("otherIncDesc").innerHTML = textArea;
    	
    """),format.raw/*48.5*/("""}"""),format.raw/*48.6*/("""
    """),format.raw/*49.5*/("""</script>
</head>
<body>
<br>
<br>
<div style="width: 97%">
		<form name="myForm" action="mortgageSupplA" method="POST">
		<input type="hidden" value="uniid" name="uniid">
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*64.11*/routes/*64.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*64.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<div ng-controller="DemoController" ng-init="isDisabled = false">
		"""),_display_(/*69.4*/for(income  <- applicant.getIncomes) yield /*69.40*/{_display_(Seq[Any](format.raw/*69.41*/("""
				"""),_display_(/*70.6*/if(income.getTypeOfIncome != null && income.getTypeOfIncome == "11")/*70.74*/{_display_(Seq[Any](format.raw/*70.75*/("""
								"""),format.raw/*71.9*/("""<div ng-init="supplIncomeSource.LivingAllow=true"></div>
				""")))}),format.raw/*72.6*/("""
				"""),_display_(/*73.6*/if(income.getTypeOfIncome != null && income.getTypeOfIncome == "8")/*73.73*/{_display_(Seq[Any](format.raw/*73.74*/("""
								"""),format.raw/*74.9*/("""<div ng-init="supplIncomeSource.Bonus=true"></div>
				""")))}),format.raw/*75.6*/("""
				"""),_display_(/*76.6*/if(income.getTypeOfIncome != null && income.getTypeOfIncome == "12")/*76.74*/{_display_(Seq[Any](format.raw/*76.75*/("""
								"""),format.raw/*77.9*/("""<div ng-init="supplIncomeSource.VehicleAllow=true"></div>
				""")))}),format.raw/*78.6*/("""
				"""),_display_(/*79.6*/if(income.getTypeOfIncome != null && income.getTypeOfIncome == "4")/*79.73*/{_display_(Seq[Any](format.raw/*79.74*/("""
								"""),format.raw/*80.9*/("""<div ng-init="supplIncomeSource.Commission=true"></div>
				""")))}),format.raw/*81.6*/("""
				"""),_display_(/*82.6*/if(income.getTypeOfIncome != null && income.getTypeOfIncome == "Investments")/*82.83*/{_display_(Seq[Any](format.raw/*82.84*/("""
								"""),format.raw/*83.9*/("""<div ng-init="additionalSource.Investments=true"></div>
				""")))}),format.raw/*84.6*/("""
				"""),_display_(/*85.6*/if(income.getTypeOfIncome != null && income.getTypeOfIncome == "3")/*85.73*/{_display_(Seq[Any](format.raw/*85.74*/("""
								"""),format.raw/*86.9*/("""<div ng-init="additionalSource.Pension=true"></div>
				""")))}),format.raw/*87.6*/("""
				"""),_display_(/*88.6*/if(income.getTypeOfIncome != null && income.getTypeOfIncome == "14")/*88.74*/{_display_(Seq[Any](format.raw/*88.75*/("""
								"""),format.raw/*89.9*/("""<div ng-init="additionalSource.Maternity=true"></div>
				""")))}),format.raw/*90.6*/("""
				"""),_display_(/*91.6*/if(income.getTypeOfIncome != null && income.getTypeOfIncome == "13")/*91.74*/{_display_(Seq[Any](format.raw/*91.75*/("""
								"""),format.raw/*92.9*/("""<div ng-init="additionalSource.Other=true"></div>
				""")))}),format.raw/*93.6*/("""
				"""),_display_(/*94.6*/if(income.getTypeOfIncome != null && income.getTypeOfIncome == "6")/*94.73*/{_display_(Seq[Any](format.raw/*94.74*/("""
								"""),format.raw/*95.9*/("""<div ng-init="abt.Pension=true"></div>
				""")))}),format.raw/*96.6*/("""
				"""),_display_(/*97.6*/if(income.getTypeOfIncome != null && income.getTypeOfIncome == "Disability")/*97.82*/{_display_(Seq[Any](format.raw/*97.83*/("""
								"""),format.raw/*98.9*/("""<div ng-init="abt.Disability=true"></div>
				""")))}),format.raw/*99.6*/("""
				
		""")))}),format.raw/*101.4*/("""
		"""),format.raw/*102.3*/("""<label class="labelfont">"""),_display_(/*102.29*/applicant/*102.38*/.getApplicant_name),format.raw/*102.56*/("""</label><br><br>
		<label class="labelfont"> What types of income do you currently receive? Select all that apply.<span style="color: red; font-size: 3">*</span></label><br>
		<div>
		</div>
		<label class="labelfont">Do you have any of these supplementary income sources? <span style="color: red; font-size: 3">*</span></label><br>
							<div class="btn-group" style="padding-left: 0%; width: 100%;">
								<label style="width: 20%;" class="btn btn-primary"
									ng-true-value="LivingAllow'" btn-checkbox="'LivingAllow'"
									ng-change="change()" ng-model="supplIncomeSource.LivingAllow">
									Living Allow </label> <label style="width: 20%; border-radius: 0px 5px 5px 0px;"
									class="btn btn-primary" ng-true-value="Bonus"
									btn-checkbox="'Bonus'" ng-change="change()"
									ng-model="supplIncomeSource.Bonus"> Bonus </label> <br> <br>
								<label style="width: 20%; border-radius: 5px 0px 0px 5px;"
									class="btn btn-primary" ng-true-value="Vehicle Allowance"
									btn-checkbox="'Vehicle Allowance'" ng-change="change()"
									ng-model="supplIncomeSource.VehicleAllow"> Vehicle Allow </label> <label
									style="width: 20%;" class="btn btn-primary"
									ng-true-value="Commission" btn-checkbox="'Commission'"
									ng-change="change()" ng-model="supplIncomeSource.Commission">
									Commission </label>
							</div>
							 <input type="hidden" name="supplIncomeSrc[]" value=""""),format.raw/*124.61*/("""{"""),format.raw/*124.62*/("""{"""),format.raw/*124.63*/("""supplementaryIncomeSource"""),format.raw/*124.88*/("""}"""),format.raw/*124.89*/("""}"""),format.raw/*124.90*/("""">
						
							<!-- <input type="text" name="supplementaryIncomeSource"
								value=""""),format.raw/*127.16*/("""{"""),format.raw/*127.17*/("""{"""),format.raw/*127.18*/("""supplementaryIncomeSource"""),format.raw/*127.43*/("""}"""),format.raw/*127.44*/("""}"""),format.raw/*127.45*/(""""> --> <br>
							<div ng-if="checkEmployee.areUemploye == 'yes'"></div>
							<br> <label class="labelfont">Do you receive income from any of these additional sources? <span style="color: red; font-size: 3">*</span></label><br>
							<div class="btn-group" style="padding-left: 0%; width: 100%;">

								<label style="width: 20%;" class="btn btn-primary"
									ng-true-value="Investments" btn-checkbox="'Investments'"
									ng-change="change()" ng-model="additionalSource.Investments">
									Investments </label> <label
									style="width: 20%; border-radius: 0px 5px 5px 0px;"
									class="btn btn-primary" ng-true-value="Pension"
									btn-checkbox="'additionalSource.Pension'" ng-change="change()"
									ng-model="additionalSource.Pension"> Retirement </label> <br> <br>
								<label style="width: 20%;"
									class="btn btn-primary" ng-true-value="Maternity"
									btn-checkbox="'Maternity'" ng-change="change()"
									ng-model="additionalSource.Maternity"> Maternity </label> <label
									style="width: 20%; border-radius: 0px 5px 5px 0px;"
									class="btn btn-primary" ng-true-value="Other"
									btn-checkbox="'Other'" ng-change="change()"
									ng-model="additionalSource.Other"> Other </label>
							</div>
							 <input type="hidden" name="addtionalSrc[]" value=""""),format.raw/*149.59*/("""{"""),format.raw/*149.60*/("""{"""),format.raw/*149.61*/("""additionalSources"""),format.raw/*149.78*/("""}"""),format.raw/*149.79*/("""}"""),format.raw/*149.80*/("""">
							<!-- <input type=="text" value=""""),format.raw/*150.40*/("""{"""),format.raw/*150.41*/("""{"""),format.raw/*150.42*/("""additionalSources"""),format.raw/*150.59*/("""}"""),format.raw/*150.60*/("""}"""),format.raw/*150.61*/(""""> -->
							<!-- <input type="text" value=""""),format.raw/*151.39*/("""{"""),format.raw/*151.40*/("""{"""),format.raw/*151.41*/("""additionalSource.Other"""),format.raw/*151.63*/("""}"""),format.raw/*151.64*/("""}"""),format.raw/*151.65*/(""""> -->
							<br>
							<br>
					<div ng-if="additionalSource.Other == true ">		
					<label class="labelfont">Finally, what about income from these other sources?<span style="color: red; font-size: 3">*</span></label><br>
					<div class="btn-group" style="padding-left: 0%; width: 100%;">

								<label style="width: 20%;" class="btn btn-primary"
									ng-true-value="Pension" btn-checkbox="'Pension'"
									ng-change="change()" ng-model="abt.Pension">
									Pension </label> <label
									style="width: 20%; border-radius: 0px 5px 5px 0px;"
									class="btn btn-primary" ng-true-value="Disability"
									btn-checkbox="'Disability'" ng-change="change()"
									ng-model="abt.Disability"> Disability </label> <br> <br>
									
							</div>
							  <input type="hidden" name="aboutIncomeSrc[]" value=""""),format.raw/*168.62*/("""{"""),format.raw/*168.63*/("""{"""),format.raw/*168.64*/("""aboutIncomeSources"""),format.raw/*168.82*/("""}"""),format.raw/*168.83*/("""}"""),format.raw/*168.84*/("""">   
							<!-- <input type="text" value=""""),format.raw/*169.39*/("""{"""),format.raw/*169.40*/("""{"""),format.raw/*169.41*/("""aboutIncomeSources"""),format.raw/*169.59*/("""}"""),format.raw/*169.60*/("""}"""),format.raw/*169.61*/(""""> -->
					 
					 
				<label class="labelfont">Please Describe your other income?<span style="color: red; font-size: 3">*</span></label><br>
				<textarea rows="" cols="" id="otherIncDesc" class="form-control" name="otherIncomes" style="width: 65%;" value=""""),_display_(/*173.118*/applicant/*173.127*/.getDescOtherIncome),format.raw/*173.146*/(""""> </textarea>
				<input type="hidden" id="helperOtherIncDesc" value=""""),_display_(/*174.58*/applicant/*174.67*/.getDescOtherIncome),format.raw/*174.86*/("""">
				</div>
			      <br>
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

</body>
</html>"""))}
  }

  def render(applicant:Applicant): play.twirl.api.HtmlFormat.Appendable = apply(applicant)

  def f:((Applicant) => play.twirl.api.HtmlFormat.Appendable) = (applicant) => apply(applicant)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:25 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/supplementary_income.scala.html
                  HASH: 12898aab426c6d8e6155992ba1223f9fd3dc7490
                  MATRIX: 741->1|850->22|877->23|1487->606|1502->612|1565->654|1608->670|1623->676|1685->717|1770->775|1785->781|1845->820|1921->869|1936->875|1991->909|2067->958|2082->964|2140->1001|2205->1039|2220->1045|2277->1081|2533->1310|2548->1316|2613->1360|2666->1386|2681->1392|2748->1438|2801->1464|2816->1470|2886->1519|3005->1610|3034->1611|3075->1624|3134->1656|3163->1657|3232->1698|3261->1699|3302->1712|3359->1741|3388->1742|3433->1759|3503->1801|3532->1802|3570->1813|3599->1814|3707->1894|3736->1895|3769->1901|3817->1922|3845->1923|3904->1954|3933->1955|3966->1961|4141->2109|4169->2110|4201->2115|4680->2567|4695->2573|4756->2613|4962->2793|5014->2829|5053->2830|5085->2836|5162->2904|5201->2905|5237->2914|5329->2976|5361->2982|5437->3049|5476->3050|5512->3059|5598->3115|5630->3121|5707->3189|5746->3190|5782->3199|5875->3262|5907->3268|5983->3335|6022->3336|6058->3345|6149->3406|6181->3412|6267->3489|6306->3490|6342->3499|6433->3560|6465->3566|6541->3633|6580->3634|6616->3643|6703->3700|6735->3706|6812->3774|6851->3775|6887->3784|6976->3843|7008->3849|7085->3917|7124->3918|7160->3927|7245->3982|7277->3988|7353->4055|7392->4056|7428->4065|7502->4109|7534->4115|7619->4191|7658->4192|7694->4201|7771->4248|7811->4257|7842->4260|7896->4286|7915->4295|7955->4313|9425->5754|9455->5755|9485->5756|9539->5781|9569->5782|9599->5783|9717->5872|9747->5873|9777->5874|9831->5899|9861->5900|9891->5901|11246->7227|11276->7228|11306->7229|11352->7246|11382->7247|11412->7248|11483->7290|11513->7291|11543->7292|11589->7309|11619->7310|11649->7311|11723->7356|11753->7357|11783->7358|11834->7380|11864->7381|11894->7382|12752->8211|12782->8212|12812->8213|12859->8231|12889->8232|12919->8233|12992->8277|13022->8278|13052->8279|13099->8297|13129->8298|13159->8299|13449->8560|13469->8569|13511->8588|13611->8660|13630->8669|13671->8688
                  LINES: 26->1|29->1|30->2|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|58->30|58->30|59->31|60->32|60->32|62->34|62->34|63->35|63->35|63->35|64->36|65->37|65->37|66->38|66->38|69->41|69->41|70->42|71->43|71->43|72->44|72->44|73->45|76->48|76->48|77->49|92->64|92->64|92->64|97->69|97->69|97->69|98->70|98->70|98->70|99->71|100->72|101->73|101->73|101->73|102->74|103->75|104->76|104->76|104->76|105->77|106->78|107->79|107->79|107->79|108->80|109->81|110->82|110->82|110->82|111->83|112->84|113->85|113->85|113->85|114->86|115->87|116->88|116->88|116->88|117->89|118->90|119->91|119->91|119->91|120->92|121->93|122->94|122->94|122->94|123->95|124->96|125->97|125->97|125->97|126->98|127->99|129->101|130->102|130->102|130->102|130->102|152->124|152->124|152->124|152->124|152->124|152->124|155->127|155->127|155->127|155->127|155->127|155->127|177->149|177->149|177->149|177->149|177->149|177->149|178->150|178->150|178->150|178->150|178->150|178->150|179->151|179->151|179->151|179->151|179->151|179->151|196->168|196->168|196->168|196->168|196->168|196->168|197->169|197->169|197->169|197->169|197->169|197->169|201->173|201->173|201->173|202->174|202->174|202->174
                  -- GENERATED --
              */
          