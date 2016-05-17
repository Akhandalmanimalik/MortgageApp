
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
object visdomreferral31 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(role: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Referral Source Form</title>

<link rel="shortcut icon" href=""""),_display_(/*8.34*/routes/*8.40*/.Assets.at("_resources/favicon.ico")),format.raw/*8.76*/("""">
<script
    src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
 <script src=""""),_display_(/*11.16*/routes/*11.22*/.Assets.at("_resources/angular.min.js")),format.raw/*11.61*/(""""></script>
  
<script
    src=""""),_display_(/*14.11*/routes/*14.17*/.Assets.at("_resources/ui-bootstrap-tpls.min.js")),format.raw/*14.66*/(""""></script>
<!--  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

 -->
<script src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.at("_resources/jquery-2.1.4.min.js")),format.raw/*18.65*/(""""></script>

<script src=""""),_display_(/*20.15*/routes/*20.21*/.Assets.at("_resources/app.js")),format.raw/*20.52*/(""""></script>

<script src=""""),_display_(/*22.15*/routes/*22.21*/.Assets.at("_resources/signature_pad.js")),format.raw/*22.62*/(""""></script>
<!-- <script src="_resources/jquery.maskedinput.min.js" type="text/javascript"></script>
 -->
<link rel="stylesheet" href="_resources/bootstrap.min.css">
<link rel="stylesheet" href=""""),_display_(/*26.31*/routes/*26.37*/.Assets.at("_resources/bootstrap.min.css")),format.raw/*26.79*/("""">
<script src="""),_display_(/*27.14*/routes/*27.20*/.Assets.at("_resources/bootstrap.min.js")),format.raw/*27.61*/(""""></script>
<link type="text/css" rel="stylesheet" href=""""),_display_(/*28.47*/routes/*28.53*/.Assets.at("_resources/background.css")),format.raw/*28.92*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*29.47*/routes/*29.53*/.Assets.at("_resources/forms.css")),format.raw/*29.87*/("""">
<link type="text/css" rel="stylesheet" href=""""),_display_(/*30.47*/routes/*30.53*/.Assets.at("_resources/template.css")),format.raw/*30.90*/("""">



<link rel="stylesheet" href=""""),_display_(/*34.31*/routes/*34.37*/.Assets.at("_resources/signature-pad.css")),format.raw/*34.79*/("""">


<!-- <link rel="stylesheet"
    href="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css"> -->
<style>
body """),format.raw/*40.6*/("""{"""),format.raw/*40.7*/("""
    """),format.raw/*41.5*/("""padding-top: 20px;
    padding-bottom: 20px;
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""

"""),format.raw/*45.1*/("""#sig-canvas """),format.raw/*45.13*/("""{"""),format.raw/*45.14*/("""
    """),format.raw/*46.5*/("""border: 2px dotted Black;
    border-radius: 5px;
    cursor: crosshair;
    background: white;
    color: black;
"""),format.raw/*51.1*/("""}"""),format.raw/*51.2*/("""

"""),format.raw/*53.1*/("""#sig-dataUrl """),format.raw/*53.14*/("""{"""),format.raw/*53.15*/("""
    """),format.raw/*54.5*/("""width: 100%;
"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/("""
"""),format.raw/*56.1*/("""</style>
</head>
<body>


    <div style="padding-bottom: 20px; margin-top: 20px; padding-left: 45%">
        <img alt="Visdom Logo" height="90" width="260"
            src=""""),_display_(/*63.19*/routes/*63.25*/.Assets.at("_resources/visdom-logo.png")),format.raw/*63.65*/("""" />

    </div>
    <div style="width: 95%">
        <form name="myForm" action="visdomReferral3" method="POST" onsubmit="return validateForm()">
            <div class="row"></div>
            <div class="row">
                <div class="col-sm-3"></div>


                <div class="col-sm-7 container-bg text-color-blue">
                    <div style="padding-top: 50px"></div>


                    <div data-ng-app="demoApp" ng-init="role=''"
                        style="margin-left: 5%">


                        <div ng-controller="DemoController" ng-init="newItemType=false">




                           

                           



                            

                    <br> <label class="form-label form-label-top" id="label_35"
                            for="input_35"> What type of smartphone do you use?
                            </label><font color="red">*</font> <br>
                            <br>
                            <div  class="btn-group">
                            <label style="width: 180px" class="btn btn-primary" btn-radio="'IPhone'"
                                ng-change="change()"  ng-model="newItemType"> iPhone
                                
                            </label> <label style="width: 180px" class="btn btn-primary" btn-radio="'Android'"
                                ng-change="change()"  ng-model="newItemType"> Android
                            </label>
                            <!-- <br>
                            <br> -->
                            
                                <label style="width: 180px" class="btn btn-primary" btn-radio="'Neither'"
                                ng-change="change()" ng-model="newItemType">Neither
                                
                            </label> <!-- <label style="width: 180px" class="btn btn-primary" btn-radio="'Client'"
                                ng-change="change()" ng-model="newItemType"> Client
                            </label> -->
                              <div id="role1"> </div>
                            
                        </div>
                        
                        
                        <br>
                            
        <input type="hidden" id="role" name="role" value=""""),format.raw/*121.59*/("""{"""),format.raw/*121.60*/("""{"""),format.raw/*121.61*/("""newItemType"""),format.raw/*121.72*/("""}"""),format.raw/*121.73*/("""}"""),format.raw/*121.74*/("""" ng-required>
                           <br><br><br> 
                           
                            <div ng-show="newItemType=='IPhone'">

                                <div class="WordSection1">
                                <p><span style="font-size:medium;">iPhone</span></p>
                                    <p>To provide             a referral, all you need to do is go to Visdom's confidential referrals webpage, provide your name and email address (so we know to credit  you with the referral) and a little bit of information about the  client. </p>
                                    <p>To make this process quick and simple on your iPhone, please take a moment to do the following steps:</p>
                                    <p>1) Using your phone, click this weblink to open the Visdom Referrals Page in Safari.<a target="_blank" title="Visdom Referrals Page" href="https://dev-forms.visdom.ca/visdomreferralV">https://dev-forms.visdom.ca/visdomreferralV</a></p><br>
                                  
                                    <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="iPhone Step 1" height="20%" width="50%"
								            src=""""),_display_(/*134.27*/routes/*134.33*/.Assets.at("_resources/iPhone-Step-1.JPG")),format.raw/*134.75*/("""" />
    								</div>
    								<br>
                                    <p>2) At the bottom of the screen you'll see an icon depicting an arrow that  looks like it's trying to get away from a square. Tap this button and you'll have a few options.</p>
                                    <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="iPhone Step-2" height="20%" width="50%"
								            src=""""),_display_(/*140.27*/routes/*140.33*/.Assets.at("_resources/iPhoneStep-2.JPG")),format.raw/*140.74*/("""" />
    								</div>
                                    <p>3) Tap the "Add to Home Screen" button.  You'll  be asked to choose a name for the home screen icon. <em></em></p>
                                    <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="iPhone Step-3" height="20%" width="50%"
								            src=""""),_display_(/*145.27*/routes/*145.33*/.Assets.at("_resources/iPhone-Step-3.JPG")),format.raw/*145.75*/("""" />
    								</div>
                                    <p><em></em>4) Name the Icon Visdom Referrals</p>
                                    <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="iPhone Step 4" height="20%" width="50%"
								            src=""""),_display_(/*150.27*/routes/*150.33*/.Assets.at("_resources/iPhone-Step-4.JPG")),format.raw/*150.75*/("""" />
    								</div>
                                     <p>Please note we have also emailed you these instructions in case you are rushed for time currently.  Now that you have this set up, all you need to do to send your first referral to Visdom is tap the icon on your home screen and begin earning referral fees.  The referrals you send will  receive a welcome message by email which outlines the              process of securing their financing quickly and easily through Visdom.  As they are working though the financing process, you will receive status emails periodically to keep you informed of each important event.</p>
                                      <p>Once again, welcome to Visdom and we look forward to helping you increase your income.</p>
                                    
                                </div>
                                </div>
                                <div ng-show="newItemType == 'Android'">
                                   <div class="WordSection1">
                                   
                                    <p><span style="font-size:medium;">Android</span></p>
            <p>To provide             a referral, all you need to do is go to Visdom's confidential referrals webpage, provide your name and email address (so we know to credit  you with the referral) and a little bit of information about the  client. </p>
            <p>To make this process quick and simple on your iPhone, please take a moment to do the following steps:</p>
            <p>1) Using your phone, click this weblink to open the Visdom Referrals Page in Safari.<a target="_blank" title="Visdom Referrals Page" href="https://dev-forms.visdom.ca/visdomreferralV">https://dev-forms.visdom.ca/visdomreferralV</a></p>
            <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="Android Step 1" height="20%" width="50%"
								            src=""""),_display_(/*166.27*/routes/*166.33*/.Assets.at("_resources/Android-Step-1.JPG")),format.raw/*166.76*/("""" />
    								</div>
            <p>2) At the bottom of the screen you'll see an icon depicting an arrow that  looks like it's trying to get away from a square. Tap this button and you'll have a few options.</p>
            <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="Android Step 2" height="20%" width="50%"
								            src=""""),_display_(/*171.27*/routes/*171.33*/.Assets.at("_resources/Android-Step-2.JPG")),format.raw/*171.76*/("""" />
    								</div>
            <p>3) Tap the "Add to Home Screen" button.  You'll  be asked to choose a name for the home screen icon. <em></em></p>
            <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="Android Step 3" height="20%" width="50%"
								            src=""""),_display_(/*176.27*/routes/*176.33*/.Assets.at("_resources/Android-Step-3.JPG")),format.raw/*176.76*/("""" />
    								</div>
            <p><em></em>4) Name the Icon Visdom Referrals</p>
            <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="Android Step 4" height="20%" width="50%"
								            src=""""),_display_(/*181.27*/routes/*181.33*/.Assets.at("_resources/Android-Step-4.JPG")),format.raw/*181.76*/("""" />
    								</div>
            <p>Please note we have also emailed you these instructions in case you are rushed for time currently.  Now that you have this set up, all you need to do to send your first referral to Visdom is tap the icon on your home screen and begin earning referral fees.  The referrals you send will  receive a welcome message by email which outlines the              process of securing their financing quickly and easily through Visdom.  As they are working though the financing process, you will receive status emails periodically to keep you informed of each important event.</p>
            <p>Once again, welcome to Visdom and we look forward to helping you increase your income.</p>
                               
                                
                                </div>
                                </div>
                                
                               <div ng-show="newItemType == 'Neither'">

                           <div class="WordSection1">
                                <p><span style="font-size:medium;">Neither<br /></span></p>
            <p>To provide             a referral, all you need to do is go to Visdom's confidential referrals webpage, provide your name and email address (so we know to credit  you with the referral) and a little bit of information about the  client. </p>
            <p>To make this process quick and simple on your Android phone, please take a moment to do the following steps:</p>
            <p>1) On your computer or tablet, click this weblink to open the Visdom Referrals Page. <a target="_blank" title="Visdom Referrals Page" href="https://dev-forms.visdom.ca/visdomreferralV">https://dev-forms.visdom.ca/visdomreferralV</a></p>
            <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="Email-Step-1a" height="30%" width="70%"
								            src=""""),_display_(/*199.27*/routes/*199.33*/.Assets.at("_resources/Email-Step-1a.JPG")),format.raw/*199.75*/("""" />
    								</div>
            
            <p>2) Press the bookmarks or favorites icon in your browser.</p>
            <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="Email Step 2A" height="30%" width="70%"
								            src=""""),_display_(/*205.27*/routes/*205.33*/.Assets.at("_resources/Email-Step-2A.JPG")),format.raw/*205.75*/("""" />
    								</div>
            <p><em></em>3) Name the bookmark Visdom Referrals and click OK to add it.</p>
            <p>4) When you need to submit a referral, open your bookmarks and click the Visdom Referrals bookmark you just created.</p>
            <p>Please note we have also emailed you these instructions in case you are rushed for time currently.  Now that you have this set up, all you need to do to send your first referral to Visdom is open your bookmarks and tap the Visdom Referrals bookmark.  The referrals you send will  receive a welcome message by email which outlines the              process of securing their financing quickly and easily through Visdom.  As they are working though the financing process, you will receive status emails periodically to keep you informed of each important event.</p>
            <p>Once again, welcome to Visdom and we look forward to helping you increase your income.</p>
                                    
                            </div>
                            </div> 
                                
                               
                                
                               
                              
                          

                       

                        
                           
                            
                            


                            



                               <br>

                                <div align="center">

                                  <!--   <input type="submit" class="btn btn-primary "                                 value="Submit" id="sig-submitBtn">
 -->
                                    <div align="center" id="submiterror">
                                        <font color="red"></font>
                                    </div>

                                </div>
 </div>



                                <div style="padding-bottom: 50px;"></div>
                            </div>
                            <div class="col-sm-3"></div>
                    </div>
                </div>
