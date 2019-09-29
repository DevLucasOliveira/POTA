package Aula05.Métodos_de_Ordenação.Bubble_Sort.Exercicio01;

import java.util.Random;
import java.util.Scanner;

public class main{


    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int tamanhoVetor, escolha_de_ordenacao ;

            System.out.print("Qual o tamanho do vetor? ");
            tamanhoVetor = input.nextInt();

                do{
                System.out.println("Deseja organizar em Ordem: " +
                        "\n 1 - Crescente: " +
                        "\n 2 - Decrescente: ");
                escolha_de_ordenacao = input2.nextInt();
                if((escolha_de_ordenacao != 1)  && (escolha_de_ordenacao != 2)) {
                    System.out.println("-ERROR-\n");
                    }
                } while ((escolha_de_ordenacao != 1) && (escolha_de_ordenacao != 2));

                Ordenar ordenar = new Ordenar();
                ordenar.ordenar(escolha_de_ordenacao, tamanhoVetor);


        }
    }