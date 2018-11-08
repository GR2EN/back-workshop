package com.sevenbits.roguelikegame.entities.items;

import com.sevenbits.roguelikegame.entities.characters.IHero;

public class Scepter implements IItem {

    private String title;
    private int damage;

    public Scepter(String title, int damage) {
        this.title = title;
        this.damage = damage;
    }

    public String getTitle() {
        return title;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void use(IHero owner) {
        owner.castAbility();
    }
}
