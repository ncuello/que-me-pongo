package model.uniformes;

import model.Borrador;
import model.Color;
import model.Material;
import model.Prenda;
import model.TipoPrenda;

public class SastreSanJuan implements Sastre {
	@Override
	public Prenda fabricarParteSuperior() {		
		return new Borrador(TipoPrenda.CHOMBA)
				.especificarMaterial(Material.PIQUE)
				.especificarColorPrimario(new Color(0, 143, 57))
				.crearPrenda();
	}

	@Override
	public Prenda fabricarParteInferior() {
		return new Borrador(TipoPrenda.PANTALON)
				.especificarMaterial(Material.ACETATO)
				.especificarColorPrimario(new Color(130, 130, 130))
				.crearPrenda();
	}

	@Override
	public Prenda fabricarCalzado() {
		return new Borrador(TipoPrenda.ZAPATILLA)
				.especificarMaterial(Material.CUERINA)
				.especificarColorPrimario(new Color(255, 255, 255))
				.crearPrenda();
	}
}
