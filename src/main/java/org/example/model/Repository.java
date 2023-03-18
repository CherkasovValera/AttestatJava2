package org.example.model;

import java.util.List;

public interface Repository {
    List<Toys> getAllToys();
    String CreateToys (Toys toys);
    void updateToys (Toys toys);
    void deleteByID (String inputId);
}
