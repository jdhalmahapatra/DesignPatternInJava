package com.designpattern.creational.factory.bad;

public class FactoyBadDesignTes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Websites w1 = new Websites("Blog");
		System.out.println(w1.getPages());
		
		Websites w2 = new Websites("E-Commerece");
		System.out.println(w2.getPages());
				
	}

}
