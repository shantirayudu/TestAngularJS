angular.module('App')
    .controller('HomeController', HomeController);

function HomeController($scope,DDLService) {
    var home = this;
    $scope.pageTitle='Home-TEST';
    console.log('in home controller..')
};