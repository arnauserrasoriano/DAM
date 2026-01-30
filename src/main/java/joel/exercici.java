package joel;

import java.util.Scanner;

public class exercici {
    static String[] amics = new String[200000];
    static String[] companys = new String[200000];
    static int total = 0;

    static int buscarJugador(String nom) {
        for (int i = 0; i < total; i++) {
            if (amics[i].equals(nom)) {
                return i;
            }
        }
        return -1;
    }

    static int posAlumnes(String nom) {
        int posAlumne = buscarJugador(nom);
        if (posAlumne != -1) {
            return posAlumne;
        } else {
            amics[total] = nom;
            companys[total] = "";
            total++;
            return total - 1;
        }
    }

    static void afegirAlumne(int posAlumne, String nom) {
        if (companys[posAlumne].isEmpty()) {
            companys[posAlumne] = nom;
            return;
        }
        String[] nou = companys[posAlumne].split(",");
        for (String s : nou) {
            if (s.equals(nom)) {
                return;
            }
        }
        companys[posAlumne] += "," + nom;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String[] grup = sc.nextLine().split(",");
            for (int a = 0; a < grup.length; a++) {
                int posA = posAlumnes(grup[a]);
                for (int b = 0; b < grup.length; b++) {
                    if (a != b) {
                        afegirAlumne(posA, grup[b]);
                    }
                }
            }
        }

        int m = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < m; i++) {
            int pos = posAlumnes(sc.nextLine());
            if (pos == -1 || companys[pos] == null || companys[pos].isEmpty()) {
                System.out.println("-");
            } else {
                String[] llista = companys[pos].split(",");
                for (int j = 0; j < llista.length; j++) {
                    if(j>0){
                        System.out.print(",");
                    }
                    System.out.print(llista[j]);
                }
                System.out.println();
            }
        }
    }
}

