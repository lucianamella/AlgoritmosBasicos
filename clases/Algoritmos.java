package clases;

public class Algoritmos {

    // Método estático esPar()
    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    };

    // Método estático esPrimo ()
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método estático stringEnReversa
    public static String stringEnReversa(String texto) {
        String reversa = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            reversa += texto.charAt(i);
        }

        return reversa;
    }

    // Método estático esPalindromo
    public static boolean esPalindromo(String texto) {
        String reversa = stringEnReversa(texto);

        return texto.equals(reversa);

    }

    // Método estático secuenciaFizzBuzz
    public static void secuenciaFizzBuzz(int numero) {
        for (int i = 1; i < numero; i++)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
    }
}
