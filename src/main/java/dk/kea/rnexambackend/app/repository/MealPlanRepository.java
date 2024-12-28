package dk.kea.rnexambackend.app.repository;

import dk.kea.rnexambackend.app.entity.MealPlan;
import dk.kea.rnexambackend.security.entity.UserWithRoles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MealPlanRepository extends JpaRepository<MealPlan, Long> {
    // find by user
    List<MealPlan> findByUser(UserWithRoles username);
    // Find a specific meal plan for a user on a specific day
    Optional<MealPlan> findByUserAndDayOfWeek(UserWithRoles user, String dayOfWeek);
    // Check if a user already has a meal plan for a specific day
    boolean existsByUserAndDayOfWeek(UserWithRoles user, String dayOfWeek);
}
