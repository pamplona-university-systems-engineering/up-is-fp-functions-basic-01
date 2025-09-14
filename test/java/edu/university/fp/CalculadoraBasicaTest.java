package edu.up.fp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraBasicaTest {

    @Test
    void testSuma() {
        assertEquals(7, CalculadoraBasica.suma(3,4));
    }

    @Test
    void testResta() {
        assertEquals(1, CalculadoraBasica.resta(5,4));
    }

    @Test
    void testMultiplicacion() {
        assertEquals(12, CalculadoraBasica.multiplicacion(3,4));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, CalculadoraBasica.division(8,4));
    }
}
