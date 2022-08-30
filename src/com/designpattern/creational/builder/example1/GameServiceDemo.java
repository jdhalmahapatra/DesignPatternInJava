package com.designpattern.creational.builder.example1;

public class GameServiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheRevenger.Builder builder = new TheRevenger.Builder();
		builder.name("narnia").suitType("Kelver").eyeColor("BrownColor").weapon("Maverick").numberOfActions(4);
		
		TheRevenger theRevenger = builder.build();
		System.out.println(theRevenger.getName());
		System.out.println(theRevenger.getSuitType());
		System.out.println(theRevenger.getEyeColor());
		System.out.println(theRevenger.getWeapon());
		System.out.println(theRevenger.getNumberOfActions());
	}

}
