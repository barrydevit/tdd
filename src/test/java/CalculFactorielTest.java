import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculFactorielTest {

    private CalculFactorielImpl calculFactoriel = new CalculFactorielImpl();

    @Test
    void calculateFactorielZero() {
        int resultat = calculFactoriel.calculator(0);
        Assertions.assertEquals(1, resultat);
    }

    @Test
    void calculateFactoriel() {
        int resultat = calculFactoriel.calculator(5);
        Assertions.assertEquals(120, resultat);
    }
}
