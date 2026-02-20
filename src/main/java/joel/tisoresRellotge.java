package joel;

import java.util.Scanner;

public class tisoresRellotge {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] noms = new String[10000];
        int[] punts = new int[10000];
        int n = 0;
        while (true) {
            String linia = sc.nextLine();
            if (linia.equals("*")) break;
            String[] t = linia.split(" ");
            String nom = t[0] + " " + t[1];

            int pos = -1;
            for (int i = 0; i < n; i++) {
                if (noms[i].equals(nom)) {
                    pos = i;
                    break;
                }
            }
            if (pos == -1) {
                noms[n] = nom;
                punts[n] = 0;
                pos = n;
                n++;
            }
            int neg = 0;
            for (int j = 2; j < t.length; j += 2) {
                if (t[j].compareTo("07:03") >= 0) neg++;   // entrada tarde
                if (t[j + 1].compareTo("14:57") <= 0) neg++; // salida pronto
            }

            punts[pos] += neg;

        }
        boolean algu = false;

        for (int i = 0; i < n; i++) {
            if (punts[i] <= 3) {
                System.out.println(noms[i]);
                algu = true;
            }
        }

        if (!algu) System.out.println("ANYBODY");

    }
}
