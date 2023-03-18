package org.example.model;

public class Builder extends Toys implements Play{
    public Builder(int id, String name, int chance, int count) {
        super(id, name, chance, count);
    }

    @Override
    public int playring() {
        return 0;
    }

    @Override
    public String toString() {
        return "Builder" + super.toString();
    }
}
