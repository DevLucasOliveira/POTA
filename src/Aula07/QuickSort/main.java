package Aula07.QuickSort;


import java.util.Arrays;
import java.util.Random;

public class main {



    static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

    public static void main(String[] args) {


        int [] vetor = new int [50];

        Random r = new Random();

        for (int i = 0; i < vetor.length; i++){
            vetor[i]=r.nextInt(50);
        }

        System.out.println("Array desordenado");

        System.out.println(Arrays.toString(vetor));

        int [] copia = vetor.clone();

        System.out.println("Quicksort");

        long tempoInicial = System.currentTimeMillis();

        quickSort(vetor,0,vetor.length-1);

        long tempoFinal = System.currentTimeMillis();

        System.out.println(tempoFinal - tempoInicial + " ms");

        System.out.println(Arrays.toString(vetor));

    }



}
