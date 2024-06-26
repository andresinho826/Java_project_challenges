package codigo_practice;

public class FizzBuzz {

    /*
     * Escribe un programa que muestre por consola (con un print) los
     * números de 1 a 100 (ambos incluidos y con un salto de línea entre
     * cada impresión), sustituyendo los siguientes:
     * - Múltiplos de 3 por la palabra "fizz".
     * - Múltiplos de 5 por la palabra "buzz".
     * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
     */

    public void evaluate(int n){


        for (int i = 1; i <= n; i++){
            Boolean fizThre = (i % 3) == 0;
            Boolean buzFive = (i % 5) == 0;

            if (fizThre && buzFive){
                System.out.println("fizzbuzz");
            } else if (fizThre) {
                System.out.println("fizz");

            } else if (buzFive) {
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.evaluate(15);

    }
}
