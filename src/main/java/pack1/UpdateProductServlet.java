package pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet
{
	@Override
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	HttpSession session=req.getSession(false);
	if(session==null) 
	{
		req.setAttribute("msg", "session expierd");
		req.getRequestDispatcher("AdminLogin.html").forward(req,res);
	}
	else 
	{
		String P_code=req.getParameter("p_code");
		ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("productList");
		ProductBean pbean=null;
		Iterator<ProductBean>i=al.iterator();
		while(i.hasNext()) 
		{
			pbean =i.next();
			if(P_code.equals(pbean.getP_code()));
				break;
		}
		pbean.setP_price(req.getParameter("p_price"));
		pbean.setP_qty(req.getParameter("p_qty"));
		
		int rowCount=new UpdateProductDAO().updateProduct(pbean);
		if(rowCount>0) 
		{
			req.setAttribute("msg","data updated successfully");
			req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
		}
	}
}
}
