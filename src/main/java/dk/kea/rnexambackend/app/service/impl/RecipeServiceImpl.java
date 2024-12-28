package dk.kea.rnexambackend.app.service.impl;

import dk.kea.rnexambackend.app.dto.ProductDTO;
import dk.kea.rnexambackend.app.dto.RecipeDTO;
import dk.kea.rnexambackend.app.entity.Product;
import dk.kea.rnexambackend.app.entity.Recipe;
import dk.kea.rnexambackend.app.repository.RecipeRepository;
import dk.kea.rnexambackend.app.service.ProductService;
import dk.kea.rnexambackend.app.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;
    private final ProductService productService;

    public RecipeServiceImpl(RecipeRepository recipeRepository, ProductService productService) {
        this.recipeRepository = recipeRepository;
        this.productService = productService;
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

        // Convert product to productDTO
        List<ProductDTO> productDTOs = recipe.getProducts().stream()
                .map(productService::convertProductToDTO)
                .toList();
        dto.setProducts(productDTOs);
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

        // Convert to product entity
        List<Product> products = recipeDTO.getProducts().stream()
                .map(productService::convertProductToEntity)
                .toList();
        recipe.setProducts(products);
        return recipe;
    }
}
