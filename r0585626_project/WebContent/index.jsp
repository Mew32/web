<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="css.jsp"/>
<title>Movie Tracker</title>
</head>
<body>
	<div id="pagewrapper">
	<jsp:include page="header.jsp">
		<jsp:param name="page" value="home"/>
    </jsp:include>
	<main>
		<article>
			<h2>Movie Tracker</h2>
			<p><a href="Overview">Overview</a></p>
		</article>
	</main>
	</div>
</body>
</html>