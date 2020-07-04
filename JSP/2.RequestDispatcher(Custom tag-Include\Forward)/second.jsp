<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.print("First message from second jsp page");
String s1=request.getParameter("user");
out.print("user is "+s1+"<br>");
 %>
 	<jsp:include page="third.jsp">
 	</jsp:include>
 <%= "Second message from second jsp page" %>
</body>
</html>