package com.designpattern.creational.factory.assignment;

public class Punch implements TheMagician {

	private static final String Action = "The magician can punch, and knock you down";
	
	@Override
	public String getAction() {
		return Action;
	}

}
