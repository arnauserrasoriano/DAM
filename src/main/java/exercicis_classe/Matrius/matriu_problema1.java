package exercicis_classe.Matrius;
import java.util.*;

public class matriu_problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] num = new int[5][5];
        int valor=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = valor++;
                System.out.print(num[i][j] + "\t");

            }
            System.out.println();

        }

    }
}




/*
package exercicis_classe.Matrius;

import java.io.IO;

public class MatriuProblema1 {

    public static void main(String[] args) {

        final int SIZE = 5;

        int[][] num = new int[SIZE][SIZE];

        int valor = 0;

        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {

                num[i][j] = valor++;

                IO.print(num[i][j] + "\t");
            }

            IO.println();
        }
    }
}
 */

