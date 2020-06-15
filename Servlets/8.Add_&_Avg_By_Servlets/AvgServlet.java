

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class AvgServlet
 */
@WebServlet("/AvgServlet")
public class AvgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AvgServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double x=(Double)request.getAttribute("x");
		double y=(Double)request.getAttribute("y");
		double avg=(x+y)/2;
		request.setAttribute("op", "avg");
		request.setAttribute("result", avg);
		RequestDispatcher rd=request.getRequestDispatcher("/DisplayServlet");
		rd.include(request, response);
	}

}
