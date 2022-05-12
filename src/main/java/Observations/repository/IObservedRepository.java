package Observations.repository;

import Observations.Animals.Animals;
import Observations.models.Location;
import Observations.models.Observation;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface IObservedRepository {
    ArrayList<Observation> getObservations();
    Observation getObservation(int observationId);

    void delObservation(int observationId);
    void createObservation(String name, Animals animals, Location location, LocalDateTime dateTime, int amount, String imageUrl, String description);


}
