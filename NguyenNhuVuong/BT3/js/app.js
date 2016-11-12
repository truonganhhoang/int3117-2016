angular.module('app', [])
.controller('appController', ['$scope', '$rootScope', function($scope, $rootScope){
	
	$rootScope.Sum_A_for_B = function(start, end){
		var sum1 = 0, sum2 = 0;

		for(var i = start; i < end; i++){
			if(i % 2 == 0 && typeof (i) == 'number'){
				sum1 += i;
			}
		}
		return sum1;
	}
}]);