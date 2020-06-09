package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First_Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		int k=a+b;
	//	PrintWriter out=res.getWriter();
	//	out.println("result is"+c);
		
		req.setAttribute("k", k);
		// To call another method we resquest dispatacher and second is redirect
		// Request Dispatcher
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.forward(req, res);
	}
}
