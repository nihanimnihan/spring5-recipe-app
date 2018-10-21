package nihanim.springframework.spring5recipeapp.services;

import nihanim.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
