<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--
	String s1=request.getParameter("user");
	String s2=request.getParameter("pass");
	User u1=new User();
	u1.setUserId(s1);
	u1.setPassword(s2);
	u1.check();
	String s3=u1.getResult();
	out.println(s3);
	
--%>


	<jsp:useBean id="u1" class="Pojo.User"></jsp:useBean>
	<jsp:setProperty property="userId" name="u1" param="user"/>
	<jsp:setProperty property="password" name="u1" param="pass"/>
	<%
		u1.check();
	%>
	Result is:<jsp:getProperty property="result" name="u1"/>
</body>
</html>