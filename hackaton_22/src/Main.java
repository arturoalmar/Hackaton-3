public class Main {
    public static void main(String[] args) {
        char[][] tablero = new char[5][5];
        for(int i=0;i< tablero.length;i++){
            for(int j=0;j< tablero.length;j++){
                tablero[i][j] = 0;
            }
        }
        tablero[2][3]='X';
        for(int i=0;i< tablero.length;i++){
            for(int j=0;j< tablero.length;j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println(" ");
        }



    }

}
