package com.recipes.list.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "recipes")

public @Data class Recipes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "food_type")
	private String foodType;
	
	@Column(name = "order_count")
	private int orderCount;
	
	@Column(name = "date_created")
	private String dateCreated;
	
	@Column(name = "instructions")
	private String instructions;
	
	@Column(name = "ingredients")
	private String ingredients;
	
	public Recipes() {}

	
}
