public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4]; //Creo la matriz 4x4

        // Llenar matriz con números aleatorios entre 1 y 9
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int)(Math.random() * 9) + 1;
            }
        }

        // Mostrar la matriz
        System.out.println("Esta es la matriz creada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Suma de cada fila
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 4; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de la fila " + (i+1) + ": " + sumaFila);
        }

        // Suma de cada columna
        for (int j = 0; j < 4; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma de la columna " + (j+1) + ": " + sumaColumna);
        }
    }
}

