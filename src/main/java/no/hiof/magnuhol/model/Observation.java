package no.hiof.magnuhol.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Observation implements Comparable<Observation> {

    private int id;
    private String name;
    private Lifeforms lifeform;
    private Location location;
    private LocalDate timeObs;
    private double amount;
    private String picUrl;
    private String comment;

    private ArrayList<Observation> discoVery = new ArrayList<Observation>();

    public Observation(int id, String name, Lifeforms lifeform, Location location, LocalDate timeObs, double amount, String picUrl, String comment) {
        this.id = id;
        this.name = name;
        this.lifeform = lifeform;
        this.location = location;
        this.timeObs = timeObs;
        this.amount = amount;
        this.picUrl = picUrl;
        this.comment = comment;
    }

     public Observation (){

    }


    public ArrayList<Observation> getDiscoVery() {
        return new ArrayList<Observation>(discoVery);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lifeforms getLifeform() {
        return lifeform;
    }

    public void setLifeform(Lifeforms lifeform) {
        this.lifeform = lifeform;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public LocalDate getTimeObs() {
        return timeObs;
    }

    public void setTimeObs(LocalDate timeObs) {
        this.timeObs = timeObs;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return String.format("observation " + id + " is called " + name + " and is a " + getLifeform() +  " \n " +  location + " at " + timeObs + " there was found " + amount + " of this alien lifeform. The note taken from the discovery team says : "  + comment +" \n\n ");
    }


    @Override
    public int compareTo(Observation other) {
        return Integer.compare(this.id , other.id);
    }


    public void removeObs(Observation discovery) {discoVery.remove(discovery);
    }
}
