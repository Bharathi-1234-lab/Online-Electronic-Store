package pack1;

import java.io.Serializable;

public class ProductBean  implements Serializable
{
private String p_code,p_name,p_company,p_price,p_qty;

public String getP_code() {
	return p_code;
}

public void setP_code(String p_code) {
	this.p_code = p_code;
}

public String getP_name() {
	return p_name;
}

public void setP_name(String p_name) {
	this.p_name = p_name;
}

public String getP_company() {
	return p_company;
}

public void setP_company(String p_company) {
	this.p_company = p_company;
}

public String getP_price() {
	return p_price;
}

public void setP_price(String p_price) {
	this.p_price = p_price;
}

public String getP_qty() {
	return p_qty;
}

public void setP_qty(String p_qty) {
	this.p_qty = p_qty;
}
public ProductBean() {};
}
