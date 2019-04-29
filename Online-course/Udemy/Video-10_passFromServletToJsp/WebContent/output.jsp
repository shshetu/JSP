<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is output file </h1>
<%-- <p>Hello, <%=request.getAttribute("name") %></p> --%>
<h2>Hello my name is: 
<%
String fullName = request.getAttribute("name").toString();
out.println(fullName);
%>
</h2>
</body>
</html>