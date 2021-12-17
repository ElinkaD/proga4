package main;

public class Pooh extends Person implements HabbitPooh,Message{
    protected static boolean poohsleep = false;
    boolean isBeReadyPutOn = false;
    private String place;

    Pooh (String name, State state,Condition condition) {
        super(name, state, condition);
        setState(State.BEGIN);
    }
    public void beready(){
        System.out.println("Пух готов к экспедиции.");
        this.isBeReadyPutOn = true;
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        else return false;
    }
    class Dialog{
        public void dialogbeetwen(KristoferRobin kristoferRobin){
            speak();
            kristoferRobin.speak();
            hear(kristoferRobin);
        }
    }
    class Dream{
        public void dreamabout(){
            if (poohsleep = true){
                see("сон");
                setState(State.WHERE);
                find("маленький");
            }
        }
        public void find(String size){
            System.out.printf("%s нашел %s улей.\n", name, size);
            if (size.equals("маленький")){
                System.out.println("Задние лапки не помещаются в улей, поэтому они остались снаружи");
                WildBuki wildBuki = new WildBuki();
                wildBuki.bite();
                wildBuki.whytheybite();
                setCondition(Condition.DISCOUNT);
                setCondition(Condition.PANICKY);
                getup("криком");
            }
            else {
                sleep();
            }
        }
    }
    @Override
    public void hear(Person person) {
        System.out.format("%s слышит сообщение персонажа %s.\n",name, person);
        setCondition(Condition.EXCITED);
        offer("Восточному Полюсу", person);
    }

    @Override
    public void offer(String place, Person person) {
        System.out.format( "%s предлагает устроить искледицию к %s персонажу %s.\n",name,place,person);
    }

    @Override
    public void sit(String subject) {
        System.out.println(name + " садиться за " + subject + ".");
    }

    @Override
    public void go(String place, KristoferRobin kristoferRobin) throws PoohIsNotReadyException{
        beready();
        if (isBeReadyPutOn) {
            if (flagKrist == false) {
                System.out.println(name + " отправляется открывать " + place + " c Кристофером Робином");
            } else {
                System.out.println(name + " отправляется открывать " + place + " сам.");
                setState(State.TRAVEL);
                setCondition(Condition.TIRED);
            }
            isBeReadyPutOn = false;
        } else {
            System.out.println("Пух не готов к экспедиции.");
        }
    }
    @Override
    public void discover(String place) throws PoohIsNotReadyException{
        beready();
        if (isBeReadyPutOn) {
            setState(State.TRAVEL);
            System.out.println("*" + name + " открываает " + place + " во время путешествия.");
            setCondition(Condition.PRIDE);
        } else {
            System.out.println("Пух не готов к экспедиции.");
        }
    }
    @Override
    public void sleeping(String time) {
        System.out.println("*Проходит "+time);
        System.out.println(name + " засыпает в самый разгар ужина.");
        sleep();
    }

    @Override
    public void sleep() {
        System.out.println(name + " спит.");
        poohsleep = true;
    }

    @Override
    public void speak() {
        System.out.print(name + " спрашивает :\n");
        System.out.print(" \"Нет ли где еще Полюсов, которые Медведь с опилками в голове мог бы открыть?\"\n");
    }

    @Override
    public void busy() {
        setCondition(Condition.BUSY);
    }
    @Override
    public void afterdiscover() {
        setCondition(Condition.TIRED);
        sleep();
    }
    @Override
    public void see(String thing) {
        System.out.format("%s увидел %s.\n",name, thing);
    }

    @Override
    public void getup(String sost) {
        System.out.format("%s проснулся с %s.\n",name, sost);
        poohsleep = false;
    }
    @Override
    public void gotostreet() {
        System.out.format("%s встал и выглянул на улицу.\n",name);
    }
}
