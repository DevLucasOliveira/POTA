package Aula02.Recursividade.Exercicio02;

import java.util.Scanner;

public class main {

    public static String contagemRegressiva(int numero){
        if(numero<1){
            return "\n FELIZ ANO NOVO!";
        }else
            return " ... "+numero+ (contagemRegressiva(numero-1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos segundos faltam para o ano novo: ");
        int segundos = input.nextInt();
        System.out.println(contagemRegressiva(segundos));

    }

}
