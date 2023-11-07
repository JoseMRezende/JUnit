package Master;

/**
 * Esta classe representa uma calculadora simples que realiza operações de soma, subtração, divisão e multiplicação.
 * Autor: José Marcos
 * Lançamento: 18/09/2023
 * Versão: 3.0
 */
public class CalculadoraMetodos {

    /**
     * Realiza a operação de soma entre dois números inteiros.
     *
     * @param a O primeiro número a ser somado.
     * @param b O segundo número a ser somado.
     * @return O resultado da operação de soma.
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a operação de subtração entre dois números inteiros.
     *
     * @param a O número do qual subtrair.
     * @param b O número a ser subtraído.
     * @return O resultado da operação de subtração.
     */
    public int subtrair(int a, int b){
        return a - b;
    }

    /**
     * Realiza a operação de divisão entre dois números inteiros.
     *
     * @param a O número a ser dividido.
     * @param b O número pelo qual dividir.
     * @return O resultado da operação de divisão.
     */
    public int divicao(int a, int b){
        return a / b;
    }

    /**
     * Realiza a operação de multiplicação entre dois números inteiros.
     *
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return O resultado da operação de multiplicação.
     */
    public int multiplicacao(int a, int b){
        return a * b;
    }
}