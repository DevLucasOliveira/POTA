package Aula01.Revisão_da_Matéria.Revisão.Repeticao.RepeticaoWhile;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        RepeticaoWhile repeticao = new RepeticaoWhile();
        System.out.print("Digite um número: ");
        repeticao.setNumero(input.nextInt());
        System.out.println(repeticao.operacaoMultiplicar(repeticao.getNumero()));

    }
}
