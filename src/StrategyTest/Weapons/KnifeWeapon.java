package StrategyTest.Weapons;

public class KnifeWeapon implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("He gets knifed mate");
    }
}
