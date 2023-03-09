package br.com.targetsistemas;

public class Pergunta_01 {
    /*
    1) Observe o trecho de código abaixo:

    int INDICE = 13, SOMA = 0, K = 0;

    enquanto K < INDICE faça

    {

    K = K + 1;

    SOMA = SOMA + K;

    }

    imprimir(SOMA);



    Ao final do processamento, qual será o valor da variável SOMA?
    Resposta: A variável SOMA terá o valor de 91.


      */

    public static void main(String[] args) {
        int indice, soma, k;
        indice = 13;
        soma = 0;
        k =0;

        while (k < indice){
            k++;
            soma = k + soma;
        }
        System.out.println(soma);
    }
}
