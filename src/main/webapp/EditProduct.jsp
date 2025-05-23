<%@page import="pack1.AdminBean" %>
<%@page import="pack1.ProductBean" %>
<%@page import="java.util.ArrayList" %>
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
AdminBean abean=(AdminBean)session.getAttribute("abean");
ProductBean pbean=(ProductBean)request.getAttribute("pbean");

out.println("<u>Hello"+abean.getFname()+"please edit</u><br><br>");
%>
<form action="update" method="post">
Product price <input type="text" name=p_price value="<%=pbean.getP_price() %>"><br><br>
Product quantity<input type="text" name=p_qty value="<%=pbean.getP_qty() %>"><br><br>

<input type="hidden " name=p_code value="<%=pbean.getP_code() %>"><!--hidden form field -->
<input type="submit" value="update">
</form>
</center>
</body>
</html>