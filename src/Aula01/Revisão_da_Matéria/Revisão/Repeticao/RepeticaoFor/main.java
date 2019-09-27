package Aula01.Revisão_da_Matéria.Revisão.Repeticao.RepeticaoFor;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        RepeticaoFOR repeticaoFOR = new RepeticaoFOR();
        System.out.print("Digite um numero: ");
        repeticaoFOR.setNumero(input.nextInt());
        System.out.println("A somatória entre 1 e "+repeticaoFOR.getNumero()+" é " +
                ""+repeticaoFOR.somatorioentreNumeros(repeticaoFOR.getNumero()));

    }
}
