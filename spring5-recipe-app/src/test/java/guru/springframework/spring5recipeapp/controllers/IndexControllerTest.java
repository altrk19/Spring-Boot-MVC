package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.domain.Recipe;
import guru.springframework.spring5recipeapp.service.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

class IndexControllerTest {

    IndexController indexController;

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {
        //given
        Set<Recipe> recipesData = new HashSet<>();

        Recipe recipe1 = new Recipe();
        recipe1.setId(1L);
        recipesData.add(recipe1);

        Recipe recipe2 = new Recipe();
        recipe2.setId(2L);
        recipesData.add(recipe2);


        when(recipeService.getRecipes()).thenReturn(recipesData);

        //when
        String viewName = indexController.getIndexPage(model);

        //then
        assertEquals(viewName,"index");
        verify(recipeService,times(1)).getRecipes();

        //without ArgumentCaptor
        //verify(model, times(1)).addAttribute(eq("recipes"), anySet());
        //verilen argüman recipes mi onu da test ettik

        //with ArgumentCaptor
        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);
        verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());   //recipes değerleri capture ile ele geçiriliyor
        Set<Recipe> recipeObjects = argumentCaptor.getValue();
        assertEquals(2,recipeObjects.size());
    }


    @Test
    void testMockMVC() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));

        //Gelen index sayfasının("/") rest isteği için test yazdık.
        //MockMVC standalone kullanarak tüm spring application contexti ayaga kaldırmak yerine sadece indexController'ı ayağa kaldırdık ve süre olarak 5-10 kat daha hızlandı testimiz
    }
}
