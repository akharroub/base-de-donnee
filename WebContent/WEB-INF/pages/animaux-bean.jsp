<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-3">
<title>Insert title here</title>
</head>
<body>
	<h1>Les Animaux</h1>


	<table>

		<c:forEach items="${ animaux }" var="animall">
			<tr>
				<td>${ animall.nom }</td>
				<td>${ animall.type }</td>
				<td>${ animall.age }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>