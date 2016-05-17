
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
object mortgagePage10Assets extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,TotalAssets,play.twirl.api.HtmlFormat.Appendable] {

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
	
	<input type="hidden" name="applName" value=""""),_display_(/*29.47*/applicantName),format.raw/*29.60*/("""" id="applNameID">
	<input type="hidden" name="coAppName" value=""""),_display_(/*30.48*/coApplicantName),format.raw/*30.63*/("""" id="coApplNameID">
	
		<div style="width: 90%">
			<div class="row"></div>
			<div class="row">
				<div class="col-sm-3"></div>
				<div class="col-sm-7 container-bg text-color-blue">
					<div style="padding-top: 50px"></div>
					<img alt="Visdom Logo" height="90" width="260"	src=""""),_display_(/*38.59*/routes/*38.65*/.Assets.at("_resources/visdom-logo.png")),format.raw/*38.105*/("""" />
					<div data-ng-app="demoApp" style="margin-left: 5%">
						<div ng-controller="DemoController" ng-init="isDisabled = false;vehicleList="""),_display_(/*40.84*/totalAssetList/*40.98*/.getVehicle.length),format.raw/*40.116*/(""";bankAccList="""),_display_(/*40.130*/totalAssetList/*40.144*/.getBankAccount.length),format.raw/*40.166*/(""";rrspList="""),_display_(/*40.177*/totalAssetList/*40.191*/.getRrsp.length),format.raw/*40.206*/(""";investmtList="""),_display_(/*40.221*/totalAssetList/*40.235*/.getInvestments.length),format.raw/*40.257*/(""";otherList="""),_display_(/*40.269*/totalAssetList/*40.283*/.getOthers.length),format.raw/*40.300*/(""";">
						
							<input type="hidden" name="ip" value="" id="ip">
							
								"""),_display_(/*44.10*/if(totalAssetList.getVehicle != null && totalAssetList.getVehicle.length >0)/*44.86*/{_display_(Seq[Any](format.raw/*44.87*/("""
								"""),format.raw/*45.9*/("""<div ng-init="asset.Vehicle=true"></div>
								""")))}),format.raw/*46.10*/(""" 
										
								
								"""),_display_(/*49.10*/if(totalAssetList.getBankAccount != null && totalAssetList.getBankAccount.length >0)/*49.94*/{_display_(Seq[Any](format.raw/*49.95*/("""
								"""),format.raw/*50.9*/("""<div ng-init="asset.BankAccount=true"></div>
								""")))}),format.raw/*51.10*/("""
								
								"""),_display_(/*53.10*/if(totalAssetList.getInvestments != null && totalAssetList.getInvestments.length >0)/*53.94*/{_display_(Seq[Any](format.raw/*53.95*/("""
								"""),format.raw/*54.9*/("""<div ng-init="asset.Investments=true"></div>
								""")))}),format.raw/*55.10*/("""
								
								"""),_display_(/*57.10*/if(totalAssetList.getOthers != null && totalAssetList.getOthers.length >0)/*57.84*/{_display_(Seq[Any](format.raw/*57.85*/("""
								"""),format.raw/*58.9*/("""<div ng-init="asset.Other=true"></div>
								""")))}),format.raw/*59.10*/("""
								
								"""),format.raw/*61.9*/("""<div ng-repeat="result in asset"></div>
						
						
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
								<input type="hidden" name="assetTypes[]" value=""""),format.raw/*92.57*/("""{"""),format.raw/*92.58*/("""{"""),format.raw/*92.59*/("""assetResults"""),format.raw/*92.71*/("""}"""),format.raw/*92.72*/("""}"""),format.raw/*92.73*/("""">
								<input type="hidden" name="Vehicle" value = """),format.raw/*93.53*/("""{"""),format.raw/*93.54*/("""{"""),format.raw/*93.55*/("""asset.Vehicle"""),format.raw/*93.68*/("""}"""),format.raw/*93.69*/("""}"""),format.raw/*93.70*/("""	"""),format.raw/*93.71*/("""ng-required>
								<input type="hidden" name="BankAccount" value = """),format.raw/*94.57*/("""{"""),format.raw/*94.58*/("""{"""),format.raw/*94.59*/("""asset.BankAccount"""),format.raw/*94.76*/("""}"""),format.raw/*94.77*/("""}"""),format.raw/*94.78*/("""	"""),format.raw/*94.79*/("""ng-required>
								<input type="hidden" name="RRSPTSFA" value = """),format.raw/*95.54*/("""{"""),format.raw/*95.55*/("""{"""),format.raw/*95.56*/("""asset.RRSPTSFA"""),format.raw/*95.70*/("""}"""),format.raw/*95.71*/("""}"""),format.raw/*95.72*/("""	"""),format.raw/*95.73*/("""ng-required>
								<input type="hidden" name="Investments" value="""),format.raw/*96.55*/("""{"""),format.raw/*96.56*/("""{"""),format.raw/*96.57*/("""asset.Investments"""),format.raw/*96.74*/("""}"""),format.raw/*96.75*/("""}"""),format.raw/*96.76*/(""" """),format.raw/*96.77*/("""ng-required>
								<input type="hidden" name="Other" value="""),format.raw/*97.49*/("""{"""),format.raw/*97.50*/("""{"""),format.raw/*97.51*/("""asset.Other"""),format.raw/*97.62*/("""}"""),format.raw/*97.63*/("""}"""),format.raw/*97.64*/("""	"""),format.raw/*97.65*/("""ng-required>
								<input type="hidden" name="None" value="""),format.raw/*98.48*/("""{"""),format.raw/*98.49*/("""{"""),format.raw/*98.50*/("""asset.None"""),format.raw/*98.60*/("""}"""),format.raw/*98.61*/("""}"""),format.raw/*98.62*/(""" """),format.raw/*98.63*/("""ng-required>
								
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
												<option value=""""),_display_(/*124.29*/applicantName),format.raw/*124.42*/("""">"""),_display_(/*124.45*/applicantName),format.raw/*124.58*/("""</option>
												"""),_display_(/*125.14*/if(coApplicantName!="")/*125.37*/{_display_(Seq[Any](format.raw/*125.38*/("""
												"""),format.raw/*126.13*/("""<option value=""""),_display_(/*126.29*/coApplicantName),format.raw/*126.44*/("""">"""),_display_(/*126.47*/coApplicantName),format.raw/*126.62*/("""</option>
												""")))}),format.raw/*127.14*/("""
												"""),format.raw/*128.13*/("""<option value="Joint">Joint</option>
										</select>
										</td>
										<td style="width: 13%;"></td>
									</tr>
									"""),_display_(/*133.11*/if(totalAssetList.getVehicle.length>0)/*133.49*/{_display_(Seq[Any](format.raw/*133.50*/("""
									"""),_display_(/*134.11*/for((list,index) <-totalAssetList.getVehicle.zipWithIndex) yield /*134.69*/{_display_(Seq[Any](format.raw/*134.70*/("""
									"""),format.raw/*135.10*/("""<tr>
									<th scope="row"><label for="customFieldName2"></label></th>
										<td width="17%"><input type="text" name="asset[]" id="asset"
											 class="form-control" value="Vehicle" readonly="readonly"></td>
										<td width="36%"><input type="text" name="description[]"
											placeholder="description" id="description"  class="form-control" value=""""),_display_(/*140.85*/list/*140.89*/.getDescription),format.raw/*140.104*/(""""></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number" 
											name="value[]" id="value" placeholder="e.g. 500,000" class="form-control" value=""""),_display_(/*142.94*/list/*142.98*/.getValue),format.raw/*142.107*/(""""></td>
										<td width="17%"><select name="designation[]"  class="form-control" >
												<option value="" >Please Select</option>
												<option value=""""),_display_(/*145.29*/applicantName),format.raw/*145.42*/("""">"""),_display_(/*145.45*/applicantName),format.raw/*145.58*/("""</option>
												"""),_display_(/*146.14*/if(coApplicantName!="")/*146.37*/{_display_(Seq[Any](format.raw/*146.38*/("""
												"""),format.raw/*147.13*/("""<option value=""""),_display_(/*147.29*/coApplicantName),format.raw/*147.44*/("""">"""),_display_(/*147.47*/coApplicantName),format.raw/*147.62*/("""</option>
												""")))}),format.raw/*148.14*/("""
												"""),format.raw/*149.13*/("""<option value="Joint">Joint</option>
										</select>
										</td>
										<td style="width: 13%;"><a ng-if=""""),_display_(/*152.46*/{{index}}),format.raw/*152.55*/(""" """),format.raw/*152.56*/("""> 0 " href="javascript:void(0);" class="remCF glyphicon glyphicon-remove">Remove</a></td>
										</tr>
										
										""")))}),format.raw/*155.12*/("""
									""")))}),format.raw/*156.11*/("""
									"""),format.raw/*157.10*/("""</table>
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
												<option value=""""),_display_(/*174.29*/applicantName),format.raw/*174.42*/("""">"""),_display_(/*174.45*/applicantName),format.raw/*174.58*/("""</option>
												"""),_display_(/*175.14*/if(coApplicantName!="")/*175.37*/{_display_(Seq[Any](format.raw/*175.38*/("""
												"""),format.raw/*176.13*/("""<option value=""""),_display_(/*176.29*/coApplicantName),format.raw/*176.44*/("""">"""),_display_(/*176.47*/coApplicantName),format.raw/*176.62*/("""</option>
												""")))}),format.raw/*177.14*/("""
												"""),format.raw/*178.13*/("""<option value="Joint">Joint</option>
										</select>
										</td>
										<td style="width: 13%;"></td>
										</tr>
										"""),_display_(/*183.12*/if(totalAssetList.getBankAccount.length>0)/*183.54*/{_display_(Seq[Any](format.raw/*183.55*/("""
										"""),_display_(/*184.12*/for((list,index) <-totalAssetList.getBankAccount.zipWithIndex) yield /*184.74*/{_display_(Seq[Any](format.raw/*184.75*/("""
										"""),format.raw/*185.11*/("""<tr>
										<th scope="row"><label for="customFieldName2"></label></th>
										<td width="17%"><input type="text" name="asset1[]"
											 class="form-control" value="Bank Account" readonly="readonly"></td>
										<td width="36%"><input type="text" name="description1[]"
											placeholder="description" class="form-control" value=""""),_display_(/*190.67*/list/*190.71*/.getDescription),format.raw/*190.86*/(""""></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number"
											name="value1[]" placeholder="e.g. 500,000" class="form-control" value=""""),_display_(/*192.84*/list/*192.88*/.getValue),format.raw/*192.97*/(""""></td>
										<td width="17%"><select name="designation1[]" class="form-control">
												<option value="" selected>Please Select</option>
												<option value=""""),_display_(/*195.29*/applicantName),format.raw/*195.42*/("""">"""),_display_(/*195.45*/applicantName),format.raw/*195.58*/("""</option>
												"""),_display_(/*196.14*/if(coApplicantName!="")/*196.37*/{_display_(Seq[Any](format.raw/*196.38*/("""
												"""),format.raw/*197.13*/("""<option value=""""),_display_(/*197.29*/coApplicantName),format.raw/*197.44*/("""">"""),_display_(/*197.47*/coApplicantName),format.raw/*197.62*/("""</option>
												""")))}),format.raw/*198.14*/("""
												"""),format.raw/*199.13*/("""<option value="Joint">Joint</option>
										</select>
										</td>
										<td style="width: 13%;"><a ng-if=""""),_display_(/*202.46*/{{index}}),format.raw/*202.55*/(""" """),format.raw/*202.56*/("""> 0 " href="javascript:void(0);" class="remCF2 glyphicon glyphicon-remove">Remove</a></td>
										</tr>
											""")))}),format.raw/*204.13*/("""
										""")))}),format.raw/*205.12*/("""
									"""),format.raw/*206.10*/("""</table>
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
												<option value=""""),_display_(/*223.29*/applicantName),format.raw/*223.42*/("""">"""),_display_(/*223.45*/applicantName),format.raw/*223.58*/("""</option>
												"""),_display_(/*224.14*/if(coApplicantName!="")/*224.37*/{_display_(Seq[Any](format.raw/*224.38*/("""
												"""),format.raw/*225.13*/("""<option value=""""),_display_(/*225.29*/coApplicantName),format.raw/*225.44*/("""">"""),_display_(/*225.47*/coApplicantName),format.raw/*225.62*/("""</option>
												""")))}),format.raw/*226.14*/("""
												"""),format.raw/*227.13*/("""<option value="Joint">Joint</option>
										</select>
										</td>
										<td style="width: 13%;"></td>
										</tr>
										"""),_display_(/*232.12*/if(totalAssetList.getRrsp.length>0)/*232.47*/{_display_(Seq[Any](format.raw/*232.48*/("""
										"""),_display_(/*233.12*/for((list,index) <-totalAssetList.getRrsp.zipWithIndex) yield /*233.67*/{_display_(Seq[Any](format.raw/*233.68*/("""
										"""),format.raw/*234.11*/("""<tr>
										<th scope="row"><label for="customFieldName3"></label></th>
										<td width="17%"><input type="text" id="asset2" name="asset2[]"
											 class="form-control" value="RRSPTSFA" readonly="readonly"></td>
										<td width="36%"><input type="text" id="description2" name="description2[]"
											placeholder="description" class="form-control" value=""""),_display_(/*239.67*/list/*239.71*/.getDescription),format.raw/*239.86*/(""""></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number"
											name="value2[]" id="value2" placeholder="e.g. 500,000" class="form-control" value=""""),_display_(/*241.96*/list/*241.100*/.getValue),format.raw/*241.109*/(""""></td>
										<td width="17%"><select name="designation2[]" id="designation2" class="form-control">
												<option value="" selected>Please Select</option>
												<option value=""""),_display_(/*244.29*/applicantName),format.raw/*244.42*/("""">"""),_display_(/*244.45*/applicantName),format.raw/*244.58*/("""</option>
												"""),_display_(/*245.14*/if(coApplicantName!="")/*245.37*/{_display_(Seq[Any](format.raw/*245.38*/("""
												"""),format.raw/*246.13*/("""<option value=""""),_display_(/*246.29*/coApplicantName),format.raw/*246.44*/("""">"""),_display_(/*246.47*/coApplicantName),format.raw/*246.62*/("""</option>
												""")))}),format.raw/*247.14*/("""
												"""),format.raw/*248.13*/("""<option value="Joint">Joint</option>
										</select>
										</td>
										<td style="width: 13%;"><a ng-if=""""),_display_(/*251.46*/{{index}}),format.raw/*251.55*/(""" """),format.raw/*251.56*/("""> 0 " href="javascript:void(0);" class="remCF3 glyphicon glyphicon-remove">Remove</a></td>
										</tr>
										""")))}),format.raw/*253.12*/("""
									""")))}),format.raw/*254.11*/("""
									"""),format.raw/*255.10*/("""</table>
									
									
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
												<option value=""""),_display_(/*274.29*/applicantName),format.raw/*274.42*/("""">"""),_display_(/*274.45*/applicantName),format.raw/*274.58*/("""</option>
												"""),_display_(/*275.14*/if(coApplicantName!="")/*275.37*/{_display_(Seq[Any](format.raw/*275.38*/("""
												"""),format.raw/*276.13*/("""<option value=""""),_display_(/*276.29*/coApplicantName),format.raw/*276.44*/("""">"""),_display_(/*276.47*/coApplicantName),format.raw/*276.62*/("""</option>
												""")))}),format.raw/*277.14*/("""
												"""),format.raw/*278.13*/("""<option value="Joint">Joint</option>
										</select></td>
										<td style="width: 13%;"></td>
										</tr>
										"""),_display_(/*282.12*/if(totalAssetList.getInvestments.length>0)/*282.54*/{_display_(Seq[Any](format.raw/*282.55*/("""
										"""),_display_(/*283.12*/for((list,index) <-totalAssetList.getInvestments.zipWithIndex) yield /*283.74*/{_display_(Seq[Any](format.raw/*283.75*/("""
										"""),format.raw/*284.11*/("""<tr>
										<th scope="row"><label for="customFieldName4"></label></th>
										<td width="17%"><input type="text" name="asset3[]" id="asset3" 
											 class="form-control" value="Investments" readonly="readonly"></td>
										<td width="36%"><input type="text" name="description3[]" id="description3" 
											placeholder="description" class="form-control" value=""""),_display_(/*289.67*/list/*289.71*/.getDescription),format.raw/*289.86*/(""""></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number" id="value3" 
											name="value3[]" placeholder="e.g. 500,000" class="form-control" value=""""),_display_(/*291.84*/list/*291.88*/.getValue),format.raw/*291.97*/(""""></td>
										<td width="17%"><select name="designation3[]" id="designation3" class="form-control">
												<option value="" selected>Please Select</option>
												<option value=""""),_display_(/*294.29*/applicantName),format.raw/*294.42*/("""">"""),_display_(/*294.45*/applicantName),format.raw/*294.58*/("""</option>
												"""),_display_(/*295.14*/if(coApplicantName!="")/*295.37*/{_display_(Seq[Any](format.raw/*295.38*/("""
												"""),format.raw/*296.13*/("""<option value=""""),_display_(/*296.29*/coApplicantName),format.raw/*296.44*/("""">"""),_display_(/*296.47*/coApplicantName),format.raw/*296.62*/("""</option>
												""")))}),format.raw/*297.14*/("""
												"""),format.raw/*298.13*/("""<option value="Joint">Joint</option>
										</select></td>
										<td style="width: 13%;"><a ng-if=""""),_display_(/*300.46*/{{index}}),format.raw/*300.55*/(""" """),format.raw/*300.56*/("""> 0 " href="javascript:void(0);" class="remCF4 glyphicon glyphicon-remove">Remove</a></td>
										</tr>
										""")))}),format.raw/*302.12*/("""
										""")))}),format.raw/*303.12*/("""
									"""),format.raw/*304.10*/("""</table>
									
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
												<option value=""""),_display_(/*323.29*/applicantName),format.raw/*323.42*/("""">"""),_display_(/*323.45*/applicantName),format.raw/*323.58*/("""</option>
												"""),_display_(/*324.14*/if(coApplicantName!="")/*324.37*/{_display_(Seq[Any](format.raw/*324.38*/("""
												"""),format.raw/*325.13*/("""<option value=""""),_display_(/*325.29*/coApplicantName),format.raw/*325.44*/("""">"""),_display_(/*325.47*/coApplicantName),format.raw/*325.62*/("""</option>
												""")))}),format.raw/*326.14*/("""
												"""),format.raw/*327.13*/("""<option value="Joint">Joint</option>
										</select></td>
										<td style="width: 13%;"></td>
										</tr>
										"""),_display_(/*331.12*/if(totalAssetList.getOthers.length>0)/*331.49*/{_display_(Seq[Any](format.raw/*331.50*/("""
										"""),_display_(/*332.12*/for((list,index) <-totalAssetList.getOthers.zipWithIndex) yield /*332.69*/{_display_(Seq[Any](format.raw/*332.70*/("""
										
										"""),format.raw/*334.11*/("""<tr>
										<th scope="row"><label for="customFieldName5"></label></th>
										<td width="17%"><input type="text" name="asset4[]" id="asset4" 
											value="Other" class="form-control" readonly="readonly"></td>
										<td width="36%"><input type="text" name="description4[]" id="description4" 
											placeholder="description" class="form-control" value=""""),_display_(/*339.67*/list/*339.71*/.getDescription),format.raw/*339.86*/(""""></td>
										<td width="17%"><input type="text" onkeypress="return isNumber(event)" data-type="input-number"
											placeholder="e.g. 500,000" name="value4[]" id="value4" class="form-control" value=""""),_display_(/*341.96*/list/*341.100*/.getValue),format.raw/*341.109*/(""""></td>
										<td width="17%"><select name="designation4[]" id="designation4" class="form-control">
												<option value="" selected>Please Select</option>
												<option value=""""),_display_(/*344.29*/applicantName),format.raw/*344.42*/("""">"""),_display_(/*344.45*/applicantName),format.raw/*344.58*/("""</option>
												"""),_display_(/*345.14*/if(coApplicantName!="")/*345.37*/{_display_(Seq[Any](format.raw/*345.38*/("""
												"""),format.raw/*346.13*/("""<option value=""""),_display_(/*346.29*/coApplicantName),format.raw/*346.44*/("""">"""),_display_(/*346.47*/coApplicantName),format.raw/*346.62*/("""</option>
												""")))}),format.raw/*347.14*/("""
												"""),format.raw/*348.13*/("""<option value="Joint">Joint</option>
										</select></td>
										<td style="width: 13%;"><a ng-if=""""),_display_(/*350.46*/{{index}}),format.raw/*350.55*/(""" """),format.raw/*350.56*/("""> 0 " href="javascript:void(0);" class="remCF5 glyphicon glyphicon-remove">Remove</a></td>
										</tr>
""")))}),format.raw/*352.2*/("""
""")))}),format.raw/*353.2*/("""
									"""),format.raw/*354.10*/("""</table>
									<div id="description_id_5"></div>
									<a href="javascript:void(0);" class="addCF5 glyphicon glyphicon-plus"><b>Additional</b></a>
								</div>
						</div>
						
						<br>
						<div class="row" style="width: 100%;">
								<div class="col-sm-6"
									style="float: left; padding-left: 2%; width: 45%;">
									<a href="mortgageBackPageSuplA" class="btn btn-primary"
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
                  DATE: Mon May 16 20:16:25 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage10Assets.scala.html
                  HASH: d4fcc1a7cd912e4e9d3b584b4a34be054a3eb6cb
                  MATRIX: 764->1|940->89|968->91|1341->438|1355->444|1411->480|1472->514|1487->520|1550->562|1626->611|1641->617|1699->654|1745->673|1760->679|1820->718|1986->857|2001->863|2066->907|2119->933|2134->939|2216->1000|2542->1299|2576->1312|2669->1378|2705->1393|3020->1681|3035->1687|3097->1727|3269->1872|3292->1886|3332->1904|3374->1918|3398->1932|3442->1954|3481->1965|3505->1979|3542->1994|3585->2009|3609->2023|3653->2045|3693->2057|3717->2071|3756->2088|3867->2172|3952->2248|3991->2249|4027->2258|4108->2308|4166->2339|4259->2423|4298->2424|4334->2433|4419->2487|4465->2506|4558->2590|4597->2591|4633->2600|4718->2654|4764->2673|4847->2747|4886->2748|4922->2757|5001->2805|5046->2823|7015->4764|7044->4765|7073->4766|7113->4778|7142->4779|7171->4780|7254->4835|7283->4836|7312->4837|7353->4850|7382->4851|7411->4852|7440->4853|7537->4922|7566->4923|7595->4924|7640->4941|7669->4942|7698->4943|7727->4944|7821->5010|7850->5011|7879->5012|7921->5026|7950->5027|7979->5028|8008->5029|8103->5096|8132->5097|8161->5098|8206->5115|8235->5116|8264->5117|8293->5118|8382->5179|8411->5180|8440->5181|8479->5192|8508->5193|8537->5194|8566->5195|8654->5255|8683->5256|8712->5257|8750->5267|8779->5268|8808->5269|8837->5270|10333->6738|10368->6751|10399->6754|10434->6767|10485->6790|10518->6813|10558->6814|10600->6827|10644->6843|10681->6858|10712->6861|10749->6876|10804->6899|10846->6912|11012->7050|11060->7088|11100->7089|11139->7100|11214->7158|11254->7159|11293->7169|11691->7539|11705->7543|11743->7558|11979->7766|11993->7770|12025->7779|12221->7947|12256->7960|12287->7963|12322->7976|12373->7999|12406->8022|12446->8023|12488->8036|12532->8052|12569->8067|12600->8070|12637->8085|12692->8108|12734->8121|12880->8239|12911->8248|12941->8249|13101->8377|13144->8388|13183->8398|14312->9499|14347->9512|14378->9515|14413->9528|14464->9551|14497->9574|14537->9575|14579->9588|14623->9604|14660->9619|14691->9622|14728->9637|14783->9660|14825->9673|14993->9813|15045->9855|15085->9856|15125->9868|15204->9930|15244->9931|15284->9942|15661->10291|15675->10295|15712->10310|15937->10507|15951->10511|15982->10520|16185->10695|16220->10708|16251->10711|16286->10724|16337->10747|16370->10770|16410->10771|16452->10784|16496->10800|16533->10815|16564->10818|16601->10833|16656->10856|16698->10869|16844->10987|16875->10996|16905->10997|17056->11116|17100->11128|17139->11138|18320->12291|18355->12304|18386->12307|18421->12320|18472->12343|18505->12366|18545->12367|18587->12380|18631->12396|18668->12411|18699->12414|18736->12429|18791->12452|18833->12465|19001->12605|19046->12640|19086->12641|19126->12653|19198->12708|19238->12709|19278->12720|19681->13095|19695->13099|19732->13114|19969->13323|19984->13327|20016->13336|20237->13529|20272->13542|20303->13545|20338->13558|20389->13581|20422->13604|20462->13605|20504->13618|20548->13634|20585->13649|20616->13652|20653->13667|20708->13690|20750->13703|20896->13821|20927->13830|20957->13831|21107->13949|21150->13960|21189->13970|22402->15155|22437->15168|22468->15171|22503->15184|22554->15207|22587->15230|22627->15231|22669->15244|22713->15260|22750->15275|22781->15278|22818->15293|22873->15316|22915->15329|23072->15458|23124->15500|23164->15501|23204->15513|23283->15575|23323->15576|23363->15587|23771->15967|23785->15971|23822->15986|24060->16196|24074->16200|24105->16209|24326->16402|24361->16415|24392->16418|24427->16431|24478->16454|24511->16477|24551->16478|24593->16491|24637->16507|24674->16522|24705->16525|24742->16540|24797->16563|24839->16576|24974->16683|25005->16692|25035->16693|25185->16811|25229->16823|25268->16833|26465->18002|26500->18015|26531->18018|26566->18031|26617->18054|26650->18077|26690->18078|26732->18091|26776->18107|26813->18122|26844->18125|26881->18140|26936->18163|26978->18176|27135->18305|27182->18342|27222->18343|27262->18355|27336->18412|27376->18413|27427->18435|27828->18808|27842->18812|27879->18827|28116->19036|28131->19040|28163->19049|28384->19242|28419->19255|28450->19258|28485->19271|28536->19294|28569->19317|28609->19318|28651->19331|28695->19347|28732->19362|28763->19365|28800->19380|28855->19403|28897->19416|29032->19523|29063->19532|29093->19533|29232->19641|29265->19643|29304->19653
                  LINES: 26->1|29->1|31->3|37->9|37->9|37->9|39->11|39->11|39->11|40->12|40->12|40->12|43->15|43->15|43->15|48->20|48->20|48->20|49->21|49->21|49->21|57->29|57->29|58->30|58->30|66->38|66->38|66->38|68->40|68->40|68->40|68->40|68->40|68->40|68->40|68->40|68->40|68->40|68->40|68->40|68->40|68->40|68->40|72->44|72->44|72->44|73->45|74->46|77->49|77->49|77->49|78->50|79->51|81->53|81->53|81->53|82->54|83->55|85->57|85->57|85->57|86->58|87->59|89->61|120->92|120->92|120->92|120->92|120->92|120->92|121->93|121->93|121->93|121->93|121->93|121->93|121->93|122->94|122->94|122->94|122->94|122->94|122->94|122->94|123->95|123->95|123->95|123->95|123->95|123->95|123->95|124->96|124->96|124->96|124->96|124->96|124->96|124->96|125->97|125->97|125->97|125->97|125->97|125->97|125->97|126->98|126->98|126->98|126->98|126->98|126->98|126->98|152->124|152->124|152->124|152->124|153->125|153->125|153->125|154->126|154->126|154->126|154->126|154->126|155->127|156->128|161->133|161->133|161->133|162->134|162->134|162->134|163->135|168->140|168->140|168->140|170->142|170->142|170->142|173->145|173->145|173->145|173->145|174->146|174->146|174->146|175->147|175->147|175->147|175->147|175->147|176->148|177->149|180->152|180->152|180->152|183->155|184->156|185->157|202->174|202->174|202->174|202->174|203->175|203->175|203->175|204->176|204->176|204->176|204->176|204->176|205->177|206->178|211->183|211->183|211->183|212->184|212->184|212->184|213->185|218->190|218->190|218->190|220->192|220->192|220->192|223->195|223->195|223->195|223->195|224->196|224->196|224->196|225->197|225->197|225->197|225->197|225->197|226->198|227->199|230->202|230->202|230->202|232->204|233->205|234->206|251->223|251->223|251->223|251->223|252->224|252->224|252->224|253->225|253->225|253->225|253->225|253->225|254->226|255->227|260->232|260->232|260->232|261->233|261->233|261->233|262->234|267->239|267->239|267->239|269->241|269->241|269->241|272->244|272->244|272->244|272->244|273->245|273->245|273->245|274->246|274->246|274->246|274->246|274->246|275->247|276->248|279->251|279->251|279->251|281->253|282->254|283->255|302->274|302->274|302->274|302->274|303->275|303->275|303->275|304->276|304->276|304->276|304->276|304->276|305->277|306->278|310->282|310->282|310->282|311->283|311->283|311->283|312->284|317->289|317->289|317->289|319->291|319->291|319->291|322->294|322->294|322->294|322->294|323->295|323->295|323->295|324->296|324->296|324->296|324->296|324->296|325->297|326->298|328->300|328->300|328->300|330->302|331->303|332->304|351->323|351->323|351->323|351->323|352->324|352->324|352->324|353->325|353->325|353->325|353->325|353->325|354->326|355->327|359->331|359->331|359->331|360->332|360->332|360->332|362->334|367->339|367->339|367->339|369->341|369->341|369->341|372->344|372->344|372->344|372->344|373->345|373->345|373->345|374->346|374->346|374->346|374->346|374->346|375->347|376->348|378->350|378->350|378->350|380->352|381->353|382->354
                  -- GENERATED --
              */
          