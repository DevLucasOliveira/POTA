package Revisão.Exercicio03;

public class InversaoString {


     static public String inverter(String texto){
        if(texto.length()==0)
            return "";
        else
            return inverter(texto.substring(1,texto.length())) + Character.toString(texto.charAt(0));
    }


    public static void main(String[] args) {


        System.out.println(inverter("Lucas"));



    }


}
