package codigo_practice_parte_dos;

public class DecimalABinario {
    public static String decimalAABinario(int numeroDecimal) {
        if (numeroDecimal == 0) {
            return "0";
        }

        String binario = "";

        while (numeroDecimal > 0) {
            int residuo = numeroDecimal % 2;  // Calculamos el residuo de la división
            binario = residuo + binario;      // Añadimos el residuo al inicio de la cadena
            numeroDecimal = numeroDecimal / 2; // Actualizamos el número decimal
        }

        return binario; // Retornamos el número binario
    }

    public static void main(String[] args) {
        int numero = 20; // Número a convertir
        String resultado = decimalAABinario(numero);
        System.out.println("El número binario de " + numero + " es: " + resultado);
    }
}
