package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class tresenralla2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matriu = new String[3][3];
        boolean turn = false;
        boolean estaPle = false;
        //Numero de casos del ticTacToe;
        int numCasos = 0;

        String fitxaJugador;

        boolean comptadorX = false;
        boolean comptadorO = false;
        //Rellenem la matriu de espais.
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = " ";
            }
        }

        //Eleguim qui fara el primer turno :(
        System.out.println("Qui comencça 1 o 2: ");
        int num = sc.nextInt();
        fitxaJugador = (num == 1) ? "X" : "O";

        //:)

        while (numCasos < 9) {

            //Recorrem la matriu per imprimir els resultats
            for (int z = 0; z < matriu.length; z++) {
                System.out.println(Arrays.deepToString(matriu[z]));
            }

            System.out.println();
            System.out.println("Posa la fila: ");
            int fila = sc.nextInt() - 1;
            System.out.println("Posa la columna: ");
            int columna = sc.nextInt() - 1;


            boolean fitxaColocada = false;

            //Mirem si la posicio esta ocupada o no -->
            if (fitxaJugador.equals("X")) {
                if (matriu[fila][columna].equals(" ")) {
                    matriu[fila][columna] = fitxaJugador;
                    fitxaColocada = true;
                }
            } else {
                if (matriu[fila][columna].equals(" ")) {
                    matriu[fila][columna] = fitxaJugador;
                    fitxaColocada = true;
                }
            }
            //<-- fins aqui.

            if (matriu[0][0].equals("X") && matriu[1][1].equals("X") && matriu[2][2].equals("X")){
                comptadorX = true;
            } else if (matriu[0][0].equals("O") && matriu[1][1].equals("O") && matriu[2][2].equals("O")){
                comptadorO = true;
            }
            if (matriu[0][2].equals("X") && matriu[1][1].equals("X") && matriu[2][0].equals("X")){
                comptadorX = true;
            }else if (matriu[0][2].equals("O") && matriu[1][1].equals("O") && matriu[2][0].equals("O")){
                comptadorO = true;
            }

            for (int i = 0; i < matriu.length; i++) {
                if (matriu[i][0].equals("X") && matriu[i][1].equals("X") && matriu[i][2].equals("X")){
                    comptadorX = true;
                    break;
                } else if (matriu[i][0].equals("O") && matriu[i][1].equals("O") && matriu[i][2].equals("O")){
                    comptadorO = true;
                    break;
                }
            }

            for (int i = 0; i < 3; i++) {
                if (matriu[0][i].equals("X") && matriu[1][i].equals("X") && matriu[2][i].equals("X")) {
                    comptadorX = true;

                }
            }
            for (int i = 0; i < 3; i++) {
                if (matriu[0][i].equals("O") && matriu[1][i].equals("O") && matriu[2][i].equals("O")) {
                    comptadorX = true;

                }
            }

            if (comptadorX){
                System.out.println("Ha guanyat X");
                break;
            } else if (comptadorO) {
                System.out.println("Ha guanyat O");
                break;
            }

            //Comprovem si esta ple o no.
            if (fitxaColocada) {
                numCasos++;
                fitxaJugador = (fitxaJugador.equals("X"))  ? "O" : "X";
            }else {
                System.out.println("Posició ocupada");
            }
        }
    }
}
