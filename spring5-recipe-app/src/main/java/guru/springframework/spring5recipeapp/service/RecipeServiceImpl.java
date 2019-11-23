package guru.springframework.spring5recipeapp.service;

import guru.springframework.spring5recipeapp.domain.Recipe;
import guru.springframework.spring5recipeapp.repository.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("log message test");
        Set<Recipe> recipes = new HashSet<>();
        //recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        recipeRepository.findAll().forEach(recipes::add);
        return recipes;
    }


    @Override
    public Recipe getRecipeById(Long id) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(id);
        if (!recipeOptional.isPresent()) {
            throw new RuntimeException("Recipe Not Found!");
        }
        return recipeOptional.get();
    }
}


//Flow
//Service -> Repository -> DB

//Program ayaga kalktıgında  RecipeBootstrap sınıfı ile db'ye datalar kaydediliyor.
