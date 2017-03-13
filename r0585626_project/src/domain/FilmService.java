package domain;

import java.util.List;

public class FilmService {
	
	public static void addFilm(String name, String totalSt, String watchedSt, String ratingSt){
		int total = Integer.parseInt(totalSt);
		int watched = Integer.parseInt(watchedSt);
		double rating = Double.parseDouble(ratingSt);
		addFilm(new Film(name, total, watched, rating));
	}

	public static void addFilm(Film f) {
		FilmDb db = FilmDb.getInstance();
		db.addFilm(f);
	}
	
	public static List<Film> getFilms(){
		return FilmDb.getInstance().getFilms();
	}
	
	public static Film getBestFilm(){
		return FilmDb.getInstance().getBestFilm();
	}

}
