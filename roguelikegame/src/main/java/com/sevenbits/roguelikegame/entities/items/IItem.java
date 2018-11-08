package com.sevenbits.roguelikegame.entities.items;

import com.sevenbits.roguelikegame.entities.characters.IHero;

public interface IItem {

    void use(IHero owner);

}