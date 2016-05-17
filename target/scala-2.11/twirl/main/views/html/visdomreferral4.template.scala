
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
object visdomreferral4 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
                                    <p>1) Using your phone, click this weblink to open the Visdom Referrals Page in Safari.<a target="_blank" title="Visdom Referrals Page" href="https://dev-forms.visdom.ca/visdomreferralV">https://dev-forms.visdom.ca/visdomreferralV</a></p>
                                    <p>2) At the bottom of the screen you'll see an icon depicting an arrow that  looks like it's trying to get away from a square. Tap this button and you'll have a few options.</p>
                                    <p>3) Tap the "Add to Home Screen" button.  You'll  be asked to choose a name for the home screen icon. <em></em></p>
                                    <p><em></em>4) Name the Icon Visdom Referrals</p>
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
            <p>2) At the bottom of the screen you'll see an icon depicting an arrow that  looks like it's trying to get away from a square. Tap this button and you'll have a few options.</p>
            <p>3) Tap the "Add to Home Screen" button.  You'll  be asked to choose a name for the home screen icon. <em></em></p>
            <p><em></em>4) Name the Icon Visdom Referrals</p>
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
            <p>2) Press the bookmarks or favorites icon in your browser.</p>
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


                <script src=""""),_display_(/*215.31*/routes/*215.37*/.Assets.at("_resources/signature_pad.js")),format.raw/*215.78*/(""""></script>
                <script src=""""),_display_(/*216.31*/routes/*216.37*/.Assets.at("_resources/app.js")),format.raw/*216.68*/(""""></script>

                <script>
                    $(document).ready(function() """),format.raw/*219.50*/("""{"""),format.raw/*219.51*/("""
                        """),format.raw/*220.25*/("""$('[data-toggle="tooltip"]').tooltip();
                    """),format.raw/*221.21*/("""}"""),format.raw/*221.22*/(""");
                </script>


                <script type="text/javascript">
                    var app = angular.module("demoApp", [ 'ui.bootstrap' ]);

                    app.controller('DemoController', function($scope) """),format.raw/*228.71*/("""{"""),format.raw/*228.72*/("""
                        """),format.raw/*229.25*/("""init();
                        function init() """),format.raw/*230.41*/("""{"""),format.raw/*230.42*/("""
                            """),format.raw/*231.29*/("""$scope.newItemType = '';
                            $scope.company = "";
                            $scope.change = function() """),format.raw/*233.56*/("""{"""),format.raw/*233.57*/("""
                                """),format.raw/*234.33*/("""console.log($scope.newItemType)
                            """),format.raw/*235.29*/("""}"""),format.raw/*235.30*/(""";
                        """),format.raw/*236.25*/("""}"""),format.raw/*236.26*/("""
                    """),format.raw/*237.21*/("""}"""),format.raw/*237.22*/(""");
                </script>

                <script src="https://code.jquery.com/jquery-2.1.0.min.js"></script>
                <script
                    src="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
                <!--<script src="https://code.angularjs.org/snapshot/angular.min.js"></script>-->
               
               <script type="text/javascript">
    var app = angular.module("demoApp", ['ui.bootstrap']);

    app.controller('DemoController', function ($scope) """),format.raw/*248.56*/("""{"""),format.raw/*248.57*/("""
        """),format.raw/*249.9*/("""init();
        function init() """),format.raw/*250.25*/("""{"""),format.raw/*250.26*/("""
            """),format.raw/*251.13*/("""$scope.newItemType = '';
            $scope.company="";
            $scope.change = function () """),format.raw/*253.41*/("""{"""),format.raw/*253.42*/("""
                """),format.raw/*254.17*/("""console.log($scope.newItemType)
            """),format.raw/*255.13*/("""}"""),format.raw/*255.14*/(""";
        """),format.raw/*256.9*/("""}"""),format.raw/*256.10*/("""
    """),format.raw/*257.5*/("""}"""),format.raw/*257.6*/(""");
    </script>
               
               
               
                <script>
                
                
                
                    (function() """),format.raw/*266.33*/("""{"""),format.raw/*266.34*/("""

                        """),format.raw/*268.25*/("""// Get a regular interval for drawing to the screen
                        window.requestAnimFrame = (function(callback) """),format.raw/*269.71*/("""{"""),format.raw/*269.72*/("""
                            """),format.raw/*270.29*/("""return window.requestAnimationFrame
                                    || window.webkitRequestAnimationFrame
                                    || window.mozRequestAnimationFrame
                                    || window.oRequestAnimationFrame
                                    || window.msRequestAnimaitonFrame
                                    || function(callback) """),format.raw/*275.59*/("""{"""),format.raw/*275.60*/("""
                                        """),format.raw/*276.41*/("""window.setTimeout(callback, 1000 / 60);
                                    """),format.raw/*277.37*/("""}"""),format.raw/*277.38*/(""";
                        """),format.raw/*278.25*/("""}"""),format.raw/*278.26*/(""")();

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
                                        function(e) """),format.raw/*295.53*/("""{"""),format.raw/*295.54*/("""
                                            """),format.raw/*296.45*/("""clearCanvas();
                                            sigText.innerHTML = "Data URL for your signature will go here!";
                                            sigImage.setAttribute("src", "");
                                        """),format.raw/*299.41*/("""}"""),format.raw/*299.42*/(""", false);
                        submitBtn.addEventListener("click", function(e) """),format.raw/*300.73*/("""{"""),format.raw/*300.74*/("""
                            """),format.raw/*301.29*/("""var dataUrl = canvas.toDataURL();
                            sigText.innerHTML = dataUrl;
                            sigImage.setAttribute("src", dataUrl);
                        """),format.raw/*304.25*/("""}"""),format.raw/*304.26*/(""", false);

                        // Set up mouse events for drawing
                        var drawing = false;
                        var mousePos = """),format.raw/*308.40*/("""{"""),format.raw/*308.41*/("""
                            """),format.raw/*309.29*/("""x : 0,
                            y : 0
                        """),format.raw/*311.25*/("""}"""),format.raw/*311.26*/(""";
                        var lastPos = mousePos;
                        canvas.addEventListener("mousedown", function(e) """),format.raw/*313.74*/("""{"""),format.raw/*313.75*/("""
                            """),format.raw/*314.29*/("""drawing = true;
                            lastPos = getMousePos(canvas, e);
                        """),format.raw/*316.25*/("""}"""),format.raw/*316.26*/(""", false);
                        canvas.addEventListener("mouseup", function(e) """),format.raw/*317.72*/("""{"""),format.raw/*317.73*/("""
                            """),format.raw/*318.29*/("""drawing = false;
                        """),format.raw/*319.25*/("""}"""),format.raw/*319.26*/(""", false);
                        canvas.addEventListener("mousemove", function(e) """),format.raw/*320.74*/("""{"""),format.raw/*320.75*/("""
                            """),format.raw/*321.29*/("""mousePos = getMousePos(canvas, e);
                        """),format.raw/*322.25*/("""}"""),format.raw/*322.26*/(""", false);

                        // Set up touch events for mobile, etc
                        canvas.addEventListener("touchstart", function(e) """),format.raw/*325.75*/("""{"""),format.raw/*325.76*/("""
                            """),format.raw/*326.29*/("""mousePos = getTouchPos(canvas, e);
                            var touch = e.touches[0];
                            var mouseEvent = new MouseEvent("mousedown", """),format.raw/*328.74*/("""{"""),format.raw/*328.75*/("""
                                """),format.raw/*329.33*/("""clientX : touch.clientX,
                                clientY : touch.clientY
                            """),format.raw/*331.29*/("""}"""),format.raw/*331.30*/(""");
                            canvas.dispatchEvent(mouseEvent);
                        """),format.raw/*333.25*/("""}"""),format.raw/*333.26*/(""", false);
                        canvas.addEventListener("touchend", function(e) """),format.raw/*334.73*/("""{"""),format.raw/*334.74*/("""
                            """),format.raw/*335.29*/("""var mouseEvent = new MouseEvent("mouseup", """),format.raw/*335.72*/("""{"""),format.raw/*335.73*/("""}"""),format.raw/*335.74*/(""");
                            canvas.dispatchEvent(mouseEvent);
                        """),format.raw/*337.25*/("""}"""),format.raw/*337.26*/(""", false);
                        canvas.addEventListener("touchmove", function(e) """),format.raw/*338.74*/("""{"""),format.raw/*338.75*/("""
                            """),format.raw/*339.29*/("""var touch = e.touches[0];
                            var mouseEvent = new MouseEvent("mousemove", """),format.raw/*340.74*/("""{"""),format.raw/*340.75*/("""
                                """),format.raw/*341.33*/("""clientX : touch.clientX,
                                clientY : touch.clientY
                            """),format.raw/*343.29*/("""}"""),format.raw/*343.30*/(""");
                            canvas.dispatchEvent(mouseEvent);
                        """),format.raw/*345.25*/("""}"""),format.raw/*345.26*/(""", false);

                        // Prevent scrolling when touching the canvas
                        document.body.addEventListener("touchstart",
                                function(e) """),format.raw/*349.45*/("""{"""),format.raw/*349.46*/("""
                                    """),format.raw/*350.37*/("""if (e.target == canvas) """),format.raw/*350.61*/("""{"""),format.raw/*350.62*/("""
                                        """),format.raw/*351.41*/("""e.preventDefault();
                                    """),format.raw/*352.37*/("""}"""),format.raw/*352.38*/("""
                                """),format.raw/*353.33*/("""}"""),format.raw/*353.34*/(""", false);
                        document.body.addEventListener("touchend", function(e) """),format.raw/*354.80*/("""{"""),format.raw/*354.81*/("""
                            """),format.raw/*355.29*/("""if (e.target == canvas) """),format.raw/*355.53*/("""{"""),format.raw/*355.54*/("""
                                """),format.raw/*356.33*/("""e.preventDefault();
                            """),format.raw/*357.29*/("""}"""),format.raw/*357.30*/("""
                        """),format.raw/*358.25*/("""}"""),format.raw/*358.26*/(""", false);
                        document.body.addEventListener("touchmove",
                                function(e) """),format.raw/*360.45*/("""{"""),format.raw/*360.46*/("""
                                    """),format.raw/*361.37*/("""if (e.target == canvas) """),format.raw/*361.61*/("""{"""),format.raw/*361.62*/("""
                                        """),format.raw/*362.41*/("""e.preventDefault();
                                    """),format.raw/*363.37*/("""}"""),format.raw/*363.38*/("""
                                """),format.raw/*364.33*/("""}"""),format.raw/*364.34*/(""", false);

                        // Get the position of the mouse relative to the canvas
                        function getMousePos(canvasDom, mouseEvent) """),format.raw/*367.69*/("""{"""),format.raw/*367.70*/("""
                            """),format.raw/*368.29*/("""var rect = canvasDom.getBoundingClientRect();
                            return """),format.raw/*369.36*/("""{"""),format.raw/*369.37*/("""
                                """),format.raw/*370.33*/("""x : mouseEvent.clientX - rect.left,
                                y : mouseEvent.clientY - rect.top
                            """),format.raw/*372.29*/("""}"""),format.raw/*372.30*/(""";
                        """),format.raw/*373.25*/("""}"""),format.raw/*373.26*/("""

                        """),format.raw/*375.25*/("""// Get the position of a touch relative to the canvas
                        function getTouchPos(canvasDom, touchEvent) """),format.raw/*376.69*/("""{"""),format.raw/*376.70*/("""
                            """),format.raw/*377.29*/("""var rect = canvasDom.getBoundingClientRect();
                            return """),format.raw/*378.36*/("""{"""),format.raw/*378.37*/("""
                                """),format.raw/*379.33*/("""x : touchEvent.touches[0].clientX - rect.left,
                                y : touchEvent.touches[0].clientY - rect.top
                            """),format.raw/*381.29*/("""}"""),format.raw/*381.30*/(""";
                        """),format.raw/*382.25*/("""}"""),format.raw/*382.26*/("""

                        """),format.raw/*384.25*/("""// Draw to the canvas
                        function renderCanvas() """),format.raw/*385.49*/("""{"""),format.raw/*385.50*/("""
                            """),format.raw/*386.29*/("""if (drawing) """),format.raw/*386.42*/("""{"""),format.raw/*386.43*/("""
                                """),format.raw/*387.33*/("""ctx.moveTo(lastPos.x, lastPos.y);
                                ctx.lineTo(mousePos.x, mousePos.y);
                                ctx.stroke();
                                lastPos = mousePos;
                            """),format.raw/*391.29*/("""}"""),format.raw/*391.30*/("""
                        """),format.raw/*392.25*/("""}"""),format.raw/*392.26*/("""

                        """),format.raw/*394.25*/("""// Clear the canvas
                        function clearCanvas() """),format.raw/*395.48*/("""{"""),format.raw/*395.49*/("""
                            """),format.raw/*396.29*/("""canvas.width = canvas.width;
                        """),format.raw/*397.25*/("""}"""),format.raw/*397.26*/("""

                        """),format.raw/*399.25*/("""// Allow for animation
                        (function drawLoop() """),format.raw/*400.46*/("""{"""),format.raw/*400.47*/("""
                            """),format.raw/*401.29*/("""requestAnimFrame(drawLoop);
                            renderCanvas();
                        """),format.raw/*403.25*/("""}"""),format.raw/*403.26*/(""")();

                    """),format.raw/*405.21*/("""}"""),format.raw/*405.22*/(""")();
                </script>
                
                <script type="text/javascript">
                
                function validateForm() """),format.raw/*410.41*/("""{"""),format.raw/*410.42*/("""
                     
                     """),format.raw/*412.22*/("""var fname=document.forms["myForm"]["touchScreen"].value;
                     

                        if(!fname)"""),format.raw/*415.35*/("""{"""),format.raw/*415.36*/("""
                            """),format.raw/*416.29*/("""document.getElementById("touchScreen1").innerHTML="<p style=\"color:red\">Please Select which Device Using </p>";
                            document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

                            return false;
                        """),format.raw/*420.25*/("""}"""),format.raw/*420.26*/("""else"""),format.raw/*420.30*/("""{"""),format.raw/*420.31*/("""
                            """),format.raw/*421.29*/("""document.getElementById("touchScreen1").innerHTML="";

                        """),format.raw/*423.25*/("""}"""),format.raw/*423.26*/(""" 
                        """),format.raw/*424.25*/("""var lname=document.forms["myForm"]["agree"].value;
                         
                        if(!lname)"""),format.raw/*426.35*/("""{"""),format.raw/*426.36*/("""
                            
                            """),format.raw/*428.29*/("""document.getElementById("agree1").innerHTML="<p style=\"color:red\">Please agree the condtion</p>";
                            document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

                            return false;
                        """),format.raw/*432.25*/("""}"""),format.raw/*432.26*/("""
                            """),format.raw/*433.29*/("""else"""),format.raw/*433.33*/("""{"""),format.raw/*433.34*/("""
                                """),format.raw/*434.33*/("""document.getElementById("agree1").innerHTML="";

                            """),format.raw/*436.29*/("""}"""),format.raw/*436.30*/(""" 
                        
                        
                        
                        """),format.raw/*440.25*/("""var typedName=document.forms["myForm"]["typedName"].value;
                         
                        if(!typedName&&fname=='no')"""),format.raw/*442.52*/("""{"""),format.raw/*442.53*/("""
                            
                            """),format.raw/*444.29*/("""document.getElementById("typedName1").innerHTML="<p style=\"color:red\">Please enter the name</p>";
                            document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

                            return false;
                        """),format.raw/*448.25*/("""}"""),format.raw/*448.26*/("""
                            """),format.raw/*449.29*/("""else"""),format.raw/*449.33*/("""{"""),format.raw/*449.34*/("""
                                """),format.raw/*450.33*/("""document.getElementById("typedName1").innerHTML="";

                            """),format.raw/*452.29*/("""}"""),format.raw/*452.30*/(""" 
                        
                        
                        """),format.raw/*455.25*/("""var sign=document.forms["myForm"]["sign"].value;
                         
                        if(!sign&&fname=='yes')"""),format.raw/*457.48*/("""{"""),format.raw/*457.49*/("""
                            
                            """),format.raw/*459.29*/("""document.getElementById("sign1").innerHTML="<p style=\"color:red\">Please write elctonic sign</p>";
                            document.getElementById("submiterror").innerHTML="<p style=\"color:red\">There are errors on the form. Please fix them before continuing.</p>";

                            return false;
                        """),format.raw/*463.25*/("""}"""),format.raw/*463.26*/("""
                            """),format.raw/*464.29*/("""else"""),format.raw/*464.33*/("""{"""),format.raw/*464.34*/("""
                                """),format.raw/*465.33*/("""document.getElementById("sign1").innerHTML="";

                            """),format.raw/*467.29*/("""}"""),format.raw/*467.30*/(""" 
                        
                """),format.raw/*469.17*/("""}"""),format.raw/*469.18*/("""
                
                """),format.raw/*471.17*/("""</script>
