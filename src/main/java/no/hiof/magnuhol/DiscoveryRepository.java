package no.hiof.magnuhol;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import no.hiof.magnuhol.model.*;
import no.hiof.magnuhol.repository.IDiscoveryRepository;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiscoveryRepository implements IDiscoveryRepository {
   public ArrayList<Observation> observation = new ArrayList<>();
   String filename;


    public DiscoveryRepository(String filename){
        this.filename = filename;
        ObservationSystem();



    }

    public void ObservationSystem (){

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
    Amphibians amphibian2  = new Amphibians("Amphibian","lethal", 9, "male",  270);

    ArrayList<Observation> obs = new ArrayList<>();


    Observation firstObs = new Observation(6, "small birb", bird1, location1, LocalDate.of(2369, 12, 4), 1, "https://whyevolutionistrue.files.wordpress.com/2013/07/mgazwrc.jpg?w=1000", "most depry looking thing we have discovered this far. In need of extinction");
    Observation secondObs = new Observation(2, "Giant caterpillar", invertebrate1, location2, LocalDate.of(2372, 6, 15), 3, "https://i.pinimg.com/originals/3e/f0/67/3ef0675cc3a37938c73fc0ae106a461b.jpg", "We found this giant catterpillar that could swallow a man whole, and there were 3 of them");
    Observation thirdObs = new Observation(3, "Giant salamander", amphibian1 , location3, LocalDate.of(2373, 8, 10), 1, "https://i0.wp.com/www.weirdasianews.com/wp-content/uploads/2014/08/top5-500x301.jpg?resize=500%2C301", "We found this guy slithering around in the sun, very uninteresting i must say");
    Observation fourthObs = new Observation(4, "Nationalistic bird", bird2 , location4, LocalDate.of(2374, 10, 12), 1, "https://www.nkytribune.com/wp-content/uploads/2016/11/Golden-Eagle-1.jpg", "closest thing we have come to an eagle that is not on earth, except bigger");
    Observation fifthObs = new Observation(5, "frog boss", amphibian2 , location5, LocalDate.of(2376, 8, 3), 1, "https://thumbs.gfycat.com/PettyFlimsyJaguarundi-size_restricted.gif", "This huge bugger will definetly make you struggle to move on with your quests.");

        obs.add(firstObs);
        obs.add(secondObs);
        obs.add(thirdObs);
        obs.add(fourthObs);
        obs.add(fifthObs);

        Collections.sort(obs);
        observation.addAll(obs);

     }



    @Override
    public Observation getObservation(String obsName) {
        for (Observation observation : observation) {
            if (observation.getName().equals(obsName)) {
                return observation;
            }
        }

        return null;
    }

    @Override
    public ArrayList<Observation> getObservations() {
        return new ArrayList<>(observation);
    }


    @Override
    public void removeObs(String obsName) {

    }


}
