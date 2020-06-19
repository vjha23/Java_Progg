

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveEditDisplay
 */
@WebServlet("/SaveEditDisplay")
public class SaveEditDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveEditDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roll=request.getParameter("roll");
		String name=request.getParameter("name");
		String per=request.getParameter("per");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
			Statement stm=conn.createStatement();
			int cnt=stm.executeUpdate("update student set name='"+name+"',per="+per+" where roll="+roll);
			PrintWriter out=response.getWriter();
			stm.close();
			conn.close();
			if(cnt==1) {
				out.print("Record update successfully");
			}else {
				out.print("Updation Failed");
			}
			RequestDispatcher rd=request.getRequestDispatcher("/DisplayServlet");
			rd.include(request, response);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
