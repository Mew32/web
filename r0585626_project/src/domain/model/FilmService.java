package domain.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import domain.db.FilmDb;

public class FilmService {
	
	private final FilmDb db;
	
	public FilmService(FilmDb db){
		this.db = db;
	}
	
	public List<String> addFilm(String name, String totalSt, String watchedSt, String ratingSt){
		int total = 0;
		int watched = 0;
		double rating = 0;
		List<String> errors = new ArrayList<String>();
		if(name.isEmpty()){
			errors.add("The name must be filled in.");
		}
		try{
			total = Integer.parseInt(totalSt);
		}catch(NumberFormatException e){
			errors.add("The total amount of episodes must be a number.");
		}
		try{
			watched = Integer.parseInt(watchedSt);
		}catch(NumberFormatException e){
			errors.add("The total amount of watched episodes must be a number.");
		}
		try{
			rating = Double.parseDouble(ratingSt);
			if((100*rating % 1) >= 10*Double.MIN_VALUE){
				errors.add("The rating must be a number between one and ten with at most two decimals.");
			}
		}catch(NumberFormatException e){
			errors.add("The rating must be a number between one and ten with at most two decimals.");
		}
		try{
			Film f = new Film(name, total, watched, rating);
			db.addFilm(f);
			return errors;
		}catch(Exception e){
			errors.add("Could not add film to database.");
		}
		return errors;
	}

	public void addFilm(Film f) {
		db.addFilm(f);
	}
	
	public Collection<Film> getFilms(){
		return db.getFilms();
	}
	
	public Film getBestFilm(){
		return db.getBestFilm();
	}

}
