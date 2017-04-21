package test.view;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import domain.db.*;
import domain.model.Film;
import domain.model.FilmService;


public class FilmAddTest {

	private static final String url = "http://localhost:8080/r0585626_project/";
	private WebDriver driver;
	private FilmService service;
	@Before
	public void setUp () {
		//System.setProperty("webdriver.chrome.driver","C:/Users/User/Desktop/Uni/eclipse/chromedriver.exe");
		driver = new ChromeDriver();
		service = new FilmService(new FilmDb());
	}
	
	@Test
	public void test_AddForm_alles_invullen_gaat_naar_overzicht_en_toont_nieuwe_film_in_tabel () {
		driver.get(url+"add.jsp");
		
		WebElement naamField = driver.findElement(By.id("naam"));
		naamField.clear();
		naamField.sendKeys("Blooberries");
		
		WebElement total = driver.findElement(By.id("total_eps"));
		total.clear();
		total.sendKeys("18");
		
		WebElement watched = driver.findElement(By.id("watched_eps"));
		watched.clear();
		watched.sendKeys("18");

		WebElement rating = driver.findElement(By.id("rating"));
		rating.clear();
		rating.sendKeys("5.0");

		WebElement button = driver.findElement(By.id("submitbtn"));
		button.click();
		
		assertEquals("Overview", driver.findElement(By.tagName("h1")).getText());
		assertFalse(driver.findElements(By.className("Blooberries")).isEmpty());
	}

	@Test
	public void test_AddForm_helemaal_leeg_laten_gaat_terug_naar_formulier () {
		driver.get(url+"add.jsp");

		WebElement button = driver.findElement(By.id("submitbtn"));
		button.click();
		
		assertEquals("Add", driver.findElement(By.tagName("h1")).getText());
	}
	
	@Test
	public void test_AddForm_naam_leeg_laten_gaat_terug_naar_formulier () {
		driver.get(url+"add.jsp");
		
		WebElement naamField = driver.findElement(By.id("naam"));
		naamField.clear();
		
		WebElement total = driver.findElement(By.id("total_eps"));
		total.clear();
		total.sendKeys("18");
		
		WebElement watched = driver.findElement(By.id("watched_eps"));
		watched.sendKeys("18");

		WebElement rating = driver.findElement(By.id("rating"));
		rating.clear();
		rating.sendKeys("5.0");

		WebElement button = driver.findElement(By.id("submitbtn"));
		button.click();

		assertEquals("Add", driver.findElement(By.tagName("h1")).getText());
	}

	@Test
	public void test_AddForm_naam_en_total_eps_leeg_laten_gaat_terug_naar_formulier () {
		driver.get(url+"add.jsp");
		
		WebElement naamField = driver.findElement(By.id("naam"));
		naamField.clear();
		
		WebElement total = driver.findElement(By.id("total_eps"));
		total.clear();
		
		WebElement watched = driver.findElement(By.id("watched_eps"));
		watched.sendKeys("18");

		WebElement rating = driver.findElement(By.id("rating"));
		rating.clear();
		rating.sendKeys("5.0");

		WebElement button = driver.findElement(By.id("submitbtn"));
		button.click();

		assertEquals("Add", driver.findElement(By.tagName("h1")).getText());
	}

	@Test
	public void test_index_toont_berekende_waarde(){
		driver.get(url);
		
		WebElement berekendeWaarde = driver.findElement(By.id("calculated"));
		assertEquals("The best movie is "+service.getBestFilm().getName(), berekendeWaarde.getText());
	}

	@Test
	public void test_overview_toont_opgeslagen_items(){
		driver.get(url + "FilmServlet");
		for(Film f : service.getFilms()){
			WebElement el = driver.findElement(By.cssSelector("."+f.getCompoundName()));
			assertNotNull(el);
		}
	}
	
	@Test
	public void test_html5_valide_paginas(){
		isValidHtml("");
		isValidHtml("FilmServlet");
		isValidHtml("add.jsp");
	}
	
	public void isValidHtml(String urlEnd) {
		driver.get("https://validator.w3.org/#validate_by_uri+with_options");
		WebElement invulveld = driver.findElement(By.id("uri"));
		invulveld.sendKeys("http://java.cyclone2.khleuven.be:38034/r0585626_project/"+urlEnd);
		
		Select dropdown = new Select(driver.findElement(By.id("uri-doctype")));
		dropdown.selectByValue("HTML5");
		
		WebElement button = driver.findElement(By.cssSelector(".submit_button"));
		button.click();

		WebElement pass = driver.findElement(By.cssSelector(".success"));
		assertEquals("Document checking completed. No errors or warnings to show.", pass.getText());
		
	}
	
	@After
	public void tearDown () {
		driver.quit();
	}
	
}