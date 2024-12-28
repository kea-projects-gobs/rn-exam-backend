package dk.kea.rnexambackend.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecipeDTO {
    private Long id;
    private String name;
    private String description;
    private Integer preparationTime;
    private Integer servings;
    private ProductDTO products;
}
