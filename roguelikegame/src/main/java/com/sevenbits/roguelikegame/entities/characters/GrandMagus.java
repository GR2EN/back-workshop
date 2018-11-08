package com.sevenbits.roguelikegame.entities.characters;

import com.sevenbits.roguelikegame.entities.items.IItem;

public class GrandMagus implements IHero {

    private Point location;
    private String name;

    public GrandMagus(Point location, String name) {
        this.location = location;
        this.name = name;
    }

    public void useItem(IItem item) {
        item.use(this);
    }

    public void teleport(Point tpPoint) {
        this.location = tpPoint;
    }

    @Override
    public void move(AxisDirection direction) {
        // change character location
    }

    @Override
    public void castAbility() {
        // grand ability cast
    }

    @Override
    public Point getLocation() {
        return location;
    }

}
