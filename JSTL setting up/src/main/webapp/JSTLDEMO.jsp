<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>

<c:set var="name" value="Sowmik"></c:set> 

<c:out value="${name}"></c:out> <br/>
${name}

<c:remove var="name"/>

${name}



<c:if test="${param.name=='habib' }">
	Hi <b>${param.name}</b>
</c:if>
<br/>
El nino

</body>
</html>