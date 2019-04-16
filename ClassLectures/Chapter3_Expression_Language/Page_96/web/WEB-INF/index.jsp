<%-- 
    Document   : index
    Created on : Apr 16, 2019, 5:23:33 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id= "myBean"  class = "MyBean.MyBean" scope="session"></jsp:useBean>
       
        ${20+5}
        ${myBean.name}

    </body>
</html>
