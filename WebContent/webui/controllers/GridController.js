angular.module('App')
    .controller('GridController', GridController);

function GridController($scope,DDLService) {
   // var grid = this;
    console.log('in grid controller..');

	$scope.gridOptions = {
	columnDefs: [
	{ field: 'adGroupDN' },
	{ field: 'sqlFilter' },
	{ field: 'description'}
	]
	};
	DDLService.getGroups()
            .then(
                 function(d) {
					  console.log(d);
               	      $scope.gridOptions.data=d;
                 },
                  function(errResponse){
                      console.error('Error while fetching Groups');
                  }
             );
	
	};