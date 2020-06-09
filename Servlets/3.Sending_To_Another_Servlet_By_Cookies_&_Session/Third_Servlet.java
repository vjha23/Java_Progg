package com.servlet;
// Http sesssiion
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Third_Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		int k=a+b;
//		HttpSession session=req.getSession();
//		session.setAttribute("k",k);
		// another way of doing by cookies
		Cookie cookie=new Cookie("k",k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
}
}