<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
</head>
<body>
estoy en la lista de toDos
<br><br>
<a href="/agregar">Agregar Elemento</a>
<br><br>
<a href="/eliminar">Eliminar Elemento</a>
<br><br>
<!--provide an html table start tag -->
   <table style="border: 1px solid;">
   <!-- iterate over the collection using forEach loop -->
   <c:forEach var="user" items="${toDos}">
       <!-- create an html table row -->
       <tr>
       <!-- create cells of row -->
       <td>${user.id}</td>
       <td>${user.user}</td>
       <td>${user.desc}</td>
       <td>${user.targetDate}</td>
       <!-- close row -->
       </tr>
       <!-- close the loop -->
   </c:forEach>
   <!-- close table -->
   </table>
</body>
</html>