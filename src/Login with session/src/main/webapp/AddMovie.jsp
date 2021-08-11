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
	
	<form action='AddMovieServlet' method='post'>
	Name:<input type='text' name='name'>
	Heroname: <input type='text' name='heroname'>
	Heroine: <input type='text' name='heroine'>
	Release Date: <input type='date' name='releasedate'>
	Language: <input type='text' name='language'>
	Length: <input type='number' name='length'>
	Movie Type: <input type='text' name='movietype'>
	<button type='submit'>Submit</button>
	</form>
	
</body>
</html>