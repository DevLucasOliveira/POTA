package Aula05.Métodos_de_Ordenação.Insertion_Sort.Exercicio02;

import java.util.Random;

public class main {


    public static int[] geradorNumeros(int n){
        int vetor [] = new int [n];
        Random random = new Random();
        for(int contador = 0; contador<vetor.length; contador++ ){
            vetor[contador] = random.nextInt(100);
        }
        for(int contador = 0; contador<vetor.length; contador++){
            System.out.print(vetor[contador]+" ");
        }
        return vetor;
    }


    public static void insertSort(int vetor[]) {
        int j = 0, aux = 0;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;

            while ((j >= 0) && (vetor[j] > aux)) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = aux;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");

        }
    }

    public static void main(String[] args) {

        System.out.println("Numeros Gerados");
        int []vetor = geradorNumeros(20);
        System.out.print("\nNumeros em Ordem \n");
        insertSort(vetor);




    }


}
