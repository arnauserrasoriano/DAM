package exercicis_classe.arrays;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());
        String[] vec1 = new String[numCasos];
        int[] vec2 = new int[numCasos];

        String entrada1;
        char entrada2;

        for (int i = 0; i < vec1.length; i++) {
            entrada1 = sc.nextLine();
            vec1[i] = entrada1;
        }
        entrada2 = sc.nextLine().charAt(0);

        for (int x=0; x < vec1.length; x++) {
            int comptador = 0;
            int r=0;

            for (int idx = 0; idx < vec1[x].length(); idx++) {
                if(vec1[x].charAt(idx)==entrada2){
                    comptador++;
                }
            }
            vec2[x] = comptador;

        }
        System.out.println(Arrays.toString(vec2));

    }
}

