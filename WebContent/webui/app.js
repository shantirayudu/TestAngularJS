var app=angular.module('App', [])

var ddlssWebModule = angular.module('ddlssWeb',
        [
            'ngAnimate',
            'ngMessages',
            'ngRoute',
			'ui.grid',
			'ui.grid.pagination',
            'App'
        ]);

ddlssWebModule.config(['$routeProvider',
function ($routeProvider){
$routeProvider
.when('/grid', {
controller: 'GridController',
templateUrl: 'webui/views/grid.html',
controllerAs: 'grid'
})
.when('/home', {
controller: 'HomeController',
templateUrl: 'webui/views/home.html',
controllerAs: 'home'
})
.otherwise({ redirectTo: '/home' })
}
]);

