package Strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Strategy.Quack you beeatch");
    }
}
