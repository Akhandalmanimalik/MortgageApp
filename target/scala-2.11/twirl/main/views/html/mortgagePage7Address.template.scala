
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
object mortgagePage7Address extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,String,ApplicantAddressParameter7,CoApplicantAddressParameter7,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(additionalApplicants: String,applicantName:String,coApplicantName:String,applAddressParam:ApplicantAddressParameter7,coApplAddressParam:CoApplicantAddressParameter7):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.168*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>

<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*14.31*/routes/*14.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*14.79*/("""">
<script src="""),_display_(/*15.14*/routes/*15.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*15.61*/(""""></script> 
<link type="text/css" rel="stylesheet" href=""""),_display_(/*16.47*/routes/*16.53*/.Assets.at("_resources/background.css")),format.raw/*16.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*17.47*/routes/*17.53*/.Assets.at("_resources/forms.css")),format.raw/*17.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*18.47*/routes/*18.53*/.Assets.at("_resources/template.css")),format.raw/*18.90*/("""">

<link rel="shortcut icon" href=""""),_display_(/*20.34*/routes/*20.40*/.Assets.at("_resources/favicon.ico")),format.raw/*20.76*/("""">
  

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

 <script
    src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js
"></script>
    <script src=""""),_display_(/*28.19*/routes/*28.25*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*28.69*/(""""></script>
    <script src=""""),_display_(/*29.19*/routes/*29.25*/.Assets.at("javascripts/mortgageJs/mortgagePage7Address.js")),format.raw/*29.85*/(""""></script>
    
    <script src=""""),_display_(/*31.19*/routes/*31.25*/.Assets.at("_resources/jquery.geocomplete.js")),format.raw/*31.71*/(""""></script>
    <script src=""""),_display_(/*32.19*/routes/*32.25*/.Assets.at("javascripts/jquery-ui.css")),format.raw/*32.64*/(""""></script>
    <script src=""""),_display_(/*33.19*/routes/*33.25*/.Assets.at("javascripts/jquery-ui.js")),format.raw/*33.63*/(""""></script>
   <link type="text/css" rel="stylesheet" href=""""),_display_(/*34.50*/routes/*34.56*/.Assets.at("stylesheets/mortgageCSS/mortgagePage7Address.css")),format.raw/*34.118*/("""">


</head>
<body>
<br>
<br>
<div style="width: 97%;">
        <md-datepicker ng-model="birthday"></md-datepicker>
        <form name="myForm" action="mortgagePage7" method="POST" onsubmit="return validateForm()">
       <!--  <form name="myForm" action="mortgagePage10" method="POST" onsubmit="return validateForm()"> -->
        <!-- <input type="hidden" value="@uniid" name="uniid"> -->
        <input type="hidden" value=""""),_display_(/*46.38*/additionalApplicants),format.raw/*46.58*/("""" name="additionalApplicants" >
        <input type="hidden" value=""""),_display_(/*47.38*/applAddressParam/*47.54*/.getApplicantCurrentAddress),format.raw/*47.81*/("""" name="currentAddress1212">
        <input type="hidden" value=""""),_display_(/*48.38*/applAddressParam/*48.54*/.getApplicantMovedIn1),format.raw/*48.75*/(""""        name="moveIn1212">
        <input type="hidden" value=""""),_display_(/*49.38*/applAddressParam/*49.54*/.getApplicantPriorAddress1),format.raw/*49.80*/(""""  name="currentAddress2121">
        <input type="hidden" value=""""),_display_(/*50.38*/applAddressParam/*50.54*/.getApplicantMovedIn2),format.raw/*50.75*/(""""       name="moveIn2121">
        <input type="hidden" value=""""),_display_(/*51.38*/applAddressParam/*51.54*/.getApplicantPriorAddress2),format.raw/*51.80*/(""""  name="currentAddress3131">
        <input type="hidden" value=""""),_display_(/*52.38*/applAddressParam/*52.54*/.getApplicantMovedIn3),format.raw/*52.75*/(""""       name="moveIn3131">
       
        <input type="hidden" value=""""),_display_(/*54.38*/coApplAddressParam/*54.56*/.getCoAppcurrentAddress),format.raw/*54.79*/("""" name="coCurrentAddress431">
        <input type="hidden" value=""""),_display_(/*55.38*/coApplAddressParam/*55.56*/.getCoAppmovedIn1),format.raw/*55.73*/(""""         name="coMoveIn432">
        <input type="hidden" value=""""),_display_(/*56.38*/coApplAddressParam/*56.56*/.getCoAppPriorAddress1),format.raw/*56.78*/(""""     name="coCurrentAddress433">
        <input type="hidden" value=""""),_display_(/*57.38*/coApplAddressParam/*57.56*/.getCoMovedIn2),format.raw/*57.70*/(""""             name="coMoveIn434">
        <input type="hidden" value=""""),_display_(/*58.38*/coApplAddressParam/*58.56*/.getCoApppriorAddress2),format.raw/*58.78*/(""""     name="coCurrentAddress435">
        <input type="hidden" value=""""),_display_(/*59.38*/coApplAddressParam/*59.56*/.getCoMovedIn3),format.raw/*59.70*/(""""             name="coMoveIn436">
       
        <input type="hidden" value=""""),_display_(/*61.38*/applAddressParam/*61.54*/.getApplicantTotalcurrentMonths),format.raw/*61.85*/(""""         name="totalMonth131" >
        <input type="hidden" value=""""),_display_(/*62.38*/applAddressParam/*62.54*/.getApplicantTotalpriorcurrentmonths1),format.raw/*62.91*/("""" name="totalMonth132" >
        <input type="hidden" value=""""),_display_(/*63.38*/applAddressParam/*63.54*/.getApplicantTotalpriorcurrentmonths2),format.raw/*63.91*/("""" name="totalMonth133" >
       
        <input type="hidden" value=""""),_display_(/*65.38*/coApplAddressParam/*65.56*/.getCoAppTotalcurrentMonths),format.raw/*65.83*/("""" name="coTotalMonth231">
        <input type="hidden" value=""""),_display_(/*66.38*/coApplAddressParam/*66.56*/.getCoTotalpriorcurrentmonths1),format.raw/*66.86*/("""" name="coTotalMonth232">
        <input type="hidden" value=""""),_display_(/*67.38*/coApplAddressParam/*67.56*/.getCoApptotalpriorcurrentmonths2),format.raw/*67.89*/("""" name="coTotalMonth233">
        <div class="row"></div>
        <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-8 container-bg text-color-blue">
           
        <div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 1%">
            <img alt="Visdom Logo" height="65" width="210"
                src=""""),_display_(/*75.23*/routes/*75.29*/.Assets.at("_resources/visdom-logo.png")),format.raw/*75.69*/("""" />
        </div>
        <div style="padding-top: 30px"></div>
        <div data-ng-app="demoApp"  style="margin-left: 4%">
        <div ng-controller="DemoController" ng-init="isDisabled = false;" >
       
       
        <input type="hidden" ng-model="data" name="additionalApplicanttt">
       
        <div class="row" class="col-sm-16" style="padding-left: 0%;">
            <div class="col-sm-6" style="padding-left: 0%;">
                <label class="labelfont" style="padding-left: 30%">"""),_display_(/*86.69*/applicantName),format.raw/*86.82*/("""</label><br><br>
                <div class="row">
                          <div class="col-md-9"><label class="labelfont">What is your current Address?<span style="color: red; font-size: 3">*</span></label><br></div>
                          <div class="col-md-3" style="padding-left: 0%;" ><label class="labelfont">Moved in?<span style="color: red; font-size: 3">*</span></label></div>
                </div>
               
                <div class="col-sm-9" style="padding-left: 0%;">
                <div class="map_canvas"></div>
               
                <!-- <input type="text" id="geocomplete" placeholder="Enter Location" class="form-control" name="currentAddress1" ng-model="currentAddress1" style="width: 100%" ng-change="copyValue(this)" value=""> -->
                <input type="text" id="geocomplete" placeholder="Enter Location" class="form-control" name="currentAddress1" ng-model="currentAddress1" style="width: 100%" value="">
                <div id="input_2001" style="position: absolute;"> </div>
                </div>
                <div class="col-sm-3" style="padding-left: 0%;">
       
                <input type="text"  name="movedIn1" id = "datepicker" ng-model="movedIn1" placeholder="mm/dd/yyyy"   style="float:left; width: 100%;" value=""   ng-selected="calculateDate(this)" readonly="readonly"/>
               
                <div id="input_2002" style="position: relative;"> </div>
                </div><br><br><br>
                <input type="hidden" name="currentaddressmonthsum" value=""""),format.raw/*105.75*/("""{"""),format.raw/*105.76*/("""{"""),format.raw/*105.77*/("""applicantTotal1"""),format.raw/*105.92*/("""}"""),format.raw/*105.93*/("""}"""),format.raw/*105.94*/("""">
                <input type="hidden" name="totalcurrentmonths" value=""""),format.raw/*106.71*/("""{"""),format.raw/*106.72*/("""{"""),format.raw/*106.73*/("""applicantTotal1"""),format.raw/*106.88*/("""}"""),format.raw/*106.89*/("""}"""),format.raw/*106.90*/("""">
                <!-- <input type="hidden" ng-model="applicantTotal1"> -->
                <div ng-show="applicantTotal1<36">
               
                    <div class="col-sm-8" style="padding-left: 0%; width: 100%">
                    <div class="row">
                          <div class="col-md-8"><label class="labelfont">Please provide your prior address.  Lenders require a minimum of 3 years history.<span style="color: red; font-size: 3">*</span></label></div>
                          <div class="col-md-4" style="padding-left: 0%;" ><label class="labelfont">Moved in?<span style="color: red; font-size: 3">*</span></label></div>
                    </div>
                    <div class="col-sm-8" style="padding-left: 0%;">
                    <div class="map_canvas"></div>
                    <!-- <input type="text" id="geocomplete1" placeholder="Enter Location" class="form-control" name="currentAddress2" ng-model="applAddress2" style="width: 103%" ng-change="copyValue(this)" value=""> -->
                    <input type="text" id="geocomplete1" placeholder="Enter Location" class="form-control" name="currentAddress2" ng-model="applAddress2" style="width: 103%" value="">
                    <div id="input_2003" style="position: absolute;"> </div>
                    </div>
                    <div class="col-sm-4" style="padding-left: 2%;">
                    <input type="text"  name="movedIn2" id = "datepicker1" ng-model="movedIn2" placeholder="mm/dd/yyyy" class="form-control" ng-selected="calculateDate(this)" style="width: 112%" value ="" readonly="readonly">
                    <div id="input_2004" style="position: absolute;"> </div>
                    </div>
                    </div><br><br><br><br><br><br><br><br>
                        <input type="hidden" name="priormonthsum1" value=""""),format.raw/*126.75*/("""{"""),format.raw/*126.76*/("""{"""),format.raw/*126.77*/("""applicantTotal2-applicantTotal1"""),format.raw/*126.108*/("""}"""),format.raw/*126.109*/("""}"""),format.raw/*126.110*/("""">
                        <input type="hidden" name="totalpriormonths1" value=""""),format.raw/*127.78*/("""{"""),format.raw/*127.79*/("""{"""),format.raw/*127.80*/("""applicantTotal2"""),format.raw/*127.95*/("""}"""),format.raw/*127.96*/("""}"""),format.raw/*127.97*/("""">
                        <div ng-show="applicantTotal2<36">
                        <div class="col-sm-6" style="padding-left: 0%; width: 100%;">
                        <div class="row">
                              <div class="col-md-8"><label class="labelfont">Previous Address?<span style="color: red; font-size: 3">*</span></label></div>
                              <div class="col-md-4" style="padding-left: 0%;" ><label class="labelfont">Moved in?<span style="color: red; font-size: 3">*</span></label></div>
                        </div>
                        <div class="col-sm-8" style="padding-left: 0%;">
                        <div class="map_canvas"></div>
                        <!-- <input type="text" id="geocomplete2" placeholder="Enter Location" class="form-control" name="currentAddress3" ng-model="appAddress3" style="width: 103%" ng-change="copyValue(this)" value=""> -->
                        <input type="text" id="geocomplete2" placeholder="Enter Location" class="form-control" name="currentAddress3" ng-model="appAddress3" style="width: 103%" value="">
                        <div id="input_2005"> </div>
                        </div>
                        <div class="col-sm-4" style="padding-left: 2%;">
                        <input type="text"  name="movedIn3" id = "datepicker2" ng-model="movedIn3" placeholder="mm/dd/yyyy" class="form-control" ng-selected="calculateDate(this)"  style="width: 112%" value="" readonly="readonly">
                        <div id="input_2006" style="position: absolute;"> </div>
                        </div>
                        </div>
                        <input type="hidden" name="priormonthsum2" value=""""),format.raw/*145.75*/("""{"""),format.raw/*145.76*/("""{"""),format.raw/*145.77*/("""applicantTotal3-applicantTotal2"""),format.raw/*145.108*/("""}"""),format.raw/*145.109*/("""}"""),format.raw/*145.110*/("""">
                        <input type="hidden" name="totalpriormonths2" value=""""),format.raw/*146.78*/("""{"""),format.raw/*146.79*/("""{"""),format.raw/*146.80*/("""applicantTotal3"""),format.raw/*146.95*/("""}"""),format.raw/*146.96*/("""}"""),format.raw/*146.97*/("""">
                        </div>
                </div>
               
            </div>
           
            <div ng-if="data == 'yes'">
            <div class="clearfix visible-xs"></div>
            <div class="col-sm-1 verticalLine" style="margin-left:-25px; width: 0%; padding-right: 0px;"></div>
            <div class="col-sm-6" style="padding-left: 0%;">
                <label class="labelfont" style="padding-left: 30%">"""),_display_(/*156.69*/coApplicantName),format.raw/*156.84*/("""</label><br><br>
                <div class="row">
                              <div class="col-md-8"><label class="labelfont">What is your current address?<span style="color: red; font-size: 3">*</span></label></div>
                              <div class="col-md-4" style="padding-left: 0%;" ><label class="labelfont">Moved in?<span style="color: red; font-size: 3">*</span></label></div>
                </div>
                <div class="col-sm-8" style="padding-left: 0%;">
                <div class="map_canvas"></div>
                   
                <input type="text" id="geocomplete3" ng-model="coCurrentAddress1" class="form-control" name="CoCurrentAddress1"  style="width: 100%;">
                <div id="input_2021" style="position: absolute;"> </div>
                </div>
                <div class="col-sm-4" style="padding-left: 0%;">
                <input type="text" name="CoMovedIn1" id = "datepicker3" ng-model="CoMovedIn1" placeholder="mm/dd/yyyy" class="form-control" ng-selected="calculateDate2(this)" style="width: 100%" value="" readonly="readonly">
                <div id="input_2022" style="position: absolute;"> </div>
                </div><br><br><br>
                <input type="hidden" name="coAppcurrentaddressmonthsum" value=""""),format.raw/*171.80*/("""{"""),format.raw/*171.81*/("""{"""),format.raw/*171.82*/("""coApplicantTotal"""),format.raw/*171.98*/("""}"""),format.raw/*171.99*/("""}"""),format.raw/*171.100*/("""">
                <input type="hidden" name="coAppTotalcurrentMonths" value=""""),format.raw/*172.76*/("""{"""),format.raw/*172.77*/("""{"""),format.raw/*172.78*/("""coApplicantTotal"""),format.raw/*172.94*/("""}"""),format.raw/*172.95*/("""}"""),format.raw/*172.96*/("""">
                <div ng-show="coApplicantTotal<36">
                <div class="col-sm-6" style="padding-left: 0%;  width: 100%">
                <div class="row">
                              <div class="col-md-8"><label class="labelfont">Please provide your prior address.  Lenders require a minimum of 3 years history.<span style="color: red; font-size: 3">*</span></label></div>
                              <div class="col-md-4" style="padding-left: 0%;"><label class="labelfont">Moved in?<span style="color: red; font-size: 3">*</span></label></div>
                </div>
                <div class="col-sm-8" style="padding-left: 0%;">
                <div class="map_canvas"></div>
                <input type="text" id="geocomplete4" placeholder="Enter Location" class="form-control" name="CoCurrentAddress2" ng-model="coAppAddress2" style="width: 105%" value="">
                <div id="input_2023" style="position: absolute;"> </div>
                </div>
                <div class="col-sm-4" style="padding-left: 3%;">
                <input type="text"  name="CoMovedIn2" id = "datepicker4" ng-model="CoMovedIn2" placeholder="mm/dd/yyyy" class="form-control" ng-selected="calculateDate2(this)" style="width: 114%" value="" readonly="readonly">
                <div id="input_2024" style="position: absolute;"> </div>
                </div>
                </div><br><br><br><br><br><br><br><br>
                <input type="hidden" name="coAppPriorSumMonth1" value=""""),format.raw/*189.72*/("""{"""),format.raw/*189.73*/("""{"""),format.raw/*189.74*/("""coApplicantTotal2-applicantTotal1"""),format.raw/*189.107*/("""}"""),format.raw/*189.108*/("""}"""),format.raw/*189.109*/("""">
                <input type="hidden" name="coAppTotalpriorcurrentmonths1" value=""""),format.raw/*190.82*/("""{"""),format.raw/*190.83*/("""{"""),format.raw/*190.84*/("""coApplicantTotal2"""),format.raw/*190.101*/("""}"""),format.raw/*190.102*/("""}"""),format.raw/*190.103*/("""">
                <div ng-show="coApplicantTotal2<36">
                <div class="col-sm-6" style="padding-left: 0%; float: right; width: 100%;">
                <div class="row">
                              <div class="col-md-8"><label class="labelfont">Previous Address?<span style="color: red; font-size: 3">*</span></label></div>
                              <div class="col-md-4" style="padding-left: 0%;"><label class="labelfont">Moved in?<span style="color: red; font-size: 3">*</span></label></div>
                </div>
                <div class="col-sm-8" style="padding-left: 0%;">
                <div class="map_canvas"></div>
                <input type="text" id="geocomplete5" class="form-control" name="CoCurrentAddress4" style="width: 105%" ng-model="coAppAddress3" value="">
                <div id="input_2025" style="position: absolute;"> </div>
                </div>
                <div class="col-sm-4" style="padding-left: 2%;">
                <input type="text" name="CoMovedIn3" id = "datepicker5" ng-model="CoMovedIn3" placeholder="mm/dd/yyyy" class="form-control"  style="width: 112%" value="" readonly="readonly">
                <div id="input_2026" style="position: absolute;"> </div>
                </div>
                </div>
                <input type="hidden" name="coApppriorSumMonth2" value=""""),format.raw/*207.72*/("""{"""),format.raw/*207.73*/("""{"""),format.raw/*207.74*/("""coApplicantTotal3-coApplicantTotal2"""),format.raw/*207.109*/("""}"""),format.raw/*207.110*/("""}"""),format.raw/*207.111*/("""">
                <input type="hidden" name="coApptotalpriorcurrentmonths2" value=""""),format.raw/*208.82*/("""{"""),format.raw/*208.83*/("""{"""),format.raw/*208.84*/("""coApplicantTotal3"""),format.raw/*208.101*/("""}"""),format.raw/*208.102*/("""}"""),format.raw/*208.103*/("""">
                </div>
            </div>
            </div>
            </div>
			     </div>
			   <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
			  <script type="text/javascript" src="jquery-ui.js" ></script>
			  <script src=""""),_display_(/*216.20*/routes/*216.26*/.Assets.at("_resources/jquery-ui.js")),format.raw/*216.63*/("""" type="text/javascript"></script>
			  <link rel="stylesheet" href="/resources/demos/style.css">
			  <br>
			<br/>
			</div>
			<br>
                    <div class="row" style="width: 100%;">
                                <div class="col-sm-6"
                                    style="float: left; padding-left: 2%; width: 45%;">
                                    <a href="mortgageBackPage6" class="btn btn-primary"
                                        role="button" style="width: 50%;">Back</a>
                                </div>
                            <div class="col-sm-6" align="right" style="float: right; padding-right:5%; width: 45%;"><input type="submit" class="btn btn-primary btn-block"
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
                            <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:65%; background-color: #6AA84F;">
                            <label>65% complete</label>
                            </div>
                          </div>
                        </div>
                     </div>
                   
                </div>
               
                <br>
                <br>
               
</form>
</div>

<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
<script src="jquery.geocomplete.js"></script>
<script src=""""),_display_(/*257.15*/routes/*257.21*/.Assets.at("_resources/jquery.maskedinput.min.js")),format.raw/*257.71*/("""" type="text/javascript"></script>
</body>
</html>"""))}
  }

  def render(additionalApplicants:String,applicantName:String,coApplicantName:String,applAddressParam:ApplicantAddressParameter7,coApplAddressParam:CoApplicantAddressParameter7): play.twirl.api.HtmlFormat.Appendable = apply(additionalApplicants,applicantName,coApplicantName,applAddressParam,coApplAddressParam)

  def f:((String,String,String,ApplicantAddressParameter7,CoApplicantAddressParameter7) => play.twirl.api.HtmlFormat.Appendable) = (additionalApplicants,applicantName,coApplicantName,applAddressParam,coApplAddressParam) => apply(additionalApplicants,applicantName,coApplicantName,applAddressParam,coApplAddressParam)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:28 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage7Address.scala.html
                  HASH: 6fb278a745bfa3e52298774cf33957ae46fd5984
                  MATRIX: 808->1|1063->167|1091->169|1699->750|1714->756|1777->798|1820->814|1835->820|1897->861|1983->920|1998->926|2058->965|2134->1014|2149->1020|2204->1054|2280->1103|2295->1109|2353->1146|2417->1183|2432->1189|2489->1225|2756->1465|2771->1471|2836->1515|2893->1545|2908->1551|2989->1611|3051->1646|3066->1652|3133->1698|3190->1728|3205->1734|3265->1773|3322->1803|3337->1809|3396->1847|3484->1908|3499->1914|3583->1976|4038->2405|4079->2425|4175->2494|4200->2510|4248->2537|4341->2603|4366->2619|4408->2640|4500->2705|4525->2721|4572->2747|4666->2814|4691->2830|4733->2851|4824->2915|4849->2931|4896->2957|4990->3024|5015->3040|5057->3061|5156->3133|5183->3151|5227->3174|5321->3241|5348->3259|5386->3276|5480->3343|5507->3361|5550->3383|5648->3454|5675->3472|5710->3486|5808->3557|5835->3575|5878->3597|5976->3668|6003->3686|6038->3700|6144->3779|6169->3795|6221->3826|6318->3896|6343->3912|6401->3949|6490->4011|6515->4027|6573->4064|6670->4134|6697->4152|6745->4179|6835->4242|6862->4260|6913->4290|7003->4353|7030->4371|7084->4404|7476->4769|7491->4775|7552->4815|8080->5316|8114->5329|9685->6871|9715->6872|9745->6873|9789->6888|9819->6889|9849->6890|9951->6963|9981->6964|10011->6965|10055->6980|10085->6981|10115->6982|11982->8820|12012->8821|12042->8822|12103->8853|12134->8854|12165->8855|12274->8935|12304->8936|12334->8937|12378->8952|12408->8953|12438->8954|14162->10649|14192->10650|14222->10651|14283->10682|14314->10683|14345->10684|14454->10764|14484->10765|14514->10766|14558->10781|14588->10782|14618->10783|15083->11220|15120->11235|16422->12508|16452->12509|16482->12510|16527->12526|16557->12527|16588->12528|16695->12606|16725->12607|16755->12608|16800->12624|16830->12625|16860->12626|18377->14114|18407->14115|18437->14116|18500->14149|18531->14150|18562->14151|18675->14235|18705->14236|18735->14237|18782->14254|18813->14255|18844->14256|20216->15599|20246->15600|20276->15601|20341->15636|20372->15637|20403->15638|20516->15722|20546->15723|20576->15724|20623->15741|20654->15742|20685->15743|20993->16023|21009->16029|21068->16066|22926->17896|22942->17902|23014->17952
                  LINES: 26->1|29->1|31->3|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|48->20|56->28|56->28|56->28|57->29|57->29|57->29|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|93->65|93->65|93->65|94->66|94->66|94->66|95->67|95->67|95->67|103->75|103->75|103->75|114->86|114->86|133->105|133->105|133->105|133->105|133->105|133->105|134->106|134->106|134->106|134->106|134->106|134->106|154->126|154->126|154->126|154->126|154->126|154->126|155->127|155->127|155->127|155->127|155->127|155->127|173->145|173->145|173->145|173->145|173->145|173->145|174->146|174->146|174->146|174->146|174->146|174->146|184->156|184->156|199->171|199->171|199->171|199->171|199->171|199->171|200->172|200->172|200->172|200->172|200->172|200->172|217->189|217->189|217->189|217->189|217->189|217->189|218->190|218->190|218->190|218->190|218->190|218->190|235->207|235->207|235->207|235->207|235->207|235->207|236->208|236->208|236->208|236->208|236->208|236->208|244->216|244->216|244->216|285->257|285->257|285->257
                  -- GENERATED --
              */
          