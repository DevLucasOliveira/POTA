package Revisão.Exercicio01;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, anonascimento, anoatual = 2019;

        System.out.print("Ano de nascimento: ");
        anonascimento = input.nextInt();
        idade = anoatual - anonascimento;
        System.out.println("Sua idade é: "+idade);
            if(idade>=16)
                System.out.println("Você pode Votar");
            if(idade>=18)
                System.out.println("Você pode tirar a CNH");



    }

}
