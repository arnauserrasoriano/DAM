package exercicis_classe.arrays;
import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroCasos = Integer.parseInt(sc.nextLine());
        int[][] matriu = new int[numeroCasos][numeroCasos];
        String[][] vec = new String[numeroCasos][numeroCasos];

        String paraules;

        for (int x = 0; x < numeroCasos; x++) {
            for (int i = 0; i < numeroCasos; i++) {
                paraules = sc.nextLine();
                vec[x][i] = paraules;
            }
        }
        for (int fila = 0; fila < numeroCasos; fila++) {
            String minima = vec[fila][0];
            int posicioMinima = 0;

            for (int col = 0; col < numeroCasos; col++) {
                if (vec[fila][col].compareTo(minima) <= 0) {
                    posicioMinima = col;
                    minima = vec[fila][col];
                }
            }
            matriu[fila][0] = fila;
            matriu[fila][1] = posicioMinima;

        }

        for (int s = 0; s < matriu.length; s++) {
            System.out.println("[" + matriu[s][0] + ", " + matriu[s][1] + "]");

        }
    }
}
