

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
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

@WebServlet(description="SimpleServlet", urlPatterns= {"/SimpleServletPath"}
			, initParams= {@WebInitParam(name="defaultUser", value="johnny")})  // configuring parameters in annotations

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
		ServletContext context=request.getServletContext();
		if(userName!="" && userName!=null) {
		session.setAttribute("savedUserName",userName);
		context.setAttribute("savedUserName",userName);
		}
		writer.println("Request parameter has username as "+userName);
		writer.println("Session parameter has username as "+(String) session.getAttribute("savedUserName"));
		// session.setAttributes sets the value of parameter
		// session.getattributes saves the last inserted value to the session and remembers it 
		// session object helps us to remember parameter till one browser/user only whereas context object helps us remember parameter values across different browsers/users.
		// but it will remember that parameter in that particular browser only, if we try that url/code/application in any other browser then that browser will have no memory of its previous record
		// in order to make application remember the parameter irrespective of the browser, we have to use context object
		writer.println("Context parameter has username as "+ (String) context.getAttribute("savedUserName"));	
		writer.println("init parameter has default username as "+ getServletConfig().getInitParameter("defaultUser"));
	}

}
