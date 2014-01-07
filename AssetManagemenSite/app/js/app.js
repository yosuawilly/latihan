'use strict';


// Declare app level module which depends on filters, and services
angular.module('myApp', [
  'ngRoute',
  'myApp.filters',
  'myApp.services',
  'myApp.directives',
  'myApp.controllers'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/generate-schedule', {templateUrl: 'asset/generate-schedule.html', controller: 'GenerateCtrl'});
  $routeProvider.when('/schedule', {templateUrl: 'asset/schedule.html', controller: 'ScheduleCtrl'});
  $routeProvider.when('/asset', {templateUrl: 'asset/asset.html', controller: 'AssetCtrl'});
  $routeProvider.when('/view1', {templateUrl: 'partials/partial1.html', controller: 'MyCtrl1'});
  $routeProvider.when('/view2', {templateUrl: 'partials/partial2.html', controller: 'MyCtrl2'});
//  $routeProvider.otherwise({redirectTo: '/generate-schedule'});
  $routeProvider.otherwise({redirectTo: '/asset'});
}]);
