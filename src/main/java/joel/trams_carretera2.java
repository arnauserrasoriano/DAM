package joel;

import java.util.*;

public class trams_carretera2 {

    static String[] matriculas;
    static int[] tiempos;
    static Integer[] idx;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int metros = sc.nextInt();
        int k = sc.nextInt();

        // --------- CÁMARA 1 ---------
        int n1 = sc.nextInt();
        matriculas = new String[n1];
        tiempos = new int[n1];
        idx = new Integer[n1];

        for (int i = 0; i < n1; i++) {
            matriculas[i] = sc.next();
            tiempos[i] = sc.nextInt();
            idx[i] = i; // guardamos el índice original
        }

        // Ordenamos los índices según la matrícula
        Arrays.sort(idx, (a, b) -> matriculas[a].compareTo(matriculas[b]));

        // --------- CÁMARA 2 ---------
        int n2 = sc.nextInt();

        for (int i = 0; i < n2; i++) {
            String mat = sc.next();
            int tSalida = sc.nextInt();

            int pos = busquedaBinaria(mat, n1);

            if (pos != -1) {
                int tEntrada = tiempos[pos];
                int tiempo = tSalida - tEntrada;

                double vReal = (metros * 3.6) / tiempo;
                int v = (int) Math.round(vReal);

                if (v > k) {
                    System.out.println(mat + " " + v);
                }
            }
        }
    }

    static int busquedaBinaria(String mat, int n) {
        int l = 0, r = n - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            String actual = matriculas[idx[mid]];
            int cmp = actual.compareTo(mat);

            if (cmp == 0) return idx[mid];
            else if (cmp < 0) l = mid + 1;
            else r = mid - 1;
        }

        return -1;
    }
}
