<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clock</title>
</head>
<body>
<%@ include file="/Hello.jsp" %>
<% // include keyword includes the mentioned file to the file where include tag is written %>
<br>
The Date and Time is: <%=new Date()
// its import will be added in page directives above
%>
</body>
</html>