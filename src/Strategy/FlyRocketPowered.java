package Strategy;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm a rocket powered fucker");
    }
}