</form>


                <script src=""""),_display_(/*256.31*/routes/*256.37*/.Assets.at("_resources/signature_pad.js")),format.raw/*256.78*/(""""></script>
                <script src=""""),_display_(/*257.31*/routes/*257.37*/.Assets.at("_resources/app.js")),format.raw/*257.68*/(""""></script>

                <script>
                    $(document).ready(function() """),format.raw/*260.50*/("""{"""),format.raw/*260.51*/("""
                        """),format.raw/*261.25*/("""$('[data-toggle="tooltip"]').tooltip();
                    """),format.raw/*262.21*/("""}"""),format.raw/*262.22*/(""");
                </script>


                <script type="text/javascript">
                    var app = angular.module("demoApp", [ 'ui.bootstrap' ]);

                    app.controller('DemoController', function($scope) """),format.raw/*269.71*/("""{"""),format.raw/*269.72*/("""
                        """),format.raw/*270.25*/("""init();
                        function init() """),format.raw/*271.41*/("""{"""),format.raw/*271.42*/("""
                            """),format.raw/*272.29*/("""$scope.newItemType = '';
                            $scope.company = "";
                            $scope.change = function() """),format.raw/*274.56*/("""{"""),format.raw/*274.57*/("""
                                """),format.raw/*275.33*/("""console.log($scope.newItemType)
                            """),format.raw/*276.29*/("""}"""),format.raw/*276.30*/(""";
                        """),format.raw/*277.25*/("""}"""),format.raw/*277.26*/("""
                    """),format.raw/*278.21*/("""}"""),format.raw/*278.22*/(""");
                </script>

                <script src="https://code.jquery.com/jquery-2.1.0.min.js"></script>
                <script
                    src="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
                <!--<script src="https://code.angularjs.org/snapshot/angular.min.js"></script>-->
               
               <script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*289.56*/("""{"""),format.raw/*289.57*/("""
        """),format.raw/*290.9*/("""init();
        function init() """),format.raw/*291.25*/("""{"""),format.raw/*291.26*/("""
            """),format.raw/*292.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*294.41*/("""{"""),format.raw/*294.42*/("""
                """),format.raw/*295.17*/("""console.log($scope.newItemType)
            """),format.raw/*296.13*/("""}"""),format.raw/*296.14*/(""";
        """),format.raw/*297.9*/("""}"""),format.raw/*297.10*/("""
    """),format.raw/*298.5*/("""}"""),format.raw/*298.6*/(""");
    </script>
               
               
               
                <script>
                
                
                
                    (function() """),format.raw/*307.33*/("""{"""),format.raw/*307.34*/("""

                        """),format.raw/*309.25*/("""// Get a regular interval for drawing to the screen
                        window.requestAnimFrame = (function(callback) """),format.raw/*310.71*/("""{"""),format.raw/*310.72*/("""
                            """),format.raw/*311.29*/("""return window.requestAnimationFrame
                                    || window.webkitRequestAnimationFrame
                                    || window.mozRequestAnimationFrame
                                    || window.oRequestAnimationFrame
                                    || window.msRequestAnimaitonFrame
                                    || function(callback) """),format.raw/*316.59*/("""{"""),format.raw/*316.60*/("""
                                        """),format.raw/*317.41*/("""window.setTimeout(callback, 1000 / 60);
                                    """),format.raw/*318.37*/("""}"""),format.raw/*318.38*/(""";
                        """),format.raw/*319.25*/("""}"""),format.raw/*319.26*/(""")();

                        // Set up the canvas
                        var canvas = document.getElementById("sig-canvas");
                        var ctx = canvas.getContext("2d");
                        ctx.strokeStyle = "#222222";
                        ctx.lineWith = 2;

                        // Set up the UI
                        var sigText = document.getElementById("sig-dataUrl");
                        var sigImage = document.getElementById("sig-image");
                        var clearBtn = document.getElementById("sig-clearBtn");
                        var submitBtn = document
                                .getElementById("sig-submitBtn");
                        clearBtn
                                .addEventListener(
                                        "click",
                                        function(e) """),format.raw/*336.53*/("""{"""),format.raw/*336.54*/("""
                                            """),format.raw/*337.45*/("""clearCanvas();
                                            sigText.innerHTML = "Data URL for your signature will go here!";
                                            sigImage.setAttribute("src", "");
                                        """),format.raw/*340.41*/("""}"""),format.raw/*340.42*/(""", false);
                        submitBtn.addEventListener("click", function(e) """),format.raw/*341.73*/("""{"""),format.raw/*341.74*/("""
                            """),format.raw/*342.29*/("""var dataUrl = canvas.toDataURL();
                            sigText.innerHTML = dataUrl;
                            sigImage.setAttribute("src", dataUrl);
                        """),format.raw/*345.25*/("""}"""),format.raw/*345.26*/(""", false);

                        // Set up mouse events for drawing
                        var drawing = false;
                        var mousePos = """),format.raw/*349.40*/("""{"""),format.raw/*349.41*/("""
                            """),format.raw/*350.29*/("""x : 0,
                            y : 0
                        """),format.raw/*352.25*/("""}"""),format.raw/*352.26*/(""";
                        var lastPos = mousePos;
                        canvas.addEventListener("mousedown", function(e) """),format.raw/*354.74*/("""{"""),format.raw/*354.75*/("""
                            """),format.raw/*355.29*/("""drawing = true;
                            lastPos = getMousePos(canvas, e);
                        """),format.raw/*357.25*/("""}"""),format.raw/*357.26*/(""", false);
                        canvas.addEventListener("mouseup", function(e) """),format.raw/*358.72*/("""{"""),format.raw/*358.73*/("""
                            """),format.raw/*359.29*/("""drawing = false;
                        """),format.raw/*360.25*/("""}"""),format.raw/*360.26*/(""", false);
                        canvas.addEventListener("mousemove", function(e) """),format.raw/*361.74*/("""{"""),format.raw/*361.75*/("""
                            """),format.raw/*362.29*/("""mousePos = getMousePos(canvas, e);
                        """),format.raw/*363.25*/("""}"""),format.raw/*363.26*/(""", false);

                        // Set up touch events for mobile, etc
                        canvas.addEventListener("touchstart", function(e) """),format.raw/*366.75*/("""{"""),format.raw/*366.76*/("""
                            """),format.raw/*367.29*/("""mousePos = getTouchPos(canvas, e);
                            var touch = e.touches[0];
                            var mouseEvent = new MouseEvent("mousedown", """),format.raw/*369.74*/("""{"""),format.raw/*369.75*/("""
                                """),format.raw/*370.33*/("""clientX : touch.clientX,
                                clientY : touch.clientY
                            """),format.raw/*372.29*/("""}"""),format.raw/*372.30*/(""");
                            canvas.dispatchEvent(mouseEvent);
                        """),format.raw/*374.25*/("""}"""),format.raw/*374.26*/(""", false);
                        canvas.addEventListener("touchend", function(e) """),format.raw/*375.73*/("""{"""),format.raw/*375.74*/("""
                            """),format.raw/*376.29*/("""var mouseEvent = new MouseEvent("mouseup", """),format.raw/*376.72*/("""{"""),format.raw/*376.73*/("""}"""),format.raw/*376.74*/(""");
                            canvas.dispatchEvent(mouseEvent);
                        """),format.raw/*378.25*/("""}"""),format.raw/*378.26*/(""", false);
                        canvas.addEventListener("touchmove", function(e) """),format.raw/*379.74*/("""{"""),format.raw/*379.75*/("""
                            """),format.raw/*380.29*/("""var touch = e.touches[0];
                            var mouseEvent = new MouseEvent("mousemove", """),format.raw/*381.74*/("""{"""),format.raw/*381.75*/("""
                                """),format.raw/*382.33*/("""clientX : touch.clientX,
                                clientY : touch.clientY
                            """),format.raw/*384.29*/("""}"""),format.raw/*384.30*/(""");
                            canvas.dispatchEvent(mouseEvent);
                        """),format.raw/*386.25*/("""}"""),format.raw/*386.26*/(""", false);

                        // Prevent scrolling when touching the canvas
                        document.body.addEventListener("touchstart",
                                function(e) """),format.raw/*390.45*/("""{"""),format.raw/*390.46*/("""
                                    """),format.raw/*391.37*/("""if (e.target == canvas) """),format.raw/*391.61*/("""{"""),format.raw/*391.62*/("""
                                        """),format.raw/*392.41*/("""e.preventDefault();
                                    """),format.raw/*393.37*/("""}"""),format.raw/*393.38*/("""
                                """),format.raw/*394.33*/("""}"""),format.raw/*394.34*/(""", false);
                        document.body.addEventListener("touchend", function(e) """),format.raw/*395.80*/("""{"""),format.raw/*395.81*/("""
                            """),format.raw/*396.29*/("""if (e.target == canvas) """),format.raw/*396.53*/("""{"""),format.raw/*396.54*/("""
                                """),format.raw/*397.33*/("""e.preventDefault();
                            """),format.raw/*398.29*/("""}"""),format.raw/*398.30*/("""
                        """),format.raw/*399.25*/("""}"""),format.raw/*399.26*/(""", false);
                        document.body.addEventListener("touchmove",
                                function(e) """),format.raw/*401.45*/("""{"""),format.raw/*401.46*/("""
                                    """),format.raw/*402.37*/("""if (e.target == canvas) """),format.raw/*402.61*/("""{"""),format.raw/*402.62*/("""
                                        """),format.raw/*403.41*/("""e.preventDefault();
                                    """),format.raw/*404.37*/("""}"""),format.raw/*404.38*/("""
                                """),format.raw/*405.33*/("""}"""),format.raw/*405.34*/(""", false);

                        // Get the position of the mouse relative to the canvas
                        function getMousePos(canvasDom, mouseEvent) """),format.raw/*408.69*/("""{"""),format.raw/*408.70*/("""
                            """),format.raw/*409.29*/("""var rect = canvasDom.getBoundingClientRect();
                            return """),format.raw/*410.36*/("""{"""),format.raw/*410.37*/("""
                                """),format.raw/*411.33*/("""x : mouseEvent.clientX - rect.left,
                                y : mouseEvent.clientY - rect.top
                            """),format.raw/*413.29*/("""}"""),format.raw/*413.30*/(""";
                        """),format.raw/*414.25*/("""}"""),format.raw/*414.26*/("""

                        """),format.raw/*416.25*/("""// Get the position of a touch relative to the canvas
                        function getTouchPos(canvasDom, touchEvent) """),format.raw/*417.69*/("""{"""),format.raw/*417.70*/("""
                            """),format.raw/*418.29*/("""var rect = canvasDom.getBoundingClientRect();
                            return """),format.raw/*419.36*/("""{"""),format.raw/*419.37*/("""
                                """),format.raw/*420.33*/("""x : touchEvent.touches[0].clientX - rect.left,
                                y : touchEvent.touches[0].clientY - rect.top
                            """),format.raw/*422.29*/("""}"""),format.raw/*422.30*/(""";
                        """),format.raw/*423.25*/("""}"""),format.raw/*423.26*/("""

                        """),format.raw/*425.25*/("""// Draw to the canvas
                        function renderCanvas() """),format.raw/*426.49*/("""{"""),format.raw/*426.50*/("""
                            """),format.raw/*427.29*/("""if (drawing) """),format.raw/*427.42*/("""{"""),format.raw/*427.43*/("""
                                """),format.raw/*428.33*/("""ctx.moveTo(lastPos.x, lastPos.y);
                                ctx.lineTo(mousePos.x, mousePos.y);
                                ctx.stroke();
                                lastPos = mousePos;
                            """),format.raw/*432.29*/("""}"""),format.raw/*432.30*/("""
                        """),format.raw/*433.25*/("""}"""),format.raw/*433.26*/("""

                        """),format.raw/*435.25*/("""// Clear the canvas
                        function clearCanvas() """),format.raw/*436.48*/("""{"""),format.raw/*436.49*/("""
                            """),format.raw/*437.29*/("""canvas.width = canvas.width;
                        """),format.raw/*438.25*/("""}"""),format.raw/*438.26*/("""

                        """),format.raw/*440.25*/("""// Allow for animation
                        (function drawLoop() """),format.raw/*441.46*/("""{"""),format.raw/*441.47*/("""
                            """),format.raw/*442.29*/("""requestAnimFrame(drawLoop);
                            renderCanvas();
                        """),format.raw/*444.25*/("""}"""),format.raw/*444.26*/(""")();

                    """),format.raw/*446.21*/("""}"""),format.raw/*446.22*/(""")();
                </script>
                
                <script type="text/javascript">
                
                function validateForm() """),format.raw/*451.41*/("""{"""),format.raw/*451.42*/("""
                     
                     """),format.raw/*453.22*/("""var fname=document.forms["myForm"]["touchScreen"].value;
                     

                        if(!fname)"""),format.raw/*456.35*/("""{"""),format.raw/*456.36*/("""
                            """),format.raw/*457.29*/("""document.getElementById("touchScreen1").innerHTML="<p style=\"color:red\">Please Select which Device Using </p>";
                            document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

                            return false;
                        """),format.raw/*461.25*/("""}"""),format.raw/*461.26*/("""else"""),format.raw/*461.30*/("""{"""),format.raw/*461.31*/("""
                            """),format.raw/*462.29*/("""document.getElementById("touchScreen1").innerHTML="";

                        """),format.raw/*464.25*/("""}"""),format.raw/*464.26*/(""" 
                        """),format.raw/*465.25*/("""var lname=document.forms["myForm"]["agree"].value;
                         
                        if(!lname)"""),format.raw/*467.35*/("""{"""),format.raw/*467.36*/("""
                            
                            """),format.raw/*469.29*/("""document.getElementById("agree1").innerHTML="<p style=\"color:red\">Please agree the condtion</p>";
                            document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

                            return false;
                        """),format.raw/*473.25*/("""}"""),format.raw/*473.26*/("""
                            """),format.raw/*474.29*/("""else"""),format.raw/*474.33*/("""{"""),format.raw/*474.34*/("""
                                """),format.raw/*475.33*/("""document.getElementById("agree1").innerHTML="";

                            """),format.raw/*477.29*/("""}"""),format.raw/*477.30*/(""" 
                        
                        
                        
                        """),format.raw/*481.25*/("""var typedName=document.forms["myForm"]["typedName"].value;
                         
                        if(!typedName&&fname=='no')"""),format.raw/*483.52*/("""{"""),format.raw/*483.53*/("""
                            
                            """),format.raw/*485.29*/("""document.getElementById("typedName1").innerHTML="<p style=\"color:red\">Please enter the name</p>";
                            document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

                            return false;
                        """),format.raw/*489.25*/("""}"""),format.raw/*489.26*/("""
                            """),format.raw/*490.29*/("""else"""),format.raw/*490.33*/("""{"""),format.raw/*490.34*/("""
                                """),format.raw/*491.33*/("""document.getElementById("typedName1").innerHTML="";

                            """),format.raw/*493.29*/("""}"""),format.raw/*493.30*/(""" 
                        
                        
                        """),format.raw/*496.25*/("""var sign=document.forms["myForm"]["sign"].value;
                         
                        if(!sign&&fname=='yes')"""),format.raw/*498.48*/("""{"""),format.raw/*498.49*/("""
                            
                            """),format.raw/*500.29*/("""document.getElementById("sign1").innerHTML="<p style=\"color:red\">Please write elctonic sign</p>";
                            document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

                            return false;
                        """),format.raw/*504.25*/("""}"""),format.raw/*504.26*/("""
                            """),format.raw/*505.29*/("""else"""),format.raw/*505.33*/("""{"""),format.raw/*505.34*/("""
                                """),format.raw/*506.33*/("""document.getElementById("sign1").innerHTML="";

                            """),format.raw/*508.29*/("""}"""),format.raw/*508.30*/(""" 
                        
                """),format.raw/*510.17*/("""}"""),format.raw/*510.18*/("""
                
                """),format.raw/*512.17*/("""</script>
</body>
</html>"""))}
  }

  def render(role:String): play.twirl.api.HtmlFormat.Appendable = apply(role)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (role) => apply(role)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:25 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/visdomreferral31.scala.html
                  HASH: 56689d946e497ca65a861389fe65972270144d59
                  MATRIX: 734->1|836->15|863->16|1144->271|1158->277|1214->313|1361->433|1376->439|1436->478|1496->511|1511->517|1581->566|1734->692|1749->698|1814->742|1868->769|1883->775|1935->806|1989->833|2004->839|2066->880|2289->1076|2304->1082|2367->1124|2410->1140|2425->1146|2487->1187|2572->1245|2587->1251|2647->1290|2723->1339|2738->1345|2793->1379|2869->1428|2884->1434|2942->1471|3005->1507|3020->1513|3083->1555|3242->1687|3270->1688|3302->1693|3374->1738|3402->1739|3431->1741|3471->1753|3500->1754|3532->1759|3673->1873|3701->1874|3730->1876|3771->1889|3800->1890|3832->1895|3872->1908|3900->1909|3928->1910|4130->2085|4145->2091|4206->2131|6536->4432|6566->4433|6596->4434|6636->4445|6666->4446|6696->4447|7959->5682|7975->5688|8039->5730|8523->6186|8539->6192|8602->6233|9008->6611|9024->6617|9088->6659|9426->6969|9442->6975|9506->7017|11482->8965|11498->8971|11563->9014|11983->9406|11999->9412|12064->9455|12423->9786|12439->9792|12504->9835|12795->10098|12811->10104|12876->10147|14827->12070|14843->12076|14907->12118|15225->12408|15241->12414|15305->12456|17474->14597|17490->14603|17553->14644|17623->14686|17639->14692|17692->14723|17808->14810|17838->14811|17892->14836|17981->14896|18011->14897|18267->15124|18297->15125|18351->15150|18428->15198|18458->15199|18516->15228|18674->15357|18704->15358|18766->15391|18855->15451|18885->15452|18940->15478|18970->15479|19020->15500|19050->15501|19597->16019|19627->16020|19664->16029|19725->16061|19755->16062|19797->16075|19922->16171|19952->16172|19998->16189|20071->16233|20101->16234|20139->16244|20169->16245|20202->16250|20231->16251|20433->16424|20463->16425|20518->16451|20669->16573|20699->16574|20757->16603|21164->16981|21194->16982|21264->17023|21369->17099|21399->17100|21454->17126|21484->17127|22371->17985|22401->17986|22475->18031|22746->18273|22776->18274|22887->18356|22917->18357|22975->18386|23186->18568|23216->18569|23399->18723|23429->18724|23487->18753|23581->18818|23611->18819|23763->18942|23793->18943|23851->18972|23982->19074|24012->19075|24122->19156|24152->19157|24210->19186|24280->19227|24310->19228|24422->19311|24452->19312|24510->19341|24598->19400|24628->19401|24805->19549|24835->19550|24893->19579|25084->19741|25114->19742|25176->19775|25314->19884|25344->19885|25462->19974|25492->19975|25603->20057|25633->20058|25691->20087|25763->20130|25793->20131|25823->20132|25941->20221|25971->20222|26083->20305|26113->20306|26171->20335|26299->20434|26329->20435|26391->20468|26529->20577|26559->20578|26677->20667|26707->20668|26930->20862|26960->20863|27026->20900|27079->20924|27109->20925|27179->20966|27264->21022|27294->21023|27356->21056|27386->21057|27504->21146|27534->21147|27592->21176|27645->21200|27675->21201|27737->21234|27814->21282|27844->21283|27898->21308|27928->21309|28079->21431|28109->21432|28175->21469|28228->21493|28258->21494|28328->21535|28413->21591|28443->21592|28505->21625|28535->21626|28723->21785|28753->21786|28811->21815|28921->21896|28951->21897|29013->21930|29172->22060|29202->22061|29257->22087|29287->22088|29342->22114|29493->22236|29523->22237|29581->22266|29691->22347|29721->22348|29783->22381|29964->22533|29994->22534|30049->22560|30079->22561|30134->22587|30233->22657|30263->22658|30321->22687|30363->22700|30393->22701|30455->22734|30712->22962|30742->22963|30796->22988|30826->22989|30881->23015|30977->23082|31007->23083|31065->23112|31147->23165|31177->23166|31232->23192|31329->23260|31359->23261|31417->23290|31542->23386|31572->23387|31627->23413|31657->23414|31839->23567|31869->23568|31942->23612|32085->23726|32115->23727|32173->23756|32555->24109|32585->24110|32618->24114|32648->24115|32706->24144|32814->24223|32844->24224|32899->24250|33039->24361|33069->24362|33156->24420|33524->24759|33554->24760|33612->24789|33645->24793|33675->24794|33737->24827|33843->24904|33873->24905|34003->25006|34168->25142|34198->25143|34285->25201|34653->25540|34683->25541|34741->25570|34774->25574|34804->25575|34866->25608|34976->25689|35006->25690|35111->25766|35262->25888|35292->25889|35379->25947|35747->26286|35777->26287|35835->26316|35868->26320|35898->26321|35960->26354|36065->26430|36095->26431|36167->26474|36197->26475|36260->26509
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|39->11|39->11|39->11|42->14|42->14|42->14|46->18|46->18|46->18|48->20|48->20|48->20|50->22|50->22|50->22|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|62->34|62->34|62->34|68->40|68->40|69->41|71->43|71->43|73->45|73->45|73->45|74->46|79->51|79->51|81->53|81->53|81->53|82->54|83->55|83->55|84->56|91->63|91->63|91->63|149->121|149->121|149->121|149->121|149->121|149->121|162->134|162->134|162->134|168->140|168->140|168->140|173->145|173->145|173->145|178->150|178->150|178->150|194->166|194->166|194->166|199->171|199->171|199->171|204->176|204->176|204->176|209->181|209->181|209->181|227->199|227->199|227->199|233->205|233->205|233->205|284->256|284->256|284->256|285->257|285->257|285->257|288->260|288->260|289->261|290->262|290->262|297->269|297->269|298->270|299->271|299->271|300->272|302->274|302->274|303->275|304->276|304->276|305->277|305->277|306->278|306->278|317->289|317->289|318->290|319->291|319->291|320->292|322->294|322->294|323->295|324->296|324->296|325->297|325->297|326->298|326->298|335->307|335->307|337->309|338->310|338->310|339->311|344->316|344->316|345->317|346->318|346->318|347->319|347->319|364->336|364->336|365->337|368->340|368->340|369->341|369->341|370->342|373->345|373->345|377->349|377->349|378->350|380->352|380->352|382->354|382->354|383->355|385->357|385->357|386->358|386->358|387->359|388->360|388->360|389->361|389->361|390->362|391->363|391->363|394->366|394->366|395->367|397->369|397->369|398->370|400->372|400->372|402->374|402->374|403->375|403->375|404->376|404->376|404->376|404->376|406->378|406->378|407->379|407->379|408->380|409->381|409->381|410->382|412->384|412->384|414->386|414->386|418->390|418->390|419->391|419->391|419->391|420->392|421->393|421->393|422->394|422->394|423->395|423->395|424->396|424->396|424->396|425->397|426->398|426->398|427->399|427->399|429->401|429->401|430->402|430->402|430->402|431->403|432->404|432->404|433->405|433->405|436->408|436->408|437->409|438->410|438->410|439->411|441->413|441->413|442->414|442->414|444->416|445->417|445->417|446->418|447->419|447->419|448->420|450->422|450->422|451->423|451->423|453->425|454->426|454->426|455->427|455->427|455->427|456->428|460->432|460->432|461->433|461->433|463->435|464->436|464->436|465->437|466->438|466->438|468->440|469->441|469->441|470->442|472->444|472->444|474->446|474->446|479->451|479->451|481->453|484->456|484->456|485->457|489->461|489->461|489->461|489->461|490->462|492->464|492->464|493->465|495->467|495->467|497->469|501->473|501->473|502->474|502->474|502->474|503->475|505->477|505->477|509->481|511->483|511->483|513->485|517->489|517->489|518->490|518->490|518->490|519->491|521->493|521->493|524->496|526->498|526->498|528->500|532->504|532->504|533->505|533->505|533->505|534->506|536->508|536->508|538->510|538->510|540->512
                  -- GENERATED --
              */
          