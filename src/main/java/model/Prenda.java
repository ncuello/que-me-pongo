package model;

import model.criterioClima.Criterio;

public class Prenda {
    private TipoPrenda tipoPrenda;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;
	private Trama trama;
    public Criterio criterio;

    public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario, Trama trama, Criterio criterio) {
        this.tipoPrenda = tipoPrenda;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.trama = trama;
        this.criterio = criterio;
    }

    public Categoria getCategoria() {
        return this.tipoPrenda.getCategoria();
    }
}
