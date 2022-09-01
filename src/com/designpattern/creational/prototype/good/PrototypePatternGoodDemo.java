package com.designpattern.creational.prototype.good;

public class PrototypePatternGoodDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
		Movies movie = (Movies) registry.createEntries("Movie");
		movie.setTitle("Super 30");
		movie.setRating(10);
		movie.setUrl("https://www.super30.com/");
		
		System.out.println(movie.getTitle());
		System.out.println(movie.getRating());
		System.out.println(movie.getUrl());
		System.out.println(movie.getDuration());
		
		System.out.println("==================================================");
		
		TVShows tvShow = (TVShows) registry.createEntries("Show");
		tvShow.setTitle("Panchayat");
		tvShow.setUrl("https://www.primevideo/pancahyat");
		tvShow.setRating(8.9);
		tvShow.setSeasons(2);
		
		System.out.println(tvShow.getTitle());
		System.out.println(tvShow.getRating());
		System.out.println(tvShow.getUrl());
		System.out.println(tvShow.getSeasons());

	}

}
