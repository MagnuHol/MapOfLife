package no.hiof.magnuhol.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
//Jeg fikk hjelp med denne av studass
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Birds.class, name = "Bird"),
        @JsonSubTypes.Type(value = Amphibians.class, name = "Amphibian"),
        @JsonSubTypes.Type(value = Invertebrates.class, name = "Invertebrate")
})

public abstract class Lifeforms implements Comparable<Lifeforms> {
    public String name;
    public String lethal;
    public double age;
    public String gender;

    public Lifeforms(){

    }

    public Lifeforms(String name, String lethal, double age, String gender) {
        this.name = name;
        this.lethal = lethal;
        this.age = age;
        this.gender = gender;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLethal() {
        return lethal;
    }

    public void setLethal(String lethal) {
        this.lethal = lethal;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;


    }
    @Override
    public int compareTo(Lifeforms other) {
        return Double.compare(this.age , other.age);
    }
}
