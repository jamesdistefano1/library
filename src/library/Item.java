package library;

import java.util.List;
import java.util.Scanner;

public interface Item {
	String getTitle();
	String getMaker();
	int getLength();
	
	public static void addNewItem(ItemFactory f, List<Item> l, List<Item> x) {
		int didItAdd = 0;
		while(didItAdd == 0) {
			Scanner adding = new Scanner(System.in);  
			System.out.println("Please enter book or movie.");
			String adder = adding.nextLine();
			if(adder.equalsIgnoreCase("book") || adder.equalsIgnoreCase("movie")) {
				Item a = f.addItem(adder);
				l.add(a);
				x.add(a);
				didItAdd++;
			}
		}
	}
	
	public static Item checkout(List<Item> l) {
		Scanner checkout = new Scanner(System.in);
		System.out.println("What would you like to check out?");
		String checking = checkout.nextLine();
		Item bingo = null;
		for(Item i: l) {
			if(i.getTitle().equalsIgnoreCase(checking)) {
				bingo = i;
			}
		}
		int index = l.indexOf(bingo);
		l.remove(index);
		return bingo;
	}
	
	public static void checkin(List<Item> l, List<Item> x) {
		Scanner checkin = new Scanner(System.in);
		System.out.println("What would you like to return?");
		String checking = checkin.nextLine();
		Item bingo = null;
		int count = x.size();
		for(Item i: l) {
			if(i.getTitle().equalsIgnoreCase(checking)) {
				x.add(i);
				break;
			}
		}
		if (count == x.size()) {
			System.out.println("Item does not exist in library system.");
		}
	}
}
