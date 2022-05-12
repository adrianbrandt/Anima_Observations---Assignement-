package Observations;

import Observations.Animals.Amphibian;
import Observations.Animals.Animals;
import Observations.Animals.Bird;
import Observations.Animals.Invertebrates;
import Observations.models.Location;
import Observations.models.Observation;
import Observations.models.Planet;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){

        ArrayList<Observation> observations = new ArrayList<>();
        ArrayList<Animals> animals = new ArrayList<>();

        Animals arkensaun = new Bird("arkensaun","Bird",3,1,6,Boolean.TRUE,Boolean.FALSE);
        Animals tryonaut = new Amphibian("tryonaut", "Amphibian",2,0,Boolean.TRUE,Boolean.TRUE,Boolean.TRUE);
        Animals vertosaur = new Invertebrates("vertosaur","Invertebrates",6,9,Boolean.TRUE,Boolean.FALSE);
        Animals stegotroll = new Invertebrates("stegotroll","Invertebrates",2,16,Boolean.FALSE,Boolean.FALSE);
        Animals brankodrill = new Amphibian("brankodrill","Amphibian",2,4,Boolean.TRUE,Boolean.FALSE,Boolean.FALSE);
        Animals cookiemonster = new Bird("cookiemonster","Bird",4,4,2,Boolean.TRUE,Boolean.TRUE);

        animals.add(arkensaun);
        animals.add(tryonaut);
        animals.add(vertosaur);
        animals.add(stegotroll);
        animals.add(brankodrill);
        animals.add(cookiemonster);

        Collections.sort(animals);

        Planet jesus = new Planet("jesus", "Constant Strom","Acid",3438.2,9892.1,31,Boolean.FALSE,"/Mountains/Tundra/Swamp/Plains");

        Location spotted = new Location("terrain",32.1,126.1,"Thundra",jesus);


        Observation first = new Observation("gulag",tryonaut,spotted, LocalDateTime.now(),5,"https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Patates.jpg/1200px-Patates.jpg","Strangely tasty");
        Observation second = new Observation("gulag2",arkensaun,spotted,LocalDateTime.now(),5,"https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Patates.jpg/1200px-Patates.jpg","Strangely tasty");
        Observation third = new Observation("gulag3",stegotroll,spotted,LocalDateTime.now(),5,"https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Patates.jpg/1200px-Patates.jpg","Strangely tasty");
        Observation fourth = new Observation("gulag4",vertosaur,spotted,LocalDateTime.now(),5,"https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Patates.jpg/1200px-Patates.jpg","Strangely tasty");
        Observation fifth = new Observation("gulag5",brankodrill,spotted,LocalDateTime.now(),5,"https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Patates.jpg/1200px-Patates.jpg","Strangely tasty");
        Observation sixth = new Observation("gulag6",cookiemonster,spotted,LocalDateTime.now(),5,"https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Patates.jpg/1200px-Patates.jpg","Strangely tasty");



        observations.add(first);
        observations.add(second);
        observations.add(third);
        observations.add(fourth);
        observations.add(fifth);
        observations.add(sixth);



         System.out.println(first);
          System.out.println(second);


       //  ObservedCSVRepository observationRepository = new ObservedCSVRepository(observations);







    }
}
