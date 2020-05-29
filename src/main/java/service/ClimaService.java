package service;

import model.Clima;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimaService {
    
    AccuWeatherApi apiWeather = new AccuWeatherApi();
    
    public Clima obtenerClima(String lugar){
        List<Map<String, Object>> condicionesClimaticas = apiWeather.getWeather(lugar);


        Clima clima = getClima(condicionesClimaticas);

        return clima;
    }


    /*
    Crear builder para convertir Map obtenido a Clima
     */
    private Clima getClima(List<Map<String, Object>> condicionesClimaticas) {
        Boolean precipitaciones = (Boolean) condicionesClimaticas.get(0).get("PrecipitationProbability");
        HashMap<String, Object> temperatura = (HashMap<String, Object>) condicionesClimaticas.get(0).get("Temperature");
        Integer grados = (Integer) temperatura.get("Value");
        Date fecha = (Date) condicionesClimaticas.get(0).get("DateTime");

        return new Clima(fecha, grados, precipitaciones);
    }


}
