<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="domain.FilmDb, domain.Film"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="css.jsp"/>
<title>Error Page - Movie Tracker</title>
</head>
<body>
	<div id="pagewrapper">
	<jsp:include page="header.jsp">
		<jsp:param name="page" value="overview"/>
    </jsp:include>
	<main>
		<article>
			<h2>Error Occured</h2>
			<p>Oops, an error occured.</p>
			<code><%= request.getAttribute("error") %></code>
		</article>
	</main>
	</div>
</body>
</html>