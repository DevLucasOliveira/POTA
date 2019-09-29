package Aula05.Métodos_de_Ordenação.Bubble_Sort.Exercicio01;

import java.util.Random;
import java.util.Scanner;

public class Ordenar {

    public Ordenar() {

    }
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    int escolha;
    Crescente bubblecrescente = new Crescente();
    Decrescente bubbledecrescente = new Decrescente();


    public void ordenar(int ordenar, int tamanhoVetor) {

        if (ordenar == 1) {
            do {
                System.out.println("Deseja definir os números ou gerar numeros aleatorios? " +
                        "\n 1 - Definir números. " +
                        "\n 2 - Gerar numeros aleatórioss. " +
                        "\n 3 - Sair. ");
                escolha = input.nextInt();
                int vetor[] = new int[tamanhoVetor];

                if (escolha == 1) {
                    for (int contador = 0; contador < vetor.length; contador++) {
                        System.out.print("Digite o " + (contador + 1) + "° numero: ");
                        vetor[contador] = input.nextInt();
                    }
                    System.out.println("\nNUMEROS DEFINIDOS");
                    for (int contador = 0; contador < vetor.length; contador++) {
                        System.out.print(vetor[contador] + " ");
                    }
                    System.out.println("\nNUMEROS ORDENADOS");
                    bubblecrescente.bubbleSortCrescente(vetor);

                    break;
                } else if (escolha == 2) {
                    for (int contador = 0; contador < vetor.length; contador++) {
                        vetor[contador] = random.nextInt(100);
                    }
                    System.out.println("\nNUMEROS GERADOS");
                    for (int contador = 0; contador < vetor.length; contador++) {
                        System.out.print(vetor[contador] + " ");
                    }
                    System.out.println("\nNUMEROS ORDENADOS");
                    bubblecrescente.bubbleSortCrescente(vetor);

                    break;
                } else if (escolha == 3) {
                    break;
                } else {
                    System.out.println("\nERROR - Tente novamente!");
                    break;
                }

            } while (escolha != 1 || escolha != 2 || escolha != 3);

        }else if(ordenar == 2) {
            do {
                System.out.println("Deseja definir os números ou gerar numeros aleatorios? " +
                        "\n 1 - Definir números. " +
                        "\n 2 - Gerar numeros aleatórioss. " +
                        "\n 3 - Sair. ");
                escolha = input.nextInt();
                int vetor[] = new int[tamanhoVetor];
                if (escolha == 1) {
                    for (int contador = 0; contador < vetor.length; contador++) {
                        System.out.print("Digite o " + (contador + 1) + "° numero: ");
                        vetor[contador] = input.nextInt();
                    }
                    System.out.println("\nNUMEROS DEFINIDOS");
                    for (int contador = 0; contador < vetor.length; contador++) {
                        System.out.print(vetor[contador] + " ");
                    }
                    System.out.println("\nNUMEROS ORDENADOS");
                    bubbledecrescente.bubbleSortDecrescente(vetor);

                    break;

                } else if (escolha == 2) {
                    for (int contador = 0; contador < vetor.length; contador++) {
                        vetor[contador] = random.nextInt(100);
                    }
                    System.out.println("\nNUMEROS GERADOS");
                    for (int contador = 0; contador < vetor.length; contador++) {
                        System.out.print(vetor[contador] + " ");
                    }
                    System.out.println("\nNUMEROS ORDENADOS");
                    bubbledecrescente.bubbleSortDecrescente(vetor);

                    break;

                } else if (escolha == 3) {
                    break;

                } else {
                    System.out.println("\nERROR - Tente novamente!");
                    break;
                }

            } while (escolha != 1 || escolha != 2 || escolha != 3);

        }
    }
}
