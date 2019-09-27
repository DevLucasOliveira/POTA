package Aula01.Revisão_da_Matéria.Revisão.Vetor.VetorTemperatura;

public class VetorTemperatura {


    public VetorTemperatura() {

    }


    public String diasacimadaMedia(double vetor[]){
        double temperatura = 23.4;
        int contador, acumulador=0;
        for(contador = 0; contador<vetor.length; contador++){
            if(vetor[contador]>temperatura){
                acumulador++;
            }
        }
        return "A temperatura ficou "+acumulador+" dias acima da média";
    }
}
