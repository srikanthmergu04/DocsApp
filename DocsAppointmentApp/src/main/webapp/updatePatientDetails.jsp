<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"
    %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<h2>Update Details</h2>

 <form:form action = "updatePatient" method="post" modelAttribute="patient">
  <table>

			<input type = "hidden" name = "pid" value = "${patient.pid}"/>
			<tr>
				<td>Name</td>
				<td><form:input path="pname" value="${patient.pname}"/></td>
			</tr>


			<tr>
				<td>Age</td>
				<td><form:input path="age" value="${patient.age}"/></td>
			</tr>
			
			<tr>
				<td>city</td>
				<td><form:input path="city" value="${patient.city}"/></td>
            </tr>

			<tr>
			
				<td>Phone No</td>
				<td><form:input path="phoneNo" value="${patient.phoneNo}"/></td>
            </tr>
            
            <tr>
			
				<td>E-Mail</td>
				<td><form:input path="email" value="${patient.email}"/></td>
            </tr>
            
              <tr>
			
				<td>PIN</td>
				<td><form:input path="pin" value="${patient.pin}"/></td>
            </tr>

			<tr>
				<td><input type="submit" value="Update"></td>
			</tr>
    </table>
  </form:form>
</center>
</body>
</html>