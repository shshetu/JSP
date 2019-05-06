<%-- 
    Document   : index
    Created on : May 6, 2019, 2:16:43 PM
    Author     : J2EE 37
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello 
     <c:out value="${fn:toUpperCase(sessionScope['loginUser'])}"></c:out>
        </h1>
    </body>
</html>
