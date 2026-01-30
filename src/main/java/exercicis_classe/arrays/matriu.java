package exercicis_classe.arrays;

import java.util.Scanner;

public class matriu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());
        String[] vec = new String[numCasos];

        boolean[][] matriu = new boolean[3][3];
        while (numCasos-- > 0) {
            for (int i = 0; i < vec.length; i++) {
                vec[i] = sc.nextLine();
            }
            for (int i = 0; i < vec.length; i++) {
                for (int j = 0; j < vec.length; j++) {
                    if (vec[i].contains(vec[j])){
                        matriu[i][j]=true;
                    }else{
                        matriu[i][j]=false;
                    }
                }
            }
            for (int x = 0; x < matriu.length; x++) {
                System.out.println();

                for (int z = 0; z < matriu[x].length; z++) {
                    System.out.print(matriu[x][z]+" ");
                }
            }
        }
    }
}
