

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet("/ValidationServlet")
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double x=0,y=0;
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		try {
			x=Double.parseDouble(request.getParameter("n1"));
			y=Double.parseDouble(request.getParameter("n2"));
			String s1=request.getParameter("b1");
			request.setAttribute("x", x);
			request.setAttribute("y", y);
			if(s1.equalsIgnoreCase("sum")) {
				RequestDispatcher rd=request.getRequestDispatcher("/SumServlet");
				rd.include(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("/AvgServlet");
				rd.include(request, response);
			}
					
		}
		catch(NumberFormatException e) {
			out.print("invalid input");
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}

}
