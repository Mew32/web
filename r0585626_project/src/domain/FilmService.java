package domain;

import java.util.List;

public class FilmService {
	
	public static void addMovie(String name, String totalSt, String watchedSt, String ratingSt){
		FilmDb db = FilmDb.getInstance();
		int total = Integer.parseInt(totalSt);
		int watched = Integer.parseInt(watchedSt);
		double rating = Double.parseDouble(ratingSt);
		Film f = new Film(name, total, watched, rating);
		db.addFilm(f);
	}
	
	public static List<Film> getFilms(){
		return FilmDb.getInstance().getFilms();
	}
	
	public static Film getBestFilm(){
		return FilmDb.getInstance().getBestFilm();
	}

}
