package guru.springframework.spring5recipeapp.service;

import guru.springframework.spring5recipeapp.commands.RecipeCommand;
import guru.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe getRecipeById(Long id);
    RecipeCommand findCommandById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    void deleteById(Long id);
}
