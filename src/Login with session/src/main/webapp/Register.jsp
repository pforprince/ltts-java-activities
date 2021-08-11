<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Register</h2>
<form action="RegisterServlet" method='post'> 
Name: <input name='name' type='text'/>
Email: <input name='email' type='email'>
Phone: <input name='number' type='number'>
<button type='submit'>Submit</button>

</form>

</body>
</html>