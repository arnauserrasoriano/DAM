package exercicis_classe.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos=Integer.parseInt(sc.nextLine());
        String vec[][] = new String[numCasos][numCasos];
        int vec2[][]=new int[3][2];
        String entrada;
        for (int i = 0; i < vec.length; i++) {
            for (int g = 0; g < vec.length; g++) {
                entrada = sc.nextLine();
                vec[i][g] = entrada;
            }

        }

        for (int j = 0; j < vec.length; j++) {
            String minima=vec[j][0];
            int posMin = 0;

            for (int x = 1; x < vec.length; x++) {
                if(vec[j][x].compareTo(minima)<0){
                    minima = vec[j][x];
                    posMin=x;
                }
                vec2[x][0] = x;
                vec2[x][1] = posMin;

            }

            for (int t = 0; t < vec.length; t++) {
                System.out.println(Arrays.toString(vec2[t]));
            }

        }
    }
}
