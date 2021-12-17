package main;

public class Main {

    public static void main(String[] args) throws Exception {
        Environment environment = new Environment(StateWeather.NORMAL);
        Pooh pooh = new Pooh("Пух",State.BEGIN, Condition.NORMAL);
        try {
            pooh.discover("Северный Полюс");
        }
        catch (PoohIsNotReadyException e){
            System.out.println(e.getMessage());
            System.err.println("Подождите Пух еще не готов.");
        }
        environment.setStateWeather(StateWeather.RAIN);
        pooh.afterdiscover();
        KristoferRobin kristoferRobin = new KristoferRobin("Кристофер Робин",State.BEGIN, Condition.NORMAL);
        Pooh.Dialog dialog = pooh. new Dialog();
        dialog.dialogbeetwen(kristoferRobin);
        Person kenga = new Person("Кенга", State.BEGIN, Condition.NORMAL) {
            @Override
            public void busy() {
                setState(State.BEGIN);
                setCondition(Condition.BUSY);
            }
        };
        kenga.busy();
        kristoferRobin.togetherbusy(kenga);
        try {
            pooh.go("Восточный Полюс",kristoferRobin);
        }
        catch (PoohIsNotReadyException e){
            System.out.println(e.getMessage());
            System.err.println("Подождите Пух еще не готов.");
        }
        pooh.sit("стол");
        pooh.sleeping("полчаса");
        environment.setStateWeather(StateWeather.SNOW);
        Pooh.Dream dream = pooh. new Dream();
        dream.dreamabout();
        environment.setStateWeather(StateWeather.RAIN);
        pooh.see("воду вокруг себя");
        pooh.gotostreet();
    }

}
