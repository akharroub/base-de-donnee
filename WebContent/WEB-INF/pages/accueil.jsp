<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>accueil</title>
</head>
<body>
<h1> Les base de donnes</h1>
<ul>
<c:forEach items="${villes }" var="villes">
<li><h1>${villes }</h1></li>
</c:forEach>
</ul>

</body>
</html>