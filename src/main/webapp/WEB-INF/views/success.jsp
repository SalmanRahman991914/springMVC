<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String a=(String)request.getAttribute("id");
String b=(String)request.getAttribute("name");
String c=(String)request.getAttribute("address");
String d=(String)request.getAttribute("email");
%>
<h1> your id is <%= a %></h1>
<h1> your name is <%= b %></h1>
<h1> your address is <%=c %></h1>
<h1> your email is <%=d %></h1>
</body>
</html>