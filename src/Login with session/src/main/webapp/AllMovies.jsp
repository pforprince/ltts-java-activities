<%@page import="com.domain.models.User"%>
<%@page import="com.domain.daos.MovieDao"%>
<%@page import="com.domain.models.Movie"%>
<%@page import="java.util.List"%>
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

	<%
	MovieDao movieDao = new MovieDao();
	List<Movie> allMovies = movieDao.getAllMovies();
	%>

	<table>
		<tr>
			<th>Name</th>
			<th>HeroName</th>
			<th>Heroine</th>
			<th>Type</th>
			<th>Language</th>
			<th>Length</th>
			<th>Release Date</th>
			<th>Production Id</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<%
		for (Movie movie : allMovies) {
		%>
		<tr>
			<td><%=movie.getMovieName()%></td>
			<td><%=movie.getHeroName()%></td>
			<td><%=movie.getHeroine()%></td>
			<td><%=movie.getMovieType()%></td>
			<td><%=movie.getLanguage()%></td>
			<td><%=movie.getLength()%></td>
			<td><%=movie.getReleaseDate()%></td>
			<td><%=movie.getProductionId()%></td>
			<td><a href='DeleteMovieServlet?id=<%=movie.getMovieId()%> '>Delete</a></td>
<td><a href='UpdateMovie.jsp?id=<%=movie.getMovieId()%> '>Update</a></td>
		</tr>
		<%
		}
		%>

	</table>

</body>
</html>