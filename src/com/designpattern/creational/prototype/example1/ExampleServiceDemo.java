package com.designpattern.creational.prototype.example1;

import java.util.Scanner;

public class ExampleServiceDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		args = new String[3];
		System.out.println("Enter command string please");
        for(int i=0;i<3;i++) {
        	args[i] = input.nextLine();
        }
        
		if (args.length > 0) {
            for (String type : args) {
            	SuperHeroRegistry superHero = new SuperHeroRegistry();
                TheRevenger prototype = superHero.getEntriesType(type);
                if (prototype != null) {
                    System.out.println(prototype);
                }
            }
        } else {
            System.out.println("Add the command string please");
            
        }
		input.close();
	}

}
