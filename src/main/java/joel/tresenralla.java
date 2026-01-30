package joel;

import java.util.Arrays;
import java.util.Scanner;

public class tresenralla {

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {

        Scanner sc = new Scanner(System.in);
        String[][] matriu = new String[3][3];
        boolean estaPle = false;
        int numCasos = 0;
        boolean turn = false;
        boolean finalM = false;

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = " ";
            }
        }
        System.out.println("Qui comencça 1 o 2: ");
        int num = sc.nextInt();
        if (num == 1) {
            turn = true;
            System.out.println("Comença X");
        } else {
            turn = false;
            System.out.println("Comença O");

        }

        while (true) {
            System.out.println("Posa la fila: ");
            int fila = sc.nextInt() - 1;
            System.out.println("Posa la columna: ");
            int columna = sc.nextInt() - 1;
            if (turn) {
                if (matriu[fila][columna].equals(" ")) {
                    matriu[fila][columna] = "X";
                    turn = false;
                    estaPle = false;
                    comprovacions(matriu, turn);

                } else {
                    estaPle = true;
                    comprovacions(matriu, turn);
                }

            } else {
                if (matriu[fila][columna].equals(" ")) {

                    matriu[fila][columna] = "O";
                    turn = true;
                    estaPle = false;


                } else {
                    estaPle = true;
                }

                finalM = comprovacions(matriu, turn);

                if (finalM) {
                    System.out.println("HAS GUANYAT " + (turn ? "X" : "O"));
                    break;
                }

            }


        }
    }


    public static boolean comprovacions(String[][] m, boolean turn) {
        boolean finalM = false;
        boolean estaPle = false;
        for (int z = 0; z < m.length; z++) {
            System.out.println(Arrays.toString(m[z]));
        }
        /*horizontal*/
        for (int e = 0; e < 3; e++) {
            if (m[e][0].equals(m[e][1]) && m[e][0].equals(m[e][2]) && !m[e][0].equals(" ")
            ) {

                finalM = true;

            }
        }
        /*vertical*/
        for (int r = 0; r < 3; r++) {
            if (m[0][r].equals(m[1][r]) && m[0][r].equals(m[2][r]) && !m[0][r].equals(" ")
            ) {
                finalM = true;
            }
        }
        /*diagonal*/
        if (m[0][0].equals(m[1][1]) && m[0][0].equals(m[2][2]) && !m[0][0].equals(" ")
        ) {
            finalM = true;

        }
        if (m[0][2].equals(m[1][1]) && m[0][2].equals(m[2][0]) && !m[0][2].equals(" ")
        ) {
            finalM = true;
        }

        if (estaPle) {
            System.out.println("Esta ple");
        }

        return finalM;
    }


}






















