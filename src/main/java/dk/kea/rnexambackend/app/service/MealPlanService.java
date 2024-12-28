package dk.kea.rnexambackend.app.service;

import dk.kea.rnexambackend.app.dto.MealPlanDTO;

import java.util.List;
import java.util.Map;

public interface MealPlanService {
    MealPlanDTO createMealPlan(MealPlanDTO mealPlanDTO);
    List<MealPlanDTO> getMealPlanByUser(String username);
    void deleteMealPlan(Long id);
    Map<Long, Integer> calculateShoppingList(String username);
}
