package com.designpattern.creational.prototype.good;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	private Map<String, Media> entries = new HashMap<String, Media>();
	
	public Registry() {
		loadEntires();
	}
	
	public Media createEntries(String type) {
		Media media = null;
		try {
			media = (Media) (entries.get(type)).clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return media;
	}

	private void loadEntires() {
		Movies movie = new Movies();
		movie.setTitle("Krish");
		movie.setUrl("Movie url will come in this place");
		movie.setDuration(150);
		movie.setRating(7);
		entries.put("Movie", movie);
		
		TVShows tvShow = new TVShows();
		tvShow.setTitle("Friends");
		tvShow.setUrl("TV show url will come in this place");
		tvShow.setRating(9.5);
		tvShow.setSeasons(7);
		entries.put("Show", tvShow);
	}
}
