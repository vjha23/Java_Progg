package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
public class Squared_Servlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	int k=0;
	//HttpSession session=req.getSession();
	//int k=(int)session.getAttribute("k");
	Cookie cookies[]=req.getCookies();
	for(Cookie c:cookies) {
		if(c.getName().equals("k")) {
			k=Integer.parseInt(c.getValue());
		}
	}
	
	k=k*k;
	PrintWriter out=res.getWriter();
	out.println("result is: "+k);
	System.out.println("Sq called");
}
}
