package no.hiof.magnuhol.model;

public class Location {
    private Planet planet;
    private double latitude;
    private double longitude;
    private Biome biome;

    public Location (){}

    public Location(Planet planet, double latitude, double longitude, Biome biome) {
        this.planet = planet;
        this.latitude = latitude;
        this.longitude = longitude;
        this.biome = biome;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Biome getBiome() {
        return biome;
    }

    public void setBiome(Biome biome) {
        this.biome = biome;
    }

    @Override
    public String toString() {
        return String.format("The observation was found on planet " + planet + " at latitude " + latitude + " and longitude " + longitude + " \n\". The lifeform was found in a " + biome);
    }
}
