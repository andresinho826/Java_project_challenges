package codigo_practice_parte_dos;
/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class InvirtiendoCadenas {

    public static void main(String[] args) {
        String texto = "Hola mundo";
        String textoInvertido = invertirCadena(texto);
        System.out.println(textoInvertido);
    }

    public static String invertirCadena(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
}
