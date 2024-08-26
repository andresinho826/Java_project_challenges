package Matrices;

import java.util.Scanner;

/*
Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir los cuatro valores que se encuentran en los vértices de la misma (mat[0][0] etc.)
 */
public class Vertices23_2 {
    private Scanner teclado;
    private int[][] mat;

    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }

    public void imprimirVertices() {
        System.out.println("Vértice superior izquierdo:");
        System.out.println(mat[0][0]);
        System.out.println("Vértice superior derecho:");
        System.out.println(mat[0][mat[0].length-1]);
        System.out.println("Vértice inferior izquierdo:");
        System.out.println(mat[mat.length-1][0]);
        System.out.println("Vértice inferior derecho:");
        System.out.println(mat[mat.length-1][mat[mat.length-1].length-1]);
    }

    public static void main(String[] ar) {
        Vertices23_2 ma=new Vertices23_2();
        ma.cargar();
        ma.imprimirVertices();
    }
}
