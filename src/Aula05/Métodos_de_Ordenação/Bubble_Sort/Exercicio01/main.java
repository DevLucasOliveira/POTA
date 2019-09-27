package Aula05.Métodos_de_Ordenação.Bubble_Sort.Exercicio01;

import java.util.Arrays;
import java.util.Random;

public class main{

    public static void main(String[] args) {
        Random random = new Random();


        int vetor[] = new int[6];
        for(int contador = 0; contador < vetor.length; contador++){
            vetor [contador] = random.nextInt(100);
        }
        System.out.println("NUMEROS GERADOS");
        for (int contador = 0 ; contador < vetor.length; contador++){
            System.out.print(vetor[contador]+ " ");
        }
        System.out.println("\nNUMEROS ORDENADOS");
        Exercicio01 bubble = new Exercicio01();

        bubble.bubbleSort(vetor);

    }

}
