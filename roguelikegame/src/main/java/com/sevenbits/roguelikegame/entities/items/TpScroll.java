package com.sevenbits.roguelikegame.entities.items;

import com.sevenbits.roguelikegame.entities.characters.IHero;

public class TpScroll implements IItem {

    @Override
    public void use(IHero owner) {
        owner.castAbility();
    }

}
