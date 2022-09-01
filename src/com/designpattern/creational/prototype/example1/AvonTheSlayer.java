package com.designpattern.creational.prototype.example1;

public class AvonTheSlayer implements TheRevenger {

	private final String name = "Avon The Slayer";
	
	@Override
	public TheRevenger clone() {
		return new AvonTheSlayer();
	}
	
	@Override
	public String toString() {
		return name;
	}
	

}
