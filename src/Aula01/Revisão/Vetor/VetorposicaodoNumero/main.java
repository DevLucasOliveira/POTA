package Aula01.Revisão.Vetor.VetorposicaodoNumero;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VetorPosiçaodoNumero vetor = new VetorPosiçaodoNumero();
        int Vetor[] = new int[10];
        int contador;
        for(contador = 0; contador < Vetor.length; contador++){
            System.out.print("Digite o "+(contador+1)+" número: ");
            Vetor[contador] = input.nextInt();
        }
        System.out.print("---------------------------\nDigite um número: ");
        vetor.setX(input.nextInt());
        System.out.println(vetor.numeroEncontrado(Vetor,vetor.getX()));
    }
}
