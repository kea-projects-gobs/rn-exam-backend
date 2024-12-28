package dk.kea.rnexambackend.app.service.impl;

import dk.kea.rnexambackend.app.dto.MealPlanDTO;
import dk.kea.rnexambackend.app.dto.ProductDTO;
import dk.kea.rnexambackend.app.dto.ShoppingListItemDTO;
import dk.kea.rnexambackend.app.entity.MealPlan;
import dk.kea.rnexambackend.app.entity.Recipe;
import dk.kea.rnexambackend.app.repository.MealPlanRepository;
import dk.kea.rnexambackend.app.repository.RecipeRepository;
import dk.kea.rnexambackend.app.service.MealPlanService;
import dk.kea.rnexambackend.app.service.ProductService;
import dk.kea.rnexambackend.security.entity.UserWithRoles;
import dk.kea.rnexambackend.security.repository.UserWithRolesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MealPlanServiceImpl implements MealPlanService {
    private final MealPlanRepository mealPlanRepository;
    private final UserWithRolesRepository userRepository;
    private final RecipeRepository recipeRepository;
    private final ProductService productService;

    public MealPlanServiceImpl(MealPlanRepository mealPlanRepository, UserWithRolesRepository userWithRolesRepository, RecipeRepository recipeRepository, ProductService productService) {
        this.mealPlanRepository = mealPlanRepository;
        this.userRepository = userWithRolesRepository;
        this.recipeRepository = recipeRepository;
        this.productService = productService;
    }

    @Override
    public MealPlanDTO createMealPlan(MealPlanDTO mealPlanDTO) {
        UserWithRoles user = userRepository.findById(mealPlanDTO.getUsername())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));

        Recipe recipe = recipeRepository.findById(mealPlanDTO.getRecipeId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe not found"));

        // Check if user already has a meal planned for this day
        Optional<MealPlan> existingPlan = mealPlanRepository.findByUserAndDayOfWeek(user, mealPlanDTO.getDayOfWeek());

        MealPlan mealPlan;
        if (existingPlan.isPresent()) {
            // Update existing plan
            mealPlan = existingPlan.get();
            mealPlan.setRecipe(recipe);
        } else {
            // Create new plan
            mealPlan = new MealPlan();
            mealPlan.setUser(user);
            mealPlan.setRecipe(recipe);
            mealPlan.setDayOfWeek(mealPlanDTO.getDayOfWeek());
        }

        MealPlan saved = mealPlanRepository.save(mealPlan);
        return convertToDTO(saved);
    }

    @Override
    public List<MealPlanDTO> getMealPlanByUser(String username) {
        UserWithRoles user = userRepository.findById(username)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));

        return mealPlanRepository.findByUser(user).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteMealPlan(Long id) {
        mealPlanRepository.deleteById(id);
    }

    @Override
    public List<ShoppingListItemDTO> calculateShoppingList(String username) {
        // Get user's meal plans
        UserWithRoles user = userRepository.findById(username)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));

        List<MealPlan> userMealPlans = mealPlanRepository.findByUser(user);

        // Combine all ingredients and their quantities
        Map<Long, Integer> ingredientQuantities = userMealPlans.stream()
                .map(MealPlan::getRecipe)
                .map(Recipe::getIngredients)
                .flatMap(ingredients -> ingredients.entrySet().stream())
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.summingInt(Map.Entry::getValue)
                ));

        // Convert to shopping list items with product details
        return ingredientQuantities.entrySet().stream()
                .map(entry -> {
                    ProductDTO product = productService.getProductById(entry.getKey());
                    return new ShoppingListItemDTO(
                            entry.getKey(),
                            product.getName(),
                            product.getPrice(),
                            entry.getValue(),
                            product.getPrice() * entry.getValue()
                    );
                })
                .collect(Collectors.toList());
    }

    private MealPlanDTO convertToDTO(MealPlan mealPlan) {
        MealPlanDTO dto = new MealPlanDTO();
        dto.setId(mealPlan.getId());
        dto.setUsername(mealPlan.getUser().getUsername());
        dto.setRecipeId(mealPlan.getRecipe().getId());
        dto.setRecipeName(mealPlan.getRecipe().getName());
        dto.setDayOfWeek(mealPlan.getDayOfWeek());
        return dto;
    }
}
