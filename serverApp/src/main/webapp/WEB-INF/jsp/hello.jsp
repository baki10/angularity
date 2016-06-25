<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hello world</title>
    <script src="<c:url value="/resources/js/menuScript.js" />"></script>
</head>
<body>
    ${message}
	<hr/>
	<script>
		addButton();
	</script>
	<div id = "menuList"></div>
    <hr/>
	<a href="oop">OOP</a>
    <hr/>
	<a href="<c:url value="/aquarium" />">Aquarium</a>
    <hr/>
    <a href="lesson4">Zamyikaniya</a>
    <hr/>
    <a href="lesson5">AJAX</a>
    <hr/>
    <a href="angularPage">Angular</a>
</body>
</html>