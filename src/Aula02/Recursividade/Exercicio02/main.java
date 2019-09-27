package Aula02.Recursividade.Exercicio02;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos segundos faltam para o ano novo: ");
        int segundos = input.nextInt();
        Exercicio02 anonovo = new Exercicio02();
        System.out.println(anonovo.contagemRegressiva(segundos));

    }

}
