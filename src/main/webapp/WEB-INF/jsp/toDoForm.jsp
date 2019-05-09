<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head></head>
<body>
form todo

<form:form method="post" modelAttribute="ToDo">
		<table>
                  <tr>
                      <td>Id:</td>
                      <td><form:input path="id" type="number"/></td>
                  </tr>
                  <tr>
                      <td>Usuario:</td>
                      <td><form:input path="user" type="Text"/></td>
                  </tr>
                  <tr>
                         <td>Descripción:</td>
                         <td><form:input path="desc" type="text" /></td>
                  </tr>
                  <tr>
                      <td>Fecha:</td>
                      <td><form:input path="targetDate" type="date"/></td>
                   </tr>
                   <tr>
                   <td>Estatus:</td>
                   <td>
                   <form:select path="isDone">
                      <form:option value="true" label="Completa" />
                      <form:option value="false" label="Incompleta" />
                   </form:select>
                   </td>
                   </tr>
                   <tr>
                   <button type="submit">Enviar</button>
                   </tr>
              </table>
	</form:form>
</body>
</html>