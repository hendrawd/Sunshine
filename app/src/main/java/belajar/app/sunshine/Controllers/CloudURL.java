package belajar.app.sunshine.Controllers;

/**
 * Created by isfaaghyth on 05/11/16.
 */

public class CloudURL {

    final static public String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?";
    final static public String API_KEY = "2179f78744d032ca7c25006a0e0f3541";
    final static String currentWeather = "q=";

    public static String getCurrentWeather(String location) {
        return BASE_URL + currentWeather + location + "&appid=" + API_KEY;
    }
}
