angular.module('helloApp', []).controller('HelloController',
		[ '$scope', '$http', function($scope, $http) {

			$scope.hello = '';

			$scope.sayHello = function(name) {
				$http.get('/api/hello', {
					params : {
						name : name
					}
				}).success(function(response) {
					$scope.hello = response;
				});

			};

		} ]);