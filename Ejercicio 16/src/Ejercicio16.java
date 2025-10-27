import java.util.Random;

public class Ejercicio16 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        // Generar 10 números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(20) + 1;
        }

        // Mostrar los números generados
        System.out.print("Números generados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Comprobar repeticiones
        for (int i = 0; i < numeros.length; i++) {
            for (int contadorrepe = i + 1; contadorrepe < numeros.length; contadorrepe++) {
                if (numeros[contadorrepe] == numeros[i]) {
                    System.out.println("Tu número " + numeros[i] + " está repetido en las posiciones " + i + " y " + contadorrepe);
                    System.exit(0);
                }
            }
        }
    }
}

