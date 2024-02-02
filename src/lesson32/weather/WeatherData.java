package weather;

public class WeatherData {
    private final Integer temperature;

    private final WeatherMessage message;

    public WeatherData(Integer temperature, WeatherMessage message) {
        this.temperature = temperature;
        this.message = message;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public WeatherMessage getMessage() {
        return message;
    }
}
