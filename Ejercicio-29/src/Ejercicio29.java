import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        int n = 4;
        int[][] matriz = new int[n][n];
        int valor = 1;

        // Llenar la matriz con números del 1 al 16
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = valor++;
            }
        }

        // Mostrar matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Preguntar tipo de reflejo (según tu convención)
        Scanner sc = new Scanner(System.in);
        System.out.print("\n¿Deseas reflejar la matriz verticalmente (V: arriba ↔ abajo) o horizontalmente (H: izquierda ↔ derecha)? ");
        String opcion = sc.next().toUpperCase();

        if (opcion.equals("V")) {
            invertirFilas(matriz); // vertical = invertir arriba/abajo
            System.out.println("\nMatriz reflejada verticalmente (arriba ↔ abajo):");
            mostrarMatriz(matriz);
        } else if (opcion.equals("H")) {
            invertirColumnas(matriz); // horizontal = invertir izquierda/derecha
            System.out.println("\nMatriz reflejada horizontalmente (izquierda ↔ derecha):");
            mostrarMatriz(matriz);
        } else {
            System.out.println("Opción no válida. No se realizó ningún reflejo.");
        }

        sc.close();
    }

    // Invierte filas: fila i <-> fila n-1-i (arriba <-> abajo)
    public static void invertirFilas(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n / 2; i++) {
            int[] temp = matriz[i];
            matriz[i] = matriz[n - 1 - i];
            matriz[n - 1 - i] = temp;
        }
    }

    // Invierte columnas: columna j <-> columna n-1-j (izquierda <-> derecha)
    public static void invertirColumnas(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[i][n - 1 - j];
                matriz[i][n - 1 - j] = temp;
            }
        }
    }

    // Método auxiliar para imprimir la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int val : fila) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}
