package Strategy;

public class SimUDuck {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFlying();

        Duck model = new ModelDuck();
        model.performFlying();
        model.setFlyingBehavior(new FlyRocketPowered());
        model.performFlying();

    }
}
