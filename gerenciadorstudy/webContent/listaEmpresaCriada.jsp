<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE hmtl>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
   <h3>Lista de empresas: </h3> 

    <ul>
        <c:forEach items="${empresas}" var="empresa">
            <li>${empresa.nome} | <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
            <a href="/gerenciadorstudy/mostraEmpresa?id=${empresa.id}"> atulizar </a> | 
            	<a href="/gerenciadorstudy/removeEmpresa?id=${empresa.id}"> remove </a>  
            </li>
        </c:forEach>
    </ul>
            <a href="/gerenciadorstudy/FormNovaEmpresa.jsp"> Nova empresa </a>  
</body>
</html>