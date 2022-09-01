package com.designpattern.creational.prototype.bad;

public class PrototypePatternBadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Media m1 = new Movies();
		m1.setTitle("Shawshank Redemption");
		m1.setRating(9.2);
		
		System.out.println("ID: "+ m1);
        System.out.println(m1.getTitle());
        
        
        Media anotherMovie = new Movies();
        System.out.println("ID: "+ anotherMovie);
        System.out.println(anotherMovie.getTitle());
        
        
	}

}
