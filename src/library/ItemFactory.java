package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemFactory {
	public Item addItem(String item) {
		Scanner aTitle = new Scanner(System.in);  
		System.out.println("Please enter the title.");
		String theTitle = aTitle.nextLine(); 
		if (item.equalsIgnoreCase("Book")) {
			Scanner anAuthor = new Scanner(System.in);    
			System.out.println("who is the author of the book?");
			String theAuthor = anAuthor.nextLine();
			return new Book(theTitle, theAuthor);
		}
		else if (item.equalsIgnoreCase("Movie")) {
			Scanner aPC = new Scanner(System.in);    
			System.out.println("how long is the movie?");
			int thePC = aPC.nextInt();
			return new Movie(theTitle, thePC);
		}
		return null;
	}

}
