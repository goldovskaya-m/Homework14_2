package model;

import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int transgression, int magicPower, int hardworking, int loyal, int honest) {
        super(name, transgression, magicPower);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void compareHufflepuffStudents(Hufflepuff student) {
        if (getPower() > student.getPower()) {
            System.out.println(String.format("%s обладает большей мощьностью магии, чем %s",  this, student));
        } else if (getPower() < student.getPower()) {
            System.out.println(String.format(" %s обладает большей мощьностью магии, чем %s", student, this));
        } else {
            System.out.println("Студенты равны");
        }

    }

    public int getPower () {
        return hardworking + loyal + honest + transgression + magicPower;
    }


    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hufflepuff that = (Hufflepuff) o;
        return hardworking == that.hardworking && loyal == that.loyal && honest == that.honest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hardworking, loyal, honest);
    }


    public String toStringtoStringFullInfo() {
        return "Hufflepuff{" +
                " ,name=" + name +
                ", transgression=" + transgression +
                ", magicPower=" + magicPower +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }

    @Override
    public String toString() {
        return name;
    }
}
