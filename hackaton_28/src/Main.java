import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //definir la matriz y el generador aleatorio
        Random rand = new Random();
        int[][] matriz = new int[6][6];
        //llenar la matriz de numeros aleatorios del 1 al 9
        for(int i=0;i<matriz.length;i++){
            for(int j=0; j< matriz.length;j++){
                matriz[i][j] = rand.nextInt(9)+1;
            }
        }
        //generar la matriz
        for(int i=0;i< matriz.length;i++){
            for(int j=0; j< matriz.length;j++){
                if(j>=i){//condicion para generar solo la mitad deseada
                    System.out.print(matriz[i][j]+" ");
                }

            }
            System.out.println();
        }
    }
}