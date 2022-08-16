<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
 <%	System.out.println("novaEmpresaCriada"); %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Empresa criada</title>
	</head>
	<body>
		<c:if test="${not empty empresaName}">
		Empresa ${empresaName} cadastrada com sucesso! :)
		</c:if>
		
		<c:if test="${empty empresaName}">
			Nenhuma empresa cadastrada!
		</c:if>
		
		<a href="/gerenciadorstudy/listaEmpresas"> Lista de empresas </a>  
	</body>
</html>