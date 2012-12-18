package Strategy;

public abstract class Duck {
    public void setFlyingBehavior(FlyBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    FlyBehavior flyingBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}
    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFlying() {
        flyingBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
