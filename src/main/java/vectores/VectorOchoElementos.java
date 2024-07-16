package vectores;

import java.util.Random;
import java.util.Scanner;

/*
Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
El valor acumulado de todos los elementos del vector.
El valor acumulado de los elementos del vector que sean mayores a 36.
Cantidad de valores mayores a 50.
 */
public class VectorOchoElementos {

    private Scanner teclado;
    private int[] vector;
    private int mayorTreintaSeis = 0;
    private int mayorCincuenta = 0;
    Random random = new Random();
    int suma = 0;

    public static void main(String[] args) {
        VectorOchoElementos voe = new VectorOchoElementos();
        voe.calcularElementos();

    }

    public VectorOchoElementos() {
        teclado = new Scanner(System.in);
        vector = new int[8];

    }

    public void calcularElementos() {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100) + 1;
            System.out.println(i + " - " + vector[i] + " __ ");
            suma = suma + vector[i];

            if (vector[i] > 36) {
                mayorTreintaSeis = mayorTreintaSeis + vector[i];
            }

            if (vector[i] > 50) {
                mayorCincuenta++;
            }

        }

        System.out.println("Valor acumulado de todos los elementos es: " + suma);
        System.out.println("valores acumulados mayores a 36: " + mayorTreintaSeis);
        System.out.println("valores mayores a 50: " + mayorCincuenta);

    }
}
