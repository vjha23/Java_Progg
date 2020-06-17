

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Cookie c[]=request.getCookies();
		String user="",pass="";
		for(int i=0;c!=null&&i<c.length;i++) {
			if(c[i].getName().equalsIgnoreCase("user"))
				user=c[i].getValue();
			else if(c[i].getValue().equalsIgnoreCase("pass"))
				pass=c[i].getValue();
		}
		if(!user.equals("")&&!pass.equals("")) {
			RequestDispatcher rd=request.getRequestDispatcher("/LoginCheckServlet?user="+user+"&pass="+pass+"");
			rd.include(request, response);
		}
		else {
			out.print("<form action='LoginCheckServlet' method='post'>");
			out.print("User<input type='text' name='user'/><br/>");
			out.print("Pass<input type='text' name='pass'/><br/>");
			out.print("<input type='submit' name='b1' value='login'/><br/>");
			out.print("<input type='checkbox' name='km' value='km'/>Keep me Signed in");
			out.print("</form>");
		}
		
	}

}
