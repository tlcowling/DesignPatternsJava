package StrategyTest.Weapons;

import StrategyTest.Weapons.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Fires an arrow at the motherfucker");
    }
}
