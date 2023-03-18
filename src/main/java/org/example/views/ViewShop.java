package org.example.views;

import org.example.controller.ShopController;
import org.example.model.Car;
import org.example.model.Toys;

import java.util.Scanner;

public class ViewShop {
    private ShopController shopController;

    public ViewShop(ShopController shopController){
        this.shopController = shopController;
    }
    public void  start(){
        Commands commands = Commands.NONE;
        while (true){
            String command = promt ("Input command START or EXIT: " );
            commands = Commands.valueOf(command.toUpperCase());
            if (commands == Commands.EXIT) return;
            try {
            switch ( commands){
//                case CREAT:
//                    String name = promt("Name toys: ");
//                    String chance = promt("Chance toys (0-100%): ");
//                    String count = promt("Count toys: ");
//                    shopController.saveCar( new Car( name, chance, count));
//                    break;
                case START:
                   break;
            }
            } catch (Exception e){
                System.out.println("ERROR\n"+e.getMessage());
            }
            }
        }
    private String promt (String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
