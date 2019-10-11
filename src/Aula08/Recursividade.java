package Aula08;


public class Recursividade {


    static int funcSoma(int vet[], int n){
        if (n == 1)
            return vet[0];
        else
            return vet[n - 1] + funcSoma(vet,n-1);
    }

    static int funcMultp(int vet[], int n){
        if(n == 1){
            return vet[0];
        }else{
            return vet[n-1] * funcMultp(vet, n-1);
        }
    }

    public static void main(String[] args) {


        int vet[] = {2,1,2,10};
        int n = vet.length;
        System.out.println(funcSoma(vet,n));

        System.out.println(funcMultp(vet,n));

    }


}
