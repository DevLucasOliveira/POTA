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


    public static void main(String[] args) {

        System.out.println("Numeros Gerados");
        int []vetor = geradorNumeros(20);
        Exercicio02 insertSort = new Exercicio02();
        System.out.print("\nNumeros em Ordem \n");
        insertSort.insertSort(vetor);




    }


}
