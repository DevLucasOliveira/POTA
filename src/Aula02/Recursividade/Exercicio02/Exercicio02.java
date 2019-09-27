package Aula02.Recursividade.Exercicio02;

public class Exercicio02 {

    public Exercicio02(){

    }

    public static String contagemRegressiva(int numero){
        if(numero<1){
            return "\n FELIZ ANO NOVO!";
        }else
            return " ... "+numero+ (contagemRegressiva(numero-1));
    }
}
