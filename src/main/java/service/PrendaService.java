package service;

import model.Clima;
import model.Prenda;
import model.criterioClima.Criterio;

import java.util.List;

public class PrendaService {

    ClimaService serviceClima;

    List<Prenda> prendas;

    public List<Prenda> obtenerPrendasAptasPara(String lugar, Criterio criterio) {

        Clima clima = serviceClima.obtenerClima(lugar);

        criterio.obtenerPrendasAptas(clima, prendas);
        return null;
    }

}
