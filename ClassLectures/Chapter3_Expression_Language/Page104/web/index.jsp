<%-- 
    Document   : index
    Created on : Apr 16, 2019, 6:38:14 PM
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
        <h1>Hello World!</h1>
        ${'${'}10}
        <table border = "1">
            <tr>
                <td><b>Concept</b></td>
                <td><b>El Expression</b></td>
                <td><b>Result</b></td>
            </tr>
            <tr>
                <td>Addition</td>
                <td>${'${'}10 + 10}</td>
                <td>${10 + 10}</td>
            </tr>

            <tr>
                <td>Subtraction</td>
                <td>${'${'}10 - 10}</td>
                <td>${10 - 10}</td>
                
            </tr>
            <tr>
                <td>Multiplication</td>
                <td>${'${'}10 * 10}</td>
                <td>${10 * 10}</td>
                
            </tr>
        </table>
    </body>
</html>
