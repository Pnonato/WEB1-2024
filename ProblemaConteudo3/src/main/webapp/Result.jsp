<%@page import="br.edu.ifsp.arq.arqweb1.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, br.edu.ifsp.arq.arqweb1.Person"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listagem de Pessoas</title>
<link rel="stylesheet" type="text/css" href="Styles.css">
</head>
<body>
    <% List<Person> persons = (List<Person>)request.getAttribute("list"); %>
    <table> 
        <tr> 
            <th>Nome</th>
            <th>CPF</th>
            <th>Email</th>
        </tr>
        
        <% for(Person person : persons){ %>
            <tr> 
                <td><%= person.getName() %> </td>
                <td><%= person.getCpf() %> </td>
                <td> <%= person.getEmail() %> </td>
            </tr>       
        <% } %>
    </table>
</body>
</html>
