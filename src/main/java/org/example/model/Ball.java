package org.example.model;

public class Ball extends Toys implements Play{
    public Ball(int id, String name, int chance, int count) {
        super(id, name, chance, count);
    }

    @Override
    public int playring() {
        return 0;
    }

    @Override
    public String toString() {
        return "Ball" + super.toString();
    }
}
