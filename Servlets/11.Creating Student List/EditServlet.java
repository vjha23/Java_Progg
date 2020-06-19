

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int roll=Integer.parseInt(request.getParameter("roll"));
		String name="";
		float per=0;
		PrintWriter out=response.getWriter();
		out.print("<html><body><form action='SaveEditDisplay' method='post'>");
		out.print("Roll <input type='text' name='roll' value='"+roll+"' readonly='readonly'/> <br/>");
		out.print("Name <input type='text' name='name' value='"+name+"'/> <br/>");
		out.print("Per <input type='text' name='per' value='"+per+"'/> <br/>");
		out.print("<input type='submit' name='b1' value='update'/>");
		out.print("</form></body></html>");
	}

}
