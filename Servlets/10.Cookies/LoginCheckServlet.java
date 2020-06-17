

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

/**
 * Servlet implementation class LoginCheckServlet
 */
@WebServlet("/LoginCheckServlet")
public class LoginCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("user");
		String s2=request.getParameter("pass");
		String s3=request.getParameter("km");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","vijay");
			PreparedStatement pst=conn.prepareStatement("select * from login where name=? and pass=?");
			pst.setString(1, s1);
			pst.setString(2, s2);
			ResultSet rst=pst.executeQuery();
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			if(rst.next()) {
				conn.close();
				out.print("<h1>Welcome to the page</h1>");	
				if(s3!=null&&s3.equalsIgnoreCase("km")) {
					Cookie c1=new Cookie("name",s1);
					c1.setMaxAge(3*60);
					Cookie c2=new Cookie("pass",s2);
					c2.setMaxAge(3*60);
					response.addCookie(c1);
					response.addCookie(c2);
				}
			}
			else {
				conn.close();
				out.print("<h1>Invalid user name or password<h1/>");
				RequestDispatcher rd=request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		
	}

}
