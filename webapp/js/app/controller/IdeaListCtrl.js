/*globals $,_*/
'use strict';
function IdeaListCtrl($scope, $routeParams, $http, $location) {

  var types = {
    '/ideas': 1,
    '/reclamos': 2,
    '/preguntas': 3,
    '/sugerencias': 4
  };

  var typeId = 0;

  if(typeof types[$location.path()] != 'undefined') {
    typeId = types[$location.path()];
  }

  $scope.ideas = {};

  $scope.currentPage = 1;
  $scope.maxGeoIdeas = 300;
  $scope.geoIdeasPerPage = 20;
  $scope.loadedGeoIdeas = 0;
  $scope.intervalId = 0;

  $scope.$on('$viewContentLoaded', function() {
    var latlng = new google.maps.LatLng(-34.597042, -58.386475);
    var myOptions = {
      zoom: 12,
      center: latlng,
      mapTypeId: google.maps.MapTypeId.ROADMAP
    };
    $scope.map = new google.maps.Map(document.getElementById("ideas_map"), myOptions);
    $scope.infowindow = new google.maps.InfoWindow({ maxWidth: 300 });
  });

  $scope.getIdeas = function() {

    $scope.ideaAjaxCall('GET',SERVICE_ENDPOINT+'geo?len='+$scope.geoIdeasPerPage+'&page='+$scope.currentPage+'&q=idea.type.id:' + typeId, {},function(json) {
      $scope.currentPage++;
      $scope.loadedGeoIdeas += json.length;
     
      if(json.length==0 || $scope.loadedGeoIdeas>=$scope.maxGeoIdeas){
        clearInterval($scope.intervalId);
      }

      MapHelper.mapIdeas(json, $scope.map, $scope.infowindow);

    });

  };

  $scope.init = function() {

    $scope.intervalId = setInterval(function(){$scope.getIdeas();},1000);

    if($routeParams.order == 'newest') {
      $routeParams.order = 'created desc';
    }
    else if($routeParams.order == 'oldest') {
      $routeParams.order = 'created asc';
    }

    if(typeId) {
      $routeParams['q'] = 'type.id:' + typeId;
    }

    $scope.ideaAjaxCall('GET',SERVICE_ENDPOINT+'ideas?'+ $.param($routeParams),{},function(json) { 
      $scope.ideas = json;
    });
  };

  $scope.init();

};