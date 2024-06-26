package codigo_practice;

import java.util.Arrays;

public class Anagrama {

    /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */

    public  static void main(String[] args) {
        System.out.println(isAnagram("amor", "roma"));
        System.out.println(isAnagram("casa", "roma"));
    }

    private static boolean isAnagram(String wordOne, String wordTwo) {
        if (wordOne.equalsIgnoreCase(wordTwo)) {
            return false;
        }
        char[] wordOneArray = wordOne.toLowerCase().toCharArray();
        char[] wordTwoArray = wordTwo.toLowerCase().toCharArray();

        Arrays.sort(wordOneArray);
        Arrays.sort(wordTwoArray);

        return Arrays.equals(wordOneArray, wordTwoArray);
    }
}
