package weather;

public enum WeatherMessage {
    SUNNY("SUN", "Не забудьте солнцезащитный крем!"),
    CLOUDY("CLOUDS", "Может быть, понадобится зонт."),
    RAINY("RAIN", "Не забудьте зонт!"),
    SNOW("SNOW", "Возьмите с собой лыжи");

    private String code;
    private String message;

    WeatherMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
