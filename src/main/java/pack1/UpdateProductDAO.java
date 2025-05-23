package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProductDAO 
{
public int updateProduct(ProductBean pbean) 
{
	int rowCount=0;
	try 
	{
	Connection con=DBConnect.getCon();
	PreparedStatement pstmt=con.prepareStatement("update product set pprice=?,pqty=? where pcode=? ");
	
	pstmt.setString(1,pbean.getP_price());
	pstmt.setString(2,pbean.getP_qty());
	pstmt.setString(3,pbean.getP_code());
	
	rowCount=pstmt.executeUpdate();
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
	return rowCount;
}
}
