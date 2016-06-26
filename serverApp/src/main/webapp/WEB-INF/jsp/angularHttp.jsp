<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Angular Time</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js"></script>
</head>
<body>
    <div ng-app="myApp" ng-controller="customersCtrl">

    <ul>
      <li ng-repeat="x in myData | orderBy:'Country'">
        {{ x.Name + ', ' + x.Country }}
      </li>
    </ul>

    </div>

    <script>
    var app2 = angular.module('myApp', []);
    app2.controller('customersCtrl', function($scope, $http) {
        $http.get("http://localhost:8080/serverApp/angularPage/customers").then(function(response) {
            $scope.myData = response.data.records;
        });
    });
    </script>

</body>
</body>
</html>