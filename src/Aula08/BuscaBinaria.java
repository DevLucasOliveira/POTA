package Aula08;

public class BuscaBinaria {

    static int i;
    static int vet[] = {1,2,3,4,5,6,7,8,9,10};
    static int esquerda = vet[0];
    static int direita = vet[vet.length-1];

     static int buscabinariaRecursiva(int x, int esquerda, int direita) {

        while(esquerda<=direita){
            i = (esquerda+direita)/2;
                if(x == vet[i]){
                    return i;
                }
                if(x < vet[i]){
                    return buscabinariaRecursiva(x, esquerda, i-1);
                }
                if(x > vet[i]){
                    return buscabinariaRecursiva(x,i+1, direita);
                }
        }
        return -1;
    }


    public static void main(String[] args) {



        System.out.println(buscabinariaRecursiva(9, esquerda,direita));


    }

}
