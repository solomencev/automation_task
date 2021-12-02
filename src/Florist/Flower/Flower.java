package Florist.Flower;

import java.util.Scanner;

public abstract class Flower {
    int price;
    String name;
    String colour;

    public Flower(int price, String colour) {
        this.price = price;
        this.colour = colour;
    }

    Scanner scanner = new Scanner(System.in);

    public void getPriceBouquet() {
        System.out.println("Количество цветов в букет? ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if(count <= 0){
            System.out.println("Вы ошиблись");
            getPriceBouquet();
        } else System.out.println("Букет из "+ count + " " + this.name + " стоит " + this.price * count);
    }
}