import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //iniciamos las variables
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] dado1 = new int[6];
        int[] dado2 = new int[6];
        int ganadas1=0;
        int ganadas2=0;
        boolean continuar = true;
        String respuesta;
        //rellenamos los arrays de los dados con los numeros del 1 al ---
        for(int i=0; i<dado1.length;i++){
            dado1[i]=i+1;
        }
        for(int i=0; i<dado2.length;i++){
            dado2[i]=i+1;
        }
        //inicio bucle tiradas
        do {
            for (int i = 0; i < 5; i++) {
                //creamos variables que "tiran los dados"
                int tirada1 = rand.nextInt(dado1.length);
                int tirada2 = rand.nextInt(dado2.length);
                //escribimos el resultado de las tiradas por pantalla
                System.out.println("Tirada jugador 1: " + dado1[tirada1]);
                System.out.println("Tirada jugador 2: " + dado2[tirada2]);
                //clasificamos los distintos desenlaces dependiendo del resultado de las tiradas:
                //si gana el jugador 1
                if (dado1[tirada1] > dado2[tirada2]) {
                    System.out.println("Ha ganado el jugador 1");
                    ganadas1++;
                }
                //si gana el jugador 2
                if (dado1[tirada1] < dado2[tirada2]) {
                    System.out.println("Ha ganado el jugador 2");
                    ganadas2++;
                }
                //si ocurre un empate
                if (dado1[tirada1] == dado2[tirada2]) {
                    System.out.println("Empate");
                }
                //imprimimos el marcador que se actualizara dependiendo de cuantas partidas gane cada jugador
                System.out.println(ganadas1 + "-" + ganadas2);
            }
            //pregunta si se quieren repetir las tiradas, manteniendo el marcador
            do {
                System.out.println("Desea volver a tirar otras 5 veces?(si/no): ");
                respuesta = sc.nextLine();
            }
            //filtramos las respuestas que no sean ni si ni no para repetir las tiradas
            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
            //si la respuesta es si, el do-while de mas arriba se repetira, repitiendo las 5 tiradas
            if(respuesta.equalsIgnoreCase("si")){
                continuar = true;
            }
            //si la respuesta es no, el programa finalizara
            else{
                continuar = false;
            }
        }while (continuar == true);
        System.out.println("Gracias por jugar");

    }
    }
