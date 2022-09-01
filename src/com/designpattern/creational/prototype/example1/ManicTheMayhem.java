package com.designpattern.creational.prototype.example1;

public class ManicTheMayhem implements TheRevenger {

	private final String name = "Manic The Mayhem";
	
	@Override
	public TheRevenger clone() {
		return new ManicTheMayhem();
	}
	
	@Override
	public String toString() {
		return name;
	}
}
