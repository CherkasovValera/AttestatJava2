package org.example.model;

public class Robot extends Toys implements Play{
    public Robot(int id,String name, int chance, int count ) {
        super(id, name, chance, count);
    }

    @Override
    public int playring() {
        return 0;
    }

    @Override
    public String toString() {
        return "Robot" + super.toString();
    }
}
