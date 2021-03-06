/**
 * mortgagePage7a js file
 * 
 */

/**
 * for load the page to quit disply before
 */

window.onbeforeunload = function() {
	return "Are you sure?";
};

$(document).ready(function() {
	$('form').submit(function() {
		window.onbeforeunload = null;
	});
});
/**
 * Form validation of page7b
 */
function validateForm(){
	var CoCurrentAddress1 = document.forms["myForm"]["CoCurrentAddress1"].value;
	if(!CoCurrentAddress1){
    	    document.getElementById('input_2021').innerHTML="<span style='color:red'>*This field is Required.</span>";
    	    document.getElementById('geocomplete').focus();
        	return false;
	}else{
	document.getElementById("input_2021").innerHTML="";
	}
	
	var CoMovedIn1 = document.forms["myForm"]["CoMovedIn1"].value;
	if(!CoMovedIn1){
    	    document.getElementById('input_2022').innerHTML="<span style='color:red'>*This field is Required.</span>";
    	    document.getElementById('datepicker3').focus();
        	return false;
	}else{
	document.getElementById("input_2022").innerHTML="";
	}
	
	var CoCurrentAddress2 = document.forms["myForm"]["CoCurrentAddress2"].value;
	if(!CoCurrentAddress2){
    	    document.getElementById('input_2023').innerHTML="<span style='color:red'>*This field is Required.</span>";
    	    document.getElementById('geocomplete1').focus();
        	return false;
	}else{
	document.getElementById("input_2023").innerHTML="";
	}
	
	var CoMovedIn2 = document.forms["myForm"]["CoMovedIn2"].value;
	if(!CoMovedIn2){
    	    document.getElementById('input_2024').innerHTML="<span style='color:red'>*This field is Required.</span>";
    	    document.getElementById('datepicker4').focus();
        	return false;
	}else{
	document.getElementById("input_2024").innerHTML="";
	}
	
	var CoCurrentAddress4 = document.forms["myForm"]["CoCurrentAddress4"].value;
	if(!CoCurrentAddress4){
    	    document.getElementById('input_2025').innerHTML="<span style='color:red'>*This field is Required.</span>";
    	    document.getElementById('geocomplete2').focus();
        	return false;
	}else{
	document.getElementById("input_2025").innerHTML="";
	}
	
	var CoMovedIn3 = document.forms["myForm"]["CoMovedIn3"].value;
	if(!CoMovedIn3){
    	    document.getElementById('input_2026').innerHTML="<span style='color:red'>*This field is Required.</span>";
    	    document.getElementById('datepicker5').focus();
        	return false;
	}else{
	document.getElementById("input_2026").innerHTML="";
	}

return true;	
}

/**
 * for angular code here
 */
var app = angular.module("demoApp", ['ui.bootstrap']);

