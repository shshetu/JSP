<html>
<body>
<%! 
//Method declaration
//Normal Java code
String makeItLower(String data){
	return data.toLowerCase();	
}

%>

Lower case "Hello World": <%=makeItLower("Hello World") %>
</body>
</html>