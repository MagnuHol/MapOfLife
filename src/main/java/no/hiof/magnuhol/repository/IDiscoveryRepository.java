package no.hiof.magnuhol.repository;

import no.hiof.magnuhol.model.Observation;

import java.util.ArrayList;

public interface IDiscoveryRepository {
    Observation getObservation(String obsName);
    ArrayList<Observation> getObservations();
    void removeObs(String obsName);


}