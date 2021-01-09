'use strict';
 
app.factory('DDLService', ['$http', '$q', function($http, $q){
	 var getGroupsFunc= function() {
         return $http.get('api/getGroups')
         .then(
                 function(response){
                     return response.data;
                 }, 
                 function(errResponse){
                     console.error('Error while fetching groups');
                     return $q.reject(errResponse);
                 }
         );
     }
      return {
    	getGroups:getGroupsFunc
    }
  }
]);
