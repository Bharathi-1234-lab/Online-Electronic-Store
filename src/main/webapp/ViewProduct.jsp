<%@page import="pack1.AdminBean" %>
<%@page import="pack1.ProductBean" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Iterator" %>
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
ArrayList<ProductBean> al=(ArrayList<ProductBean>)application.getAttribute("productList");

out.println("<u>hello"+abean.getFname()+"these are your product details!!!</u><br><br>");
if(al.size()==0)
{
	out.println("products not available");
}
else
{
	Iterator<ProductBean> i=al.iterator();
	while(i.hasNext())
	{
		ProductBean bean=i.next();
		out.println(bean.getP_code()+" "+bean.getP_name()+" "+bean.getP_company()+" "+bean.getP_price()+" "+bean.getP_qty()
		
		+"<a href='edit?pcode="+bean.getP_code()+" '>Edit</a>"+""
		+"<a href='delete?pcode="+bean.getP_code()+"'>Delete</a>"+"<br><br>");
						
	}
}
%>
<a href="logout">Logout</a>

</body>
</html>