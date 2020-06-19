

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
			Statement stm=conn.createStatement();
			ResultSet rst=stm.executeQuery("select * from student");
			PrintWriter out=response.getWriter();
			out.print("<html><body><table border='2'>");
			while(rst.next()) {
				out.print("<tr>");
				out.print("<td>"+rst.getString(1)+"</td>");
				out.print("<td>"+rst.getString(2)+"</td>");
				out.print("<td>"+rst.getString(3)+"</td>");
				out.print("<td><a href='EditServlet?roll="+rst.getInt(1)+"'>Edit</a></td>");
				out.print("<td><a href='DeleteServlet?roll="+rst.getString(1)+"'>Delete</a></td>");
				out.print("</tr>");
			}
			out.print("</table>");
			out.print("<a href='AddNewServlet'>Add New</a>");
			stm.close();
			conn.close();
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
