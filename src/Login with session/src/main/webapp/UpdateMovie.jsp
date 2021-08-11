<%@page import="com.domain.daos.MovieDao"%>
<%@page import="com.domain.models.Movie"%>
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

int id= Integer.parseInt(request.getParameter("id"));
System.out.println(id+"-------------------------------");
MovieDao movieDao= new MovieDao();
Movie movie=movieDao.getMovieById(id);

if(movie==null){
	response.sendRedirect("AllMovies.jsp");
	return;
}
%>

<form action='UpdateMovieServlet' method='post'>
	Name:<input type='text' name='name' value=<%=movie.getMovieName() %>>
	Heroname: <input type='text' name='heroname' value=<%= movie.getHeroName() %>>
	Heroine: <input type='text' name='heroine'  value=<%= movie.getHeroine() %>>
	Release Date: <input type='date' name='releasedate'  value=<%= movie.getReleaseDate() %>>
	Language: <input type='text' name='language'  value=<%= movie.getLanguage() %>>
	Length: <input type='number' name='length'  value=<%= movie.getLength() %>>
	Movie Type: <input type='text' name='movietype'  value=<%= movie.getMovieType() %>>
	<button type='submit'>Submit</button>
	</form>

</body>
</html>