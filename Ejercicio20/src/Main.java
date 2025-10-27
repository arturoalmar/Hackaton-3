import java.util.Collections;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] puntuaciones = {85,76,75,26,89,100};
        Arrays.sort(puntuaciones);
        System.out.println("Puntuaciones ordenadas de mayor a menor;");
        for (int puntuacion : puntuaciones){
            System.out.println(puntuacion);
        }
    }
}