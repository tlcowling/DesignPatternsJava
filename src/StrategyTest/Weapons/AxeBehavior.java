package StrategyTest.Weapons;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Hacking at your face with an axe innit");
    }
}
