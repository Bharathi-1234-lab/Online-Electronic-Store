package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO
{
public int insertProduct(ProductBean bean) throws Exception
{
	int rowCount=0;
	try 
	{
		Connection con=DBConnect.getCon();
		PreparedStatement pstmt=con.prepareStatement("insert into product values(?,?,?,?,?)");
		pstmt.setString(1, bean.getP_code());
		pstmt.setString(2, bean.getP_name());
		pstmt.setString(3, bean.getP_company());
		pstmt.setString(4, bean.getP_price());
		pstmt.setString(5, bean.getP_qty());
		rowCount=pstmt.executeUpdate();
	}
	catch(Exception e) 
	{
		throw e;
	}
	
	return rowCount;
}
}
