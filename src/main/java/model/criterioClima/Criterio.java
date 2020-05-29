package model.criterioClima;

import model.Clima;
import model.Prenda;

import java.util.List;

public interface Criterio {
    List<Prenda> obtenerPrendasAptas(Clima clima, List<Prenda> prendas);
}
