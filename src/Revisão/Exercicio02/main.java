package Revisão.Exercicio02;

public class main {


    static int func1(int n){
        if(n == 0)
            return 1;
        if(n == 1)
            return 1;
        return func1(n-1) + 2 * func1(n-2);
    }

    static void func2(int n){
        if(n == 0){
            System.out.println("Fim");
        }else{
            System.out.print(n);
            func2(n-1);
            System.out.print(n);
        }
    }

    static void func3(int n){
        if(n == 0){
            System.out.println("Acabou");
        }else{
            func3(n-1);
            System.out.println(n);
            func3(n-1);
        }
    }


    public static void main(String[] args) {


        System.out.println("---------- (i) ------------");
        System.out.println(func1(0));
        System.out.println(func1(1));
        System.out.println(func1(5));


        System.out.println("\n---------- (ii) ------------");
        func2(0);
        func2(4);
        func2(6);

        System.out.println("\n---------- (iii) ------------");
        func3(0);
        func3(4);
        func3(6);

    }
}
