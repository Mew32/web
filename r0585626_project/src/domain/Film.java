package domain;

public class Film {
	
	private final String name;
	private int watched_length;
	private int total_length;
	private double rating;
	
	public Film(String name, int watched, int total, double rating){
		this.name = name;
		setWatchedLength(watched);
		setTotalLength(total);
		setRating(rating);
	}

	public int getWatchedLength() {
		return watched_length;
	}

	public void setWatchedLength(int watched_length) {
		this.watched_length = watched_length;
	}

	public int getTotalLength() {
		return total_length;
	}

	public void setTotalLength(int total_length) {
		this.total_length = total_length;
	}
	
	public double getAdjustedRating(){
		double w = (double) getWatchedLength();
		double l = (double) getTotalLength();
		return getRating() * (w/l)*(w/l);
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

}
