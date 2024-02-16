package practice.celsiusToFarenheit;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void celsiusToFahrenheitBy0() {

        Double expectedTemp = 32.0;
        Double actualTemp = converter.celsiusToFahrenheit(0.0);
        assertEquals(expectedTemp, actualTemp, 0.0);
    }
    @Test
    public void celsiusToFahrenheitByBoiling() {
        Double expectedTemp = 212.0;
        Double actualTemp = converter.celsiusToFahrenheit(100.0);
        assertEquals(expectedTemp, actualTemp, 0.0);
    }
    @Test
    public void celsiusToFahrenheitByNegative() {
        Double expectedTemp = -148.0;
        Double actualTemp = converter.celsiusToFahrenheit(-100.0);
        assertEquals(expectedTemp, actualTemp, 0.0);
    }
}