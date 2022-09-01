package com.designpattern.creational.prototype.example1;

public class TheMagician implements TheRevenger {
	
	private final String name = "The Magician";
	
	@Override
	public TheRevenger clone() {
		return new TheMagician();
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
