package no.hiof.magnuhol.model;

public class Planet {
    private String name;
    private double radius;

    public Planet (){}

    public Planet(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("%s which has a radius of %.0fkm", name, radius);
    }
}
