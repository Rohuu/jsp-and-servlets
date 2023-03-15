<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% // we have implicit request, session, context object in JSP %>
<% 
String userName= request.getParameter("name");  // for request object
if(userName!=null){
session.setAttribute("sessionUserName",userName);  // for session object
application.setAttribute("aplicationUserName",userName);   // for context object
// noticed that we don't have to make objects for session, request and context object in JSP
// JSP has all these objects predefined, we just have to call them only..
// code between java tags go to service() method internally in jsp then from there code goes to doGet or doPost method
}
%>
<br>

The user name for request object is: <%=userName %>
The user name for session object is: <%=session.getAttribute("sessionUserName") %>
The user name for context object is: <%=application.getAttribute("aplicationUserName") %>
</body>
</html>