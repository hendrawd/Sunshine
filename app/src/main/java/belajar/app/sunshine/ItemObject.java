package belajar.app.sunshine;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by isfaaghyth on 12/11/16.
 */

public class ItemObject {
    public static class ListWeather {
        private String judul;

        public String getJudul() {
            return judul;
        }

        public ListWeather(String judul) {
            this.judul = judul;
        }
    }

    public static class CurrentWeather {
        @SerializedName("name")
        private String name;

        public String getName() {
            return name;
        }

        @SerializedName("weather")
        List<Weather> weather;

        public class Weather {
            @SerializedName("icon")
            private String icon;

            public String getIcon() {
                return icon;
            }
        }

        @SerializedName("main")
        private MainTemperature main;

        public MainTemperature getMain() {
            return main;
        }

        public class MainTemperature {
            @SerializedName("temp")
            private String temp;

            public String getTemp() {
                return temp;
            }
        }
    }
}
