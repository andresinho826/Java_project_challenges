package vectores;

import java.util.*;

/*
Cargar un vector de 10 elementos y verificar posteriormente si el
mismo está ordenado de menor a mayor
 */
public class OrdenarVector {
    private int[] vector;
    Random random = new Random();
    Set<Integer> set = new TreeSet<>();

    public OrdenarVector(){
        Scanner teclado = new Scanner(System.in);

        vector = new int[10];
    }

    public void ordenar(){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= random.nextInt(100) +1;

            if (vector[i] > vector[i+1]) {
                vector[i+1] =vector[i];
            }
            System.out.println(vector[i]);
        }
    }

    public void ordenarWithThree(){
        for (int i = 0; i < vector.length; i++) {
            set.add(random.nextInt(100)+1);
            vector[i]= set.hashCode();
            //set.stream().sorted();
            System.out.println(vector[i]);

        }
    }

    public static void main(String[] args) {
        OrdenarVector ov = new OrdenarVector();
        //ov.ordenar();
        ov.ordenarWithThree();
    }
}
