package joel;

import java.util.*;
import java.util.Scanner;

public class connectar_servidors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());
        while (numCasos-- > 0) {
            int numXllista = Integer.parseInt(sc.nextLine());
            int[] llista = new int[numXllista];

            String[] entrada = sc.nextLine().split(" ");
            for (int i = 0; i < entrada.length; i++) {
                llista[i] = Integer.parseInt(entrada[i]);
            }
            Arrays.sort(llista);

            int millorSuma = Integer.MAX_VALUE;
            int[] best = llista.clone();

            do {
                int sum = 0;
                for (int i = 0; i + 1 < llista.length; i += 2) {
                    sum += llista[i] + llista[i + 1];
                }

                if (sum < millorSuma) {
                    millorSuma = sum;
                    best = llista.clone();
                }
            } while (nextPermutation(llista));
            System.out.println(millorSuma);
            System.out.println(Arrays.toString(best));

        }
    }

    public static boolean nextPermutation(int[] llista) {
        int i = llista.length - 2;
        while (i >= 0 && llista[i] >= llista[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = llista.length - 1;
        while (llista[j] <= llista[i]) {
            j--;
        }
        int t =llista[i]; llista[i] = llista[j]; llista[j] = t;

        for (int l = i + 1, r = llista.length - 1; l < r; l++, r--) {
            t = llista[l]; llista[l] = llista[r]; llista[r] = t;
        }
        return true;
    }
}
