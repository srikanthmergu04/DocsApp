<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  <center>

<h1>Doctors List</h1>  

<table border="5" cellpadding= '8' >  
<tr>


<th>ID</th>
<th>Name</th>
<th>Age</th>
<th>Specialization</th>
<th>City</th>
<th>Phone No</th>
<th>E-Mail</th>
<th>PIN</th>

</tr>  
   <c:forEach var="doctor" items="${list}">   
   <tr> 
    
   <td>${doctor.id}</td>  
   <td>${doctor.name}</td>  
   <td>${doctor.age}</td>  
   <td>${doctor.specialization}</td>  
   <td>${doctor.city}</td>  
   <td>${doctor.phNo}</td>
   <td>${doctor.eMail}</td>
   <td>${doctor.pin}</td>
   
   </tr>  
   </c:forEach>  
   </table>
   <br>
   <br>

  <form action = "index.jsp">
<input type = "submit" value = "Homepage">
</form> 
   
   </center>