package org.example.model;

public class Car extends Toys implements Play{
    public Car(int id, String name, int chance, int count) {
        super(id, name, chance, count);
    }

    @Override
    public int playring() {
        return 0;
    }

    @Override
    public String toString() {
        return "Car" + super.toString();
    }
}
