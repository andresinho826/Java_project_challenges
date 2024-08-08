package vectores;

import java.util.Random;

public class OrdenarVectorEjercicio {

    public static int[] vector;


    public static void cargar(int n){
        Random random = new Random();
        vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i]= random.nextInt(1000) +1;
        }
    }

    public static void ordenar(){
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < (vector.length-j); j++) {
                if (vector[j] > vector[j+1] ){
                    int aux;
                    aux = vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }

            }

        }
    }

    public static void imprimir() {
        System.out.println("vector ordenado de menor a mayor.");
        for(int f=0;f<vector.length;f++) {
            System.out.println(vector[f]);
        }
    }

    public static void main(String[] args) {
        cargar(10);
        ordenar();
        imprimir();
    }
}
