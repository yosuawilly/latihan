'use strict';

/* Controllers */

var app = angular.module('myApp.controllers', []);

app.controller('GenerateCtrl', ['$scope', 'AssetFactory', 'ScheduleFactory', 'GenerateFactory', '$location',
    function($scope, AssetFactory, ScheduleFactory, GenerateFactory, $location) {
        $('#title-asset').html('Generate Schedule');
        
        $scope.assets = AssetFactory.query();
        $scope.beginDate = new Date().format('dd-mm-yyyy');
        $scope.endDate = new Date().format('dd-mm-yyyy');
        $scope.comment = '';
        $scope.pic = '';
        $scope.schedules = ScheduleFactory.query();
        $scope.generate = function(){
            if($scope.selectedItem===undefined){
//                alert('Anda belum memilih Asset');
                $scope.showInfo('Anda belum memilih Asset')
                return;
            }
            
            GenerateFactory.generate({asset:$scope.selectedItem.asset, 
                                      beginDate:$scope.beginDate, 
                                      endDate:$scope.endDate,
                                      comment:$scope.comment,
                                      pic:$scope.pic},
            function($result){
                if($result.status==0){
//                    alert($result.fullMessage);
                    $scope.showInfo($result.fullMessage);
                } else {
                    $scope.schedules = ScheduleFactory.query();
//                    $location.path('/generate-schedule');
                }
            });
        };
        $scope.assetChanged = function(){
//            if($scope.selectedItem!==null)
//            alert($scope.selectedItem.asset);
        };
        
        $scope.showInfo = function($info){
            $("#info-message").html($info);
            $("#konfirmasi").dialog({
                title: "Information",
                resizable: false,
                position: 'center',
                modal: true,
                width: 360,
                height: 140,
//                hide: 'fold',
                hide: 'explode',
                show: 'clip',
                buttons:[
                    {
                        text:"Tutup",
                        click:function(){
                            $(this).dialog("close");
                        }
                    }
                ]
            });
        };
    }]);

app.controller('ScheduleCtrl', ['$scope', 'AssetFactory', 'ScheduleFactory', 'GenerateFactory', '$location',
    function ($scope, AssetFactory, ScheduleFactory, GenerateFactory, $location){
        $('#title-asset').html('Maintenance Schedule');
        $scope.schedules = ScheduleFactory.query();
    }]);

app.controller('AssetCtrl', ['$scope', 'AssetFactory', 'ScheduleFactory', 'GenerateFactory', '$location',
    function ($scope, AssetFactory, ScheduleFactory, GenerateFactory, $location){
        $('#title-asset').html('Master Asset');
        $scope.assets = AssetFactory.query();
    }]);

app.directive('datepicker', function() {
    return {
        restrict: 'A',
        require : 'ngModel',
        link : function (scope, element, attrs, ngModelCtrl) {
            $(function(){
                element.datepicker({
                    dateFormat:'dd-mm-yy',
                    onSelect:function (date) {
                        ngModelCtrl.$setViewValue(date);
                        scope.$apply();
                    }
                });
            });
        }
    }
});

//angular.module('myApp.controllers', []).
//  controller('MyCtrl1', [function() {
//
//  }])
//  .controller('MyCtrl2', [function() {
//
//  }]);