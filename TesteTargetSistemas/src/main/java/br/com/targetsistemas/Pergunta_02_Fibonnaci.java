package br.com.targetsistemas;

import java.util.Scanner;

public class Pergunta_02_Fibonnaci {
    /*

    2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
    anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
    informado um número,     ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
    pertence ou não a sequência.



    IMPORTANTE:

    Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido
    no código;

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero para ver se pertence a sequencia de fibonacci: ");
        int numeroParaVerificar = scan.nextInt();

        int elemento01 = 0;
        int elemento02 = 1;
        int elemento03 = elemento01 + elemento02;

        while (elemento03 < numeroParaVerificar){
            elemento01 = elemento02;
            elemento02 = elemento03;
            elemento03 = elemento01 + elemento02;
        }

        if (elemento03 == numeroParaVerificar){
            System.out.println("Pertence a sequencia de fibonacci");
        } else {
            System.out.println("Não pertence a sequencia de fibonacci");
        }






    }




}
