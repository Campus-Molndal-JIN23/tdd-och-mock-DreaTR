package org.campusmolndal.demo;

import org.campusmolndal.demo.ExternalWeatherService;
import org.campusmolndal.demo.WeatherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class WeatherServiceTest {
    private WeatherService weatherService;
    private ExternalWeatherService externalWeatherService;

    @BeforeEach
    public void setup() {
        externalWeatherService = Mockito.mock(ExternalWeatherService.class);
        weatherService = new WeatherService(externalWeatherService);
    }
    @Test
    public void testGetTemperature() {
        // Arrange
        String mockJson = "{ \"main\": { \"temp\": 25.5 } }";
        when(externalWeatherService.getWeatherData("Stockholm")).thenReturn(mockJson);
        double expectedTemperature = 25.5;

        // Act
        double actualTemperature = weatherService.getTemperature();

        // Assert
        assertEquals(expectedTemperature, actualTemperature);
    }
    @Test
    public void testGetWeatherDescription(){
        // Arrange
        String mockJson = "{ \"weather\": [ { \"description\": \"Sunny\" } ] }";
        when(externalWeatherService.getWeatherData("Stockholm")).thenReturn(mockJson);
        String expectedDescription = "Sunny";

        // Act
        String actualDescription = weatherService.getWeatherDescription();

        // Assert
        assertEquals(expectedDescription, actualDescription);

    }

}