package vectores;

import java.util.Scanner;

public class OrdenarPaisesOrdenAlfabetico {
    private static Scanner teclado;
    private static String[] paises;

    public static void cargar() {
        teclado=new Scanner(System.in);
        paises=new String[5];
        for(int f=0;f<paises.length;f++) {
            System.out.print("Ingrese el nombre del pais:");
            paises[f]=teclado.next();
        }
    }

    public static void ordenar() {
        for(int k=0;k<4;k++) {
            for(int f=0;f<4-k;f++) {
                if (paises[f].compareTo(paises[f+1])>0) {
                    String aux;
                    aux=paises[f];
                    paises[f]=paises[f+1];
                    paises[f+1]=aux;
                }
            }
        }
    }

    public static void imprimir() {
        System.out.println("Paises ordenados en forma alfabética:");
        for(int f=0;f<paises.length;f++) {
            System.out.println(paises[f]);
        }
    }

    public static void main(String[] ar) {

        cargar();
        ordenar();
        imprimir();
    }
}
