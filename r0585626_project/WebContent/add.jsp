<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="WEB-INF/css.jsp"/>
<title>Add Page - Movie Tracker</title>
</head>
<body>
	<div id="pagewrapper">
<jsp:include page="WEB-INF/header.jsp">
		<jsp:param name="page" value="Add"/>
    </jsp:include>
	<main>
		<article>
			<h2>Add a new series.</h2>
			<div id="errors">
			<%
			Object errorsO = request.getAttribute("errors");
			try{
				List<?> errors = (List<?>) errorsO;
				for(Object o : errors){
					try{
						%> <p><%= (String) o %></p> <%
					}finally{
						
					}
				}
			}catch(Exception e){
				
			}
			%>
			</div>
			<form METHOD="POST" action="FilmServlet">
			    <p>
			        <label for="naam">Series name:
			            <input type="text" size="50" maxlength="30" id="naam" required name="name">
			        </label>
			    </p>
			    <p>
			        <label for="total_eps">Amount of episodes:
			            <input id="total_eps" type="number" min="1" step="1" required name="total">
			        </label>
			    </p>
			    <p>
			        <label for="watched_eps">#Episodes watched:
			            <input id="watched_eps" type="number" min="1" step="1" required name="watched">
			        </label>
			    </p>
			    <p>
			        <label for="rating">Rating:
			            <input id="rating" type="number" min="0" max="10" step="0.01" value="1" required name="rating">
			        </label>
			    </p>
			    <p>
			        <input type="submit" id="submitbtn" class="submitbtn" value="Save">
			    </p>
			</form>
		</article>
	</main>
	<jsp:include page="WEB-INF/footer.jsp"/>
	</div>
</body>
</html>