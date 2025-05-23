package pack1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/aps")
public class AddProductServlet extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	try 
	{
		HttpSession session=req.getSession(false);
		if(session==null) 
		{
			req.setAttribute("msg","Admin session expierd");
			req.getRequestDispatcher("AdminLogin.html").forward(req, res);
		}
		else 
		{
			ProductBean pbean=new ProductBean();
			pbean.setP_code(req.getParameter("pcode"));
			pbean.setP_name(req.getParameter("pname"));
			pbean.setP_company(req.getParameter("pcompany"));
			pbean.setP_price(req.getParameter("pprice"));
			pbean.setP_qty(req.getParameter("pqty"));
			
			int rowCount=new AddProductDAO().insertProduct(pbean);
			if(rowCount>0) 
			{
				req.setAttribute("msg", "data inserted");
				req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
			}
		}	
		}	
	
	catch(Exception e) 
	{
		
	System.out.println("we are in the catch block");
		req.setAttribute("msg","Duplicate product ID are not allowed");
		req.getRequestDispatcher("Error.jsp").forward(req, res);
	}

}
}