import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// doGet uses: when we want to actually getting something from application
	// get method shows parameters in URL only
	// what if too many parameters(tooLengthyURL), what if password is also a parameter(notSecure)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		String userName=request.getParameter("userName");
		printWriter.println("Hello "+userName+ " from GET method!");
	}
	
	
	// doPost uses: when we want to post/submit something to the server & the application has to do some kind of write operation later depending upon the data we have posted
	// like we want to add a user to application
	// edit or delete something
	// when we use it, it causes application to make some changes to the data
	// browser always warns the user that "you have made changes, if you will hit refresh it will go in previous state , just a layer of protection", if after submitting data we press reload button.
	// suppose we made payment from our card, and again we hit reload then browser warns that data has been written so that user might reconsider doing that submission again.  
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
