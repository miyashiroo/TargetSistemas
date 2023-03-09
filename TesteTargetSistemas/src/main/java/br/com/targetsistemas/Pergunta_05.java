package br.com.targetsistemas;

import java.util.Scanner;

public class Pergunta_05 {

    /*
    5) Escreva um programa que inverta os caracteres de um string.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stringOriginal = "";
        System.out.println("Digite uma String:");
        stringOriginal += scan.nextLine();
        scan.close();

        char[] arrayDeChar = stringOriginal.toCharArray();
        String reverso = "";
        int tamanhoAuxiliar = arrayDeChar.length - 1;

        System.out.println(arrayDeChar);

        for (int i = 0; i < arrayDeChar.length; i++ ){
             reverso += arrayDeChar[tamanhoAuxiliar];
             tamanhoAuxiliar--;


        }
        System.out.println(reverso);



    }

}
