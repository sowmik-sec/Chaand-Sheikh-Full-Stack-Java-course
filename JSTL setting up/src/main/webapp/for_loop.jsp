<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learning for loop</title>
</head>
<body>

<%
	String[] names = new String[3];
	names[0] = "Ahsan";
	names[1] = "Habib";
	names[2] = "Sowmik";
%>

<c:forEach items="<%=names %>" var="name">
	${name}
</c:forEach>

</body>
</html>