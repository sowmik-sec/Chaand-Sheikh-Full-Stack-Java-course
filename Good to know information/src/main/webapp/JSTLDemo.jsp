<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
<%
String URL = "<a href='http://google.com'>Home</a>";
ServletContext context = getServletContext();
context.setAttribute("url", URL);
session.setAttribute("author", "Sowmik");
%>
${author}
<br/>
${url}
</body>
</html>