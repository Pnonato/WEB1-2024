<%@page import="br.edu.ifsp.arq.tsi.arqweb1.conteudo4.model.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, br.edu.ifsp.arq.tsi.arqweb1.conteudo4.model.Person"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listagem de Pessoas</title>
<link rel="stylesheet" type="text/css" href="Styles.css">
</head>
<body>
    <c:choose>
    	<c:when test="${fn:length(list) > 0 }">
    		
	    		 <table> 
	        <tr> 
	        	<th>#</th>
	            <th>Nome</th>
	            <th>CPF</th>
	            <th>Email</th>
	        </tr>
	        
	       <c:forEach var="person" items="${list}" varStatus="cont">
	       			
	            <tr> 
	          		<td>${cont.count}</td>
	                <td>${person.name}</td>
	                <td>${person.cpf}</td>
	                <td>${person.email }</td>
	            </tr>       
	       
	       			
	       			
	       </c:forEach>
	       
	    
	        
	    </table>
    	
    	</c:when>
    	
    	   <c:otherwise>
	       		<c:out value="sem pessoas cadastradas"></c:out>
	       </c:otherwise>
    	
    </c:choose>
   
</body>
</html>
