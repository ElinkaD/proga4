package main;

public class Environment {
    private StateWeather weather;

    Environment(StateWeather weather){
        this.weather = weather;
    }
    protected void setStateWeather(StateWeather weather) {
        try {
            weather.getStateWeather();
            System.out.format("*Пошел %s.\n", weather.getStateWeather());
        }
        catch (NullPointerException e){
            System.err.println("Вы ввели некоректное значение погоды");
        }
    }
    public StateWeather getStateWeather() {
        return weather;
    }
}
