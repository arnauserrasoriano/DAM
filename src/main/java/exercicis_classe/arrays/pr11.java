package exercicis_classe.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class pr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());
        String[][] vec = new String[numCasos][numCasos];
        int[][] vec2 = new int[numCasos][2];

        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length; j++) {
                vec[i][j] = sc.nextLine();
            }
        }

        for (int i = 0; i < vec.length; i++) {
            int posicio=0;

            String mininm = vec[i][0];
            for (int j = 0; j < vec.length; j++) {
                if (vec[i][j].compareTo(mininm)>0){

                    posicio=j;
                }
                vec2[i][0]=i;
                vec2[i][1]=posicio;

            }
        }
        for (int i = 0; i < vec2.length; i++) {
            System.out.println(Arrays.toString(vec2[i]));
        }


    }
}
