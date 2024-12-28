package dk.kea.rnexambackend.app.repository;

import dk.kea.rnexambackend.app.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
