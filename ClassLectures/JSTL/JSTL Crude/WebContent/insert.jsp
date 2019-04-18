<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- taglib -->
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
<form action="insertdb.jsp" method="post">
<table border="0" cellspacing ="2" cellpadding = "5">
<!-- Head -->
<thead>
<tr>
<th colspan = "2">Purchase Product</th>
</tr>
</thead>

<!-- Product Name  -->
<tbody>
<tr>
<td><label>Product Name</label></td>
<td><input type="text" name="pname"></td>
</tr>

<!-- Quantity  -->
<tr>
<td><label>Quantity</label></td>
<td><input type="text" name="qty"></td>
</tr>
<tr>
<td><input type="submit" value ="Save"></td>
<td><input type="reset" value ="reset"></td>
</tr>

</tbody>
</table>
</form>

<font color = "red">
<c:if test="${not empty param.errMsg }">
<c:out value="${param.errMsg }"/>
<a href="index.jsp">Go Back</a>
</c:if>
</font>
<font color="green"><c:if test="${not empty param.susMsg }">
<c:out value="${param.susMsg }"></c:out>
<a href="index.jsp">Go Back</a>
</c:if>

</font>
</body>
</html>