package Observations.Animals;

public class Invertebrates extends Animals {

    private int legs;
    private Boolean breatheUW;


    public Invertebrates(String name, String type, int eyes, int legs, Boolean breatheUW, Boolean agressive) {
        super(name,type,eyes,agressive);
        this.legs = legs;
        this.breatheUW = breatheUW;

    }

    @Override
    public String writetoCsv() {
        return super.getName() + "-" + super.getType() + "-" + super.getEyes() + "-" + legs + "-" + breatheUW + "-" + super.getAgressive();

    }

    @Override
    public String toString() {
        return "[ name = " + super.getName() + ". type = " + super.getType() + ". eyes = " + super.getEyes()
                + ". legs = " + legs + ". breate under water = " + breatheUW + ". is agressive = " + super.getAgressive() + "]" ;
    }
}
