package StrategyTest.Characters;

import StrategyTest.Weapons.KnifeWeapon;

public class King extends Character {
    public King() {
        weaponBehavior = new KnifeWeapon();
    }

    public void fight(){
        weaponBehavior.useWeapon();
    }
}
