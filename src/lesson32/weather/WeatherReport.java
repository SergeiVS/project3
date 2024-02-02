package weather;

import java.util.function.Function;
import java.util.function.Predicate;

public class WeatherReport implements Function<WeatherMessage, String> {

    Predicate<WeatherData> tempLimits = v -> v.getTemperature() >= -50 && v.getTemperature() <= 50;
    @Override
    public String apply(WeatherData weathetData) {
        if (tempLimits.test(weathetData)){
            String message = WeatherData
        }
    }
}
