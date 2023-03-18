package org.example.model;

public abstract class Toys {
    private int id;
    private String name;

    private int chance;
    private int count;

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }
    public int getChance() {
        return chance;
    }
    public int getCount() {
        return count;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setChance(int chance) {
        this.chance = chance;
    }


    public void setCount(int count) {
        this.count = count;
    }

    public Toys(int id, String name, int chance, int count) {
        this.id = id;
        this.name = name;
        this.chance = chance;
        this.count = count;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", chance=" + chance +
                ", count='" + count + '\'' +
                '}';
    }
}
