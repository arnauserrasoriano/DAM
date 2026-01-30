package joel;

import java.util.Arrays;
import java.util.Scanner;

public class bon_ambient {
    static String[] alumnes = new String[700000];
    static String[] companys = new String[700000];
    static int total = 0;

    static int buscarAlumne(String nom) {
        for (int i = 0; i < total; i++) {
            if (alumnes[i].equals(nom)) {
                return i;
            }
        }
        return -1;
    }

    static int posAlumne(String nom) {
        int pos = buscarAlumne(nom);
        if (pos != -1) {
            return pos;
        }else {
            alumnes[total] = nom;
            companys[total] = "";
            total++;
            return total - 1;
        }

    }

    static void afegir(int pos, String nom) {
        if (companys[pos].isEmpty()) {
            companys[pos] = nom;
            return;
        }
        String[] nou = companys[pos].split(",");
        for (String s : nou) {
            if (s.equals(nom)) {
                return;
            }
        }
        companys[pos] += "," + nom;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < companys.length; i++) {
            companys[i] = "";
        }

        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String[] grupo = sc.nextLine().split(",");

            for (int a = 0; a < grupo.length; a++) {
                int posA = posAlumne(grupo[a]);

                for (int b = 0; b < grupo.length; b++) {
                    if (a != b) {
                        afegir(posA, grupo[b]);
                    }
                }
            }
        }

        int m = Integer.parseInt(sc.nextLine().trim());


        for (int i = 0; i < m; i++) {
            String q = sc.nextLine();

            int pos = buscarAlumne(q);

            if (pos == -1 || companys[pos] == null || companys[pos].isEmpty()) {

                    System.out.println("-");
            } else{
                    String[] lista = companys[pos].split(",");
                    Arrays.sort(lista);

                    for (int j = 0; j < lista.length; j++) {
                        if (j > 0) {
                            System.out.print(",");
                        }
                        System.out.print(lista[j]);
                    }
                    System.out.println();
                }
            }
        }
    }
