<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
Hello , 
<% String fullName = request.getAttribute("name").toString();
out.print(fullName);
%>
</h1>

<p>The value of 2*2 = <%= 2*2 %></p>
<p>The value of 6>8 = <%= 6>8 %></p>

<%
for(int i = 0;i<10;i++){
	out.println("<p>The value of i = "+i+"</p>");
	
}
%>

<%!
int calLength(String string){
	return string.length();
}
%>

<p>The length of the string is <%= calLength("shetu") %></p>
</body>
</html>