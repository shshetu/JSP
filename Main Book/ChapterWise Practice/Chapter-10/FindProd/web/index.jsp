<%-- 
    Document   : index
    Created on : May 6, 2019, 4:23:51 PM
    Author     : J2EE 37
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to Filtering Demo Application!
            This page was processed by the Audit filter and both simple filters. 
            Check the log fort filter output.  </h1>
        </p>
        The page <a href="FindProd.jsp?DEPT = Engineering">FindProd.jsp</a>
   is processed by only the Audit Filter. After accessing FindProd.jsp,
   Check your server log to see the filter output.
  
</body>
</html>
