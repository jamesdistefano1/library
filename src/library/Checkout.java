package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Checkout {
	static List<Item> cardCatalog = new ArrayList<Item>();
	static List<Item> inLibrary = new ArrayList<Item>();
	public static void main(String[] args) {
		ItemFactory theFactory = new ItemFactory();
		Movie james = new Movie("James", 120);
		Book js = new Book("The James Story", "James");
		cardCatalog.add(james);
		cardCatalog.add(js);
		inLibrary.add(james);
		inLibrary.add(js);
		while(true) {
			Scanner choice = new Scanner(System.in);  
			System.out.println("Welcome to the library.  What would you like to do today?");
			System.out.println("Press 1 to add an item to the library");
			System.out.println("Press 2 to check out an item");
			System.out.println("Press 3 to return an item");
			System.out.println("Press 4 to print the items currently checked in");
			System.out.println("Press 5 to print all books currently checked in");
			System.out.println("Press 6 to print all movies currently checked in");
			int theChoice = choice.nextInt(); 
			switch(theChoice) {
			case 1:
				Item.addNewItem(theFactory, cardCatalog, inLibrary);
				break;
			case 2:
				Item.checkout(inLibrary);
				break;
			case 3:
				Item.checkin(cardCatalog, inLibrary);
				break;
			case 4:
				for(Item i: inLibrary) {
					System.out.println(i.getTitle());
				}
				break;
			// add case to print out all books and all movies
			case 5:
				for(Item i: inLibrary) {
					if(i instanceof Book) {
						System.out.println(i.getTitle());
					}
				}
				break;
			case 6:
				for(Item i: inLibrary) {
					if(i instanceof Movie) {
						System.out.println(i.getTitle());
					}
				}
				break;
			default:
				System.out.println("Please enter a number 1 - 6");	
				break;
			}
			System.out.println("");	
		}
	}
}
