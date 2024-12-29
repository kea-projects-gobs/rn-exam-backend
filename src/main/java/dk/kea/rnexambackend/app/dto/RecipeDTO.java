package dk.kea.rnexambackend.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

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
    private String imageUrl;
    private List<String> instructions;
    private Map<Long, Integer> ingredients; // <rema ProductID, Quantity// >
}
