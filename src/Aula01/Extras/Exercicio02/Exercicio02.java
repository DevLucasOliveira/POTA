package Aula01.Extras.Exercicio02;

public class Exercicio02 {

    private String pedra,papel,tesoura;

    public Exercicio02() {

    }

    public void resultJokenpo(String jogada1, String jogada2){

        if ((jogada1 == pedra) && (jogada2 == pedra)){
            System.out.println("EMPATE");
        }if((jogada1 == tesoura) && (jogada2 == pedra)){
            System.out.println("Jogador2 VENCEU");
        }if((jogada1 == pedra) && (jogada2 == tesoura)){
            System.out.println("Jogador1 VENCEU");
        }if((jogada1 == tesoura) && (jogada2 == tesoura)){
            System.out.println("EMPATE");
        }if((jogada1 == papel) && (jogada2 == tesoura)){
            System.out.println("Jogador2 VENCEU");
        }if((jogada1 == tesoura) && (jogada2 == papel)){
            System.out.println("Jogador1 VENCEU");
        }if((jogada1 == papel) && (jogada2 == papel)){
            System.out.println("EMPATOU");
        }if((jogada1 == pedra) && (jogada2 == papel)){
            System.out.println("Jogador2 VENCEU");
        }if((jogada1 == papel) && (jogada2 == pedra)){
            System.out.println("Jogador1 VENCEU");
        }
    }
}
