package geekbrains;

import okhttp3.*;

import java.io.IOException;

public class Weather {
    private String keyApi = "30f96a3c-28aa-450a-a6f7-0166c702a66c";
    private double lat = 59.939095; //широта
    private double lon = 30.315868; //долгота
    private String lang = "ru_RU"; //язык ответа
    private int limit = 5; //срок прогноза

    public void getWeather() {
        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("api.weather.yandex.ru")
                .addPathSegment("v2")
                .addPathSegment("forecast")
                .addQueryParameter("lat", String.valueOf(lat))
                .addQueryParameter("lon", String.valueOf(lon))
                .addQueryParameter("lang", lang)
                .addQueryParameter("limit", String.valueOf(limit))
                .build();

        Request request = new Request.Builder()
                .url(url)
                .addHeader("X-Yandex-API-Key", keyApi)
                .build();

        try (Response response = client.newCall(request).execute()) {
            System.out.println(response.body().string());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
