<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
<form action="submit.jsp" method="post">
Full name: <input type="text" name="name" /><br/>
Gender: <input type="radio" name="gender" value="male"> Male
		<input type="radio" name="gender" value="female"> Female <br/>
		
Languages know: <input type="checkbox" name="language" value="English"> English
				<input type="checkbox" name="language" value="Bangla"> Bangla
				<input type="checkbox" name="language" value="Arabic"> Arabic <br/>
Country:<select name="country">
			<option value="Bangladesh">Bangladesh</option>
			<option value="India">India</option>
			<option value="KSA">KSA</option>
			<option value="Syria">Syria</option>
		</select> <br/>
		<input type="submit" value="Submit">
</form>

</body>
</html>