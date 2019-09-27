package Aula04.Métodos_de_Busca.BuscaSequencial.Exercicio01;

import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        Random random2 = new Random();
        Random random3 = new Random();
        Random random4 = new Random();
        Random random5 = new Random();
        Random random6 = new Random();

        Iterativa iterativa = new Iterativa();

        int vetor[] = new int[50];
        for(int contador = 0; contador<vetor.length; contador++) {
            vetor[contador] = random.nextInt( 50)+1;
        }

        int vetor2[] = new int[25];
        for(int contador = 0; contador<vetor2.length; contador++) {
            vetor2[contador] = random2.nextInt( 25)+1;
        }

        int vetor3[] = new int[10];
        for(int contador = 0; contador<vetor3.length; contador++) {
            vetor3[contador] = random3.nextInt( 10)+1;
        }

        //System.out.print("Digite um numero: " );
        //int numero = input.nextInt();
        //System.out.println(iterativa.buscasequencialIterativa10(vetor3, numero));

        Recursiva recursiva = new Recursiva();

        int vetor4[] = new int[50];
        for(int contador = 0; contador<vetor.length; contador++) {
            vetor4[contador] = random4.nextInt( 50)+1;
        }

        int vetor5[] = new int[25];
        for(int contador = 0; contador<vetor2.length; contador++) {
            vetor5[contador] = random5.nextInt( 25)+1;
        }

        int vetor6[] = new int[10];
        for(int contador = 0; contador<vetor3.length; contador++) {
            vetor6[contador] = random6.nextInt( 10)+1;
        }

        System.out.print("Digite um número: ");
        int numero2 = input.nextInt();
        System.out.println(recursiva.buscasequencialRecursiva50(vetor6,numero2));


    }


}
