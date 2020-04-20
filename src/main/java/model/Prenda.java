package model;

import static java.util.Objects.requireNonNull;

public class Prenda {
    private TipoPrenda tipoPrenda;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;
	private Trama trama;


    public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario, Trama trama) {
        this.tipoPrenda = requireNonNull(tipoPrenda, "tipo prenda es obligatorio");
        this.material = requireNonNull(material, "material es obligatorio");
        this.colorPrimario = requireNonNull(colorPrimario, "color primario es obligatorio");
        this.colorSecundario = colorSecundario;
        this.trama = trama;
    }


    public Categoria getCategoria() {
        return this.tipoPrenda.getCategoria();
    }
}
