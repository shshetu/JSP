<%-- 
    Document   : login
    Created on : Apr 18, 2019, 3:17:59 PM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login to our app</title>
    </head>
    <body>
        <h1>Please login</h1>
        <form action="loginAuthenticate.jsp">
            username : <input type="text" name="username"/><br>
            Password : <input type="password" name="password"/><br>
            <input type="submit" value="Login"/>
        </form>
        <font color="red"><c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}" />
        </c:if></font>
    </body>
</html>
