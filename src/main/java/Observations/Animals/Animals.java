package Observations.Animals;

import java.util.ArrayList;

public abstract class Animals implements Comparable<Animals> {

    private String name,type;
    private int eyes;
    private Boolean agressive;

    private ArrayList<Animals> animalList = new ArrayList<Animals>();


    public Animals(){}

    public Animals(String name, String type, int eyes, Boolean agressive) {
        this.name = name;
        this.type = type;
        this.eyes = eyes;
        this.agressive = agressive;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public Boolean getAgressive() {
        return agressive;
    }

    public void setAgressive(Boolean agressive) {
        this.agressive = agressive;
    }


    public void addAnimal(Animals Animal) {
        animalList.add(Animal);
    }

    public ArrayList<Animals> getAnimal(){
        return animalList;
    }


    public String writetoCsv(){
        return type;
    }


    @Override
    public String toString() {
        return "Observations/Animals " + getAnimal();
    }


    @Override
    public int compareTo(Animals a) {
        return this.getType().compareTo(a.getType());
    }
}
