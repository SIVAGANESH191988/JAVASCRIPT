<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%
String s=(String)session.getAttribute("ph");%>
<%
String s1=(String)session.getAttribute("fn");%>
</head>
<body>
<h2><%=s %></h2>
<h3><%=s1 %></h3>
</body>
</html>