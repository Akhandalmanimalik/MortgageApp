
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
object mortgagePage4 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(additionalApplicants: String,mortgageType33: String,mortgageTerm33:String,lookingFor33:String,ammortizeYear:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.118*/("""
"""),format.raw/*2.1*/("""<head>
<meta https-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Application Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="shortcut icon" href=""""),_display_(/*8.34*/routes/*8.40*/.Assets.at("_resources/favicon.ico")),format.raw/*8.76*/("""">
<script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link type="text/css" rel="stylesheet" href=""""),_display_(/*14.47*/routes/*14.53*/.Assets.at("stylesheets/basicinfo.css")),format.raw/*14.92*/(""""> 
<script src=""""),_display_(/*15.15*/routes/*15.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*15.65*/(""""></script>   
<script src=""""),_display_(/*16.15*/routes/*16.21*/.Assets.at("javascripts/mortgageJs/mortgagePage4.js")),format.raw/*16.74*/(""""></script>
 
<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*19.31*/routes/*19.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*19.79*/("""">
<script src="""),_display_(/*20.14*/routes/*20.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*20.61*/(""""></script>  
<link type="text/css" rel="stylesheet" href=""""),_display_(/*21.47*/routes/*21.53*/.Assets.at("_resources/background.css")),format.raw/*21.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*22.47*/routes/*22.53*/.Assets.at("_resources/forms.css")),format.raw/*22.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*23.47*/routes/*23.53*/.Assets.at("_resources/template.css")),format.raw/*23.90*/("""">
</head>
<body>
<br>
<br>
<div style="width: 95%">

		<form name="myForm" action="mortgagePage4" method="POST" onsubmit="return validateForm()">
		<input type="hidden" value=""""),_display_(/*31.32*/additionalApplicants),format.raw/*31.52*/("""" name="additionalApplicants">
		<input type="hidden" value=""""),_display_(/*32.32*/mortgageType33),format.raw/*32.46*/("""" name="mortgageType33">
		<input type="hidden" value=""""),_display_(/*33.32*/mortgageTerm33),format.raw/*33.46*/("""" name="mortgageTerm33">
		<input type="hidden" value=""""),_display_(/*34.32*/lookingFor33),format.raw/*34.44*/("""" name="lookingFor33">
		<div class="row"></div>
		<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-7 container-bg text-color-blue">
			
		<div align="left" style="padding-bottom: 1px; margin-top: 20px; padding-left: 3%">
			<img alt="Visdom Logo" height="65" width="210"
				src=""""),_display_(/*42.11*/routes/*42.17*/.Assets.at("_resources/visdom-logo.png")),format.raw/*42.57*/("""" />
		</div>
		<div style="padding-top: 30px"></div>
		<div data-ng-app="demoApp"  style="margin-left: 5%">
		<div ng-controller="DemoController" ng-init="isDisabled = false">
		
		
			<label class="labelfont">Do you currently have a type of mortgage in mind?<span style="color: red; font-size: 20">*</span></label>
			<a href="#"  data-toggle="modal" data-target="#myModal">(<b><u>Info</u></b>)</a>
  
			<div class="btn-group" style="width: 100%">        	
              <label style="width: 20%" class="btn btn-primary" ng-true-value="Variable" btn-radio="'Variable'"
                      ng-change="change()"  ng-model="mortgageInMind"> Variable
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="Fixed" btn-radio="'Fixed'"
                       ng-change="change()"  ng-model="mortgageInMind"> Fixed
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="Line of Credit" btn-radio="'LineofCredit'"
                      ng-change="change()"  ng-model="mortgageInMind"> Line of Credit
              </label>
              <br>
              <br>
              <label style="width: 20%; border-radius: 5px 0px 0px 5px;" class="btn btn-primary" ng-true-value="Cashback" btn-radio="'Cashback'"
                      ng-change="change()"  ng-model="mortgageInMind"> Cashback
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="Combination" btn-radio="'Combination'"
                       ng-change="change()"  ng-model="mortgageInMind"> Combination
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="Best Option" btn-radio="'BestOption'"
                      ng-change="change()"  ng-model="mortgageInMind"> Best Option
              </label>
              
            </div>
            <div id="input_204" style="position: absolute;"> </div>
                 <input type="hidden" name="mortgageInMind" value=""""),format.raw/*78.68*/("""{"""),format.raw/*78.69*/("""{"""),format.raw/*78.70*/("""mortgageInMind"""),format.raw/*78.84*/("""}"""),format.raw/*78.85*/("""}"""),format.raw/*78.86*/("""" ></input>
                 
				 <br><br>
            <label class="labelfont">Do you currently have a mortgage term in mind?<span style="color: red; font-size: 20">*</span><br>(If Line of Credit, select "None")</label>
            <a href="#"  data-toggle="modal" data-target="#termModal">(<b><u>Info</u></b>)</a>
             <!-- Trigger the modal for Lightbox or Help Text Info -->      			
    
     
            
            <div class="btn-group" style="width: 100%">
          			
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="SixMonth" btn-radio="'6 Month'"
                      ng-change="change()"  ng-model="mortgageTerm"> 6 Month
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="OneYear" btn-radio="'1 Year'"
                       ng-change="change()"  ng-model="mortgageTerm"> 1 Year
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="2 Year" btn-radio="'2 Year'"
                      ng-change="change()"  ng-model="mortgageTerm"> 2 Year
              </label>
              <br>
              <br>
              <label style="width: 20%; border-radius: 5px 0px 0px 5px;" class="btn btn-primary" ng-true-value="3 Year" btn-radio="'3 Year'"
                      ng-change="change()"  ng-model="mortgageTerm"> 3 Year
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="4 Year" btn-radio="'4 Year'"
                       ng-change="change()"  ng-model="mortgageTerm"> 4 Year
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="5 Year" btn-radio="'5 Year'"
                      ng-change="change()"  ng-model="mortgageTerm"> 5 Year
              </label>
              <br>
              <br>
              <label style="width: 20%; border-radius: 5px 0px 0px 5px;" class="btn btn-primary" ng-true-value="7 Year" btn-radio="'7 Year'"
                      ng-change="change()"  ng-model="mortgageTerm"> 7 Year
                                
              </label>
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="10 Year" btn-radio="'10 Year'"
                      ng-change="change()"  ng-model="mortgageTerm"> 10 Year
              </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="None" btn-radio="'None'"
                      ng-change="change()"  ng-model="mortgageTerm"> None
              </label>
            </div>
            <div id="input_205" style="position: absolute;"> </div>
            <br><br>
            	<input type="hidden" name="mortgageTerm" value=""""),format.raw/*126.62*/("""{"""),format.raw/*126.63*/("""{"""),format.raw/*126.64*/("""mortgageTerm"""),format.raw/*126.76*/("""}"""),format.raw/*126.77*/("""}"""),format.raw/*126.78*/("""" ></input>
            <label class="labelfont">Is there an amortization you are looking for?<span style="color: red; font-size: 20">*</span></label>
			<a href="#"  data-toggle="modal" data-target="#amortPeriod">(<b><u>Info</u></b>)</a>
			
			<div class="btn-group" style="width: 100%;">
          			
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="10 Year" btn-radio="'10 Year'"
                      ng-change="change()"  ng-model="lookingForAmortize"> 10 Year
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="15 Year" btn-radio="'15 Year'"
                       ng-change="change()"  ng-model="lookingForAmortize"> 15 Year
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" btn-radio="'20 Year'" ng-true-value="20 Year"
                      ng-change="change()"  ng-model="lookingForAmortize"> 20 Year
              </label>
              <br>
              <br>
              <label style="width: 20%; border-radius: 5px 0px 0px 5px;" class="btn btn-primary" ng-true-value="25 Year" btn-radio="'25 Year'"
                      ng-change="change()"  ng-model="lookingForAmortize"> 25 Year
                                
              </label>              
              <label style="width: 20%;" class="btn btn-primary" ng-true-value="30 Year" btn-radio="'30 Year'"
                       ng-change="change()"  ng-model="lookingForAmortize"> 30 Year
		      </label>
              <label style="width: 20%; border-radius: 0px 5px 5px 0px;" class="btn btn-primary" ng-true-value="Other" btn-radio="'Other'"
                      ng-change="change()"  ng-model="lookingForAmortize"> Other
              </label>
              
            </div>
            <div id="widget_settings_38" style="position: absolute;"> </div>
                 <input type="hidden" name="lookingForAmortize" value=""""),format.raw/*157.72*/("""{"""),format.raw/*157.73*/("""{"""),format.raw/*157.74*/("""lookingForAmortize"""),format.raw/*157.92*/("""}"""),format.raw/*157.93*/("""}"""),format.raw/*157.94*/("""" ></input>
            <br><br>
            <div ng-if="lookingForAmortize=='Other'">
            <label class="labelfont">Over how many years would you like to amortize your mortgage?<span style="color: red; font-size: 3">*</span></label>
            <input type="number" style="width: 30%;" size="12"  placeholder="e.g. 22"
					name="amortizeYear"  class="form-control" data-type="input-number" value=""""),_display_(/*162.81*/ammortizeYear),format.raw/*162.94*/("""">
					<div id="cid_244" style="position: absolute;"> </div>
            </div>
            
            
           					 <!-- Lightbox text code -->
							<div class="container">
								<!-- Trigger the modal for Lightbox or Help Text Info -->
								<div class="modal fade" id="myModal" role="dialog">
									<div class="modal-dialog">

										<!-- Modal content-->
										<!-- Do you currently have a type of mortgage in mind?* -->
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">&times;</button>
												<h4 class="modal-title">About Mortgage Types:</h4>
											</div>
											<div class="modal-body">
												<ul class="ul-dash">
													<li><b>Variable Rate Mortgage:</b></li>
													<p>An interest rate on a mortgage that fluctuates
														according to changes in the prime lending rate. A variable
														rate mortgage has payments which are fixed for the term,
														even though interest rates may fluctuate during that time.
														If interest rates go down, more of the payment is applied
														to reduce the principal; if rates go up, more of the
														payment is applied to payment of interest. Variable rate
														mortgages may be open or closed.</p>

													<li><b>Fixed-rate Mortgage:</b></li>
													<p>The interest rate on a fixed-rate mortgage is set
														for a pre-determined term - usually between 6 months and
														25 years - and cannot be renegotiated, except upon payment
														of breakage costs. Interest is calculated semi-annually,
														not in advance.</p>
													<li><b>Line of Credit:</b></li>
													<p>A type of credit which offers an individual
														immediate access to any portion or all of a pre-determined
														amount of cash upon demand. A line of credit may be either
														unsecured or secured with personal assets such as bonds,
														term deposits or equity on a home. A secured line of
														credit results in lower risk to the financial institution
														and a lower rate of interest to the individual.</p>
													<li><b>Cash Back Mortgage:</b></li>
													<p>A type of mortgage where the borrower receives an
														extra cash payment in addition to the amount financed to
														purchase their home. The amount the borrower receives (the
														"cash back") is calculated on the size and term of the
														borrower's mortgage using a set percentage (often 5%).</p>
													<li><b>Combination Mortgage:</b></li>
													<p>Is two separate mortgages, a first and second or a
														line of credit combined with a fixed mortgage option with
														the same lender</p>
												</ul>
											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-default"
													data-dismiss="modal">Close</button>
											</div>
										</div>

									</div>
								</div>
								<!-- Do you currently have a mortgage term in mind? -->
								<div class="modal fade" id="termModal" role="dialog">
									<div class="modal-dialog">

										<!-- Modal content-->
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">&times;</button>
												<h4 class="modal-title">About Term:</h4>
											</div>
											<div class="modal-body">
												<ul class="ul-dash">
													<p>The length of time during which the specific
														mortgage agreement is effective. When the term expires,
														the balance of the principal is either repaid in full or
														the mortgage is renegotiated at then-current market rates
														and conditions.</p>
												</ul>
											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-default"
													data-dismiss="modal">Close</button>
											</div>
										</div>

									</div>
								</div>
								<!-- Is there an amortization you are looking for? -->
								<div class="modal fade" id="amortPeriod" role="dialog">
									<div class="modal-dialog">

										<!-- Modal content-->
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">&times;</button>
												<h4 class="modal-title">About Amortization Period:</h4>
											</div>
											<div class="modal-body">
												<ul class="ul-dash">
													<p>Number of years it takes to repay the entire amount
														of the mortgage.</p>
												</ul>
											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-default"
													data-dismiss="modal">Close</button>
											</div>
										</div>

									</div>
								</div>
							</div>

						</div>
	       				 <br>
	        		<div class="row" style="width: 100%;">
								<div class="col-sm-6"
									style="float: left; padding-left: 2%; width: 50%;">
									<a href="mortgageBackPage23" class="btn btn-primary"
										role="button" style="width: 50%;">Back</a>
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
						    <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:35%; background-color: #6AA84F;">
						    <label>35% complete</label>
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

  def render(additionalApplicants:String,mortgageType33:String,mortgageTerm33:String,lookingFor33:String,ammortizeYear:String): play.twirl.api.HtmlFormat.Appendable = apply(additionalApplicants,mortgageType33,mortgageTerm33,lookingFor33,ammortizeYear)

  def f:((String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (additionalApplicants,mortgageType33,mortgageTerm33,lookingFor33,ammortizeYear) => apply(additionalApplicants,mortgageType33,mortgageTerm33,lookingFor33,ammortizeYear)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:25 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/mortgagePage4.scala.html
                  HASH: 1d79d8ef9c52247c07ec875df853c18db184c213
                  MATRIX: 759->1|964->117|991->118|1338->439|1352->445|1408->481|1974->1020|1989->1026|2049->1065|2094->1083|2109->1089|2174->1133|2230->1162|2245->1168|2319->1221|2450->1325|2465->1331|2528->1373|2571->1389|2586->1395|2648->1436|2735->1496|2750->1502|2810->1541|2886->1590|2901->1596|2956->1630|3032->1679|3047->1685|3105->1722|3310->1900|3351->1920|3440->1982|3475->1996|3558->2052|3593->2066|3676->2122|3709->2134|4039->2437|4054->2443|4115->2483|6309->4649|6338->4650|6367->4651|6409->4665|6438->4666|6467->4667|9383->7554|9413->7555|9443->7556|9484->7568|9514->7569|9544->7570|11574->9571|11604->9572|11634->9573|11681->9591|11711->9592|11741->9593|12176->10000|12211->10013
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|59->31|59->31|60->32|60->32|61->33|61->33|62->34|62->34|70->42|70->42|70->42|106->78|106->78|106->78|106->78|106->78|106->78|154->126|154->126|154->126|154->126|154->126|154->126|185->157|185->157|185->157|185->157|185->157|185->157|190->162|190->162
                  -- GENERATED --
              */
          