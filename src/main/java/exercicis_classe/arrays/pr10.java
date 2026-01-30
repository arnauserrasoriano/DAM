package exercicis_classe.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class pr10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos=Integer.parseInt(sc.nextLine());
        String vector[][]=new String[numCasos][numCasos];
        int matriu[][]=new int[numCasos][2];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                String entrada = sc.nextLine();
                vector[i][j]=entrada;
            }
        }
        for (int fila = 0; fila < vector.length; fila++) {
            int pos=0;
            String minima=vector[fila][0];
            for (int columna = 0; columna < vector.length; columna++) {
                if (vector[fila][columna].compareTo(minima)<=0){
                    pos=columna;
                }
                matriu[fila][0]=fila;
                matriu[fila][1]=pos;
            }
        }
        for (int z = 0; z < matriu.length; z++) {
            System.out.println(Arrays.toString(matriu[z]));

        }
    }
}
