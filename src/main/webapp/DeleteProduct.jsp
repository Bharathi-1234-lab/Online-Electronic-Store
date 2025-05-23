<%@page import="pack1.AdminBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>
<% 
AdminBean abean=(AdminBean)session.getAttribute("abean");
String data=(String)request.getAttribute("msg");
out.println("Hello"+abean.getFname()+" "+data+"<br><br>");
%>
<a href="AdProduct.html">Add Product</a><br><br>
<a href="view1">ViewProduct</a><br><br>
<a href="logout">Logout</a><br><br>
</h1></center>
</body>
</html>