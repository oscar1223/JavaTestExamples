import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calc;

    @Test
    @BeforeEach
    void crearCalculadora(){
        calc = new Calculadora();
    }

    @Test
    @DisplayName("Suma 5 y 5")
    void suma() {
        assertEquals(10, calc.suma(5, 5));
    }

    @Test
    @DisplayName("Resta 5 y 5")
    void resta() {
        assertEquals(0, calc.resta(5, 5));
    }

    @Test
    @DisplayName("Multiplicación 5 y 5")
    void multiplicacion() {
        assertEquals(25, calc.multiplicacion(5, 5));
    }

    @Test
    @DisplayName("División 5 y 5")
    void division() {
        assertEquals(1, calc.division(5, 5));
    }

}