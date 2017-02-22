<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Page - Movie Tracker</title>
</head>
<body>
<jsp:include page="header.jsp"/>
	<main>
		<article>
			<h2>Add a new series.</h2>
			<form>
	<p><label for="naam">Uw Naam: <input type="text" size="50" maxlength="30" id="naam" required=""></label></p> 
	<!-- <p><label for="naam">Uw Naam: <input type="text" id="naam" name="naam" value="Typ hier uw naam" title="Uw naam"></label></p>-->
 <p><label>Telefoon: <input type="tel"></label></p>
 <p><label>E-mailadres: <input type="email"></label></p>
 <p><label>Aantal pizza's: <input type="number" min="1" max="10" step="1" value="1"></label></p>
 <p><label>Dag van aflevering (bvb. 02/02/2014): <input type="date"></label></p>
</form>
		</article>
	</main>
</body>
</html>