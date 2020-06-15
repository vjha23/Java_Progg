

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckUserServlet
 */
@WebServlet("/CheckUserServlet")
public class CheckUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		String pass2=request.getParameter("pass2");
		PrintWriter out=response.getWriter();
		if(!pass.equals(pass2)) {
			out.println("press and retype pass mismatch");
			RequestDispatcher rd=request.getRequestDispatcher("./signup.html");
			rd.include(request, response);
			return;
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","vijay");
			PreparedStatement pst=conn.prepareStatement("insert into login(name,pass) values(?,?)");
			pst.setString(1,user);
			pst.setString(2, pass);
			int cnt=pst.executeUpdate();
			if(cnt==1) {
				RequestDispatcher rd=request.getRequestDispatcher("/index.html");
				rd.include(request, response);
				out.println("Inserted successfully");
			}else {
				out.println("insert record failure");
				RequestDispatcher rd=request.getRequestDispatcher("/signup.html");
				rd.include(request, response);
			}	
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
