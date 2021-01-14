package geekbrains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class WeatherResponse {
    private JsonNode weather;
    private JsonNode city;

    public WeatherResponse() {
    }

    public WeatherResponse(String weather) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();

            this.weather = objectMapper
                    .readTree(weather)
                    .at("/forecasts");

            city = objectMapper
                    .readTree(weather)
                    .at("/geo_object/locality/name");

        } catch (JsonProcessingException e){
            e.getMessage();
        }
    }

    public void printWeather(){
        JsonNode date;
        JsonNode temp_avg;
        JsonNode condition;
        JsonNode wind_speed;
        JsonNode wind_dir;
        Reference reference = new Reference();

        for(Object forecast : weather){
            date = ((ObjectNode)forecast).get("date"); //дата
            temp_avg = ((ObjectNode)forecast).get("parts").get("day").get("temp_avg"); //средняя температура
            condition = ((ObjectNode)forecast).get("parts").get("day").get("condition"); //описание погоды
            wind_speed = ((ObjectNode)forecast).get("parts").get("day").get("wind_speed"); //скорость ветра
            wind_dir = ((ObjectNode)forecast).get("parts").get("day").get("wind_dir"); //направление ветра

            System.out.printf("В городе %s на дату %s ожидается %s, скорость ветра %s, направление ветра %s, температура %s\n",
                    city, date, reference.getCondition(condition.asText()), wind_speed, reference.getWindDir(wind_dir.asText()), temp_avg);
        }
    }
}
