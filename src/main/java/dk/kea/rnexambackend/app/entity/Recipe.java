package dk.kea.rnexambackend.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Integer preparationTime;
    private Integer servings;
    private String imageUrl;

    @ElementCollection
    @CollectionTable(name = "recipe_instructions")
    private List<String> instructions;


    @ElementCollection
    private Map<Long, Integer> ingredients; // <rema ProductID, Quantity>

}