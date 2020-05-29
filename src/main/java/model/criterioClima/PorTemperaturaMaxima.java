package model.criterioClima;

import model.Clima;
import model.Prenda;

import java.util.List;
import java.util.stream.Collectors;

public class PorTemperaturaMaxima implements Criterio {

    Integer temperatura;

    public PorTemperaturaMaxima(Integer temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public List<Prenda> obtenerPrendasAptas(Clima clima, List<Prenda> prendas) {
        return prendas.stream().filter(p ->
                p.criterio instanceof PorTemperaturaMaxima
                    && ((PorTemperaturaMaxima) p.criterio).temperatura <= clima.getTemperatura())
                .collect(Collectors.toList());
    }
}
