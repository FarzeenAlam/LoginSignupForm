<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<form action="LoginDetails" method="post">
	<fieldset>
	<legend>Add log in details</legend>
	<label>Enter email:</label><br>
	<input type = "email" name="email" required><br>
	<label>Enter password:</label><br>
	<input type = "password" name="password" required><br>
	<input type = "submit" value="Login">
	<input type = "reset">
	</fieldset>
	</form>

</body>
</html>