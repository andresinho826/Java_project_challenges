package codigo_practice_parte_dos;

import java.util.HashMap;
import java.util.Map;

public class ContandoPalabras {
    public static void main(String[] args) {
        countWords("Hola, mi nombre es andres, pero mi nombre completo es andres castillo, y algunos amigos" +
                "me llaman castillo");
    }

    public static void countWords(String text) {
        Map<String, Integer> words = new HashMap<>();

        // Convertir a minúsculas, reemplazar caracteres no alfanuméricos por espacios y dividir en palabras
        String[] wordArray = text.toLowerCase().replaceAll("[^a-z0-9]", " ").split(" ");

        for (String key : wordArray) {
            if (key.isEmpty()) {
                continue;
            }
            if (words.containsKey(key)) {
                words.put(key, words.get(key) + 1);
            } else {
                words.put(key, 1);
            }
        }

        for (Map.Entry<String, Integer> word : words.entrySet()) {
            System.out.println(word.getKey() + " se ha repetido " + word.getValue() +
                    (word.getValue() == 1 ? " vez" : " veces"));
        }
    }
}

