
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
object mortgagePage2Ref extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[LendingTerm,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(lendingTerm:LendingTerm,additionalApplicants:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.55*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href=""""),_display_(/*8.34*/routes/*8.40*/.Assets.at("_resources/favicon.ico")),format.raw/*8.76*/("""">
<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script>
<script src=""""),_display_(/*12.15*/routes/*12.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*12.65*/(""""></script>
<script src=""""),_display_(/*13.15*/routes/*13.21*/.Assets.at("javascripts/mortgageJs/mortgagePage2Ref.js")),format.raw/*13.77*/(""""></script>
<script src=""""),_display_(/*14.15*/routes/*14.21*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*14.67*/(""""></script>

<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*17.31*/routes/*17.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*17.79*/("""">
<script src="""),_display_(/*18.14*/routes/*18.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*18.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*19.47*/routes/*19.53*/.Assets.at("_resources/background.css")),format.raw/*19.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*20.47*/routes/*20.53*/.Assets.at("_resources/forms.css")),format.raw/*20.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*21.47*/routes/*21.53*/.Assets.at("_resources/template.css")),format.raw/*21.90*/("""">
</head>
<body>
<br>
<br>
<div style="width: 95%">

		<form name="myForm" action="mortgagePage2Ref" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value=""""),_display_(/*29.32*/additionalApplicants),format.raw/*29.52*/("""" name="additionalApplicants">
		<input type="hidden" value=""""),_display_(/*30.32*/lendingTerm/*30.43*/.getWhoWillLiving),format.raw/*30.60*/("""" name="whoWillLive33">
		
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*39.11*/routes/*39.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*39.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<div ng-controller="DemoController" ng-init="isDisabled = false">
		"""),_display_(/*44.4*/if(lendingTerm !=null && lendingTerm.isBuyProperty)/*44.55*/{_display_(Seq[Any](format.raw/*44.56*/("""
		"""),format.raw/*45.3*/("""<div ng-init="addFunds.BuyProperty=true"></div>
		""")))}),format.raw/*46.4*/("""
		"""),_display_(/*47.4*/if(lendingTerm !=null && lendingTerm.isPayOffDebt)/*47.54*/{_display_(Seq[Any](format.raw/*47.55*/("""
		"""),format.raw/*48.3*/("""<div ng-init="addFunds.PayOffDebt=true"></div>
		""")))}),format.raw/*49.4*/("""
		"""),_display_(/*50.4*/if(lendingTerm !=null && lendingTerm.isBuyInvestments)/*50.58*/{_display_(Seq[Any](format.raw/*50.59*/("""
		"""),format.raw/*51.3*/("""<div ng-init="addFunds.BuyInvestment=true"></div>
		""")))}),format.raw/*52.4*/("""
		"""),_display_(/*53.4*/if(lendingTerm !=null && lendingTerm.isBuyVehicle)/*53.54*/{_display_(Seq[Any](format.raw/*53.55*/("""
		"""),format.raw/*54.3*/("""<div ng-init="addFunds.BuyVehicle=true"></div>
		""")))}),format.raw/*55.4*/("""
		"""),_display_(/*56.4*/if(lendingTerm !=null && lendingTerm.isRenovate)/*56.52*/{_display_(Seq[Any](format.raw/*56.53*/("""
		"""),format.raw/*57.3*/("""<div ng-init="addFunds.Renovate=true"></div>
		""")))}),format.raw/*58.4*/("""
		"""),_display_(/*59.4*/if(lendingTerm !=null && lendingTerm.isRefurnish)/*59.53*/{_display_(Seq[Any](format.raw/*59.54*/("""
		"""),format.raw/*60.3*/("""<div ng-init="addFunds.Refurnish=true"></div>
		""")))}),format.raw/*61.4*/("""
		"""),_display_(/*62.4*/if(lendingTerm !=null && lendingTerm.isVacation)/*62.52*/{_display_(Seq[Any](format.raw/*62.53*/("""
		"""),format.raw/*63.3*/("""<div ng-init="addFunds.Vacation=true"></div>
		""")))}),format.raw/*64.4*/("""
		"""),_display_(/*65.4*/if(lendingTerm !=null && lendingTerm.isRecVehicle)/*65.54*/{_display_(Seq[Any](format.raw/*65.55*/("""
		"""),format.raw/*66.3*/("""<div ng-init="addFunds.RecVehicle=true"></div>
		""")))}),format.raw/*67.4*/("""
		"""),_display_(/*68.4*/if(lendingTerm !=null && lendingTerm.isOther)/*68.49*/{_display_(Seq[Any](format.raw/*68.50*/("""
		"""),format.raw/*69.3*/("""<div ng-init="addFunds.Other=true"></div>
		""")))}),format.raw/*70.4*/("""
		
		"""),format.raw/*72.3*/("""<div class="map_canvas"></div>
			      <div class="form-group">
								<label class="labelfont">What is the address of the property you are financing?<span
									style="color: red; font-size: 3">*</span> </label> <input
									id="geocomplete" type="text" name="formatted_address" style="width: 60%;"
									class="form-control" placeholder="Enter Location" value=""""),_display_(/*77.68*/lendingTerm/*77.79*/.getAddress),format.raw/*77.90*/("""" ng-required>
									
										<div id="formatted_address11111s"> </div>
		    	</div>
		 
		<label class="labelfont"> What is the approximate market value of your property  <span style="color: red; font-size: 3">*</span></label>
          		  <input type="text" style="width: 25%;" size="12" placeholder="eg $30,000" id="refivalueID" 
					name="refivalue"  class="form-control" data-type="input-number" value=""""),_display_(/*84.78*/lendingTerm/*84.89*/.getMarketValue),format.raw/*84.104*/("""" onkeypress="return isNumber(event)">
					<div id="input_101"> </div>
					<br>
		   	  <label class="labelfont">How much additional money would you like over and above your current mortgage amount?<span style="color: red; font-size: 3">*</span></label>
	      			<input type="text" style="width: 25%;" size="12"  placeholder="eg $30,000" id="additionalFundsID" 
					name="additionalFunds" class="form-control" data-type="input-number" value=""""),_display_(/*89.83*/lendingTerm/*89.94*/.getAdditionalAmount),format.raw/*89.114*/("""" onkeypress="return isNumber(event)">
					<div id="widget_settings_46"> </div> 
					<br>
			<label class="labelfont">How will additional funds will be used?<span style="color: red; font-size: 3">*</span></label><br>
			<div class="btn-group" style="width: 100%;">
                            <label style="width: 20%;" class="btn btn-primary" ng-true-value="BuyProperty" btn-checkbox=="'BuyProperty'"
                                ng-change="change()"  ng-model="addFunds.BuyProperty"> Buy Property
                            </label>
                             <label style="width: 20%;" class="btn btn-primary" ng-true-value="PayOffDebt" btn-checkbox=="'PayOffDebt'"
                                ng-change="change()"  ng-model="addFunds.PayOffDebt"> Pay Off Debt
                            </label>
                            
                             <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value ="BuyInvestment" btn-checkbox=="'BuyInvestment'"
                                ng-change="change()"  ng-model="addFunds.BuyInvestment"> Buy Investment
                            </label>
                            <br>
                            <br>
                            <label style="width: 20%; border-radius: 5px 0px 0px 5px;" class="btn btn-primary" ng-true-value="BuyVehicle" btn-checkbox="'BuyVehicle'"
                                ng-change="change()"  ng-model="addFunds.BuyVehicle"> Buy Vehicle
                            </label>
                            <label style="width: 20%;" class="btn btn-primary" ng-true-value="Renovate" btn-checkbox="'Renovate'"
                                ng-change="change()"  ng-model="addFunds.Renovate"> Renovate
                            </label>
                            <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="Refurnish" btn-checkbox="'Refurnish'"
                                ng-change="change()"  ng-model="addFunds.Refurnish"> Refurnish
                            </label>
                           <br> 
                            <br>
                            <label style="width: 20%; border-radius: 5px 0px 0px 5px;" class="btn btn-primary" ng-true-value="Vacation" btn-checkbox="'Vacation'"
                                ng-change="change()"  ng-model="addFunds.Vacation"> Vacation
                            </label>
                            <label style="width: 20%;" class="btn btn-primary" ng-true-value="RecVehicle" btn-checkbox="'RecVehicle'"
                                ng-change="change()"  ng-model="addFunds.RecVehicle"> Rec Vehicle
                            </label>
                            <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="Other" btn-checkbox="'Other'"
                                ng-change="change()"  ng-model="addFunds.Other"> Other
                            </label>
                </div>
                 <div id="widget_settings_27" style="position: absolute;"> </div>
                 <input type="hidden" name="paymtSrcList[]" value=""""),format.raw/*128.68*/("""{"""),format.raw/*128.69*/("""{"""),format.raw/*128.70*/("""checkResults"""),format.raw/*128.82*/("""}"""),format.raw/*128.83*/("""}"""),format.raw/*128.84*/("""">
                 <input type="hidden" name="buyProperty" value=""""),format.raw/*129.65*/("""{"""),format.raw/*129.66*/("""{"""),format.raw/*129.67*/("""addFunds.BuyProperty"""),format.raw/*129.87*/("""}"""),format.raw/*129.88*/("""}"""),format.raw/*129.89*/("""" ></input>
                 <input type="hidden" name="payOffDebt" value=""""),format.raw/*130.64*/("""{"""),format.raw/*130.65*/("""{"""),format.raw/*130.66*/("""addFunds.PayOffDebt"""),format.raw/*130.85*/("""}"""),format.raw/*130.86*/("""}"""),format.raw/*130.87*/("""" ></input>
                 <input type="hidden" name="buyInvestment" value=""""),format.raw/*131.67*/("""{"""),format.raw/*131.68*/("""{"""),format.raw/*131.69*/("""addFunds.BuyInvestment"""),format.raw/*131.91*/("""}"""),format.raw/*131.92*/("""}"""),format.raw/*131.93*/("""" ></input>
                 <input type="hidden" name="buyVehicle" value=""""),format.raw/*132.64*/("""{"""),format.raw/*132.65*/("""{"""),format.raw/*132.66*/("""addFunds.BuyVehicle"""),format.raw/*132.85*/("""}"""),format.raw/*132.86*/("""}"""),format.raw/*132.87*/("""" ></input>
                 <input type="hidden" name="renovate" value=""""),format.raw/*133.62*/("""{"""),format.raw/*133.63*/("""{"""),format.raw/*133.64*/("""addFunds.Renovate"""),format.raw/*133.81*/("""}"""),format.raw/*133.82*/("""}"""),format.raw/*133.83*/("""" ></input>
                 <input type="hidden" name="refurnish" value=""""),format.raw/*134.63*/("""{"""),format.raw/*134.64*/("""{"""),format.raw/*134.65*/("""addFunds.Refurnish"""),format.raw/*134.83*/("""}"""),format.raw/*134.84*/("""}"""),format.raw/*134.85*/("""" ></input>
                 <input type="hidden" name="vacation" value=""""),format.raw/*135.62*/("""{"""),format.raw/*135.63*/("""{"""),format.raw/*135.64*/("""addFunds.Vacation"""),format.raw/*135.81*/("""}"""),format.raw/*135.82*/("""}"""),format.raw/*135.83*/("""" ></input>
                 <input type="hidden" name="recVehicle" value=""""),format.raw/*136.64*/("""{"""),format.raw/*136.65*/("""{"""),format.raw/*136.66*/("""addFunds.RecVehicle"""),format.raw/*136.85*/("""}"""),format.raw/*136.86*/("""}"""),format.raw/*136.87*/("""" ></input>
                 <input type="hidden" name="other" value=""""),format.raw/*137.59*/("""{"""),format.raw/*137.60*/("""{"""),format.raw/*137.61*/("""addFunds.Other"""),format.raw/*137.75*/("""}"""),format.raw/*137.76*/("""}"""),format.raw/*137.77*/("""" ></input>
				 <br>
			 <br>	 
      	       <label class="labelfont">Who will be living in the property you will be financing?<span style="color: red; font-size: 3">*</span></label><br>
	        	<div class="btn-group" style="width: 100%;">
              		<label style="width: 20%;" class="btn btn-primary" btn-radio="'OwnerMyself'"
                      ng-change="change()"  ng-model="newItemType3"> Owner(Myself)
              		</label>              
              		<label style="width: 20%;" class="btn btn-primary" btn-radio="'Renter'"
                       ng-change="change()"  ng-model="newItemType3"> Renter
		      		</label>
              		<label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'OwnerAndRenter'"
                      ng-change="change()"  ng-model="newItemType3"> Owner & Renter
              		</label>
              		
              		<input type="hidden" name="living4Financing" value=""""),format.raw/*152.69*/("""{"""),format.raw/*152.70*/("""{"""),format.raw/*152.71*/("""newItemType3"""),format.raw/*152.83*/("""}"""),format.raw/*152.84*/("""}"""),format.raw/*152.85*/("""" ></input>
              		
           		</div>
           		<div id="input_203" style="position: absolute;"> </div>
           		<div ng-if="newItemType3 == 'OwnerAndRenter' || newItemType3 == 'Renter'">
						<br>
						<label class="labelfont">What is the MONTHLY rent you expect to receive from this property?<span style="color: red; font-size: 3">*</span></label>
							<input type="text" style="width: 33%" size="12" id="input_394" placeholder="e.g. 3000"
								name="rentalAmount" class="form-control" data-type="input-number" value=""""),_display_(/*160.83*/lendingTerm/*160.94*/.getRentalAmount),format.raw/*160.110*/("""" onkeypress="return isNumber(event)">		
	        				<div id="input_39"> </div>
	        					<br>
           		
					</div>
           	
        	</div>
	        <br>
	        		<div class="row" style="width: 100%;">
					  <div class="col-sm-6" style="float: left; padding-left:2%; width: 50%;">
					  		<a href="mortgageBackPage1" class="btn btn-primary" role="button" style=" width: 50%;">Back</a>
					  </div>
					  <div class="col-sm-6" align="right" style="float: right; padding-right:5%; width: 50%;"><input type="submit" class="btn btn-primary btn-block"
								value="Next" style="width: 50%;">
							<div align="right" id="submiterror">
								<font color="red"></font></div>
					  </div>	
					</div>
				</div>
						<br>
						<div class="container" style="width: 70%;">
						  <div class="progress">
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:20%; background-color: #6AA84F;">
						    <label>20%</label>
						    </div>
						  </div>
						</div>
					 </div>
				</div>
				
				<br>
				
</form>
</div>
 
<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
<script src="jquery.geocomplete.js"></script>

</body>
</html>"""))}
  }

  def render(lendingTerm:LendingTerm,additionalApplicants:String): play.twirl.api.HtmlFormat.Appendable = apply(lendingTerm,additionalApplicants)

  def f:((LendingTerm,String) => play.twirl.api.HtmlFormat.Appendable) = (lendingTerm,additionalApplicants) => apply(lendingTerm,additionalApplicants)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:27 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage2Ref.scala.html
                  HASH: dd6b5c00c7e4523a9ea1e90262334b14d47ddc9a
                  MATRIX: 746->1|887->54|914->55|1270->385|1284->391|1340->427|1692->752|1707->758|1772->802|1825->828|1840->834|1917->890|1970->916|1985->922|2052->968|2182->1071|2197->1077|2260->1119|2303->1135|2318->1141|2380->1182|2467->1242|2482->1248|2542->1287|2618->1336|2633->1342|2688->1376|2764->1425|2779->1431|2837->1468|3045->1649|3086->1669|3175->1731|3195->1742|3233->1759|3567->2066|3582->2072|3643->2112|3849->2292|3909->2343|3948->2344|3978->2347|4059->2398|4089->2402|4148->2452|4187->2453|4217->2456|4297->2506|4327->2510|4390->2564|4429->2565|4459->2568|4542->2621|4572->2625|4631->2675|4670->2676|4700->2679|4780->2729|4810->2733|4867->2781|4906->2782|4936->2785|5014->2833|5044->2837|5102->2886|5141->2887|5171->2890|5250->2939|5280->2943|5337->2991|5376->2992|5406->2995|5484->3043|5514->3047|5573->3097|5612->3098|5642->3101|5722->3151|5752->3155|5806->3200|5845->3201|5875->3204|5950->3249|5983->3255|6385->3630|6405->3641|6437->3652|6881->4069|6901->4080|6938->4095|7412->4542|7432->4553|7474->4573|10663->7733|10693->7734|10723->7735|10764->7747|10794->7748|10824->7749|10920->7816|10950->7817|10980->7818|11029->7838|11059->7839|11089->7840|11193->7915|11223->7916|11253->7917|11301->7936|11331->7937|11361->7938|11468->8016|11498->8017|11528->8018|11579->8040|11609->8041|11639->8042|11743->8117|11773->8118|11803->8119|11851->8138|11881->8139|11911->8140|12013->8213|12043->8214|12073->8215|12119->8232|12149->8233|12179->8234|12282->8308|12312->8309|12342->8310|12389->8328|12419->8329|12449->8330|12551->8403|12581->8404|12611->8405|12657->8422|12687->8423|12717->8424|12821->8499|12851->8500|12881->8501|12929->8520|12959->8521|12989->8522|13088->8592|13118->8593|13148->8594|13191->8608|13221->8609|13251->8610|14245->9575|14275->9576|14305->9577|14346->9589|14376->9590|14406->9591|14980->10137|15001->10148|15040->10164
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|57->29|57->29|58->30|58->30|58->30|67->39|67->39|67->39|72->44|72->44|72->44|73->45|74->46|75->47|75->47|75->47|76->48|77->49|78->50|78->50|78->50|79->51|80->52|81->53|81->53|81->53|82->54|83->55|84->56|84->56|84->56|85->57|86->58|87->59|87->59|87->59|88->60|89->61|90->62|90->62|90->62|91->63|92->64|93->65|93->65|93->65|94->66|95->67|96->68|96->68|96->68|97->69|98->70|100->72|105->77|105->77|105->77|112->84|112->84|112->84|117->89|117->89|117->89|156->128|156->128|156->128|156->128|156->128|156->128|157->129|157->129|157->129|157->129|157->129|157->129|158->130|158->130|158->130|158->130|158->130|158->130|159->131|159->131|159->131|159->131|159->131|159->131|160->132|160->132|160->132|160->132|160->132|160->132|161->133|161->133|161->133|161->133|161->133|161->133|162->134|162->134|162->134|162->134|162->134|162->134|163->135|163->135|163->135|163->135|163->135|163->135|164->136|164->136|164->136|164->136|164->136|164->136|165->137|165->137|165->137|165->137|165->137|165->137|180->152|180->152|180->152|180->152|180->152|180->152|188->160|188->160|188->160
                  -- GENERATED --
              */
          