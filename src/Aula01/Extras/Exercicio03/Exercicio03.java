package Aula01.Extras.Exercicio03;

public class Exercicio03 {

    public Exercicio03(){

    }


    public String problemadeCollatz(int numero){
        String retorno = "";
        int resultado = numero;
        retorno = resultado+" ";
        for (int contador=numero;contador>=1;contador=resultado){
            if (resultado == 1){
                break;
            }
            if (resultado % 2 == 0) {
                resultado = resultado / 2;
                retorno += resultado+" ";
            }else{
                resultado = ((3 * resultado) + 1);
                retorno += resultado+" ";
            }
        }
        return "-----------------------------------"+
                "\n"+retorno+
                "\n-----------------------------------";
    }


}
