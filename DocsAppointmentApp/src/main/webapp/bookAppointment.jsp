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
<h2> Doctor Appointment </h2>
<form action = "bookAppointment">
<table>
<!-- <tr> -->
<!-- <td> Patient ID : </td> -->
<input type = "hidden" name = "pid" value = "${pid}"> 
<!-- </tr> -->

<tr>
<td> <br>Select Specialization <br> </td>
<td><br>
 <select name="specialization">
  <option value="cardiologist">cardiologist</option>
  <option value="orthopedic">orthopedic</option>
  <option value="neurologist">neurologist</option>
  <option value="physician">physician</option>
</select>
 <br></td>
 </tr>
 </table>
<br> <input type = "submit" value = "Get List of Doctors"> <br>



</form>
</center>
</body>
</html>