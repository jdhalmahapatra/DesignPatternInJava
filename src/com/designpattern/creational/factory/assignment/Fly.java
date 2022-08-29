package com.designpattern.creational.factory.assignment;

public class Fly implements TheMagician {

	private static final String Action = "The Magician Can Fly"; 
	
	@Override
	public String getAction() {
		return Action;
	}

}
