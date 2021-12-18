package main;

public class Environment {
    private StateWeather weather;

    Environment(StateWeather weather){
        this.weather = weather;
    }

    protected void setStateWeather(StateWeather weather) throws StateWeatherException{
        if (weather.getStateWeather() == null) {
            throw new StateWeatherException("Некоректно введена погода");
        }
        System.out.format("*Пошел %s.\n", weather.getStateWeather());


    }
    public StateWeather getStateWeather() {
        return weather;
    }
}

/*if (weather.getStateWeather() == null) {
            throw new StateWeatherException("Некоректно введена погода");
        }
        try {
            weather.getStateWeather();
            System.out.format("*Пошел %s.\n", weather.getStateWeather());
        }
        catch (StateWeatherException e){
            System.err.println(e.getMessage());
        }
 */