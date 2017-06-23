package com.application.hotel.model.all;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "food_menu_list")
public class Food {

	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@Column( name = "food_name" , nullable = false)
	private String foodName;
	
	@Column( name = "food_classification" , nullable = false)
	private String foodClassification;
	
	
	@Column( name = "how_to_make" , nullable = false)
	private String howToMake;

	@Column(name = "catogry" , nullable = true)
	private FoodCatogry cat;

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFoodName() {
		return foodName;
	}


	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}


	public String getFoodClassification() {
		return foodClassification;
	}


	public void setFoodClassification(String foodClassification) {
		this.foodClassification = foodClassification;
	}


	public String getHowToMake() {
		return howToMake;
	}


	public void setHowToMake(String howToMake) {
		this.howToMake = howToMake;
	}
}
