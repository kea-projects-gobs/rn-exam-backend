package dk.kea.rnexambackend.app.repository;

import dk.kea.rnexambackend.app.entity.MealPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealPlanRepository extends JpaRepository<MealPlan, Long> {
}
