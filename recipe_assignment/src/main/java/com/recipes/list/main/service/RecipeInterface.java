package com.recipes.list.main.service;

import java.util.List;

import com.recipes.list.main.entity.Recipes;
import com.recipes.list.main.model.RecipeModelClass;


public interface RecipeInterface {
	
	public Recipes addRecipe(RecipeModelClass recipe);

	public List<RecipeModelClass> getallRecipes();

	public RecipeModelClass getRecipe(int id);

	public boolean deleteRecipe(int id);

	public RecipeModelClass updateRecipe(int id, RecipeModelClass recipes);

}
