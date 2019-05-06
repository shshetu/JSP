<%-- 
    Document   : index
    Created on : May 6, 2019, 2:16:43 PM
    Author     : J2EE 37
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Authenticate Page</title>
    </head>
    <body>
        <c:if test="${empty param.username or empty param.password}">
            <c:redirect url="login.jsp">
                <c:param name="errMsg" value="Please Enter Username and Password"></c:param>
            </c:redirect>
            
        </c:if>
        <c:if test="${not empty param.username and !empty param.password}">
            <sql:setDataSource var="ds" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/jstllogin" user="root" password="1234"/>
            <sql:query dataSource="${ds}" var="selectQ">
                select count(*) as kount from users where username='${param.username}' and password ='${param.password}'
            </sql:query>
            <c:forEach items="${selectQ.rows}" var="r">
            
            <c:choose>
                <c:when test="{r.kount > 0 }">
                    <c:set scope="session" var="loginUser" value="${param.username}"/>
                    <c:redirect url="index.jsp"/>
                </c:when>  
                <c:otherwise>
                    <c:redirect url="login_my.jsp">
                    <c:param name="errMsg" value="Username/password does not match"/>
                    </c:redirect>
                </c:otherwise>
            </c:choose>
                </c:forEach>
        </c:if>
    </body>
</html>