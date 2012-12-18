package Strategy;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Mute Strategy.Quack please");
    }
}
