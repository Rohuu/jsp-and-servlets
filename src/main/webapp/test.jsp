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
public int add(int a,int b){
	return a+b;
}

%>
<%

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
</body>
</html>