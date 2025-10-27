import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fila=2;
        int columna=2;
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        char[][] tablero = new char[6][6];

        for(int i=0;i< tablero.length;i++){
            for(int j=0;j< tablero.length;j++){
                tablero[i][j] = '0';
            }
        }
        for(int i=0;i<5;){
            fila= rand.nextInt(tablero.length);
            columna= rand.nextInt(tablero.length);
            if(tablero[fila][columna]=='0'){
                tablero[fila][columna]='E';
                i++;
            }
        }
        for(int i=0;i< tablero.length;i++){
            for(int j=0;j< tablero.length;j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println(" ");
        }




    }

}
