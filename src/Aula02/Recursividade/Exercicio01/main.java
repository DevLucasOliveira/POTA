package Aula02.Recursividade.Exercicio01;


import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Exercicio01 soma = new Exercicio01();
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();
        //System.out.println(soma.somadetodososNumeros(numero));

        System.out.println(soma.somaRecursiva(numero));

    }
}
