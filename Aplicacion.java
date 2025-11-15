import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {
        // Aplicación del algoritmo esPar
        System.out.println(Algoritmos.esPar(10));
        System.out.println(Algoritmos.esPar(5));
        System.out.println(Algoritmos.esPar(0));

        // Aplicación del algoritmo esPrimo
        System.out.println(Algoritmos.esPrimo(2));
        System.out.println(Algoritmos.esPrimo(7));
        System.out.println(Algoritmos.esPrimo(1));
        System.out.println(Algoritmos.esPrimo(0));

        // Aplicación del algoritmo StringEnReversa
        System.out.println(Algoritmos.stringEnReversa("Luciana"));
        System.out.println(Algoritmos.stringEnReversa("Nazarena"));

        // Aplicación del algoritmo esPalindromo
        System.out.println(Algoritmos.esPalindromo("luciana"));
        System.out.println(Algoritmos.esPalindromo("oso"));
        System.out.println(Algoritmos.esPalindromo("luzazul"));

        // Aplicación del algoritmo FizzBuzz
        Algoritmos.secuenciaFizzBuzz(25);
    };
};
