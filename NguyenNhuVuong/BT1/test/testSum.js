angular.module('app')
.controller('TestController', ['$scope','$rootScope', function($scope, $rootScope){
	var test = function(){
		var a = [2, 3, 4, 5, 7, 8, 10, 10, 12, 100, 1000, 20, 2];
		$rootScope.SumArray(a, function(response){
			console.log(response);
			$rootScope.array = a;
			$rootScope.sum = response;
		});
	}
	test();
}]);