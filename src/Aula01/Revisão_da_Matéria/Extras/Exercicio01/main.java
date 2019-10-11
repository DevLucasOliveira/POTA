package Aula01.Revisão_da_Matéria.Extras.Exercicio01;

public class main {


    public static String listaExceções () {
        int contador;
        String print = "";
        for (contador = 1; contador <= 100; contador++) {
            if (contador % 3 == 0) {
                print += "Fizz\n";
            } else if (contador % 5 == 0) {
                print += "Buzz\n";
            } else if (((contador % 3) & (contador % 5)) == 0) {
                print += "FizzBuzz\n";
            }else{
                print+=contador+"\n";
            }
        }
        return print;
    }


    public static void main(String[] args) {

        System.out.println(listaExceções());


    }
}
