<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="domain.model.Film, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="css.jsp"/>
<title>Overview - Movie Tracker</title>
</head>
<body>
	<div id="pagewrapper">
	<jsp:include page="header.jsp">
		<jsp:param name="page" value="Overview"/>
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
			<% Object filmsObject = request.getAttribute("films");
				try {
					List<Film> films = (List<Film>) filmsObject;
					for(Film f : films){
						%> <tr class="<%= f.getCompoundName() %>">
							<td><%= f.getName() %></td>
							<td><%= f.getTotalLength()%></td>
							<td><%= f.getWatchedLength()%></td>
							<td><%= f.getRating() %></td>
						</tr> <%
					}
				} catch (Exception e){
					%>
					<tr><td>Error</td><td>Error</td><td>Error</td><td>Error</td></tr>
					<%
				}
			%>
			
			</table>
			
			<p>De totale waarde van alle casinobedragen kleiner dan 1000 bedraagt <%= request.getAttribute("jackpot") %> euro.</p>
			</div>
		</article>
	</main>
	<jsp:include page="footer.jsp"/>
	</div>
</body>
</html>