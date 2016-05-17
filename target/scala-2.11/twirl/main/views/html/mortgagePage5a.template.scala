
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
object mortgagePage5a extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(additionalApplicants: String,incomedown1:String,largerfamily1:String,buyingnewvechile1:String,Planninglifestyle1:String,financialrisk1:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.145*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="shortcut icon" href=""""),_display_(/*9.34*/routes/*9.40*/.Assets.at("_resources/favicon.ico")),format.raw/*9.76*/("""">
  <script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js
"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

   <script src=""""),_display_(/*18.18*/routes/*18.24*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*18.68*/(""""></script>
    
     <script src=""""),_display_(/*20.20*/routes/*20.26*/.Assets.at("javascripts/mortgageJs/mortgagePage5a.js")),format.raw/*20.80*/(""""></script>


<link rel="stylesheet" href="_resources/bootstrap.min.css">
 <link rel="stylesheet" href=""""),_display_(/*24.32*/routes/*24.38*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*24.80*/("""">
<script src="""),_display_(/*25.14*/routes/*25.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*25.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*26.47*/routes/*26.53*/.Assets.at("_resources/background.css")),format.raw/*26.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*27.47*/routes/*27.53*/.Assets.at("_resources/forms.css")),format.raw/*27.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*28.47*/routes/*28.53*/.Assets.at("_resources/template.css")),format.raw/*28.90*/("""">
</head>
<body>
<br>
<br>

<div style="width: 95%;">

		<form name="myForm" action="mortgagePage5a" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value=""""),_display_(/*37.32*/additionalApplicants),format.raw/*37.52*/("""" name="additionalApplicants">
		<input type="hidden" value=""""),_display_(/*38.32*/incomedown1),format.raw/*38.43*/("""" name="incomedown1">
		<input type="hidden" value=""""),_display_(/*39.32*/largerfamily1),format.raw/*39.45*/("""" name="largerfamily1">
		<input type="hidden" value=""""),_display_(/*40.32*/buyingnewvechile1),format.raw/*40.49*/("""" name="buyingnewvechile1">
		<input type="hidden" value=""""),_display_(/*41.32*/Planninglifestyle1),format.raw/*41.50*/("""" name="Planninglifestyle1">
		<input type="hidden" value=""""),_display_(/*42.32*/financialrisk1),format.raw/*42.46*/("""" name="financialrisk1">
		
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 0%; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*51.11*/routes/*51.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*51.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<label class="labelfont">The following questions help us best understand your particular circumstance and then tailor the best mortgage for you.</label>
		<br><br>
		<div ng-controller="DemoController" ng-init="isDisabled = false">
			<div style="width: 100%;">
			
			<label class="labelfont">If my income went down by a few hundred dollars a month, I would start to really worry about my bills.<span style="color: red; font-size: 3">*</span></label><br>
			<div class="btn-group block" style="width: 100%;">
          			
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'Yes'"
                      ng-change="change()"  ng-model="newItemType6"> Yes
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'No'"
                       ng-change="change()"  ng-model="newItemType6"> No
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'Maybe'"
                      ng-change="change()"  ng-model="newItemType6"> Maybe
              </label>
            </div>
            <div id="widget_uniidsettings_60" style="position: absolute;"> </div>
            <input type="hidden" name="mybills" value=""""),format.raw/*75.56*/("""{"""),format.raw/*75.57*/("""{"""),format.raw/*75.58*/("""newItemType6"""),format.raw/*75.70*/("""}"""),format.raw/*75.71*/("""}"""),format.raw/*75.72*/("""" ></input>
            </div>
            <br>
            
			<label class="labelfont">I might have a larger family sometime over the next 5 years.<span style="color: red; font-size: 3">*</span></label><br>
			<div class="btn-group" style="width: 100%;">
          			
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'Yes'"
                      ng-change="change()"  ng-model="newItemType7"> Yes
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'No'"
                       ng-change="change()"  ng-model="newItemType7"> No
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'Maybe'"
                      ng-change="change()"  ng-model="newItemType7"> Maybe
              </label>
              
            </div>
            <div id="widget_settings_61" style="position: absolute;"> </div>
            <input type="hidden" name="largerFamily" value=""""),format.raw/*95.61*/("""{"""),format.raw/*95.62*/("""{"""),format.raw/*95.63*/("""newItemType7"""),format.raw/*95.75*/("""}"""),format.raw/*95.76*/("""}"""),format.raw/*95.77*/("""" ></input>
			<br>            <br>
			
			<label class="labelfont">I am considering buying a new vehicle in the next 6-12 months.<span style="color: red; font-size: 3">*</span></label><br>
			<div class="btn-group" style="width: 100%">
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'Yes'"
                      ng-change="change()"  ng-model="newItemType8"> Yes
                                
              </label>             
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'No'"
                       ng-change="change()"  ng-model="newItemType8"> No
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'Maybe'"
                      ng-change="change()"  ng-model="newItemType8"> Maybe
              </label>
            </div>
            <div id="widget_settings_62" style="position: absolute;"></div>
            <input type="hidden" name="buyNewVehicle" value=""""),format.raw/*112.62*/("""{"""),format.raw/*112.63*/("""{"""),format.raw/*112.64*/("""newItemType8"""),format.raw/*112.76*/("""}"""),format.raw/*112.77*/("""}"""),format.raw/*112.78*/("""" ></input>
			            <br>
			            <br>
			
			<label class="labelfont">In the next 2-5 years, I am planning on significantly changing my recreation lifestyle and I might require much more storage at home.<span style="color: red; font-size: 3">*</span></label><br>
			<div class="btn-group" style="width: 100%;">
          			
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'Yes'"
                      ng-change="change()"  ng-model="newItemType9"> Yes
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'No'"
                       ng-change="change()"  ng-model="newItemType9"> No
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'Maybe'"
                      ng-change="change()"  ng-model="newItemType9"> Maybe
              </label>
              
            </div>
            <div id="widget_settings_63" style="position: absolute;"> </div>
                        <input type="hidden" name="recreatStoreHome" value=""""),format.raw/*132.77*/("""{"""),format.raw/*132.78*/("""{"""),format.raw/*132.79*/("""newItemType9"""),format.raw/*132.91*/("""}"""),format.raw/*132.92*/("""}"""),format.raw/*132.93*/("""" ></input>
	            <br>
	            <br>
	
			<label class="labelfont">I consider myself to be a financial risk taker.<span style="color: red; font-size: 3">*</span></label><br>
			<div class="btn-group" style="width: 100%;">
          			
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'Yes'"
                      ng-change="change()"  ng-model="newItemType10"> Yes
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'No'"
                       ng-change="change()"  ng-model="newItemType10"> No
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'Maybe'"
                      ng-change="change()"  ng-model="newItemType10"> Maybe
              </label>
            </div>
             <div id="widget_settings_64" style="position: absolute;"> </div>
            <input type="hidden" name="riskTaker" value=""""),format.raw/*151.58*/("""{"""),format.raw/*151.59*/("""{"""),format.raw/*151.60*/("""newItemType10"""),format.raw/*151.73*/("""}"""),format.raw/*151.74*/("""}"""),format.raw/*151.75*/("""" ></input>
        </div>
	<br>	        		<div class="row" style="width: 100%;">
					  <div class="col-sm-6" style="float: left; padding-left:2%; width: 50%;">
					  		<a href="mortgageBackPage4" class="btn btn-primary" role="button" style=" width: 50%;">Back</a>
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
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 40%; background-color: #6AA84F;">
						    <label>40% complete</label>
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

  def render(additionalApplicants:String,incomedown1:String,largerfamily1:String,buyingnewvechile1:String,Planninglifestyle1:String,financialrisk1:String): play.twirl.api.HtmlFormat.Appendable = apply(additionalApplicants,incomedown1,largerfamily1,buyingnewvechile1,Planninglifestyle1,financialrisk1)

  def f:((String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (additionalApplicants,incomedown1,largerfamily1,buyingnewvechile1,Planninglifestyle1,financialrisk1) => apply(additionalApplicants,incomedown1,largerfamily1,buyingnewvechile1,Planninglifestyle1,financialrisk1)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:22 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage5a.scala.html
                  HASH: bfaea7fd3be5ff0bd4405149cf0da7d832791f7b
                  MATRIX: 767->1|999->144|1026->145|1484->577|1498->583|1554->619|2100->1138|2115->1144|2180->1188|2243->1224|2258->1230|2333->1284|2465->1389|2480->1395|2543->1437|2586->1453|2601->1459|2663->1500|2750->1560|2765->1566|2825->1605|2901->1654|2916->1660|2971->1694|3047->1743|3062->1749|3120->1786|3328->1967|3369->1987|3458->2049|3490->2060|3570->2113|3604->2126|3686->2181|3724->2198|3810->2257|3849->2275|3936->2335|3971->2349|4305->2656|4320->2662|4381->2702|5813->4106|5842->4107|5871->4108|5911->4120|5940->4121|5969->4122|7052->5177|7081->5178|7110->5179|7150->5191|7179->5192|7208->5193|8242->6198|8272->6199|8302->6200|8343->6212|8373->6213|8403->6214|9571->7353|9601->7354|9631->7355|9672->7367|9702->7368|9732->7369|10778->8386|10808->8387|10838->8388|10880->8401|10910->8402|10940->8403
                  LINES: 26->1|29->1|30->2|37->9|37->9|37->9|46->18|46->18|46->18|48->20|48->20|48->20|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|65->37|65->37|66->38|66->38|67->39|67->39|68->40|68->40|69->41|69->41|70->42|70->42|79->51|79->51|79->51|103->75|103->75|103->75|103->75|103->75|103->75|123->95|123->95|123->95|123->95|123->95|123->95|140->112|140->112|140->112|140->112|140->112|140->112|160->132|160->132|160->132|160->132|160->132|160->132|179->151|179->151|179->151|179->151|179->151|179->151
                  -- GENERATED --
              */
          