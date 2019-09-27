package Aula01.Revisão_da_Matéria.Revisão.Encapsulamento;

public class Funcionarios {

    private String nome, cargo;
    private int numero_de_registro, idade;


    public Funcionarios(String nome, String cargo, int numero_de_registro, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.numero_de_registro = numero_de_registro;
        this.idade = idade;
    }

    public Funcionarios(){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumero_de_registro() {
        return numero_de_registro;
    }

    public void setNumero_de_registro(int numero_de_registro) {
        this.numero_de_registro = numero_de_registro;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println("\nFuncionario: "+this.getNome()+
                "\nNumero de registro: "+this.getNumero_de_registro()+
                "\nCargo: "+this.getCargo()+
                "\nIdade: "+this.getIdade());

    }
}
