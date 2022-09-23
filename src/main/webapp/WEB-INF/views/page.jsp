<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is home page</h1>
<%
String a=(String)request.getAttribute("name");
Integer i=(Integer)request.getAttribute("id");

%>
<h1> your name is <%= a %></h1>
<h1> your id is <%= i %></h1>
</body>
</html>
