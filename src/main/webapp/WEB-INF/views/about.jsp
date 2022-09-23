<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<marquee><h1 style="color:red">learn code with Durgesh</h1></marquee>

<h1>Sending data view to controller</h1>
<h1>Name is Salman</h1>
<%
String name=(String)request.getAttribute("name");
%>
<h1> name is <%=name %></h1>
</body>
</html>