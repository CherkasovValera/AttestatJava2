package org.example.model;

public class Doll extends Toys implements Play{
    public Doll(int id,String name, int chance, int count) {
        super(id, name, chance, count);
    }
    @Override
    public int playring() {
        return 0;
    }
    @Override
    public String toString() {
        return "Doll" + super.toString();
    }
}
