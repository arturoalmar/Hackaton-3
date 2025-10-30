import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] tablero = new int[5][5];
        for(int i=0;i< tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                tablero[i][j]= rand.nextInt(2);
            }
        }
        System.out.println("Tablero inicial:");
        for(int i=0;i< tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println(" ");
        }
        for(int i=0;i< tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                if(tablero[i][j]==0){
                    tablero[i][j]=1;
                }else{
                    tablero[i][j]=0;
                }
            }
        }
        System.out.println("Tablero final:");
        for(int i=0;i< tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}