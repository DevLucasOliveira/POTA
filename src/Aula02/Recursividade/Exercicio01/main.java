package Aula02.Recursividade.Exercicio01;


import java.util.Scanner;

public class main {

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


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Digite um numero: ");
        int numero = input.nextInt();
        //System.out.println(soma.somadetodososNumeros(numero));

        System.out.println(somaRecursiva(numero));

    }
}
