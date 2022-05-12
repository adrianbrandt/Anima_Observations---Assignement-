package Observations.models;

import java.util.ArrayList;

public class Location {

    private String name,locBiome;
    private Double latitude, longtitude;
    private Planet locPlanet;
    private ArrayList<Location> locations = new ArrayList<Location>();

    public Location(){}

    public Location(String name, Double latitude, Double longtitude, String locBiome, Planet locPlanet) {
        this.name = name;
        this.locBiome = locBiome;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.locPlanet = locPlanet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocBiome() {
        return locBiome;
    }

    public void setLocBiome(String locBiome) {
        this.locBiome = locBiome;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public Planet getLocPlanet() {
        return locPlanet;
    }

    public void setLocPlanet(Planet locPlanet) {
        this.locPlanet = locPlanet;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public String writetoCsv(){
        return name + "-" + latitude + "-" + longtitude + "-" + locBiome + "-" + locPlanet.writetoCsv() ;
    }
    @Override
    public String toString() {
        return "Location = " +  name + ". Is on biome = " + locBiome + ". With longtitude/altitude = " + longtitude + latitude + ". Is on planet = " + locPlanet;
    }
}
