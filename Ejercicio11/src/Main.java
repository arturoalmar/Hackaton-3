public class Main {
    public static void main(String[] args) {
                int n = 15;  // Cantidad de números que queremos
                int[] fibonacci = new int[n];

                // Inicializar los dos primeros números
                fibonacci[0] = 0;
                fibonacci[1] = 1;

                // Calcular los siguientes
                for (int i = 2; i < n; i++) {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }

                // Mostrar el resultado
                System.out.println("Los 15 primeros números de la serie de Fibonacci son:");
                for (int i = 0; i < n; i++) {
                    System.out.print(fibonacci[i] + " ");
                }
            }
        }
