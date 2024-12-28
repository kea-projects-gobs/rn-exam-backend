package dk.kea.rnexambackend.app.api;

import dk.kea.rnexambackend.app.dto.MealPlanDTO;
import dk.kea.rnexambackend.app.dto.ShoppingListItemDTO;
import dk.kea.rnexambackend.app.service.MealPlanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/mealplan")
public class MealPlanController {
    private final MealPlanService mealPlanService;

    public MealPlanController(MealPlanService mealPlanService) {
        this.mealPlanService = mealPlanService;
    }

    @PostMapping
    public ResponseEntity<List<MealPlanDTO>> createMealPlans(@RequestBody List<MealPlanDTO> mealPlanDTOs) {
        List<MealPlanDTO> createdPlans = mealPlanDTOs.stream()
                .map(mealPlanService::createMealPlan)
                .collect(Collectors.toList());
        return ResponseEntity.ok(createdPlans);
    }

    @GetMapping("/user/{username}")
    public ResponseEntity<List<MealPlanDTO>> getMealPlanByUser(@PathVariable String username) {
        return ResponseEntity.ok(mealPlanService.getMealPlanByUser(username));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMealPlan(@PathVariable Long id) {
        mealPlanService.deleteMealPlan(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/shopping-list/{username}")
    public ResponseEntity<List<ShoppingListItemDTO>> getShoppingList(@PathVariable String username) {
        return ResponseEntity.ok(mealPlanService.calculateShoppingList(username));
    }
}
