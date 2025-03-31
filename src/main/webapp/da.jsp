<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String sal=request.getParameter("Salary");
		double da=Integer.parseInt(sal)*0.1;
	%>
	<jsp:forward page="srv1">
	<jsp:param value="<%= da %>" name="p1" />
	</jsp:forward>
</body>
</html>