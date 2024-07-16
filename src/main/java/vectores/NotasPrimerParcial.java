package vectores;

import java.util.Random;
import java.util.Scanner;

/*
Se tienen las notas del primer parcial de los alumnos de dos cursos, el curso A y el curso B,
 cada curso cuenta con 5 alumnos.
Realizar un programa que muestre el curso que obtuvo el mayor promedio general.
 */
public class NotasPrimerParcial {
    private float proCursoA=0;
    private float proCursoB=0;
    private int[] vectorA;
    private int[] vectorB;
    Random random = new Random();

    public NotasPrimerParcial(){
        vectorA = new int[5];
        vectorB = new int[5];
        Scanner teclado = new Scanner(System.in);
    }

    public void promedioNotasCursos(){
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i]= random.nextInt(5) + 1;
            vectorB[i]= random.nextInt(5)+1;

            System.out.println(vectorA[i]);
            System.out.println(vectorB[i]);


            proCursoA = proCursoA + vectorA[i];
            proCursoB = proCursoB + vectorB[i];

        }
        System.out.println("promedio A:" + proCursoA);
        System.out.println("promedio B:" + proCursoB);

        if (proCursoA > proCursoB) {
            System.out.println("Promedio curso A es Mayor :" + proCursoA);
        }else {
            System.out.println("Promedio curso B es Mayor :" + proCursoB);
        }
    }

    public static void main(String[] args) {
        NotasPrimerParcial npp = new NotasPrimerParcial();
        npp.promedioNotasCursos();
    }
}
