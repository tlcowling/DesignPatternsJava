package StrategyTest.Characters;

import StrategyTest.Weapons.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void fight() {
        System.out.println("Makes the character fight?");
    }


}
