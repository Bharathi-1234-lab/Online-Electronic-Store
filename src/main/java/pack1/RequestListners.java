package pack1;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
//@WebListener
public class RequestListners  implements ServletRequestListener,ServletRequestAttributeListener
{
	@Override
public void requestInitialized(ServletRequestEvent sre) 
{
System.out.println("Request object created");	
}
	@Override
public void requestDestroyed(ServletRequestEvent sce) 
{
	System.out.println("Request object destroyed");
}
@Override
public void attributeAdded(ServletRequestAttributeEvent srae) 
{
	System.out.println("Attribute added to the request object");
	String name=srae.getName();
	System.out.println("Attribute Name :"+name);
}
@Override
public void attributeRemoved(ServletRequestAttributeEvent srae) 
{
	System.out.println("Attribute removed from servletRequest object");
}
}
