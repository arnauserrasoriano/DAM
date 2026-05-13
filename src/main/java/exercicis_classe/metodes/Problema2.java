package exercicis_classe.metodes;

import java.util.Arrays;

public class Problema2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(incrementarArray(arr, 2)));
    }

    public static int[] incrementarArray(int[] arr, int valor) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += valor;
        }
        return arr;
    }
}
/*
package exercicis_classe.metodes;

import java.io.IO;
import java.util.Arrays;

public class Problema2 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        IO.println(Arrays.toString(
                incrementarArray(arr, 2)
        ));
    }

    public static int[] incrementarArray(int[] arr, int valor) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] += valor;
        }

        return arr;
    }
}
 */

