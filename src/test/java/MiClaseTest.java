import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MiClaseTest {

    @Test
    void testLunesEsLaboral() {
        // Verificamos que "Lunes" devuelva true
        assertTrue(MiClase.dia_laboral("Lunes"));
    }

    @Test
    void testDomingoNoEsLaboral() {
        // Verificamos que "Domingo" devuelva false
        assertFalse(MiClase.dia_laboral("Domingo"));
    }

    @Test
    void testEntradaInvalida() {
        // Verificamos que cualquier otra cosa caiga en el 'default' (false)
        assertFalse(MiClase.dia_laboral("Inventado"));
    }

}