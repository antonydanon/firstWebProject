<%-- 
    Document   : index
    Created on : 1 дек. 2021 г., 18:19:53
    Author     : anton
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NumbersPage</title>
    </head>
    <body>
        <h1>Number:</h1>
        
        <c:forEach var="i" items="${LIST}" >
            <c:out value="${i}"/>
        </c:forEach>
    </body>
</html>