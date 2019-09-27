package Aula01.Revisão_da_Matéria.Revisão.Repeticao.RepeticaoFor;

public class RepeticaoFOR {

    private int numero;

    public RepeticaoFOR(){

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int somatorioentreNumeros(int numero){
        int contador, soma=0;
        for(contador=1;contador<=numero;contador++){
            soma = soma + contador;
        }
        return soma;
    }

}
