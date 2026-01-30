package exercicis_classe.Vectors_llistes;

import java.util.Scanner;

public class matriu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] matriu = new int[n][n];
        int sum=0;


        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                if(j==n-1 || j==0 || i==n-1 || i==0){
                    matriu[i][j]=1;

                }


            }
        }
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j]+ " ");
            }
            System.out.println();

        }
    }
}
