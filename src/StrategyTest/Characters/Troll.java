package StrategyTest.Characters;

import StrategyTest.Weapons.AxeBehavior;

public class Troll extends Character{

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }
}
