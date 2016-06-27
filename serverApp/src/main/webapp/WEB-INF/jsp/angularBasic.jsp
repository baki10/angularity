<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Angular</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js"></script>
</head>
<body>
    <div ng-app="myApp" ng-controller="myCtrl" ng-init="myColor='aqua'">
        <label>Name:</label>
        <input type="text" ng-model="yourName" placeholder="Enter a name here">
        <hr>
        <h2>Hello {{yourName | uppercase}}!</h2>
        <hr>
        <input style="background-color:{{myColor}}" ng-model="myColor" value="{{myColor}}">
        <hr>
        <w3-test-directive></w3-test-directive>
        <hr>
        <h1>Price: {{ price | currency }}</h1>
        <hr>
        <p>Select a car:</p>
        <select ng-model="selectedCar" ng-options="y.brand for (x, y) in cars">
        </select>

        <h1>You selected: {{selectedCar.brand}}</h1>
        <h2>Model: {{selectedCar.model}}</h2>
        <h3>Color: {{selectedCar.color}}</h3>

        <script>
            var app = angular.module("myApp", []);
            app.directive("w3TestDirective", function() {
                return {
                    template : "<h1>Made by a directive!</h1>"
                };
            });
            app.controller('myCtrl', function($scope) {
                $scope.price = 58;
                $scope.cars = {
                    car01 : {brand : "Ford", model : "Mustang", color : "red"},
                    car02 : {brand : "Fiat", model : "500", color : "white"},
                    car03 : {brand : "Volvo", model : "XC90", color : "black"}
                }
            });
        </script>

        <hr>
        <form ng-app="app2" name="myForm">
            Email:
            <input type="email" name="myAddress" ng-model="text" placeholder="Enter an email here">
            <span ng-show="myForm.myAddress.$error.email">Not a valid e-mail address</span>
            <h1>Status</h1>
            <p>Valid: {{myForm.myAddress.$valid}} (if true, the value meets all criteria).</p>
            <p>Dirty: {{myForm.myAddress.$dirty}} (if true, the value has been changed).</p>
            <p>Touched: {{myForm.myAddress.$touched}} (if true, the field has been in focus).</p>
        </form>

    </div>

</body>
</html>