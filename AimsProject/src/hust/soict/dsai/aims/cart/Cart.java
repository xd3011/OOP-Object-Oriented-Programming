package hust.soict.dsai.aims.cart;

import java.util.Collections;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	
	// Get Item in Cart	
	public ObservableList<Media> getItemsOrdered() {
		// TODO Auto-generated method stub
		return itemsOrdered;
	}
	
	//	Total Cost of Card
	public float totalCost() {
		float total = 0;
		for(Media m: itemsOrdered) {
			total += m.getCost();
		}
		return total;
	}
	// Add Media to Cart
	public void addMedia(Media m) throws LimitExceededException {
		int size = itemsOrdered.size();
		if(size < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(m);
			System.out.println("The media has been added");
		}
		else {
			throw new LimitExceededException("ERROR: The number of media has reached its limit");
		}
	}
	// Remove Media to Cart	
	public void removeMedia(Media m) {
		itemsOrdered.remove(m);
		System.out.println("The disc has been removed");
	}
	
	public void removeMediaAll() {
		// TODO Auto-generated method stub
		itemsOrdered.removeAll(itemsOrdered);
	}
	
	// Search by ID	
	public boolean search(int id) {
		for(Media m: itemsOrdered) {
			if(m.getId() == id) {
				return true;
			}
		}
		return false;
	}
	// Search by ID return Media
	public Media searchId(int id) {
		for(Media m: itemsOrdered) {
			if(m.getId() == id) {
				return m;
			}
		}
		return null;
	}
	// Search by Title
	public boolean search(String title) {
		for(Media m: itemsOrdered) {
			if(m.getTitle() == title) {
				return true;
			}
		}
		return false;
	}
	// Search by Title return Media
	public Media searchTitle(String title) {
		for(Media m: itemsOrdered) {
			if(m.getTitle() == title) {
				return m;
			}
		}
		return null;
	}
	// Print Cart
	public void printCart() {
		System.out.println("***********************CART***********************");
		int i = 1;
		for(Media m: itemsOrdered) {
			System.out.println((i) + ".DVD - " + m.getTitle() + " - " + 
					m.getCategory() + " - " + 
					m.getTitle() + " - " + 
//					m.getDirector() + " - " + 
//					m.getLength() + " : " + 
					m.getCost());
			i++;
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}
	
	public void printLength() {
		System.out.println(itemsOrdered.size());
	}
	
	// sort by title
	public void sortByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}

	// sort by cost
	public void sortByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}
}
