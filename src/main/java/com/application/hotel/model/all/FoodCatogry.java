package com.application.hotel.model.all;

public enum FoodCatogry {

	Breakfast("breakfast"),
    Lunch("lunch"),
    Dinner("dinner");
	

    private String url;

    FoodCatogry(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
	
	
}
