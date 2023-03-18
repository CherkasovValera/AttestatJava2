package org.example.model;

import java.io.FileWriter;
import java.io.*;
import java.util.List;

public class Savermanager {
    public void sever (List<Toys> toys){
        try (FileWriter writer = new FileWriter("shoplist.txt", false)){
            for (Toys item:toys){
            writer.write(item.toString()+"\n");
            }
            writer.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
