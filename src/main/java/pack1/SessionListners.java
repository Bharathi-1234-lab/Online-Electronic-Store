package pack1;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class SessionListners implements HttpSessionListener,HttpSessionAttributeListener
{
	@Override
public void sessionCreated(HttpSessionEvent hse) 
{
	System.out.println("session created");
}
	@Override
public void sessionDestroyed(HttpSessionEvent hse) 
{
	System.out.println("session destroyed");
}
	@Override
public void attributeAdded(HttpSessionBindingEvent hsbe) 
{
	System.out.println("Attribute added to the servlet object ");
	String name=hsbe.getName();
	System.out.println("Attribute Name :"+name);
}
	@Override
public void attributeRemoved(HttpSessionBindingEvent hsbe) 
{
	System.out.println("Attribute removed from the servlet object");
}
}
