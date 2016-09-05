angular.module('app', [])
.controller('appController', ['$scope', '$rootScope', function($scope, $rootScope){
	
	$rootScope.SumArray = function(array, callback){
		var sum = 0;
		for(var i = 0; i < array.length; i++){
			if(array[i] % 2 == 0){
				sum += array[i];
			}
		}
		callback(sum);
		return sum;
	}
}]);