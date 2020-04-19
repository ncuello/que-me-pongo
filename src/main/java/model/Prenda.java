package model;

import static java.util.Objects.requireNonNull;

public class Prenda {
    private TipoPrenda tipoPrenda;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;


    public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario) {
        this.tipoPrenda = requireNonNull(tipoPrenda, "tipo prenda es obligatorio");
        this.material = requireNonNull(material, "material es obligatorio");
        this.colorPrimario = requireNonNull(colorPrimario, "color primario es obligatorio");
        this.colorSecundario = colorSecundario;
    }


    public Categoria getCategoria() {
        return this.tipoPrenda.getCategoria();
    }
}
