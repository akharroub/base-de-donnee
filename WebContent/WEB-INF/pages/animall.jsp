<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>animal</title>
</head>
<body>



<h1>-1) animal :</h1>
<ul>
<c:forEach items="${animal }" var="animal">
<li>${animal }</li>
</c:forEach>
</ul>
<h1> -2) les types  :</h1>
<ul>
<c:forEach items="${typeanimal }" var="type">
<li>${type }</li>
</c:forEach>
</ul>

<h1>-3) la durée de vie :</h1>
<ul>
<c:forEach items="${ageAnimal }" var="age">
<li>${age }</li>
</c:forEach>
</ul>

</body>
</html>