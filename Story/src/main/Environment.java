package main;

public class Environment {
    private StateWeather weather;

    Environment(StateWeather weather){
        this.weather = weather;
    }

    protected void setStateWeather(StateWeather weather) throws StateWeatherException{
        try {
            System.out.format("*Пошел %s.\n", weather.getStateWeather());
        }
        catch (NullPointerException e){
            System.out.println("Некоректно введена погода");
        }
    }
    public StateWeather getStateWeather() {
        return weather;
    }
}
