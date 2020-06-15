/*
 * This page is all about getting the request without session and how the data is loss 
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("nm");
		String s2=request.getParameter("cont");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<form action='MyServlet2?nm="+s1+"&cont="+s2+"' method='post'>");
		out.print("Email <input type='text' name='email'/><br/ >");
		out.print("<input type='submit' name='b2' value='submit'");
		out.print("</form> </body> </html>");
	}

}
