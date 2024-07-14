package model;

import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int transgression, int magicPower, int nobility, int honor, int bravery) {
        super(name, transgression, magicPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public void compareGryffindorStudents(Gryffindor student) {
        if (getPower() > student.getPower()) {
            System.out.println(String.format("%s обладает большей мощьностью магии, чем %s",  this, student));
        } else if (getPower() < student.getPower()) {
            System.out.println(String.format("%s обладает большей мощьностью магии, чем %s", student, this));
        } else {
            System.out.println("Студенты равны");
        }

    }

    public int getPower() {
        return bravery + honor + nobility + transgression + magicPower;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {

        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {

        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {

        this.bravery = bravery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, bravery);
    }


    public String toStringtoStringFullInfo() {
        return "Gryffindor{" +
                " ,name=" + name +
                ", transgression=" + transgression +
                ", magicPower=" + magicPower +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    @Override
    public String toString() {
        return name;
    }
}




