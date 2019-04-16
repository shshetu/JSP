<%-- 
    Document   : index
    Created on : Apr 16, 2019, 6:20:31 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <!--Show the values-->
      <!--$ represents it will take values-->
      <h1> Name: ${param['fname']}</h1>
      <h1> Name: ${param['age']}</h1>
        
        <!--First we need fields--> 
        <form action="index.jsp" method="get">
            <input type="text" name="fname"/>
            <input type="number" name="age"/>
            <!--Button needs value-->
            <input type="submit" value="Submit"/>
            
            
        </form>
    </body>
</html>
