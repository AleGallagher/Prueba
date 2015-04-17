<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<body>
	<form:form method="POST" commandName="equipo">
		
		<h1>Grupo: ${mensaje}</h1>
		
		Nombre
		<td><form:input path="nombre" /></td>
		<td><form:errors path="nombre" cssClass="error" /></td>
		
		Pais
		<td><form:input path="pais" /></td>
		<td><form:errors path="pais" cssClass="error" /></td>
			
		Numero
		<td><form:input path="numero" /></td>
		<td><form:errors path="numero" cssClass="error" /></td>
		
		<td colspan="3"><input type="submit" /></td>
		
	</form:form>
	</body>
</body>
</html>