package Florist.Flower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose(200, "red");
        Chamomile chamomile = new Chamomile(300, "white");
        Daisy daisy = new Daisy(400, "blue");


        System.out.println("В наличии " + rose.name + ", " + chamomile.name + ", " + daisy.name);
        System.out.println("Из каких цветков хочется букет? ");
        Scanner scanner = new Scanner(System.in);
        String whichFlower = scanner.nextLine();
        if(whichFlower.matches(rose.name)){
            rose.getPriceBouquet();
        } else if (whichFlower.matches(chamomile.name)) {
            chamomile.getPriceBouquet();
        } else if (whichFlower.matches(daisy.name)){
            daisy.getPriceBouquet();
        } else {
            System.out.println("Таких цветков нет");
        }
    }
}
