package dk.kea.rnexambackend.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MealPlanDTO {
    private Long id;
    private String username;
    private Long recipeId;
    private String recipeName;
    private String dayOfWeek;


}
