package Master;

import Master.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        //Iniciando a classe Calculadora
        Calculadora calc = new Calculadora();

        //Cenario de Teste 1: Soma de dois valores
        int soma1 = calc.somar(3,7);
        System.out.println(soma1);

        //Cenario de Teste 2: Soma de dois valores sendo um zero
        int soma2 = calc.somar(10,0);
        System.out.println(soma2);

        //Cenario de Teste 3: Soma de dois valores sendo que ambos são zero
        int soma3 = calc.somar(0,0);
        System.out.println(soma3);

        //Cenario de Teste 4: Soma de dois valores sendo um negativo
        int soma4 = calc.somar(5,-2);
        System.out.println(soma4);

        //////////////////////////////////////////////////////////////////////////////////////

        //Cenario de Teste 1: Subtração de dois valores
        int sub1 = calc.subtrair(10,2);
        System.out.println(sub1);

        //Cenario de Teste 2: Subtração de dois valores sendo um zero
        int sub2 = calc.subtrair(17,0);
        System.out.println(sub2);

        //Cenario de Teste 3: Subtração de dois valores sendo que ambos são zero
        int sub3 = calc.subtrair(0,0);
        System.out.println(sub3);

        //Cenario de Teste 4: Subtração de dois valores sendo um negativo
        int sub4 = calc.subtrair(35,-7);
        System.out.println(sub4);


        //////////////////////////////////////////////////////////////////////////////////////

        //Cenario de Teste 1: Divição de dois valores
        int div1 = calc.divicao(100,50);
        System.out.println(div1);

        //Cenario de Teste 2: Divição de dois valores sendo um zero
        int div2 = calc.divicao(80,0);
        System.out.println(div2);
        // Report: Erro na operação não é possivel fazer divisão com zero

        //Cenario de Teste 3: Divição de dois valores sendo que ambos são zero
        int div3 = calc.divicao(0,0);
        System.out.println(div3);
        // Report: Erro na operação não é possivel calcular a divisão com dois numeros zero

        //Cenario de Teste 4: Divição de dois valores sendo um negativo
        int div4 = calc.divicao(120,-50);
        System.out.println(div4);

        //////////////////////////////////////////////////////////////////////////////////////

        //Cenario de Teste 1: Multiplicação de dois valores
        int mult1 = calc.multiplicacao(3,5);
        System.out.println(mult1);

        //Cenario de Teste 2: Multiplicação de dois valores sendo um zero
        int mult2 = calc.multiplicacao(3,0);
        System.out.println(mult2);

        //Cenario de Teste 3: Multiplicação de dois valores sendo que ambos são zero
        int mult3 = calc.multiplicacao(0,0);
        System.out.println(mult3);

        //Cenario de Teste 4: Multiplicação de dois valores sendo um negativo
        int mult4 = calc.multiplicacao(9,-7);
        System.out.println(mult4);
    }
}