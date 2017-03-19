<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="domain.db.FilmDb, domain.Film"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="css.jsp"/>
<title>Result page - Movie Tracker</title>
</head>
<body>
	<div id="pagewrapper">
	<jsp:include page="header.jsp">
		<jsp:param name="page" value="home"/>
    </jsp:include>
	<main>
		<article>
			<h2>Movie Tracker</h2>
			<p> You added: </p>
			<p id="name"><%= request.getParameter("name") %></p>
			<p id="total"><%= request.getParameter("total") %></p>
			<p id="watched"><%= request.getParameter("watched") %></p>
			<p id="rating"><%= request.getParameter("rating") %></p>
			<p><a href="${pageContext.request.contextPath}/overview.jsp">Overview</a></p>
		</article>
	</main>
	</div>
</body>
</html>