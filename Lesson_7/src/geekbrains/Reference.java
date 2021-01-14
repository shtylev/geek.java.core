package geekbrains;

import java.util.LinkedHashMap;

public class Reference {
    private LinkedHashMap<String, String> conditions; //описание погоды
    private LinkedHashMap<String, String> wind_dir; //направление ветра

    public Reference(){
        conditions = new LinkedHashMap<>(19);
        wind_dir = new LinkedHashMap<>(9);

        conditions.put("clear", " ясно");
        conditions.put("partly-cloudy", "малооблачно");
        conditions.put("cloudy", "облачно с прояснениями");
        conditions.put("overcast", "пасмурно");
        conditions.put("drizzle", "морось");
        conditions.put("light-rain", "небольшой дождь");
        conditions.put("rain", "дождь");
        conditions.put("moderate-rain", "умеренно сильный дождь");
        conditions.put("heavy-rain", "сильный дождь");
        conditions.put("continuous-heavy-rain", "длительный сильный дождь");
        conditions.put("showers", "ливень");
        conditions.put("wet-snow", "дождь со снегом");
        conditions.put("light-snow", "небольшой снег");
        conditions.put("snow", "снег");
        conditions.put("snow-showers", "снегопад");
        conditions.put("hail", "град");
        conditions.put("thunderstorm", "гроза");
        conditions.put("thunderstorm-with-rain", "дождь с грозой");
        conditions.put("thunderstorm-with-hail", "гроза с градом");

        wind_dir.put("nw", "северо-западное");
        wind_dir.put("n", "северное");
        wind_dir.put("ne", "северо-восточное");
        wind_dir.put("e", "восточное");
        wind_dir.put("se", "юго-восточное");
        wind_dir.put("s", "южное");
        wind_dir.put("sw", "юго-западное");
        wind_dir.put("w", "западное");
        wind_dir.put("c", "штиль");
    }

    public String getCondition(String name){
        return conditions.getOrDefault(name, "неизвестно");
    }

    public String getWindDir(String name){
        return wind_dir.getOrDefault(name, "неизвестно");
    }
}
