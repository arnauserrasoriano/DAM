package exercicis_classe.Matrius;
import java.util.*;

public class matrius_problema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] num = new char[5][5];
        String valor = "abcdefghijklmnopqrstuvxzy";
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                num[i][j] = valor.charAt(k);
                k++;
                System.out.print(num[i][j] + "\t");

            }
            System.out.println();

        }
    }
}


/*
package exercicis_classe.Matrius;

import java.io.IO;

public class MatriusProblema4 {

    public static void main(String[] args) {

        final int SIZE = 5;

        char[][] num = new char[SIZE][SIZE];

        String valor = "abcdefghijklmnopqrstuvwxy";

        int k = 0;

        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {

                num[i][j] = valor.charAt(k++);

                IO.print(num[i][j] + "\t");
            }

            IO.println();
        }
    }
}
 */




