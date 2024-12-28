package dk.kea.rnexambackend.app.service;

import dk.kea.rnexambackend.app.dto.RecipeDTO;
import dk.kea.rnexambackend.app.entity.Recipe;

import java.util.List;

public interface RecipeService {
    List<RecipeDTO> getAllRecipes();
    RecipeDTO getRecipeById(Long id);
    RecipeDTO convertToDTO(Recipe recipe);
    Recipe convertToEntity(RecipeDTO recipeDTO);
}
