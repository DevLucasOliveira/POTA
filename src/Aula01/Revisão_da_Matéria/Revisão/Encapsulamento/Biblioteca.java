package Aula01.Revisão_da_Matéria.Revisão.Encapsulamento;


import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Aluno aluno = new Aluno("Lucas","Sistemas",21094755);
        Funcionarios funcionarios = new Funcionarios("Danilo","Progamador",
                243671,19);
        Livros livros = new Livros("Proposito","Jonh","A coragem de ser quem somos",
                2010,5,true);

        aluno.imprimir();
        funcionarios.imprimir();
        livros.imprimir();

        System.out.print("\nDigite o novo curso de "+aluno.getNome()+": ");
        aluno.setCurso(input.nextLine());
        System.out.print("\nDigite o novo cargo de "+funcionarios.getNome()+": ");
        funcionarios.setCargo(input.nextLine());
        System.out.print("\nDigite o novo status de locação do livro: ");
        livros.setStatus_de_locacao(input.nextBoolean());
        System.out.print("\nDigite o novo ano do livro: ");
        livros.setAno(input.nextInt());

        aluno.imprimir();
        funcionarios.imprimir();
        livros.imprimir();

    }
}
