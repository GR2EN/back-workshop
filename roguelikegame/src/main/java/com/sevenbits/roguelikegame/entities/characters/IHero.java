package com.sevenbits.roguelikegame.entities.characters;

public interface IHero {

    void move(AxisDirection direction);
    void castAbility();
    Point getLocation();

}
