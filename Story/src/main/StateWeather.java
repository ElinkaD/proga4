package main;

public enum StateWeather {
    NORMAL(null),
    SNOW("снег"),
    RAIN("дождь");
    private final String weater;
    StateWeather(final String weater){
        this.weater = weater;
    }
    public String getStateWeather(){
        return weater;
    }
}
