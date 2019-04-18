<%@ page import="java.io.*,java.util.*,java.sql.*" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JInsert Operation</title>
</head>
<body>
<c:if test="${empty param.pname or empty param.qty }">
<c:redirect url="insert.jsp">
<c:param name="errMsg" value="Please Enter Product and Quantity"></c:param>
</c:redirect>
</c:if>

<sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost/jstlcrud" user="root" password="1234"
/>

<sql:update dataSource="${dbsource }" var="result">
insert into product(pname, quantity) values (?,?);
<sql:param value="${param.pname }"></sql:param>
<sql:param value="${param.qty }"></sql:param>
</sql:update>

<c:if test="${result>=1 }">
<font size="5" color='green'>Congratulations! Data inserted successfully.</font>
</c:if>
</body>
</html>