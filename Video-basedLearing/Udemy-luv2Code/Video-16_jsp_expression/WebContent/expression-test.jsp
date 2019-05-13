<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="left"><u>String or Object Expression</u></h1>
Converting a string to uppercase: <%= new String("Hello World").toUpperCase() %>
<br>
<h1 align="left"><u>Mathematical Expression</u></h1>
25 multiplied by 4 equals <%= 25*4 %>

<h1 align="left"><u>Boolean Expression</u></h1>
Is 75 less than 69? <%= 75<69 %>
</body>
</html>