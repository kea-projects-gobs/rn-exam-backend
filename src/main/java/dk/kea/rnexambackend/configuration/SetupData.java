package dk.kea.rnexambackend.configuration;

import dk.kea.rnexambackend.app.entity.Recipe;
import dk.kea.rnexambackend.app.repository.RecipeRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
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
        pastaTomat.setImageUrl("https://content-images.digital.rema1000.dk/2rD17NG8ans9eLdgagMpw3/feb6d1e466db698d566f43724fa4ecc6/0209_Cucina_tomatsauce_med_pasta_og_friskrevet_parmesan.jpg?w=670&fm=webp&q=90");
        pastaTomat.setInstructions(List.of("Kog pastaen efter anvisning på pakken. Når pastaen er kogt, hældens den i en sigte.",
        "Gryden stilles tilbage på pladen ved medium varme og en smule olivenolie hældes i.",
        "Pastasauce tilsættes, og varmes i få minutter under omrøring.",
        "Pastaen hældes i gryden, og de to ting blandes godt sammen.",
        "Retten hældes i en skål og serveres med friskrevet parmesan."));

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
        Dahl.setImageUrl("https://content-images.digital.rema1000.dk/5VfBwUQ9WUSDQFvKNvBOnE/46b7aec3e60e880dc7f63b3d6b638995/0337_Dahl.jpg?w=670&fm=webp&q=90");
        Dahl.setInstructions(List.of("Svits krydderier, løg og hvidløg i en gryde i et par minutter. Brug lidt vand eller olie, så det ikke brænder på.",
                "Skyl linserne og put dem i gryden sammen med salt, sukker, tomatpure og vand.",
                "Lad retten koge i 25 minutter under låg. Smag til med salt og chili.",
                "Spises sammen med ris og evt. mangochutney, ananasstykker, friskhakket koriander, peanuts og brød."));

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
        hurtigRamensuppeMedKylling.setImageUrl("https://mambeno.dk/wp-content/uploads/2017/11/Ramensuppe.jpg");
        hurtigRamensuppeMedKylling.setInstructions(List.of("Hæld vandet fra ingredienslisten i en stor gryde sammen med smuldrede bouillonterninger. Tænd for fuldt blus og bring vandet i kog.",
                "Bring en lille kasserolle med vand i kog til æggene. Giv æggene ti minutter og overhæld dem straks med koldt vand - så koger de ikke videre og bliver nemmere at pille.",
                "Rens og skyl champignoner og forårsløg. Skær champignonerne i halve, skræl gulerødderne og skær dem i tynde stave. Snit forårslågene i mundrette bidder på skrå. Gem lidt af den grønne top til pynt. Stil det hele til side.",
                "Skær kyllingen i tynde strimler - husk at vaske fingre og køkkenredskaber efterfølgende. Når vandet koger, tilsætter du kyllingen og lader det simre i fem-ti minutter, til kyllingen er næsten gennemstegt - alt efter tykkelse.",
                "Tilsæt champignoner og nudler og kog videre i ca. fem minutter, til nudlerne er møre.",
                "Smag til med soya og evt. mere bouillon. Tilsæt til sidst forårsløg. Vær opmærksom på, at forårsløg kan være stærke for mindre børn, så sørg for at de er så store, at de kan pilles fra.",
                "Server suppen i dybe tallerkener med halve æg og evt. lidt ekstra soya og forårsløg på toppen."));

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
        asiatiskBlomkål.setImageUrl("https://content-images.digital.rema1000.dk/1CSlFUrpJmoFHbE28Dywe9/b4a82d96a16ac1744c9bfa7e72ad7bc8/0242_Asian_style_blomka_l.jpg?w=670&fm=webp&q=90");
        asiatiskBlomkål.setInstructions(List.of("Skyl blomkål. Skræl ingefær og skær i grove stykker.",
                "Kog blomkålen i 7 minutter. Tag det straks op og nedkøl det i koldt vand, så det ikke koger videre, og dermed bevarer sit bid.",
                "Kom lidt olie på panden. Skær blomkålen over i kvarte og læg dem på panden. Læg ingefæren på panden. Det giver en dejlig smag til olien, som trækker ind i blomkålen.",
                "Krydr med salt, peber og karry. Brun det af og tilsæt sesam.",
                "Kom smør på panden og lad det smelte. Øs det over blomkålen hele tiden. Det er vigtigt at blomkålen indeni får masser af smør, så smagen trænger ind. Steg blomkålen i 5 minutter på middel varme.",
                "Hæld sød chili sauce på panden og øs det over blomkålen.",
                "Når blomkålen har fået ca. 10 minutter i alt, kommes det over på tallerkenen. Kom lidt sauce over. Krydr med en smule salt og servér straks."));

        Map<Long, Integer> asiatiskBlomkålIngredients = new HashMap<>();
        asiatiskBlomkålIngredients.put(306254L, 1); // Blomkål
        asiatiskBlomkålIngredients.put(306880L, 1); // Ingefær
        asiatiskBlomkålIngredients.put(90248L, 1); // Sesamfrø
        asiatiskBlomkålIngredients.put(90909L, 1); // Karry Pulver
        asiatiskBlomkålIngredients.put(101167L, 1); // Sød Chilisauce
        asiatiskBlomkålIngredients.put(25751L, 1); // Smør

        asiatiskBlomkål.setIngredients(asiatiskBlomkålIngredients);

        recipeRepository.save(asiatiskBlomkål);

        //Recipe 5
        Recipe glutenfriTacoToast = new Recipe();
        glutenfriTacoToast.setName("Glutenfri taco toast");
        glutenfriTacoToast.setDescription("En lækker glutenfri taco toast med masser af smag");
        glutenfriTacoToast.setPreparationTime(30);
        glutenfriTacoToast.setServings(4);
        glutenfriTacoToast.setImageUrl("https://content-images.digital.rema1000.dk/5KV1FjGtsiWLTPu1OEUCut/14c74cb02af2fcca511620876911bbf2/0478_Glutenfri_taco_toast.jpg?w=670&fm=webp&q=90");
        glutenfriTacoToast.setInstructions(List.of("Opvarm ovnen til 200°.",
                "Skær kyllingen ud i små tern og steg dem på panden i en spiseske olie. Mos eller blend avokado og creme fraiche sammen til en guacamole.",
                "Pensel alle skiver brød med olie på den ene side.",
                "Placer 5 af skiverne på en bageplade med oliesiden nedad. Smør skiverne med tacosauce.",
                "Fordel cheddarosten, så den dækker brødskiverne med ost.",
                "Skær tomaterne ud i små tern og fordel dem oven på osten. Læg derefter et lag kylling og fordel guacamolen oven på kyllingen. Drys med salt og peber.",
                "Læg en skive brød over med oliesiden opad.",
                "Bag dem i ovnen i 10 minutter eller til oversiden er gylden."));

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
        spaghettiMedDijonsennep.setImageUrl("https://content-images.digital.rema1000.dk/3gpWnBF6utYj0xLtk4tCF2/778d35b9e16c3de3d217c746f2fd5cd5/0060_Spaghetti_med_dijonsennep.jpg?w=670&fm=webp&q=90");
        spaghettiMedDijonsennep.setInstructions(List.of("Rens hvidløg og skær i skiver. Pil og hak løg. Kog spaghetti efter anvisning på pakken.",
                "Kom olivenolie i en pande. Kom hvidløg og løg i olien. Pas på - de må ikke tage farve. Kom spaghettien ved og en lille smule smør.",
                "Tilsæt dijonsennep og piskefløde. Krydr rigeligt med peber og en smule salt.",
                "Riv lidt parmesanost ned i saucen. Man kan eventuelt bruge to slags ost. Lad saucen koge lidt.",
                "Anret pastaen på tallerken – og riv lidt parmesanost over. Krydres afslutningsvist med peber."));

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
        pandekylling.setImageUrl("https://content-images.digital.rema1000.dk/4nWhAnbih94WnYf3BJKwDc/a0617c1f70a39d98b76d3e55ee45ea48/0002_Pandekylling.jpg?w=670&fm=webp&q=90");
        pandekylling.setInstructions(List.of("Skær hvert kyllingebryst i 2-3 stykker, og brun dem i fedtstoffet i ca. 5 minutter. Pres hvidløg og tilsæt.",
                "Skær porre i skiver af ca. ½ cm og persillerødderne i tern eller stave. Svits derefter i 2-3 minutter.",
                "Tilsæt tomater og krydderier, og lad retten småkoge i ca. 15 minutter med låg.",
                "Skær peberfrugt i strimler, og tilføj til retten. Lad retten koge i yderligere 2-3 minutter. Smag til, og jævn evt. sovsen.",
                "Server pandekylling med fuldkornspasta, -ris eller -bulgur og salat."));

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
        kartoffelsuppeMedPorreOgBacon.setImageUrl("https://content-images.digital.rema1000.dk/63Fb9VNWtZHEEnJGXsCIrn/2da9b5bef52db5df0138bf35639f49b7/0004_Kartoffelsuppe_med_porre_og_bacon.jpg?w=670&fm=webp&q=90");
        kartoffelsuppeMedPorreOgBacon.setInstructions(List.of("Skræl kartofler og skær dem i tern. Rens porre grundigt og skær dem i tynde skiver. Du skal bruge de hvide og lysegrønne dele. Hak løg og hvidløg fint.",
                "Smelt smør i en stor gryde over medium varme. Tilsæt løg, hvidløg og porrer, og svits dem, indtil de bliver bløde og gennemsigtige, omkring 5-7 minutter. Rør ofte for at undgå, at de brænder på.",
                "Tilføj kartoffelternene til gryden sammen med bouillonen. Bring blandingen i kog, skru ned for varmen og lad det simre under låg i cirka 20 minutter, eller indtil kartoflerne er møre.",
                "Blend til en glat konsistens med en stavblender direkte i gryden, eller i portioner i en blender.",
                "Hæld suppen tilbage til gryden (hvis du brugte blender), tilsæt fløde og opvarm igen. Smag til med salt og peber. Juster konsistensen med ekstra bouillon, hvis suppen er for tyk.",
                "Steg bacon på en tør pande og lad det dryppe af på fedtsugende papir.",
                "Tilsæt porre til panden og lad stege ved kraftig varme i et par minutter.",
                "Server suppen varm, pyntet med porre, sprødstegt bacon og brød til."));

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
        kyllingefarsbrød.setImageUrl("https://content-images.digital.rema1000.dk/6HajUwSHJQuNsyK2CixC9A/560bf05617b442ec7f99a8e6c7d02e45/0012_Kyllingefarsbr_d.jpg?w=670&fm=webp&q=90");
        kyllingefarsbrød.setInstructions(List.of("Riv citronskal. Hak timian, estragon, hvidløg og skalotteløg fint.",
                "Bland hakket kyllingekød med revet citronskal, timian, estragon, hvidløg og skalotteløg og rasp. Form det til et brød. Drys rasp henover.",
                "Skær spidskål på langs i otte stykker og læg i bunden af et ildfast fad.",
                "Rør piskefløde sammen med dijon sennep, salt og peber. Hæld fløden i bunden af fadet med spidskål. Læg farsbrødet ovenpå.",
                "Bag farsbrødet ved 180° i 25-30 minutter. Farsbrødet skal være gyldenbrunt. Lad det trække i 5 minutter inden servering.",
                "Server kartoffelmos eller kogte kartofler til."));

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
        mørbradALaCreme.setImageUrl("https://content-images.digital.rema1000.dk/3HxRQcFNeWrWVGuDbD3wQh/a01345007e810d811bb958f3d6008a0d/0019_M_rbrad_a_la_creme.jpg?w=670&fm=webp&q=90");
        mørbradALaCreme.setInstructions(List.of("Afpuds mørbrad og skær den i tykke skiver.",
        "Steg mørbradbøfferne på en pande i lidt olie og krydr med salt og peber. Steges i ca. 4 minutter på hver side. Tag mørbradbøfferne af panden og lad dem hvile.",
        "Skær hvidløg og rødløg i skiver. Rens og skær champignon i tykke skiver. Steg hvidløg, rødløg og champignon på panden.",
        "Tilsæt dijon sennep, hvidvinseddike og basilikumblade, og rør det hele godt sammen på panden. Tilsæt fløde og lad det koge godt igennem.",
        "Hæld saucen over mørbradbøfferne og anret det hele på et fad. Server straks med syltede asier, syltede rødbeder og rugbrød."));

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
        spinatSalat.setImageUrl("https://content-images.digital.rema1000.dk/4ScRoAXW65e0EdexNMyzFJ/5c9be3eb2f5e986cf2194f372abb5439/1058_spinatsalat_fra_323.jpg?w=670&fm=webp&q=90");
        spinatSalat.setInstructions(List.of("Bland olivenolie, balsamicoeddike og knust hvidløg, salt og peber. Skyl tomaterne, og skær dem i halve.",
                "Bland halvdelen af dressingen med tomaterne og hæld dem i et stort fad. Bag tomaterne ved 150° i 45 minutter.",
                "Hak mandlerne groft og rist dem kort på panden i lidt olie.",
                "Skyl spinatbladene, tør dem godt og fordel dem i et fladt fad. Fordel de bagte tomater ovenpå og hæld resten af dressingen over.",
                "Drys til sidst mandlerne på salaten."));

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
        farvedeBederMedTeriyaki.setImageUrl("https://content-images.digital.rema1000.dk/9UVuFf7ZiESEfdmqPHwZM/9a5cdc900b8ecc896ebf4875bdd00fb1/Uge_39_-_Beder_med_teriyaki_2.jpg?w=670&fm=webp&q=90");
        farvedeBederMedTeriyaki.setInstructions(List.of("Skræl bederne og skær dem i mindre både.",
                "Vend med olie, salt og peber, og fordel dem på en bageplade med bagepapir.",
                "Bag ved 200° varmluft i 20 min.",
                "Fordel teriyaki glazen over bederne og vend det godt rundt med en ske, så teriyaki glazen fordeles godt på alle bederne.",
                "Bag yderligere 10 min ved 200° varmluft."));

        Map<Long, Integer> farvedeBederMedTeriyakiIngredients = new HashMap<>();
        farvedeBederMedTeriyakiIngredients.put(306646L, 1); // Farvede Beder
        farvedeBederMedTeriyakiIngredients.put(118421L, 1); // Olie
        farvedeBederMedTeriyakiIngredients.put(101574L, 1); // Teriyaki Glaze

        farvedeBederMedTeriyaki.setIngredients(farvedeBederMedTeriyakiIngredients);

        recipeRepository.save(farvedeBederMedTeriyaki);

        //Recipe 13
        Recipe rösti = new Recipe();
        rösti.setName("Rösti");
        rösti.setDescription("En lækkert rösti med masser af smag");
        rösti.setPreparationTime(30);
        rösti.setServings(4);
        rösti.setImageUrl("https://content-images.digital.rema1000.dk/1sXBJYeeSxQdlIfpVxLZar/e6719cbaf05249e1c693e57c1ba29c4c/0833_Reste-ro_sti.jpg?w=670&fm=webp&q=90");
        rösti.setInstructions(List.of("Riv rodfrugterne groft. Pisk æg.",
                "Læg de revne rodfrugter i koldt vand, og skyl dem godt, indtil vandet er klart. Tør rodfrugterne i et rent viskestykke.",
                "Kom de revne og tørre rodfrugter i en skål. Tilføj salt, peber, hvedemel og de sammenpiskede æg.",
                "Form små runde ’kager’ på plader med bagepapir og pensl dem med en smule olivenolie.",
                "Bag röstierne ved 200° varmluft til de er gyldne og sprøde, ca. i 20-25 minutter. Er de ikke sprøde, så giv dem lidt længere tid i ovnen."));

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
        porrerIVinaigrette.setImageUrl("https://content-images.digital.rema1000.dk/6i3wQP7O3ifCKsp54VPqcV/96b9f6186a18fe2029871ffedac40600/0815_Porre_i_vinagrette.jpg?w=670&fm=webp&q=90");
        porrerIVinaigrette.setInstructions(List.of("Skyl porre og kog i letsaltet vand i 5 minutter. Tag porre op af vandet og lad dryppe af.",
                "Pres citronsaft og rør sammen med de resterende ingredienser til vinaigrette.",
                "Vend porre i vinaigrette og krydr med friskkværnet peber. Servér med rucola, salat og et godt brød til."));

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
        bagtBlomkålIBBQSauce.setImageUrl("https://content-images.digital.rema1000.dk/69nkY3sQJTMayEQdBojEO2/fbd4cce1a6a737052438ef18490343c0/Uge_27_-_Bagt_blomk_l_i_BBQ_sauce.jpg?w=670&fm=webp&q=90");
        bagtBlomkålIBBQSauce.setInstructions(List.of("Skyl blomkålen og dup tør. Skær herefter ud i mindre buketter.",
                "Vend blomkålsbuketterne grundigt med olie, salt, peber og BBQ sauce, så saucen bliver fordelt godt på alle blomkåls buketterne.",
                "Placer blomkålen i et ildfast fad eller på en bageplade og bag ved 220° varmluft i ca. 30 min."));

        Map<Long, Integer> bagtBlomkålIBBQSauceIngredients = new HashMap<>();
        bagtBlomkålIBBQSauceIngredients.put(306254L, 1); // Blomkål
        bagtBlomkålIBBQSauceIngredients.put(110238L, 1); // BBQ Sauce
        bagtBlomkålIBBQSauceIngredients.put(118421L, 1); // Olie

        bagtBlomkålIBBQSauce.setIngredients(bagtBlomkålIBBQSauceIngredients);

        recipeRepository.save(bagtBlomkålIBBQSauce);


    }
}
