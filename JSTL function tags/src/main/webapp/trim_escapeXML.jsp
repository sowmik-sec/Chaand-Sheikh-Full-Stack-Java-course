<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trim and escape XML</title>
</head>
<body>
${fn:trim("kick    in your   nuts   .")}

<br/>

${fn:escapeXml("<h1>EscapeXML Demo</h1>")}
</body>
</html>