package no.hiof.magnuhol.repository;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import no.hiof.magnuhol.DiscoveryRepository;
import no.hiof.magnuhol.model.Observation;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JSONhandler implements IDiscoveryRepository  {
    private ArrayList<Observation> observation = new ArrayList<>();
    String filename;
    DiscoveryRepository discoveryRep;




    public JSONhandler(String filename){
        this.filename = filename;
        discoveryRep = new DiscoveryRepository(filename);
        writeToJson(filename);
        readFile(filename);
    }

    


    public List<Observation> readFile(String filename) {

        try {
            File file = new File(filename);
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());

            Observation[] obsArray = objectMapper.readValue(file, Observation[].class);

            Collections.addAll(observation, obsArray);
        } catch (JsonParseException | JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return observation;

    }

    public void writeToJson (String filename) {

        try{
            File file = new File(filename);

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            ArrayList<Observation> list = discoveryRep.getObservations();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, list);


        } catch (JsonParseException | JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

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


    //funker ikke helt.
    @Override
    public void removeObs(String obsName) {
        Observation discovery = getObservation(obsName);
        if( discovery != null){
            getObservation(obsName).removeObs(discovery);

        }
        writeToJson("observations.json");
    }


}
