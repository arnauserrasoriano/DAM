package exercicis_classe.arrays;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;
import java.util.Scanner;

public class pr9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());
        String vector[][]=new String[numCasos][numCasos];
        int matriu[][]=new int[numCasos][2];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                vector[i][j]=sc.nextLine();
            }
        }
        for (int fila = 0; fila < vector.length; fila++) {
            String primera = vector[fila][0];
            int pos=0;
            for (int columna = 1; columna < vector.length; columna++) {
                if(vector[fila][columna].compareTo(primera)<=0){
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
