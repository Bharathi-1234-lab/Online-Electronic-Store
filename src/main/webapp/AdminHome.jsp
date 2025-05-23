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
<%
AdminBean bean=(AdminBean)session.getAttribute("abean");
out.println("Welcome ms."+bean.getFname()+"<br><br>");
%>
<a href="AddProduct.html">Add Product</a><br><br>
<a href="view1">ViewProduct</a><br><br>
<a href="logout">Logout</a><br><br>
</center>
</body>
</html>