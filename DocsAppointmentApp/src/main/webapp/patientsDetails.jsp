<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  <center>

<h1>Patients List</h1>  

<table border="5" cellpadding= '8' >  
<tr>


<th>ID</th>
<th>Name</th>
<th>Age</th>
<th>City</th>
<th>Phone No</th>
<th>E-Mail</th>
<th>PIN</th>

</tr>  
   <c:forEach var="patient" items="${list}">   
   <tr> 
    
   <td>${patient.pid}</td>  
   <td>${patient.pname}</td>  
   <td>${patient.age}</td>  
   <td>${patient.city}</td>  
   <td>${patient.phoneNo}</td>
   <td>${patient.email}</td>
   <td>${patient.pin}</td>
   
   </tr>  
   </c:forEach>  
   </table>
   <br>
   <br>

  <form action = "index.jsp">
<input type = "submit" value = "Homepage">
</form> 
   
   </center>