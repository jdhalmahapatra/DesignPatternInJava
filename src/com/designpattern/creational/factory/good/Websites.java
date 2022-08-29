package com.designpattern.creational.factory.good;

import java.util.ArrayList;
import java.util.List;

public abstract class Websites {
	
	protected List<Pages> pages = new ArrayList<>();
	
	public Websites() {
		this.createWebsites();
	}
	
	public List<Pages> getPages(){
		return pages;
	}
	
	
	public abstract void createWebsites();
}
