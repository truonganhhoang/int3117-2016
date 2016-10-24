angular.module('app')
.controller('TestController', ['$scope','$rootScope', function($scope, $rootScope){
	var test1 = function() {
    var a = 0, b = 0;
    console.log("Test a = 0 and b = 0");
    var expResult = 0;
    var result = $rootScope.UCLN(a, b);
    $rootScope.result1 = result;
    console.log(result);
  }

  var test2 = function() {
    console.log("Test a = 0 and b != 0");
    var a = 0, b = 5;
    var expResult = 15;
    var result = $rootScope.UCLN(a, b);
    $rootScope.result2 = result;
    console.log(result);
  }
   
  var test3 = function() {
    console.log("Test a != 0 and b = 0");
    var a = 5, b = 0;
    var expResult = 5;
    var result = $rootScope.UCLN(a, b);
    console.log(result);
    $rootScope.result3 = result;
  }
  var test4 = function() {
    console.log("Test a = b");
    var a = 5, b = 5;
    var expResult = 5;
    var result = $rootScope.UCLN(a, b);
    console.log(result);
    $rootScope.result4 = result;
  }
  var test5 = function() {
    console.log("Test a = 4 and b = 43");
    var a = 14, b = 43;
   
    var expResult = 2;
 		var result = $rootScope.UCLN(a, b);
    console.log(result);
    $rootScope.result5 = result;
  }
  test1();
  test2();
  test3();
  test4();
  test5();
}]);