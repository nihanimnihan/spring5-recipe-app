package nihanim.springframework.spring5recipeapp.services;


import nihanim.springframework.spring5recipeapp.domain.Recipe;
import nihanim.springframework.spring5recipeapp.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
        recipeService= new RecipeServiceImpl(recipeRepository);
        
    }

    @Test
    public void getRecipes() throws Exception {

        Set<Recipe> recipes = recipeService.getRecipes();
    }
}