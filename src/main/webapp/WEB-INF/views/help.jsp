
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is first model and view page</h1>
<h1> my name is Salman </h1>
<%
String a=(String)request.getAttribute("name");
 Integer b=(Integer)request.getAttribute("rollnumber");
 
%>
<h1> My Name is <%= a %></h1>
 <h1>my roll number is <%= b %></h1>
</body>
</html>