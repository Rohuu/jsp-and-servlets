<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Testing JSPs</h3>

<%!
// inside this declaration we can write any method which will be availble for all java declarations
// since all codes inside script tags are treated as code inside doGet method
// that's why we don't write methods inside these tags coz we can't have method defined inside another methods
// that's why we write methods inside definition tags so that it stays outside of doGet method
 public int add(int a,int b){
	return a+b;
}

%>
<%
// every JSP is a different way to write a servlet
// once we save and deploy JSP, tomcat takes that jsp and converts it to servlet and its the servlet that runs
// whatever we write inside these tags , tomcat convets that code to, code inside doGet method that it generates for servlet.
// and in between static text, tomcat treats those text as, writer.println("");   ..... and prints it. 
int f=add(45,45);

%>
<br>

The value of f is: <%=f%>!
<%

out.println("Java code inside JSP file");
int i=1;
int j=3;
int k;
k=i+j;
// either print here using out.println("Sum is: "+k);
out.println("Sum is: "+k+"\n");
// or print outside java code, in html code but keep dynamic part inside java braces..static part we can write like that only .. HTML will render that as text
%>
<br>
Sum is: <%=1+3 %>, this is written in HTML code which is outside java code.

<%
for(int z=0;z<5;z++)
{
	out.println("<br> value is: "+z);
}
// this is simple values printed from loop.
%>

<%
// if we break code inside different tags then also it will be treated as one and will run  
for(int g=0;g<5;g++){
%>

<%
out.println("<br> new value is: "+g);
%>

<%
}
%>

</body>
</html>