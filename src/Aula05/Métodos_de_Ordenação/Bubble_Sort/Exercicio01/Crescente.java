package Aula05.Métodos_de_Ordenação.Bubble_Sort.Exercicio01;

public class Crescente {

    int auxiliar;
    boolean controle;

    public Crescente() {

    }


    public void bubbleSortCrescente(int vetor[]){
        for(int i = 0 ; i < vetor.length; i++){
            controle = true;
            for(int j = 0; j < (vetor.length - 1); j++){
                if(vetor[j] > vetor[j+1]){
                    trocarElementos(vetor, j, i);
                    controle = false;
                }
            }
            if(controle){
                break;
            }
        }
        for(int i = 0; i<vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }
    }


    private static void trocarElementos(int[] vetor, int j, int i) {
        int auxiliar = vetor[j];
        vetor[j] = vetor[j+1];
        vetor[j+1] = auxiliar;
    }


}
