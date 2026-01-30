package joel;

import java.util.Arrays;
import java.util.Scanner;

public class aulaReorganitzacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ficol = sc.nextLine().split(" ");
        int fila = Integer.parseInt(ficol[0]);
        int columna = Integer.parseInt(ficol[1]);
        String[][] matriu = new String[fila][columna];

        int N = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < fila; i++) {
            for (int x = 0; x < columna; x++) {
                matriu[i][x] = "---";
            }
        }
        while (N-- > 0) {

            String[] ple = sc.nextLine().trim().split(" ");

            String nom = ple[0];

            int posicio = Integer.parseInt(ple[1]);
            if (posicio < 0 || posicio >= fila) continue;
            for (int j = 0; j < columna; j++) {
                if (matriu[posicio][j].equals("---")){
                    matriu[posicio][j] = nom;
                    break;
                }
            }
        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
    }
}
