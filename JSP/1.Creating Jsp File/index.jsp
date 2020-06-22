<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<select name="year">
<%
	for(int i=1990;i<2030;i++)
	{
		if(i==2020){
%>
			<option selected="selected" value="<%=i%>"><%=i%></option>
<%
		}
		else{
%>
			<option value="<%=i%>"><%=i%></option>
<%
		}
	}
%>	
</select>
<form action="second.jsp" method="post">
	No1<input type="text" name="n1"/><br/>
	No2<input type="text" name="n2"/><br/>
	<input type="submit" name="b1" value="sum"/>
	<input type="submit" name="b1" value="avg"/>
</form>
</body>
</html>