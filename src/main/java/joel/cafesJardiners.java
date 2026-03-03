package joel;

import java.util.*;

public class cafesJardiners{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] noms = new String[10000];     // màxim treballadors diferents
        int[] comptador = new int[10000];
        int mida = 0; // quants treballadors diferents tenim

        while (true) {
            String nom = sc.nextLine();
            if (nom.equals("FINAL")) break;

            int pos = -1;

            // Busquem si el nom ja existeix
            for (int i = 0; i < mida; i++) {
                if (noms[i].equals(nom)) {
                    pos = i;
                    break;
                }
            }

            if (pos == -1) {
                // Nou treballador
                noms[mida] = nom;
                comptador[mida] = 1;
                mida++;
            } else {
                // Ja existeix → incrementem
                comptador[pos]++;
            }
        }

        boolean alguNervios = false;

        // Ordenació alfabètica (bubble sort simple)
        for (int i = 0; i < mida - 1; i++) {
            for (int j = i + 1; j < mida; j++) {
                if (noms[i].compareTo(noms[j]) > 0) {
                    // intercanvi noms
                    String tempNom = noms[i];
                    noms[i] = noms[j];
                    noms[j] = tempNom;

                    // intercanvi comptadors
                    int tempCount = comptador[i];
                    comptador[i] = comptador[j];
                    comptador[j] = tempCount;
                }
            }
        }

        for (int i = 0; i < mida; i++) {
            if (comptador[i] > 3) {
                System.out.println(noms[i] + " : TOO NERVOUS");
                alguNervios = true;
            }
        }

        if (!alguNervios) {
            System.out.println("CONTROLLED");
        }
    }
}