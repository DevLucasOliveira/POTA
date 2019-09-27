package Aula04.Métodos_de_Busca.BuscaSequencial.Exercicio01;

public class Iterativa {

    public Iterativa(){

    }

    public static String buscasequencialIterativa50(int vetor[],int numero){
        int contador;
        String resultado = " ";
        for(contador = 0; contador<vetor.length; contador++ ){
            if(numero == vetor[contador]){
                resultado = "Número "+numero+" encontrado na posição "+contador+"º posição";
                break;
            }else{
                resultado = "Número "+numero+" não encontrado";
            }
        }
        return resultado;
    }

    public static String buscasequencialIterativa25(int vetor[],int numero){
        int contador;
        String resultado = " ";
        for(contador = 0; contador<vetor.length; contador++ ){
            if(numero == vetor[contador]){
                resultado = "Número "+numero+" encontrado na "+contador+"º posição";
                break;
            }else{
                resultado = "Número "+numero+" não encontrado";
            }
        }
        return resultado;
    }

    public static String buscasequencialIterativa10(int vetor[],int numero){
        int contador;
        String resultado = " ";
        for(contador = 0; contador<vetor.length; contador++ ){
            if(numero == vetor[contador]){
                resultado = "Número "+numero+" encontrado na "+contador+"º posição";
                break;
            }else{
                resultado = "Número "+numero+" não encontrado";
            }
        }
        return resultado;
    }

}
