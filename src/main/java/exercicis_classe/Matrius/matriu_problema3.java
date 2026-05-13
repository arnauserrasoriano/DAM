package exercicis_classe.Matrius;

public class matriu_problema3 {
    public static void main(String[] args) {
        int[][] num=new int[5][5];
        int suma = 1;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(i==num.length -1){
                    num[i][j] = suma;

                }
                else if(i==0){
                    num[i][j] = suma;

                }
                else if(j==0){
                    num[i][j] = suma;

                }
                else if(j == num.length-1){
                    num[i][j] = suma;

                }

                System.out.print(num[i][j] + "\t");

            }
            System.out.println();

        }
    }
}
/*
package exercicis_classe.Matrius;

import java.io.IO;

public class MatriuProblema3 {

    public static void main(String[] args) {

        final int SIZE = 5;

        int[][] num = new int[SIZE][SIZE];

        // Crear bordes
        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {

                if (i == 0 ||
                    i == num.length - 1 ||
                    j == 0 ||
                    j == num[i].length - 1) {

                    num[i][j] = 1;
                }

                IO.print(num[i][j] + "\t");
            }

            IO.println();
        }
    }
}
 */