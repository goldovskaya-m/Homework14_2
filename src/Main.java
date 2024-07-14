import model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework14_2 ООП Наследование");
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 0, 11, 12, 32, 12);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley ", 60, 15, 13, 7, 4);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 25, 2, 8, 13, 5);

        Slytherin grahamMontague = new Slytherin("Graham Montague", 15, 44, 6, 3, 8, 7, 6);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 37, 15, 30, 7, 7, 4, 7);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 5, 34, 12, 8, 5, 3, 7);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 24, 15, 22, 44, 6);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 33, 4, 5, 7, 8);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 5, 6, 23, 5, 7);

        Ravenclaw choChang = new Ravenclaw("Cho Chang ", 24, 15, 22, 44, 6);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil ", 33, 4, 5, 7, 8);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 4, 45, 7, 5, 6);

        hermioneGranger.compareGryffindorStudents(ronWeasley);
        dracoMalfoy.compareSlytherinStudents(gregoryGoyle);
        zachariasSmith.compareHufflepuffStudents(cedricDiggory);
        choChang.compareRavenclawStudents(padmaPatil);
        Hogwarts.compareHogwartsStudents(harryPotter, dracoMalfoy);


    }
}