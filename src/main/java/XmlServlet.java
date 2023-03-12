import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		String userName=request.getParameter("userName");
		printWriter.println("Hello "+userName+ " from GET method!");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		String userName=request.getParameter("userName");
		String fullName=request.getParameter("fullName");
		printWriter.println("Hello "+userName+" from POST method!");
		printWriter.println("Hello "+fullName+" from POST method!");
		String profession=request.getParameter("profession");
		printWriter.println("You are a "+profession);
//		String location=request.getParameter("location");
//		printWriter.println("You are "+location);
		// by this we can capture only a single location 
		// but in HTML page we have written that we can select multiple locations
		// so for that we will use below method and capture locations in a string array
		String[] location=request.getParameterValues("location");
		printWriter.println("You are "+location.length+" places");
		for(int i=0;i<location.length;i++) {
			printWriter.println(location[i]);
		}
	}
}
