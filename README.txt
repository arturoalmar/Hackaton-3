public class Main {
    public static void main(String[] args) {
        int[] valores = new int[6];  //declarar un array de numeros enteros
        Scanner sc = new Scanner(System.in);
        int producto = 1;   //Declararar la variable producto

        //Pedir los 6 números al usuario
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Escribe un número " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }

        //Clacular el producto de los 6 números
        for (int i =0; i < valores.length; i++) {
            producto = producto * valores[i]; //multiplicamos cada número-
        }
    // Mostrar el resultado
        System.out.println("El producto de los números escritos es; " + producto);

    }
}
