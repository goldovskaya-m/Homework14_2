package model;

import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, int transgression, int magicPower, int wise, int witty, int creative) {
        super(name, transgression, magicPower);
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public void compareRavenclawStudents(Ravenclaw student) {
        if (getPower() > student.getPower()) {
            System.out.println(String.format("%s обладает большей мощьностью магии, чем %s", this, student));
        } else if (getPower() < student.getPower()) {
            System.out.println(String.format(" %s обладает большей мощьностью магии, чем %s", student, this));
        } else {
            System.out.println("Студенты равны");
        }
    }

    public int getPower() {
        return wise + witty + creative + transgression + magicPower;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return wise == ravenclaw.wise && witty == ravenclaw.witty && creative == ravenclaw.creative;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wise, witty, creative);
    }


    public String toStringFullInfo() {
        return "Ravenclaw{" +
                " ,name=" + name +
                ", transgression=" + transgression +
                ", magicPower=" + magicPower +
                "wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
                '}';
    }

    @Override
    public String toString() {
        return name;
    }
}

