package org.example.model;


import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<Toys> getToys(){
        return toyses;
    }
    private List<Toys> toyses = new ArrayList<>();
    public Shop addToys (Toys toys){
        toyses.add(toys);
        return this;
    }

    @Override
    public String toString() {
        return "Shop{"+
                "toyses="+ toyses+
                '}';
    }
}
