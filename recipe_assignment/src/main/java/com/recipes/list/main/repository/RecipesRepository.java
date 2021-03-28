package com.recipes.list.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.recipes.list.main.entity.Recipes;

@RepositoryRestResource(collectionResourceRel = "recipes",path = "recipes")
public interface RecipesRepository extends JpaRepository<Recipes, Integer> {

}
