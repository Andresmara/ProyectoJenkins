package example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MiClaseTest {

    @Test
    public void testDiaLaboral_Lunes() {
        assertTrue(MiClase.dia_laboral("Lunes"));
    }

    @Test
    public void testDiaLaboral_Viernes() {
        assertTrue(MiClase.dia_laboral("Viernes"));
    }

    @Test
    public void testDiaNoLaboral_Sabado() {
        assertFalse(MiClase.dia_laboral("Sabado"));
    }

    @Test
    public void testDiaNoLaboral_Domingo() {
        assertFalse(MiClase.dia_laboral("Domingo"));
    }

    @Test
    public void testDiaInvalido() {
        assertFalse(MiClase.dia_laboral("Feriado"));
    }
}
