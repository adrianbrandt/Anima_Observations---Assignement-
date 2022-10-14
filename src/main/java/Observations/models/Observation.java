package Observations.models;

import Observations.Animals.Animals;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Observation implements Comparable<Observation> {

    private static int count;
    private int id,amount;
    private String name,imageUrl,description;
    private Animals animal;
    private Location location;
    private LocalDateTime dateTime = LocalDateTime.now();

    private ArrayList<Observation> Observed = new ArrayList<Observation>();

    public Observation(){}

    public Observation(String name, Animals animal, Location location, LocalDateTime dateTime, int amount, String imageUrl, String description) {
        this.amount = amount;
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.animal = animal;
        this.location = location;
        this.dateTime = dateTime;
        id = ++count;


    }
    public Observation(int id,String name, Animals animal, Location location, LocalDateTime dateTime, int amount, String imageUrl, String description) {
        this.id = id;
        this.amount = amount;
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.animal = animal;
        this.location = location;
        this.dateTime = dateTime;


    }

    public ArrayList<Observation> getObserved() {
        return Observed;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Animals getAnimal() {
        return animal;
    }

    public void setAnimal(Animals animal) {
        this.animal = animal;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String writetoCsv(){
        return id + ";" + name + ";" + animal.writetoCsv() + ";" + location.writetoCsv() + ";" + dateTime + ";" + amount + ";" + imageUrl + ";" + description;
    }

    @Override
    public String toString() {
        return "Observation id = " + id + ", name = " + name + ", Animals found = " + animal + ", on location = " + location +
                "at time = " + dateTime + ", amount found = " + amount + ", imageUrl = " + imageUrl + ", description = " + description + "\n" ;
    }

    @Override
    public int compareTo(Observation o) {
        return this.getId() - o.getId();
    }
}
