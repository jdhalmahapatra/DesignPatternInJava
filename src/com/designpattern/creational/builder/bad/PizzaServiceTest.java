package com.designpattern.creational.builder.bad;

public class PizzaServiceTest {

	public static void main(String[] args) {
		//1st Approach
		//Now using below statement anyone can change/modify those values
		//Because Setters and Getters are available to everybody.
		//In this case the object is mutable
		
		Pizza pizza = new Pizza();
		pizza.setBase("Cheese Burst");
		pizza.setDressing("Marinara");
		pizza.setMeat("Chicken");
		
		System.out.println(pizza.getBase());
		System.out.println(pizza.getDressing());
		System.out.println(pizza.getMeat());
		
		
		//2nd Approach
		//To over come this problem, we can use constructor
		//Let's create another class to understand this in details 
		//We solved the mutability of object by using constructor but here contract is concrete.
		//We have lots of combination of constructor in these 3 values, imagine once the property variable
		//start increasing, it will be very difficult to maintain
		//To solve all these problems we use Builder Pattern.
		
		PizzaTelescoping pizzaTelescoping = new PizzaTelescoping("Cheese Burst", "Marinara", "Chicken");
		System.out.println(pizzaTelescoping.getBase());
		System.out.println(pizzaTelescoping.getDressing());
		System.out.println(pizzaTelescoping.getMeat());
		
	}

}
