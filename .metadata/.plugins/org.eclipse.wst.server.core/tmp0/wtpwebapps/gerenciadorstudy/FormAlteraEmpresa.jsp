<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	  <form action ="<c:url value="/controller?acao=atualizaEmpresa"/>" method="post">	
	  
	  
		Atualizar a empresa: ${empresa.nome} <br>
		Entre com o novo nome: <input type="text" name="nome">
		| ID: ${empresa.id}<input type="hidden" name="id" value="${empresa.id}">
			  <input type="submit">
	</form>
</body>
</html>