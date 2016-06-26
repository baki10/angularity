<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Angular Table</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js"></script>
    <style>
        table, th , td {
          border: 1px solid grey;
          border-collapse: collapse;
          padding: 5px;
        }
        table tr:nth-child(odd) {
          background-color: #f1f1f1;
        }
        table tr:nth-child(even) {
          background-color: #ffffff;
        }
    </style>
</head>
<body>
    <div ng-app="myApp" ng-controller="customersCtrl">

    <table>
        <tr ng-repeat="x in myData | orderBy:'Country'">
            <td>{{ $index + 1 }}</td>
            <td>{{ x.Name }}</td>
            <td>{{ x.Country | uppercase}}</td>
        </tr>
    </table>

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