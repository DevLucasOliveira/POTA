package Aula04.Métodos_de_Busca.BuscaSequencial.Exercicio01;

public class Recursiva {

    public Recursiva(){

    }


    public static String buscasequencialRecursiva50(int vetor[],int numero){
        int contador = 0;
        String resultado = " ";
        while (vetor[contador] != numero){
            contador += 1;
        }if(contador == numero) {
            return resultado = "Numero ENCONTRADO";
        }else {
            return resultado = "Numero NÃO encontrado";
        }
    }



}
