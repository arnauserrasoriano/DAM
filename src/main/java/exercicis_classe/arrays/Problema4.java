package exercicis_classe.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numeroCasos = Integer.parseInt(sc.nextLine());

        String[] vec = new String[numeroCasos];
        boolean[][] comp = new boolean[numeroCasos][numeroCasos];
        String entrada;
        for(int x=0;x<vec.length;x++){
            entrada = sc.nextLine();
            vec[x]=entrada;
        }
        for(int y=0;y<vec.length;y++) {
            for (int z = 0; z < vec.length; z++) {
                if (vec[y].contains(vec[z])) {
                    comp[y][z] = true;

                } else {
                    comp[y][z] = false;
                }
            }
        }

        for (int t = 0; t < vec.length; t++) {
            System.out.println(vec[t] + Arrays.toString(comp[t]));
        }
    }
}
