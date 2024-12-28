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
        // IF not already in database, add the following recipe:
        //Recipe 1
        Recipe pastaTomat = new Recipe();
        pastaTomat.setName("Pasta med tomatsovs og friskrevet parmesan");
        pastaTomat.setDescription("En klassisk pastaret med en lækker tomatsovs og friskrevet parmesan");
        pastaTomat.setPreparationTime(30);
        pastaTomat.setServings(4);

        Map<Long, Integer> pastaTomatIngredients = new HashMap<>();
        pastaTomatIngredients.put(412375L, 1); // Fettucine
        pastaTomatIngredients.put(108875L, 1); // pastasauce
        pastaTomatIngredients.put(118421L, 1); // olivenolie
        pastaTomatIngredients.put(455418L, 1); // parmesan
        pastaTomat.setIngredients(pastaTomatIngredients);

        recipeRepository.save(pastaTomat);

        //Recipe 2
        Recipe Dahl = new Recipe();
        Dahl.setName("Dahl");
        Dahl.setDescription("En lækker dahl med masser af smag og krydderier");
        Dahl.setPreparationTime(45);
        Dahl.setServings(4);

        Map<Long, Integer> DahlIngredients = new HashMap<>();
        DahlIngredients.put(90127L, 1); // Stødt Koriander
        DahlIngredients.put(90039L, 1); // Spidskommen
        DahlIngredients.put(90126L, 1); // gurkemeje
        DahlIngredients.put(306960L, 1); // Løg
        DahlIngredients.put(306890L, 1); // Hvidløg
        DahlIngredients.put(91398L, 1); // Røde linser
        DahlIngredients.put(91399L, 1); // Grønne Linser
        DahlIngredients.put(108875L, 1); // Pastasauce
        DahlIngredients.put(110064L, 1); // Olivenolie

        Dahl.setIngredients(DahlIngredients);

        recipeRepository.save(Dahl);

        //Recipe 3
        Recipe hurtigRamensuppeMedKylling = new Recipe();
        hurtigRamensuppeMedKylling.setName("Hurtig Ramen suppe med kylling");
        hurtigRamensuppeMedKylling.setDescription("En hurtig og lækker ramen suppe med kylling og nudler");
        hurtigRamensuppeMedKylling.setPreparationTime(20);
        hurtigRamensuppeMedKylling.setServings(4);

        Map<Long, Integer> hurtigRamensuppeMedKyllingIngredients = new HashMap<>();
        hurtigRamensuppeMedKyllingIngredients.put(100353L, 1); // Hønsebouillon
        hurtigRamensuppeMedKyllingIngredients.put(220017L, 1); // Æg
        hurtigRamensuppeMedKyllingIngredients.put(306700L, 1); // Champignon
        hurtigRamensuppeMedKyllingIngredients.put(306453L, 1); // Forårsløg
        hurtigRamensuppeMedKyllingIngredients.put(306520L, 1); // Gulerødder
        hurtigRamensuppeMedKyllingIngredients.put(411229L, 1); // Kyllingefillet
        hurtigRamensuppeMedKyllingIngredients.put(90445L, 1); // Fuldkornsnudler
        hurtigRamensuppeMedKyllingIngredients.put(120053L, 1); // Soya

        hurtigRamensuppeMedKylling.setIngredients(hurtigRamensuppeMedKyllingIngredients);

        recipeRepository.save(hurtigRamensuppeMedKylling);

        //Recipe 4
        Recipe asiatiskBlomkål = new Recipe();
        asiatiskBlomkål.setName("Asiatisk blomkål");
        asiatiskBlomkål.setDescription("En lækker asiatisk inspireret blomkål med masser af smag");
        asiatiskBlomkål.setPreparationTime(30);
        asiatiskBlomkål.setServings(4);

        Map<Long, Integer> asiatiskBlomkålIngredients = new HashMap<>();
        asiatiskBlomkålIngredients.put(306254L, 1); // Blomkål
        asiatiskBlomkålIngredients.put(306880L, 1); // Ingefær
        asiatiskBlomkålIngredients.put(90248L, 1); // Sesamfrø
        asiatiskBlomkålIngredients.put(90909L, 1); // Karry Pulver
        asiatiskBlomkålIngredients.put(101167, 1); // Sød Chilisauce
        asiatiskBlomkålIngredients.put(25751L, 1); // Smør

        asiatiskBlomkål.setIngredients(asiatiskBlomkålIngredients);

        recipeRepository.save(asiatiskBlomkål);

        //Recipe 5
        Recipe glutenfriTacoToast = new Recipe();
        glutenfriTacoToast.setName("Glutenfri taco toast");
        glutenfriTacoToast.setDescription("En lækker glutenfri taco toast med masser af smag");
        glutenfriTacoToast.setPreparationTime(30);
        glutenfriTacoToast.setServings(4);

        Map<Long, Integer> glutenfriTacoToastIngredients = new HashMap<>();
        glutenfriTacoToastIngredients.put(411229L, 1); // Kyllingefillet
        glutenfriTacoToastIngredients.put(110064L, 1); // Olivenolie
        glutenfriTacoToastIngredients.put(60113L, 1); // Toast
        glutenfriTacoToastIngredients.put(102801L, 1); // TacoSauce
        glutenfriTacoToastIngredients.put(455585L, 1); // Cheddar
        glutenfriTacoToastIngredients.put(306160L, 1); // Cherrytomater
        glutenfriTacoToastIngredients.put(305405L, 1); // Avocado
        glutenfriTacoToastIngredients.put(23420L, 1); // Cremefraiche

        glutenfriTacoToast.setIngredients(glutenfriTacoToastIngredients);

        recipeRepository.save(glutenfriTacoToast);

        //Recipe 6
        Recipe spaghettiMedDijonsennep = new Recipe();
        spaghettiMedDijonsennep.setName("Spaghetti med dijonsennep");
        spaghettiMedDijonsennep.setDescription("En lækker spaghetti med dijonsennep og masser af smag");
        spaghettiMedDijonsennep.setPreparationTime(30);
        spaghettiMedDijonsennep.setServings(4);

        Map<Long, Integer> spaghettiMedDijonsennepIngredients = new HashMap<>();
        spaghettiMedDijonsennepIngredients.put(90352L, 1); // Spaghetti
        spaghettiMedDijonsennepIngredients.put(306890L, 1); // Hvidløg
        spaghettiMedDijonsennepIngredients.put(306960L, 1); // Løg
        spaghettiMedDijonsennepIngredients.put(110156L, 1); // Dijonsennep
        spaghettiMedDijonsennepIngredients.put(21810L, 1); // Piskefløde
        spaghettiMedDijonsennepIngredients.put(455418L, 1); // Parmesan
        spaghettiMedDijonsennepIngredients.put(25751L, 1); // Smør

        spaghettiMedDijonsennep.setIngredients(spaghettiMedDijonsennepIngredients);

        recipeRepository.save(spaghettiMedDijonsennep);

        //Recipe 7
        Recipe pandekylling = new Recipe();
        pandekylling.setName("Pandekylling");
        pandekylling.setDescription("En lækker pandekylling med masser af smag");
        pandekylling.setPreparationTime(30);
        pandekylling.setServings(4);

        Map<Long, Integer> pandekyllingIngredients = new HashMap<>();
        pandekyllingIngredients.put(404995L, 1); // Kyllingebrystfillet
        pandekyllingIngredients.put(231625L, 1); // Flydende Fedstoff
        pandekyllingIngredients.put(306890L, 1); // Hvidløg
        pandekyllingIngredients.put(306600L, 1); // Porrer
        pandekyllingIngredients.put(306637L, 1); // Øko. Persillerod
        pandekyllingIngredients.put(108341L, 1); // Hakkerede Tomater
        pandekyllingIngredients.put(306345L, 1); // Peberfrugt
        pandekyllingIngredients.put(90925L, 1); // Tørret Oregano
        pandekyllingIngredients.put(90293L, 1); // Paprika

        pandekylling.setIngredients(pandekyllingIngredients);

        recipeRepository.save(pandekylling);

        //Recipe 8
        Recipe kartoffelsuppeMedPorreOgBacon = new Recipe();
        kartoffelsuppeMedPorreOgBacon.setName("Kartoffelsuppe med porre og bacon");
        kartoffelsuppeMedPorreOgBacon.setDescription("En lækker kartoffelsuppe med porre og bacon");
        kartoffelsuppeMedPorreOgBacon.setPreparationTime(30);
        kartoffelsuppeMedPorreOgBacon.setServings(4);

        Map<Long, Integer> kartoffelsuppeMedPorreOgBaconIngredients = new HashMap<>();
        kartoffelsuppeMedPorreOgBaconIngredients.put(25506L, 1); // Smør
        kartoffelsuppeMedPorreOgBaconIngredients.put(306960L, 1); // Løg
        kartoffelsuppeMedPorreOgBaconIngredients.put(306932L, 1); // Kartoffler
        kartoffelsuppeMedPorreOgBaconIngredients.put(306600L, 1); // Porrer
        kartoffelsuppeMedPorreOgBaconIngredients.put(306890L, 1); // Hvidløg
        kartoffelsuppeMedPorreOgBaconIngredients.put(100369L, 1); // Grønsagsbouillon
        kartoffelsuppeMedPorreOgBaconIngredients.put(21927L, 1); // Piskefløde
        kartoffelsuppeMedPorreOgBaconIngredients.put(410875L, 1); // Bacon i tern

        kartoffelsuppeMedPorreOgBacon.setIngredients(kartoffelsuppeMedPorreOgBaconIngredients);

        recipeRepository.save(kartoffelsuppeMedPorreOgBacon);

        //Recipe 9
        Recipe kyllingefarsbrød = new Recipe();
        kyllingefarsbrød.setName("Kyllingefarsbrød");
        kyllingefarsbrød.setDescription("En lækker kyllingefarsbrød med masser af smag");
        kyllingefarsbrød.setPreparationTime(30);
        kyllingefarsbrød.setServings(4);

        Map<Long, Integer> kyllingefarsbrødIngredients = new HashMap<>();
        kyllingefarsbrødIngredients.put(404899L, 1); // Hakket kyllingekød
        kyllingefarsbrødIngredients.put(304585L, 1); // Øko. Citron
        kyllingefarsbrødIngredients.put(306890L, 1); // Hvidløg
        kyllingefarsbrødIngredients.put(306790L, 1); // Estragon
        kyllingefarsbrødIngredients.put(306977L, 1); // Skalotteløg
        kyllingefarsbrødIngredients.put(90003L, 1); // Rasp
        kyllingefarsbrødIngredients.put(306650L, 1); // Spidskål
        kyllingefarsbrødIngredients.put(21659L, 1); // Piskefløde
        kyllingefarsbrødIngredients.put(110156L, 1); // DijonSennep

        kyllingefarsbrød.setIngredients(kyllingefarsbrødIngredients);

        recipeRepository.save(kyllingefarsbrød);

        //Recipe 10
        Recipe mørbradALaCreme = new Recipe();
        mørbradALaCreme.setName("Mørbrad a la creme");
        mørbradALaCreme.setDescription("En lækker mørbrad a la creme med masser af smag");
        mørbradALaCreme.setPreparationTime(30);
        mørbradALaCreme.setServings(4);

        Map<Long, Integer> mørbradALaCremeIngredients = new HashMap<>();
        mørbradALaCremeIngredients.put(401060L, 1); // Mørbrad
        mørbradALaCremeIngredients.put(306689L, 1); // Øko. Champignon
        mørbradALaCremeIngredients.put(306958L, 1); // Rødløg
        mørbradALaCremeIngredients.put(306890L, 1); // Hvidløg
        mørbradALaCremeIngredients.put(100914L, 1); // Hvidvinseddike
        mørbradALaCremeIngredients.put(90926L, 1); // Basilikum
        mørbradALaCremeIngredients.put(110156L, 1); // DijonSennep
        mørbradALaCremeIngredients.put(21927L, 1); // Piskefløde

        mørbradALaCreme.setIngredients(mørbradALaCremeIngredients);

        recipeRepository.save(mørbradALaCreme);

        //Recipe 11
        Recipe spinatSalat = new Recipe();
        spinatSalat.setName("Spinatsalat");
        spinatSalat.setDescription("En lækker spinatsalat med masser af smag");
        spinatSalat.setPreparationTime(30);
        spinatSalat.setServings(4);

        Map<Long, Integer> spinatSalatIngredients = new HashMap<>();
        spinatSalatIngredients.put(118421L, 1); // olivenolie
        spinatSalatIngredients.put(103101L, 1); // Balsaimkoeddike
        spinatSalatIngredients.put(306890L, 1); // Hvidløg
        spinatSalatIngredients.put(306130L, 1); // Tomater
        spinatSalatIngredients.put(90959L, 1); // mandler
        spinatSalatIngredients.put(306423L, 1); // Spinat

        spinatSalat.setIngredients(spinatSalatIngredients);

        recipeRepository.save(spinatSalat);

        //Recipe 12
        Recipe farvedeBederMedTeriyaki = new Recipe();
        farvedeBederMedTeriyaki.setName("Farvede beder med teriyaki");
        farvedeBederMedTeriyaki.setDescription("En lækker farvede beder med teriyaki og masser af smag");
        farvedeBederMedTeriyaki.setPreparationTime(30);
        farvedeBederMedTeriyaki.setServings(4);

        Map<Long, Integer> farvedeBederMedTeriyakiIngredients = new HashMap<>();
        farvedeBederMedTeriyakiIngredients.put(306646L, 1); // Farvede Beder
        farvedeBederMedTeriyakiIngredients.put(110155L, 1); // Olie
        farvedeBederMedTeriyakiIngredients.put(101574L, 1); // Teriyaki Glaze

        farvedeBederMedTeriyaki.setIngredients(farvedeBederMedTeriyakiIngredients);

        recipeRepository.save(farvedeBederMedTeriyaki);

        //Recipe 13
        Recipe rösti = new Recipe();
        rösti.setName("Rösti");
        rösti.setDescription("En lækkert rösti med masser af smag");
        rösti.setPreparationTime(30);
        rösti.setServings(4);

        Map<Long, Integer> röstiIngredients = new HashMap<>();
        röstiIngredients.put(40764L, 1); // Blandede rodfrugter
        röstiIngredients.put(90166L, 1); // Hvedemel
        röstiIngredients.put(220017L, 1); // Æg
        röstiIngredients.put(118421L, 1); // Olie

        rösti.setIngredients(röstiIngredients);

        recipeRepository.save(rösti);

        //Recipe 14
        Recipe porrerIVinaigrette = new Recipe();
        porrerIVinaigrette.setName("Porrer i vinaigrette");
        porrerIVinaigrette.setDescription("En lækker porrer i vinaigrette med masser af smag");
        porrerIVinaigrette.setPreparationTime(30);
        porrerIVinaigrette.setServings(4);

        Map<Long, Integer> porrerIVinaigretteIngredients = new HashMap<>();
        porrerIVinaigretteIngredients.put(306600L, 1); // Porrer
        porrerIVinaigretteIngredients.put(306447L, 1); // Øko. rucola
        porrerIVinaigretteIngredients.put(306215L, 1); // Salat
        porrerIVinaigretteIngredients.put(304585L, 1); // Øko. Citron
        porrerIVinaigretteIngredients.put(110156L, 1); // DijonSennepo
        porrerIVinaigretteIngredients.put(118421L, 1); // Olvieolie
        porrerIVinaigretteIngredients.put(100914L, 1); // Hvidvinseddike

        porrerIVinaigrette.setIngredients(porrerIVinaigretteIngredients);

        recipeRepository.save(porrerIVinaigrette);

        //Recipe 15
        Recipe bagtBlomkålIBBQSauce = new Recipe();
        bagtBlomkålIBBQSauce.setName("Bagt blomkål i BBQ sauce");
        bagtBlomkålIBBQSauce.setDescription("En lækker bagt blomkål i BBQ sauce med masser af smag");
        bagtBlomkålIBBQSauce.setPreparationTime(30);
        bagtBlomkålIBBQSauce.setServings(4);

        Map<Long, Integer> bagtBlomkålIBBQSauceIngredients = new HashMap<>();
        bagtBlomkålIBBQSauceIngredients.put(306254L, 1); // Blomkål
        bagtBlomkålIBBQSauceIngredients.put(110238L, 1); // BBQ Sauce
        bagtBlomkålIBBQSauceIngredients.put(110155L, 1); // Olie

        bagtBlomkålIBBQSauce.setIngredients(bagtBlomkålIBBQSauceIngredients);

        recipeRepository.save(bagtBlomkålIBBQSauce);


    }
}
