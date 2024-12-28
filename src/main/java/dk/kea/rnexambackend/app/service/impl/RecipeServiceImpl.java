package dk.kea.rnexambackend.app.service.impl;

import dk.kea.rnexambackend.app.dto.RecipeDTO;
import dk.kea.rnexambackend.app.entity.Recipe;
import dk.kea.rnexambackend.app.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {
    @Override
    public List<RecipeDTO> getAllRecipes() {
        return null;
    }

    @Override
    public RecipeDTO getRecipeById(Long id) {
        return null;
    }

    @Override
    public RecipeDTO convertToDTO(Recipe recipe) {
        return null;
    }

    @Override
    public Recipe convertToEntity(RecipeDTO recipeDTO) {
        return null;
    }
}
