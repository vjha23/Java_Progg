<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!    
// declaration
	double sum(double a,double b){
	return a+b;
	}
	
	double avg(double a,double b){
		return (a+b)/2;
	}
	double result;
%>
<%
// scriplet
			double n1=Double.parseDouble(request.getParameter("n1"));
			double n2=Double.parseDouble(request.getParameter("n2"));
			String b1=request.getParameter("b1");
			if("sum".equalsIgnoreCase(b1)){
			result=sum(n1,n2);
			}else{
				result=avg(n1,n2);
			}
%>
<h1>Result is <%= result %></h1>
</body>
</html>