package main.java.WeatherService;
;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTest {

    private WeatherAPI weatherAPI;
    private WeatherService weatherService;




    @BeforeEach
    public void setup() {
        weatherAPI = mock(WeatherAPI.class);
        MockitoAnnotations.initMocks(this);

        weatherService = new WeatherService(weatherAPI);
        Weather mockedWeather = new Weather(20.5, 10.2, 3, "Stockholm", "Sverige");
        when(getWeather()).thenReturn(mockedWeather);
    }

    @Test
    void getWeather() {

    }

    @Test
    void getTemperature() {
        // Arrange
        double mockedTemperature = 20.5;
        when(weatherAPI.getTemperature()).thenReturn(mockedTemperature);

        // Act
        double actualTemperature = weatherService.getTemperature();

        // Assert
        assertEquals(mockedTemperature, actualTemperature);

    }

    @Test
    void getWindSpeed() {
        // Arrange
        double mockedWindSpeed = 10.2;
        when(weatherAPI.getWindSpeed()).thenReturn(mockedWindSpeed);

        // Act
        double actualWindSpeed = weatherService.getWindSpeed();

        // Assert
        assertEquals(mockedWindSpeed, actualWindSpeed);
    }

    @Test
    void getClouds() {

        // Arrange
        int mockedClouds = 3;
        when(weatherAPI.getClouds()).thenReturn(mockedClouds);

        // Act
        int actualClouds = weatherService.getClouds();

        //Assert
        assertEquals(mockedClouds, actualClouds);

    }

}