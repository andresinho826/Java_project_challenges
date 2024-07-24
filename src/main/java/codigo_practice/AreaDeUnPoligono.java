package codigo_practice;

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class AreaDeUnPoligono {

    public static int calcularPoligono(int a, int p) {
        int area = (a * p) / 2;
        System.out.println("el area del poligono es: " + area);
        return area;

    }

    public static void main(String[] args) {
        calcularPoligono(12,10);
        calcularPoligono(2,10);
        calcularPoligono(10,5);

    }

}
