import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir una palabra
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        // Pasar la palabra a minúsculas
        palabra = palabra.toLowerCase();

        System.out.println("\nPosición de cada letra en el alfabeto:");

        //  Bucle for correctamente definido
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            // Verificar si es una letra del alfabeto
            if (letra >= 'a' && letra <= 'z') {
                int posicion = letra - 'a' + 1;
                System.out.println(letra + " → " + posicion);
            } else {
                System.out.println(letra + " → no es una letra del alfabeto");
            }
        }

        sc.close();
    }
}
