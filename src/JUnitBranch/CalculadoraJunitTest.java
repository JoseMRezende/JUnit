package JUnitBranch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraJunitTest {

    //Iniciando a classe Calculadora
    CalculadoraJunit calc = new CalculadoraJunit();

    //Cenario de Teste 1: Soma de dois valores
    @Test
    public void Somar(){
        int soma = calc.somar(3,7);
        Assertions.assertEquals(10,soma);
    }

    //Cenario de Teste 2: Soma de dois valores sendo um zero
    @Test
    public void Somar2(){
        int soma2 = calc.somar(10,0);
        Assertions.assertEquals(10,soma2);
    }

    //Cenario de Teste 3: Soma de dois valores sendo que ambos são zero
    @Test
    public void Somar3(){
        int soma3 = calc.somar(0,0);
        Assertions.assertEquals(0,soma3);
    }

    //Cenario de Teste 4: Soma de dois valores sendo um negativo
    @Test
    public void Somar4(){
        int soma4 = calc.somar(5,-2);
        Assertions.assertEquals(3,soma4);
    }

    //////////////////////////////////////////////////////////////////////////////////////

    //Cenario de Teste 1: Subtração de dois valores
    @Test
    public void Sub() {
        int sub1 = calc.subtrair(10, 2);
        Assertions.assertEquals(8,sub1);
    }

    //Cenario de Teste 2: Subtração de dois valores sendo um zero
    @Test
    public void Sub2() {
        int sub2 = calc.subtrair(17, 0);
        Assertions.assertEquals(17,sub2);
    }

    //Cenario de Teste 3: Subtração de dois valores sendo que ambos são zero
    @Test
    public void Sub3() {
        int sub3 = calc.subtrair(0, 0);
        Assertions.assertEquals(0,sub3);
    }

    //Cenario de Teste 4: Subtração de dois valores sendo um negativo
    @Test
    public void Sub4() {
        int sub4 = calc.subtrair(35, -7);
        Assertions.assertEquals(28,sub4);
    }

    //////////////////////////////////////////////////////////////////////////////////////

    //Cenario de Teste 1: Divição de dois valores
    @Test
    public void Div() {
        int div1 = calc.divicao(100, 50);
        Assertions.assertEquals(2,div1);
    }

    //Cenario de Teste 2: Divição de dois valores sendo um zero
    @Test
    public void Div2() {
        int div2 = calc.divicao(80, 0);
    }
    // Report: Erro na operação não é possivel fazer divisão com zero

    //Cenario de Teste 3: Divição de dois valores sendo que ambos são zero
    @Test
    public void Div3() {
        int div3 = calc.divicao(0, 0);
    }
    // Report: Erro na operação não é possivel calcular a divisão com dois numeros zero

    //Cenario de Teste 4: Divição de dois valores sendo um negativo
    @Test
    public void Div4() {
        int div4 = calc.divicao(120, -50);
        Assertions.assertEquals(70,div4);
    }

    //////////////////////////////////////////////////////////////////////////////////////

    //Cenario de Teste 1: Multiplicação de dois valores
    @Test
    public void Mult() {
        int mult1 = calc.multiplicacao(3, 5);
        Assertions.assertEquals(15,mult1);
    }


    //Cenario de Teste 2: Multiplicação de dois valores sendo um zero
    @Test
    public void Mult2() {
        int mult2 = calc.multiplicacao(3, 0);
        Assertions.assertEquals(0,mult2);
    }


    //Cenario de Teste 3: Multiplicação de dois valores sendo que ambos são zero
    @Test
    public void Mult3() {
        int mult3 = calc.multiplicacao(0, 0);
        Assertions.assertEquals(0,mult3);
    }


    //Cenario de Teste 4: Multiplicação de dois valores sendo um negativo
    @Test
    public void Mult4() {
        int mult4 = calc.multiplicacao(9, -7);
        Assertions.assertEquals(-63,mult4);
    }



}
