<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="com.sowmik.beans.User" scope="session"></jsp:useBean>
<jsp:setProperty property="firstName" name="user" value="Ahsan"/>
<jsp:setProperty property="lastName" name="user" value="Habib"/>
Values have been set
</body>
</html>