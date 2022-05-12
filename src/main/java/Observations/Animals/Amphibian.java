package Observations.Animals;

public class Amphibian extends Animals {
    private int legs;
    private Boolean breatheUW,poisonous;


    public Amphibian(String name, String type, int eyes, int legs, Boolean breatheUW, Boolean agressive, Boolean poisonous) {
        super(name,type,eyes,agressive);
        this.legs = legs;
        this.breatheUW = breatheUW;
        this.poisonous = poisonous;
    }


    @Override
    public String writetoCsv(){
        return super.getName() + "-" + super.getType() + "-" + super.getEyes() + "-" + legs + "-" + breatheUW + "-" + super.getAgressive() + "-" + poisonous;

    }

    @Override
    public String toString() {
        return "[ name = " + super.getName() + ". is of type = " + super.getType() + ". It has " + super.getEyes()
                + " Eyes and " + legs + "Legs. breate under water = " + breatheUW + ". is agressive = " + super.getAgressive()
                + ". is poisonous = " + poisonous + "]";
    }


}

