package demo;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class WeatherServiceTest {
    private WeatherService weatherService;
    private ExternalWeatherService externalWeatherService;

    @Before
    public void setup() {
        externalWeatherService = mock(ExternalWeatherService.class);
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