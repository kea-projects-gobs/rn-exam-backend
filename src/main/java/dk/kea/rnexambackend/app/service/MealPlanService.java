package dk.kea.rnexambackend.app.service;

import dk.kea.rnexambackend.app.dto.MealPlanDTO;
import dk.kea.rnexambackend.app.dto.ShoppingListItemDTO;

import java.util.List;

public interface MealPlanService {
    MealPlanDTO createMealPlan(MealPlanDTO mealPlanDTO);
    List<MealPlanDTO> getMealPlanByUser(String username);
    void deleteMealPlan(Long id);
    List<ShoppingListItemDTO> calculateShoppingList(String username);
}
