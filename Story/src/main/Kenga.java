package main;

public class Kenga extends Person implements Busy{
    Kenga (String name, State state, Condition condition){
        super(name, state, condition);
        setState(State.BEGIN);
    }

    @Override
    public void busy() {
        setCondition(Condition.BUSY);
    }
}
