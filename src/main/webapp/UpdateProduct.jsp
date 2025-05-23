<%@page import="pack1.AdminBean" %>
<%@page import="pack1.ProductBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>

<% 
AdminBean abean=(AdminBean)session.getAttribute("abean");
ProductBean pbean=(ProductBean)request.getAttribute("pbean");
String data=(String)request.getAttribute("msg");

out.println("hello"+abean.getFname()+"<br>");
out.println(data+"<br>");
%>
<a href="AddProduct.html">Add Product</a><br><br>
<a href="view1">ViewProduct</a><br><br>
<a href="logout">Logout</a><br><br>
</body>
</center>
</html>