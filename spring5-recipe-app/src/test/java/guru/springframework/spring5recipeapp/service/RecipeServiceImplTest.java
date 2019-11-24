package guru.springframework.spring5recipeapp.service;

import guru.springframework.spring5recipeapp.converters.RecipeCommandToRecipe;
import guru.springframework.spring5recipeapp.converters.RecipeToRecipeCommand;
import guru.springframework.spring5recipeapp.domain.Recipe;
import guru.springframework.spring5recipeapp.repository.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Mock
    RecipeToRecipeCommand recipeToRecipeCommand;

    @Mock
    RecipeCommandToRecipe recipeCommandToRecipe;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository,recipeCommandToRecipe,recipeToRecipeCommand);
    }

    @Test
    void getRecipesTest() {
        Recipe recipe = new Recipe();
        Set<Recipe> recipesData = new HashSet<>();
        recipesData.add(recipe);

        assertEquals(recipeService.getRecipes().size(),0);

        when(recipeRepository.findAll()).thenReturn(recipesData);
        //getRecipes testi çalıştırılırken recipeRepository.findAll() metotu çağrılacak. line 25 (  recipeRepository.findAll().forEach(recipes::add);)
        //burada yapılan şey recipeRepository.findAll() çağrılınca recipesData return edilmektedir.

        assertEquals(recipeService.getRecipes().size(),1);

        verify(recipeRepository,times(2)).findAll();
        //how many times used findAll method , if is it 2 result true
    }

    @Test
    void getRecipeByIdTest(){
        Long id = 1L;
        Recipe recipe = new Recipe();
        recipe.setId(id);

        Optional<Recipe> recipeOptional= Optional.of(recipe);
        when(recipeRepository.findById(anyLong())).thenReturn(recipeOptional);

        Recipe returnedRecipe = recipeService.getRecipeById(id);

        assertNotNull(returnedRecipe);
        verify(recipeRepository,times(1)).findById(anyLong());
    }

    @Test
    void testDeleteById() {

        //given
        Long idToDelete = Long.valueOf(2L);

        //when
        recipeService.deleteById(idToDelete);

        //no 'when', since method has void return type

        //then
        verify(recipeRepository, times(1)).deleteById(anyLong());
    }

}
