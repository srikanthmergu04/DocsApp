<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<h2> Login Successfull </h2>

<br>
<form action = "patientId">
<input type = "hidden" name = "pid" value = "${pid}">
<input type = "submit" value = "Book Appointment">
</form>
<br>

<form action = "viewPatientProfile">
<input type = "hidden" name = "pid" value = "${pid}">
<input type = "submit" value = "View Profile">
</form>

<br>
<br>
<form action = "index.jsp">
<input type = "submit" value = "Homepage">
</form>
<br>
</center>
</body>
</html>