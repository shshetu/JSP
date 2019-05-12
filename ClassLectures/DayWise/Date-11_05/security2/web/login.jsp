<%-- 
    Document   : login
    Created on : May 11, 2019, 1:50:46 PM
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
        <form id="loginForm" method="post" action="j_security_check">
            <p>
                Username: <input type="text" name="j_username" id="j_username"/><br/>
                Password: <input type="password" name="j_password" id="j_password"/><br/>
                <button type="submit">Login</button>
            </p>
            
        </form>
    </body>
</html>
