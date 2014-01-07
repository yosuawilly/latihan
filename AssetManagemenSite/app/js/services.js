'use strict';

/* Services */


// Demonstrate how to register services
// In this case it is a simple value service.
//angular.module('myApp.services', []).
//  value('version', '0.1');
var services = angular.module('myApp.services', ['ngResource']);
services.value('version', '0.2');

services.factory('AssetFactory', function($resource) {
     
    return $resource('http://localhost\\:8080/ServerAssetManagemen/rest/asset/getAllAssets', {}, {
        query: {method: 'GET', params: {}, isArray: true},        
    });
});

services.factory('ScheduleFactory', function($resource) {
     
    return $resource('http://localhost\\:8080/ServerAssetManagemen/rest/asset/getAllSchedule', {}, {
        query: {method: 'GET', params: {}, isArray: true},        
    });
});

services.factory('GenerateFactory', function($resource) {
     
    return $resource('http://localhost\\:8080/ServerAssetManagemen/rest/asset/generateSchedule', {}, {
        generate: {method: 'GET', params: {asset:'@asset',
                                           beginDate:'@beginDate',
                                           endDate:'@endDate',
                                           comment:'@comment',
                                           pic:'@pic'}, isArray: false},        
    });
});
