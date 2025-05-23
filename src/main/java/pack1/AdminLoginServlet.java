package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/alog")
public class AdminLoginServlet  extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	AdminLoginDAO aDAO=new AdminLoginDAO();
	AdminBean bean=aDAO.checkAdminLogin(req.getParameter("a_name"),req.getParameter("a_pwd"));
	
	if(bean==null) 
	{
		req.setAttribute("msg", "Invalid Credentials");
		req.getRequestDispatcher("AdminLoginFailed.jsp").forward(req, res);
	}
	else 
	{
		HttpSession session=req.getSession();
		session.setAttribute("abean",bean);
		req.getRequestDispatcher("AdminHome.jsp").forward(req, res);
	}
}
}
