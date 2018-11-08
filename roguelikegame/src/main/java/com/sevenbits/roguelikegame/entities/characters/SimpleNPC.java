package com.sevenbits.roguelikegame.entities.characters;

public class SimpleNPC implements IHero {

    private Point location;
    private String name;

    public SimpleNPC(Point location, String name) {
        this.location = location;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move(AxisDirection direction) {
        // change character location
    }

    @Override
    public void castAbility() {
        // any ability cast
    }

    @Override
    public Point getLocation() {
        return location;
    }

}
