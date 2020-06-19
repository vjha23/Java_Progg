

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddNewServlet
 */
@WebServlet("/AddNewServlet")
public class AddNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int maxroll=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
			Statement stm=conn.createStatement();
			ResultSet rst=stm.executeQuery("select max(roll) from student");
			rst.next();
			maxroll=rst.getInt(1);
			stm.close();
			conn.close();
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		PrintWriter out=response.getWriter();
		maxroll++;
		out.print("<html><body><form action='SaveServlet' method='post'>");
		out.print("Roll<input type='text' name='roll' value='"+maxroll+"' readonly='readonly'/> <br/>");
		out.print("Name<input type='text' name='name'/> <br/>");
		out.print("Per<input type='text' name='per'/> <br/>");
		out.print("<input type='submit' name='b1'/>");
		out.print("</form></body></html>");
		
	}

}
