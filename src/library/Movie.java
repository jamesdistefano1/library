package library;

import java.util.Scanner;

public class Movie implements Item{
	String title;
	int runtime;
	
	public Movie(String title, int runtime) {
		this.title = title;
		this.runtime = runtime;
		//Checkout.cardCatalog.add(this);
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public int getLength() {
		return runtime;
	}

	@Override
	public String getMaker() {
		// TODO Auto-generated method stub
		return null;
	}
}
