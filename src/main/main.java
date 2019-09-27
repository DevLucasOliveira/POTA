package main;

import Aula01.Condicional;
import Aula01.Repeticao;
import Aula01.RepeticaoFOR;
import Aula01.Vetor;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        //AULA01

        /**
         //CONDICIONAL
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
         */

        /**
         //REPETICAO
         Repeticao repeticao = new Repeticao();
         System.out.print("Digite um número: ");
         repeticao.setNumero(input.nextInt());
         System.out.println(repeticao.operacaoMultiplicar(repeticao.getNumero()));
         */

        /**
         //REPETICAO(FOR)
         RepeticaoFOR repeticaoFOR = new RepeticaoFOR();
         System.out.print("Digite um numero: ");
         repeticaoFOR.setNumero(input.nextInt());
         System.out.println("A somatória entre 1 e "+repeticaoFOR.getNumero()+" é " +
         ""+repeticaoFOR.somatorioentreNumeros(repeticaoFOR.getNumero()));
         */

        /**
        //VETOR
        Vetor vetor = new Vetor();
        int Vetor[] = new int[10];
        int contador;
        for(contador = 0; contador < Vetor.length; contador++){
            System.out.print("Digite o "+(contador+1)+" número: ");
            Vetor[contador] = input.nextInt();
        }
        vetor.dezprimeirosnumerosImpares(Vetor);
        */




    }
}