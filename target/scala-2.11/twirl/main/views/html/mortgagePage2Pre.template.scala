
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
object mortgagePage2Pre extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,LendingTerm,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(uniid:String,lendingTerm:LendingTerm):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="shortcut icon" href=""""),_display_(/*9.34*/routes/*9.40*/.Assets.at("_resources/favicon.ico")),format.raw/*9.76*/("""">  
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script> 
<script src=""""),_display_(/*12.15*/routes/*12.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*12.65*/(""""></script> 
<script src=""""),_display_(/*13.15*/routes/*13.21*/.Assets.at("javascripts/mortgageJs/mortgagePage2Pre.js")),format.raw/*13.77*/(""""></script>
 
<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*16.31*/routes/*16.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*16.79*/("""">
<script src="""),_display_(/*17.14*/routes/*17.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*17.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*18.47*/routes/*18.53*/.Assets.at("_resources/background.css")),format.raw/*18.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*19.47*/routes/*19.53*/.Assets.at("_resources/forms.css")),format.raw/*19.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*20.47*/routes/*20.53*/.Assets.at("_resources/template.css")),format.raw/*20.90*/("""">
</head>
<body>
<br>
<br>
<div style="width: 95%">
		<form name="myForm" action="mortgagePage2Pre" method="POST" onsubmit="return validateForm()">		
		<input type="hidden" value=""""),_display_(/*27.32*/uniid),format.raw/*27.37*/("""" name="uniid">		 
		<input type="hidden" value=""""),_display_(/*28.32*/lendingTerm/*28.43*/.getProvince),format.raw/*28.55*/("""" name="applicantProvience33">		
		<input type="hidden" value=""""),_display_(/*29.32*/lendingTerm/*29.43*/.getWhoWillLiving),format.raw/*29.60*/("""" name="whoWillLive33">
		
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*38.11*/routes/*38.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*38.57*/("""" />
		</div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<div ng-controller="DemoController" ng-init="isDisabled = false">
		"""),_display_(/*42.4*/if(lendingTerm !=null && lendingTerm.isBankAccount)/*42.55*/{_display_(Seq[Any](format.raw/*42.56*/("""
		"""),format.raw/*43.3*/("""<div ng-init="paymtSrcModel.BankAccount=true"></div>
		""")))}),format.raw/*44.4*/("""
		"""),_display_(/*45.4*/if(lendingTerm !=null && lendingTerm.isRrsps)/*45.49*/{_display_(Seq[Any](format.raw/*45.50*/("""
		"""),format.raw/*46.3*/("""<div ng-init="paymtSrcModel.RRSPS=true"></div>
		""")))}),format.raw/*47.4*/("""
		"""),_display_(/*48.4*/if(lendingTerm !=null && lendingTerm.isInvestments)/*48.55*/{_display_(Seq[Any](format.raw/*48.56*/("""
		"""),format.raw/*49.3*/("""<div ng-init="paymtSrcModel.Investments=true"></div>
		""")))}),format.raw/*50.4*/("""
		
		"""),_display_(/*52.4*/if(lendingTerm !=null && lendingTerm.isBorrowed)/*52.52*/{_display_(Seq[Any](format.raw/*52.53*/("""
		"""),format.raw/*53.3*/("""<div ng-init="paymtSrcModel.Borrowed=true"></div>
		""")))}),format.raw/*54.4*/("""
		"""),_display_(/*55.4*/if(lendingTerm !=null && lendingTerm.isSaleOfProperty)/*55.58*/{_display_(Seq[Any](format.raw/*55.59*/("""
		"""),format.raw/*56.3*/("""<div ng-init="paymtSrcModel.SaleofProperty=true"></div>
		""")))}),format.raw/*57.4*/("""
		"""),_display_(/*58.4*/if(lendingTerm !=null && lendingTerm.isGift)/*58.48*/{_display_(Seq[Any](format.raw/*58.49*/("""
		"""),format.raw/*59.3*/("""<div ng-init="paymtSrcModel.Gift=true"></div>
		""")))}),format.raw/*60.4*/("""
		
		"""),_display_(/*62.4*/if(lendingTerm !=null && lendingTerm.isPersonalCash)/*62.56*/{_display_(Seq[Any](format.raw/*62.57*/("""
		"""),format.raw/*63.3*/("""<div ng-init="paymtSrcModel.PersonalCash=true"></div>
		""")))}),format.raw/*64.4*/("""
		"""),_display_(/*65.4*/if(lendingTerm !=null && lendingTerm.isExistingEquity)/*65.58*/{_display_(Seq[Any](format.raw/*65.59*/("""
		"""),format.raw/*66.3*/("""<div ng-init="paymtSrcModel.ExistingEquity=true"></div>
		""")))}),format.raw/*67.4*/("""
		"""),_display_(/*68.4*/if(lendingTerm !=null && lendingTerm.isSweetEquity)/*68.55*/{_display_(Seq[Any](format.raw/*68.56*/("""
		"""),format.raw/*69.3*/("""<div ng-init="paymtSrcModel.SweatEnquity=true"></div>
		""")))}),format.raw/*70.4*/("""
		"""),format.raw/*71.3*/("""<br>
		<label class="labelfont"> In which province are you planning to purchase a property? <span style="color: red; font-size: 3">*</span></label>
		<select class="form-control" style="width: 25%;" value="" name="provience">
											<option value="">Province</option>
						  					<option value="AB">Alberta</option>
						  					<option value="BC">British Columbia</option>
						  					<option value="MB">Manitoba</option>
						  					<option value="NB">New Brunswick</option>
						  					<option value="NL">Newfoundland and Labrador</option>
						  					<option value="NT">Northwest Territories </option>
						  					<option value="NS">Nova Scotia</option>
						  					<option value="NU">Nunavut</option>
						  					<option value="ON">Ontario</option>
						  					<option value="PE">Prince Edward Island</option>
						  					<option value="QC">Quebec</option>
						  					<option value="SK">Saskatchewan</option>
						  					<option value="YT">Yukon</option>
											</select>
											<div id="1234" style="position: absolute;"></div><br>
		 <label class="labelfont"> What is the approximate purchase price you are planning on?<span style="color: red; font-size: 3">*</span></label>
          	<input type="text" style="width: 25%;" size="12" placeholder="e.g. 400000" id="purchasepriceID" 
					name="purchaseprice" value=""""),_display_(/*92.35*/lendingTerm/*92.46*/.getPurchasePrice),format.raw/*92.63*/("""" class="form-control" data-type="input-number" onkeypress="return isNumber(event)">
					<div id="cid_24"> </div>
					<br>
			<label class="labelfont">How much money are you planning as a downpayment?<span style="color: red; font-size: 3">*</span></label>
			<input type="text" style="width: 25%" size="12" id="input_25"  placeholder="e.g. 300000"
					name="downpayment" value=""""),_display_(/*97.33*/lendingTerm/*97.44*/.getDownpayment),format.raw/*97.59*/("""" class="form-control" data-type="input-number" onkeypress="return isNumber(event)">		
	        		<div id="cid_25"> </div>
	        		<br>
	    	<label class="labelfont">What are the sources of your planned down payment? (Please select all which apply)<span style="color: red; font-size: 3">*</span></label><br>
	    	<div class="btn-group" style="width: 100%;">
          					<label style="width: 20%;" ng-true-value="'Bank-Account'" class="btn btn-primary" btn-checkbox="'BankAccount'" name="test" 
                               ng-change="change()"  ng-model="paymtSrcModel.BankAccount" > Bank Account
                            </label>
                             <label style="width: 20%;" class="btn btn-primary" btn-checkbox="'RRSPS'" name="test"
                                ng-change="change()"  ng-model="paymtSrcModel.RRSPS">RRSPS
                            </label>
                            <label style="width: 20%; border-radius: 0px 5px 5px 0px;" ng-true-value="'Investments'" class="btn btn-primary" btn-checkbox="'Investments'"  name="test"
                               ng-change="change()"   ng-model="paymtSrcModel.Investments" > Investments
                            </label>
                            <br>
                            <br>
                            <label style="width: 20%; border-radius: 5px 0px 0px 5px;" ng-true-value="'Borrowed'" class="btn btn-primary" btn-checkbox="'Borrowed'" name="test" 
                               ng-change="change()"   ng-model="paymtSrcModel.Borrowed" > Borrowed
                            </label>
                             <label style="width: 20%;" class="btn btn-primary" btn-checkbox="'SaleofProperty'" name="test"
                                ng-change="change()"  ng-model="paymtSrcModel.SaleofProperty"> Sale of Property 
                            </label>
                            <label style="width: 20%; border-radius: 0px 5px 5px 0px;" ng-true-value="'Gift'" class="btn btn-primary" btn-checkbox="'Gift'"name="test" 
                               ng-change="change()"  ng-model="paymtSrcModel.Gift" > Gift
                            </label>
                            <br>
                            <br>
                            <label style="width: 20%; border-radius: 5px 0px 0px 5px;" ng-true-value="'Bank-Account'" class="btn btn-primary" btn-checkbox="'PersonalCash'" name="test" 
                               ng-change="change()"   ng-model="paymtSrcModel.PersonalCash" > Personal Cash
                            </label>
                             <label style="width: 20%;" class="btn btn-primary" btn-checkbox="'ExistingEquity'" name="test"
                                ng-change="change()"  ng-model="paymtSrcModel.ExistingEquity"> Existing Equity 
                            </label>
                            <label style="width: 20%; border-radius: 0px 5px 5px 0px;" ng-true-value="'SweatEquity'" class="btn btn-primary" btn-checkbox="'SweatEnquity'" name="test" 
                               ng-change="change()"  ng-model="paymtSrcModel.SweatEnquity" > Sweat Equity
                            </label>
                </div>
                
                 <div id="widget_settings_27" style="position: absolute;"> </div>
                 <input type="hidden" name="paymtSrcList[]" value=""""),format.raw/*136.68*/("""{"""),format.raw/*136.69*/("""{"""),format.raw/*136.70*/("""checkResults"""),format.raw/*136.82*/("""}"""),format.raw/*136.83*/("""}"""),format.raw/*136.84*/("""">
                 <input type="hidden" name="bankAccount" value=""""),format.raw/*137.65*/("""{"""),format.raw/*137.66*/("""{"""),format.raw/*137.67*/("""paymtSrcModel.BankAccount"""),format.raw/*137.92*/("""}"""),format.raw/*137.93*/("""}"""),format.raw/*137.94*/("""" ></input>
                 <input type="hidden" name="rrsps" value=""""),format.raw/*138.59*/("""{"""),format.raw/*138.60*/("""{"""),format.raw/*138.61*/("""paymtSrcModel.RRSPS"""),format.raw/*138.80*/("""}"""),format.raw/*138.81*/("""}"""),format.raw/*138.82*/("""" ></input>
                 <input type="hidden" name="investments" value=""""),format.raw/*139.65*/("""{"""),format.raw/*139.66*/("""{"""),format.raw/*139.67*/("""paymtSrcModel.Investments"""),format.raw/*139.92*/("""}"""),format.raw/*139.93*/("""}"""),format.raw/*139.94*/("""" ></input>
                 <input type="hidden" name="borrowed" value=""""),format.raw/*140.62*/("""{"""),format.raw/*140.63*/("""{"""),format.raw/*140.64*/("""paymtSrcModel.Borrowed"""),format.raw/*140.86*/("""}"""),format.raw/*140.87*/("""}"""),format.raw/*140.88*/("""" ></input>
                 <input type="hidden" name="saleofProperty" value=""""),format.raw/*141.68*/("""{"""),format.raw/*141.69*/("""{"""),format.raw/*141.70*/("""paymtSrcModel.SaleofProperty"""),format.raw/*141.98*/("""}"""),format.raw/*141.99*/("""}"""),format.raw/*141.100*/("""" ></input>
                 <input type="hidden" name="gift" value=""""),format.raw/*142.58*/("""{"""),format.raw/*142.59*/("""{"""),format.raw/*142.60*/("""paymtSrcModel.Gift"""),format.raw/*142.78*/("""}"""),format.raw/*142.79*/("""}"""),format.raw/*142.80*/("""" ></input>
                 <input type="hidden" name="personalCash" value=""""),format.raw/*143.66*/("""{"""),format.raw/*143.67*/("""{"""),format.raw/*143.68*/("""paymtSrcModel.PersonalCash"""),format.raw/*143.94*/("""}"""),format.raw/*143.95*/("""}"""),format.raw/*143.96*/("""" ></input>
                 <input type="hidden" name="existingEquity" value=""""),format.raw/*144.68*/("""{"""),format.raw/*144.69*/("""{"""),format.raw/*144.70*/("""paymtSrcModel.ExistingEquity"""),format.raw/*144.98*/("""}"""),format.raw/*144.99*/("""}"""),format.raw/*144.100*/("""" ></input>
                 <input type="hidden" name="sweatEnquity" value=""""),format.raw/*145.66*/("""{"""),format.raw/*145.67*/("""{"""),format.raw/*145.68*/("""paymtSrcModel.SweatEnquity"""),format.raw/*145.94*/("""}"""),format.raw/*145.95*/("""}"""),format.raw/*145.96*/("""" ></input> 
              <br>
              <br>   
             <label class="labelfont">Who will be living in the property you will be financing?<span style="color: red; font-size: 3">*</span></label><br>
							<div class="btn-group" style="width: 100%;">
								<label style="width: 20%;" class="btn btn-primary"
									btn-radio="'OwnerMyself'" ng-change="change()"
									ng-model="newItemType3"> Owner(Myself) </label> <label
									style="width: 20%;" class="btn btn-primary"
									btn-radio="'Renter'" ng-change="change()"
									ng-model="newItemType3"> Renter </label> <label
									style="width: 20%; border-radius: 0px 5px 5px 0px;"
									class="btn btn-primary" btn-radio="'OwnerAndRenter'"
									ng-change="change()" ng-model="newItemType3"> Owner &
									Renter </label> <input type="hidden" name="living4Financing"
									value=""""),format.raw/*160.17*/("""{"""),format.raw/*160.18*/("""{"""),format.raw/*160.19*/("""newItemType3"""),format.raw/*160.31*/("""}"""),format.raw/*160.32*/("""}"""),format.raw/*160.33*/(""""></input>
							</div>
							<div id="input_203" style="position: absolute;"> </div>
			           		<br>
			           		<br>
							<div
								ng-if="newItemType3 == 'OwnerAndRenter' || newItemType3 == 'Renter'">
								<label class="labelfont">What is the MONTHLY rent you
									expect to receive from this property?<span
									style="color: red; font-size: 3">*</span>
								</label><br>
								<table>
									<tr>
										<td><input type="text" id="input_394"
											placeholder="e.g. 3000" name="rentalAmount"
											style="width: 80%;" class="form-control"
											data-type="input-number" value=""""),_display_(/*176.45*/lendingTerm/*176.56*/.getRentalAmount),format.raw/*176.72*/(""""
											onkeypress="return isNumber(event)"></td>
										<td><p>
												<b>(Rental income can only apply to legal suites.)</b>
											</p></td>
									</tr>
								</table>

								<div id="input_39"></div>
								<br> <br>
							</div>
						</div>
        	
	        <br>
						<div class="row" style="width: 100%;">
							<div class="col-sm-6"
								style="float: left; padding-left: 2%; width: 50%;">
								<a href="mortgageBackPage1" class="btn btn-primary"
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

					</div>
						<br>
						<div class="container" style="width: 70%;">
						  <div class="progress">
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:20%; background-color: #6AA84F;">
						    <label>20% completed</label>
						    </div>
						  </div>
						</div>
					 </div>
				</div>
				</div>
				
				<br>
</form>
</div>
 
</body>
</html>"""))}
  }

  def render(uniid:String,lendingTerm:LendingTerm): play.twirl.api.HtmlFormat.Appendable = apply(uniid,lendingTerm)

  def f:((String,LendingTerm) => play.twirl.api.HtmlFormat.Appendable) = (uniid,lendingTerm) => apply(uniid,lendingTerm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:19 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage2Pre.scala.html
                  HASH: 7bcbb9ec5aedbf0534ada5843128f1b40ccd92f6
                  MATRIX: 746->1|872->39|899->40|1256->371|1270->377|1326->413|1583->643|1598->649|1663->693|1717->720|1732->726|1809->782|1940->886|1955->892|2018->934|2061->950|2076->956|2138->997|2225->1057|2240->1063|2300->1102|2376->1151|2391->1157|2446->1191|2522->1240|2537->1246|2595->1283|2804->1465|2830->1470|2907->1520|2927->1531|2960->1543|3051->1607|3071->1618|3109->1635|3443->1942|3458->1948|3519->1988|3685->2128|3745->2179|3784->2180|3814->2183|3900->2239|3930->2243|3984->2288|4023->2289|4053->2292|4133->2342|4163->2346|4223->2397|4262->2398|4292->2401|4378->2457|4411->2464|4468->2512|4507->2513|4537->2516|4620->2569|4650->2573|4713->2627|4752->2628|4782->2631|4871->2690|4901->2694|4954->2738|4993->2739|5023->2742|5102->2791|5135->2798|5196->2850|5235->2851|5265->2854|5352->2911|5382->2915|5445->2969|5484->2970|5514->2973|5603->3032|5633->3036|5693->3087|5732->3088|5762->3091|5849->3148|5879->3151|7255->4500|7275->4511|7313->4528|7722->4910|7742->4921|7778->4936|11152->8281|11182->8282|11212->8283|11253->8295|11283->8296|11313->8297|11409->8364|11439->8365|11469->8366|11523->8391|11553->8392|11583->8393|11682->8463|11712->8464|11742->8465|11790->8484|11820->8485|11850->8486|11955->8562|11985->8563|12015->8564|12069->8589|12099->8590|12129->8591|12231->8664|12261->8665|12291->8666|12342->8688|12372->8689|12402->8690|12510->8769|12540->8770|12570->8771|12627->8799|12657->8800|12688->8801|12786->8870|12816->8871|12846->8872|12893->8890|12923->8891|12953->8892|13059->8969|13089->8970|13119->8971|13174->8997|13204->8998|13234->8999|13342->9078|13372->9079|13402->9080|13459->9108|13489->9109|13520->9110|13626->9187|13656->9188|13686->9189|13741->9215|13771->9216|13801->9217|14703->10090|14733->10091|14763->10092|14804->10104|14834->10105|14864->10106|15527->10741|15548->10752|15586->10768
                  LINES: 26->1|29->1|30->2|37->9|37->9|37->9|40->12|40->12|40->12|41->13|41->13|41->13|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|66->38|66->38|66->38|70->42|70->42|70->42|71->43|72->44|73->45|73->45|73->45|74->46|75->47|76->48|76->48|76->48|77->49|78->50|80->52|80->52|80->52|81->53|82->54|83->55|83->55|83->55|84->56|85->57|86->58|86->58|86->58|87->59|88->60|90->62|90->62|90->62|91->63|92->64|93->65|93->65|93->65|94->66|95->67|96->68|96->68|96->68|97->69|98->70|99->71|120->92|120->92|120->92|125->97|125->97|125->97|164->136|164->136|164->136|164->136|164->136|164->136|165->137|165->137|165->137|165->137|165->137|165->137|166->138|166->138|166->138|166->138|166->138|166->138|167->139|167->139|167->139|167->139|167->139|167->139|168->140|168->140|168->140|168->140|168->140|168->140|169->141|169->141|169->141|169->141|169->141|169->141|170->142|170->142|170->142|170->142|170->142|170->142|171->143|171->143|171->143|171->143|171->143|171->143|172->144|172->144|172->144|172->144|172->144|172->144|173->145|173->145|173->145|173->145|173->145|173->145|188->160|188->160|188->160|188->160|188->160|188->160|204->176|204->176|204->176
                  -- GENERATED --
              */
          