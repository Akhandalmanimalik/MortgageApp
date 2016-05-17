
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
object mortgagePageAssetsTest extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,TotalAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String,applicantName:String,coApplicantName:String,totalAssetList:TotalAssets):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html ng-app="demoApp">
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href=""""),_display_(/*9.34*/routes/*9.40*/.Assets.at("_resources/favicon.ico")),format.raw/*9.76*/("""">

<link rel="stylesheet" href=""""),_display_(/*11.31*/routes/*11.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*11.79*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*12.47*/routes/*12.53*/.Assets.at("_resources/template.css")),format.raw/*12.90*/("""">


<script src=""""),_display_(/*15.15*/routes/*15.21*/.Assets.at("_resources/angular.min.js")),format.raw/*15.60*/(""""></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.6.0/ui-bootstrap.min.js
"></script>
<script src=""""),_display_(/*20.15*/routes/*20.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*20.65*/(""""></script>
<script src=""""),_display_(/*21.15*/routes/*21.21*/.Assets.at("javascripts/mortgageJs/mortgagePage10Assests.js")),format.raw/*21.82*/(""""></script>

</head>
<body>
<div style="width: 97%;">
	<!-- <form name="myForm" action="mortgagePage10" method="POST" onsubmit="return validateForm();"> -->
	<form name="myForm" action="mortgagePage10" method="POST" onsubmit="return validateForm();">
		<div style="width: 90%">
			<div class="row"></div>
			<div class="row">
				<div class="col-sm-3"></div>
				<div class="col-sm-7 container-bg text-color-blue">
					<div style="padding-top: 50px"></div>
					<img alt="Visdom Logo" height="90" width="260"	src=""""),_display_(/*34.59*/routes/*34.65*/.Assets.at("_resources/visdom-logo.png")),format.raw/*34.105*/("""" />
					<div data-ng-app="demoApp" style="margin-left: 5%">
						<div ng-controller="DemoController" ng-init="isDisabled = false;vehicleList="""),_display_(/*36.84*/totalAssetList/*36.98*/.getVehicle.length),format.raw/*36.116*/(""";bankAccList="""),_display_(/*36.130*/totalAssetList/*36.144*/.getBankAccount.length),format.raw/*36.166*/(""";rrspList="""),_display_(/*36.177*/totalAssetList/*36.191*/.getRrsp.length),format.raw/*36.206*/(""";investmtList="""),_display_(/*36.221*/totalAssetList/*36.235*/.getInvestments.length),format.raw/*36.257*/(""";otherList="""),_display_(/*36.269*/totalAssetList/*36.283*/.getOthers.length),format.raw/*36.300*/(""";">
						
							<input type="hidden" name="ip" value="" id="ip">
							
								"""),_display_(/*40.10*/if(totalAssetList.getVehicle != null && totalAssetList.getVehicle.length >0)/*40.86*/{_display_(Seq[Any](format.raw/*40.87*/("""
								"""),format.raw/*41.9*/("""<div ng-init="asset.Vehicle=true"></div>
								""")))}),format.raw/*42.10*/(""" 
										
								
								"""),_display_(/*45.10*/if(totalAssetList.getBankAccount != null && totalAssetList.getBankAccount.length >0)/*45.94*/{_display_(Seq[Any](format.raw/*45.95*/("""
								"""),format.raw/*46.9*/("""<div ng-init="asset.BankAccount=true"></div>
								""")))}),format.raw/*47.10*/("""
								
								"""),_display_(/*49.10*/if(totalAssetList.getInvestments != null && totalAssetList.getInvestments.length >0)/*49.94*/{_display_(Seq[Any](format.raw/*49.95*/("""
								"""),format.raw/*50.9*/("""<div ng-init="asset.Investments=true"></div>
								""")))}),format.raw/*51.10*/("""
								
								"""),_display_(/*53.10*/if(totalAssetList.getOthers != null && totalAssetList.getOthers.length >0)/*53.84*/{_display_(Seq[Any](format.raw/*53.85*/("""
								"""),format.raw/*54.9*/("""<div ng-init="asset.Other=true"></div>
								""")))}),format.raw/*55.10*/("""
								
								"""),format.raw/*57.9*/("""<div ng-repeat="result in asset"></div>
						
						
							<div class="form-group">
								<label class="labelfont"> <font size="6">Assets </font></label>
							</div>
							<div id="text_174" class="form-html form-input-wide">
								<p>Lenders require information about other assets to verify
									down-payment or net worth information.</p>
							</div>
							<label class="labelfont">Please select all types of assets which you own.<span
								style="color: red; font-size: 3">*</span></label><br>
							<div class="btn-group" data-toggle="buttons" style="width: 100%;">
								<label style="width: 20%;" class="btn btn-primary" ng-true-value="Vehicle" btn-checkbox="'Vehicle'" 
									ng-change="change()" ng-model="asset.Vehicle"> Vehicle </label> 
								<label	style="width: 20%;" class="btn btn-primary" ng-true-value="BankAccount" btn-checkbox="'BankAccount'"
									ng-change="change()" ng-model="asset.BankAccount"> Bank Account </label>
								 <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="RRSPTSFA" btn-checkbox="'RRSPTSFA'" 
								 ng-change="change()" ng-model="asset.RRSPTSFA">RRSP / TSFA </label>
								 <br><br> 
								<label style="width: 20%; border-radius: 5px 0px 0px 5px;" class="btn btn-primary" ng-true-value="Investments" btn-checkbox="'Investments'"
								 ng-change="change()" ng-model="asset.Investments"> Investments </label> 
								<label style="width: 20%" class="btn btn-primary" ng-true-value="Other" btn-checkbox="'Other'"
								 ng-change="change()" ng-model="asset.Other"> Other </label>
								 <label	style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="None" btn-checkbox="'None'"
								 ng-change="change1()"	ng-model="asset.None"> None </label>
								 
							
							</div>
							
							<div id="role1"></div>
								<input type="hidden" name="assetTypes[]" value=""""),format.raw/*88.57*/("""{"""),format.raw/*88.58*/("""{"""),format.raw/*88.59*/("""assetResults"""),format.raw/*88.71*/("""}"""),format.raw/*88.72*/("""}"""),format.raw/*88.73*/("""">
								<input type="hidden" name="Vehicle" value = """),format.raw/*89.53*/("""{"""),format.raw/*89.54*/("""{"""),format.raw/*89.55*/("""asset.Vehicle"""),format.raw/*89.68*/("""}"""),format.raw/*89.69*/("""}"""),format.raw/*89.70*/("""	"""),format.raw/*89.71*/("""ng-required>
								<input type="hidden" name="BankAccount" value = """),format.raw/*90.57*/("""{"""),format.raw/*90.58*/("""{"""),format.raw/*90.59*/("""asset.BankAccount"""),format.raw/*90.76*/("""}"""),format.raw/*90.77*/("""}"""),format.raw/*90.78*/("""	"""),format.raw/*90.79*/("""ng-required>
								<input type="hidden" name="RRSPTSFA" value = """),format.raw/*91.54*/("""{"""),format.raw/*91.55*/("""{"""),format.raw/*91.56*/("""asset.RRSPTSFA"""),format.raw/*91.70*/("""}"""),format.raw/*91.71*/("""}"""),format.raw/*91.72*/("""	"""),format.raw/*91.73*/("""ng-required>
								<input type="hidden" name="Investments" value="""),format.raw/*92.55*/("""{"""),format.raw/*92.56*/("""{"""),format.raw/*92.57*/("""asset.Investments"""),format.raw/*92.74*/("""}"""),format.raw/*92.75*/("""}"""),format.raw/*92.76*/(""" """),format.raw/*92.77*/("""ng-required>
								<input type="hidden" name="Other" value="""),format.raw/*93.49*/("""{"""),format.raw/*93.50*/("""{"""),format.raw/*93.51*/("""asset.Other"""),format.raw/*93.62*/("""}"""),format.raw/*93.63*/("""}"""),format.raw/*93.64*/("""	"""),format.raw/*93.65*/("""ng-required>
								<input type="hidden" name="None" value="""),format.raw/*94.48*/("""{"""),format.raw/*94.49*/("""{"""),format.raw/*94.50*/("""asset.None"""),format.raw/*94.60*/("""}"""),format.raw/*94.61*/("""}"""),format.raw/*94.62*/(""" """),format.raw/*94.63*/("""ng-required>
								
								<br><br>
								<div ng-if="asset.Vehicle || asset.BankAccount || asset.RRSPTSFA || asset.Investments || asset.Other">
								<table>
									<th width="17%">Type of Asset:</th>
									<th width="37%" style="padding-left: 13%;">Description</th>
									<th width="17%" style="padding-left: 15%;">Value</th>
									<th width="17%" style="padding-left: 17%;">Ownership</th>
									<th width="13%"></th>
								</table>
								 
								</div>
								
								<div ng-show="asset.Vehicle" class="form-input-wide">
									<table class="form-table small-text" id="customFields" style="border-collapse: separate;  border-spacing: 0px 10px;">
										<tr ng-if="vehicleList<1">
										<th scope="row"><label for="customFieldName"></label></th>
										<td width="17%"><input type="text" name="asset[]" id="asset"
											 class="form-control" value="Vehicle" readonly="readonly"></td>
										<td width="36%"><input type="text" name="description[]"
											placeholder="description" id="description" class="form-control" value=""></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number" 
											name="value[]" id="value" placeholder="e.g. 500,000" width="17%" class="form-control" value=""></td>
										<td width="17%"><select name="designation[]"  class="form-control" >
												<option value="" >Please Select</option>
												<option value=""""),_display_(/*120.29*/applicantName),format.raw/*120.42*/("""">"""),_display_(/*120.45*/applicantName),format.raw/*120.58*/("""</option>
												<option value=""""),_display_(/*121.29*/coApplicantName),format.raw/*121.44*/("""">"""),_display_(/*121.47*/coApplicantName),format.raw/*121.62*/("""</option>
												<option value="Joint">Joint</option>
										</select>
										</td>
										<td style="width: 13%;"></td>
									</tr>
									"""),_display_(/*127.11*/if(totalAssetList.getVehicle.length>0)/*127.49*/{_display_(Seq[Any](format.raw/*127.50*/("""
									"""),_display_(/*128.11*/for((list,index) <-totalAssetList.getVehicle.zipWithIndex) yield /*128.69*/{_display_(Seq[Any](format.raw/*128.70*/("""
									"""),format.raw/*129.10*/("""<tr>
									<th scope="row"><label for="customFieldName2"></label></th>
										<td width="17%"><input type="text" name="asset[]" id="asset"
											 class="form-control" value="Vehicle" readonly="readonly"></td>
										<td width="36%"><input type="text" name="description[]"
											placeholder="description" id="description"  class="form-control" value=""""),_display_(/*134.85*/list/*134.89*/.getDescription),format.raw/*134.104*/(""""></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number" 
											name="value[]" id="value" placeholder="e.g. 500,000" class="form-control" value=""""),_display_(/*136.94*/list/*136.98*/.getValue),format.raw/*136.107*/(""""></td>
										<td width="17%"><select name="designation[]"  class="form-control" >
												<option value="" >Please Select</option>
												<option value=""""),_display_(/*139.29*/applicantName),format.raw/*139.42*/("""">"""),_display_(/*139.45*/applicantName),format.raw/*139.58*/("""</option>
												<option value=""""),_display_(/*140.29*/coApplicantName),format.raw/*140.44*/("""">"""),_display_(/*140.47*/coApplicantName),format.raw/*140.62*/("""</option>
												<option value="Joint">Joint</option>
										</select>
										</td>
										<td style="width: 13%;"><a ng-if=""""),_display_(/*144.46*/{{index}}),format.raw/*144.55*/(""" """),format.raw/*144.56*/("""> 0 " href="javascript:void(0);" class="remCF glyphicon glyphicon-remove">Remove</a></td>
										</tr>
										
										""")))}),format.raw/*147.12*/("""
									""")))}),format.raw/*148.11*/("""
									"""),format.raw/*149.10*/("""</table>
									<div id="description_id"></div>
									
									<a  href="javascript:void(0);" class="addCF glyphicon glyphicon-plus"><b>Additional</b></a>
								</div>
								<div ng-show="asset.BankAccount" class="form-input-wide">
									<table class="form-table small-text" id="customFields2" style="border-collapse: separate;  border-spacing: 0 10px;">
										<tr ng-if="bankAccList<1">
										<th scope="row"><label for="customFieldName2"></label></th>
										<td width="17%"><input type="text" name="asset1[]"
											 class="form-control" value="Bank Account" readonly="readonly"></td>
										<td width="36%"><input type="text" name="description1[]"
											placeholder="description" class="form-control"></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number"
											name="value1[]" placeholder="e.g. 500,000" class="form-control"></td>
										<td width="17%"><select name="designation1[]" class="form-control">
												<option value="" selected>Please Select</option>
												<option value=""""),_display_(/*166.29*/applicantName),format.raw/*166.42*/("""">"""),_display_(/*166.45*/applicantName),format.raw/*166.58*/("""</option>
												<option value=""""),_display_(/*167.29*/coApplicantName),format.raw/*167.44*/("""">"""),_display_(/*167.47*/coApplicantName),format.raw/*167.62*/("""</option>
												<option value="Joint">Joint</option>
										</select>
										</td>
										<td style="width: 13%;"></td>
										</tr>
										"""),_display_(/*173.12*/if(totalAssetList.getBankAccount.length>0)/*173.54*/{_display_(Seq[Any](format.raw/*173.55*/("""
										"""),_display_(/*174.12*/for((list,index) <-totalAssetList.getBankAccount.zipWithIndex) yield /*174.74*/{_display_(Seq[Any](format.raw/*174.75*/("""
										"""),format.raw/*175.11*/("""<tr>
										<th scope="row"><label for="customFieldName2"></label></th>
										<td width="17%"><input type="text" name="asset1[]"
											 class="form-control" value="Bank Account" readonly="readonly"></td>
										<td width="36%"><input type="text" name="description1[]"
											placeholder="description" class="form-control" value=""""),_display_(/*180.67*/list/*180.71*/.getDescription),format.raw/*180.86*/(""""></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number"
											name="value1[]" placeholder="e.g. 500,000" class="form-control" value=""""),_display_(/*182.84*/list/*182.88*/.getValue),format.raw/*182.97*/(""""></td>
										<td width="17%"><select name="designation1[]" class="form-control">
												<option value="" selected>Please Select</option>
												<option value=""""),_display_(/*185.29*/applicantName),format.raw/*185.42*/("""">"""),_display_(/*185.45*/applicantName),format.raw/*185.58*/("""</option>
												<option value=""""),_display_(/*186.29*/coApplicantName),format.raw/*186.44*/("""">"""),_display_(/*186.47*/coApplicantName),format.raw/*186.62*/("""</option>
												<option value="Joint">Joint</option>
										</select>
										</td>
										<td style="width: 13%;"><a ng-if=""""),_display_(/*190.46*/{{index}}),format.raw/*190.55*/(""" """),format.raw/*190.56*/("""> 0 " href="javascript:void(0);" class="remCF2 glyphicon glyphicon-remove">Remove</a></td>
										</tr>
											""")))}),format.raw/*192.13*/("""
										""")))}),format.raw/*193.12*/("""
									"""),format.raw/*194.10*/("""</table>
									<div id="description_id_2"></div>
									<a href="javascript:void(0);" class="addCF2 glyphicon glyphicon-plus"><b>Additional</b></a>
								</div>
								
								 <div ng-show="asset.RRSPTSFA" class="form-input-wide">
									<table class="form-table small-text" id="customFields3" style="border-collapse: separate;  border-spacing: 0 10px;">
										<tr ng-if="rrspList<1">
										<th scope="row"><label for="customFieldName3"></label></th>
										<td width="17%"><input type="text" id="asset2" name="asset2[]"
											 class="form-control" value="RSP-TSFA" readonly="readonly"></td>
										<td width="36%"><input type="text" id="description2" name="description2[]"
											placeholder="description" class="form-control"></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number"
											name="value2[]" id="value2" placeholder="e.g. 500,000" class="form-control"></td>
										<td width="17%"><select name="designation2[]" id="designation2" class="form-control">
												<option value="" selected>Please Select</option>
												<option value=""""),_display_(/*211.29*/applicantName),format.raw/*211.42*/("""">"""),_display_(/*211.45*/applicantName),format.raw/*211.58*/("""</option>
												<option value=""""),_display_(/*212.29*/coApplicantName),format.raw/*212.44*/("""">"""),_display_(/*212.47*/coApplicantName),format.raw/*212.62*/("""</option>
												<option value="Joint">Joint</option>
										</select>
										</td>
										<td style="width: 13%;"></td>
										</tr>
										"""),_display_(/*218.12*/if(totalAssetList.getRrsp.length>0)/*218.47*/{_display_(Seq[Any](format.raw/*218.48*/("""
										"""),_display_(/*219.12*/for((list,index) <-totalAssetList.getRrsp.zipWithIndex) yield /*219.67*/{_display_(Seq[Any](format.raw/*219.68*/("""
										"""),format.raw/*220.11*/("""<tr>
										<th scope="row"><label for="customFieldName3"></label></th>
										<td width="17%"><input type="text" id="asset2" name="asset2[]"
											 class="form-control" value="RRSPTSFA" readonly="readonly"></td>
										<td width="36%"><input type="text" id="description2" name="description2[]"
											placeholder="description" class="form-control" value=""""),_display_(/*225.67*/list/*225.71*/.getDescription),format.raw/*225.86*/(""""></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number"
											name="value2[]" id="value2" placeholder="e.g. 500,000" class="form-control" value=""""),_display_(/*227.96*/list/*227.100*/.getValue),format.raw/*227.109*/(""""></td>
										<td width="17%"><select name="designation2[]" id="designation2" class="form-control">
												<option value="" selected>Please Select</option>
												<option value=""""),_display_(/*230.29*/applicantName),format.raw/*230.42*/("""">"""),_display_(/*230.45*/applicantName),format.raw/*230.58*/("""</option>
												<option value=""""),_display_(/*231.29*/coApplicantName),format.raw/*231.44*/("""">"""),_display_(/*231.47*/coApplicantName),format.raw/*231.62*/("""</option>
												<option value="Joint">Joint</option>
										</select>
										</td>
										<td style="width: 13%;"><a ng-if=""""),_display_(/*235.46*/{{index}}),format.raw/*235.55*/(""" """),format.raw/*235.56*/("""> 0 " href="javascript:void(0);" class="remCF3 glyphicon glyphicon-remove">Remove</a></td>
										</tr>
										""")))}),format.raw/*237.12*/("""
									""")))}),format.raw/*238.11*/("""
									"""),format.raw/*239.10*/("""</table>
									
									
									<div id="description_id_3"></div>
									<a href="javascript:void(0);" class="addCF3 glyphicon glyphicon-plus"><b>Additional</b></a>
								</div>
								
								<div ng-show="asset.Investments" class="form-input-wide">
									<table class="form-table small-text" id="customFields4" style="border-collapse: separate;  border-spacing: 0 10px;">
										<tr ng-if="investmtList<1">
										<th scope="row"><label for="customFieldName4"></label></th>
										<td width="17%"><input type="text" name="asset3[]" id="asset3" 
											 class="form-control" value="Investments" readonly="readonly"></td>
										<td width="36%"><input type="text" name="description3[]" id="description3" 
											placeholder="description" class="form-control"></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number" id="value3" 
											name="value3[]" placeholder="e.g. 500,000" class="form-control"></td>
										<td width="17%"><select name="designation3[]" id="designation3" class="form-control">
												<option value="" selected>Please Select</option>
												<option value=""""),_display_(/*258.29*/applicantName),format.raw/*258.42*/("""">"""),_display_(/*258.45*/applicantName),format.raw/*258.58*/("""</option>
												<option value=""""),_display_(/*259.29*/coApplicantName),format.raw/*259.44*/("""">"""),_display_(/*259.47*/coApplicantName),format.raw/*259.62*/("""</option>
												<option value="Joint">Joint</option>
										</select></td>
										<td style="width: 13%;"></td>
										</tr>
										"""),_display_(/*264.12*/if(totalAssetList.getInvestments.length>0)/*264.54*/{_display_(Seq[Any](format.raw/*264.55*/("""
										"""),_display_(/*265.12*/for((list,index) <-totalAssetList.getInvestments.zipWithIndex) yield /*265.74*/{_display_(Seq[Any](format.raw/*265.75*/("""
										"""),format.raw/*266.11*/("""<tr>
										<th scope="row"><label for="customFieldName4"></label></th>
										<td width="17%"><input type="text" name="asset3[]" id="asset3" 
											 class="form-control" value="Investments" readonly="readonly"></td>
										<td width="36%"><input type="text" name="description3[]" id="description3" 
											placeholder="description" class="form-control" value=""""),_display_(/*271.67*/list/*271.71*/.getDescription),format.raw/*271.86*/(""""></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number" id="value3" 
											name="value3[]" placeholder="e.g. 500,000" class="form-control" value=""""),_display_(/*273.84*/list/*273.88*/.getValue),format.raw/*273.97*/(""""></td>
										<td width="17%"><select name="designation3[]" id="designation3" class="form-control">
												<option value="" selected>Please Select</option>
												<option value=""""),_display_(/*276.29*/applicantName),format.raw/*276.42*/("""">"""),_display_(/*276.45*/applicantName),format.raw/*276.58*/("""</option>
												<option value=""""),_display_(/*277.29*/coApplicantName),format.raw/*277.44*/("""">"""),_display_(/*277.47*/coApplicantName),format.raw/*277.62*/("""</option>
												<option value="Joint">Joint</option>
										</select></td>
										<td style="width: 13%;"><a ng-if=""""),_display_(/*280.46*/{{index}}),format.raw/*280.55*/(""" """),format.raw/*280.56*/("""> 0 " href="javascript:void(0);" class="remCF4 glyphicon glyphicon-remove">Remove</a></td>
										</tr>
										""")))}),format.raw/*282.12*/("""
										""")))}),format.raw/*283.12*/("""
									"""),format.raw/*284.10*/("""</table>
									
									<div id="description_id_4"></div>
									
									<a href="javascript:void(0);" class="addCF4 glyphicon glyphicon-plus"><b>Additional</b></a>
								</div>
								
								<div ng-show="asset.Other" class="form-input-wide">
									<table class="form-table small-text" id="customFields5" style="border-collapse: separate;  border-spacing: 0 10px;">
										<tr ng-if="otherList<1">
										<th scope="row"><label for="customFieldName5"></label></th>
										<td width="17%"><input type="text" name="asset4[]" id="asset4" 
											value="Other" class="form-control" readonly="readonly"></td>
										<td width="36%"><input type="text" name="description4[]" id="description4" 
											placeholder="description" class="form-control"></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" placeholder=" e.g. 500,000" data-type="input-number"
											name="value4[]" id="value4" class="form-control"></td>
										<td width="17%"><select name="designation4[]" id="designation4" class="form-control">
												<option value="" selected>Please Select</option>
												<option value=""""),_display_(/*303.29*/applicantName),format.raw/*303.42*/("""">"""),_display_(/*303.45*/applicantName),format.raw/*303.58*/("""</option>
												<option value=""""),_display_(/*304.29*/coApplicantName),format.raw/*304.44*/("""">"""),_display_(/*304.47*/coApplicantName),format.raw/*304.62*/("""</option>
												<option value="Joint">Joint</option>
										</select></td>
										<td style="width: 13%;"></td>
										</tr>
										"""),_display_(/*309.12*/if(totalAssetList.getOthers.length>0)/*309.49*/{_display_(Seq[Any](format.raw/*309.50*/("""
										"""),_display_(/*310.12*/for((list,index) <-totalAssetList.getOthers.zipWithIndex) yield /*310.69*/{_display_(Seq[Any](format.raw/*310.70*/("""
										
										"""),format.raw/*312.11*/("""<tr>
										<th scope="row"><label for="customFieldName5"></label></th>
										<td width="17%"><input type="text" name="asset4[]" id="asset4" 
											value="Other" class="form-control" readonly="readonly"></td>
										<td width="36%"><input type="text" name="description4[]" id="description4" 
											placeholder="description" class="form-control" value=""""),_display_(/*317.67*/list/*317.71*/.getDescription),format.raw/*317.86*/(""""></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number"
											placeholder="e.g. 500,000" name="value4[]" id="value4" class="form-control" value=""""),_display_(/*319.96*/list/*319.100*/.getValue),format.raw/*319.109*/(""""></td>
										<td width="17%"><select name="designation4[]" id="designation4" class="form-control">
												<option value="" selected>Please Select</option>
												<option value=""""),_display_(/*322.29*/applicantName),format.raw/*322.42*/("""">"""),_display_(/*322.45*/applicantName),format.raw/*322.58*/("""</option>
												<option value=""""),_display_(/*323.29*/coApplicantName),format.raw/*323.44*/("""">"""),_display_(/*323.47*/coApplicantName),format.raw/*323.62*/("""</option>
												<option value="Joint">Joint</option>
										</select></td>
										<td style="width: 13%;"><a ng-if=""""),_display_(/*326.46*/{{index}}),format.raw/*326.55*/(""" """),format.raw/*326.56*/("""> 0 " href="javascript:void(0);" class="remCF5 glyphicon glyphicon-remove">Remove</a></td>
										</tr>
""")))}),format.raw/*328.2*/("""
""")))}),format.raw/*329.2*/("""
									"""),format.raw/*330.10*/("""</table>
									<div id="description_id_5"></div>
									<a href="javascript:void(0);" class="addCF5 glyphicon glyphicon-plus"><b>Additional</b></a>
								</div>
						</div>
						
						<br>
						<div class="row" style="width: 100%;">
								<div class="col-sm-6"
									style="float: left; padding-left: 2%; width: 45%;">
									<a href="mortgageBackPage89" class="btn btn-primary"
										role="button" style="width: 50%;">Back</a>
								</div>
							<div class="col-sm-6" align="right" style="float: right; padding-right:5%; width: 45%;"><input type="submit" class="btn btn-primary btn-block"
								value="Next" style="width: 50%;">
							<div align="right" id="submiterror">
								<font color="red"></font></div>
					  </div>	
					</div>
						<br>
						<div class="container" style="width: 70%;">
						  <div class="progress">
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:85%; background-color: #6AA84F;">
						    <label>85% complete</label>
						    </div>
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

  def render(message:String,applicantName:String,coApplicantName:String,totalAssetList:TotalAssets): play.twirl.api.HtmlFormat.Appendable = apply(message,applicantName,coApplicantName,totalAssetList)

  def f:((String,String,String,TotalAssets) => play.twirl.api.HtmlFormat.Appendable) = (message,applicantName,coApplicantName,totalAssetList) => apply(message,applicantName,coApplicantName,totalAssetList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:16 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePageAssetsTest.scala.html
                  HASH: 56d71fcde851819a94c74ebfa2d9398bbb623f50
                  MATRIX: 766->1|942->89|970->91|1343->438|1357->444|1413->480|1474->514|1489->520|1552->562|1628->611|1643->617|1701->654|1747->673|1762->679|1822->718|1988->857|2003->863|2068->907|2121->933|2136->939|2218->1000|2761->1516|2776->1522|2838->1562|3010->1707|3033->1721|3073->1739|3115->1753|3139->1767|3183->1789|3222->1800|3246->1814|3283->1829|3326->1844|3350->1858|3394->1880|3434->1892|3458->1906|3497->1923|3608->2007|3693->2083|3732->2084|3768->2093|3849->2143|3907->2174|4000->2258|4039->2259|4075->2268|4160->2322|4206->2341|4299->2425|4338->2426|4374->2435|4459->2489|4505->2508|4588->2582|4627->2583|4663->2592|4742->2640|4787->2658|6756->4599|6785->4600|6814->4601|6854->4613|6883->4614|6912->4615|6995->4670|7024->4671|7053->4672|7094->4685|7123->4686|7152->4687|7181->4688|7278->4757|7307->4758|7336->4759|7381->4776|7410->4777|7439->4778|7468->4779|7562->4845|7591->4846|7620->4847|7662->4861|7691->4862|7720->4863|7749->4864|7844->4931|7873->4932|7902->4933|7947->4950|7976->4951|8005->4952|8034->4953|8123->5014|8152->5015|8181->5016|8220->5027|8249->5028|8278->5029|8307->5030|8395->5090|8424->5091|8453->5092|8491->5102|8520->5103|8549->5104|8578->5105|10074->6573|10109->6586|10140->6589|10175->6602|10241->6640|10278->6655|10309->6658|10346->6673|10534->6833|10582->6871|10622->6872|10661->6883|10736->6941|10776->6942|10815->6952|11213->7322|11227->7326|11265->7341|11501->7549|11515->7553|11547->7562|11743->7730|11778->7743|11809->7746|11844->7759|11910->7797|11947->7812|11978->7815|12015->7830|12183->7970|12214->7979|12244->7980|12404->8108|12447->8119|12486->8129|13615->9230|13650->9243|13681->9246|13716->9259|13782->9297|13819->9312|13850->9315|13887->9330|14077->9492|14129->9534|14169->9535|14209->9547|14288->9609|14328->9610|14368->9621|14745->9970|14759->9974|14796->9989|15021->10186|15035->10190|15066->10199|15269->10374|15304->10387|15335->10390|15370->10403|15436->10441|15473->10456|15504->10459|15541->10474|15709->10614|15740->10623|15770->10624|15921->10743|15965->10755|16004->10765|17185->11918|17220->11931|17251->11934|17286->11947|17352->11985|17389->12000|17420->12003|17457->12018|17647->12180|17692->12215|17732->12216|17772->12228|17844->12283|17884->12284|17924->12295|18327->12670|18341->12674|18378->12689|18615->12898|18630->12902|18662->12911|18883->13104|18918->13117|18949->13120|18984->13133|19050->13171|19087->13186|19118->13189|19155->13204|19323->13344|19354->13353|19384->13354|19534->13472|19577->13483|19616->13493|20829->14678|20864->14691|20895->14694|20930->14707|20996->14745|21033->14760|21064->14763|21101->14778|21280->14929|21332->14971|21372->14972|21412->14984|21491->15046|21531->15047|21571->15058|21979->15438|21993->15442|22030->15457|22268->15667|22282->15671|22313->15680|22534->15873|22569->15886|22600->15889|22635->15902|22701->15940|22738->15955|22769->15958|22806->15973|22963->16102|22994->16111|23024->16112|23174->16230|23218->16242|23257->16252|24454->17421|24489->17434|24520->17437|24555->17450|24621->17488|24658->17503|24689->17506|24726->17521|24905->17672|24952->17709|24992->17710|25032->17722|25106->17779|25146->17780|25197->17802|25598->18175|25612->18179|25649->18194|25886->18403|25901->18407|25933->18416|26154->18609|26189->18622|26220->18625|26255->18638|26321->18676|26358->18691|26389->18694|26426->18709|26583->18838|26614->18847|26644->18848|26783->18956|26816->18958|26855->18968
                  LINES: 26->1|29->1|31->3|37->9|37->9|37->9|39->11|39->11|39->11|40->12|40->12|40->12|43->15|43->15|43->15|48->20|48->20|48->20|49->21|49->21|49->21|62->34|62->34|62->34|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|68->40|68->40|68->40|69->41|70->42|73->45|73->45|73->45|74->46|75->47|77->49|77->49|77->49|78->50|79->51|81->53|81->53|81->53|82->54|83->55|85->57|116->88|116->88|116->88|116->88|116->88|116->88|117->89|117->89|117->89|117->89|117->89|117->89|117->89|118->90|118->90|118->90|118->90|118->90|118->90|118->90|119->91|119->91|119->91|119->91|119->91|119->91|119->91|120->92|120->92|120->92|120->92|120->92|120->92|120->92|121->93|121->93|121->93|121->93|121->93|121->93|121->93|122->94|122->94|122->94|122->94|122->94|122->94|122->94|148->120|148->120|148->120|148->120|149->121|149->121|149->121|149->121|155->127|155->127|155->127|156->128|156->128|156->128|157->129|162->134|162->134|162->134|164->136|164->136|164->136|167->139|167->139|167->139|167->139|168->140|168->140|168->140|168->140|172->144|172->144|172->144|175->147|176->148|177->149|194->166|194->166|194->166|194->166|195->167|195->167|195->167|195->167|201->173|201->173|201->173|202->174|202->174|202->174|203->175|208->180|208->180|208->180|210->182|210->182|210->182|213->185|213->185|213->185|213->185|214->186|214->186|214->186|214->186|218->190|218->190|218->190|220->192|221->193|222->194|239->211|239->211|239->211|239->211|240->212|240->212|240->212|240->212|246->218|246->218|246->218|247->219|247->219|247->219|248->220|253->225|253->225|253->225|255->227|255->227|255->227|258->230|258->230|258->230|258->230|259->231|259->231|259->231|259->231|263->235|263->235|263->235|265->237|266->238|267->239|286->258|286->258|286->258|286->258|287->259|287->259|287->259|287->259|292->264|292->264|292->264|293->265|293->265|293->265|294->266|299->271|299->271|299->271|301->273|301->273|301->273|304->276|304->276|304->276|304->276|305->277|305->277|305->277|305->277|308->280|308->280|308->280|310->282|311->283|312->284|331->303|331->303|331->303|331->303|332->304|332->304|332->304|332->304|337->309|337->309|337->309|338->310|338->310|338->310|340->312|345->317|345->317|345->317|347->319|347->319|347->319|350->322|350->322|350->322|350->322|351->323|351->323|351->323|351->323|354->326|354->326|354->326|356->328|357->329|358->330
                  -- GENERATED --
              */
          