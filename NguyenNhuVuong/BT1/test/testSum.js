angular.module('app')
.controller('TestController', ['$scope','$rootScope', function($scope, $rootScope){
	var test = function(){
			var a = [0.2, 0.1, 0.1010100101, 0.000000000001212121212121212, 0.111111212121212897129712987198271298721];
			$rootScope.SumArray(a, function(response){
				console.log(response);
				$rootScope.array1 = a;
				$rootScope.sum1 = response;
			});
		
	}
	var test1 = function(){
		
			var a = [0, 2, 'asdfa', 'lkasjf', 129812981298129819281928917387123873191309810, 0.0010921092012892];
			$rootScope.SumArray(a, function(response){
				console.log(response);
				$rootScope.array2 = a;
				$rootScope.sum2 = response;
			});
		
	}
	var test2 = function(){
			var a = [-1, -2, 21, -12, -9, -0.2, -01];
			$rootScope.SumArray(a, function(response){
				console.log(response);
				$rootScope.array3 = a;
				$rootScope.sum3 = response;
			});
		
	}
	var test3 = function(){
		var a = ["0", "1", "2", "3", '4', '5', '6'];
		$rootScope.SumArray(a, function(response){
			console.log(response);
			$rootScope.array4 = a;
			$rootScope.sum4 = response;
		});
		
	}
	test();
	test1();
	test2();
	// test2();
	test3();
}]);