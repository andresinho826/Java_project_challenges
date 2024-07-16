package vectores;

import java.util.Random;
import java.util.Scanner;

/*
Realizar un programa que pida la carga de dos vectores numéricos enteros de 4 elementos.
Obtener la suma de los dos vectores, dicho resultado guardarlo en un tercer vector
del mismo tamaño. Sumar componente a componente.
 */
public class TresVectores {
    private final int[] vectorUno;
    private final int[] vectorDos;
    private final int[] vectorTres;
    Random random = new Random();
    int suma = 0;

    public TresVectores() {
        Scanner teclado = new Scanner(System.in);
        vectorUno = new int[4];
        vectorDos = new int[4];
        vectorTres = new int[4];

    }

    public void sumarVectores() {
        for (int i = 0; i < vectorUno.length; i++) {
            vectorUno[i] = random.nextInt(10) + 1;
            System.out.println("  " + vectorUno[i]);
            vectorDos[i] = random.nextInt(10) + 1;
            System.out.println("  " + vectorDos[i]);

            suma = vectorUno[i] + vectorDos[i];
            vectorTres[i] = suma;
            System.out.print(" " + vectorTres[i]);


        }
    }

    public static void main(String[] args) {
        TresVectores tv = new TresVectores();
        tv.sumarVectores();
    }
}
