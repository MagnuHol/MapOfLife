package no.hiof.magnuhol.model;

public class Amphibians extends Lifeforms {
    private double weight;

    public Amphibians (){
    }

    public Amphibians(String name, String lethal, double age, String gender, double weight) {
        super(name, lethal, age, gender);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format( name +" which is " + lethal + " , and is aproximetly " + age + " years old. We found this one to be a " + gender + " which weighs " + weight + " kg .");
    }
}