app.controller('DemoController', function ($scope) {
    init();
    function init() {
        $scope.newItemType = '';
        $scope.company="";
        
        var coTotalMonth2311 = document.forms["myForm"]["coTotalMonth231"].value;
        if(coTotalMonth2311 !="")
        $scope.coApplicantTotal=coTotalMonth2311;
        
        var coTotalMonth2322 = document.forms["myForm"]["coTotalMonth232"].value;
        if(coTotalMonth2322 !="")
        $scope.coApplicantTotal2=coTotalMonth2322;
        
        var coTotalMonth2333 = document.forms["myForm"]["coTotalMonth233"].value;
        if(coTotalMonth2333 !="")
        $scope.coApplicantTotal3=coTotalMonth2333;
        
        $( "#datepicker3" ).datepicker({
            changeMonth: true,
            changeYear: true,
            onSelect: function (date) {
                $scope.CoMovedIn1 = date;
           
                 $scope.$apply(function($scope){
                     // Change binded variable
                     $scope.assign($scope, date);
                 });
                 
            }
           
          });
    	
    	$( "#datepicker4" ).datepicker({
            changeMonth: true,
            changeYear: true,
            onSelect: function (date) {
                $scope.CoMovedIn2 = date;
           
                 $scope.$apply(function($scope){
                     // Change binded variable
                     $scope.assign($scope, date);
                 });
                 
            }
           
          });
    	
    	$( "#datepicker5" ).datepicker({
            changeMonth: true,
            changeYear: true,
            onSelect: function (date) {
                $scope.CoMovedIn3 = date;
           
                 $scope.$apply(function($scope){
                     // Change binded variable
                     $scope.assign($scope, date);
                 });
                 
            }
           
          });
        
        $scope.change = function () {
            console.log($scope.newItemType)
        };
    }
    
    $scope.calculateDate2 = function ($scope) {
    	$scope.employetotal=0;
    	var one= $scope.CoMovedIn1;

    	var date =one.split("/");
        var oneDate=date[0]+"/1/"+date[2];
        var total=0;
        var today = new Date();
		var datevDate=new Date(oneDate);
		
		var one_day=1000*60*60*24;
		var date1ms=today.getTime();
		var date2ms=datevDate.getTime();
		
		var totmili=date1ms-date2ms;
		var totalDays=Math.round(totmili/one_day);
		var totalMonths=Math.abs((totmili/one_day)/30);
		
		total=Math.floor(totalMonths); 
		$scope.coApplicantTotal = total;
		
		if(total <36){
			one= $scope.CoMovedIn2;
			date =one.split("/");
            oneDate=date[0]+"/1/"+date[2];
    	   	datevDate=new Date(oneDate);
    	   	
   		 	one_day=1000*60*60*24;
   		 	date1ms=date2ms;
   		
   			date2ms=datevDate.getTime();
   			totmili=date1ms-date2ms;
   			if(isNaN(totmili) == false){
   				 
          		totalDays=Math.round(totmili/one_day);
          		totalMonths=Math.abs((totmili/one_day)/30);
        		total=total+Math.floor(totalMonths); 
        		$scope.coApplicantTotal2 = total;
			
		}
   			
   			one= $scope.CoMovedIn3;
			date =one.split("/");
            oneDate=date[0]+"/1/"+date[2];
    	   	datevDate=new Date(oneDate);
    	   	
   		 	one_day=1000*60*60*24;
   		 	date1ms=date2ms;
   		
   			date2ms=datevDate.getTime();
   			totmili=date1ms-date2ms;
   			if(isNaN(totmili) == false){
   				 
          		totalDays=Math.round(totmili/one_day);
          		totalMonths=Math.abs((totmili/one_day)/30);
        		total=total+Math.floor(totalMonths);
        		$scope.coApplicantTotal3 = total;
			}
   			
		}
    }             		
});

/**
 * for select function for select element
 */

window.onload = function() {
	SelectElement();
};
function SelectElement() {
    var coAppmovedIn12  = document.forms["myForm"]["coAppmovedIn12"].value;  
    document.forms["myForm"]["CoMovedIn1"].value = coAppmovedIn12;
    
    var coAppmovedIn13  = document.forms["myForm"]["coAppmovedIn13"].value;  
    document.forms["myForm"]["CoMovedIn2"].value = coAppmovedIn13;
    
    var coAppmovedIn14  = document.forms["myForm"]["coAppmovedIn14"].value;  
    document.forms["myForm"]["CoMovedIn3"].value = coAppmovedIn14;
}

/**
 * geocomplete for address js file using
 */
$(function() {
	$("#geocomplete").geocomplete({
		map : ".map_canvas",
		details : "form",
		types : [ "geocode", "establishment" ],
	});

	$("#find").click(function() {
		$("#geocomplete").trigger("geocode");
	});
});

$(function() {
	$("#geocomplete1").geocomplete({
		map : ".map_canvas",
		details : "form",
		types : [ "geocode", "establishment" ],
	});

	$("#find").click(function() {
		$("#geocomplete1").trigger("geocode");
	});
});

$(function() {
	$("#geocomplete2").geocomplete({
		map : ".map_canvas",
		details : "form",
		types : [ "geocode", "establishment" ],
	});

	$("#find").click(function() {
		$("#geocomplete2").trigger("geocode");
	});
});

/**
 * data-toggle
 */

$(document).ready(function() {
	$('[data-toggle="tooltip"]').tooltip();
});