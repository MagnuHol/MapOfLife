package no.hiof.magnuhol.controller;

import io.javalin.http.Context;
import no.hiof.magnuhol.model.Lifeforms;
import no.hiof.magnuhol.repository.IDiscoveryRepository;

import java.util.ArrayList;

public class ObservationController {
    private IDiscoveryRepository discoveryRepository;

    public ObservationController(IDiscoveryRepository discoveryRepository){
        this.discoveryRepository = discoveryRepository;
    }

    public void getAllObservations(Context context) {
        context.json(discoveryRepository.getObservations());
    }

    public void getObservation(Context context) {
        String obsName = context.pathParam("observation-id");
        context.json(discoveryRepository.getObservation(obsName));
    }

    public void removeObs(Context context){
        String obsName = context.pathParam("observation-id");
        discoveryRepository.removeObs(obsName);
        context.redirect("/observations/");
    }








}
