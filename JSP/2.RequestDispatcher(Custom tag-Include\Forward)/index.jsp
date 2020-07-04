<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= "First message from jsp page<br>" %>
<%--
RequestDispatcher rd=request.getRequestDispatcher("/second.jsp?user=scott&pass=tiger")
rd.forward(request,response);
// or
--%>
		<jsp:forward page="second.jsp">
			<jsp:param name="user" value="scott"></jsp:param>
			<jsp:param name="pass" value="tiger"></jsp:param>
		</jsp:forward>
</body>
</html>