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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }



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
