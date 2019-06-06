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
<h2> Registration Completed !! </h2>
<table border="5" cellpadding= '8' > 

<tr>
<th>Name</th>
<th>Value</th>
</tr>

<tr>
<td>Doctor ID</td>
<td>${doctor.id}</td>
</tr>

<tr>
<td>Name</td>
<td>${doctor.name}</td>
</tr>

<tr>
<td>age</td>
<td>${doctor.age}</td>
</tr>

<tr>
<td>Specialization</td>
<td>${doctor.specialization}</td>
</tr>

<tr>
<td>City</td>
<td>${doctor.city}</td>
</tr>

<tr>
<td>Phone No</td>
<td>${doctor.phNo}</td>
</tr>

<tr>
<td>E-Mail</td>
<td>${doctor.eMail}</td>
</tr>

<tr>
<td>Pin</td>
<td>${doctor.pin}</td>
</tr>
</table>
<br><br>
<form action = "index.jsp">
<input type = "submit" value = "Homepage">
</form>
</center>
</body>
</html>