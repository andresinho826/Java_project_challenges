package vectores;

import java.util.Scanner;

//Se debe crear un vector donde almacenar 5 sueldos. Ordenar el vector sueldos de menor a mayor.
public class OrdenarSueldodeMenorAMayor {

    private static Scanner teclado;
    private  static int[] sueldos;

    public static void cargar() {
        teclado=new Scanner(System.in);
        sueldos=new int[5];
        for(int f=0;f<sueldos.length;f++) {
            System.out.print("Ingrese el sueldo:");
            sueldos[f]=teclado.nextInt();
        }
    }

    public static void ordenar() {
        for(int k=0;k<4;k++) {
            for(int f=0;f<4-k;f++) {
                if (sueldos[f]>sueldos[f+1]) {
                    int aux;
                    aux=sueldos[f];
                    sueldos[f]=sueldos[f+1];
                    sueldos[f+1]=aux;
                }
            }
        }
    }

    public static void imprimir() {
        System.out.println("Sueldos ordenados de menor a mayor.");
        for(int f=0;f<sueldos.length;f++) {
            System.out.println(sueldos[f]);
        }
    }

    public static void main(String[] ar) {

        cargar();
        ordenar();
        imprimir();
    }
}
