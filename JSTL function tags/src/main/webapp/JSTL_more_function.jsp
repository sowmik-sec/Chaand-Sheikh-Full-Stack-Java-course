<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="We" value="youtube.com"></c:set>

${fn:startsWith("google.com", "g")} <br/>
${fn:endsWith(We, "com")} <br/>
${fn:contains(We, "COM")} <br/>
${fn:containsIgnoreCase("google.com", "COM")} <br/>
${fn:toUpperCase("google.com")} <br/>
${fn:toLowerCase("AHSAN HABIB")} <br/>
${fn:indexOf("Bhurungamari", "n")} <br/>
${fn:replace("Bhurungamari, Kurigram", "Bhurungamari", "Nageshwary")} <br/>

</body>
</html>