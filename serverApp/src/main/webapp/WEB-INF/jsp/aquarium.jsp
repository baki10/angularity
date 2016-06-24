<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Aquarium</title>
    <script src="<c:url value="/resources/js/aquaScript.js" />"></script>
</head>
<body>
		<div id = "aquaDiv"></div>
		<img src = "<c:url value="/resources/images/gold-fish-icon.png" />"/ id = "goldFish" style = "visibility: hidden;">
		<img src = "<c:url value="/resources/images/Blue-Fish-icon.png" />"/ id = "blueFish" style = "visibility: hidden;">
		<img src = "<c:url value="/resources/images/shark-icon.png" />"/ id = "shark" style = "visibility: hidden;">
		<img src = "<c:url value="/resources/images/starfish.png" />"/ id = "starfish" style = "visibility: hidden;">
		<script>
				paintAquarium();
		</script>
</body>
</html>