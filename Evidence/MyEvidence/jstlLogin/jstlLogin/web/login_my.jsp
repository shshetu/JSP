<%-- 
    Document   : index
    Created on : May 6, 2019, 2:16:43 PM
    Author     : J2EE 37
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login to our app</title>
    </head>
    <body>
        <h1>Please Login!</h1>
        <form action="loginAuthenticate_my.jsp">
            Username: <input type="text" name="username"/><br>  
            Password: <input type="password" name="password"/><br>  
            <input type="submit" value="Login">
        </form>
        
        <font color="red">
        <c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}"/>
        </c:if>
        </font>
    </body>
</html>
