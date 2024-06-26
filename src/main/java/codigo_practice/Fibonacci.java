package codigo_practice;

public class Fibonacci {
    /*
     * Escribe un programa que imprima los 50 primeros números de la sucesión
     * de Fibonacci empezando en 0.
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     */

    public void fibonaciInAtcion(int n) {
        long n0 = 0;
        long n1 = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(n0);

            long fib = n0 + n1;
            n0 = n1;
            n1 = fib;
        }
    }


    public static void main(String[] args) {
        Fibonacci fcc = new Fibonacci();
        fcc.fibonaciInAtcion(12);
    }

}