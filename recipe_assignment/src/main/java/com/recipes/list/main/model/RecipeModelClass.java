package com.recipes.list.main.model;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeModelClass {
	
	
	private int id;
	
	@NotBlank(message = "must not be blank")
	private String name;
	
	@NotBlank(message ="must not be blank")
	private String description;
	
	@NotBlank(message ="must not be empty")
	private String foodType;
	
	@Min(value = 1)
	private int orderCount;
	
	private String dateCreated;
	
	@NotBlank
	private String instructions;
	
	@NotEmpty
	private List<String> ingredients;
	
	public RecipeModelClass() {}

	public RecipeModelClass(int id, String name, String description, String foodType, int orderCount,
			String dateCreated, String instructions) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.foodType = foodType;
		this.orderCount = orderCount;
		this.dateCreated = dateCreated;
		this.instructions = instructions;
	}
	
	public RecipeModelClass(String name,String description,String foodType,
			int orderCount, String dateCreated, String instructions,
			List<String> ingredients) {
		this.name = name;
		this.description = description;
		this.foodType = foodType;
		this.orderCount = orderCount;
		this.dateCreated = dateCreated;
		this.instructions = instructions;
		this.ingredients = ingredients;
	}
	
	

}
