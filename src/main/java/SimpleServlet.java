

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SimpleServlet
 */

@WebServlet(description="SimpleServlet", urlPatterns= {"/SimpleServletPath"})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String userName=request.getParameter("name");
		HttpSession session=request.getSession();
		if(userName!="" && userName!=null) {
		session.setAttribute("savedUserName",userName);
		}
		writer.println("Request parameter has username as "+userName);
		writer.println("Session parameter has username as "+(String) session.getAttribute("savedUserName"));
		// session.setAttributes sets the value of parameter
		// session.getattributes saves the last inserted value to the session and remembers it 
		
	}

}
