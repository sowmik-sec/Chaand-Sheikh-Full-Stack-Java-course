<%@ page import="java.util.Date, com.sowmik.UserDefined" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP FILE</title>
</head>
<body>

<!-- For adding static content -->
<%@ include file="file1.txt" %>
<br/>

<!-- For adding dynamic content -->
<jsp:include page="file2.txt"></jsp:include>
<br/>


<%= new Date() %>
<br/>

<% out.print(new UserDefined().Demo()); %>

</body>
</html>