<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learning choose when tags</title>
</head>
<body>

<c:choose>
	<c:when test="${param.lang=='Java' }">
	  Learning Java.
	</c:when>
	<c:when test="${param.lang=='cpp' }">
	  Learning C++.
	</c:when>
	<c:when test="${param.lang=='Python' }">
	  Learning Python.
	</c:when>
	<c:when test="${param.lang=='PHP' }">
	  Learning PHP.
	</c:when>
	<c:otherwise>
	  Learning nothing. 
	</c:otherwise>
</c:choose>

</body>
</html>