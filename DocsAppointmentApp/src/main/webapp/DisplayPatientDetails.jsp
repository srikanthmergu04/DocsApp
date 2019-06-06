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
<td>Patient ID</td>
<td>${patient.pid}</td>
</tr>

<tr>
<td>Name</td>
<td>${patient.pname}</td>
</tr>

<tr>
<td>age</td>
<td>${patient.age}</td>
</tr>

<tr>
<td>City</td>
<td>${patient.city}</td>
</tr>

<tr>
<td>Phone No</td>
<td>${patient.phoneNo}</td>
</tr>

<tr>
<td>E-Mail</td>
<td>${patient.email}</td>
</tr>

<tr>
<td>Pin</td>
<td>${patient.pin}</td>
</tr>
</table>
<br><br>
<form action = "index.jsp">
<input type = "submit" value = "Homepage">
</form>
</center>
</body>
</html>