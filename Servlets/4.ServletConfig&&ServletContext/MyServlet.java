/*About the Servlet Config and Servlet Context
 * 
 * 
 */

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		// For local Servlet paramters we use the config
		// setting the response content type
		res.setContentType("text/html");
		// for displaying data over wapsite
		PrintWriter out=res.getWriter();
		// Creating a Config object to access data from web.xml file
		ServletConfig config=getServletConfig();
		out.print("<html><body><h1>");
		// Its tells about the servlet name 
		out.print("<br />Sevlet Name "+config.getServletName());
		// it will tell about the (param name) only the single init parameter we will use this
		out.print("<br /> User is "+config.getInitParameter("user"));
		// it will again tell the init paramter by providing its resp value
		out.print("<br /> Pass is "+config.getInitParameter("pass"));
		// for taking all the values of init parameter at once we will use Enumeration and use this method
		Enumeration en=config.getInitParameterNames();
		while(en.hasMoreElements()) {
			String var=(String)en.nextElement();
			String val=config.getInitParameter(var);
			out.print("<br />"+var+" is "+val);
		}
		// For Global Servlet Paramters we use the context parameter
		ServletContext context =config.getServletContext();
		out.print("<br />Servlet Path is "+context.getContextPath());
		out.print("<br /> Major Version is "+context.getMajorVersion());
		out.print("<br/> Minor Version is "+context.getMinorVersion());
		out.print("<br/> Mime of XML is "+context.getMimeType("WEB-INF/web.xml"));
		out.print("<br/> Realpath of XML is "+context.getRealPath("WEB-INF/web.xml"));
		context.log("Vijay Jha");
		out.print("<br /> Color is "+context.getInitParameter("color"));
		out.print("<br /> Font is "+context.getInitParameter("font"));
		en=context.getInitParameterNames();
		while(en.hasMoreElements()) {
			String var=(String)en.nextElement();
			String val=context.getInitParameter(var);
			out.print("<br />"+var+" is "+val);
		}
		out.print("<br/> ServerInfo is "+context.getServerInfo());
		out.print("<br/> Display name is "+context.getServletContextName());
		
	}
}
