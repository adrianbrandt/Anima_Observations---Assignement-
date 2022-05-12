package Observations.models;

import java.util.ArrayList;

public class Planet {

    private String name, weather, waterType;
    private Double radius, mass;
    private int pTemp;
    private Boolean breathableAir;
    private String biomes;

    private ArrayList<Planet> planets = new ArrayList<Planet>();


    public Planet(String name, String weather, String waterType, Double radius, Double mass, int pTemp, Boolean breathableAir, String biomes) {
        this.name = name;
        this.weather = weather;
        this.waterType = waterType;
        this.radius = radius;
        this.mass = mass;
        this.pTemp = pTemp;
        this.biomes = biomes;
        this.breathableAir = breathableAir;
    }

    public Planet getPlanet(String name) {
        for(Planet planet : planets){
            if(planet.getName().equals(name));
        }
        return null;

    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public int getpTemp() {
        return pTemp;
    }

    public void setpTemp(int pTemp) {
        this.pTemp = pTemp;
    }

    public Boolean getBreathableAir() {
        return breathableAir;
    }

    public void setBreathableAir(Boolean breathableAir) {
        this.breathableAir = breathableAir;
    }

    public String writetoCsv(){
        return name + "-" + weather + "-" + waterType + "-" + radius + "-" + mass + "-" + pTemp + "-" + breathableAir + "-" + biomes ;
    }
    @Override
    public String toString() {
        return "[ Planet name = " + name + ". Weather type = " + weather + ". Water type = " + waterType + ". Radius = " + radius + ". Mass = " + mass +
                ". Planet temp = " + pTemp + ". Breathable air = " + breathableAir + ". Has biomes = " + biomes + " ]";
    }
}
