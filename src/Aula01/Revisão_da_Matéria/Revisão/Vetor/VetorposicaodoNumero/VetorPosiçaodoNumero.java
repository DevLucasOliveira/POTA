package Aula01.Revisão_da_Matéria.Revisão.Vetor.VetorposicaodoNumero;

public class VetorPosiçaodoNumero {

    private int x;

    public VetorPosiçaodoNumero(){

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public String numeroEncontrado(int vetor[], int x){
        for(int contador = 0; contador < vetor.length; contador++){
            if(x == vetor[contador])
                return "Número encontrado na posição: "+(contador+1);
        }
        return "Número não encontrado";
    }

}
