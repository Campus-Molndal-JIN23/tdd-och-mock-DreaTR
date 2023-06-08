package WeatherService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class WeatherServiceTest {

    @Mock
    private WeatherAPI weatherAPI;

    private WeatherService weatherService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        weatherService = new WeatherService();
    }
    @Test
    void getWeather() {

        // Arrange
        String city = "Stockholm";
        Weather mockedWeather = new Weather(20.5, 10.2, 3, city, "Sverige");
        when(weatherAPI.getWeather()).thenReturn(mockedWeather);

        // Act
        Weather actualWeather = weatherService.getWeather(city);

        // Assert
        assertEquals(mockedWeather, actualWeather);
    }
    @Test
    void getTemperature_ValidCity_ReturnsTemperature(){

        // Arrange
        double mockedTemperature = 20.5;
        when(weatherAPI.getTemperature()).thenReturn(mockedTemperature);

        // Act
        double actualTemperature = weatherService.getTemperature();

        // Assert
        assertEquals(mockedTemperature, actualTemperature);
    }
    @Test
    void getWindSpeed_ValidCity_ReturnsWindSpeed() {

        // Arrange
        double mockedWindSpeed = 10.2;
        when(weatherAPI.getWindSpeed()).thenReturn(mockedWindSpeed);

        // Act
        double actualWindSpeed = weatherService.getWindSpeed();

        // Assert
        assertEquals(mockedWindSpeed, actualWindSpeed);
    }
    @Test
    void getClouds_ValidCity_ReturnsClouds() {

        // Arrange
        int mockedClouds = 3;
        when(weatherAPI.getClouds()).thenReturn(mockedClouds);

        // Act
        int actualClouds = weatherService.getClouds();

        //Assert
        assertEquals(mockedClouds, actualClouds);
    }
    @Test
    void getCountry_ValidCity_ReturnsCountry() {

        //Arrange
        String mockedCountry = "Sverige";
        when(weatherAPI.getCountry()).thenReturn(mockedCountry);

        //Act
        String actualCountry = weatherService.getCountry();

        //Assert
        assertEquals(mockedCountry, actualCountry);
    }








}