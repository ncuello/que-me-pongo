package unit.model;

import model.Borrador;
import model.Color;
import model.Material;
import model.Prenda;
import model.TipoPrenda;
import model.Trama;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BorradorTest {
    
	@DisplayName("Un Borrador sin TipoPrenda debe arrojar NullPointerException al instanciarse")
    @Test
    public void borradorSinTipoPrenda() {
        NullPointerException excepcion = assertThrows(NullPointerException.class, () -> {
        	new Borrador(null);
        });

        String mensajeEsperado = "tipo prenda es obligatorio";
        assertEquals(mensajeEsperado, excepcion.getMessage());
    }

    @DisplayName("Un Borrador que especifica Material nulo debe arrojar NullPointerException")
    @Test
    public void borradorSinMaterial() {
        NullPointerException excepcion = assertThrows(NullPointerException.class, () -> {
        	new Borrador(TipoPrenda.PANTALON).especificarMaterial(null);
        });

        String mensajeEsperado = "material es obligatorio";
        assertEquals(mensajeEsperado, excepcion.getMessage());
    }

    @DisplayName("Un Borrador que especifica Color Primario nulo debe arrojar NullPointerException")
    @Test
    public void borradorSinColorPrimario() {
        NullPointerException excepcion = assertThrows(NullPointerException.class, () -> {
        	new Borrador(TipoPrenda.PANTALON).especificarColorPrimario(null);
        });

        String mensajeEsperado = "color primario es obligatorio";
        assertEquals(mensajeEsperado, excepcion.getMessage());
    }
    
    @DisplayName("Un Borrador que no especifica Material o Color Primario debe arrojar NullPointerException al crear la Prenda")
    @Test
    public void prendaSinMaterialOColorPrimario() {
        NullPointerException excepcionColorPrimario = assertThrows(NullPointerException.class, () -> {
        	new Borrador(TipoPrenda.PANTALON).especificarMaterial(Material.JEAN).crearPrenda();
        });
        NullPointerException excepcionMaterial = assertThrows(NullPointerException.class, () -> {
        	new Borrador(TipoPrenda.PANTALON).especificarColorPrimario(new Color(0, 0, 255)).crearPrenda();
        });

        String mensajeEsperado = "Falta algún campo obligatorio";
        assertEquals(mensajeEsperado, excepcionColorPrimario.getMessage());
        assertEquals(mensajeEsperado, excepcionMaterial.getMessage());
    }
}
