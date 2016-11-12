angular.module('app')
.controller('TestController', ['$scope','$rootScope', function($scope, $rootScope){

	var test1 = function() {
		var S_actual = $rootScope.Sum_A_for_B(2, 7);
		$rootScope.sum1 = S_actual; 
		console.log(S_actual);
	}
	var test2 = function() {
		var S_actual = $rootScope.Sum_A_for_B(5, 8);
	 	$rootScope.sum2 = S_actual;
		console.log(S_actual);
	}
	test1();
	test2();
}]);