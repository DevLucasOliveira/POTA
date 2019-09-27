package Aula01.Extras.Exercicio02;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        String jogador1, jogador2;

        Exercicio02 jogo = new Exercicio02();
        System.out.print("------------------------------------------"+
                            "\n          JOKENPO            " +
                        "\n------------------------------------------" +
                "\n(Jogador 1) Sua jogada: ");
                jogador1 = input.nextLine();
        System.out.print("(Jogador 2) Sua jogada: ");
                jogador2 = input2.nextLine();

        System.out.println("------------------------------------------"
                +"\nRESULTADO: "); jogo.resultJokenpo(jogador1,jogador2);



    }

}
