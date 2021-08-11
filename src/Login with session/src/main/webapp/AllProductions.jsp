<%@page import="com.domain.models.User"%>
<%@page import="com.domain.models.Production"%>
<%@page import="com.domain.daos.ProductionDao"%>
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
	ProductionDao productionDao = new ProductionDao();

	List<Production> allProductions = productionDao.getAllProductions();
	%>

	<table>
		<tr>
			<th>Name</th>
			<th>Address</th>
			<th>Startv year</th>
			<th>Owner name</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<%
		for (Production production : allProductions) {
		%>
		<tr>
			<td><%=production.getProductionName()%></td>
			<td><%=production.getAddress()%></td>
			<td><%=production.getYear()%></td>
			<td><%=production.getOwnerName()%></td>
			<td><a href="DeleteProductionServlet?id=<%=production.getProductionId()%>">Delete</a></td>
			<td><a href='UpdateProduction.jsp=?id=<%= production.getProductionId()%>'>Update</a></td>

		</tr>
		<%
		}
		%>

	</table>

</body>
</html>