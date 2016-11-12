package belajar.app.sunshine.Controllers;

/**
 * Created by isfaaghyth on 05/11/16.
 */

public class CloudURL {

    final static private String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?";
    final static private String API_KEY = "2179f78744d032ca7c25006a0e0f3541";
    final static private String COUNTRY = "Jakarta";
    final static private String UNITS = "metric"; //imperial & metric

    public static String getCurrentWeather() {
        return BASE_URL + "q=" + COUNTRY + "&units=" + UNITS + "&appid=" + API_KEY;
    }


}
