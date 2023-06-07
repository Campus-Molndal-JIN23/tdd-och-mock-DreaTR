public class WeatherService {

    private final ExternalWeatherService externalWeatherService;
    private final String defaultLocation = "Stockholm";

    public WeatherService (ExternalWeatherService externalWeatherService){

        this.externalWeatherService = externalWeatherService;
    }
    public double getTemperature(){
        String json = externalWeatherService.getWeatherData(defaultLocation);
        return parseTemperatureFromJson(json);
    }
    public String getWeatherDescription() {
        String json = externalWeatherService.getWeatherData(defaultLocation);
        return parseWeatherDescriptionFromJson(json);
    }
    public double getWindSpeed() {
        String json = externalWeatherService.getWeatherData(defaultLocation);
        return parseWindSpeedFromJson(json);
    }
    private double parseTemperatureFromJson(String json) {
        JsonObject jsonObject = new JsonObject(json);
        return jsonObject.get("main").get("temp").getAsDouble();
    }
    private String parseWeatherDescriptionFromJson(String json) {
        JsonObject jsonObject = new JsonObject(json);
        return jsonObject.get("weather").get(String.valueOf(0)).get("description").getAsString();
    }
    private double parseWindSpeedFromJson(String json) {
        JsonObject jsonObject = new JsonObject(json);
        return jsonObject.get("wind").get("speed").getAsDouble();
    }
    public String getAsString() {
        return externalWeatherService.getWeatherData(defaultLocation);
    }
    public long getSunsetTime() {
        return getSunsetTime();
    }
    public long getSunriseTime() {
        return getSunriseTime();
    }


}
