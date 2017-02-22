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
			<form method="post" action="mailto:greetje.jongen@ucll.be">
	<p><label for="naam">Uw Naam: <input type="text" size="50" maxlength="30" id="naam" required=""></label></p> 
	<!-- <p><label for="naam">Uw Naam: <input type="text" id="naam" name="naam" value="Typ hier uw naam" title="Uw naam"></label></p>-->
 <p><label>Telefoon: <input type="tel"></label></p>
 <p><label>E-mailadres: <input type="email"></label></p>
 <p><label>Aantal pizza's: <input type="number" min="1" max="10" step="1" value="1"></label></p>
 <p><label>Dag van aflevering (bvb. 02/02/2014): <input type="date"></label></p>
 
 <p><label>Tijdstip van aflevering (bvb. 12:45): <input type="time" min="11:00" max="21:00" step="900"></label></p>
<p>
 <label for="typePizza">Welk soort pizza verkiest u?</label>
 <select id="typePizza" name="typePizza" title="Soort pizza?">
 	<optgroup label="Nieuw">
		<option value="1"> Pizza Samourai </option>
		<option value="2"> Pizza Hamburger </option>
		<option value="3"> Pizza Chicken Twist </option>
	</optgroup>
	<optgroup label="Vegetarisch">
		<option value="4"> Pizza Margherita </option>
		<option value="5"> Pizza Garden Lovers </option>
	</optgroup>
 </select>
</p>

<fieldset>
	<legend> Grootte van de pizza </legend>
	<p><label for="klein"> <input type="radio" name="size" id="klein" checked=""> Klein </label></p>
	<p><label for="medium"> <input type="radio" name="size" id="medium"> Medium </label></p>
	<p><label for="groot"> <input type="radio" name="size" id="groot"> Groot </label></p>
</fieldset>
<fieldset>
  <legend> Garnituur </legend>
  <p><label for="bacon"> <input type="checkbox" name="garnituur" id="bacon"> Bacon </label></p>
  <p><label for="kaas"> <input type="checkbox" name="garnituur" id="kaas"> Extra kaas </label></p>
  <p><label for="champignons"> <input type="checkbox" name="garnituur" id="champignons"> Champignons </label></p>
 </fieldset>
 <p><label>Opmerkingen: <textarea rows="10" cols="30" placeholder="Vul hier uw opmerkingen in"></textarea></label></p>
<p><input type="submit" value="Bestel"></p>
</form>
		</article>
	</main>
</body>
</html>