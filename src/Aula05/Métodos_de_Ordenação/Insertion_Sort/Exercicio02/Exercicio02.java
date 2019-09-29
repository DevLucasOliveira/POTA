package Aula05.Métodos_de_Ordenação.Insertion_Sort.Exercicio02;

public class Exercicio02 {


    public Exercicio02() {
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


}
