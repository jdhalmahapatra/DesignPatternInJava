package com.designpattern.creational.builder.good;

public class PizzaServiceGoodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza.Builder builder = new Pizza.Builder();
		builder.base("Chese thin crust").dressing("Spring Onion").meat("Chicken");
		
		Pizza pizza = builder.build();
		System.out.println(pizza.getBase());
		System.out.println(pizza.getDressing());
		System.out.println(pizza.getMeat());
	}

}
