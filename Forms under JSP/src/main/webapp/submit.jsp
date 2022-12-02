<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit</title>
</head>
<body>
Name: <%= request.getParameter("name") %> <br/>
Gender: <%= request.getParameter("gender") %> <br/>
Language knows: <% 
String[] lang = request.getParameterValues("language");
if(lang != null) {
	for(int i=0;i<lang.length;i++) {
		out.print(lang[i]+" ");
	}
}
else {
	out.print("None Selected");
}

%> <br/>
Country lives: <%= request.getParameter("country") %> <br/>
</body>
</html>