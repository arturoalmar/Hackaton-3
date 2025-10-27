import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la palabra a adivinar: ");
        String palabraOculta = sc.nextLine();
        boolean completado = true;
        int vidas=5;

        //limpiamos pantalla para que el usuario no vea la palabra
        for (int i = 0; i < 20; i++) {
            System.out.println(" ");
        }

        //variable progreso, que llevara la cuenta de los aciertos
        String[] progreso = new String[palabraOculta.length()];
        for (int i = 0; i < palabraOculta.length(); i++) {
            progreso[i] = "_";
        }

        //mostramos progreso inicial
        System.out.print("Progreso: ");
        for (String letra : progreso) {
            System.out.print(letra + " ");
        }
        System.out.println();

        do {
            completado = true;
            System.out.println("Escribe una letra para intentar adivinar la palabra: ");
            char letra = sc.nextLine().charAt(0);
            boolean acierto = false;

            //comprobamos si la letra se encuentra en la palabra
            for (int i = 0; i < palabraOculta.length(); i++) {
                if (Character.toLowerCase(letra) == Character.toLowerCase(palabraOculta.charAt(i))) {
                    progreso[i] = String.valueOf(palabraOculta.charAt(i));
                    acierto = true;
                }
            }

            //mostramos el resultado del intento
            if (acierto) {
                System.out.println("Correcto!");
            } else {
                System.out.println("Lo siento, la letra no se encuentra en la palabra. Inténtalo de nuevo.");
                vidas--;
                System.out.println("Te quedan " + vidas + " vidas");
            }

            //actualizamos el progreso
            System.out.print("Progreso: ");
            for (int i=0;i<palabraOculta.length();i++) {
                System.out.print(progreso[i] + " ");
            }
            System.out.println();

            //comprobamos si la palabra se ha adivinado
            for (String letraProgreso : progreso) {
                if (letraProgreso.equals("_")) {
                    completado = false;
                    break;
                }
            }

        } while (!completado&&vidas>0);
        //si se ha adivinado la palabra, terminamos el programa
        System.out.println("Partida terminada");
    }
}

