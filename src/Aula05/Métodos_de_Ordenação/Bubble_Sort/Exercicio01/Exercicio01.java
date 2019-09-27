package Aula05.Métodos_de_Ordenação.Bubble_Sort.Exercicio01;

public class Exercicio01 {

    int auxiliar;
    boolean controle;

    public Exercicio01() {

    }


    public void bubbleSort(int vetor[]){
        for(int i = 0 ; i < vetor.length; i++){
            controle = true;
            for(int j = 0; j < (vetor.length - 1); j++){
                //Ordenar Crescente       //    Ordenar Descrecente(if(vetor[j] < vetor[j+1])){
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
