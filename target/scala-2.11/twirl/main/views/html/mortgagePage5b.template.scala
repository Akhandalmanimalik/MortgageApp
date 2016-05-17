
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
object mortgagePage5b extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(additionalApplicants: String,thinkproperty1:String,imaginesamejob1:String,incomeraise1:String,rentalproperty1:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.120*/("""
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
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script src=""""),_display_(/*16.15*/routes/*16.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*16.65*/(""""></script> 
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.at("javascripts/mortgageJs/mortgagePage5b.js")),format.raw/*17.75*/(""""></script> 
 
<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*20.31*/routes/*20.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*20.79*/("""">
<script src="""),_display_(/*21.14*/routes/*21.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*21.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*22.47*/routes/*22.53*/.Assets.at("_resources/background.css")),format.raw/*22.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*23.47*/routes/*23.53*/.Assets.at("_resources/forms.css")),format.raw/*23.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*24.47*/routes/*24.53*/.Assets.at("_resources/template.css")),format.raw/*24.90*/("""">
</head>
<body>
<br>
<br>
<div style="width: 97%;">
		<form name="myForm" action="mortgagePage5b" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value=""""),_display_(/*31.32*/additionalApplicants),format.raw/*31.52*/("""" name="additionalApplicants">
		<input type="hidden" value=""""),_display_(/*32.32*/thinkproperty1),format.raw/*32.46*/("""" name="thinkproperty1">
		<input type="hidden" value=""""),_display_(/*33.32*/imaginesamejob1),format.raw/*33.47*/("""" name="imaginesamejob1">
		<input type="hidden" value=""""),_display_(/*34.32*/incomeraise1),format.raw/*34.44*/("""" name="incomeraise1">
		<input type="hidden" value=""""),_display_(/*35.32*/rentalproperty1),format.raw/*35.47*/("""" name="rentalproperty1">
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*43.11*/routes/*43.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*43.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<div ng-controller="DemoController" ng-init="isDisabled = false">
		
			<label class="labelfont"> I think it is very likely that I will have this property for less than 3 years.<span style="color: red; font-size: 3">*</span></label><br>
			<div class="btn-group" style="width: 100%;">
          			
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'Yes'"
                      ng-change="change()"  ng-model="newItemType11"> Yes
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'No'"
                       ng-change="change()"  ng-model="newItemType11"> No
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'Maybe'"
                      ng-change="change()"  ng-model="newItemType11"> Maybe
              </label>
            </div>
            <div id="widget_settings_65" style="position: absolute;"></div>
            <input type="hidden" name="likelyProperty" value=""""),format.raw/*64.63*/("""{"""),format.raw/*64.64*/("""{"""),format.raw/*64.65*/("""newItemType11"""),format.raw/*64.78*/("""}"""),format.raw/*64.79*/("""}"""),format.raw/*64.80*/("""" ></input>
            <br>
			<br>
			<label class="labelfont"> I easily imagine myself in the same job 5 years from now.<span style="color: red; font-size: 3">*</span></label><br>
			<div class="btn-group" style="width: 100%;">
          			
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'Yes'"
                      ng-change="change()"  ng-model="newItemType12"> Yes
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'No'"
                       ng-change="change()"  ng-model="newItemType12"> No
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'Maybe'"
                      ng-change="change()"  ng-model="newItemType12"> Maybe
              </label>
            </div>
            <div id="widget_settings_66" style="position: absolute;"> </div>
            <input type="hidden" name="sameJob" value=""""),format.raw/*82.56*/("""{"""),format.raw/*82.57*/("""{"""),format.raw/*82.58*/("""newItemType12"""),format.raw/*82.71*/("""}"""),format.raw/*82.72*/("""}"""),format.raw/*82.73*/("""" ></input>
            <br>
			<br>
			<label class="labelfont"> I see my income going up by 20% or more in the next 3 years.<span style="color: red; font-size: 3">*</span></label><br>
			<div class="btn-group" style="width: 100%;">
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'Yes'"
                      ng-change="change()"  ng-model="newItemType13"> Yes
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'No'"
                       ng-change="change()"  ng-model="newItemType13"> No
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'Maybe'"
                      ng-change="change()"  ng-model="newItemType13"> Maybe
              </label>
              
            </div>
            <div id="widget_settings_67" style="position: absolute;"> </div>
            <input type="hidden" name="incomeGoing" value=""""),format.raw/*100.60*/("""{"""),format.raw/*100.61*/("""{"""),format.raw/*100.62*/("""newItemType13"""),format.raw/*100.75*/("""}"""),format.raw/*100.76*/("""}"""),format.raw/*100.77*/("""" ></input>
            <br>
			<br>
			<label class="labelfont"> I would like to have 1 or more rental properties in the next 5 years.<span style="color: red; font-size: 3">*</span></label><br>
			<div class="btn-group" style="width: 100%;">
          			
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'Yes'"
                      ng-change="change()"  ng-model="newItemType14"> Yes
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" btn-radio="'No'"
                       ng-change="change()"  ng-model="newItemType14"> No
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'Maybe'"
                      ng-change="change()"  ng-model="newItemType14"> Maybe
              </label>
            </div>
            <div id="widget_settings_68" style="position: absolute;"> </div>
            <input type="hidden" name="OneMoreProp" value=""""),format.raw/*118.60*/("""{"""),format.raw/*118.61*/("""{"""),format.raw/*118.62*/("""newItemType14"""),format.raw/*118.75*/("""}"""),format.raw/*118.76*/("""}"""),format.raw/*118.77*/("""" ></input>
        </div>
        <br>
	        		<div class="row" style="width: 100%;">
					  <div class="col-sm-6" style="float: left; padding-left:2%; width: 50%;">
					  		<a href="mortgageBackPage5a" class="btn btn-primary" role="button" style=" width: 50%;">Back</a>
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
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:45%; background-color: #6AA84F;">
						    <label>45%</label>
						    </div>
						  </div>
						</div>
					 </div>
					<div class="col-sm-3"></div>
				</div>
				
				<br>

</form>
</div>
</body>
</html>"""))}
  }

  def render(additionalApplicants:String,thinkproperty1:String,imaginesamejob1:String,incomeraise1:String,rentalproperty1:String): play.twirl.api.HtmlFormat.Appendable = apply(additionalApplicants,thinkproperty1,imaginesamejob1,incomeraise1,rentalproperty1)

  def f:((String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (additionalApplicants,thinkproperty1,imaginesamejob1,incomeraise1,rentalproperty1) => apply(additionalApplicants,thinkproperty1,imaginesamejob1,incomeraise1,rentalproperty1)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:16 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage5b.scala.html
                  HASH: 1b42ae4da4353dafa3febef751554edeaf71f16c
                  MATRIX: 760->1|967->119|994->120|1451->551|1465->557|1521->593|2056->1101|2071->1107|2136->1151|2190->1178|2205->1184|2280->1238|2412->1343|2427->1349|2490->1391|2533->1407|2548->1413|2610->1454|2697->1514|2712->1520|2772->1559|2848->1608|2863->1614|2918->1648|2994->1697|3009->1703|3067->1740|3273->1919|3314->1939|3403->2001|3438->2015|3521->2071|3557->2086|3641->2143|3674->2155|3755->2209|3791->2224|4124->2530|4139->2536|4200->2576|5411->3759|5440->3760|5469->3761|5510->3774|5539->3775|5568->3776|6608->4788|6637->4789|6666->4790|6707->4803|6736->4804|6765->4805|7814->5825|7844->5826|7874->5827|7916->5840|7946->5841|7976->5842|9033->6870|9063->6871|9093->6872|9135->6885|9165->6886|9195->6887
                  LINES: 26->1|29->1|30->2|37->9|37->9|37->9|44->16|44->16|44->16|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|59->31|59->31|60->32|60->32|61->33|61->33|62->34|62->34|63->35|63->35|71->43|71->43|71->43|92->64|92->64|92->64|92->64|92->64|92->64|110->82|110->82|110->82|110->82|110->82|110->82|128->100|128->100|128->100|128->100|128->100|128->100|146->118|146->118|146->118|146->118|146->118|146->118
                  -- GENERATED --
              */
          