</body>
</html>"""))}
  }

  def render(role:String): play.twirl.api.HtmlFormat.Appendable = apply(role)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (role) => apply(role)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 16 20:16:27 IST 2016
                  SOURCE: /home/manoj/projects/Testing/formsPlayApp/app/views/visdomreferral4.scala.html
                  HASH: 1279a42bdfa1d736cb4004e8834136b050113476
                  MATRIX: 733->1|835->15|862->16|1143->271|1157->277|1213->313|1360->433|1375->439|1435->478|1495->511|1510->517|1580->566|1733->692|1748->698|1813->742|1867->769|1882->775|1934->806|1988->833|2003->839|2065->880|2288->1076|2303->1082|2366->1124|2409->1140|2424->1146|2486->1187|2571->1245|2586->1251|2646->1290|2722->1339|2737->1345|2792->1379|2868->1428|2883->1434|2941->1471|3004->1507|3019->1513|3082->1555|3241->1687|3269->1688|3301->1693|3373->1738|3401->1739|3430->1741|3470->1753|3499->1754|3531->1759|3672->1873|3700->1874|3729->1876|3770->1889|3799->1890|3831->1895|3871->1908|3899->1909|3927->1910|4129->2085|4144->2091|4205->2131|6535->4432|6565->4433|6595->4434|6635->4445|6665->4446|6695->4447|14287->12011|14303->12017|14366->12058|14436->12100|14452->12106|14505->12137|14621->12224|14651->12225|14705->12250|14794->12310|14824->12311|15080->12538|15110->12539|15164->12564|15241->12612|15271->12613|15329->12642|15487->12771|15517->12772|15579->12805|15668->12865|15698->12866|15753->12892|15783->12893|15833->12914|15863->12915|16410->13433|16440->13434|16477->13443|16538->13475|16568->13476|16610->13489|16735->13585|16765->13586|16811->13603|16884->13647|16914->13648|16952->13658|16982->13659|17015->13664|17044->13665|17246->13838|17276->13839|17331->13865|17482->13987|17512->13988|17570->14017|17977->14395|18007->14396|18077->14437|18182->14513|18212->14514|18267->14540|18297->14541|19184->15399|19214->15400|19288->15445|19559->15687|19589->15688|19700->15770|19730->15771|19788->15800|19999->15982|20029->15983|20212->16137|20242->16138|20300->16167|20394->16232|20424->16233|20576->16356|20606->16357|20664->16386|20795->16488|20825->16489|20935->16570|20965->16571|21023->16600|21093->16641|21123->16642|21235->16725|21265->16726|21323->16755|21411->16814|21441->16815|21618->16963|21648->16964|21706->16993|21897->17155|21927->17156|21989->17189|22127->17298|22157->17299|22275->17388|22305->17389|22416->17471|22446->17472|22504->17501|22576->17544|22606->17545|22636->17546|22754->17635|22784->17636|22896->17719|22926->17720|22984->17749|23112->17848|23142->17849|23204->17882|23342->17991|23372->17992|23490->18081|23520->18082|23743->18276|23773->18277|23839->18314|23892->18338|23922->18339|23992->18380|24077->18436|24107->18437|24169->18470|24199->18471|24317->18560|24347->18561|24405->18590|24458->18614|24488->18615|24550->18648|24627->18696|24657->18697|24711->18722|24741->18723|24892->18845|24922->18846|24988->18883|25041->18907|25071->18908|25141->18949|25226->19005|25256->19006|25318->19039|25348->19040|25536->19199|25566->19200|25624->19229|25734->19310|25764->19311|25826->19344|25985->19474|26015->19475|26070->19501|26100->19502|26155->19528|26306->19650|26336->19651|26394->19680|26504->19761|26534->19762|26596->19795|26777->19947|26807->19948|26862->19974|26892->19975|26947->20001|27046->20071|27076->20072|27134->20101|27176->20114|27206->20115|27268->20148|27525->20376|27555->20377|27609->20402|27639->20403|27694->20429|27790->20496|27820->20497|27878->20526|27960->20579|27990->20580|28045->20606|28142->20674|28172->20675|28230->20704|28355->20800|28385->20801|28440->20827|28470->20828|28652->20981|28682->20982|28755->21026|28898->21140|28928->21141|28986->21170|29368->21523|29398->21524|29431->21528|29461->21529|29519->21558|29627->21637|29657->21638|29712->21664|29852->21775|29882->21776|29969->21834|30337->22173|30367->22174|30425->22203|30458->22207|30488->22208|30550->22241|30656->22318|30686->22319|30816->22420|30981->22556|31011->22557|31098->22615|31466->22954|31496->22955|31554->22984|31587->22988|31617->22989|31679->23022|31789->23103|31819->23104|31924->23180|32075->23302|32105->23303|32192->23361|32560->23700|32590->23701|32648->23730|32681->23734|32711->23735|32773->23768|32878->23844|32908->23845|32980->23888|33010->23889|33073->23923
                  LINES: 26->1|29->1|30->2|36->8|36->8|36->8|39->11|39->11|39->11|42->14|42->14|42->14|46->18|46->18|46->18|48->20|48->20|48->20|50->22|50->22|50->22|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|62->34|62->34|62->34|68->40|68->40|69->41|71->43|71->43|73->45|73->45|73->45|74->46|79->51|79->51|81->53|81->53|81->53|82->54|83->55|83->55|84->56|91->63|91->63|91->63|149->121|149->121|149->121|149->121|149->121|149->121|243->215|243->215|243->215|244->216|244->216|244->216|247->219|247->219|248->220|249->221|249->221|256->228|256->228|257->229|258->230|258->230|259->231|261->233|261->233|262->234|263->235|263->235|264->236|264->236|265->237|265->237|276->248|276->248|277->249|278->250|278->250|279->251|281->253|281->253|282->254|283->255|283->255|284->256|284->256|285->257|285->257|294->266|294->266|296->268|297->269|297->269|298->270|303->275|303->275|304->276|305->277|305->277|306->278|306->278|323->295|323->295|324->296|327->299|327->299|328->300|328->300|329->301|332->304|332->304|336->308|336->308|337->309|339->311|339->311|341->313|341->313|342->314|344->316|344->316|345->317|345->317|346->318|347->319|347->319|348->320|348->320|349->321|350->322|350->322|353->325|353->325|354->326|356->328|356->328|357->329|359->331|359->331|361->333|361->333|362->334|362->334|363->335|363->335|363->335|363->335|365->337|365->337|366->338|366->338|367->339|368->340|368->340|369->341|371->343|371->343|373->345|373->345|377->349|377->349|378->350|378->350|378->350|379->351|380->352|380->352|381->353|381->353|382->354|382->354|383->355|383->355|383->355|384->356|385->357|385->357|386->358|386->358|388->360|388->360|389->361|389->361|389->361|390->362|391->363|391->363|392->364|392->364|395->367|395->367|396->368|397->369|397->369|398->370|400->372|400->372|401->373|401->373|403->375|404->376|404->376|405->377|406->378|406->378|407->379|409->381|409->381|410->382|410->382|412->384|413->385|413->385|414->386|414->386|414->386|415->387|419->391|419->391|420->392|420->392|422->394|423->395|423->395|424->396|425->397|425->397|427->399|428->400|428->400|429->401|431->403|431->403|433->405|433->405|438->410|438->410|440->412|443->415|443->415|444->416|448->420|448->420|448->420|448->420|449->421|451->423|451->423|452->424|454->426|454->426|456->428|460->432|460->432|461->433|461->433|461->433|462->434|464->436|464->436|468->440|470->442|470->442|472->444|476->448|476->448|477->449|477->449|477->449|478->450|480->452|480->452|483->455|485->457|485->457|487->459|491->463|491->463|492->464|492->464|492->464|493->465|495->467|495->467|497->469|497->469|499->471
                  -- GENERATED --
              */
          