<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
	<h1>HELLO JSP</h1>
	<%= new java.util.Date() %>
	<br/>
	<%= 23/5 %>
	<br/>
	<%= 3>5 %>
	<br/>
	<%
		int x = 10, y = 15;
		out.println(x+y+"<br/>");
		for(int i=0;i<x;i++) {
			for(int j=0;j<=i;j++) {
				out.print("*");
			}
			out.print("<br/>");
		}
	%>
	<br/>
	<%= x*10+y %>
	<br/>
	<%! public int a = 63; %>
	<%= a %>
	<br/>
	<%!
		String message() {
			return "I luv cats";
		}
	%>
	<%= message() %>
</body>
</html>