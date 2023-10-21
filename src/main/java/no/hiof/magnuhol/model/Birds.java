package no.hiof.magnuhol.model;

public class Birds extends Lifeforms {
    private double wingSpan;

    public Birds (){}

    public Birds(String name, String lethal, double age, String gender, double wingSpan) {
        super(name, lethal, age, gender);
        this.wingSpan = wingSpan;

    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return String.format( name +" which is " + lethal + " , and is aproximetly " + age + " years old. We found this one to be a " + gender + " with a " + wingSpan + " m long wingspan .");
    }
}
