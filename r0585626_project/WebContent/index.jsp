<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="domain.db.FilmDb, domain.model.Film"%>
<!DOCTYPE html>
<%! FilmDb db = new FilmDb();%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="WEB-INF/css.jsp"/>
<title>Movie Tracker</title>
</head>
<body>
	<div id="pagewrapper">
	<jsp:include page="WEB-INF/header.jsp">
		<jsp:param name="page" value="Home"/>
    </jsp:include>
	<main>
		<article>
			<h2>Movie Tracker</h2>
			<% String name = db.getBestFilm().getName();
			if (name != null){%>
				<p>The best movie is <%= name  %></p>
			<% }else{  %>
				<p>There is no best movie yet.</p>
			<% } %>
			<p><a href="${pageContext.request.contextPath}/overview.jsp">Overview</a></p>
		</article>
	</main>
	<jsp:include page="WEB-INF/footer.jsp"/>
	</div>
</body>
</html>