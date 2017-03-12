package domain;

import java.util.ArrayList;
import java.util.List;

public class FilmDb {
	
	public List<Film> films;
	
	public FilmDb(){
		films = new ArrayList<Film>();
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
