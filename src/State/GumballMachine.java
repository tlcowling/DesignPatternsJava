package State;

public class GumballMachine {
    State soldOutState;

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State state = soldState;

    int count = 0;

    public GumballMachine(int numberGumballs) {
        this.count = numberGumballs;

        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState  = new HasQuarterState(this);
        this.soldState = new SoldState(this);

        if (numberGumballs > 0) { state = noQuarterState; }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0) {
            count--;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }
}
