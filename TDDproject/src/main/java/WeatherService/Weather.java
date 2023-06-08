package WeatherService;

import java.util.Objects;

public class Weather {

    private final double temperature;
    private final double windSpeed;
    private final int clouds;
    private final String city;
    private final String country;

    // Konstruktor
    public Weather(double temperature, double windSpeed, int clouds, String city, String country) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.clouds = clouds;
        this.city = city;
        this.country = country;
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Weather other = (Weather) obj;
        return Double.compare(other.temperature, temperature) == 0 &&
                Double.compare(other.windSpeed, windSpeed) == 0 &&
                other.clouds == clouds &&
                Objects.equals(other.city, city) &&
                Objects.equals(other.country, country);

    }
}
