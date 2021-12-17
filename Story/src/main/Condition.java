package main;

public enum Condition {
    NORMAL(null),
    EXCITED("взволнованное"),
    TIRED("усталое"),
    PRIDE("гордость"),
    DISCOUNT("недовольное"),
    PANICKY("паническое"),
    BUSY("занятое");
    private final String sost;
    Condition(final String sost){
        this.sost = sost;
    }
    public String getSost(){
        return sost;
    }
}
