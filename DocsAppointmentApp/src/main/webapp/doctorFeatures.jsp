<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
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
<form action = "patientAppointments">
<input type = "hidden" name = "did" value = "${did}">
<input type = "submit" value = "Display Patient Appointments">
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