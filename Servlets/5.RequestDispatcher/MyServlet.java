package com.servlet;
// About the Request Dispatcher
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/plain");
		out.println("Message 1 from Servlet 1");
		// getting the ServletContext
		ServletContext context=getServletContext();
		// setting the attribute
		context.setAttribute("a", 45);
		// passing the page
		RequestDispatcher rd=context.getRequestDispatcher("/MyServlet2");
		rd.include(request, response);
		out.print("Message 2 from servlet");
		out.close();
		out.println("Hello");
	}

}
