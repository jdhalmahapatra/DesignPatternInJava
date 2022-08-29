package com.designpattern.creational.factory.assignment;

public class Disappear implements TheMagician {

	private static final String Action = "The magician can dissappear";
	
	@Override
	public String getAction() {
		return Action;
	}

}
