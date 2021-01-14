package geekbrains;

public class Lesson_7 {
    public static void main(String[] args) {
        Weather weather = new Weather();
        System.out.println(weather.getWeather());

        WeatherResponse weatherResponse = new WeatherResponse(weather.getWeather());
        weatherResponse.printWeather();
    }
}
