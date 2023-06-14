package WeatherService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class WeatherServiceTest {

    private WeatherAPI weatherAPI;
    private WeatherService weatherService;

    @BeforeEach
    public void setup() {
        weatherAPI = mock(WeatherAPI.class);

        weatherService = new WeatherService(weatherAPI);
        Weather mockedWeather = new Weather(20.5, 10.2, 3, "Stockholm", "Sverige");
        when(weatherAPI.getWeather()).thenReturn(mockedWeather);
        when(weatherAPI.getTemperature()).thenReturn(mockedWeather.getTemerature());
        when(weatherAPI.getWindSpeed()).thenReturn(mockedWeather.getWindspeed());
        when(weatherAPI.getClouds()).thenReturn(mockedWeather.getClouds());
    }
    @Test
    void getWeather(){

    }

    @Test
    void getTemperature() {

        double mockedTemperature = 20.5;
        double actualTemperature = weatherService.getTemperature();
        assertEquals(mockedTemperature, actualTemperature);
    }
    @Test
    void getWindSpeed() {

        double mockedWindSpeed = 10.2;
        double actualWindSpeed = weatherService.getWindSpeed();
        assertEquals(mockedWindSpeed, actualWindSpeed);
    }
    @Test
    void getClouds() {
        int mockedClouds = 3;
        int actualClouds = weatherService.getClouds();
        assertEquals(mockedClouds, actualClouds);
    }
}