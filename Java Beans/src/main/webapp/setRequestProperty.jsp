<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="com.sowmik.beans.User" scope="request"></jsp:useBean>
First Name: <jsp:setProperty property="firstName" name="Ahsan"/>
Last Name: <jsp:setProperty property="lastName" name="Habib"/>
Values have been set <br/>

</body>
</html>