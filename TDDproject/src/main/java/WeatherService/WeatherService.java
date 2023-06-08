package WeatherService;

public class WeatherService {

    // Konstruktor
    public WeatherService() {
    }
    // Getters metoder för att hämta väderdata
    public Weather getWeather(String city) {

        // Anropar WeatherAPI för att hämta väderdata baserat på staden

        // Fiktiva värden för att illustrera konceptet
        double temperature = 20.5;
        double windSpeed = 10.2;
        int clouds = 3;
        String country = "Sverige";

        // Skapar en instans av Weather med de hämtade värdena
        return new Weather(temperature, windSpeed, clouds, city, country);
    }
    public double getTemperature() {
        return 20.5;
    }
    public double getWindSpeed() {
        return 10.2;
    }
    public int getClouds() {
        return 3;
    }
    public String getCountry() {
        return "Sverige";
    }
}
