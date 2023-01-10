package hust.soict.dsai.aims.media;

import java.util.Comparator;

import hust.soict.dsai.aims.exception.PlayerException;
public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	// Constructor
	public Media() {
		// TODO Auto-generated constructor stub
	}
	public Media(String title) {
		this.title = title;
	}
	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	// Getter and Setter	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Media) {
			Media media = (Media)o;
			return this.title.equals(media.title);
		}
		return false;
	}
	
	public abstract void setArtist(String artist);
	public abstract String getArtist();
	public abstract void setLength(int nextInt);

	// Play Media	
	public void playMedia() throws PlayerException{
		// TODO Auto-generated method stub
	}
	
	@Override
	public String toString() {

		return "Media - " + this.title + " - " + this.category + " - " + this.cost + " $";
	}
}
