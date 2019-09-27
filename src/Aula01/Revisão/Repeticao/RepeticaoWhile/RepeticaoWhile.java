package Aula01.Revisão.Repeticao.RepeticaoWhile;

public class RepeticaoWhile {

    private int numero;

    public RepeticaoWhile() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String operacaoMultiplicar(int numero) {
        String impressao = " ";

        if (numero <= 100) {
            while (numero <= 100) {
                numero *= 2;
                impressao += numero+ " ";
            }
        } else{
            return "Numero deve ser menor que 100";
        }
        return impressao;
    }


}