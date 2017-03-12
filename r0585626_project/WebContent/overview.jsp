<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="domain.FilmDb, domain.Film"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="css.jsp"/>
<title>Overview - Movie Tracker</title>
</head>
<body>
	<div id="pagewrapper">
	<jsp:include page="header.jsp">
		<jsp:param name="page" value="overview"/>
    </jsp:include>
	<main>
		<article>
			<h2>Overview</h2>
			<div style="overflow-x:auto;">
			<table>
			<tr><th>Name</th>
			<th>Total Episodes</th>
			<th>Watched Episodes</th>
			<th>Rating</th></tr>
			<% for(Film f : FilmDb.getInstance().getFilms()){
				%> <tr>
					<td><%= f.getName() %></td>
					<td><%= f.getTotalLength()%></td>
					<td><%= f.getWatchedLength()%></td>
					<td><%= f.getRating() %></td>
				</tr> <%
			}%>
			</table>
			</div>
		</article>
	</main>
	</div>
</body>
</html>