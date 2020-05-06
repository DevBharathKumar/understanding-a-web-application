<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thank God :) </title>
</head>
<body>
<form action="/login.do" method="post" >
	<font color=red>${error}</font>
	<h2>Please enter your name <input type="text" name="name"/> </h2>
	<h2>Please enter your password  <input type="password" name="password"/> </h2>
	<input type="submit" value="Login"/>
</form>
</body>
</html>