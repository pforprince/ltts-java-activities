<%@page import="com.domain.models.User"%>
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
		User user= (User) session.getAttribute("user");
	if(user==null){
		response.sendRedirect("Login.jsp");
		return;
	}
	%>


<form action="AddProductionServlet" method='post'>
Name: <input type='text' name='name'>
Address: <input type='text' name='address'>
Year: <input type='text' name='year'>
Owner Name: <input type='text' name='ownername'>
<button type='submit'>Save</button>
</form>

</body>
</html>