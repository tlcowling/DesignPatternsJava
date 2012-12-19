package Adapter;

import org.junit.Test;

public class TurkeyAdapterTest {
    @Test
    public void testTurkeyAdapter() {
        MallardDuck duck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
