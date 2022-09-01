package com.designpattern.creational.prototype.good;

public abstract class Media implements Cloneable {
	private String title;
	private String url;
	private double rating;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
