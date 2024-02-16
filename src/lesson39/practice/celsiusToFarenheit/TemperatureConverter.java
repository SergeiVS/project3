package practice.celsiusToFarenheit;

public class TemperatureConverter {
    public Double celsiusToFahrenheit(Double tempCelsius) {
        return (((tempCelsius * 9) / 5) + 32);
    }

    public Double fahrenheitToCelsius(Double tempFahrenheit) {
        return (((tempFahrenheit - 32) * 5) / 9);
    }
}
