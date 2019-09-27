package Aula01.Revisão.Condicional;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);


        Condicional condicional = new Condicional();
        System.out.print("Digite seu nome: ");
        condicional.setName1(input.nextLine());
        System.out.print("Digite seu idade: ");
        condicional.setAge1(input.nextInt());
        System.out.print("\nDigite seu nome: ");
        condicional.setName2(input2.nextLine());
        System.out.print("Digite seu idade: ");
        condicional.setAge2(input2.nextInt());
        System.out.println(condicional.pessoamaisVelha(condicional.getAge1(),condicional.getAge2()));
    }
}
