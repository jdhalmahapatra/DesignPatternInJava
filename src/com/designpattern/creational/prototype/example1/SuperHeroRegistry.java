package com.designpattern.creational.prototype.example1;

import java.util.HashMap;
import java.util.Map;

public class SuperHeroRegistry {
	private static Map<String, TheRevenger> entries = new HashMap<String, TheRevenger>();
	
	static {
		entries.put("The Magician", new TheMagician());
		entries.put("Avon The Slayer", new AvonTheSlayer());
		entries.put("Manic The Mayhem", new ManicTheMayhem());	
	}
	
	public TheRevenger getEntriesType(String type) {
		try {
			return entries.get(type).clone();
		}
		catch(NullPointerException e) {
			System.out.println("The follwing name " + type + "doesn't exist");
			e.printStackTrace();
			return null;
		}
	}
}
