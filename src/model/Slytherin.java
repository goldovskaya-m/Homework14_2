package model;

import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int conning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int transgression, int magicPower, int conning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, transgression, magicPower);
        this.conning = conning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void compareSlytherinStudents(Slytherin student) {
        if (getPower() > student.getPower()) {
            System.out.println(String.format("%s обладает большей мощьностью магии, чем %s", this, student));
        } else if (getPower() < student.getPower()) {
            System.out.println(String.format(" %s обладает большей мощьностью магии, чем %s", student, this));
        } else {
            System.out.println("Студенты равны");
        }
    }

    public int getPower() {
        return conning + determination + ambition + resourcefulness + thirstForPower + transgression + magicPower;
    }


    public int getConning() {
        return conning;
    }

    public void setConning(int conning) {
        this.conning = conning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slytherin slytherin = (Slytherin) o;
        return conning == slytherin.conning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && thirstForPower == slytherin.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(conning, determination, ambition, resourcefulness, thirstForPower);
    }


    public String toStringFullInfo() {
        return "Slytherin{" +
                " ,name=" + name +
                ", transgression=" + transgression +
                ", magicPower=" + magicPower +
                "conning=" + conning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }

    @Override
    public String toString() {
        return name;
    }
}


