angular.module('dashboard', ['ngRoute'])
    .config(function($routeProvider, $httpProvider){

        $routeProvider.when('/', {
            templateUrl : 'home.html',
            controller : 'home'
        }).when('/login', {
            templateUrl : 'login.html',
            controller : 'navigation'
        }).otherwise('/');

        $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

    })

    .controller('home', function($scope, $http){
        $http.get('/resource/').success(function(data){
            $scope.greeting = data;
        })

        $scope.pullWalmartItems = function () {
            $http.get('/getWalmartDigitalCameras').success(function(data){
                $scope.walMartGetSuccess = data;
            }).error(function() {
                $scope.walMartGetSuccess = false;
            });
        };

        $scope.convertToAchillesItems = function () {
            $http.get('/convertToAchillesItems').success(function(data){
                $scope.convertSuccess = data;
            }).error(function() {
               $scope.convertSuccess = false;
            });
        };

        $scope.updateEbay = function () {
            $http.get('/updateEbay').success(function(data){
                $scope.convertSuccess = data;
            }).error(function() {
                $scope.convertSuccess = false;
            });
        };

    })
    .controller('navigation', function($rootScope, $scope, $http, $location) {

        var authenticate = function (credentials, callback) {

            var headers = credentials ? {
                authorization: "Basic "
                + btoa(credentials.username + ":" + credentials.password)
            } : {};

            $http.get('user', {headers: headers}).success(function (data) {
                if (data.name) {
                    $rootScope.authenticated = true;
                } else {
                    $rootScope.authenticated = false;
                }
                callback && callback();
            }).error(function () {
                $rootScope.authenticated = false;
                callback && callback();
            });

        }

        authenticate();
        $scope.credentials = {};
        $scope.login = function () {
            authenticate($scope.credentials, function () {
                if ($rootScope.authenticated) {
                    $location.path("/");
                    $scope.error = false;
                } else {
                    $location.path("/login");
                    $scope.error = true;
                }
            });
        };

        $scope.logout = function() {
            $http.post('logout', {}).success(function() {
                $rootScope.authenticated = false;
                $location.path("/");
            }).error(function(data) {
                $rootScope.authenticated = false;
            });
        }

    });
