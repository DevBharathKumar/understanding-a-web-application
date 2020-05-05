<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thank God :) </title>
</head>
<body>
!!! Great we are inside a JEE application !!! 
Congradulations ${name}
<%
  for(int i=0;i<3;i++)
  {
	  System.out.println(request.getParameter("name"));
  }
%>
</body>
</html>