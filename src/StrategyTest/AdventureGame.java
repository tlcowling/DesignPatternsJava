package StrategyTest;

import StrategyTest.Characters.*;
import StrategyTest.Weapons.BowAndArrowBehavior;

public class AdventureGame {
    public static void main(String[] args) {
        System.out.println("Playing my fun games");

        StrategyTest.Characters.Character character = new King();
        character.fight();
        character.setWeaponBehavior(new BowAndArrowBehavior());
        character.fight();
    }


}
