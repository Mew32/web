package domain;

import java.util.ArrayList;
import java.util.List;

public class FilmDb {
	private static FilmDb instance;
	private List<Film> films;
	
	private FilmDb(){
		films = new ArrayList<Film>();
		films.add(new Film("HIMYM", 192, 192, 5));
		films.add(new Film("The OA", 10, 10, 10));
		films.add(new Film("Game Of Thrones", 50, 50, 8));
	}
	
	public static FilmDb getInstance(){
		if(instance == null){
			synchronized(FilmDb.class){
				if(instance == null){
					instance = new FilmDb();
				}
			}
		}
		return instance;
	}
	
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

}
