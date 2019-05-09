<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
   <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
     <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
     <style>
    div{
     padding-bottom: 25px;
    }
     </style>
</head>
<body>
<h1>Alta Tarea Nueva</h1>

<form:form method="post" modelAttribute="ToDo">
		<table class="table">
                  <tr>
                  <div class="input-group">
                    <span class="input-group-addon" id="basic-addon1">Id:</span>
                    <form:input type="number" path="id" class="form-control" placeholder="Username" aria-describedby="basic-addon1" />
                  </div>
                  </tr>
                  <tr>
                  <div class="input-group">
                                      <span class="input-group-addon" id="basic-addon1">Usuario:</span>
                                      <form:input type="text" path="user" class="form-control" placeholder="Usuario" aria-describedby="basic-addon1" />
                                    </div>
                  </tr>
                  <tr>
                        <div class="input-group">
                            <span class="input-group-addon" id="basic-addon1">Descripción:</span>
                            <form:input type="text" path="desc" class="form-control" placeholder="Descripción" aria-describedby="basic-addon1" />
                         </div>
                  </tr>
                  <tr>
                  <div class="input-group">
                       <span class="input-group-addon" id="basic-addon1">Fecha:</span>
                       <form:input type="date" path="targetDate" class="form-control" placeholder="Fecha" aria-describedby="basic-addon1" />
                   </div>
                   </tr>
                   <tr>
                   <div class="input-group">
                   <span class="input-group-addon" id="basic-addon1">Estatus:</span>
                   <form:select path="isDone" class="form-control">
                      <form:option value="true" label="Completa" />
                      <form:option value="false" label="Incompleta" />
                   </form:select>
                   </div>
                   </tr>
                   <tr>
                   <button type="submit" class="btn btn-primary mb-2">Enviar</button>
                   </tr>
              </table>
	</form:form>
</body>
</html>