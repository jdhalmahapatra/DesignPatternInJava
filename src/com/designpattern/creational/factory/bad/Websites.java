package com.designpattern.creational.factory.bad;

import java.util.ArrayList;
import java.util.List;

public class Websites {
	private List<Pages> pages = new ArrayList<>();
	
	//Constructor
	public Websites(String type) {
		this.createWebsites(type);
	}

	//Getter method
	public List<Pages> getPages() {
		return pages;
	}
	
	
	public void createWebsites(String type) {
		if(type == "Blog") {
			pages.add(new AboutPage());
			pages.add(new CommentPage());
            pages.add(new ContactPage());
		}
		else {
			pages.add(new HomePage());
            pages.add(new CartPage());
            pages.add(new SearchPage());
		}
	}
}
