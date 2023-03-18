package org.example;

import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addToys(new Ball(1,"red",20,5))
                .addToys(new Robot(2,"Ira", 20,7))
                .addToys(new Car(3, "Niva", 15,6))
                .addToys(new Builder(4,"Lego", 10, 4))
                .addToys(new Doll(5,"Lena", 35, 20));
        System.out.println("Магазин");
        System.out.println(shop.toString()+"\n");
        Savermanager savermanager= new Savermanager();
        savermanager.sever(shop.getToys());
    }
}