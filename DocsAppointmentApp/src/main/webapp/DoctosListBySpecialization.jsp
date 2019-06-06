<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  <jsp:include page="bookAppointment.jsp" />  
  <center>

<h1>Doctors List</h1>  

<form action = "bookDoctor" method = "post">
<table border="5" cellpadding= '8' >  
<tr>


<th>Select</th>
<th>Name</th>
<th>Age</th>
<th>City</th>
<th>Specialization</th>
<th>Phone NO</th>
<th>E-Mail</th>
</tr>  
   <c:forEach var="doctor" items="${list}">   
   <tr> 
    <input type = "hidden" name = "pid" value = "${pid}">
    <td><input type = "radio" name = "did" value = "${doctor.id}" ></td>
    <td>${doctor.name}</td>  
   	<td>${doctor.age}</td>  
   	<td>${doctor.city}</td>  
   	<td>${doctor.specialization}</td>
   	<td>${doctor.phNo}</td>
    <td>${doctor.eMail}</td>
   
   </tr>  
   </c:forEach>  
   </table>
   <br>
   <br>
   <input type = "submit" value = "Book Appointment">
   </form> 
     
   <br>
  <form action = "index.jsp">
<input type = "submit" value = "Homepage">
</form> 
   
   </center>