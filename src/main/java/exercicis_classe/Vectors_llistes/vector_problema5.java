package exercicis_classe.Vectors_llistes;
import java.util.*;

public class vector_problema5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] num = new int[5][5];
        int valor=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                    num[i][j] = valor++;
                System.out.print(num[i][j] + "\t");

            }

        }

    }
}






