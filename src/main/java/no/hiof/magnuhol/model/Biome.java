package no.hiof.magnuhol.model;

import org.jetbrains.annotations.NotNull;

public class Biome implements Comparable<Biome> {
    private String name;
    private double degreesCels;

    public Biome (){}


    public Biome(String name, double degreesCels) {
        this.name = name;
        this.degreesCels = degreesCels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDegreesCels() {
        return degreesCels;
    }

    public void setDegreesCels(double degreesCels) {
        this.degreesCels = degreesCels;
    }
    @Override
    public String toString() {
        return String.format( name + " where the temp was approximately " + degreesCels +" C");
    }

    //to implement comparable in this class is strictly to show how to do it, as it will have no practical effect considering it wont be shown on the website.
    @Override
    public int compareTo(Biome other) {
        return Double.compare(this.degreesCels, other.degreesCels);
    }
}

