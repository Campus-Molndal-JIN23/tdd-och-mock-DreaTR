package org.campusmolndal.demo.org.campusmolndal.demo;

public class WeatherData {
    private double temperature;
    private String weatherDescription;
    private double windSpeed;

    public WeatherData(double temperature, String weatherDescription, double windSpeed) {
        this.temperature = temperature;
        this.weatherDescription = weatherDescription;
        this.windSpeed = windSpeed;
    }
    public double getTemperature() {
        return temperature;
    }
    public String getWeatherDescription() {
        return weatherDescription;
    }
    public double getWindSpeed() {
        return windSpeed;
    }
}
