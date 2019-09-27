package Aula01.Revisão.Vetor.VetorTemperatura;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VetorTemperatura vetor = new VetorTemperatura();
        double Vetor[] = new double[7];
        int contador;
        char resposta = 0;

         do{
            for (contador = 0; contador < Vetor.length; contador++) {
                String dias = "";
                switch (contador) {
                    case 0:
                        dias = "Segunda-Feira";
                        break;
                    case 1:
                        dias = "Terça-Feira";
                        break;
                    case 2:
                        dias = "Quarta-Feira";
                        break;
                    case 3:
                        dias = "Quinta-Feira";
                        break;
                    case 4:
                        dias = "Sexta-Feira";
                        break;
                    case 5:
                        dias = "Sábado";
                        break;
                    case 6:
                        dias = "Domingo";
                        break;
                    default:
                        break;
                }
                System.out.print("\n Qual a Temperatura de " + dias + ": ");
                Vetor[contador] = input.nextDouble();
            }
            System.out.println(vetor.diasacimadaMedia(Vetor));

              System.out.print("Deseja fazer novamente? ");
              resposta = input.next().charAt(0);
        }while(resposta == 'S');


    }
}
