package org.example.controller;

import org.example.model.Play;
import org.example.model.Toys;

public class ShopController {
    private final Play play;

    public ShopController(Play play) {
        this.play = play;
    }

    public void saveToys(Toys toys) throws  Exception{
        validateToys(toys);
    }
    private void validateToys(Toys toys) throws Exception {

        if (toys.getName().contains(" "))
            throw new Exception("User name has unacceptable characters");
    }
}
