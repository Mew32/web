<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="domain.FilmDb, domain.Film"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="${pageContext.request.contextPath}/css.jsp"/>
<title>Movie Tracker</title>
</head>
<body>
	<div id="pagewrapper">
	<jsp:include page="${pageContext.request.contextPath}/header.jsp">
		<jsp:param name="page" value="home"/>
    </jsp:include>
	<main>
		<article>
			<h2>Movie Tracker</h2>
			<% String name = FilmDb.getInstance().getBestFilm().getName();
			if (name != null){%>
				<p>The best movie is <%= name  %></p>
			<% }else{  %>
				<p>There is no best movie yet.</p>
			<% } %>
			<p><a href="${pageContext.request.contextPath}/overview.jsp">Overview</a></p>
		</article>
	</main>
	</div>
</body>
</html>