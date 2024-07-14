package model;

import java.util.Objects;

public class Hogwarts {
    protected String name;
    protected int transgression;
    protected int magicPower;

    public Hogwarts(String name, int transgression,int magicPower) {
        this.name = name;
        this.transgression = transgression;
        this.magicPower = magicPower;
    }

    public static void compareHogwartsStudents(Hogwarts student, Hogwarts student2) {
        if (student.getPower() > student2.getPower()) {
            System.out.println(String.format("%s обладает большей мощьностью магии, чем %s",  student, student2));
        } else if (student.getPower() < student2.getPower()) {
            System.out.println(String.format("%s обладает большей мощьностью магии, чем %s", student2, student));
        } else {
            System.out.println("Студенты равны");
        }

    }

    public int getPower() {
        return  transgression + magicPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return transgression == hogwarts.transgression && magicPower == hogwarts.magicPower && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, transgression, magicPower);
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", transgression=" + transgression +
                ", magicPower=" + magicPower +
                '}';
    }
}
