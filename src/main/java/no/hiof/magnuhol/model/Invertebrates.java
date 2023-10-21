package no.hiof.magnuhol.model;

public class Invertebrates extends Lifeforms {
    public String color;
    public int legAmount;

    public Invertebrates (){

    }

    public Invertebrates(String name, String lethal, double age, String color, String gender, int legAmount) {
        super(name, lethal, age, gender);
        this.color = color;
        this.legAmount = legAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegAmount() {
        return legAmount;
    }

    public void setLegAmount(int legAmount) {
        this.legAmount = legAmount;
    }

    @Override
    public String toString() {
        return String.format( name +" which is categorized as " + lethal + ", and is aproximetly " + age + " years old. We found this one to be a " + gender + " with a " + color + " color and " + legAmount + " legs");
    }



}
