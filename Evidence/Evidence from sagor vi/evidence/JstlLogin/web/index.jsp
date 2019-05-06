<%-- 
    Document   : login
    Created on : Apr 18, 2019, 3:07:59 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Page!</title>
    </head>
    <body>
        <h1>Hello!
        <c:out value="${fn:toUpperCase(sessionScope['loginUser'])}"></c:out>
        </h1>
        <c:if test="${empty sessionScope['loginUser']}">
            <c:redirect url="login.jsp"/>
        </c:if>
        <a href="login.jsp">Logout
            
        </a>
    </body>
</html>
