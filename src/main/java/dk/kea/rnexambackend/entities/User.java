package dk.kea.rnexambackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String id; // UUID from firebase
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<MealPlan> mealPlans;
}
