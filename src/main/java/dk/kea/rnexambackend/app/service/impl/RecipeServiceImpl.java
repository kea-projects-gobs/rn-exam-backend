package dk.kea.rnexambackend.app.service.impl;

import dk.kea.rnexambackend.app.dto.RecipeDTO;
import dk.kea.rnexambackend.app.entity.Recipe;
import dk.kea.rnexambackend.app.repository.RecipeRepository;
import dk.kea.rnexambackend.app.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public List<RecipeDTO> getAllRecipes() {
        return recipeRepository.findAll().stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public RecipeDTO getRecipeById(Long id) {
        Optional<Recipe> recipe = recipeRepository.findById(id);
        return recipe.map(this::convertToDTO)
                .orElseThrow(() -> new RuntimeException("Recipe not found"));
    }

    @Override
    public RecipeDTO convertToDTO(Recipe recipe) {
        RecipeDTO dto = new RecipeDTO();
        dto.setId(recipe.getId());
        dto.setName(recipe.getName());
        dto.setDescription(recipe.getDescription());
        dto.setPreparationTime(recipe.getPreparationTime());
        dto.setServings(recipe.getServings());
        dto.setIngredients(recipe.getIngredients());
        return dto;
    }

    @Override
    public Recipe convertToEntity(RecipeDTO recipeDTO) {
        Recipe recipe = new Recipe();
        recipe.setId(recipeDTO.getId());
        recipe.setName(recipeDTO.getName());
        recipe.setDescription(recipeDTO.getDescription());
        recipe.setPreparationTime(recipeDTO.getPreparationTime());
        recipe.setServings(recipeDTO.getServings());
        recipe.setIngredients(recipeDTO.getIngredients());
        return recipe;
    }
}
