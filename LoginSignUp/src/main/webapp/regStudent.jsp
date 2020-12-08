<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Sign up</title>
</head>
<body>

<form action="studentRegister" method="post">
	<fieldset>
	<legend>Add student sign up details</legend>
	<label>Enter name:</label><br>
	<input type = "text" name="name" required><br>
	<label>Enter email:</label><br>
	<input type = "email" name="email" required><br>
	<label>Enter password:</label><br>
	<input type = "password" name="password" required><br>
	<input type = "submit" value="Register">
	<input type = "reset">
	</fieldset>
	</form>

</body>
</html>