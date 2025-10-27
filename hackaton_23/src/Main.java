import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fila=2;
        int columna=2;
        Scanner sc=new Scanner(System.in);
        char[][] tablero = new char[5][5];

        for(int i=0;i< tablero.length;i++){
            for(int j=0;j< tablero.length;j++){
                tablero[i][j] = 0;
            }
        }
        //posicion inicial agente
        tablero[fila][columna]='X';

        for(int i=0;i< tablero.length;i++){
            for(int j=0;j< tablero.length;j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println(" ");
        }
        String movimiento ="0";
        do{
            System.out.println("introduce una direccion en la que moverte(W/A/S/D): ");
            movimiento = sc.nextLine();
            if(movimiento.charAt(0)=='A'&& columna > 0){
                tablero[fila][columna]=0;
                columna=columna-1;
                tablero[fila][columna]='X';
            }else if(movimiento.charAt(0)=='W'&& fila > 0){
                tablero[fila][columna]=0;
                fila=fila-1;
                tablero[fila][columna]='X';
            }else if(movimiento.charAt(0)=='S'&& fila < tablero.length - 1){
                tablero[fila][columna]=0;
                fila=fila+1;
                tablero[fila][columna]='X';
            }else if(movimiento.charAt(0)=='D'&& columna < tablero[0].length - 1){
                tablero[fila][columna]=0;
                columna=columna+1;
                tablero[fila][columna]='X';
            }
            for(int i=0;i< tablero.length;i++){
                for(int j=0;j< tablero.length;j++){
                    System.out.print(tablero[i][j]);
                }
                System.out.println(" ");
            }
            System.out.println("Escribe Q para salir");



        }while (movimiento.charAt(0) != 'Q');




    }

}
