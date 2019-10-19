package library;

import java.util.Scanner;

public class Book implements Item{
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}
	@Override
	public String getMaker() {
		return author;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

}
