package Aula01.Revisão_da_Matéria.Extras.Exercicio03;

import java.util.Scanner;

public class main {

    public static String problemadeCollatz(int numero){
        String retorno = "";
        int resultado = numero;
        retorno = resultado+" ";
        for (int contador=numero;contador>=1;contador=resultado){
            if (resultado == 1){
                break;
            }
            if (resultado % 2 == 0) {
                resultado = resultado / 2;
                retorno += resultado+" ";
            }else{
                resultado = ((3 * resultado) + 1);
                retorno += resultado+" ";
            }
        }
        return "-----------------------------------"+
                "\n"+retorno+
                "\n-----------------------------------";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número positivo: ");
        numero = input.nextInt();
        System.out.println(problemadeCollatz(numero));

    }
}
