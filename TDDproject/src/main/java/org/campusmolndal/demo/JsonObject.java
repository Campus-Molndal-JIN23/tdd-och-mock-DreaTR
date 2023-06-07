public class JsonObject {
    private String json;

    public JsonObject(String json) {
    }

    public JsonObject get(String key) {

        if (json.contains(key)) {
            return new JsonObject(key);
        } else {
            return null;
        }
    }
    public double getAsDouble() {
        return Double.parseDouble(json);
    }

    public String getAsString() {
        return json;
    }
}
