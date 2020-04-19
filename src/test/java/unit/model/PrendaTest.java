package unit.model;

import model.Color;
import model.Material;
import model.Prenda;
import model.TipoPrenda;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrendaTest {
    @DisplayName("Instanciacion | throw NullPointerException | Tipo prenda null")
    @Test
    public void instanciacionThrowNullPointerExceptionTipoPrendaNull() {
        NullPointerException excepcion = assertThrows(NullPointerException.class, () -> {
            new Prenda(null, Material.ALGODON, new Color(0, 0, 255), null);
        });

        String mensajeEsperado = "tipo prenda es obligatorio";
        assertEquals(mensajeEsperado, excepcion.getMessage());
    }

    @DisplayName("Instanciacion | throw NullPointerException | Material null")
    @Test
    public void instanciacionThrowNullPointerExceptionMaterialNull() {
        NullPointerException excepcion = assertThrows(NullPointerException.class, () -> {
            new Prenda(TipoPrenda.PANTALON, null, new Color(0, 0, 255), null);
        });

        String mensajeEsperado = "material es obligatorio";
        assertEquals(mensajeEsperado, excepcion.getMessage());
    }

    @DisplayName("Instanciacion | throw NullPointerException | Color primario null")
    @Test
    public void instanciacionThrowNullPointerExceptionColorPrimarioNull() {
        NullPointerException excepcion = assertThrows(NullPointerException.class, () -> {
            new Prenda(TipoPrenda.PANTALON, Material.JEAN, null, new Color(140, 0, 200));
        });

        String mensajeEsperado = "color primario es obligatorio";
        assertEquals(mensajeEsperado, excepcion.getMessage());
    }
}
