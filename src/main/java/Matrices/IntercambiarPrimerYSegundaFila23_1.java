package Matrices;

import java.util.Scanner;

/*
Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segundo. Imprimir luego la matriz.
 */

public class IntercambiarPrimerYSegundaFila23_1 {
    private int[][] mat;
    private Scanner teclado;
    private int[] vec;

    public void cargar() {
        teclado = new Scanner(System.in);
        System.out.println("ingrese cantidad de filas");
        int fila = teclado.nextInt();
        System.out.println("ingrese cantidad de columnas");
        int colum = teclado.nextInt();
        mat = new int[fila][colum];
        vec = new int[fila];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("ingrese valor del componente");
                mat[i][j] = teclado.nextInt();

            }

        }
    }

    public void imprimir() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println(mat[i][j] + " ");

            }

        }

    }

    public void IntercambiarPrimerPorSegunda(){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                //primer paso
                vec[i]= mat[0][j];
                //segundo paso
                mat[0][j] = mat[1][j];
                //ultimo paso
                mat[1][j] = vec[i];

            }

        }
    }

    public void intercambiarLogicaTutoriales() {
        for(int c=0;c<mat[0].length;c++) {
            int aux=mat[0][c];
            mat[0][c]=mat[1][c];
            mat[1][c]=aux;
        }
    }




    public static void main(String[] args) {
        IntercambiarPrimerYSegundaFila23_1 inter = new IntercambiarPrimerYSegundaFila23_1();

        inter.cargar();
        inter.imprimir();
        //inter.IntercambiarPrimerPorSegunda();
        inter.intercambiarLogicaTutoriales();
        inter.imprimir();

    }
}
