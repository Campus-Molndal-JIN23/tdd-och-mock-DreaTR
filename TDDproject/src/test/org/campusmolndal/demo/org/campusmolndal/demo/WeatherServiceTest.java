package org.campusmolndal.demo.org.campusmolndal.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.testng.AssertJUnit.assertEquals;


class WeatherServiceTest {


    @Mock
    private ExternalWeatherService externalWeatherService;

    private WeatherService weatherService;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);
        weatherService = new WeatherService(externalWeatherService);

    }

    @Test
    void getTemperature() {
        // Arrange
        double expectedTemperature = 20.59;
        when(externalWeatherService.getTemperature(anyString())).thenReturn(expectedTemperature);

        // Act
        double actualTemperature = weatherService.getTemperature();

        // Assert
        assertEquals(expectedTemperature, actualTemperature, 0.01);
    }

    @Test
    void getWeatherDescription() {
        // Arrange
        String expectedWeatherDescription = "overcast clouds";
        when(externalWeatherService.getWeatherDescription(anyString())).thenReturn(expectedWeatherDescription);

        // Act
        String actualWeatherDescription = weatherService.getWeatherDescription();

        // Assert
        assertEquals(expectedWeatherDescription, actualWeatherDescription);

    }

    @Test
    void getWindSpeed() {
        // Arrange
        double expectedWindSpeed = 5.14;
        when(externalWeatherService.getWindSpeed(anyString())).thenReturn(expectedWindSpeed);

        // Act
        double actualWindSpeed = weatherService.getWindSpeed();

        // Assert
        assertEquals(expectedWindSpeed, actualWindSpeed, 0.01);
    }

    public interface ExternalWeatherService {
        double getTemperature(String location);
        String getWeatherDescription(String location);
        double getWindSpeed(String location);
    }
}