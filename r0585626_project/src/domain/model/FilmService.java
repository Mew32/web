package domain.model;

import java.util.List;

import domain.db.FilmDb;

public class FilmService {
	
	private final FilmDb db;
	
	public FilmService(FilmDb db){
		this.db = db;
	}
	
	public void addFilm(String name, String totalSt, String watchedSt, String ratingSt){
		int total = Integer.parseInt(totalSt);
		int watched = Integer.parseInt(watchedSt);
		double rating = Double.parseDouble(ratingSt);
		addFilm(new Film(name, total, watched, rating));
	}

	public void addFilm(Film f) {
		db.addFilm(f);
	}
	
	public List<Film> getFilms(){
//		return null;
		return db.getFilms();
	}
	
	public Film getBestFilm(){
//		return null;
		return db.getBestFilm();
	}

}
