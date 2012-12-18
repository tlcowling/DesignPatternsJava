package StrategyTest.Characters;

import StrategyTest.Weapons.BowAndArrowBehavior;

public class Queen extends Character{

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    public void fight(){
        weaponBehavior.useWeapon();
    }
}
