package Observations.controller;

import Observations.repository.IObservedRepository;
import io.javalin.http.Context;


public class ObservationController {
    private IObservedRepository iObservedRepository;

    public ObservationController(IObservedRepository iObservedRepository){
        this.iObservedRepository = iObservedRepository;
    }
    public void getAllObservations(Context ctx) {
        ctx.json(iObservedRepository.getObservations());

    }


    public void getObservation(Context ctx) {
        String obsId = ctx.pathParam("observations-details");
        int id = Integer.parseInt(obsId);
        ctx.json(iObservedRepository.getObservation(id));
    }



}
