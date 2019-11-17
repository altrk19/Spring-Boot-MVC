package guru.springframework.spring5recipeapp.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    Category category = new Category();

    @Test
    void getId() {
        Long idValue = 4L;
        category.setId(idValue);

        assertEquals(idValue,category.getId());
    }

    @Test
    void getDescription1() {
    }

    @Test
    void getRecipes() {
    }
}
