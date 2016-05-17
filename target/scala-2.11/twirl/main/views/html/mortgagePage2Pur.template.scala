
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
object mortgagePage2Pur extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[LendingTerm,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(lendingTerm:LendingTerm,additionalApplicants: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.56*/("""
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

<script src=""""),_display_(/*13.15*/routes/*13.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*13.65*/(""""></script>
<script src=""""),_display_(/*14.15*/routes/*14.21*/.Assets.at("javascripts/mortgageJs/mortgagePage2Pur.js")),format.raw/*14.77*/(""""></script>
<script src=""""),_display_(/*15.15*/routes/*15.21*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*15.67*/(""""></script>
      
<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*18.31*/routes/*18.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*18.79*/("""">
<script src="""),_display_(/*19.14*/routes/*19.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*19.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*20.47*/routes/*20.53*/.Assets.at("_resources/background.css")),format.raw/*20.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*21.47*/routes/*21.53*/.Assets.at("_resources/forms.css")),format.raw/*21.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*22.47*/routes/*22.53*/.Assets.at("_resources/template.css")),format.raw/*22.90*/("""">
</head>
<body>
<br>
<br>
<div style="width: 95%">
 
		<form name="myForm" action="mortgagePage2Pur" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value=""""),_display_(/*30.32*/additionalApplicants),format.raw/*30.52*/("""" name="additionalApplicants">
		<input type="hidden" value=""""),_display_(/*31.32*/lendingTerm/*31.43*/.getWhoWillLiving),format.raw/*31.60*/("""" name="whoWillLive33">
		<input type="hidden" value=""""),_display_(/*32.32*/lendingTerm/*32.43*/.getMlsListed),format.raw/*32.56*/("""" name="mlsListed33">
		
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*41.11*/routes/*41.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*41.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<div ng-controller="DemoController" ng-init="isDisabled = false">
		"""),_display_(/*46.4*/if(lendingTerm !=null && lendingTerm.isBankAccount)/*46.55*/{_display_(Seq[Any](format.raw/*46.56*/("""
		"""),format.raw/*47.3*/("""<div ng-init="paymtSrc.BankAccount=true"></div>
		""")))}),format.raw/*48.4*/("""
		"""),_display_(/*49.4*/if(lendingTerm !=null && lendingTerm.isRrsps)/*49.49*/{_display_(Seq[Any](format.raw/*49.50*/("""
		"""),format.raw/*50.3*/("""<div ng-init="paymtSrc.RRSPS=true"></div>
		""")))}),format.raw/*51.4*/("""
		"""),_display_(/*52.4*/if(lendingTerm !=null && lendingTerm.isInvestments)/*52.55*/{_display_(Seq[Any](format.raw/*52.56*/("""
		"""),format.raw/*53.3*/("""<div ng-init="paymtSrc.Investments=true"></div>
		""")))}),format.raw/*54.4*/("""
		"""),_display_(/*55.4*/if(lendingTerm !=null && lendingTerm.isBorrowed)/*55.52*/{_display_(Seq[Any](format.raw/*55.53*/("""
		"""),format.raw/*56.3*/("""<div ng-init="paymtSrc.Borrowed=true"></div>
		""")))}),format.raw/*57.4*/("""
		"""),_display_(/*58.4*/if(lendingTerm !=null && lendingTerm.isSaleOfProperty)/*58.58*/{_display_(Seq[Any](format.raw/*58.59*/("""
		"""),format.raw/*59.3*/("""<div ng-init="paymtSrc.SaleofProperty=true"></div>
		""")))}),format.raw/*60.4*/("""
		"""),_display_(/*61.4*/if(lendingTerm !=null && lendingTerm.isGift)/*61.48*/{_display_(Seq[Any](format.raw/*61.49*/("""
		"""),format.raw/*62.3*/("""<div ng-init="paymtSrc.Gift=true"></div>
		""")))}),format.raw/*63.4*/("""
		"""),_display_(/*64.4*/if(lendingTerm !=null && lendingTerm.isPersonalCash)/*64.56*/{_display_(Seq[Any](format.raw/*64.57*/("""
		"""),format.raw/*65.3*/("""<div ng-init="paymtSrc.PersonalCash=true"></div>
		""")))}),format.raw/*66.4*/("""
		"""),_display_(/*67.4*/if(lendingTerm !=null && lendingTerm.isExistingEquity)/*67.58*/{_display_(Seq[Any](format.raw/*67.59*/("""
		"""),format.raw/*68.3*/("""<div ng-init="paymtSrc.ExistingEquity=true"></div>
		""")))}),format.raw/*69.4*/("""
		"""),_display_(/*70.4*/if(lendingTerm !=null && lendingTerm.isSweetEquity)/*70.55*/{_display_(Seq[Any](format.raw/*70.56*/("""
		"""),format.raw/*71.3*/("""<div ng-init="paymtSrc.SweatEnquity=true"></div>
		""")))}),format.raw/*72.4*/("""
		"""),format.raw/*73.3*/("""<div class="map_canvas"></div>
			      <div class="form-group">
								<label class="labelfont"> What is the address of the property you are financing? <span
									style="color: red; font-size: 3; width: 25%;">*</span></label><br> <input
									id="geocomplete" type="text" name="formatted_address"  style="width: 60%;"
									class="form-control" placeholder="Enter Location" value=""""),_display_(/*78.68*/lendingTerm/*78.79*/.getAddress),format.raw/*78.90*/("""" ng-required>
										<div id="formatted_address11111s"> </div>
		    	</div>
		 <label class="labelfont">How much is the downpayment?<span style="color: red; font-size: 3">*</span></label><br>
					<input type="text" style="width: 25%" size="12"  placeholder="e.g 30000" id="downpayment30Id" 
					 name="downpayment30"  class="form-control" data-type="input-number" value=""""),_display_(/*83.83*/lendingTerm/*83.94*/.getDownpayment),format.raw/*83.109*/("""" onkeypress="return isNumber(event)">		
	        		 <div id="cid_299"> </div>
	        		 <br>
	    	<label class="labelfont">What are all the sources of down payment? <span style="color: red; font-size: 3">*</span></label><br>
	    	<div class="btn-group" style="width: 100%;">
                            <label style="width: 20%;" class="btn btn-primary" ng-true-value="Bank-Account" btn-checkbox="'BankAccount'"
                                ng-change="change()"  ng-model="paymtSrc.BankAccount"> Bank Account
                            </label>
                             <label style="width: 20%;" class="btn btn-primary" ng-true-value="RRSPS" btn-checkbox="'RRSPS'"
                                ng-change="change()"  ng-model="paymtSrc.RRSPS"> RRSPS
                            </label>
                            
                             <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value ="Investments" btn-checkbox="'Investments'"
                                ng-change="change()"  ng-model="paymtSrc.Investments"> Investments
                            </label>
                            <br>
                            <br>
                            <label style="width: 20%; border-radius: 5px 0px 0px 5px;" class="btn btn-primary" ng-true-value="Borrowed" btn-checkbox="'Borrowed'"
                                ng-change="change()"  ng-model="paymtSrc.Borrowed"> Borrowed
                            </label>
                            <label style="width: 20%;" class="btn btn-primary" ng-true-value="SaleofProperty" btn-checkbox="'SaleofProperty'"
                                ng-change="change()"  ng-model="paymtSrc.SaleofProperty"> Sale of Property
                            </label>
                            <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="Gift" btn-checkbox="'Gift'"
                                ng-change="change()"  ng-model="paymtSrc.Gift"> Gift
                            </label>
                           <br> 
                            <br>
                            <label style="width: 20%; border-radius: 5px 0px 0px 5px;" class="btn btn-primary" ng-true-value="PersonalCash" btn-checkbox="'PersonalCash'"
                                ng-change="change()"  ng-model="paymtSrc.PersonalCash"> Personal Cash
                            </label>
                            <label style="width: 20%;" class="btn btn-primary" ng-true-value="ExistingEquity" btn-checkbox="'ExistingEquity'"
                                ng-change="change()"  ng-model="paymtSrc.ExistingEquity"> Existing Equity
                            </label>
                            <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="SweatEnquity" btn-checkbox="'SweatEnquity'"
                                ng-change="change()"  ng-model="paymtSrc.SweatEnquity"> Sweat Equity
                            </label>
                </div>
                <div id="widget_settings_27" style="position: absolute;"> </div>
                <input type="hidden" name="paymtSrcList[]" value=""""),format.raw/*122.67*/("""{"""),format.raw/*122.68*/("""{"""),format.raw/*122.69*/("""checkResults"""),format.raw/*122.81*/("""}"""),format.raw/*122.82*/("""}"""),format.raw/*122.83*/("""">
                 <input type="hidden" name="bankAccount" value=""""),format.raw/*123.65*/("""{"""),format.raw/*123.66*/("""{"""),format.raw/*123.67*/("""paymtSrc.BankAccount"""),format.raw/*123.87*/("""}"""),format.raw/*123.88*/("""}"""),format.raw/*123.89*/("""" ></input>
                 <input type="hidden" name="rrsps" value=""""),format.raw/*124.59*/("""{"""),format.raw/*124.60*/("""{"""),format.raw/*124.61*/("""paymtSrc.RRSPS"""),format.raw/*124.75*/("""}"""),format.raw/*124.76*/("""}"""),format.raw/*124.77*/("""" ></input>
                 <input type="hidden" name="investments" value=""""),format.raw/*125.65*/("""{"""),format.raw/*125.66*/("""{"""),format.raw/*125.67*/("""paymtSrc.Investments"""),format.raw/*125.87*/("""}"""),format.raw/*125.88*/("""}"""),format.raw/*125.89*/("""" ></input>
                 <input type="hidden" name="borrowed" value=""""),format.raw/*126.62*/("""{"""),format.raw/*126.63*/("""{"""),format.raw/*126.64*/("""paymtSrc.Borrowed"""),format.raw/*126.81*/("""}"""),format.raw/*126.82*/("""}"""),format.raw/*126.83*/("""" ></input>
                 <input type="hidden" name="saleofProperty" value=""""),format.raw/*127.68*/("""{"""),format.raw/*127.69*/("""{"""),format.raw/*127.70*/("""paymtSrc.SaleofProperty"""),format.raw/*127.93*/("""}"""),format.raw/*127.94*/("""}"""),format.raw/*127.95*/("""" ></input>
                 <input type="hidden" name="gift" value=""""),format.raw/*128.58*/("""{"""),format.raw/*128.59*/("""{"""),format.raw/*128.60*/("""paymtSrc.Gift"""),format.raw/*128.73*/("""}"""),format.raw/*128.74*/("""}"""),format.raw/*128.75*/("""" ></input>
                 <input type="hidden" name="personalCash" value=""""),format.raw/*129.66*/("""{"""),format.raw/*129.67*/("""{"""),format.raw/*129.68*/("""paymtSrc.PersonalCash"""),format.raw/*129.89*/("""}"""),format.raw/*129.90*/("""}"""),format.raw/*129.91*/("""" ></input>
                 <input type="hidden" name="existingEquity" value=""""),format.raw/*130.68*/("""{"""),format.raw/*130.69*/("""{"""),format.raw/*130.70*/("""paymtSrc.ExistingEquity"""),format.raw/*130.93*/("""}"""),format.raw/*130.94*/("""}"""),format.raw/*130.95*/("""" ></input>
                 <input type="hidden" name="sweatEnquity" value=""""),format.raw/*131.66*/("""{"""),format.raw/*131.67*/("""{"""),format.raw/*131.68*/("""paymtSrc.SweatEnquity"""),format.raw/*131.89*/("""}"""),format.raw/*131.90*/("""}"""),format.raw/*131.91*/("""" ></input> 
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
              		<input type="hidden" name="living4Financing" value=""""),format.raw/*145.69*/("""{"""),format.raw/*145.70*/("""{"""),format.raw/*145.71*/("""newItemType3"""),format.raw/*145.83*/("""}"""),format.raw/*145.84*/("""}"""),format.raw/*145.85*/("""" ></input>
           		</div>
           		<div id="input_203" style="position: absolute;"> </div>
           		<br>
           		<br>
           		
           		<div ng-if="newItemType3 == 'OwnerAndRenter' || newItemType3 == 'Renter'">
						<label class="labelfont">What is the MONTHLY rent you expect to receive from this property?<span style="color: red; font-size: 3">*</span></label><br>
							<input type="text" style="width: 33%" size="12" id="input_394" placeholder="e.g. 3000" 
								name="rentalAmount" class="form-control" data-type="input-number" value=""""),_display_(/*154.83*/lendingTerm/*154.94*/.getRentalAmount),format.raw/*154.110*/("""" onkeypress="return isNumber(event)">		
	        				<div id="input_39"> </div>
	        				<br>
	        	</div>
           		<label class="labelfont">Is the property MLS listed through a realtor, a private sale directly through owner or a new build directly through a builder? <span style="color: red; font-size: 3">*</span></label><br>
	        	<div class="btn-group" style="width: 100%;">
          			
                            <label style="width: 20%;" class="btn btn-primary" btn-radio="'MLSListed'"
                                ng-change="change()"  ng-model="newItemType16"> MLS Listed
                            </label>
                             <label style="width: 20%;" class="btn btn-primary" btn-radio="'PrivateSale'"
                                ng-change="change()"  ng-model="newItemType16"> Private Sale
                            </label>
                            
                             <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'NewBuild'"
                                ng-change="change()"  ng-model="newItemType16"> New Build
                            </label>
                </div>
                <input type="hidden" name="mlsList" value=""""),format.raw/*172.60*/("""{"""),format.raw/*172.61*/("""{"""),format.raw/*172.62*/("""newItemType16"""),format.raw/*172.75*/("""}"""),format.raw/*172.76*/("""}"""),format.raw/*172.77*/("""" ></input>
                <div id="widget_settings_69" style="position: absolute;"></div>
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
						    <label>20% complete</label>
						    </div>
						  </div>
						</div>
					 </div>
				</div>
	 			
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
                  DATE: Mon May 16 20:16:16 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage2Pur.scala.html
                  HASH: 15526f351aec10a20a1a44f59b629caee7c1d528
                  MATRIX: 746->1|888->55|915->56|1271->386|1285->392|1341->428|1694->754|1709->760|1774->804|1827->830|1842->836|1919->892|1972->918|1987->924|2054->970|2190->1079|2205->1085|2268->1127|2311->1143|2326->1149|2388->1190|2475->1250|2490->1256|2550->1295|2626->1344|2641->1350|2696->1384|2772->1433|2787->1439|2845->1476|3054->1658|3095->1678|3184->1740|3204->1751|3242->1768|3324->1823|3344->1834|3378->1847|3710->2152|3725->2158|3786->2198|3992->2378|4052->2429|4091->2430|4121->2433|4202->2484|4232->2488|4286->2533|4325->2534|4355->2537|4430->2582|4460->2586|4520->2637|4559->2638|4589->2641|4670->2692|4700->2696|4757->2744|4796->2745|4826->2748|4904->2796|4934->2800|4997->2854|5036->2855|5066->2858|5150->2912|5180->2916|5233->2960|5272->2961|5302->2964|5376->3008|5406->3012|5467->3064|5506->3065|5536->3068|5618->3120|5648->3124|5711->3178|5750->3179|5780->3182|5864->3236|5894->3240|5954->3291|5993->3292|6023->3295|6105->3347|6135->3350|6556->3744|6576->3755|6608->3766|7014->4145|7034->4156|7071->4171|10296->7367|10326->7368|10356->7369|10397->7381|10427->7382|10457->7383|10553->7450|10583->7451|10613->7452|10662->7472|10692->7473|10722->7474|10821->7544|10851->7545|10881->7546|10924->7560|10954->7561|10984->7562|11089->7638|11119->7639|11149->7640|11198->7660|11228->7661|11258->7662|11360->7735|11390->7736|11420->7737|11466->7754|11496->7755|11526->7756|11634->7835|11664->7836|11694->7837|11746->7860|11776->7861|11806->7862|11904->7931|11934->7932|11964->7933|12006->7946|12036->7947|12066->7948|12172->8025|12202->8026|12232->8027|12282->8048|12312->8049|12342->8050|12450->8129|12480->8130|12510->8131|12562->8154|12592->8155|12622->8156|12728->8233|12758->8234|12788->8235|12838->8256|12868->8257|12898->8258|13895->9226|13925->9227|13955->9228|13996->9240|14026->9241|14056->9242|14657->9815|14678->9826|14717->9842|15996->11092|16026->11093|16056->11094|16098->11107|16128->11108|16158->11109
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|69->41|69->41|69->41|74->46|74->46|74->46|75->47|76->48|77->49|77->49|77->49|78->50|79->51|80->52|80->52|80->52|81->53|82->54|83->55|83->55|83->55|84->56|85->57|86->58|86->58|86->58|87->59|88->60|89->61|89->61|89->61|90->62|91->63|92->64|92->64|92->64|93->65|94->66|95->67|95->67|95->67|96->68|97->69|98->70|98->70|98->70|99->71|100->72|101->73|106->78|106->78|106->78|111->83|111->83|111->83|150->122|150->122|150->122|150->122|150->122|150->122|151->123|151->123|151->123|151->123|151->123|151->123|152->124|152->124|152->124|152->124|152->124|152->124|153->125|153->125|153->125|153->125|153->125|153->125|154->126|154->126|154->126|154->126|154->126|154->126|155->127|155->127|155->127|155->127|155->127|155->127|156->128|156->128|156->128|156->128|156->128|156->128|157->129|157->129|157->129|157->129|157->129|157->129|158->130|158->130|158->130|158->130|158->130|158->130|159->131|159->131|159->131|159->131|159->131|159->131|173->145|173->145|173->145|173->145|173->145|173->145|182->154|182->154|182->154|200->172|200->172|200->172|200->172|200->172|200->172
                  -- GENERATED --
              */
          