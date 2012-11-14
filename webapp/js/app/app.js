var ideasModule = angular.module('ideas-ba', [], function($routeProvider, $locationProvider){

	//ROUTES
	$routeProvider.
    when('/home',           {templateUrl: './partials/home.html',         controller: HomeCtrl}).
    when('/ideas',          {templateUrl: './partials/idea-list.html',    controller: IdeaListCtrl}).
    when('/sugerencias',    {templateUrl: './partials/idea-list.html',    controller: IdeaListCtrl}).
    when('/reclamos',       {templateUrl: './partials/idea-list.html',    controller: IdeaListCtrl}).
    when('/preguntas',      {templateUrl: './partials/idea-list.html',    controller: IdeaListCtrl}).
    when('/nuevo',          {templateUrl: './partials/idea-form.html',    controller: IdeaFormCtrl}).
    when('/mapa',           {templateUrl: './partials/map.html',          controller: MapCtrl}).    
    when('/ideas/:ideaId',  {templateUrl: './partials/idea-detail.html',  controller: IdeaDetailCtrl}).
    when('/user/edit',      {templateUrl: './partials/user-form.html',    controller: UserFormCtrl}).
    when('/user/:userId',   {templateUrl: './partials/user-detail.html',  controller: UserDetailCtrl}).
    otherwise({redirectTo: '/home'});

    // Don't redirect if we get an oauth message
    if(window.location.hash.search('(\#oauth)(.*)') == 0) {
      $routeProvider.otherwise({redirectTo: null});
    } 

    //URL -- Remove # char from url
    //$locationProvider.html5Mode(true);
    //Commented because deeplinking is not working

});

ideasModule.factory('$USER', function() {
  var data = {};

  data.id = 0;
  data.token = '000000';
  
  data.setUser = function(json){
    data.id = json.id;
  };

  data.getId = function(){
    return data.id;
  };

  return data; // returning this is very important
});

ideasModule.run(function($rootScope,$http) {

  //Global functions!!
  $rootScope.ideaAjaxCall = function (_method,_url,_data,_callback,_callbackError,_contentType) {

    var token = SocialAuth.get('ideas-ba-token'), _headers={};
    token="nouser";
    if (token) {
        _headers["Authorization"] = 'ideas-token='+token;
    }

    _headers["Content-Type"] =  _contentType || "application/json";

    $http({method: _method, url: _url, data: _data, headers: _headers})
    .success(
        function (data, status, headers, config){
          if(_callback)
            _callback(data, status, headers, config);  
        }
    )
    .error(
      function (data, status, headers, config){
        var msg = '';
        angular.forEach(data, function(e, i){
          msg += '<p>'+e.message+'</p>';
        });
        
        switch (status) {
          case 401:
            $('#authModal').modal();
          break;
          default:
            $('#errorModal .modal-body').html(msg);
            $('#errorModal').modal();
          break;
        }

        if(_callbackError)
          _callbackError(data, status, headers, config);  
    });
  }

});

// var SERVICE_ENDPOINT = "http://ideasba.org/api/";
var SERVICE_ENDPOINT = "http://ideas-ba.com.ar/api/";
// var SERVICE_ENDPOINT = "http://localhost:9000/api/";