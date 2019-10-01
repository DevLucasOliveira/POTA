package Aula06.Heap_Sort;

import java.util.Arrays;
import java.util.Random;

public class main {

    public static void main(String[] args) {


        System.out.println("Numeros Gerados:");
        int[] aleatorio = new int[20];
        Random r = new Random();

        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = r.nextInt(100);
        }

        System.out.println(Arrays.toString(aleatorio));
        Exercicio01 heapsort = new Exercicio01();
        System.out.println("Numeros Ordenados: ");
        heapsort.heapSort(aleatorio);
        System.out.println(Arrays.toString(aleatorio));


    }

}
