package Aula01.Revisão_da_Matéria.Revisão.Vetor.VetorImpressao;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VetorImpressão vetor = new VetorImpressão();
        int Vetor[] = new int[10];
        int contador;
        for(contador = 0; contador < Vetor.length; contador++){
            System.out.print("Digite o "+(contador+1)+" número: ");
            Vetor[contador] = input.nextInt();
        }
        vetor.dezprimeirosnumerosImpares(Vetor);
    }
}
