package Aula01.Extras.Exercicio01;

public class Exercicio01 {

    public Exercicio01() {

    }

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


    }
