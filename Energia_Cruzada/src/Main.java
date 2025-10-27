// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        // CREAR MATRIZ

        int matriz[][] = new int[25][25];


        // ESTABLECER VALORES DENTRO DE LA MATRIZ

        int n = 1;
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                matriz[i][j] = n;
                n++;
            }
        }


        // SUMAR Y ESCRIBIR DIAGONAL PRINCIPAL

        int suma = 0;

        for (int i = 0; i < 25; i++) {
            suma += matriz[i][i];
            System.out.print(matriz[i][i]+", ");
        }
        System.out.println();
        System.out.println("La suma de la diagonal principal es= "+suma);


        // SUMAR Y ESCRIBIR DIAGNOAL SECUNDARIA

        suma = 0;

        for (int i = 0; i < 25; i++) {
            int j = 24 - i;
            suma += matriz[i][j];
            System.out.print(matriz[i][j] + ", ");
        }
        System.out.println();
        System.out.println("La suma de la diagonal secundaria es= "+suma);
    }
}