package JUnitBranch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraJunitTest {

    @Test
    public void Somar(){
        CalculadoraJunit calc = new CalculadoraJunit();
        int soma = calc.somar(3,7);
        Assertions.assertEquals(10,soma);
    }
}
