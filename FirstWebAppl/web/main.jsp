<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NumbersPage</title>
    </head>
    <body>
        <h1>Numbers:</h1>
        
        <c:forEach var="i" items="${LIST}" >
            <c:out value="  ${i}"/></br>
        </c:forEach>
            
        <form method="post">
            </br><input type = "submit" value = "OrderList"/>
        </form>    
    </body>
</html>
