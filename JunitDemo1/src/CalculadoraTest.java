import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    void creaCalculadora(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Suma 5, 5")
    void suma() {
        assertEquals(10, calculadora.suma(5, 5));
    }

    @Test
    @DisplayName("Resta 5, 5")
    void resta() {
        assertEquals(0, calculadora.resta(5, 5));
    }

    @Test
    @DisplayName("Multiplica 5 y 5")
    void multiplicacion() {
        assertEquals(25, calculadora.multiplicacion(5, 5));
    }

    @Test
    @DisplayName("Division 5 y 5")
    void division() {
        assertEquals(1, calculadora.division(5, 5));
    }

   @AfterEach
    void destruyeCalculadora(){
        calculadora = null;
   }
}