package Matrices;

import java.util.Scanner;

/*
Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes por columna
(es decir primero ingresar toda la primer columna, luego la segunda columna y así sucesivamente)
Imprimir luego la matriz.
 */
public class Matrices {

    private int[][] mat;
    private Scanner teclado;

    public void cargar(){
        teclado = new Scanner(System.in);
        mat=new int[2][5];
        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.println("ingrese valor: ");
                mat[f][c] = teclado.nextInt();
            }

        }
    }

    public void imprimir(){
        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.println("columna: " + c + " fila: " + f );
                System.out.println(" " + mat[f][c] );
                System.out.println(" ");
            }

        }
    }

    public static void main(String[] args) {
        Matrices matrices = new Matrices();
        matrices.cargar();
        matrices.imprimir();
    }
}
