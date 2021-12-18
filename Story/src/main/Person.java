package main;

import java.util.Objects;

public abstract class Person implements Busy{
    protected String name;
    private State state;
    private Condition condition;
    public static boolean flagKrist = true;

    Person(String name, State state, Condition condition) {
        this.name = name;
        this.state = state;
        this.condition = condition;
    }

    protected void setState(State state) {
        if (state.startState() != null)
            System.out.println("*" + name + " " + state.startState() + "*");
        if (state.endState() != null)
            System.out.println("*" + name + " " + state.endState() + "*");
    }

    protected void setCondition(Condition condition) {
        if (condition.getSost() != null)
            System.out.format("*Состояние %s меняется на %s.\n", name, condition.getSost());
    }

    public State getState() {
        return state;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && state == person.state && condition == person.condition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, state, condition);
    }
}

