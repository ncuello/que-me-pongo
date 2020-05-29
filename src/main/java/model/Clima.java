package model;

import java.util.Date;

public class Clima {
    Date fecha;
    Integer temperatura;
    Boolean precipitaciones;

    public Clima(Date fecha, Integer temperatura, Boolean precipitaciones) {
        this.fecha = fecha;
        this.temperatura = temperatura;
        this.precipitaciones = precipitaciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Boolean getPrecipitaciones() {
        return precipitaciones;
    }

    public void setPrecipitaciones(Boolean precipitaciones) {
        this.precipitaciones = precipitaciones;
    }
}
