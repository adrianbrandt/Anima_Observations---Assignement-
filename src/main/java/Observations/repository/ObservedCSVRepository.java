package Observations.repository;

import Observations.Animals.*;
import Observations.models.Location;
import Observations.models.Observation;
import Observations.models.Planet;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class ObservedCSVRepository implements IObservedRepository {

    private HashMap<Integer, Observation> ObservationHash = new HashMap<>();



public ObservedCSVRepository(String filepath){
    readCsv(new File(filepath));
    }




    public ObservedCSVRepository(ArrayList<Observation> observations){
        CreateCsv("tester.csv",observations);
    }



public void readCsv(File filepath) {

    String line;

    try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
        while((line = br.readLine()) !=null){
            String[] splitt = line.split(";");
            String[] splatt = line.split("-");
            String[] splott = line.split("/");

            if(!(ObservationHash.containsKey(splitt[0]))){

                switch (splatt[1]){
                    case "Amphibian":
                        Animals amphibianScan = new Amphibian((splitt[2].split("-")[0]),(splatt[1]),(Integer.parseInt(splatt[2])),(Integer.parseInt(splatt[3])),(Boolean.parseBoolean(splatt[4])),(Boolean.parseBoolean(splatt[5])),(Boolean.parseBoolean(splatt[6].split(";")[0])));
                        Planet amphibianPlanet = new Planet(splatt[10],splatt[11],splatt[12],Double.parseDouble(splatt[13]),Double.parseDouble(splatt[14]),Integer.parseInt(splatt[15]),Boolean.parseBoolean(splatt[16]),splatt[17].split(";")[0]);
                        Location amphibianLoc = new Location(splatt[6].split(";")[1],Double.parseDouble(splatt[7]),Double.parseDouble(splatt[8]),splatt[9],amphibianPlanet);
                        Observation amphibianObserv = new Observation(Integer.parseInt(splitt[0]),splitt[1],amphibianScan,amphibianLoc,LocalDateTime.now(),Integer.parseInt(splitt[5]),splitt[6],splitt[7]);
                        ObservationHash.put(Integer.parseInt(splitt[0]),amphibianObserv);
                        break;
                    case "Bird":
                        Animals birdScan = new Bird(splitt[2].split("-")[0],splatt[1],Integer.parseInt(splatt[2]),Integer.parseInt(splatt[3]),Integer.parseInt(splatt[4]),Boolean.parseBoolean(splatt[5]),Boolean.parseBoolean(splatt[6]));
                        Planet birdPlanet = new Planet(splatt[10],splatt[11],splatt[12],Double.parseDouble(splatt[13]),Double.parseDouble(splatt[14]),Integer.parseInt(splatt[15]),Boolean.parseBoolean(splatt[16]),splatt[17].split(";")[0]);
                        Location birdLoc = new Location(splatt[6].split(";")[1],Double.parseDouble(splatt[7]),Double.parseDouble(splatt[8]),splatt[9],birdPlanet);
                        Observation birdObserve = new Observation(Integer.parseInt(splitt[0]),splitt[1],birdScan,birdLoc,LocalDateTime.now(),Integer.parseInt(splitt[5]),splitt[6],splitt[7]);
                        ObservationHash.put(Integer.parseInt(splitt[0]),birdObserve);
                        break;
                    case "Invertebrates":
                        Animals invertebrateScan = new Invertebrates((splitt[2].split("-")[0]),(splatt[1]),(Integer.parseInt(splatt[2])),(Integer.parseInt(splatt[3])),(Boolean.parseBoolean(splatt[4])),(Boolean.parseBoolean(splatt[5])));
                        Planet invertebratePlanet = new Planet(splatt[9],splatt[10],splatt[11],Double.parseDouble(splatt[12]),Double.parseDouble(splatt[13]),Integer.parseInt(splatt[14]),Boolean.parseBoolean(splatt[15]),splatt[16].split(";")[0]);
                        Location invertebrateLoc = new Location(splatt[5].split(";")[1],Double.parseDouble(splatt[6]),Double.parseDouble(splatt[7]),splatt[8],invertebratePlanet);
                        Observation invertebrateObserve = new Observation(Integer.parseInt(splitt[0]),splitt[1],invertebrateScan,invertebrateLoc,LocalDateTime.now(),Integer.parseInt(splitt[5]),splitt[6],splitt[7]);
                        ObservationHash.put(Integer.parseInt(splitt[0]),invertebrateObserve);
                        break;

                }
                CreateCsv("tester.csv",new ArrayList<Observation>(ObservationHash.values()));
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

public void CreateCsv(String filepath, ArrayList<Observation> observations)  {


    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))){
         for (Observation obs : observations){


                    bw.write(obs.getId() + ";" + obs.getName() + ";" + obs.getAnimal().writetoCsv()
                            + ";" + obs.getLocation().writetoCsv() + ";" + LocalDateTime.now() + ";" + obs.getAmount() +
                            ";" + obs.getImageUrl() + ";" + obs.getDescription());

                    bw.newLine();


        }
    } catch (IOException e) {
        e.printStackTrace();
    }



}


    @Override
    public ArrayList<Observation> getObservations() {

        return new ArrayList<Observation>(ObservationHash.values());
    }

    @Override
    public Observation getObservation(int observationId) {
        return ObservationHash.get(observationId);
    }

    @Override
    public void delObservation(int observationId) {
        ObservationHash.remove(observationId);
        CreateCsv("tester.csv",new ArrayList<Observation>(ObservationHash.values()));

    }

    @Override
    public void createObservation(String name, Animals animal, Location location, LocalDateTime dateTime, int amount, String imageUrl, String description) {
    Observation observation = new Observation(name,animal,location,dateTime,amount,imageUrl,description);
   // ObservationHash.get(observation.getId())
    }
}
