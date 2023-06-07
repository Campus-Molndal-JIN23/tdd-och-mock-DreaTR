package org.campusmolndal.demo.org.campusmolndal.demo;

import org.campusmolndal.demo.org.campusmolndal.demo.ExternalWeatherService;
import org.campusmolndal.demo.org.campusmolndal.demo.WeatherData;

public class WeatherService {

    private final ExternalWeatherService externalWeatherService;
    private final String defaultLocation = "Stockholm";
    private WeatherData weatherData;

    public WeatherService(ExternalWeatherService externalWeatherService) {
        this.externalWeatherService = externalWeatherService;
        updateWeatherData();
    }

    private void updateWeatherData() {
        String weatherJson = externalWeatherService.getWeatherData(defaultLocation);
        weatherData = parseWeatherDataFromJson(weatherJson);
    }
    private WeatherData parseWeatherDataFromJson(String json) {

        double temperature = extractValueFromJson(json, "\"temp\":", ",");
        String weatherDescription = String.valueOf(extractValueFromJson(json, "\"description\":\"", "\""));
        double windSpeed = extractValueFromJson(json, "\"speed\":", ",");

        return new WeatherData(temperature, weatherDescription, windSpeed);
    }
    private double extractValueFromJson(String json, String startKey, String endKey) {
        int startIndex = json.indexOf(startKey);
        if (startIndex != -1) {
            startIndex += startKey.length();
            int endIndex = json.indexOf(endKey, startIndex);
            if (endIndex != -1) {
                String valueString = json.substring(startIndex, endIndex).trim();
                return Double.parseDouble(valueString);
            }
        }
        return 0.0;
    }
    public double getTemperature() {
        return weatherData.getTemperature();
    }
    public String getWeatherDescription() {
        return weatherData.getWeatherDescription();
    }
    public double getWindSpeed() {
        return weatherData.getWindSpeed();
    }

}
