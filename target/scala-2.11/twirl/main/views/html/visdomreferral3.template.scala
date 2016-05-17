
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
object visdomreferral3 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
                                    <p>1) Using your phone, click this weblink to open the Visdom Referrals Page in Safari.<a target="_blank" title="Visdom Referrals Page" href="https://forms.visdom.ca/clientrefV">https://forms.visdom.ca/clientrefV</a></p><br>
                                  
                                    <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="iPhone Step 1" height="70%" width="30%"
								            src=""""),_display_(/*134.27*/routes/*134.33*/.Assets.at("_resources/iPhone-Step-1.JPG")),format.raw/*134.75*/("""" />
    								</div>
    								<br>
                                    <p>2) At the bottom of the screen you'll see an icon depicting an arrow that  looks like it's trying to get away from a square. Tap this button and you'll have a few options.</p>
                                    <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="iPhone Step-2" height="70%" width="30%"
								            src=""""),_display_(/*140.27*/routes/*140.33*/.Assets.at("_resources/iPhoneStep-2.JPG")),format.raw/*140.74*/("""" />
    								</div>
                                    <p>3) Tap the "Add to Home Screen" button.  You'll  be asked to choose a name for the home screen icon. <em></em></p>
                                    <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="iPhone Step-3" height="70%" width="30"
								            src=""""),_display_(/*145.27*/routes/*145.33*/.Assets.at("_resources/iPhone-Step-3.JPG")),format.raw/*145.75*/("""" />
    								</div>
                                    <p><em></em>4) Name the Icon Visdom Referrals</p>
                                    <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="iPhone Step 4" height="70%" width="30%"
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
            <p>1) Using your phone, click this weblink to open the Visdom Referrals Page in Safari.<a target="_blank" title="Visdom Referrals Page" href="https://forms.visdom.ca/clientrefV">https://forms.visdom.ca/clientrefV</a></p>
            <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="Android Step 1" height="70%" width="30%"
								            src=""""),_display_(/*166.27*/routes/*166.33*/.Assets.at("_resources/Android-Step-1.JPG")),format.raw/*166.76*/("""" />
    								</div>
            <p>2) At the bottom of the screen you'll see an icon depicting an arrow that  looks like it's trying to get away from a square. Tap this button and you'll have a few options.</p>
            <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="Android Step 2" height="70%" width="30%"
								            src=""""),_display_(/*171.27*/routes/*171.33*/.Assets.at("_resources/Android-Step-2.JPG")),format.raw/*171.76*/("""" />
    								</div>
            <p>3) Tap the "Add to Home Screen" button.  You'll  be asked to choose a name for the home screen icon. <em></em></p>
            <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="Android Step 3" height="70%" width="30%"
								            src=""""),_display_(/*176.27*/routes/*176.33*/.Assets.at("_resources/Android-Step-3.JPG")),format.raw/*176.76*/("""" />
    								</div>
            <p><em></em>4) Name the Icon Visdom Referrals</p>
            <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="Android Step 4" height="70%" width="30%"
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
            <p>1) On your computer or tablet, click this weblink to open the Visdom Referrals Page. <a target="_blank" title="Visdom Referrals Page" href="https://forms.visdom.ca/clientrefV">https://forms.visdom.ca/clientrefV</a></p>
            <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="Email-Step-1a" height="70%" width="30%"
								            src=""""),_display_(/*199.27*/routes/*199.33*/.Assets.at("_resources/Email-Step-1a.JPG")),format.raw/*199.75*/("""" />
    								</div>
            
            <p>2) Press the bookmarks or favorites icon in your browser.</p>
            <div style="padding-bottom: 10px; margin-top: 10px; padding-left: 10%">
        								<img alt="Email Step 2A" height="70%" width="30%"
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
                  DATE: Mon May 16 20:16:16 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/visdomreferral3.scala.html
                  HASH: 7d51e0c226c19974f333d2d14b41c94e96726e90
                  MATRIX: 733->1|835->15|862->16|1143->271|1157->277|1213->313|1360->433|1375->439|1435->478|1495->511|1510->517|1580->566|1733->692|1748->698|1813->742|1867->769|1882->775|1934->806|1988->833|2003->839|2065->880|2288->1076|2303->1082|2366->1124|2409->1140|2424->1146|2486->1187|2571->1245|2586->1251|2646->1290|2722->1339|2737->1345|2792->1379|2868->1428|2883->1434|2941->1471|3004->1507|3019->1513|3082->1555|3241->1687|3269->1688|3301->1693|3373->1738|3401->1739|3430->1741|3470->1753|3499->1754|3531->1759|3672->1873|3700->1874|3729->1876|3770->1889|3799->1890|3831->1895|3871->1908|3899->1909|3927->1910|4129->2085|4144->2091|4205->2131|6535->4432|6565->4433|6595->4434|6635->4445|6665->4446|6695->4447|7940->5664|7956->5670|8020->5712|8504->6168|8520->6174|8583->6215|8988->6592|9004->6598|9068->6640|9406->6950|9422->6956|9486->6998|11444->8928|11460->8934|11525->8977|11945->9369|11961->9375|12026->9418|12385->9749|12401->9755|12466->9798|12757->10061|12773->10067|12838->10110|14771->12015|14787->12021|14851->12063|15169->12353|15185->12359|15249->12401|17418->14542|17434->14548|17497->14589|17567->14631|17583->14637|17636->14668|17752->14755|17782->14756|17836->14781|17925->14841|17955->14842|18211->15069|18241->15070|18295->15095|18372->15143|18402->15144|18460->15173|18618->15302|18648->15303|18710->15336|18799->15396|18829->15397|18884->15423|18914->15424|18964->15445|18994->15446|19541->15964|19571->15965|19608->15974|19669->16006|19699->16007|19741->16020|19866->16116|19896->16117|19942->16134|20015->16178|20045->16179|20083->16189|20113->16190|20146->16195|20175->16196|20377->16369|20407->16370|20462->16396|20613->16518|20643->16519|20701->16548|21108->16926|21138->16927|21208->16968|21313->17044|21343->17045|21398->17071|21428->17072|22315->17930|22345->17931|22419->17976|22690->18218|22720->18219|22831->18301|22861->18302|22919->18331|23130->18513|23160->18514|23343->18668|23373->18669|23431->18698|23525->18763|23555->18764|23707->18887|23737->18888|23795->18917|23926->19019|23956->19020|24066->19101|24096->19102|24154->19131|24224->19172|24254->19173|24366->19256|24396->19257|24454->19286|24542->19345|24572->19346|24749->19494|24779->19495|24837->19524|25028->19686|25058->19687|25120->19720|25258->19829|25288->19830|25406->19919|25436->19920|25547->20002|25577->20003|25635->20032|25707->20075|25737->20076|25767->20077|25885->20166|25915->20167|26027->20250|26057->20251|26115->20280|26243->20379|26273->20380|26335->20413|26473->20522|26503->20523|26621->20612|26651->20613|26874->20807|26904->20808|26970->20845|27023->20869|27053->20870|27123->20911|27208->20967|27238->20968|27300->21001|27330->21002|27448->21091|27478->21092|27536->21121|27589->21145|27619->21146|27681->21179|27758->21227|27788->21228|27842->21253|27872->21254|28023->21376|28053->21377|28119->21414|28172->21438|28202->21439|28272->21480|28357->21536|28387->21537|28449->21570|28479->21571|28667->21730|28697->21731|28755->21760|28865->21841|28895->21842|28957->21875|29116->22005|29146->22006|29201->22032|29231->22033|29286->22059|29437->22181|29467->22182|29525->22211|29635->22292|29665->22293|29727->22326|29908->22478|29938->22479|29993->22505|30023->22506|30078->22532|30177->22602|30207->22603|30265->22632|30307->22645|30337->22646|30399->22679|30656->22907|30686->22908|30740->22933|30770->22934|30825->22960|30921->23027|30951->23028|31009->23057|31091->23110|31121->23111|31176->23137|31273->23205|31303->23206|31361->23235|31486->23331|31516->23332|31571->23358|31601->23359|31783->23512|31813->23513|31886->23557|32029->23671|32059->23672|32117->23701|32499->24054|32529->24055|32562->24059|32592->24060|32650->24089|32758->24168|32788->24169|32843->24195|32983->24306|33013->24307|33100->24365|33468->24704|33498->24705|33556->24734|33589->24738|33619->24739|33681->24772|33787->24849|33817->24850|33947->24951|34112->25087|34142->25088|34229->25146|34597->25485|34627->25486|34685->25515|34718->25519|34748->25520|34810->25553|34920->25634|34950->25635|35055->25711|35206->25833|35236->25834|35323->25892|35691->26231|35721->26232|35779->26261|35812->26265|35842->26266|35904->26299|36009->26375|36039->26376|36111->26419|36141->26420|36204->26454
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|39->11|39->11|39->11|42->14|42->14|42->14|46->18|46->18|46->18|48->20|48->20|48->20|50->22|50->22|50->22|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|62->34|62->34|62->34|68->40|68->40|69->41|71->43|71->43|73->45|73->45|73->45|74->46|79->51|79->51|81->53|81->53|81->53|82->54|83->55|83->55|84->56|91->63|91->63|91->63|149->121|149->121|149->121|149->121|149->121|149->121|162->134|162->134|162->134|168->140|168->140|168->140|173->145|173->145|173->145|178->150|178->150|178->150|194->166|194->166|194->166|199->171|199->171|199->171|204->176|204->176|204->176|209->181|209->181|209->181|227->199|227->199|227->199|233->205|233->205|233->205|284->256|284->256|284->256|285->257|285->257|285->257|288->260|288->260|289->261|290->262|290->262|297->269|297->269|298->270|299->271|299->271|300->272|302->274|302->274|303->275|304->276|304->276|305->277|305->277|306->278|306->278|317->289|317->289|318->290|319->291|319->291|320->292|322->294|322->294|323->295|324->296|324->296|325->297|325->297|326->298|326->298|335->307|335->307|337->309|338->310|338->310|339->311|344->316|344->316|345->317|346->318|346->318|347->319|347->319|364->336|364->336|365->337|368->340|368->340|369->341|369->341|370->342|373->345|373->345|377->349|377->349|378->350|380->352|380->352|382->354|382->354|383->355|385->357|385->357|386->358|386->358|387->359|388->360|388->360|389->361|389->361|390->362|391->363|391->363|394->366|394->366|395->367|397->369|397->369|398->370|400->372|400->372|402->374|402->374|403->375|403->375|404->376|404->376|404->376|404->376|406->378|406->378|407->379|407->379|408->380|409->381|409->381|410->382|412->384|412->384|414->386|414->386|418->390|418->390|419->391|419->391|419->391|420->392|421->393|421->393|422->394|422->394|423->395|423->395|424->396|424->396|424->396|425->397|426->398|426->398|427->399|427->399|429->401|429->401|430->402|430->402|430->402|431->403|432->404|432->404|433->405|433->405|436->408|436->408|437->409|438->410|438->410|439->411|441->413|441->413|442->414|442->414|444->416|445->417|445->417|446->418|447->419|447->419|448->420|450->422|450->422|451->423|451->423|453->425|454->426|454->426|455->427|455->427|455->427|456->428|460->432|460->432|461->433|461->433|463->435|464->436|464->436|465->437|466->438|466->438|468->440|469->441|469->441|470->442|472->444|472->444|474->446|474->446|479->451|479->451|481->453|484->456|484->456|485->457|489->461|489->461|489->461|489->461|490->462|492->464|492->464|493->465|495->467|495->467|497->469|501->473|501->473|502->474|502->474|502->474|503->475|505->477|505->477|509->481|511->483|511->483|513->485|517->489|517->489|518->490|518->490|518->490|519->491|521->493|521->493|524->496|526->498|526->498|528->500|532->504|532->504|533->505|533->505|533->505|534->506|536->508|536->508|538->510|538->510|540->512
                  -- GENERATED --
              */
          