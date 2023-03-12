import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML servlet called!");
		response.getWriter().println("XML sevlet calling is now successful");
		// in this process we actually did the configuration not by using annotations but in the web.xml file
		// Tomcat always looks at web.xml file when it starts up, and take note of the configuration from the web.xml file 
	}

}
