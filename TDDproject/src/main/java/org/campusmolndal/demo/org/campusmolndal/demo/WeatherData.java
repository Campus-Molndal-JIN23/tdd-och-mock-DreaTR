package org.campusmolndal.demo.org.campusmolndal.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.testng.AssertJUnit.assertEquals;

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
