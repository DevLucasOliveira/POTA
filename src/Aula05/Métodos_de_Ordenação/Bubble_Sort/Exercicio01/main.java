package Aula05.Métodos_de_Ordenação.Bubble_Sort.Exercicio01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int escolha, tamanhoVetor;


            System.out.print("Qual o tamanho do vetor? ");
            tamanhoVetor = input.nextInt();


            do {
                System.out.println("Deseja definir os números ou gerar numeros aleatorios? " +
                        "\n 1 - Definir números. " +
                        "\n 2 - Gerar numeros aleatórioss. " +
                        "\n 3 - Sair. ");
                escolha = input.nextInt();

                if (escolha == 1) {

                    int vetor[] = new int[tamanhoVetor];

                    for (int contador = 0; contador < vetor.length; contador++) {
                        System.out.print("Digite o "+(contador+1)+"° numero: ");vetor[contador] = input.nextInt();
                    }

                    System.out.println("\nNUMEROS DEFINIDOS");
                    for (int contador = 0; contador < vetor.length; contador++) {
                        System.out.print(vetor[contador] + " ");
                    }

                    System.out.println("\nNUMEROS ORDENADOS");
                    Exercicio01 bubble = new Exercicio01();
                    bubble.bubbleSort(vetor);

                    break;

                } else if (escolha == 2) {

                    int vetor[] = new int[tamanhoVetor];

                    for (int contador = 0; contador < vetor.length; contador++) {
                        vetor[contador] = random.nextInt(100);
                    }

                    System.out.println("\nNUMEROS GERADOS");
                    for (int contador = 0; contador < vetor.length; contador++) {
                        System.out.print(vetor[contador] + " ");
                    }

                    System.out.println("\nNUMEROS ORDENADOS");
                    Exercicio01 bubble = new Exercicio01();
                    bubble.bubbleSort(vetor);

                    break;

                } else if (escolha == 3) {

                    break;

                } else {

                    System.out.println("\nERROR - Tente novamente!");

                }

            } while (escolha != 1 || escolha != 2 || escolha != 3);


        }
    }