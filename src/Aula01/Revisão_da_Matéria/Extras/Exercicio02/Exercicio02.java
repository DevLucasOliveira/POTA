package Aula01.Revisão_da_Matéria.Extras.Exercicio02;

public class Exercicio02 {


    public Exercicio02() {

    }

    public void resultJokenpo(String jogada1, String jogada2){

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
}
