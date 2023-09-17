package JUnitBranch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraJunitTest {

    CalculadoraJunit calc = new CalculadoraJunit();

    @Test
    public void Somar(){
        int soma = calc.somar(3,7);
        Assertions.assertEquals(10,soma);
    }

    @Test
    public void Somar2(){
        int soma2 = calc.somar(10,0);
        Assertions.assertEquals(10,soma2);
    }

    @Test
    public void Somar3(){
        int soma3 = calc.somar(0,0);
        Assertions.assertEquals(0,soma3);
    }

    @Test
    public void Somar4(){
        int soma4 = calc.somar(5,-2);
        Assertions.assertEquals(3,soma4);
    }

}
