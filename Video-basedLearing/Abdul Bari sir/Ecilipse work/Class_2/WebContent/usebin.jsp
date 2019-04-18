<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Use bean example</h1>
<!-- action tag  to create an object of the class MessageBean-->
<!--id is the identifier or object = useBean  -->
<!--second useBean is the class-->
<jsp:useBean id="useBean" class="usebean.MessageBean" scope="request"></jsp:useBean>
<br>


<!--action tag to call the getProperty() method-->

<!-- Here property attribute will take the value of the private variable -->
<!-- Here name attribute will represent the newly created obejct -->
<jsp:getProperty property="message" name="useBean"/>
<br>

<!--exprssion to call the getProperty() method-->
<%= useBean.getMessage() %>
<br>
<br>

<!--set the expression   -->
<jsp:setProperty property="message" name="useBean" value="New Message"/>
<%= useBean.getMessage() %>
<br>
<br>
<% useBean.setMessage("New Message"); %>
<jsp:getProperty property="message" name="useBean"/>

</body>
</html>