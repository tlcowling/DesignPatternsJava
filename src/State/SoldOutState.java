package State;

public class SoldOutState implements State{
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void ejectQuarter() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void turnCrank() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void dispense() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
