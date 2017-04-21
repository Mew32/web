<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="css.jsp"/>
<title>Result page - Movie Tracker</title>
</head>
<body>
	<div id="pagewrapper">
	<jsp:include page="header.jsp">
		<jsp:param name="page" value="Jackpot"/>
    </jsp:include>
	<main>
		<article>
			<h2>Winnaar jackpot</h2>
			<p>Proficiat! Je wint de jackpot van <span class="bedrag"><%=request.getAttribute("jackpot") %></span> euro!</p>
		</article>
	</main>
	</div>
</body>
</html>