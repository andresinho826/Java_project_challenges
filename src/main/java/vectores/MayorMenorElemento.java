package vectores;

import java.util.Random;
import java.util.Scanner;

//Cargar un vector de n elementos. imprimir el menor y un mensaje si se repite dentro del vector.
public class MayorMenorElemento {
    private Scanner teclado;
    private int []vec;
    private int menor;
    Random random = new Random();

    public void cargar(int n) {
        /*
        teclado=new Scanner(System.in);
        System.out.print("Cuantos elementos desea cargar:");
        int n=teclado.nextInt();
        vec=new int[n];
        for(int f=0;f<vec.length;f++) {
            System.out.print("Ingrese componente:");
            vec[f]=teclado.nextInt();

         */
        vec=new int[n];
        for (int i = 0; i < n; i++) {
            vec[i]= random.nextInt(10)+1;
            System.out.println(vec[i]);

        }
    }

    public void menorElemento() {

        menor=vec[0];

        for(int f=1;f<vec.length;f++) {
            if (vec[f]<menor) {
                menor=vec[f];
            }

        }
        System.out.println("El elemento menor es:"+menor);
    }

    public void repiteMenor() {
        int cant=0;
        for(int f=0;f<vec.length;f++) {
            if (vec[f]==menor) {
                cant++;
            }
        }
        if (cant>1) {
            System.out.println("Se repite el menor en el vector.");
        } else {
            System.out.println("No se repite el menor en el vector.");
        }
    }

    public static void main(String[] ar) {
        MayorMenorElemento pv = new MayorMenorElemento();
        pv.cargar(10);
        pv.menorElemento();
        pv.repiteMenor();
    }
}