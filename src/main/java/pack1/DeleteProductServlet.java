package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/delete")

public class DeleteProductServlet extends HttpServlet 
{
	@Override
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	HttpSession session=req.getSession(false);
	if(session==null) 
	{
		req.setAttribute("msg", "session experied");
		req.getRequestDispatcher("AdminLogin.html").forward(req,res);
	}
	else 
	{
		String pcode=req.getParameter("pcode");
		int rowCount=new DeleteProductDAO().deleteProduct(pcode);
		if(rowCount>0) 
		{
			req.setAttribute("msg","product deleted");
			req.getRequestDispatcher("DeleteProduct.jsp").forward(req,res);
		}
	}
}
}
