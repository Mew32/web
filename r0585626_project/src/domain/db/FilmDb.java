package domain.db;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.model.Film;

public class FilmDb {
	private Map<Integer, Film> films;
	private int count;
	
	public FilmDb(){
		films = new HashMap<Integer,Film>();
		count = 0;
		Film f = new Film("HIMYM", 192, 192, 5);
		addFilm(f);
		f = new Film("The OA", 10, 10, 10);
		addFilm(f);
		f = new Film("Game Of Thrones", 50, 50, 8);
		addFilm(f);
	}
	
	public int createUUID(Film f){
		int id = 0;
		synchronized(FilmDb.class){
			id = count++;
		}
		byte[] nameB = f.getName().getBytes();
		byte[] totalB = (f.getTotalLength()+"").getBytes();
		byte[] watchedB = (f.getTotalLength()+"").getBytes();
		byte[] ratingB = (f.getTotalLength()+"").getBytes();
		
		id = id * (fromByteArray(nameB)+ fromByteArray(totalB)+ fromByteArray(watchedB)+ fromByteArray(ratingB));
		
		return id;
	}
	
	private int fromByteArray(byte[] bytes) {
	     try{
	    	 bytes = new byte[]{bytes[0],bytes[1],bytes[2],bytes[3]};
	    	 return Math.abs(ByteBuffer.wrap(bytes).getInt());
	     }catch (Exception e){
	    	 System.out.println("Err");
	    	 return 0;
	     }
	}
	
	public void addFilm(Film f){
		int id = createUUID(f);
		f.setId(id);
		films.put(id,f);
	}
	
	public Collection<Film> getFilms(){
		return films.values();
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
