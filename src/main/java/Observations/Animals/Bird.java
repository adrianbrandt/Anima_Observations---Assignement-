package Observations.Animals;

public class Bird extends Animals {
    private int eyes,legs,wings;
    private Boolean canFly;


    public Bird(String name, String type, int eyes, int legs, int wings, Boolean canFly, Boolean agressive) {
        super(name,type,eyes,agressive);
        this.legs = legs;
        this.wings = wings;
        this.canFly = canFly;

    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public Boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String writetoCsv() {
        return super.getName() + "-" + super.getType() + "-" + super.getEyes() + "-" + legs + "-" + wings + "-" + canFly + "-" + super.getAgressive();

    }

    @Override
    public String toString() {
        return "[ name = " + super.getName() + ". Is of type = " + super.getType() + ". Has " + super.getEyes() + " Eyes, " +
                legs + "legs and " + wings  + " Wings. Can it fly = " + canFly + ". Is it agressive = " + super.getAgressive() + " ]";
    }
}
