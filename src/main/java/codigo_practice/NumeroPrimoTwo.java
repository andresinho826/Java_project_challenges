package codigo_practice;

public class NumeroPrimoTwo {
    // Método para comprobar si un número es primo
    public static boolean esPrimo(int numero) {
        // Si el número es menor o igual a 1, no es primo
        if (numero <= 1) {
            return false;
        }
        // Comprobar si el número es divisible por algún número desde 2 hasta la raíz cuadrada de 'numero'
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible, no es primo
            }
        }
        return true; // Si no es divisible por ninguno, es primo
    }

    public static void main(String[] args) {
        // Imprimir los números primos entre 1 y 100
        System.out.println("Números primos entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
