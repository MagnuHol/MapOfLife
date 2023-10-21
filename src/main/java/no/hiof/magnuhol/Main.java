package no.hiof.magnuhol;

import no.hiof.magnuhol.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {



        Planet planet1 = new Planet("Gargantua", 130592);
        Planet planet2 = new Planet("Zeues", 6450);

        Biome area1 = new Biome("forest", 24);
        Biome area2 = new Biome("swamp", 19);
        Biome area3 = new Biome("beach", 35);
        Biome area4 = new Biome("desert", 39);
        Biome area5 = new Biome("forest", 15);

        Location location1 = new Location(planet1, 23.563987, 5.518819, area1 );
        Location location2 = new Location(planet1, 63.704722, 14.313750, area2 );
        Location location3 = new Location(planet1, 43.402722, 32.523750, area3 );
        Location location4 = new Location(planet2, 13.532221, 54.84327, area4 );
        Location location5 = new Location(planet2, 53.406351, 39.54312, area5 );

        Birds bird1 = new Birds("Bird" ,"not lethal", 15, "male", 1);
        Invertebrates invertebrate1 = new Invertebrates("Invertebrate","lethal",3, "brownish", "female",  102);
        Amphibians amphibian1  = new Amphibians("Amphibian","not lethal", 27, "male",  40);
        Birds bird2 = new Birds("Bird","lethal", 25, "female", 5);
        Amphibians amphibian2  = new Amphibians("Amphibian","lethal", 9, "male",  2);


        ArrayList<Observation> obs1 = new ArrayList<>();

        Observation firstObs = new Observation(9, "small birb", bird1, location1, LocalDate.of(2369, 12, 4), 1, "https://i.pinimg.com/originals/d9/44/ba/d944ba7a038d81af40bad8b85562541e.jpg", "its one nasty ass bird, shits on everything");
        Observation secondObs = new Observation(2, "Giant caterpillar", invertebrate1, location2, LocalDate.of(2372, 6, 15), 3, "https://i.pinimg.com/originals/3e/f0/67/3ef0675cc3a37938c73fc0ae106a461b.jpg", "We found this giant catterpillar that could swallow a man whole, and there were 3 of them");
        Observation thirdObs = new Observation(3, "Giant salamander", amphibian1 , location3, LocalDate.of(2373, 8, 10), 1, "https://i0.wp.com/www.weirdasianews.com/wp-content/uploads/2014/08/top5-500x301.jpg?resize=500%2C301", "We found this guy slithering around in the sun, very uninteresting i must say");
        Observation fourthObs = new Observation(4, "Nationalistic bird", bird2 , location4, LocalDate.of(2374, 10, 12), 1, "https://i0.wp.com/www.weirdasianews.com/wp-content/uploads/2014/08/top5-500x301.jpg?resize=500%2C301", "closest thing we have come to an eagle that is not on earth, except bigger");
        Observation fifthObs = new Observation(5, "Giant salamander", amphibian2 , location5, LocalDate.of(2376, 8, 3), 1, "https://i0.wp.com/www.weirdasianews.com/wp-content/uploads/2014/08/top5-500x301.jpg?resize=500%2C301", "This small bugger is extremely poisonous");

        obs1.add(firstObs);
        obs1.add(secondObs);
        obs1.add(thirdObs);
        obs1.add(fourthObs);
        obs1.add(fifthObs);

        Collections.sort(obs1);
        System.out.println(obs1);

    }

}
