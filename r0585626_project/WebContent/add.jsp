<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="css.jsp"/>
<title>Add Page - Movie Tracker</title>
</head>
<body>
	<div id="pagewrapper">
<jsp:include page="header.jsp">
		<jsp:param name="page" value="add"/>
    </jsp:include>
	<main>
		<article>
			<h2>Add a new series.</h2>
			<form>
	<p><label for="naam">Series name:<input type="text" size="50" maxlength="30" id="naam" required=""></label></p> 
 <p><label for="total_eps">Amount of episodes: <input id="total_eps" type="number" min="1" step="1"></label></p>
 <p><label for="watched_eps">#Episodes watched: <input id="watched_eps" type="number" min="1" step="1"></label></p>
 <p><label for="rating">Rating: <input id="rating" type="number" min="1" max="10" step="1" value="1"></label></p>
 <p><input type="submit" name="submit" id="submitbtn" class="submitbtn" value="Save"></p>
 
</form>
		</article>
	</main>
	</div>
</body>
</html>