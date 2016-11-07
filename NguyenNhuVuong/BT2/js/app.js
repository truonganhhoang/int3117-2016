angular.module('app', [])
.controller('appController', ['$scope', '$rootScope', function($scope, $rootScope){

	$rootScope.UCLN = function(a, b){
		var temp = 0;
    if(a == 0 && b == 0) {
      return 0;
    } 
    if(a == b || a != 0 && b == 0) {
      return Math.abs(a);
    }
          
    if(b != 0 && a == 0) {
      return Math.abs(b);
    }
    while(b != 0) {
      temp = a % b;
      a = b;
      b = temp;
    }
    console.log(a);
    return a;
	}
	$rootScope.UCLN(2, 3);
}]);