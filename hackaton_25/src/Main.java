import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fila = 2;
        int columna = 2;
        Scanner sc = new Scanner(System.in);
        char[][] tablero = new char[5][5];

        //llenamos el tablero de -
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }

        //campo de vision
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (i >= 0 && i < tablero.length && j >= 0 && j < tablero.length) {
                    tablero[i][j] = '0';
                }
            }
        }
        //posición inicial del jugador
        tablero[fila][columna] = 'X';

        //imprimir tablero inicial
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        //bucle del movimiento
        String movimiento;
        do {
            System.out.println("Introduce una dirección (W/A/S/D) o Q para salir:");
            movimiento = sc.nextLine().toUpperCase();

            //mover jugador si está dentro de los límites
            if (movimiento.charAt(0)=='A' && columna > 0){
                columna--;
            }else if (movimiento.charAt(0)=='D' && columna < tablero[0].length - 1){
                columna++;
            }else if (movimiento.charAt(0)=='W' && fila > 0){
                fila--;
            }else if (movimiento.charAt(0)=='S' && fila < tablero.length - 1){
                fila++;
            }

            //limpiar tablero
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    tablero[i][j] = '-';
                }
            }

            //volver a dibujar el tablero, teniendo en cuenta las esquinas
            for (int i = fila - 1; i <= fila + 1; i++) {
                for (int j = columna - 1; j <= columna + 1; j++) {
                    if (i >= 0 && i < tablero.length && j >= 0 && j < tablero.length) {
                        tablero[i][j] = '0';
                    }
                }
            }
            tablero[fila][columna] = 'X';

            //imprimir el tablero actualizado
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

        } while (movimiento.charAt(0)!='Q');

        System.out.println("Juego terminado");
    }
}

