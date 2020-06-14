

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validation
 */
@WebServlet("/Validation")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// Creating Requestdispatcher object
		RequestDispatcher rd;
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		try {
			// getting the parameters
			double a=Double.parseDouble(request.getParameter("n1"));
			double b=Double.parseDouble(request.getParameter("n2"));
			String b1=request.getParameter("b1");
			// setting the attributes
			request.setAttribute("a", a);
			request.setAttribute("b", b);
			if(b1.equalsIgnoreCase("sum")) {
				rd=request.getRequestDispatcher("/Sum");
			}else {
				rd=request.getRequestDispatcher("/Avg");
			}
			rd.include(request, response);
		}
		catch(NumberFormatException e) {
			out.print("<h1>Invalid Input </h1>");
			rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
			
		}
		
	}

}
