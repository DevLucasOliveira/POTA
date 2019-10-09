package Aula07.CountSort;

import java.util.Arrays;
import java.util.Random;

public class main {

        static void countSort(int a[]) {

            int max = a[0];
            for (int i = 1; i < a.length; i++) {

                if (a[i] > max) {
                    max = a[i];
                }


            }
            System.out.println(max);

            int[] temp = new int[max + 1];

            for (int i = 0; i < a.length; i++) {
                temp[a[i]] = temp[a[i]] + 1;
            }
            int indice = 0;

            for (int i = 0; i < temp.length; i++) {
                while (temp[i] > 0) {
                    a[indice] = i;
                    indice++;
                    temp[i]--;
                }
            }

        }



        public static void main(String[] args) {
            int[] vetor = new int[50];

            Random r = new Random();

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = r.nextInt(50);
            }

            System.out.println("Array desordenado");

            System.out.println(Arrays.toString(vetor));

            int[] copia = vetor.clone();

            System.out.println("-------------------------------------");

            System.out.println("Countsort");

            long tempoInicial = System.currentTimeMillis();
            vetor = copia.clone();

            countSort(vetor);
            long tempoFinal = System.currentTimeMillis();

            System.out.println(Arrays.toString(vetor));

            System.out.println(tempoFinal - tempoInicial + " ms");

            System.out.println("-------------------------------------");


        }

    }