package Strategy;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Strategy.Squeak please");
    }
}
