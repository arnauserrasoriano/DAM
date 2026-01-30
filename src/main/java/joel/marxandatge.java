package joel;

import java.util.Scanner;

public class marxandatge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());
        String[] llista = new String[numCasos];
        int personesRepetides = 0;
        int regalo = 0;

        for (int i = 0; i < numCasos; i++) {
            boolean isCorr = false;

            String nom=sc.nextLine();
            for (int x = 0; x < regalo; x++) {
                if (llista[x] != null && llista[x].equals(nom)) {
                    isCorr = true;
                    break;
                }
            }
            if (isCorr) {
                personesRepetides++;
            } else {
                llista[regalo]=nom;
                regalo++;

            }
        }
        System.out.println(regalo + " " + personesRepetides);

    }
}

