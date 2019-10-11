package Aula01.Revisão_da_Matéria.Extras.Exercicio02;

import java.util.Scanner;

public class main {

    public static void resultJokenpo(String jogada1, String jogada2){

        if ((jogada1.equals("pedra")) && (jogada2.equals("pedra"))){
            System.out.println("EMPATE");
        }else if((jogada1.equals("tesoura")) && (jogada2.equals("pedra"))){
            System.out.println("Jogador2 VENCEU");
        }else if((jogada1.equals("pedra")) && (jogada2.equals("tesoura"))){
            System.out.println("Jogador1 VENCEU");
        }else if((jogada1.equals("tesoura")) && (jogada2.equals("tesoura"))){
            System.out.println("EMPATE");
        }else if((jogada1.equals("papel")) && (jogada2.equals("tesoura"))){
            System.out.println("Jogador2 VENCEU");
        }else if((jogada1.equals("tesoura")) && (jogada2.equals("papel"))){
            System.out.println("Jogador1 VENCEU");
        }else if((jogada1.equals("papel")) && (jogada2.equals("papel"))){
            System.out.println("EMPATOU");
        }else if((jogada1.equals("pedra")) && (jogada2.equals("papel"))){
            System.out.println("Jogador2 VENCEU");
        }else if((jogada1.equals("papel")) && (jogada2.equals("pedra"))){
            System.out.println("Jogador1 VENCEU");
        }else{
            System.out.println("Jogada Errada!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        String jogador1, jogador2;


        System.out.print("------------------------------------------"+
                            "\n          JOKENPO            " +
                        "\n------------------------------------------" +
                "\n(Jogador 1) Sua jogada: ");
                jogador1 = input.nextLine();
        System.out.print("(Jogador 2) Sua jogada: ");
                jogador2 = input2.nextLine();

        System.out.println("------------------------------------------"
                +"\nRESULTADO: "); resultJokenpo(jogador1,jogador2);



    }

}
