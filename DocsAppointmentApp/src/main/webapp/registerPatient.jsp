<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Registration</title>
</head>
<body>
<center>
<h2>Fill the following Details</h2>

 <form:form action = "addPatient" method="post" modelAttribute="patient">
  <table border="3" cellpadding= '5'>
     
			
			<tr>
				<td>Name</td>
				<td><form:input path="pname"/></td>
			</tr>


			<tr>
				<td>Age</td>
				<td><form:input path="age"/></td>
			</tr>
			
			<tr>
				<td>City</td>
				<td><form:input path="city"/></td>
            </tr>

			<tr>
			
				<td>Phone No</td>
				<td><form:input path="phoneNo"/></td>
            </tr>
            
            	<tr>
			
				<td>E-Mail</td>
				<td><form:input path="email"/></td>
            </tr>
                        
            	<tr>
			
				<td>Pin</td>
				<td><form:password path="pin"/></td>
            </tr>
		</table>
			<br><br>
		<input type="submit" value="Register">
			
    
  </form:form>
</center>
</body>
</html>