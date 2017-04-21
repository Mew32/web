package domain.db;

import java.util.ArrayList;
import java.util.List;

import domain.model.Film;

public class FilmDb {
	private static FilmDb instance;
	private List<Film> films;
	
	public FilmDb(){
		films = new ArrayList<Film>();
		films.add(new Film("HIMYM", 192, 192, 5 ,0));
		films.add(new Film("The OA", 10, 10, 10,0));
		films.add(new Film("Game Of Thrones", 50, 50, 8,0));
	}
//	
//	public static FilmDb getInstance(){
//		if(instance == null){
//			synchronized(FilmDb.class){
//				if(instance == null){
//					instance = new FilmDb();
//				}
//			}
//		}
//		return instance;
//	}
	
	public void addFilm(Film f){
		films.add(f);
	}
	
	public List<Film> getFilms(){
		return films;
	}
	
	public Film getBestFilm(){
		Film f = null;
		for(Film fi : getFilms()){
			if(f == null || f.getAdjustedRating() < fi.getAdjustedRating()){
				f = fi;
			}
		}
		return f;
	}
	
	public int getJackPot(){
		int sum = 0;
		for(Film fi : getFilms()){
			sum += fi.getCasino();
		}
		return sum;
	}
	
	public int getJackPotSmallerThan1000(){
		int sum = 0;
		for(Film fi : getFilms()){
			if(fi.getCasino() < 1000){
				sum += fi.getCasino();
			}
		}
		return sum;
	}

}
