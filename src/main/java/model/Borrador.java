package model;

import static java.util.Objects.requireNonNull;

public class Borrador {
	private TipoPrenda tipoPrenda;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;
	private Trama trama = Trama.LISA;
	
	public Borrador(TipoPrenda tipoPrenda) {
		this.tipoPrenda = requireNonNull(tipoPrenda, "tipo prenda es obligatorio");
	}

	public Borrador especificarMaterial(Material material) {
		this.material = requireNonNull(material, "material es obligatorio");
		return this;
	}
	
	public Borrador especificarColorPrimario(Color colorPrimario) {
		this.colorPrimario = requireNonNull(colorPrimario, "color primario es obligatorio");
		return this;
	}
	
	public Borrador especificarColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
		return this;
	}
	
	public Borrador especificarTrama(Trama trama) {
		this.trama = trama == null ? Trama.LISA : trama;
		return this;
	}
	
	public Prenda crearPrenda() {
		if(material == null || colorPrimario == null)
			throw new NullPointerException("Falta algún campo obligatorio");
		
		return new Prenda(tipoPrenda, material, colorPrimario, colorSecundario, trama);
	}
}
