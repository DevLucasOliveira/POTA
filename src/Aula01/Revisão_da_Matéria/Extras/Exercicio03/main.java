package Aula01.Revisão_da_Matéria.Extras.Exercicio03;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        Exercicio03 collatz = new Exercicio03();
        System.out.print("Digite um número positivo: ");
        numero = input.nextInt();
        System.out.println(collatz.problemadeCollatz(numero));

    }
}
