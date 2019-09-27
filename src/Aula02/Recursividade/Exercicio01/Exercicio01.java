package Aula02.Recursividade.Exercicio01;

public class Exercicio01 {

    public static int somadetodososNumeros(int numero){
        int resultado=0;
        for(int contador=1;contador<=numero;contador++) {
            resultado += contador;
        }
        return resultado;
    }


    public static int somaRecursiva(int numero){
        if(numero == 1)
            return 1;
        else
            return (numero+ somaRecursiva(numero-1));
    }

}
