package com.servlet;
// Send Redirect
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second_Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		int k=a+b;
	//	PrintWriter out=res.getWriter();
	//	out.println("result is"+c);
	//	res.sendRedirect("sq"); // sending a response to client by saying hey, client just go to squared servlet 
		// this is only sending the request to another servlet not sending data but we have to send the data so that we can process on it
		res.sendRedirect("sq?k="+k); // Session management - This is url redirecting
}
}
