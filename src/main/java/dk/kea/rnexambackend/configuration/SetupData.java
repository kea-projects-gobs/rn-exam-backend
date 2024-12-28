package dk.kea.rnexambackend.configuration;

import dk.kea.rnexambackend.app.entity.Recipe;
import dk.kea.rnexambackend.app.repository.RecipeRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SetupData implements ApplicationRunner {

    private final RecipeRepository recipeRepository;

    public SetupData(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        RecipeData();
    }

    public void RecipeData() {
        Recipe pastaTomat = new Recipe();
        pastaTomat.setName("Pasta med tomatsovs og friskrevet parmesan");
        pastaTomat.setDescription("En klassisk pastaret med en lækker tomatsovs og friskrevet parmesan");
        pastaTomat.setPreparationTime(30);
        pastaTomat.setServings(4);

        Map<Long, Integer> pastaTomatIngredients = new HashMap<>();
        pastaTomatIngredients.put(412375L, 500); // Fettucine
        pastaTomatIngredients.put(108875L, 1); // pastasauce
        pastaTomatIngredients.put(118421L, 2); // olivenolie
        pastaTomatIngredients.put(455418L, 100); // parmesan
        pastaTomat.setProducts(pastaTomatIngredients);

        recipeRepository.save(pastaTomat);
    }
}
