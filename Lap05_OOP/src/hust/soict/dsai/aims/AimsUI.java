package hust.soict.dsai.aims;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.CartScreen;

public class AimsUI {
	public static void main(String[] args) throws LimitExceededException {
		// Create a new Cart
		Cart cart = new Cart();
//		Store store = new Store(); Created store. But unused. 
		// Create new dvd Object and add them to the Cart	
			// Create new dvd1		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
			
			// Create new dvd2
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		
			// Create new dvd3
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addMedia(dvd3);
		
		// Test the method print Cart
//		cart.printCart();
		// To-do: Test the search methods here	
		@SuppressWarnings("unused")
		CartScreen cs = new CartScreen(cart);
	}
}

